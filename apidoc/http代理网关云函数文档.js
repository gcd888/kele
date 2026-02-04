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
                error: '未经授权：X-App-Id 标头缺失或无效'
            })
        };
    }
    // ========== 鉴权结束 ========== //

    // 解析请求体参数
    let requestConfig = {};
    try {
        requestConfig = JSON.parse(event.body);
        console.log('解析后的requestConfig:', requestConfig);
    } catch (error) {
        console.error('解析请求体失败:', error);
        return {
            statusCode: 400,
            headers: { 'Access-Control-Allow-Origin': '*' },
            body: JSON.stringify({
                error: "body中的 JSON 格式无效",
                details: error.message,
                receivedBodyType: typeof event.body,
                bodySample: event.body ? String(event.body).substring(0, 200) : "head"+event.headers
            })
        };
    }

    // 校验必填参数
    const { url, method = 'GET', headers = {}, body = '' } = requestConfig;
    if (!url) {
        return {
            statusCode: 400,
            headers: { 'Access-Control-Allow-Origin': '*' },
            body: JSON.stringify({ error: "请求body中缺少“url”" })
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
            body: JSON.stringify({ error: "网址格式无效" })
        };
    }
    const protocolModule = parsedUrl.protocol === 'https:' ? https : http;

    // 配置请求选项
    const requestBody = body || '';
    // 添加浏览器模拟请求头
    const defaultHeaders = {
        'User-Agent': 'Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36',
        'Accept': 'text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8',
        'Accept-Language': 'zh-CN,zh;q=0.8,en-US;q=0.5,en;q=0.3',
        'Accept-Encoding': 'gzip, deflate, br',
        'Connection': 'keep-alive',
        'Upgrade-Insecure-Requests': '1',
        ...headers
    };
    const options = {
        hostname: parsedUrl.hostname,
        path: parsedUrl.pathname + parsedUrl.search,
        port: parsedUrl.port || (parsedUrl.protocol === 'https:' ? 443 : 80),
        method: method.toUpperCase(),
        headers: {
            ...defaultHeaders,
            'Content-Length': Buffer.byteLength(requestBody)
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
            // 处理重定向
            if ([301, 302, 303, 307, 308].includes(res.statusCode) && res.headers.location) {
                console.log('处理重定向:', res.headers.location);
                // 构建重定向URL
                let redirectUrl = res.headers.location;
                // 如果是相对路径，需要拼接完整URL
                if (!redirectUrl.startsWith('http')) {
                    redirectUrl = `${parsedUrl.protocol}//${parsedUrl.host}${redirectUrl}`;
                }
                
                // 检查原URL是否有提取码，重定向URL是否没有提取码
                // 从原URL中提取提取码
                const originalUrlParams = new URL(url).searchParams;
                const originalPassword = originalUrlParams.get('pwd');
                console.log('原URL提取码:', originalPassword);
                
                // 检查重定向URL是否包含提取码
                const redirectUrlObj = new URL(redirectUrl);
                const hasPasswordInRedirect = redirectUrlObj.searchParams.has('pwd') || redirectUrl.includes('提取码');
                console.log('重定向URL是否包含提取码:', hasPasswordInRedirect);
                
                // 如果原URL有提取码但重定向URL没有，则在重定向URL中添加提取码
                if (originalPassword && !hasPasswordInRedirect) {
                    console.log('原URL有提取码，重定向URL没有，准备拼接提取码');
                    redirectUrlObj.searchParams.append('pwd', originalPassword);
                    redirectUrl = redirectUrlObj.toString();
                    console.log('拼接提取码后的重定向URL:', redirectUrl);
                }
                
                // 重新发起请求到重定向URL
                const redirectParsedUrl = new URL(redirectUrl);
                const redirectProtocolModule = redirectParsedUrl.protocol === 'https:' ? https : http;
                const redirectOptions = {
                    hostname: redirectParsedUrl.hostname,
                    path: redirectParsedUrl.pathname + redirectParsedUrl.search,
                    port: redirectParsedUrl.port || (redirectParsedUrl.protocol === 'https:' ? 443 : 80),
                    method: 'GET', // 重定向通常使用GET方法
                    headers: {
                        ...headers,
                        'Content-Length': 0
                    }
                };
                
                console.log('发起重定向请求:', redirectUrl);
                const redirectReq = redirectProtocolModule.request(redirectOptions, (redirectRes) => {
                    let redirectData = '';
                    redirectRes.on('data', chunk => redirectData += chunk);
                    redirectRes.on('end', () => {
                        resolve({
                            statusCode: redirectRes.statusCode,
                            headers: { ...redirectRes.headers, ...corsHeaders },
                            body: redirectData
                        });
                    });
                });
                
                redirectReq.on('error', error => {
                    reject({
                        statusCode: 500,
                        headers: corsHeaders,
                        body: JSON.stringify({ 自定义error: error.message })
                    });
                });
                
                redirectReq.end();
            } else {
                // 正常响应处理
                let data = '';
                res.on('data', chunk => data += chunk);
                res.on('end', () => {
                    resolve({
                        statusCode: res.statusCode,
                        headers: { ...res.headers, ...corsHeaders },
                        body: data
                    });
                });
            }
        });

        req.on('error', error => {
            reject({
                statusCode: 500,
                headers: corsHeaders,
                body: JSON.stringify({ 自定义error: error.message })
            });
        });

        if (['POST', 'PUT', 'PATCH'].includes(method.toUpperCase())) {
            req.write(requestBody);
        }
        req.end();
    });
};
