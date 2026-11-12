/**
 * neteasemv.js — 芸映（网易 MV 站点源，catvod JsSpider 协议 JS 版）
 *
 * 移植自：kele/src/main/java/luoxueyinyue/src/com/github/catvod/spider/NeteaseMv.java
 *         + MusicCore.java mvHomeContent/mvCategoryContent/mvSearchContent/mvDetailContent
 *           /playerContent MV 分支 / weapi·linuxEparams·neHeaders 基建（1:1 精确移植）。
 *
 * 站点 key：guoguoyunying（style:"mv"，见 guoju-api/java/果果音乐/果果音乐.json）。
 * 推荐/排行榜/最新/全部四分类 + MV 搜索（weapi type=1004）；
 * 条目 uid=mv_{mvid}，play 经 MusicCore mv 分支（weapi song/enhance/play/mv/url，mp4 直链，
 * 1080 无档降级 720/480；音频态出声/MV 态铺视频，同一直链切态零二次取流）。
 * 协议全部收敛在 lib/music_core_mv.js（复用 weapi/neHeaders 基建），本类仅薄壳转发。
 *
 * 宿主依赖：req/console；lib/crypto-js.js、lib/xhs_sign.js、lib/binutil.js。
 */

import { createMvCore } from './music_core_mv.js';

const core = createMvCore('[nemv-js]');

/** Java boolean filter 兼容（壳侧可能传 true/false/1/'1'） */
function toBool(v) {
    return v === true || v === 1 || v === 'true' || v === '1';
}

export default {
    /** Java init：bindHost（日志桥接），JS 侧核心已自持日志，无需动作 */
    init(ext) {
        return '';
    },

    /** Java homeContent → MusicCore.mvHomeContent */
    home(filter) {
        return core.mvHomeContent(toBool(filter));
    },

    /** Java homeVideoContent：恒空串 */
    homeVod() {
        return '';
    },

    /** Java categoryContent → MusicCore.mvCategoryContent */
    category(tid, pg, filter, extend) {
        return core.mvCategoryContent(tid, pg, extend || {});
    },

    /** Java detailContent → MusicCore.mvDetailContent */
    detail(ids) {
        return core.mvDetailContent(ids);
    },

    /** Java searchContent(key, quick[, pg]) → MusicCore.mvSearchContent（无 pg 时页码 1） */
    search(key, quick, pg) {
        return core.mvSearchContent(key, pg == null || pg === '' ? '1' : pg);
    },

    /** Java playerContent → MusicCore.playerContent（MV 分支；flag='果剧音乐'/'MV' 同一直链） */
    play(flag, id, vipFlags) {
        return core.mvPlay(flag, id);
    },

    /** Java action → MusicCore.action：action 分支均为聚合音乐源的歌单/扫码协议，MV 站源无需 → 恒空串 */
    action(action) {
        return '';
    },
};
