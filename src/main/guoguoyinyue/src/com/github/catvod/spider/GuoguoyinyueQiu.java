package com.github.catvod.spider;

import com.github.catvod.spider.music.MusicSpiderBase;

/**
 * 果果音乐·QQ 音乐独立源（key=guoguoyinyue_qiu）：
 * 热歌榜 / 榜单目录（热歌·新歌·流行指数）；歌单经 3 段 id（扫码推送/歌单详情）。
 */
public class GuoguoyinyueQiu extends MusicSpiderBase {

    @Override
    protected String platform() {
        return "qq";
    }
}
