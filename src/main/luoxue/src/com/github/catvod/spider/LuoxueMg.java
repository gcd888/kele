package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪源·果果蜜（key=luoxue_mg，聚合 API mg 平台）。 */
public class LuoxueMg extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "migu";
    }
}
