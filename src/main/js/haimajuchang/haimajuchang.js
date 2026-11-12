/**
 * haimajuchang.js — 海马剧场（JS 版，catvod JsSpider 协议）
 *
 * 移植自：kele/src/main/java/haimajuchang/src/com/github/catvod/spider/Haimajuchang.java
 * 蓝本：case/hmjc-flutter（河马剧场 App 逆向）。
 *
 * 协议要点（2026-11-06 实测，与 jar 版一致）：
 *  - 端点：POST https://{domain}/free-video-portal/portal/{1103|1125|1132|1133|1803}
 *  - 请求头：datas = 设备公参 JSON；明文通道带 wetruwtty 固定值。
 *  - 响应 {code, msg, data}；data 可能为 AES-128-CBC(hex) 密文
 *    （key=dzkjgfyxgshylgzm iv=apiupdownedcrypt，PKCS5Padding）。
 *  - 首次必须 1103 注册匿名设备拿 userId（utdid/userId 经 local 持久化，优于 jar 版进程内单例）。
 *
 * 分类：热播榜(65)/新剧热播榜(13)/漫剧热播榜(78)/排行榜(14+频道68-71+经典好剧17)。
 * 分页：1125 游标分页（pageFlag/fromColumnId/fromItemId/lastColumnStyle 原样回传）。
 *
 * 宿主依赖（壳 JsSpider 注入）：req/local/console；AES 解密走 aesX 桥（hex 先转 base64）。
 */

const DOMAINS = ['freevideo.zqqds.cn', 'freevideo.dzkjk.cn'];
const WETRUWTTY = 'mhdfiheowjfcslkjfwojo636';
const AES_KEY = 'dzkjgfyxgshylgzm';
const AES_IV = 'apiupdownedcrypt';
const APP_VERSION = '1.4.0';
const PNAME = 'com.dz.hmjc';
const PLAY_UA = 'Mozilla/5.0 (Linux; Android 14) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Mobile Safari/537.36';

const GROUP_HOT = '65';
const GROUP_NEW = '13';
const GROUP_COMIC = '78';
const GROUP_RANK = '14';
const GROUP_CLASSIC = '17';

const LKEY_UTDID = 'haima_utdid';
const LKEY_USERID = 'haima_userid';
const LKEY_CURSORS = 'haima_cursors';

const log = (...a) => { try { console.log('[hm-js]', ...a); } catch (e) {} };

// ============================ 工具 ============================

/** hex → base64（壳 aesX 桥只收 base64/plain 输入；查表法，QuickJS 兼容） */
const HEX2B64_TAB = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';
function hexToB64(hex) {
    let out = '';
    let bits = 0, acc = 0;
    for (let i = 0; i < hex.length; i++) {
        const v = parseInt(hex.charAt(i), 16);
        if (isNaN(v)) return '';
        acc = (acc << 4) | v;
        bits += 4;
        if (bits >= 6) {
            bits -= 6;
            out += HEX2B64_TAB.charAt((acc >> bits) & 0x3f);
        }
    }
    if (bits > 0) out += HEX2B64_TAB.charAt((acc << (6 - bits)) & 0x3f);
    return out;
}

function cursors() {
    try {
        const raw = local.get(LKEY_CURSORS, '');
        return raw ? JSON.parse(raw) : {};
    } catch (e) { return {}; }
}

function pageData(items, page, hasMore) {
    return JSON.stringify({
        list: items,
        page: page,
        pagecount: hasMore ? page + 1 : page,
        limit: 20,
        total: 0,
    });
}

function joinStrings(arr, sep) {
    if (!arr) return '';
    const out = [];
    for (let i = 0; i < arr.length; i++) {
        const s = String(arr[i] == null ? '' : arr[i]).trim();
        if (s) out.push(s);
    }
    return out.join(sep);
}

// ============================ 设备注册（1103） ============================

function newUtdid() {
    const chars = 'abcdefghijklmnopqrstuvwxyz0123456789';
    let s = 'tvbox';
    for (let i = 0; i < 16; i++) s += chars.charAt(Math.floor(Math.random() * chars.length));
    return s;
}

function getUtdid() {
    let u = local.get(LKEY_UTDID, '');
    if (!u) { u = newUtdid(); local.set(LKEY_UTDID, u); }
    return u;
}

function devHeadersJson() {
    const utdid = getUtdid();
    const userId = local.get(LKEY_USERID, '');
    const now = String(Date.now());
    return JSON.stringify({
        version: APP_VERSION,
        pname: PNAME,
        channelCode: 'Google',
        utdidTmp: utdid,
        token: '',
        utdid: utdid,
        os: 'android',
        osv: 'Android 14',
        brand: 'android',
        model: 'tvbox',
        manu: 'android',
        userId: userId,
        launch: 'shortcut',
        mchid: 'Google',
        nchid: 'Google',
        session1: utdid,
        session2: now,
        oaid: '',
        imei: '',
        startScene: 'shortcut',
        installTime: now,
        p: 9,
    });
}

let regPromise = null;

function ensureRegistered() {
    if (local.get(LKEY_USERID, '')) return;
    if (regPromise) return regPromise;
    regPromise = (function () {
        let lastErr = '';
        for (let i = 0; i < DOMAINS.length; i++) {
            const domain = DOMAINS[i];
            try {
                const data = request(domain, '1103', {
                    oaid: '',
                    userAgent: 'Flutter/' + APP_VERSION,
                    requestType: 1,
                    activeType: 1,
                    isFirstLaunch: true,
                    todayLaunchNums: 1,
                    launchTime: Date.now(),
                });
                let uid = '';
                const userInfo = data && data.userInfoVo;
                if (userInfo && userInfo.userId) uid = String(userInfo.userId);
                if (!uid && data && data.userId) uid = String(data.userId);
                if (!uid) throw new Error('1103 empty userId');
                local.set(LKEY_USERID, uid);
                log('register ok userId=' + uid);
                return;
            } catch (e) {
                lastErr = e && e.message || String(e);
                log('register FAIL domain=' + domain + ' : ' + lastErr);
            }
        }
        throw new Error('register failed: ' + lastErr);
    })();
    return regPromise;
}

// ============================ HTTP ============================

function post(domain, apiPath, body) {
    const t0 = Date.now();
    const res = req('https://' + domain + '/free-video-portal/portal/' + apiPath, {
        method: 'post',
        headers: {
            'Content-Type': 'application/json',
            'datas': devHeadersJson(),
            'wetruwtty': WETRUWTTY,
        },
        data: body,
        postType: 'json',
        timeout: 30000,
    });
    const result = res.content || '';
    log('http POST ' + apiPath + ' len=' + result.length + ' cost=' + (Date.now() - t0) + 'ms');
    return result;
}

function decryptHex(hex) {
    const b64 = hexToB64(hex);
    if (!b64) throw new Error('bad hex');
    const out = aesX('AES/CBC/PKCS5', false, b64, true, AES_KEY, AES_IV, false);
    if (!out) throw new Error('aes decrypt empty');
    return out;
}

/** 业务请求：明文 JSON 通道；data 为 hex 密文时自动解密。 */
function request(domain, apiPath, params) {
    const raw = post(domain, apiPath, params || {});
    let env;
    try { env = JSON.parse(raw); } catch (e) { throw new Error(apiPath + ' 非JSON响应'); }
    if ((env.code | 0) !== 0) throw new Error(apiPath + ' code=' + env.code + ' msg=' + (env.msg || ''));
    const data = env.data;
    if (typeof data === 'string') {
        const s = data;
        if (!s) return {};
        if (/^[0-9a-fA-F]+$/.test(s) && s.length % 32 === 0) {
            try { return JSON.parse(decryptHex(s)); }
            catch (e) { log(apiPath + ' data 解密失败，按明文兜底'); }
        }
        try { return JSON.parse(s); } catch (e) { return {}; }
    }
    return (data && typeof data === 'object') ? data : env;
}

/** 统一入口：主域失败自动切备用域。同步环境无并发注册问题（JsSpider 单线程执行器）。 */
let registered = false;
function api(apiPath, params) {
    if (!registered) { ensureRegistered(); registered = true; }
    let lastErr = null;
    for (let i = 0; i < DOMAINS.length; i++) {
        try { return request(DOMAINS[i], apiPath, params); }
        catch (e) { lastErr = e; log('api ' + apiPath + ' FAIL domain=' + DOMAINS[i] + ' : ' + (e && e.message || e)); }
    }
    throw lastErr || new Error(apiPath + ' all domains failed');
}

// ============================ 数据解析 ============================

function dramaCards(videoData) {
    const out = [];
    if (!videoData) return out;
    for (let i = 0; i < videoData.length; i++) {
        const o = videoData[i];
        if (!o) continue;
        const id = String(o.bookId == null ? '' : o.bookId);
        const name = String(o.bookName == null ? '' : o.bookName).trim();
        if (!id || !name) continue;
        let cover = String(o.coverWap || '');
        if (!cover) cover = String(o.coverCutWap || '');
        if (!cover) cover = String(o.coverUrl || '');
        let remark = String(o.finishStatusCn || '');
        if (!remark) {
            const num = o.updateNum | 0;
            if (num > 0) remark = '全' + num + '集';
        }
        out.push({
            vod_id: id,
            vod_name: name,
            vod_pic: cover,
            vod_remarks: remark,
            vod_actor: joinStrings(o.bookTags, ' '),
            vod_content: String(o.introduction || ''),
        });
    }
    // 去重（保持顺序）
    const seen = {};
    const uniq = [];
    for (let i = 0; i < out.length; i++) {
        if (seen[out[i].vod_id]) continue;
        seen[out[i].vod_id] = 1;
        uniq.push(out[i]);
    }
    return uniq;
}

/** 1125 剧场页 → 展平 columnData[].videoData */
function theatreItems(data) {
    const out = [];
    const cols = data && data.columnData;
    if (!cols) return out;
    for (let i = 0; i < cols.length; i++) {
        if (!cols[i]) continue;
        const items = dramaCards(cols[i].videoData);
        for (let j = 0; j < items.length; j++) out.push(items[j]);
    }
    return out;
}

function theatreParams(tid, filterValue, page) {
    const params = {};
    if (tid === 'haima-rank') {
        if (filterValue === GROUP_CLASSIC) {
            params.channelGroupId = GROUP_CLASSIC;
        } else {
            params.channelGroupId = GROUP_RANK;
            let ch = 68;
            const n = parseInt(filterValue || '68', 10);
            if (!isNaN(n)) ch = n;
            params.channelId = ch;
        }
    } else if (tid === 'haima-new') {
        params.channelGroupId = GROUP_NEW;
    } else if (tid === 'haima-comic') {
        params.channelGroupId = GROUP_COMIC;
    } else {
        params.channelGroupId = GROUP_HOT;
        if (filterValue) {
            const n = parseInt(filterValue, 10);
            if (!isNaN(n)) params.channelId = n;
        }
    }
    // 游标分页：下一页原样回传 pageFlag 等字段
    if (page > 1) {
        const cur = cursors()[tid + '|' + page];
        if (cur) {
            for (const k in cur) params[k] = cur[k];
        }
    }
    return params;
}

function saveCursor(tid, page, data) {
    try {
        if (!data.hasMore) return;
        const all = cursors();
        const cur = {};
        if (data.pageFlag !== undefined && data.pageFlag !== null) cur.pageFlag = data.pageFlag;
        if (data.fromColumnId) cur.fromColumnId = data.fromColumnId;
        if (data.fromItemId) cur.fromItemId = data.fromItemId;
        if (data.lastColumnStyle !== undefined && data.lastColumnStyle !== null) cur.lastColumnStyle = data.lastColumnStyle;
        if (Object.keys(cur).length) { all[tid + '|' + (page + 1)] = cur; local.set(LKEY_CURSORS, JSON.stringify(all)); }
    } catch (e) {}
}

// ============================ Spider 协议 ============================

export default {
    init(cfg) {
        // ext：字符串或对象；本源无外部配置需求
        log('init');
    },

    home(filter) {
        try {
            const hotChannels = [
                ['精选', '427'], ['穿越', '432'], ['重生', '429'], ['古装', '428'], ['言情', '431'],
                ['强者回归', '433'], ['萌宝', '435'], ['伦理', '430'], ['超能', '437'], ['后悔流', '434'],
                ['修仙', '436'], ['年代', '440'], ['悬疑', '441'], ['奇幻', '439'],
            ];
            const hotValues = [{ n: '全部', v: '' }].concat(hotChannels.map(function (c) { return { n: c[0], v: c[1] }; }));
            const ranks = [['热播榜', '68'], ['飙升榜', '69'], ['新剧榜', '70'], ['热搜榜', '71'], ['经典好剧', GROUP_CLASSIC]];
            return JSON.stringify({
                class: [
                    { type_id: 'haima-hot', type_name: '热播榜' },
                    { type_id: 'haima-new', type_name: '新剧热播榜' },
                    { type_id: 'haima-comic', type_name: '漫剧热播榜' },
                    { type_id: 'haima-rank', type_name: '排行榜' },
                ],
                filters: {
                    'haima-hot': [{ key: 'ch', name: '频道', value: hotValues }],
                    'haima-rank': [{ key: 'rank', name: '榜单', value: ranks.map(function (r) { return { n: r[0], v: r[1] }; }) }],
                },
            });
        } catch (e) {
            log('home FAIL ' + (e && e.message || e));
            return '';
        }
    },

    homeVod() {
        try {
            const d = api('1125', {});
            const items = theatreItems(d);
            log('homeVod done items=' + items.length);
            return pageData(items, 1, false);
        } catch (e) {
            log('homeVod FAIL ' + (e && e.message || e));
            return '';
        }
    },

    category(tid, pg, filter, extend) {
        let page = 1;
        try { page = Math.max(1, parseInt(String(pg == null ? '1' : pg).trim(), 10) || 1); } catch (e) {}
        try {
            let fv = '';
            if (extend) fv = extend['rank'] !== undefined && extend['rank'] !== null ? extend['rank'] : (extend['ch'] || '');
            log('category enter tid=' + tid + ' pg=' + page + ' filter=' + fv);
            const params = theatreParams(tid, fv, page);
            const d = api('1125', params);
            const items = theatreItems(d);
            const hasMore = !!(d && d.hasMore);
            saveCursor(tid, page, d);
            log('category done tid=' + tid + ' page=' + page + ' items=' + items.length + ' more=' + hasMore);
            return pageData(items, page, hasMore);
        } catch (e) {
            log('category FAIL tid=' + tid + ' : ' + (e && e.message || e));
            return pageData([], page, false);
        }
    },

    detail(id) {
        try {
            const bookId = String(id == null ? '' : id);
            log('detail enter bookId=' + bookId);
            const d = api('1132', { bookId: bookId, chapterMin: 0, chapterMax: 9999 });
            const cl = d && d.chapterList;
            if (!cl || !cl.length) throw new Error('分集目录为空');
            const ordered = cl.slice().sort(function (a, b) {
                return ((a && a.chapterIndex) | 0) - ((b && b.chapterIndex) | 0);
            });
            const eps = [];
            for (let i = 0; i < ordered.length; i++) {
                const ep = ordered[i];
                if (!ep) continue;
                const cid = String(ep.chapterId || '');
                if (!cid) continue;
                let name = String(ep.chapterName || '').trim();
                if (!name) name = '第' + (ep.chapterIndex | 0) + '集';
                eps.push(name + '$' + bookId + '-' + cid);
            }
            let remark = String(d.finishStatusCn || '');
            if (!remark) remark = '全' + eps.length + '集';
            const v = {
                vod_id: bookId,
                vod_name: String(d.bookName || ''),
                vod_pic: String(d.coverWap || d.coverUrl || ''),
                vod_remarks: remark,
                vod_actor: joinStrings(d.bookTags, ' '),
                vod_content: String(d.introduction || ''),
                vod_play_from: '海马剧场',
                vod_play_url: eps.join('#'),
            };
            log('detail done bookId=' + bookId + ' episodes=' + eps.length);
            return JSON.stringify({ list: [v] });
        } catch (e) {
            log('detail FAIL ' + (e && e.message || e));
            return '';
        }
    },

    play(flag, id) {
        try {
            // id = bookId-chapterId
            const s = String(id || '');
            const at = s.indexOf('-');
            if (at <= 0) throw new Error('非法播放 id: ' + s);
            const bookId = s.substring(0, at);
            const chapterId = s.substring(at + 1);
            log('play enter bookId=' + bookId + ' chapterId=' + chapterId);
            const d = api('1133', {
                bookId: bookId,
                chapterId: chapterId,
                unClockType: 'pay',
                confirmPay: 1,
                autoPayFlag: false,
            });
            const ci = d && d.chapterInfo;
            if (!ci || !ci.length) throw new Error('取流为空');
            const ep = ci[0];
            let content = ep && ep.content && typeof ep.content === 'object' ? ep.content : (ep || {});
            const url = firstUrl(content);
            if (!url) throw new Error('无可用播放地址');
            log('play done url=' + url.slice(0, 120));
            return JSON.stringify({
                parse: 0,
                playUrl: '',
                url: url,
                header: { 'User-Agent': PLAY_UA },
            });
        } catch (e) {
            log('play FAIL ' + (e && e.message || e));
            return '';
        }
    },

    search(wd, quick, pg) {
        let page = 1;
        try { page = Math.max(1, parseInt(String(pg == null ? '1' : pg).trim(), 10) || 1); } catch (e) {}
        const keyword = String(wd == null ? '' : wd).trim();
        if (!keyword || keyword.length > 80) return pageData([], page, false);
        try {
            const d = api('1803', {
                keyword: keyword,
                page: page,
                size: 15,
                searchSource: '搜索按钮',
                hotWordType: 2,
            });
            let items = dramaCards(d && d.searchVos);
            if (!items.length) {
                items = dramaCards(d && d.guessLikes);
                if (!items.length) items = dramaCards(d && d.dataList);
            }
            const more = !!(d && (d.isMore === true || (d.isMore | 0) === 1 || d.hasMore));
            log('search done kw=[' + keyword + '] page=' + page + ' items=' + items.length + ' more=' + more);
            return pageData(items, page, more);
        } catch (e) {
            log('search FAIL kw=[' + keyword + '] : ' + (e && e.message || e));
            return pageData([], page, false);
        }
    },
};

/** 蓝本清晰度优先级：m3u81080p → mp41080p → m3u8720p → mp4720p → 兜底 + SwitchUrl 数组 */
function firstUrl(content) {
    const keys = ['m3u81080pUrl', 'm3u81080p', 'mp41080pUrl', 'mp41080p',
        'm3u8720pUrl', 'm3u8720p', 'mp4720pUrl', 'mp4720p', 'mp4', 'm3u8', 'url'];
    for (let i = 0; i < keys.length; i++) {
        const v = String(content[keys[i]] == null ? '' : content[keys[i]]).trim();
        if (v) return v;
    }
    const arrKeys = ['m3u81080pSwitchUrl', 'mp41080pSwitchUrl', 'm3u8720pSwitchUrl', 'mp4720pSwitchUrl'];
    for (let i = 0; i < arrKeys.length; i++) {
        const arr = content[arrKeys[i]];
        if (arr && arr.length) {
            const v = String(arr[0] == null ? '' : arr[0]).trim();
            if (v) return v;
        }
    }
    return '';
}
