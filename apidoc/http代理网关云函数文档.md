```javascript
const http = require('http');
const https = require('https');
const { URL } = require('url');

exports.main = async (event) => {
    // ========== 鉴权逻辑新增部分 ========== //
    const APP_ID_SECRET = process.env.APP_ID || 'C5C2IahEaBlaXuxwEOzTKD0j4qb19cr9'; // 从环境变量读取[5]
    
    // 获取请求头并兼容大小写
    const clientAppId = event.headers?.['x-app-id'] || event.headers?.['X-App-Id'];
    
    // 鉴权失败处理逻辑
    if (!clientAppId || clientAppId !== APP_ID_SECRET) {
        return {
            statusCode: 401,
            headers: {
                'Access-Control-Allow-Origin': '*',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ 
                code: 401,
                error: 'Unauthorized: Missing or invalid X-App-Id header' 
            })
        };
    }
    // ========== 鉴权结束 ========== //

    // 解析请求体参数
    let requestConfig;
    try {
        requestConfig = JSON.parse(event.body);
    } catch (error) {
        return {
            statusCode: 400,
            headers: { 'Access-Control-Allow-Origin': '*' },
            body: JSON.stringify({ error: "Invalid JSON format in body" })
        };
    }

    // 校验必填参数
    const { url, method = 'GET', headers = {}, body = '' } = requestConfig;
    if (!url) {
        return {
            statusCode: 400,
            headers: { 'Access-Control-Allow-Origin': '*' },
            body: JSON.stringify({ error: "Missing 'url' in request body" })
        };
    }

    // 解析目标 URL 并选择协议模块
    let parsedUrl;
    try {
        parsedUrl = new URL(url);
    } catch (error) {
        return {
            statusCode: 400,
            headers: { 'Access-Control-Allow-Origin': '*' },
            body: JSON.stringify({ error: "Invalid URL format" })
        };
    }
    const protocolModule = parsedUrl.protocol === 'https:' ? https : http;

    // 配置请求选项
    const options = {
        hostname: parsedUrl.hostname,
        path: parsedUrl.pathname + parsedUrl.search,
        port: parsedUrl.port || (parsedUrl.protocol === 'https:' ? 443 : 80),
        method: method.toUpperCase(),
        headers: {
            ...headers,
            'Content-Length': Buffer.byteLength(body)
        }
    };

    // 处理跨域响应头和 OPTIONS 预检
    const corsHeaders = {
        'Access-Control-Allow-Origin': '*',
        'Access-Control-Allow-Methods': 'GET, POST, OPTIONS',
        'Access-Control-Allow-Headers': 'Content-Type, X-App-Id'
    };
    if (event.httpMethod === 'OPTIONS') {
        return { statusCode: 200, headers: corsHeaders, body: '' };
    }

    // 发起请求
    return new Promise((resolve, reject) => {
        const req = protocolModule.request(options, (res) => {
            let data = '';
            res.on('data', chunk => data += chunk);
            res.on('end', () => {
                resolve({
                    statusCode: res.statusCode,
                    headers: { ...res.headers, ...corsHeaders },
                    body: data
                });
            });
        });

        req.on('error', error => {
            reject({
                statusCode: 500,
                headers: corsHeaders,
                body: JSON.stringify({ error: error.message })
            });
        });

        if (['POST', 'PUT', 'PATCH'].includes(method.toUpperCase())) {
            req.write(body);
        }
        req.end();
    });
};
```