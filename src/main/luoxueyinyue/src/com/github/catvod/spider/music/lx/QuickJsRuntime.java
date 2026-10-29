package com.github.catvod.spider.music.lx;

import com.whl.quickjs.wrapper.JSCallFunction;
import com.whl.quickjs.wrapper.JSFunction;
import com.whl.quickjs.wrapper.JSObject;
import com.whl.quickjs.wrapper.QuickJSContext;

/**
 * 生产环境 JS 引擎：直接使用壳 APK 里的 quickjs-android（com.whl.quickjs.wrapper）。
 * 壳的 App.onCreate 已调用 QuickJSLoader.init() 加载 native 库。
 */
public final class QuickJsRuntime implements JsRuntime {

    private QuickJSContext ctx;

    public QuickJsRuntime() {
        ctx = QuickJSContext.create();
        try {
            ctx.setMaxStackSize(1024 * 1024);
        } catch (Throwable ignore) {
        }
    }

    @Override
    public void eval(String code, String fileName) {
        ctx.evaluate(code, fileName == null ? "script.js" : fileName);
    }

    @Override
    public Object newObject() {
        return ctx.createNewJSObject();
    }

    @Override
    public Object parseJson(String json) {
        return ctx.parse(json);
    }

    @Override
    public String stringify(Object obj) {
        return ctx.stringify((JSObject) obj);
    }

    @Override
    public void setGlobal(String name, Object value) {
        ctx.setProperty(ctx.getGlobalObject(), name, value);
    }

    @Override
    public void setProperty(Object target, String name, Object value) {
        JSObject obj = (JSObject) target;
        if (value instanceof HostFn) {
            final HostFn fn = (HostFn) value;
            ctx.setProperty(obj, name, new JSCallFunction() {
                @Override
                public Object call(Object... args) {
                    try {
                        return fn.invoke(args);
                    } catch (Throwable t) {
                        if (t instanceof RuntimeException) throw (RuntimeException) t;
                        throw new RuntimeException(t);
                    }
                }
            });
        } else if (value == null) {
            ctx.setProperty(obj, name, (Object) null);
        } else {
            ctx.setProperty(obj, name, value);
        }
    }

    @Override
    public Object getProperty(Object target, String name) {
        return ((JSObject) target).getProperty(name);
    }

    @Override
    public Object callFunction(Object fn, Object[] args) throws Exception {
        Object r = ((JSFunction) fn).call(args);
        return awaitPromise(r);
    }

    private Object awaitPromise(Object r) throws Exception {
        if (!(r instanceof JSObject)) return r;
        JSObject p = (JSObject) r;
        JSFunction then = p.getJSFunction("then");
        if (then == null) return r;
        final Object[] result = {null};
        final Throwable[] error = {null};
        final java.util.concurrent.CountDownLatch latch = new java.util.concurrent.CountDownLatch(1);
        then.call(new JSCallFunction() {
            @Override
            public Object call(Object... args) {
                if (result[0] == null) result[0] = args.length > 0 ? args[0] : null;
                latch.countDown();
                return null;
            }
        }, new JSCallFunction() {
            @Override
            public Object call(Object... args) {
                Object e = args.length > 0 ? args[0] : null;
                error[0] = new RuntimeException(e == null ? "promise rejected" : String.valueOf(e));
                latch.countDown();
                return null;
            }
        });
        latch.await();
        if (error[0] != null) {
            throw error[0] instanceof RuntimeException ? (RuntimeException) error[0] : new RuntimeException(error[0]);
        }
        return result[0];
    }

    @Override
    public boolean isFunction(Object value) {
        return value instanceof JSFunction;
    }

    @Override
    public byte[] toBytes(Object value) {
        if (value == null) return null;
        if (value instanceof byte[]) return (byte[]) value;
        if (value instanceof JSObject) {
            JSObject arr = (JSObject) value;
            Object len = arr.getProperty("length");
            int n = len instanceof Number ? ((Number) len).intValue() : 0;
            if (n <= 0) return new byte[0];
            byte[] out = new byte[n];
            for (int i = 0; i < n; i++) {
                Object v = arr.getProperty(String.valueOf(i));
                out[i] = v instanceof Number ? ((Number) v).byteValue() : 0;
            }
            return out;
        }
        return null;
    }

    @Override
    public void close() {
        QuickJSContext c = ctx;
        ctx = null;
        if (c != null) {
            try {
                c.destroy();
            } catch (Throwable ignore) {
            }
        }
    }
}
