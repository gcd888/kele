package com.github.catvod.spider;

import com.github.catvod.spider.music.MusicSpiderBase;

/**
 * 果果音乐·酷狗独立源（key=guoguoyinyue_gou）：
 * 热歌榜（TOP榜）/ 榜单目录（mobilecdn rank/list 动态）。
 */
public class GuoguoyinyueGou extends MusicSpiderBase {

    @Override
    protected String platform() {
        return "kugou";
    }
}
