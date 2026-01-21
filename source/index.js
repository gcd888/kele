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

// 执行搜索
function performSearch() {
    const searchTerm = document.getElementById('searchInput').value.trim();
    const selectedFilter = document.querySelector('.filter-btn.active').dataset.filter;
    
    if (!searchTerm) {
        alert('请输入搜索关键词');
        return;
    }
    
    // 显示加载指示器
    showLoadingIndicator();
    
    // 构建API请求参数
    let cloudTypes = '';
    if (selectedFilter !== 'all') {
        // 映射筛选器值到API参数
        const filterMap = {
            'baidu': 'baidu',
            'kuake': 'quark',
            'uc': 'uc',
            'ali': 'aliyun'
        };
        cloudTypes = filterMap[selectedFilter] || '';
    }
    
    // 构建API请求URL
    const apiUrl = `https://api.iyuns.com/api/wpysso?kw=${encodeURIComponent(searchTerm)}${cloudTypes ? `&cloud_types=${cloudTypes}` : ''}`;
    
    // 发送API请求
    fetch(apiUrl)
        .then(response => {
            if (!response.ok) {
                throw new Error('网络请求失败');
            }
            return response.json();
        })
        .then(data => {
            if (data.code === 0) {
                // 显示搜索结果
                displaySearchResults(data.data);
            } else {
                // 显示错误信息
                showErrorMessage(data.message || '搜索失败');
            }
        })
        .catch(error => {
            // 显示错误信息
            showErrorMessage('搜索失败，请稍后重试');
            console.error('搜索错误:', error);
        });
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
                
                resultItem.appendChild(resultHeader);
                
                // 添加备注（如果有）
                if (item.note) {
                    const noteDiv = document.createElement('div');
                    noteDiv.className = 'result-note';
                    noteDiv.textContent = item.note;
                    resultItem.appendChild(noteDiv);
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
                
                resultItem.appendChild(metaDiv);
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
function initHotSearch() {
    // 模拟热搜剧集数据
    const hotTvData = [
        { rank: 1, title: '繁花', score: '8.8' },
        { rank: 2, title: '狂飙', score: '9.0' },
        { rank: 3, title: '三体', score: '8.2' },
        { rank: 4, title: '长相思', score: '7.6' },
        { rank: 5, title: '莲花楼', score: '8.1' },
        { rank: 6, title: '三体2', score: '8.5' },
        { rank: 7, title: '隐秘的角落', score: '9.2' },
        { rank: 8, title: '沉默的真相', score: '9.1' },
        { rank: 9, title: '开端', score: '7.9' },
        { rank: 10, title: '梦华录', score: '8.0' }
    ];
    
    // 模拟热搜电影数据
    const hotMovieData = [
        { rank: 1, title: '流浪地球3', score: '9.2' },
        { rank: 2, title: '满江红', score: '8.5' },
        { rank: 3, title: '消失的她', score: '7.8' },
        { rank: 4, title: '孤注一掷', score: '8.0' },
        { rank: 5, title: '八角笼中', score: '8.3' },
        { rank: 6, title: '长安三万里', score: '8.7' },
        { rank: 7, title: '独行月球', score: '7.7' },
        { rank: 8, title: '满江红2', score: '8.2' },
        { rank: 9, title: '流浪地球2', score: '8.3' },
        { rank: 10, title: '唐人街探案3', score: '6.5' }
    ];
    
    displayHotTv(hotTvData);
    displayHotMovie(hotMovieData);
}

// 显示热搜剧集
function displayHotTv(data) {
    const hotTvList = document.getElementById('hotTvList');
    hotTvList.innerHTML = '';
    
    data.forEach(item => {
        const hotSearchItem = document.createElement('div');
        hotSearchItem.className = 'hot-search-item';
        
        hotSearchItem.innerHTML = `
            <div class="rank">${item.rank}</div>
            <div class="title">${item.title}</div>
            <div class="info">剧集 | ${item.score}分</div>
        `;
        
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
        
        hotSearchItem.innerHTML = `
            <div class="rank">${item.rank}</div>
            <div class="title">${item.title}</div>
            <div class="info">电影 | ${item.score}分</div>
        `;
        
        // 添加点击事件，点击后将标题填入搜索框并搜索
        hotSearchItem.addEventListener('click', function() {
            document.getElementById('searchInput').value = item.title;
            performSearch();
        });
        
        hotMovieList.appendChild(hotSearchItem);
    });
}
