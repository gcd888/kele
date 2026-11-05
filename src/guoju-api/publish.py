# -*- coding: utf-8 -*-
"""
publish.py — 果果接口包发布：pack.py 打包 → Cloudflare R2 固定路径上传（覆盖式替换）

核心思路：固定 key（默认 guoju/guoguo.zip）永不变化，每次发布覆盖同一对象，
App 端配置一次下载链接即可，资源路径不再随时间戳变化。
上传带 Cache-Control: no-cache，保证自定义域不返回旧缓存内容。

认证：Cloudflare API Token（Bearer）——R2 对象 REST API 直传，无需 S3 凭证对。
  Token 需权限：Account / R2 Edit（对象读写）；绑过自定义域后公开下载不走 token。

配置（优先级：环境变量 > 同目录 r2.env 文件，r2.env 含凭证勿提交 git）：
  R2_ACCOUNT_ID   账户 ID
  R2_API_TOKEN    Cloudflare API Token（cfut_ 开头）
  R2_BUCKET       桶名
  R2_PUBLIC_BASE  公开基址（桶绑定的自定义域，如 https://gcd888.cc.cd）

用法（在本目录执行）：
  python publish.py                # 打包(pack.py) + 上传固定 key（覆盖）
  python publish.py --no-pack      # 不重新打包，上传目录内最新 guoguo<时间戳>.zip
  python publish.py --archive      # 额外上传时间戳归档副本（key 前缀 guoju/archive/）
  python publish.py --check        # 校验配置/桶/域/固定 key 连通性，不打包
  python publish.py --key a/b.zip  # 自定义固定 key（默认 guoju/guoguo.zip）

依赖：无（纯标准库）。
"""

import argparse
import hashlib
import json
import os
import subprocess
import sys
import time
import urllib.request

_SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
DEFAULT_KEY = "guoju/guoguo.zip"
ARCHIVE_PREFIX = "guoju/archive/"
API_BASE = "https://api.cloudflare.com/client/v4/accounts/%s"
ENV_FILE = os.path.join(_SCRIPT_DIR, "r2.env")
ENV_KEYS = ["R2_ACCOUNT_ID", "R2_API_TOKEN", "R2_BUCKET", "R2_PUBLIC_BASE"]


def fail(msg):
    print("[错误] %s" % msg)
    sys.exit(1)


def load_config():
    """环境变量优先，其次 r2.env（KEY=VALUE，# 注释）。"""
    cfg = {}
    if os.path.isfile(ENV_FILE):
        with open(ENV_FILE, "r", encoding="utf-8-sig") as f:
            for line in f:
                line = line.strip()
                if not line or line.startswith("#") or "=" not in line:
                    continue
                k, v = line.split("=", 1)
                cfg[k.strip()] = v.strip().strip('"').strip("'")
    for k in ENV_KEYS:
        if os.environ.get(k):
            cfg[k] = os.environ[k].strip()
    return cfg


def api(cfg, method, path, body=None, headers=None, timeout=600):
    """调 Cloudflare REST API，返回 (ok, result_or_errors, raw)。"""
    url = API_BASE % cfg["R2_ACCOUNT_ID"] + path
    data = body if isinstance(body, (bytes, bytearray)) else (
        json.dumps(body).encode() if body is not None else None)
    h = {"Authorization": "Bearer %s" % cfg["R2_API_TOKEN"]}
    if body is not None and not isinstance(body, (bytes, bytearray)):
        h["Content-Type"] = "application/json"
    if headers:
        h.update(headers)
    req = urllib.request.Request(url, data=data, method=method, headers=h)
    try:
        resp = urllib.request.urlopen(req, timeout=timeout)
        raw = resp.read()
    except urllib.error.HTTPError as e:
        raw = e.read()
    try:
        d = json.loads(raw.decode("utf-8", "replace"))
    except Exception:
        return False, raw[:300], raw
    return bool(d.get("success")), d.get("result") if d.get("success") else d.get("errors"), raw


def find_latest_zip():
    """目录内最新的 guoguo<时间戳>.zip（排除无时间戳的 guoguo.zip）。"""
    cands = []
    for name in os.listdir(_SCRIPT_DIR):
        if name.startswith("guoguo") and name.endswith(".zip") and len(name) > len("guoguo.zip"):
            if name[6:-4].isdigit():
                cands.append((os.path.getmtime(os.path.join(_SCRIPT_DIR, name)), name))
    if not cands:
        fail("目录内没有 guoguo<时间戳>.zip，先去掉 --no-pack 或手动执行 pack.py")
    return os.path.join(_SCRIPT_DIR, max(cands)[1])


def run_pack():
    print("[1/3] pack.py 打包 ...")
    r = subprocess.run([sys.executable, os.path.join(_SCRIPT_DIR, "pack.py")],
                       cwd=_SCRIPT_DIR, capture_output=True, text=True, encoding="utf-8", errors="replace")
    out = (r.stdout or "") + (r.stderr or "")
    print("\n".join(l for l in out.splitlines() if l.strip()))
    if r.returncode != 0:
        fail("pack.py 失败（exit %d）" % r.returncode)
    return find_latest_zip()


def md5_of(path):
    h = hashlib.md5()
    with open(path, "rb") as f:
        for chunk in iter(lambda: f.read(1 << 20), b""):
            h.update(chunk)
    return h.hexdigest()


def upload(cfg, path, key):
    local_md5 = md5_of(path)
    size = os.path.getsize(path)
    ok, result, _ = api(cfg, "PUT", "/r2/buckets/%s/objects/%s" % (cfg["R2_BUCKET"], key),
                        body=open(path, "rb").read(),
                        headers={"Content-Type": "application/zip", "Cache-Control": "no-cache, max-age=0"})
    if not ok:
        fail("上传失败：%s" % result)
    etag = (result or {}).get("etag", "").lower()
    print("  PUT %s (%.1fMB) ETag%s匹配" % (key, size / 1048576.0, "" if etag == local_md5 else "不"))
    if etag != local_md5:
        fail("ETag 校验失败：local=%s remote=%s" % (local_md5, etag))


def public_url(cfg, key):
    base = (cfg.get("R2_PUBLIC_BASE") or "").rstrip("/")
    return "%s/%s" % (base, key) if base else None


def main():
    ap = argparse.ArgumentParser(description="果果接口包 → Cloudflare R2 固定路径发布")
    ap.add_argument("--no-pack", action="store_true", help="不重新打包，用目录内最新 zip")
    ap.add_argument("--archive", action="store_true", help="额外上传时间戳归档副本")
    ap.add_argument("--key", default=DEFAULT_KEY, help="固定 key（默认 %s）" % DEFAULT_KEY)
    ap.add_argument("--check", action="store_true", help="仅校验配置与连通性")
    args = ap.parse_args()

    cfg = load_config()
    if not all([cfg.get("R2_ACCOUNT_ID"), cfg.get("R2_API_TOKEN"), cfg.get("R2_BUCKET")]):
        fail("配置不完整：R2_ACCOUNT_ID / R2_API_TOKEN / R2_BUCKET（环境变量或同目录 r2.env）")
    print("[配置] 桶=%s 账户=%s*** 公开基址=%s" % (
        cfg["R2_BUCKET"], (cfg["R2_ACCOUNT_ID"] or "")[:6], cfg.get("R2_PUBLIC_BASE") or "(未配)"))

    if args.check:
        ok, result, _ = api(cfg, "GET", "/r2/buckets/%s" % cfg["R2_BUCKET"])
        print("  桶：%s" % ("可访问" if ok else "不可访问 %s" % result))
        ok2, result2, _ = api(cfg, "GET", "/r2/buckets/%s/domains/custom" % cfg["R2_BUCKET"])
        domains = (result2 or {}).get("domains") if ok2 else None
        print("  自定义域：%s" % (json.dumps(domains, ensure_ascii=False) if domains else "(未绑定或未生效)"))
        url = public_url(cfg, args.key)
        if url:
            try:
                req = urllib.request.Request(url, method="HEAD")
                resp = urllib.request.urlopen(req, timeout=20)
                print("  固定 key 公开访问：%s（%s，%.1fMB）" % (
                    resp.status, resp.headers.get("Content-Type"),
                    int(resp.headers.get("Content-Length") or 0) / 1048576.0))
            except Exception as e:
                print("  固定 key 公开访问暂不可达（域可能还在生效中）：%s" % e)
        else:
            print("  公开基址未配置")
        return

    zip_path = find_latest_zip() if args.no_pack else run_pack()
    print("[2/3] 上传 R2（bucket=%s）..." % cfg["R2_BUCKET"])
    ts = time.strftime("%Y%m%d%H%M%S", time.localtime(os.path.getmtime(zip_path)))
    upload(cfg, zip_path, args.key)
    if args.archive:
        upload(cfg, zip_path, "%sguoguo%s.zip" % (ARCHIVE_PREFIX, ts))

    print("[3/3] 完成")
    url = public_url(cfg, args.key)
    if url:
        print("  固定下载地址（App 推送此链接，永不变化）：%s" % url)
    else:
        print("  提示：r2.env 的 R2_PUBLIC_BASE 未配置")


if __name__ == "__main__":
    main()
