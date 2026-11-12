package com.github.catvod.spider;

/** 桌面集成验证：直接调用 jar 内 dmFetchXml，确认弹幕模块在最终源码中可用。 */
public class DanmuJarTest {

    public static void main(String[] args) throws Exception {
        String vid = args.length > 0 ? args[0] : "7481128004467297304";
        String series = args.length > 1 ? args[1] : "7481108346636864536";
        String xml = args.length > 2 && "xhs".equals(args[2])
                ? Xihongshiduanju.dmFetchXml(vid, series)
                : Qingguoduanju.dmFetchXml(vid, series);
        int dCount = 0;
        int idx = 0;
        while ((idx = xml.indexOf("<d p=", idx)) >= 0) {
            dCount++;
            idx += 5;
        }
        System.out.println("[jar-danmu] xml bytes=" + xml.length() + " dCount=" + dCount);
        int head = xml.indexOf("</i>");
        System.out.println("[head] " + xml.substring(0, Math.min(400, head)));
        if (dCount == 0) {
            System.out.println("[FAIL] no danmaku");
            System.exit(1);
        }
        System.out.println("[PASS]");
    }
}
