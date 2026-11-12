package com.github.catvod.spider;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/** 调试：桌面 JVM 上真实走一遍 App 搜索链路（注册设备 → 签名 → 请求 → 解析）。 */
public class DebugLive {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Qingguoduanju spider = new Qingguoduanju();
        Method m = Qingguoduanju.class.getDeclaredMethod("appSearchPage", String.class, int.class);
        m.setAccessible(true);
        long t0 = System.currentTimeMillis();
        Object page = m.invoke(spider, args.length > 0 ? args[0] : "季爷今天真香了吗第九季", 1);
        System.out.println("cost=" + (System.currentTimeMillis() - t0) + "ms");
        Field itemsF = page.getClass().getDeclaredField("items");
        itemsF.setAccessible(true);
        List<Object> items = (List<Object>) itemsF.get(page);
        Field nameF = items.iterator().next().getClass().getDeclaredField("name");
        nameF.setAccessible(true);
        for (Object s : items) System.out.println(" - " + nameF.get(s));
    }
}
