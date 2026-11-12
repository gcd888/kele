# -*- coding: utf-8 -*-
"""merge_ftysites.py — 将饭太硬 fty.json 的影视源合并进 果果影视.json
规则：跳过短剧(AiDj)与已有等效源(YGP/荐片JPJ/厂长)；key 冲突跳过；
     Guard 类源 jar 统一升级 fty-22.bin → fty-23.bin；名称去广告标记。
"""
import json
import os
import re

HERE = os.path.dirname(os.path.abspath(__file__))
FTY_JSON = r"E:\HelloWorld\project\kele\src\ysc\diy\饭太硬\fty.json"
GG_JSON = os.path.join(HERE, "果果影视", "果果影视.json")
FTY23 = "./lib/fty-23.bin;md5;d2a33b53d09ec59c4cb7e3f482ef3907"
FTY22 = "./lib/fty-22.bin;md5;c9024ccf34209d26eb556c728c3f07fa"

# 跳过：短剧 + 现有等效源（key 不同但功能重复）
SKIP_KEYS = {"AiDj", "YGP", "JPJ", "厂长"}
# 名称广告/噪音清理
NAME_CLEAN = re.compile(r"<[^>]*>|修复所有|关注公众号.*|公众号[：:].*|QQ频道[：:].*|群[：:].*")


def clean_name(name):
    return NAME_CLEAN.sub("", name).strip()


def main():
    with open(FTY_JSON, encoding="utf-8") as f:
        fty = json.load(f)
    with open(GG_JSON, encoding="utf-8-sig") as f:
        gg = json.load(f)

    sites = gg.get("filmtvs", [])
    existing_keys = {s.get("key") for s in sites}

    # 1) 现有 Guard 类源 jar 升级 fty-22 → fty-23
    upgraded = 0
    for s in sites:
        if s.get("jar") == FTY22:
            s["jar"] = FTY23
            upgraded += 1

    # 2) 合并饭太硬独有源
    added = []
    for src in fty.get("sites", []):
        key = src.get("key")
        if key in SKIP_KEYS or key in existing_keys:
            continue
        s = json.loads(json.dumps(src))  # deep copy
        s["jar"] = FTY23
        if s.get("name"):
            s["name"] = clean_name(s["name"])
        sites.append(s)
        existing_keys.add(key)
        added.append(key)

    gg["filmtvs"] = sites
    with open(GG_JSON, "w", encoding="utf-8") as f:
        f.write("\ufeff")  # 保持原文件 BOM 风格
        json.dump(gg, f, ensure_ascii=False, indent="\t")

    print("jar 升级: %d 个源 (fty-22 -> fty-23)" % upgraded)
    print("新增 %d 个源: %s" % (len(added), "、".join(added)))
    print("当前源总数: %d" % len(sites))
    # 广告词复扫
    raw = json.dumps(gg, ensure_ascii=False)
    bad = [w for w in ["公众号", "QQ频道", "修复所有", "投稿", "加群", "telegram", "t.me"] if w in raw]
    print("广告词残留检查:", bad if bad else "无")


if __name__ == "__main__":
    main()
