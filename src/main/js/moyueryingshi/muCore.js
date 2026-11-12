/**
 * muCore.js — 摸鱼儿 JS 版公共基础（HTTP 封装 + 壳 JSON 输出格式 + 通用工具）
 *
 * Java 侧对应（readable_sources）：merge.p001b.g（Result）/ merge.p001b.k（Vod）/ merge.X（okhttp）。
 * 输出格式与壳已验证的 qingguoduanju.js 完全一致（category=M↓CMS list 分页 / detail={code,list} /
 * play={parse,playUrl,header,flag,url}）。
 *
 * 宿主依赖：req（net.js → http/_http 同步信封 {content, headers}）、console、joinUrl（壳全局可选）。
 * QuickJS 兼容：禁 node 专属 API；字符串拼接代替模板中的高级特性。
 */

export function log(...a) {
    try { console.log('[mu]', ...a); } catch (e) { }
}

// ============================ HTTP（Java OkHttp → 宿主 req） ============================

/** GET：headers 可空；返回 { content, headers } 信封。 */
export function httpGet(url, headers, timeoutMs) {
    return req(url, { method: 'get', headers: headers || {}, timeout: timeoutMs || 30000 });
}

/** POST body：字符串或 UTF-8 文本。 */
export function httpPost(url, body, headers, timeoutMs) {
    return req(url, { method: 'post', headers: headers || {}, body: body, timeout: timeoutMs || 30000 });
}

/** 信封取正文（空串 = 失败，口径与 maidongktv 一致）。 */
export function bodyOf(res) {
    return (res && res.content) || '';
}

export function headersOf(res) {
    return (res && res.headers) || {};
}

/** GET 并要求非空正文（失败抛错，对应 Java X1.X + 空响应守卫）。 */
export function fetchText(url, headers, timeoutMs) {
    const res = httpGet(url, headers, timeoutMs);
    const body = bodyOf(res);
    if (!body) throw new Error('http empty: ' + String(url).substring(0, 120));
    return body;
}

/** 相对链接 → 绝对（壳全局 joinUrl 可用则用之，否则手写 RFC3986 简版）。 */
export function joinUrlSafe(base, rel) {
    if (!rel) return rel || '';
    if (/^https?:\/\//i.test(rel)) return rel;
    try {
        if (typeof joinUrl === 'function') return joinUrl(base, rel);
    } catch (e) { }
    // 简版归并：协议相对 → 补 scheme；根相对 → 补 origin；路径相对 → 目录拼接
    if (rel.startsWith('//')) return 'https:' + rel;
    if (rel.startsWith('/')) {
        const m = /^([a-z]+:\/\/[^\/?#]+)/i.exec(base || '');
        return m ? m[1] + rel : rel;
    }
    const dir = (base || '').replace(/[^\/]*$/, '');
    return dir + rel;
}

/** java.net.URLEncoder.encode(s, "UTF-8") 语义：空格 → '+'。 */
export function javaUrlEncode(s) {
    return encodeURIComponent(String(s))
        .replace(/%20/g, '+')
        .replace(/!/g, '%21')
        .replace(/'/g, '%27')
        .replace(/\(/g, '%28')
        .replace(/\)/g, '%29')
        .replace(/~/g, '%7E');
}

/** URL 查询参数安全编码（JS 语义：空格 → %20）。 */
export function urlEncode(s) {
    return encodeURIComponent(String(s));
}

// ============================ 壳 JSON 输出（与 qingguoduanju 同构） ============================

/** home：class 分类 + filters 筛选组。classes=[{type_id,type_name}]；filters={tid:[{key,name,value:[{n,v}]}]}。 */
export function homeData(classes, filters) {
    return JSON.stringify({ class: classes || [], filters: filters || {} });
}

/** 列表条目（M↓CMS vod 行）。 */
export function vod(id, name, pic, remarks, extra) {
    const o = {
        vod_id: String(id === undefined || id === null ? '' : id),
        vod_name: name || '',
        vod_pic: pic || '',
        vod_remarks: remarks || '',
    };
    if (extra) {
        for (const k of Object.keys(extra)) {
            if (extra[k] !== undefined && extra[k] !== null) o[k] = extra[k];
        }
    }
    return o;
}

/** category/搜索分页。 */
export function pageData(list, page, pagecount, limit, total) {
    return JSON.stringify({
        list: list || [],
        page: page || 1,
        pagecount: pagecount === undefined ? 1 : pagecount,
        limit: limit || 20,
        total: total === undefined ? 0 : total,
    });
}

export function emptyPage(page) {
    return pageData([], page || 1, 1, 20, 0);
}

/** detail：{code:1,list:[vod]}；vod_play_from 单旗标 + vod_play_url "名$id#名$id"。 */
export function detailData(v) {
    return JSON.stringify({ code: 1, list: [v] });
}

/** play：flag 必须回显入参（壳 stale 校验比对片源名）。url 可为直链或 proxy://。 */
export function playData(flag, url, header, extra) {
    const o = { parse: 0, playUrl: '', header: header || {}, flag: flag || '', url: url || '' };
    if (extra) {
        for (const k of Object.keys(extra)) o[k] = extra[k];
    }
    return o;
}

/** 失败显式回传 msg（空串会被壳当无结果静默丢弃）。 */
export function playFail(flag, reason) {
    return JSON.stringify({
        msg: '获取播放数据失败：' + (reason || ''),
        flag: flag || '',
        url: '',
        parse: 0,
    });
}

// ============================ JSON 安全（org.json → 壳侧兜底） ============================

export function tryParse(s) {
    try { return JSON.parse(s); } catch (e) { return null; }
}

export function safeGet(obj, path, dflt) {
    try {
        let cur = obj;
        const parts = String(path).split('.');
        for (let i = 0; i < parts.length; i++) {
            if (cur === null || cur === undefined) return dflt;
            cur = cur[parts[i]];
        }
        return cur === undefined || cur === null ? dflt : cur;
    } catch (e) {
        return dflt;
    }
}
