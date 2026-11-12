package com.github.catvod.spider;

import java.util.LinkedHashMap;

/**
 * 桌面金标测试：注入 golden.json 的固定随机序列与时钟，逐字节比对 Java 移植签名输出。
 * 用法：java -cp <build> com.github.catvod.spider.TestMain <golden.json>
 * 金标由 test/golden.mjs（golden 模式）从蓝本 hongguo.cjs 算法块产出。
 */
public class TestMain {

    private static int failures = 0;

    private static String match(String src, String regex) {
        java.util.regex.Matcher m = java.util.regex.Pattern.compile(regex).matcher(src);
        if (!m.find()) {
            System.out.println("[FAIL] golden 字段缺失: " + regex);
            failures++;
            return "";
        }
        return m.group(1);
    }

    private static void check(String name, String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("[PASS] " + name + " (" + actual.substring(0, Math.min(48, actual.length()))
                    + (actual.length() > 48 ? "..." : "") + ")");
        } else {
            System.out.println("[FAIL] " + name);
            System.out.println("  golden=" + expected);
            System.out.println("  actual=" + actual);
            failures++;
        }
    }

    public static void main(String[] args) throws Exception {
        byte[] raw = java.nio.file.Files.readAllBytes(java.nio.file.Paths.get(args[0]));
        String src = new String(raw, "UTF-8");
        long khronos = Long.parseLong(match(src, "\"khronos\": (\\d+)"));
        String keyword = match(src, "\"keyword\": \"([^\"]*)\"");
        String goldenQuery = match(src, "\"query\": \"([^\"]*)\"");
        String gGorgon = match(src, "\"x-gorgon\": \"([^\"]*)\"");
        String gHelios = match(src, "\"x-helios\": \"([^\"]*)\"");
        String gMedusa = match(src, "\"x-medusa\": \"([^\"]*)\"");
        String sm3abc = match(src, "\"sm3abc\": \"([^\"]*)\"");
        String iid = match(src, "\"iid\": \"(\\d+)\"");
        String deviceId = match(src, "\"device_id\": \"(\\d+)\"");
        String randomsRaw = match(src, "\"randoms\": \\[([^\\]]*)\\]");
        String[] parts = randomsRaw.split(",");
        final double[] randoms = new double[parts.length];
        for (int i = 0; i < parts.length; i++) randoms[i] = Double.parseDouble(parts[i].trim());
        System.out.println("khronos=" + khronos + " randoms=" + randoms.length
                + " iid=" + iid + " device_id=" + deviceId);

        // SM3 标准向量（GB/T 32905-2016）
        StringBuilder sb = new StringBuilder();
        for (byte b : Qingguoduanju.sm3("abc".getBytes("UTF-8"))) sb.append(String.format("%02x", b & 255));
        check("sm3(abc)", sb.toString(), sm3abc);
        sb = new StringBuilder();
        for (byte b : Qingguoduanju.sm3(new byte[0])) sb.append(String.format("%02x", b & 255));
        check("sm3(empty)", sb.toString(),
                "1ab21d8355cfa17f8e61194831e81a8f22bec8c728fefb747ed035eb5082aa2b");

        Qingguoduanju.ClockMs clock = new Qingguoduanju.ClockMs() {
            @Override
            public long now() {
                return khronos * 1000;
            }
        };
        final int[] idx = {0};
        Qingguoduanju.Rand rand = new Qingguoduanju.Rand() {
            @Override
            public double next() {
                return randoms[idx[0]++];
            }
        };
        Qingguoduanju.CLOCK = clock;
        Qingguoduanju.RAND = rand;

        // 组参顺序 = 蓝本 appSearchParams + ts/_rticket（与 golden.mjs golden 模式一致）
        LinkedHashMap<String, String> values = Qingguoduanju.appDeviceParams(iid, deviceId);
        values.put("query", keyword);
        values.put("count", "20");
        values.put("offset", "0");
        values.put("tab_type", "11");
        values.put("bookshelf_search_plan", "4");
        values.put("use_correct", "true");
        values.put("user_is_login", "0");
        values.put("ts", String.valueOf(khronos));
        values.put("_rticket", String.valueOf(khronos * 1000));
        String query = Qingguoduanju.pythonUrlEncode(values);
        check("query", query, goldenQuery);
        check("branch", String.valueOf(Qingguoduanju.branchOf(query, (int) khronos)), "0");

        String url = Qingguoduanju.APP_SEARCH_API + "?" + query;
        int random = (int) (Qingguoduanju.RAND.next() * 65536); // random #1（gorgon）
        check("x-gorgon", Qingguoduanju.xGorgon(query, null, (int) khronos, random), gGorgon);
        check("x-helios", Qingguoduanju.helios((int) khronos), gHelios); // random #2
        check("x-medusa", Qingguoduanju.buildMedusa(url, null, (int) khronos, deviceId), gMedusa); // random #3-7

        System.out.println("used randoms=" + idx[0] + "/" + randoms.length);
        System.out.println(failures == 0 ? "ALL PASS" : failures + " FAILURES");
        if (failures > 0) System.exit(1);
    }
}
