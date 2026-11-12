package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * 桌面自测：跑通 海马剧场 Spider 全协议（home/category/detail/player/search）。
 * 用法：java -cp build/testout TestHaima
 */
public class TestHaima {

    public static void main(String[] args) throws Exception {
        Spider spider = new Haimajuchang();
        spider.init(null);

        System.out.println("===== homeContent =====");
        String home = spider.homeContent(true);
        System.out.println(home);

        System.out.println("\n===== category 海马热播 page1 =====");
        String cat = spider.categoryContent("haima-hot", "1", true, new HashMap<>());
        System.out.println(summarize(cat));

        System.out.println("\n===== category 海马热播 page2（游标分页） =====");
        String cat2 = spider.categoryContent("haima-hot", "2", true, new HashMap<>());
        System.out.println(summarize(cat2));

        System.out.println("\n===== category 海马新剧 =====");
        System.out.println(summarize(spider.categoryContent("haima-new", "1", true, new HashMap<>())));

        System.out.println("\n===== category 海马漫剧 =====");
        System.out.println(summarize(spider.categoryContent("haima-comic", "1", true, new HashMap<>())));

        System.out.println("\n===== category 海马排行榜（热播榜） =====");
        HashMap<String, String> ext = new HashMap<>();
        ext.put("rank", "68");
        System.out.println(summarize(spider.categoryContent("haima-rank", "1", true, ext)));

        System.out.println("\n===== category 海马排行榜（经典好剧） =====");
        ext = new HashMap<>();
        ext.put("rank", "17");
        System.out.println(summarize(spider.categoryContent("haima-rank", "1", true, ext)));

        // 取第一条做 detail + player
        String firstId = firstVodId(cat);
        if (firstId != null) {
            System.out.println("\n===== detail " + firstId + " =====");
            String detail = spider.detailContent(Arrays.asList(firstId));
            System.out.println(summarizeDetail(detail));
            String epId = firstEpId(detail);
            if (epId != null) {
                System.out.println("\n===== player " + epId + " =====");
                String play = spider.playerContent("海马剧场", epId, null);
                System.out.println(play.length() > 400 ? play.substring(0, 400) + "...(truncated)" : play);
            }
        }

        System.out.println("\n===== search 闪婚 =====");
        System.out.println(summarize(spider.searchContent("闪婚", false, "1")));

        System.out.println("\nTEST DONE");
    }

    static String summarize(String json) {
        try {
            org.json.JSONObject o = new org.json.JSONObject(json);
            org.json.JSONArray list = o.optJSONArray("list");
            StringBuilder sb = new StringBuilder("page=" + o.optInt("page") + " pagecount=" + o.optInt("pagecount")
                    + " items=" + (list == null ? 0 : list.length()));
            if (list != null) {
                for (int i = 0; i < Math.min(5, list.length()); i++) {
                    org.json.JSONObject v = list.optJSONObject(i);
                    if (v != null) sb.append("\n  ").append(i + 1).append(". ").append(v.optString("vod_name"))
                            .append(" | id=").append(v.optString("vod_id"))
                            .append(" | pic=").append(v.optString("vod_pic").isEmpty() ? "N/A" : "OK")
                            .append(" | ").append(v.optString("vod_remarks"));
                }
            }
            return sb.toString();
        } catch (Exception e) {
            return "PARSE FAIL: " + e.getMessage() + " raw=" + (json == null ? "null" : json.substring(0, Math.min(300, json.length())));
        }
    }

    static String summarizeDetail(String json) {
        try {
            org.json.JSONObject v = new org.json.JSONObject(json).optJSONArray("list").optJSONObject(0);
            String playUrl = v.optString("vod_play_url");
            int eps = playUrl.split("#").length;
            return "name=" + v.optString("vod_name") + " | eps=" + eps
                    + " | playUrlHead=" + playUrl.substring(0, Math.min(80, playUrl.length()));
        } catch (Exception e) {
            return "DETAIL PARSE FAIL: " + e.getMessage() + " raw=" + (json == null ? "null" : json.substring(0, Math.min(300, json.length())));
        }
    }

    static String firstVodId(String categoryJson) {
        try {
            return new org.json.JSONObject(categoryJson).optJSONArray("list").optJSONObject(0).optString("vod_id");
        } catch (Exception e) {
            return null;
        }
    }

    static String firstEpId(String detailJson) {
        try {
            String playUrl = new org.json.JSONObject(detailJson).optJSONArray("list").optJSONObject(0).optString("vod_play_url");
            String first = playUrl.split("#")[0];
            return first.contains("$") ? first.substring(first.indexOf('$') + 1) : null;
        } catch (Exception e) {
            return null;
        }
    }
}
