package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪音乐·小蜜（key=luoxueyinyue_mi，聚合 API mg 平台取流+官方兜底）。 */
public class LuoxueyinyueMi extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "migu";
    }
}
