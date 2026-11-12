package org.json;

import java.util.Iterator;

/** 桌面测试桩：仅保证 Qingguoduanju 类可加载与验证，测试路径不执行 JSON 逻辑。 */
public class JSONObject {
    public JSONObject() {
    }

    public JSONObject(String json) {
    }

    public JSONObject put(String name, boolean value) {
        return this;
    }

    public JSONObject put(String name, int value) {
        return this;
    }

    public JSONObject put(String name, long value) {
        return this;
    }

    public JSONObject put(String name, double value) {
        return this;
    }

    public JSONObject put(String name, Object value) {
        return this;
    }

    public String optString(String name) {
        return "";
    }

    public String optString(String name, String fallback) {
        return fallback;
    }

    public int optInt(String name) {
        return 0;
    }

    public int optInt(String name, int fallback) {
        return fallback;
    }

    public boolean optBoolean(String name) {
        return false;
    }

    public boolean optBoolean(String name, boolean fallback) {
        return fallback;
    }

    public JSONObject optJSONObject(String name) {
        return null;
    }

    public JSONObject getJSONObject(String name) {
        return new JSONObject();
    }

    public Object opt(String name) {
        return null;
    }

    public int length() {
        return 0;
    }

    public JSONArray optJSONArray(String name) {
        return null;
    }

    public boolean has(String name) {
        return false;
    }

    public Iterator<String> keys() {
        return new Iterator<String>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public String next() {
                return null;
            }

            @Override
            public void remove() {
            }
        };
    }

    @Override
    public String toString() {
        return "{}";
    }
}
