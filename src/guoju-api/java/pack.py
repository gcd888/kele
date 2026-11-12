# -*- coding: utf-8 -*-
"""
pack.py — 果剧接口加密打包脚本（guoju-api 配置仓库 → guoguo.zip 加密包）

一条命令完成：打明文包（manifest + 四个子仓本地化）→ GJZ1 容器加密。
产物 guoguo.zip 可上传小飞机网盘 / 蓝奏云 / 简单云链 / 任意直链，
App 推送该分享链接或直链即可自动下载解密加载。

打包规则（与壳端 ZipLoader / CryptoBox 逐字节对齐）：
  1. 根 manifest guoju.json + 其 urls 引用的四个子仓目录（含 lib/）
  2. 所有 .json 中的 ?ref=xxx 分支标记去掉（本地路径不能带 query）
  3. 排除 .git 等仓库噪音；未被子仓引用的目录（如果果影视-full）不打
  4. GJZ1 加密：RSA-OAEP-SHA1 包裹随机会话密钥 + AES-256-GCM 加密内容
     （本脚本只内置公钥，只能加密无法解密；密钥持有者用壳内私钥解密）

用法（在本目录执行）：
    python pack.py                          # 生成 ./guoguo<yyyyMMddHHmmss>.zip（24 小时制时间戳）
    python pack.py --out D:/share/xxx.zip   # 指定输出文件名
    python pack.py --src <其他guoju-api目录>

依赖安装（仅首次）：
    pip install cryptography
"""

import argparse
import os
import re
import struct
import sys
import time
import zipfile

from cryptography.hazmat.primitives import hashes, serialization
from cryptography.hazmat.primitives.asymmetric import padding
from cryptography.hazmat.primitives.ciphers.aead import AESGCM

_SCRIPT_DIR = os.path.dirname(os.path.abspath(__file__))
DEFAULT_SRC = _SCRIPT_DIR
DEFAULT_OUT = None  # 运行时按时间戳生成：guoguo<yyyyMMddHHmmss>.zip

# guoju.json 中子仓相对地址的 ?ref= 分支标记（如 ./果果影视/果果影视.json?ref=v0.2）
REF_QUERY_RE = re.compile(r"\?ref=[^\"'\s]*")

# 参与打包的子仓（与 guoju.json urls 一致）
SUBREPOS = ["果果影视", "果果短剧", "果果音乐", "果果直播"]
EXCLUDE_DIRS = {".git", ".github", ".idea"}

# ---------------- GJZ1 加密（与壳端 CryptoBox.java 逐字节对齐） ----------------

MAGIC = b"GJZ1"
VERSION = 1
OAEP_PAD = padding.OAEP(mgf=padding.MGF1(algorithm=hashes.SHA1()),
                        algorithm=hashes.SHA1(), label=None)

# 壳私钥对应的加密公钥（仅具备加密能力，泄露也解不开内容）
PUBLIC_KEY_PEM = b"""-----BEGIN PUBLIC KEY-----
MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAlhsjOIuwMfP0PfQMZ+jz
c7i5UrlWjjr3vDKqORNg7g6Y/oyvrMRfhU1wIJPWBqPhEJaE9G98RnGEKxquB2ri
+Sd8HWOEr1P7zGZJNtBcvWN6lNkgNoZ6fFghx0V5Aie+RLmjKjgWSCQ1o1sGg3bb
QHdZyADbQHcrEj/q7YrobGCEk5ZvIT9yt4ObLSXLmpiR7JC2i5y6Z7Mmc2zpWaht
yeAJFozmgzUIHoVNJAU4hp/qloUNsq7oXtEJS03nV57UA5wwc8ohZl6Kl/nBE6DA
5xoeTYU2bQTvLQ0vMhL52yVNxYutkvl2T+1Mmg+9dfyntQElAnV9Ub974Lco+tLS
2QIDAQAB
-----END PUBLIC KEY-----"""


def fail(msg):
    print("[错误] %s" % msg)
    sys.exit(1)


def clean_json_bytes(data):
    """json 文本去掉 ?ref= 分支标记（UTF-8 读写，保留原编码下的中文）。"""
    text = data.decode("utf-8")
    return REF_QUERY_RE.sub("", text).encode("utf-8")


def pack_plain(src):
    """打明文 zip 字节流：manifest + 四个子仓（json 去 ?ref=）。"""
    if not os.path.isfile(os.path.join(src, "guoju.json")):
        fail("源目录缺少 guoju.json：%s" % src)
    with open(os.path.join(src, "guoju.json"), "rb") as f:
        manifest_bytes = clean_json_bytes(f.read())

    entries = [("guoju.json", manifest_bytes)]
    total_in = len(manifest_bytes)
    for repo in SUBREPOS:
        repo_dir = os.path.join(src, repo)
        if not os.path.isdir(repo_dir):
            fail("缺少子仓目录：%s" % repo_dir)
        for root, dirs, names in os.walk(repo_dir):
            dirs[:] = [d for d in dirs if d not in EXCLUDE_DIRS]
            for name in names:
                disk = os.path.join(root, name)
                rel = os.path.relpath(disk, src).replace(os.sep, "/")
                with open(disk, "rb") as f:
                    data = clean_json_bytes(f.read()) if name.lower().endswith(".json") else f.read()
                total_in += len(data)
                entries.append((rel, data))

    import io
    buf = io.BytesIO()
    with zipfile.ZipFile(buf, "w", zipfile.ZIP_DEFLATED) as zf:
        for rel, data in entries:
            zf.writestr(rel, data)
    return buf.getvalue(), len(entries), total_in


def encrypt_gjz1(plain):
    """GJZ1 容器：magic + ver + RSA-OAEP(会话密钥) + IV + AES-GCM(密文+tag)。"""
    session = os.urandom(32)
    iv = os.urandom(12)
    ct = AESGCM(session).encrypt(iv, plain, None)
    pub = serialization.load_pem_public_key(PUBLIC_KEY_PEM)
    rsa_ct = pub.encrypt(session, OAEP_PAD)
    return MAGIC + bytes([VERSION]) + struct.pack(">H", len(rsa_ct)) + rsa_ct + iv + ct


def main():
    ap = argparse.ArgumentParser(description="guoju-api 加密打包 → guoguo<时间戳>.zip")
    ap.add_argument("--src", default=DEFAULT_SRC, help="guoju-api 配置仓库目录（默认=脚本所在目录）")
    ap.add_argument("--out", default=DEFAULT_OUT, help="输出加密包路径（默认=<src>/guoguo<yyyyMMddHHmmss>.zip）")
    args = ap.parse_args()

    src = os.path.normpath(args.src)
    out = os.path.normpath(args.out) if args.out else os.path.join(
        src, time.strftime("guoguo%Y%m%d%H%M%S.zip"))

    plain, count, total_in = pack_plain(src)
    enc = encrypt_gjz1(plain)

    with open(out, "wb") as f:
        f.write(enc)
    print("[完成] %s" % out)
    print("  文件数=%d 明文=%.1fMB 加密=%.1fMB（md5 校验基准=明文包内容）" % (
        count, len(plain) / 1048576.0, len(enc) / 1048576.0))
    print("  上传网盘/直链后，App 推送该链接即可自动下载解密加载")


if __name__ == "__main__":
    main()
