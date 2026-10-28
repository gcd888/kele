package com.github.catvod.spider.music;

import com.github.catvod.crawler.Spider;

import java.util.HashMap;
import java.util.List;

/**
 * 音乐 Spider 公共骨架：协议全部委托 MusicCore（六平台实现共享）。
 * 子类仅声明本源主平台：all=聚合源（全平台内容）；netease/qq/kugou/soda/kuwo/migu=独立源。
 * playerContent/action/detailContent 恒为全平台能力（跨源队列可直接播放任意 uid）。
 */
public abstract class MusicSpiderBase extends Spider {

    /** 本源主平台。 */
    protected abstract String platform();

    @Override
    public void init(android.content.Context context) {
        super.init(context);
        MusicCore.bindHost(this);
    }

    @Override
    public String homeContent(boolean filter) {
        return MusicCore.homeContent(platform(), filter);
    }

    @Override
    public String homeVideoContent() {
        return MusicCore.homeVideoContent(platform());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        return MusicCore.categoryContent(platform(), tid, pg, filter, extend);
    }

    @Override
    public String detailContent(List<String> ids) {
        return MusicCore.detailContent(ids);
    }

    /** 壳侧 SourceViewModel 只调 2 参版本，委托 3 参。 */
    @Override
    public String searchContent(String key, boolean quick) {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        long t0 = System.currentTimeMillis();
        String keyword = key == null ? "" : key.trim();
        if (keyword.isEmpty() || keyword.length() > 60) return MusicCore.pageDataEmpty(1);
        MusicCore.fileLog("searchContent enter p=" + platform() + " kw=[" + keyword + "] quick=" + quick);
        try {
            List<MusicCore.Song> songs = "all".equals(platform())
                    ? MusicCore.parallelSearch(keyword) : MusicCore.searchOne(platform(), keyword);
            MusicCore.fileLog("searchContent done p=" + platform() + " kw=[" + keyword + "] items=" + songs.size()
                    + " cost=" + (System.currentTimeMillis() - t0) + "ms");
            return MusicCore.songsToPageData(songs);
        } catch (Exception e) {
            MusicCore.fileLog("searchContent FAIL p=" + platform() + " kw=[" + keyword + "] : " + e);
            return MusicCore.pageDataEmpty(1);
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return MusicCore.playerContent(flag, id);
    }

    @Override
    public String action(String action) {
        return MusicCore.action(action);
    }
}
