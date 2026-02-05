const https = require('https');
const { URL } = require('url');

const CONFIG = {
  APP_ID: process.env.X_APP_ID || 'C5C2IahEaBlaXuxwEOzTKD0j4qb19cr9',
  HEADER_BLACKLIST: [
    'host', 'origin', 'referer', 'cookie',
    'content-length', 'accept-encoding'
  ],
  TIMEOUT: parseInt(process.env.TIMEOUT) || 5000
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
    const { targetUrl, headers = {}, query = {} } = requestBody;
    
    // 校验必填参数
    if (!targetUrl) {
      return createResponse(400, { code: 'MISSING_URL', message: '缺少 targetUrl 参数' });
    }
    if (typeof query !== 'object') {
      return createResponse(400, { code: 'INVALID_QUERY', message: 'query 参数必须是对象' });
    }

    // 校验URL合法性
    let parsedUrl;
    try {
      parsedUrl = new URL(targetUrl);
      if (!['http:', 'https:'].includes(parsedUrl.protocol)) {
        return createResponse(400, { code: 'INVALID_PROTOCOL', message: '仅支持 HTTP/HTTPS 协议' });
      }
    } catch (e) {
      return createResponse(400, { code: 'INVALID_URL', message: '目标URL格式无效' });
    }

    // 阶段4：构建请求
    const filteredHeaders = filterHeaders(headers);
    const queryString = new URLSearchParams(query).toString();
    const finalUrl = queryString ? `${targetUrl}?${queryString}` : targetUrl;

    // 阶段5：执行请求
    const response = await sendHttpRequest(finalUrl, {
      method: 'GET',
      headers: filteredHeaders
    });

    // 阶段6：返回响应
    return createResponse(response.status, response.data, {
      'Content-Type': response.headers['content-type']
    });

  } catch (error) {
    console.error('全局捕获错误:', error);
    return createResponse(error.statusCode || 500, { 
      code: error.code || 'SERVER_ERROR',
      message: error.message || '服务端处理异常'
    });
  }
};

// --------------------- 核心工具函数 ---------------------
function sendHttpRequest(url, options) {
  return new Promise((resolve, reject) => {
    const parsedUrl = new URL(url);
    
    const requestOptions = {
      hostname: parsedUrl.hostname,
      port: parsedUrl.port || 443,
      path: parsedUrl.pathname + parsedUrl.search,
      method: options.method,
      headers: options.headers
    };

    const req = https.request(requestOptions, (res) => {
      let chunks = [];
      let size = 0;

      res.on('data', (chunk) => {
        chunks.push(chunk);
        size += chunk.length;
      });

      res.on('end', () => {
        const buffer = Buffer.concat(chunks, size);
        const contentType = res.headers['content-type'] || '';
        const data = contentType.includes('json') 
          ? safeJsonParse(buffer.toString()) 
          : buffer.toString();

        resolve({
          status: res.statusCode,
          headers: res.headers,
          data
        });
      });
    });

    req.setTimeout(CONFIG.TIMEOUT, () => {
      req.destroy(new Error(`请求超时（${CONFIG.TIMEOUT}ms）`));
    });

    req.on('error', (err) => {
      reject({
        code: 'REQUEST_FAILED',
        message: `请求失败: ${err.message}`,
        statusCode: 504
      });
    });

    req.end();
  });
}

// --------------------- 通用工具函数 ---------------------
function buildCorsResponse() {
  return {
    statusCode: 200,
    headers: {
      'Access-Control-Allow-Origin': '*',
      'Access-Control-Allow-Methods': 'POST, OPTIONS',
      'Access-Control-Allow-Headers': 'Content-Type, X-App-Id'
    },
    body: ''
  };
}

function createResponse(statusCode, body, customHeaders = {}) {
  return {
    statusCode,
    headers: {
      'Content-Type': 'application/json',
      'Access-Control-Allow-Origin': '*',
      ...customHeaders
    },
    body: JSON.stringify(body)
  };
}

function safeJsonParse(str) {
  try {
    return JSON.parse(str);
  } catch (e) {
    return null;
  }
}

function filterHeaders(headers) {
  return Object.entries(headers).reduce((acc, [key, value]) => {
    if (!CONFIG.HEADER_BLACKLIST.includes(key.toLowerCase())) {
      acc[key] = value;
    }
    return acc;
  }, {});
}