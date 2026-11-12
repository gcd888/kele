package com.github.catvod.spider;

import android.content.Context;

/**
 * 桌面冒烟：短信登录 App 通道（security.snssdk.com）是否绕开滑块风控。
 * 用法：java -cp <build> com.github.catvod.spider.DebugSmsLogin [手机号]
 * 不传手机号时用占位号 13800138000 只探风控口径：
 * 期望「验证码没发出去/发送成功」等业务响应，而不是「平台要求先完成滑块验证」。
 * 注意：传真实手机号会真实下发短信验证码。
 */
public class DebugSmsLogin {

    public static void main(String[] args) throws Exception {
        Context ctx = new Context();
        String mobile = args.length > 0 ? args[0] : "13800138000";
        System.out.println("info => " + HongguoAccount.handle(ctx, "{\"do\":\"cloud.info\"}"));
        String send = HongguoAccount.handle(ctx, "{\"do\":\"cloud.sms.send\",\"mobile\":\"" + mobile + "\"}");
        System.out.println("sms.send(" + mobile + ") => " + send);
        if (send.contains("滑块")) {
            System.out.println("RESULT => FAIL 仍触发滑块风控");
            return;
        }
        if (send.contains("\"code\":0")) {
            System.out.println("RESULT => PASS App 通道签名与设备指纹被平台接受");
        } else {
            System.out.println("RESULT => PARTIAL 未触发滑块但业务报错（口径已过，需真机真实号码进一步验证）");
        }
        System.out.println("cancel => " + HongguoAccount.handle(ctx, "{\"do\":\"cloud.cancel\"}"));
    }
}
