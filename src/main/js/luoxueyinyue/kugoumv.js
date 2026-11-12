/**
 * kugoumv.js — 枸映（酷狗 MV 站点源，catvod JsSpider 协议 JS 版）
 *
 * 移植自：kele/src/main/java/luoxueyinyue/src/com/github/catvod/spider/KugouMv.java
 *         + MusicCore.java kgMv*（mobilecdn v3/search/mv 热词分类即搜索、KG_MV_CACHE 详情缓存）
 *           /kgMvUrl（gateway + x-router=trackermv.kugou.com，signature=salt+sorted(k=v)+salt）
 *           /playerContent MV 分支 / kgMid·kgMd5 基建（1:1 精确移植）。
 *
 * 站点 key：guoguogoumv（style:"mv"，见 guoju-api/java/果果音乐/果果音乐.json）。
 * 热门/华语/欧美/日韩四热词分类（mobilecdn v3/search/mv）+ MV 搜索（同端点）；
 * 条目 uid=mvk_{hash}，play 经 MusicCore mvk 分支（trackermv v2 接口 mkv 直链，key 必须参与签名排序）。
 * 协议全部收敛在 lib/music_core_mv.js，本类仅薄壳转发。
 *
 * 宿主依赖：req/console；lib/crypto-js.js、lib/xhs_sign.js、lib/binutil.js。
 */

import { createMvCore } from './music_core_mv.js';

const core = createMvCore('[kgmv-js]');

export default {
    /** Java init：bindHost（日志桥接），JS 侧核心已自持日志，无需动作 */
    init(ext) {
        return '';
    },

    /** Java homeContent → MusicCore.kgMvHomeContent（四热词分类，无筛选） */
    home(filter) {
        return core.kgMvHomeContent();
    },

    /** Java homeVideoContent：恒空串 */
    homeVod() {
        return '';
    },

    /** Java categoryContent → MusicCore.kgMvCategoryContent（tid 解码热词 → 搜索） */
    category(tid, pg, filter, extend) {
        return core.kgMvCategoryContent(tid, pg, extend || {});
    },

    /** Java detailContent → MusicCore.kgMvDetailContent（hash → 列表缓存，冷未命中返回空） */
    detail(ids) {
        return core.kgMvDetailContent(ids);
    },

    /** Java searchContent(key, quick[, pg]) → MusicCore.kgMvSearchContent（mobilecdn v3/search/mv） */
    search(key, quick, pg) {
        return core.kgMvSearchContent(key, pg == null || pg === '' ? '1' : pg);
    },

    /** Java playerContent → MusicCore.playerContent（mvk 分支；flag='果剧音乐'/'MV' 同一直链） */
    play(flag, id, vipFlags) {
        return core.mvPlay(flag, id);
    },

    /** Java action → MusicCore.action：action 分支均为聚合音乐源的歌单/扫码协议，MV 站源无需 → 恒空串 */
    action(action) {
        return '';
    },
};
