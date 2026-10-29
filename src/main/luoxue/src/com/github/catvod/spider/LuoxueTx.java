package com.github.catvod.spider;

import com.github.catvod.spider.music.LuoxueSpiderBase;

/** 落雪源·果果秋（key=luoxue_tx，聚合 API tx 平台）。 */
public class LuoxueTx extends LuoxueSpiderBase {

    @Override
    protected String platform() {
        return "qq";
    }
}
