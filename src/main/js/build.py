# -*- coding: utf-8 -*-
"""
build.py — 果剧 JS 版源编译脚本（src/main/js 源码 → guoju-api/js 产物目录）

与 java 版对称的分工：
  编译（本脚本，源码侧）= 混淆（obf.mjs，对应 java build.ps1 的 R8）+ 组装产物到 guoju-api/js 四子仓
  打包加密（guoju-api/js/pack.py，产物侧）= GJZ1 加密 → guoguojs<时间戳>.zip（对应 java/pack.py）
  发布（guoju-api/js/publish.py，产物侧）= pack + 上传 R2 固定 key（对应 java/publish.py）

目录组织（四子仓配置协议与 java 版一致；源目录在子仓 lib/ 下按源名分目录，
与 src/main/js 开发目录一一对应）：
  guoju-api/js/
  ├── guoju.json                  # manifest（urls: ./果果短剧/果果短剧.json 等，同 java 版）
  ├── 果果短剧/
  │   ├── 果果短剧.json           # dramas 线路（api: ./lib/qingguoduanju/qingguoduanju.js 等）
  │   └── lib/
  │       ├── qingguoduanju/      # 混淆产物 + 依赖平铺（import '../lib/x' 改写为 './x'）
  │       ├── xihongshiduanju/
  │       ├── haimajuchang/
  │       └── bili-spider.bin     # bili 第三方 jar 源保留（lib 根，与 java 版一致）
  ├── 果果音乐/
  │   ├── 果果音乐.json           # musics 线路（api: ./lib/luoxueyinyue/lxsource.js 等）
  │   └── lib/
  │       ├── luoxueyinyue/       # lx 音源 + MV×4 共仓
  │       ├── maidongktv/
  │       └── lx/lx_*.js          # 第三方音源脚本原样（ext 路径与 java 版完全一致）
  ├── 果果影视/（原样复制）
  └── 果果直播/（原样复制）

编译 = 中度混淆（obf.mjs：javascript-obfuscator，自研文件全部混淆；
        crypto-js/pako/lx_*.js 第三方原样）+ GJZ1 加密打包
      （RSA-OAEP-SHA1 包裹会话密钥 + AES-256-GCM，与壳端 CryptoBox.java 逐字节对齐）。

用法（在本目录执行）：
    python build.py               # 混淆 + 组装产物到 guoju-api/js（不打 zip）
    python build.py --no-obf      # 跳过混淆（明文产物，调试用）

随后在 guoju-api/js 目录：
    python pack.py                # GJZ1 加密打包 → guoguojs<时间戳>.zip
    python publish.py             # 上传 R2 固定 key guoju/guoguojs.zip

依赖：node + npm install javascript-obfuscator（混淆）
"""

import argparse
import os
import re
import subprocess
import sys

_SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
JS_ROOT = _SCRIPT_DIR
API_ROOT = os.path.normpath(os.path.join(_SCRIPT_DIR, "..", "..", "guoju-api"))
OUT_DIR = os.path.join(API_ROOT, "js")
JAVA_DIR = os.path.join(API_ROOT, "java")
OBF_MJS = os.path.join(JS_ROOT, "obf.mjs")

# 仓 → 源目录清单（obf = 需混淆；plain = 依赖原样平铺进源目录）
# 共享库 lib/：binutil/sm3/xhs_sign 自研混淆，crypto-js/pako 第三方原样
REPOS = {
    "果果影视": {
        "moyueryingshi": {
            "obf": ["muCore.js"],
            "plain": ["lib/binutil.js", "lib/sm3.js", "lib/xhs_sign.js", "lib/crypto-js.js",
                      "lib/pako.js", "lib/cheerio.min.js", "lib/gbk.js"],
        },
    },
    "果果短剧": {
        "qingguoduanju": {
            "obf": ["qingguoduanju.js", "qg_sign.js", "qg_account.js"],
            "plain": ["lib/binutil.js", "lib/sm3.js", "lib/xhs_sign.js", "lib/crypto-js.js", "lib/pako.js"],
        },
        "xihongshiduanju": {
            "obf": ["xihongshiduanju.js"],
            "plain": ["lib/binutil.js", "lib/sm3.js", "lib/xhs_sign.js", "lib/crypto-js.js", "lib/pako.js"],
        },
        "haimajuchang": {
            "obf": ["haimajuchang.js"],
            "plain": [],
        },
    },
    "果果音乐": {
        "luoxueyinyue": {
            "obf": ["lxsource.js", "neteasemv.js", "qqmv.js", "kugoumv.js", "migumv.js", "music_core_mv.js"],
            "plain": ["lib/binutil.js", "lib/sm3.js", "lib/xhs_sign.js", "lib/crypto-js.js", "lib/pako.js"],
            "copy_tree": [("果果音乐/lib/lx", "lx")],  # java 版 lx 音源脚本原样
        },
        "maidongktv": {
            "obf": ["maidongktv.js"],
            "plain": ["lib/binutil.js", "lib/sm3.js", "lib/xhs_sign.js", "lib/crypto-js.js", "lib/pako.js"],
        },
    },
}

# moyueryingshi：除 muCore 外的 spider 源自动发现（<ApiName>.js 平铺在源目录根，一键入 obf 清单）
def extend_filmtvs_sources():
    spec = REPOS["果果影视"]["moyueryingshi"]
    src_dir = os.path.join(JS_ROOT, "moyueryingshi")
    for fn in sorted(os.listdir(src_dir)):
        if fn.endswith(".js") and fn != "muCore.js":
            spec["obf"].append(fn)

# 已 JS 化的摸鱼儿 spider 类（Api 名 → ./lib/moyueryingshi/<Api>.js）；
# 桥接类（云桥 WebSocket + native 解密）与未移植类保留 java fish-18.bin 条目原样。
JS_READY = {
    "FishCloud", "JSo", "Tiu6", "DianYingYunJi", "FishDrive", "Market", "FishPs",
    "ALLLive", "PianDan", "WoNiu", "Yidong4K", "PanWebShareGuangYa", "ShuangXing",
    "Gying", "PanWebShare123", "KZN",
}

# GJZ1（与 java/pack.py / 壳端 CryptoBox.java 逐字节对齐）
MAGIC = b"GJZ1"
VERSION = 1

PUBLIC_KEY_PEM = b"""-----BEGIN PUBLIC KEY-----
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlhsjOIuwMfP0PfQMZ+jz
c7i5UrlWjjr3vDKqORNg7g6Y/oyvrMRfhU1wIJPWBqPhEJaE9G98RnGEKxquB2ri
+Sd8HWOEr1P7zGZJNtBcvWN6lNkgNoZ6fFghx0V5Aie+RLmjKjgWSCQ1o1sGg3bb
QHdZyADbQHcrEj/q7YrobGCEk5ZvIT9yt4ObLSXLmpiR7JC2i5y6Z7Mmc2zpWaht
yeAJFozmgzUIHoVNJAU4hp/qloUNsq7oXtEJS03nV57UA5wwc8ohZl6Kl/nBE6DA
5xoeTYU2bQTvLQ0vMhL52yVNxYutkvl2T+1Mmg+9dfyntQElAnV9Ub974Lco+tLS
2QIDAQAB
-----END PUBLIC KEY-----"""

REF_QUERY_RE = re.compile(r"\?ref=[^\"'\s]*")
IMPORT_RE = re.compile(r"""((?:from|import)\s*)(['"])(\.\./lib/[^'"]+\.js|\./lib/[^'"]+\.js)(\2)""")


def fail(msg):
    print("[错误] %s" % msg)
    sys.exit(1)


def read_text(path):
    with open(path, "r", encoding="utf-8") as f:
        return f.read()


def rewrite_imports(text):
    """共享依赖平铺改写：'../lib/x.js' → './x.js'（发布目录内同目录引用）。"""
    return IMPORT_RE.sub(lambda m: m.group(1) + m.group(2) + "./" + os.path.basename(m.group(3)) + m.group(4), text)


def obfuscate(src_path, dst_path):
    r = subprocess.run(["node", OBF_MJS, src_path, dst_path], cwd=JS_ROOT,
                       capture_output=True, text=True, encoding="utf-8", errors="replace")
    if r.returncode != 0:
        fail("混淆失败 %s : %s" % (src_path, (r.stdout or "") + (r.stderr or "")))


def build_source_dir(repo, source, spec):
    out_dir = os.path.join(OUT_DIR, repo, "lib", source)
    os.makedirs(out_dir, exist_ok=True)
    for rel in spec["obf"]:
        src = os.path.join(JS_ROOT, source, rel)
        if not os.path.isfile(src):
            fail("缺源文件: %s (%s)" % (rel, source))
        dst = os.path.join(out_dir, os.path.basename(rel))
        if not args.no_obf:
            # 先平铺改写 import（混淆器原样保留 import 语句），再混淆
            tmp = dst + ".plain.tmp"
            with open(tmp, "w", encoding="utf-8", newline="\n") as f:
                f.write(rewrite_imports(read_text(src)))
            obfuscate(tmp, dst)
            try:
                os.remove(tmp)
            except OSError:
                pass
        else:
            with open(dst, "w", encoding="utf-8", newline="\n") as f:
                f.write(rewrite_imports(read_text(src)))
    for rel in spec.get("plain", []):
        src = os.path.join(JS_ROOT, rel)
        if not os.path.isfile(src):
            fail("缺依赖: %s" % rel)
        dst = os.path.join(out_dir, os.path.basename(rel))
        with open(dst, "w", encoding="utf-8", newline="\n") as f:
            f.write(rewrite_imports(read_text(src)))
    for src_rel, dst_rel in spec.get("copy_tree", []):
        src = os.path.join(JAVA_DIR, src_rel)
        dst = os.path.join(out_dir, dst_rel)
        os.makedirs(dst, exist_ok=True)
        for fn in os.listdir(src):
            if fn.endswith(".js"):
                with open(os.path.join(src, fn), "rb") as f, open(os.path.join(dst, fn), "wb") as g:
                    g.write(f.read())
    print("[组装] %s/lib/%s/: %d 混淆, %d 依赖%s" % (
        repo, source, len(spec["obf"]), len(spec.get("plain", [])),
        ", +lx脚本" if spec.get("copy_tree") else ""))


def build_drama_repo():
    import json
    repo = "果果短剧"
    for source, spec in REPOS[repo].items():
        build_source_dir(repo, source, spec)
    # bili 第三方 jar 源保留（lib 根，引用与 java 版一致）
    bili_src = os.path.join(JAVA_DIR, repo, "lib", "bili-spider.bin")
    if not os.path.isfile(bili_src):
        fail("缺少 bili-spider.bin: %s" % bili_src)
    bili_dst = os.path.join(OUT_DIR, repo, "lib", "bili-spider.bin")
    os.makedirs(os.path.dirname(bili_dst), exist_ok=True)
    with open(bili_src, "rb") as f, open(bili_dst, "wb") as g:
        g.write(f.read())
    drama = {
        "dramas": [
            {
                "key": "qingguoduanju",
                "name": "🍐青果短剧",
                "type": 3,
                "api": "./lib/qingguoduanju/qingguoduanju.js",
                "searchable": 1, "quickSearch": 0, "filterable": 1,
                "changeable": 1, "playerType": 2, "timeout": 45, "style": "drama",
            },
            {
                "key": "xihongshiduanju",
                "name": "🍅西红柿短剧",
                "type": 3,
                "api": "./lib/xihongshiduanju/xihongshiduanju.js",
                "searchable": 1, "quickSearch": 0, "filterable": 0,
                "changeable": 1, "playerType": 2, "timeout": 45, "style": "drama",
            },
            {
                "key": "haimajuchang",
                "name": "🐴海马短剧",
                "type": 3,
                "api": "./lib/haimajuchang/haimajuchang.js",
                "searchable": 1, "quickSearch": 0, "filterable": 1,
                "changeable": 1, "playerType": 2, "timeout": 45, "style": "drama",
            },
            {
                "key": "csp_Bili短剧",
                "name": "🅱️破站短剧",
                "type": 3,
                "api": "csp_Bili",
                "jar": "./lib/bili-spider.bin;md5;2faffa26e94c2621d7ae3a61a9678324",
                "searchable": 1, "quickSearch": 1, "filterable": 1,
                "changeable": 1, "playerType": 2, "timeout": 45, "style": "drama",
                "ext": {
                    "cookie": "SESSDATA=7624af93%2C1696008331%2C862c8%2A42; bili_jct=141a474ef3ce8cf2fedf384e68f6625d; DedeUserID=3493271303096985; DedeUserID__ckMd5=212a836c164605b7",
                    "classes": [
                        {"type_name": "短剧", "type_id": "短剧"},
                        {"type_name": "沙雕动画", "type_id": "沙雕动画"},
                    ],
                    "filter": {
                        "短剧": [{"key": "duration", "name": "时长", "value": [
                            {"n": "全部", "v": "0"}, {"n": "60分钟以上", "v": "4"},
                            {"n": "30~60分钟", "v": "3"}, {"n": "10~30分钟", "v": "2"},
                            {"n": "10分钟以下", "v": "1"}]}],
                        "沙雕动画": [{"key": "duration", "name": "时长", "value": [
                            {"n": "全部", "v": "0"}, {"n": "60分钟以上", "v": "4"},
                            {"n": "30~60分钟", "v": "3"}, {"n": "10~30分钟", "v": "2"},
                            {"n": "10分钟以下", "v": "1"}]}],
                    },
                },
            },
        ]
    }
    with open(os.path.join(OUT_DIR, repo, "果果短剧.json"), "w", encoding="utf-8") as f:
        f.write(json.dumps(drama, ensure_ascii=False, indent="\t"))
    print("[线路json] %s/果果短剧.json" % repo)


LX_DISPLAY = {
    "lx_xinghai": "星海", "lx_xiaoyin": "晓音", "lx_luoxue": "落雪",
    "lx_fengchuiye": "风吹绿叶", "lx_fenghuang": "凤凰", "lx_lianting": "恋听",
    "lx_qingmeng": "清梦", "lx_yecao": "野草", "lx_juhe_cf": "聚合CF",
    "lx_hello_world": "HelloWorld", "lx_changqing": "长青", "lx_donghua": "动画",
    "lx_tianya": "天涯", "lx_qingsebian": "青色彼岸", "lx_yehua": "野花",
    "lx_dujia_v7": "独家v7",
}


def build_music_repo():
    import json
    repo = "果果音乐"
    for source, spec in REPOS[repo].items():
        build_source_dir(repo, source, spec)
    # 听歌/K歌双段拆分（对齐 java 版 2026-11-12 拆分：musics=听歌+MV / karaokes=K歌；
    # abilities 字段已废弃，段归属即模块归属；同 URL 双段服务两模块）
    musics = []
    for lx in LX_DISPLAY.keys():
        musics.append({
            "key": lx, "name": "🎧" + LX_DISPLAY[lx], "type": 3,
            "api": "./lib/luoxueyinyue/lxsource.js",
            "ext": "./lib/lx/" + lx + ".js",   # ext 路径与 java 版完全一致
            "searchable": 1, "quickSearch": 1, "filterable": 1,
            "changeable": 1, "playerType": 2, "timeout": 45,
            "style": "music",
        })
    for key, name, api in [
        ("guoguoyunying", "🎬芸映", "./lib/luoxueyinyue/neteasemv.js"),
        ("guoguoqiumv", "🎬秋映", "./lib/luoxueyinyue/qqmv.js"),
        ("guoguogoumv", "🎬枸映", "./lib/luoxueyinyue/kugoumv.js"),
        ("guoguomigumv", "🎬蜜映", "./lib/luoxueyinyue/migumv.js"),
    ]:
        musics.append({
            "key": key, "name": name, "type": 3, "api": api,
            "searchable": 1, "quickSearch": 1, "filterable": 1,
            "changeable": 1, "playerType": 2, "timeout": 45,
            "style": "mv",
        })
    karaokes = [{
        "key": "guoguomaidong", "name": "🎤麦动K歌", "type": 3,
        "api": "./lib/maidongktv/maidongktv.js",
        "searchable": 1, "quickSearch": 1, "filterable": 1,
        "changeable": 1, "playerType": 2, "timeout": 45,
        "style": "karaoke",
    }]
    with open(os.path.join(OUT_DIR, repo, "果果音乐.json"), "w", encoding="utf-8") as f:
        f.write(json.dumps({"musics": musics, "karaokes": karaokes}, ensure_ascii=False, indent="\t"))
    print("[线路json] %s/果果音乐.json（musics=%d + karaokes=%d 双段）" % (
        repo, len(musics), len(karaokes)))


def build_filmtvs_repo():
    """果果影视子仓：moyueryingshi JS 源组装 + 线路 json 生成（JS_READY 换 JS api，其余 fish-18 java 条目
    原样保留并按需复制 jar/ext 依赖文件；非 fish-18 的 java 条目丢弃）。"""
    import json
    import shutil
    repo = "果果影视"
    for source, spec in REPOS[repo].items():
        build_source_dir(repo, source, spec)
    java_lib = os.path.join(JAVA_DIR, repo, "lib")
    if not os.path.isdir(java_lib):
        fail("缺少 java 依赖目录: %s" % java_lib)
    raw = open(os.path.join(JAVA_DIR, repo, "果果影视.json"), encoding="utf-8-sig").read()
    cfg = json.loads(raw)
    entries = []
    copied = set()

    def copy_dep(rel):
        rel = rel.split(";md5;")[0]
        if not rel or rel in copied:
            return
        copied.add(rel)
        src = os.path.join(JAVA_DIR, repo, rel[2:] if rel.startswith("./") else rel)
        if not os.path.isfile(src):
            fail("缺少 java 依赖: %s" % rel)
        dst = os.path.join(OUT_DIR, repo, rel[2:] if rel.startswith("./") else rel)
        os.makedirs(os.path.dirname(dst), exist_ok=True)
        shutil.copyfile(src, dst)

    js_count = java_count = 0
    for e in cfg.get("filmtvs", []):
        api = str(e.get("api", ""))
        cls = api[4:] if api.startswith("csp_") else ""
        if cls in JS_READY:
            ne = dict(e)
            ne["api"] = "./lib/moyueryingshi/" + cls + ".js"
            ne.pop("jar", None)  # JS 源无需 jar
            entries.append(ne)
            js_count += 1
        elif str(e.get("jar", "")).startswith("./lib/fish-18"):
            entries.append(e)
            java_count += 1
            copy_dep(str(e.get("jar", "")))
            ext = e.get("ext")
            refs = []
            if isinstance(ext, str) and ext.startswith("./"):
                refs.append(ext)
            elif isinstance(ext, dict) or isinstance(ext, list):
                def walk(o):
                    if isinstance(o, str) and o.startswith("./"):
                        refs.append(o)
                    elif isinstance(o, dict):
                        for v in o.values():
                            walk(v)
                    elif isinstance(o, list):
                        for v in o:
                            walk(v)
                walk(ext)
            for r in refs:
                copy_dep(r)
        # 其余（fty-23/fish-17/无 jar）条目丢弃
    with open(os.path.join(OUT_DIR, repo, "果果影视.json"), "w", encoding="utf-8") as f:
        f.write(json.dumps({"filmtvs": entries}, ensure_ascii=False, indent="\t"))
    print("[线路json] %s/果果影视.json（JS=%d + java保留=%d）" % (repo, js_count, java_count))


def copy_static_repo(name):
    import shutil
    src = os.path.join(JAVA_DIR, name)
    dst = os.path.join(OUT_DIR, name)
    if not os.path.isdir(src):
        fail("缺少静态子仓: %s" % src)
    if os.path.isdir(dst):
        shutil.rmtree(dst)
    shutil.copytree(src, dst, ignore=shutil.ignore_patterns(".git"))
    print("[子仓] %s: 原样复制" % name)


def build_manifest():
    import json
    manifest = {
        "urls": [
            {"url": "./果果短剧/果果短剧.json", "name": "🍎果果短剧"},
            {"url": "./果果音乐/果果音乐.json", "name": "🍎果果音乐"},
            {"url": "./果果影视/果果影视.json", "name": "🍎果果影视"},
            {"url": "./果果直播/果果直播.json", "name": "🍎果果直播"},
        ]
    }
    with open(os.path.join(OUT_DIR, "guoju.json"), "w", encoding="utf-8") as f:
        f.write(json.dumps(manifest, ensure_ascii=False, indent=2))
    print("[manifest] guoju.json（四子仓，同 java 版）")


def main():
    global args
    ap = argparse.ArgumentParser(description="guoju-api js 版编译（混淆+组装，打包/发布见 guoju-api/js 的 pack.py/publish.py）")
    ap.add_argument("--no-obf", action="store_true", help="跳过混淆（明文产物，调试用）")
    args = ap.parse_args()

    os.makedirs(OUT_DIR, exist_ok=True)
    print("[1/3] 混淆 + 子仓源目录组装" if not args.no_obf else "[1/3] 子仓源目录组装（跳过混淆）")
    extend_filmtvs_sources()
    build_drama_repo()
    build_music_repo()
    print("[2/3] 静态子仓 + manifest")
    build_filmtvs_repo()
    copy_static_repo("果果直播")
    build_manifest()
    print("[3/3] 编译完成: %s" % OUT_DIR)
    print("  打包: cd %s && python pack.py" % OUT_DIR)
    print("  发布: cd %s && python publish.py" % OUT_DIR)


if __name__ == "__main__":
    main()
