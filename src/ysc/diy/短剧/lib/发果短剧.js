// 发果短剧 www.xzyx168.com（真果鉴"发果"同上游）
// 目录 /xzyxvt/{slug}.html（单页无分页）详情 /xzyxvd/{id}.html
// 播放页 /xzyxvp/{id}n{线路}m{集}.html player_aaaa 直出，站内共 n1/n2 两条线路
// 该站搜索接口不可用，searchable=0
globalThis.faguoAbs = function (u) {
    u = (u || '').trim();
    if (!u) return '';
    return /^https?:\/\//.test(u) ? u : 'https://www.xzyx168.com' + (u.charAt(0) === '/' ? '' : '/') + u;
};
globalThis.faguoCards = function (html, re) {
    let d = [], m, seen = {};
    while ((m = re.exec(html)) && d.length < 30) {
        let link = faguoAbs(m[1]);
        if (seen[link]) continue;
        seen[link] = 1;
        let inner = m[2] || '';
        let tm = /title="([^"]{1,80})"/.exec(m[0]);
        let t = tm ? tm[1] : inner.replace(/<[^>]+>/g, ' ').replace(/\s+/g, ' ').trim();
        if (!t) continue;
        let im = /(?:data-original|data-src|src)="([^"]+\.(?:jpg|jpeg|png|webp|gif)[^"]*)"/i.exec(inner);
        let img = im ? faguoAbs(im[1]) : '';
        let rm = /(?:pic-text|note|module-item-note|public-list-prb|tag)[^"]*"[^>]*>([^<]{1,20})</.exec(inner);
        d.push({ url: link, title: t, img: img, desc: rm ? rm[1].trim() : '' });
    }
    return d;
};
var rule = {
    title: '发果短剧',
    host: 'https://www.xzyx168.com',
    url: '/xzyxvt/fyclass.html?page=fypage',
    searchable: 0,
    quickSearch: 0,
    filterable: 1,
    headers: {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36'
    },
    timeout: 8000,
    class_name: '短剧&电视剧&电影&动漫&综艺',
    class_url: 'duanjun&dianshijun&dianyingn&dongmann&zongyin',
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
        let pg = /page=(\d+)/.exec(input);
        if (pg && parseInt(pg[1]) > 1) {
            setResult([]);
        } else {
            let d = faguoCards(request(encodeURI(input)), /<a\s[^>]*href="([^"]*\/xzyxvd\/\d+\.html)"[^>]*>([\s\S]{0,600}?)<\/a>/g);
            setResult(d);
        }
    }),
    二级: $js.toString(() => {
        let html = request(input);
        let t = (/<h1[^>]*>([^<]{1,80})<\/h1>/.exec(html) || [])[1] || '';
        if (!t) {
            let tm = /<title>([^<]{1,80})<\/title>/.exec(html);
            t = tm ? tm[1].replace(/[-_｜|][^-_｜|]*$/, '').trim() : '';
        }
        let im = /(?:data-original|data-src|src)="([^"]+\.(?:jpg|jpeg|png|webp)[^"]*)"/i.exec(html);
        let img = im ? faguoAbs(im[1]) : '';
        let cm = /(?:name="description"|property="og:description")\s*content="([^"]{1,300})"/.exec(html);
        let lines = {}, order = [], re = /<a\s[^>]*href="([^"]*\/xzyxvp\/\d+n\d+m\d+\.html)"[^>]*>([^<]{0,20})</g, m, seen = {};
        while ((m = re.exec(html))) {
            let lm = /\/xzyxvp\/(\d+)n(\d+)m(\d+)\.html/.exec(m[1]);
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
            lines[sid].push(label + '$' + faguoAbs(m[1]));
        }
        let from = order.map(s => s === '1' ? '发果' : '线路' + s).join('$$$');
        let urls = order.map(s => lines[s].join('#')).join('$$$');
        VOD = {
            vod_name: t,
            vod_pic: img,
            vod_content: cm ? cm[1] : '',
            vod_play_from: from || '发果',
            vod_play_url: urls
        };
    }),
}
