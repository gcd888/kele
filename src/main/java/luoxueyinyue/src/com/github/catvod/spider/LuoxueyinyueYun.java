package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪音乐·芸朵（key=luoxueyinyue_yun，聚合 API wy 平台取流+官方兜底）。 */
public class LuoxueyinyueYun extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "netease";
    }
}
