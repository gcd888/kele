-- ========================================
-- 搜索源种子数据（幂等：按 name INSERT OR IGNORE）
-- 应用：npx wrangler d1 execute kele-db --local --file=seed.sql
-- ========================================

-- L2 定向爬虫（默认启用）
INSERT OR IGNORE INTO api_configs (name, url, method, request_type, headers, body_template, result_paths, field_map, source_type, timeout_ms, status, priority) VALUES
  ('盘小子', 'https://pan.xiaozi.cc/resource?q={kw}&page={page}', 'GET', 'xiaozi', '{}', '', '[]', '{}', 'html', 15000, 1, 90),
  ('追剧吧', 'https://www.zhuiju.us/s/{kw}.html', 'GET', 'zhuiju', '{}', '', '[]', '{}', 'html', 15000, 1, 80),
  -- 欧哥站：MacCMS 网盘站两跳爬虫（搜索列表→详情页 data-clipboard-text 直链），备份域名 woog.nxog.fun / woog.430520.xyz
  ('欧哥站', 'https://woog.nxog.eu.org', 'GET', 'woog', '{}', '', '[]', '{}', 'html', 20000, 1, 75),
  -- 小悠家：WordPress 网盘站两跳爬虫（入口 souyixia.q-23.cn 转发到 kkv.q-23.cn/?s={kw}；详情页 a[href] 提链；站点约 3 分钟限流，源内已实现冷却）
  ('小悠家', 'http://kkv.q-23.cn', 'GET', 'kkv', '{}', '', '[]', '{}', 'html', 20000, 1, 70);

-- L1 内置解析器：ssr021（duoduopuzi 体系，x-api-key 动态注入，已实测 200）
INSERT OR IGNORE INTO api_configs (name, url, method, request_type, headers, body_template, result_paths, field_map, source_type, timeout_ms, status, priority) VALUES
  ('ssr021站内', 'http://ssr021.cn/mv/api/movies/search?name={kw}&page={page}&pageSize=10', 'GET', 'searchApi3', '{}', '', '[]', '{}', 'api', 8000, 1, 65),
  ('ssr021爬虫', 'http://ssr021.cn/mv/api/crawler/search?name={kw}', 'GET', 'searchApi4', '{}', '', '[]', '{}', 'api', 15000, 1, 62);

-- L1 内置解析器示例：eeeob searchApi2 纯文本契约 name+token（上游已死，默认停用）
INSERT OR IGNORE INTO api_configs (name, url, method, request_type, headers, body_template, result_paths, field_map, source_type, timeout_ms, status, priority, enabled) VALUES
  (
    'eeeob-search',
    'http://z.eeeob.com/v/api/search',
    'POST',
    'searchApi2',
    '{"Content-Type":"application/x-www-form-urlencoded"}',
    'name={kw}&token=i69',
    '[]',
    '{}',
    'api', 8000, 0, 60, 0
  );
