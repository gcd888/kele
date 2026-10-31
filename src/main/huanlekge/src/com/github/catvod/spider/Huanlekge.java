package com.github.catvod.spider;

import android.util.Log;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.huanlekge.MuseApi;
import com.github.catvod.spider.huanlekge.MuseDecrypt;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 欢唱K歌 Spider（csp_Huanlekge）。
 * 取流链路：conf/get → device-id/get → login → box-info/create → song/get-page → getSongFileUrl
 * 播放：playerContent 返回本地代理 URL，proxy 下载加密文件 → 解析 xaf8mjrs 容器 → splitmix64 分段解密 → 206 回吐 TS。
 */
public class Huanlekge extends Spider {

    private static final String TAG = "huanlekge";
    private static final int PAGE_COUNT = 30;

    private final MuseApi api = new MuseApi();

    /** tid → 解密后的 TS 数据缓存（避免重复下载解密）。 */
    private static final Map<String, byte[]> TS_CACHE = Collections.synchronizedMap(
            new LinkedHashMap<String, byte[]>(4, 0.75f, false) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, byte[]> eldest) {
                    return size() > 4; // 最多缓存 4 首
                }
            });

    /** tid → StreamInfo 缓存。 */
    private static final Map<String, MuseApi.StreamInfo> STREAM_CACHE = Collections.synchronizedMap(
            new LinkedHashMap<String, MuseApi.StreamInfo>(16, 0.75f, false) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, MuseApi.StreamInfo> eldest) {
                    return size() > 64;
                }
            });

    /** tid → Song 缓存（detailContent 显示歌名用）。 */
    private static final Map<String, MuseApi.Song> SONG_CACHE = Collections.synchronizedMap(
            new LinkedHashMap<String, MuseApi.Song>(64, 0.75f, false) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, MuseApi.Song> eldest) {
                    return size() > 2048;
                }
            });

    /** singerId → Singer 缓存（detailContent 显示歌手名/头像用）。 */
    private static final Map<String, MuseApi.Singer> SINGER_CACHE = Collections.synchronizedMap(
            new LinkedHashMap<String, MuseApi.Singer>(64, 0.75f, false) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, MuseApi.Singer> eldest) {
                    return size() > 2048;
                }
            });

    private String sk() {
        return siteKey == null || siteKey.isEmpty() ? "huanlekge" : siteKey;
    }

    /** 歌手 id 是 UUID（含 '-'），歌曲 tid 是纯数字。 */
    private static boolean isSingerId(String id) {
        return id != null && id.length() == 36 && id.indexOf('-') > 0;
    }

    private static void cacheSongs(MuseApi.Song[] songs) {
        for (MuseApi.Song s : songs) SONG_CACHE.put(s.tid, s);
    }

    private static JSONObject songItem(MuseApi.Song s) throws org.json.JSONException {
        JSONObject v = new JSONObject();
        v.put("vod_id", s.tid);
        v.put("vod_name", s.name);
        v.put("vod_pic", s.singerImage);
        v.put("vod_remarks", s.singer);
        return v;
    }

    // ============================ 首页 / 分类 ============================

    @Override
    public String homeContent(boolean filter) {
        try {
            JSONObject result = new JSONObject();
            JSONArray classes = new JSONArray();
            classes.put(new JSONObject().put("type_id", "hot").put("type_name", "热门歌曲"));
            classes.put(new JSONObject().put("type_id", "new").put("type_name", "新歌推荐"));
            classes.put(new JSONObject().put("type_id", "singer").put("type_name", "歌手"));
            result.put("class", classes);
            return result.toString();
        } catch (Exception e) {
            Log.e(TAG, "homeContent FAIL: " + e);
            return "";
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            int page = 1;
            try { page = Integer.parseInt(pg); } catch (Exception ignored) {}
            if (page < 1) page = 1;

            JSONArray list = new JSONArray();
            int returned;
            if ("singer".equals(tid)) {
                // 歌手分类：singer/get-page 分页
                MuseApi.Singer[] singers = api.getSingers("", page, PAGE_COUNT);
                returned = singers.length;
                for (MuseApi.Singer s : singers) {
                    SINGER_CACHE.put(s.id, s);
                    JSONObject v = new JSONObject();
                    v.put("vod_id", s.id);
                    v.put("vod_name", s.name);
                    v.put("vod_pic", s.image);
                    v.put("vod_remarks", s.type);
                    list.put(v);
                }
            } else {
                // 歌曲分类：song/get-page 分页
                MuseApi.Song[] songs = api.getSongs(page, PAGE_COUNT);
                returned = songs.length;
                for (MuseApi.Song s : songs) {
                    SONG_CACHE.put(s.tid, s);
                    list.put(songItem(s));
                }
            }
            JSONObject result = new JSONObject();
            result.put("page", page);
            result.put("pagecount", returned < PAGE_COUNT ? page : page + 1);
            result.put("limit", PAGE_COUNT);
            result.put("total", list.length());
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            Log.e(TAG, "categoryContent FAIL: " + e);
            return "{\"list\":[]}";
        }
    }

    // ============================ 搜索 ============================

    @Override
    public String searchContent(String key, boolean quick) {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        try {
            String keyword = key == null ? "" : key.trim();
            if (keyword.isEmpty()) return "{\"list\":[]}";
            int page = 1;
            try { page = Integer.parseInt(pg); } catch (Exception ignored) {}
            if (page < 1) page = 1;

            MuseApi.Song[] songs = api.getSongs(keyword, page, PAGE_COUNT);
            JSONArray list = new JSONArray();
            for (MuseApi.Song s : songs) {
                SONG_CACHE.put(s.tid, s);
                list.put(songItem(s));
            }
            JSONObject result = new JSONObject();
            result.put("page", page);
            result.put("pagecount", songs.length < PAGE_COUNT ? page : page + 1);
            result.put("limit", PAGE_COUNT);
            result.put("total", list.length());
            result.put("list", list);
            return result.toString();
        } catch (Exception e) {
            Log.e(TAG, "searchContent FAIL kw=" + key + ": " + e);
            return "{\"list\":[]}";
        }
    }

    // ============================ 跨源比选（action） ============================

    /**
     * 壳 MusicSession 的跨源比选：其它源的歌（如 netease_ 栈货架曲目）在本源取流失败时，
     * 用 action(search:all:「歌名 歌手」) 在本源曲库找同曲替代。
     * 返回格式与 luoxueyinyue MusicCore.action 对齐：{"songs":[{id,name,artist,duration}]}；
     * 未实现时壳侧 raceCandidates 拿到空列表 → 静默失败（点货架歌无反应）。
     */
    @Override
    public String action(String action) {
        if (action == null || !action.startsWith("search:all:")) return null;
        String keyword = action.substring("search:all:".length()).trim();
        try {
            JSONArray arr = new JSONArray();
            if (!keyword.isEmpty()) {
                // K歌服务端只匹配歌名/拼音首字母，不含歌手名（PC 实测「歌名 歌手」合体词恒 0 命中）：
                // 原词搜空时按空格逐级去尾重搜（天龙八部之宿敌 许嵩 → 天龙八部之宿敌），最多去 2 次
                MuseApi.Song[] songs = api.getSongs(keyword, 1, PAGE_COUNT);
                String kw = keyword;
                for (int i = 0; i < 2 && songs.length == 0; i++) {
                    int sp = kw.lastIndexOf(' ');
                    if (sp <= 0) break;
                    kw = kw.substring(0, sp).trim();
                    if (kw.isEmpty()) break;
                    songs = api.getSongs(kw, 1, PAGE_COUNT);
                }
                Log.i(TAG, "action search kw=" + keyword + " -> " + songs.length + " songs");
                cacheSongs(songs);
                for (MuseApi.Song s : songs) {
                    JSONObject o = new JSONObject();
                    o.put("id", s.tid);
                    o.put("name", s.name);
                    o.put("artist", s.singer);
                    o.put("duration", 0L); // K歌接口无时长字段：交由壳实测探测判定
                    arr.put(o);
                }
            }
            JSONObject root = new JSONObject();
            root.put("songs", arr);
            return root.toString();
        } catch (Exception e) {
            Log.e(TAG, "action FAIL " + action + ": " + e);
            return "{\"songs\":[]}";
        }
    }

    // ============================ 详情 ============================

    @Override
    public String detailContent(List<String> ids) {
        if (ids == null || ids.isEmpty()) return "";
        String id = ids.get(0);
        try {
            JSONObject v;
            if (isSingerId(id)) {
                v = singerDetail(id);
            } else {
                v = songDetail(id);
            }
            JSONObject root = new JSONObject();
            root.put("list", new JSONArray().put(v));
            return root.toString();
        } catch (Exception e) {
            Log.e(TAG, "detailContent FAIL id=" + id + ": " + e);
            return "";
        }
    }

    /** 歌手详情：翻页拉全量歌曲，集数=歌曲。 */
    private JSONObject singerDetail(String singerId) throws Exception {
        MuseApi.Singer cached = SINGER_CACHE.get(singerId);
        String singerName = cached == null ? "" : cached.name;
        String pic = cached == null ? "" : cached.image;

        StringBuilder play = new StringBuilder();
        int page = 1;
        final int PAGE = 50, MAX_PAGES = 10; // 上限 500 首
        while (page <= MAX_PAGES) {
            MuseApi.Song[] songs = api.getSongsBySinger(singerId, page, PAGE);
            for (MuseApi.Song s : songs) {
                SONG_CACHE.put(s.tid, s);
                if (play.length() > 0) play.append("#");
                // 歌名里的 # / $ 会破坏 vod_play_url 分隔符，替换为全角
                String epName = s.name.replace("#", "＃").replace("$", "＄");
                play.append(epName).append("$").append(s.tid);
            }
            if (songs.length < PAGE) break;
            page++;
        }
        // 歌手名兜底：取第一首歌的主唱
        if (singerName.isEmpty()) {
            for (MuseApi.Song s : SONG_CACHE.values()) {
                if (!s.singer.isEmpty()) { singerName = s.singer; break; }
            }
        }

        JSONObject v = new JSONObject();
        v.put("vod_id", singerId);
        v.put("vod_name", singerName.isEmpty() ? singerId : singerName);
        v.put("vod_pic", pic);
        v.put("vod_remarks", cached == null ? "" : cached.type);
        v.put("vod_play_from", "欢唱K歌");
        v.put("vod_play_url", play.toString());
        return v;
    }

    /** 单曲详情。 */
    private JSONObject songDetail(String tid) throws Exception {
        MuseApi.Song cached = SONG_CACHE.get(tid);
        JSONObject v = new JSONObject();
        v.put("vod_id", tid);
        v.put("vod_name", cached == null ? tid : cached.name);
        v.put("vod_pic", cached == null ? "" : cached.singerImage);
        v.put("vod_remarks", cached == null ? "" : cached.singer);
        v.put("vod_play_from", "欢唱K歌");
        v.put("vod_play_url", "播放$" + tid);
        return v;
    }

    // ============================ 播放 ============================

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            // K歌 tid 为纯数字；其它源 uid（netease_xxx 等）在切源重取当前歌时可能串进来，
            // 直接报错返回，避免拿异源 id 白打一趟登录+取流接口
            if (id == null || !id.matches("\\d+")) {
                Log.w(TAG, "playerContent skip foreign id=" + id);
                JSONObject err = new JSONObject();
                err.put("msg", "非欢唱K歌曲目");
                err.put("flag", flag == null || flag.isEmpty() ? "欢唱K歌" : flag);
                err.put("url", "");
                err.put("parse", 0);
                return err.toString();
            }
            // 预取 StreamInfo（触发登录 + 取流），确保 proxy 时缓存命中
            getStreamInfo(id);
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("header", new JSONObject());
            result.put("flag", flag == null || flag.isEmpty() ? "欢唱K歌" : flag);
            result.put("url", "proxy://do=play&siteKey=" + sk() + "&tid=" + id);
            result.put("lyric", "");
            result.put("klyric", "");
            result.put("accompany", "");
            result.put("trackMode", "single");
            result.put("mv", "");
            return result.toString();
        } catch (Exception e) {
            Log.e(TAG, "playerContent FAIL id=" + id + ": " + e);
            try {
                JSONObject err = new JSONObject();
                err.put("msg", "获取播放数据失败：" + e.getMessage());
                err.put("flag", flag == null || flag.isEmpty() ? "欢唱K歌" : flag);
                err.put("url", "");
                err.put("parse", 0);
                return err.toString();
            } catch (Exception ignored) {
                return "";
            }
        }
    }

    // ============================ 本地代理 ============================

    @Override
    public Object[] proxy(Map<String, String> params) {
        try {
            if (!"play".equals(params.get("do"))) return null;
            String tid = params.get("tid");
            if (tid == null || tid.isEmpty()) {
                Log.e(TAG, "proxy missing tid");
                return null;
            }

            // 解析 Range
            String range = params.get("__range");
            if (range == null || range.isEmpty()) range = params.get("range");
            if (range == null || range.isEmpty()) range = "bytes=0-";
            Matcher m = Pattern.compile("bytes=(\\d+)-(\\d*)").matcher(range);
            if (!m.find()) {
                Log.e(TAG, "proxy bad range=" + range);
                return null;
            }
            long start = Long.parseLong(m.group(1));
            String endStr = m.group(2);
            long end = endStr.isEmpty() ? Long.MAX_VALUE : Long.parseLong(endStr);

            byte[] ts = getDecryptedTs(tid);
            long total = ts.length;
            long realEnd = Math.min(end, total - 1);
            if (start >= total) {
                Map<String, String> h = new LinkedHashMap<>();
                h.put("Content-Length", "0");
                return new Object[]{416, "text/plain", new ByteArrayInputStream(new byte[0]), h};
            }
            if (realEnd < start) realEnd = start;

            int len = (int) (realEnd - start + 1);
            byte[] body = new byte[len];
            System.arraycopy(ts, (int) start, body, 0, len);

            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Range", "bytes " + start + "-" + realEnd + "/" + total);
            headers.put("Accept-Ranges", "bytes");
            headers.put("Content-Type", "video/mp2t");
            return new Object[]{206, "video/mp2t", new ByteArrayInputStream(body), headers};
        } catch (Exception e) {
            Log.e(TAG, "proxy FAIL tid=" + params.get("tid") + ": " + e);
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Length", "0");
            // 用 500 不用 502：NanoHTTPD 2.3.1 Status 枚举缺 502
            return new Object[]{500, "text/plain", new ByteArrayInputStream(new byte[0]), headers};
        }
    }

    // ============================ 内部 ============================

    private MuseApi.StreamInfo getStreamInfo(String tid) throws Exception {
        MuseApi.StreamInfo si = STREAM_CACHE.get(tid);
        if (si != null) return si;
        si = api.getStream(tid);
        if (si.url == null || si.url.isEmpty()) {
            throw new RuntimeException("empty stream url for tid=" + tid);
        }
        STREAM_CACHE.put(tid, si);
        return si;
    }

    private byte[] getDecryptedTs(String tid) throws Exception {
        byte[] cached = TS_CACHE.get(tid);
        if (cached != null) return cached;

        MuseApi.StreamInfo si = getStreamInfo(tid);
        Log.i(TAG, "downloading encrypted media for tid=" + tid + " url=" + si.url);
        byte[] fileData = MuseApi.downloadFull(si.url);
        Log.i(TAG, "downloaded " + fileData.length + " bytes, decrypting...");

        byte[] key16 = si.key16.getBytes(StandardCharsets.UTF_8);
        byte[] ts = MuseDecrypt.decryptAll(fileData, key16);
        Log.i(TAG, "decrypted ts size=" + ts.length);

        TS_CACHE.put(tid, ts);
        return ts;
    }
}
