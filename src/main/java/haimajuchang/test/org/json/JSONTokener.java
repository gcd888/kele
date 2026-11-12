package org.json;

/** 桌面测试桩：仅保证 Qingguoduanju 类可加载与验证，测试路径不执行 JSON 逻辑。 */
public class JSONTokener {
    public JSONTokener(String json) {
    }

    public Object nextValue() {
        return new JSONObject();
    }
}
