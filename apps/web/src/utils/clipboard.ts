/**
 * 剪贴板工具：H5 用 navigator.clipboard，回退 execCommand；小程序用 uni.setClipboardData
 */

// #ifdef H5
export async function copyText(text: string): Promise<boolean> {
  if (!text) return false;
  try {
    if (navigator.clipboard && window.isSecureContext) {
      await navigator.clipboard.writeText(text);
      return true;
    }
  } catch {
    /* 回退 execCommand */
  }
  try {
    const ta = document.createElement('textarea');
    ta.value = text;
    ta.style.position = 'fixed';
    ta.style.left = '-9999px';
    ta.style.opacity = '0';
    document.body.appendChild(ta);
    ta.focus();
    ta.select();
    const ok = document.execCommand('copy');
    document.body.removeChild(ta);
    return ok;
  } catch {
    return false;
  }
}
// #endif

// #ifdef MP-WEIXIN
export function copyText(text: string): Promise<boolean> {
  return new Promise((resolve) => {
    if (!text) {
      resolve(false);
      return;
    }
    uni.setClipboardData({
      data: text,
      success: () => resolve(true),
      fail: () => resolve(false),
    });
  });
}
// #endif
