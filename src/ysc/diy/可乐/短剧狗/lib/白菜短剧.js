// 搜索安全验证
muban.首图2.二级.title = 'h1--span&&Text;.data--span:eq(0)&&Text';
muban.首图2.二级.desc = '.data:eq(3)&&Text;;;.data--span:eq(1)&&Text;.data--span:eq(2)&&Text';
muban.首图2.二级.content = '.desc--span--a&&Text';
muban.首图2.二级.tabs = '.nav-tabs li';
var rule = {
    title: '小白菜电影',
    模板:'首图2',
    host: 'https://www.xbcdy.com',
    // url: '/vodshow/fyclass--------fypage---.html',
    url:'/vodshow/fyfilter.html',
    filterable:1,//是否启用分类筛选,
    filter_url:'{{fl.cateId}}-{{fl.area}}-{{fl.by or "time"}}-{{fl.class}}-{{fl.lang}}-{{fl.letter}}---fypage---{{fl.year}}',
    filter:{
        "duanju":[{"key":"class","name":"剧情","value":[{"n":"全部","v":""},{"n":"逆袭","v":"逆袭"},{"n":"反转","v":"反转"},{"n":"都市脑洞","v":"都市脑洞"},{"n":"职场婚恋","v":"职场婚恋"},{"n":"时空之旅","v":"时空之旅"},{"n":"家庭","v":"家庭"},{"n":"剧情","v":"剧情"},{"n":"古风","v":"古风"},{"n":"都市日常","v":"都市日常"},{"n":"乡村","v":"乡村"},{"n":"青春","v":"青春"},{"n":"悬疑","v":"悬疑"},{"n":"年代","v":"年代"},{"n":"校园","v":"校园"},{"n":"民国","v":"民国"}]},{"key":"area","name":"地区","value":[{"n":"全部","v":""},{"n":"大陆","v":"大陆"},{"n":"香港","v":"香港"},{"n":"台湾","v":"台湾"},{"n":"美国","v":"美国"},{"n":"法国","v":"法国"},{"n":"英国","v":"英国"},{"n":"日本","v":"日本"},{"n":"韩国","v":"韩国"},{"n":"德国","v":"德国"},{"n":"泰国","v":"泰国"},{"n":"印度","v":"印度"},{"n":"意大利","v":"意大利"},{"n":"西班牙","v":"西班牙"},{"n":"加拿大","v":"加拿大"},{"n":"其他","v":"其他"}]},{"key":"year","name":"年份","value":[{"n":"全部","v":""},{"n":"2024","v":"2024"},{"n":"2023","v":"2023"},{"n":"2022","v":"2022"},{"n":"2021","v":"2021"},{"n":"2020","v":"2020"},{"n":"2019","v":"2019"},{"n":"2018","v":"2018"},{"n":"2017","v":"2017"},{"n":"2016","v":"2016"},{"n":"2015","v":"2015"},{"n":"2014","v":"2014"},{"n":"2013","v":"2013"},{"n":"2012","v":"2012"},{"n":"2011","v":"2011"}]},{"key":"lang","name":"语言","value":[{"n":"全部","v":""},{"n":"","v":""}]},{"key":"letter","name":"字母","value":[{"n":"全部","v":""},{"n":"A","v":"A"},{"n":"B","v":"B"},{"n":"C","v":"C"},{"n":"D","v":"D"},{"n":"E","v":"E"},{"n":"F","v":"F"},{"n":"G","v":"G"},{"n":"H","v":"H"},{"n":"I","v":"I"},{"n":"J","v":"J"},{"n":"K","v":"K"},{"n":"L","v":"L"},{"n":"M","v":"M"},{"n":"N","v":"N"},{"n":"O","v":"O"},{"n":"P","v":"P"},{"n":"Q","v":"Q"},{"n":"R","v":"R"},{"n":"S","v":"S"},{"n":"T","v":"T"},{"n":"U","v":"U"},{"n":"V","v":"V"},{"n":"W","v":"W"},{"n":"X","v":"X"},{"n":"Y","v":"Y"},{"n":"Z","v":"Z"},{"n":"","v":""}]},{"key":"by","name":"排序","value":[{"n":"时间","v":"time"},{"n":"人气","v":"hits"},{"n":"评分","v":"score"}]}]
    },
    filter_def:{

        duanju:{cateId:'duanju'}
    },

cate_exclude: "电影|电视剧|综艺|动漫|直播",

    class_parse: '.stui-header__menu li:gt(0):lt(8);a&&Text;a&&href;.*/(.*?).html',
    pagecount:{"zhibo":1},
    lazy:`js:
        var html = JSON.parse(request(input).match(/r player_.*?=(.*?)</)[1]);
        var url = html.url;
        if (html.encrypt == '1') {
            url = unescape(url)
        } else if (html.encrypt == '2') {
            url = unescape(base64Decode(url))
        }
        if (/m3u8|mp4/.test(url)) {
            input = {
                jx: 0,
                url: url,
                parse: 0
            }
        } else {
            input
        }
    `,
    searchUrl:'/index.php/ajax/suggest?mid=1&wd=**&limit=50',
    detailUrl:'/voddetail/fyid.html', //非必填,二级详情拼接链接
    搜索:'json:list;name;pic;;id',
}
