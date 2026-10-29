package com.github.catvod.spider;

import android.util.Base64;
import android.util.Log;

import com.github.catvod.crawler.Spider;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 青果短剧 Spider（接口侧实现，壳内不含任何数据源逻辑）。
 * 算法蓝本：hongguoTV kotlin-tv core（Signer/MediaCrypto/ContentRepository/ComicRank）。
 *
 * 数据面：
 *  - 分类/榜单：红果官网 SSR（hongguoduanju.com，无需签名）；详情：H5 album-share SSR 主路
 *    （novelquickapp.com，免签）+ 官网 SSR 兜底（superguoguo 融合，2026-10-29）；
 *  - 搜索：优先番茄 App 端接口（bookapi/search/tab/v，全套字节签名 + 匿名注册设备，全量索引），
 *    失败/空结果回退官网 JSON 接口 /api/search/result（无需签名，索引残缺仅作兜底）；
 *  - 取流：fqnovel preload 接口（signSimple：老版 X-Gorgon 0x401c + X-Khronos + X-SS-Req-Ticket + X-SS-STUB）；
 *  - 解密：spade_a 密钥派生 + spade 解密（SHA512 + AES-128-CBC）+ CENC 逐样本 AES-CTR；
 *  - 播放：经壳本地代理 proxy() 回吐解密后的分段字节（206）。
 */
public class Qingguoduanju extends Spider {

    private static final String TAG = "echo-qg-drama-jar";

    /** 把 jar 内部排查日志桥接到壳的 LogWriter（落 guoju_log.txt，导出可见）；
     *  反射失败时兜底直写 App 外部 files 目录 qingguoduanju_spider.log（与 guoju_log.txt 同目录），双通道确保落盘。
     *  注意：壳包名是 com.github.gcd888.guoju（勿回退 tvbox 旧包名，旧包名反射必失败=日志静默丢失）。 */
    private static void fileLog(String msg) {
        Log.e(TAG, msg);
        try {
            Class<?> lw = Class.forName("com.github.gcd888.guoju.util.LogWriter");
            lw.getMethod("i", String.class).invoke(null, "echo-qg jar: " + msg);
            return;
        } catch (Throwable ignored) {
        }
        try {
            if (mContext == null) return;
            java.io.File dir = mContext.getExternalFilesDir(null);
            if (dir == null) return;
            java.io.File f = new java.io.File(dir, "qingguoduanju_spider.log");
            boolean rotate = f.exists() && f.length() > 512 * 1024;
            java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter(f, !rotate));
            bw.write(new java.text.SimpleDateFormat("MM-dd HH:mm:ss.SSS", java.util.Locale.US)
                    .format(new java.util.Date()));
            bw.write(' ');
            bw.write(msg);
            bw.write('\n');
            bw.close();
        } catch (Throwable ignored) {
        }
    }
    private static final String SITE = "https://hongguoduanju.com";
    // 2026-10-23 风控升级后取流链路（对齐 tsukiyo/hongguoTV 实测可用实现，桌面已验证）：
    // 旧 preload/v1 + legacyGorgon 0x401c 已被服务端软拒（200 空体，按设备放行）；
    // 新链路 multi_video_model/v1 免签名头，但必须携带「已注册」匿名设备（未注册随机设备号被软拒
    // 200 空体，tsukiyo 2026-10-27 PR#30 同因修复）。播放与搜索共享 appDevice() 注册身份并持久化。
    private static final String V1_URL =
            "https://api5-normal-sinfonlineb.fqnovel.com/novel/player/multi_video_model/v1/";
    // superguoguo 融合（2026-10-29）：详情换 H5 album-share SSR 主路（官网 SSR 兜底）。
    // 首页/分类实测维持官网主路：bookmall/tab 只回 tab 布局+找剧精选 6 卡（无分页，真人剧/漫剧
    // tab 为空壳、卡片走未知的 bookstore feed），bottom_video_feed recommend 对匿名设备软拒 42B。
    private static final String H5_ALBUM_URL =
            "https://novelquickapp.com/hongguo/ug/pages/video-album-share";
    private static final String H5_UA =
            "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) " +
            "Chrome/124.0.0.0 Mobile Safari/537.36";
    private static final String VIDEO_UA =
            "com.phoenix.read/73532 (Linux; U; Android 16; zh_CN; 25053RT47C; " +
            "Build/BP2A.250605.031.A3; Cronet/TTNetVersion:04657795 2026-01-23 " +
            "QuicVersion:c67e9834 2025-09-08)";
    /** 播放接口 UA（注册设备 + 此 UA 实测免签名放行，对齐注册 payload 版本口径 72232） */
    private static final String PLAYER_UA =
            "com.phoenix.read/72232 (Linux; U; Android 16; zh_CN; 25053RT47C; " +
            "Build/BP2A.250605.031.A3)";
    private static final int SEG_SIZE = 1048576;       // 1MB 分段
    private static final int HEADER_HINT = 8388608;    // moov 头部兜底抓取 8MB

    // ============================ 工具：hex / bytes ============================

    private static byte[] hexOf(String value) {
        int len = value.length();
        if (len % 2 != 0) throw new IllegalArgumentException("odd hex");
        byte[] out = new byte[len / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) Integer.parseInt(value.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }

    private static String hexOf(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) sb.append(String.format("%02x", b & 255));
        return sb.toString();
    }

    private static int u(byte b) {
        return b & 255;
    }

    private static byte[] concat(byte[] a, byte[] b) {
        byte[] out = new byte[a.length + b.length];
        System.arraycopy(a, 0, out, 0, a.length);
        System.arraycopy(b, 0, out, a.length, b.length);
        return out;
    }

    private static byte[] b64(String value) {
        return Base64.decode(value.replace('-', '+').replace('_', '/'), Base64.DEFAULT);
    }

    private static byte[] digest(String algo, byte[] data) {
        try {
            return MessageDigest.getInstance(algo).digest(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static String encodeValue(String v) {
        return java.net.URLEncoder.encode(v, StandardCharsets.UTF_8)
                .replace("+", "%20").replace("%7E", "~");
    }

    private static String encodeQuery(Map<String, String> values) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> entry : values.entrySet()) {
            if (sb.length() > 0) sb.append('&');
            sb.append(encodeValue(entry.getKey())).append('=').append(encodeValue(entry.getValue()));
        }
        return sb.toString();
    }

    // ============================ HTTP ============================

    private static String text(String url, String method, byte[] body, Map<String, String> headers) {
        long t0 = System.currentTimeMillis();
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setRequestMethod(method);
            conn.setRequestProperty("User-Agent", VIDEO_UA);
            conn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9");
            if (headers != null) {
                for (Map.Entry<String, String> h : headers.entrySet()) {
                    conn.setRequestProperty(h.getKey(), h.getValue());
                }
            }
            if (body != null && body.length > 0) {
                conn.setDoOutput(true);
                conn.getOutputStream().write(body);
            }
            int code = conn.getResponseCode();
            InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[65536];
            if (in != null) {
                int n;
                while ((n = in.read(buf)) > 0) {
                    out.write(buf, 0, n);
                    if (out.size() > 16777216) break;
                }
                in.close();
            }
            String result = new String(out.toByteArray(), StandardCharsets.UTF_8);
            fileLog("http " + method + " " + url.substring(0, Math.min(150, url.length()))
                    + " -> " + code + " len=" + result.length()
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return result;
        } catch (Exception e) {
            fileLog("http FAIL " + method + " " + url.substring(0, Math.min(150, url.length()))
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms"
                    + " : " + e.getClass().getSimpleName() + " " + e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    private static String text(String url) {
        return text(url, "GET", null, null);
    }

    /** 取 CDN 分段字节，total[0] 回填文件总长。 */
    private static byte[] range(String url, long start, long end, long[] total) {
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("User-Agent", VIDEO_UA);
            conn.setRequestProperty("Accept", "*/*");
            conn.setRequestProperty("Range", "bytes=" + start + "-" + end);
            int code = conn.getResponseCode();
            if (code >= 400) throw new RuntimeException("range http " + code);
            String cr = conn.getHeaderField("Content-Range");
            long tot = -1;
            if (cr != null) {
                int slash = cr.lastIndexOf('/');
                if (slash >= 0 && slash < cr.length() - 1) {
                    try {
                        tot = Long.parseLong(cr.substring(slash + 1).trim());
                    } catch (NumberFormatException ignore) {
                    }
                }
            }
            if (tot <= 0) tot = conn.getContentLengthLong();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            InputStream in = conn.getInputStream();
            byte[] buf = new byte[65536];
            int n;
            while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
            in.close();
            total[0] = tot;
            return out.toByteArray();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    // ============================ 网页 SSR 解析 ============================

    /** 从 SSR 页面里取出内嵌 _ROUTER_DATA JSON（大括号/方括号配对扫描）。 */
    private static JSONObject extractRouter(String html) {
        int index = html.indexOf("_ROUTER_DATA");
        if (index < 0) {
            // 2026-10 官网搜索页改 CSR 后搜索路径不再输出 _ROUTER_DATA；详情/分类页若也出现此错=官网又改版
            fileLog("extractRouter FAIL _ROUTER_DATA 不存在 htmlLen=" + (html == null ? -1 : html.length())
                    + " head=[" + (html == null ? "" : html.substring(0, Math.min(200, html.length())))
                    .replace('\n', ' ') + "]");
            throw new RuntimeException("router data missing");
        }
        int at = html.indexOf('{', index);
        if (at < 0) throw new RuntimeException("router data missing");
        boolean inString = false;
        boolean escaped = false;
        int depth = 0;
        for (int i = at; i < html.length(); i++) {
            char c = html.charAt(i);
            if (inString) {
                if (escaped) escaped = false;
                else if (c == '\\') escaped = true;
                else if (c == '"') inString = false;
            } else if (c == '"') {
                inString = true;
            } else if (c == '{' || c == '[') {
                depth++;
            } else if (c == '}' || c == ']') {
                depth--;
                if (depth == 0) {
                    try {
                        return new JSONObject(html.substring(at, i + 1));
                    } catch (Exception e) {
                        throw new RuntimeException("router data json: " + e.getMessage());
                    }
                }
            }
        }
        throw new RuntimeException("router data unbalanced");
    }

    private static JSONObject router(String url) {
        try {
            return extractRouter(text(url)).getJSONObject("loaderData");
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ============================ superguoguo 免签面（bookmall/tab 首页 + H5 详情） ============================

    /** H5/JSON 内嵌实体转义还原（&quot; 等在配对扫描前必须还原，否则字符串边界判断失效）。 */
    private static String unescapeHtml(String s) {
        if (s == null) return "";
        return s.replace("&quot;", "\"").replace("&#34;", "\"").replace("&#x22;", "\"")
                .replace("&#39;", "'").replace("&lt;", "<").replace("&gt;", ">")
                .replace("&amp;", "&");
    }

    /** 从 s 的 at 位置（'{' 或 '['）做括号配对扫描，返回平衡的 JSON 文本；失败抛 RuntimeException。 */
    private static String scanBalanced(String s, int at) {
        char open = s.charAt(at);
        char close = open == '{' ? '}' : ']';
        boolean inString = false;
        boolean escaped = false;
        int depth = 0;
        for (int i = at; i < s.length(); i++) {
            char c = s.charAt(i);
            if (inString) {
                if (escaped) escaped = false;
                else if (c == '\\') escaped = true;
                else if (c == '"') inString = false;
            } else if (c == '"') {
                inString = true;
            } else if (c == open) {
                depth++;
            } else if (c == close) {
                depth--;
                if (depth == 0) return s.substring(at, i + 1);
            }
        }
        throw new RuntimeException("unbalanced json at " + at);
    }

    /**
     * H5 album-share SSR 详情（superguoguo 主路）：一次拿 series_data 元数据 + chapter_ids 全集 vid。
     * 返回 {"sd": series_data 对象, "vids": chapter_ids 数组}。
     */
    private static JSONObject h5Album(String seriesId) throws Exception {
        String html = text(H5_ALBUM_URL + "?video_id=" + seriesId, "GET", null,
                java.util.Collections.singletonMap("User-Agent", H5_UA));
        if (html == null || html.isEmpty()) throw new RuntimeException("H5 空响应");
        String s = unescapeHtml(html);
        int at = s.indexOf("\"series_data\"");
        if (at < 0) throw new RuntimeException("series_data missing htmlLen=" + s.length());
        JSONObject sd = new JSONObject(scanBalanced(s, s.indexOf('{', at)));
        int at2 = s.indexOf("\"chapter_ids\"");
        if (at2 < 0) throw new RuntimeException("chapter_ids missing");
        JSONArray vids = new JSONArray(scanBalanced(s, s.indexOf('[', at2)));
        if (vids.length() == 0) throw new RuntimeException("chapter_ids 空");
        fileLog("h5Album done id=" + seriesId + " title=" + sd.optString("title", "")
                + " vids=" + vids.length());
        return new JSONObject().put("sd", sd).put("vids", vids);
    }

    private static final class Series {
        final String id, name, cover, intro, badge, tags;

        Series(String id, String name, String cover, String intro, String badge, String tags) {
            this.id = id;
            this.name = name;
            this.cover = cover;
            this.intro = intro;
            this.badge = badge;
            this.tags = tags;
        }
    }

    private static final class Page {
        final List<Series> items;
        final int lastPage;
        final boolean hasMore;
        /** App 搜索分页游标（search_id/passback），Web 搜索路径不使用。 */
        LinkedHashMap<String, String> cursor;

        Page(List<Series> items, int page, int lastPage) {
            this.items = items;
            this.lastPage = lastPage;
            this.hasMore = !items.isEmpty() && page < Math.min(lastPage, 100);
        }
    }

    /** series_id 必须是纯数字（蓝本 valid()），防止把广告位解析成条目。 */
    private static boolean valid(String id, String title) {
        return id.matches("[0-9]{1,30}") && !title.trim().isEmpty();
    }

    private static String tagsText(JSONArray tags) {
        if (tags == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < Math.min(tags.length(), 5); t++) {
            String s = tags.optString(t, "").trim();
            if (!s.isEmpty()) {
                if (sb.length() > 0) sb.append(" · ");
                sb.append(s);
            }
        }
        return sb.toString();
    }

    private static List<Series> cards(JSONArray rows) {
        List<Series> out = new ArrayList<>();
        if (rows == null) {
            fileLog("cards 输入 rows=null（接口/页面无列表数据）");
            return out;
        }
        for (int i = 0; i < rows.length(); i++) {
            JSONObject item = rows.optJSONObject(i);
            if (item == null) continue;
            JSONObject o = item.optJSONObject("video_data");
            if (o == null) o = item;
            int count = o.optInt("episode_cnt",
                    o.optJSONObject("series_episode_info") == null ? 0
                            : o.optJSONObject("series_episode_info").optInt("episode_cnt", 0));
            String id = o.optString("series_id", "");
            String name = o.optString("series_name", "");
            if (name.isEmpty()) name = o.optString("series_title", "");
            if (!valid(id, name)) continue;
            String badge = o.optString("episode_right_text", "");
            if (badge.isEmpty() && count > 0) badge = "全 " + count + " 集";
            out.add(new Series(id, name.trim(), o.optString("series_cover", ""),
                    o.optString("series_intro", ""), badge,
                    tagsText(o.optJSONArray("tags") != null ? o.optJSONArray("tags") : o.optJSONArray("category_list"))));
        }
        // 按 id 去重（蓝本 distinctBy id）
        List<Series> distinct = new ArrayList<>();
        for (Series s : out) {
            boolean dup = false;
            for (Series d : distinct) if (d.id.equals(s.id)) { dup = true; break; }
            if (!dup) distinct.add(s);
        }
        if (out.size() != distinct.size() || distinct.isEmpty()) {
            fileLog("cards rows=" + rows.length() + " valid=" + out.size() + " distinct=" + distinct.size()
                    + (distinct.isEmpty() ? "（全部条目无效：series_id/名称缺失或字段结构变化）" : "（含去重丢弃）"));
        }
        return distinct;
    }

    /** 官网分类页（热播）。 */
    private Page home(int page) {
        String url = SITE + "/category?tab=1&sort_type=1" + (page > 1 ? "&page=" + page : "");
        return parseCategoryPage(router(url), page);
    }

    /** 影视类型分类页（真人剧/漫剧/AI剧）：/category/{type}[/{slug}]?page=N，slug=路径式筛选（官网实测路由）。 */
    private Page typeCategoryPage(String type, String slug, int page) {
        StringBuilder url = new StringBuilder(SITE).append("/category/").append(type);
        if (!slug.isEmpty()) url.append('/').append(slug);
        if (page > 1) url.append("?page=").append(page);
        return parseCategoryPage(router(url.toString()), page);
    }

    /** 分类页 loaderData 公共解析：key 兼容 category_page / category_$，列表取 recommendList（卡片兼容裸字段/video_data 包裹）。 */
    private Page parseCategoryPage(JSONObject section, int page) {
        JSONObject s = section.optJSONObject("category_page");
        if (s == null) s = section.optJSONObject("category_$");
        if (s == null) throw new RuntimeException("category page missing (loaderData keys: " + keysOf(section) + ")");
        JSONArray rows = s.optJSONArray("recommendList");
        if (rows == null) {
            JSONObject cd = s.optJSONObject("categoryData");
            rows = cd == null ? null : cd.optJSONArray("recommendList");
        }
        List<Series> items = cards(rows);
        int last = 100;
        JSONObject pag = s.optJSONObject("pagination");
        if (pag != null) last = Math.max(1, Math.min(100, pag.optInt("totalPages", 100)));
        return new Page(items, page, last);
    }

    private static String keysOf(JSONObject o) {
        if (o == null) return "(null)";
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = o.keys();
        while (it.hasNext()) {
            if (sb.length() > 0) sb.append(',');
            sb.append(it.next());
        }
        return sb.toString();
    }

    /** 官网搜索（2026-10 官网改版：搜索页改为纯 CSR，SSR _ROUTER_DATA 不再输出，旧 SSR 解析必失效）。
     *  改走官网前端同款 JSON 接口：GET /api/search/result?aid=8662&query=<kw>&pageNum=<page>
     *  实测无需 msToken/a_bogus 签名（普通 UA 即可）；返回 searchList[].video_data 与分类页卡片同构，复用 cards()。
     *  接口有频控（连续请求返回 {"code":"upstream_unavailable"}），无数据时退避重试一次。 */
    private Page searchPage(String keyword, int page) {
        String url = SITE + "/api/search/result?aid=8662&query=" + enc(keyword)
                + (page > 1 ? "&pageNum=" + page : "");
        JSONObject json = null;
        for (int attempt = 0; attempt < 2; attempt++) {
            if (attempt > 0) {
                try {
                    Thread.sleep(600);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
            try {
                JSONObject cand = new JSONObject(text(url));
                if (cand.has("searchList")) {
                    json = cand;
                    break;
                }
                fileLog("searchPage attempt#" + attempt + " 无 searchList 字段 code=" + cand.optString("code", "?")
                        + " message=" + cand.optString("message", "")
                        + " bodyHead=[" + cand.toString().substring(0, Math.min(200, cand.toString().length())) + "]");
            } catch (Exception e) {
                fileLog("searchPage attempt#" + attempt + " FAIL : " + e.getClass().getSimpleName() + ": " + e.getMessage()
                        + " url=" + url);
            }
        }
        if (json == null) {
            fileLog("searchPage FAIL 2 次尝试均失败 url=" + url + "（官网接口不可用/频控，返回空结果）");
            throw new RuntimeException("search api unavailable (2 attempts)");
        }
        List<Series> items = cards(json.optJSONArray("searchList"));
        int last = Math.max(1, Math.min(100, json.optInt("totalPages", 1)));
        fileLog("searchPage ok kw=[" + keyword + "] page=" + page + " items=" + items.size()
                + " totalPages=" + last + " totalCount=" + json.optInt("totalCount", -1) + " hasMore=" + json.optBoolean("hasMore"));
        return new Page(items, page, last);
    }

    /** 漫剧榜：数据在 <script data-fn-name="r|mergeLoaderData" data-fn-args="..."> 属性里（蓝本 ComicRank.parse）。
     *  注意：r 标签里 name 与 args 之间可能隔着 data-script-src 等属性，必须按整标签分别提取两个属性。 */
    private Page rankPage(int page) {
        String html = text(SITE + "/rank/hot-comic-drama?page=" + page);
        Pattern tagP = Pattern.compile("<script[^>]*>", Pattern.DOTALL);
        Pattern nameP = Pattern.compile("data-fn-name=([\"'])([^\"']*)\\1");
        Pattern argsP = Pattern.compile("data-fn-args=([\"'])(.*?)\\1(?=[\\s>])", Pattern.DOTALL);
        Matcher tm = tagP.matcher(html);
        while (tm.find()) {
            String tag = tm.group(0);
            if (!tag.contains("data-fn-name") || !tag.contains("data-fn-args")) continue;
            Matcher nm = nameP.matcher(tag);
            Matcher am = argsP.matcher(tag);
            if (!nm.find() || !am.find()) continue;
            String name = nm.group(2);
            if (!"r".equals(name) && !"mergeLoaderData".equals(name)) continue;
            String argsRaw = htmlDecode(am.group(2)).trim();
            JSONArray args;
            try {
                Object parsed = new JSONTokener(argsRaw).nextValue();
                if (!(parsed instanceof JSONArray)) continue;
                args = (JSONArray) parsed;
            } catch (Exception ignore) {
                continue;
            }
            if (!"rank_hot-comic-drama/page".equals(args.optString(0))) continue;
            Object raw = null;
            if ("r".equals(name) && "content".equals(args.optString(1))) {
                raw = args.opt(2);
            } else if ("mergeLoaderData".equals(name)) {
                JSONArray arr = args.optJSONArray(1);
                if (arr != null) {
                    for (int i = 0; i < arr.length(); i++) {
                        JSONObject e = arr.optJSONObject(i);
                        if (e != null && "content".equals(e.optString("key"))) {
                            // routerDataFnName "p" 时 payload 内联在 routerDataFnArgs[0]；"s" 时是引用，落空后走 _ROUTER_DATA 兜底
                            if ("p".equals(e.optString("routerDataFnName")) && e.optJSONArray("routerDataFnArgs") != null) {
                                raw = e.optJSONArray("routerDataFnArgs").opt(0);
                            }
                            break;
                        }
                    }
                }
            }
            JSONObject payload;
            if (raw instanceof JSONObject) payload = (JSONObject) raw;
            else if (raw instanceof String) {
                try {
                    payload = new JSONObject((String) raw);
                } catch (Exception ignore) {
                    continue;
                }
            } else continue;
            if (!payload.optBoolean("isSuccess")) throw new RuntimeException("漫剧榜单暂不可用");
            JSONArray rl = payload.optJSONArray("rankList");
            if (rl == null) throw new RuntimeException("漫剧榜单格式已变化");
            JSONObject pag = payload.optJSONObject("pagination");
            int totalPages = pag == null ? 100 : pag.optInt("totalPages", 100);
            if (totalPages < 1) totalPages = 100;

            List<Series> items = new ArrayList<>();
            for (int i = 0; i < rl.length(); i++) {
                JSONObject row = rl.optJSONObject(i);
                if (row == null) continue;
                int count = row.optInt("episodeCount",
                        row.optJSONArray("episodeVids") == null ? 0 : row.optJSONArray("episodeVids").length());
                String id = row.optString("seriesId", "");
                if (id.isEmpty()) id = row.optString("id", "");
                String title = row.optString("title", "");
                if (!valid(id, title)) continue;
                String badge = count > 0 ? "全 " + count + " 集" : row.optString("heatText", "");
                Series s = new Series(id, title.trim(), row.optString("cover", ""),
                        row.optString("description", ""), badge, tagsText(row.optJSONArray("tags")));
                boolean dup = false;
                for (Series d : items) if (d.id.equals(s.id)) { dup = true; break; }
                if (!dup) items.add(s);
            }
            return new Page(items, page, Math.min(totalPages, 100));
        }
        throw new RuntimeException("页面没有漫剧榜单数据");
    }

    private static String htmlDecode(String s) {
        return s.replace("&quot;", "\"").replace("&#39;", "'")
                .replace("&lt;", "<").replace("&gt;", ">")
                .replace("&amp;", "&");
    }

    private static String enc(String v) {
        return encodeValue(v);
    }

    /** 详情页 → 分集 vid 列表（单次抓取；detail_page key 缺失时扫描 loaderData 兜底）。 */
    private static JSONObject seriesDetailOf(JSONObject data) {
        JSONObject dp = data.optJSONObject("detail_page");
        if (dp != null && dp.optJSONObject("seriesDetail") != null) return dp.optJSONObject("seriesDetail");
        Iterator<String> it = data.keys();
        while (it.hasNext()) {
            JSONObject cand = data.optJSONObject(it.next());
            if (cand == null) continue;
            JSONObject sd = cand.optJSONObject("seriesDetail");
            if (sd != null) return sd;
        }
        return null;
    }

    private static List<String> vidsOf(JSONObject seriesDetail) {
        List<String> out = new ArrayList<>();
        JSONArray vids = seriesDetail.optJSONArray("vid_list");
        if (vids != null) {
            for (int i = 0; i < vids.length(); i++) {
                String v = vids.optString(i, "");
                if (!v.isEmpty()) out.add(v);
            }
        }
        return out;
    }

    // ============================ 取流（preload + spade 解密，蓝本 ContentRepository.stream 同构） ============================

    private static final class StreamInfo {
        final String url, quality;
        final byte[] key; // null = 明文

        StreamInfo(String url, byte[] key, String quality) {
            this.url = url;
            this.key = key;
            this.quality = quality;
        }
    }

    private static String cleanUrl(String v) {
        return v.replace("\\/", "/")
                .replaceAll("(?i)\\\\u002f", "/")
                .replace("\\u0026", "&")
                .replace("&amp;", "&");
    }

    /** 蓝本 qualityNumber：档位描述 → 数值。 */
    private static int qualityNumber(String v) {
        if (v == null) return 0;
        Matcher m = Pattern.compile("2160|1440|1080|720|576|540|480|360").matcher(v);
        if (m.find()) return Integer.parseInt(m.group());
        Matcher h = Pattern.compile("(1920|1280|1024|854|640)").matcher(v);
        if (h.find()) {
            String k = h.group();
            if ("1920".equals(k)) return 1080;
            if ("1280".equals(k)) return 720;
            if ("1024".equals(k)) return 576;
            if ("854".equals(k)) return 480;
            return 360;
        }
        try {
            return Integer.parseInt(v.trim());
        } catch (Exception e) {
            return 0;
        }
    }

    private static String qualityText(JSONObject q) {
        String v = q.optString("quality_desc", "");
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("height", 0));
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("vheight", 0));
        if (v.isEmpty() || "0".equals(v)) v = String.valueOf(q.optInt("quality", 0));
        if (v.isEmpty() || "0".equals(v)) v = q.optString("key", "");
        return v;
    }

    // 进程内复用设备标识（蓝本 streamDeviceId/streamInstallId 各生成一次后复用）
    private static final Random RNG = new Random();

    /** 播放 cdid：进程内随机 UUID，与注册设备解耦（实测 cdid 不参与设备放行判定）。 */
    private static String playerCdid = UUID.randomUUID().toString();

    /**
     * 持续空响应（设备软拒特征）时强制重新注册匿名设备（tsukiyo PR#30 思路：
     * 未注册设备是空响应根因，随机轮换治标不治本；重注册走 device_register 并持久化覆盖旧文件）。
     */
    private static synchronized void rotatePlayerDevice() {
        try {
            appDevice(true);
        } catch (Throwable t) {
            fileLog("rotatePlayerDevice 重注册失败: " + t);
        }
        playerCdid = UUID.randomUUID().toString();
        String[] dev = appDevice(false);
        fileLog("rotatePlayerDevice 已重注册播放设备 " + dev[0]);
    }

    private StreamInfo stream(String vid) {
        // 兼容旧配置里 proxy://do=play&...&vid=xxx 形式的分集 id：服务端只认纯数字 vid
        if (vid != null && vid.contains("vid=")) {
            vid = vid.substring(vid.indexOf("vid=") + 4);
            int amp = vid.indexOf('&');
            if (amp >= 0) vid = vid.substring(0, amp);
        }
        if (vid == null || !vid.matches("[0-9]{1,30}")) {
            fileLog("stream reject vid 格式异常: " + vid);
            throw new RuntimeException("vid 格式异常: " + vid);
        }
        // 按 vid 去重：预热线程与用户点击并发取同一集时只发一次请求，等待方直接命中缓存
        Object lock;
        synchronized (streamLocks) {
            lock = streamLocks.get(vid);
            if (lock == null) {
                lock = new Object();
                streamLocks.put(vid, lock);
            }
        }
        synchronized (lock) {
            synchronized (streamCache) {
                Long at = streamCacheAt.get(vid);
                StreamInfo hit = streamCache.get(vid);
                if (hit != null && at != null && System.currentTimeMillis() - at < STREAM_TTL) return hit;
            }
            fileLog("stream begin vid=" + vid + " (缓存未命中，开始取流)");

        // 蓝本 preload payload（精简 biz_param + mixed_video_id_map）
        JSONObject biz = new JSONObject();
        JSONObject payload = new JSONObject();
        try {
            biz.put("detail_page_version", 0);
            biz.put("device_level", 3);
            biz.put("disable_digg_stat", false);
            biz.put("need_all_video_definition", true);
            biz.put("need_mp4_align", false);
            biz.put("use_os_player", false);
            biz.put("use_server_dns", false);
            biz.put("video_platform", 1024);
            payload.put("biz_param", biz);
            payload.put("mixed_video_id_map", new JSONObject().put("1004", new JSONArray().put(vid)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        byte[] body = payload.toString().getBytes(StandardCharsets.UTF_8);

        // v1 端点参数集（对齐蓝本 VendorConstants.device + 覆盖项，桌面实测 200/code=0）：
        // 版本口径 7.2.2.32(72232)、设备号取 appDevice() 注册身份（与搜索共享、持久化）、cdid 随机 UUID、免签名头。
        // 服务端按需生成播放数据：首请求常返回 200 空体（桌面实证重试即成功），故首次空响应保持同一身份
        // 重试、再次空响应重注册一次自愈；总重试窗口约 4s + 5 次请求 < 壳 15s 播放超时。
        JSONObject resp = null;
        String lastErr = null;
        for (int attempt = 1; attempt <= 5 && resp == null; attempt++) {
            if (attempt > 1) {
                long backoff = attempt == 2 ? 600 : attempt == 3 ? 900 : attempt == 4 ? 900 : 1200;
                try {
                    Thread.sleep(backoff);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
            String[] dev = appDevice(false);
            LinkedHashMap<String, String> values = new LinkedHashMap<>();
            values.put("iid", dev[1]);
            values.put("device_id", dev[0]);
            values.put("ac", "wifi");
            values.put("channel", "update_64");
            values.put("aid", "8662");
            values.put("app_name", "novelread");
            values.put("version_code", "72232");
            values.put("version_name", "7.2.2.32");
            values.put("device_platform", "android");
            values.put("os", "android");
            values.put("ssmix", "a");
            values.put("device_type", "25053RT47C");
            values.put("device_brand", "Redmi");
            values.put("language", "zh");
            values.put("os_api", "36");
            values.put("os_version", "16");
            values.put("manifest_version_code", "72232");
            values.put("resolution", "1280*2772");
            values.put("dpi", "520");
            values.put("update_version_code", "72232");
            values.put("host_abi", "arm64-v8a");
            values.put("dragon_device_type", "phone");
            values.put("pv_player", "72232");
            values.put("compliance_status", "0");
            values.put("need_personal_recommend", "1");
            values.put("player_so_load", "1");
            values.put("is_android_pad_screen", "0");
            values.put("cdid", playerCdid);
            values.put("_rticket", String.valueOf(System.currentTimeMillis()));
            String query = encodeQuery(values);
            LinkedHashMap<String, String> headers = new LinkedHashMap<>();
            headers.put("User-Agent", PLAYER_UA);
            headers.put("Accept", "application/json; charset=utf-8,application/x-protobuf");
            String respText = text(V1_URL + "?" + query, "POST", body, headers).trim();
            fileLog("v1 http attempt#" + attempt + " respLen=" + respText.length()
                    + " head=" + respText.substring(0, Math.min(120, respText.length())).replaceAll("\\s+", " "));
            if (respText.isEmpty()) {
                lastErr = "播放接口返回空响应";
                // 对齐 tsukiyo PR#30：首次空响应保持同一身份重试；再次空响应才重注册一次（设备软拒特征）
                if (attempt == 2) rotatePlayerDevice();
                continue;
            }
            try {
                resp = new JSONObject(respText);
            } catch (Exception e) {
                throw new RuntimeException("播放接口非 JSON 响应: " + respText.substring(0, Math.min(120, respText.length())));
            }
        }
        if (resp == null) {
            throw new RuntimeException(lastErr == null ? "播放接口无响应" : lastErr + "（已重试）");
        }
        String code = resp.optString("Code", resp.optString("code", ""));
        if (!"0".equals(code)) throw new RuntimeException("播放接口 code=" + code);
        JSONObject data = resp.optJSONObject("data");
        if (data == null) throw new RuntimeException("播放信息 data missing");
        JSONObject entry = data.optJSONObject(vid);
        if (entry == null) throw new RuntimeException("播放信息 entry missing: " + vid);

        JSONObject videoModel;
        Object vm = entry.opt("video_model");
        if (vm instanceof JSONObject) {
            videoModel = (JSONObject) vm;
        } else if (vm instanceof String) {
            try {
                videoModel = new JSONObject((String) vm);
            } catch (Exception e) {
                throw new RuntimeException("video_model 非 JSON");
            }
        } else {
            throw new RuntimeException("video_model missing");
        }

        // fallback_api 在 video_model 内部（蓝本 ContentRepository：model.opt("fallback_api")），
        // 真实分片数据在 fallback 返回的 video_info.data.video_list 里
        String fallbackUrl = null;
        Object fb = videoModel.opt("fallback_api");
        if (fb instanceof JSONObject) fallbackUrl = ((JSONObject) fb).optString("fallback_api", "");
        else if (fb instanceof JSONArray) fallbackUrl = ((JSONArray) fb).optString(0, "");
        else if (fb instanceof String) {
            String raw = ((String) fb).trim();
            if (raw.startsWith("{")) {
                try {
                    fallbackUrl = new JSONObject(raw).optString("fallback_api", "");
                } catch (Exception ignore) {
                }
            }
            if (fallbackUrl == null || fallbackUrl.isEmpty()) fallbackUrl = raw;
        }
        if (fallbackUrl == null || !fallbackUrl.startsWith("https://")) {
            throw new RuntimeException("fallback_api 缺失或非 https: " + (fallbackUrl == null ? "(null)" : fallbackUrl.substring(0, Math.min(80, fallbackUrl.length()))));
        }
        JSONObject fbResp;
        try {
            fbResp = new JSONObject(text(fallbackUrl));
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        JSONObject info = fbResp.optJSONObject("video_info") == null ? null
                : fbResp.optJSONObject("video_info").optJSONObject("data");
        if (info == null) throw new RuntimeException("fallback video_info.data missing");
        JSONObject videoList = info.optJSONObject("video_list");
        if (videoList == null || videoList.length() == 0) throw new RuntimeException("fallback video_list missing");
        fileLog("fallback done qualities=" + videoList.length()
                + " key_seed=" + (info.optString("key_seed", "").isEmpty() ? "无" : "有"));

        // 选清晰度：排除 bytevc2/bvc2，按数值降序取第一个 <=1080，否则取最低档
        List<JSONObject> candidates = new ArrayList<>();
        for (Iterator<String> it = videoList.keys(); it.hasNext(); ) {
            JSONObject q = videoList.optJSONObject(it.next());
            if (q == null) continue;
            String codec = q.optString("codec_type", "");
            if (codec.contains("bytevc2") || codec.contains("bvc2")) continue;
            if (q.optString("main_url", "").isEmpty()) continue;
            candidates.add(q);
        }
        if (candidates.isEmpty()) {
            for (Iterator<String> it = videoList.keys(); it.hasNext(); ) {
                JSONObject q = videoList.optJSONObject(it.next());
                if (q != null && !q.optString("main_url", "").isEmpty()) candidates.add(q);
            }
        }
        if (candidates.isEmpty()) throw new RuntimeException("无可播放清晰度");
        Collections.sort(candidates, new Comparator<JSONObject>() {
            @Override
            public int compare(JSONObject a, JSONObject b) {
                return qualityNumber(qualityText(b)) - qualityNumber(qualityText(a));
            }
        });
        JSONObject picked = candidates.get(candidates.size() - 1);
        for (JSONObject q : candidates) {
            if (qualityNumber(qualityText(q)) <= 1080 && qualityNumber(qualityText(q)) > 0) {
                picked = q;
                break;
            }
        }
        int qn = qualityNumber(qualityText(picked));
        String quality = qn > 1080 ? qn + "P（兼容资源）" : (qn > 0 ? qn + "P" : "自动");

        String encUrl = cleanUrl(picked.optString("main_url"));
        // key_seed 在 data(info) 层级
        String seed = info.optString("key_seed", "");
        String url;
        if (!seed.isEmpty()) {
            url = decryptUrl(encUrl, b64(seed));
        } else {
            url = encUrl;
        }
        if (!url.startsWith("http")) throw new RuntimeException("解密后地址异常: " + url.substring(0, Math.min(60, url.length())));
        // spade_a 在清晰度条目层级
        String spade = picked.optString("spade_a", "");
        byte[] streamKey = spade.isEmpty() ? null : deriveKey(spade);
        Log.e(TAG, "stream ok vid=" + vid + " quality=" + quality
                + " encrypted=" + (streamKey != null) + " url=" + url.substring(0, Math.min(80, url.length())));
        fileLog("stream ok vid=" + vid + " quality=" + quality + " encrypted=" + (streamKey != null));

        StreamInfo result = new StreamInfo(url, streamKey, quality);
        synchronized (streamCache) {
            streamCache.put(vid, result);
            streamCacheAt.put(vid, System.currentTimeMillis());
        }
        return result;
        }
    }

    /** 按 vid 的取流去重锁。 */
    private final Map<String, Object> streamLocks = new HashMap<String, Object>();

    /** spade 解密：SHA512(seed)+常量 → AES-128-CBC（蓝本 MediaCrypto.decryptUrl）。 */
    private static final String SPADE_CONST =
            "4dd4c2e6b83162090e52b3c7a6733ba41cb2462b829ab58a196b39db57177524f49baf7f08e8d68d26a72e37c1a95a2f1f05a51892aef2949732b62a38aadd58";

    private static String decryptUrl(String value, byte[] seed) {
        byte[] raw = b64(value);
        if (raw.length < 20 || u(raw[0]) != 0xa8 || u(raw[2]) != 1 || u(raw[3]) != 0) {
            throw new RuntimeException("unsupported url envelope");
        }
        byte[] h = digest("SHA-512", concat(digest("SHA-512", seed), hexOf(SPADE_CONST)));
        byte[] plain = aes(false, Arrays.copyOfRange(h, 0, 16), Arrays.copyOfRange(h, 16, 32),
                Arrays.copyOfRange(raw, 4, 4 + (raw.length - 4) / 16 * 16), "CBC");
        int end = plain.length;
        int padding = u(plain[plain.length - 1]);
        if (padding >= 1 && padding <= 16 && padding <= end) end -= padding;
        while (end > 0 && u(plain[end - 1]) == 0) end--;
        return new String(plain, 0, end, StandardCharsets.UTF_8);
    }

    /** spade_a 密钥派生（蓝本 MediaCrypto.deriveKey）。 */
    private static byte[] deriveKey(String value) {
        byte[] raw = b64(value);
        if (raw.length < 3) throw new RuntimeException("key too short");
        int length = Math.min(raw.length - (u(raw[0]) ^ u(raw[1]) ^ u(raw[2])) + 47, raw.length - 1);
        if (length < 33) throw new RuntimeException("key length " + length);
        byte[] work = Arrays.copyOfRange(raw, 1, 1 + length);
        int a = 85, b = 246;
        for (int i = 0; i < work.length; i++) {
            int old = u(work[i]);
            int previous = (i & 1) != 0 ? a : b;
            if ((i & 1) != 0) a = old;
            else b = old;
            work[i] = (byte) (-21 - Integer.bitCount(i) + (previous ^ old));
        }
        byte[] key = hexOf(new String(Arrays.copyOfRange(work, 1, 33), StandardCharsets.ISO_8859_1));
        if (key.length != 16) throw new RuntimeException("derived key size " + key.length);
        return key;
    }

    private static byte[] aes(boolean encrypt, byte[] key, byte[] iv, byte[] data, String mode) {
        try {
            Cipher cipher = Cipher.getInstance("AES/" + mode + "/NoPadding");
            cipher.init(encrypt ? Cipher.ENCRYPT_MODE : Cipher.DECRYPT_MODE,
                    new SecretKeySpec(key, "AES"), new IvParameterSpec(iv));
            return cipher.doFinal(data);
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    // ============================ MP4/CENC（蓝本 MediaCrypto.prepare/decrypt 同构） ============================

    private static final class Box {
        final int start, end, body;
        final String type;

        Box(int start, int end, int body, String type) {
            this.start = start;
            this.end = end;
            this.body = body;
            this.type = type;
        }
    }

    private static Box box(byte[] d, int at, int limit) {
        if (at < 0 || at + 8 > limit) return null;
        long size = u32(d, at);
        int header = 8;
        if (size == 1) {
            if (at + 16 > limit) return null;
            size = i64(d, at + 8);
            header = 16;
        }
        if (size == 0) size = limit - at;
        if (size < header || size > limit - at) return null;
        return new Box(at, at + (int) size, at + header, ascii4(d, at + 4));
    }

    private static Box find(byte[] d, String type, int start, int limit) {
        for (int at = start; at <= limit - 8; at++) {
            if (d[at + 4] == type.charAt(0)) {
                Box b = box(d, at, limit);
                if (b != null && type.equals(b.type)) return b;
            }
        }
        return null;
    }

    private static String ascii4(byte[] d, int at) {
        return new String(d, at, 4, StandardCharsets.US_ASCII);
    }

    private static long u32(byte[] d, int at) {
        return ((long) i32(d, at)) & 0xFFFFFFFFL;
    }

    private static int i32(byte[] d, int at) {
        return ((d[at] & 255) << 24) | ((d[at + 1] & 255) << 16) | ((d[at + 2] & 255) << 8) | (d[at + 3] & 255);
    }

    private static long i64(byte[] d, int at) {
        long v = 0;
        for (int i = 0; i < 8; i++) v = (v << 8) | (d[at + i] & 255);
        return v;
    }

    private static int count(byte[] d, int at, int limit) {
        if (at + 4 > limit) throw new RuntimeException("索引越界");
        long n = u32(d, at);
        if (n > 200000) throw new RuntimeException("索引数量过大");
        return (int) n;
    }

    private static final class Sample {
        final long start, end, encryptedOffset;
        final byte[] iv;

        Sample(long start, long end, long encryptedOffset, byte[] iv) {
            this.start = start;
            this.end = end;
            this.encryptedOffset = encryptedOffset;
            this.iv = iv;
        }
    }

    private static final class Prepared {
        final byte[] header;
        final List<Sample> samples;

        Prepared(byte[] header, List<Sample> samples) {
            this.header = header;
            this.samples = samples;
        }
    }

    private static Prepared prepare(byte[] data, byte[] key) {
        if (key == null) return new Prepared(new byte[0], new ArrayList<Sample>());
        // ftyp 之后紧跟 moov（蓝本 box(data, data.u32(0))）
        Box moov = box(data, (int) u32(data, 0), data.length);
        if (moov == null || !"moov".equals(moov.type)) throw new RuntimeException("视频索引不完整");

        List<Sample> samples = new ArrayList<>();
        byte[] header = data.clone();
        int moovEnd = moov.end;
        int cursor = moov.body;
        while (cursor < moov.end) {
            Box track = box(data, cursor, moov.end);
            if (track == null) throw new RuntimeException("视频轨道格式异常");
            cursor = track.end;
            if (!"trak".equals(track.type)) continue;
            Box stbl = find(data, "stbl", track.body, track.end);
            if (stbl == null) continue;
            Box saiz = find(data, "saiz", stbl.body, stbl.end);
            Box saio = find(data, "saio", stbl.body, stbl.end);
            Box stsz = find(data, "stsz", stbl.body, stbl.end);
            Box stsc = find(data, "stsc", stbl.body, stbl.end);
            Box chunks = find(data, "stco", stbl.body, stbl.end);
            if (chunks == null) chunks = find(data, "co64", stbl.body, stbl.end);
            if (saiz == null) continue;
            if (saio == null) throw new RuntimeException("视频加密索引缺失");
            if (stsz == null) throw new RuntimeException("样本索引缺失");
            if (stsc == null) throw new RuntimeException("块索引缺失");
            if (chunks == null) throw new RuntimeException("块偏移缺失");

            int n = count(data, stsz.body + 8, stsz.end);
            int defaultSize = (int) u32(data, stsz.body + 4);
            if (defaultSize == 0 && stsz.body + 12 + (long) n * 4 > stsz.end) throw new RuntimeException("样本索引截断");
            long[] sizes = new long[n];
            for (int i = 0; i < n; i++) sizes[i] = defaultSize > 0 ? defaultSize : u32(data, stsz.body + 12 + i * 4);

            int chunkCount = count(data, chunks.body + 4, chunks.end);
            int width = "co64".equals(chunks.type) ? 8 : 4;
            if (chunks.body + 8 + (long) chunkCount * width > chunks.end) throw new RuntimeException("块偏移截断");
            long[] offsets = new long[chunkCount];
            for (int i = 0; i < chunkCount; i++) {
                offsets[i] = width == 8 ? i64(data, chunks.body + 8 + i * 8) : u32(data, chunks.body + 8 + i * 4);
            }

            int entryCount = count(data, stsc.body + 4, stsc.end);
            if (entryCount == 0 || stsc.body + 8 + (long) entryCount * 12 > stsc.end) throw new RuntimeException("块索引截断");
            long[] firstChunk = new long[entryCount];
            long[] samplesPerChunk = new long[entryCount];
            for (int i = 0; i < entryCount; i++) {
                firstChunk[i] = u32(data, stsc.body + 8 + i * 12);
                samplesPerChunk[i] = u32(data, stsc.body + 12 + i * 12);
            }

            // saiz：body+4=default_size(1B)，body+5=count(4B)，body+9=sizes[]
            int sizeBase = saiz.body + 4 + ((i32(data, saiz.body) & 1) != 0 ? 8 : 0);
            if (sizeBase + 5 > saiz.end) throw new RuntimeException("辅助索引截断");
            int auxDefault = u(data[sizeBase]);
            int auxCount = count(data, sizeBase + 1, saiz.end);
            if (auxCount != n || (auxDefault == 0 && sizeBase + 5 + n > saiz.end)) throw new RuntimeException("辅助索引数量不一致");
            int[] auxSizes = new int[n];
            for (int i = 0; i < n; i++) auxSizes[i] = auxDefault > 0 ? auxDefault : u(data[sizeBase + 5 + i]);

            // saio：body+4=count(4B)，body+8=offset（宽 4/8）
            int offsetBase = saio.body + 4 + ((i32(data, saio.body) & 1) != 0 ? 8 : 0);
            int offsetWidth = u(data[saio.body]) == 1 ? 8 : 4;
            if (count(data, offsetBase, saio.end) != 1 || offsetBase + 4 + offsetWidth > saio.end) {
                throw new RuntimeException("不支持的辅助索引布局");
            }
            long aux = offsetWidth == 8 ? i64(data, offsetBase + 4) : u32(data, offsetBase + 4);
            long auxTotal = 0;
            for (int i = 0; i < n; i++) auxTotal += auxSizes[i];
            if (aux < 0 || aux + auxTotal > data.length) throw new RuntimeException("辅助数据超出索引范围");

            int sampleIndex = 0;
            int entry = 0;
            for (int chunk = 0; chunk < chunkCount; chunk++) {
                while (entry + 1 < entryCount && firstChunk[entry + 1] <= chunk + 1) entry++;
                if (firstChunk[entry] > chunk + 1) throw new RuntimeException("样本与块数量不一致");
                int c = (int) samplesPerChunk[entry];
                if (c > n - sampleIndex) throw new RuntimeException("样本与块数量不一致");
                long position = offsets[chunk];
                for (int i = 0; i < c; i++, sampleIndex++) {
                    long length = sizes[sampleIndex];
                    int auxSize = auxSizes[sampleIndex];
                    if (length <= 0 || auxSize < 8) throw new RuntimeException("样本索引异常");
                    byte[] iv = new byte[16];
                    System.arraycopy(data, (int) aux, iv, 0, 8);
                    if (auxSize == 8) {
                        samples.add(new Sample(position, position + length, 0, iv));
                    } else {
                        if (auxSize < 10) throw new RuntimeException("不支持的加密样本格式");
                        int subs = ((data[(int) (aux + 8)] & 255) << 8) | (data[(int) (aux + 9)] & 255);
                        if (auxSize != 10 + subs * 6) throw new RuntimeException("加密子样本索引异常");
                        long offset = position;
                        long encrypted = 0;
                        for (int s = 0; s < subs; s++) {
                            int at = (int) (aux + 10 + s * 6);
                            int clear = ((data[at] & 255) << 8) | (data[at + 1] & 255);
                            int encSize = (int) u32(data, at + 2);
                            offset += clear;
                            if (offset + encSize > position + length) throw new RuntimeException("加密子样本越界");
                            if (encSize > 0) samples.add(new Sample(offset, offset + encSize, encrypted, iv));
                            encrypted += encSize;
                            offset += encSize;
                        }
                        if (offset != position + length) throw new RuntimeException("加密子样本长度异常");
                    }
                    position += length;
                    aux += auxSize;
                }
            }
            if (sampleIndex != n) throw new RuntimeException("视频样本不完整");

            // moov 改写：encv/enca → frma 原始编码，sinf → free 清零体（保留 stbl 内逐个处理）
            int at = stbl.body;
            while (at + 8 <= stbl.end) {
                Box sinf = find(data, "sinf", at, stbl.end);
                if (sinf == null) break;
                Box frma = find(data, "frma", sinf.body, sinf.end);
                if (frma == null || frma.body + 4 > frma.end) throw new RuntimeException("原始编码格式缺失");
                byte[] original = Arrays.copyOfRange(data, frma.body, frma.body + 4);
                int entryAt = sinf.start - 1;
                while (entryAt >= stbl.body
                        && !"encv".equals(ascii4(data, entryAt))
                        && !"enca".equals(ascii4(data, entryAt))) {
                    entryAt--;
                }
                if (entryAt < stbl.body) throw new RuntimeException("encv 缺失");
                System.arraycopy(original, 0, header, entryAt, 4);
                System.arraycopy("free".getBytes(StandardCharsets.US_ASCII), 0, header, sinf.start + 4, 4);
                for (int i = sinf.body; i < sinf.end; i++) header[i] = 0;
                at = sinf.end;
            }
        }
        if (samples.isEmpty()) throw new RuntimeException("视频加密索引不可用");

        Collections.sort(samples, new Comparator<Sample>() {
            @Override
            public int compare(Sample a, Sample b) {
                return Long.compare(a.start, b.start);
            }
        });
        for (int i = 1; i < samples.size(); i++) {
            if (samples.get(i).start < samples.get(i - 1).end) throw new RuntimeException("视频样本重叠");
        }
        // 头部截到 moov 结束：mdat 区间的密文字节绝不能进 header（否则 decrypt 会覆盖已解密数据）
        return new Prepared(Arrays.copyOf(header, moovEnd), samples);
    }

    private static byte[] decrypt(byte[] data, long start, byte[] key, Prepared prepared) {
        byte[] result = data.clone();
        long end = start + data.length;
        if (start < prepared.header.length) {
            int from = (int) start;
            int to = (int) Math.min(end, prepared.header.length);
            System.arraycopy(prepared.header, from, result, 0, to - from);
        }
        if (key == null) return result;
        int low = 0;
        int high = prepared.samples.size();
        while (low < high) {
            int mid = (low + high) >>> 1;
            if (prepared.samples.get(mid).end <= start) low = mid + 1;
            else high = mid;
        }
        for (int i = low; i < prepared.samples.size(); i++) {
            Sample s = prepared.samples.get(i);
            if (s.start >= end) break;
            long begin = Math.max(start, s.start);
            long stop = Math.min(end, s.end);
            if (begin >= stop) continue;
            long relative = begin - s.start + s.encryptedOffset;
            int skip = (int) (relative % 16);
            BigInteger counter = new BigInteger(1, s.iv)
                    .add(BigInteger.valueOf(relative / 16))
                    .and(BigInteger.ONE.shiftLeft(128).subtract(BigInteger.ONE));
            byte[] cb = counter.toByteArray();
            byte[] iv = new byte[16];
            int srcFrom = Math.max(0, cb.length - 16);
            int dstFrom = Math.max(0, 16 - cb.length);
            System.arraycopy(cb, srcFrom, iv, dstFrom, cb.length - srcFrom);
            byte[] input = new byte[skip + (int) (stop - begin)];
            System.arraycopy(result, (int) (begin - start), input, skip, (int) (stop - begin));
            byte[] decrypted = aes(false, key, iv, input, "CTR");
            System.arraycopy(decrypted, skip, result, (int) (begin - start), (int) (stop - begin));
        }
        return result;
    }

    // ============================ 缓存 ============================

    private final Map<String, StreamInfo> streamCache =
            Collections.synchronizedMap(new LinkedHashMap<String, StreamInfo>(8, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, StreamInfo> eldest) {
                    return size() > 8;
                }
            });

    /** 取流缓存写入时间（毫秒）：服务端播放数据 expire_time 约 28~54 分钟，超 30 分钟视为失效重取。 */
    private final Map<String, Long> streamCacheAt = new java.util.concurrent.ConcurrentHashMap<String, Long>();
    private static final long STREAM_TTL = 30L * 60 * 1000;

    /** 后台预热线程池：详情页打开即预热前几集（蓝本 maybePrefetch 思路），数据就绪后点播秒回。 */
    private static final java.util.concurrent.ExecutorService PRIMER =
            Executors.newSingleThreadExecutor(new ThreadFactory() {
                @Override
                public Thread newThread(Runnable r) {
                    Thread t = new Thread(r, "qingguoduanju-primer");
                    t.setDaemon(true);
                    return t;
                }
            });
    private static final Map<String, Long> primedAt = new java.util.concurrent.ConcurrentHashMap<String, Long>();

    /** 后台预热指定分集（最多前 3 个未预热过的），每个间隔 1.5 秒，失败不重试不阻塞。 */
    private void primeEpisodes(List<String> vids, final String tag) {
        if (vids == null || vids.isEmpty()) return;
        final long now = System.currentTimeMillis();
        final List<String> todo = new ArrayList<String>();
        for (String v : vids) {
            if (v == null || !v.matches("[0-9]{1,30}")) continue;
            Long at = primedAt.get(v);
            if (at != null && now - at < 10 * 60 * 1000L) continue;
            todo.add(v);
            if (todo.size() >= 3) break;
        }
        if (todo.isEmpty()) return;
        PRIMER.execute(new Runnable() {
            @Override
            public void run() {
                for (String v : todo) {
                    primedAt.put(v, System.currentTimeMillis());
                    try {
                        StreamInfo si = stream(v);
                        fileLog("预热 OK " + tag + " vid=" + v + " quality=" + si.quality);
                    } catch (Throwable t) {
                        primedAt.remove(v);
                        fileLog("预热失败 " + tag + " vid=" + v + " : " + t.getMessage());
                    }
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException ie) {
                        return;
                    }
                }
            }
        });
    }

    private final Map<String, Prepared> preparedCache =
            Collections.synchronizedMap(new LinkedHashMap<String, Prepared>(4, 0.75f, true) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, Prepared> eldest) {
                    return size() > 8;
                }
            });

    private Prepared prepareFor(String vid, StreamInfo si, long total, byte[] firstBody) {
        synchronized (preparedCache) {
            Prepared hit = preparedCache.get(vid);
            if (hit != null) return hit;
        }
        byte[] headerBody = firstBody;
        if (headerBody == null || headerBody.length == 0) {
            long[] totalRef = {total};
            headerBody = range(si.url, 0, Math.max(HEADER_HINT, total) - 1L, totalRef);
        }
        Prepared p = prepare(headerBody, si.key);
        synchronized (preparedCache) {
            preparedCache.put(vid, p);
        }
        return p;
    }

    // ============================ App 端搜索（bookapi/search/tab，蓝本 tsukiyo hongguo.cjs/Signer.kt 1:1） ============================
    // 官网 Web 搜索索引残缺（部分剧不召回、pageNum 翻页无效），App 端接口为全量索引但需字节系全套签名 + 已注册设备。
    // 实证链路（2026-10-26 Node golden.mjs）：匿名注册设备 → 签名搜索 code=0 → 搜到官网搜不到的新剧。

    /** App 搜索接口（蓝本 hongguo.cjs APP_SEARCH_API）。包级可见供桌面金标测试。 */
    static final String APP_SEARCH_API =
            "https://api5-normal-sinfonlinea.fqnovel.com/reading/bookapi/search/tab/v";
    /** App 搜索专用 UA（蓝本 VendorConstants.APP_UA），与播放/网页 UA 区分。 */
    private static final String APP_UA =
            "com.phoenix.read/72232 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3)";
    /** medusa 签名内嵌的 signKey（蓝本 buildMedusa 固定值）。 */
    private static final byte[] APP_SIGN_KEY = hexOf(
            "8ebdfa3806ecc5cee79423e6029ed82540bc2218bb7eaef71cb691f7aa8aa2f5");
    /** 设备注册接口（蓝本 DeviceRegister.kt）：匿名、刻意不带任何签名头。 */
    private static final String REG_URL =
            "https://log5-applog-lf.fqnovel.com/service/2/device_register/"
                    + "?tt_data=a&cronet_version=8d40f833_2026-03-03&ttnet_version=4.2.243.31-douyin&use_store_region_cookie=1";
    private static final byte[] REG_MAGIC = {0x74, 0x63, 0x05, 0x10, 0x00, 0x00};

    /** 随机源/时钟钩子（默认系统实现；桌面金标测试注入固定序列以复现 golden.json）。 */
    interface Rand { double next(); }
    interface ClockMs { long now(); }
    static Rand RAND = new Rand() { @Override public double next() { return Math.random(); } };
    static ClockMs CLOCK = new ClockMs() { @Override public long now() { return System.currentTimeMillis(); } };

    /** App 搜索设备参数（蓝本 APP_DEVICE：DEVICE 顺序 + 版本覆盖 72232），iid/device_id 用注册下发的真实值。 */
    static LinkedHashMap<String, String> appDeviceParams(String iid, String deviceId) {
        LinkedHashMap<String, String> v = new LinkedHashMap<>();
        v.put("iid", iid);
        v.put("device_id", deviceId);
        v.put("ac", "wifi");
        v.put("channel", "update_64");
        v.put("aid", "8662");
        v.put("app_name", "novelread");
        v.put("version_code", "72232");
        v.put("version_name", "7.2.2.32");
        v.put("device_platform", "android");
        v.put("os", "android");
        v.put("ssmix", "a");
        v.put("device_type", "25053RT47C");
        v.put("device_brand", "Redmi");
        v.put("language", "zh");
        v.put("os_api", "36");
        v.put("os_version", "16");
        v.put("manifest_version_code", "72232");
        v.put("resolution", "1280*2772");
        v.put("dpi", "520");
        v.put("update_version_code", "72232");
        v.put("host_abi", "arm64-v8a");
        v.put("dragon_device_type", "phone");
        v.put("pv_player", "72232");
        v.put("compliance_status", "0");
        v.put("need_personal_recommend", "1");
        v.put("player_so_load", "1");
        v.put("is_android_pad_screen", "0");
        return v;
    }

    // ---- 基础位运算/编码（勿改位序，蓝本实测黑盒） ----

    private static int rol32(int v, int n) { n &= 31; return (v << n) | (v >>> (32 - n)); }
    private static int ror32(int v, int n) { n &= 31; return (v >>> n) | (v << (32 - n)); }

    private static byte[] le32(int v) {
        return new byte[]{(byte) v, (byte) (v >>> 8), (byte) (v >>> 16), (byte) (v >>> 24)};
    }

    private static byte[] be32(int v) {
        return new byte[]{(byte) (v >>> 24), (byte) (v >>> 16), (byte) (v >>> 8), (byte) v};
    }

    private static byte[] le64(long v) {
        byte[] out = new byte[8];
        for (int i = 0; i < 8; i++) out[i] = (byte) (v >>> (8 * i));
        return out;
    }

    private static int i32be(byte[] d, int at) {
        return ((d[at] & 255) << 24) | ((d[at + 1] & 255) << 16) | ((d[at + 2] & 255) << 8) | (d[at + 3] & 255);
    }

    private static long i64le(byte[] d, int at) {
        long out = 0;
        for (int i = 7; i >= 0; i--) out = (out << 8) | (d[at + i] & 255);
        return out;
    }

    /** cjs pythonUrlEncode 1:1：保留 A-Za-z0-9-_.~*，其余按 UTF-8 百分号大写编码；URL 与签名必须同一份字节。 */
    static String pythonUrlEncode(LinkedHashMap<String, String> values) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> e : values.entrySet()) {
            if (sb.length() > 0) sb.append('&');
            sb.append(pythonEncodeValue(e.getKey())).append('=').append(pythonEncodeValue(e.getValue()));
        }
        return sb.toString();
    }

    private static String pythonEncodeValue(String v) {
        StringBuilder sb = new StringBuilder();
        for (byte b : v.getBytes(StandardCharsets.UTF_8)) {
            int c = u(b);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')
                    || c == '-' || c == '_' || c == '.' || c == '~' || c == '*') {
                sb.append((char) c);
            } else {
                sb.append('%').append(String.format("%02X", c));
            }
        }
        return sb.toString();
    }

    // ---- protobuf 编码（cjs varint/zigzag/protoField 同构） ----

    private static byte[] varint(long n) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while (n > 127) {
            out.write((int) ((n & 127) | 128));
            n >>>= 7;
        }
        out.write((int) n);
        return out.toByteArray();
    }

    private static byte[] protoFieldSint(long tag, long value) {
        long z = (value << 1) ^ (value >> 63); // 标准 zigzag，等价 cjs zigzag()
        return concat(varint(tag << 3), varint(z));
    }

    private static byte[] protoFieldFloat(long tag, double value) {
        byte[] bits = le32(Float.floatToIntBits((float) value));
        return concat(varint((tag << 3) | 5), bits);
    }

    private static byte[] protoFieldStr(long tag, String value) {
        if (value == null || value.isEmpty()) return new byte[0];
        return protoFieldBytes(tag, value.getBytes(StandardCharsets.UTF_8));
    }

    private static byte[] protoFieldBytes(long tag, byte[] body) {
        if (body == null) return new byte[0];
        return concat(concat(varint((tag << 3) | 2), varint(body.length)), body);
    }

    private static byte[] proto(byte[]... parts) {
        int len = 0;
        for (byte[] p : parts) len += p.length;
        byte[] out = new byte[len];
        int at = 0;
        for (byte[] p : parts) {
            System.arraycopy(p, 0, out, at, p.length);
            at += p.length;
        }
        return out;
    }

    // ---- SM3（Android 无内置实现，纯 Java 移植；标准向量见桌面测试 sm3("abc")） ----

    static byte[] sm3(byte[] input) {
        int[] iv = {0x7380166f, 0x4914b2b9, 0x172442d7, 0xda8a0600,
                0xa96f30bc, 0x163138aa, 0xe38dee4d, 0xb0fb0e4e};
        int[] t = {0x79cc4519, 0x7a879d8a};
        long bitLen = (long) input.length * 8;
        byte[] msg = Arrays.copyOf(input, ((input.length + 8) / 64 + 1) * 64);
        msg[input.length] = (byte) 0x80;
        for (int i = msg.length - 8; i < msg.length; i++) msg[i] = 0;
        for (int i = 0; i < 8; i++) msg[msg.length - 1 - i] = (byte) (bitLen >>> (8 * i));
        int[] w = new int[68];
        int[] w1 = new int[64];
        for (int off = 0; off < msg.length; off += 64) {
            for (int i = 0; i < 16; i++) {
                w[i] = ((msg[off + i * 4] & 255) << 24) | ((msg[off + i * 4 + 1] & 255) << 16)
                        | ((msg[off + i * 4 + 2] & 255) << 8) | (msg[off + i * 4 + 3] & 255);
            }
            for (int i = 16; i < 68; i++) {
                int p1in = w[i - 16] ^ w[i - 9] ^ rol32(w[i - 3], 15);
                int p1 = p1in ^ rol32(p1in, 15) ^ rol32(p1in, 23); // P1(X)=X^(X<<<15)^(X<<<23)
                w[i] = p1 ^ rol32(w[i - 13], 7) ^ w[i - 6];
            }
            for (int i = 0; i < 64; i++) w1[i] = w[i] ^ w[i + 4];
            int a = iv[0], b = iv[1], c = iv[2], d = iv[3], e = iv[4], f = iv[5], g = iv[6], h = iv[7];
            for (int j = 0; j < 64; j++) {
                boolean j16 = j < 16;
                int tj = j16 ? t[0] : t[1];
                int ff = j16 ? (a ^ b ^ c) : ((a & b) | (a & c) | (b & c));
                int gg = j16 ? (e ^ f ^ g) : ((e & f) | ((~e) & g));
                int ss1 = rol32(rol32(a, 12) + e + rol32(tj, j % 32), 7);
                int ss2 = ss1 ^ rol32(a, 12);
                int tt = ff + d + ss2 + w1[j];
                int dd = gg + h + ss1 + w[j];
                d = c;
                c = rol32(b, 9);
                b = a;
                a = tt;
                h = g;
                g = rol32(f, 19);
                f = e;
                e = dd ^ rol32(dd, 9) ^ rol32(dd, 17); // P0(X)=X^(X<<<9)^(X<<<17)
            }
            iv[0] ^= a; iv[1] ^= b; iv[2] ^= c; iv[3] ^= d;
            iv[4] ^= e; iv[5] ^= f; iv[6] ^= g; iv[7] ^= h;
        }
        byte[] out = new byte[32];
        for (int i = 0; i < 8; i++) System.arraycopy(be32(iv[i]), 0, out, i * 4, 4);
        return out;
    }

    // ---- hashF13 branch 0（蓝本 Signer.kt hashF13：只实现 branch 0，调用前抖动 ticket 凑分支） ----

    private static final int[] IVV1_LIST = {0xc4a78580, 0xb3c0fd39, 0xc58c5686, 0xc9aa3ba7, 0xf5a7adf2, 0x963c2ed1};
    private static final int[][] CHOSEN = {
            {101, 5, 7, 6, 3, 2, 1, 0, 5, 4, 3},
            {96, 0, 6, 7, 5, 3, 2, 1, 5, 4, 4},
            {96, 7, 6, 2, 1, 4, 0, 5, 4, 3, 5},
            {99, 3, 6, 2, 4, 5, 1, 0, 0, 7, 6},
            {96, 0, 5, 6, 7, 3, 1, 2, 5, 4, 4},
            {100, 2, 0, 3, 5, 4, 6, 7, 2, 1, 5},
    };
    private static final int[] HASH_TABLE = {
            0xebb64faf, 0x07aadcc2, 0xcf3187bf, 0xe01138ff, 0x6d0bfcff, 0x5a30a3be,
            0xb41ad638, 0x34180eb8, 0xf233eb6f, 0xb1a584cc, 0xccc30dc7, 0x47d1db51,
            0xd55653de, 0x70a84fa1, 0x57473c12, 0xf76f0288, 0x2c077f0a, 0xda0dcad0,
            0xfbb86f6c, 0xfdc4cf00, 0x688a020d, 0xe676c6a6, 0x8cd6338b, 0x1a3c8d0e,
            0xcce8b06b, 0x6ad0ed0b, 0xa0522717, 0xdc71ac83, 0x2285db71, 0xd5b4dda6,
            0x736f8650, 0x6560306c, 0x617ce2a6, 0xe423417e, 0x0a40e143, 0x544e4032,
            0x88dffb2a, 0x716c1ae0, 0x4c467a88, 0x05b23bb3, 0xe1d0b866, 0xbaa3dcb8,
            0xae3374d3, 0xc3381a50, 0x1702f75b, 0xfe6da368, 0xf0b4cf48, 0x4e0ffbb8,
            0x72aad10d, 0x26c53a3d, 0xf2bce0f6, 0xb4557581, 0x4a257fdd, 0x8c3182a2,
            0xab0b3b86, 0x3d5dfb14, 0x4f103634, 0xd37b52d7, 0x444eff16, 0xeb0a33d1,
            0x6ca86f6e, 0x284ba7, 0x08387cfa, 0x5fb37586,
    };

    private static int getIv(int iv, byte[] data) {
        int value = iv;
        for (int i = 0; i < data.length; i++) {
            if ((i & 1) == 0) value = (value >>> 4) ^ value ^ (value << 6) ^ u(data[i]);
            else value = ~((value >>> 7) ^ value ^ (u(data[i]) | (value << 12)));
        }
        return value;
    }

    static int ivOf(byte[] querySm3, byte[] bodyMd5, int ts) {
        return getIv(getIv(getIv(0x20230928, querySm3), bodyMd5), le32(ts));
    }

    /** 计算签名分支（0/1/2）；本实现只支持 branch 0，由 sign() 抖动 _rticket 凑中。 */
    static int branchOf(String query, int ts) {
        return (ivOf(sm3(query.getBytes(StandardCharsets.UTF_8)), new byte[16], ts) & 15) % 3;
    }

    private static int sumMd5(byte[] d) {
        int check = 0x20220420;
        for (int i = 0; i < 12; i++) {
            int temp = (check >>> ((i & 1) == 0 ? 3 : 5)) ^ check;
            check = (i & 1) == 0 ? (u(d[i]) ^ (check << 7)) : ~(u(d[i]) | (check << 11));
            check ^= temp;
        }
        return (check | 4) ^ 0x1000000;
    }

    static byte[] hashF13branch0(byte[] querySm3, byte[] bodyMd5, int ts) {
        int iv = ivOf(querySm3, bodyMd5, ts);
        int index = (iv & 15) / 3;
        int count = IVV1_LIST[index] + ts; // int 溢出回绕 = JS ToUint32 低 32 位
        int[] tt = new int[64];
        for (int i = 0; i < 64; i++) tt[i] = ror32(HASH_TABLE[i], count + 1);
        int shift = (count + 2) & 7;
        int[] seed = {0xfa, 0x45, 0x61, 0xd7};
        byte[] pad = new byte[4];
        for (int i = 0; i < 4; i++) pad[i] = (byte) (((seed[i] | (seed[i] << 8)) >> shift) & 255);
        byte[] data = concat(concat(querySm3, bodyMd5), concat(concat(le32(ts), pad), hexOf("00000000000001a0")));
        int[] di = new int[128];
        for (int i = 0; i < 16; i++) di[i] = i32be(data, i * 4);
        for (int i = 0; i < 112; i++) {
            int x = di[i + 1];
            int y = di[i + 14];
            int r1 = rol32(x, 14) ^ rol32(x, 25) ^ (x >>> 3);
            int r2 = rol32(y, 13) ^ rol32(y, 15) ^ (y >>> 10);
            di[16 + i] = di[i] + di[i + 9] + r1 + r2;
        }
        int[] init = {0x7aba4fc8, 0x67166507, 0x6403fa00, 0x340f512f,
                984304912, (int) 3005047866L, (int) 2874125293L, (int) 2152413264L};
        // cjs：init 即旋转后的数组，末尾 ret 与旋转后的 init 相加
        for (int i = 0; i < 8; i++) init[i] = ror32(init[i], count);
        int[] d = init.clone();
        int[] chosen = CHOSEN[index];
        for (int i = 0; i < chosen[0]; i++) {
            int base = IVV1_LIST[index] + i;
            int n1 = ((d[chosen[3]] ^ d[chosen[4]]) & d[chosen[1]]) ^ d[chosen[3]];
            int n2 = rol32(d[chosen[1]], 26) ^ rol32(d[chosen[1]], 21) ^ rol32(d[chosen[1]], 7);
            int n4 = di[base & 127] + n1 + n2 + tt[base & 63] + d[chosen[5]];
            int n5 = rol32(d[chosen[2]], 30) ^ rol32(d[chosen[2]], 19) ^ rol32(d[chosen[2]], 10);
            int n6 = (d[chosen[2]] & d[chosen[6]]) | ((d[chosen[2]] | d[chosen[6]]) & d[chosen[7]]);
            int old = d[chosen[9]];
            int last = d[7]; // d.unshift(d.pop())
            for (int k = 7; k > 0; k--) d[k] = d[k - 1];
            d[0] = last;
            d[chosen[10]] = n5 + n6 + n4;
            d[chosen[8]] = old + n4;
        }
        byte[] ret = new byte[32];
        for (int i = 0; i < 8; i++) System.arraycopy(be32(d[i] + init[i]), 0, ret, i * 4, 4);
        byte[] folded = new byte[16];
        for (int i = 0; i < 16; i++) folded[i] = (byte) (ret[i] ^ ret[i + 16]);
        return concat(folded, le32(sumMd5(folded)));
    }

    // ---- x-gorgon（RC4 变体，蓝本 cjs xGorgon/rc4Gorgon 逐位对照） ----

    static String xGorgon(String query, byte[] body, int ts, int random) {
        byte[] input = concat(
                Arrays.copyOf(digest("MD5", query.getBytes(StandardCharsets.UTF_8)), 4),
                concat(body != null ? Arrays.copyOf(digest("MD5", body), 4) : new byte[4],
                        concat(new byte[4], concat(le32(67503104), be32(ts)))));
        int[] key = {0x4a, 0x40, 0x16, (random >> 8) & 255, 0x47, 0x6c, 0x01, random & 255};
        int[] s = new int[256];
        for (int i = 0; i < 256; i++) s[i] = i;
        int j = 0;
        for (int i = 0; i < 256; i++) {
            j = (j + s[i] + key[i % 8]) & 255;
            s[i] = s[j]; // 非标准 KSA（无交换），蓝本原样
        }
        int i2 = 0;
        j = 0;
        byte[] out = new byte[input.length];
        for (int n = 0; n < input.length; n++) {
            i2 += 1;
            int x = s[i2];
            j += x;
            int y = s[j & 255];
            s[i2] = y;
            out[n] = (byte) (u(input[n]) ^ s[(y + y) & 255]);
        }
        for (int k = 0; k < out.length; k++) {
            int value = ((u(out[k]) >> 4) | (u(out[k]) << 4)) & 255;
            int next = u(out[k + 1 < out.length ? k + 1 : 0]);
            int reversed = Integer.reverse((next ^ value) & 255) >>> 24;
            out[k] = (byte) (~(reversed ^ 20) & 255);
        }
        byte[] head = {(byte) 0x84, (byte) 0x04, (byte) (random & 255), (byte) ((random >> 8) & 255), 0x40, 0x01};
        StringBuilder sb = new StringBuilder();
        for (byte b : concat(head, out)) sb.append(String.format("%02x", b & 255));
        return sb.toString();
    }

    // ---- x-helios（蓝本 cjs helios 1:1，long 数学） ----

    static String helios(int ts) {
        int random = (int) (long) (RAND.next() * 4294967296.0); // long 中转避免 (int) 对 >2^31 钳位，JS 语义为模回绕
        byte[] md5hex = hexOfLower(digest("MD5", concat(le32(random), "8662".getBytes(StandardCharsets.UTF_8))))
                .getBytes(StandardCharsets.US_ASCII);
        long w0 = i64le(md5hex, 0);
        long w1 = i64le(md5hex, 8);
        java.util.ArrayDeque<Long> queue = new java.util.ArrayDeque<>();
        queue.add(i64le(md5hex, 16));
        queue.add(i64le(md5hex, 24));
        List<Long> table = new ArrayList<>();
        table.add(w0);
        long b0 = w0;
        long b8 = w1;
        for (int i = 0; i < 34; i++) {
            long x8 = Long.rotateRight(b8, 8) + b0;
            x8 ^= i;
            queue.add(x8);
            x8 ^= Long.rotateRight(b0, 61);
            table.add(x8);
            b0 = x8;
            b8 = queue.poll();
        }
        byte[] text = (ts + "-1588093228-8662").getBytes(StandardCharsets.UTF_8);
        int padding = 16 - (text.length % 16);
        byte[] padded = new byte[text.length + padding];
        Arrays.fill(padded, (byte) padding);
        System.arraycopy(text, 0, padded, 0, text.length);
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(le32(random), 0, 4);
        for (int at = 0; at < padded.length; at += 16) {
            long a = i64le(padded, at);
            long b = i64le(padded, at + 8);
            for (int i = 0; i < 34; i++) {
                b = table.get(i) ^ (a + Long.rotateRight(b, 8));
                a = b ^ Long.rotateRight(a, 61);
            }
            out.write(le64(a), 0, 8);
            out.write(le64(b), 0, 8);
        }
        return Base64.encodeToString(out.toByteArray(), Base64.NO_WRAP);
    }

    private static String hexOfLower(byte[] bytes) {
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (byte b : bytes) sb.append(String.format("%02x", b & 255));
        return sb.toString();
    }

    // ---- x-medusa（deviceProto/xmxor/keyHash/AesV3/buildMedusa，蓝本 cjs 1:1） ----

    private static byte[] deviceProto(String deviceId) {
        return proto(
                protoFieldSint(1, 1), protoFieldSint(2, 2), protoFieldStr(3, "8662"),
                protoFieldStr(4, deviceId), protoFieldStr(5, "Ai6svO3PyrwDOUSmO6ZcResxu"),
                protoFieldStr(6, "!noperm!"), protoFieldSint(7, -888888), protoFieldSint(8, -888888),
                protoFieldSint(9, 3), protoFieldSint(10, -888888), protoFieldStr(11, "!notset!"),
                protoFieldStr(12, "Asia/Shanghai,8"), protoFieldStr(13, "zh_CN"), protoFieldSint(14, 4),
                protoFieldFloat(16, 255.24993896484375), protoFieldFloat(17, 35.58599090576172),
                protoFieldFloat(18, 3.467449188232422), protoFieldFloat(19, 3.467449188232422),
                protoFieldFloat(20, 255.1754913330078), protoFieldFloat(21, 42.17544174194336),
                protoFieldStr(22, "16"), protoFieldSint(23, 41), protoFieldSint(24, 36),
                protoFieldSint(25, 1728388016635L), protoFieldSint(26, 1728388016635L),
                protoFieldSint(27, 1728388016635L), protoFieldSint(28, 1728388016637L),
                protoFieldSint(29, -1), protoFieldStr(30, "25053RT47C"), protoFieldStr(31, "Redmi"),
                protoFieldStr(32, "25053RT47C"), protoFieldStr(33, "25053RT47C"), protoFieldStr(34, "Xiaomi"),
                protoFieldStr(35, "Redmi"), protoFieldStr(36, "Redmi"), protoFieldSint(38, 31));
    }

    private static byte[] xmxor(byte[] data, byte[] key) {
        int[] encoded = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            int at = (i * 4) & 28;
            int d0 = u(key[at]);
            int d1 = u(key[at + 1]);
            int v = u(data[i]);
            int d2 = ((((v << 4) | (v >>> 4)) & 255) + d0);
            d2 = (~d2) ^ d1;
            d2 = (((d2 & 255) << 3) | ((d2 & 255) >>> 5)) & 255;
            d2 = (d2 + d1) & 255;
            d2 = (d2 ^ d0) & 255;
            encoded[data.length - i - 1] = (~d2) & 255;
        }
        int last = encoded[encoded.length - 1] ^ encoded[encoded.length - 2];
        int first = encoded[0];
        encoded[0] = ((~last) + first) & 255;
        encoded[1] = ((encoded[0] ^ encoded[encoded.length - 1] ^ 254) + encoded[1]) & 255;
        encoded[2] = (encoded[2] + ((last - first)
                ^ (((encoded[1] << 3) | (encoded[1] >>> 5)) & 255) ^ 2)) & 255;
        for (int i = 0; i < encoded.length - 4; i++) {
            int temp = (((encoded[i + 2] << 3) | (encoded[i + 2] >>> 5)) & 255)
                    ^ encoded[i + 1] ^ (i + 3);
            encoded[i + 3] = ((~temp) + encoded[i + 3]) & 255;
        }
        encoded[encoded.length - 1] ^= encoded[encoded.length - 2];
        int sum = 0;
        for (int i = 0; i < encoded.length - 1; i++) sum += encoded[i + 1];
        encoded[0] = ((encoded[0] ^ encoded[1]) + sum) & 255;
        byte[] out = new byte[encoded.length];
        for (int i = 0; i < out.length; i++) out[i] = (byte) encoded[i];
        return out;
    }

    private static byte[][] keyHash(int random) {
        byte[] input = concat(concat(APP_SIGN_KEY, le32(random)), APP_SIGN_KEY);
        byte[] hash = sm3(input);
        int d1 = (random >> 16) & 255;
        int d2 = ((d1 << 11) | (random >>> 24)) ^ (d1 >> 5) ^ d1;
        return new byte[][]{hash, le32(~d2)};
    }

    private static final byte[] SBOX = b64("+n0Ia5xZs0sEXznQOEqRmQBnpiCf9U2Ccybu3xhmgzOAAxn72f6uqqmwUsYL83klTni0NqxdGieeiNu9PGPsSRXBMB/cuFbUbM3KCUPINaPvHvSW0vwOcnuUhNHqRVpiAj/TEoE0K91+5ijypUYTATsh9mE3KSoN7Yyvv51cuyR2D3XkU4nhmI2xmmVwT1RMWKtub4sjxAcRDLrPoKSO2AU9FLLadMPX577Wf95IFj6FkKFVt3dCIsmGUC4X+WQxLJvxbRxEaOPpqJOXyzJX6+Vxaq3AzMfF/WAdoi1Hp+JRaV56zgpBtpWP97mH4DoGEIq1+FvV8LyS/3wvwugbQOwb2r26mJEMsiuDQTRn+wrYdrVGBVlhI3WQhyrjUBVMrLF5667llUcEaPCGPVGLD8qO5LlO8hKCvA7V9+8oJc9bXelqVQLhM76T5/WtnT45JKji+hdX0HoNCDDWuKON/QeaxB5uImSX0h2wv0VmP2zd2yeApxHcpsVS+MC2yFwAc2B7oBkTqsk1SEvTpM2fmfMQREBUfin0Bh+iq6EvPPavhWI2IX9e3yAas7Tm/3KEj2UmlFp36kN4x0rMLBRrxuh0U/zUHM4xcAMYjJY4MonxOl/X+alpt2M3WMI7w3HLnpIBigtNiJu7T21v4P6lSd5WFgntnMEt7oF92XzRLkJbTcGmXepE/UVOG6E/0YnhfS+q26utWcuxzpooyeD2cDlK1/8w9d28VzsRjbLuALbmGlp8+d7EzS6Au7lMpZ+ECMZvQmzwJ+eLOpxR+2chdUExp8ogQyq3v9l68rX4jCwjg0+PYKAEEzcU4wHFY2ZcdIHfWL1okD3SszT0GZMyKdZJrg1L2AeerB4tC0C4crp2EHGo5FYdSP7lwkeR2ocmnR+Ia8CYviUJlzOjhRZef9xuVOn3qcjow3fQgivsAmKKkg4+sA8F8/GWeDiGNhg8JM8KtFPMYWWkx5TVFX5t73kiNRJqjlIGVXtGZFCV4gzt0xcDopuZ6xz8r9Rzafpf9ywev8jh8592gHFIqpStZPuJxmDDMrNN0uBE3V+oscdoIzTJbRJ/t+sVvqnReJOgDJKk10fjisJwqyZBmnmn2BSFj8BvVtCMEbkuPOKdzw7eA11GPs04Qw8zWtkaZWwiO/wwpojqN6K0jY5RnNZA7vn4hPSul+nKCkVnVwQvg1zVxcSCtqORmB9KrJaBbssbCQivGJVJfVTt+hYxOtq4ZvWl8f4QAQZ0zGPffCgl9s6yT4vlvIdpu4YhBwA25wtQWZsc6GJYGWHyvSdeuh3mmUI9DSq13Fsp8C1MU3tqc04/df9LoTUXVXI5INOw/e8C7Hd+5CvbkMEFnnrUUmskEw==");

    private static int xt(int x) {
        return ((x << 1) ^ ((x & 128) != 0 ? 0x1b : 0)) & 255;
    }

    private static void aesMix(int[][] rows) {
        for (int i = 0; i < 4; i++) {
            int t = rows[0][i] ^ rows[1][i] ^ rows[2][i] ^ rows[3][i];
            int u0 = rows[0][i];
            rows[0][i] ^= t ^ xt(rows[0][i] ^ rows[1][i]);
            rows[1][i] ^= t ^ xt(rows[1][i] ^ rows[2][i]);
            rows[2][i] ^= t ^ xt(rows[2][i] ^ rows[3][i]);
            rows[3][i] ^= t ^ xt(rows[3][i] ^ u0);
        }
    }

    /** 自研 AES 变体（蓝本 cjs AesV3 逐位对照，勿改轮常量/置换顺序）。 */
    private static final class AesV3 {
        private final int wordSize;
        private final byte[] box;
        private final int[] con2;
        private final int[] order;
        private final int init;
        private final int[][] keys;

        AesV3(byte[] key, int khronos) {
            wordSize = khronos & 3;
            box = Arrays.copyOfRange(SBOX, wordSize * 256, (wordSize + 1) * 256);
            int[][] cons = {{1, 0, 2, 3}, {1, 3, 0, 2}, {0, 1, 3, 2}, {1, 0, 2, 3}};
            int[][] cons2 = {{1, 0, 2, 3}, {2, 0, 3, 1}, {0, 1, 3, 2}, {1, 0, 2, 3}};
            int[][] orders = {
                    {0, 9, 14, 11, 4, 13, 2, 7, 8, 1, 6, 15, 12, 5, 10, 3},
                    {0, 9, 14, 15, 4, 13, 2, 7, 8, 1, 6, 3, 12, 5, 10, 11},
                    {0, 9, 14, 7, 4, 13, 2, 11, 8, 1, 6, 3, 12, 5, 10, 15},
                    {0, 9, 14, 11, 4, 13, 2, 7, 8, 1, 6, 15, 12, 5, 10, 3},
            };
            con2 = cons2[wordSize];
            order = orders[wordSize];
            int[] inits = {0xca025ddc, 0x823dc546, 0xc9420583, 0xc298225f};
            init = inits[wordSize];
            byte[] initial = new byte[16];
            for (int i = 0; i < 4; i++) System.arraycopy(le32(init), 0, initial, i * 4, 4);
            byte[] expanded = new byte[48];
            for (int i = 0; i < 16; i++) expanded[i] = (byte) (initial[i] ^ key[i]);
            int rounds = 8;
            for (int i = 4; i < 12; i++) {
                int at = 4 * (i - 1);
                int a = u(expanded[at]);
                int b = u(expanded[at + 1]);
                int c = u(expanded[at + 2]);
                int d = u(expanded[at + 3]);
                if ((i & 3) == 0) {
                    int t = ((init >> (rounds & 24)) ^ box[b]) & 255;
                    b = box[c];
                    c = box[d];
                    d = box[a];
                    a = t;
                }
                rounds += 2;
                expanded[at + 4] = (byte) (a ^ expanded[at - 12]);
                expanded[at + 5] = (byte) (b ^ expanded[at - 11]);
                expanded[at + 6] = (byte) (c ^ expanded[at - 10]);
                expanded[at + 7] = (byte) (d ^ expanded[at - 9]);
            }
            keys = new int[12][4];
            for (int i = 0; i < 12; i++) {
                for (int k = 0; k < 4; k++) keys[i][k] = u(expanded[i * 4 + k]);
            }
        }

        private void addCon(int[][] rows, int base) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) rows[i][j] ^= keys[base + i][con2[j]];
            }
        }

        private void add(int[][] rows, int base) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) rows[i][j] ^= keys[base + i][j];
            }
        }

        private void sub(int[][] rows) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) rows[i][j] = box[rows[i][j]] & 255; // box 为 byte[]，需 &255 防 JS/Java 符号差异
            }
            int[][] old = new int[4][];
            for (int i = 0; i < 4; i++) old[i] = rows[i].clone();
            for (int i = 0; i < 4; i++) rows[i] = old[con2[i]];
        }

        private void shift(int[][] rows) {
            int[] b = new int[16];
            for (int i = 0; i < 16; i++) b[i] = rows[i / 4][i % 4];
            for (int i = 0; i < 16; i++) rows[i / 4][i % 4] = b[order[i]];
        }

        private void shiftCon(int[][] rows) {
            int[][] old = new int[4][];
            for (int i = 0; i < 4; i++) old[i] = rows[i].clone();
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) rows[i][j] = old[i][con2[j]];
            }
        }

        private byte[] block(byte[] value) {
            int[][] rows = new int[4][4];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) rows[i][j] = u(value[i * 4 + j]);
            }
            addCon(rows, 0);
            for (int i = 1; i < 3; i++) {
                sub(rows);
                shift(rows);
                if (i == 1) {
                    shiftCon(rows);
                    aesMix(rows);
                }
                addCon(rows, i * 4);
            }
            add(rows, 4);
            byte[] out = new byte[16];
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) out[i * 4 + j] = (byte) rows[i][j];
            }
            return out;
        }

        byte[] encrypt(byte[] source, byte[] iv) {
            byte[] plaintext = new byte[32];
            for (int i = 0; i < 31; i++) {
                int at = i * 8;
                int n0 = (u(source[at]) >> 4) & 2;
                int n1 = n0 | (u(source[at + 1]) & 64);
                int n2 = n1 | ((u(source[at + 2]) >> 2) & 1);
                int n3 = n2 | ((u(source[at + 3]) << 3) & 128);
                int n4 = n3 | ((u(source[at + 4]) >> 1) & 4);
                int n5 = n4 | ((u(source[at + 5]) << 3) & 16);
                int n6 = n5 | ((u(source[at + 6]) << 5) & 32);
                plaintext[i] = (byte) (n6 | ((u(source[at + 7]) >> 4) & 8));
            }
            plaintext[31] = 1;
            byte[] key = new byte[32];
            byte[] previous = iv.clone();
            for (int i = 0; i < 32; i += 16) {
                byte[] x = new byte[16];
                for (int k = 0; k < 16; k++) x[k] = (byte) (plaintext[i + k] ^ previous[k]);
                byte[] value = block(x);
                System.arraycopy(value, 0, key, i, 16);
                previous = value;
            }
            byte[] out = source.clone();
            for (int i = 0; i < 31; i++) {
                int at = i * 8;
                int k = u(key[i]);
                out[at] = (byte) ((out[at] & 0xdf) | ((k << 4) & 32));
                out[at + 1] = (byte) ((out[at + 1] & 0xbf) | (k & 64));
                out[at + 2] = (byte) ((out[at + 2] & 0xfb) | ((k << 2) & 4));
                out[at + 3] = (byte) ((out[at + 3] & 0xef) | ((k >> 3) & 16));
                out[at + 4] = (byte) ((out[at + 4] & 0xf7) | ((k + k) & 8));
                out[at + 5] = (byte) ((out[at + 5] & 0xfd) | ((k >> 3) & 2));
                out[at + 6] = (byte) ((out[at + 6] & 0xfe) | ((k >> 5) & 1));
                out[at + 7] = (byte) ((out[at + 7] & 0x7f) | ((k << 4) & 128));
            }
            return concat(new byte[]{key[31]}, out);
        }
    }

    static String buildMedusa(String url, byte[] body, int khronos, String deviceId) {
        byte[] bodyMd5 = body != null ? digest("MD5", body) : new byte[16];
        String query = url.substring(url.indexOf('?') + 1);
        byte[] querySm3 = sm3(query.getBytes(StandardCharsets.UTF_8));
        byte[] queryBodyTs = hashF13branch0(querySm3, bodyMd5, khronos);
        byte[] nested = proto(protoFieldSint(1, 111), protoFieldSint(2, 10),
                protoFieldSint(3, 694367), protoFieldSint(5, 586952199));
        int messageRand = (int) (long) (RAND.next() * 4294967296.0);
        int envLaunch = (int) (RAND.next() * 21) + 100;
        int envPid = (int) (RAND.next() * 2000) + 10001;
        byte[] env = proto(
                protoFieldSint(1, envLaunch), protoFieldSint(2, 146331399), protoFieldSint(3, 146331396),
                protoFieldSint(5, 7), protoFieldStr(6, "v04.06.04.03-bugfix"), protoFieldSint(7, envPid),
                protoFieldBytes(12, deviceProto(deviceId)),
                protoFieldBytes(13, proto(protoFieldSint(1, CLOCK.now() / 1000),
                        protoFieldSint(2, -2), protoFieldSint(4, 200))),
                protoFieldStr(14, "7.1.3.32"));
        byte[] queryHash = sm3(concat(query.getBytes(StandardCharsets.UTF_8),
                concat(bodyMd5, "none".getBytes(StandardCharsets.UTF_8))));
        byte[] message = proto(
                protoFieldBytes(1, hexOf("f7e85ffad7d7dc3bd62ac87057cf6118")),
                protoFieldSint(2, 3),
                protoFieldSint(3, messageRand & 0xFFFFFFFFL),
                protoFieldStr(4, "8662"),
                protoFieldStr(5, deviceId),
                protoFieldStr(6, "1588093228"),
                protoFieldStr(7, "7.1.3.32"),
                protoFieldStr(8, "v04.06.04-ml-android"),
                protoFieldSint(9, 67503104),
                protoFieldBytes(10, hexOf("4001000000000000")),
                protoFieldSint(12, khronos & 0xFFFFFFFFL),
                protoFieldBytes(13, queryBodyTs),
                protoFieldBytes(14, Arrays.copyOf(querySm3, 6)),
                protoFieldBytes(15, nested),
                protoFieldStr(16, "AXYQOS6n2m60x1fVZHIrH3iol"),
                protoFieldSint(17, khronos & 0xFFFFFFFFL),
                protoFieldBytes(19, queryHash),
                protoFieldStr(20, "none"),
                protoFieldSint(21, 312),
                protoFieldBytes(23, env),
                protoFieldStr(24, "{\"cmr\":16777216,\"cmr2\":16777216,\"un_h\":1879194040,\"vpn\":0,"
                        + "\"kd\":0,\"fkd\":3672518972,\"pd\":-1872573247,\"dyn\":\"\",\"do\":0,\"tk\":true}"));
        int random = (int) (long) (RAND.next() * 4294967296.0);
        byte[][] kh = keyHash(random);
        byte[] transformed = concat(hexOf("4001000000000000"), xmxor(message, kh[0]));
        for (int i = 0, j2 = transformed.length - 1; i < j2; i++, j2--) {
            byte t2 = transformed[i];
            transformed[i] = transformed[j2];
            transformed[j2] = t2;
        }
        for (int i = 0; i < transformed.length; i++) transformed[i] ^= kh[1][(byte) (~i) & 3];
        int check = ((u(querySm3[0]) & 63) << 14) | 0x18000001 | ((u(queryBodyTs[0]) & 63) << 8);
        int xmRand = (int) (long) (RAND.next() * 4294967296.0);
        byte[] packed = concat(new byte[]{0x35},
                concat(le32(xmRand), concat(le32(check), concat(transformed,
                        new byte[]{(byte) ((random >>> 16) & 255), (byte) ((random >>> 24) & 255)}))));
        byte[] encrypted = new AesV3(hexOf("f1593376766ea98d34f31b057a9d5be4"), khronos)
                .encrypt(packed, hexOf("1fe109a4125283f418de9e051a969e12"));
        byte[] versionB = hexOf("03000000f7e85ffad7d7dc3bd62ac87057cf6118");
        byte[] prefix = new byte[20];
        for (int i = 0; i < 20; i += 4) {
            int w = u(versionB[i]) | (u(versionB[i + 1]) << 8) | (u(versionB[i + 2]) << 16) | (u(versionB[i + 3]) << 24);
            System.arraycopy(le32(w ^ khronos), 0, prefix, i, 4); // cjs readUInt32LE 小端
        }
        byte[] tail = {(byte) (random & 255), (byte) ((random >> 8) & 255), 0, 1};
        return Base64.encodeToString(concat(prefix, concat(tail, encrypted)), Base64.NO_WRAP);
    }

    // ---- 设备注册（蓝本 DeviceRegister.kt：匿名、免签名、body 为原始二进制） ----

    /** ttEncrypt：MAGIC || rnd[32] || AES-128-CBC(SHA512(SHA512(rnd)+KDF_SALT), PKCS7(SHA512(data)||data))。 */
    private static byte[] ttEncrypt(byte[] data) {
        byte[] rnd = new byte[32];
        new Random().nextBytes(rnd);
        byte[] derived = digest("SHA-512",
                concat(digest("SHA-512", rnd), hexOf(SPADE_CONST)));
        byte[] body = concat(digest("SHA-512", data), data);
        int padding = 16 - (body.length % 16);
        byte[] padded = Arrays.copyOf(body, body.length + padding);
        for (int i = body.length; i < padded.length; i++) padded[i] = (byte) padding;
        return concat(REG_MAGIC, concat(rnd,
                aes(true, Arrays.copyOfRange(derived, 0, 16), Arrays.copyOfRange(derived, 16, 32), padded, "CBC")));
    }

    /** 注册请求体：ttEncrypt(gzip(JSON))，字段顺序/类型严格照抄 Node 实证成功样例（7.3.9.32 口径）。 */
    private static byte[] registerPayload(long now) {
        try {
            // 手拼 JSON：org.json 的 HashMap 乱序会被服务端拒（device_id=0），顺序必须与抓包/实证一致
            String uuid = UUID.randomUUID().toString();
            String openudid = UUID.randomUUID().toString().replace("-", "").substring(0, 16);
            String header = "{\"display_name\":\"红果免费短剧\","
                    + "\"update_version_code\":73932,"
                    + "\"manifest_version_code\":73932,"
                    + "\"app_version_minor\":\"7.3.9.32\","
                    + "\"aid\":8662,"
                    + "\"channel\":\"69310258a\","
                    + "\"package\":\"com.phoenix.read\","
                    + "\"app_version\":\"7.3.9.32\","
                    + "\"version_code\":73932,"
                    + "\"sdk_version\":\"3.7.0-rc.34-fanqie-xiaoshuo\","
                    + "\"sdk_target_version\":29,"
                    + "\"git_hash\":\"3a88f4e\","
                    + "\"os\":\"Android\","
                    + "\"os_version\":\"12\","
                    + "\"os_api\":32,"
                    + "\"device_model\":\"25053RT47C\","
                    + "\"device_brand\":\"Redmi\","
                    + "\"device_manufacturer\":\"Redmi\","
                    + "\"cpu_abi\":\"arm64-v8a\","
                    + "\"release_build\":\"b5e187f\","
                    + "\"density_dpi\":520,"
                    + "\"display_density\":\"mdpi\","
                    + "\"resolution\":\"1280x2772\","
                    + "\"language\":\"zh\","
                    + "\"timezone\":8,"
                    + "\"access\":\"wifi\","
                    + "\"not_request_sender\":0,"
                    + "\"carrier\":\"CHINA MOBILE\","
                    + "\"mcc_mnc\":\"46000\","
                    + "\"rom\":\"eng.root.20231116.160340\","
                    + "\"rom_version\":\"W528JS release-keys\","
                    + "\"cdid\":\"" + uuid + "\","
                    + "\"sig_hash\":\"56a962410c494bbaf0b58dba20cae56f\","
                    + "\"openudid\":\"" + openudid + "\","
                    + "\"clientudid\":\"" + UUID.randomUUID() + "\","
                    + "\"ipv6_list\":[],"
                    + "\"region\":\"CN\","
                    + "\"tz_name\":\"Asia/Shanghai\","
                    + "\"tz_offset\":28800,"
                    + "\"sim_region\":\"cn\","
                    + "\"sim_serial_number\":[],"
                    + "\"oaid_may_support\":false,"
                    + "\"req_id\":\"" + UUID.randomUUID() + "\","
                    + "\"device_platform\":\"android\","
                    + "\"custom\":{\"account_region_src\":\"fallback\",\"host_bit\":64,"
                    + "\"account_region\":\"cn\",\"dragon_device_type\":\"phone\"},"
                    + "\"pre_installed_channel\":\"\","
                    + "\"apk_first_install_time\":" + now + ","
                    + "\"is_system_app\":0,"
                    + "\"sdk_flavor\":\"china\","
                    + "\"guest_mode\":0"
                    + "}";
            String json = "{\"magic_tag\":\"ss_app_log\",\"header\":" + header
                    + ",\"_gen_time\":" + now + "}";
            byte[] raw = json.getBytes(StandardCharsets.UTF_8);
            ByteArrayOutputStream gz = new ByteArrayOutputStream();
            java.util.zip.GZIPOutputStream gzos = new java.util.zip.GZIPOutputStream(gz);
            gzos.write(raw);
            gzos.close();
            return ttEncrypt(gz.toByteArray());
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    /** 匿名注册设备，返回 {device_id, install_id}；全 0/缺失表示被拒。 */
    private static String[] registerDevice() {
        long now = CLOCK.now();
        byte[] body = registerPayload(now);
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(REG_URL).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(20000);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("User-Agent", APP_UA);
            conn.setRequestProperty("Content-Type", "application/octet-stream;tt-data=a");
            conn.setRequestProperty("log-encode-type", "gzip");
            conn.setRequestProperty("x-ss-dp", "8662");
            conn.setRequestProperty("x-ss-req-ticket", String.valueOf(now));
            conn.setRequestProperty("x-vc-bdturing-sdk-version", "4.0.3.cn");
            conn.setRequestProperty("lc", "101");
            conn.setRequestProperty("sdk-version", "2");
            conn.setRequestProperty("passport-sdk-version", "5051452");
            conn.setRequestProperty("x-neptune", "-8|50:51:59:30:40:47:49:39");
            conn.setRequestProperty("x-ss-stub", hexOfLower(digest("MD5", body)).toUpperCase());
            conn.setRequestProperty("Accept-Encoding", "identity"); // 防 brotli，拿明文 JSON
            conn.setDoOutput(true);
            conn.getOutputStream().write(body);
            int code = conn.getResponseCode();
            InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[65536];
            if (in != null) {
                int n;
                while ((n = in.read(buf)) > 0) out.write(buf, 0, n);
                in.close();
            }
            String resp = new String(out.toByteArray(), StandardCharsets.UTF_8);
            fileLog("device_register http " + code + " len=" + resp.length());
            JSONObject json = new JSONObject(resp);
            String deviceId = json.optString("device_id_str", json.optString("device_id", ""));
            String installId = json.optString("install_id_str", json.optString("install_id", ""));
            if (deviceId.isEmpty() || installId.isEmpty() || "0".equals(deviceId) || "0".equals(installId)) {
                throw new RuntimeException("注册被拒 device_id=" + deviceId + " resp=" + resp);
            }
            return new String[]{deviceId, installId};
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    /** App 搜索设备身份：进程缓存 + 外部存储持久化（qingguoduanju_device.json），force 时强制重新注册。 */
    private static volatile String[] appDeviceIds = null;

    private static String deviceStorePath() {
        try {
            if (mContext == null) return null;
            java.io.File dir = mContext.getExternalFilesDir(null);
            if (dir == null) return null;
            return new java.io.File(dir, "qingguoduanju_device.json").getAbsolutePath();
        } catch (Throwable t) {
            return null;
        }
    }

    private static synchronized String[] appDevice(boolean force) {
        if (!force && appDeviceIds != null) return appDeviceIds;
        String path = deviceStorePath();
        if (!force && path != null) {
            try {
                java.io.File f = new java.io.File(path);
                if (f.exists()) {
                    // java.nio.file 在 API<26 不可用，统一 java.io 流读写
                    java.io.FileInputStream fin = new java.io.FileInputStream(f);
                    ByteArrayOutputStream bout = new ByteArrayOutputStream();
                    byte[] buf = new byte[4096];
                    int n;
                    while ((n = fin.read(buf)) > 0) bout.write(buf, 0, n);
                    fin.close();
                    JSONObject json = new JSONObject(new String(bout.toByteArray(), StandardCharsets.UTF_8));
                    String d = json.optString("device_id", "");
                    String i = json.optString("install_id", "");
                    if (!d.isEmpty() && !i.isEmpty()) {
                        appDeviceIds = new String[]{d, i};
                        return appDeviceIds;
                    }
                }
            } catch (Throwable ignore) {
            }
        }
        String[] reg = registerDevice();
        appDeviceIds = reg;
        if (path != null) {
            try {
                String json = new JSONObject().put("device_id", reg[0]).put("install_id", reg[1]).toString();
                java.io.FileOutputStream fout = new java.io.FileOutputStream(path);
                fout.write(json.getBytes(StandardCharsets.UTF_8));
                fout.close();
            } catch (Throwable ignore) {
            }
        }
        return reg;
    }

    // ---- App 搜索请求与解析 ----

    /** 组参 → 抖动 ticket 凑 branch 0 → 全套签名 → GET；返回响应 JSON。 */
    private static JSONObject appSearchRequest(LinkedHashMap<String, String> values, String deviceId) {
        long now = CLOCK.now();
        int ts = (int) (now / 1000);
        long ticket = now;
        String query = null;
        for (int offset = 0; offset <= 127; offset++) {
            ticket = now + offset;
            LinkedHashMap<String, String> vals = new LinkedHashMap<>(values);
            vals.put("ts", String.valueOf(ts));
            vals.put("_rticket", String.valueOf(ticket));
            query = pythonUrlEncode(vals);
            if (branchOf(query, ts) == 0) break;
            query = null;
        }
        if (query == null) throw new RuntimeException("签名分支抖动失败（128 次）");
        String url = APP_SEARCH_API + "?" + query;
        int random = (int) (RAND.next() * 65536);
        LinkedHashMap<String, String> headers = new LinkedHashMap<>();
        headers.put("User-Agent", APP_UA);
        headers.put("Accept", "application/json; charset=utf-8,application/x-protobuf");
        headers.put("x-ss-req-ticket", String.valueOf(ticket));
        headers.put("x-tt-request-tag", "t=0;n=0");
        headers.put("sdk-version", "2");
        headers.put("passport-sdk-version", "50561");
        headers.put("x-xs-from-web", "0");
        headers.put("x-khronos", String.valueOf(ts));
        headers.put("x-ladon", Base64.encodeToString(be32(ts), Base64.NO_WRAP));
        headers.put("x-argus", Base64.encodeToString(le32(ts), Base64.NO_WRAP));
        headers.put("x-gorgon", xGorgon(query, null, ts, random));
        headers.put("x-helios", helios(ts));
        headers.put("x-medusa", buildMedusa(url, null, ts, deviceId));
        headers.put("x-tt-dt", "");
        String resp = text(url, "GET", null, headers).trim();
        if (resp.isEmpty()) throw new RuntimeException("空响应（设备失效特征）");
        JSONObject json;
        try {
            json = new JSONObject(resp);
        } catch (Exception e) {
            throw new RuntimeException("非 JSON 响应: " + resp.substring(0, Math.min(120, resp.length())));
        }
        if (!"0".equals(json.optString("code", "-1"))) {
            throw new RuntimeException("code=" + json.optString("code", "?")
                    + (json.has("message") ? " " + json.optString("message") : ""));
        }
        return json;
    }

    /** 搜索响应 → Series 列表（cells + lynx_data.cell_data 展开映射）。 */
    private static Series appSearchVod(JSONObject cell) {
        JSONArray va = cell.optJSONArray("video_data");
        JSONObject video = null;
        for (int i = 0; va != null && i < va.length(); i++) {
            JSONObject v = va.optJSONObject(i);
            if (v != null) {
                video = v;
                break;
            }
        }
        if (video == null) return null;
        String title = "";
        JSONObject hl = cell.optJSONObject("search_high_light");
        JSONObject hlTitle = hl == null ? null : hl.optJSONObject("title");
        if (hlTitle != null) title = hlTitle.optString("text", "");
        if (title.isEmpty()) title = video.optString("title", "");
        if (title.isEmpty()) title = cell.optString("cell_name", "");
        String id = video.optString("series_id", "");
        if (id.isEmpty()) id = cell.optString("book_id", cell.optString("search_result_id", ""));
        // 只收真剧集条目（19 位 series_id），过滤「系列剧」「其他版本」等聚合位（id 短、进详情必失败）
        if (!id.matches("[0-9]{15,30}") || title.trim().isEmpty()) return null;
        int cnt = video.optInt("episode_cnt", 0);
        String badge = cnt > 0 ? "全" + cnt + "集" : video.optString("rec_text", video.optString("sub_title", ""));
        return new Series(id.trim(), title.trim(), cleanUrl(video.optString("cover",
                video.optString("cover_url", ""))), video.optString("video_desc", ""), badge == null ? "" : badge, "");
    }

    /** 分页 cursor 缓存：key=keyword|page → {search_id, passback}，5 分钟 TTL（蓝本 searchCursors 同口径）。 */
    private static final java.util.concurrent.ConcurrentHashMap<String, Object[]> appSearchCache =
            new java.util.concurrent.ConcurrentHashMap<String, Object[]>();
    private static final long APP_SEARCH_TTL = 5 * 60 * 1000L;

    /** App 端搜索整页：顺序回放 1..page 取 cursor（缓存命中跳过），设备失效空响应时重注册重试一次。 */
    private Page appSearchPage(String keyword, int page) {
        Page result = null;
        String searchId = null;
        String passback = null;
        for (int p = 1; p <= page; p++) {
            String key = keyword + "|" + p;
            Object[] cached = appSearchCache.get(key);
            if (cached != null && CLOCK.now() - (Long) cached[2] < APP_SEARCH_TTL) {
                @SuppressWarnings("unchecked") LinkedHashMap<String, String> cur =
                        (LinkedHashMap<String, String>) cached[1];
                searchId = cur.get("search_id");
                passback = cur.get("passback");
                result = (Page) cached[0];
                continue;
            }
            try {
                result = appSearchOnce(keyword, p, searchId, passback);
            } catch (RuntimeException e) {
                if (e.getMessage() != null && e.getMessage().contains("空响应")) {
                    fileLog("app search 设备失效，重新注册后重试 page=" + p);
                    String[] dev = appDevice(true);
                    result = appSearchOnce(keyword, p, searchId, passback, dev);
                } else {
                    throw e;
                }
            }
            LinkedHashMap<String, String> cur = result.cursor;
            appSearchCache.put(key, new Object[]{result, cur, CLOCK.now()});
            searchId = cur.get("search_id");
            passback = cur.get("passback");
        }
        return result;
    }

    private Page appSearchOnce(String keyword, int page, String searchId, String passback) {
        return appSearchOnce(keyword, page, searchId, passback, appDevice(false));
    }

    private Page appSearchOnce(String keyword, int page, String searchId, String passback, String[] dev) {
        fileLog("app search begin kw=[" + keyword + "] page=" + page);
        LinkedHashMap<String, String> values = appDeviceParams(dev[1], dev[0]);
        values.put("query", keyword);
        values.put("count", "20");
        values.put("offset", String.valueOf(Math.max(0, (page - 1) * 20)));
        values.put("tab_type", "11");
        values.put("bookshelf_search_plan", "4");
        values.put("use_correct", "true");
        values.put("user_is_login", "0");
        if (searchId != null && !searchId.isEmpty()) values.put("search_id", searchId);
        if (passback != null && !passback.isEmpty()) values.put("passback", passback);
        JSONObject resp = appSearchRequest(values, dev[0]);
        JSONObject data = resp.optJSONObject("data");
        JSONArray tabs = resp.optJSONArray("search_tabs");
        if (tabs == null && data != null) tabs = data.optJSONArray("search_tabs");
        JSONObject tab = null;
        for (int i = 0; tabs != null && i < tabs.length(); i++) {
            JSONObject t = tabs.optJSONObject(i);
            if (t != null && t.optInt("tab_type", -1) == 11) {
                tab = t;
                break;
            }
        }
        List<Series> items = new ArrayList<>();
        if (tab != null) {
            JSONArray rows = tab.optJSONArray("data");
            for (int i = 0; rows != null && i < rows.length(); i++) {
                JSONObject cell = rows.optJSONObject(i);
                if (cell == null) continue;
                List<JSONObject> cells = new ArrayList<>();
                cells.add(cell);
                String lynx = cell.optString("lynx_data", "");
                if (!lynx.isEmpty()) {
                    try {
                        JSONArray cd = new JSONObject(lynx).optJSONArray("cell_data");
                        for (int k = 0; cd != null && k < cd.length(); k++) {
                            JSONObject c2 = cd.optJSONObject(k);
                            if (c2 != null) cells.add(c2);
                        }
                    } catch (Exception ignore) {
                    }
                }
                for (JSONObject c : cells) {
                    Series s = appSearchVod(c);
                    if (s == null) continue;
                    boolean dup = false;
                    for (Series d : items) {
                        if (d.id.equals(s.id)) {
                            dup = true;
                            break;
                        }
                    }
                    if (!dup) items.add(s);
                }
            }
        }
        boolean hasMore = tab != null && tab.optBoolean("has_more", false);
        LinkedHashMap<String, String> cur = new LinkedHashMap<>();
        cur.put("search_id", tab == null ? "" : tab.optString("search_id", ""));
        cur.put("passback", tab == null ? "" : tab.optString("passback", ""));
        Page p = new Page(items, page, hasMore ? page + 1 : page);
        p.cursor = cur;
        fileLog("app search done kw=[" + keyword + "] page=" + page + " items=" + items.size()
                + " hasMore=" + hasMore);
        return p;
    }

    // ============================ Spider 协议 ============================

    private static String pageData(List<Series> items, int page, int lastPage, boolean hasMore) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            for (Series s : items) {
                JSONObject v = new JSONObject();
                v.put("vod_id", s.id);
                v.put("vod_name", s.name);
                v.put("vod_pic", s.cover);
                v.put("vod_remarks", s.badge);
                v.put("vod_actor", s.tags);
                v.put("vod_content", s.intro);
                list.put(v);
            }
            result.put("list", list);
            result.put("page", page);
            result.put("pagecount", hasMore ? Math.max(page, lastPage) : page);
            result.put("limit", 20);
            result.put("total", 0);
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /** 影视类型分类（官网 /category/{type}）：type_id + 类型名 + 类型内筛选（名称|slug，官网 selectorList 实测固化）。 */
    private static final String[][] TYPE_FILTERS = {
            {"real-drama", "真人剧",
                    "爱情|romance", "年代|period", "逆袭|comeback", "传奇|legend", "成长|growth", "家庭|family",
                    "家族|clan", "萌宝|cute-kids", "悬疑|suspense", "惊悚|thriller", "恐怖|horror", "志怪|supernatural",
                    "古装|costume", "玄幻|fantasy", "奇幻|wonder", "都市|urban", "青春|youth", "喜剧|comedy",
                    "科幻|sci-fi", "灾难|disaster", "动作冒险|action-adventure", "战争|war", "综艺|variety", "剧情|drama"},
            {"comic-drama", "漫剧",
                    "脑洞|creative", "玄幻|fantasy", "剧情|drama", "末世|apocalypse", "豪门|wealthy-family",
                    "奇幻|wonder", "科幻|sci-fi", "冒险|adventure"},
            {"ai-drama", "AI剧",
                    "脑洞|creative", "玄幻|fantasy", "剧情|drama", "末世|apocalypse", "豪门|wealthy-family",
                    "奇幻|wonder", "科幻|sci-fi", "冒险|adventure"},
    };

    /** 是否为影视类型分类（真人剧/漫剧/AI剧）。 */
    private static boolean isTypeCategory(String tid) {
        for (String[] def : TYPE_FILTERS) if (def[0].equals(tid)) return true;
        return false;
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            classes.put(new JSONObject().put("type_id", "hot").put("type_name", "热播短剧"));
            classes.put(new JSONObject().put("type_id", "real-drama").put("type_name", "真人剧"));
            classes.put(new JSONObject().put("type_id", "comic-drama").put("type_name", "漫剧"));
            classes.put(new JSONObject().put("type_id", "ai-drama").put("type_name", "AI剧"));
            classes.put(new JSONObject().put("type_id", "rank").put("type_name", "漫剧榜"));
            result.put("class", classes);
            // 类型内筛选组（key=cate）：值=官网筛选 slug，categoryContent 拼 /category/{type}/{slug} 路径式筛选
            JSONObject filters = new JSONObject();
            for (String[] def : TYPE_FILTERS) {
                JSONArray values = new JSONArray();
                values.put(new JSONObject().put("n", "全部").put("v", ""));
                for (int i = 2; i < def.length; i++) {
                    int bar = def[i].indexOf('|');
                    values.put(new JSONObject().put("n", def[i].substring(0, bar)).put("v", def[i].substring(bar + 1)));
                }
                filters.put(def[0], new JSONArray().put(new JSONObject()
                        .put("key", "cate").put("name", "分类").put("value", values)));
            }
            result.put("filters", filters);
            return result.toString();
        } catch (Exception e) {
            fileLog("homeContent FAIL : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return "";
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        int page = 1;
        try {
            page = Math.max(1, Integer.parseInt(pg == null ? "1" : pg.trim()));
        } catch (Exception ignore) {
        }
        try {
            Page p;
            fileLog("categoryContent enter tid=" + tid + " pg=" + pg + " extend=" + (extend == null ? "{}" : extend.toString()));
            if ("rank".equals(tid)) {
                p = rankPage(page);
            } else if (isTypeCategory(tid)) {
                String slug = extend == null ? "" : extend.get("cate");
                p = typeCategoryPage(tid, slug == null ? "" : slug.trim(), page);
            } else {
                p = home(page);
            }
            fileLog("categoryContent done tid=" + tid + " page=" + page + " items=" + p.items.size() + " more=" + p.hasMore);
            return pageData(p.items, page, p.lastPage, p.hasMore);
        } catch (Exception e) {
            fileLog("categoryContent FAIL tid=" + tid + " page=" + page + " : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return pageData(new ArrayList<Series>(), page, page, false);
        }
    }

    @Override
    public String homeVideoContent() {
        // 站点推荐模式「推荐」货架数据源（与点播源同构）：官网热播分类页第一页
        try {
            Page p = home(1);
            fileLog("homeVideoContent done items=" + p.items.size());
            return pageData(p.items, 1, 1, false);
        } catch (Exception e) {
            fileLog("homeVideoContent FAIL : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return "";
        }
    }

    /** 壳侧 SourceViewModel 只调 2 参版本（不重写会落到基类默认实现直接返回空串=搜索永远无结果），委托给 3 参。 */
    @Override
    public String searchContent(String key, boolean quick) {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        long t0 = System.currentTimeMillis();
        int page = 1;
        try {
            page = Math.max(1, Integer.parseInt(pg == null ? "1" : pg.trim()));
        } catch (Exception ignore) {
        }
        String keyword = key == null ? "" : key.trim();
        fileLog("searchContent enter kw=[" + keyword + "] page=" + page + " quick=" + quick);
        if (keyword.isEmpty() || keyword.length() > 80) {
            fileLog("searchContent skip empty/long keyword");
            return pageData(new ArrayList<Series>(), page, page, false);
        }
        // ① App 端搜索（bookapi/search/tab，全量索引；官网索引残缺、部分剧不召回）
        try {
            Page p = appSearchPage(keyword, page);
            if (!p.items.isEmpty()) {
                String out = pageData(p.items, page, p.lastPage, p.hasMore);
                fileLog("searchContent done(app) kw=[" + keyword + "] page=" + page
                        + " items=" + p.items.size() + " cost=" + (System.currentTimeMillis() - t0) + "ms");
                return out;
            }
            fileLog("app search 空结果 kw=[" + keyword + "] page=" + page + " → 官网 Web 兜底");
        } catch (Throwable t) {
            fileLog("app search FAIL kw=[" + keyword + "] page=" + page
                    + " → 官网 Web 兜底 : " + t.getClass().getSimpleName() + ": " + t.getMessage());
        }
        // ② 官网 JSON 接口兜底（/api/search/result；有频控、索引残缺，作降级通道）
        try {
            Page p = searchPage(keyword, page);
            String out = pageData(p.items, page, p.lastPage, p.hasMore);
            fileLog("searchContent done(web) kw=[" + keyword + "] page=" + page
                    + " items=" + p.items.size() + " lastPage=" + p.lastPage + " more=" + p.hasMore
                    + " outLen=" + out.length() + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return out;
        } catch (Exception e) {
            fileLog("searchContent FAIL kw=[" + keyword + "] page=" + page
                    + " : " + e.getClass().getSimpleName() + ": " + e.getMessage()
                    + " (返回空列表，壳侧将显示该源无结果)");
            return pageData(new ArrayList<Series>(), page, page, false);
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        long t0 = System.currentTimeMillis();
        try {
            String id = ids.get(0);
            fileLog("detailContent enter id=" + id);
            // superguoguo 免签主路：H5 album-share SSR 单次拿 series_data + chapter_ids 全集（失败回落官网 SSR）
            JSONObject sd = null;
            List<String> vids = new ArrayList<String>();
            try {
                JSONObject h5 = h5Album(id);
                sd = h5.optJSONObject("sd");
                JSONArray cv = h5.optJSONArray("vids");
                for (int i = 0; cv != null && i < cv.length(); i++) {
                    String v = cv.optString(i, "");
                    if (!v.isEmpty()) vids.add(v);
                }
            } catch (Throwable t) {
                fileLog("h5Album FAIL id=" + id + " → 官网兜底 : " + t.getClass().getSimpleName() + ": " + t.getMessage());
            }
            // 官网 SSR 兜底：详情元数据与分集 vid 同源（此前抓两次，弱网下易触发壳 30s 超时）
            if (sd == null || vids.isEmpty()) {
                JSONObject data = router(SITE + "/detail?series_id=" + id);
                sd = seriesDetailOf(data);
                if (sd == null) throw new RuntimeException("seriesDetail missing (loaderData keys: " + keysOf(data) + ")");
                vids = vidsOf(sd);
                if (vids.isEmpty() && sd.optJSONArray("episodeVids") != null) {
                    JSONArray ev = sd.optJSONArray("episodeVids");
                    for (int i = 0; i < ev.length(); i++) {
                        String v = ev.optString(i, "");
                        if (!v.isEmpty()) vids.add(v);
                    }
                }
            }
            if (vids.isEmpty()) throw new RuntimeException("vid_list missing");

            // 字段兼容：H5 用 title/serial_count，官网用 series_title/episode_cnt
            int count = sd.optInt("episode_cnt", sd.optInt("series_episode_cnt", 0));
            if (count == 0) count = sd.optInt("serial_count", 0);
            if (count == 0) {
                JSONObject info = sd.optJSONObject("series_episode_info");
                if (info != null) count = info.optInt("episode_cnt", 0);
            }
            String badge = sd.optString("episode_right_text", "");
            if (badge.isEmpty() && count > 0) badge = "全 " + count + " 集";
            Series s = new Series(id,
                    sd.optString("series_title", sd.optString("series_name", sd.optString("title", ""))),
                    sd.optString("series_cover", ""), sd.optString("series_intro", ""), badge, "");

            StringBuilder play = new StringBuilder();
            for (int i = 0; i < vids.size(); i++) {
                if (i > 0) play.append('#');
                // 分集 id 必须是纯数字 vid：壳会把 vod_play_url 里的 id 原样传给 playerContent，
                // proxy:// 形式会让 stream() 拿完整 URL 去请求 preload 被风控软拒（200 空体）
                play.append("第").append(String.format("%02d", i + 1)).append("集$").append(vids.get(i));
                // 弹幕 business_param.book_id 需要 series_id：detail 时建立 vid→series 映射
                DM_VID_SERIES.put(vids.get(i), id);
            }

            JSONObject v = new JSONObject();
            v.put("vod_id", id);
            v.put("vod_name", s.name);
            v.put("vod_pic", s.cover);
            v.put("vod_content", s.intro);
            v.put("vod_remarks", s.badge);
            v.put("type_id", "hot");
            v.put("type_name", "短剧");
            v.put("vod_play_from", "青果短剧");
            v.put("vod_play_url", play.toString());
            // 壳侧 AbsJson.toAbsXml() 只解析 MacCMS 格式 {"list":[...]}，顶层裸 vod 对象会 NPE
            JSONObject root = new JSONObject();
            root.put("code", 1);
            JSONArray list = new JSONArray();
            list.put(v);
            root.put("list", list);
            Log.e(TAG, "detailContent id=" + id + " vids=" + vids.size());
            fileLog("detailContent done id=" + id + " name=" + s.name + " vids=" + vids.size()
                    + " outLen=" + root.length() + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            // 详情页打开即后台预热前 3 集（蓝本 maybePrefetch 思路）：用户浏览详情的几秒内数据就绪，点播秒回
            primeEpisodes(vids, "detail:" + id);
            return root.toString();
        } catch (Exception e) {
            fileLog("detailContent FAIL ids=" + ids + " : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        long t0 = System.currentTimeMillis();
        try {
            StreamInfo si = stream(id);
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("header", new JSONObject());
            // flag 必须回显入参（= detail 的 vod_play_from）：壳的 stale 校验比较 result.flag 与当前播放片源名，
            // 填清晰度会被当作过期结果静默丢弃 → 永远转圈
            result.put("flag", flag == null || flag.isEmpty() ? "青果短剧" : flag);
            result.put("url", "proxy://do=play&siteKey="
                    + (siteKey == null || siteKey.isEmpty() ? "qingguoduanju" : siteKey)
                    + "&vid=" + id);
            // 弹幕：壳 DanmuLoadController 拉取该 URL（本地代理 do=danmu 分支回吐 B 站 XML）
            result.put("danmaku", dmProxyUrl(id));
            Log.e(TAG, "playerContent id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms quality=" + si.quality);
            return result.toString();
        } catch (Exception e) {
            Log.e(TAG, "playerContent FAIL id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms : " + e.getMessage());
            fileLog("playerContent FAIL id=" + id + " cost=" + (System.currentTimeMillis() - t0) + "ms : " + e);
            // 失败必须显式回传 msg（壳侧 handleResolvePlayUrlFailed 会显示），返回空串会被当无结果处理
            try {
                String reason = e.getMessage() == null || e.getMessage().isEmpty()
                        ? e.getClass().getSimpleName() : e.getMessage();
                JSONObject err = new JSONObject();
                err.put("msg", "获取播放数据失败：" + reason);
                err.put("flag", flag == null || flag.isEmpty() ? "青果短剧" : flag);
                err.put("url", "");
                err.put("parse", 0);
                return err.toString();
            } catch (Exception ignored) {
                return "";
            }
        }
    }

    // ============================ 短剧弹幕（tsukiyo hongguoTV TimedComments 蓝图，金标对齐 danmu_api hongguo） ============================
    // 链路：壳播放页取 playerContent.danmaku（本地代理 URL）→ 壳弹幕 Parser GET 该 URL →
    // 壳 RemoteServer do=danmu 分发回 proxy() → 本节窗口循环拉番茄小说评论弹幕接口 → B 站 XML 回吐。
    // 签名四件套（X-Gorgon/X-Argus/X-Ladon/X-Khronos）已通过 danmu_api 金标逐字节校验（test/DanmuProbe golden）。

    static final String DM_COMMENT_HOST = "https://api5-normal-sinfonlineb.fqnovel.com";
    static final String DM_UA =
            "com.phoenix.read/73532 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3; "
                    + "Cronet/TTNetVersion:04657795 2026-01-23 QuicVersion:c67e9834 2025-09-08)";
    static final int DM_WINDOW_MS = 30000;
    static final int DM_COUNT = 90;
    static final int DM_MAX_WINDOWS = 40;   // 兜底上限：40 窗 ≈ 20 分钟，短剧单集远小于此
    static final long DM_THROTTLE_MS = 300; // 窗间节流，防风控

    /** vid → series_id（detailContent 时填充，弹幕 business_param.book_id 需要）。 */
    static final Map<String, String> DM_VID_SERIES =
            Collections.synchronizedMap(new LinkedHashMap<String, String>(64, 0.75f, false) {
                protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                    return size() > 4096;
                }
            });

    /** 弹幕经壳本地代理回吐：反射取壳 Proxy 端口（9978 被占时会自增，不可写死）。 */
    String dmProxyUrl(String vid) {
        String base;
        try {
            Class<?> proxy = Class.forName("com.github.catvod.Proxy");
            base = (String) proxy.getMethod("getUrl", boolean.class).invoke(null, Boolean.TRUE);
        } catch (Throwable t) {
            base = "http://127.0.0.1:9978/proxy";
        }
        String sk = siteKey == null || siteKey.isEmpty() ? "qingguoduanju" : siteKey;
        return base + "?do=danmu&siteKey=" + sk + "&vid=" + vid;
    }

    private static byte[] dmMd5(byte[] data) {
        try {
            return MessageDigest.getInstance("MD5").digest(data);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static byte[] dmHex(String s) {
        byte[] out = new byte[s.length() / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }

    private static String dmHexOf(byte[] b) {
        StringBuilder sb = new StringBuilder(b.length * 2);
        for (byte v : b) sb.append(String.format("%02x", v & 255));
        return sb.toString();
    }

    private static byte[] dmConcat(byte[]... parts) {
        int len = 0;
        for (byte[] p : parts) len += p.length;
        byte[] out = new byte[len];
        int at = 0;
        for (byte[] p : parts) {
            System.arraycopy(p, 0, out, at, p.length);
            at += p.length;
        }
        return out;
    }

    private static long dmWord64le(byte[] b, int at) {
        long v = 0;
        for (int i = 7; i >= 0; i--) v = (v << 8) | (b[at + i] & 255L);
        return v;
    }

    private static byte[] dmLe64(long v) {
        byte[] out = new byte[8];
        for (int i = 0; i < 8; i++) out[i] = (byte) (v >>> (8 * i));
        return out;
    }

    private static byte[] dmBe32(int v) {
        return new byte[]{(byte) (v >>> 24), (byte) (v >>> 16), (byte) (v >>> 8), (byte) v};
    }

    private static int dmU(byte b) {
        return b & 255;
    }

    private static byte[] dmPkcs7(byte[] data) {
        int pad = 16 - data.length % 16;
        byte[] out = Arrays.copyOf(data, data.length + pad);
        Arrays.fill(out, data.length, out.length, (byte) pad);
        return out;
    }

    private static void dmVarint(ByteArrayOutputStream out, long n) {
        while ((n >>> 7) != 0) {
            out.write((int) ((n & 127) | 128));
            n >>>= 7;
        }
        out.write((int) n);
    }

    /** proto 编码（tsukiyo proto 1:1：Number→varint，其余→length-delimited UTF-8）。 */
    private static byte[] dmProto(LinkedHashMap<Integer, Object> fields) {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        for (Map.Entry<Integer, Object> en : fields.entrySet()) {
            int tag = en.getKey();
            Object value = en.getValue();
            if (value instanceof Number) {
                dmVarint(out, (long) tag << 3);
                dmVarint(out, ((Number) value).longValue());
            } else {
                byte[] bytes = value instanceof byte[]
                        ? (byte[]) value : value.toString().getBytes(StandardCharsets.UTF_8);
                dmVarint(out, ((long) tag << 3) | 2);
                dmVarint(out, bytes.length);
                out.write(bytes, 0, bytes.length);
            }
        }
        return out.toByteArray();
    }

    /** gorgon 种子 20 字节（danmu_api buildGorgonSeed）：md5(query)[0:4]+stub[0:4]+cookieMd5[0:4]+00010704+BE32(ts)。 */
    private static byte[] dmGorgonSeed(String query, String stub, String cookie, long ts) {
        byte[] body = stub.matches("(?i)[0-9a-f]{32}") ? dmHex(stub.substring(0, 8)) : new byte[4];
        byte[] ck = cookie.isEmpty() ? new byte[4] : Arrays.copyOf(dmMd5(cookie.getBytes(StandardCharsets.UTF_8)), 4);
        return dmConcat(Arrays.copyOf(dmMd5(query.getBytes(StandardCharsets.UTF_8)), 4), body, ck,
                dmHex("00010704"), dmBe32((int) ts));
    }

    /** X-Gorgon（0x8404 新版 RC4 变体，金标校验与 danmu_api 逐字节一致）。 */
    private static String dmGorgon(byte[] seed, int first, int second, int parameter) {
        byte[] input = Arrays.copyOf(seed, seed.length);
        int[] key = {0x4a, parameter & 255, 0x16, second, 0x47, 0x6c, parameter >>> 8, first};
        int[] box = new int[256];
        for (int i = 0; i < 256; i++) box[i] = i;
        int j = 0;
        for (int i = 0; i < 256; i++) {
            j = (j + box[i] + key[i % 8]) & 255;
            box[i] = box[j];
        }
        j = 0;
        for (int n = 0; n < input.length; n++) {
            int i = (n + 1) & 255;
            j = (j + box[i]) & 255;
            box[i] = box[j];
            input[n] = (byte) (dmU(input[n]) ^ box[(box[i] + box[j]) & 255]);
        }
        int lengthMask = (~input.length) & 255;
        for (int i = 0; i < input.length; i++) {
            int v = dmU(input[i]);
            int swapped = ((v << 4) | (v >>> 4)) & 255;
            int next = dmU(input[(i + 1) % input.length]);
            input[i] = (byte) (Integer.reverse(swapped ^ next) >>> 24 ^ lengthMask);
        }
        byte[] head = {(byte) 0x84, 4, (byte) first, (byte) second, (byte) parameter, (byte) (parameter >>> 8)};
        return dmHexOf(dmConcat(head, input));
    }

    /** X-Ladon（simon 34 轮 + md5(salt|aid) 密钥，tsukiyo/danmu_api 同构）。 */
    private static String dmLadon(long ts, byte[] salt) {
        byte[] ascii = dmHexOf(dmMd5(dmConcat(salt, "8662".getBytes(StandardCharsets.UTF_8))))
                .getBytes(StandardCharsets.US_ASCII);
        List<Long> queue = new ArrayList<>();
        queue.add(dmWord64le(ascii, 16));
        queue.add(dmWord64le(ascii, 24));
        long left = dmWord64le(ascii, 0);
        long right = dmWord64le(ascii, 8);
        long[] keys = new long[34];
        for (int i = 0; i < keys.length; i++) {
            keys[i] = left;
            long next = (Long.rotateRight(right, 8) + left) ^ i;
            queue.add(next);
            left = next ^ Long.rotateLeft(left, 3);
            right = queue.remove(0);
        }
        byte[] data = dmPkcs7((ts + "-1611921764-3019").getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        result.write(salt, 0, salt.length);
        for (int at = 0; at < data.length; at += 16) {
            long a = dmWord64le(data, at);
            long b = dmWord64le(data, at + 8);
            for (long k : keys) {
                b = k ^ (a + Long.rotateRight(b, 8));
                a = b ^ Long.rotateLeft(a, 3);
            }
            result.write(dmLe64(a), 0, 8);
            result.write(dmLe64(b), 0, 8);
        }
        return java.util.Base64.getEncoder().encodeToString(result.toByteArray());
    }

    private static final String DM_ARGUS_SECRET =
            "ac1adaae95a7af94a5114ab3b3a97dd80050aa0a39314c40528caec95256c28c";

    /** X-Argus（sm3 派生 + simon 128/256 72 轮 + AES-CBC，金标校验通过；注意密钥编排第二混合同步为右旋）。 */
    private static String dmArgus(String query, String stub, long ts, long argusRandom, int signCount) {
        byte[] bodyInput = stub.matches("(?i)[0-9a-f]{32}") ? dmHex(stub) : new byte[16];
        byte[] nested = dmProto(new LinkedHashMap<Integer, Object>() {{
            put(1, (long) signCount);
            put(2, 1388734L);
            put(3, 1388734L);
            put(4, 1388734L);
        }});
        byte[] message = dmProto(new LinkedHashMap<Integer, Object>() {{
            put(1, 0x40401252L);
            put(2, 2L);
            put(3, argusRandom);
            put(4, "3019");
            put(6, "1611921764");
            put(7, "6.8.1.32");
            put(8, "v04.07.01-ml-android");
            put(9, 135135744L);
            put(10, new byte[8]);
            put(12, ts * 2);
            put(13, Arrays.copyOfRange(sm3(bodyInput), 0, 6));
            put(14, Arrays.copyOfRange(sm3(query.getBytes(StandardCharsets.UTF_8)), 0, 6));
            put(15, nested);
            put(20, "none");
            put(21, 738L);
        }});
        byte[] secret = dmHex(DM_ARGUS_SECRET);
        byte[] derived = sm3(dmConcat(secret, dmHex("3ccc567b"), secret));
        long[] keys = new long[72];
        for (int i = 0; i <= 3; i++) keys[i] = dmWord64le(derived, i * 8);
        for (int i = 4; i <= 71; i++) {
            // danmu_api simonRoundKeys：mixed = ror(k[i-1],3)^k[i-3]；mixed ^= ror(mixed,1)（右旋；
            // tsukiyo CommentSignature 此处为左旋，实测服务端只认右旋）
            long x = Long.rotateRight(keys[i - 1], 3) ^ keys[i - 3];
            x ^= Long.rotateRight(x, 1);
            keys[i] = ~keys[i - 4] ^ x ^ ((0x3dc94c3a046d678bL >>> ((i - 4) % 62)) & 1) ^ 3;
        }
        byte[] blocks = dmPkcs7(message);
        ByteArrayOutputStream encrypted = new ByteArrayOutputStream();
        for (int at = 0; at < blocks.length; at += 16) {
            long a = dmWord64le(blocks, at);
            long b = dmWord64le(blocks, at + 8);
            for (long k : keys) {
                long next = a ^ (Long.rotateLeft(b, 1) & Long.rotateLeft(b, 8)) ^ Long.rotateLeft(b, 2) ^ k;
                a = b;
                b = next;
            }
            encrypted.write(dmLe64(a), 0, 8);
            encrypted.write(dmLe64(b), 0, 8);
        }
        byte[] mask = dmHex("d04ffdffd04ffdff");
        byte[] enc = encrypted.toByteArray();
        byte[] scrambled = new byte[enc.length];
        for (int i = 0; i < enc.length; i++) scrambled[i] = (byte) (dmU(enc[i]) ^ dmU(mask[i % 8]));
        byte[] maskScrambled = dmConcat(mask, scrambled);
        byte[] reversed = new byte[maskScrambled.length];
        for (int i = 0; i < maskScrambled.length; i++) reversed[i] = maskScrambled[maskScrambled.length - 1 - i];
        byte[] container = dmConcat(dmHex("a6e783ee7001100918"), reversed, dmHex("567b"));
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.ENCRYPT_MODE,
                    new SecretKeySpec(dmMd5(Arrays.copyOfRange(secret, 0, 16)), "AES"),
                    new IvParameterSpec(dmMd5(Arrays.copyOfRange(secret, 16, 32))));
            return java.util.Base64.getEncoder()
                    .encodeToString(dmConcat(dmHex("3ccc"), cipher.doFinal(container)));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /** 弹幕评论列表单窗请求（POST /novel/commentapi/comment/list/{vid}/v1/，全套签名头）。 */
    private static JSONObject dmCommentWindow(String vid, String bookId, long startMs, long durationMs,
                                              String cursor) throws Exception {
        JSONObject business = new JSONObject();
        business.put("book_id", bookId);
        business.put("start_offset_time", startMs);
        business.put("playlet_item_duration", durationMs);
        business.put("need_danmaku_guide_type", new JSONArray(Arrays.asList(1, 3, 4, 2)));
        JSONObject payload = new JSONObject();
        payload.put("comment_source", 601);
        payload.put("server_channel", 1000);
        payload.put("group_id", vid);
        payload.put("group_type", 30);
        payload.put("comment_type", 20);
        payload.put("sort", 1);
        payload.put("count", DM_COUNT);
        payload.put("cursor", cursor);
        payload.put("aid", 8662);
        payload.put("compliance_status", 0);
        payload.put("business_param", business);

        long now = System.currentTimeMillis();
        Map<String, String> query = new TreeMap<>();
        query.put("aid", "8662");
        query.put("app_name", "novelread");
        query.put("version_code", "73532");
        query.put("version_name", "7.3.5.32");
        query.put("manifest_version_code", "73532");
        query.put("update_version_code", "73532");
        query.put("channel", "update_64");
        query.put("device_platform", "android");
        query.put("os", "android");
        query.put("ssmix", "a");
        query.put("device_type", "25053RT47C");
        query.put("device_brand", "Redmi");
        query.put("language", "zh");
        query.put("os_api", "36");
        query.put("os_version", "16");
        query.put("resolution", "1280*2772");
        query.put("dpi", "520");
        query.put("ac", "wifi");
        query.put("device_id", "7397450988462912345");
        query.put("iid", "7397450988462912346");
        query.put("_rticket", String.valueOf(now));
        StringBuilder q = new StringBuilder();
        for (Map.Entry<String, String> en : query.entrySet()) {
            if (q.length() > 0) q.append('&');
            q.append(en.getKey()).append('=').append(java.net.URLEncoder.encode(en.getValue(), "UTF-8"));
        }
        String encoded = q.toString();

        java.security.SecureRandom rnd = new java.security.SecureRandom();
        byte[] nonce = new byte[11];
        rnd.nextBytes(nonce);
        int first = (((nonce[0] & 255) % 7) + 1) << 5;
        int second = 0xe0 | (nonce[1] & 15);
        ByteBuffer nb = ByteBuffer.wrap(nonce, 6, 4).order(ByteOrder.LITTLE_ENDIAN);
        long argusRandom = nb.getInt() & 0xffffffffL;
        int signCount = 2 + (nonce[10] & 255) % 49 * 2;

        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(DM_COMMENT_HOST + "/novel/commentapi/comment/list/"
                    + vid + "/v1/?" + encoded).openConnection();
            conn.setConnectTimeout(10000);
            conn.setReadTimeout(15000);
            conn.setRequestMethod("POST");
            conn.setDoOutput(true);
            conn.setRequestProperty("User-Agent", DM_UA);
            conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("X-XS-From-Web", "0");
            conn.setRequestProperty("Sdk-Version", "2");
            conn.setRequestProperty("Comment-Source", "601");
            conn.setRequestProperty("Server-Channel", "1000");
            conn.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            conn.setRequestProperty("X-Gorgon", dmGorgon(dmGorgonSeed(encoded, "", "", now / 1000), first, second, 0));
            conn.setRequestProperty("X-Khronos", String.valueOf(now / 1000));
            conn.setRequestProperty("X-SS-Req-Ticket", String.valueOf(now));
            conn.setRequestProperty("X-SS-STUB", "");
            conn.setRequestProperty("X-Argus", dmArgus(encoded, "", now / 1000, argusRandom, signCount));
            conn.setRequestProperty("X-Ladon", dmLadon(now / 1000, Arrays.copyOfRange(nonce, 2, 6)));
            byte[] body = payload.toString().getBytes(StandardCharsets.UTF_8);
            conn.setFixedLengthStreamingMode(body.length);
            OutputStream os = conn.getOutputStream();
            os.write(body);
            os.close();
            int code = conn.getResponseCode();
            InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            byte[] buf = new byte[8192];
            int n;
            while (in != null && (n = in.read(buf)) > 0) bout.write(buf, 0, n);
            if (in != null) in.close();
            if (code >= 400) throw new RuntimeException("danmu http " + code);
            return new JSONObject(new String(bout.toByteArray(), StandardCharsets.UTF_8));
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    private static String dmEscape(String text) {
        return text.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;")
                .replace("\"", "&quot;").replace("'", "&apos;");
    }

    /** 窗口循环拉全集弹幕 → B 站 XML（tsukiyo TimedComments.parse 同构 + danmu_api has_more 推进）。 */
    static String dmFetchXml(String vid, String bookId) {
        StringBuilder xml = new StringBuilder("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<i>");
        List<String> markers = new ArrayList<>();
        List<String> seenIds = new ArrayList<>();
        long startMs = 0;
        String cursor = "";
        int total = 0;
        try {
            for (int i = 0; i < DM_MAX_WINDOWS; i++) {
                String marker = startMs + ":" + cursor;
                if (markers.contains(marker)) break;
                markers.add(marker);
                if (i > 0) {
                    Thread.sleep(DM_THROTTLE_MS + (long) (Math.random() * 200));
                }
                JSONObject resp = dmCommentWindow(vid, bookId, startMs, 0, cursor);
                if (resp.optInt("code", -1) != 0) {
                    fileLog("danmu window code=" + resp.optInt("code", -1)
                            + " msg=" + resp.optString("message", resp.optString("msg", "")));
                    break;
                }
                JSONObject data = resp.optJSONObject("data");
                if (data == null) break;
                JSONObject extra = data.optJSONObject("extra");
                long next = extra == null ? startMs + DM_WINDOW_MS
                        : extra.optLong("next_query_danmaku_list_time", startMs + DM_WINDOW_MS);
                if (next <= startMs) next = startMs + DM_WINDOW_MS;
                JSONObject listInfo = data.optJSONObject("common_list_info");
                String nextCursor = listInfo == null ? "" : listInfo.optString("cursor", "");
                boolean hasMore = listInfo != null && listInfo.optBoolean("has_more", false);
                JSONArray rows = data.optJSONArray("data_list");
                int win = 0;
                if (rows != null) {
                    for (int r = 0; r < rows.length(); r++) {
                        JSONObject row = rows.optJSONObject(r);
                        JSONObject comment = row == null ? null : row.optJSONObject("comment");
                        if (comment == null) continue;
                        JSONObject common = comment.optJSONObject("common");
                        JSONObject expand = comment.optJSONObject("expand");
                        if (common == null || expand == null) continue;
                        // 只收本集在播弹幕（group_id 匹配 + status=1 正常态）
                        if (!vid.equals(common.optString("group_id")) || common.optInt("status", -1) != 1) continue;
                        long time = expand.optLong("offset_time", -1);
                        String id = comment.optString("comment_id");
                        if (id.length() > 120) id = id.substring(0, 120);
                        String text = "";
                        JSONObject content = common.optJSONObject("content");
                        if (content != null) text = content.optString("text");
                        text = text.replaceAll("[\\p{Cc}\\u2028\\u2029]", " ").trim();
                        if (text.length() > 180) text = text.substring(0, 180);
                        if (id.isEmpty() || text.isEmpty() || seenIds.contains(id)) continue;
                        seenIds.add(id);
                        xml.append("<d p=\"").append(String.format(java.util.Locale.US, "%.2f", time / 1000.0))
                                .append(",1,25,16777215\">").append(dmEscape(text)).append("</d>");
                        total++;
                        win++;
                    }
                }
                if (!hasMore) break;
                startMs = next;
                cursor = nextCursor;
            }
        } catch (Exception e) {
            fileLog("danmu fetch FAIL vid=" + vid + " : " + e);
        }
        xml.append("</i>");
        fileLog("danmu fetch done vid=" + vid + " series=" + bookId + " windows=" + markers.size()
                + " count=" + total + " bytes=" + xml.length());
        return xml.toString();
    }

    /** 壳代理 do=danmu 分支：拉弹幕回吐 B 站 XML（失败 502 → 壳侧自动降级内置弹幕库搜索）。 */
    private Object[] dmProxy(Map<String, String> params) {
        String vid = params.get("vid");
        if (vid == null || !vid.matches("\\d+")) {
            fileLog("proxy danmu invalid vid=" + vid);
            return null;
        }
        try {
            String series = DM_VID_SERIES.containsKey(vid) ? DM_VID_SERIES.get(vid) : "";
            String xml = dmFetchXml(vid, series);
            byte[] body = xml.getBytes(StandardCharsets.UTF_8);
            return new Object[]{200, "text/xml;charset=utf-8",
                    new ByteArrayInputStream(body), new LinkedHashMap<String, String>()};
        } catch (Exception e) {
            fileLog("proxy danmu FAIL vid=" + vid + " : " + e);
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Length", "0");
            // 用 500 不用 502：NanoHTTPD 2.3.1 Status 枚举缺 502，lookup 返回 null 会崩壳进程
            return new Object[]{500, "text/plain", new ByteArrayInputStream(new byte[0]), headers};
        }
    }

    /** 本地代理：__range 分段 → CENC 解密 → 206 回吐（与壳 getProxy 契约一致）。 */
    @Override
    public Object[] proxy(Map<String, String> params) {
        try {
            if ("danmu".equals(params.get("do"))) return dmProxy(params);
            if (!"play".equals(params.get("do"))) return null;
            String vid = params.get("vid");
            if (vid == null || !vid.matches("\\d+")) {
                Log.e(TAG, "proxy invalid vid=" + vid);
                return null;
            }
            String range = params.get("__range");
            if (range == null || range.isEmpty()) range = params.get("range");
            if (range == null || range.isEmpty()) range = "bytes=0-";
            Matcher m = Pattern.compile("bytes=(\\d+)-(\\d*)").matcher(range);
            if (!m.find()) {
                Log.e(TAG, "proxy bad range=" + range);
                return null;
            }
            long start = Long.parseLong(m.group(1));

            StreamInfo si = stream(vid);
            long[] totalRef = {0};
            long wantEnd = start + SEG_SIZE - 1;
            byte[] body = range(si.url, start, wantEnd, totalRef);
            long total = totalRef[0];
            if (total <= 0) total = start + body.length;
            Log.e(TAG, "proxy vid=" + vid + " start=" + start + " got=" + body.length + " total=" + total);

            Prepared prepared = si.key == null
                    ? new Prepared(new byte[0], new ArrayList<Sample>())
                    : prepareFor(vid, si, total, start == 0 ? body : null);
            byte[] decrypted = decrypt(body, start, si.key, prepared);

            if (decrypted.length == 0) {
                Map<String, String> errHeaders = new LinkedHashMap<>();
                errHeaders.put("Content-Length", "0");
                return new Object[]{404, "text/plain", new ByteArrayInputStream(new byte[0]), errHeaders};
            }
            long realEnd = start + decrypted.length - 1;
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Range", "bytes " + start + "-" + realEnd + "/" + total);
            headers.put("Accept-Ranges", "bytes");
            return new Object[]{206, "video/mp4", new ByteArrayInputStream(decrypted), headers};
        } catch (Exception e) {
            Log.e(TAG, "proxy FAIL vid=" + params.get("vid") + " : " + e.getMessage());
            fileLog("proxy FAIL vid=" + params.get("vid") + " : " + e);
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Length", "0");
            // 用 500 不用 502：NanoHTTPD 2.3.1 Status 枚举缺 502，lookup 返回 null 会崩壳进程
            return new Object[]{500, "text/plain", new ByteArrayInputStream(new byte[0]), headers};
        }
    }
}
