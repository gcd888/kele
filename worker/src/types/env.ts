/**
 * Worker 环境绑定类型
 */
export interface Env {
  DB: D1Database;
  ASSETS: Fetcher;

  // 敏感变量（wrangler secret）
  JWT_SECRET: string;
  ADMIN_PASSWORD: string;

  // 配置变量（wrangler.toml [vars]）
  CORS_ALLOWED_ORIGINS: string;
  RATE_LIMIT_PER_MINUTE: string;
}
