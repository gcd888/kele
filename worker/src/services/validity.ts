import type { CloudType, ValidStatus } from '../types';
import { ValidStatus as VS } from '../types';
import { createHash } from 'node:crypto';

/**
 * 失效检测器插件（docs/03 §3.7）
 * 内置 quark/aliyun/baidu/uc，其余类型恒 'unknown'（不发起检测）
 * 契约见 docs/02 §B.2
 */

export type Validity = 'unknown' | 'valid' | 'invalid';
export type ValidityChecker = (url: string) => Promise<Validity>;

const CHECK_TIMEOUT_MS = 5000;

function checkSignal(): { signal: AbortSignal; done: () => void } {
  const ac = new AbortController();
  const timer = setTimeout(() => ac.abort(), CHECK_TIMEOUT_MS);
  return { signal: ac.signal, done: () => clearTimeout(timer) };
}

/** URL 末段（夸克 pwd_id / 阿里 share_id） */
function extractLastPathSegment(url: string): string {
  const clean = url.split('?')[0].split('#')[0];
  const parts = clean.split('/');
  return parts[parts.length - 1] || '';
}

/** 夸克：sharepage/token，code=0 有效 / 41012 失效 */
async function checkQuark(url: string): Promise<Validity> {
  const { signal, done } = checkSignal();
  try {
    const pwdId = extractLastPathSegment(url);
    if (!pwdId) return 'invalid';
    const resp = await fetch(
      'https://drive-h.quark.cn/1/clouddrive/share/sharepage/token?pr=ucpro&fr=pc&uc_param_str=',
      {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ pwd_id: pwdId, passcode: '', support_visit_limit_private_share: true }),
        signal,
      },
    );
    const data = (await resp.json().catch(() => ({}))) as { code?: number };
    if (resp.status === 200 && data.code === 0) return 'valid';
    return 'invalid';
  } catch {
    return 'invalid';
  } finally {
    done();
  }
}

/** 百度：HTML 嗅探"链接不存在"；请求异常默认按有效处理（示例项目契约） */
async function checkBaidu(url: string): Promise<Validity> {
  const { signal, done } = checkSignal();
  try {
    const resp = await fetch(url, {
      headers: { 'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36' },
      signal,
    });
    const html = await resp.text();
    return html.includes('百度网盘-链接不存在') ? 'invalid' : 'valid';
  } catch {
    return 'valid';
  } finally {
    done();
  }
}

/** 阿里：get_share_by_anonymous，200 有效 / 400 失效 */
async function checkAliyun(url: string): Promise<Validity> {
  const { signal, done } = checkSignal();
  try {
    const shareId = extractLastPathSegment(url);
    if (!shareId) return 'invalid';
    const resp = await fetch('https://api.aliyundrive.com/adrive/v3/share_link/get_share_by_anonymous', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ share_id: shareId }),
      signal,
    });
    if (resp.status === 200) return 'valid';
    return 'invalid';
  } catch {
    return 'invalid';
  } finally {
    done();
  }
}

/** UC：sharepage/v2/detail，200 有效；404/取消分享/文件不存在等失效；其余歧义态返回 unknown */
async function checkUc(url: string): Promise<Validity> {
  const { signal, done } = checkSignal();
  try {
    const pwdId = extractLastPathSegment(url.split('#')[0]);
    if (!pwdId) return 'invalid';
    const resp = await fetch('https://pc-api.uc.cn/1/clouddrive/share/sharepage/v2/detail?pr=UCBrowser&fr=pc', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({
        pwd_id: pwdId,
        passcode: '',
        force: 0,
        page: 1,
        size: 50,
        fetch_banner: 1,
        fetch_share: 1,
        fetch_total: 1,
        sort: 'file_type:asc,file_name:asc',
        banner_platform: 'other',
        web_platform: 'windows',
        fetch_error_background: 1,
      }),
      signal,
    });
    const data = (await resp.json().catch(() => ({}))) as { status?: number; message?: string };
    // 失效形态：HTTP 404「文件不存在/分享地址已过期」、HTTP 200+status 404「好友已取消了分享」等
    if (resp.status === 404 || data.status === 404) return 'invalid';
    if (resp.status === 200 && data.status === 200) return 'valid';
    return 'unknown';
  } catch {
    return 'unknown';
  } finally {
    done();
  }
}

export const VALIDITY_CHECKERS: Partial<Record<CloudType, ValidityChecker>> = {
  quark: checkQuark,
  baidu: checkBaidu,
  aliyun: checkAliyun,
  uc: checkUc,
  xunlei: checkXunlei,
};

// ===== 迅雷：验证码令牌服务端铸造（源自开源 alist Thunder 驱动的签名算法）+ share API 判定 =====

const XL_CLIENT_ID = 'Xp6vsxz_7IYVw2BB';
const XL_CLIENT_VERSION = '8.31.0.9726';
const XL_PACKAGE_NAME = 'com.xunlei.downloadprovider';
const XL_USER_AGENT = 'ANDROID-com.xunlei.downloadprovider/8.31.0.9726 netWorkType/5G appid/40';
const XL_ALGORITHMS = [
  '9uJNVj/wLmdwKrJaVj/omlQ',
  'Oz64Lp0GigmChHMf/6TNfxx7O9PyopcczMsnf',
  'Eb+L7Ce+Ej48u',
  'jKY0',
  'ASr0zCl6v8W4aidjPK5KHd1Lq3t+vBFf41dqv5+fnOd',
  'wQlozdg6r1qxh0eRmt3QgNXOvSZO6q/GXK',
  'gmirk+ciAvIgA/cxUUCema47jr/YToixTT+Q6O',
  '5IiCoM9B1/788ntB',
  'P07JH0h6qoM6TSUAK2aL9T5s2QBVeY9JWvalf',
  '+oK0AN',
];
/** 令牌实际有效期 300s，提前 60s 刷新 */
const XL_TOKEN_TTL_MS = 240_000;

const xlState = { deviceId: '', token: '', mintedAt: 0 };

function xlMd5(s: string): string {
  return createHash('md5').update(s).digest('hex');
}

/** captcha_sign：身份五元组拼接后逐个叠加 MD5(盐) */
function xlCaptchaSign(deviceId: string, timestamp: string): string {
  let str = XL_CLIENT_ID + XL_CLIENT_VERSION + XL_PACKAGE_NAME + deviceId + timestamp;
  for (const alg of XL_ALGORITHMS) str = xlMd5(str + alg);
  return '1.' + str;
}

/** 向 captcha/init 铸造令牌；失败返回 null */
async function mintXlToken(deviceId: string): Promise<string | null> {
  const { signal, done } = checkSignal();
  try {
    const timestamp = Date.now().toString();
    const resp = await fetch('https://xluser-ssl.xunlei.com/v1/shield/captcha/init', {
      method: 'POST',
      headers: { 'Content-Type': 'text/plain;charset=UTF-8', 'User-Agent': XL_USER_AGENT },
      body: JSON.stringify({
        client_id: XL_CLIENT_ID,
        action: 'get:/drive/v1/share',
        device_id: deviceId,
        meta: {
          username: '',
          phone_number: '',
          email: '',
          package_name: XL_PACKAGE_NAME,
          client_version: XL_CLIENT_VERSION,
          captcha_sign: xlCaptchaSign(deviceId, timestamp),
          timestamp,
          user_id: '0',
        },
      }),
      signal,
    });
    const data = (await resp.json().catch(() => ({}))) as { captcha_token?: string };
    return resp.status === 200 && data.captcha_token ? data.captcha_token : null;
  } catch {
    return null;
  } finally {
    done();
  }
}

/** isolate 级令牌缓存：同一 isolate 内多条例子请求共享一枚令牌 */
async function getXlToken(): Promise<{ token: string; deviceId: string } | null> {
  const now = Date.now();
  if (xlState.token && now - xlState.mintedAt < XL_TOKEN_TTL_MS) {
    return { token: xlState.token, deviceId: xlState.deviceId };
  }
  if (!xlState.deviceId) xlState.deviceId = crypto.randomUUID().replace(/-/g, '');
  const token = await mintXlToken(xlState.deviceId);
  if (!token) return null;
  xlState.token = token;
  xlState.mintedAt = now;
  return { token, deviceId: xlState.deviceId };
}

type XlAttempt = 'valid' | 'invalid' | 'unknown' | 'retry';

async function xlAttempt(url: string, token: string, deviceId: string): Promise<XlAttempt> {
  const { signal, done } = checkSignal();
  try {
    const u = new URL(url);
    const shareId = extractLastPathSegment(u.pathname);
    const passCode = u.searchParams.get('pwd') || '';
    const resp = await fetch(
      `https://api-pan.xunlei.com/drive/v1/share?share_id=${encodeURIComponent(shareId)}&pass_code=${encodeURIComponent(passCode)}&limit=1&scene=NORMAL`,
      {
        headers: {
          'x-client-id': XL_CLIENT_ID,
          'x-device-id': deviceId,
          'x-captcha-token': token,
          'User-Agent': XL_USER_AGENT,
        },
        signal,
      },
    );
    if (resp.status === 200) {
      const data = (await resp.json().catch(() => ({}))) as { share_status?: string };
      return data.share_status === 'OK' ? 'valid' : 'invalid';
    }
    // 400 无法区分「假 share_id」与「令牌失效」，统一交由上层刷令牌重试一次
    if (resp.status === 400) return 'retry';
    return 'unknown';
  } catch {
    return 'unknown';
  } finally {
    done();
  }
}

/**
 * 迅雷链接有效性：200+OK 有效 / EXPIRED、PASS_CODE_ERROR 等失效 / 假 ID 400 失效；
 * 铸令牌失败或网络异常返回 unknown（不落库）
 */
async function checkXunlei(url: string): Promise<Validity> {
  const clean = url.split('#')[0];
  if (!extractLastPathSegment(clean.split('?')[0])) return 'invalid';
  const first = await getXlToken();
  if (!first) return 'unknown';
  const r1 = await xlAttempt(clean, first.token, first.deviceId);
  if (r1 !== 'retry') return r1;
  // 令牌可能已过期：强制重铸后再试一次，仍 400 判失效
  xlState.token = '';
  const second = await getXlToken();
  if (!second) return 'unknown';
  const r2 = await xlAttempt(clean, second.token, second.deviceId);
  return r2 === 'retry' ? 'invalid' : r2;
}

/** 校验单条链接；无检测器的类型返回 'unknown' */
export async function checkValidity(url: string, cloudType: CloudType): Promise<Validity> {
  const checker = VALIDITY_CHECKERS[cloudType];
  if (!checker) return 'unknown';
  try {
    return await checker(url);
  } catch {
    return 'unknown';
  }
}

/** Validity → ValidStatus（DB 落库用） */
export function validityToStatus(v: Validity): ValidStatus {
  if (v === 'valid') return VS.VALID;
  if (v === 'invalid') return VS.INVALID;
  return VS.PENDING;
}
