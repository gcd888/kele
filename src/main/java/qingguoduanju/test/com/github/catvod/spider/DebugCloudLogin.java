package com.github.catvod.spider;

import android.content.Context;

/**
 * 桌面冒烟：Web 登录会话（二维码创建/轮询）在 cookie 回发修复后的行为。
 * 用法：java -cp <build> com.github.catvod.spider.DebugCloudLogin
 * 仅验证：qr.create 成功、poll 等待态 ok=false、无 token poll 报错文案；
 * 完整扫码确认仍需真机（手机扫 TV 上的码）。
 */
public class DebugCloudLogin {

    public static void main(String[] args) throws Exception {
        Context ctx = new Context();
        // 1. 品牌信息
        System.out.println("info => " + HongguoAccount.handle(ctx, "{\"do\":\"cloud.info\"}"));
        // 2. 创建二维码（验证 call() 带 Cookie 头后 get_qrcode 仍正常）
        String create = HongguoAccount.handle(ctx, "{\"do\":\"cloud.qr.create\"}");
        System.out.println("qr.create => code=" + j(create, "code")
                + " expire=" + j(create, "expire")
                + " imageLen=" + (j(create, "image").length()));
        // 3. 轮询一次（无人扫码，应 ok=false 而非报错）
        String poll = HongguoAccount.handle(ctx, "{\"do\":\"cloud.qr.poll\"}");
        System.out.println("qr.poll(未扫码) => " + poll);
        // 4. 取消会话
        System.out.println("cancel => " + HongguoAccount.handle(ctx, "{\"do\":\"cloud.cancel\"}"));
    }

    private static String j(String json, String key) {
        int k = json.indexOf("\"" + key + "\":");
        if (k < 0) return "?";
        int s = json.indexOf(':', k) + 1;
        int e = s;
        while (e < json.length()) {
            char c = json.charAt(e);
            if (c == ',' || c == '}') break;
            e++;
        }
        String v = json.substring(s, e).trim();
        return v.startsWith("\"") ? v.substring(1, v.length() - 1) : v;
    }
}
