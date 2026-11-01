package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.music.MusicCore;

import java.util.HashMap;
import java.util.List;

/**
 * 枸映（key=guoguogoumv，style:"mv"）：酷狗 MV 站点源。
 * 热门/华语/欧美/日韩四热词分类（mobilecdn v3/search/mv）+ MV 搜索（同端点）；
 * 条目 uid=mvk_{hash}，playerContent 委托 MusicCore mvk 分支（trackermv v2 接口 mkv 直链）。
 * 协议全部收敛在 MusicCore（复用 kgHeaders/gateway 签名基建），本类仅薄壳转发。
 */
public class KugouMv extends Spider {

    @Override
    public void init(Context context) {
        super.init(context);
        MusicCore.bindHost(this);
    }

    @Override
    public String homeContent(boolean filter) {
        return MusicCore.kgMvHomeContent(filter);
    }

    @Override
    public String homeVideoContent() {
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        return MusicCore.kgMvCategoryContent(tid, pg, extend);
    }

    @Override
    public String detailContent(List<String> ids) {
        return MusicCore.kgMvDetailContent(ids);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return MusicCore.kgMvSearchContent(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        return MusicCore.kgMvSearchContent(key, pg);
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
