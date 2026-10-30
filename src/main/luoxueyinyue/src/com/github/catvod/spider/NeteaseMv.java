package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.music.MusicCore;

import java.util.HashMap;
import java.util.List;

/**
 * 芸映（key=guoguoyunying，style:"mv"）：网易云 MV 站点源。
 * 推荐/排行榜/最新/全部四分类 + MV 搜索（weapi type=1004）；
 * 条目 uid=mv_{mvid}，playerContent 委托 MusicCore mv 分支（mp4 直链，音频态出声/MV 态铺视频）。
 * 协议全部收敛在 MusicCore（复用 weapi/neHeaders 基建），本类仅薄壳转发。
 */
public class NeteaseMv extends Spider {

    @Override
    public void init(Context context) {
        super.init(context);
        MusicCore.bindHost(this);
    }

    @Override
    public String homeContent(boolean filter) {
        return MusicCore.mvHomeContent(filter);
    }

    @Override
    public String homeVideoContent() {
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        return MusicCore.mvCategoryContent(tid, pg, extend);
    }

    @Override
    public String detailContent(List<String> ids) {
        return MusicCore.mvDetailContent(ids);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return MusicCore.mvSearchContent(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        return MusicCore.mvSearchContent(key, pg);
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
