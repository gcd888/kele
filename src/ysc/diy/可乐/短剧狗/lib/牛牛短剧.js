//无推荐无简介
var rule={
            title: '牛牛影院',
            host: 'https://www.nn4k.com/',
            searchUrl: '/vodsearch/**.html',
            url: '/vodshow/fyclass------fypage--------.html',
            headers: {
                'User-Agent': 'MOBILE_UA'
            },
            timeout: 5000,
           class_parse: '.navder a;a&&Text;a&&href;.*/(.*?).html',
   //   class_name:'电影&电视剧&动漫&综艺&短剧',
   //   class_url:'电影&电视剧&动漫&综艺&短剧',    
              limit: 40,
            play_parse: true,
            lazy: '',
            推荐: '.content a;a&&title;.lazy&&data-original;a&&Text;a&&href',
            double: true,
            一级: '.vod_list&&li;a&&title;.lazy&&data-original;span&&Text;a&&href',
            二级: {
                "title": "h1&&Text",
                "img": ".lazy&&data-original",
                "desc": ".vod_info&&b&&Text;.vod_info&&b:eq(0) a&&Text;.vod_info&&p:eq(1) p&&Text;.vod_info&&p:eq(2) p&&Text;.vod_info&&p:eq(3) a&&Text",
                "content": "ul.content h2&&Text",
                "tabs": ".play_list b",
                "lists": ".play_list:eq(#id)&&li"
            },
             cate_exclude: "电影|电视剧|综艺|动漫|纪录片",
            搜索: '.vod_list li;a&&title;.lazy&&data-original;a&&Text;a&&href;span&&Text',
            searchable: 2,//是否启用全局搜索,
            quickSearch: 0,//是否启用快速搜索,
            filterable: 0,//是否启用分类筛选,
        }