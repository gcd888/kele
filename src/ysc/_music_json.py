# -*- coding: utf-8 -*-
# 果果音乐.json 重写：7 源（聚合 luoxueyinyue + 六谐音 luoxueyinyue_*）
import io
import json

MD5 = '73f1b1cc27824147916667a72c3d4361'
JAR = './lib/luoxueyinyue-spider.jar;md5;' + MD5


def src(key, name, api):
    return {'key': key, 'name': name, 'type': 3, 'api': api, 'jar': JAR,
            'searchable': 1, 'quickSearch': 1, 'filterable': 1, 'changeable': 1,
            'playerType': 2, 'timeout': 45, 'style': 'music'}


out = {'musics': [
    src('luoxueyinyue', '❄️落雪音乐', 'csp_Luoxueyinyue'),
    src('luoxueyinyue_yun', '☁️果果芸', 'csp_LuoxueyinyueYun'),
    src('luoxueyinyue_gou', '🐶果果枸', 'csp_LuoxueyinyueGou'),
    src('luoxueyinyue_qiu', '🐧果果秋', 'csp_LuoxueyinyueQiu'),
    src('luoxueyinyue_wo', '🐌果果蜗', 'csp_LuoxueyinyueWo'),
    src('luoxueyinyue_shui', '🥤果果水', 'csp_LuoxueyinyueShui'),
    src('luoxueyinyue_mi', '🎤果果蜜', 'csp_LuoxueyinyueMi'),
]}
io.open(r'e:\HelloWorld\project\kele\src\guoju-api\果果音乐\果果音乐.json', 'w', encoding='utf-8', newline='').write(
    json.dumps(out, ensure_ascii=False, indent='\t'))
print('musics:', len(out['musics']))
