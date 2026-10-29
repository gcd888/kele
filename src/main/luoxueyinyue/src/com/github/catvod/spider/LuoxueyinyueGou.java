package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪音乐·小枸（key=luoxueyinyue_gou，聚合 API kg 平台取流+官方兜底）。 */
public class LuoxueyinyueGou extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "kugou";
    }
}
