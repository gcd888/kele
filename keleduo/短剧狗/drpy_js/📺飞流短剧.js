var rule = {
  title: '飞流视频',
  host: 'https://www.flixflop.com',
  url: '/api/v1/explore/fyclass?page=fypage&per_page=48',
  searchUrl: '/api/v1/explore/search?query=**&rank=fypage.html',
  headers: {
    'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/126.0.0.0 Safari/537.36',
  },
  searchable: 2,
  quickSearch: 0,
  filterable: 0,
      cate_exclude: "电影|电视剧|综艺|动漫|体育|电影解说",
  class_name: '电影&电视剧&动漫&综艺&体育&电影解说&短剧',
  class_url: '151438147786375168&151438147794763777&151438147807346690&151438147807346691&151438147807346693&204814944317734918&331153971999670710',
  limit: 6,
  double: false,
  play_parse:true,
  lazy:$js.toString(()=>{
    const reg = input.split('/')[7]
    const durl = input.replace(reg,'').replace('streams','api/v1/videos')
    let html =  JSON.parse(request(durl)).data
    let url = html.url.split('$')[1]
    input={parse:0,url:url,header:rule.headers}
  }),
  一级: $js.toString(()=>{
    const list = JSON.parse(request(input)).data
    let d= []
    list.forEach(it=>{
        let url = 'https://www.flixflop.com/streams/'+it.video_id+'/detail'
        d.push({
          title: it.title,
          desc:it.remarks,
          img:it.cover_image,
          url:url
        })
    })
    setResult(d) 
  }),
  二级:  {
    title: 'h1&&Text',
    tabs: '.xTwxBpM .mui-orq8zk .MuiButtonBase-root',
    lists: '.xBwXv89:eq(#id)&&a',
  },
  搜索:$js.toString(()=>{
    const list = JSON.parse(request(input)).data
    let d= []
    list.forEach(it=>{
        let url = it.sources.url.replace('$','')
        d.push({
          title: it.title,
          desc:it.remarks,
          img:it.cover_image,
          url:url
        })
    })
    setResult(d) 
  })   
}