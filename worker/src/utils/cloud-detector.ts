import type { CloudType } from '../types';

/**
 * 网盘类型 URL 匹配规则
 * 优先读 D1 cloud_types 表（见 db/cloud-types.ts），此为内置兜底
 */
const DEFAULT_CLOUD_PATTERNS: Array<{ pattern: string; cloudType: CloudType }> = [
  { pattern: 'pan.quark.cn', cloudType: 'quark' },
  { pattern: 'pan.baidu.com', cloudType: 'baidu' },
  { pattern: 'aliyundrive.com', cloudType: 'aliyun' },
  { pattern: 'alipan.com', cloudType: 'aliyun' },
  { pattern: 'drive.uc.cn', cloudType: 'uc' },
  { pattern: 'pan.xunlei.com', cloudType: 'xunlei' },
  { pattern: 'cloud.189.cn', cloudType: 'tianyi' },
];

/** 从 URL 检测网盘类型 */
export function detectCloudType(url: string): CloudType {
  for (const { pattern, cloudType } of DEFAULT_CLOUD_PATTERNS) {
    if (url.includes(pattern)) return cloudType;
  }
  return 'other';
}

/** 从分享链接提取提取码（?pwd= / ?code= / 提取码:xxx） */
export function extractPasscode(url: string): string | undefined {
  const queryMatch = url.match(/[?&](?:pwd|code|passcode)=([a-zA-Z0-9]{4})/);
  if (queryMatch) return queryMatch[1];
  return undefined;
}
