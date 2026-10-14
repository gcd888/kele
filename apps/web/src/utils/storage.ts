/**
 * 本地存储：搜索历史（最近 20 条）与收藏（Resource 对象数组，"我的"页后续接入）
 */
import type { Resource } from '../types';

const HISTORY_KEY = 'kele_search_history';
const FAVORITES_KEY = 'kele_favorites';
const HISTORY_LIMIT = 20;
const FAVORITES_LIMIT = 100;

// ===== 搜索历史 =====

export function getHistory(): string[] {
  try {
    const v = uni.getStorageSync(HISTORY_KEY);
    return Array.isArray(v) ? (v as string[]) : [];
  } catch {
    return [];
  }
}

export function addHistory(kw: string): void {
  const k = (kw || '').trim();
  if (!k) return;
  const list = getHistory().filter((i) => i !== k);
  list.unshift(k);
  try {
    uni.setStorageSync(HISTORY_KEY, list.slice(0, HISTORY_LIMIT));
  } catch {
    /* ignore */
  }
}

export function removeHistory(kw: string): void {
  const list = getHistory().filter((i) => i !== kw);
  try {
    uni.setStorageSync(HISTORY_KEY, list);
  } catch {
    /* ignore */
  }
}

export function clearHistory(): void {
  try {
    uni.removeStorageSync(HISTORY_KEY);
  } catch {
    /* ignore */
  }
}

// ===== 收藏 =====

export function getFavorites(): Resource[] {
  try {
    const v = uni.getStorageSync(FAVORITES_KEY);
    return Array.isArray(v) ? (v as Resource[]) : [];
  } catch {
    return [];
  }
}

export function isFavorite(url: string): boolean {
  return getFavorites().some((f) => f.url === url);
}

export function addFavorite(item: Resource): void {
  const list = getFavorites().filter((f) => f.url !== item.url);
  list.unshift({ ...item });
  try {
    uni.setStorageSync(FAVORITES_KEY, list.slice(0, FAVORITES_LIMIT));
  } catch {
    /* ignore */
  }
}

export function removeFavorite(url: string): void {
  const list = getFavorites().filter((f) => f.url !== url);
  try {
    uni.setStorageSync(FAVORITES_KEY, list);
  } catch {
    /* ignore */
  }
}
