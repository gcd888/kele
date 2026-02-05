// 导入模块
import { initData, cloudSearchAPIs, hotSearchAPIs, cloudTypes, notices, httpProxyGateway } from './data.js';
import apiFunctions, { callCloudPostFunction } from './api.js';

// 将API函数设置到window对象上，以便动态调用
for (const [key, value] of Object.entries(apiFunctions)) {
    if (typeof value === 'function') {
        window[key] = value;
    }
}

// 页面加载完成后执行
window.addEventListener('DOMContentLoaded', async function() {
    try {
        // 初始化数据
        const data = await initData();
        
        // 将加载的数据设置为全局可访问，以便pc.js和phone.js中使用
        window.cloudTypes = data.cloudTypes;
        window.cloudSearchAPIs = data.cloudSearchAPIs;
        window.hotSearchAPIs = data.hotSearchAPIs;
        window.notices = data.notices;
        
        // 初始化时间显示
        updateTime();
        setInterval(updateTime, 1000);

        // 初始化模式切换功能
        initModeToggle();

        // 初始化公告信息
        initAnnouncement();

        // 初始化搜索功能
        initSearchFunction();

        // 初始化热播资源
        initHotSearch();
        
        // 延迟调用初始化函数，确保pc.js或phone.js已经加载完成
        setTimeout(() => {
            // 手动调用初始化函数，确保网盘筛选按钮在数据加载完成后才初始化
            if (typeof initAllEnhancements === 'function') {
                initAllEnhancements();
            }
        }, 500);
    } catch (error) {
        // 静默处理错误，避免控制台输出
    }
});

// 初始化公告信息
function initAnnouncement() {
    const announcementContent = document.querySelector('.announcement-content');
    if (announcementContent) {
        // 从notices数组中获取公告信息，只使用status为1的
        const activeNotices = notices.filter(notice => notice.status === '1');
        if (activeNotices.length > 0) {
            let currentIndex = 0;
            
            // 显示当前公告
            function showCurrentNotice() {
                // 重置公告元素状态
                announcementContent.textContent = '';
                announcementContent.style.animationDuration = '';
                announcementContent.classList.remove('scrolling');
                
                // 强制回流，确保动画重置
                void announcementContent.offsetWidth;
                
                // 设置当前公告内容
                const currentNotice = activeNotices[currentIndex].notice;
                announcementContent.textContent = currentNotice;
                
                // 计算下一个索引（先计算，确保顺序正确）
                const nextIndex = (currentIndex + 1) % activeNotices.length;
                currentIndex = nextIndex;
                
                // 根据内容长度动态计算动画持续时间
                // 基础动画时间8秒，加上每个字符0.3秒的滚动时间
                // 确保最短动画时间为10秒，最长不超过30秒
                const baseAnimationTime = 8000;
                const perCharacterTime = 300;
                const animationDurationMs = Math.max(10000, Math.min(30000, baseAnimationTime + (currentNotice.length * perCharacterTime)));
                const animationDuration = animationDurationMs / 1000;
                
                // 设置动画持续时间并启动动画
                announcementContent.style.animationDuration = `${animationDuration}s`;
                announcementContent.classList.add('scrolling');
                
                // 动画完成后显示下一条公告
                setTimeout(showCurrentNotice, animationDurationMs + 500); // 加500ms缓冲，确保动画完全结束
            }
            
            // 开始轮询展示公告
            showCurrentNotice();
        }
    }
}

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
    const savedMode = localStorage.getItem('mode');
    
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

// 格式化时间为yyyy-MM-dd hh:mm:ss格式
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

// 执行搜索
async function performSearch() {
    const searchTerm = document.getElementById('searchInput').value.trim();
    let selectedFilter = 'all'; // 默认值为全部
    
    // 获取所有选中的筛选按钮
    const activeFilterButtons = document.querySelectorAll('.filter-btn.active');
    if (activeFilterButtons.length > 0) {
        // 在手机版中，可能有多个选中的按钮，这里只取第一个
        // 后续可以根据需要扩展为支持多选
        selectedFilter = activeFilterButtons[0].dataset.filter;
    }
    
    if (!searchTerm) {
        // 清空搜索结果
        displayCombinedSearchResults([]);
        // 替换alert为更友好的提示
        showToast('请输入搜索关键词');
        return;
    }
    
    // 显示加载指示器
    showLoadingIndicator();
    
    try {
        // 根据mock数据配置调用相应的API函数
        const apiPromises = [];
        
        // 遍历window.cloudSearchAPIs，根据method调用相应的API函数
        if (window.cloudSearchAPIs && Array.isArray(window.cloudSearchAPIs)) {
            window.cloudSearchAPIs.forEach(api => {
                // 只调用url不为空的API
                if (!api.url) return;
                
                // 动态调用对应方法名
                const apiMethod = window[api.method];
                
                if (typeof apiMethod === 'function') {
                    // 保存当前api对象，以便在处理结果时使用
                    const currentApi = api;
                    
                    // 根据方法名判断是否需要传入selectedFilter参数
                    if (api.method === 'searchApi1') {
                        apiPromises.push(apiMethod(searchTerm, selectedFilter, api.url).then(results => {
                            // 为每个结果添加sourceName字段
                            return (results || []).map(result => ({
                                ...result,
                                sourceName: currentApi.name
                            }));
                        }));
                    } else {
                        apiPromises.push(apiMethod(searchTerm, api.url).then(results => {
                            // 为每个结果添加sourceName字段
                            return (results || []).map(result => ({
                                ...result,
                                sourceName: currentApi.name
                            }));
                        }));
                    }
                } else {
                    console.error('API方法不存在:', api.method);
                }
            });
        } else {
            console.error('window.cloudSearchAPIs不存在或不是数组:', window.cloudSearchAPIs);
        }
        
        // 并行调用所有API
        const apiResults = await Promise.allSettled(apiPromises);
        
        // 汇总所有成功的结果
        const allResults = [];
        
        apiResults.forEach(result => {
            if (result.status === 'fulfilled' && result.value) {
                allResults.push(...result.value);
            }
        });
        
        // 根据筛选条件过滤结果
        let filteredResults = allResults;
        if (selectedFilter !== 'all') {
            filteredResults = allResults.filter(result => result.cloudType === selectedFilter);
        }

        // 标记结果中已经失效的资源
        filteredResults = await markInvalidResources(filteredResults);
        
        // 过滤和排序结果
        filteredResults = processSearchResults(filteredResults, searchTerm);
        
        // 显示汇总结果
        displayCombinedSearchResults(filteredResults);
    } catch (error) {
        // 显示错误信息
        showErrorMessage('搜索失败，请稍后重试');
        console.error('搜索错误:', error);
        // 显示错误提示
        showToast('搜索失败，请检查网络连接后重试');
    }
}

/**
 * 标记失效的资源链接
 * @async
 * @function markInvalidResources
 * @param {Array} results - 搜索结果数组
 * @returns {Promise<Array>} 标记后的搜索结果数组
 */
async function markInvalidResources(results) {
    const markedResults = [];
    
    for (const result of results) {
        try {
            // 获取网盘类型
            const cloudType = result.cloudType;
            
            let isValid = true;
            
            // 根据不同cloudType调用不同方法
            switch (cloudType) {
                case 'quark':
                    // 调用夸克网盘校验方法
                    const quarkResult = isQuarkValid(result);
                    if (quarkResult instanceof Promise) {
                        isValid = await quarkResult;
                    } else {
                        isValid = quarkResult;
                    }
                    break;
                case 'baidu':
                    // 调用百度网盘校验方法
                    const baiduResult = isBaiduValid(result);
                    if (baiduResult instanceof Promise) {
                        isValid = await baiduResult;
                    } else {
                        isValid = baiduResult;
                    }
                    break;
                default:
                    // 其他网盘类型暂时默认认为有效
                    isValid = true;
                    break;
            }
            
            // 添加isInvalid标记
            const markedResult = {
                ...result,
                isInvalid: !isValid
            };
            markedResults.push(markedResult);
        } catch (error) {
            // 发生错误时默认认为资源有效，避免误判
            const markedResult = {
                ...result,
                isInvalid: false
            };
            markedResults.push(markedResult);
        }
    }
    
    return markedResults;
}

/**
 * 判断百度网盘资源是否失效
 * @async
 * @function isBaiduValid
 * @param {Object} result - 搜索结果对象
 * @returns {Promise<boolean>} 资源是否有效
 */
async function isBaiduValid(result) {
    let url = '';
    try {
        url = result.url;
        console.log("===》百度网盘失效校验开始"+url);

        // 使用云函数callCloudGetFunction发起GET请求
        const response = await callCloudGetFunction(url, {
            'Content-Type': 'text/html'
        });
        
        console.log("===》百度网盘响应类型:" + typeof response);
        console.log("===》百度网盘响应原始内容:" + response);
        
        // 根据响应判断是否有效
        let content = '';
        
        // 处理响应是HTML字符串的情况（直接返回的HTML内容）
        if (typeof response === 'string') {
            content = response;
        }
        // 处理响应是对象的情况（包含status和data属性）
        else if (typeof response === 'object') {
            // 检查response.body是否为字符串（云函数返回的格式）
            if (typeof response.body === 'string') {
                try {
                    // 尝试解析response.body为JSON对象（云函数返回的格式）
                    const parsedBody = JSON.parse(response.body);
                    if (typeof parsedBody.data === 'string') {
                        // 云函数返回的格式：{status: 200, data: "<html>...</html>", headers: {...}}
                        content = parsedBody.data;
                    } else {
                        content = response.body;
                    }
                } catch (e) {
                    // 如果解析失败，直接使用response.body
                    content = response.body;
                }
            } 
            // 检查response.data是否为字符串
            else if (typeof response.data === 'string') {
                content = response.data;
            } 
            else {
                content = JSON.stringify(response);
            }
        }
        
        console.log("===》百度网盘响应内容:" + content.substring(0, 500) + "...");
        
        // 检查内容是否包含"百度网盘-链接不存在"，使用字符串.includes()方法进行匹配
        const isInvalid = content.includes('百度网盘-链接不存在');
        console.log("===》百度网盘是否失效:" + isInvalid);
        
        if (isInvalid) {
            console.log("百度网盘校验失败（链接不存在）"+url);
            return false;
        } else {
            console.log("百度网盘校验成功"+url);
            return true;
        }
    } catch (error) {
        console.error('百度网盘验证失败:', error);
        // 发生错误时，默认返回true（认为有效）
        return true;
    } finally {
        console.log("===》百度网盘失效校验结束"+url);
    }
}

/**
 * 判断阿里云盘资源是否失效
 * @async
 * @function isAliyunValid
 * @param {Object} result - 搜索结果对象
 * @returns {Promise<boolean>} 资源是否有效
 */
function isAliyunValid(result) {
    // TODO: 实现阿里云盘失效判断逻辑
    return true;
}

/**
 * 判断夸克网盘资源是否失效
 * @async
 * @function isQuarkValid
 * @param {Object} result - 搜索结果对象
 * @returns {Promise<boolean>} 资源是否有效
 */
async function isQuarkValid(result) {
    let url = '';
    try {
        // 从结果中提取夸克网盘信息
        url = result.url;
        
        // 解析夸克网盘链接，提取pwd_id (取URL最后一段值)
        // 处理URL，移除查询参数和哈希值，然后取最后一段
        const cleanUrl = url.split('?')[0].split('#')[0];
        const urlParts = cleanUrl.split('/');
        const pwd_id = urlParts[urlParts.length - 1] || '';
        
        console.log("===》夸克网盘失效校验开始"+url);

        if (!pwd_id) {
            console.error('无法从夸克网盘链接中提取pwd_id:', url);
            return false;
        }
        
        // 构建验证请求
        const targetUrl = 'https://drive-h.quark.cn/1/clouddrive/share/sharepage/token?pr=ucpro&fr=pc&uc_param_str=';
        const headers = {
            'Content-Type': 'application/json'
        };
        const body = {
            pwd_id,
            passcode: '',
            support_visit_limit_private_share: true
        };
        
        // 调用云函数发起验证请求
        const response = await callCloudPostFunction(targetUrl, headers, body);
        
        // 根据响应判断是否有效
        // 成功响应: status 200, code 0
        // 失败响应: status 404, code 41012 (好友已取消了分享)
        if (response.status === 200 && response.code === 0) {
             console.log("夸克网盘校验成功"+url);
            return true;
        } else if (response.status === 404 || response.code === 41012) {
             console.log("夸克网盘校验失败"+url);
            return false;
        } else {
            // 其他错误情况，默认返回false
            console.error('夸克网盘验证失败:', response);
            return false;
        }
    } catch (error) {
        console.error('isQuarkValid错误:', error);
        return false;
    } finally {
        console.log("===》夸克网盘失效校验结束"+url);
    }
}

/**
 * 判断UC网盘资源是否失效
 * @async
 * @function isUcValid
 * @param {Object} result - 搜索结果对象
 * @returns {Promise<boolean>} 资源是否有效
 */
function isUcValid(result) {
    // TODO: 实现UC网盘失效判断逻辑
    return true;
}

/**
 * 判断迅雷网盘资源是否失效
 * @async
 * @function isXunleiValid
 * @param {Object} result - 搜索结果对象
 * @returns {Promise<boolean>} 资源是否有效
 */
function isXunleiValid(result) {
    // TODO: 实现迅雷网盘失效判断逻辑
    return true;
}

/**
 * 判断天翼网盘资源是否失效
 * @async
 * @function isTianyiValid
 * @param {Object} result - 搜索结果对象
 * @returns {Promise<boolean>} 资源是否有效
 */
function isTianyiValid(result) {
    // TODO: 实现天翼网盘失效判断逻辑
    return true;
}

/**
 * 处理搜索结果：排序疑似无效链接
 * @async
 * @function processSearchResults
 * @param {Array} results - 搜索结果数组
 * @param {string} searchTerm - 用户搜索输入值
 * @returns {Array} 处理后的搜索结果数组
 */
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
    
    // 排序逻辑：根据note中包含的关键词排序，且将失效链接排到最后
    const priorityKeywords = ['4K', '臻彩', '高码率', '高清', 'HDR', '超前完结', '全集', '完结'];
    
    filteredResults.sort((a, b) => {
        // 首先按失效状态排序，有效链接在前，失效链接在后
        if (a.isInvalid !== b.isInvalid) {
            return a.isInvalid ? 1 : -1;
        }
        
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

/**
 * 从API获取热播内容
 * @async
 * @function fetchHotContent
 * @param {string} type - 内容类型，'tv'表示电视剧，'movie'表示电影
 * @param {string} url - API endpoint URL
 * @returns {Promise<Array>} 过滤后的热播内容数组
 */
async function fetchHotContent(type, url) {
    try {
        const apiUrl = `${url}?type=${type}`;
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
        
        // 处理图片URL，确保移动端兼容性
        filteredData.forEach(item => {
            if (item.cover) {
                // 确保使用HTTPS协议
                if (item.cover.startsWith('http://')) {
                    item.cover = item.cover.replace('http://', 'https://');
                }
                
                // 添加图片代理服务，解决跨域问题
                if (item.cover.includes('douban') || item.cover.includes('img')) {
                    // 使用图片代理服务
                    item.cover = `https://images.weserv.nl/?url=${encodeURIComponent(item.cover)}`;
                }
            }
        });
        
        return filteredData;
    } catch (error) {
        console.error(`获取${type === 'tv' ? '电视剧' : '电影'}热榜错误:`, error);
        return [];
    }
}

/**
 * 初始化热播影视数据
 * @async
 * @function initHotSearch
 */
function initHotSearch() {
    // 并行获取热播剧集和电影
    const hotSearchPromises = hotSearchAPIs.map(api => {
        if (api.status === '1' && api.method === 'searchApi99' && api.url) {
            return fetchHotContent(api.type, api.url);
        }
        return Promise.resolve([]);
    });
    
    Promise.all(hotSearchPromises).then(results => {
        // 处理结果，根据类型显示
        const tvData = results.find((_, index) => hotSearchAPIs[index].type === 'tv') || [];
        const movieData = results.find((_, index) => hotSearchAPIs[index].type === 'movie') || [];
        
        displayHotTv(tvData);
        displayHotMovie(movieData);
    }).catch(error => {
        console.error('获取热榜错误:', error);
    });
}

/**
 * 显示热播剧集
 * @async
 * @function displayHotTv
 * @param {Array} data - 热播剧集数据数组
 */
function displayHotTv(data) {
    const hotTvList = document.getElementById('hotTvList');
    hotTvList.innerHTML = '';
    
    data.forEach(item => {
        const hotSearchItem = document.createElement('div');
        hotSearchItem.className = 'hot-search-item';
        
        // 设置图片容器
        const imageContainer = document.createElement('div');
        imageContainer.className = 'hot-search-image';
        
        // 设置背景图片 - 添加移动端优化
        if (item.cover) {
            // 确保图片URL使用HTTPS协议
            let imageUrl = item.cover;
            if (imageUrl.startsWith('http://')) {
                imageUrl = imageUrl.replace('http://', 'https://');
            }
            
            // 添加图片加载错误处理
            imageContainer.style.backgroundImage = `url(${imageUrl})`;
            
            // 创建备用图片元素用于错误处理
            const img = new Image();
            img.onload = function() {
                // 图片加载成功
                imageContainer.style.backgroundImage = `url(${imageUrl})`;
            };
            img.onerror = function() {
                // 图片加载失败，使用备用图片
                imageContainer.style.backgroundImage = 'url(src/img/imgerror.svg)';
            };
            img.src = imageUrl;
        } else {
            // 没有封面图片时使用默认图片
            imageContainer.style.backgroundImage = 'url(src/img/imgerror.svg)';
        }
        
        // 设置文字容器
        const textContainer = document.createElement('div');
        textContainer.className = 'hot-search-text';
        
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

/**
 * 显示热播电影
 * @async
 * @function displayHotMovie
 * @param {Array} data - 热播电影数据数组
 */
function displayHotMovie(data) {
    const hotMovieList = document.getElementById('hotMovieList');
    hotMovieList.innerHTML = '';
    
    data.forEach(item => {
        const hotSearchItem = document.createElement('div');
        hotSearchItem.className = 'hot-search-item';
        
        // 设置图片容器
        const imageContainer = document.createElement('div');
        imageContainer.className = 'hot-search-image';
        
        // 设置背景图片 - 添加移动端优化
        if (item.cover) {
            // 确保图片URL使用HTTPS协议
            let imageUrl = item.cover;
            if (imageUrl.startsWith('http://')) {
                imageUrl = imageUrl.replace('http://', 'https://');
            }
            
            // 添加图片加载错误处理
            imageContainer.style.backgroundImage = `url(${imageUrl})`;
            
            // 创建备用图片元素用于错误处理
            const img = new Image();
            img.onload = function() {
                // 图片加载成功
                imageContainer.style.backgroundImage = `url(${imageUrl})`;
            };
            img.onerror = function() {
                // 图片加载失败，使用备用图片
                imageContainer.style.backgroundImage = 'url(src/img/imgerror.svg)';
            };
            img.src = imageUrl;
        } else {
            // 没有封面图片时使用默认图片
            imageContainer.style.backgroundImage = 'url(src/img/imgerror.svg)';
        }
        
        // 设置文字容器
        const textContainer = document.createElement('div');
        textContainer.className = 'hot-search-text';
        
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

/**
 * 显示加载指示器
 * @async
 * @function showLoadingIndicator
 */
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

/**
 * 显示错误信息
 * @async
 * @function showErrorMessage
 * @param {string} message - 错误消息
 */
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

/**
 * 显示 Toast 提示
 * @async
 * @function showToast
 * @param {string} message - 提示消息
 * @param {number} [duration=2000] - 显示时间（毫秒）
 */
function showToast(message, duration = 2000) {
    // 创建 Toast 元素
    const toast = document.createElement('div');
    toast.className = 'toast';
    toast.textContent = message;
    
    // 设置样式
    toast.style.position = 'fixed';
    toast.style.top = '50%';
    toast.style.left = '50%';
    toast.style.transform = 'translate(-50%, -50%)';
    toast.style.backgroundColor = 'rgba(0, 0, 0, 0.7)';
    toast.style.color = 'white';
    toast.style.padding = '12px 20px';
    toast.style.borderRadius = '8px';
    toast.style.zIndex = '9999';
    toast.style.opacity = '0';
    toast.style.transition = 'opacity 0.3s ease';
    toast.style.fontSize = '14px';
    toast.style.textAlign = 'center';
    
    // 添加到页面
    document.body.appendChild(toast);
    
    // 显示 Toast
    setTimeout(() => {
        toast.style.opacity = '1';
    }, 100);
    
    // 隐藏 Toast
    setTimeout(() => {
        toast.style.opacity = '0';
        setTimeout(() => {
            document.body.removeChild(toast);
        }, 300);
    }, duration);
}

/**
 * 显示汇总搜索结果
 * @async
 * @function displayCombinedSearchResults
 * @param {Array} results - 搜索结果数组
 */
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
    
    // 构建网盘类型名称映射（从mock数据中获取）
    const cloudTypeNameMap = {};
    
    // 从window.cloudTypes中构建映射
    if (window.cloudTypes && Array.isArray(window.cloudTypes)) {
        window.cloudTypes.forEach(type => {
            if (type.cloudType && type.name) {
                cloudTypeNameMap[type.cloudType] = type.name;
            }
        });
    }
    
    // 构建网盘类型排序映射（从mock数据中获取）
    const cloudTypeSortMap = {};
    
    // 从window.cloudTypes中构建排序映射
    if (window.cloudTypes && Array.isArray(window.cloudTypes)) {
        window.cloudTypes.forEach(type => {
            if (type.cloudType && type.sort !== undefined) {
                cloudTypeSortMap[type.cloudType] = parseInt(type.sort) || 0;
            }
        });
    }
    
    // 对网盘类型进行排序（使用cloudTypes中的sort字段）
    const sortedCloudTypes = Object.entries(resultsByCloudType)
        .sort(([typeA], [typeB]) => {
            const sortA = cloudTypeSortMap[typeA] || 9999;
            const sortB = cloudTypeSortMap[typeB] || 9999;
            return sortA - sortB;
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
                    // 没有图片资源，显示imgerror.svg
                    const img = document.createElement('img');
                    img.src = 'src/img/imgerror.svg';
                    img.alt = '无图片';
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
                
                // 1. 链接（处理提取码拼接和设备特定展示）
                const urlDiv = document.createElement('div');
                urlDiv.className = 'result-url-container';
                const urlLink = document.createElement('a');
                urlLink.className = 'result-url';
                
                // 处理URL，自动拼接提取码
                let finalUrl = item.url || '';
                if (item.password && finalUrl) {
                    // 检查URL中是否已经包含提取码
                    const hasPasswordInUrl = finalUrl.includes('pwd=') || finalUrl.includes('提取码');
                    if (!hasPasswordInUrl) {
                        // 检查URL中是否已经有查询参数
                        const separator = finalUrl.includes('?') ? '&' : '?';
                        finalUrl = `${finalUrl}${separator}pwd=${item.password}`;
                    }
                }
                
                urlLink.href = finalUrl;
                urlLink.target = '_blank';
                urlLink.rel = 'noopener noreferrer';
                
                // 根据设备类型显示不同的链接文本
                if (window.innerWidth <= 767) {
                    // 手机端显示"点击提取"
                    urlLink.textContent = '点击获取';
                } else {
                    // 电脑端显示原始URL
                    urlLink.textContent = finalUrl || '';
                }
                
                urlDiv.appendChild(urlLink);
                
                // 如果链接被标记为失效，添加红色标签"疑似失效"
                if (item.isInvalid) {
                    const invalidLabel = document.createElement('span');
                    invalidLabel.className = 'invalid-label';
                    invalidLabel.textContent = '疑似失效';
                    invalidLabel.style.color = 'red';
                    invalidLabel.style.marginLeft = '8px';
                    invalidLabel.style.fontSize = '12px';
                    invalidLabel.style.fontWeight = 'normal';
                    urlDiv.appendChild(invalidLabel);
                }
                leftDiv.appendChild(urlDiv);
                
                // 2. 名称（使用note作为名称，最多展示前50个字符）
                const nameDiv = document.createElement('div');
                nameDiv.className = 'result-name';
                const displayName = item.note ? (item.note.length > 50 ? item.note.substring(0, 50) + '...' : item.note) : '';
                nameDiv.textContent = displayName;
                leftDiv.appendChild(nameDiv);
                
                // 中间：来源
                const middleDiv = document.createElement('div');
                middleDiv.className = 'result-content-middle';
                
                // 3. 来源（使用cloudSearch.name字段，使用标签样式）
                const sourceDiv = document.createElement('div');
                sourceDiv.className = 'result-source-container';
                const sourceTag = document.createElement('span');
                sourceTag.className = 'source-tag';
                sourceTag.textContent = item.sourceName || item.apiSource;
                sourceDiv.appendChild(sourceTag);
                middleDiv.appendChild(sourceDiv);
                
                // 右边：时间
                const rightDiv = document.createElement('div');
                rightDiv.className = 'result-content-right';
                
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