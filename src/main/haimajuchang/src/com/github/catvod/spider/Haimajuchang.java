package com.github.catvod.spider;

import android.util.Log;

import com.github.catvod.crawler.Spider;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * 海马剧场（河马剧场 App 线上 API，蓝本 case/hmjc-flutter Flutter 客户端逆向仓库）。
 *
 * 协议要点（2026-11-06 实测）：
 *  - 端点：POST https://{domain}/free-video-portal/portal/{1103|1113|1125|1132|1133|1801|1803}
 *  - 请求头：datas = 设备公参 JSON 字符串（version/pname=com.dz.hmjc/utdid/userId/...）；
 *    明文通道再带 wetruwtty: mhdfiheowjfcslkjfwojo636（Google 渠道固定值）。
 *  - 响应：{code, msg, data}，code!=0 为业务失败；data 可能是 AES-128-CBC(hex) 密文
 *    （key=dzkjgfyxgshylgzm iv=apiupdownedcrypt，PKCS5Padding）。
 *  - 首次必须调 1103 注册匿名设备拿 userId（否则业务接口回 code=9 用户ID不能为空）。
 *
 * 分类 Tab（对应果果短剧站点内 tab）：
 *  - 海马热播  = 1125 剧场 channelGroupId=65（15 个频道可筛选）
 *  - 海马新剧  = 1125 channelGroupId=13
 *  - 海马漫剧  = 1125 channelGroupId=78
 *  - 海马排行榜 = 1125 channelGroupId=14 + channelId 68/69/70/71（热播榜/飙升榜/新剧榜/热搜榜）
 *                + channelGroupId=17（经典好剧，作为榜单筛选项）
 */
public class Haimajuchang extends Spider {

    private static final String TAG = "Haimajuchang";

    private static final String[] DOMAINS = {"freevideo.zqqds.cn", "freevideo.dzkjk.cn"};
    private static final String WETRUWTTY = "mhdfiheowjfcslkjfwojo636";
    private static final byte[] AES_KEY = "dzkjgfyxgshylgzm".getBytes(StandardCharsets.UTF_8);
    private static final byte[] AES_IV = "apiupdownedcrypt".getBytes(StandardCharsets.UTF_8);
    private static final String APP_VERSION = "1.4.0";
    private static final String PNAME = "com.dz.hmjc";
    private static final String PLAY_UA =
            "Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36";

    /** 剧场分组 id（1125 channelGroupData 实测固化；上游改名也不影响 id 语义）。 */
    private static final String GROUP_HOT = "65";     // 热播
    private static final String GROUP_NEW = "13";     // 新剧
    private static final String GROUP_COMIC = "78";   // 漫剧
    private static final String GROUP_RANK = "14";    // 排行榜（频道 68-71）
    private static final String GROUP_CLASSIC = "17"; // 经典好剧

    /** 1125 分页游标缓存：key = "tid|下一页页码" → {pageFlag, fromColumnId, fromItemId, lastColumnStyle}。 */
    private static final ConcurrentHashMap<String, String> CURSORS = new ConcurrentHashMap<>();

    // 匿名设备身份（进程级单例；1103 注册一次，全部接口共用）
    private static String utdid = null;
    private static String userId = "";
    private static final Object REG_LOCK = new Object();

    // ============================ 日志桥接（与 Qingguoduanju 同款双通道） ============================

    static void fileLog(String msg) {
        Log.e(TAG, msg);
        try {
            Class<?> lw = Class.forName("com.github.gcd888.guoju.util.LogWriter");
            lw.getMethod("i", String.class).invoke(null, "echo-hm jar: " + msg);
            return;
        } catch (Throwable ignored) {
        }
        try {
            if (mContext == null) return;
            java.io.File dir = mContext.getExternalFilesDir(null);
            if (dir == null) return;
            java.io.File f = new java.io.File(dir, "haimajuchang_spider.log");
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

    // ============================ 加解密 ============================

    private static String decryptHex(String hex) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(AES_KEY, "AES"), new IvParameterSpec(AES_IV));
            return new String(cipher.doFinal(hexBytes(hex)), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException("aes decrypt: " + e.getMessage(), e);
        }
    }

    private static byte[] hexBytes(String value) {
        int len = value.length();
        if (len % 2 != 0) throw new IllegalArgumentException("odd hex");
        byte[] out = new byte[len / 2];
        for (int i = 0; i < out.length; i++) {
            out[i] = (byte) Integer.parseInt(value.substring(i * 2, i * 2 + 2), 16);
        }
        return out;
    }

    // ============================ 设备注册（1103） ============================

    private static String newUtdid() {
        String chars = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random r = new Random();
        StringBuilder sb = new StringBuilder("tvbox");
        for (int i = 0; i < 16; i++) sb.append(chars.charAt(r.nextInt(chars.length())));
        return sb.toString();
    }

    private static String devHeadersJson() {
        if (utdid == null) utdid = newUtdid();
        try {
            JSONObject h = new JSONObject();
            h.put("version", APP_VERSION);
            h.put("pname", PNAME);
            h.put("channelCode", "Google");
            h.put("utdidTmp", utdid);
            h.put("token", "");
            h.put("utdid", utdid);
            h.put("os", "android");
            h.put("osv", "Android 14");
            h.put("brand", "android");
            h.put("model", "tvbox");
            h.put("manu", "android");
            h.put("userId", userId);
            h.put("launch", "shortcut");
            h.put("mchid", "Google");
            h.put("nchid", "Google");
            h.put("session1", utdid);
            h.put("session2", String.valueOf(System.currentTimeMillis()));
            h.put("oaid", "");
            h.put("imei", "");
            h.put("startScene", "shortcut");
            h.put("installTime", String.valueOf(System.currentTimeMillis()));
            h.put("p", 9);
            return h.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /** 1103 注册匿名设备 → userId；失败时对备用域名重试一次。 */
    private static void ensureRegistered() {
        if (userId != null && !userId.isEmpty()) return;
        synchronized (REG_LOCK) {
            if (userId != null && !userId.isEmpty()) return;
            RuntimeException last = null;
            for (String domain : DOMAINS) {
                try {
                    JSONObject params = new JSONObject();
                    params.put("oaid", "");
                    params.put("userAgent", "Flutter/" + APP_VERSION);
                    params.put("requestType", 1);
                    params.put("activeType", 1);
                    params.put("isFirstLaunch", true);
                    params.put("todayLaunchNums", 1);
                    params.put("launchTime", System.currentTimeMillis());
                    JSONObject data = request(domain, "1103", params);
                    String uid = "";
                    JSONObject userInfo = data == null ? null : data.optJSONObject("userInfoVo");
                    if (userInfo != null) uid = userInfo.optString("userId", "");
                    if (uid.isEmpty() && data != null) uid = data.optString("userId", "");
                    if (uid.isEmpty()) throw new RuntimeException("1103 empty userId");
                    userId = uid;
                    fileLog("register ok userId=" + userId);
                    return;
                } catch (RuntimeException e) {
                    last = e;
                    fileLog("register FAIL domain=" + domain + " : " + e.getMessage());
                }
            }
            userId = "";
            if (last != null) throw last;
        }
    }

    // ============================ HTTP ============================

    private static String post(String domain, String path, String body) {
        long t0 = System.currentTimeMillis();
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL("https://" + domain + "/free-video-portal/portal/" + path).openConnection();
            conn.setConnectTimeout(15000);
            conn.setReadTimeout(30000);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("datas", devHeadersJson());
            conn.setRequestProperty("wetruwtty", WETRUWTTY);
            byte[] payload = body.getBytes(StandardCharsets.UTF_8);
            conn.setFixedLengthStreamingMode(payload.length);
            conn.setDoOutput(true);
            conn.getOutputStream().write(payload);
            int code = conn.getResponseCode();
            InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            byte[] buf = new byte[65536];
            if (in != null) {
                int n;
                while ((n = in.read(buf)) > 0) {
                    out.write(buf, 0, n);
                    if (out.size() > 8388608) break;
                }
                in.close();
            }
            String result = new String(out.toByteArray(), StandardCharsets.UTF_8);
            fileLog("http POST " + path + " -> " + code + " len=" + result.length()
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return result;
        } catch (Exception e) {
            fileLog("http FAIL POST " + path + " : " + e.getClass().getSimpleName() + " " + e.getMessage());
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            if (conn != null) conn.disconnect();
        }
    }

    /** 业务请求：明文 JSON 通道；data 为 hex 密文时自动解密。 */
    private static JSONObject request(String domain, String path, JSONObject params) {
        String body = params == null ? "{}" : params.toString();
        String raw = post(domain, path, body);
        JSONObject env;
        try {
            env = new JSONObject(raw);
        } catch (Exception e) {
            throw new RuntimeException(path + " 非JSON响应");
        }
        if (env.optInt("code", -1) != 0) {
            throw new RuntimeException(path + " code=" + env.optInt("code") + " msg=" + env.optString("msg"));
        }
        Object data = env.opt("data");
        if (data instanceof String) {
            String s = (String) data;
            if (s.isEmpty()) return new JSONObject();
            if (s.matches("[0-9a-fA-F]+") && s.length() % 32 == 0) {
                try {
                    return new JSONObject(decryptHex(s));
                } catch (Exception e) {
                    fileLog(path + " data 解密失败，按明文兜底");
                }
            }
            try {
                return new JSONObject(s);
            } catch (Exception e) {
                return new JSONObject();
            }
        }
        return data instanceof JSONObject ? (JSONObject) data : env;
    }

    /** 1025? 无 —— 统一入口：主域失败自动切备用域。 */
    private static JSONObject api(String path, JSONObject params) {
        ensureRegistered();
        RuntimeException last = null;
        for (String domain : DOMAINS) {
            try {
                return request(domain, path, params);
            } catch (RuntimeException e) {
                last = e;
                fileLog("api " + path + " FAIL domain=" + domain + " : " + e.getMessage());
            }
        }
        throw last != null ? last : new RuntimeException(path + " all domains failed");
    }

    // ============================ 数据解析 ============================

    /** 1125 videoData 卡片 → vod 条目（bookId/bookName/封面/备注/简介）。 */
    private static List<JSONObject> dramaCards(JSONArray videoData) {
        List<JSONObject> out = new ArrayList<>();
        if (videoData == null) return out;
        for (int i = 0; i < videoData.length(); i++) {
            JSONObject o = videoData.optJSONObject(i);
            if (o == null) continue;
            String id = o.optString("bookId", "");
            String name = o.optString("bookName", "").trim();
            if (id.isEmpty() || name.isEmpty()) continue;
            String cover = o.optString("coverWap", "");
            if (cover.isEmpty()) cover = o.optString("coverCutWap", "");
            if (cover.isEmpty()) cover = o.optString("coverUrl", "");
            String remark = o.optString("finishStatusCn", "");
            if (remark.isEmpty()) {
                int num = o.optInt("updateNum", 0);
                if (num > 0) remark = "全" + num + "集";
            }
            JSONObject v = new JSONObject();
            try {
                v.put("vod_id", id);
                v.put("vod_name", name);
                v.put("vod_pic", cover);
                v.put("vod_remarks", remark);
                JSONArray tags = o.optJSONArray("bookTags");
                v.put("vod_actor", tags == null ? "" : joinStrings(tags, " "));
                v.put("vod_content", o.optString("introduction", ""));
            } catch (Exception ignore) {
                continue;
            }
            boolean dup = false;
            for (JSONObject d : out) if (d.optString("vod_id").equals(id)) { dup = true; break; }
            if (!dup) out.add(v);
        }
        return out;
    }

    /** 1125 剧场页 → 展平 columnData[].videoData。 */
    private static List<JSONObject> theatreItems(JSONObject data) {
        List<JSONObject> out = new ArrayList<>();
        JSONArray cols = data.optJSONArray("columnData");
        if (cols == null) return out;
        for (int i = 0; i < cols.length(); i++) {
            JSONObject col = cols.optJSONObject(i);
            if (col == null) continue;
            out.addAll(dramaCards(col.optJSONArray("videoData")));
        }
        return out;
    }

    /** 去重后的第一页 1125 请求（tid+筛选 → 请求参数）。 */
    private static JSONObject theatreParams(String tid, String filterValue, int page) {
        JSONObject params = new JSONObject();
        try {
            if ("haima-rank".equals(tid)) {
                if (GROUP_CLASSIC.equals(filterValue)) {
                    params.put("channelGroupId", GROUP_CLASSIC);
                } else {
                    params.put("channelGroupId", GROUP_RANK);
                    int ch = 68; // 默认热播榜
                    try {
                        ch = Integer.parseInt(filterValue == null || filterValue.isEmpty() ? "68" : filterValue);
                    } catch (Exception ignore) {
                    }
                    params.put("channelId", ch);
                }
            } else if ("haima-new".equals(tid)) {
                params.put("channelGroupId", GROUP_NEW);
            } else if ("haima-comic".equals(tid)) {
                params.put("channelGroupId", GROUP_COMIC);
            } else {
                params.put("channelGroupId", GROUP_HOT);
                if (filterValue != null && !filterValue.isEmpty()) {
                    try {
                        params.put("channelId", Integer.parseInt(filterValue));
                    } catch (Exception ignore) {
                    }
                }
            }
            // 游标分页：1125 返回 pageFlag/fromColumnId/fromItemId/lastColumnStyle，下一页原样回传
            if (page > 1) {
                String cur = CURSORS.get(tid + "|" + page);
                if (cur != null && !cur.isEmpty()) {
                    JSONObject c = new JSONObject(cur);
                    for (Iterator<String> it = c.keys(); it.hasNext(); ) {
                        String k = it.next();
                        params.put(k, c.opt(k));
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return params;
    }

    private static String joinStrings(JSONArray arr, String sep) {
        if (arr == null) return "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length(); i++) {
            String s = arr.optString(i, "").trim();
            if (s.isEmpty()) continue;
            if (sb.length() > 0) sb.append(sep);
            sb.append(s);
        }
        return sb.toString();
    }

    private static String pageData(List<JSONObject> items, int page, boolean hasMore) {
        try {
            JSONObject result = new JSONObject();
            JSONArray list = new JSONArray();
            for (JSONObject v : items) list.put(v);
            result.put("list", list);
            result.put("page", page);
            result.put("pagecount", hasMore ? page + 1 : page);
            result.put("limit", 20);
            result.put("total", 0);
            return result.toString();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // ============================ Spider 协议 ============================

    /** 分类定义：海马热播（频道筛选）/ 海马新剧 / 海马漫剧 / 海马排行榜（榜单筛选含经典好剧）。 */
    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            classes.put(new JSONObject().put("type_id", "haima-hot").put("type_name", "海马热播"));
            classes.put(new JSONObject().put("type_id", "haima-new").put("type_name", "海马新剧"));
            classes.put(new JSONObject().put("type_id", "haima-comic").put("type_name", "海马漫剧"));
            classes.put(new JSONObject().put("type_id", "haima-rank").put("type_name", "海马排行榜"));
            result.put("class", classes);
            // 筛选组：热播=剧场频道（1125 group 65 channelData 实测固化）；排行榜=榜单频道+经典好剧
            JSONObject filters = new JSONObject();
            String[][] hotChannels = {
                    {"精选", "427"}, {"穿越", "432"}, {"重生", "429"}, {"古装", "428"}, {"言情", "431"},
                    {"强者回归", "433"}, {"萌宝", "435"}, {"伦理", "430"}, {"超能", "437"}, {"后悔流", "434"},
                    {"修仙", "436"}, {"年代", "440"}, {"悬疑", "441"}, {"奇幻", "439"},
            };
            JSONArray hotValues = new JSONArray();
            hotValues.put(new JSONObject().put("n", "全部").put("v", ""));
            for (String[] ch : hotChannels) {
                hotValues.put(new JSONObject().put("n", ch[0]).put("v", ch[1]));
            }
            filters.put("haima-hot", new JSONArray().put(new JSONObject()
                    .put("key", "ch").put("name", "频道").put("value", hotValues)));
            String[][] ranks = {{"热播榜", "68"}, {"飙升榜", "69"}, {"新剧榜", "70"}, {"热搜榜", "71"}, {"经典好剧", GROUP_CLASSIC}};
            JSONArray rankValues = new JSONArray();
            for (String[] rk : ranks) {
                rankValues.put(new JSONObject().put("n", rk[0]).put("v", rk[1]));
            }
            filters.put("haima-rank", new JSONArray().put(new JSONObject()
                    .put("key", "rank").put("name", "榜单").put("value", rankValues)));
            result.put("filters", filters);
            return result.toString();
        } catch (Exception e) {
            fileLog("homeContent FAIL : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return "";
        }
    }

    @Override
    public String homeVideoContent() {
        try {
            JSONObject d = api("1125", new JSONObject());
            List<JSONObject> items = theatreItems(d);
            fileLog("homeVideoContent done items=" + items.size());
            return pageData(items, 1, false);
        } catch (Exception e) {
            fileLog("homeVideoContent FAIL : " + e.getClass().getSimpleName() + ": " + e.getMessage());
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
            String fv = extend == null ? "" : (extend.get("rank") != null ? extend.get("rank") : extend.get("ch"));
            if (fv == null) fv = "";
            fileLog("categoryContent enter tid=" + tid + " pg=" + page + " filter=" + fv);
            JSONObject params = theatreParams(tid, fv, page);
            JSONObject d = api("1125", params);
            List<JSONObject> items = theatreItems(d);
            boolean hasMore = d.optBoolean("hasMore", false);
            // 缓存下一页游标（pageFlag 等原样回传）
            String key = tid + "|" + (page + 1);
            CURSORS.remove(key);
            if (hasMore) {
                try {
                    JSONObject cur = new JSONObject();
                    Object pf = d.opt("pageFlag");
                    Object fci = d.opt("fromColumnId");
                    Object fii = d.opt("fromItemId");
                    Object lcs = d.opt("lastColumnStyle");
                    if (pf != null) cur.put("pageFlag", pf);
                    if (fci != null && !fci.toString().isEmpty()) cur.put("fromColumnId", fci);
                    if (fii != null && !fii.toString().isEmpty()) cur.put("fromItemId", fii);
                    if (lcs != null) cur.put("lastColumnStyle", lcs);
                    if (cur.length() > 0) CURSORS.put(key, cur.toString());
                } catch (Exception ignore) {
                }
            }
            fileLog("categoryContent done tid=" + tid + " page=" + page + " items=" + items.size() + " more=" + hasMore);
            return pageData(items, page, hasMore);
        } catch (Exception e) {
            fileLog("categoryContent FAIL tid=" + tid + " page=" + page + " : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return pageData(new ArrayList<JSONObject>(), page, false);
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String bookId = ids == null || ids.isEmpty() ? "" : ids.get(0);
            fileLog("detailContent enter bookId=" + bookId);
            JSONObject params = new JSONObject();
            params.put("bookId", bookId);
            params.put("chapterMin", 0);
            params.put("chapterMax", 9999);
            JSONObject d = api("1132", params);
            JSONArray cl = d.optJSONArray("chapterList");
            if (cl == null || cl.length() == 0) throw new RuntimeException("分集目录为空");
            // 按 chapterIndex 排序后拼 play url：第N集$bookId-chapterId
            List<int[]> order = new ArrayList<>();
            for (int i = 0; i < cl.length(); i++) order.add(new int[]{i});
            Collections.sort(order, (a, b) -> {
                JSONObject x = cl.optJSONObject(a[0]), y = cl.optJSONObject(b[0]);
                return Integer.compare(x == null ? 0 : x.optInt("chapterIndex", 0),
                        y == null ? 0 : y.optInt("chapterIndex", 0));
            });
            JSONArray eps = new JSONArray();
            JSONArray epNames = new JSONArray();
            for (int[] idx : order) {
                JSONObject ep = cl.optJSONObject(idx[0]);
                if (ep == null) continue;
                String cid = ep.optString("chapterId", "");
                if (cid.isEmpty()) continue;
                String name = ep.optString("chapterName", "").trim();
                if (name.isEmpty()) name = "第" + ep.optInt("chapterIndex", 0) + "集";
                eps.put(name + "$" + bookId + "-" + cid);
                epNames.put(name);
            }
            JSONObject v = new JSONObject();
            v.put("vod_id", bookId);
            v.put("vod_name", d.optString("bookName", ""));
            String cover = d.optString("coverWap", "");
            if (cover.isEmpty()) cover = d.optString("coverUrl", "");
            v.put("vod_pic", cover);
            String remark = d.optString("finishStatusCn", "");
            if (remark.isEmpty() && cl.length() > 0) remark = "全" + eps.length() + "集";
            v.put("vod_remarks", remark);
            v.put("vod_actor", joinStrings(d.optJSONArray("bookTags"), " "));
            v.put("vod_content", d.optString("introduction", ""));
            v.put("vod_play_from", "海马剧场");
            v.put("vod_play_url", joinStrings(eps, "#"));
            fileLog("detailContent done bookId=" + bookId + " episodes=" + eps.length());
            return new JSONObject().put("list", new JSONArray().put(v)).toString();
        } catch (Exception e) {
            fileLog("detailContent FAIL : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            // id = bookId-chapterId
            int at = id.indexOf('-');
            if (at <= 0) throw new RuntimeException("非法播放 id: " + id);
            String bookId = id.substring(0, at);
            String chapterId = id.substring(at + 1);
            fileLog("playerContent enter bookId=" + bookId + " chapterId=" + chapterId);
            JSONObject params = new JSONObject();
            params.put("bookId", bookId);
            params.put("chapterId", chapterId);
            params.put("unClockType", "pay");
            params.put("confirmPay", 1);
            params.put("autoPayFlag", false);
            JSONObject d = api("1133", params);
            JSONArray ci = d.optJSONArray("chapterInfo");
            if (ci == null || ci.length() == 0) throw new RuntimeException("取流为空");
            JSONObject ep = ci.optJSONObject(0);
            JSONObject content = ep == null ? null : ep.optJSONObject("content");
            if (content == null) {
                // 兼容字段平铺返回（蓝本 Episode.fromJson playbackFields 合并逻辑）
                content = ep == null ? new JSONObject() : ep;
            }
            String url = firstUrl(content);
            if (url.isEmpty()) throw new RuntimeException("无可用播放地址");
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("url", url);
            result.put("header", new JSONObject().put("User-Agent", PLAY_UA));
            fileLog("playerContent done url=" + url.substring(0, Math.min(120, url.length())));
            return result.toString();
        } catch (Exception e) {
            fileLog("playerContent FAIL : " + e.getClass().getSimpleName() + ": " + e.getMessage());
            return "";
        }
    }

    /** 蓝本清晰度优先级：m3u81080p → mp41080p → m3u8720p → mp4720p → 兜底。 */
    private static String firstUrl(JSONObject content) {
        String[] keys = {"m3u81080pUrl", "m3u81080p", "mp41080pUrl", "mp41080p",
                "m3u8720pUrl", "m3u8720p", "mp4720pUrl", "mp4720p", "mp4", "m3u8", "url"};
        for (String k : keys) {
            String v = content.optString(k, "");
            if (!v.trim().isEmpty()) return v.trim();
        }
        // SwitchUrl 备用数组兜底
        String[] arrKeys = {"m3u81080pSwitchUrl", "mp41080pSwitchUrl", "m3u8720pSwitchUrl", "mp4720pSwitchUrl"};
        for (String k : arrKeys) {
            JSONArray arr = content.optJSONArray(k);
            if (arr != null && arr.length() > 0) {
                String v = arr.optString(0, "");
                if (!v.trim().isEmpty()) return v.trim();
            }
        }
        return "";
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        int page = 1;
        try {
            page = Math.max(1, Integer.parseInt(pg == null ? "1" : pg.trim()));
        } catch (Exception ignore) {
        }
        String keyword = key == null ? "" : key.trim();
        if (keyword.isEmpty() || keyword.length() > 80) {
            return pageData(new ArrayList<JSONObject>(), page, false);
        }
        try {
            JSONObject params = new JSONObject();
            params.put("keyword", keyword);
            params.put("page", page);
            params.put("size", 15);
            params.put("searchSource", "搜索按钮");
            params.put("hotWordType", 2);
            JSONObject d = api("1803", params);
            List<JSONObject> items = dramaCards(d.optJSONArray("searchVos"));
            if (items.isEmpty()) {
                // 蓝本兼容：部分部署放 guessLikes/dataList
                items = dramaCards(d.optJSONArray("guessLikes"));
                if (items.isEmpty()) items = dramaCards(d.optJSONArray("dataList"));
            }
            boolean more = d.optBoolean("isMore", false)
                    || d.optInt("isMore", 0) == 1
                    || d.optBoolean("hasMore", false);
            fileLog("searchContent done kw=[" + keyword + "] page=" + page + " items=" + items.size() + " more=" + more);
            return pageData(items, page, more);
        } catch (Exception e) {
            fileLog("searchContent FAIL kw=[" + keyword + "] page=" + page + " : "
                    + e.getClass().getSimpleName() + ": " + e.getMessage());
            return pageData(new ArrayList<JSONObject>(), page, false);
        }
    }
}
