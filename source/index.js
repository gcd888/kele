// 页面加载完成后执行
window.addEventListener('DOMContentLoaded', function() {
    // 初始化时间显示
    updateTime();
    setInterval(updateTime, 1000);

    // 初始化模式切换功能
    initModeToggle();

    // 初始化网盘筛选功能
    initFilterButtons();

    // 初始化搜索功能
    initSearchFunction();

    // 初始化热搜资源
    initHotSearch();
});

// 更新当前时间
function updateTime() {
    const now = new Date();
    const year = now.getFullYear();
    const month = String(now.getMonth() + 1).padStart(2, '0');
    const day = String(now.getDate()).padStart(2, '0');
    const hours = String(now.getHours()).padStart(2, '0');
    const minutes = String(now.getMinutes()).padStart(2, '0');
    const seconds = String(now.getSeconds()).padStart(2, '0');
    
    const timeString = `${year}-${month}-${day} ${hours}:${minutes}:${seconds}`;
    document.getElementById('timeDisplay').textContent = timeString;
}

// 初始化模式切换功能
function initModeToggle() {
    const modeToggle = document.getElementById('modeToggle');
    const modeText = document.getElementById('modeText');
    const body = document.body;
    
    // 检查本地存储中的模式偏好
    //const savedMode = localStorage.getItem('mode');
    const savedMode = false;
    
    // 如果没有保存的偏好，则根据当前时间设置默认模式
    if (!savedMode) {
        const now = new Date();
        const hour = now.getHours();
        
        // 早上8点到晚上8点为白天模式，其他时间为夜晚模式
        if (hour < 8 || hour >= 20) {
            body.classList.add('dark-mode');
            modeText.textContent = '日间模式';
            localStorage.setItem('mode', 'dark');
        } else {
            modeText.textContent = '黑夜模式';
            localStorage.setItem('mode', 'light');
        }
    } else if (savedMode === 'dark') {
        body.classList.add('dark-mode');
        modeText.textContent = '日间模式';
    } else {
        modeText.textContent = '黑夜模式';
    }
    
    // 点击切换按钮
    modeToggle.addEventListener('click', function() {
        body.classList.toggle('dark-mode');
        
        if (body.classList.contains('dark-mode')) {
            modeText.textContent = '日间模式';
            localStorage.setItem('mode', 'dark');
        } else {
            modeText.textContent = '黑夜模式';
            localStorage.setItem('mode', 'light');
        }
    });
}

// 初始化网盘筛选按钮
function initFilterButtons() {
    const filterButtons = document.querySelectorAll('.filter-btn');
    
    filterButtons.forEach(button => {
        button.addEventListener('click', function() {
            // 移除所有按钮的active类
            filterButtons.forEach(btn => btn.classList.remove('active'));
            // 为当前点击的按钮添加active类
            this.classList.add('active');
        });
    });
}

// 初始化搜索功能
function initSearchFunction() {
    const searchBtn = document.getElementById('searchBtn');
    const searchInput = document.getElementById('searchInput');
    
    // 点击搜索按钮
    searchBtn.addEventListener('click', function() {
        performSearch();
    });
    
    // 按回车键搜索
    searchInput.addEventListener('keypress', function(e) {
        if (e.key === 'Enter') {
            performSearch();
        }
    });
}

// 格式化时间为yyyy-MM-dd hh:mm:sss格式
function formatDateTime(dateTimeStr) {
    try {
        const date = new Date(dateTimeStr);
        const year = date.getFullYear();
        const month = String(date.getMonth() + 1).padStart(2, '0');
        const day = String(date.getDate()).padStart(2, '0');
        const hours = String(date.getHours()).padStart(2, '0');
        const minutes = String(date.getMinutes()).padStart(2, '0');
        const seconds = String(date.getSeconds()).padStart(2, '0');
        return `${year}-${month}-${day} ${hours}:${minutes}:${seconds}`;
    } catch (error) {
        return '';
    }
}

// 根据链接域名判断网盘类型
function getCloudTypeByUrl(url, defaultType) {
    if (url.includes('https://www.alipan.com')) {
        return 'aliyun';
    } else if (url.includes('https://pan.baidu.com')) {
        return 'baidu';
    } else if (url.includes('https://pan.quark.cn')) {
        return 'quark';
    } else if (url.includes('https://drive.uc.cn')) {
        return 'uc';
    } else if (url.includes('https://pan.xunlei.com')) {
        return 'xunlei';
    } else if (url.includes('https://cloud.189.cn')) {
        return 'tianyi';
    }
    return defaultType;
}

// 执行搜索
async function performSearch() {
    const searchTerm = document.getElementById('searchInput').value.trim();
    const selectedFilter = document.querySelector('.filter-btn.active').dataset.filter;
    
    if (!searchTerm) {
        alert('请输入搜索关键词');
        return;
    }
    
    // 显示加载指示器
    showLoadingIndicator();
    
    try {
        // 并行调用多个API
        const [api1Results, api2Results, api3Results, api4Results, api5Results, api6Results, api7Results] = await Promise.allSettled([
            searchApi1(searchTerm, selectedFilter),
            searchApi2(searchTerm),
            searchApi3(searchTerm),
            searchApi4(searchTerm),
            searchApi5(searchTerm),
            searchApi6(searchTerm),
            searchApi7(searchTerm)
        ]);
        
        // 汇总所有成功的结果
        const allResults = [];
        
        if (api1Results.status === 'fulfilled' && api1Results.value) {
            allResults.push(...api1Results.value);
        }
        
        if (api2Results.status === 'fulfilled' && api2Results.value) {
            allResults.push(...api2Results.value);
        }
        
        if (api3Results.status === 'fulfilled' && api3Results.value) {
            allResults.push(...api3Results.value);
        }
        
        if (api4Results.status === 'fulfilled' && api4Results.value) {
            allResults.push(...api4Results.value);
        }
        
        if (api5Results.status === 'fulfilled' && api5Results.value) {
            allResults.push(...api5Results.value);
        }
        
        if (api6Results.status === 'fulfilled' && api6Results.value) {
            allResults.push(...api6Results.value);
        }
        
        if (api7Results.status === 'fulfilled' && api7Results.value) {
            allResults.push(...api7Results.value);
        }
        
        // 根据筛选条件过滤结果
        let filteredResults = allResults;
        if (selectedFilter !== 'all') {
            filteredResults = allResults.filter(result => result.cloudType === selectedFilter);
        }
        
        // 过滤和排序结果
        filteredResults = processSearchResults(filteredResults, searchTerm);
        
        // 显示汇总结果
        displayCombinedSearchResults(filteredResults);
    } catch (error) {
        // 显示错误信息
        showErrorMessage('搜索失败，请稍后重试');
        console.error('搜索错误:', error);
    }
}

// 处理搜索结果：过滤无效链接并排序
function processSearchResults(results, searchTerm) {
    // 移除searchTerm中的数字，例如"罚罪2"变成"罚罪"
    const searchTermWithoutNumbers = searchTerm.replace(/\d+/g, '').trim();
    
    // 过滤逻辑：note的前30个字符如果没有包含用户搜索输入值（移除数字后），则过滤掉
    let filteredResults = results.filter(result => {
        const notePrefix = (result.note || '').substring(0, 30);
        return notePrefix.includes(searchTermWithoutNumbers);
    });
    
    // 如果过滤后的结果为0，则移除过滤条件
    if (filteredResults.length === 0) {
        filteredResults = results;
    }
    
    // 排序逻辑：根据note中包含的关键词排序
    const priorityKeywords = ['4K', '臻彩', '高码率', '高清', 'HDR', '超前完结', '全集', '完结'];
    
    filteredResults.sort((a, b) => {
        const aNote = a.note || '';
        const bNote = b.note || '';
        
        // 计算a和b在优先级列表中的位置
        let aPriority = Infinity;
        let bPriority = Infinity;
        
        for (let i = 0; i < priorityKeywords.length; i++) {
            if (aNote.includes(priorityKeywords[i])) {
                aPriority = i;
                break;
            }
        }
        
        for (let i = 0; i < priorityKeywords.length; i++) {
            if (bNote.includes(priorityKeywords[i])) {
                bPriority = i;
                break;
            }
        }
        
        // 优先级高的排前面
        if (aPriority !== bPriority) {
            return aPriority - bPriority;
        }
        
        // 如果优先级相同，则按时间排序（如果有时间）
        if (a.datetime && b.datetime) {
            return new Date(b.datetime) - new Date(a.datetime);
        }
        
        return 0;
    });
    
    return filteredResults;
}

// 搜索API 1: 聚合网盘搜索接口
async function searchApi1(searchTerm, selectedFilter) {
    try {
        // 构建API请求参数
        let cloudTypes = '';
        if (selectedFilter === 'all') {
            // 如果选择全部，则包含百度网盘、夸克网盘、UC网盘、阿里网盘、迅雷网盘、天翼网盘
            cloudTypes = 'baidu,quark,uc,aliyun,xunlei,tianyi';
        } else {
            // 映射筛选器值到API参数
            const filterMap = {
                'baidu': 'baidu',
                'aliyun': 'aliyun',
                'quark': 'quark',
                'uc': 'uc',
                'xunlei': 'xunlei',
                'tianyi': 'tianyi'
            };
            cloudTypes = filterMap[selectedFilter] || '';
        }
        
        // 构建API请求URL
        const apiUrl = `https://api.iyuns.com/api/wpysso?kw=${encodeURIComponent(searchTerm)}${cloudTypes ? `&cloud_types=${cloudTypes}` : ''}`;
        
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
                        const cloudTypeByUrl = getCloudTypeByUrl(item.url, type);
                        
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
async function searchApi2(searchTerm) {
    try {
        // 构建API请求参数
        const formData = new URLSearchParams();
        formData.append('name', searchTerm);
        formData.append('token', 'i69');
        
        // 发送API请求
        const response = await fetch('http://z.eeeob.com/v/api/search', {
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
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed');
                    
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
async function searchApi3(searchTerm) {
    try {
        // 构建API请求参数
        const formData = new URLSearchParams();
        formData.append('name', searchTerm);
        formData.append('token', 'i69');
        
        // 发送API请求
        const response = await fetch('http://z.eeeob.com/v/api/getJuzi', {
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
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed');
                    
                    results.push({
                        id: item.id,
                        url: url,
                        password: password,
                        note: item.answer.split('\n')[0],
                        datetime: new Date().toISOString(),
                        source: '聚合网盘搜索3',
                        images: [],
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
async function searchApi4(searchTerm) {
    try {
        // 构建API请求参数
        const formData = new URLSearchParams();
        formData.append('name', searchTerm);
        formData.append('token', 'i69');
        
        // 发送API请求
        const response = await fetch('http://z.eeeob.com/v/api/getXiaoyu', {
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
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed');
                    
                    results.push({
                        id: item.id,
                        url: url,
                        password: password,
                        note: item.answer.split('\n')[0],
                        datetime: new Date().toISOString(),
                        source: '聚合网盘搜索4',
                        images: [],
                        cloudType: cloudTypeByUrl,
                        apiSource: 'api4'
                    });
                }
            });
        });
        
        return results;
    } catch (error) {
        console.error('搜索API 4错误:', error);
        return [];
    }
}

// 搜索API 5: 聚合网盘搜索5
async function searchApi5(searchTerm) {
    try {
        // 构建API请求参数
        const formData = new URLSearchParams();
        formData.append('name', searchTerm);
        formData.append('token', 'i69');
        
        // 发送API请求
        const response = await fetch('http://z.eeeob.com/v/api/getDyfx', {
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
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed');
                    
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
async function searchApi6(searchTerm) {
    try {
        // 生成动态token
        const token = generateSearchToken(searchTerm);
        
        // 构建API请求URL
        const apiUrl = `https://m.duoduopuzi.cn/mv/api/movies/search?name=${encodeURIComponent(searchTerm)}&page=1&pageSize=100`;
        
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
                    const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed');
                    
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
async function searchApi7(searchTerm) {
    try {
        // 生成动态token
        const token = generateSearchToken(searchTerm);
        
        // 构建API请求URL
        const apiUrl = `https://m.duoduopuzi.cn/mv/api/crawler/search?name=${encodeURIComponent(searchTerm)}`;
        
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
                            const cloudTypeByUrl = getCloudTypeByUrl(url, 'mixed');
                            
                            results.push({
                                id: item.id,
                                url: url,
                                password: password,
                                note: item.title || item.content.split('\n')[0],
                                datetime: new Date().toISOString(),
                                source: `聚合网盘搜索7 (${sourceItem.source})`,
                                images: [],
                                cloudType: cloudTypeByUrl,
                                apiSource: 'api7'
                            });
                        }
                    });
                });
            }
        });
        
        return results;
    } catch (error) {
        console.error('搜索API 7错误:', error);
        return [];
    }
}

/** 
  * 生成搜索token 
  * @param {string} keyword - 搜索关键词 
  * @param {number} [timestamp] - 可选的时间戳，默认使用当前时间 
  * @returns {string} 生成的token 
  */ 
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

// 显示加载指示器
function showLoadingIndicator() {
    const resultsContainer = document.getElementById('searchResultsContainer');
    const resultsContent = document.getElementById('searchResultsContent');
    
    resultsContent.innerHTML = `
        <div class="loading-indicator">
            <span>正在搜索中，请稍候...</span>
        </div>
    `;
    
    resultsContainer.style.display = 'block';
}

// 显示错误信息
function showErrorMessage(message) {
    const resultsContainer = document.getElementById('searchResultsContainer');
    const resultsContent = document.getElementById('searchResultsContent');
    
    resultsContent.innerHTML = `
        <div class="error-message">
            <span>${message}</span>
        </div>
    `;
    
    resultsContainer.style.display = 'block';
}

// 显示搜索结果
function displaySearchResults(data) {
    const resultsContainer = document.getElementById('searchResultsContainer');
    const resultsContent = document.getElementById('searchResultsContent');
    
    // 清空结果容器
    resultsContent.innerHTML = '';
    
    // 检查是否有搜索结果
    if (!data || !data.merged_by_type || Object.keys(data.merged_by_type).length === 0) {
        resultsContent.innerHTML = `
            <div class="error-message">
                <span>没有找到相关资源</span>
            </div>
        `;
        resultsContainer.style.display = 'block';
        return;
    }
    
    // 构建网盘类型名称映射
    const cloudTypeNameMap = {
        'baidu': '百度网盘',
        'aliyun': '阿里网盘',
        'quark': '夸克网盘',
        'uc': 'UC网盘',
        'tianyi': '天翼网盘',
        'mobile': '移动网盘',
        '115': '115网盘',
        'pikpak': 'PikPak',
        'xunlei': '迅雷网盘',
        '123': '123网盘',
        'magnet': '磁力链接',
        'ed2k': 'ED2K链接'
    };
    
    // 遍历每种网盘类型的结果
    Object.entries(data.merged_by_type).forEach(([type, items]) => {
        if (items && items.length > 0) {
            const categoryDiv = document.createElement('div');
            categoryDiv.className = 'result-category';
            
            // 创建分类标题
            const categoryTitle = document.createElement('h3');
            categoryTitle.textContent = cloudTypeNameMap[type] || type;
            categoryDiv.appendChild(categoryTitle);
            
            // 创建结果列表
            const resultsList = document.createElement('div');
            resultsList.className = 'results-list';
            
            // 遍历每个结果项
            items.forEach(item => {
                const resultItem = document.createElement('div');
                resultItem.className = 'result-item';
                
                // 创建图片容器（无论是否有图片资源）
                const imagesDiv = document.createElement('div');
                imagesDiv.className = 'result-images';
                
                if (item.images && item.images.length > 0) {
                    // 有图片资源，显示实际图片
                    item.images.forEach(imageUrl => {
                        // 创建图片超链接
                        const imgLink = document.createElement('a');
                        imgLink.href = imageUrl;
                        imgLink.target = '_blank';
                        imgLink.rel = 'noopener noreferrer';
                        imgLink.style.textDecoration = 'none';
                        
                        // 创建图片元素
                        const img = document.createElement('img');
                        img.src = imageUrl;
                        img.alt = item.note || '资源图片';
                        img.className = 'result-image';
                        
                        // 组装图片和超链接
                        imgLink.appendChild(img);
                        imagesDiv.appendChild(imgLink);
                    });
                } else {
                    // 没有图片资源，显示可乐.svg
                    const img = document.createElement('img');
                    img.src = 'source/pic/喝完的可乐.svg';
                    img.alt = '可乐';
                    img.className = 'result-image';
                    imagesDiv.appendChild(img);
                }
                
                resultItem.appendChild(imagesDiv);
                
                // 创建结果内容容器
                const contentDiv = document.createElement('div');
                contentDiv.className = 'result-content';
                
                // 创建结果头部（URL和密码）
                const resultHeader = document.createElement('div');
                resultHeader.className = 'result-header';
                
                // 创建URL链接
                const urlLink = document.createElement('a');
                urlLink.className = 'result-url';
                urlLink.href = item.url;
                urlLink.target = '_blank';
                urlLink.rel = 'noopener noreferrer';
                urlLink.textContent = item.url;
                resultHeader.appendChild(urlLink);
                
                // 添加密码（如果有）
                if (item.password) {
                    const passwordSpan = document.createElement('span');
                    passwordSpan.className = 'result-password';
                    passwordSpan.textContent = `密码: ${item.password}`;
                    resultHeader.appendChild(passwordSpan);
                }
                
                contentDiv.appendChild(resultHeader);
                
                // 添加备注（如果有）
                if (item.note) {
                    const noteDiv = document.createElement('div');
                    noteDiv.className = 'result-note';
                    noteDiv.textContent = item.note;
                    contentDiv.appendChild(noteDiv);
                }
                
                // 创建结果元数据
                const metaDiv = document.createElement('div');
                metaDiv.className = 'result-meta';
                
                // 添加来源
                const sourceSpan = document.createElement('span');
                sourceSpan.className = 'result-source';
                sourceSpan.textContent = `来源: ${item.source}`;
                metaDiv.appendChild(sourceSpan);
                
                // 添加时间（如果有）
                if (item.datetime && item.datetime !== '0001-01-01T00:00:00Z') {
                    const timeSpan = document.createElement('span');
                    timeSpan.className = 'result-time';
                    timeSpan.textContent = `时间: ${item.datetime}`;
                    metaDiv.appendChild(timeSpan);
                }
                
                contentDiv.appendChild(metaDiv);
                resultItem.appendChild(contentDiv);
                resultsList.appendChild(resultItem);
            });
            
            categoryDiv.appendChild(resultsList);
            resultsContent.appendChild(categoryDiv);
        }
    });
    
    // 显示结果容器
    resultsContainer.style.display = 'block';
}

// 显示汇总搜索结果
function displayCombinedSearchResults(results) {
    const resultsContainer = document.getElementById('searchResultsContainer');
    const resultsContent = document.getElementById('searchResultsContent');
    
    // 清空结果容器
    resultsContent.innerHTML = '';
    
    // 检查是否有搜索结果
    if (!results || results.length === 0) {
        resultsContent.innerHTML = `
            <div class="error-message">
                <span>没有找到相关资源</span>
            </div>
        `;
        resultsContainer.style.display = 'block';
        return;
    }
    
    // 按网盘类型分组
    const resultsByCloudType = {};
    results.forEach(result => {
        const cloudType = result.cloudType;
        if (!resultsByCloudType[cloudType]) {
            resultsByCloudType[cloudType] = [];
        }
        resultsByCloudType[cloudType].push(result);
    });
    
    // 构建网盘类型名称映射
    const cloudTypeNameMap = {
        'baidu': '百度网盘',
        'aliyun': '阿里网盘',
        'quark': '夸克网盘',
        'uc': 'UC网盘',
        'xunlei': '迅雷网盘',
        'mixed': '混合网盘',
        'tianyi': '天翼网盘',
        'mobile': '移动网盘',
        '115': '115网盘',
        'pikpak': 'PikPak',
        '123': '123网盘',
        'magnet': '磁力链接',
        'ed2k': 'ED2K链接'
    };
    
    // 构建API名称映射
    const apiNameMap = {
        'api1': '聚合网盘搜索1',
        'api2': '聚合网盘搜索2',
        'api3': '聚合网盘搜索3',
        'api4': '聚合网盘搜索4',
        'api5': '聚合网盘搜索5',
        'api6': '聚合网盘搜索6',
        'api7': '聚合网盘搜索7'
    };
    
    // 定义网盘类型的排序顺序
    const cloudTypeOrder = ['quark', 'aliyun', 'baidu', 'uc', 'xunlei', 'tianyi'];
    
    // 对网盘类型进行排序
    const sortedCloudTypes = Object.entries(resultsByCloudType)
        .sort(([typeA], [typeB]) => {
            const indexA = cloudTypeOrder.indexOf(typeA);
            const indexB = cloudTypeOrder.indexOf(typeB);
            if (indexA !== -1 && indexB !== -1) {
                return indexA - indexB;
            } else if (indexA !== -1) {
                return -1;
            } else if (indexB !== -1) {
                return 1;
            }
            return 0;
        });
    
    // 遍历每种网盘类型的结果（按排序顺序）
    sortedCloudTypes.forEach(([type, items]) => {
        if (items && items.length > 0) {
            const categoryDiv = document.createElement('div');
            categoryDiv.className = 'result-category';
            
            // 创建分类标题
            const categoryTitle = document.createElement('h3');
            categoryTitle.textContent = cloudTypeNameMap[type] || type;
            categoryDiv.appendChild(categoryTitle);
            
            // 创建结果列表
            const resultsList = document.createElement('div');
            resultsList.className = 'results-list';
            
            // 遍历每个结果项
            items.forEach(item => {
                const resultItem = document.createElement('div');
                resultItem.className = 'result-item';
                
                // 创建图片容器（无论是否有图片资源）
                const imagesDiv = document.createElement('div');
                imagesDiv.className = 'result-images';
                
                if (item.images && item.images.length > 0) {
                    // 有图片资源，显示实际图片
                    item.images.forEach(imageUrl => {
                        const img = document.createElement('img');
                        img.src = imageUrl;
                        img.alt = item.note || '资源图片';
                        img.className = 'result-image';
                        imagesDiv.appendChild(img);
                    });
                } else {
                    // 没有图片资源，显示可乐.svg
                    const img = document.createElement('img');
                    img.src = 'source/pic/喝完的可乐.svg';
                    img.alt = '可乐';
                    img.className = 'result-image';
                    imagesDiv.appendChild(img);
                }
                
                resultItem.appendChild(imagesDiv);
                
                // 创建结果内容容器
                const contentDiv = document.createElement('div');
                contentDiv.className = 'result-content';
                
                // 左边：链接和名称
                const leftDiv = document.createElement('div');
                leftDiv.className = 'result-content-left';
                
                // 1. 链接
                const urlDiv = document.createElement('div');
                urlDiv.className = 'result-url-container';
                const urlLink = document.createElement('a');
                urlLink.className = 'result-url';
                urlLink.href = item.url;
                urlLink.target = '_blank';
                urlLink.rel = 'noopener noreferrer';
                urlLink.textContent = item.url;
                urlDiv.appendChild(urlLink);
                leftDiv.appendChild(urlDiv);
                
                // 2. 名称（使用note作为名称，最多展示前50个字符）
                const nameDiv = document.createElement('div');
                nameDiv.className = 'result-name';
                const displayName = item.note ? (item.note.length > 50 ? item.note.substring(0, 50) + '...' : item.note) : '';
                //nameDiv.textContent = `名称: ${displayName}`;
                nameDiv.textContent = displayName;
                leftDiv.appendChild(nameDiv);
                
                // 中间：来源
                const middleDiv = document.createElement('div');
                middleDiv.className = 'result-content-middle';
                
                // 3. 来源（对应API名称，使用标签样式）
                const sourceDiv = document.createElement('div');
                sourceDiv.className = 'result-source-container';
                const sourceTag = document.createElement('span');
                sourceTag.className = 'source-tag';
                sourceTag.textContent = apiNameMap[item.apiSource] || item.apiSource;
                sourceDiv.appendChild(sourceTag);
                middleDiv.appendChild(sourceDiv);
                
                // 右边：密码和时间
                const rightDiv = document.createElement('div');
                rightDiv.className = 'result-content-right';
                
                // 4. 密码（使用标签样式，密码不存在时展示透明标签）
                const passwordDiv = document.createElement('div');
                passwordDiv.className = 'result-password-container';
                const passwordTag = document.createElement('span');
                passwordTag.className = 'password-tag';
                if (item.password) {
                    passwordTag.textContent = `提取码：${item.password}`;
                    passwordTag.style.backgroundColor = 'var(--accent-color)';
                    passwordTag.style.color = 'white';
                } else {
                    passwordTag.textContent = '';
                    passwordTag.style.backgroundColor = 'transparent';
                    passwordTag.style.color = 'transparent';
                    passwordTag.style.padding = '4px 12px';
                    passwordTag.style.borderRadius = '16px';
                }
                passwordDiv.appendChild(passwordTag);
                rightDiv.appendChild(passwordDiv);
                
                // 5. 时间（使用标签样式）
                const timeDiv = document.createElement('div');
                timeDiv.className = 'result-time-container';
                const timeTag = document.createElement('span');
                timeTag.className = 'time-tag';
                if (item.datetime && item.datetime !== '0001-01-01T00:00:00Z') {
                    timeTag.textContent = formatDateTime(item.datetime);
                } else {
                    timeTag.textContent = '';
                }
                timeDiv.appendChild(timeTag);
                rightDiv.appendChild(timeDiv);
                
                // 组装三列
                contentDiv.appendChild(leftDiv);
                contentDiv.appendChild(middleDiv);
                contentDiv.appendChild(rightDiv);
                
                resultItem.appendChild(contentDiv);
                resultsList.appendChild(resultItem);
            });
            
            categoryDiv.appendChild(resultsList);
            resultsContent.appendChild(categoryDiv);
        }
    });
    
    // 显示结果容器
    resultsContainer.style.display = 'block';
}

// 获取筛选器名称
function getFilterName(filter) {
    const filterMap = {
        'all': '全部网盘',
        'baidu': '百度网盘',
        'kuake': '夸克网盘',
        'uc': 'UC网盘',
        'ali': '阿里网盘'
    };
    return filterMap[filter] || '全部网盘';
}

// 初始化热搜资源
/**
 * 从API获取热播内容
 * @param {string} type - 类型：tv|电视剧热榜；movie|电影热榜
 * @returns {Promise<Array>} 热播内容列表
 */
async function fetchHotContent(type) {
    try {
        const apiUrl = `https://xzdx.top/api/tophub/?type=${type}`;
        const response = await fetch(apiUrl);
        
        if (!response.ok) {
            throw new Error('网络请求失败');
        }
        
        const data = await response.json();
        if (data.code !== 0) {
            throw new Error(data.msg || '获取数据失败');
        }
        
        // 筛选出area是大陆的内容，并限制数量为12个
        const filteredData = data.data
            .filter(item => item.area === '大陆')
            .slice(0, 12);
        
        return filteredData;
    } catch (error) {
        console.error(`获取${type === 'tv' ? '电视剧' : '电影'}热榜错误:`, error);
        return [];
    }
}

function initHotSearch() {
    // 并行获取电视剧和电影热榜
    Promise.all([
        fetchHotContent('tv'),
        fetchHotContent('movie')
    ]).then(([tvData, movieData]) => {
        displayHotTv(tvData);
        displayHotMovie(movieData);
    }).catch(error => {
        console.error('获取热榜错误:', error);
    });
}

// 显示热搜剧集
function displayHotTv(data) {
    const hotTvList = document.getElementById('hotTvList');
    hotTvList.innerHTML = '';
    
    data.forEach(item => {
        const hotSearchItem = document.createElement('div');
        hotSearchItem.className = 'hot-search-item';
        
        // 设置图片容器
        const imageContainer = document.createElement('div');
        
        // 设置背景图片
        if (item.cover) {
            imageContainer.style.backgroundImage = `url(${item.cover})`;
        }
        
        // 设置文字容器
        const textContainer = document.createElement('div');
        
        textContainer.innerHTML = `
            <div class="title">${item.title}</div>
            <div class="info">剧集 | ${item.avg || 0}分</div>
        `;
        
        // 组装元素
        hotSearchItem.appendChild(imageContainer);
        hotSearchItem.appendChild(textContainer);
        
        // 添加点击事件，点击后将标题填入搜索框并搜索
        hotSearchItem.addEventListener('click', function() {
            document.getElementById('searchInput').value = item.title;
            performSearch();
        });
        
        hotTvList.appendChild(hotSearchItem);
    });
}

// 显示热搜电影
function displayHotMovie(data) {
    const hotMovieList = document.getElementById('hotMovieList');
    hotMovieList.innerHTML = '';
    
    data.forEach(item => {
        const hotSearchItem = document.createElement('div');
        hotSearchItem.className = 'hot-search-item';
        
        // 设置图片容器
        const imageContainer = document.createElement('div');
        
        // 设置背景图片
        if (item.cover) {
            imageContainer.style.backgroundImage = `url(${item.cover})`;
        }
        
        // 设置文字容器
        const textContainer = document.createElement('div');
        
        textContainer.innerHTML = `
            <div class="title">${item.title}</div>
            <div class="info">电影 | ${item.avg || 0}分</div>
        `;
        
        // 组装元素
        hotSearchItem.appendChild(imageContainer);
        hotSearchItem.appendChild(textContainer);
        
        // 添加点击事件，点击后将标题填入搜索框并搜索
        hotSearchItem.addEventListener('click', function() {
            document.getElementById('searchInput').value = item.title;
            performSearch();
        });
        
        hotMovieList.appendChild(hotSearchItem);
    });
}
