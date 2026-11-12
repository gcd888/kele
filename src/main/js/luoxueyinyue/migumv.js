/**
 * migumv.js — 蜜映（咪咕 MV 站点源，catvod JsSpider 协议 JS 版）
 *
 * 移植自：kele/src/main/java/luoxueyinyue/src/com/github/catvod/spider/MiguMv.java
 *         + MusicCore.java mgMv*（recommend-mv 推荐翻页 / bmw/search/video 搜索 /
 *           resourceinfo.do resourceType=D 详情与取流，rateFormats[].url 拼 freevod.nf.migu.cn，
 *           HQ 优先） / playerContent MV 分支 / mgMvHeaders·MG_MV_SEED 基建（1:1 精确移植）。
 *
 * 站点 key：guoguomigumv（style:"mv"，见 guoju-api/java/果果音乐/果果音乐.json）。
 * 推荐MV（recommend-mv 翻页）+ 华语/欧美/日韩热词分类（bmw/search/video）+ MV 搜索（同端点）；
 * 条目 uid=mvm_{contentId}（18 位大整数，safeParse 保护精度），play 经 MusicCore mvm 分支
 * （resourceinfo.do resourceType=D → rateFormats[].url 拼 mp4 直链）。
 * 协议全部收敛在 lib/music_core_mv.js，本类仅薄壳转发。
 *
 * 宿主依赖：req/console；lib/crypto-js.js、lib/xhs_sign.js、lib/binutil.js。
 */

import { createMvCore } from './music_core_mv.js';

const core = createMvCore('[mgmv-js]');

export default {
    /** Java init：bindHost（日志桥接），JS 侧核心已自持日志，无需动作 */
    init(ext) {
        return '';
    },

    /** Java homeContent → MusicCore.mgMvHomeContent（推荐 + 三热词分类，无筛选） */
    home(filter) {
        return core.mgMvHomeContent();
    },

    /** Java homeVideoContent：恒空串 */
    homeVod() {
        return '';
    },

    /** Java categoryContent → MusicCore.mgMvCategoryContent（推荐走 recommend-mv，热词走 bmw 搜索） */
    category(tid, pg, filter, extend) {
        return core.mgMvCategoryContent(tid, pg, extend || {});
    },

    /** Java detailContent → MusicCore.mgMvDetailContent（resourceinfo.do resourceType=D 现查） */
    detail(ids) {
        return core.mgMvDetailContent(ids);
    },

    /** Java searchContent(key, quick[, pg]) → MusicCore.mgMvSearchContent（bmw/search/video v1.0） */
    search(key, quick, pg) {
        return core.mgMvSearchContent(key, pg == null || pg === '' ? '1' : pg);
    },

    /** Java playerContent → MusicCore.playerContent（mvm 分支；flag='果剧音乐'/'MV' 同一直链） */
    play(flag, id, vipFlags) {
        return core.mvPlay(flag, id);
    },

    /** Java action → MusicCore.action：action 分支均为聚合音乐源的歌单/扫码协议，MV 站源无需 → 恒空串 */
    action(action) {
        return '';
    },
};
