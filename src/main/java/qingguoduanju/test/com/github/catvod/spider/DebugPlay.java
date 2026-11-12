package com.github.catvod.spider;

/**
 * 桌面播放冒烟探针（2026-11-06 播放签名修复回归）：搜索 → 详情 → 逐集 playerContent，
 * 验证签名后的 multi_video_model/v1 取流链路。运行前需联网（首次注册匿名设备落盘 cwd）。
 * 用法：java -cp <build-classes>;<test-classes> com.github.catvod.spider.DebugPlay [关键词]
 */
public class DebugPlay {

    public static void main(String[] args) throws Exception {
        String kw = args.length > 0 ? args[0] : "完蛋！我被美女包围了";
        Qingguoduanju sp = new Qingguoduanju();
        sp.init(new android.content.Context());

        long t0 = System.currentTimeMillis();
        String out = sp.searchContent(kw, false, "1");
        System.out.println("search cost=" + (System.currentTimeMillis() - t0) + "ms len="
                + (out == null ? -1 : out.length()));
        if (out == null || out.isEmpty()) { System.out.println("SEARCH EMPTY"); return; }
        org.json.JSONObject j = new org.json.JSONObject(out);
        org.json.JSONArray list = j.optJSONArray("list");
        if (list == null || list.length() == 0) { System.out.println("SEARCH NO ITEM"); return; }
        org.json.JSONObject vod = list.optJSONObject(0);
        String vodId = vod.optString("vod_id", "");
        System.out.println("vod: " + vod.optString("vod_name", "?") + " id=" + vodId);

        t0 = System.currentTimeMillis();
        String detail = sp.detailContent(java.util.Collections.singletonList(vodId));
        System.out.println("detail cost=" + (System.currentTimeMillis() - t0) + "ms len="
                + (detail == null ? -1 : detail.length()));
        if (detail == null || detail.isEmpty()) { System.out.println("DETAIL EMPTY"); return; }
        org.json.JSONObject dj = new org.json.JSONObject(detail);
        org.json.JSONArray dlist = dj.optJSONArray("list");
        if (dlist == null || dlist.length() == 0) { System.out.println("DETAIL NO ITEM"); return; }
        String playUrl = dlist.optJSONObject(0).optString("vod_play_url", "");
        if (playUrl.isEmpty()) { System.out.println("NO PLAY URL"); return; }
        // play_url 格式：集名$集id#集名$集id...，取前 3 集
        String[] eps = playUrl.split("#");
        System.out.println("episodes=" + eps.length);
        int pass = 0, fail = 0;
        for (int i = 0; i < Math.min(3, eps.length); i++) {
            int d = eps[i].indexOf('$');
            String epName = d > 0 ? eps[i].substring(0, d) : ("ep" + i);
            String vid = eps[i].substring(Math.max(0, d) + 1);
            t0 = System.currentTimeMillis();
            try {
                String play = sp.playerContent(null, vid, null);
                long cost = System.currentTimeMillis() - t0;
                boolean ok = play != null && !play.isEmpty()
                        && new org.json.JSONObject(play).optString("url", "").length() > 20;
                if (ok) { pass++; System.out.println("[PASS] " + epName + " vid=" + vid + " cost=" + cost + "ms urlHead="
                        + new org.json.JSONObject(play).optString("url", "").substring(0, 60)); }
                else { fail++; System.out.println("[FAIL] " + epName + " vid=" + vid + " cost=" + cost + "ms -> " + play); }
            } catch (Throwable t) {
                fail++;
                System.out.println("[FAIL] " + epName + " vid=" + vid + " cost="
                        + (System.currentTimeMillis() - t0) + "ms EX " + t);
            }
        }
        System.out.println("==== RESULT pass=" + pass + " fail=" + fail);
        if (fail > 0) System.exit(1);
    }
}
