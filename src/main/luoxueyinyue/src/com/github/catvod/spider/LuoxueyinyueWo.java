package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪音乐·果果蜗（key=luoxueyinyue_wo，聚合 API kw 平台取流+官方兜底）。 */
public class LuoxueyinyueWo extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "kuwo";
    }
}
