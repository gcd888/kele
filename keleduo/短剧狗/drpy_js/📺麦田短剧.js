var rule={
  title: "麦田影院",
  host: "https://mtyy1.com",
  url: "/vodshow/fyclassfyfilter.html",
  searchUrl: "/index.php/ajax/suggest?mid=1&wd=**",
  detailUrl:  "/voddetail/fyid.html",
  searchable: 2,
  quickSearch: 0,
  filterable: 1,
  filter: "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",
  filter_url: "-{{fl.地区}}--{{fl.类型}}-{{fl.语言}}-{{fl.字母}}---fypage---{{fl.年份}}",
  filter_def: {},
  headers: {
    "User-Agent": "MOBILE_UA"
  },
  timeout: 5000,
  class_name: "短剧",
  class_url:    "5",
  cate_exclude: "",
  play_parse: true,
  lazy:$js.toString(()=>{
    input = {parse:1,url:input,js:''};
  }),
  double: true,
  推荐: "*",
  一级: "body&&.public-list-box;a&&title;.gen-movie-img&&data-src;.public-list-prb&&Text;a&&href",
  二级: {
    title: ".this-desc-title&&Text;.this-desc-tags&&Text",
    img: ".this-pic-bj&&style",
    desc: ".this-desc-info&&span:eq(3)&&Text;.this-desc-labels&&span&&Text;.this-desc-info&&span:eq(1)&&Text;.slide-desc-box .this-info:eq(1)&&Text;.slide-desc-box .this-info&&Text",
    content: ".slide-desc-box .this-desc&&Text",
    tabs: ".anthology-tab a",
    lists: ".anthology-list-play:eq(#id) li",
    tab_text: "a--span&&Text",
    list_text: "body&&Text",
    list_url: "a&&href"
  },
  搜索: "json:list;name;pic;en;id,"
}