/**
 * 暗/亮主题：localStorage 记忆，默认跟随系统；MP 端暂不生效（后续阶段适配）
 */
const THEME_KEY = 'kele_theme';

export type ThemeMode = 'auto' | 'light' | 'dark';

export function getThemeMode(): ThemeMode {
  try {
    const v = localStorage.getItem(THEME_KEY);
    if (v === 'dark' || v === 'light') return v;
  } catch {
    /* ignore */
  }
  return 'auto';
}

export function isDark(): boolean {
  // #ifdef H5
  return document.documentElement.classList.contains('dark');
  // #endif
  // #ifndef H5
  return false;
  // #endif
}

export function applyTheme(): void {
  // #ifdef H5
  const mode = getThemeMode();
  const prefersDark =
    typeof window.matchMedia === 'function' && window.matchMedia('(prefers-color-scheme: dark)').matches;
  const dark = mode === 'dark' || (mode === 'auto' && prefersDark);
  document.documentElement.classList.toggle('dark', dark);
  // #endif
}

export function setThemeMode(mode: ThemeMode): void {
  try {
    localStorage.setItem(THEME_KEY, mode);
  } catch {
    /* ignore */
  }
  applyTheme();
}

export function toggleTheme(): void {
  setThemeMode(isDark() ? 'light' : 'dark');
}
