package com.github.catvod.spider;

import com.github.catvod.spider.music.MusicSpiderBase;

/** 落雪音乐·果果水（key=luoxueyinyue_shui）：汽水平台洛雪聚合不支持，走官方取流。 */
public class LuoxueyinyueShui extends MusicSpiderBase {

    @Override
    protected String platform() {
        return "soda";
    }
}
