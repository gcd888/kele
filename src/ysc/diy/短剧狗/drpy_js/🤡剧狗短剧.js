var rule = {
    title: '短剧狗',
    host: 'https://duanjugou.top/',
    url: '/search.php?q=fyclass&page=fypage',
    searchUrl: '/search.php?q=**&page=fypage',
    class_parse: '.erx-list&&a;a&&Text;a&&href;q=(.*)',
    cate_exclude: '',
    hikerListCol:"text_1",
    hikerClassListCol:"text_1",
    searchable: 2,
    quickSearch: 0,
    filterable: 0,
    headers: {
        'User-Agent': 'MOBILE_UA',
    },
    play_parse: true,
    lazy: $js.toString(() => {
        let html = request(input);
        let _url = 'push://' + pdfh(html, '.con&&a:eq(0)&&href');
        input = {parse: 0, url: _url, js: ''};
    }),
    limit: 6,
    推荐: '*',
    double: true,
    一级: '.erx-list:eq(1)&&li;a&&Text;;span&&Text;a&&href',
    二级:'*',
    搜索: '*',
}