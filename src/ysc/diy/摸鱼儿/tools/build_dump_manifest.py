# -*- coding: utf-8 -*-
"""
build_dump_manifest.py — 生成 FishDump 密文/ext 清单（配合壳内 FishDumpReceiver 动态 dump）

输入：
  readable_sources/com/github/catvod/spider/*.java   （v/w/u/t/s/c 调用点的 "N1." 密文）
  guoju-api/java/果果影视/果果影视.json              （fish-18 源的加密 ext）

输出：dump_manifest.json = {"ciphers": ["N1.xxx", ...], "exts": [...], "cipherSites": {cipher: [类:行]}}
去重后按出现序排列。
"""
import json
import os
import re

_TOOLS = os.path.dirname(os.path.abspath(__file__))
ROOT = os.path.normpath(os.path.join(_TOOLS, ".."))
SPIDER_DIR = os.path.join(ROOT, "readable_sources", "com", "github", "catvod", "spider")
CFG = r"E:\HelloWorld\project\kele\src\guoju-api\java\果果影视\果果影视.json"
OUT = os.path.join(_TOOLS, "..", "dump_manifest.json")

N1_RE = re.compile(r'"(N1\.[A-Za-z0-9+/=]{8,})"')

ciphers = []
sites = {}
for fn in sorted(os.listdir(SPIDER_DIR)):
    if not fn.endswith(".java"):
        continue
    cls = fn[:-5]
    src = open(os.path.join(SPIDER_DIR, fn), encoding="utf-8", errors="surrogatepass").read()
    for m in N1_RE.finditer(src):
        c = m.group(1)
        if c not in sites:
            sites[c] = []
            ciphers.append(c)
        sites[c].append(cls)

# ext：java 配置里 fish-18 源的加密 ext（内联串，排除文件路径/URL/普通文本）
cfg = json.load(open(CFG, encoding="utf-8-sig"))
exts = []
ext_sites = {}
for e in cfg.get("filmtvs", []):
    if not str(e.get("jar", "")).startswith("./lib/fish-18"):
        continue
    ext = e.get("ext")
    if isinstance(ext, str) and len(ext) >= 16 and not ext.startswith(("./", "http", "clan")):
        if ext not in ext_sites:
            ext_sites[ext] = []
            exts.append(ext)
        ext_sites[ext].append(e.get("key", ""))
    elif isinstance(ext, dict):
        # 对象 ext 内的 N1. 值也收集（嵌套解密目标）
        def walk(o):
            if isinstance(o, str):
                if o.startswith("N1.") and o not in sites:
                    sites[o] = []
                    ciphers.append(o)
            elif isinstance(o, dict):
                for v in o.values():
                    walk(v)
            elif isinstance(o, list):
                for v in o:
                    walk(v)
        walk(ext)

out = {"ciphers": ciphers, "exts": exts,
       "cipherSites": {c: sites[c] for c in ciphers},
       "extSites": ext_sites}
with open(OUT, "w", encoding="utf-8") as f:
    json.dump(out, f, ensure_ascii=True)
print("ciphers=%d exts=%d -> %s" % (len(ciphers), len(exts), OUT))
