package com.github.catvod.spider.music.lx;

import org.json.JSONObject;

/**
 * globalThis.lx 宿主环境，语义对齐 lx-music-mobile user-api-preload.js：
 * EVENT_NAMES / on / send / request / utils{buffer,crypto,zlib} / version / env，
 * 外加 console、setTimeout/clearTimeout、currentScriptInfo、btoa/atob。
 */
public final class LxHost {

    public interface Listener {
        void onInited(String dataJson);

        void onRequestHandler(Object handler);

        void onLog(String msg);

        void onTimeout(long id);
    }

    private final JsRuntime rt;
    private final Listener listener;
    private final String scriptInfoJson;
    private final java.util.concurrent.ScheduledExecutorService timer;
    private final java.util.concurrent.atomic.AtomicLong timerId = new java.util.concurrent.atomic.AtomicLong();
    private final java.util.concurrent.ConcurrentMap<Long, java.util.concurrent.ScheduledFuture<?>> timers = new java.util.concurrent.ConcurrentHashMap<>();

    public LxHost(JsRuntime rt, Listener listener, String scriptInfoJson, java.util.concurrent.ScheduledExecutorService timer) {
        this.rt = rt;
        this.listener = listener;
        this.scriptInfoJson = scriptInfoJson;
        this.timer = timer;
    }

    public void install() throws Exception {
        Object lx = rt.newObject();

        Object names = rt.newObject();
        rt.setProperty(names, "request", "request");
        rt.setProperty(names, "inited", "inited");
        rt.setProperty(names, "updateAlert", "updateAlert");
        rt.setProperty(lx, "EVENT_NAMES", names);

        rt.setProperty(lx, "version", "2.1.7");
        rt.setProperty(lx, "env", "lx-music-mobile");
        rt.setProperty(lx, "on", (JsRuntime.HostFn) args -> on(args));
        rt.setProperty(lx, "send", (JsRuntime.HostFn) args -> send(args));
        rt.setProperty(lx, "request", (JsRuntime.HostFn) args -> request(args));
        rt.setProperty(lx, "utils", utils());
        rt.setGlobal("lx", lx);

        if (scriptInfoJson != null && !scriptInfoJson.isEmpty()) {
            rt.setGlobal("currentScriptInfo", rt.parseJson(scriptInfoJson));
        }
        rt.setGlobal("env", "lx-music-mobile");
        rt.setGlobal("console", console());
        rt.setGlobal("setTimeout", (JsRuntime.HostFn) args -> setTimeout(args, false));
        rt.setGlobal("setInterval", (JsRuntime.HostFn) args -> setTimeout(args, true));
        rt.setGlobal("clearTimeout", (JsRuntime.HostFn) args -> {
            clear(args);
            return null;
        });
        rt.setGlobal("clearInterval", (JsRuntime.HostFn) args -> {
            clear(args);
            return null;
        });
        rt.setGlobal("btoa", (JsRuntime.HostFn) args -> LxHttp.b64(rt.toBytes(args.length > 0 ? args[0] : null)));
        rt.setGlobal("atob", (JsRuntime.HostFn) args -> new String(LxHttp.unb64(str(args.length > 0 ? args[0] : null)), "UTF-8"));
    }

    private Object on(Object[] args) {
        String name = str(args.length > 0 ? args[0] : null);
        Object handler = args.length > 1 ? args[1] : null;
        if ("request".equals(name)) {
            if (rt.isFunction(handler)) listener.onRequestHandler(handler);
            else listener.onLog("on(request) 非函数参数");
        } else if (!"updateAlert".equals(name)) {
            listener.onLog("on(" + name + ") 不支持");
        }
        return null;
    }

    private Object send(Object[] args) {
        String name = str(args.length > 0 ? args[0] : null);
        Object data = args.length > 1 ? args[1] : null;
        try {
            String json = data == null ? "" : rt.stringify(data);
            if ("inited".equals(name)) listener.onInited(json);
            else listener.onLog("send(" + name + ") " + abbreviate(json));
        } catch (Throwable t) {
            listener.onLog("send(" + name + ") 解析失败: " + t);
        }
        return null;
    }

    private Object request(Object[] args) {
        Object cb = args.length > 2 ? args[2] : (args.length > 1 && rt.isFunction(args[1]) ? args[1] : null);
        String url = str(args.length > 0 ? args[0] : null);
        if (cb == null) {
            listener.onLog("request 缺少回调 url=" + url);
            return null;
        }
        Object options = args.length > 1 && !rt.isFunction(args[1]) ? args[1] : null;
        String optJson = "{}";
        if (options != null) {
            try {
                optJson = rt.stringify(options);
            } catch (Throwable t) {
                optJson = "{}";
            }
        }
        try {
            String respJson = LxHttp.request(url, optJson);
            Object resp = rt.parseJson(respJson);
            Object body = rt.getProperty(resp, "body");
            rt.callFunction(cb, new Object[]{null, resp, body});
        } catch (Throwable t) {
            String msg = t.getMessage() == null ? String.valueOf(t) : t.getMessage();
            listener.onLog("request FAIL " + abbreviate(url) + " : " + msg);
            try {
                JSONObject err = new JSONObject();
                err.put("message", msg);
                rt.callFunction(cb, new Object[]{rt.parseJson(err.toString()), null, null});
            } catch (Throwable t2) {
                listener.onLog("request err-callback 失败: " + t2);
            }
        }
        return null;
    }

    private Object utils() throws Exception {
        Object utils = rt.newObject();

        Object buffer = rt.newObject();
        rt.setProperty(buffer, "from", (JsRuntime.HostFn) args -> {
            Object d = args.length > 0 ? args[0] : null;
            String enc = str(args.length > 1 ? args[1] : null, "utf-8").toLowerCase();
            if (d instanceof byte[]) return d;
            byte[] out;
            if (d instanceof Object[]) {
                Object[] arr = (Object[]) d;
                out = new byte[arr.length];
                for (int i = 0; i < arr.length; i++) out[i] = arr[i] instanceof Number ? ((Number) arr[i]).byteValue() : 0;
            } else {
                String s = str(d);
                switch (enc) {
                    case "base64":
                        out = LxHttp.unb64(s);
                        break;
                    case "hex":
                        out = hexDecode(s);
                        break;
                    case "binary":
                    case "latin1":
                        out = new byte[s.length()];
                        for (int i = 0; i < s.length(); i++) out[i] = (byte) s.charAt(i);
                        break;
                    default:
                        out = s.getBytes("UTF-8");
                }
            }
            return out;
        });
        rt.setProperty(buffer, "bufToString", (JsRuntime.HostFn) args -> {
            byte[] b = rt.toBytes(args.length > 0 ? args[0] : null);
            String enc = str(args.length > 1 ? args[1] : null, "utf-8").toLowerCase();
            if (b == null) return "";
            switch (enc) {
                case "base64":
                    return LxHttp.b64(b);
                case "hex": {
                    StringBuilder sb = new StringBuilder();
                    for (byte x : b) sb.append(String.format("%02x", x));
                    return sb.toString();
                }
                case "binary":
                case "latin1": {
                    StringBuilder sb = new StringBuilder();
                    for (byte x : b) sb.append((char) (x & 0xFF));
                    return sb.toString();
                }
                default:
                    return new String(b, "UTF-8");
            }
        });
        rt.setProperty(utils, "buffer", buffer);

        Object crypto = rt.newObject();
        rt.setProperty(crypto, "md5", (JsRuntime.HostFn) args -> LxCrypto.md5(str(args.length > 0 ? args[0] : null)));
        rt.setProperty(crypto, "aesEncrypt", (JsRuntime.HostFn) args -> LxCrypto.aes(rt, args, true));
        rt.setProperty(crypto, "aesDecrypt", (JsRuntime.HostFn) args -> LxCrypto.aes(rt, args, false));
        rt.setProperty(crypto, "rsaEncrypt", (JsRuntime.HostFn) args -> LxCrypto.rsa(args));
        rt.setProperty(crypto, "randomBytes", (JsRuntime.HostFn) args -> {
            int n = 16;
            Object v = args.length > 0 ? args[0] : null;
            if (v instanceof Number) n = ((Number) v).intValue();
            return LxCrypto.randomBytes(n);
        });
        rt.setProperty(utils, "crypto", crypto);

        Object zlib = rt.newObject();
        rt.setProperty(zlib, "inflate", (JsRuntime.HostFn) args -> LxCrypto.inflate(rt.toBytes(args.length > 0 ? args[0] : null)));
        rt.setProperty(zlib, "deflate", (JsRuntime.HostFn) args -> LxCrypto.deflate(rt.toBytes(args.length > 0 ? args[0] : null)));
        rt.setProperty(utils, "zlib", zlib);
        return utils;
    }

    private Object console() throws Exception {
        Object console = rt.newObject();
        JsRuntime.HostFn log = args -> {
            StringBuilder sb = new StringBuilder();
            for (Object a : args) {
                if (sb.length() > 0) sb.append(' ');
                if (a == null) sb.append("null");
                else if (a instanceof String) sb.append(a);
                else {
                    try {
                        sb.append(rt.stringify(a));
                    } catch (Throwable t) {
                        sb.append(String.valueOf(a));
                    }
                }
            }
            listener.onLog("console: " + sb);
            return null;
        };
        rt.setProperty(console, "log", log);
        rt.setProperty(console, "info", log);
        rt.setProperty(console, "warn", log);
        rt.setProperty(console, "error", log);
        rt.setProperty(console, "debug", log);
        return console;
    }

    private Object setTimeout(Object[] args, boolean repeat) {
        Object fn = args.length > 0 ? args[0] : null;
        long delay = args.length > 1 && args[1] instanceof Number ? ((Number) args[1]).longValue() : 0;
        if (delay < 0) delay = 0;
        long id = timerId.incrementAndGet();
        if (rt.isFunction(fn)) {
            if (repeat) {
                timers.put(id, timer.scheduleAtFixedRate(() -> {
                    try {
                        rt.callFunction(fn, new Object[0]);
                    } catch (Throwable t) {
                        listener.onLog("timer FAIL: " + t);
                    }
                }, delay, Math.max(delay, 1), java.util.concurrent.TimeUnit.MILLISECONDS));
            } else {
                timers.put(id, timer.schedule(() -> {
                    clear(id);
                    try {
                        rt.callFunction(fn, new Object[0]);
                    } catch (Throwable t) {
                        listener.onLog("timer FAIL: " + t);
                    }
                }, delay, java.util.concurrent.TimeUnit.MILLISECONDS));
            }
        }
        return (double) id;
    }

    private void clear(Object[] args) {
        Object v = args.length > 0 ? args[0] : null;
        if (v instanceof Number) clear(((Number) v).longValue());
    }

    private void clear(long id) {
        java.util.concurrent.ScheduledFuture<?> f = timers.remove(id);
        if (f != null) f.cancel(false);
    }

    public void close() {
        for (Long id : timers.keySet().toArray(new Long[0])) clear(id);
        timers.clear();
    }

    private static String str(Object v) {
        return str(v, null);
    }

    private static String str(Object v, String def) {
        if (v == null) return def == null ? "" : def;
        if (v instanceof String) return (String) v;
        String s = String.valueOf(v);
        return s.isEmpty() && def != null ? def : s;
    }

    private static String abbreviate(String s) {
        if (s == null) return "";
        return s.length() > 200 ? s.substring(0, 200) + "..." : s;
    }

    private static byte[] hexDecode(String s) {
        int n = s.length() / 2;
        byte[] out = new byte[n];
        for (int i = 0; i < n; i++) {
            out[i] = (byte) Integer.parseInt(s.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }
}
