
var rule = {
    title: '爱你短剧',
    host: 'https://www.ainidj.com',
    url: '/vodtype/fyclass-fypage.html',
    searchUrl: '/vodsearch/**----------fypage---.html',
    searchable: 2,
    quickSearch: 1,
    filterable: 0,
    class_parse: '.nav-menu-items&&li;a&&Text;a&&href;.*/(.*?).html',
    play_parse: true,
    lazy: $js.toString(() => {
        if (input.includes("pan.quark.cn")) {
            input = "push://" + input;

        } else {
            var html = JSON.parse(request(input).match(/r player_.*?=(.*?)</)[1]);
            var url = html.url;
            if (html.encrypt == '1') {
                url = unescape(url)
            } else if (html.encrypt == '2') {
                url = unescape(base64Decode(url))
            }
            if (/\.m3u8|\.mp4/.test(url)) {
                input = {
                    jx: 0,
                    url: url,
                    parse: 0
                }
            } else {
                input
            }
        }
    }),
    limit: 6,
    推荐: '.module-list;.module-items&&.module-item;a&&title;img&&data-src;.module-item-text&&Text;a&&href',
    double: true,
    一级: '.module-items .module-item;a&&title;img&&data-src;.module-item-text&&Text;a&&href',
    二级: {
        title: 'h1&&Text;.tag-link&&Text',
        img: '.module-item-pic&&img&&data-src',
        desc: '.video-info-items:eq(0)&&Text;.video-info-items:eq(1)&&Text;.video-info-items:eq(2)&&Text;.video-info-items:eq(3)&&Text',
        content: '.vod_content&&Text',
        tabs: $js.toString(() => {
            TABS = ['在线播放']
            let kku = jsp.pdfh(html, '.video-info-main&&a:eq(0)&&href')           
            if(kku.includes("pan.quark.cn")){
            TABS.push("夸克网盘")
            }                       
        }),
        lists: $js.toString(() => {
            LISTS = []
            let zx = []
            let kk = []
            let aa = jsp.pdfa(html, '.module-player-list&&.scroll-content&&a')
            //console.log(aa)
            aa.forEach(it => {
                let uul = jsp.pd(it, 'a&&href')
                let uname = jsp.pd(it, 'a&&Text')
                zx.push(uname + "$" + uul)
            })
            zx.join('#')
            LISTS.push(zx)
            let kku = jsp.pdfh(html, '.video-info-main&&a:eq(0)&&href')
            if(kku.includes("pan.quark.cn")){
            let kkname = jsp.pd(html, 'h1&&Text')
            kk.push("跳转夸克$" + kku)
            LISTS.push(kk)
            }                        
            LISTS.join('$$$')
        }),
    },
    搜索: '.module-items .module-search-item;a&&title;img&&data-src;.video-serial&&Text;a&&href',
}