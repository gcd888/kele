/**
 * Market.js — 摸鱼儿「网盘市场」（JS 版，catvod JsSpider 协议）
 *
 * 移植自：E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\readable_sources\com\github\catvod\spider\Market.java
 * （1353 行，XOR 混淆字符串 272/272 全部内联解码），1:1 移植主类逻辑：
 *   init 解析 ext {categories:[{name,url,pwd}]}（quark/uc 正则提取分享 ID）+ KV(.market_config) 自定义分类；
 *   home 三分类（__preset__ 推荐 / __custom__ 自定义 / __setting__ 设置）+ kind/sort 筛选组；
 *   category 预设/自定义分类浏览 + 夸克/UC 分享目录列表（share/sharepage/detail，kind 过滤 + sort 排序 +
 *   文件夹在前，文件大小格式化，非视频走 download:）；detail 视频文件目录聚合轮转（从当前条目起旋转）
 *   / 非视频下载条目；play download: 确认提示；action market_add/delete/info。
 *
 * 移植差异（还原度边界，如实说明）：
 *  1. FishCrypto.g(ext) 配置解密（反射混淆）→ JS 直接 JSON.parse（壳配置 ext 为明文 JSON，
 *     fish.y456y.json 的 Market.ext.categories 即明文形态）；
 *  2. InitOrigin/AlertDialog/W 等原生 UI（添加/删除分类弹窗）→ JS 壳无 UI：action 返回提示，
 *     自定义分类由 KV(.market_config) 直接维护；
 *  3. 夸克/UC 取直链（A0.s().w / Z0.t().G，1.1MB/1.4MB 深度反射混淆类，转存→下载链路不可静态
 *     还原）→ play 显式返回失败说明（不编造 Java 中不可见的流程）；分类列表 API 的 URL 契约在
 *     Market.java 中完整可见（"share/sharepage/detail?pr=...&pwd_id=&stoken=&pdir_fid=&force=0&
 *     _page=1&_size=200&_sort=file_type:asc,file_name:asc"），stoken 获取按同域 token API 还原；
 *  4. C0299u0.x0（本地播放代理包装，2.7MB 反射混淆）→ 直链直接返回 + Referer 头；
 *  5. X0.a()（Toast）/N1.d()（详情统计上报）→ console.log 空实现；
 *  6. 网盘 Cookie：ext.quark / ext.uc 字段 + local（quark_cookie/uc_cookie）兜底，语义对齐
 *     Cloud.init → A0.s().m0(ext) / Z0.t().q0(ext)。
 *
 * 宿主依赖：req/local/console；lib/binutil.js。
 */

import { httpGet, httpPost, bodyOf, headersOf, javaUrlEncode, homeData, vod, pageData, detailData, playFail, log } from './muCore.js';

// ============================ 常量（Java 字段 1:1） ============================

/** 分享链接正则：pan.quark.cn/s/xxx 与 drive.uc.cn/s/xxx（Java Pattern c/d） */
const P_QUARK = /pan\.quark\.cn\/s\/([^\\|#/]+)/;
const P_UC = /drive\.uc\.cn\/s\/([^\\|#/]+)/;

const ICON_FOLDER = 'data:image/png;base64,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';
const ICON_EMPTY = 'data:image/png;base64,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';
const ICON_ERROR = 'data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAV4AAAFeCAYAAADNK3caAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAAJcEhZcwAADsMAAA7DAcdvqGQAAAA9SURBVHhe7cEBDQAAAMKg909tDjcgAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAADeBAAy6AFGAAAAAElFTkSuQmCC';

/** AbstractC0309x1.c：媒体扩展名列表（i()/g() 用） */
const MEDIA_EXT = ['mp4', 'mkv', 'wmv', 'flv', 'avi', 'iso', 'mpg', 'ts', 'mp3', 'aac', 'flac', 'm4a', 'ape', 'ogg'];

// ============================ 模块级状态（Java 实例字段） ============================

let presets = [];   // this.a（预设分类）
let custom = [];    // this.b（自定义分类）

// ============================ 壳 KV（C0297t1 等价） ============================

function kvGet(key) {
    try { return local(key) || ''; } catch (e) { return ''; }
}
function kvSet(key, val) {
    try { local(key, val); } catch (e) { }
}

/** 网盘 Cookie（Cloud.init 语义：A0.s().m0(ext.quark) / Z0.t().q0(ext.uc)，local 兜底） */
function quarkCookie() {
    const c = (extState.quark || '') || kvGet('quark_cookie');
    return c || '';
}
function ucCookie() {
    const c = (extState.uc || '') || kvGet('uc_cookie');
    return c || '';
}

// ============================ 通用工具（Java 静态方法 1:1） ============================

function isEmpty(s) {
    return s === undefined || s === null || String(s).length === 0;
}

/** d(str)：URLDecoder UTF-8（Java 1:1） */
function urlDecode(str) {
    try {
        return decodeURIComponent(str === null || str === undefined ? '' : String(str));
    } catch (e) {
        return str === null || str === undefined ? '' : String(str);
    }
}

/** o(str)：名称清洗（$/# → 空格，Java 1:1） */
function o(str) {
    return str === null || str === undefined ? '' : String(str).replace(/\$/g, ' ').replace(/#/g, ' ').trim();
}

/** g(str)：扩展名 → 图标（AbstractC0309x1.g + Market.g，Java 1:1） */
function extOf(str) {
    return String(str).indexOf('.') >= 0 ? String(str).substring(String(str).lastIndexOf('.') + 1) : String(str);
}
function isMedia(name) {
    return MEDIA_EXT.indexOf(extOf(name).toLowerCase()) >= 0;
}
function g(name) {
    const lower = extOf(name).toLowerCase();
    if (['doc', 'docx', 'pdf', 'txt', 'md'].indexOf(lower) >= 0) return 'https://img.icons8.com/color/96/document.png';
    if (['xls', 'xlsx', 'csv'].indexOf(lower) >= 0) return 'https://img.icons8.com/color/96/ms-excel.png';
    if (['ppt', 'pptx'].indexOf(lower) >= 0) return 'https://img.icons8.com/color/96/ms-powerpoint.png';
    if (['zip', 'rar', '7z', 'tar', 'gz'].indexOf(lower) >= 0) return 'https://img.icons8.com/color/96/archive.png';
    if (['jpg', 'jpeg', 'png', 'gif', 'bmp', 'webp'].indexOf(lower) >= 0) return 'https://img.icons8.com/color/96/image.png';
    if (['apk'].indexOf(lower) >= 0) return 'https://img.icons8.com/color/96/android-os.png';
    return 'https://img.icons8.com/color/96/file.png';
}

/** j(str)：网盘显示名（Java 1:1） */
function j(type) {
    if (type === 'uc') return 'UC分享';
    if (type !== 'quark') return '播放';
    return '夸克分享';
}

/** e(cat)：分类 id（Java 1:1）= d:e:f:c */
function e(cat) {
    const f = cat.f === null || cat.f === undefined ? '0' : cat.f;
    const c = cat.c === null || cat.c === undefined ? '' : cat.c;
    return cat.d + ':' + cat.e + ':' + f + ':' + c;
}

/** f(key, map)：extend 取值（Java 1:1） */
function f(key, map) {
    return map === null || map === undefined || !Object.prototype.hasOwnProperty.call(map, key) ? '' : map[key];
}

/** i()：筛选组（Java 1:1） */
function iFilters() {
    return [
        { key: 'kind', name: '类型', value: [
            { n: '全部', v: '' },
            { n: '视频', v: 'video' },
            { n: '文件夹', v: 'folder' },
            { n: '其他', v: 'other' },
        ] },
        { key: 'sort', name: '排序', value: [
            { n: '默认', v: '' },
            { n: '名称正序', v: 'name_asc' },
            { n: '名称倒序', v: 'name_desc' },
            { n: '大小正序', v: 'size_asc' },
            { n: '大小倒序', v: 'size_desc' },
        ] },
    ];
}

/** b(...): 设置页 action 条目（Java 1:1） */
function b(id, name, remarks, pic, action) {
    const el = vod(id, name, pic, remarks);
    if (!isEmpty(action)) el.action = action;
    return el;
}

/** c(title, msg, pic)：错误占位页（Java 1:1：market_noop 条目） */
function c(title, msg, pic) {
    const el = vod('market_noop', title, pic, '', { vod_content: msg });
    return pageData([el], 1, 1, 20, 1);
}

/** k(title, msg, list)：分类浏览空态/列表（Java 1:1） */
function k(title, msg, list) {
    const out = [];
    if (list === null || list === undefined || list.length === 0) {
        out.push(vod('market_noop', title, ICON_EMPTY, '', { vod_content: msg }));
        return pageData(out, 1, 1, 20, 1);
    }
    for (const cat of list) {
        const f0 = cat.f === null || cat.f === undefined ? '0' : cat.f;
        const cc = cat.c === null || cat.c === undefined ? '' : cat.c;
        const id = cat.d + ':' + cat.e + ':' + f0 + ':' + cc;
        out.push(vod(id, cat.a, ICON_FOLDER, 'folder', { vod_tag: 'folder', vod_remarks: j(cat.d) }));
    }
    return pageData(out, 1, 1, 20, 1);
}

// ============================ Category（Java 内部类 1:1） ============================

/** Category.a()：url 正则 → {d: 类型, e: 分享ID, f: "0"} */
function parseCategory(cat) {
    const m1 = P_QUARK.exec(cat.b || '');
    if (m1) {
        cat.d = 'quark';
        cat.e = m1[1];
        cat.f = '0';
        return;
    }
    const m2 = P_UC.exec(cat.b || '');
    if (m2) {
        cat.d = 'uc';
        cat.e = m2[1];
        cat.f = '0';
    }
}

function makeCategory(name, url, pwd) {
    return { a: name, b: url, c: pwd, d: null, e: null, f: null };
}

// ============================ 夸克/UC 分享 API（l/n + stoken，URL 契约见 Java l()/n()） ============================

const QUARK_HOST = 'https://drive-pc.quark.cn';
const UC_HOST = 'https://pc-api.uc.cn';
const UA_QK = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36 quark-cloud-drive/2.5.20.240325';
const UA_UC = 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/122.0.0.0 Safari/537.36 uccloud-drive/2.5.20.240325';

/** stoken 获取（A0.L / Z0.I 的 share/sharepage/token 语义还原：pwd_id + passcode → data.stoken） */
function fetchStoken(type, pwdId, passcode) {
    const ck = type === 'quark' ? quarkCookie() : ucCookie();
    const host = type === 'quark' ? QUARK_HOST : UC_HOST;
    const pr = type === 'quark' ? 'ucpro&fr=pc' : 'UCBrowser&fr=pc';
    const headers = { 'User-Agent': type === 'quark' ? UA_QK : UA_UC };
    if (!isEmpty(ck)) headers['Cookie'] = ck;
    const body = JSON.stringify({ pwd_id: pwdId, passcode: passcode === undefined || passcode === null ? '' : passcode, get_can_download: false });
    const res = httpPost(host + '/1/clouddrive/share/sharepage/token?pr=' + pr, body, headers, 30000);
    const text = bodyOf(res);
    if (isEmpty(text)) throw new Error('获取分享Token失败');
    const json = JSON.parse(text);
    if ((json.code || 0) !== 0) {
        throw new Error((json.message || json.error_message || '获取分享Token失败') + '');
    }
    const data = json.data || {};
    const stoken = data.stoken || '';
    if (isEmpty(stoken)) throw new Error('获取分享Token失败');
    return stoken;
}

/** l()：夸克分享目录列表（Java 1:1，URL 契约逐段对齐） */
function l(pwdId, fid, token, map) {
    const stoken = fetchStoken('quark', pwdId, token);
    const url = QUARK_HOST + '/1/clouddrive/share/sharepage/detail?pr=ucpro&fr=pc'
        + '&pwd_id=' + pwdId
        + '&stoken=' + javaUrlEncode(stoken)
        + '&pdir_fid=' + fid
        + '&force=0&_page=1&_size=200&_sort=file_type:asc,file_name:asc';
    const headers = { 'User-Agent': UA_QK };
    const ck = quarkCookie();
    if (!isEmpty(ck)) headers['Cookie'] = ck;
    const res = httpGet(url, headers, 30000);
    const text = bodyOf(res);
    if (isEmpty(text)) throw new Error('获取文件列表失败');
    const json = JSON.parse(text);
    if ((json.code || 0) !== 0) {
        throw new Error(json.message || '获取文件列表失败');
    }
    const data = json.data;
    if (data === null || data === undefined || data.list === null || data.list === undefined) return [];
    return a('quark', pwdId, fid, token, data.list, map);
}

/** n()：UC 分享目录列表（Java 1:1） */
function n(pwdId, fid, token, map) {
    const stoken = fetchStoken('uc', pwdId, token);
    const url = UC_HOST + '/1/clouddrive/share/sharepage/detail?pr=UCBrowser&fr=pc&pwd_id=' + pwdId
        + '&stoken=' + javaUrlEncode(stoken)
        + '&pdir_fid=' + fid
        + '&force=0&_page=1&_size=200&_sort=file_type:asc,file_name:asc';
    const headers = { 'User-Agent': UA_UC };
    const ck = ucCookie();
    if (!isEmpty(ck)) headers['Cookie'] = ck;
    const res = httpGet(url, headers, 30000);
    const text = bodyOf(res);
    if (isEmpty(text)) throw new Error('获取文件列表失败');
    const json = JSON.parse(text);
    if ((json.code || 0) !== 0) {
        throw new Error(json.message || '获取文件列表失败');
    }
    const data = json.data;
    if (data === null || data === undefined || data.list === null || data.list === undefined) return [];
    return a('uc', pwdId, fid, token, data.list, map);
}

/** 大小格式化（Java 1:1：B / %.1fKB / %.1fMB / %.2fGB） */
function fmtSize(sz) {
    if (sz > 0) {
        if (sz < 1024) return sz + 'B';
        if (sz < 1048576) return fmt1(sz / 1024) + 'KB';
        if (sz < 1073741824) return fmt1(sz / 1048576) + 'MB';
        return fmt2(sz / 1073741824) + 'GB';
    }
    return '';
}
function fmt1(d) {
    return (Math.floor(d * 10) / 10).toFixed(1);
}
function fmt2(d) {
    return (Math.floor(d * 100) / 100).toFixed(2);
}

/** a()：文件条目构建（kind 过滤 + sort 排序 + 文件夹在前，Java 1:1） */
function a(type, pwdId, fid, token, list, map) {
    const out = [];
    const kind = f('kind', map);
    const sort = f('sort', map);
    const dirs = [];
    const files = [];
    for (const item of list) {
        const isDir = item['dir'] === true;
        const fileName = item['file_name'] || '';
        if ((kind === 'folder' && !isDir) ||
            (kind === 'video' && (isDir || !isMedia(fileName))) ||
            (kind === 'other' && (isDir || isMedia(fileName)))) {
            continue;
        }
        if (isDir) dirs.push(item);
        else files.push(item);
    }
    // sort：name_asc / name_desc / size_asc / size_desc（Java Comparator 语义）
    let cmp = null;
    if (sort === 'name_asc') {
        cmp = function (x, y) { return String(x['file_name'] || '').toLowerCase().localeCompare(String(y['file_name'] || '').toLowerCase()); };
    } else if (sort === 'name_desc') {
        cmp = function (x, y) { return String(y['file_name'] || '').toLowerCase().localeCompare(String(x['file_name'] || '').toLowerCase()); };
    } else if (sort === 'size_asc') {
        cmp = function (x, y) {
            const d = (x['size'] || 0) - (y['size'] || 0);
            return d !== 0 ? (d > 0 ? 1 : -1) : String(x['file_name'] || '').toLowerCase().localeCompare(String(y['file_name'] || '').toLowerCase());
        };
    } else if (sort === 'size_desc') {
        cmp = function (x, y) {
            const d = (y['size'] || 0) - (x['size'] || 0);
            return d !== 0 ? (d > 0 ? 1 : -1) : String(y['file_name'] || '').toLowerCase().localeCompare(String(x['file_name'] || '').toLowerCase());
        };
    }
    if (cmp !== null) {
        dirs.sort(cmp);
        files.sort(cmp);
    }
    const ordered = dirs.concat(files);
    for (const item of ordered) {
        const fid2 = item['fid'] || '';
        const fileName = item['file_name'] || '';
        const shareFidToken = item['share_fid_token'] || '';
        const isDir = item['dir'] === true;
        if (isDir) {
            // 文件夹条目 id：type:shareId:fid:token（category 4 段消费）
            const id = type + ':' + pwdId + ':' + fid2 + ':' + token;
            out.push(vod(id, fileName, ICON_FOLDER, '文件夹', { vod_tag: 'folder' }));
        } else {
            const size = fmtSize(item['size'] || 0);
            let encoded = fileName || '';
            try { encoded = javaUrlEncode(fileName || ''); } catch (e) { encoded = fileName || ''; }
            // 文件条目 id：type:shareId:文件fid:token:share_fid_token:父目录fid:encode(name)（detail/play 7 段消费）
            const id = type + ':' + pwdId + ':' + fid2 + ':' + token + ':' + shareFidToken + ':' + fid + ':' + encoded;
            const remarks = isEmpty(size) ? '文件' : size;
            if (isMedia(fileName)) {
                out.push(vod(id, fileName, g(fileName), remarks, { vod_tag: 'file' }));
            } else {
                out.push(vod('download:' + id, fileName, g(fileName), remarks, {
                    vod_tag: 'file', action: 'download:' + id,
                }));
            }
        }
    }
    return out;
}

/** m()：目录视频枚举（detail 聚合轮转用，Java 1:1） */
function m(type, pwdId, fid, token) {
    let all;
    if (type === 'uc') {
        all = n(pwdId, fid, token, null);
    } else if (type === 'quark') {
        all = l(pwdId, fid, token, null);
    } else {
        return [];
    }
    const out = [];
    for (const el of all) {
        // kVar.b()=vod_id 非 download: 开头 + 非 folder + c()=name 视频扩展名
        const id = el.vod_id;
        if (id !== null && String(id).indexOf('download:') !== 0 && el.vod_tag !== 'folder' &&
            el.vod_name !== null && el.vod_name !== undefined && isMedia(el.vod_name)) {
            out.push(el);
        }
    }
    return out;
}

// ============================ home / init（$host$1b26b551389a5dab / init） ============================

let extState = {};

function home(filter) {
    const classes = [
        { type_id: '__preset__', type_name: '推荐内容' },
        { type_id: '__custom__', type_name: '我的自定义' },
    ];
    // Java：D.b.z("__setting__", "设置", null, [b(__preset__), b(__custom__)]) → 设置页排在分类后
    classes.push({ type_id: '__setting__', type_name: '设置' });
    const filters = {};
    if (filter) {
        const groups = iFilters();
        for (const cat of presets) filters[e(cat)] = groups;
        for (const cat of custom) filters[e(cat)] = groups;
    }
    return homeData(classes, filters);
}

function init(ext) {
    extState = typeof ext === 'string' ? {} : (ext || {});
    presets = [];
    let strX = typeof ext === 'string' ? ext : (ext ? JSON.stringify(ext) : '');
    if (!isEmpty(strX)) {
        // Java：http 前缀 → X1.X 抓取文本（FishCrypto.g 解密 → JS 直接解析）
        if (strX.startsWith('http')) {
            try { strX = bodyOf(httpGet(strX, {}, 30000)); } catch (e) { strX = ''; }
        }
        let json = null;
        try { json = JSON.parse(strX); } catch (e) { json = null; }
        if (json !== null && json !== undefined) {
            const arr = json['categories'];
            if (Array.isArray(arr)) {
                for (const item of arr) {
                    const cat = makeCategory(item['name'] === undefined || item['name'] === '' ? '未命名' : (item['name'] || ''), item['url'] || '', item['pwd'] || '');
                    parseCategory(cat);
                    if (cat.d !== null && cat.d !== undefined) presets.push(cat);
                }
            }
        }
    }
    custom = [];
    try {
        const saved = kvGet('.market_config');
        if (!isEmpty(saved)) {
            const obj = JSON.parse(saved);
            const arr = obj['categories'];
            if (Array.isArray(arr)) {
                for (const item of arr) {
                    const cat = makeCategory(item['name'] || '', item['url'] || '', item['pwd'] || '');
                    parseCategory(cat);
                    if (cat.d !== null && cat.d !== undefined && (cat.d === 'quark' || cat.d === 'uc')) {
                        custom.push(cat);
                    }
                }
            }
        }
    } catch (e) { }
}

// ============================ category（$host$f9d7235748f992e0） ============================

function category(tid, pg, filter, extend) {
    if ('__preset__' === tid) {
        return k('暂无预设分类', '配置中没有有效的夸克/UC分享', presets);
    }
    if ('__custom__' === tid) {
        return k('暂无自定义分类', '请在设置中添加有效的夸克/UC分享', custom);
    }
    if ('__setting__' === tid) {
        // Java：b(add/del/info) ×3 → page=1/pagecount=1/limit=20/total=3
        const pic = PIC_FOR_SETTING;
        const arr = [
            b('add', '添加分类', '夸克/UC', pic, 'market_add'),
            b('del', '删除分类', '自定义', pic, 'market_delete'),
            b('info', '查看配置', '当前', pic, 'market_info'),
        ];
        const out = [];
        for (const el of arr) out.push(el);
        return pageData(out, 1, 1, 20, 3);
    }
    if (String(tid).indexOf(':') < 0) {
        return JSON.stringify({ list: [], msg: '' });
    }
    const parts = String(tid).split(':');
    if (parts.length < 3) {
        return c('加载失败', '无效的分享目录ID', PIC_FOR_SETTING);
    }
    const type = parts[0];
    const pwdId = parts[1];
    const fid = parts[2];
    const token = parts.length > 3 ? parts[3] : '';
    const map = extend && typeof extend === 'object' ? extend : {};
    try {
        let items;
        if (type === 'quark') {
            items = l(pwdId, fid, token, map);
        } else if (type === 'uc') {
            items = n(pwdId, fid, token, map);
        } else {
            return c('加载失败', '不支持的网盘类型：' + type, PIC_FOR_SETTING);
        }
        if (items.length === 0) {
            const kind = f('kind', map);
            return c('暂无内容', isEmpty(kind) ? '这个分享目录暂无文件，可返回上级或检查分享内容' : '当前类型没有匹配内容，请切换类型筛选或返回上级', ICON_EMPTY);
        }
        return pageData(items, 1, 1, 0, 1);
    } catch (err) {
        log('获取分享文件列表失败: ' + err.message);
        const msg = err.message !== null && err.message !== undefined ? String(err.message).trim() : '';
        const lower = msg.toLowerCase();
        const prefix = j(type);
        let reason;
        if (isEmpty(msg)) {
            reason = prefix + '加载失败，请稍后重试';
        } else if (msg.indexOf('未登录') >= 0 || msg.indexOf('授权') >= 0 || lower.indexOf('cookie') >= 0 || lower.indexOf('login') >= 0) {
            reason = prefix + '需要登录或配置账号：' + msg;
        } else if (msg.indexOf('提取码') >= 0 || msg.indexOf('密码') >= 0 || msg.indexOf('passcode') >= 0) {
            reason = prefix + '提取码不正确或已失效：' + msg;
        } else if (msg.indexOf('分享') >= 0 || msg.indexOf('Token') >= 0 || lower.indexOf('token') >= 0 || lower.indexOf('not found') >= 0 || lower.indexOf('invalid') >= 0) {
            reason = prefix + '可能已失效或无权访问：' + msg;
        } else if (lower.indexOf('timeout') >= 0 || lower.indexOf('timed out') >= 0 || lower.indexOf('failed to connect') >= 0 || lower.indexOf('unable to resolve') >= 0 || msg.indexOf('网络') >= 0) {
            reason = '网络连接失败：' + msg;
        } else {
            reason = '加载失败：' + msg;
        }
        return c('加载失败', reason, PIC_FOR_SETTING);
    }
}

const PIC_FOR_SETTING = ICON_EMPTY;

// ============================ detail（$host$6c1ebb3cb60973b4） ============================

function detail(list) {
    const id = list[0];
    // Java：market_ / download: 前缀 → AbstractC0302v0.g0（UI action）→ ""
    if (String(id).indexOf('market_') === 0 || String(id).indexOf('download:') === 0) {
        return '';
    }
    const parts = String(id).split(':');
    if (parts.length < 7) {
        return JSON.stringify({ list: [], msg: '无效的文件ID' });
    }
    const type = parts[0];
    const pwdId = parts[1];
    const fid = parts[2];
    const shareFidToken = parts[3];
    const shareFidToken2 = parts[4];
    const parentFid = parts[5];
    const name = urlDecode(parts[6]);
    const el = vod(id, name, g(name), '网盘文件', { type_name: '网盘文件' });
    if (isMedia(name)) {
        const names = [];
        const ids = [];
        if (!isEmpty(parentFid)) {
            try {
                const subs = m(type, pwdId, parentFid, shareFidToken);
                for (const sub of subs) {
                    names.push(o(sub.vod_name));
                    ids.push(sub.vod_id);
                }
            } catch (e) { }
        }
        const flag = j(type);
        if (names.length > 0) {
            // 从当前条目起轮转（Java 1:1）
            let idx = -1;
            for (let i = 0; i < ids.length; i++) {
                if (String(ids[i]) === String(id)) { idx = i; break; }
            }
            let playUrl = '';
            for (let i2 = 0; i2 < names.length; i2++) {
                const k = idx >= 0 ? (idx + i2) % names.length : i2;
                if (playUrl.length > 0) playUrl += '#';
                playUrl += o(names[k]) + '$' + ids[k];
            }
            let remarks = '共' + names.length + '个视频';
            remarks += idx >= 0 ? ' · 当前为列表第' + (idx + 1) + '个' : '';
            el.vod_play_from = flag;
            el.vod_play_url = playUrl;
            el.vod_remarks = remarks;
        }
        if (names.length === 0) {
            el.vod_play_from = flag;
            el.vod_play_url = o(name) + '$' + id;
        }
    } else {
        el.vod_play_from = '下载';
        el.vod_play_url = o(name) + '$download:' + id;
    }
    return detailData(el);
}

// ============================ play（$host$62d5eed2b06b9d14） ============================

function play(flag, id, vipFlags) {
    if (String(id).indexOf('download:') === 0) {
        // Java：q() 弹窗确认下载任务 → 消息；JS 无 UI，返回确认提示
        const ok = qDownload(String(id).substring(9));
        return JSON.stringify({
            msg: ok ? '已打开下载确认，请在弹窗中确认' : '下载任务无效，请返回列表重新选择',
            flag: flag || '', url: '', parse: 0,
        });
    }
    const parts = String(id).split(':');
    if (parts.length < 7) {
        return JSON.stringify({ list: [], msg: '无效的文件ID' });
    }
    const type = parts[0];
    const pwdId = parts[1];
    const fid = parts[2];
    const shareFidToken = parts[3];
    const shareFidToken2 = parts[4];
    urlDecode(parts[6]);
    try {
        const direct = h(type, pwdId, fid, shareFidToken, shareFidToken2);
        if (isEmpty(direct)) {
            return playFail(flag, '获取播放地址失败');
        }
        const headers = {};
        if (type === 'uc') {
            headers['Referer'] = 'https://drive.uc.cn/';
        } else if (type === 'quark') {
            headers['Referer'] = 'https://pan.quark.cn/';
        }
        // Java：C0299u0.x0(直链, headers, flag, type) 本地代理包装（反射混淆不可还原）
        // → 直链直出 + Referer 头（壳播放器跟随 302）
        return JSON.stringify({
            parse: 0, playUrl: '', header: headers, flag: flag || '', url: direct,
        });
    } catch (err) {
        return playFail(flag, '播放失败: ' + (err.message || ''));
    }
}

/** q(str)：下载确认（Java 弹窗；JS 无 UI → 校验并返回 false 语义） */
function qDownload(str) {
    const parts = String(str).split(':');
    if (parts.length < 7) {
        return false;
    }
    urlDecode(parts[6]);
    // Java：InitOrigin.run(下载确认弹窗) → true；JS 无 UI 无法确认，忠实返回 false（无效提示）
    return false;
}

/** h(type, shareId, fid, shareFidToken, shareFidToken2)：取直链（Java 1:1 路由） */
function h(type, pwdId, fid, shareFidToken, shareFidToken2) {
    if (type === 'uc') {
        // Java：Z0.t().G(shareId, fid, shareFidToken, share_fid_token)
        return z0G(pwdId, fid, shareFidToken, shareFidToken2);
    }
    if (type !== 'quark') {
        throw new Error('不支持的网盘类型');
    }
    // Java：A0.s().P() 登录检查 → 未登录报错；w(shareId, stoken, fid, share_fid_token, "0")
    const ck = quarkCookie();
    if (isEmpty(ck)) {
        throw new Error('未登录夸克账号，无法下载');
    }
    const stoken = fetchStoken('quark', pwdId, shareFidToken);
    return a0W(pwdId, stoken, fid, shareFidToken2, '0');
}

/**
 * 夸克/UC 取直链（A0.w / Z0.G 的等价还原边界说明）：
 * Java 中 A0.w/Z0.G 为 1.1MB/1.4MB 深度反射混淆（switch 状态机 + C0189.n 反射调用表），
 * dispatchers 索引覆盖率不足，转存（share/sharepage/save）→ 直链（file/download）链路无法
 * 静态还原。为不编造 Java 中不可见的流程，此处按可证据的契约实现：UC 走分享文件直链参数
 * 契约失败时如实抛错。
 */
function z0G(pwdId, fid, shareFidToken, shareFidToken2) {
    // UC 分享直链获取（Z0.G 语义：分享内文件 fid_token 取链；API 契约在混淆层不可还原）
    throw new Error('UC 取直链依赖的网盘 SDK（Z0）在混淆层无法静态还原，JS 版未实现');
}
function a0W(pwdId, stoken, fid, shareFidToken2, flag) {
    // 夸克分享转存 → 取直链（A0.w 语义：share/sharepage/save + file/download；同上不可还原）
    throw new Error('夸克取直链依赖的网盘 SDK（A0.w 转存链路）在混淆层无法静态还原，JS 版未实现');
}

// ============================ action（$host$b5d914d976e0069f） ============================

function actionContent(str) {
    if ('market_add' === str) {
        // Java：弹窗输入 name/url/pwd → 自定义分类；JS 无 UI → 提示 KV 写法
        return JSON.stringify({ msg: '添加分类：请通过配置 ext.categories 或写入 local 的 .market_config（JSON {"categories":[{"name":"","url":"","pwd":""}]}）', list: [] });
    }
    if ('market_info' === str) {
        // Java：弹窗展示预设与自定义分类列表
        const lines = [];
        for (const cat of presets) lines.push((cat.d === 'quark' ? '[夸克]' : '[UC]') + ' ' + cat.a);
        for (const cat of custom) lines.push((cat.d === 'quark' ? '[夸克]' : '[UC]') + ' ' + cat.a);
        return JSON.stringify({
            msg: '配置信息\n预设分类：' + (lines.length === 0 ? '暂无预设分类' : lines.join('\n')),
            list: [],
        });
    }
    if ('market_delete' === str) {
        // Java：多选删除自定义分类弹窗
        return JSON.stringify({
            msg: custom.length === 0 ? '暂无自定义分类' : '删除分类：请通过修改 local 的 .market_config 维护自定义分类（共 ' + custom.length + ' 个）',
            list: [],
        });
    }
    if (String(str).indexOf('download:') === 0) {
        // Java：下载确认弹窗（RunnableC0242b）；JS 无 UI
        return '';
    }
    return '';
}

// ============================ 导出（catvod JsSpider 协议） ============================

export default {
    init: function (ext) {
        init(ext);
        log('[Market] init presets=' + presets.length + ' custom=' + custom.length);
        return '';
    },
    home: function (filter) {
        return home(filter);
    },
    homeVod: function () {
        return '';
    },
    category: function (tid, pg, filter, extend) {
        return category(tid, pg, filter, extend || {});
    },
    detail: function (id) {
        return detail([String(id)]);
    },
    search: function (key, quick, pg) {
        // Java：Market 无 searchContent → 空列表
        return JSON.stringify({ list: [], msg: '' });
    },
    play: function (flag, id, vipFlags) {
        return play(flag, id, vipFlags);
    },
    action: function (act) {
        return actionContent(act);
    },
    proxy: function (params) {
        return [404, 'text/plain', 'not implemented', {}];
    },
};
