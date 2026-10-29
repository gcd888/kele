package com.github.catvod.spider;

import android.content.Context;

import java.util.List;

import com.github.catvod.spider.music.LuoxueApi;
import com.github.catvod.spider.music.LuoxueSpiderBase;
import com.github.catvod.spider.music.MusicCore;
import com.github.catvod.spider.music.lx.LxScript;
import com.github.catvod.spider.music.lx.QuickJsRuntime;

/**
 * 洛雪音源脚本站（musics 下每个 JS 一个源，ext 指向脚本文件）。
 * 目录层全量复用 MusicCore 聚合链路（分类与之前一致）；
 * 取流优先跑 LX 脚本 musicUrl，失败回退洛雪聚合 API，再回退官方 stream。
 */
public class LxSource extends LuoxueSpiderBase {

    private LxScript lx;

    @Override
    protected String platform() {
        return "all";
    }

    @Override
    public void init(Context context, String ext) {
        super.init(context, ext);
        if (ext != null && !ext.trim().isEmpty()) {
            String name = getClass().getSimpleName();
            lx = new LxScript(context, ext, name, QuickJsRuntime::new);
        }
    }

    @Override
    public void destroy() {
        if (lx != null) {
            lx.close();
            lx = null;
        }
        super.destroy();
    }

    @Override
    protected String lxStream(String platform, String songId) {
        if (lx == null) return "";
        String src = LuoxueApi.mapSource(platform);
        if (src == null || src.isEmpty()) return "";
        return lx.musicUrl(src, songId);
    }
}
