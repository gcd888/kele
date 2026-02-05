// 电脑端额外的交互功能


// 初始化电脑端特有功能
function initPcSpecificFeatures() {
    // 添加搜索框焦点效果
    initSearchInputEffects();
    
    // 添加结果项悬停效果
    initResultItemEffects();
    
    // 初始化网盘筛选按钮
    initFilterButtons();
    
    // 添加筛选按钮动画效果
    initFilterButtonEffects();
    
    // 添加滚动到顶部按钮
    initScrollToTop();
}

// 初始化网盘筛选按钮
function initFilterButtons() {
    const filterOptions = document.querySelector('.filter-options');
    if (!filterOptions) return;
    
    // 清空现有的筛选选项
    filterOptions.innerHTML = '<span>网盘类型：</span>';
    
    // 动态添加筛选按钮
    if (window.cloudTypes && Array.isArray(window.cloudTypes)) {
        window.cloudTypes.forEach(type => {
            const button = document.createElement('button');
            button.className = 'filter-btn';
            button.dataset.filter = type.cloudType;
            button.textContent = type.name;
            
            // 默认选中第一个（全部）
            if (type.cloudType === 'all') {
                button.classList.add('active');
            }
            
            // 添加点击事件
            button.addEventListener('click', function() {
                // 移除所有按钮的active类
                document.querySelectorAll('.filter-btn').forEach(btn => btn.classList.remove('active'));
                // 为当前点击的按钮添加active类
                this.classList.add('active');
            });
            
            filterOptions.appendChild(button);
        });
    }
}

// 初始化搜索框焦点效果
function initSearchInputEffects() {
    const searchInput = document.getElementById('searchInput');
    if (searchInput) {
        searchInput.addEventListener('focus', function() {
            this.style.boxShadow = '0 0 0 3px rgba(0, 123, 255, 0.1)';
        });
        
        searchInput.addEventListener('blur', function() {
            this.style.boxShadow = 'none';
        });
    }
}

// 初始化结果项悬停效果
function initResultItemEffects() {
    const resultItems = document.querySelectorAll('.result-item');
    resultItems.forEach(item => {
        item.addEventListener('mouseenter', function() {
            this.style.transform = 'translateY(-2px) scale(1.01)';
            this.style.boxShadow = '0 4px 16px rgba(0, 0, 0, 0.15)';
        });
        
        item.addEventListener('mouseleave', function() {
            this.style.transform = 'translateY(0) scale(1)';
            this.style.boxShadow = '0 2px 8px rgba(0, 0, 0, 0.1)';
        });
    });
}

// 初始化筛选按钮动画效果
function initFilterButtonEffects() {
    const filterButtons = document.querySelectorAll('.filter-btn');
    filterButtons.forEach(button => {
        button.addEventListener('click', function() {
            // 添加点击动画
            this.style.transform = 'scale(0.95)';
            setTimeout(() => {
                this.style.transform = 'scale(1)';
            }, 150);
        });
    });
}

// 初始化滚动到顶部按钮
function initScrollToTop() {
    // 创建滚动到顶部按钮
    const scrollTopBtn = document.createElement('button');
    scrollTopBtn.id = 'scrollTopBtn';
    scrollTopBtn.className = 'scroll-top-btn';
    scrollTopBtn.innerHTML = '↑';
    scrollTopBtn.style.position = 'fixed';
    scrollTopBtn.style.bottom = '30px';
    scrollTopBtn.style.right = '30px';
    scrollTopBtn.style.width = '50px';
    scrollTopBtn.style.height = '50px';
    scrollTopBtn.style.borderRadius = '50%';
    scrollTopBtn.style.backgroundColor = 'var(--primary-color)';
    scrollTopBtn.style.color = 'white';
    scrollTopBtn.style.border = 'none';
    scrollTopBtn.style.fontSize = '24px';
    scrollTopBtn.style.cursor = 'pointer';
    scrollTopBtn.style.boxShadow = '0 2px 8px rgba(0, 0, 0, 0.2)';
    scrollTopBtn.style.opacity = '0';
    scrollTopBtn.style.visibility = 'hidden';
    scrollTopBtn.style.transition = 'all 0.3s ease';
    scrollTopBtn.style.zIndex = '999';
    
    // 添加到页面
    document.body.appendChild(scrollTopBtn);
    
    // 滚动事件监听
    window.addEventListener('scroll', function() {
        if (window.pageYOffset > 300) {
            scrollTopBtn.style.opacity = '1';
            scrollTopBtn.style.visibility = 'visible';
        } else {
            scrollTopBtn.style.opacity = '0';
            scrollTopBtn.style.visibility = 'hidden';
        }
    });
    
    // 点击事件
    scrollTopBtn.addEventListener('click', function() {
        window.scrollTo({
            top: 0,
            behavior: 'smooth'
        });
    });
}

// 搜索结果项点击事件增强
function enhanceResultItemClick() {
    const resultItems = document.querySelectorAll('.result-item');
    resultItems.forEach(item => {
        // 为整个结果项添加点击事件，点击非链接区域时聚焦到链接
        item.addEventListener('click', function(e) {
            if (!e.target.closest('a')) {
                const link = this.querySelector('.result-url');
                if (link) {
                    link.focus();
                }
            }
        });
    });
}

// 键盘导航增强
function enhanceKeyboardNavigation() {
    // 搜索框快捷键
    document.addEventListener('keydown', function(e) {
        // Ctrl/Cmd + K 聚焦搜索框
        if ((e.ctrlKey || e.metaKey) && e.key === 'k') {
            e.preventDefault();
            const searchInput = document.getElementById('searchInput');
            if (searchInput) {
                searchInput.focus();
            }
        }
        
        // Esc 键清除搜索框内容并隐藏结果
        if (e.key === 'Escape') {
            const searchInput = document.getElementById('searchInput');
            if (searchInput) {
                searchInput.blur();
            }
        }
    });
}

/**
 * 限制热榜内容数量
 * 电脑端直接返回传入的filteredData
 * @function limitHotContent
 * @param {Array} filteredData - 过滤后的热榜数据
 * @returns {Array} 处理后的热榜数据
 */
function limitHotContent(filteredData) {
    // 电脑端展示所有传入的数据
    return filteredData;
}

// 初始化所有增强功能
function initAllEnhancements() {
    initPcSpecificFeatures();
    initFilterButtons();
    enhanceResultItemClick();
    enhanceKeyboardNavigation();
}

// 导出方法（如果需要）
if (typeof module !== 'undefined' && module.exports) {
    module.exports = {
        initAllEnhancements
    };
}