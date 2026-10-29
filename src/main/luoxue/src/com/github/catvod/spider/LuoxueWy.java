package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪源·果果芸（key=luoxue_wy，聚合 API wy 平台）。 */
public class LuoxueWy extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "netease";
    }
}
