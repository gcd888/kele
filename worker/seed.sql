-- ========================================
-- 搜索源种子数据（幂等：按 name INSERT OR IGNORE）
-- 应用：npx wrangler d1 execute kele-db --local --file=seed.sql
-- ========================================

-- L2 定向爬虫（默认启用）
INSERT OR IGNORE INTO api_configs (name, url, method, request_type, headers, body_template, result_paths, field_map, source_type, timeout_ms, status, priority) VALUES
  ('盘小子', 'https://pan.xiaozi.cc/resource?q={kw}&page={page}', 'GET', 'xiaozi', '{}', '', '[]', '{}', 'html', 15000, 1, 90),
  ('追剧吧', 'https://www.zhuiju.us/s/{kw}.html', 'GET', 'zhuiju', '{}', '', '[]', '{}', 'html', 15000, 1, 80),
  -- 欧哥站：MacCMS 网盘站两跳爬虫（搜索列表→详情页 data-clipboard-text 直链），备份域名 woog.nxog.fun / woog.430520.xyz
  ('欧哥站', 'https://woog.nxog.eu.org', 'GET', 'woog', '{}', '', '[]', '{}', 'html', 20000, 1, 75);

-- L1 内置解析器示例：eeeob searchApi2 纯文本契约 name+token（默认停用）
INSERT OR IGNORE INTO api_configs (name, url, method, request_type, headers, body_template, result_paths, field_map, source_type, timeout_ms, status, priority) VALUES
  (
    'eeeob-search',
    'http://z.eeeob.com/v/api/search',
    'POST',
    'searchApi2',
    '{"Content-Type":"application/x-www-form-urlencoded"}',
    'name={kw}&token=i69',
    '[]',
    '{}',
    'api', 8000, 0, 60
  );
