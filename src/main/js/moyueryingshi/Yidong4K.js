/**
 * Yidong4K.js — 移动4K（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/ysc/diy/摸鱼儿/readable_sources/com/github/catvod/spider/Yidong4K.java
 * （extends Cloud；字符串已全部内联解码；private synthetic $host$* 方法 = 真实逻辑）。
 *
 * 站点：vidsite.cloudseekr.com/vidsite/vs/* JSON API（POST application/json; charset=utf-8）。
 *  - home：写死 3 分类（1 电影 / 2 电视剧 / 3 动漫），仅 {class}（无 list/filters）；
 *  - category/search 共用 i(columnId, page, searchKey)：qryPageColumnVideo，
 *    cateIdList=[0,0,0]、pageSize=9；搜索 columnId=0（pageIndex 起翻）；
 *  - detail：addAccessRecord（code 必须 "000000"，否则"访问登记失败"）→ qryVideoDetail
 *    → resUrl 单链接交 Cloud.a/b（网盘取流清单）；
 *  - fprint：AbstractC0309x1.a = MD5 hex 小写，因子 "AiNewYiDong4K_" + now + "_" + nano。
 *
 * 与 Java 版的差异（壳协议约束，逻辑不变）：
 *  - FishCrypto.beginHostEntry/endHostEntry 包装、Init.init(context)、N1.d(vod)（混淆
 *    反射后处理，无法可靠还原）、AbstractC0280n1.p/q（行为埋点）直接丢弃；
 *  - Cloud 网盘取流 provider 层（Quark/Ali/UC/TianYi/YiDongYun/BaiDuPan/Pan123/
 *    XunleiPan/Pan115/GuangYa + 授权管理）不在本次 4 类移植范围：a(list)/b(list)
 *    等价于 Java 未配置网盘授权时 c(list) 空解析 → vod_play_from/url = ""；
 *  - System.nanoTime() → Date.now()+随机数（仅作 fprint 随机因子，md5 后语义等价）；
 *  - 继承的 Cloud.playerContent（网盘取流播放）未移植 → 不导出 play。
 *
 * 宿主依赖：req/console；lib/xhs_sign.js（md5Hex）。
 */

import { httpPost, bodyOf, vod, pageData, log } from './muCore.js';
import { md5Hex } from '../lib/xhs_sign.js';

const API_BASE = 'https://vidsite.cloudseekr.com/vidsite/vs/';

// 模块级状态（Java 实例字段 r：fingerprint，init 时生成）
let fingerprint = '';

/** Java Yidong4K.h()：fprint 为空才生成（init 保证非空，后续复用）。 */
function h() {
    if (!fingerprint) {
        const nano = Date.now() * 1000 + Math.floor(Math.random() * 1000000);
        fingerprint = md5Hex('AiNewYiDong4K_' + Date.now() + '_' + nano);
    }
    return fingerprint;
}

/** Java Yidong4K.k(method, json)：POST JSON，空/非法响应由上层 try 兜底（同 new JSONObject 抛错）。 */
function apiCall(method, json) {
    const headers = {
        'Origin': 'https://vidsite.cloudseekr.com',
        'Accept': 'application/json, text/plain, */*',
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36',
        'Referer': 'https://vidsite.cloudseekr.com/vid/app/',
        'Content-Type': 'application/json; charset=utf-8',
    };
    const res = httpPost(API_BASE + method, JSON.stringify(json), headers);
    return JSON.parse(bodyOf(res));
}

/** org.json optString(k) 语义：缺键/空 → ''。 */
function optStr(o, k) {
    const v = o ? o[k] : undefined;
    return v === undefined || v === null ? '' : String(v);
}

/** org.json optInt(k, dflt) 语义：缺键/非数字 → dflt。 */
function optInt(o, k, dflt) {
    const v = o ? o[k] : undefined;
    const n = typeof v === 'number' ? v : parseInt(v);
    return isNaN(n) ? dflt : n;
}

/** Java j(list)：data.list → vod 数组（id/title 均非空才收，remarks 恒 ""）。 */
function listOf(arr) {
    const out = [];
    if (!arr) return out;
    for (let i = 0; i < arr.length; i++) {
        const o = arr[i];
        if (!o) continue;
        const id = optStr(o, 'id');
        const title = optStr(o, 'title');
        if (!id || !title) continue;
        out.push(vod(id, title, optStr(o, 'appCoverUrl'), ''));
    }
    return out;
}

/** TextUtils.join("/", cateNameList)。 */
function joinCate(arr) {
    if (!arr) return '';
    const names = [];
    for (let i = 0; i < arr.length; i++) names.push(optStr(arr, i));
    return names.join('/');
}

// —— Cloud.a(list)/b(list)：网盘取流清单（Java：a=e(c(list),true) / b=e(c(list),false)）——
// c(list) 逐链接按域名识别 quark/uc/ali/tianyi/yidong/baidu/pan123/guangya/xunlei/115
// 类型后交对应 provider 解析文件清单（PlayGroup.from=分组名 / PlayGroup.url=清单）。
// JS 未移植 provider 层 → 等价于 Java 未配置网盘授权时的空解析：分组恒空 → join 为 ""。
function cloudGroups(links) {
    return [];
}

function playFromOf(links) {
    try { return cloudGroups(links).map(g => g.from).join('$$$'); } catch (e) { return ''; }
}

function playUrlOf(links) {
    try { return cloudGroups(links).map(g => g.url).join('$$$'); } catch (e) { return ''; }
}

function errDetail(msg) {
    return JSON.stringify({ list: [], msg: msg });
}

/** Java Yidong4K.i(columnId, page, searchKey)：分类/搜索共用列表（g.y 空态 / F+o 有数据态）。 */
function columnList(columnId, page, searchKey) {
    try {
        const cid = parseInt(columnId);
        if (isNaN(cid)) throw new Error('columnId'); // Java Integer.parseInt 抛错 → catch → 空页
        const pageIndex = Math.max(1, parseInt(page));
        const body = {
            columnId: cid,
            cateIdList: [0, 0, 0],
            pageIndex: pageIndex,
            pageSize: 9,
        };
        if (searchKey) body.searchKey = searchKey;
        const resp = apiCall('qryPageColumnVideo', body);
        const data = resp && resp.data;
        if (optStr(resp, 'code') === '000000' && data) {
            const items = listOf(data.list);
            if (items.length === 0) return JSON.stringify({ list: [] });
            return pageData(items, pageIndex, optInt(data, 'pages', pageIndex), 9, optInt(data, 'total', items.length));
        }
        return JSON.stringify({ list: [] });
    } catch (e) {
        return JSON.stringify({ list: [] });
    }
}

/** Java $host$6c1ebb3cb60973b4：登记访问 → 详情 → 组装 vod（字段按 p001b.k 声明序输出）。 */
function detailContent(list) {
    try {
        const id = list[0];
        const videoId = parseInt(id);
        if (isNaN(videoId)) throw new Error('id');
        const fp = h();
        const reg = apiCall('addAccessRecord', { videoId: videoId, fprint: fp });
        if (optStr(reg, 'code') !== '000000') return errDetail('访问登记失败');
        const resp = apiCall('qryVideoDetail', { videoId: videoId, fprint: fp });
        if (optStr(resp, 'code') !== '000000') return errDetail('详情获取失败');
        const data = resp && resp.data;
        if (!data) return errDetail('详情数据为空');
        const resUrl = optStr(data, 'resUrl');
        const links = resUrl ? [resUrl] : [];
        const v = {};
        v.type_name = joinCate(data.cateNameList);
        v.vod_id = data.id === undefined || data.id === null ? String(id) : String(data.id);
        v.vod_name = optStr(data, 'title');
        v.vod_pic = optStr(data, 'appCoverUrl');
        v.vod_remarks = optStr(data, 'score');
        v.vod_actor = optStr(data, 'actor');
        v.vod_director = optStr(data, 'director');
        v.vod_content = optStr(data, 'remark');
        v.vod_play_from = playFromOf(links);
        v.vod_play_url = playUrlOf(links);
        return JSON.stringify({ list: [v] });
    } catch (e) {
        return errDetail('详情获取失败');
    }
}

export default {
    init(ext) {
        // Java super.init(context, str)（网盘授权装配，未移植）+ h()
        h();
        log('init ok fprint=' + fingerprint.substring(0, 8) + '...');
        return '';
    },

    home(filter) {
        // $host$1b26b551389a5dab：g.a(classes) → 仅 {class}
        const classes = [
            { type_id: '1', type_name: '电影' },
            { type_id: '2', type_name: '电视剧' },
            { type_id: '3', type_name: '动漫' },
        ];
        return JSON.stringify({ class: classes });
    },

    category(tid, pg, filter, extend) {
        // $host$f9d7235748f992e0 → i(str, str2, "")
        return columnList(String(tid), String(pg === undefined || pg === null ? 1 : pg), '');
    },

    detail(id) {
        return detailContent([String(id)]);
    },

    search(key, quick, pg) {
        // $host$0b14bd34f5ca9ec8（首页）/ $host$5abcbf7c29fbb7fe（翻页）→ i("0", page, key)
        const page = pg === undefined || pg === null || Number(pg) <= 1 ? '1' : String(pg);
        return columnList('0', page, key);
    },
};
