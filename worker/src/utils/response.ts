import type { ApiResponse } from '../types';

/** 构造成功响应 */
export function success<T>(data: T, msg = 'success'): ApiResponse<T> {
  return { code: 0, msg, data };
}

/** 构造错误响应 */
export function error(code: number, msg: string, errCode?: string): ApiResponse {
  return { code, msg, error: errCode };
}
