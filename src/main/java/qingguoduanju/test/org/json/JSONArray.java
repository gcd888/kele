package org.json;

/** 桌面测试桩：仅保证 Qingguoduanju 类可加载与验证，测试路径不执行 JSON 逻辑。 */
public class JSONArray {
    public JSONArray() {
    }

    public JSONArray put(Object value) {
        return this;
    }

    public int length() {
        return 0;
    }

    public String optString(int index) {
        return "";
    }

    public String optString(int index, String fallback) {
        return fallback;
    }

    public JSONObject optJSONObject(int index) {
        return null;
    }

    public JSONArray optJSONArray(int index) {
        return null;
    }

    public Object opt(int index) {
        return null;
    }
}
