// SPDX-License-Identifier: GPL-3.0-only
// 红果云端账号能力：官网 Web 通道登录（二维码 + 手机验证码）+ 云端观看历史。
// 蓝本：case/hongguoTV-tsukiyo kotlin-tv/core（WebLogin.kt / CloudAccount.kt / AccountController.kt
// 的 validateAccount 设备绑定逻辑），协议要点另见 docs/红果短剧技术文档.md。
//
// 职责边界：本类只属于 qingguoduanju Spider jar（接口处），壳子通过 Qingguoduanju.action 的
// cloud.* 协议调用，壳子侧不含任何红果实现。
//
// cloud.* 协议（入参/出参均为 JSON）：
//   {"do":"cloud.info"}                          → {"code":0,"name":"🍎短剧","login":bool,"nickname":str}
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
    /** 官网 Web 登录通道（二维码在此域，无需 App 端签名，蓝本 WebLogin.kt）。 */
    private static final String WEB_BASE = "https://hongguoduanju.com";
    private static final String WEB_UA =
            "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) "
                    + "Chrome/141.0.0.0 Safari/537.36";
    /**
     * 手机短信登录通道（官方 App 口径，蓝本 PhoneLogin.kt）：官网 Web 通道发验证码会被风控
     * 要求滑块验证（verify_center_decision_conf，电视端无法完成），官方 App 通道触发概率低。
     * 域名必须是 security.snssdk.com——is.snssdk.com 上短信登录会被风控回 2046（蓝本实测）。
     */
    private static final String PASSPORT_BASE = "https://security.snssdk.com";
    private static final String PASSPORT_APP_UA =
            "com.phoenix.read/72232 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3)";
    private static final String PASSPORT_VIDEO_UA =
            "com.phoenix.read/71332 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3; "
                    + "Cronet/TTNetVersion:04657795 2026-01-23 QuicVersion:c67e9834 2025-09-08)";
    /**
     * 官方 App 固定设备指纹（蓝本 VendorConstants.device）。官方 App 的短信登录不注册新设备：
     * 直接用设备表里的固定 device_id/iid（实测新注册设备 + query 带 device_id 会被判 2046）。
     * PhoneLogin 口径再覆盖版本 7.3.9.32/73932。
     */
    private static final LinkedHashMap<String, String> APP_DEVICE = fixedDevice();

    private static LinkedHashMap<String, String> fixedDevice() {
        LinkedHashMap<String, String> v = new LinkedHashMap<>();
        v.put("iid", "1905892595382586");
        v.put("device_id", "1905892595378490");
        v.put("ac", "wifi");
        v.put("channel", "update_64");
        v.put("aid", "8662");
        v.put("app_name", "novelread");
        v.put("version_code", "71332");
        v.put("version_name", "7.1.3.32");
        v.put("device_platform", "android");
        v.put("os", "android");
        v.put("ssmix", "a");
        v.put("device_type", "25053RT47C");
        v.put("device_brand", "Redmi");
        v.put("language", "zh");
        v.put("os_api", "36");
        v.put("os_version", "16");
        v.put("manifest_version_code", "71332");
        v.put("resolution", "1280*2772");
        v.put("dpi", "520");
        v.put("update_version_code", "71332");
        v.put("host_abi", "arm64-v8a");
        v.put("dragon_device_type", "phone");
        v.put("pv_player", "71332");
        v.put("compliance_status", "0");
        v.put("need_personal_recommend", "1");
        v.put("player_so_load", "1");
        v.put("is_android_pad_screen", "0");
        return v;
    }
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
                out.put("name", "🍎短剧");
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
                AppLogin.Sent s = smsSession().send(mobile);
                JSONObject out = ok();
                out.put("masked", s.maskedMobile);
                out.put("retry", s.retrySeconds);
                return out.toString();
            }
            if ("cloud.sms.verify".equals(op)) {
                String code = req.optString("code", "").trim();
                if (code.isEmpty()) throw new RuntimeException("请输入验证码");
                AppLogin s = smsSession;
                if (s == null) throw new RuntimeException("请先发送验证码");
                String cookie = s.verify(code);
                finalizeLogin(ctx, cookie);
                smsSession = null;
                return ok().toString();
            }
            if ("cloud.logout".equals(op)) {
                loginSession = null;
                smsSession = null;
                File f = accountFile(ctx);
                if (f != null && f.exists()) f.delete();
                return ok().toString();
            }
            if ("cloud.cancel".equals(op)) {
                loginSession = null;
                smsSession = null;
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

    /** 当前登录会话（二维码 Web 会话；短信发码依赖会话里的 csrf cookie 的旧口径已废弃）。 */
    private static volatile WebLogin loginSession;
    /** 当前短信登录会话（App 通道，蓝本 PhoneLogin：一个实例对应一次发码+验码）。 */
    private static volatile AppLogin smsSession;

    private static WebLogin session() {
        WebLogin w = loginSession;
        if (w == null) {
            w = new WebLogin();
            loginSession = w;
        }
        return w;
    }

    private static AppLogin smsSession() {
        AppLogin s = smsSession;
        if (s == null) {
            s = new AppLogin();
            smsSession = s;
        }
        return s;
    }

    /** 登录收尾：绑定注册设备 → 校验红果账号资料 → 凭据落盘（蓝本 AccountController.validateAccount）。 */
    private static void finalizeLogin(Context ctx, String cookie) {
        String[] dev = Qingguoduanju.appDevice(false);
        JSONObject info = accountGet(ctx, "/reading/user/info/v1/", new LinkedHashMap<String, String>(),
                cookie, dev);
        JSONObject data = info.optJSONObject("data");
        String bizUserId = data == null ? "" : str(data, "biz_user_id");
        if (bizUserId.isEmpty()) {
            throw new RuntimeException("该手机号还没有账号资料，请先用官方App登录一次再回来试（或改用扫码）");
        }
        String nickname = data == null ? "" : str(data, "user_name");
        if (nickname.isEmpty()) nickname = "短剧用户";
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
            JSONObject data;
            try {
                data = checked(call("/passport/web/check_qrconnect/", null, params));
            } catch (RuntimeException e) {
                // 错误码 13=token 已被消费/失效：说明确认时序已过，按二维码过期引导重取，避免反复报“会话过期”
                String m = e.getMessage() == null ? "" : e.getMessage();
                if (m.contains("错误码 13")) throw new RuntimeException("二维码已失效，请点击刷新重新获取");
                throw e;
            }
            String status = data.optString("status", "");
            if ("5".equals(status) || "expired".equals(status)) {
                throw new RuntimeException("二维码已过期，请重新获取");
            }
            if ("3".equals(status) || "confirmed".equals(status)) {
                String redirect = data.optString("redirect_url", "");
                if (!redirect.isEmpty()) finishRedirect(redirect);
                if (!hasSession()) throw new RuntimeException("官网尚未下发登录态，请点击刷新重新扫码");
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

        /** 官网确认后的 redirect 收尾（最多 5 跳，域名校验，蓝本 finishRedirect）。
         *  蓝本走 execute()：每跳都带 Cookie 头并解析 Set-Cookie——sessionid 正是在这条链里下发，必须收下。 */
        private void finishRedirect(String value) throws Exception {
            URL url = new URL(resolveUrl(WEB_BASE, value));
            for (int hop = 0; hop < 5; hop++) {
                if (!"https".equals(url.getProtocol()) || !"hongguoduanju.com".equals(url.getHost())) {
                    throw new RuntimeException("登录确认跳转到不支持的站点");
                }
                HttpURLConnection conn = open(url, "GET", WEB_UA);
                conn.setRequestProperty("Referer", WEB_BASE + "/");
                String cookieHeader = cookieHeader();
                if (!cookieHeader.isEmpty()) conn.setRequestProperty("Cookie", cookieHeader);
                int code = conn.getResponseCode();
                storeCookies(conn);
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

        /** 当前会话 Cookie 串（蓝本 execute() 的请求侧 Cookie 头）。 */
        private String cookieHeader() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> e : cookies.entrySet()) {
                if (sb.length() > 0) sb.append("; ");
                sb.append(e.getKey()).append('=').append(e.getValue());
            }
            return sb.toString();
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
            String cookieHeader = cookieHeader();
            if (!cookieHeader.isEmpty()) conn.setRequestProperty("Cookie", cookieHeader);
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
                    message = "平台要求完成滑块验证，请改用扫码登录";
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

    // ============================ App 通道短信登录（蓝本 PhoneLogin.kt） ============================

    /**
     * 手机号 + 验证码登录（官方 App 口径）。官网 Web 通道（/passport/web/send_code/）发码会被
     * 风控要求滑块验证，官方 App 通道（security.snssdk.com + 固定设备指纹 + 全套签名头）触发
     * 概率低。通道规则（蓝本 PhoneLogin.call 实测注释，均照抄）：
     * <ul>
     *   <li>不注册新设备：直接用设备表里的固定 device_id/iid（新注册设备会被判 2046）；</li>
     *   <li>query 不带 device_id/iid（设备靠签名 medusa 里的 deviceProto 识别），带着会被判异常设备；</li>
     *   <li>刻意不回发 Cookie（send_code 下发的 cookie 带到 sms_login 会回 2046）；
     *       Set-Cookie 照常解析保留，仅用于判定 sessionid 是否已下发；</li>
     *   <li>平台在每次验码尝试后下发新 mobile_ticket，后续端点沿用最新值。</li>
     * </ul>
     * 一个实例对应一次登录；重新发码重置会话。
     */
    private static final class AppLogin {

        private final LinkedHashMap<String, String> cookies = new LinkedHashMap<>();
        private String mobile = "";
        private String ticket = "";
        private boolean sent = false;

        static final class Sent {
            String maskedMobile = "";
            int retrySeconds = 60;
        }

        /** 发送短信验证码（官方 App 端点 /passport/mobile/send_code/v1/，GET）。 */
        synchronized Sent send(String number) throws Exception {
            cookies.clear();
            ticket = "";
            sent = false;
            mobile = number.startsWith("+") ? number : number; // 大陆号原样发（蓝本 format 86 口径）
            LinkedHashMap<String, String> passport = new LinkedHashMap<>();
            passport.put("aid", "8662");
            passport.put("app_name", "novelread");
            passport.put("device_platform", "android");
            passport.put("mobile", mobile);
            passport.put("type", "24"); // login-lab 实测：24=登录验证码；1/3 是绑定/换绑
            JSONObject reply = passportCall("/passport/mobile/send_code/v1/", false, passport);
            JSONObject data = reply.optJSONObject("data");
            if (data == null) data = new JSONObject();
            // 风控要求滑块验证：App 通道仍可能下发，电视端无法完成，明确引导用户
            if (data.has("verify_center_decision_conf")) {
                throw new RuntimeException("平台要求先完成滑块验证，请稍后重试或改用扫码登录");
            }
            if (!"success".equals(reply.optString("message"))) {
                String desc = data.optString("description", "").trim();
                throw new RuntimeException(desc.isEmpty() ? "验证码没发出去" : desc);
            }
            ticket = data.optString("mobile_ticket", "");
            sent = true;
            Sent out = new Sent();
            out.maskedMobile = data.optString("mobile", "").isEmpty() ? "你的手机" : data.optString("mobile");
            out.retrySeconds = data.optInt("retry_time", 60);
            return out;
        }

        /** 验码登录：多端点依次尝试（蓝本 VERIFY_ATTEMPTS），成功返回 Cookie 串。 */
        synchronized String verify(String code) throws Exception {
            if (!sent) throw new RuntimeException("请先发送验证码");
            String firstFailure = null;
            // 主端点 sms_login 系列；validate_code 是「已登录校验手机号」入口，对未登录固定回
            // error_code 1 会话过期，仅作最后兜底（蓝本 2026-11-03 实测）
            String[][] attempts = {
                    {"/passport/mobile/sms_login/", "post"},
                    {"/passport/mobile/sms_login_only/", "post"},
                    {"/passport/mobile/sms_login_continue/", "post"},
                    {"/passport/mobile/validate_code/v1/", "get"},
                    {"/passport/mobile/validate_code/v1/", "post"},
            };
            for (String[] attempt : attempts) {
                LinkedHashMap<String, String> passport = new LinkedHashMap<>();
                passport.put("aid", "8662");
                passport.put("app_name", "novelread");
                passport.put("device_platform", "android");
                passport.put("mobile", mobile);
                passport.put("code", code);
                passport.put("type", "24");
                if (!ticket.isEmpty()) passport.put("mobile_ticket", ticket);
                JSONObject reply = passportCall(attempt[0], "post".equals(attempt[1]), passport);
                if (cookies.containsKey("sessionid") || cookies.containsKey("sessionid_ss")) break;
                JSONObject data = reply.optJSONObject("data");
                if (data == null) data = new JSONObject();
                // 平台会在每次尝试后下发新的 mobile_ticket，后续端点沿用最新值
                String fresh = data.optString("mobile_ticket", "");
                if (!fresh.isEmpty()) ticket = fresh;
                int errorCode = data.optInt("error_code", 0);
                if (errorCode == 0 || errorCode == 1) {
                    // 1=会话过期：这条端点不适用于「未登录换验证码」，继续试下一条
                    if (errorCode == 1 && firstFailure == null) {
                        firstFailure = "会话过期，请重新登录（错误码 1）";
                    }
                    continue;
                }
                if (errorCode == 1203) {
                    // 错误次数过多或验证码过期：本次会话作废，继续提交只会更糟
                    sent = false;
                    cookies.clear();
                    ticket = "";
                    String desc = data.optString("description", "").trim();
                    throw new RuntimeException(desc.isEmpty()
                            ? "错误次数过多或验证码过期，请重新获取验证码（错误码 1203）" : desc);
                }
                String desc = data.optString("description", "").trim();
                throw new RuntimeException(desc.isEmpty()
                        ? "验证码校验失败（错误码 " + errorCode + "）" : desc);
            }
            if (!cookies.containsKey("sessionid") && !cookies.containsKey("sessionid_ss")) {
                throw new RuntimeException(firstFailure == null ? "登录没有成功，平台没有下发登录态" : firstFailure);
            }
            return credentials();
        }

        /** 当前会话 Cookie 串（与 WebLogin.credentials() 同格式，供 finalizeLogin 落盘）。 */
        private String credentials() {
            StringBuilder sb = new StringBuilder();
            for (Map.Entry<String, String> e : cookies.entrySet()) {
                if (sb.length() > 0) sb.append("; ");
                sb.append(e.getKey()).append('=').append(e.getValue());
            }
            return sb.toString();
        }

        /**
         * passport 签名请求（蓝本 PhoneLogin.call + Signer.sign）：设备表组参 → branch0 抖动 →
         * 全套签名头。GET 时业务参数进 query；POST 时业务参数编 urlencoded body、query 只有设备表。
         * 刻意不回发 Cookie；Set-Cookie 解析进 {@link #cookies}。
         */
        private JSONObject passportCall(String path, boolean post,
                                        LinkedHashMap<String, String> passport) throws Exception {
            long now = System.currentTimeMillis();
            int ts = (int) (now / 1000);
            // 设备表：固定指纹 + 版本口径覆盖 7.3.9.32/73932（蓝本 PhoneLogin.call device 块）
            LinkedHashMap<String, String> device = new LinkedHashMap<>(APP_DEVICE);
            device.put("version_code", "73932");
            device.put("manifest_version_code", "73932");
            device.put("update_version_code", "73932");
            device.put("pv_player", "73932");
            device.put("version_name", "7.3.9.32");
            String deviceId = APP_DEVICE.get("device_id");
            // query 去掉 device_id/iid（带着会被判异常设备），签名器内部仍使用完整设备表
            LinkedHashMap<String, String> queryDevice = new LinkedHashMap<>();
            for (Map.Entry<String, String> e : device.entrySet()) {
                if (!"device_id".equals(e.getKey()) && !"iid".equals(e.getKey())) {
                    queryDevice.put(e.getKey(), e.getValue());
                }
            }
            byte[] body = null;
            if (post) {
                // 蓝本 Signer.encode(passport)：仅业务参数编 urlencoded（pythonUrlEncode 同口径）
                body = Qingguoduanju.pythonUrlEncode(passport).getBytes(StandardCharsets.UTF_8);
            }
            String query = null;
            long ticketTs = now;
            for (int offset = 0; offset <= 127; offset++) {
                ticketTs = now + offset;
                LinkedHashMap<String, String> vals = new LinkedHashMap<>(queryDevice);
                if (!post) vals.putAll(passport);
                vals.put("ts", String.valueOf(ts));
                vals.put("_rticket", String.valueOf(ticketTs));
                String q = Qingguoduanju.pythonUrlEncode(vals);
                if (Qingguoduanju.branchOf(q, body, ts) == 0) {
                    query = q;
                    break;
                }
            }
            if (query == null) throw new RuntimeException("签名分支抖动失败（128 次）");
            String url = PASSPORT_BASE + path + "?" + query;
            int random = (int) (Math.random() * 65536);
            LinkedHashMap<String, String> headers = new LinkedHashMap<>();
            headers.put("User-Agent", post ? PASSPORT_VIDEO_UA : PASSPORT_APP_UA);
            headers.put("Accept", "application/json; charset=utf-8,application/x-protobuf");
            headers.put("x-ss-req-ticket", String.valueOf(ticketTs));
            headers.put("x-tt-request-tag", "t=0;n=0");
            headers.put("sdk-version", "2");
            headers.put("passport-sdk-version", "50561");
            headers.put("x-xs-from-web", "0");
            headers.put("x-khronos", String.valueOf(ts));
            headers.put("x-ladon", Base64.encodeToString(Qingguoduanju.be32(ts), Base64.NO_WRAP));
            headers.put("x-argus", Base64.encodeToString(Qingguoduanju.le32(ts), Base64.NO_WRAP));
            headers.put("x-gorgon", Qingguoduanju.xGorgon(query, body, ts, random));
            headers.put("x-helios", Qingguoduanju.helios(ts));
            headers.put("x-medusa", Qingguoduanju.buildMedusa(url, body, ts, deviceId));
            headers.put("x-tt-dt", "");
            if (body != null) {
                headers.put("Content-Type", "application/x-www-form-urlencoded");
                headers.put("x-ss-stub", Qingguoduanju.md5HexUpper(body));
            }
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setRequestMethod(post ? "POST" : "GET");
            conn.setInstanceFollowRedirects(false);
            for (Map.Entry<String, String> e : headers.entrySet()) {
                conn.setRequestProperty(e.getKey(), e.getValue());
            }
            if (body != null) {
                conn.setDoOutput(true);
                conn.getOutputStream().write(body);
            }
            storeCookies(conn);
            String text = WebText.read(conn);
            JSONObject reply;
            try {
                reply = new JSONObject(text);
            } catch (Exception e) {
                throw new RuntimeException("passport 返回格式异常: "
                        + text.substring(0, Math.min(120, text.length())));
            }
            return reply;
        }

        /** 解析 Set-Cookie 进会话存储（同名覆盖；仅保留 name=value 主部；不回发）。 */
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
    }

    /** 响应读取小工具（App 通道专用：非 2xx 也读 body，passport 用 JSON 报错）。 */
    private static final class WebText {
        static String read(HttpURLConnection conn) throws Exception {
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
                    throw new RuntimeException("passport 请求失败（HTTP " + code + "）");
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
        if (creds == null) throw new RuntimeException("未登录账号");
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
