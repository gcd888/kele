-- ========================================
-- kele v2 初始 Schema（D1/SQLite）
-- 裁剪：users/vip/favorites/ads 全链路不建表
-- ========================================

-- 资源缓存表
CREATE TABLE IF NOT EXISTS resources (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  title TEXT NOT NULL,
  url TEXT NOT NULL UNIQUE,
  cloud_type TEXT NOT NULL,
  is_valid INTEGER NOT NULL DEFAULT 2,               -- 0=无效 1=有效 2=待检测
  source TEXT NOT NULL DEFAULT '',
  keyword TEXT NOT NULL DEFAULT '',
  is_preheated INTEGER NOT NULL DEFAULT 0,           -- 0=用户搜索 1=Cron 2=管理员
  description TEXT DEFAULT '',
  cover TEXT DEFAULT '',
  heat INTEGER DEFAULT 0,
  created_at TEXT NOT NULL DEFAULT (DATETIME('now')),
  updated_at TEXT NOT NULL DEFAULT (DATETIME('now')),
  expire_at TEXT DEFAULT NULL
);

-- 资源标签表
CREATE TABLE IF NOT EXISTS resource_tags (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  resource_id INTEGER NOT NULL REFERENCES resources(id),
  tag TEXT NOT NULL,
  UNIQUE(resource_id, tag)
);

-- 源配置表（L0 声明式扩展列 + 熔断字段）
CREATE TABLE IF NOT EXISTS api_configs (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name TEXT NOT NULL UNIQUE,
  url TEXT NOT NULL,                                  -- 含 {kw}/{page} 占位
  method TEXT NOT NULL DEFAULT 'GET',
  request_type TEXT NOT NULL DEFAULT 'declarative',   -- L1/L2 解析器标识；declarative=L0
  headers TEXT DEFAULT '{}',
  body_template TEXT DEFAULT '',
  result_paths TEXT DEFAULT '[]',                     -- L0: JSON 数组，如 ["data.merged_by_type.quark"]
  field_map TEXT DEFAULT '{}',                        -- L0: JSON，如 {"title":"name","url":"url","cloud_type":"'quark'"}
  source_type TEXT NOT NULL DEFAULT 'api',            -- api|html
  timeout_ms INTEGER NOT NULL DEFAULT 3000,
  status INTEGER NOT NULL DEFAULT 1,                  -- 手动启停
  enabled INTEGER NOT NULL DEFAULT 1,                 -- 熔断自动启停
  priority INTEGER NOT NULL DEFAULT 0,
  fail_count INTEGER NOT NULL DEFAULT 0,
  disabled_until TEXT DEFAULT NULL,
  last_ok_at TEXT DEFAULT NULL,
  last_latency_ms INTEGER DEFAULT NULL,
  created_at TEXT NOT NULL DEFAULT (DATETIME('now'))
);

-- 网盘类型表
CREATE TABLE IF NOT EXISTS cloud_types (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name TEXT NOT NULL,
  cloud_type TEXT NOT NULL,
  url_pattern TEXT NOT NULL,
  sort_order INTEGER NOT NULL DEFAULT 0,
  status INTEGER NOT NULL DEFAULT 1,
  UNIQUE(cloud_type, url_pattern)
);

-- 公告表
CREATE TABLE IF NOT EXISTS notices (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  content TEXT NOT NULL,
  status INTEGER NOT NULL DEFAULT 1,
  created_at TEXT NOT NULL DEFAULT (DATETIME('now')),
  updated_at TEXT NOT NULL DEFAULT (DATETIME('now'))
);

-- 影视站导航表
CREATE TABLE IF NOT EXISTS online_tv (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  name TEXT NOT NULL,
  url TEXT NOT NULL,
  img TEXT DEFAULT '',
  description TEXT DEFAULT '',
  status INTEGER NOT NULL DEFAULT 1,
  sort INTEGER NOT NULL DEFAULT 0
);

-- 豆瓣榜单表
CREATE TABLE IF NOT EXISTS douban_items (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  douban_id TEXT NOT NULL,
  title TEXT NOT NULL,
  media_type TEXT NOT NULL,                            -- tv|movie|variety
  category TEXT NOT NULL,
  rating_value REAL DEFAULT 0,
  rating_count INTEGER DEFAULT 0,
  year TEXT DEFAULT '',
  area TEXT DEFAULT '',
  genres TEXT DEFAULT '',
  cover_url TEXT DEFAULT '',
  url TEXT DEFAULT '',
  card_subtitle TEXT DEFAULT '',
  raw_json TEXT DEFAULT '',
  created_at TEXT NOT NULL DEFAULT (DATETIME('now')),
  updated_at TEXT NOT NULL DEFAULT (DATETIME('now')),
  UNIQUE(douban_id, media_type, category)
);

-- 热搜关键词表
CREATE TABLE IF NOT EXISTS hot_keywords (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  keyword TEXT NOT NULL UNIQUE,
  search_count INTEGER NOT NULL DEFAULT 0,
  period TEXT NOT NULL DEFAULT 'daily',
  updated_at TEXT NOT NULL DEFAULT (DATETIME('now'))
);

-- 搜索日志表
CREATE TABLE IF NOT EXISTS search_logs (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  keyword TEXT NOT NULL,
  ip_hash TEXT DEFAULT '',
  has_result INTEGER NOT NULL DEFAULT 0,
  result_count INTEGER DEFAULT 0,
  took_ms INTEGER DEFAULT 0,
  created_at TEXT NOT NULL DEFAULT (DATETIME('now'))
);

-- 报失效计数表
CREATE TABLE IF NOT EXISTS resource_reports (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  resource_id INTEGER NOT NULL REFERENCES resources(id),
  day TEXT NOT NULL,
  count INTEGER NOT NULL DEFAULT 0,
  UNIQUE(resource_id, day)
);

-- ========================================
-- 索引
-- ========================================
CREATE INDEX IF NOT EXISTS idx_resources_keyword ON resources(keyword);
CREATE INDEX IF NOT EXISTS idx_resources_cloud_type ON resources(cloud_type);
CREATE INDEX IF NOT EXISTS idx_resources_is_valid ON resources(is_valid);
CREATE INDEX IF NOT EXISTS idx_resources_expire_at ON resources(expire_at);
CREATE INDEX IF NOT EXISTS idx_resources_created_at ON resources(created_at);
CREATE INDEX IF NOT EXISTS idx_api_configs_status ON api_configs(status, enabled);
CREATE INDEX IF NOT EXISTS idx_search_logs_created_at ON search_logs(created_at);
CREATE INDEX IF NOT EXISTS idx_douban_items_media_type ON douban_items(media_type);
CREATE INDEX IF NOT EXISTS idx_hot_keywords_period ON hot_keywords(period);

-- ========================================
-- 种子数据：网盘类型
-- ========================================
INSERT OR IGNORE INTO cloud_types (name, cloud_type, url_pattern, sort_order, status) VALUES
  ('夸克网盘', 'quark', 'pan.quark.cn', 1, 1),
  ('百度网盘', 'baidu', 'pan.baidu.com', 2, 1),
  ('阿里云盘', 'aliyun', 'aliyundrive.com', 3, 1),
  ('阿里云盘', 'aliyun', 'alipan.com', 4, 1),
  ('UC网盘', 'uc', 'drive.uc.cn', 5, 1),
  ('迅雷云盘', 'xunlei', 'pan.xunlei.com', 6, 1),
  ('天翼云盘', 'tianyi', 'cloud.189.cn', 7, 1);

-- 种子数据：默认公告
INSERT OR IGNORE INTO notices (id, content, status) VALUES
  (1, '本站仅提供网盘资源索引与链接检测服务，所有内容来自第三方公开渠道，与本站无关。', 1);
