//搜索有验证
var rule={
            title: '青柠影院',
            host: 'http://www.qixingshan.net/',
            url: '/qndy/fyclass/page/fypage.html',
            searchUrl: '/wd/**/page/fypage.html',
            searchable: 2,//是否启用全局搜索,
            quickSearch: 0,//是否启用快速搜索,
            filterable: 0,//是否启用分类筛选,
            class_parse: '.nav-list&&li;a&&Text;a&&href;.*/(.*?).html',
            play_parse: true,
            lazy: '',
            limit: 6,
            推荐: '.myui-vodlist;.myui-vodlist__box;a&&title;.lazyload&&data-original;.pic-text&&Text;a&&href',
            double: true, // 推荐内容是否双层定位
            一级: 'ul.myui-vodlist li;a&&title;.lazyload&&data-original;.pic-text&&Text;a&&href',
            二级: {
                "title": "h1&&Text;.tag-link&&Text",
                "img": ".module-item-pic&&img&&data-src",
                "desc": ".myui-content__detail&&p:eq(0)&&Text;.myui-content__detail&&p:eq(1)&&Text;.myui-content__detail&&p:eq(2)&&Text;.myui-content__detail&&p:eq(3)&&Text;.myui-content__detail&&p:eq(4)&&Text;.myui-content__detail&&p:eq(5)&&Text",
                "content": ".content&&p&&Text",
                "tabs": ".nav-tabs&&li",
                "lists": ".myui-content__list:eq(#id) a"
            },
            cate_exclude: "电影|电视剧|综艺|动漫|动作片|喜剧片|爱情片|科幻片|剧情片|恐怖片|战争片|悬疑片|纪录片|动画片|福利片|国产剧|欧美剧|香港剧|韩国剧|台湾剧|泰国剧|日本剧",
            搜索: '.ul.myui-vodlist li;a&&title;.lazyload&&data-original;.pic-text&&Text;a&&href',
        }