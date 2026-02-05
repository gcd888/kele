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

## 判断夸克网盘资源是否失效

> 创建人: gcd888

> 更新人: gcd888

> 创建时间: 2026-02-04 16:04:35

> 更新时间: 2026-02-04 17:20:41

```text
暂无描述
```

**接口状态**

> 开发中

**接口URL**

> https://drive-h.quark.cn/1/clouddrive/share/sharepage/token?pr=ucpro&fr=pc&uc_param_str=

**请求方式**

> POST

**Content-Type**

> json

**请求Query参数**

| 参数名 | 示例值 | 参数类型 | 是否必填 | 参数描述 |
| --- | --- | ---- | ---- | ---- |
| pr | ucpro | string | 是 | - |
| fr | pc | string | 是 | - |
| uc_param_str | - | string | 是 | - |

**请求Body参数**

```javascript
{
    "pwd_id": "df6a7115167f",
    "passcode": "",
    "support_visit_limit_private_share": true
}
```

**认证方式**

> 继承父级

**响应示例**

* 成功(200)

```javascript
{
	"status": 200,
	"code": 0,
	"message": "ok",
	"timestamp": 1770194351,
	"data": {
		"subscribed": false,
		"stoken": "Q0NpVmknXhJ9mse+Qic/LI04pOxZGOeJX1vJHAv49VI=",
		"share_type": 0,
		"author": {
			"member_type": "SUPER_VIP",
			"avatar_url": "http://image.quark.cn/o/uop/1Ht08/;;0,uop/g/uop/avatar/168394eabda3697890cf5e9121f6ca09.jpg;3,160",
			"nick_name": "黄昏*巷"
		},
		"url_type": 1,
		"expired_type": 1,
		"expired_at": 4102416000000,
		"title": "生命"
	},
	"metadata": {
		"_t_group": "0:_s_vp:1",
		"_g_group": "4:_s_wl:1;0:_s_vp:1;2:_s_bp:1;1:_s_ap:0;3:_s_vtp:1"
	}
}
```

* 失败(404)

```javascript
{
	"status": 404,
	"code": 41012,
	"message": "好友已取消了分享",
	"req_id": "9784v1-28c36ac079725b",
	"timestamp": 1770196090,
	"metadata": {
		"_t_group": "0:_s_vp:1",
		"_g_group": "4:_s_wl:1;0:_s_vp:1;2:_s_bp:1;1:_s_ap:0;3:_s_vtp:1"
	}
}
```

**Query**
