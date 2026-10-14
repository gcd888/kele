# 管理后台重做 + 首页设置入口

## Context

用户需要在页面右上角加设置按钮跳转后台，并参考 demo/kelePro-master 重做管理后台。当前项目已有 admin 雏形（单页 4 Tab：概览/源管理/健康度/公告导航），但存在缺口：源「测试连通」前端已预留而后端未实现、概览统计单薄、无定时任务管理、无热门搜索词。用户已确认：四块后端功能全做 + UI 参考 kelePro 重做（用户管理/VIP/广告因无对应业务体系不做）。

## 现状关键事实

- 后端 [admin.ts](file:///e:/HelloWorld/project/kele/worker/src/routes/admin.ts)：sources CRUD+recover、notices、online-tv、GET /stats；`requireAdmin` JWT 中间件全覆盖
- 源调用链已具备可复用函数：`buildAdapterFor(config)`（sources/index.ts L72）、`fetchSourceWithTimeout(bundle, kw, page)`（L100，自带超时）
- `findHotKeywords(db, limit=20)` 已存在（db/search-logs.ts L33）
- 6 个定时任务（index.ts scheduled）：douban `0 0 * * *`、cleanup `0 3 * * *`、aggregate `0 5 * * *`、prefetch `30 0/12 * * *`、probe `15 * * * *`、validity-backfill `40 * * * *`
- 前端 admin 单页 [index.vue](file:///e:/HelloWorld/project/kele/apps/web/src/pages/admin/index.vue)（≥768px 桌面布局，样式用全局 CSS 变量）；主题 token 在 [theme.css](file:///e:/HelloWorld/project/kele/apps/web/src/styles/theme.css)
- 首页顶栏（index/index.vue L5-20）：左 brand，右 theme-btn（日间/夜间）

## 实现步骤

### 1. 后端：扩展 worker/src/routes/admin.ts（4 项）

**a. GET /stats 增强**：现有 resources+sources 统计基础上追加：
- 资源有效性分布：`GROUP BY is_valid` → valid/invalid/pending 计数
- 待校验分布：`SELECT cloud_type, COUNT(*) FROM resources WHERE is_valid=2 GROUP BY cloud_type`
- 今日搜索量：`search_logs WHERE created_at >= DATETIME('now','start of day')` 计数
- 热播条目数：`douban_items` 总数

**b. POST /sources/:id/test**：
- `findSourceById` → `buildAdapterFor` → `fetchSourceWithTimeout(bundle, kw)`，kw 取 body.kw || '庆余年'
- 返回 `{ ok, count, latencyMs, error?, sample: [前3条 title] }`
- 成功时顺带 `updateSource` 写 last_ok_at/last_latency_ms（与探测任务一致）

**c. 定时任务管理**（不建表，静态清单）：
- 模块级常量 `CRON_TASKS`：6 项 {key, name, description, cron}（prefetch 标注双表达式）
- `GET /cron-tasks` 返回清单
- `POST /cron-tasks/:key/run`：switch 白名单分发到 runDoubanCrawler/runCleanup/runAggregate/runPrefetch/runProbe/runValidityBackfill；慢任务（douban/prefetch/validity-backfill）用 `c.executionCtx.waitUntil()` 立即返回 `{started:true}`，快任务（cleanup/aggregate/probe）await 返回结果

**d. GET /hot-keywords?limit=20**：直接调 `findHotKeywords`

### 2. 前端：admin 单页壳 + 6 组件（apps/web/src/pages/admin/）

index.vue 重构为壳：顶栏（标题+退出）+ 6 Tab 条 + 面板懒加载（Tab 首次切入才请求）。面板拆到 `pages/admin/components/`：

| 组件 | 内容 |
|---|---|
| OverviewPanel.vue | 增强统计卡网格（资源总数/有效/失效/待校验/今日搜索/热播/源状态）+ 待校验分布横条 |
| SourcesPanel.vue | 迁移现有源表格与表单；行内加「测试」按钮，展示条数/延迟/错误三态 |
| HealthPanel.vue | 迁移现有健康度表格（恢复/单源测试改调真实接口） |
| NoticesPanel.vue | 迁移公告 + 影视站导航两节 |
| CronPanel.vue | 任务清单卡（名称/说明/cron/立即执行按钮，执行中 loading 态） |
| HotPanel.vue | 热门搜索词列表（词 + 次数） |

样式沿用 theme.css 变量与 .card/.btn/.table 体系，不引新依赖、不建新表。登录页 login.vue 不动。

### 3. 首页设置入口

- index/index.vue L16-19 theme-btn 旁加齿轮设置按钮（同 `.btn--sm` 风格），`uni.navigateTo('/pages/admin/login')`
- 小程序端：入口与跳转均可用（pages/admin 已注册，登录页非 tabBar），不包 #ifdef

### 4. 验证

1. 后端 curl 逐项验证（先 POST /api/auth/login 拿 token）：stats 增强、sources/:id/test（看 count/latency/error 三态）、cron-tasks 列表与手动触发（触发后重查 stats 核对数据变化）、hot-keywords
2. 前端 vite HMR：`http://[::1]:5173`（仅 IPv6），首页点设置 → 登录 → 6 Tab 逐个操作验证
3. wrangler dev（8787，--test-scheduled）与 vite dev 均在后台运行中，改动热重载即可测
