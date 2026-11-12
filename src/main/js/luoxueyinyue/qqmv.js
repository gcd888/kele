/**
 * qqmv.js — 秋映（QQ 音乐 MV 站点源，catvod JsSpider 协议 JS 版）
 *
 * 移植自：kele/src/main/java/luoxueyinyue/src/com/github/catvod/spider/QqMv.java
 *         + MusicCore.java qqMv*（GetAllocTag/GetAllocMvInfo/client_search_cp t=12/
 *           get_video_info_batch）/qqMvUrl（gosrf.Stream.MvUrlProxy.GetMvUrls）
 *           /playerContent MV 分支 / qqComm·qqFcgPost 基建（1:1 精确移植）。
 *
 * 站点 key：guoguoqiumv（style:"mv"，见 guoju-api/java/果果音乐/果果音乐.json）。
 * MV 库（GetAllocMvInfo，地区/版本筛选）+ MV 搜索（client_search_cp t=12）；
 * 条目 uid=mvq_{vid}，play 经 MusicCore mvq 分支（gosrf MvUrlProxy mp4 直链，mp4 多档取末档 https）。
 * 协议全部收敛在 lib/music_core_mv.js，本类仅薄壳转发。
 *
 * 宿主依赖：req/console；lib/crypto-js.js、lib/xhs_sign.js、lib/binutil.js。
 */

import { createMvCore } from './music_core_mv.js';

const core = createMvCore('[qqmv-js]');

/** Java boolean filter 兼容（壳侧可能传 true/false/1/'1'） */
function toBool(v) {
    return v === true || v === 1 || v === 'true' || v === '1';
}

export default {
    /** Java init：bindHost（日志桥接），JS 侧核心已自持日志，无需动作 */
    init(ext) {
        return '';
    },

    /** Java homeContent → MusicCore.qqMvHomeContent（GetAllocTag 动态筛选，失败落内置默认） */
    home(filter) {
        return core.qqMvHomeContent(toBool(filter));
    },

    /** Java homeVideoContent：恒空串 */
    homeVod() {
        return '';
    },

    /** Java categoryContent → MusicCore.qqMvCategoryContent（仅 mvq_all，GetAllocMvInfo offset 翻页） */
    category(tid, pg, filter, extend) {
        return core.qqMvCategoryContent(tid, pg, extend || {});
    },

    /** Java detailContent → MusicCore.qqMvDetailContent（get_video_info_batch 补全 desc） */
    detail(ids) {
        return core.qqMvDetailContent(ids);
    },

    /** Java searchContent(key, quick[, pg]) → MusicCore.qqMvSearchContent（client_search_cp t=12） */
    search(key, quick, pg) {
        return core.qqMvSearchContent(key, pg == null || pg === '' ? '1' : pg);
    },

    /** Java playerContent → MusicCore.playerContent（mvq 分支；flag='果剧音乐'/'MV' 同一直链） */
    play(flag, id, vipFlags) {
        return core.mvPlay(flag, id);
    },

    /** Java action → MusicCore.action：action 分支均为聚合音乐源的歌单/扫码协议，MV 站源无需 → 恒空串 */
    action(action) {
        return '';
    },
};
