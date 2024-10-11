var rule = {
    title: 'cc影视',
    host: 'https://l3l4.cc/',
    url: '/index.php/vod/show/id/fyclass/page/fypage.html',
    class_name: '电影&剧集&动漫&短剧',
    class_url:'1&2&4&3',
    searchUrl: '/index.php/vod/search/page/fypage/wd/**.html',
    play_parse:true,
    lazy:muban.mx.lazy,
    推荐:'*',
    一级:'.row li;a&&title;.lazyload&&data-original;p&&Text;a&&href',
    二级:{
    title: 'h3&&Text',
        img: '.lazyload&&data-original',
        desc: '.row&&span:eq(5)&&Text;.row&&span:eq(4)&&Text;.row&&span:eq(1)&&Text;.row&&span:eq(2)&&Text',
        content: '.text&&Text',
        tabs: '.playlist-tab li',
        lists: '.ewave-playlist-content:eq(#id) a',
    },
    cate_exclude: "电影|剧集|动漫",
    搜索: '*',
}


