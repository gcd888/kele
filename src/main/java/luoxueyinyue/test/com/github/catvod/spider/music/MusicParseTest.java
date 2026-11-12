package com.github.catvod.spider.music;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

/**
 * 平台响应解析 mock 验证（同包访问 package-private 解析方法）：
 * 酷狗/酷我 CDN 在受限网络不可达，用真实响应结构样本验证解析正确性。
 * 运行：java -cp build\test-classes;<json.jar> com.github.catvod.spider.music.MusicParseTest
 */
public class MusicParseTest {

    private static int pass = 0;
    private static int fail = 0;

    public static void main(String[] args) {
        System.out.println("========== 平台解析 mock 验证 ==========");
        testKugou();
        testKuwo();
        testSoda();
        testQq();
        testNetease();
        System.out.println("========== 结果: PASS=" + pass + " FAIL=" + fail + " ==========");
        if (fail > 0) System.exit(1);
    }

    /** 酷狗：mobilecdn search/song 大写命名结构。 */
    private static void testKugou() {
        try {
            String json = "{\"status\":1,\"data\":{\"info\":[{"
                    + "\"FileHash\":\"ABCDEF0123456789ABCDEF0123456789\","
                    + "\"SongName\":\"海阔天空\",\"SingerName\":\"Beyond\",\"AlbumName\":\"命运派对\","
                    + "\"Duration\":322,\"Image\":\"http://imge.kugou.com/standard/240/1.jpg\"}]}}";
            JSONObject resp = new JSONObject(json);
            List<MusicCore.Song> songs = MusicCore.kgParseInfoList(
                    resp.getJSONObject("data").optJSONArray("info"));
            check("kugou parse", songs.size() == 1
                    && "kugou".equals(songs.get(0).platform)
                    && "ABCDEF0123456789ABCDEF0123456789".equals(songs.get(0).id)
                    && "海阔天空".equals(songs.get(0).name)
                    && "Beyond".equals(songs.get(0).artist));
        } catch (Exception e) {
            check("kugou parse", false);
            e.printStackTrace();
        }
    }

    /** 酷我：abslist 大写字段 + bitSwitch 过滤。 */
    private static void testKuwo() {
        try {
            String json = "[{\"MUSICRID\":\"MUSIC_228908\",\"SONGNAME\":\"海阔天空\",\"ARTIST\":\"Beyond\","
                    + "\"ALBUM\":\"命运派对\",\"DURATION\":\"322\",\"bitSwitch\":1,\"hts_MVPIC\":\"http://img4.kuwo.cn/star/albumcover/120/1.jpg\"},"
                    + "{\"MUSICRID\":\"MUSIC_999\",\"SONGNAME\":\"无格式歌\",\"ARTIST\":\"X\",\"bitSwitch\":0}]";
            List<MusicCore.Song> songs = MusicCore.kwParseAbslist(new JSONArray(json));
            check("kuwo parse", songs.size() == 1
                    && "kuwo".equals(songs.get(0).platform)
                    && "228908".equals(songs.get(0).id)
                    && "海阔天空".equals(songs.get(0).name)
                    && "Beyond".equals(songs.get(0).artist)
                    && songs.get(0).cover.contains("/500/"));
        } catch (Exception e) {
            check("kuwo parse", false);
            e.printStackTrace();
        }
    }

    /** 汽水：charts 响应（无 status_code 字段）+ track 结构。 */
    private static void testSoda() {
        try {
            String json = "{\"status_info\":{\"log_id\":\"x\"},\"chart\":{\"id\":\"1\",\"title\":\"热歌榜\","
                    + "\"track_ranks\":[{\"rank\":{\"track_id\":\"100\"},\"track\":{\"id\":\"100\","
                    + "\"name\":\"海阔天空\",\"artists\":[{\"name\":\"Beyond\"}],"
                    + "\"album\":{\"name\":\"命运派对\",\"url_cover\":{\"uri\":\"tos-cn/x.jpg\"}},\"duration\":322}}]}}";
            List<MusicCore.Song> songs = MusicCore.sodaParseChartResp(new JSONObject(json));
            check("soda chart parse", songs.size() == 1
                    && "soda".equals(songs.get(0).platform)
                    && "100".equals(songs.get(0).id)
                    && "海阔天空".equals(songs.get(0).name)
                    && songs.get(0).cover.contains("douyinpic"));
        } catch (Exception e) {
            check("soda chart parse", false);
            e.printStackTrace();
        }
    }

    /** QQ：search_for_qq_cp old 命名结构。 */
    private static void testQq() {
        try {
            java.lang.reflect.Method m = MusicCore.class.getDeclaredMethod("qqParseSongList", JSONArray.class);
            m.setAccessible(true);
            String json = "[{\"data\":{\"songmid\":\"001yS0N33yPm1B\",\"songid\":97773,\"songname\":\"海阔天空\","
                    + "\"albumname\":\"命运派对\",\"albummid\":\"002eFUFm2XYZ7z\",\"interval\":322,"
                    + "\"singer\":[{\"name\":\"Beyond\"}]}}]";
            @SuppressWarnings("unchecked")
            List<MusicCore.Song> songs = (List<MusicCore.Song>) m.invoke(null, new JSONArray(json));
            check("qq parse", songs.size() == 1
                    && "qq".equals(songs.get(0).platform)
                    && "001yS0N33yPm1B".equals(songs.get(0).id)
                    && "海阔天空".equals(songs.get(0).name)
                    && songs.get(0).cover.contains("T002R300x300M000002eFUFm2XYZ7z")
                    && songs.get(0).mvid.startsWith("qqmeta:97773"));
        } catch (Exception e) {
            check("qq parse", false);
            e.printStackTrace();
        }
    }

    /** 网易云：cloudsearch ar/al 命名结构。 */
    private static void testNetease() {
        try {
            java.lang.reflect.Method m = MusicCore.class.getDeclaredMethod("neParseSongs", JSONArray.class);
            m.setAccessible(true);
            String json = "[{\"id\":1357375695,\"name\":\"海阔天空\","
                    + "\"ar\":[{\"name\":\"Beyond\"}],\"al\":{\"name\":\"命运派对\",\"picUrl\":\"http://p1.music.126.net/1.jpg\"},"
                    + "\"dt\":322000,\"privilege\":{\"st\":0,\"fee\":0}}]";
            @SuppressWarnings("unchecked")
            List<MusicCore.Song> songs = (List<MusicCore.Song>) m.invoke(null, new JSONArray(json));
            check("netease parse", songs.size() == 1
                    && "netease".equals(songs.get(0).platform)
                    && "1357375695".equals(songs.get(0).id)
                    && "海阔天空".equals(songs.get(0).name)
                    && "Beyond".equals(songs.get(0).artist)
                    && 322 == songs.get(0).duration);
        } catch (Exception e) {
            check("netease parse", false);
            e.printStackTrace();
        }
    }

    private static void check(String what, boolean ok) {
        if (ok) {
            pass++;
            System.out.println("  OK: " + what);
        } else {
            fail++;
            System.out.println("  FAIL: " + what);
        }
    }
}
