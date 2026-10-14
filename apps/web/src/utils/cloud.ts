/**
 * 网盘类型元信息、状态文案与通用格式化工具
 */
import type { Validity } from '../types';

export interface CloudMeta {
  label: string;
  color: string;
}

/** 网盘角标：夸克蓝 / 百度绿 / 阿里橙 / UC 橙红 / 迅雷蓝紫 */
export const CLOUD_META: Record<string, CloudMeta> = {
  quark: { label: '夸克', color: '#1677ff' },
  baidu: { label: '百度', color: '#06ae56' },
  aliyun: { label: '阿里', color: '#ff8a00' },
  uc: { label: 'UC', color: '#ff5a2c' },
  xunlei: { label: '迅雷', color: '#6a5bff' },
  tianyi: { label: '天翼', color: '#d63384' },
  other: { label: '其他', color: '#94a3b8' },
};

export function cloudLabel(cloudType: string): string {
  return (CLOUD_META[cloudType] || CLOUD_META.other).label;
}

export function cloudColor(cloudType: string): string {
  return (CLOUD_META[cloudType] || CLOUD_META.other).color;
}

export function validityLabel(validity: string): string {
  if (validity === 'valid') return '有效';
  if (validity === 'invalid') return '失效';
  return '检测中';
}

export function validityCls(validity: string): string {
  return 'status-badge--' + (validity === 'valid' ? 'valid' : validity === 'invalid' ? 'invalid' : 'unknown');
}

/** 豆瓣封面走后端图片代理（防防盗链） */
export function imgProxy(url?: string): string {
  if (!url) return '';
  return '/api/img-proxy?url=' + encodeURIComponent(url);
}

/** 相对时间显示 */
export function timeAgo(iso?: string | null): string {
  if (!iso) return '-';
  const t = new Date(iso.includes('T') ? iso : iso.replace(' ', 'T') + 'Z').getTime();
  if (!t || isNaN(t)) return iso;
  const diff = Date.now() - t;
  if (diff < 0) return '刚刚';
  const min = Math.floor(diff / 60000);
  if (min < 1) return '刚刚';
  if (min < 60) return min + ' 分钟前';
  const hour = Math.floor(min / 60);
  if (hour < 24) return hour + ' 小时前';
  const day = Math.floor(hour / 24);
  if (day < 30) return day + ' 天前';
  return new Date(t).toISOString().slice(0, 10);
}

/** 搜索条目（页面内部模型：Resource + 报失效标记） */
export interface SearchItemView {
  id?: number;
  title: string;
  url: string;
  cloud_type: string;
  passcode?: string;
  note?: string;
  tags?: string[];
  source_id: string;
  validity: Validity;
  reported?: boolean;
}
