# -*- coding: utf-8 -*-
"""probe_e.py — 解析 C0299u0.E() 用到的分发器调用目标（临时探针，可删）"""
import json, io, sys

ROOT = r"E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿"
with io.open(ROOT + r"\dispatchers.json", encoding="utf-8") as f:
    disp = json.load(f)

TARGETS = ["C0194", "C0222", "C0149", "C0191", "C0198", "C0168", "C0195"]
IDS = [23344, 64664, 74485, 99446, 89992, 52059, 96562, 30618, 20169]

out = io.open(ROOT + r"\tools\probe_e_out.txt", "w", encoding="utf-8")
for key in disp:
    cls = key.split("/")[-1].split(".")[0]
    if cls not in TARGETS:
        continue
    d = disp[key]["dispatchers"]
    for dd in d:
        fn = dd["fn"]
        xor = dd["xor"]
        cases = dd.get("cases", {})
        out.write("=== %s fn=%s xor=%d arity=%d cases=%d\n" % (key, fn, xor, dd.get("arity"), len(cases)))
        for tid in IDS:
            c = tid ^ xor
            ent = cases.get(str(c))
            if ent:
                out.write("  id %d (case %d) -> %s\n" % (tid, c, json.dumps(ent, ensure_ascii=False)[:400]))
out.close()
print("done -> probe_e_out.txt")
