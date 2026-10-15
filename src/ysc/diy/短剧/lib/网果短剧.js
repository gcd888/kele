// 网果短剧 www.duanju2.com（真果鉴"网果"同上游）
// 目录 /show/duanju--------{页}---.html（分类 /show/duanju---{分类}------{页}---.html）
// 详情 /vod/{id}.html 播放页 player_aaaa 直出 /play/{id}-{线路}-{集}.html
// 该站搜索接口不可用，searchable=0
globalThis.wangguoAbs = function (u) {
    u = (u || '').trim();
    if (!u) return '';
    return /^https?:\/\//.test(u) ? u : 'https://www.duanju2.com' + (u.charAt(0) === '/' ? '' : '/') + u;
};
globalThis.wangguoCards = function (html, re) {
    let d = [], m, seen = {};
    while ((m = re.exec(html)) && d.length < 30) {
        let link = wangguoAbs(m[1]);
        if (seen[link]) continue;
        seen[link] = 1;
        let inner = m[2] || '';
        let tm = /title="([^"]{1,80})"/.exec(m[0]);
        let t = tm ? tm[1] : inner.replace(/<[^>]+>/g, ' ').replace(/\s+/g, ' ').trim();
        if (!t) continue;
        let im = /(?:data-original|data-src|src)="([^"]+\.(?:jpg|jpeg|png|webp|gif)[^"]*)"/i.exec(inner);
        let img = im ? wangguoAbs(im[1]) : '';
        let rm = /(?:pic-text|note|module-item-note|public-list-prb|tag)[^"]*"[^>]*>([^<]{1,20})</.exec(inner);
        d.push({ url: link, title: t, img: img, desc: rm ? rm[1].trim() : '' });
    }
    return d;
};
var rule = {
    title: '网果短剧',
    host: 'https://www.duanju2.com',
    url: '/show/fyclassfypage---.html',
    searchable: 0,
    quickSearch: 0,
    filterable: 1,
    headers: {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36'
    },
    timeout: 8000,
    class_name: '全部&女频恋爱&脑洞悬疑&年代穿越&古装仙侠&现代都市&反转&爽文&短剧',
    class_url: 'duanju--------&duanju---女频恋爱------&duanju---脑洞悬疑------&duanju---年代穿越------&duanju---古装仙侠------&duanju---现代都市------&duanju---反转------&duanju---爽文------&duanju---短剧------',
    play_parse: true,
    double: false,
    lazy: $js.toString(() => {
        let html = request(input);
        let u = '';
        let pm = /player_aaaa\s*=\s*(\{[\s\S]*?\})\s*<\/script>/.exec(html);
        if (pm) {
            let um = /"url"\s*:\s*"([^"]+)"/.exec(pm[1]);
            if (um) u = um[1];
        }
        if (!u) {
            let am = /(https?:\/\/[^\s"'<>,]+\.m3u8[^\s"'<>,]*)/.exec(html);
            if (am) u = am[1];
        }
        u = u.replace(/\\\//g, '/').trim();
        input = { url: u, parse: 0 };
    }),
    一级: $js.toString(() => {
        let d = wangguoCards(request(encodeURI(input)), /<a\s[^>]*href="([^"]*\/vod\/\d+\.html)"[^>]*>([\s\S]{0,600}?)<\/a>/g);
        setResult(d);
    }),
    二级: $js.toString(() => {
        let html = request(input);
        let t = (/<h1[^>]*>([^<]{1,80})<\/h1>/.exec(html) || [])[1] || '';
        if (!t) {
            let tm = /<title>([^<]{1,80})<\/title>/.exec(html);
            t = tm ? tm[1].replace(/[-_｜|][^-_｜|]*$/, '').trim() : '';
        }
        let im = /(?:data-original|data-src|src)="([^"]+\.(?:jpg|jpeg|png|webp)[^"]*)"/i.exec(html);
        let img = im ? wangguoAbs(im[1]) : '';
        let cm = /(?:name="description"|property="og:description")\s*content="([^"]{1,300})"/.exec(html);
        let lines = {}, order = [], re = /<a\s[^>]*href="([^"]*\/play\/\d+-\d+-\d+\.html)"[^>]*>([^<]{0,20})</g, m, seen = {};
        while ((m = re.exec(html))) {
            let lm = /\/play\/(\d+)-(\d+)-(\d+)\.html/.exec(m[1]);
            if (!lm) continue;
            let sid = lm[2], ep = parseInt(lm[3]);
            let key = sid + '-' + lm[3];
            if (seen[key]) continue;
            seen[key] = 1;
            let label = m[2].trim() || '第' + ep + '集';
            if (!lines[sid]) {
                lines[sid] = [];
                order.push(sid);
            }
            lines[sid].push(label + '$' + wangguoAbs(m[1]));
        }
        let from = order.map(s => s === '1' ? '网果' : '线路' + s).join('$$$');
        let urls = order.map(s => lines[s].join('#')).join('$$$');
        VOD = {
            vod_name: t,
            vod_pic: img,
            vod_content: cm ? cm[1] : '',
            vod_play_from: from || '网果',
            vod_play_url: urls
        };
    }),
}
