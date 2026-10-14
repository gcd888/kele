/**
 * 清洗搜索关键词
 * - 长度限制 ≤50 字符
 * - 过滤危险特殊字符防 XSS
 * - 去除前后空格
 */
export function sanitizeKeyword(keyword: string): string | null {
  if (!keyword) return null;
  let cleaned = keyword.trim();
  if (cleaned.length > 50) cleaned = cleaned.slice(0, 50);
  cleaned = cleaned.replace(/[<>'"&|;\\`${}()]/g, '');
  if (!cleaned) return null;
  return cleaned;
}
