# 宝宝课堂 Spider 接入说明

> 逆向分析报告：`E:\HelloWorld\project\guoju\case\宝宝课堂\宝宝课堂逆向分析报告.md`（唯一事实源，本文件为接入执行摘要）

## 接入前提（阻塞项）

1. **加密标头协议未还原**：POST 接口要求加密标头（CryptoUtils + @Encrypt）。需用 Frida 16 spawn hook 补齐（脚本已就绪 `case/宝宝课堂/reverse_run2.py` + `hook_net.js`，模拟器 API 34 + root 环境）。
2. **登录态**：免登录 GET 接口已验证可用（带 `tenant-id: 1`）。扫码登录端点已确认（`member/auth/qrcode/create|status`）。

## 已确认可直调的接口（验证日期 2026-11-12）

```
Base: https://bbketang.com/app-api/
Header: tenant-id: 1
响应: {"code":0,"msg":"","data":...}
```

| 用途 | 端点 |
|---|---|
| 分类 | GET `player/video-category/page` |
| 列表 | GET `player/video-info/page` |
| 推荐 | GET `player/recommend-info/page` |
| 分集 | GET `player/video-diversity/get2` / `page` / `get-first2` |
| 播放 | GET `player/baidunetdisk/play-info` / `getValidAccessTokenV2` |

视频源为百度网盘（`d.pcs.baidu.com` 直链）。

## Spider 骨架约定

- 类名建议：`SpiderBaobaoketang`（注册前确认 kele 的 Spider 注册表 + proguard keep 规则）。
- **禁用 API 33+ 的 Java API 重载**（kele 硬规则：R8 --min-api 21，低版本电视 NoSuchMethodError）。
- 不把具体平台逻辑写进壳子；遵循 `CloudProvider` 边界约定（本项目 MEMORY.md）。
