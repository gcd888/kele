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

# 网盘资源校验

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-02-04 17:20:36

> 更新时间: 2026-02-04 17:20:36

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

## 判断阿里网盘资源是否失效

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-02-05 13:39:05

> 更新时间: 2026-02-05 18:13:02

```text
暂无描述
```

**接口状态**

> 开发中

**接口URL**

> https://api.aliyundrive.com/adrive/v3/share_link/get_share_by_anonymous?share_id=JuRzzkQVF1z

**请求方式**

> POST

**Content-Type**

> json

**请求Query参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| share_id | JuRzzkQVF1z | string | 是 | 链接的最后一段值，例如链接alipan.com/s/JuRzzkQVF1z则是JuRzzkQVF1z |

**请求Body参数**

```javascript
{
    "share_id": "Kr5hFC1aTrY"
}
```

**认证方式**

> 继承父级

**响应示例**

* 成功(200)

```javascript
{
	"file_count": 1,
	"share_name": "S）生丨命丨木又寸（2026）",
	"file_infos": [
		{
			"type": "folder",
			"file_id": "697cb6219f35c5801eb04147afbb433e81078cf5",
			"file_name": "S）生丨命丨木又寸（2026）"
		}
	],
	"creator_phone": "135***736",
	"avatar": "https://img.aliyundrive.com/avatar/default/05.png",
	"display_name": "S）生丨命丨木又寸（2026）",
	"save_button": {
		"text": "登录并保存",
		"select_all_text": "登录并保存"
	},
	"updated_at": "2026-02-05T10:07:46.239Z",
	"share_title": "S）生丨命丨木又寸（2026）",
	"has_pwd": false,
	"creator_id": "e9ebcfac12b746ccb48d8fb8bbca346a",
	"creator_name": "冰***梨",
	"expiration": "",
	"vip": "non-vip"
}
```

* 失败(400)

```javascript
{
	"code": "ShareLink.Cancelled",
	"message": "share_link is cancelled by the creator"
}
```

**Query**
