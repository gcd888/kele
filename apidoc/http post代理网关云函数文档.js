const https = require('https');
const { URL } = require('url');

// 安全配置（建议通过环境变量设置）
const CONFIG = {
  APP_ID: process.env.X_APP_ID || 'C5C2IahEaBlaXuxwEOzTKD0j4qb19cr9',
  HEADER_BLACKLIST: [
    'host', 'origin', 'referer', 'cookie',
    'content-length', 'accept-encoding'
  ]
};

exports.main = async (event) => {
  // 处理预检请求
  if (event.method === 'OPTIONS') {
    return buildCorsResponse();
  }

  try {
    // 阶段1：鉴权验证
    const clientAppId = event.headers['x-app-id'];
    if (clientAppId !== CONFIG.APP_ID) {
      return createResponse(401, { code: 'UNAUTHORIZED', message: '无效的鉴权凭证' });
    }

    // 阶段2：解析请求参数
    const requestBody = safeJsonParse(event.body);
    if (!requestBody) {
      return createResponse(400, { code: 'INVALID_BODY', message: '请求体必须是有效的JSON' });
    }

    // 阶段3：参数校验
    const { targetUrl, headers = {}, data = {}, method = 'POST' } = requestBody;
    
    // 校验必填参数
    if (!targetUrl) {
      return createResponse(400, { code: 'MISSING_URL', message: '缺少 targetUrl 参数' });
    }
    if (typeof data !== 'object') {
      return createResponse(400, { code: 'INVALID_DATA', message: 'data 参数必须是对象' });
    }

    // 校验URL格式（不限制具体域名）
    try {
      new URL(targetUrl);
    } catch (e) {
      return createResponse(400, { code: 'INVALID_URL', message: '目标URL格式无效' });
    }

    // 阶段4：构建请求
    const filteredHeaders = filterHeaders(headers);
    const contentType = determineContentType(filteredHeaders);

    // 阶段5：执行请求
    const response = await sendHttpRequest(targetUrl, {
      method: method.toUpperCase(),
      headers: {
        ...filteredHeaders,
        'Content-Type': contentType
      },
      data: buildRequestData(contentType, data, event.body)
    });

    // 阶段6：返回响应
    return createResponse(
      response.status,
      response.data,
      { 'Content-Type': response.headers['content-type'] }
    );

  } catch (error) {
    console.error('全局捕获错误:', error);
    return createResponse(500, { 
      code: 'SERVER_ERROR', 
      message: '服务端处理异常' 
    });
  }
};

// 发送HTTP请求（替代axios）
function sendHttpRequest(url, options) {
  return new Promise((resolve, reject) => {
    const parsedUrl = new URL(url);
    const { method, headers, data } = options;
    
    const requestOptions = {
      hostname: parsedUrl.hostname,
      port: parsedUrl.port || 443,
      path: parsedUrl.pathname + parsedUrl.search,
      method,
      headers
    };
    
    const req = https.request(requestOptions, (res) => {
      let responseData = '';
      
      res.on('data', (chunk) => {
        responseData += chunk;
      });
      
      res.on('end', () => {
        // 尝试解析响应数据为JSON
        let parsedData;
        try {
          parsedData = JSON.parse(responseData);
        } catch (e) {
          parsedData = responseData;
        }
        
        resolve({
          status: res.statusCode,
          data: parsedData,
          headers: res.headers
        });
      });
    });
    
    req.on('error', (error) => {
      reject(error);
    });
    
    // 写入请求体
    if (data) {
      req.write(typeof data === 'string' ? data : JSON.stringify(data));
    }
    
    req.end();
  });
}

// 构建CORS响应
function buildCorsResponse() {
  return {
    statusCode: 200,
    headers: {
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'POST, GET, OPTIONS',
      'Access-Control-Allow-Headers': 'Content-Type, x-app-id'
    },
    body: ''
  };
}

// 创建响应
function createResponse(statusCode, data, headers = {}) {
  return {
    statusCode,
    headers: {
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'POST, GET, OPTIONS',
      'Access-Control-Allow-Headers': 'Content-Type, x-app-id',
      ...headers
    },
    body: JSON.stringify(data)
  };
}

// 安全解析JSON
function safeJsonParse(jsonString) {
  try {
    return JSON.parse(jsonString);
  } catch (e) {
    return null;
  }
}

// 过滤请求头
function filterHeaders(headers) {
  const filtered = {};
  for (const [key, value] of Object.entries(headers)) {
    if (!CONFIG.HEADER_BLACKLIST.includes(key.toLowerCase())) {
      filtered[key] = value;
    }
  }
  return filtered;
}

// 确定内容类型
function determineContentType(headers) {
  if (headers['Content-Type']) {
    return headers['Content-Type'];
  }
  return 'application/json';
}

// 构建请求数据
function buildRequestData(contentType, data, originalBody) {
  if (contentType === 'application/json') {
    return data;
  }
  return originalBody;
}