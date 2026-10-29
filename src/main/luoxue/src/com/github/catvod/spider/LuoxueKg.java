package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪源·果果枸（key=luoxue_kg，聚合 API kg 平台）。 */
public class LuoxueKg extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "kugou";
    }
}
