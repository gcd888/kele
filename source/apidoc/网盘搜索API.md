# 聚合网盘搜索接口

**请求方式：** GET

**接口地址：** https://api.iyuns.com/api/wpysso

**接口描述：** 聚合网盘搜索接口

## 请求参数

| 参数名 | 传递参数 | 传入位置 | 类型 | 参数说明 |
|--------|----------|----------|------|----------|
| kw | 人世间 | query | 必传 | 人世间 |
| cloud_types | baidu | query | 可选 | 指定返回的网盘类型列表，支持：baidu、aliyun、quark、tianyi、uc、mobile、115、pikpak、xunlei、123、magnet、ed2k，不指定则返回所有类型 |

## 返回示例

```json
{
  "code": 0,
  "message": "success",
  "data": {
    "total": 178,
    "merged_by_type": {
      "baidu": [
        {
          "url": "https://pan.baidu.com/s/1-7McOPuss-TjraQl3yH8Ww?pwd=cc2d",
          "password": "",
          "note": "苏醒后，无敌人世间",
          "datetime": "0001-01-01T00:00:00Z",
          "source": "plugin:zhizhen",
          "images": [
            "https://xinlangtupian.com/cover/40f2165a405edf2145b3840fa4bd1c75.jpg"
          ]
        },
        {
          "url": "https://pan.baidu.com/s/1n5EXQj6kFvqTx8oJAvXytg?pwd=8888",
          "password": "8888",
          "note": "人世间",
          "datetime": "0001-01-01T00:00:00Z",
          "source": "plugin:wanou",
          "images": [
            "https://ry-pic.com/upload/vod/20240919-1/44f2a2e9770f760d55df55d24cb41431.jpg"
          ]
        },
```

**请求方式：** GET

**接口地址：** https://api.iyuns.com/api/wpysso

**接口描述：** 聚合网盘搜索接口

## 请求参数

| 参数名 | 传递参数 | 传入位置 | 类型 | 参数说明 |
|--------|----------|----------|------|----------|
| kw | 人世间 | query | 必传 | 人世间 |
| cloud_types | baidu | query | 可选 | 指定返回的网盘类型列表，支持：baidu、aliyun、quark、tianyi、uc、mobile、115、pikpak、xunlei、123、magnet、ed2k，不指定则返回所有类型 |

## 返回示例

```json
{
  "code": 0,
  "message": "success",
  "data": {
    "total": 178,
    "merged_by_type": {
      "baidu": [
        {
          "url": "https://pan.baidu.com/s/1-7McOPuss-TjraQl3yH8Ww?pwd=cc2d",
          "password": "",
          "note": "苏醒后，无敌人世间",
          "datetime": "0001-01-01T00:00:00Z",
          "source": "plugin:zhizhen",
          "images": [
            "https://xinlangtupian.com/cover/40f2165a405edf2145b3840fa4bd1c75.jpg"
          ]
        },
        {
          "url": "https://pan.baidu.com/s/1n5EXQj6kFvqTx8oJAvXytg?pwd=8888",
          "password": "8888",
          "note": "人世间",
          "datetime": "0001-01-01T00:00:00Z",
          "source": "plugin:wanou",
          "images": [
            "https://ry-pic.com/upload/vod/20240919-1/44f2a2e9770f760d55df55d24cb41431.jpg"
          ]
        },
```