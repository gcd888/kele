package org.json;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 桌面测试桩：真实可用的最小 JSON 实现（递归下降解析 + 序列化），
 * 覆盖 Spider 桌面自测所需的 API 子集（opt/put/optString/optInt/optBoolean/
 * optJSONObject/optJSONArray/has/keys/length/toString）。
 * 打包产物编译走 android.jar（真 org.json），本桩仅存在于 test 目录。
 */
public class JSONObject {

    private final Map<String, Object> map = new LinkedHashMap<>();

    public JSONObject() {
    }

    public JSONObject(String json) {
        new Parser(json).expectObject(this);
    }

    private static Object parseValue(Parser p) {        p.skipWs();
        char c = p.peek();
        switch (c) {
            case '{': {
                JSONObject o = new JSONObject();
                p.next();
                p.skipWs();
                if (p.peek() == '}') { p.next(); return o; }
                while (true) {
                    p.skipWs();
                    String key = p.expectString();
                    p.skipWs();
                    p.expect(':');
                    Object v = parseValue(p);
                    o.map.put(key, v);
                    p.skipWs();
                    char d = p.next();
                    if (d == '}') return o;
                    if (d != ',') throw new IllegalArgumentException("expected , or } at " + p.pos);
                }
            }
            case '[': {
                JSONArray a = new JSONArray();
                p.next();
                p.skipWs();
                if (p.peek() == ']') { p.next(); return a; }
                while (true) {
                    Object v = parseValue(p);
                    a.list.add(v);
                    p.skipWs();
                    char d = p.next();
                    if (d == ']') return a;
                    if (d != ',') throw new IllegalArgumentException("expected , or ] at " + p.pos);
                }
            }
            case '"':
                return p.expectString();
            case 't':
                p.expectWord("true");
                return Boolean.TRUE;
            case 'f':
                p.expectWord("false");
                return Boolean.FALSE;
            case 'n':
                p.expectWord("null");
                return null;
            default:
                return p.expectNumber();
        }
    }

    /** 供 JSONArray(String) 桩复用的解析入口。 */
    public static Object parseValuePublic(Parser p) {
        return parseValue(p);
    }

    static class Parser {
        final String s;
        int pos = 0;

        Parser(String s) {
            this.s = s == null ? "" : s;
        }

        void expectObject(JSONObject target) {
            Object v = parseValue(this);
            if (!(v instanceof JSONObject)) throw new IllegalArgumentException("not a JSON object");
            target.map.putAll(((JSONObject) v).map);
        }

        void skipWs() {
            while (pos < s.length()) {
                char c = s.charAt(pos);
                if (c == ' ' || c == '\t' || c == '\n' || c == '\r') pos++;
                else break;
            }
        }

        char peek() {
            if (pos >= s.length()) throw new IllegalArgumentException("unexpected end");
            return s.charAt(pos);
        }

        char next() {
            if (pos >= s.length()) throw new IllegalArgumentException("unexpected end");
            return s.charAt(pos++);
        }

        void expect(char c) {
            char got = next();
            if (got != c) throw new IllegalArgumentException("expected '" + c + "' got '" + got + "' at " + pos);
        }

        void expectWord(String w) {
            if (!s.startsWith(w, pos)) throw new IllegalArgumentException("expected " + w + " at " + pos);
            pos += w.length();
        }

        String expectString() {
            expect('"');
            StringBuilder sb = new StringBuilder();
            while (true) {
                char c = next();
                if (c == '"') return sb.toString();
                if (c == '\\') {
                    char e = next();
                    switch (e) {
                        case '"': sb.append('"'); break;
                        case '\\': sb.append('\\'); break;
                        case '/': sb.append('/'); break;
                        case 'b': sb.append('\b'); break;
                        case 'f': sb.append('\f'); break;
                        case 'n': sb.append('\n'); break;
                        case 'r': sb.append('\r'); break;
                        case 't': sb.append('\t'); break;
                        case 'u':
                            sb.append((char) Integer.parseInt(s.substring(pos, pos + 4), 16));
                            pos += 4;
                            break;
                        default:
                            throw new IllegalArgumentException("bad escape \\" + e);
                    }
                } else {
                    sb.append(c);
                }
            }
        }

        Object expectNumber() {
            int start = pos;
            while (pos < s.length()) {
                char c = s.charAt(pos);
                if ((c >= '0' && c <= '9') || c == '-' || c == '+' || c == '.' || c == 'e' || c == 'E') pos++;
                else break;
            }
            String num = s.substring(start, pos);
            if (num.isEmpty()) throw new IllegalArgumentException("bad number at " + start);
            try {
                if (num.indexOf('.') < 0 && num.indexOf('e') < 0 && num.indexOf('E') < 0) {
                    return Long.parseLong(num);
                }
                return Double.parseDouble(num);
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("bad number '" + num + "'");
            }
        }
    }

    public JSONObject put(String name, boolean value) {
        map.put(name, value);
        return this;
    }

    public JSONObject put(String name, int value) {
        map.put(name, (long) value);
        return this;
    }

    public JSONObject put(String name, long value) {
        map.put(name, value);
        return this;
    }

    public JSONObject put(String name, double value) {
        map.put(name, value);
        return this;
    }

    public JSONObject put(String name, Object value) {
        map.put(name, value);
        return this;
    }

    private Object val(String name) {
        return map.get(name);
    }

    public String optString(String name) {
        Object v = val(name);
        return v == null ? "" : v.toString();
    }

    public String optString(String name, String fallback) {
        Object v = val(name);
        return v == null ? fallback : v.toString();
    }

    public int optInt(String name) {
        Object v = val(name);
        return v instanceof Number ? ((Number) v).intValue() : (v instanceof String ? parseInt(v.toString(), 0) : 0);
    }

    public int optInt(String name, int fallback) {
        Object v = val(name);
        return v instanceof Number ? ((Number) v).intValue() : (v instanceof String ? parseInt(v.toString(), fallback) : fallback);
    }

    private static int parseInt(String s, int fallback) {
        try {
            return Integer.parseInt(s.trim());
        } catch (Exception e) {
            return fallback;
        }
    }

    public long optLong(String name) {
        return optLong(name, 0L);
    }

    public long optLong(String name, long fallback) {
        Object v = val(name);
        return v instanceof Number ? ((Number) v).longValue() : (v instanceof String ? parseLong(v.toString(), fallback) : fallback);
    }

    private static long parseLong(String s, long fallback) {
        try {
            return Long.parseLong(s.trim());
        } catch (Exception e) {
            return fallback;
        }
    }

    public boolean optBoolean(String name) {
        return optBoolean(name, false);
    }

    public boolean optBoolean(String name, boolean fallback) {
        Object v = val(name);
        if (v instanceof Boolean) return (Boolean) v;
        if (v instanceof String) return Boolean.parseBoolean((String) v);
        return fallback;
    }

    public JSONObject optJSONObject(String name) {
        Object v = val(name);
        return v instanceof JSONObject ? (JSONObject) v : null;
    }

    public JSONObject getJSONObject(String name) {
        JSONObject o = optJSONObject(name);
        if (o == null) throw new RuntimeException("JSONObject[" + name + "] not found");
        return o;
    }

    public Object opt(String name) {
        return val(name);
    }

    public int length() {
        return map.size();
    }

    public boolean has(String name) {
        return map.containsKey(name);
    }

    public Iterator<String> keys() {
        return map.keySet().iterator();
    }

    public JSONArray optJSONArray(String name) {
        Object v = val(name);
        return v instanceof JSONArray ? (JSONArray) v : null;
    }

    static String quote(String s) {
        StringBuilder sb = new StringBuilder("\"");
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '"': sb.append("\\\""); break;
                case '\\': sb.append("\\\\"); break;
                case '\b': sb.append("\\b"); break;
                case '\f': sb.append("\\f"); break;
                case '\n': sb.append("\\n"); break;
                case '\r': sb.append("\\r"); break;
                case '\t': sb.append("\\t"); break;
                default:
                    if (c < 0x20) sb.append(String.format("\\u%04x", (int) c));
                    else sb.append(c);
            }
        }
        return sb.append('"').toString();
    }

    static String write(Object v) {
        if (v == null) return "null";
        if (v instanceof String) return quote((String) v);
        if (v instanceof Boolean || v instanceof Double || v instanceof Float) return v.toString();
        if (v instanceof JSONObject) return ((JSONObject) v).toString();
        if (v instanceof JSONArray) return ((JSONArray) v).toString();
        if (v instanceof Map) {
            JSONObject tmp = new JSONObject();
            for (Map.Entry<?, ?> e : ((Map<?, ?>) v).entrySet()) tmp.put(String.valueOf(e.getKey()), e.getValue());
            return tmp.toString();
        }
        if (v instanceof List) {
            JSONArray tmp = new JSONArray();
            for (Object o : (List<?>) v) tmp.put(o);
            return tmp.toString();
        }
        return v.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;
        for (Map.Entry<String, Object> e : map.entrySet()) {
            if (!first) sb.append(',');
            first = false;
            sb.append(quote(e.getKey())).append(':').append(write(e.getValue()));
        }
        return sb.append('}').toString();
    }
}
