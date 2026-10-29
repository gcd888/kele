# -*- coding: utf-8 -*-
# 列出 UI dump 的文本节点坐标
import re

s = open('ui.xml', encoding='utf-8').read()
for m in re.finditer(r'text="([^"]{1,10})"[^>]*bounds="(\[[^"]+\])"', s):
    print(m.group(1), m.group(2))
