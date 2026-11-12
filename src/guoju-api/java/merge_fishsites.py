# -*- coding: utf-8 -*-
"""merge_fishsites.py — 将摸鱼儿 fish.y456y.json 的影视源合并进 果果影视.json
规则：跳过短剧(HonHon/DJHub)、key 冲突(少儿教育/push_agent)、摸鱼儿壳内辅助源
     (FishConfig/Wallpaper)与已有等效源；新增源 jar 统一挂 fish-18.bin；
     share.json ext 路径改写至 extsrc；名称去广告标记。
"""
import hashlib
import json
import os
import re
import shutil

HERE = os.path.dirname(os.path.abspath(__file__))
FISH_DIR = r"E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿"
FISH_JSON = os.path.join(FISH_DIR, "fish.y456y.json")
FISH_JAR_SRC = os.path.join(FISH_DIR, "868071194_2_1793519289671.jar")
GG_DIR = os.path.join(HERE, "果果影视")
GG_JSON = os.path.join(GG_DIR, "果果影视.json")
GG_LIB = os.path.join(GG_DIR, "lib")
FISH_BIN = os.path.join(GG_LIB, "fish-18.bin")
SHARE_SRC = os.path.join(FISH_DIR, "lib", "share.json")
SHARE_DST = os.path.join(GG_LIB, "extsrc", "fish-share.json")

# 跳过：短剧（走果果短剧模块）+ key 冲突 + 摸鱼儿壳内辅助源 + 现有等效源（key 不同功能重复）
SKIP_KEYS = {
    # 短剧
    "HonHon", "DJHub",
    # key 冲突（果果已有同名 key）
    "少儿教育", "push_agent",
    # 摸鱼儿壳内辅助源（电视端无意义）
    "FishConfig", "Wallpaper",
    # 等效源：YGP↔豆瓣预告 Local↔本地 Wogg↔玩偶 Rebo↔热播 Wwys↔糯米/csp_Wwys
    #        CZ↔厂长 wencai↔文采 Guazi↔瓜子 SaoHuo↔csp_SaoHuo Gugu↔咕咕
    #        FanShu↔番薯 Jianpian↔荐片 Xb6v↔新6V fishhxq↔韩圈 Libvio↔立播 SeedHub↔seed
    "YGP", "Local", "Wogg", "Rebo", "Wwys", "CZ", "wencai", "Guazi",
    "SaoHuo", "Gugu", "FanShu", "Jianpian", "Xb6v", "fishhxq", "Libvio", "SeedHub",
}
# 名称广告/噪音清理（与 merge_ftysites.py 同一正则）
NAME_CLEAN = re.compile(r"<[^>]*>|修复所有|关注公众号.*|公众号[：:].*|QQ频道[：:].*|群[：:].*")


def clean_name(name):
    return NAME_CLEAN.sub("", name).strip()


def md5_of(path):
    h = hashlib.md5()
    with open(path, "rb") as f:
        for chunk in iter(lambda: f.read(1 << 20), b""):
            h.update(chunk)
    return h.hexdigest()


LIB_REF_RE = re.compile(r"\./lib/([0-9A-Za-z._\-]+)")


def walk_lib_refs(o, out):
    """递归收集 ext 结构（str/dict/list）里的 ./lib/<file> 引用文件名。"""
    if isinstance(o, str):
        out.update(LIB_REF_RE.findall(o))
    elif isinstance(o, dict):
        for v in o.values():
            walk_lib_refs(v, out)
    elif isinstance(o, list):
        for v in o:
            walk_lib_refs(v, out)


def place_deps(sites):
    """按新增源 ext 的实际引用，把摸鱼儿 lib/ 依赖文件复制到 果果影视/lib/（幂等）。"""
    refs = set()
    for s in sites:
        walk_lib_refs(s.get("ext"), refs)
    placed, missing = [], []
    for name in sorted(refs):
        dst = os.path.join(GG_LIB, name)
        if os.path.isfile(dst) or os.path.isdir(dst):  # extsrc 等子目录引用跳过
            continue
        src = os.path.join(FISH_DIR, "lib", name)
        if os.path.isfile(src):
            shutil.copyfile(src, dst)
            placed.append(name)
        else:
            missing.append(name)
    return placed, missing


def main():
    # 0) 就位 jar 与 ext 依赖（幂等：已一致则跳过）
    os.makedirs(GG_LIB, exist_ok=True)
    os.makedirs(os.path.dirname(SHARE_DST), exist_ok=True)
    if not os.path.isfile(FISH_BIN) or md5_of(FISH_BIN) != md5_of(FISH_JAR_SRC):
        shutil.copyfile(FISH_JAR_SRC, FISH_BIN)
        print("jar 就位: lib/fish-18.bin (md5 %s)" % md5_of(FISH_BIN))
    else:
        print("jar 已就位: lib/fish-18.bin")
    if not os.path.isfile(SHARE_DST) or md5_of(SHARE_DST) != md5_of(SHARE_SRC):
        shutil.copyfile(SHARE_SRC, SHARE_DST)
        print("ext 就位: lib/extsrc/fish-share.json")
    else:
        print("ext 已就位: lib/extsrc/fish-share.json")
    fish_jar_ref = "./lib/fish-18.bin;md5;" + md5_of(FISH_BIN)

    with open(FISH_JSON, encoding="utf-8-sig") as f:
        fish = json.load(f)
    with open(GG_JSON, encoding="utf-8-sig") as f:
        gg = json.load(f)

    sites = gg.get("filmtvs", [])
    existing_keys = {s.get("key") for s in sites}

    added, skipped = [], []
    for src in fish.get("sites", []):
        key = src.get("key")
        if key in SKIP_KEYS or key in existing_keys:
            skipped.append(key)
            continue
        s = json.loads(json.dumps(src))  # deep copy
        # 摸鱼儿源全部走其顶层聚合 spider，这里改为 per-site jar 三段式引用
        s["jar"] = fish_jar_ref
        # ext 文件引用改写（仅 share.json 一种；加密串/inline 原样保留）
        if isinstance(s.get("ext"), str) and s["ext"].strip() == "./lib/share.json":
            s["ext"] = "./lib/extsrc/fish-share.json"
        if s.get("name"):
            s["name"] = clean_name(s["name"])
        sites.append(s)
        existing_keys.add(key)
        added.append(key)

    gg["filmtvs"] = sites
    with open(GG_JSON, "w", encoding="utf-8") as f:
        f.write("\ufeff")  # 保持原文件 BOM 风格
        json.dump(gg, f, ensure_ascii=False, indent="\t")

    print("新增 %d 个源:" % len(added))
    print("  " + "、".join(added))
    print("跳过 %d 个源: %s" % (len(skipped), "、".join(skipped)))
    print("当前源总数: %d" % len(sites))

    # ext 依赖补齐（以合并后新增源的实际引用为准，幂等）
    placed, missing = place_deps(sites)
    print("ext 依赖新复制: %s" % ("、".join(placed) if placed else "无（均已就位）"))
    if missing:
        print("[警告] 摸鱼儿 lib 中不存在的引用: %s" % missing)

    # 校验：key 唯一性
    keys = [s.get("key") for s in sites]
    dup = {k for k in keys if keys.count(k) > 1}
    print("key 唯一性:", ("冲突 %s" % dup) if dup else "通过")
    # 广告词复扫
    raw = json.dumps(gg, ensure_ascii=False)
    bad = [w for w in ["公众号", "QQ频道", "修复所有", "投稿", "加群", "telegram", "t.me"] if w in raw]
    print("广告词残留检查:", bad if bad else "无")


if __name__ == "__main__":
    main()
