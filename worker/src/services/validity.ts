import type { CloudType, ValidStatus } from '../types';
import { ValidStatus as VS } from '../types';

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

/** UC：sharepage/v2/detail，"分享地址已过期"失效；歧义态返回 unknown */
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
    if ((resp.status === 404 || data.status === 404) && data.message?.includes('分享地址已过期')) return 'invalid';
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
};

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
