# -*- coding: utf-8 -*-
# 音乐源合并：guoguoyinyue -> luoxueyinyue（并入洛雪取流），删除 luoxue/huanleyinyue 工程
import io
import os
import shutil

MAIN = r'e:\HelloWorld\project\kele\src\main'

# 1. git mv 由外部执行；这里做内容改造
ROOT = os.path.join(MAIN, 'luoxueyinyue')
SP = os.path.join(ROOT, 'src', 'com', 'github', 'catvod', 'spider')
MUS = os.path.join(SP, 'music')

# 1a. 洛雪两文件移入（从 luoxue 工程拷）
for f in ('LuoxueApi.java', 'LuoxueSpiderBase.java'):
    shutil.copyfile(os.path.join(MAIN, 'luoxue', 'src', 'com', 'github', 'catvod', 'spider', 'music', f),
                    os.path.join(MUS, f))
    print('copied', f)

# 1b. 主类与薄壳改名 + 继承调整
RENAME = [
    ('Guoguoyinyue', 'Luoxueyinyue'),           # 聚合 all 源
    ('GuoguoyinyueYun', 'LuoxueyinyueYun'),
    ('GuoguoyinyueQiu', 'LuoxueyinyueQiu'),
    ('GuoguoyinyueGou', 'LuoxueyinyueGou'),
    ('GuoguoyinyueWo', 'LuoxueyinyueWo'),
    ('GuoguoyinyueShui', 'LuoxueyinyueShui'),
    ('GuoguoyinyueMi', 'LuoxueyinyueMi'),
]
for old, new in RENAME:
    p = os.path.join(SP, old + '.java')
    d = os.path.join(SP, new + '.java')
    if not os.path.exists(p):
        if os.path.exists(d):
            p = d  # git mv 已改名，仅做内容替换
        else:
            print('skip missing', old)
            continue
    t = io.open(p, encoding='utf-8').read()
    t = t.replace('class ' + old, 'class ' + new).replace(old, new)
    # 五平台薄壳（非汽水/非聚合）改继承洛雪骨架：洛雪聚合 API 优先取流
    if new in ('LuoxueyinyueYun', 'LuoxueyinyueQiu', 'LuoxueyinyueGou', 'LuoxueyinyueWo', 'LuoxueyinyueMi'):
        t = t.replace('extends MusicSpiderBase', 'extends LuoxueSpiderBase')
        t = t.replace('import com.github.catvod.spider.music.MusicSpiderBase;',
                      'import com.github.catvod.spider.music.LuoxueSpiderBase;')
    io.open(d, 'w', encoding='utf-8', newline='').write(t)
    if os.path.abspath(p) != os.path.abspath(d):
        os.remove(p)
    print('renamed', old, '->', new)

# 1c. 聚合源注释更新
p = os.path.join(SP, 'Luoxueyinyue.java')
t = io.open(p, encoding='utf-8').read()
t = t.replace('果果音乐', '落雪音乐')
io.open(p, 'w', encoding='utf-8', newline='').write(t)

# 1d. proguard.rules keep 改名
p = os.path.join(ROOT, 'proguard.rules')
t = io.open(p, encoding='utf-8').read()
t = t.replace('Guoguoyinyue*', 'Luoxueyinyue*')
t = t.replace('（Netease/Qq/Kugou/Soda/Kuwo/Migu）', '（聚合+五平台洛雪取流+汽水官方）')
io.open(p, 'w', encoding='utf-8', newline='').write(t)

# 1e. build.ps1：恢复单目录编译（music 包已在自家 src）+ jar 改名
p = os.path.join(ROOT, 'build.ps1')
t = io.open(p, encoding='utf-8-sig').read()
import re
t = re.sub(r'\$srcDirs = @[^\n]+', '$srcDirs = @((Join-Path $root "src"), (Join-Path $root "stub"))', t, count=1)
t = t.replace('guoguoyinyue-spider.jar', 'luoxueyinyue-spider.jar')
t = t.replace('果果音乐.json ref: ./lib/guoguoyinyue-spider.jar', '果果音乐.json ref: ./lib/luoxueyinyue-spider.jar')
t = t.replace('Build guoguoyinyue (music) spider jar', 'Build luoxueyinyue (music) spider jar — MusicCore 官方链路 + 洛雪聚合取流')
io.open(p, 'w', encoding='utf-8-sig').write(t)
print('build.ps1 updated')

# 2. 删除旧工程目录（luoxue 的两个 Java 已拷走；huanleyinyue 整体不要）
for d in ('luoxue', 'huanleyinyue'):
    shutil.rmtree(os.path.join(MAIN, d), ignore_errors=True)
    print('removed dir', d)

# 3. guoju-api：删旧 jar
for jf in ('luoxue-spider.jar', 'huanleyinyue-spider.jar'):
    p = os.path.join(r'e:\HelloWorld\project\kele\src\guoju-api\果果音乐\lib', jf)
    if os.path.exists(p):
        os.remove(p)
        print('removed jar', jf)
print('DONE')
