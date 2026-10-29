package com.github.catvod.spider;

import com.github.catvod.spider.music.HuanleSpiderBase;

/**
 * 欢乐K歌源（key=huanleyinyue）：
 * 听歌=MusicCore 官方多平台聚合（原唱+歌词）；K歌画面=官方 MV 为空时哔哩「歌名 MV」兜底；
 * 伴奏=公开免费上游缺失，不下发 accompany 字段，壳侧优雅降级提示。
 */
public class Huanleyinyue extends HuanleSpiderBase {

    @Override
    protected String platform() {
        return "all";
    }
}
