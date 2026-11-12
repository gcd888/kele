package com.github.catvod.spider;

import org.json.JSONArray;
import org.json.JSONObject;

/** 桌面探针：打印 detailContent 返回 JSON 全部字段值，定位壳详情页"摸鱼弹幕搜索"文案来源。 */
public class XhsDetailFieldProbe {

    public static void main(String[] args) throws Exception {
        String keyword = args.length > 0 ? args[0] : "和离后我带女儿横扫魔域";
        Xihongshiduanju spider = new Xihongshiduanju();
        String search = spider.searchContent(keyword, false);
        JSONObject sj = new JSONObject(search);
        JSONArray list = sj.optJSONArray("list");
        if (list == null || list.length() == 0) {
            System.out.println("no search result");
            return;
        }
        String vodId = list.getJSONObject(0).optString("vod_id");
        System.out.println("vod_id=" + vodId);
        String detail = spider.detailContent(java.util.Arrays.asList(vodId));
        JSONObject vod = new JSONObject(detail).optJSONArray("list").getJSONObject(0);
        java.util.Iterator<String> keys = vod.keys();
        while (keys.hasNext()) {
            String k = keys.next();
            String v = String.valueOf(vod.opt(k));
            if (v.length() > 120) v = v.substring(0, 120) + "...";
            System.out.println(k + " = [" + v + "]");
        }
    }
}
