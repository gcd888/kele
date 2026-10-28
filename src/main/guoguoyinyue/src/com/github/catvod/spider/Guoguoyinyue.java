package com.github.catvod.spider;

import com.github.catvod.spider.music.MusicSpiderBase;

/**
 * 果果音乐·聚合源（key=guoguoyinyue）：搜索/扫码点歌=六平台交错；
 * 主页=网易云歌单（分类筛选）+ 热歌榜；推荐=网易云精品歌单。
 */
public class Guoguoyinyue extends MusicSpiderBase {

    @Override
    protected String platform() {
        return "all";
    }
}
