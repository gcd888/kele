-- 0003: 管理员账号体系 + 登录图形验证码（一次性消费）
-- 管理员不再使用 wrangler secret 明文密码比对，改为 D1 存储 PBKDF2 哈希
CREATE TABLE IF NOT EXISTS admin_users (
  id INTEGER PRIMARY KEY AUTOINCREMENT,
  username TEXT NOT NULL UNIQUE,
  password_hash TEXT NOT NULL, -- 格式 pbkdf2$iterations$salt_b64$hash_b64
  updated_at TEXT NOT NULL DEFAULT (DATETIME('now')),
  created_at TEXT NOT NULL DEFAULT (DATETIME('now'))
);

CREATE TABLE IF NOT EXISTS captchas (
  token TEXT PRIMARY KEY,      -- 32 字节随机 hex，一次性
  code TEXT NOT NULL,          -- 4 位图形验证码（不区分大小写比对）
  expires_at INTEGER NOT NULL  -- unix 秒，5 分钟有效
);

-- 初始管理员 gcd888（密码哈希见部署时生成，此处占位由 seed 脚本覆盖）
INSERT INTO admin_users (username, password_hash)
SELECT 'gcd888', 'pbkdf2$10000$bZQ+TYPHdPR1LZCEmeCXvA==$Oj2P4fiGf7rdfD/tMRd/kmBjqKYFOzz6acr58djOWT8='
WHERE NOT EXISTS (SELECT 1 FROM admin_users WHERE username = 'gcd888');
