package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪音乐·秋秋（key=luoxueyinyue_qiu，聚合 API tx 平台取流+官方兜底）。 */
public class LuoxueyinyueQiu extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "qq";
    }
}
