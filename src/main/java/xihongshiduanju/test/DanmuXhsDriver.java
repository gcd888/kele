package com.github.catvod.spider;

import org.json.JSONArray;
import org.json.JSONObject;

/** 桌面驱动：跑 Xihongshiduanju 搜索+详情取 vid，再调 DanmuProbe 拉弹幕验证番茄短剧接口兼容性。 */
public class DanmuXhsDriver {

    public static void main(String[] args) throws Exception {
        String keyword = args.length > 0 ? args[0] : "家里家外";
        Xihongshiduanju spider = new Xihongshiduanju();
        System.out.println("[1] searchContent " + keyword);
        String search = spider.searchContent(keyword, false);
        JSONObject sj = new JSONObject(search);
        JSONArray list = sj.optJSONArray("list");
        if (list == null || list.length() == 0) {
            System.out.println("[1] no search result");
            return;
        }
        String vodId = list.getJSONObject(0).optString("vod_id");
        System.out.println("[1] vod_id=" + vodId);
        System.out.println("[2] detailContent");
        String detail = spider.detailContent(java.util.Arrays.asList(vodId));
        JSONObject dj = new JSONObject(detail);
        JSONObject vod = dj.optJSONArray("list").getJSONObject(0);
        String playUrl = vod.optString("vod_play_url");
        String[] eps = playUrl.split("#");
        System.out.println("[2] episodes=" + eps.length + " first=" + eps[0]);
        String first = eps[0].split("\\$")[1];
        System.out.println("[3] danmaku vid=" + first);
        DanmuProbe.Item[] ignore = null;
        java.util.List<DanmuProbe.Item> items = DanmuProbe.fetchAll(first, vodId, 0, 8662);
        items.sort((a, b) -> Long.compare(a.timeMs, b.timeMs));
        System.out.println("[3] total=" + items.size());
        for (int i = 0; i < Math.min(5, items.size()); i++) {
            System.out.println("  " + items.get(i).timeMs + "ms " + items.get(i).text);
        }
    }
}
