# 全局公共参数

**全局Header参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| 暂无参数 |

**全局Query参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| 暂无参数 |

**全局Body参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| 暂无参数 |

**全局认证方式**

> 无需认证

# 状态码说明

| 状态码 | 中文描述 |
| --- | ---- |
| 暂无参数 |

# 网盘聚合搜索API

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-01-21 20:14:29

> 更新时间: 2026-01-21 20:25:35

```text
暂无描述
```

**目录Header参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| 暂无参数 |

**目录Query参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| 暂无参数 |

**目录Body参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| 暂无参数 |

**目录认证信息**

> 继承父级

**Query**

## 聚合网盘搜索1

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-01-21 20:25:09

> 更新时间: 2026-01-22 16:04:49

**聚合网盘搜索接口**

**接口状态**

> 开发中

**接口URL**

> https://api.iyuns.com/api/wpysso?kw=罚罪2&cloud_types=quark

**请求方式**

> GET

**Content-Type**

> none

**请求Query参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| kw | 罚罪2 | string | 是 | 影视名称 |
| cloud_types | quark | string | 否 | 网盘类型列表，支持：baidu、aliyun、quark、tianyi、uc、mobile、115、pikpak、xunlei、123、magnet、ed2k，不指定则返回所有类型 |

**认证方式**

> 继承父级

**响应示例**

* 成功响应示例(200)

```javascript
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
        }
      ]
    }
  }
}
```

* 失败(404)

```javascript
暂无数据
```

**Query**

## 聚合网盘搜索2

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-01-21 20:29:08

> 更新时间: 2026-01-22 16:03:42

**Search for content (e.g., TV shows, movies) by name, returning matching results including download links and basic details.**

**接口状态**

> 开发中

**接口URL**

> http://z.eeeob.com/v/api/search

**请求方式**

> POST

**Content-Type**

> urlencoded

**请求Body参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| name | 罚罪2 | string | 是 | 影视名称 |
| token | i69 | string | 是 | 认证令牌 |

**认证方式**

> 继承父级

**响应示例**

* Successful Search Response(200)

```javascript
{
  "us": true,
  "list": [
    {
      "id": 76241,
      "question": "[罚罪2][2025][全40集][国产剧]",
      "answer": "链接：https://pan.baidu.com/s/1k9zskJbOKJuHLJh-WML2xA?pwd=8888 提取码：8888\n链接：https://pan.xunlei.com/s/VOjEUm100bPxb6xIe4AHE-QPA1\n链接：https://pan.quark.cn/s/52aeb25ad092",
      "bd_pic": "https://img13.360buyimg.com/ddimg/jfs/t1/376155/18/21649/197343/694d1fa3F01d71aec/00152d04387ae037.jpg",
      "isTop": 0,
      "res_platform": "mv"
    }
  ],
  "msg": "ok"
}
```

* 失败(404)

```javascript
暂无数据
```

**Query**

## 聚合网盘搜索3

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-01-21 20:31:43

> 更新时间: 2026-01-22 16:04:32

```text
暂无描述
```

**接口状态**

> 开发中

**接口URL**

> http://z.eeeob.com/v/api/getJuzi

**请求方式**

> POST

**Content-Type**

> urlencoded

**请求Body参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| name | 罚罪2 | string | 是 | 影视名称 |
| token | i69 | string | 是 | 认证令牌 |

**认证方式**

> 继承父级

**响应示例**

* 成功响应示例(200)

```javascript
{
  "us": true,
  "list": [
    {
      "id": "21506",
      "answer": "[国剧][2025]罚罪2.全40（1080&4K）\n链接: https://pan.baidu.com/s/1bYo74Vwbwehp0_4Sizabtg 提取码: 1314\n链接: https://pan.xunlei.com/s/VOjUQAsbI1n_DMbU6Gm3eSwiA1?pwd=kdgs#"
    }
  ],
  "cache": false,
  "msg": "所有请求成功"
}
```

* 失败(404)

```javascript
暂无数据
```

**Query**

## 聚合网盘搜索4

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-01-21 20:35:38

> 更新时间: 2026-01-22 16:07:28

```text
暂无描述
```

**接口状态**

> 开发中

**接口URL**

> http://z.eeeob.com/v/api/getXiaoyu

**请求方式**

> POST

**Content-Type**

> urlencoded

**请求Body参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| name | 罚罪2 | string | 是 | 影视名称 |
| token | i69 | string | 是 | 认证令牌 |

**认证方式**

> 继承父级

**响应示例**

* 成功响应示例(200)

```javascript
{
  "us": true,
  "list": [
    {
      "id": "21506",
      "answer": "[国剧][2025]罚罪2.全40（1080&4K）\n链接: https://pan.baidu.com/s/1bYo74Vwbwehp0_4Sizabtg 提取码: 1314\n链接: https://pan.xunlei.com/s/VOjUQAsbI1n_DMbU6Gm3eSwiA1?pwd=kdgs#"
    }
  ],
  "cache": false,
  "msg": "所有请求成功"
}
```

* 失败(404)

```javascript
暂无数据
```

**Query**

## 聚合网盘搜索5

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-01-22 16:07:08

> 更新时间: 2026-01-22 16:07:37

```text
暂无描述
```

**接口状态**

> 开发中

**接口URL**

> http://z.eeeob.com/v/api/getDyfx

**请求方式**

> POST

**Content-Type**

> urlencoded

**请求Body参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| name | 罚罪2 | string | 是 | 影视名称 |
| token | i69 | string | 是 | 认证令牌 |

**认证方式**

> 继承父级

**响应示例**

* 成功响应示例(200)

```javascript
{
  "us": true,
  "list": [
    {
      "id": "21506",
      "answer": "[国剧][2025]罚罪2.全40（1080&4K）\n链接: https://pan.baidu.com/s/1bYo74Vwbwehp0_4Sizabtg 提取码: 1314\n链接: https://pan.xunlei.com/s/VOjUQAsbI1n_DMbU6Gm3eSwiA1?pwd=kdgs#"
    }
  ],
  "cache": false,
  "msg": "所有请求成功"
}
```

* 失败(404)

```javascript
暂无数据
```

**Query**

## 聚合网盘搜索6

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-01-22 16:00:04

> 更新时间: 2026-01-22 16:08:19

```text
暂无描述
```

**接口状态**

> 开发中

**接口URL**

> https://m.duoduopuzi.cn/mv/api/movies/search?name=罚罪2&page=1&pageSize=100

**请求方式**

> GET

**Content-Type**

> form-data

**请求Header参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| x-api-key | JUU3JUJEJTlBJUU3JUJEJUFBMiUzQTE3NjkwNjg3MTg0MzE= | string | 是 | API密钥 |

**请求Query参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| name | 罚罪2 | string | 是 | 影视名称 |
| page | 1 | string | 是 | 页码 |
| pageSize | 100 | string | 是 | 每页条数 |

**认证方式**

> 继承父级

**响应示例**

* 成功响应示例(200)

```javascript
{
	"data": [
		{
			"id": 98497,
			"title": "罚罪2",
			"content": "链接：https://pan.baidu.com/s/1JkUw2OCh1qhZUhs7egOhFQ?pwd=8989 \n链接：https://pan.xunlei.com/s/VOiWEKPZaCGjQjOBLXMzWOVBA1?pwd=3cq2# \n链接：https://pan.quark.cn/s/e5349757506c  ",
			"coverUrl": "",
			"updatedAt": "2026-01-09T05:35:50.522Z",
			"isTop": false,
			"category": null
		}
	],
	"total": 1,
	"page": 1,
	"pageSize": 100
}
```

* 失败(404)

```javascript
暂无数据
```

**请求Header参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| x-api-key | JUU3JUJEJTlBJUU3JUJEJUFBMiUzQTE3NjkwNjg3MTg0MzE= | string | 是 | API密钥 |

**Query**

## 聚合网盘搜索7

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-01-22 16:05:09

> 更新时间: 2026-01-22 16:08:20

```text
暂无描述
```

**接口状态**

> 开发中

**接口URL**

>  https://m.duoduopuzi.cn/mv/api/crawler/search?name=%E7%BD%9A%E7%BD%AA2

**请求方式**

> GET

**Content-Type**

> form-data

**请求Header参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| x-api-key | JUU3JUJEJTlBJUU3JUJEJUFBMiUzQTE3NjkwNjg3MTg0MzE= | string | 是 | API密钥 |

**请求Query参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| name | %E7%BD%9A%E7%BD%AA2 | string | 是 | 影视名称 |

**认证方式**

> 继承父级

**响应示例**

* 成功响应示例(200)

```javascript
[
	{
		"source": "入口1",
		"data": [
			{
				"id": "21506",
				"title": "",
				"content": "[国剧][2025]罚罪2.全40（1080&4K）\n链接: https://pan.baidu.com/s/1bYo74Vwbwehp0_4Sizabtg 提取码: 1314\n链接: https://pan.xunlei.com/s/VOjUQAsbI1n_DMbU6Gm3eSwiA1?pwd=kdgs#"
			}
		]
	},
	{
		"source": "入口2",
		"data": [
			{
				"id": 76241,
				"title": "[罚罪2][2025][全40集][国产剧]",
				"content": "链接：https://pan.baidu.com/s/1k9zskJbOKJuHLJh-WML2xA?pwd=8888 提取码：8888\n链接：https://pan.xunlei.com/s/VOjEUm100bPxb6xIe4AHE-QPA1\n链接：https://pan.quark.cn/s/52aeb25ad092"
			}
		]
	},
	{
		"source": "入口4",
		"data": [
			{
				"id": "1901",
				"title": "罚罪2",
				"content": "罚罪2链接: https://pan.baidu.com/s/1BddYEe0qcwIrKqryI9uq0g?pwd=3kvd 提取码: 3kvd"
			},
			{
				"id": "1903",
				"title": "罚罪2（迅雷）",
				"content": "罚罪2（迅雷）链接：https://pan.xunlei.com/s/VOj5nuMpAc9kWWWlc5nVlVwiA1# 提取码：6e5a"
			}
		]
	}
]
```

* 失败(404)

```javascript
暂无数据
```

**请求Header参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| x-api-key | JUU3JUJEJTlBJUU3JUJEJUFBMiUzQTE3NjkwNjg3MTg0MzE= | string | 是 | API密钥 |

**Query**
