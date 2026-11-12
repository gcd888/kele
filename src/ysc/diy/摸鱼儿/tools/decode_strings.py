# -*- coding: utf-8 -*-
"""
decode_strings.py — 摸鱼儿 jar 反编译源码字符串还原工具

混淆形态（摸鱼儿自研，逆向结论 2026-11-12）：
  1. 每个类持有 1~N 个 `short[] fXXshort = {...}` 字符表（jadx 将 char[] 呈现为 short[]）；
  2. 字符串常量 = `<moyu/merge类>.mNNN(<表字段>, offset, length, key)`，解码 = 逐字符 XOR key
     （已核实 C0235.m623/C0014.m54/C0026.m102/C0117.m467/C0133.m529 等全部同构：
       cArr[i4] = (char) (sArr[offset + i4] ^ key)）；
  3. 少量 `new String(new byte[]{...})`（ASCII 直读）；
  4. `C0195.n(id, obj, args)` 反射调用（方法/字段隐藏，语义还原在移植期人工完成，本工具不处理）。

用法（在本目录执行）：
    python decode_strings.py                     # 全量扫描 raw_base/sources → strings_map.json + readable_sources/
    python decode_strings.py --inline            # 同时重写源码内联字面量（默认开启）
    python decode_strings.py --files App88 Kanqiu   # 只处理指定类（com/github/catvod/spider/<X>.java）

产出：
    ../strings_map.json      文件 → [{expr, value, table, off, len, key}]
    ../readable_sources/     同构源码树，解码调用已替换为 Java 字面量
    控制台统计：每文件解码数 / 未解析（跨类常量无法静态求值）计数
"""
import argparse
import json
import os
import re
import sys

_ROOT = os.path.normpath(os.path.join(os.path.dirname(os.path.abspath(__file__)), ".."))
SRC_DIR = os.path.join(_ROOT, "raw_base", "sources")
OUT_MAP = os.path.join(_ROOT, "strings_map.json")
OUT_TREE = os.path.join(_ROOT, "readable_sources")

# short[] 表定义：short[] f7short = {1458, 2183, ...}（单行巨表或多行）
TABLE_RE = re.compile(r"short\[\]\s+(\w+)\s*=\s*\{([\d\-\s,]+?)\}")
# 解码调用前缀：<Cls>.mNNN(<ident>, —— ident 必须是本文件已知表名（后置校验）
CALL_HEAD_RE = re.compile(r"([A-Z]\w+)\.(m\d+)\(\s*(\w+)\s*,")
# new String(new byte[]{...})（ASCII）
NEWSTR_RE = re.compile(r"new String\(new byte\[\]\{([\d\-\s,]+?)\}\)")
# 跨类常量字段：static final int f198 = 42; / int f198 = 42;
CONST_RE = re.compile(r"(?:final\s+)?int\s+(f\d+)\s*=\s*(-?\d+)")
CLASS_DECL_RE = re.compile(r"public class (\w+)")


def build_const_map(src_root):
    """全局常量表：C00xx.fNNN → 值（jadx 常量字段提升，跨类引用求值用）。"""
    consts = {}
    for root, _, files in os.walk(src_root):
        for fn in files:
            if not fn.endswith(".java"):
                continue
            p = os.path.join(root, fn)
            try:
                with open(p, encoding="utf-8") as f:
                    src = f.read()
            except OSError:
                continue
            m = CLASS_DECL_RE.search(src)
            if not m:
                continue
            cls = m.group(1)
            for cm in CONST_RE.finditer(src):
                consts.setdefault(cls + "." + cm.group(1), int(cm.group(2)))
    return consts


def eval_arg(expr, consts, fname):
    """求值解码实参（offset/length/key）：字面量 / Integer.valueOf(x) / A^B / A+B / A-B / 常量字段引用。"""
    e = expr.strip()
    m = re.fullmatch(r"Integer\.valueOf\((.*)\)", e, re.S)
    if m:
        e = m.group(1).strip()
    m = re.fullmatch(r"\(int\)\s*(.*)", e, re.S)
    if m:
        e = m.group(1).strip()
    # 常量字段引用 → 值
    def sub_const(mm):
        key = mm.group(1) + "." + mm.group(2)
        return str(consts[key]) if key in consts else mm.group(0)
    e2 = re.sub(r"\b([A-Z]\w+)\.(f\d+)\b", sub_const, e)
    if e2 != e:
        e = e2
    # 仅剩整数与 ^ + - 的表达式
    if re.fullmatch(r"-?\d+", e):
        return int(e)
    if re.fullmatch(r"[\d\s^+\-]+", e):
        try:
            return int(eval(e, {"__builtins__": {}}, {}))
        except Exception:
            return None
    return None


def decode_call(text, start, consts):
    """从 CALL_HEAD_RE 匹配位置解析完整调用并解码；返回 (value, end_pos, meta) 或 (None, ...)。"""
    head = CALL_HEAD_RE.match(text, start)
    if not head:
        return None
    # 括号配平，切出前 4 个顶层参数
    i = text.index("(", start) + 1
    depth, args, cur = 1, [], []
    while i < len(text) and depth > 0:
        c = text[i]
        if c in "([{":
            depth += 1
        elif c in ")]}":
            depth -= 1
            if depth == 0:
                args.append("".join(cur).strip())
                break
        if c == "," and depth == 1:
            args.append("".join(cur).strip())
            cur = []
            i += 1
            continue
        cur.append(c)
        i += 1
    end = i + 1
    if len(args) != 4:
        return None
    tbl, off_e, len_e, key_e = args
    return tbl, off_e, len_e, key_e, end


def process_file(path, rel, consts):
    """处理单个 java 文件：返回 (entries, rewritten_src)。"""
    with open(path, encoding="utf-8") as f:
        src = f.read()
    tables = {}
    for m in TABLE_RE.finditer(src):
        vals = [int(x) for x in m.group(2).replace("\n", " ").split(",") if x.strip()]
        tables[m.group(1)] = vals

    entries = []
    # 收集所有解码调用（含位置）
    spans = []
    for m in CALL_HEAD_RE.finditer(src):
        parsed = decode_call(src, m.start(), consts)
        if not parsed:
            continue
        tbl_name, off_e, len_e, key_e, end = parsed
        if tbl_name not in tables:
            continue
        off = eval_arg(off_e, consts, rel)
        ln = eval_arg(len_e, consts, rel)
        key = eval_arg(key_e, consts, rel)
        if off is None or ln is None or key is None or off < 0 or ln <= 0:
            entries.append({"expr": src[m.start():end], "value": None,
                            "table": tbl_name, "off": off_e, "len": len_e, "key": key_e})
            continue
        tbl = tables[tbl_name]
        if off + ln > len(tbl):
            entries.append({"expr": src[m.start():end], "value": None,
                            "table": tbl_name, "off": off, "len": ln, "key": key, "err": "range"})
            continue
        value = "".join(chr((tbl[off + i] ^ key) & 0xFFFF) for i in range(ln))
        spans.append((m.start(), end, value))
        entries.append({"expr": src[m.start():end], "value": value,
                        "table": tbl_name, "off": off, "len": ln, "key": key})
    # new String(new byte[]{...}) ASCII
    for m in NEWSTR_RE.finditer(src):
        try:
            bs = [int(x) for x in m.group(1).replace("\n", " ").split(",") if x.strip()]
            value = bytes(b & 0xFF for b in bs).decode("ascii")
        except Exception:
            continue
        spans.append((m.start(), m.end(), value))
        entries.append({"expr": m.group(0)[:120], "value": value, "table": "(bytes)"})

    # 内联重写（仅完整解码的 span，从后往前替换）
    out = src
    for st, ed, val in sorted(spans, key=lambda x: -x[0]):
        lit = val.replace("\\", "\\\\").replace('"', '\\"').replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t")
        out = out[:st] + '"' + lit + '"' + out[ed:]
    return entries, out


def main():
    ap = argparse.ArgumentParser(description="摸鱼儿反编译源码字符串还原")
    ap.add_argument("--files", nargs="*", help="仅处理指定类名（spider 目录下 <Name>.java）")
    ap.add_argument("--no-inline", action="store_true", help="跳过 readable_sources 重写")
    args = ap.parse_args()

    targets = []
    for root, _, files in os.walk(SRC_DIR):
        for fn in files:
            if not fn.endswith(".java"):
                continue
            rel = os.path.relpath(os.path.join(root, fn), SRC_DIR)
            if args.files:
                if not (rel.startswith("com/github/catvod/spider") and os.path.splitext(fn)[0] in args.files):
                    continue
            targets.append((rel, os.path.join(root, fn)))
    print("[1/3] 常量表扫描…")
    consts = build_const_map(SRC_DIR)
    print("  常量字段:", len(consts))
    print("[2/3] 解码 %d 个文件…" % len(targets))
    all_map = {}
    total, ok, unresolved = 0, 0, 0
    for rel, path in sorted(targets):
        entries, out = process_file(path, rel, consts)
        all_map[rel] = entries
        n_ok = sum(1 for e in entries if e["value"] is not None)
        n_bad = len(entries) - n_ok
        total += len(entries)
        ok += n_ok
        unresolved += n_bad
        if entries and not args.no_inline:
            dst = os.path.join(OUT_TREE, rel)
            os.makedirs(os.path.dirname(dst), exist_ok=True)
            # 表 XOR 可能产生代理对半字符（Java char 合法成对，Python str 单个无法 utf-8 编码）→ surrogatepass 原样落盘
            with open(dst, "w", encoding="utf-8", errors="surrogatepass") as f:
                f.write(out)
        if n_ok or n_bad:
            print("  %-52s decode=%-4d unresolved=%d" % (rel.replace("\\", "/"), n_ok, n_bad))
    print("[3/3] 输出 strings_map.json")
    # ensure_ascii=True：\udXXX 转义合法 JSON，保留代理对半字符
    with open(OUT_MAP, "w", encoding="utf-8") as f:
        json.dump(all_map, f, ensure_ascii=True, indent=1)
    print("总计: 调用=%d 解码=%d 未解析=%d (%.1f%%)" % (total, ok, unresolved, 100.0 * ok / max(1, total)))
    print("产物: %s%s" % (OUT_MAP, "" if args.no_inline else " + " + OUT_TREE))


if __name__ == "__main__":
    main()
