# -*- coding: utf-8 -*-
# 列出 UI dump 全部带文本节点：text + bounds（不限属性顺序）
import io
import re

s = open('ui.xml', encoding='utf-8').read()
out = []
for m in re.finditer(r'text="([^"]+)"', s):
    seg = s[m.start():m.start() + 900]
    b = re.search(r'bounds="(\[[^\"]+\])"', seg)
    if b:
        out.append(m.group(1) + ' ' + b.group(1))
io.open('nodes.txt', 'w', encoding='utf-8').write('\n'.join(out))
print(len(out), 'nodes')
