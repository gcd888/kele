/**
 * run.mjs — node 桌面自测入口
 *
 * 用法：
 *   node run.mjs <spider相对路径> <动作> [参数...]
 *
 * 动作：
 *   home [filter]                          → init + home (+homeVod)
 *   category <tid> [pg] [extJson]          → category
 *   detail <id>                            → detail
 *   search <wd>                            → search
 *   play <flag> <id>                       → play
 *   action <json>                          → action（cloud.* 协议自测）
 *   all <searchWd>                         → home→category→detail→search→play 串测
 *
 * 示例：
 *   node run.mjs ../spider/haimajuchang.js all 离婚
 *   node run.mjs ../spider/qingguoduanju.js action {"do":"cloud.info"}
 */

import { loadSpider, mustJson, resetLocal } from './host.mjs';

const [, , spiderPath, action, ...args] = process.argv;
if (!spiderPath || !action) {
    console.error('用法: node run.mjs <spider相对路径> <home|category|detail|search|play|action|all> [参数...]');
    process.exit(1);
}

const ext = process.env.GUOJU_EXT || '';

function printJson(label, obj) {
    console.log('===== ' + label + ' =====');
    console.log(JSON.stringify(obj, null, 2));
}

const sp = await loadSpider(spiderPath);

async function safe(label, fn) {
    try {
        const ret = await fn();
        if (ret === undefined || ret === null) { console.log('===== ' + label + ' ===== (null)'); return null; }
        try { printJson(label, mustJson(ret, label)); return JSON.parse(ret); }
        catch (e) { console.log('===== ' + label + '（非JSON字符串）====='); console.log(String(ret).slice(0, 2000)); return ret; }
    } catch (e) {
        console.error('===== ' + label + ' 抛错 =====');
        console.error(e && e.stack || e);
        return null;
    }
}

await safe('init', () => sp.init(ext));

if (action === 'home') {
    await safe('home', () => sp.home(true));
    await safe('homeVod', () => sp.homeVod());
} else if (action === 'category') {
    await safe('category tid=' + args[0] + ' pg=' + (args[1] || '1'), () => sp.category(args[0], args[1] || '1', true, {}));
} else if (action === 'detail') {
    await safe('detail id=' + args[0], () => sp.detail(args[0]));
} else if (action === 'search') {
    await safe('search wd=' + args[0], () => sp.search(args[0], false));
} else if (action === 'play') {
    await safe('play flag=' + args[0] + ' id=' + args[1], () => sp.play(args[0], args[1], []));
} else if (action === 'action') {
    await safe('action ' + args[0], () => sp.action(args[0]));
} else if (action === 'all') {
    const home = await safe('home', () => sp.home(true));
    await safe('homeVod', () => sp.homeVod());
    let tid = null;
    if (home && home.class && home.class.length) {
        tid = home.class[0].type_id;
        await safe('category tid=' + tid + ' pg=1', () => sp.category(tid, '1', true, {}));
    }
    const wd = args[0];
    if (wd) {
        const sr = await safe('search wd=' + wd, () => sp.search(wd, false));
        if (sr && sr.list && sr.list.length) {
            const first = sr.list[0];
            const det = await safe('detail id=' + first.vod_id, () => sp.detail(String(first.vod_id)));
            if (det && det.list && det.list.length) {
                const v = det.list[0];
                if (v.vod_play_from && v.vod_play_url) {
                    const flag = String(v.vod_play_from).split('$$$')[0];
                    const firstEp = String(v.vod_play_url).split('$$$')[0].split('#')[0];
                    const epId = firstEp.includes('$') ? firstEp.split('$')[1] : firstEp;
                    await safe('play flag=' + flag + ' id=' + epId, () => sp.play(flag, epId, []));
                }
            }
        }
    }
}

console.log('===== done =====');
process.exit(0);
