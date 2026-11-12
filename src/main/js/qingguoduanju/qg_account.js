/**
 * qg_account.js — 红果云端账号能力（HongguoAccount.java 1:1 移植）：
 * 官网 Web 通道登录（二维码 + 手机验证码）+ 云端观看历史。
 *
 * 移植自：kele/src/main/java/qingguoduanju/src/com/github/catvod/spider/HongguoAccount.java
 * 蓝本：case/hongguoTV-tsukiyo kotlin-tv/core（WebLogin.kt / CloudAccount.kt / AccountController.kt
 * 的 validateAccount 设备绑定逻辑），协议要点另见 docs/红果短剧技术文档.md。
 *
 * cloud.* 协议（入参/出参均为 JSON，经 spider.action() 出口）：
 *   {"do":"cloud.info"}                          → {"code":0,"name":"🍎短剧","login":bool,"nickname":str}
 *   {"do":"cloud.qr.create"}                     → {"code":0,"image":base64,"expire":秒}
 *   {"do":"cloud.qr.poll"}                       → {"code":0,"ok":bool}（ok=true 即已登录落盘）
 *   {"do":"cloud.sms.send","mobile":"138..."}    → {"code":0,"masked":"+86 138****0000","retry":60}
 *   {"do":"cloud.sms.verify","code":"123456"}    → {"code":0}
 *   {"do":"cloud.logout"}                        → {"code":0}
 *   {"do":"cloud.cancel"}                        → {"code":0}（取消本次登录会话）
 *   {"do":"cloud.history"}                       → {"code":0,"list":[{seriesId,title,cover,description,
 *                                                   badge,episodeIndex,position,duration,updatedAt,episodeCount}]}
 *   任意失败                                      → {"code":-1,"msg":用户可读原因}
 *
 * 与 Java 版的差异（壳协议约束，算法不变）：
 *  - 凭据落盘：外置 files JSON → local（key 'qg_account'）；
 *  - HttpURLConnection → 壳 req（redirect:0 手动跟随、set-cookie 从响应头解析）；
 *  - org.json → safeParse（长 id 精度保护）。
 */

import { safeParse, utf8ToBytes, be32, bytesToB64 } from '../lib/binutil.js';
import qg from './qg_sign.js';

const TAG_MSG = 'hongguo-account';
/** 官网 Web 登录通道（二维码在此域，无需 App 端签名，蓝本 WebLogin.kt）。 */
const WEB_BASE = 'https://hongguoduanju.com';
const WEB_UA = 'Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) '
    + 'Chrome/141.0.0.0 Safari/537.36';
/**
 * 手机短信登录通道（官方 App 口径，蓝本 PhoneLogin.kt）：官网 Web 通道发验证码会被风控
 * 要求滑块验证（verify_center_decision_conf，电视端无法完成），官方 App 通道触发概率低。
 * 域名必须是 security.snssdk.com——is.snssdk.com 上短信登录会被风控回 2046（蓝本实测）。
 */
const PASSPORT_BASE = 'https://security.snssdk.com';
const PASSPORT_APP_UA = 'com.phoenix.read/72232 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3)';
const PASSPORT_VIDEO_UA = 'com.phoenix.read/71332 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3; '
    + 'Cronet/TTNetVersion:04657795 2026-01-23 QuicVersion:c67e9834 2025-09-08)';
/**
 * 官方 App 固定设备指纹（蓝本 VendorConstants.device）。官方 App 的短信登录不注册新设备：
 * 直接用设备表里的固定 device_id/iid（实测新注册设备 + query 带 device_id 会被判 2046）。
 * PhoneLogin 口径再覆盖版本 7.3.9.32/73932。
 */
function fixedDevice() {
    const v = {};
    v.iid = '1905892595382586';
    v.device_id = '1905892595378490';
    v.ac = 'wifi';
    v.channel = 'update_64';
    v.aid = '8662';
    v.app_name = 'novelread';
    v.version_code = '71332';
    v.version_name = '7.1.3.32';
    v.device_platform = 'android';
    v.os = 'android';
    v.ssmix = 'a';
    v.device_type = '25053RT47C';
    v.device_brand = 'Redmi';
    v.language = 'zh';
    v.os_api = '36';
    v.os_version = '16';
    v.manifest_version_code = '71332';
    v.resolution = '1280*2772';
    v.dpi = '520';
    v.update_version_code = '71332';
    v.host_abi = 'arm64-v8a';
    v.dragon_device_type = 'phone';
    v.pv_player = '71332';
    v.compliance_status = '0';
    v.need_personal_recommend = '1';
    v.player_so_load = '1';
    v.is_android_pad_screen = '0';
    return v;
}
const APP_DEVICE = fixedDevice();
/** 账号数据域（读进度/资料），需签名 + Cookie，蓝本 CloudAccount.kt。 */
const ACCOUNT_BASE = 'https://api5-normal-sinfonlinea.fqnovel.com';
const ACCOUNT_UA = 'com.phoenix.read/72232 (Linux; U; Android 16; zh_CN; 25053RT47C; Build/BP2A.250605.031.A3)';
/** 凭据落盘 key（local，与设备身份 qg_device 同口径）。 */
const LKEY_ACCOUNT = 'qg_account';

// ============================ action 协议入口 ============================

/** deps：{appDevice(force), httpText(url, method, body, headers), log(...)}（由 spider 注入）。 */
export function handle(deps, json) {
    let reqObj;
    try {
        reqObj = safeParse(json == null ? '{}' : json);
    } catch (e) {
        return err('参数格式错误');
    }
    const op = String(reqObj.do == null ? '' : reqObj.do);
    try {
        if (op === 'cloud.info') {
            const creds = load();
            const out = ok();
            out.name = '🍎短剧';
            out.login = creds != null && !!creds.cookie;
            out.nickname = creds == null ? '' : String(creds.nickname == null ? '' : creds.nickname);
            return JSON.stringify(out);
        }
        if (op === 'cloud.qr.create') {
            const w = new WebLogin();
            loginSession = w;
            const qr = w.qr();
            const out = ok();
            out.image = bytesToB64(qr.image);
            out.expire = qr.expiresIn;
            return JSON.stringify(out);
        }
        if (op === 'cloud.qr.poll') {
            const w = loginSession;
            if (w == null) throw new Error('请先获取二维码');
            const done = w.poll();
            const out = ok();
            if (done) {
                finalizeLogin(deps, w.credentials());
                loginSession = null;
                out.ok = true;
            } else {
                out.ok = false;
            }
            return JSON.stringify(out);
        }
        if (op === 'cloud.sms.send') {
            const mobile = String(reqObj.mobile == null ? '' : reqObj.mobile).trim();
            if (!mobile) throw new Error('请输入手机号');
            const s = smsSessionObj().send(mobile);
            const out = ok();
            out.masked = s.maskedMobile;
            out.retry = s.retrySeconds;
            return JSON.stringify(out);
        }
        if (op === 'cloud.sms.verify') {
            const code = String(reqObj.code == null ? '' : reqObj.code).trim();
            if (!code) throw new Error('请输入验证码');
            const s = smsSession;
            if (s == null) throw new Error('请先发送验证码');
            const cookie = s.verify(code);
            finalizeLogin(deps, cookie);
            smsSession = null;
            return JSON.stringify(ok());
        }
        if (op === 'cloud.logout') {
            loginSession = null;
            smsSession = null;
            local.delete(LKEY_ACCOUNT);
            return JSON.stringify(ok());
        }
        if (op === 'cloud.cancel') {
            loginSession = null;
            smsSession = null;
            return JSON.stringify(ok());
        }
        if (op === 'cloud.history') {
            const out = ok();
            out.list = history(deps);
            return JSON.stringify(out);
        }
        return err('未知操作: ' + op);
    } catch (t) {
        const msg = t && t.message ? String(t.message) : String(t);
        deps.log(TAG_MSG + ' ' + op + ' fail: ' + msg);
        return err(msg);
    }
}

function ok() {
    return { code: 0 };
}

function err(msg) {
    return JSON.stringify({ code: -1, msg: String(msg) });
}

/** 当前登录会话（二维码 Web 会话；短信发码依赖会话里的 csrf cookie 的旧口径已废弃）。 */
let loginSession = null;
/** 当前短信登录会话（App 通道，蓝本 PhoneLogin：一个实例对应一次发码+验码）。 */
let smsSession = null;

function smsSessionObj() {
    let s = smsSession;
    if (s == null) {
        s = new AppLogin();
        smsSession = s;
    }
    return s;
}

/** 登录收尾：绑定注册设备 → 校验红果账号资料 → 凭据落盘（蓝本 AccountController.validateAccount）。 */
function finalizeLogin(deps, cookie) {
    const dev = deps.appDevice(false);
    const info = accountGet(deps, '/reading/user/info/v1/', {}, cookie, dev);
    const data = info.data || null;
    const bizUserId = data == null ? '' : str(data, 'biz_user_id');
    if (!bizUserId) {
        throw new Error('该手机号还没有账号资料，请先用官方App登录一次再回来试（或改用扫码）');
    }
    let nickname = data == null ? '' : str(data, 'user_name');
    if (!nickname) nickname = '短剧用户';
    save(cookie, dev.device_id, dev.install_id, nickname);
}

// ============================ 凭据存取 ============================

function load() {
    try {
        const text = local.get(LKEY_ACCOUNT, '');
        if (!text) return null;
        const json = safeParse(text);
        if (!json.cookie) return null;
        return json;
    } catch (t) {
        return null;
    }
}

function save(cookie, deviceId, installId, nickname) {
    local.set(LKEY_ACCOUNT, JSON.stringify({
        cookie: cookie,
        device_id: deviceId,
        install_id: installId,
        nickname: nickname,
    }));
}

// ============================ 官网 Web 登录（蓝本 WebLogin.kt） ============================

/** 一次官网登录会话：csrf cookie 在发码/验码/轮询间保持；一个实例对应一次登录。 */
class WebLogin {
    constructor() {
        this.cookies = new Map(); // 会话 cookie（单域 hongguoduanju.com，按下发顺序覆盖同名）
        this.token = '';
        this.mobile = '';
        this.sent = false;
    }

    /** 获取登录二维码（官网 /passport/web/get_qrcode/）。 */
    qr() {
        const params = {};
        params.next = WEB_BASE + '/';
        const data = checked(this.call('/passport/web/get_qrcode/', null, params));
        this.token = String(data.token == null ? '' : data.token);
        let encoded = String(data.qrcode == null ? '' : data.qrcode);
        const at = encoded.indexOf('base64,');
        if (at >= 0) encoded = encoded.substring(at + 'base64,'.length);
        const expiry = Number(data.expire_time != null ? data.expire_time : 180);
        let seconds;
        if (expiry > 1000000000) {
            const left = expiry - Math.floor(Date.now() / 1000);
            seconds = Math.max(0, Math.min(600, left)) | 0;
        } else {
            seconds = Math.max(0, Math.min(600, expiry)) | 0;
        }
        return { image: b64Decode(encoded), expiresIn: seconds };
    }

    /** 轮询扫码状态；false=等待扫码/确认；true=已确认且拿到登录态。 */
    poll() {
        if (!this.token.trim()) throw new Error('请先获取二维码');
        const params = {};
        params.next = WEB_BASE + '/';
        params.token = this.token;
        let data;
        try {
            data = checked(this.call('/passport/web/check_qrconnect/', null, params));
        } catch (e) {
            // 错误码 13=token 已被消费/失效：说明确认时序已过，按二维码过期引导重取，避免反复报“会话过期”
            const m = e && e.message ? String(e.message) : '';
            if (m.indexOf('错误码 13') >= 0) throw new Error('二维码已失效，请点击刷新重新获取');
            throw e;
        }
        const status = String(data.status == null ? '' : data.status);
        if (status === '5' || status === 'expired') {
            throw new Error('二维码已过期，请重新获取');
        }
        if (status === '3' || status === 'confirmed') {
            const redirect = String(data.redirect_url == null ? '' : data.redirect_url);
            if (redirect) this.finishRedirect(redirect);
            if (!this.hasSession()) throw new Error('官网尚未下发登录态，请点击刷新重新扫码');
        }
        return this.hasSession();
    }

    /** 发送短信验证码（官网 /passport/web/send_code/，表单混淆 mix_mode=1）。 */
    send(number) {
        if (!this.cookies.has('passport_csrf_token')) this.qr(); // 先取 csrf cookie
        this.mobile = number.charAt(0) === '+' ? number : '+86 ' + number;
        const form = {};
        form.mobile = mix(this.mobile);
        form.type = mix('24');
        form.mix_mode = '1';
        form.fixed_mix_mode = '1';
        const data = checked(this.call('/passport/web/send_code/', form, null));
        this.sent = true;
        return {
            maskedMobile: data.mobile ? String(data.mobile) : '你的手机',
            retrySeconds: data.retry_time != null ? (data.retry_time | 0) : 60,
        };
    }

    /** 验码登录（官网 /passport/web/sms_login/），成功返回可用的 Cookie 串。 */
    verify(code) {
        if (!this.sent) throw new Error('请先发送验证码');
        const form = {};
        form.mobile = mix(this.mobile);
        form.code = mix(code);
        form.login_only = 'true';
        form.mix_mode = '1';
        form.fixed_mix_mode = '1';
        checked(this.call('/passport/web/sms_login/', form, null));
        return this.credentials();
    }

    /** 登录态 Cookie 串（仅 hongguoduanju.com 域内、未过期的 cookie）。 */
    credentials() {
        if (!this.hasSession()) throw new Error('官网尚未下发登录态，请先在手机确认登录');
        checked(this.call('/passport/account/info/v2/', null, null));
        const parts = [];
        for (const [k, v] of this.cookies) parts.push(k + '=' + v);
        return parts.join('; ');
    }

    hasSession() {
        return this.cookies.has('sessionid') || this.cookies.has('sessionid_ss');
    }

    /** 官网确认后的 redirect 收尾（最多 5 跳，域名校验，蓝本 finishRedirect）。
     *  蓝本走 execute()：每跳都带 Cookie 头并解析 Set-Cookie——sessionid 正是在这条链里下发，必须收下。
     *  JS 版经壳 req（redirect:0 手动跟随，逐跳校验协议/域并解析 Set-Cookie）。 */
    finishRedirect(value) {
        let url = resolveUrl(WEB_BASE, value);
        for (let hop = 0; hop < 5; hop++) {
            const m = /^https:\/\/hongguoduanju\.com(\/|$)/.exec(url);
            if (!m) throw new Error('登录确认跳转到不支持的站点');
            const headers = { 'Referer': WEB_BASE + '/' };
            const cookieHeader = this.cookieHeader();
            if (cookieHeader) headers['Cookie'] = cookieHeader;
            const res = req(url, {
                method: 'get',
                headers: Object.assign({ 'User-Agent': WEB_UA, 'Accept-Language': 'zh-CN,zh;q=0.9' }, headers),
                redirect: 0,
                timeout: 30000,
            });
            this.storeCookies(res.headers);
            const location = res.headers ? (res.headers['location'] || res.headers['Location']) : null;
            if (location) {
                url = resolveUrl(WEB_BASE, String(location));
                continue;
            }
            return;
        }
        throw new Error('登录确认跳转次数过多');
    }

    /** 当前会话 Cookie 串（蓝本 execute() 的请求侧 Cookie 头）。 */
    cookieHeader() {
        const parts = [];
        for (const [k, v] of this.cookies) parts.push(k + '=' + v);
        return parts.join('; ');
    }

    /** 官网 passport 请求：公共参数 + CSRF + 可选表单；非 2xx 也读 body（passport 用 JSON 报错）。 */
    call(path, form, params) {
        let url = WEB_BASE + path;
        url += '?aid=513755&passport_jssdk_version=3.4.10&passport_jssdk_type=normal'
            + '&account_sdk_source=web&is_from_ttaccountsdk=1&language=zh';
        if (params != null) {
            for (const k of Object.keys(params)) {
                url += '&' + urlEncode(k) + '=' + urlEncode(params[k]);
            }
        }
        const method = form == null ? 'GET' : 'POST';
        const headers = {
            'User-Agent': WEB_UA,
            'Accept-Language': 'zh-CN,zh;q=0.9',
            'Referer': WEB_BASE + '/',
            'Origin': WEB_BASE,
            'Accept': 'application/json, text/javascript',
        };
        const csrf = this.cookies.get('passport_csrf_token');
        if (csrf != null) headers['x-tt-passport-csrf-token'] = csrf;
        const cookieHeader = this.cookieHeader();
        if (cookieHeader) headers['Cookie'] = cookieHeader;
        const opts = { method: method.toLowerCase(), headers: headers, redirect: 0, timeout: 30000 };
        if (form != null) {
            const body = Object.keys(form).map(function (k) {
                return urlEncode(k) + '=' + urlEncode(form[k]);
            }).join('&');
            headers['Content-Type'] = 'application/x-www-form-urlencoded';
            opts.body = body;
        }
        const res = req(url, opts);
        this.storeCookies(res.headers);
        const text = res.content || '';
        try {
            return safeParse(text);
        } catch (e) {
            throw new Error('官网登录返回格式异常');
        }
    }

    /** 解析 Set-Cookie 进会话存储（同名覆盖；仅保留 name=value 主部）。
     *  node 桩多值 header 以 '\n' 连接；壳桥待对齐（代码注释标注）。 */
    storeCookies(headers) {
        try {
            let raw = '';
            for (const k of Object.keys(headers || {})) {
                if (String(k).toLowerCase() === 'set-cookie') raw = String(headers[k]);
            }
            for (const line of raw.split('\n')) {
                const pair = line.indexOf(';') >= 0 ? line.substring(0, line.indexOf(';')) : line;
                const eq = pair.indexOf('=');
                if (eq <= 0) continue;
                const name = pair.substring(0, eq).trim();
                const value = pair.substring(eq + 1).trim();
                if (name && value) this.cookies.set(name, value); // JS Map 重 put 保持原插入位（LinkedHashMap 语义）
            }
        } catch (ignore) {}
    }
}

function checked(reply) {
    const data = reply && typeof reply === 'object' ? reply.data : null;
    if (data == null || typeof data !== 'object') throw new Error('官网登录返回格式异常');
    if (reply.message !== 'success') {
        const code = data.error_code != null ? (data.error_code | 0) : -1;
        let message;
        if (data.verify_center_decision_conf !== undefined) {
            message = '平台要求完成滑块验证，请改用扫码登录';
        } else {
            const desc = String(data.description == null ? '' : data.description).trim();
            message = desc ? desc : '官网登录失败';
        }
        throw new Error(message + '（错误码 ' + code + '）');
    }
    return data;
}

/** 表单混淆（蓝本 mix）：每字节 xor 5 转十六进制，无补零。 */
function mix(value) {
    const bytes = utf8ToBytes(value);
    let sb = '';
    for (let i = 0; i < bytes.length; i++) sb += ((bytes[i] & 255) ^ 5).toString(16);
    return sb;
}

function urlEncode(v) {
    // Java URLEncoder.encode(v, "UTF-8")：空格→+、保留 .-*_；调用值域（URL/hex/token）与
    // encodeURIComponent 的差异仅在空格与 ~，实际入参不含，等价
    return encodeURIComponent(String(v));
}

function resolveUrl(base, value) {
    if (value.indexOf('http://') === 0 || value.indexOf('https://') === 0) return value;
    return base + (value.charAt(0) === '/' ? value : '/' + value);
}

function b64Decode(s) {
    // binutil.b64ToBytes 未直接引入（免循环依赖顾虑，就地最小实现，容错 _-/）
    const B64 = 'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/';
    let str = String(s).replace(/[\r\n\s]/g, '').replace(/-/g, '+').replace(/_/g, '/');
    const pad = str.length % 4;
    if (pad === 2) str += '==';
    else if (pad === 3) str += '=';
    else if (pad === 1) return new Uint8Array(0);
    const out = [];
    let acc = 0, bits = 0;
    for (let i = 0; i < str.length; i++) {
        const c = str.charAt(i);
        if (c === '=') break;
        const v = B64.indexOf(c);
        if (v < 0) continue;
        acc = (acc << 6) | v;
        bits += 6;
        if (bits >= 8) {
            bits -= 8;
            out.push((acc >> bits) & 255);
        }
    }
    return new Uint8Array(out);
}

// ============================ App 通道短信登录（蓝本 PhoneLogin.kt） ============================

/**
 * 手机号 + 验证码登录（官方 App 口径）。官网 Web 通道（/passport/web/send_code/）发码会被
 * 风控要求滑块验证，官方 App 通道（security.snssdk.com + 固定设备指纹 + 全套签名头）触发
 * 概率低。通道规则（蓝本 PhoneLogin.call 实测注释，均照抄）：
 *  - 不注册新设备：直接用设备表里的固定 device_id/iid（新注册设备会被判 2046）；
 *  - query 不带 device_id/iid（设备靠签名 medusa 里的 deviceProto 识别），带着会被判异常设备；
 *  - 刻意不回发 Cookie（send_code 下发的 cookie 带到 sms_login 会回 2046）；
 *    Set-Cookie 照常解析保留，仅用于判定 sessionid 是否已下发；
 *  - 平台在每次验码尝试后下发新 mobile_ticket，后续端点沿用最新值。
 * 一个实例对应一次登录；重新发码重置会话。
 */
class AppLogin {
    constructor() {
        this.cookies = new Map();
        this.mobile = '';
        this.ticket = '';
        this.sent = false;
    }

    /** 发送短信验证码（官方 App 端点 /passport/mobile/send_code/v1/，GET）。 */
    send(number) {
        this.cookies.clear();
        this.ticket = '';
        this.sent = false;
        this.mobile = number.charAt(0) === '+' ? number : number; // 大陆号原样发（蓝本 format 86 口径）
        const passport = {};
        passport.aid = '8662';
        passport.app_name = 'novelread';
        passport.device_platform = 'android';
        passport.mobile = this.mobile;
        passport.type = '24'; // login-lab 实测：24=登录验证码；1/3 是绑定/换绑
        const reply = this.passportCall('/passport/mobile/send_code/v1/', false, passport);
        let data = reply.data && typeof reply.data === 'object' ? reply.data : {};
        // 风控要求滑块验证：App 通道仍可能下发，电视端无法完成，明确引导用户
        if (data.verify_center_decision_conf !== undefined) {
            throw new Error('平台要求先完成滑块验证，请稍后重试或改用扫码登录');
        }
        if (reply.message !== 'success') {
            const desc = String(data.description == null ? '' : data.description).trim();
            throw new Error(desc || '验证码没发出去');
        }
        this.ticket = String(data.mobile_ticket == null ? '' : data.mobile_ticket);
        this.sent = true;
        return {
            maskedMobile: data.mobile ? String(data.mobile) : '你的手机',
            retrySeconds: data.retry_time != null ? (data.retry_time | 0) : 60,
        };
    }

    /** 验码登录：多端点依次尝试（蓝本 VERIFY_ATTEMPTS），成功返回 Cookie 串。 */
    verify(code) {
        if (!this.sent) throw new Error('请先发送验证码');
        let firstFailure = null;
        // 主端点 sms_login 系列；validate_code 是「已登录校验手机号」入口，对未登录固定回
        // error_code 1 会话过期，仅作最后兜底（蓝本 2026-11-03 实测）
        const attempts = [
            ['/passport/mobile/sms_login/', 'post'],
            ['/passport/mobile/sms_login_only/', 'post'],
            ['/passport/mobile/sms_login_continue/', 'post'],
            ['/passport/mobile/validate_code/v1/', 'get'],
            ['/passport/mobile/validate_code/v1/', 'post'],
        ];
        for (let i = 0; i < attempts.length; i++) {
            const passport = {};
            passport.aid = '8662';
            passport.app_name = 'novelread';
            passport.device_platform = 'android';
            passport.mobile = this.mobile;
            passport.code = code;
            passport.type = '24';
            if (this.ticket) passport.mobile_ticket = this.ticket;
            const reply = this.passportCall(attempts[i][0], attempts[i][1] === 'post', passport);
            if (this.cookies.has('sessionid') || this.cookies.has('sessionid_ss')) break;
            let data = reply.data && typeof reply.data === 'object' ? reply.data : {};
            // 平台会在每次尝试后下发新的 mobile_ticket，后续端点沿用最新值
            const fresh = String(data.mobile_ticket == null ? '' : data.mobile_ticket);
            if (fresh) this.ticket = fresh;
            const errorCode = data.error_code != null ? (data.error_code | 0) : 0;
            if (errorCode === 0 || errorCode === 1) {
                // 1=会话过期：这条端点不适用于「未登录换验证码」，继续试下一条
                if (errorCode === 1 && firstFailure == null) {
                    firstFailure = '会话过期，请重新登录（错误码 1）';
                }
                continue;
            }
            if (errorCode === 1203) {
                // 错误次数过多或验证码过期：本次会话作废，继续提交只会更糟
                this.sent = false;
                this.cookies.clear();
                this.ticket = '';
                const desc = String(data.description == null ? '' : data.description).trim();
                throw new Error(desc || '错误次数过多或验证码过期，请重新获取验证码（错误码 1203）');
            }
            const desc = String(data.description == null ? '' : data.description).trim();
            throw new Error(desc || '验证码校验失败（错误码 ' + errorCode + '）');
        }
        if (!this.cookies.has('sessionid') && !this.cookies.has('sessionid_ss')) {
            throw new Error(firstFailure == null ? '登录没有成功，平台没有下发登录态' : firstFailure);
        }
        return this.credentials();
    }

    /** 当前会话 Cookie 串（与 WebLogin.credentials() 同格式，供 finalizeLogin 落盘）。 */
    credentials() {
        const parts = [];
        for (const [k, v] of this.cookies) parts.push(k + '=' + v);
        return parts.join('; ');
    }

    /**
     * passport 签名请求（蓝本 PhoneLogin.call + Signer.sign）：设备表组参 → branch0 抖动 →
     * 全套签名头。GET 时业务参数进 query；POST 时业务参数编 urlencoded body、query 只有设备表。
     * 刻意不回发 Cookie；Set-Cookie 解析进 this.cookies。
     */
    passportCall(path, post, passport) {
        const now = Date.now();
        const ts = Math.floor(now / 1000);
        // 设备表：固定指纹 + 版本口径覆盖 7.3.9.32/73932（蓝本 PhoneLogin.call device 块）
        const device = Object.assign({}, APP_DEVICE);
        device.version_code = '73932';
        device.manifest_version_code = '73932';
        device.update_version_code = '73932';
        device.pv_player = '73932';
        device.version_name = '7.3.9.32';
        const deviceId = APP_DEVICE.device_id;
        // query 去掉 device_id/iid（带着会被判异常设备），签名器内部仍使用完整设备表
        const queryDevice = {};
        for (const k of Object.keys(device)) {
            if (k !== 'device_id' && k !== 'iid') queryDevice[k] = device[k];
        }
        let body = null;
        if (post) {
            // 蓝本 Signer.encode(passport)：仅业务参数编 urlencoded（pythonUrlEncode 同口径）
            body = utf8ToBytes(qg.pythonUrlEncode(passport));
        }
        let query = null;
        let ticketTs = now;
        for (let offset = 0; offset <= 127; offset++) {
            ticketTs = now + offset;
            let vals;
            if (!post) {
                // putAll(passport)：已有 key 覆盖值保持原位，新 key 追加（LinkedHashMap 语义）
                vals = Object.assign({}, queryDevice, passport);
            } else {
                vals = Object.assign({}, queryDevice);
            }
            vals.ts = String(ts);
            vals._rticket = String(ticketTs);
            const q = qg.pythonUrlEncode(vals);
            if (qg.branchOfBody(q, body, ts) === 0) {
                query = q;
                break;
            }
        }
        if (query == null) throw new Error('签名分支抖动失败（128 次）');
        const url = PASSPORT_BASE + path + '?' + query;
        const random = Math.floor(Math.random() * 65536);
        const headers = {};
        headers['User-Agent'] = post ? PASSPORT_VIDEO_UA : PASSPORT_APP_UA;
        headers['Accept'] = 'application/json; charset=utf-8,application/x-protobuf';
        headers['x-ss-req-ticket'] = String(ticketTs);
        headers['x-tt-request-tag'] = 't=0;n=0';
        headers['sdk-version'] = '2';
        headers['passport-sdk-version'] = '50561';
        headers['x-xs-from-web'] = '0';
        headers['x-khronos'] = String(ts);
        headers['x-ladon'] = bytesToB64(be32(ts));
        headers['x-argus'] = bytesToB64(qg.le32(ts));
        headers['x-gorgon'] = qg.xGorgon(query, body, ts, random);
        headers['x-helios'] = qg.helios(ts);
        headers['x-medusa'] = qg.buildMedusa(url, body, ts, deviceId);
        headers['x-tt-dt'] = '';
        if (body != null) {
            headers['Content-Type'] = 'application/x-www-form-urlencoded';
            headers['x-ss-stub'] = qg.md5HexUpper(body);
        }
        const opts = { method: post ? 'post' : 'get', headers: headers, redirect: 0, timeout: 30000 };
        if (body != null) {
            const arr = new Array(body.length);
            for (let i = 0; i < body.length; i++) arr[i] = body[i] & 255;
            opts.body = String.fromCharCode.apply(null, arr); // urlencoded 全 ASCII，Latin1 直转无损
        }
        const res = req(url, opts);
        this.storeCookies(res.headers);
        const text = res.content || '';
        if (!text) throw new Error('passport 请求失败（HTTP 错误，响应为空）');
        let reply;
        try {
            reply = safeParse(text);
        } catch (e) {
            throw new Error('passport 返回格式异常: ' + text.substring(0, Math.min(120, text.length)));
        }
        return reply;
    }

    /** 解析 Set-Cookie 进会话存储（同名覆盖；仅保留 name=value 主部；不回发）。 */
    storeCookies(headers) {
        try {
            let raw = '';
            for (const k of Object.keys(headers || {})) {
                if (String(k).toLowerCase() === 'set-cookie') raw = String(headers[k]);
            }
            for (const line of raw.split('\n')) {
                const pair = line.indexOf(';') >= 0 ? line.substring(0, line.indexOf(';')) : line;
                const eq = pair.indexOf('=');
                if (eq <= 0) continue;
                const name = pair.substring(0, eq).trim();
                const value = pair.substring(eq + 1).trim();
                if (name && value) this.cookies.set(name, value);
            }
        } catch (ignore) {}
    }
}

// ============================ 云端观看历史（蓝本 CloudAccount.kt history） ============================

/**
 * 云端观看历史：读进度列表（book_types=2）+ multi-detail 批量补标题/封面。
 * 与蓝本一致：按 seriesId 去重、按最近观看倒序。
 */
function history(deps) {
    const creds = load();
    if (creds == null) throw new Error('未登录账号');
    const cookie = String(creds.cookie == null ? '' : creds.cookie);
    const dev = deps.appDevice(false);

    const listValues = {};
    listValues.book_types = '2';
    listValues.limit = '50';
    const resp = accountGet(deps, '/reading/bookapi/read_progress/list/v1/', listValues, cookie, dev);
    let rows = resp.video_data;
    if (rows == null) {
        const data = resp.data;
        if (data != null) rows = data.video_data;
    }
    if (rows == null) throw new Error('云端历史数据格式已变化');

    const entries = [];
    const seen = [];
    for (let i = 0; i < rows.length; i++) {
        const row = rows[i];
        if (row == null || typeof row !== 'object') continue;
        let id = str(row, 'series_id');
        if (!id) id = str(row, 'book_id');
        const episode = str(row, 'vid');
        if (!/^[0-9]{1,30}$/.test(id) || !/^[0-9]{1,30}$/.test(episode)) continue;
        let stamp = Number(row.last_watch_time != null ? row.last_watch_time : 0);
        if (stamp > 0 && stamp < 10000000000) stamp *= 1000; // 秒 → 毫秒自适应
        const entry = {
            seriesId: id,
            episodeId: episode,
            episodeIndex: Math.max(0, (row.vid_index != null ? (row.vid_index | 0) : 1) - 1),
            position: Math.max(0, row.current_play_time != null ? row.current_play_time : 0),
            duration: Math.max(0, row.current_total_time != null ? row.current_total_time : 0),
            updatedAt: stamp,
            episodeCount: Math.max(0, row.episode_count != null ? (row.episode_count | 0) : 0),
        };
        const seenAt = seen.indexOf(id);
        if (seenAt >= 0) {
            // 同剧去重：保留最近观看的一条
            for (let k = 0; k < entries.length; k++) {
                if (entries[k].seriesId === id) {
                    if (entries[k].updatedAt < stamp) entries[k] = entry;
                    break;
                }
            }
        } else {
            seen.push(id);
            entries.push(entry);
        }
    }
    if (!entries.length) return [];
    entries.sort(function (a, b) { return b.updatedAt - a.updatedAt; });

    // multi-detail 批量补标题/封面/简介/角标
    let ids = '';
    for (let i = 0; i < entries.length; i++) {
        if (i > 0) ids += ',';
        ids += entries[i].seriesId;
    }
    const detailValues = {};
    detailValues.book_id = ids;
    detailValues.book_type = '2';
    const detail = accountGet(deps, '/reading/bookapi/multi-detail/v1/', detailValues, cookie, dev);
    const detailRows = detail.data;
    const out = [];
    for (let i = 0; i < entries.length; i++) {
        const e = entries[i];
        const id = e.seriesId;
        let meta = null;
        for (let k = 0; detailRows != null && k < detailRows.length; k++) {
            const row = detailRows[k];
            if (row != null && typeof row === 'object' && id === str(row, 'book_id')) {
                meta = row;
                break;
            }
        }
        if (meta != null) {
            e.title = str(meta, 'book_name');
            e.cover = cleanUrl(meta.thumb_url != null ? String(meta.thumb_url) : '');
            e.description = str(meta, 'abstract');
            e.badge = episodeBadge(meta);
        } else {
            e.title = '剧集 ' + id;
            e.cover = '';
            e.description = '';
            e.badge = '';
        }
        out.push(e);
    }
    return out;
}

function episodeBadge(row) {
    let count = 0;
    const keys = ['episode_cnt', 'episode_count', 'drama_chapter_number'];
    for (let i = 0; i < keys.length; i++) {
        const v = row[keys[i]] != null ? (row[keys[i]] | 0) : 0;
        if (v > 0) {
            count = v;
            break;
        }
    }
    return count > 0 ? '全 ' + count + ' 集' : '';
}

/**
 * 账号域签名 GET（仿 Qingguoduanju.appSearchRequest）：设备表组参 → branch0 抖动 →
 * 全套签名头 + Cookie；响应 code!=0 抛用户可读异常。
 */
function accountGet(deps, path, values, cookie, dev) {
    const now = Date.now();
    const ts = Math.floor(now / 1000);
    let ticket = now;
    let query = null;
    for (let offset = 0; offset <= 127; offset++) {
        ticket = now + offset;
        const vals = Object.assign({}, qg.appDeviceParams(dev.install_id, dev.device_id), values);
        vals.ts = String(ts);
        vals._rticket = String(ticket);
        const q = qg.pythonUrlEncode(vals);
        if (qg.branchOf(q, ts) === 0) {
            query = q;
            break;
        }
    }
    if (query == null) throw new Error('签名分支抖动失败（128 次）');
    const url = ACCOUNT_BASE + path + '?' + query;
    const random = Math.floor(Math.random() * 65536);
    const headers = {};
    headers['User-Agent'] = ACCOUNT_UA;
    headers['Accept'] = 'application/json; charset=utf-8,application/x-protobuf';
    headers['x-ss-req-ticket'] = String(ticket);
    headers['x-tt-request-tag'] = 't=0;n=0';
    headers['sdk-version'] = '2';
    headers['passport-sdk-version'] = '50561';
    headers['x-xs-from-web'] = '0';
    headers['x-khronos'] = String(ts);
    headers['x-ladon'] = bytesToB64(be32(ts));
    headers['x-argus'] = bytesToB64(qg.le32(ts));
    headers['x-gorgon'] = qg.xGorgon(query, null, ts, random);
    headers['x-helios'] = qg.helios(ts);
    headers['x-medusa'] = qg.buildMedusa(url, null, ts, dev.device_id);
    headers['x-tt-dt'] = '';
    if (cookie != null && cookie) headers['Cookie'] = cookie;
    const resp = deps.httpText(url, 'GET', null, headers).trim();
    if (!resp) throw new Error('账号接口空响应，请重新登录或稍后重试');
    let json;
    try {
        json = safeParse(resp);
    } catch (e) {
        throw new Error('账号接口返回非 JSON: ' + resp.substring(0, Math.min(120, resp.length)));
    }
    const code = json.code != null ? (json.code | 0) : -1;
    if (code !== 0) {
        throw new Error('账号接口不可用（错误码 ' + code + '），请重新登录或稍后重试');
    }
    return json;
}

function str(json, key) {
    if (json[key] === null || json[key] === undefined) return '';
    return String(json[key]).trim();
}

function cleanUrl(s) {
    return String(s).replace(/\\\//g, '/').replace(/\\u002F/g, '/')
        .replace(/\\u0026/g, '&').replace(/&amp;/g, '&');
}

export default { handle };
