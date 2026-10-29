package com.github.catvod.spider.music;

import org.json.JSONObject;

import java.util.List;

/**
 * 落雪源公共骨架（key=luoxue_*）：搜索/歌单/歌词全部复用 MusicCore 官方链路；
 * 差异仅在取流——playerContent 优先走洛雪聚合 API（VIP/版权受限歌曲的兜底 + 无损音质），
 * 聚合失败自动回退官方 stream。mv 沿用官方 mvMeta/mvUrl 链路。
 */
public abstract class LuoxueSpiderBase extends MusicSpiderBase {

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        if (!"MV".equals(flag)) {
            String[] uid = MusicCore.splitUid(id);
            if (uid != null) {
                String url = LuoxueApi.stream(uid[0], uid[1]);
                if (url != null && !url.isEmpty()) {
                    long t0 = System.currentTimeMillis();
                    try {
                        String[] ly;
                        try {
                            ly = MusicCore.lyric(uid[0], uid[1]);
                        } catch (Exception e) {
                            ly = new String[]{"", ""};
                        }
                        JSONObject r = new JSONObject();
                        r.put("parse", 0);
                        r.put("playUrl", "");
                        r.put("header", new JSONObject());
                        r.put("flag", flag == null || flag.isEmpty() ? "洛雪音乐" : flag);
                        r.put("url", url);
                        r.put("lyric", ly[0]);
                        r.put("klyric", ly[1]);
                        r.put("accompany", "");
                        r.put("trackMode", "single");
                        String[] meta = MusicCore.mvMeta(uid[0], uid[1]);
                        r.put("mv", meta[0].isEmpty() ? "" : MusicCore.mvUrl(uid[0], meta[0]));
                        MusicCore.fileLog("playerContent lx done id=" + id
                                + " cost=" + (System.currentTimeMillis() - t0) + "ms");
                        return r.toString();
                    } catch (Throwable t) {
                        MusicCore.fileLog("playerContent lx FAIL id=" + id + " : " + t);
                    }
                }
            }
        }
        // 聚合失败/MV 请求：官方链路兜底
        return super.playerContent(flag, id, vipFlags);
    }
}
