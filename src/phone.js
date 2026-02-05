// 手机端额外的交互功能


// 初始化手机端特有功能
function initPhoneSpecificFeatures() {
    // 添加触摸反馈效果
    initTouchFeedback();
    
    // 优化搜索框触摸体验
    initSearchInputTouch();
    
    // 初始化网盘筛选按钮
    initFilterButtons();
    
    // 优化筛选按钮触摸体验
    initFilterButtonTouch();
    
    // 添加下拉刷新功能
    initPullToRefresh();
    
    // 优化结果项触摸体验
    initResultItemTouch();
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
            // 在手机版中去掉"全部"选项
            if (type.cloudType === 'all') {
                return;
            }
            
            const button = document.createElement('button');
            button.className = 'filter-btn';
            button.dataset.filter = type.cloudType;
            button.textContent = type.name;
            
            // 添加点击事件
            button.addEventListener('click', function() {
                // 在手机版中，实现切换选中/取消选中的功能
                this.classList.toggle('active');
            });
            
            filterOptions.appendChild(button);
        });
    }
}

// 初始化触摸反馈
function initTouchFeedback() {
    const touchElements = document.querySelectorAll('button, .filter-btn, .hot-search-item, .result-item');
    touchElements.forEach(element => {
        element.classList.add('touch-feedback');
        
        element.addEventListener('touchstart', function() {
            this.style.opacity = '0.7';
            this.style.transform = 'scale(0.98)';
        });
        
        element.addEventListener('touchend', function() {
            this.style.opacity = '1';
            this.style.transform = 'scale(1)';
        });
        
        element.addEventListener('touchcancel', function() {
            this.style.opacity = '1';
            this.style.transform = 'scale(1)';
        });
    });
}

// 初始化搜索框触摸体验
function initSearchInputTouch() {
    const searchInput = document.getElementById('searchInput');
    if (searchInput) {
        // 点击搜索框外部关闭键盘
        document.addEventListener('click', function(e) {
            if (!searchInput.contains(e.target) && e.target !== searchInput) {
                searchInput.blur();
            }
        });
        
        // 优化键盘弹出时的布局
        searchInput.addEventListener('focus', function() {
            // 滚动到搜索框位置，确保键盘弹出时能看到输入框
            setTimeout(() => {
                this.scrollIntoView({ behavior: 'smooth', block: 'center' });
            }, 100);
        });
    }
}

// 初始化筛选按钮触摸体验
function initFilterButtonTouch() {
    const filterButtons = document.querySelectorAll('.filter-btn');
    filterButtons.forEach(button => {
        button.addEventListener('touchstart', function() {
            this.style.opacity = '0.7';
            this.style.transform = 'scale(0.95)';
        });
        
        button.addEventListener('touchend', function() {
            this.style.opacity = '1';
            this.style.transform = 'scale(1)';
        });
        
        button.addEventListener('touchcancel', function() {
            this.style.opacity = '1';
            this.style.transform = 'scale(1)';
        });
    });
}

// 初始化下拉刷新功能
function initPullToRefresh() {
    let startY = 0;
    let isPulling = false;
    const threshold = 80;
    
    document.addEventListener('touchstart', function(e) {
        // 只有当页面滚动到顶部时才允许下拉刷新
        if (window.pageYOffset === 0) {
            startY = e.touches[0].clientY;
            isPulling = true;
        }
    }, { passive: true });
    
    document.addEventListener('touchmove', function(e) {
        if (!isPulling) return;
        
        const currentY = e.touches[0].clientY;
        const pullDistance = currentY - startY;
        
        if (pullDistance > 0) {
            // 阻止默认滚动行为，实现下拉效果
            e.preventDefault();
            
            // 根据下拉距离设置容器的 translateY
            const container = document.querySelector('.container');
            if (container) {
                const translateY = Math.min(pullDistance * 0.5, threshold);
                container.style.transform = `translateY(${translateY}px)`;
                container.style.transition = 'none';
            }
        }
    }, { passive: false });
    
    document.addEventListener('touchend', function() {
        if (!isPulling) return;
        
        const container = document.querySelector('.container');
        if (container) {
            const currentTransform = container.style.transform;
            const translateY = parseFloat(currentTransform.replace('translateY(', '').replace('px)', '')) || 0;
            
            if (translateY > threshold * 0.7) {
                // 触发刷新
                refreshPage();
            }
            
            // 重置容器位置
            container.style.transform = 'translateY(0)';
            container.style.transition = 'transform 0.3s ease';
        }
        
        isPulling = false;
    });
}

// 刷新页面
function refreshPage() {
    // 显示刷新指示器
    const refreshIndicator = document.createElement('div');
    refreshIndicator.id = 'refreshIndicator';
    refreshIndicator.style.position = 'fixed';
    refreshIndicator.style.top = '0';
    refreshIndicator.style.left = '0';
    refreshIndicator.style.width = '100%';
    refreshIndicator.style.height = '50px';
    refreshIndicator.style.backgroundColor = 'var(--primary-color)';
    refreshIndicator.style.color = 'white';
    refreshIndicator.style.display = 'flex';
    refreshIndicator.style.alignItems = 'center';
    refreshIndicator.style.justifyContent = 'center';
    refreshIndicator.style.fontSize = '14px';
    refreshIndicator.style.zIndex = '9999';
    refreshIndicator.style.transform = 'translateY(-100%)';
    refreshIndicator.style.transition = 'transform 0.3s ease';
    refreshIndicator.textContent = '刷新中...';
    
    document.body.appendChild(refreshIndicator);
    
    // 显示刷新指示器
    setTimeout(() => {
        refreshIndicator.style.transform = 'translateY(0)';
    }, 100);
    
    // 模拟刷新操作
    setTimeout(() => {
        // 重新加载数据
        window.location.reload();
    }, 1500);
}

// 初始化结果项触摸体验
function initResultItemTouch() {
    const resultItems = document.querySelectorAll('.result-item');
    resultItems.forEach(item => {
        // 添加触摸事件
        item.addEventListener('touchstart', function() {
            this.style.opacity = '0.8';
            this.style.transform = 'scale(0.98)';
        });
        
        item.addEventListener('touchend', function() {
            this.style.opacity = '1';
            this.style.transform = 'scale(1)';
        });
        
        item.addEventListener('touchcancel', function() {
            this.style.opacity = '1';
            this.style.transform = 'scale(1)';
        });
        
        // 点击结果项时，聚焦到链接
        item.addEventListener('click', function(e) {
            if (!e.target.closest('a')) {
                const link = this.querySelector('.result-url');
                if (link) {
                    link.focus();
                    // 在移动设备上，聚焦链接后弹出复制菜单
                    if (navigator.userAgent.match(/(iPhone|iPad|iPod|Android)/)) {
                        link.select();
                    }
                }
            }
        });
    });
}

// 优化移动端键盘操作
function optimizeKeyboardNavigation() {
    // 搜索框回车事件已经在 index.js 中实现
    
    // 为筛选按钮添加键盘导航支持
    const filterButtons = document.querySelectorAll('.filter-btn');
    filterButtons.forEach((button, index) => {
        button.setAttribute('tabindex', index + 1);
        
        button.addEventListener('keydown', function(e) {
            if (e.key === 'Enter' || e.key === ' ') {
                e.preventDefault();
                this.click();
            }
        });
    });
}

/**
 * 限制热榜内容数量
 * 手机端展示前8个
 * @function limitHotContent
 * @param {Array} filteredData - 过滤后的热榜数据
 * @returns {Array} 处理后的热榜数据
 */
function limitHotContent(filteredData) {
    // 手机端展示前8个
    return filteredData.slice(0, 8);
}

// 初始化所有增强功能
function initAllEnhancements() {
    initPhoneSpecificFeatures();
    initFilterButtons();
    optimizeKeyboardNavigation();
}

// 导出方法（如果需要）
if (typeof module !== 'undefined' && module.exports) {
    module.exports = {
        initAllEnhancements
    };
}