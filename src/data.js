// 全局变量存储mock数据
let cloudSearchAPIs = [];
let hotSearchAPIs = [];
let cloudTypes = [];
let notices = [];
let httpProxyGateway = {};
let onlineTV = [];

// 初始化数据加载
async function initData() {
    try {
        // 加载 api.json
        let apiData;
        try {
            const apiResponse = await fetch('src/mock/api.json');
            apiData = await apiResponse.json();
        } catch (error) {
            // 尝试使用相对路径
            const apiResponse = await fetch('mock/api.json');
            apiData = await apiResponse.json();
        }
        
        // 加载 base.json
        let baseData;
        try {
            const baseResponse = await fetch('src/mock/base.json');
            baseData = await baseResponse.json();
        } catch (error) {
            // 尝试使用相对路径
            const baseResponse = await fetch('mock/base.json');
            baseData = await baseResponse.json();
        }
        
        // 处理 cloudSearch 数据，只加载 status 为 1 的
        if (apiData.cloudSearch) {
            cloudSearchAPIs = apiData.cloudSearch.filter(item => item.status === '1');
        }
        
        // 处理 hotSearch 数据，只加载 status 为 1 的
        if (apiData.hotSearch) {
            hotSearchAPIs = apiData.hotSearch.filter(item => item.status === '1');
        }
        
        // 处理 cloudTypes 数据，只加载 status 为 1 的
        if (baseData.cloudTypes) {
            cloudTypes = baseData.cloudTypes.filter(item => item.status === '1');
        }
        
        // 处理 notices 数据，只加载 status 为 1 的
        if (baseData.notices) {
            notices = baseData.notices.filter(item => item.status === '1');
        }
        
        // 处理 onlineTV 数据，只加载 status 为 1 的
        if (baseData.onlineTV) {
            onlineTV = baseData.onlineTV.filter(item => item.status === '1');
        }
        
        // 处理 httpProxyGateway 数据
        if (baseData.httpProxyGateway && Array.isArray(baseData.httpProxyGateway)) {
            // 将数组转换为对象，方便根据name获取对应的配置
            httpProxyGateway = {};
            baseData.httpProxyGateway.forEach(gateway => {
                httpProxyGateway[gateway.name] = gateway;
            });
        }
        
        return {
            cloudSearchAPIs,
            hotSearchAPIs,
            cloudTypes,
            notices,
            onlineTV,
            httpProxyGateway
        };
    } catch (error) {
        console.error('数据加载失败:', error);
        return {
            cloudSearchAPIs: [],
            hotSearchAPIs: [],
            cloudTypes: [],
            notices: [],
            onlineTV: []
        };
    }
}

// 导出方法和变量
export {
    initData,
    cloudSearchAPIs,
    hotSearchAPIs,
    cloudTypes,
    notices,
    onlineTV,
    httpProxyGateway
};