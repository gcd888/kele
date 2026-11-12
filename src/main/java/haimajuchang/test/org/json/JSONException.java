package org.json;

/** 桌面测试桩：Qingguoduanju 类加载校验需要该类型存在，测试路径不执行其逻辑。 */
public class JSONException extends Exception {
    public JSONException(String message) {
        super(message);
    }
}
