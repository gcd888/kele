# -*- coding: utf-8 -*-
"""
resolve_dispatchers.py — 摸鱼儿混淆分发器还原工具（第二步，配合 decode_strings.py）

混淆形态：moyu.fucking / merge 包中的分发器类持有巨型 switch（`switch (K ^ id)`），
case 体经 C0145.m583(cls, method, ret, params...)（反射 Method）/ C0145.m582（Field）/
mNNN(table, off, len, key)（XOR 字符串）返回目标。业务代码全部形如 `C0xxx.n(id[, obj[, args]])`。

本工具：
  1. 扫描分发器类 → 提取 (类, 分发方法, 参数个数, XOR 常量) 与 case → 目标映射 → dispatchers.json
  2. annotate 模式：对目标源码的每个分发调用追加 `/*=> 目标 */` 注释，生成 annotated_sources/

用法：
    python resolve_dispatchers.py                 # 全量建映射
    python resolve_dispatchers.py --annotate FishCrypto InitOrigin   # 对指定类生成注释版
"""
import argparse
import json
import os
import re

_ROOT = os.path.normpath(os.path.join(os.path.dirname(os.path.abspath(__file__)), ".."))
SRC_DIR = os.path.join(_ROOT, "raw_base", "sources")
OUT_JSON = os.path.join(_ROOT, "dispatchers.json")
OUT_TREE = os.path.join(_ROOT, "annotated_sources")

TABLE_RE = re.compile(r"short\[\]\s+(\w+)\s*=\s*\{([\d\-\s,]+?)\}")
BYTES_RE = re.compile(r"new String\(new byte\[\]\{([\d\-\s(),a-zA-Z]+?)\}\)")
DISPATCH_FN_RE = re.compile(
    r"public static Object (\w+)\(int var\d+(?:,\s*Object var\d+)?(?:,\s*Object\[\] var\d+)?\)\s*(?:throws Throwable\s*)?\{")
SWITCH_RE = re.compile(r"switch \((\d+) \^ var\d+\)")
CASE_RE = re.compile(r"case (-?\d+):")
CLASS_DECL_RE = re.compile(r"public (?:final )?class (\w+)")


def bytes_args(expr):
    """提取表达式中全部 new String(new byte[]{...}) 并按 UTF-8 解码（jadx 字节含 UTF-8 多字节序列）。"""
    out = []
    for m in BYTES_RE.finditer(expr):
        raw = [int(x) for x in re.findall(r"-?\d+", m.group(1))]
        bs = bytes(b & 0xFF for b in raw)
        try:
            out.append(bs.decode("utf-8"))
        except UnicodeDecodeError:
            out.append(bs.decode("latin-1"))
    return out


def parse_dispatcher(src, m_fn, cls_name, tables):
    """解析一个分发函数（括号感知切分 depth-1 case）：返回 {id: target}。"""
    fn_name = m_fn.group(1)
    arity = m_fn.group(0).count(",") + 1
    seg_start = m_fn.end()
    nxt = DISPATCH_FN_RE.search(src, seg_start)
    body = src[seg_start: nxt.start() if nxt else len(src)]
    ms = SWITCH_RE.search(body)
    if not ms:
        return None
    k = int(ms.group(1))
    # 括号感知：从 switch 体起点跟踪深度，收集 depth==1 的 case 标签
    open_brace = body.index("{", ms.end() - 1)
    depth, i, case_marks, end_of_switch = 0, open_brace, [], len(body)
    while i < len(body):
        c = body[i]
        if c == "{":
            depth += 1
        elif c == "}":
            depth -= 1
            if depth == 0:
                end_of_switch = i
                break
        elif depth == 1 and body.startswith("case", i):
            m2 = re.match(r"case (-?\d+):", body[i:])
            if m2:
                # 还原真实 id：case 值 ^ 分发函数 XOR 常量
                case_marks.append((i + m2.end(), i + m2.end(), int(m2.group(1)) ^ k))
        i += 1
    result = {}
    for idx, (_, ce, cid) in enumerate(case_marks):
        start = ce
        end = case_marks[idx + 1][0] if idx + 1 < len(case_marks) else end_of_switch
        chunk = body[start:end]
        em = re.search(r"object\s*=\s*(.*?);", chunk, re.S)
        expr = em.group(1).strip() if em else chunk.strip()
        byte_strs = bytes_args(expr)
        if "m583(" in expr:
            if len(byte_strs) >= 2:
                result[cid] = {"kind": "method", "cls": byte_strs[0], "method": byte_strs[1],
                               "sig": ".".join(byte_strs[2:])}
            else:
                result[cid] = {"kind": "method?", "raw": expr[:160]}
        elif "m582(" in expr:
            if len(byte_strs) >= 2:
                result[cid] = {"kind": "field", "cls": byte_strs[0], "field": byte_strs[1]}
            else:
                result[cid] = {"kind": "field?", "raw": expr[:160]}
        else:
            dm = re.match(r"\(?short\[\]\)?\s*(?:\(\w+\)\s*)?([A-Z]\w+)\.m\d+\(\s*(\w+)\s*,", expr)
            if dm and dm.group(2) in tables:
                am = re.search(r"\{\s*(\w+)\s*,\s*([^,]+),\s*([^,]+),\s*([^}]+?)\}", expr)
                if am:
                    tbl = tables.get(am.group(1), [])
                    try:
                        off = int(eval(re.sub(r"Integer\.valueOf|\(|\)", "", am.group(2))))
                        ln = int(eval(re.sub(r"Integer\.valueOf|\(|\)", "", am.group(3))))
                        key = int(eval(re.sub(r"Integer\.valueOf|\(|\)", "", am.group(4))))
                        val = "".join(chr((tbl[off + j] ^ key) & 0xFFFF) for j in range(ln)) if off + ln <= len(tbl) else None
                        if val is not None:
                            result[cid] = {"kind": "string", "value": val}
                            continue
                    except Exception:
                        pass
            result[cid] = {"kind": "raw", "raw": expr[:200]}
    return {"fn": fn_name, "arity": arity, "xor": k, "cases": result}


def scan_dispatchers():
    """扫描全库分发器类 → dispatchers.json。"""
    out = {}
    for root, _, files in os.walk(SRC_DIR):
        for fn in files:
            if not fn.endswith(".java"):
                continue
            p = os.path.join(root, fn)
            with open(p, encoding="utf-8", errors="surrogatepass") as f:
                src = f.read()
            cm = CLASS_DECL_RE.search(src)
            if not cm:
                continue
            tables = {m.group(1): [int(x) for x in m.group(2).replace("\n", " ").split(",") if x.strip()]
                      for m in TABLE_RE.finditer(src)}
            fns = []
            for m_fn in DISPATCH_FN_RE.finditer(src):
                d = parse_dispatcher(src, m_fn, cm.group(1), tables)
                if d and d["cases"]:
                    fns.append(d)
            if fns:
                rel = os.path.relpath(p, SRC_DIR).replace("\\", "/")
                out[rel] = {"class": cm.group(1), "dispatchers": fns}
    with open(OUT_JSON, "w", encoding="utf-8") as f:
        json.dump(out, f, ensure_ascii=True)
    n_cases = sum(len(d["cases"]) for v in out.values() for d in v["dispatchers"])
    print("分发器类=%d 分发函数=%d case 总数=%d" % (len(out), sum(len(v["dispatchers"]) for v in out.values()), n_cases))
    return out


def load_index(data):
    """扁平索引：(分发器简单类名, arity) → {id: target}。JSON 往返后 case 键为字符串，统一转 int。"""
    idx = {}
    for rel, v in data.items():
        cls = v["class"]
        for d in v["dispatchers"]:
            key = (cls, d["arity"])
            cases = {int(k): val for k, val in d["cases"].items()}
            if key in idx:
                idx[key].update(cases)
            else:
                idx[key] = cases
    return idx


def find_call_end(text, open_idx):
    """从 '(' 起括号配平，返回 end（右括号后一位）。"""
    depth, i = 1, open_idx + 1
    while i < len(text) and depth > 0:
        c = text[i]
        if c in "([{":
            depth += 1
        elif c in ")]}":
            depth -= 1
        i += 1
    return i


def annotate_file(path, idx):
    """对目标文件标注分发调用：C0xxx.nNN(id,...) 后追加 /*=> 目标 */。"""
    with open(path, encoding="utf-8", errors="surrogatepass") as f:
        src = f.read()
    pat = re.compile(r"\b([A-Z]\w+)\.n\((\d+)\s*,?")
    spans = []
    for m in pat.finditer(src):
        cls, cid = m.group(1), int(m.group(2))
        end = find_call_end(src, m.end() - 1)
        # 参数个数 = 顶层逗号数 + 1
        inner = src[m.end():end - 1]
        depth, commas = 0, 0
        for c in inner:
            if c in "([{":
                depth += 1
            elif c in ")]}":
                depth -= 1
            elif c == "," and depth == 0:
                commas += 1
        arity = commas + 1
        tgt = idx.get((cls, arity), {}).get(cid)
        if not tgt:
            continue
        kind = tgt.get("kind")
        if kind == "method":
            label = "%s.%s(%s)" % (tgt["cls"].split(".")[-1], tgt["method"], tgt.get("sig", ""))
        elif kind == "field":
            label = "%s.%s" % (tgt["cls"].split(".")[-1], tgt["field"])
        elif kind == "string":
            v = tgt["value"].replace("\\", "\\\\").replace("*/", "*\\/").replace("\n", "\\n")
            label = '"%s"' % (v[:120] + ("…" if len(v) > 120 else ""))
        else:
            label = "%s:%s" % (kind, tgt.get("raw", "")[:100])
        spans.append((end, " /*=> %s*/" % label))
    out = src
    for st, ins in sorted(spans, key=lambda x: -x[0]):
        out = out[:st] + ins + out[st:]
    return out, len(spans)


def main():
    ap = argparse.ArgumentParser(description="摸鱼儿分发器还原 + 调用注释")
    ap.add_argument("--annotate", nargs="*", help="对 spider 目录指定类生成注释版（缺省全量 spider 目录）")
    args = ap.parse_args()
    if not os.path.isfile(OUT_JSON):
        print("[1/2] 扫描分发器…")
        data = scan_dispatchers()
    else:
        print("[1/2] 载入既有 dispatchers.json")
        with open(OUT_JSON, encoding="utf-8") as f:
            data = json.load(f)
    idx = load_index(data)
    print("[2/2] 标注 spider 调用…")
    spider_dir = os.path.join(SRC_DIR, "com", "github", "catvod", "spider")
    total = 0
    for fn in sorted(os.listdir(spider_dir)):
        if not fn.endswith(".java"):
            continue
        name = os.path.splitext(fn)[0]
        if args.annotate and name not in args.annotate:
            continue
        out, n = annotate_file(os.path.join(spider_dir, fn), idx)
        dst = os.path.join(OUT_TREE, "com", "github", "catvod", "spider", fn)
        os.makedirs(os.path.dirname(dst), exist_ok=True)
        with open(dst, "w", encoding="utf-8", errors="surrogatepass") as f:
            f.write(out)
        total += n
        if n:
            print("  %-40s 标注=%d" % (fn, n))
    print("总标注=%d 产物=%s" % (total, OUT_TREE))


if __name__ == "__main__":
    main()
