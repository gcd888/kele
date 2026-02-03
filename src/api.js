// 导入数据
import { cloudTypes } from './data.js';

// 生成搜索token
function generateSearchToken(keyword, timestamp) {
    // 如果未提供时间戳，使用当前时间戳
    const ts = timestamp || Date.now();
    
    // 1. 拼接字符串：关键词:时间戳
    const rawString = `${keyword}:${ts}`;
    
    // 2. URL编码
    const encodedString = encodeURIComponent(rawString);
    
    // 3. Base64编码（浏览器环境）
    const token = btoa(encodedString);
    
    return token;
}

// 根据链接域名判断网盘类型
function getCloudTypeByUrl(url, defaultType, cloudTypes = []) {
    // 从cloudTypes数组中获取判断逻辑
    for (const type of cloudTypes) {
        if (type.url && url.includes(type.url)) {
            return type.cloudType;
        }
    }
    return defaultType;
}

// 搜索API 1: 聚合网盘搜索接口
async function searchApi1(searchTerm, selectedFilter, url) {
    try {
        // 构建API请求参数
        let cloudTypes = '';
        if (selectedFilter === 'all') {
            // 如果选择全部，则包含百度网盘、夸克网盘、UC网盘、阿里网盘、迅雷网盘、天翼网盘
            cloudTypes = 'baidu,quark,uc,aliyun,xunlei,tianyi';
        } else {
            // 直接使用selectedFilter参数，因为下拉框的值和参数完全一致
            cloudTypes = selectedFilter || '';
        }
        
        // 构建API请求URL
        const apiUrl = `${url}?kw=${encodeURIComponent(searchTerm)}${cloudTypes ? `&cloud_types=${cloudTypes}` : ''}`;
        
        // 发送API请求
        const response = await fetch(apiUrl);
        if (!response.ok) {
            throw new Error('网络请求失败');
        }
        
        const data = await response.json();
        if (data.code !== 0) {
            throw new Error(data.message || '搜索失败');
        }
        
        // 转换结果结构
        const results = [];
        if (data.data && data.data.merged_by_type) {
            Object.entries(data.data.merged_by_type).forEach(([type, items]) => {
                if (items && items.length > 0) {
                    items.forEach(item => {
                        // 根据链接域名判断网盘类型
                        const cloudTypeByUrl = getCloudTypeByUrl(item.url, type, cloudTypes);
                        
                        results.push({
                            id: Date.now() + Math.random(),
                            url: item.url,
                            password: item.password,
                            note: item.note,
                            datetime: item.datetime,
                            source: item.source,
                            images: item.images || [],
                            cloudType: cloudTypeByUrl,
                            apiSource: 'api1'
                        });
                    });
                }
            });
        }
        
        return results;
    } catch (error) {
        console.error('搜索API 1错误:', error);
        return [];
    }
}

// 搜索API 2: 聚合网盘搜索2
async function searchApi2(searchTerm, url) {
    try {
        // 构建API请求参数
        const formData = new URLSearchParams();
        formData.append('name', searchTerm);
        formData.append('token', 'i69');
        
        // 发送API请求
        const response = await fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: formData
        });
        
        if (!response.ok) {
            throw new Error('网络请求失败');
        }
        
        const data = await response.json();
        if (!data.us || !data.list) {
            throw new Error(data.msg || '搜索失败');
        }
        
        // 转换结果结构
        const results = [];
        data.list.forEach(item => {
            // 解析answer中的链接
            const links = item.answer.split('\n').filter(line => line.includes('链接：'));
            links.forEach(linkLine => {
                const urlMatch = linkLine.match(/链接：(https?:\/\/[^\s]+)/);
                if (urlMatch) {
                    const url = urlMatch[1];
                    // 解析提取码
                    const passwordMatch = linkLine.match(/提取码：([^\s]+)/);
                    const password = passwordMatch ? passwordMatch[1] : '';
                    
                    // 根据链接域名判断网盘类型
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed', cloudTypes);
                    
                    results.push({
                        id: item.id,
                        url: url,
                        password: password,
                        note: item.question,
                        datetime: new Date().toISOString(),
                        source: '聚合网盘搜索2',
                        images: item.bd_pic ? [item.bd_pic] : [],
                        cloudType: cloudTypeByUrl,
                        apiSource: 'api2'
                    });
                }
            });
        });
        
        return results;
    } catch (error) {
        console.error('搜索API 2错误:', error);
        return [];
    }
}

// 搜索API 3: 聚合网盘搜索3
async function searchApi3(searchTerm, url) {
    try {
        // 生成动态token
        const token = generateSearchToken(searchTerm);
        
        // 构建API请求URL
        const apiUrl = `${url}?name=${encodeURIComponent(searchTerm)}&page=1&pageSize=100`;
        
        // 发送API请求
        const response = await fetch(apiUrl, {
            method: 'GET',
            headers: {
                'x-api-key': token
            }
        });
        
        if (!response.ok) {
            throw new Error('网络请求失败');
        }
        
        const data = await response.json();
        if (!data.data) {
            throw new Error('搜索失败');
        }
        
        // 转换结果结构
        const results = [];
        data.data.forEach(item => {
            // 解析content中的链接
            const links = item.content.split('\n').filter(line => line.includes('链接：'));
            links.forEach(linkLine => {
                const urlMatch = linkLine.match(/链接：(https?:\/\/[^\s]+)/);
                if (urlMatch) {
                    const url = urlMatch[1];
                    // 解析提取码
                    const passwordMatch = linkLine.match(/提取码：([^\s]+)/);
                    const password = passwordMatch ? passwordMatch[1] : '';
                    
                    // 根据链接域名判断网盘类型
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed', cloudTypes);
                    
                    results.push({
                        id: item.id,
                        url: url,
                        password: password,
                        note: item.title,
                        datetime: item.updatedAt || new Date().toISOString(),
                        source: '聚合网盘搜索3',
                        images: item.coverUrl ? [item.coverUrl] : [],
                        cloudType: cloudTypeByUrl,
                        apiSource: 'api3'
                    });
                }
            });
        });
        
        return results;
    } catch (error) {
        console.error('搜索API 3错误:', error);
        return [];
    }
}

// 搜索API 4: 聚合网盘搜索4
async function searchApi4(searchTerm, url) {
    try {
        // 生成动态token
        const token = generateSearchToken(searchTerm);
        
        // 构建API请求URL
        const apiUrl = `${url}?name=${encodeURIComponent(searchTerm)}`;
        
        // 发送API请求
        const response = await fetch(apiUrl, {
            method: 'GET',
            headers: {
                'x-api-key': token
            }
        });
        
        if (!response.ok) {
            throw new Error('网络请求失败');
        }
        
        const data = await response.json();
        if (!Array.isArray(data)) {
            throw new Error('搜索失败');
        }
        
        // 转换结果结构
        const results = [];
        data.forEach(sourceItem => {
            if (sourceItem.data && Array.isArray(sourceItem.data)) {
                sourceItem.data.forEach(item => {
                    // 解析content中的链接
                    const links = item.content.split('\n').filter(line => line.includes('链接'));
                    links.forEach(linkLine => {
                        const urlMatch = linkLine.match(/链接[:：]\s*(https?:\/\/[^\s]+)/);
                        if (urlMatch) {
                            const url = urlMatch[1];
                            // 解析提取码
                            const passwordMatch = linkLine.match(/提取码[:：]\s*([^\s]+)/);
                            const password = passwordMatch ? passwordMatch[1] : '';
                            
                            // 根据链接域名判断网盘类型
                            const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed', cloudTypes);
                            
                            results.push({
                                id: item.id,
                                url: url,
                                password: password,
                                note: item.title || item.content.split('\n')[0],
                                datetime: new Date().toISOString(),
                                source: `聚合网盘搜索4 (${sourceItem.source})`,
                                images: [],
                                cloudType: cloudTypeByUrl,
                                apiSource: 'api4'
                            });
                        }
                    });
                });
            }
        });
        
        return results;
    } catch (error) {
        console.error('搜索API 4错误:', error);
        return [];
    }
}

// 搜索API 99: 获取热播影视数据
async function searchApi99(type, url) {
    try {
        // 构建API请求URL
        const apiUrl = `${url}?type=${type}`;
        
        // 发送API请求
        const response = await fetch(apiUrl);
        if (!response.ok) {
            throw new Error('网络请求失败');
        }
        
        const data = await response.json();
        if (!data.data) {
            throw new Error('获取热播数据失败');
        }
        
        return data.data;
    } catch (error) {
        console.error('搜索API 99错误:', error);
        return [];
    }
}

// 搜索API 5: 聚合网盘搜索5
async function searchApi5(searchTerm, url) {
    try {
        // 构建API请求参数
        const formData = new URLSearchParams();
        formData.append('name', searchTerm);
        formData.append('token', 'i69');
        
        // 发送API请求
        const response = await fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: formData
        });
        
        if (!response.ok) {
            throw new Error('网络请求失败');
        }
        
        const data = await response.json();
        if (!data.us || !data.list) {
            throw new Error(data.msg || '搜索失败');
        }
        
        // 转换结果结构
        const results = [];
        data.list.forEach(item => {
            // 解析answer中的链接
            const links = item.answer.split('\n').filter(line => line.includes('链接: '));
            links.forEach(linkLine => {
                const urlMatch = linkLine.match(/链接: (https?:\/\/[^\s]+)/);
                if (urlMatch) {
                    const url = urlMatch[1];
                    // 解析提取码
                    const passwordMatch = linkLine.match(/提取码: ([^\s]+)/);
                    const password = passwordMatch ? passwordMatch[1] : '';
                    
                    // 根据链接域名判断网盘类型
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed', cloudTypes);
                    
                    results.push({
                        id: item.id,
                        url: url,
                        password: password,
                        note: item.answer.split('\n')[0],
                        datetime: new Date().toISOString(),
                        source: '聚合网盘搜索5',
                        images: [],
                        cloudType: cloudTypeByUrl,
                        apiSource: 'api5'
                    });
                }
            });
        });
        
        return results;
    } catch (error) {
        console.error('搜索API 5错误:', error);
        return [];
    }
}

// 搜索API 6: 聚合网盘搜索6
async function searchApi6(searchTerm, url) {
    try {
        // 生成动态token
        const token = generateSearchToken(searchTerm);
        
        // 构建API请求URL
        const apiUrl = `${url}?name=${encodeURIComponent(searchTerm)}&page=1&pageSize=100`;
        
        // 发送API请求
        const response = await fetch(apiUrl, {
            method: 'GET',
            headers: {
                'x-api-key': token
            }
        });
        
        if (!response.ok) {
            throw new Error('网络请求失败');
        }
        
        const data = await response.json();
        if (!data.data) {
            throw new Error('搜索失败');
        }
        
        // 转换结果结构
        const results = [];
        data.data.forEach(item => {
            // 解析content中的链接
            const links = item.content.split('\n').filter(line => line.includes('链接：'));
            links.forEach(linkLine => {
                const urlMatch = linkLine.match(/链接：(https?:\/\/[^\s]+)/);
                if (urlMatch) {
                    const url = urlMatch[1];
                    // 解析提取码
                    const passwordMatch = linkLine.match(/提取码：([^\s]+)/);
                    const password = passwordMatch ? passwordMatch[1] : '';
                    
                    // 根据链接域名判断网盘类型
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed', cloudTypes);
                    
                    results.push({
                        id: item.id,
                        url: url,
                        password: password,
                        note: item.title,
                        datetime: item.updatedAt || new Date().toISOString(),
                        source: '聚合网盘搜索6',
                        images: item.coverUrl ? [item.coverUrl] : [],
                        cloudType: cloudTypeByUrl,
                        apiSource: 'api6'
                    });
                }
            });
        });
        
        return results;
    } catch (error) {
        console.error('搜索API 6错误:', error);
        return [];
    }
}

// 搜索API 7: 聚合网盘搜索7
async function searchApi7(searchTerm, url) {
    try {
        // 构建API请求参数
        const formData = new URLSearchParams();
        formData.append('name', searchTerm);
        formData.append('token', 'i69');
        
        // 发送API请求
        const response = await fetch(url, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/x-www-form-urlencoded'
            },
            body: formData
        });
        
        if (!response.ok) {
            throw new Error('网络请求失败');
        }
        
        const data = await response.json();
        if (!data.us || !data.list) {
            throw new Error(data.msg || '搜索失败');
        }
        
        // 转换结果结构
        const results = [];
        data.list.forEach(item => {
            // 解析answer中的链接
            const links = item.answer.split('\n').filter(line => line.includes('链接: '));
            links.forEach(linkLine => {
                const urlMatch = linkLine.match(/链接: (https?:\/\/[^\s]+)/);
                if (urlMatch) {
                    const url = urlMatch[1];
                    // 解析提取码
                    const passwordMatch = linkLine.match(/提取码: ([^\s]+)/);
                    const password = passwordMatch ? passwordMatch[1] : '';
                    
                    // 根据链接域名判断网盘类型
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed', cloudTypes);
                    
                    results.push({
                        id: item.id,
                        url: url,
                        password: password,
                        note: item.answer.split('\n')[0],
                        datetime: new Date().toISOString(),
                        source: '聚合网盘搜索7',
                        images: [],
                        cloudType: cloudTypeByUrl,
                        apiSource: 'api7'
                    });
                }
            });
        });
        
        return results;
    } catch (error) {
        console.error('搜索API 7错误:', error);
        return [];
    }
}

// 导出方法
const apiFunctions = {
    generateSearchToken,
    getCloudTypeByUrl,
    searchApi1,
    searchApi2,
    searchApi3,
    searchApi4,
    searchApi5,
    searchApi6,
    searchApi7,
    searchApi99
};

export default apiFunctions;
export {
    generateSearchToken,
    getCloudTypeByUrl,
    searchApi1,
    searchApi2,
    searchApi3,
    searchApi4,
    searchApi5,
    searchApi6,
    searchApi7,
    searchApi99
};