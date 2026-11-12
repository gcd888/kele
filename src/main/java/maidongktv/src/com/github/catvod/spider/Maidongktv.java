package com.github.catvod.spider;

import android.util.Log;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.maidongktv.LyricFetcher;
import com.github.catvod.spider.maidongktv.MuseApi;
import com.github.catvod.spider.maidongktv.SongGateway;
import com.github.catvod.spider.maidongktv.ThunderDecrypt;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 麦动K歌 Spider（csp_Maidongktv）。
 *
 * 取流链路（与欢唱K歌官方曲库同生态，但走免激活第三方网关）：
 *   曲库：MuseApi（mconn.cherryonline.cn/mad-api：conf/get → device-id/get → login
 *         → box-info/create → song/get-page / singer/get-page），Song.id 即 musicno；
 *   取流：SongGateway（w.w345.my 等第三方网关：i.php 取 token → do.php 取
 *         MPEG-TS 直链，两次 MD5 签名，裸 Socket 干净请求过风控）；
 *   播放：直链为 Thunder 加密 TS（512 头 + AES/ECB 分段加密），走本地代理
 *         proxy() 下载 → ThunderDecrypt 解密 → Range 回吐明文 TS（与欢唱K歌同模式）。
 *
 * 伴唱：源文件为双音轨 TS（视频 + 原唱 mp2 音轨 + 伴奏 mp2 音轨），壳侧 trackMode=multi
 *       selectTrack 切音轨（原唱=第 1 条、伴奏=最后 1 条），默认播第 1 条=原唱。
 */
public class Maidongktv extends Spider {

    private static final String TAG = "maidongktv";
    private static final int PAGE_COUNT = 30;
    private static final String FLAG = "麦动K歌";

    private final MuseApi api = new MuseApi();

    /** tid → Song 缓存（detailContent/playerContent 显示与取编号用）。 */
    private static final Map<String, MuseApi.Song> SONG_CACHE = Collections.synchronizedMap(
            new LinkedHashMap<String, MuseApi.Song>(64, 0.75f, false) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, MuseApi.Song> eldest) {
                    return size() > 2048;
                }
            });

    /** singerId → Singer 缓存。 */
    private static final Map<String, MuseApi.Singer> SINGER_CACHE = Collections.synchronizedMap(
            new LinkedHashMap<String, MuseApi.Singer>(64, 0.75f, false) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, MuseApi.Singer> eldest) {
                    return size() > 2048;
                }
            });

    /** tid → 网关取到的加密 TS 直链（proxy 下载用）。 */
    private static final Map<String, String> URL_CACHE = Collections.synchronizedMap(
            new LinkedHashMap<String, String>(16, 0.75f, false) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, String> eldest) {
                    return size() > 64;
                }
            });

    /** tid → 解密后的 TS 数据缓存（避免重复下载解密，最多 4 首）。 */
    private static final Map<String, byte[]> TS_CACHE = Collections.synchronizedMap(
            new LinkedHashMap<String, byte[]>(4, 0.75f, false) {
                @Override
                protected boolean removeEldestEntry(Map.Entry<String, byte[]> eldest) {
                    return size() > 4;
                }
            });

    private String sk() {
        return siteKey == null || siteKey.isEmpty() ? "maidongktv" : siteKey;
    }

    /** 歌手 id 是 UUID（含 '-'），歌曲 id 是纯数字。 */
    private static boolean isSingerId(String id) {
        return id != null && id.length() == 36 && id.indexOf('-') > 0;
    }

    private static void cacheSongs(MuseApi.Song[] songs) {
        for (MuseApi.Song s : songs) SONG_CACHE.put(s.id, s);
    }

    private static JSONObject songItem(MuseApi.Song s) throws org.json.JSONException {
        JSONObject v = new JSONObject();
        v.put("vod_id", s.id);
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
                MuseApi.Song[] songs = api.getSongs(page, PAGE_COUNT);
                returned = songs.length;
                for (MuseApi.Song s : songs) {
                    SONG_CACHE.put(s.id, s);
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
                SONG_CACHE.put(s.id, s);
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
     * 壳 MusicSession 跨源比选：其它源的歌在本源取流失败时，用
     * action(search:all:「歌名 歌手」) 在本源曲库找同曲替代。
     * 返回格式与 MusicCore.action 对齐：{"songs":[{id,name,artist,duration}]}。
     */
    @Override
    public String action(String action) {
        if (action == null || !action.startsWith("search:all:")) return null;
        String keyword = action.substring("search:all:".length()).trim();
        try {
            JSONArray arr = new JSONArray();
            if (!keyword.isEmpty()) {
                // K歌服务端只匹配歌名/拼音首字母，不含歌手名：原词搜空时按空格逐级去尾重搜，最多去 2 次
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
                    o.put("id", s.id);
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
            JSONObject v = isSingerId(id) ? singerDetail(id) : songDetail(id);
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
                SONG_CACHE.put(s.id, s);
                if (play.length() > 0) play.append("#");
                // 歌名里的 # / $ 会破坏 vod_play_url 分隔符，替换为全角
                String epName = s.name.replace("#", "＃").replace("$", "＄");
                play.append(epName).append("$").append(s.id);
            }
            if (songs.length < PAGE) break;
            page++;
        }
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
        v.put("vod_play_from", FLAG);
        v.put("vod_play_url", play.toString());
        return v;
    }

    /** 单曲详情。 */
    private JSONObject songDetail(String id) throws Exception {
        MuseApi.Song cached = SONG_CACHE.get(id);
        JSONObject v = new JSONObject();
        v.put("vod_id", id);
        v.put("vod_name", cached == null ? id : cached.name);
        v.put("vod_pic", cached == null ? "" : cached.singerImage);
        v.put("vod_remarks", cached == null ? "" : cached.singer);
        v.put("vod_play_from", FLAG);
        v.put("vod_play_url", "播放$" + id);
        return v;
    }

    // ============================ 播放 ============================

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            // 麦动 musicno 为纯数字；异源 uid（netease_xxx 等）串入时直接报错返回，
            // 避免拿异源 id 白打一趟登录+取流接口
            if (id == null || (!id.matches("\\d+") && !isSingerId(id))) {
                Log.w(TAG, "playerContent skip foreign id=" + id);
                return errorResult(flag, "非麦动K歌曲目");
            }
            // 预取直链（触发网关 i.php/do.php），确保 proxy 时缓存命中。
            // 直链是 Thunder 加密 TS（512 头 + AES/ECB 分段），不能直接交给播放器，
            // 必须经 proxy() 本地解密后回吐明文 TS（与欢唱K歌同模式）。
            // id 允许 UUID（曲库 id，K歌页/详情页vod_id）与纯数字（网关编号）两种，resolveUrl 统一映射。
            String url = resolveUrl(id);
            if (url == null) {
                return errorResult(flag, "取流失败：全部源不可用（源站风控 403 需更换公网 IP）");
            }
            JSONObject result = new JSONObject();
            result.put("parse", 0);
            result.put("playUrl", "");
            result.put("header", new JSONObject());
            result.put("flag", flag == null || flag.isEmpty() ? FLAG : flag);
            result.put("url", "proxy://do=play&siteKey=" + sk() + "&tid=" + id);
            // 歌词：mad-api 不下发，按歌名+歌手从网易云匹配 LRC（失败空串不影响播放）
            MuseApi.Song song = SONG_CACHE.get(id);
            result.put("lyric", song == null ? "" : LyricFetcher.fetch(song.name, song.singer));
            result.put("klyric", "");
            result.put("accompany", "");
            // multi：TS 为双音轨结构（ffprobe 实测 1 视频 + 2 条 mp2 stereo，第 1 条=原唱、
            // 第 2 条=伴奏，能量曲线 20-50s 人声段 track1 显著高于 track2），壳 multi 模式
            // selectTrack 切音轨（原唱=第 1 条、伴奏=最后 1 条），默认播第 1 条=原唱 ✓
            result.put("trackMode", "multi");
            // TS 自带 MV 画面：MV 态播同一流露出视频面（不走跨源 MV 搜索）
            result.put("mv", "proxy://do=play&siteKey=" + sk() + "&tid=" + id);
            return result.toString();
        } catch (Exception e) {
            Log.e(TAG, "playerContent FAIL id=" + id + ": " + e);
            return errorResult(flag, "获取播放数据失败：" + e.getMessage());
        }
    }

    /** 网关取直链并落缓存：页面 id（UUID 曲库 id 或纯数字编号）统一映射到网关编号 musicno。 */
    private String resolveUrl(String pageId) {
        if (pageId == null || pageId.isEmpty()) return null;
        String cached = URL_CACHE.get(pageId);
        if (cached != null) return cached;
        MuseApi.Song song = SONG_CACHE.get(pageId);
        String no = pageId;
        if (song != null && song.tid.matches("\\d+")) no = song.tid;
        if (!no.matches("\\d+")) return null;
        String url = SongGateway.resolve(no, "720", false);
        if (url == null && song != null && !song.tid.equals(no) && song.tid.matches("\\d+")) {
            // 容错：mad-api 的 id 与第三方网关编号不同源时，用 tid 再试一次
            url = SongGateway.resolve(song.tid, "720", false);
        }
        if (url != null && !url.isEmpty()) URL_CACHE.put(pageId, url);
        return url;
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
                return new Object[]{416, "text/plain", new java.io.ByteArrayInputStream(new byte[0]), h};
            }
            if (realEnd < start) realEnd = start;

            int len = (int) (realEnd - start + 1);
            byte[] body = new byte[len];
            System.arraycopy(ts, (int) start, body, 0, len);

            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Range", "bytes " + start + "-" + realEnd + "/" + total);
            headers.put("Accept-Ranges", "bytes");
            headers.put("Content-Type", "video/mp2t");
            Log.i(TAG, "proxy 服务 tid=" + tid + " range=" + start + "-" + realEnd + "/" + total);
            return new Object[]{206, "video/mp2t", new java.io.ByteArrayInputStream(body), headers};
        } catch (Exception e) {
            Log.e(TAG, "proxy FAIL tid=" + params.get("tid") + ": " + e);
            Map<String, String> headers = new LinkedHashMap<>();
            headers.put("Content-Length", "0");
            // 用 500 不用 502：NanoHTTPD 2.3.1 Status 枚举缺 502
            return new Object[]{500, "text/plain", new java.io.ByteArrayInputStream(new byte[0]), headers};
        }
    }

    /** 下载加密文件 → Thunder 解密 → 缓存明文 TS。 */
    private byte[] getDecryptedTs(String tid) throws Exception {
        byte[] cached = TS_CACHE.get(tid);
        if (cached != null) return cached;

        String url = URL_CACHE.get(tid);
        if (url == null || url.isEmpty()) {
            url = resolveUrl(tid);
            if (url == null) throw new RuntimeException("取流失败：全部源不可用 tid=" + tid);
        }
        Log.i(TAG, "下载加密媒体 tid=" + tid + " url=" + url);
        byte[] fileData = MuseApi.downloadFull(url);
        Log.i(TAG, "已下载 " + fileData.length + " bytes，解密中...");

        byte[] ts = ThunderDecrypt.decryptAll(fileData);
        Log.i(TAG, "解密完成 ts size=" + ts.length);
        URL_CACHE.remove(tid); // 直链一次性（token 时效），下载完即弃
        TS_CACHE.put(tid, ts);
        return ts;
    }

    private String errorResult(String flag, String msg) {
        try {
            JSONObject err = new JSONObject();
            err.put("msg", msg);
            err.put("flag", flag == null || flag.isEmpty() ? FLAG : flag);
            err.put("url", "");
            err.put("parse", 0);
            return err.toString();
        } catch (Exception ignored) {
            return "";
        }
    }
}
