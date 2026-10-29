package com.github.catvod.spider;

import com.github.catvod.spider.music.MusicSpiderBase;

/**
 * 果果音乐·咪咕独立源（key=guoguoyinyue_mi，music-lib migu 蓝本）：
 * 热歌榜（全网热歌榜）/ 榜单目录（bmw rank-index 动态）。
 */
public class GuoguoyinyueMi extends MusicSpiderBase {

    @Override
    protected String platform() {
        return "migu";
    }
}
