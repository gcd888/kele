var rule = {
    模板: '自动',
   // 模板修改: $js.toString(() => {
    //    Object.assign(muban.自动.二级, {
     //       tab_text: 'div--small&&Text',
       // });
  //  }),
    title: '蝴蝶影视[自动]',
    host: 'https://www.tqpipa.com',
 //   url: '/vodshow/id/fyclass/page/fypage.html',
  //  searchUrl: '/vodsearch**/page/fypage.html',
    class_parse: '.navbar-items li;a&&Text;a&&href;.*/(.*?)/',
    cate_exclude: '今日更新|热榜|直播',
    cate_exclude: "电影|电视剧|综艺|动漫|体育|4K电影|体育赛事|今日更新612|热榜",
    lazy:muban.mx.lazy
}