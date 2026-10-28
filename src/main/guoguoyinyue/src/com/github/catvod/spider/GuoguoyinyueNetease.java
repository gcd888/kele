package com.github.catvod.spider;

import com.github.catvod.spider.music.MusicSpiderBase;

/**
 * 果果音乐·网易云独立源（key=guoguoyinyue_netease）：
 * 歌单（分类筛选+分页）/ 热歌榜 / 榜单目录（热歌·新歌·飙升）。
 */
public class GuoguoyinyueNetease extends MusicSpiderBase {

    @Override
    protected String platform() {
        return "netease";
    }
}
