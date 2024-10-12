var rule={
  title: "狐狸视频",
  模板: "海螺3",
  host: "https://huli.video",
  url: "/index.php/vod/show/fyfilter.html",
  searchUrl: "/index.php/vod/search/page/fypage/wd/**.html",
  filterable: 1,
  filter: "H4sIAAAAAAAAA+2aW28aRxTHvwtPreQKg20c+y33+/2eKg+oQZXb1K1c11IUVcI4YMCmQEVwsUnsJjiAC15oatcBFn8ZZnb3W3RvzJw5K9luZdRUXfG05/efszOzM/Of2eW5x+eZ/Py55+vQM8+kh8RjSrPtGfJMB78Jweu54NMfQqZw2ghHK9pCxQjrF18F54LffzEz9d3s5Ny3U08+Gf7U8+OQrUuU6UJUSSza0qkn3nEO80WdC9Dn4zRZ6clFgZ5gkM5naDgvQP8wo0pri8gvBTrGyyrxJq6Tf4zTcpZ8aIs0wO+7kKSRVZH6eZU3F3FZH6c0/kuvlRDoCKhzUlLkLTEz7yoaqSn5rEh5V2mRHdpIK7kdIjdBR/Mma29ekGxSfAy8YoqcVdpFXNw/wQXzXW21K959lLc69rNWqIrtAk+qvqzGX4tlR3jmdppE90TKy5LMMg2jAaL32GOD28O12CDLLTBc+9f/cLiWylohZuuCM6Gg14p4eU++K9A9CSqsCFeQdIN+6Ao5zAhXKN2fyJoMFVaEK+j7l0hhRbhCXWoihRUBOVY2abEm5DAjoC3rVZTDioC2dP9ECisCa9pw1LQh5kg1SOudkMOMgBwv0no3k3hVSNMPgjZv7ivpupIoCM3uB8Edkxt0aV8vLdy0HwS66G6vnRdEZsQrDDFVqquVMB9i7PqAIcZvsSbrejvqfRqc/tJrh8CDxAo7xIbL7yWssEPgQWKFHQKDASvsEBhyDoUVAoPB0RYrBDqUbC+ICiskzNn6CpVSYM72r4/SoSdZ9tDsbGjGe5KRU4icYuQ0IqcZOYPIGUbOInKWkXOInGPkPCLnGbmAyAVGLiJykZFLiFxi5DIilxm5gsgVRq4icpWRa4hcY+Q6ItcZuYHIDUZuInKTkVuI3GLkNiK3GbmDyB1G7iJyl5F7iNxj5D4i9xl5gMgDRh4i8pCRR4g8YmT4swnEjIg+BR4PefwD3Gutyb1WWd9RAR/mTktrZcNlIPUBuieJBbm96+uEWIojwy4ExLdRhgsICcEuKS0iH9he5RtatSYW5Dmt1VmkgYFuB2JRPYNgEGbk71jocWwYDrfyo2wpDjPqI2wp8g3dRsmrX4U0/eBHZqy0mdAvaWFbC6+q0ivR2RA7VjNekUlqxeHHLHqcpu0armu4ruEeaLgjAzTcZIV2fsPn5gk4fw03MFWcj/Izv+3YWMAP9rZpI8EIuIXu27qd4gzgcG55JhYM1jYPPUUfx9nU6hshhxn5X57eXCNwjcA1ggONYHSARmAub0q7oyZaYJEFr2/NlckhwFbhEIDXqOZCjwVjwCo6OZJr9jqrnI7z851lA47i/n/XBo7j5HOADXxMpxHXKFyjcI3iP2EUY4MzCi0cU9/UlfW68BJrDHxpyxXJ9gYWBPgbMpJOqXINC8a5QFuQyV7EIeBepMRlml/EghPgc2B1X91NOuoA3u1ZHyOxgJ9rtMWUklt3CLgdqYUMnV/CAh/48pcuqW+jDgH4dtxpqWGHIAAEmbi2FnP0Azh8lVK9tqMfAvzopGy+VptbDgF4kWmZKhZMuEupu5S6S6mxlAYGt5Squ++VTH8jYyyiYOJK2yIC/zeQsyICq1peUqUWiS4BypdVdWet1wJofNSd5e4sd2e5McvHB/kHMrmplmNq+a0q/QFmH5+2vb0SDZdVqUs2ImA743Onpzs93emp//4COdEYB+ApAAA=",
  filter_url: "{{fl.地区}}{{fl.分类}}{{fl.语言}}{{fl.字母}}/page/fypage",
  filter_def: {
    1: {
      分类: "id/1"
    },
    2: {
      分类: "id/2"
    },
    3: {
      分类: "id/3"
    },
    4: {
      分类: "id/4"
    },
    5: {
      分类: "id/5"
    },
    6: {
      分类: "id/6"
    },
    71: {
      分类: "id/71"
    }
  },
  class_parse: ".hl-nav li;a&&Text;a&&href;(\\d+)",
      cate_exclude: "电影|电视剧|综艺|动漫|体育|解说",
 搜索: '.hl-list-item;a&&title;a&&data-original;.remarks&&Text;a&&href;.hl-item-content&&Text',
}