package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.music.MusicCore;

import java.util.HashMap;
import java.util.List;

/**
 * 秋映（key=guoguoqiumv，style:"mv"）：QQ 音乐 MV 站点源。
 * MV 库（GetAllocMvInfo，地区/版本筛选）+ MV 搜索（client_search_cp t=12）；
 * 条目 uid=mvq_{vid}，playerContent 委托 MusicCore mvq 分支（gosrf MvUrlProxy mp4 直链）。
 * 协议全部收敛在 MusicCore（复用 qqFcgPost/qqComm 基建），本类仅薄壳转发。
 */
public class QqMv extends Spider {

    @Override
    public void init(Context context) {
        super.init(context);
        MusicCore.bindHost(this);
    }

    @Override
    public String homeContent(boolean filter) {
        return MusicCore.qqMvHomeContent(filter);
    }

    @Override
    public String homeVideoContent() {
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        return MusicCore.qqMvCategoryContent(tid, pg, extend);
    }

    @Override
    public String detailContent(List<String> ids) {
        return MusicCore.qqMvDetailContent(ids);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return MusicCore.qqMvSearchContent(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        return MusicCore.qqMvSearchContent(key, pg);
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
