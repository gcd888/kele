/**
 * 统一请求封装：响应信封 { code, msg, data }，code !== 0 reject。
 * admin 接口自动携带 Bearer token；401 清 token 跳管理登录页。
 *
 * 双端差异：
 * - H5：API_BASE 为空（同源，走 Worker 静态托管 + 相对路径）
 * - MP：小程序不允许相对路径，用 API_BASE 绝对地址（开发用 localhost，
 *   上线前替换为备案域名，并在微信后台配置 request 合法域名）
 */
import type { Envelope } from '../types';

export const TOKEN_KEY = 'kele_admin_token';

// #ifdef MP-WEIXIN
export const API_BASE = 'http://localhost:8787'; // TODO: 上线前替换为备案域名 https://your.domain
// #endif
// #ifndef MP-WEIXIN
export const API_BASE = '';
// #endif

export function getAdminToken(): string {
  try {
    return uni.getStorageSync(TOKEN_KEY) || '';
  } catch {
    return '';
  }
}

export function setAdminToken(token: string): void {
  try {
    uni.setStorageSync(TOKEN_KEY, token);
  } catch {
    /* ignore */
  }
}

export function clearAdminToken(): void {
  try {
    uni.removeStorageSync(TOKEN_KEY);
  } catch {
    /* ignore */
  }
}

export class ApiError extends Error {
  statusCode: number;
  constructor(message: string, statusCode = 0) {
    super(message);
    this.statusCode = statusCode;
  }
}

export interface RequestOptions {
  method?: 'GET' | 'POST' | 'PUT' | 'DELETE';
  data?: unknown;
}

export function request<T>(path: string, options: RequestOptions = {}): Promise<T> {
  const { method = 'GET', data } = options;
  const isAdmin = path.startsWith('/admin');
  return new Promise<T>((resolve, reject) => {
    const header: Record<string, string> = {};
    const token = getAdminToken();
    if (token) header['Authorization'] = 'Bearer ' + token;

    uni.request({
      url: API_BASE + '/api' + path,
      method,
      data: data as never,
      timeout: 20000,
      header,
      success: (res) => {
        const sc = res.statusCode || 0;
        if (sc === 401) {
          if (isAdmin) {
            clearAdminToken();
            uni.reLaunch({ url: '/pages/admin/login' });
          }
          reject(new ApiError('登录已过期，请重新登录', 401));
          return;
        }
        const body = res.data as Envelope<T> | null;
        if (body && typeof body === 'object' && typeof body.code === 'number') {
          if (body.code === 0) {
            resolve(body.data as T);
          } else {
            reject(new ApiError(body.msg || '请求失败(' + body.code + ')', sc));
          }
        } else if (sc >= 200 && sc < 300) {
          resolve(res.data as T);
        } else {
          reject(new ApiError('请求失败(' + sc + ')', sc));
        }
      },
      fail: (err) => {
        reject(new ApiError((err && err.errMsg) || '网络请求失败', 0));
      },
    });
  });
}
