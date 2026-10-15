# FongMi TV / 影视仓 / TVBox 接口配置指南

> 整理自 FongMi 官方文档（https://fongmi.github.io/TV/）config + spider 两章，结合本项目 `src/ysc/diy/` 实践。
> 用途：DIY 自己的接口配置与爬虫源时的速查手册。

## 1. 配置体系三层结构

```
Depot（仓库清单，如 kelediy.json）
  └─ urls[]: 登记多条线路，App 登记后自动载入第一项
       └─ VodConfig（单条线路，如 hongguo.json）
            ├─ spider: 全局 JAR
            ├─ sites[]: 点播站点（核心）
            ├─ parses[]: 解析规则
            ├─ lives[]: 直播源
            └─ doh/proxy/rules/headers/hosts/ads: 网络控制
```

**Depot 格式**（本项目 kelediy.json 即此格式）：

```json
{
  "urls": [
    { "name": "线路名", "url": "./vod.json" }
  ]
}
```

**路径规则**：主配置中 `./`、`../` 以该配置文件位置展开；外部数组文件与直播列表内的路径**不会**再次展开，必须用完整 URL。

## 2. VodConfig 顶层 18 字段

| 字段 | 类型 | 用途 |
|------|------|------|
| urls | Depot[] | 仓库清单（出现即视为仓库模式，载入第一项） |
| msg | string | 存在时停止加载并显示错误 |
| spider | string | 全局 Spider JAR 路径（Site 未指定 jar 时使用） |
| wallpaper / logo / notice | string | 壁纸 / Logo / 启动公告 |
| **sites** | Site[] | **点播站点清单（必需）** |
| parses | Parse[] | URL 二次解析规则 |
| lives | Live[] | 内嵌直播配置 |
| doh / proxy / rules / headers / hosts / ads | array | 支持「对象数组」或「外部 JSON 文件位置」混用 |
| flags | string[] | 全局播放平台旗标 |
| danmaku | string | 弹幕搜索 API，支持 `{name}` `{episode}` |
| assrt | string | 字幕搜索服务 |

## 3. Site 站点四类型（最核心）

| type | 含义 | api 写法 |
|------|------|----------|
| 0 | XML HTTP | 采集站 XML 端点 |
| 1 | JSON HTTP | 采集站 JSON 端点 |
| **3** | **Spider 爬虫** | Java: `csp_类名`；JS: `./demo.js`；PY: `./demo.py` |
| 4 | 扩展 HTTP JSON | 筛选以 Base64 ext 传参 |

**type 3 关键**：api 指向运行时。JS 源 = QuickJS 引擎文件（如 `./drpy_libs/drpy2.min.js`）+ `ext` 指向源逻辑文件（如 `./drpy_js/xxx.js`）。JAR 类默认放 `com.github.catvod.spider.Xxx` 并继承抽象 `Spider`。

常用 Site 字段：`searchable/quickSearch/filterable`（搜索与筛选开关）、`jar`（覆盖全局 JAR）、`playUrl`（type 0/1 解析前缀，支持 `json:` 与 `parse:`）、`header`（HTTP 站点请求头；**不会**自动套到 Spider 自己发的请求）、`style`（卡片样式 rect/oval/list + ratio）、`categories`（分类白名单排序）。

## 4. Spider 方法生命周期（type 3）

| 方法（Java/PY） | QuickJS | 调用时机 | 回传 |
|---|---|---|---|
| init | init(ext) | 实例创建 | 无 |
| homeContent | home(filter) | 进首页 | `class` + `filters` |
| **homeVideoContent** | homeVod | 首页分类完成后 | 首页**推荐卡片** `list` |
| categoryContent | category(tid,pg,filter,extend) | 分类/换页/筛选 | `list` + `pagecount` |
| detailContent | detail(ids) | 点卡片 | `list[0]` 完整信息+播放分组 |
| searchContent | search(wd) | 搜索 | `list`（可翻页） |
| playerContent | play(flag,id,vipFlags) | 选集 | **`url`** + parse/header 等 |
| proxy | localProxy | 本地代理收到请求 | 数组/HTTP 响应 |
| liveContent | live | 直播配置 | TXT/M3U/JSON 原文 |

> QuickJS（drpy2）源**实现 `homeVod` 才有首页推荐**；只实现 `home` 的源，首页推荐区为空，内容要点进源图标看分类。

### Result 关键字段（22 个）

- 探索类：`class`（分类）、`filters`（**第一层键必须等于分类 type_id**）、`list`、`pagecount`
- 播放类：`url`（核心，支持数组多画质：`["主画质","url1","低画质","url2"]`）、`parse`（0/1）、`jx`（1 强制进解析）、`header`、`format`（MIME）、`subs`、`danmaku`、`drm`、`playUrl`（`json:` 端点 / `parse:` 具名解析器）、`position`（毫秒起播）

### Vod 卡片字段

`vod_id`（回传 detail 的唯一值）/ `vod_name` / `vod_pic` / `vod_remarks`（角标）/ `vod_play_from` / `vod_play_url` / `vod_tag`（folder=文件夹）

### 播放分组字符串（$ / # / $$$）

```
vod_play_from: "主线路$$$备用线路"
vod_play_url:  "第01集$ep1#第02集$ep2$$$第01集$bk1"
```
`$` 右侧即 `playerContent(flag, id)` 的 `id`。**id 可存任意串**（如 `hongguo-cenc://vid/xxx`），由 proxy 解密还原真实流。

## 5. Proxy 本地代理（流媒体解密的钥匙）

`playerContent` 可返回**假 URL**（自定义协议），App 播放时请求壳内本地代理 → 路由到源实现的 `proxy`/`localProxy` 方法 → 解密后流式回吐。

- QuickJS/Python 回传数组：`[状态码, Content-Type, 内容, 标头(选), 1=Base64(选)]`
- Java：第三格必须是 `InputStream`；JAR 无 siteKey 时走 `Proxy.proxy(Map)` 静态入口
- 请求带 `siteKey` 时路由到对应 Spider

> 红果鉴解密 CENC、alist 直链中转等场景全部依赖此机制。**纯 JS 源不实现 proxy 就无法处理加密流**。

## 6. 直播配置

`lives[]` 20 字段；列表三种格式：JSON（Group 数组）/ M3U / TXT（`分组,#genre#` + `频道,url$线路名#备用url`）。TXT/M3U 支持设定行：`ua= parse= click= header= format= origin= referer= forceKey=`。追看/时移用 `catchup`（`source` 模板含 `${(b)yyyyMMddHHmmss}`/`${(e)...}` 时间 token）。

## 7. 本项目 diy 目录案例

```
src/ysc/diy/
├── kelediy.json            # Depot：影视仓填这个地址
├── hongguo/
│   ├── hongguo.json        # VodConfig：spider=pg.jar + sites=[红果drpy源]
│   ├── jar/pg.jar          # drpy2 QuickJS 运行时（hipy-server 生态 jar）
│   ├── drpy_libs/drpy2.min.js  # 引擎（ext 里的源 js 由它加载执行）
│   └── drpy_js/🤡红果短剧.js   # 源逻辑（混淆）
```

上线流程：文件推到 GitHub 仓库 → Pages 生效 → 影视仓填 `https://user.github.io/repo/src/ysc/diy/kelediy.json`。

## 8. DIY 自己接口的完整步骤

1. **选源类型**：目标站有 JSON API → type 1；需要自定义逻辑/签名/解密 → type 3
2. **选运行时**：纯 HTTP 抓取 → QuickJS（drpy2）最轻；需要 AES/本地代理 → 同样可用 drpy2 的 `req()`/`crypto` + `localProxy`；重度性能 → Java JAR
3. **实现五方法**：home（分类）→ category（列表）→ detail（详情+播放分组）→ play（播放地址）→ search（搜索）；首页推荐加 homeVod
4. **组装 VodConfig**：spider 指向 jar，sites 引用源 js，写 ext 传参
5. **本地验证**：影视仓「配置地址」填局域网 `http://PC_IP:PORT/path/vod.json`（python -m http.server）
6. **发布**：推 GitHub Pages / Gitee Pages，远端地址填入 kelediy.json

## 9. App 功能概览（features 章）

App 本身不内置任何内容源，全部内容来自 VodConfig/LiveConfig。双设备形态：电视版（遥控器）+ 手机版（触控），支持直向/横向/大屏。

| 能力 | 说明 | 与配置的关联 |
|------|------|------|
| 浏览与搜索 | 分类、条件筛选、**跨站点并行搜索**、快速搜索、换页 | Site.searchable/quickSearch、homeContent.filters |
| 播放控制 | 硬解/软解切换、倍速、画面比例、画中画、背景音频、**片头片尾跳过** | Result.position（毫秒起播点） |
| 字幕与弹幕 | SRT/SSA/ASS 外挂字幕、系统字幕样式、播放时间轴同步弹幕、**局域网即时推送字幕弹幕** | Result.subs/danmaku、danmaku API |
| 直播体验 | M3U/TXT/JSON/EPG、分组选台、收藏、备用线路、XMLTV、追看时移 | LiveConfig 全套 |
| 个人记录 | 观看记录（记住上次位置）、收藏、无痕模式 | — |
| 跨屏投放 | 手机 DLNA 投放；电视端可作 Renderer 接收 | — |
| Android Auto | 车机浏览记录/直播分组，播放/暂停/上下集/停止 | — |
| **远程控制** | **局域网 HTTP 服务**：推送播放网址、字幕、弹幕，遥控播放，设备间同步观看记录与收藏 | 见第 10 节 |
| 网络工具箱 | DoH、Proxy、Hosts 覆盖、WebView 抓取规则 | VodConfig 的 doh/proxy/hosts/rules |

## 10. 本地 API（App 内置 HTTP 端点）

App 内运行两类本地 HTTP 服务，配置与爬虫可直接引用：

### 10.1 本地代理端点（Spider 数据面）

- `playerContent` 返回假 URL（自定义协议）→ App 拦截 → 命中站点本地代理 → 调用该源的 `proxy`/`localProxy` 方法回吐数据（第 5 节机制）
- 请求带 `siteKey` 参数路由到对应 Spider；JAR 模式无 siteKey 时找 `com.github.catvod.spider.Proxy.proxy(Map)` 静态入口
- 直播特殊播放核心走 `/tvbus` 本机端点：`Live.core.auth` 取到非空内容时，App 改用本地 `/tvbus` 返回该内容（配合 `so` 原生库、`pkg`+`sign` 运行期 Hook）

### 10.2 Node.js 源的 HTTP 爬虫契约

Node bundle 启动后，App 读取 `/config` 响应的 `video`（或 `data.video`）把 `video.sites` 映射为 `node:` 站点路由；每个站点路由后接：

```
/init  /home  /category  /detail  /search  /play
```

即 QuickJS 五方法的 HTTP 版；Node Proxy 直接转接 HTTP 响应。**注意**：Node 源必须 `index.js.md5` 入口，不能只把普通配置的 api 改成 `node:` 前缀。

### 10.3 局域网远程控制（features 章）

电视/手机端开启远程控制后，同网段设备可通过 HTTP：

- 推送播放网址（远端立刻播放）
- 推送字幕与弹幕（第 9 节「即时注入」）
- 遥控播放（播放/暂停/上集/下集等）
- 设备间同步观看记录与收藏

官方文档未列具体端点路径与端口，DIY 时以 App「远程控制」页展示的地址为准；推送字幕/弹幕与播放的返回格式遵循 Result 中 subs/danmaku 字段结构。

> DIY 关联：批量推流测试（向电视端推送 m3u8 验证播放兼容性）、多设备接力看剧都基于此服务。

## 附：常见坑

- ext 是对象/数组时会先序列化为字符串传给 init
- `Result.header` 整份为空才回退 Site.header，不逐键合并
- `pagecount` 0/未填 = 未知页数，仍可继续翻页
- `parse=0` 不保证不解析：`jx=1` 或 flags 比对仍会触发
- 直播 `boot`/`pass`/`keep` 可能被 App 内已保存设置覆盖
- Node.js 源不是改 api 前缀就能用，必须 `index.js.md5` 入口 + bundle 独立契约
