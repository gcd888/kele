// 花果短剧 www.zywest263.com（真果鉴"花果"同上游）
// 目录 /search.html?page=&searchtype=5&tid=27 详情 /zywview/{id}.html
// 播放页无 player_aaaa，直链 m3u8 内嵌在 mui-player 构造脚本中
globalThis.huaguoAbs = function (u) {
    u = (u || '').trim();
    if (!u) return '';
    return /^https?:\/\//.test(u) ? u : 'https://www.zywest263.com' + (u.charAt(0) === '/' ? '' : '/') + u;
};
globalThis.huaguoCards = function (html, re) {
    let d = [], m, seen = {};
    while ((m = re.exec(html)) && d.length < 30) {
        let link = huaguoAbs(m[1]);
        if (seen[link]) continue;
        seen[link] = 1;
        let inner = m[2] || '';
        let tm = /title="([^"]{1,80})"/.exec(m[0]);
        let t = tm ? tm[1] : inner.replace(/<[^>]+>/g, ' ').replace(/\s+/g, ' ').trim();
        if (!t) continue;
        let im = /(?:data-original|data-src|src)="([^"]+\.(?:jpg|jpeg|png|webp|gif)[^"]*)"/i.exec(inner);
        let img = im ? huaguoAbs(im[1]) : '';
        let rm = /(?:pic-text|note|module-item-note|public-list-prb)[^"]*"[^>]*>([^<]{1,20})</.exec(inner);
        d.push({ url: link, title: t, img: img, desc: rm ? rm[1].trim() : '' });
    }
    return d;
};
var rule = {
    title: '花果短剧',
    host: 'https://www.zywest263.com',
    url: '/search.html?page=fypage&searchtype=5&tid=fyclass&year=',
    searchable: 1,
    quickSearch: 0,
    filterable: 1,
    headers: {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36'
    },
    timeout: 8000,
    class_name: '短剧',
    class_url: '27',
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
        let d = huaguoCards(request(encodeURI(input)), /<a\s[^>]*href="([^"]*\/zywview\/\d+\.html)"[^>]*>([\s\S]{0,600}?)<\/a>/g);
        setResult(d);
    }),
    二级: $js.toString(() => {
        let html = request(input);
        let t = (/<h1[^>]*>([^<]{1,80})<\/h1>/.exec(html) || [])[1] || '';
        if (!t) {
            let om = /property="og:title"\s*content="([^"]{1,80})"/.exec(html);
            t = om ? om[1] : '';
        }
        if (!t) {
            let tm = /<title>([^<]{1,80})<\/title>/.exec(html);
            t = tm ? tm[1].replace(/[-_｜|][^-_｜|]*$/, '').trim() : '';
        }
        let im = /(?:data-original|data-src|src)="([^"]+\.(?:jpg|jpeg|png|webp)[^"]*)"/i.exec(html);
        let img = im ? huaguoAbs(im[1]) : '';
        let cm = /(?:name="description"|property="og:description")\s*content="([^"]{1,300})"/.exec(html);
        let eps = [], seen = {}, re = /<a\s[^>]*href="([^"]*\/zywplay\/\d+-\d+-\d+\.html)"[^>]*>([^<]{0,20})</g, m;
        while ((m = re.exec(html))) {
            let label = m[2].trim();
            if (/秒播|备用|云播/.test(label)) continue;
            if (seen[m[1]]) continue;
            seen[m[1]] = 1;
            eps.push((label || '第' + (eps.length + 1) + '集') + '$' + huaguoAbs(m[1]));
        }
        VOD = {
            vod_name: t,
            vod_pic: img,
            vod_content: cm ? cm[1] : '',
            vod_play_from: '花果',
            vod_play_url: eps.join('#')
        };
    }),
    搜索: $js.toString(() => {
        let html = request(encodeURI(rule.host + '/index.php/vod/search/wd/' + KEY + '.html'));
        let d = huaguoCards(html, /<a\s[^>]*href="([^"]*\/zywview\/\d+\.html)"[^>]*>([\s\S]{0,600}?)<\/a>/g);
        setResult(d);
    }),
}
