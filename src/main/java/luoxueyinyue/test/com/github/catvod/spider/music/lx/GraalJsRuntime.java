package com.github.catvod.spider.music.lx;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;
import org.graalvm.polyglot.proxy.ProxyExecutable;

import java.io.StringReader;
import java.util.concurrent.CountDownLatch;

/**
 * 桌面探针专用 JS 引擎（仅测试目录，不进生产 jar）。
 * 生产环境用 QuickJsRuntime（壳内 whl quickjs）。
 */
public final class GraalJsRuntime implements JsRuntime {

    private final Context ctx;

    public GraalJsRuntime() {
        ctx = Context.newBuilder("js").allowAllAccess(true).build();
    }

    @Override
    public void eval(String code, String fileName) throws Exception {
        ctx.eval(Source.newBuilder("js", new StringReader(code), fileName == null ? "script.js" : fileName).buildLiteral());
    }

    @Override
    public Object newObject() {
        return ctx.eval("js", "({})");
    }

    @Override
    public Object parseJson(String json) {
        return jsonMember().invokeMember("parse", json);
    }

    @Override
    public String stringify(Object obj) {
        Value v = jsonMember().invokeMember("stringify", obj);
        return v.isString() ? v.asString() : String.valueOf(v);
    }

    private Value jsonMember() {
        return ctx.getBindings("js").getMember("JSON");
    }

    @Override
    public void setGlobal(String name, Object value) {
        ctx.getBindings("js").putMember(name, asValue(value));
    }

    @Override
    public void setProperty(Object target, String name, Object value) {
        ((Value) target).putMember(name, asValue(value));
    }

    @Override
    public Object getProperty(Object target, String name) {
        Value v = ((Value) target).getMember(name);
        return v == null || v.isNull() ? null : conv(v);
    }

    private Value asValue(Object value) {
        if (value instanceof Value) return (Value) value;
        if (value instanceof HostFn) {
            final HostFn fn = (HostFn) value;
            return ctx.asValue((ProxyExecutable) arguments -> {
                Object[] args = new Object[arguments.length];
                for (int i = 0; i < arguments.length; i++) args[i] = conv(arguments[i]);
                try {
                    return fn.invoke(args);
                } catch (Throwable t) {
                    if (t instanceof RuntimeException) throw (RuntimeException) t;
                    throw new RuntimeException(t);
                }
            });
        }
        return ctx.asValue(value);
    }

    /** Value → Java 原生类型（字符串/数字/布尔/byte[]），JS 对象与函数保留为 Value 句柄 */
    private static Object conv(Value v) {
        if (v == null) return null;
        if (v.isNull()) return null;
        if (v.isHostObject()) {
            Object h = v.asHostObject();
            if (h instanceof byte[]) return h;
            try {
                return v.as(byte[].class);
            } catch (Throwable ignore) {
                return h;
            }
        }
        if (v.isString()) return v.asString();
        if (v.isBoolean()) return v.asBoolean();
        if (v.isNumber()) {
            return v.fitsInInt() ? (Object) v.asInt() : (Object) v.asDouble();
        }
        // ArrayBuffer / 类数组 → byte[]
        if (v.hasArrayElements() && !v.hasMembers()) {
            try {
                long n = v.getArraySize();
                byte[] out = new byte[(int) n];
                for (int i = 0; i < n; i++) out[i] = (byte) v.getArrayElement(i).asInt();
                return out;
            } catch (Throwable ignore) {
            }
        }
        if (v.hasArrayElements() && v.hasMember("byteLength")) {
            try {
                int n = (int) v.getMember("byteLength").asInt();
                byte[] out = new byte[n];
                for (int i = 0; i < n; i++) out[i] = (byte) v.getArrayElement(i).asInt();
                return out;
            } catch (Throwable ignore) {
            }
        }
        return v;
    }

    @Override
    public Object callFunction(Object fn, Object[] args) {
        Value[] vals = new Value[args.length];
        for (int i = 0; i < args.length; i++) vals[i] = asValue(args[i]);
        Value r = ((Value) fn).execute(vals);
        return awaitPromise(r);
    }

    private Object awaitPromise(Value r) {
        if (r == null || r.isNull()) return null;
        boolean maybePromise;
        try {
            maybePromise = !r.isHostObject() && r.hasMember("then");
        } catch (Throwable t) {
            maybePromise = false;
        }
        if (maybePromise) {
            try {
                Value then = r.getMember("then");
                if (then != null && then.canExecute()) {
                    final Object[] result = {null};
                    final Throwable[] error = {null};
                    final CountDownLatch latch = new CountDownLatch(1);
                    Value ok = ctx.asValue((ProxyExecutable) arguments -> {
                        if (result[0] == null && arguments.length > 0) result[0] = conv(arguments[0]);
                        latch.countDown();
                        return null;
                    });
                    Value err = ctx.asValue((ProxyExecutable) arguments -> {
                        error[0] = new RuntimeException(arguments.length > 0 && arguments[0] != null
                                ? String.valueOf(arguments[0]) : "promise rejected");
                        latch.countDown();
                        return null;
                    });
                    then.execute(ok, err);
                    try {
                        if (!latch.await(30, java.util.concurrent.TimeUnit.SECONDS)) {
                            throw new RuntimeException("promise await timeout");
                        }
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException(e);
                    }
                    if (error[0] != null) {
                        throw error[0] instanceof RuntimeException ? (RuntimeException) error[0] : new RuntimeException(error[0]);
                    }
                    return result[0];
                }
            } catch (RuntimeException e) {
                throw e;
            } catch (Throwable t) {
                throw new RuntimeException(t);
            }
        }
        return conv(r);
    }

    @Override
    public boolean isFunction(Object value) {
        if (!(value instanceof Value)) return false;
        Value v = (Value) value;
        try {
            return v.canExecute() && !v.isHostObject();
        } catch (Throwable t) {
            return false;
        }
    }

    @Override
    public byte[] toBytes(Object value) {
        if (value == null) return null;
        if (value instanceof byte[]) return (byte[]) value;
        if (value instanceof Value) {
            Object c = conv((Value) value);
            return c instanceof byte[] ? (byte[]) c : null;
        }
        return null;
    }

    @Override
    public void close() {
        try {
            ctx.close(true);
        } catch (Throwable ignore) {
        }
    }
}
