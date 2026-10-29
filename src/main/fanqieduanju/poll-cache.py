# -*- coding: utf-8 -*-
# 轮询 gitcode raw 缓存刷新：直到合集 json 内 fanqieduanju md5 变为 23a242038352c0f82995d4f1b006bedc
import ssl
import time
import urllib.request

URL = ('https://gitcode.com/api/v5/repos/gcd888/guoju-api/raw/'
       '%E7%9F%AD%E5%89%A7%E5%90%88%E9%9B%86/%E7%9F%AD%E5%89%A7%E5%90%88%E9%9B%86.json?ref=main')
TARGET = '23a242038352c0f82995d4f1b006bedc'
ctx = ssl.create_default_context()
ctx.check_hostname = False
ctx.verify_mode = ssl.CERT_NONE

for i in range(20):
    try:
        body = urllib.request.urlopen(URL, timeout=20, context=ctx).read().decode('utf-8', 'ignore')
        if TARGET in body:
            print(f'[poll {i}] CACHE REFRESHED md5={TARGET}')
            raise SystemExit(0)
        print(f'[poll {i}] still old')
    except SystemExit:
        raise
    except Exception as e:
        print(f'[poll {i}] err {e}')
    time.sleep(45)
print('CACHE NOT REFRESHED in 15min')
raise SystemExit(2)
