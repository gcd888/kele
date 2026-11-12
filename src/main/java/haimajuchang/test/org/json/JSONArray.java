package org.json;

import java.util.ArrayList;
import java.util.List;

/** 桌面测试桩：真实可用的最小 JSONArray 实现（与 JSONObject 桩配套，仅 test 目录）。 */
public class JSONArray {

    final List<Object> list = new ArrayList<>();

    public JSONArray() {
    }

    public JSONArray(String json) {
        JSONObject.Parser p = new JSONObject.Parser(json);
        Object v = JSONObject.parseValuePublic(p);
        if (!(v instanceof JSONArray)) throw new IllegalArgumentException("not a JSON array");
        list.addAll(((JSONArray) v).list);
    }

    public JSONArray put(Object value) {
        list.add(value);
        return this;
    }

    public JSONArray put(boolean value) {
        list.add(value);
        return this;
    }

    public JSONArray put(int value) {
        list.add((long) value);
        return this;
    }

    public JSONArray put(long value) {
        list.add(value);
        return this;
    }

    public JSONArray put(double value) {
        list.add(value);
        return this;
    }

    public int length() {
        return list.size();
    }

    public Object opt(int index) {
        return index < 0 || index >= list.size() ? null : list.get(index);
    }

    public String optString(int index) {
        return optString(index, "");
    }

    public String optString(int index, String fallback) {
        Object v = opt(index);
        return v == null ? fallback : v.toString();
    }

    public int optInt(int index) {
        return optInt(index, 0);
    }

    public int optInt(int index, int fallback) {
        Object v = opt(index);
        if (v instanceof Number) return ((Number) v).intValue();
        if (v instanceof String) {
            try {
                return Integer.parseInt(((String) v).trim());
            } catch (Exception ignore) {
            }
        }
        return fallback;
    }

    public boolean optBoolean(int index) {
        Object v = opt(index);
        return v instanceof Boolean && (Boolean) v;
    }

    public JSONObject optJSONObject(int index) {
        Object v = opt(index);
        return v instanceof JSONObject ? (JSONObject) v : null;
    }

    public JSONArray optJSONArray(int index) {
        Object v = opt(index);
        return v instanceof JSONArray ? (JSONArray) v : null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) sb.append(',');
            sb.append(JSONObject.write(list.get(i)));
        }
        return sb.append(']').toString();
    }
}
