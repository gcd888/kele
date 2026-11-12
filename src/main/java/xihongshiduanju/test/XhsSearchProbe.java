package com.github.catvod.spider;

/**
 * 桌面搜索探针（西红短剧）：实测 searchContent 对各关键词的召回。
 * 用法：java -cp <build-classes> com.github.catvod.spider.XhsSearchProbe <kw1> [kw2 ...]
 */
public class XhsSearchProbe {

    public static void main(String[] args) throws Exception {
        String[] kws = args.length > 0 ? args : new String[]{"赶山养校花", "1978：赶山养校花"};
        Xihongshiduanju sp = new Xihongshiduanju();
        sp.init(new android.content.Context());
        for (String kw : kws) {
            System.out.println("======== kw=[" + kw + "] ========");
            long t0 = System.currentTimeMillis();
            String out;
            try {
                out = sp.searchContent(kw, false, "1");
            } catch (Throwable t) {
                System.out.println("EX " + t);
                continue;
            }
            System.out.println("cost=" + (System.currentTimeMillis() - t0) + "ms len="
                    + (out == null ? -1 : out.length()));
            if (out == null || out.isEmpty()) {
                System.out.println("EMPTY");
                continue;
            }
            org.json.JSONObject j = new org.json.JSONObject(out);
            org.json.JSONArray list = j.optJSONArray("list");
            int n = list == null ? 0 : list.length();
            System.out.println("items=" + n);
            for (int i = 0; i < n && i < 12; i++) {
                org.json.JSONObject v = list.optJSONObject(i);
                System.out.println("   - " + v.optString("vod_name", "?") + " | "
                        + v.optString("vod_remarks", ""));
            }
        }
    }
}
