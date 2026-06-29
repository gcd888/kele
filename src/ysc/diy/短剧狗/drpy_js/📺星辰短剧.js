var rule = {
    title: 'Movies',
    host: 'https://citytv.cc',
    url: '/tv/fyclass-fypage/',
    searchUrl: '/wd/**/page/fypage/',
    searchable: 2, //是否启用全局搜索,
    quickSearch: 0, //是否启用快速搜索,
    filterable: 0, //是否启用分类筛选,
    headers: {
        'User-Agent': 'UC_UA', // "Cookie": ""
    },
    class_parse: '.type li;a&&Text;a&&href;/tv/(\\w+)/',
    play_parse: true,
    lazy: `js:
        var html = JSON.parse(request(input).match(/r player_.*?=(.*?)</)[1]);
        var url = html.url;
        if (html.encrypt == '1') {
            url = unescape(url)
        } else if (html.encrypt == '2') {
            url = unescape(base64Decode(url))
        }
        if (/\\.m3u8|\\.mp4/.test(url)) {
            input = {
                jx: 0,
                url: url,
                parse: 0
            }
        } else {
            input
        }
    `,
    limit: 6,
    推荐: '.stui-vodlist li;a&&title;a&&data-original;.pic-text&&Text;a&&href',
    double: true, // 推荐内容是否双层定位
    一级: '.stui-vodlist li;a&&title;a&&data-original;.pic-text&&Text;a&&href',
    二级: {
        "title": ".stui-content__detail .title&&Text;.stui-content__detail p:eq(-2)&&Text",
        "img": ".stui-content__thumb .lazyload&&data-original",
        "desc": ".stui-content__detail p:eq(0)&&Text;.stui-content__detail p:eq(1)&&Text;.stui-content__detail p:eq(2)&&Text",
        "content": ".detail&&Text",
        "tabs": ".nav-tabs&&a",
        "lists": ".stui-content__playlist:eq(#id)&&a:not(:contains(1080))",
    },
    cate_exclude: "电影|电视剧|综艺|动漫|动作片|喜剧片|爱情片|科幻片|剧情片|恐怖片|战争片|悬疑片|动画片|纪录片|福利片|大陆剧|欧美剧|港澳剧|韩国剧|台湾剧|泰国剧|日本剧|大陆综艺|港台综艺|日韩综艺|欧美综艺|国产动漫|欧美动漫|日韩动漫|海外动漫",
    搜索: '.stui-vodlist li;a&&title;a&&data-original;.pic-text&&Text;a&&href',
}