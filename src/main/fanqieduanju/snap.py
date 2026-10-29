# -*- coding: utf-8 -*-
# 抓模拟器屏幕（subprocess 二进制安全）
import subprocess, sys

out = sys.argv[1] if len(sys.argv) > 1 else 'screen.png'
data = subprocess.run(['adb', '-s', 'emulator-5554', 'exec-out', 'screencap', '-p'],
                      capture_output=True).stdout
with open(out, 'wb') as f:
    f.write(data)
print('saved', out, len(data), 'bytes')
