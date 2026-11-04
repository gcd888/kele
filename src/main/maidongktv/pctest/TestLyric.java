import com.github.catvod.spider.maidongktv.LyricFetcher;

/** 歌词匹配 PC 验证：K歌修饰歌名清洗 + 网易云匹配。 */
public class TestLyric {
    public static void main(String[] args) {
        System.out.println("clean(朋友(HD)) = [" + LyricFetcher.cleanName("朋友(HD)") + "]");
        System.out.println("clean(朋友的酒(DJ小鱼儿版)) = [" + LyricFetcher.cleanName("朋友的酒(DJ小鱼儿版)") + "]");
        long t0 = System.currentTimeMillis();
        String lrc = LyricFetcher.fetch("朋友(HD)", "周华健");
        long cost = System.currentTimeMillis() - t0;
        System.out.println("朋友(HD)/周华健 -> " + (lrc.isEmpty() ? "MISS" : lrc.length() + " chars") + " (" + cost + "ms)");
        if (!lrc.isEmpty()) {
            // 打印前几行正文（跳过元数据）
            for (String line : lrc.split("\n")) {
                if (line.contains("这些年") || line.contains("风也过")) { System.out.println("  " + line); break; }
            }
        }
        t0 = System.currentTimeMillis();
        String lrc2 = LyricFetcher.fetch("不存在的歌名XYZ123", "");
        System.out.println("不存在歌名 -> " + (lrc2.isEmpty() ? "MISS(符合预期)" : lrc2.length()) + " (" + (System.currentTimeMillis() - t0) + "ms)");
        t0 = System.currentTimeMillis();
        String lrc3 = LyricFetcher.fetch("朋友(HD)", "周华健");
        System.out.println("缓存命中 -> " + lrc3.length() + " chars (" + (System.currentTimeMillis() - t0) + "ms)");
    }
}
