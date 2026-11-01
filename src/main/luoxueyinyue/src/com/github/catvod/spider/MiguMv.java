package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.music.MusicCore;

import java.util.HashMap;
import java.util.List;

/**
 * 蜜映（key=guoguomigumv，style:"mv"）：咪咕 MV 站点源。
 * 推荐MV（recommend-mv 翻页）+ 华语/欧美/日韩热词分类（bmw/search/video）+ MV 搜索（同端点）；
 * 条目 uid=mvm_{contentId}，playerContent 委托 MusicCore mvm 分支
 * （resourceinfo.do resourceType=D → rateFormats[].url 拼 freevod.nf.migu.cn mp4 直链）。
 * 协议全部收敛在 MusicCore，本类仅薄壳转发。
 */
public class MiguMv extends Spider {

    @Override
    public void init(Context context) {
        super.init(context);
        MusicCore.bindHost(this);
    }

    @Override
    public String homeContent(boolean filter) {
        return MusicCore.mgMvHomeContent(filter);
    }

    @Override
    public String homeVideoContent() {
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        return MusicCore.mgMvCategoryContent(tid, pg, extend);
    }

    @Override
    public String detailContent(List<String> ids) {
        return MusicCore.mgMvDetailContent(ids);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return MusicCore.mgMvSearchContent(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        return MusicCore.mgMvSearchContent(key, pg);
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
