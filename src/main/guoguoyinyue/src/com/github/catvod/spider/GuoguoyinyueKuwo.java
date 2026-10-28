package com.github.catvod.spider;

import com.github.catvod.spider.music.MusicSpiderBase;

/**
 * 果果音乐·酷我独立源（key=guoguoyinyue_kuwo，music-lib kuwo 蓝本）：
 * 热歌榜（kbangserver）/ 榜单目录（热歌·新歌·飙升）。
 */
public class GuoguoyinyueKuwo extends MusicSpiderBase {

    @Override
    protected String platform() {
        return "kuwo";
    }
}
