package com.github.catvod.spider;

/**
 * 桌面搜索探针：实测青果短剧 searchContent 双链路（App 签名搜索 → 官网兜底）对
 * 子词/全名/前缀数字等关键词的召回差异。运行前确保可联网（首次会注册匿名设备，
 * 落盘 qingguoduanju_device.json 到 cwd）。
 * 用法：java -cp <build-classes> com.github.catvod.spider.SearchProbe <kw1> [kw2 ...]
 */
public class SearchProbe {

    public static void main(String[] args) throws Exception {
        String[] kws = args.length > 0 ? args : new String[]{"赶山养校花", "1978：赶山养校花"};
        Qingguoduanju sp = new Qingguoduanju();
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
