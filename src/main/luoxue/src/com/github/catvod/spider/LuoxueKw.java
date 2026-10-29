package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪源·果果蜗（key=luoxue_kw，聚合 API kw 平台）。 */
public class LuoxueKw extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "kuwo";
    }
}
