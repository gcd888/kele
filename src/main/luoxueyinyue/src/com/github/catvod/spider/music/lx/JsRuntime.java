package com.github.catvod.spider.music.lx;

/**
 * JS 引擎薄抽象：LX 音源脚本宿主只依赖本接口。
 * 生产环境用 QuickJsRuntime（壳 APK 自带 com.whl.quickjs.wrapper + native .so），
 * 桌面探针用 GraalJsRuntime（org.graalvm.polyglot）。
 * 所有跨引擎传值约定：
 *   JS 对象/函数 → 不透明句柄 Object
 *   byte[]       → ArrayBuffer
 *   HostFn       → 可被 JS 调用的原生函数
 */
public interface JsRuntime {

    interface HostFn {
        Object invoke(Object[] args) throws Exception;
    }

    interface Factory {
        JsRuntime create() throws Exception;
    }

    /** 顶层执行 JS 代码 */
    void eval(String code, String fileName) throws Exception;

    /** 新建 JS 对象 */
    Object newObject();

    /** JSON 字符串 → JS 值 */
    Object parseJson(String json) throws Exception;

    /** JS 对象 → JSON 字符串 */
    String stringify(Object obj);

    /** 设置全局属性（挂在 globalThis 上） */
    void setGlobal(String name, Object value) throws Exception;

    /** 设置属性；value: String/Number/Boolean/JS对象/HostFn/byte[]/null */
    void setProperty(Object target, String name, Object value) throws Exception;

    /** 读取属性 */
    Object getProperty(Object target, String name);

    /** 调用 JS 函数句柄；返回 Promise 时挂 then/catch 同步等待其完成 */
    Object callFunction(Object fn, Object[] args) throws Exception;

    boolean isFunction(Object value);

    /** ArrayBuffer/类数组 → byte[] */
    byte[] toBytes(Object value);

    void close();
}
