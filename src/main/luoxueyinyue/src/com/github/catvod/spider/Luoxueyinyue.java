package com.github.catvod.spider;

import com.github.catvod.spider.music.MusicSpiderBase;

/**
 * 落雪音乐·聚合源（key=guoguoyinyue）：搜索/扫码点歌=六平台交错；
 * 主页=芸朵歌单（分类筛选）+ 热歌榜；推荐=芸朵精品歌单。
 */
public class Luoxueyinyue extends MusicSpiderBase {

    @Override
    protected String platform() {
        return "all";
    }
}
