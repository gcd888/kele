package com.github.catvod.spider;

import com.github.catvod.spider.music.MusicSpiderBase;

/**
 * 果果音乐·汽水独立源（key=guoguoyinyue_shui）：
 * 热歌榜 / 榜单目录（官方内置：热歌·新歌·欧美·音乐人）。
 */
public class GuoguoyinyueShui extends MusicSpiderBase {

    @Override
    protected String platform() {
        return "soda";
    }
}
