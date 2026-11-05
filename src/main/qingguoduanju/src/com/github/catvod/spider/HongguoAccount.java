// SPDX-License-Identifier: GPL-3.0-only
// 红果云端账号能力：官网 Web 通道登录（二维码 + 手机验证码）+ 云端观看历史。
// 蓝本：case/hongguoTV-tsukiyo kotlin-tv/core（WebLogin.kt / CloudAccount.kt / AccountController.kt
// 的 validateAccount 设备绑定逻辑），协议要点另见 docs/红果短剧技术文档.md。
//
// 职责边界：本类只属于 qingguoduanju Spider jar（接口处），壳子通过 Qingguoduanju.action 的
// cloud.* 协议调用，壳子侧不含任何红果实现。
//
// cloud.* 协议（入参/出参均为 JSON）：
//   {"do":"cloud.info"}                          → {"code":0,"name":"红果短剧","login":bool,"nickname":str}
//   {"do":"cloud.qr.create"}                     → {"code":0,"image":base64,"expire":秒}
//   {"do":"cloud.qr.poll"}                       → {"code":0,"ok":bool}（ok=true 即已登录落盘）
//   {"do":"cloud.sms.send","mobile":"138..."}    → {"code":0,"masked":"+86 138****0000","retry":60}
//   {"do":"cloud.sms.verify","code":"123456"}    → {"code":0}
//   {"do":"cloud.logout"}                        → {"code":0}
//   {"do":"cloud.cancel"}                        → {"code":0}（取消本次登录会话）
//   {"do":"cloud.history"}                       → {"code":0,"list":[{seriesId,title,cover,description,
//                                                   badge,episodeIndex,position,duration,updatedAt,episodeCount}]}
//   任意失败                                      → {"code":-1,"msg":用户可读原因}
package com.github.catvod.spider;

import android.content.Context;
import android.util.Base64;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

final class HongguoAccount {

    private static final String TAG_MSG = "hongguo-account";
    /** 官网 Web 登录通道（二维码/短信均在此域，无需 App 端签名，蓝本 WebLogin.kt）。 */
    private static final String WEB_BASE = "https://hongguoduanju.com";
    private static final String WEB_UA =
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) "
                    + "Chrome/141.0.0.0 Safari/537.36";
    /** 账号数据域（读进度/资料），需签名 + Cookie，蓝本 CloudAccount.kt。 */
    private static final String ACCOUNT_BASE = "https://api5-normal-sinfonlinea.fqnovel.com";
    private static final String ACCOUNT_UA =
            "com.phoenix.read/72232 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3)";
    /** 凭据落盘文件（外置 files，与设备身份 qingguoduanju_device.json 同口径）。 */
    private static final String ACCOUNT_STORE = "qingguoduanju_account.json";

    private HongguoAccount() {
    }

    // ============================ action 协议入口 ============================

    static String handle(Context ctx, String json) {
        JSONObject req;
        try {
            req = new JSONObject(json == null ? "{}" : json);
        } catch (Exception e) {
            return err("参数格式错误").toString();
        }
        String op = req.optString("do", "");
        try {
            if ("cloud.info".equals(op)) {
                JSONObject creds = load(ctx);
                JSONObject out = ok();
                out.put("name", "红果短剧");
                out.put("login", creds != null && !creds.optString("cookie", "").isEmpty());
                out.put("nickname", creds == null ? "" : creds.optString("nickname", ""));
                return out.toString();
            }
            if ("cloud.qr.create".equals(op)) {
                WebLogin w = new WebLogin();
                loginSession = w;
                WebLogin.Qr qr = w.qr();
                JSONObject out = ok();
                out.put("image", Base64.encodeToString(qr.image, Base64.NO_WRAP));
                out.put("expire", qr.expiresIn);
                return out.toString();
            }
            if ("cloud.qr.poll".equals(op)) {
                WebLogin w = loginSession;
                if (w == null) throw new RuntimeException("请先获取二维码");
                boolean done = w.poll();
                JSONObject out = ok();
                if (done) {
                    finalizeLogin(ctx, w.credentials());
                    loginSession = null;
                    out.put("ok", true);
                } else {
                    out.put("ok", false);
                }
                return out.toString();
            }
            if ("cloud.sms.send".equals(op)) {
                String mobile = req.optString("mobile", "").trim();
                if (mobile.isEmpty()) throw new RuntimeException("请输入手机号");
                WebLogin.Sent s = session().send(mobile);
                JSONObject out = ok();
                out.put("masked", s.maskedMobile);
                out.put("retry", s.retrySeconds);
                return out.toString();
            }
            if ("cloud.sms.verify".equals(op)) {
                String code = req.optString("code", "").trim();
                if (code.isEmpty()) throw new RuntimeException("请输入验证码");
                String cookie = session().verify(code);
                finalizeLogin(ctx, cookie);
                loginSession = null;
                return ok().toString();
            }
            if ("cloud.logout".equals(op)) {
                loginSession = null;
                File f = accountFile(ctx);
                if (f != null && f.exists()) f.delete();
                return ok().toString();
            }
            if ("cloud.cancel".equals(op)) {
                loginSession = null;
                return ok().toString();
            }
            if ("cloud.history".equals(op)) {
                JSONObject out = ok();
                out.put("list", history(ctx));
                return out.toString();
            }
            return err("未知操作: " + op).toString();
        } catch (Throwable t) {
            String msg = t.getMessage() == null || t.getMessage().isEmpty()
                    ? t.getClass().getSimpleName() : t.getMessage();
            fileLog(ctx, op + " fail: " + msg);
            return err(msg).toString();
        }
    }

    private static JSONObject ok() {
        try {
            return new JSONObject().put("code", 0);
        } catch (Exception e) {
            return new JSONObject();
        }
    }

    private static JSONObject err(String msg) {
        try {
            return new JSONObject().put("code", -1).put("msg", msg);
        } catch (Exception e) {
            return new JSONObject();
        }
    }

    /** 当前登录会话（二维码/短信共用同一 Web 会话，短信发码依赖会话里的 csrf cookie）。 */
    private static volatile WebLogin loginSession;

    private static WebLogin session() {
        WebLogin w = loginSession;
        if (w == null) {
            w = new WebLogin();
            loginSession = w;
        }
        return w;
    }

    /** 登录收尾：绑定注册设备 → 校验红果账号资料 → 凭据落盘（蓝本 AccountController.validateAccount）。 */
    private static void finalizeLogin(Context ctx, String cookie) {
        String[] dev = Qingguoduanju.appDevice(false);
        JSONObject info = accountGet(ctx, "/reading/user/info/v1/", new LinkedHashMap<String, String>(),
                cookie, dev);
        JSONObject data = info.optJSONObject("data");
        String bizUserId = data == null ? "" : str(data, "biz_user_id");
        if (bizUserId.isEmpty()) {
            throw new RuntimeException("该手机号还没有红果账号资料，请先用官方红果App登录一次再回来试（或改用扫码）");
        }
        String nickname = data == null ? "" : str(data, "user_name");
        if (nickname.isEmpty()) nickname = "红果用户";
        save(ctx, cookie, dev[0], dev[1], nickname);
    }

    // ============================ 凭据存取 ============================

    private static File accountFile(Context ctx) {
        try {
            if (ctx == null) return null;
            File dir = ctx.getExternalFilesDir(null);
            if (dir == null) return null;
            return new File(dir, ACCOUNT_STORE);
        } catch (Throwable t) {
            return null;
        }
    }

    private static JSONObject load(Context ctx) {
        File f = accountFile(ctx);
        if (f == null || !f.exists()) return null;
        try {
            FileInputStream fin = new FileInputStream(f);
            ByteArrayOutputStream bout = new ByteArrayOutputStream();
            byte[] buf = new byte[4096];
            int n;
            while ((n = fin.read(buf)) > 0) bout.write(buf, 0, n);
            fin.close();
            String text = new String(bout.toByteArray(), StandardCharsets.UTF_8);
            if (text.isEmpty()) return null;
            JSONObject json = new JSONObject(text);
            if (json.optString("cookie", "").isEmpty()) return null;
            return json;
        } catch (Throwable t) {
            return null;
        }
    }

    private static void save(Context ctx, String cookie, String deviceId, String installId, String nickname) {
        File f = accountFile(ctx);
        if (f == null) throw new RuntimeException("凭据存储不可用");
        try {
            JSONObject json = new JSONObject()
                    .put("cookie", cookie)
                    .put("device_id", deviceId)
                    .put("install_id", installId)
                    .put("nickname", nickname);
            FileOutputStream fout = new FileOutputStream(f);
            fout.write(json.toString().getBytes(StandardCharsets.UTF_8));
            fout.close();
        } catch (RuntimeException e) {
            throw e;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    // ============================ 官网 Web 登录（蓝本 WebLogin.kt） ============================

    /** 一次官网登录会话：csrf cookie 在发码/验码/轮询间保持；一个实例对应一次登录。 */
    private static final class WebLogin {

        /** 会话 cookie（单域 hongguoduanju.com，按下发顺序覆盖同名）。 */
        private final LinkedHashMap<String, String> cookies = new LinkedHashMap<>();
        private String token = "";
        private String mobile = "";
        private boolean sent = false;

        static final class Qr {
            byte[] image;
            int expiresIn;
        }

        static final class Sent {
            String maskedMobile = "";
            int retrySeconds = 60;
        }

        /** 获取登录二维码（官网 /passport/web/get_qrcode/）。 */
        synchronized Qr qr() throws Exception {
            LinkedHashMap<String, String> params = new LinkedHashMap<>();
            params.put("next", WEB_BASE + "/");
            JSONObject data = checked(call("/passport/web/get_qrcode/", null, params));
            token = data.optString("token", "");
            String encoded = data.optString("qrcode", "");
            int at = encoded.indexOf("base64,");
            if (at >= 0) encoded = encoded.substring(at + "base64,".length());
            long expiry = data.optLong("expire_time", 180);
            int seconds;
            if (expiry > 1_000_000_000L) {
                long left = expiry - System.currentTimeMillis() / 1000;
                seconds = (int) Math.max(0, Math.min(600, left));
            } else {
                seconds = (int) Math.max(0, Math.min(600, expiry));
            }
            Qr qr = new Qr();
            qr.image = Base64.decode(encoded, Base64.DEFAULT);
            qr.expiresIn = seconds;
            return qr;
        }

        /** 轮询扫码状态；false=等待扫码/确认；true=已确认且拿到登录态。 */
        synchronized boolean poll() throws Exception {
            if (token.trim().isEmpty()) throw new RuntimeException("请先获取二维码");
            LinkedHashMap<String, String> params = new LinkedHashMap<>();
            params.put("next", WEB_BASE + "/");
            params.put("token", token);
            JSONObject data = checked(call("/passport/web/check_qrconnect/", null, params));
            String status = data.optString("status", "");
            if ("5".equals(status) || "expired".equals(status)) {
                throw new RuntimeException("二维码已过期，请重新获取");
            }
            if ("3".equals(status) || "confirmed".equals(status)) {
                String redirect = data.optString("redirect_url", "");
                if (!redirect.isEmpty()) finishRedirect(redirect);
            }
            return hasSession();
        }

        /** 发送短信验证码（官网 /passport/web/send_code/，表单混淆 mix_mode=1）。 */
        synchronized Sent send(String number) throws Exception {
            if (!cookies.containsKey("passport_csrf_token")) qr(); // 先取 csrf cookie
            mobile = number.startsWith("+") ? number : "+86 " + number;
            LinkedHashMap<String, String> form = new LinkedHashMap<>();
            form.put("mobile", mix(mobile));
            form.put("type", mix("24"));
            form.put("mix_mode", "1");
            form.put("fixed_mix_mode", "1");
            JSONObject data = checked(call("/passport/web/send_code/", form, null));
            sent = true;
            Sent out = new Sent();
            out.maskedMobile = data.optString("mobile", "").isEmpty() ? "你的手机" : data.optString("mobile");
            out.retrySeconds = data.optInt("retry_time", 60);
            return out;
        }

        /** 验码登录（官网 /passport/web/sms_login/），成功返回可用的 Cookie 串。 */
        synchronized String verify(String code) throws Exception {
            if (!sent) throw new RuntimeException("请先发送验证码");
            LinkedHashMap<String, String> form = new LinkedHashMap<>();
            form.put("mobile", mix(mobile));
            form.put("code", mix(code));
            form.put("login_only", "true");
            form.put("mix_mode", "1");
            form.put("fixed_mix_mode", "1");
            checked(call("/passport/web/sms_login/", form, null));
            return credentials();
        }

        /** 登录态 Cookie 串（仅 hongguoduanju.com 域内、未过期的 cookie）。 */
        synchronized String credentials() throws Exception {
            if (!hasSession()) throw new RuntimeException("官网尚未下发登录态，请先在手机确认登录");
            checked(call("/passport/account/info/v2/", null, null));
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> e : cookies.entrySet()) {
                if (sb.length() > 0) sb.append("; ");
                sb.append(e.getKey()).append('=').append(e.getValue());
            }
            return sb.toString();
        }

        private boolean hasSession() {
            return cookies.containsKey("sessionid") || cookies.containsKey("sessionid_ss");
        }

        /** 官网确认后的 redirect 收尾（最多 5 跳，域名校验，蓝本 finishRedirect）。 */
        private void finishRedirect(String value) throws Exception {
            URL url = new URL(resolveUrl(WEB_BASE, value));
            for (int hop = 0; hop < 5; hop++) {
                if (!"https".equals(url.getProtocol()) || !"hongguoduanju.com".equals(url.getHost())) {
                    throw new RuntimeException("登录确认跳转到不支持的站点");
                }
                HttpURLConnection conn = open(url, "GET", null);
                int code = conn.getResponseCode();
                String location = conn.getHeaderField("Location");
                consume(conn);
                if (code >= 300 && code < 400 && location != null && !location.isEmpty()) {
                    url = new URL(resolveUrl(WEB_BASE, location));
                    continue;
                }
                if (code >= 400) throw new RuntimeException("登录确认失败（HTTP " + code + "）");
                return;
            }
            throw new RuntimeException("登录确认跳转次数过多");
        }

        private static String resolveUrl(String base, String value) {
            if (value.startsWith("http://") || value.startsWith("https://")) return value;
            return base + (value.startsWith("/") ? value : "/" + value);
        }

        /** 官网 passport 请求：公共参数 + CSRF + 可选表单；非 2xx 也读 body（passport 用 JSON 报错）。 */
        private JSONObject call(String path, LinkedHashMap<String, String> form,
                                LinkedHashMap<String, String> params) throws Exception {
            StringBuilder url = new StringBuilder(WEB_BASE).append(path);
            url.append("?aid=513755&passport_jssdk_version=3.4.10&passport_jssdk_type=normal")
                    .append("&account_sdk_source=web&is_from_ttaccountsdk=1&language=zh");
            if (params != null) {
                for (Map.Entry<String, String> e : params.entrySet()) {
                    url.append('&').append(urlEncode(e.getKey())).append('=').append(urlEncode(e.getValue()));
                }
            }
            String method = form == null ? "GET" : "POST";
            HttpURLConnection conn = open(new URL(url.toString()), method, WEB_UA);
            conn.setInstanceFollowRedirects(false);
            conn.setRequestProperty("Referer", WEB_BASE + "/");
            conn.setRequestProperty("Origin", WEB_BASE);
            conn.setRequestProperty("Accept", "application/json, text/javascript");
            String csrf = cookies.get("passport_csrf_token");
            if (csrf != null) conn.setRequestProperty("x-tt-passport-csrf-token", csrf);
            if (form != null) {
                StringBuilder body = new StringBuilder();
                for (Map.Entry<String, String> e : form.entrySet()) {
                    if (body.length() > 0) body.append('&');
                    body.append(urlEncode(e.getKey())).append('=').append(urlEncode(e.getValue()));
                }
                conn.setDoOutput(true);
                conn.getOutputStream().write(body.toString().getBytes(StandardCharsets.UTF_8));
            }
            storeCookies(conn);
            String text = consume(conn);
            try {
                return new JSONObject(text);
            } catch (Exception e) {
                throw new RuntimeException("官网登录返回格式异常");
            }
        }

        /** checked（蓝本 WebLogin.checked）：data 缺失或 message!=success 时抛用户可读异常。 */
        private static JSONObject checked(JSONObject reply) {
            JSONObject data = reply.optJSONObject("data");
            if (data == null) throw new RuntimeException("官网登录返回格式异常");
            if (!"success".equals(reply.optString("message"))) {
                int code = data.optInt("error_code", -1);
                String message;
                if (data.has("verify_center_decision_conf")) {
                    message = "红果要求完成滑块验证，请改用扫码登录";
                } else {
                    String desc = data.optString("description", "").trim();
                    message = desc.isEmpty() ? "官网登录失败" : desc;
                }
                throw new RuntimeException(message + "（错误码 " + code + "）");
            }
            return data;
        }

        /** 表单混淆（蓝本 mix）：每字节 xor 5 转十六进制，无补零。 */
        private static String mix(String value) {
            byte[] bytes = value.getBytes(StandardCharsets.UTF_8);
            StringBuilder sb = new StringBuilder();
            for (byte b : bytes) sb.append(Integer.toString((b & 255) ^ 5, 16));
            return sb.toString();
        }

        private static String urlEncode(String v) {
            return java.net.URLEncoder.encode(v, StandardCharsets.UTF_8);
        }

        private static HttpURLConnection open(URL url, String method, String ua) throws Exception {
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setRequestMethod(method);
            if (ua != null) conn.setRequestProperty("User-Agent", ua);
            conn.setRequestProperty("Accept-Language", "zh-CN,zh;q=0.9");
            conn.setInstanceFollowRedirects(false);
            return conn;
        }

        /** 解析 Set-Cookie 进会话存储（同名覆盖；仅保留 name=value 主部）。 */
        private void storeCookies(HttpURLConnection conn) {
            try {
                Map<String, List<String>> fields = conn.getHeaderFields();
                for (Map.Entry<String, List<String>> e : fields.entrySet()) {
                    String key = e.getKey();
                    if (key == null || !"set-cookie".equalsIgnoreCase(key)) continue;
                    for (String line : e.getValue()) {
                        String pair = line.contains(";") ? line.substring(0, line.indexOf(';')) : line;
                        int eq = pair.indexOf('=');
                        if (eq <= 0) continue;
                        String name = pair.substring(0, eq).trim();
                        String value = pair.substring(eq + 1).trim();
                        if (!name.isEmpty() && !value.isEmpty()) {
                            cookies.remove(name);
                            cookies.put(name, value);
                        }
                    }
                }
            } catch (Throwable ignore) {
            }
        }

        private static String consume(HttpURLConnection conn) throws Exception {
            try {
                int code = conn.getResponseCode();
                InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                byte[] buf = new byte[8192];
                if (in != null) {
                    int n;
                    while ((n = in.read(buf)) > 0) {
                        out.write(buf, 0, n);
                        if (out.size() > 2 * 1024 * 1024) break;
                    }
                    in.close();
                }
                String text = new String(out.toByteArray(), StandardCharsets.UTF_8);
                if (code >= 400 && text.isEmpty()) {
                    throw new RuntimeException("账号请求失败（HTTP " + code + "）");
                }
                return text;
            } finally {
                conn.disconnect();
            }
        }
    }

    // ============================ 云端观看历史（蓝本 CloudAccount.kt history） ============================

    /**
     * 云端观看历史：读进度列表（book_types=2）+ multi-detail 批量补标题/封面。
     * 与蓝本一致：按 seriesId 去重、按最近观看倒序。
     */
    private static JSONArray history(Context ctx) {
        JSONObject creds = load(ctx);
        if (creds == null) throw new RuntimeException("未登录红果账号");
        String cookie = creds.optString("cookie", "");
        String[] dev = Qingguoduanju.appDevice(false);

        LinkedHashMap<String, String> listValues = new LinkedHashMap<>();
        listValues.put("book_types", "2");
        listValues.put("limit", "50");
        JSONObject resp = accountGet(ctx, "/reading/bookapi/read_progress/list/v1/", listValues, cookie, dev);
        JSONArray rows = resp.optJSONArray("video_data");
        if (rows == null) {
            JSONObject data = resp.optJSONObject("data");
            if (data != null) rows = data.optJSONArray("video_data");
        }
        if (rows == null) throw new RuntimeException("云端历史数据格式已变化");

        List<JSONObject> entries = new ArrayList<>();
        List<String> seen = new ArrayList<>();
        for (int i = 0; i < rows.length(); i++) {
            JSONObject row = rows.optJSONObject(i);
            if (row == null) continue;
            String id = str(row, "series_id");
            if (id.isEmpty()) id = str(row, "book_id");
            String episode = str(row, "vid");
            if (!id.matches("[0-9]{1,30}") || !episode.matches("[0-9]{1,30}")) continue;
            long stamp = row.optLong("last_watch_time", 0);
            if (stamp > 0 && stamp < 10_000_000_000L) stamp *= 1000; // 秒 → 毫秒自适应
            JSONObject entry = new JSONObject();
            try {
                entry.put("seriesId", id);
                entry.put("episodeId", episode);
                entry.put("episodeIndex", Math.max(0, row.optInt("vid_index", 1) - 1));
                entry.put("position", Math.max(0, row.optLong("current_play_time", 0)));
                entry.put("duration", Math.max(0, row.optLong("current_total_time", 0)));
                entry.put("updatedAt", stamp);
                entry.put("episodeCount", Math.max(0, row.optInt("episode_count", 0)));
            } catch (Exception ignore) {
                continue;
            }
            if (seen.contains(id)) {
                // 同剧去重：保留最近观看的一条
                for (int k = 0; k < entries.size(); k++) {
                    if (entries.get(k).optString("seriesId", "").equals(id)) {
                        if (entries.get(k).optLong("updatedAt", 0) < stamp) entries.set(k, entry);
                        break;
                    }
                }
            } else {
                seen.add(id);
                entries.add(entry);
            }
        }
        if (entries.isEmpty()) return new JSONArray();
        Collections.sort(entries, new Comparator<JSONObject>() {
            @Override
            public int compare(JSONObject a, JSONObject b) {
                return Long.compare(b.optLong("updatedAt", 0), a.optLong("updatedAt", 0));
            }
        });

        // multi-detail 批量补标题/封面/简介/角标
        StringBuilder ids = new StringBuilder();
        for (JSONObject e : entries) {
            if (ids.length() > 0) ids.append(',');
            ids.append(e.optString("seriesId", ""));
        }
        LinkedHashMap<String, String> detailValues = new LinkedHashMap<>();
        detailValues.put("book_id", ids.toString());
        detailValues.put("book_type", "2");
        JSONObject detail = accountGet(ctx, "/reading/bookapi/multi-detail/v1/", detailValues, cookie, dev);
        JSONArray detailRows = detail.optJSONArray("data");
        List<JSONObject> out = new ArrayList<>();
        for (JSONObject e : entries) {
            String id = e.optString("seriesId", "");
            JSONObject meta = null;
            for (int i = 0; detailRows != null && i < detailRows.length(); i++) {
                JSONObject row = detailRows.optJSONObject(i);
                if (row != null && id.equals(str(row, "book_id"))) {
                    meta = row;
                    break;
                }
            }
            try {
                if (meta != null) {
                    e.put("title", str(meta, "book_name"));
                    e.put("cover", cleanUrl(meta.optString("thumb_url", "")));
                    e.put("description", str(meta, "abstract"));
                    e.put("badge", episodeBadge(meta));
                } else {
                    e.put("title", "剧集 " + id);
                    e.put("cover", "");
                    e.put("description", "");
                    e.put("badge", "");
                }
            } catch (Exception ignore) {
            }
            out.add(e);
        }
        JSONArray arr = new JSONArray();
        for (JSONObject e : out) arr.put(e);
        return arr;
    }

    private static String episodeBadge(JSONObject row) {
        int count = 0;
        for (String key : new String[]{"episode_cnt", "episode_count", "drama_chapter_number"}) {
            int v = row.optInt(key, 0);
            if (v > 0) {
                count = v;
                break;
            }
        }
        return count > 0 ? "全 " + count + " 集" : "";
    }

    /**
     * 账号域签名 GET（仿 Qingguoduanju.appSearchRequest）：设备表组参 → branch0 抖动 →
     * 全套签名头 + Cookie；响应 code!=0 抛用户可读异常。
     */
    private static JSONObject accountGet(Context ctx, String path, LinkedHashMap<String, String> values,
                                         String cookie, String[] dev) {
        long now = System.currentTimeMillis();
        int ts = (int) (now / 1000);
        long ticket = now;
        String query = null;
        for (int offset = 0; offset <= 127; offset++) {
            ticket = now + offset;
            LinkedHashMap<String, String> vals = new LinkedHashMap<>(Qingguoduanju.appDeviceParams(dev[1], dev[0]));
            vals.putAll(values);
            vals.put("ts", String.valueOf(ts));
            vals.put("_rticket", String.valueOf(ticket));
            String q = Qingguoduanju.pythonUrlEncode(vals);
            if (Qingguoduanju.branchOf(q, ts) == 0) {
                query = q;
                break;
            }
        }
        if (query == null) throw new RuntimeException("签名分支抖动失败（128 次）");
        String url = ACCOUNT_BASE + path + "?" + query;
        int random = (int) (Math.random() * 65536);
        LinkedHashMap<String, String> headers = new LinkedHashMap<>();
        headers.put("User-Agent", ACCOUNT_UA);
        headers.put("Accept", "application/json; charset=utf-8,application/x-protobuf");
        headers.put("x-ss-req-ticket", String.valueOf(ticket));
        headers.put("x-tt-request-tag", "t=0;n=0");
        headers.put("sdk-version", "2");
        headers.put("passport-sdk-version", "50561");
        headers.put("x-xs-from-web", "0");
        headers.put("x-khronos", String.valueOf(ts));
        headers.put("x-ladon", Base64.encodeToString(Qingguoduanju.be32(ts), Base64.NO_WRAP));
        headers.put("x-argus", Base64.encodeToString(Qingguoduanju.le32(ts), Base64.NO_WRAP));
        headers.put("x-gorgon", Qingguoduanju.xGorgon(query, null, ts, random));
        headers.put("x-helios", Qingguoduanju.helios(ts));
        headers.put("x-medusa", Qingguoduanju.buildMedusa(url, null, ts, dev[0]));
        headers.put("x-tt-dt", "");
        if (cookie != null && !cookie.isEmpty()) headers.put("Cookie", cookie);
        String resp = Qingguoduanju.text(url, "GET", null, headers).trim();
        if (resp.isEmpty()) throw new RuntimeException("账号接口空响应，请重新登录或稍后重试");
        JSONObject json;
        try {
            json = new JSONObject(resp);
        } catch (Exception e) {
            throw new RuntimeException("账号接口返回非 JSON: " + resp.substring(0, Math.min(120, resp.length())));
        }
        int code = json.optInt("code", -1);
        if (code != 0) {
            throw new RuntimeException("账号接口不可用（错误码 " + code + "），请重新登录或稍后重试");
        }
        return json;
    }

    private static String str(JSONObject json, String key) {
        return json.isNull(key) ? "" : json.optString(key, "").trim();
    }

    private static String cleanUrl(String s) {
        return s.replace("\\/", "/")
                .replace("\\u002F", "/")
                .replace("\\u0026", "&")
                .replace("&amp;", "&");
    }

    private static void fileLog(Context ctx, String msg) {
        Qingguoduanju.fileLog(TAG_MSG + " " + msg);
    }
}
