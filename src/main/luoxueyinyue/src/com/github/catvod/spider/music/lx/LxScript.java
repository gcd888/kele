package com.github.catvod.spider.music.lx;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import android.content.Context;
import android.text.TextUtils;

/**
 * 一个 LX 音源脚本实例：拉取/缓存脚本 → 建 JS 引擎 + lx 宿主 → 等 inited
 * → playerContent 时调 on(EVENT_NAMES.request) 处理器取 musicUrl。
 * JS 全部操作收敛到单线程执行器（与壳内 JsSpider 同模式）。
 */
public final class LxScript {

    private static final String[] PREFER_QUALITY = {"flac24bit", "flac", "320k", "128k"};

    private final Context context;
    private final String ext;
    private final String label;
    private final JsRuntime.Factory factory;
    private final ExecutorService js = Executors.newSingleThreadExecutor(r -> {
        Thread t = new Thread(r, "lx-js");
        t.setDaemon(true);
        return t;
    });
    private final ScheduledExecutorService timer = Executors.newSingleThreadScheduledExecutor(r -> {
        Thread t = new Thread(r, "lx-timer");
        t.setDaemon(true);
        return t;
    });
    private final java.util.concurrent.ConcurrentMap<Long, java.util.concurrent.ScheduledFuture<?>> timers = new ConcurrentHashMap<>();

    private volatile JsRuntime rt;
    private volatile LxHost host;
    private volatile boolean ready;
    private volatile Object handler;
    private volatile JSONObject sources = new JSONObject(); // source → {name, qualitys:[...]}
    private volatile String infoName = "";

    public LxScript(Context context, String ext, String label, JsRuntime.Factory factory) {
        this.context = context;
        this.ext = ext;
        this.label = label;
        this.factory = factory;
    }

    private synchronized void ensure() {
        if (ready || rt != null) return;
        try {
            js.submit(this::start).get(90, TimeUnit.SECONDS);
        } catch (Throwable t) {
            log("init 超时或失败: " + t);
        }
    }

    private void start() {
        try {
            String code = loadScript();
            parseHeader(code);
            JsRuntime r = factory.create();
            rt = r;
            LxHost h = new LxHost(r, new LxHost.Listener() {
                @Override
                public void onInited(String dataJson) {
                    handleInited(dataJson);
                }

                @Override
                public void onRequestHandler(Object fn) {
                    handler = fn;
                }

                @Override
                public void onLog(String msg) {
                    log(msg);
                }

                @Override
                public void onTimeout(long id) {
                }
            }, buildScriptInfoJson(code), timer);
            host = h;
            h.install();
            r.eval(code, label + ".js");
            ready = true;
            log("init done name=" + infoName + " sources=" + sources);
        } catch (Throwable t) {
            log("init FAIL: " + t + srcLocation(t));
            closeQuiet();
        }
    }

    /** 反射取 PolyglotException 的 JS 源位置（探针定位用，生产无副作用） */
    private static String srcLocation(Throwable t) {
        try {
            if (t.getClass().getName().equals("org.graalvm.polyglot.PolyglotException")) {
                Object loc = t.getClass().getMethod("getSourceLocation").invoke(t);
                return " @" + (loc == null ? "?" : loc.toString());
            }
        } catch (Throwable ignore) {
        }
        return "";
    }

    private String buildScriptInfoJson(String code) {
        JSONObject csi = new JSONObject();
        try {
            csi.put("name", infoName);
            csi.put("description", matchHeader(code, "description"));
            csi.put("version", matchHeader(code, "version"));
            csi.put("author", matchHeader(code, "author"));
            csi.put("homepage", matchHeader(code, "homepage"));
            csi.put("env", "lx-music-mobile");
            csi.put("rawScript", code);
        } catch (Throwable ignore) {
        }
        return csi.toString();
    }

    private void parseHeader(String code) {
        String n = matchHeader(code, "name");
        infoName = n == null || n.isEmpty() ? label : n;
    }

    private static String matchHeader(String code, String key) {
        java.util.regex.Matcher m = java.util.regex.Pattern
                .compile("@\\s*" + key + "\\s+([^\r\n]*)").matcher(code);
        return m.find() ? m.group(1).trim() : "";
    }

    private void handleInited(String dataJson) {
        try {
            if (dataJson == null || dataJson.isEmpty()) return;
            JSONObject data = new JSONObject(dataJson);
            JSONObject all = data.optJSONObject("sources");
            if (all == null) return;
            JSONObject accepted = new JSONObject();
            java.util.Iterator<String> keys = all.keys();
            while (keys.hasNext()) {
                String s = keys.next();
                JSONObject meta = all.optJSONObject(s);
                if (meta == null) continue;
                if (!"music".equals(meta.optString("type", "music"))) continue;
                JSONArray q = meta.optJSONArray("qualitys");
                if (q == null) q = meta.optJSONArray("types");
                List<String> list = new ArrayList<>();
                if (q != null) for (int i = 0; i < q.length(); i++) list.add(q.optString(i));
                JSONObject out = new JSONObject();
                out.put("name", meta.optString("name"));
                out.put("qualitys", new JSONArray(list));
                accepted.put(s, out);
            }
            sources = accepted;
        } catch (Throwable t) {
            log("inited 解析失败: " + t);
        }
    }

    /** source: wy/tx/kg/kw/mg；songId: 平台歌曲 id/hash/songmid */
    public String musicUrl(String source, String songId) {
        if (TextUtils.isEmpty(source) || TextUtils.isEmpty(songId)) return "";
        ensure();
        if (!ready || handler == null) return "";
        try {
            return js.submit(() -> {
                for (String q : qualityList(source)) {
                    try {
                        // 官方约定：handler 收到单个对象 {action, source, info:{musicInfo, type}}
                        Object info = rt.newObject();
                        rt.setProperty(info, "musicInfo", rt.parseJson(musicInfoJson(source, songId)));
                        rt.setProperty(info, "type", q);
                        Object ev = rt.newObject();
                        rt.setProperty(ev, "action", "musicUrl");
                        rt.setProperty(ev, "source", source);
                        rt.setProperty(ev, "info", info);
                        Object r = rt.callFunction(handler, new Object[]{ev});
                        String url = extractUrl(r);
                        if (!TextUtils.isEmpty(url) && url.startsWith("http")) {
                            log("musicUrl ok src=" + source + " q=" + q + " id=" + songId);
                            return url;
                        }
                        log("musicUrl 空 src=" + source + " q=" + q + " id=" + songId + " r=" + extractDebug(r));
                    } catch (Throwable t) {
                        log("musicUrl FAIL src=" + source + " q=" + q + " id=" + songId + " : " + extractDebug(t));
                    }
                }
                return "";
            }).get(45, TimeUnit.SECONDS);
        } catch (Throwable t) {
            log("musicUrl 超时/失败 src=" + source + " id=" + songId + " : " + t);
            // 不销毁引擎：whl 引擎非线程安全，异步强关可能崩溃；交给兜底链路
            return "";
        }
    }

    private List<String> qualityList(String source) {
        List<String> available = new ArrayList<>();
        JSONObject meta = sources.optJSONObject(source);
        if (meta != null) {
            JSONArray q = meta.optJSONArray("qualitys");
            if (q != null) for (int i = 0; i < q.length(); i++) {
                String s = q.optString(i);
                if (!s.isEmpty()) available.add(s);
            }
        }
        if (available.isEmpty()) return Arrays.asList("320k", "128k");
        List<String> ordered = new ArrayList<>();
        for (String p : PREFER_QUALITY) if (available.contains(p)) ordered.add(p);
        for (String a : available) if (!ordered.contains(a)) ordered.add(a);
        return ordered;
    }

    /** 平台原生 musicInfo：LX 脚本按字段取值，尽量铺满常用别名 */
    static String musicInfoJson(String source, String songId) {
        JSONObject mi = new JSONObject();
        try {
            switch (source) {
                case "kw":
                    mi.put("songId", songId);
                    mi.put("rid", songId);
                    mi.put("hash", songId);
                    mi.put("id", songId);
                    break;
                case "kg":
                    mi.put("hash", songId);
                    mi.put("ehash", songId);
                    mi.put("albumId", "0");
                    mi.put("id", songId);
                    break;
                case "tx":
                    mi.put("songmid", songId);
                    mi.put("mediaMid", songId);
                    mi.put("strMediaMid", songId);
                    mi.put("albumMid", songId);
                    mi.put("copyrightId", songId);
                    break;
                case "wy":
                    mi.put("songId", songId);
                    mi.put("hash", songId);
                    mi.put("id", songId);
                    break;
                case "mg":
                    mi.put("copyrightId", songId);
                    mi.put("songId", songId);
                    mi.put("hash", songId);
                    mi.put("id", songId);
                    mi.put("lrcUrl", "");
                    break;
                default:
                    mi.put("songId", songId);
                    mi.put("hash", songId);
                    mi.put("id", songId);
            }
        } catch (Throwable ignore) {
        }
        return mi.toString();
    }

    private static String extractUrl(Object r) {
        if (r == null) return "";
        if (r instanceof String) return (String) r;
        if (r instanceof Number || r instanceof Boolean) return "";
        try {
            String s = String.valueOf(r);
            if (s.startsWith("http")) return s;
            JSONObject j = new JSONObject(s);
            return j.optString("url");
        } catch (Throwable t) {
            return "";
        }
    }

    private static String extractDebug(Object r) {
        if (r == null) return "null";
        if (r instanceof Throwable) {
            Throwable t = (Throwable) r;
            return t.getClass().getSimpleName() + ":" + (t.getMessage() == null ? "" : t.getMessage());
        }
        String s = String.valueOf(r);
        return s.length() > 300 ? s.substring(0, 300) + "..." : s;
    }

    private String loadScript() throws Exception {
        if (ext == null || ext.trim().isEmpty()) throw new Exception("ext 为空");
        String e = ext.trim();
        if (e.startsWith("http://") || e.startsWith("https://")) {
            File dir = new File(context.getFilesDir(), "lx_scripts");
            if (!dir.exists()) dir.mkdirs();
            File cache = new File(dir, md5(e) + ".js");
            if (cache.exists() && cache.length() > 0) return read(cache);
            String code = download(e);
            FileOutputStream out = new FileOutputStream(cache);
            out.write(code.getBytes("UTF-8"));
            out.close();
            return code;
        }
        // 本地路径（探针/调试用）
        if (e.startsWith("file://")) e = e.substring(7);
        return read(new File(e));
    }

    private static String download(String url) throws Exception {
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setConnectTimeout(15000);
        conn.setReadTimeout(15000);
        conn.setRequestProperty("User-Agent", "Mozilla/5.0");
        int code = conn.getResponseCode();
        if (code != 200) throw new Exception("下载脚本 HTTP " + code);
        InputStream in = conn.getInputStream();
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        byte[] tmp = new byte[8192];
        int n;
        while ((n = in.read(tmp)) > 0) buf.write(tmp, 0, n);
        in.close();
        conn.disconnect();
        return buf.toString("UTF-8");
    }

    private static String read(File f) throws Exception {
        FileInputStream in = new FileInputStream(f);
        ByteArrayOutputStream buf = new ByteArrayOutputStream();
        byte[] tmp = new byte[8192];
        int n;
        while ((n = in.read(tmp)) > 0) buf.write(tmp, 0, n);
        in.close();
        return buf.toString("UTF-8");
    }

    private static String md5(String s) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] d = md.digest(s.getBytes("UTF-8"));
        StringBuilder sb = new StringBuilder();
        for (byte b : d) sb.append(String.format("%02x", b));
        return sb.toString();
    }

    private void log(String msg) {
        try {
            com.github.catvod.spider.music.MusicCore.fileLog("[" + infoName + "] " + msg);
        } catch (Throwable ignore) {
        }
    }

    private void closeQuiet() {
        JsRuntime r = rt;
        rt = null;
        handler = null;
        ready = false;
        if (r != null) {
            try {
                r.close();
            } catch (Throwable ignore) {
            }
        }
    }

    public void close() {
        try {
            js.shutdownNow();
            timer.shutdownNow();
        } catch (Throwable ignore) {
        }
        closeQuiet();
    }
}
