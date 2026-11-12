import com.github.catvod.spider.music.MusicCore;

import java.util.Collections;
import java.util.HashMap;

/**
 * QQ MV 站源（秋映）冒烟测试（纯 JVM 直跑 MusicCore，真实端点）：
 * 分类/筛选 → 列表翻页 → 搜索 → 详情 → 取流（gosrf MvUrlProxy）。
 * 运行：java -cp build\test-classes;<json.jar> QqMvSmokeTest
 */
public class QqMvSmokeTest {

    private static int pass = 0;
    private static int fail = 0;

    public static void main(String[] args) {
        System.out.println("========== QQ MV 站源冒烟测试 ==========");
        // 1. homeContent（含动态筛选）
        String home = MusicCore.qqMvHomeContent(true);
        require(home.contains("mvq_all") && home.contains("filters"), "homeContent");
        System.out.println("  home OK: " + brief(home, 220));
        // 2. 列表第 1/2 页 + 筛选
        String page1 = MusicCore.qqMvCategoryContent("mvq_all", "1", null);
        require(page1.contains("mvq_"), "category page1");
        System.out.println("  list p1 OK: " + brief(page1, 260));
        String page2 = MusicCore.qqMvCategoryContent("mvq_all", "2", null);
        require(page2.contains("\"page\":2"), "category page2");
        HashMap<String, String> extend = new HashMap<>();
        extend.put("area", "16");
        extend.put("version", "9");
        String filtered = MusicCore.qqMvCategoryContent("mvq_all", "1", extend);
        require(filtered.contains("mvq_"), "category filtered(内地/现场)");
        System.out.println("  list filter OK: " + brief(filtered, 220));
        // 3. 搜索
        String search = MusicCore.qqMvSearchContent("周杰伦", "1");
        require(search.contains("mvq_"), "search");
        System.out.println("  search OK: " + brief(search, 260));
        // 4. 详情（晴天）
        String detail = MusicCore.qqMvDetailContent(Collections.singletonList("mvq_w0026q7f01a"));
        require(detail.contains("mvq_w0026q7f01a"), "detail");
        System.out.println("  detail OK: " + brief(detail, 300));
        // 5. 取流（playerContent mvq 分支）
        String play = MusicCore.playerContent(MusicCore.PLAY_FLAG, "mvq_w0026q7f01a");
        require(play.contains("http"), "playerContent mvq");
        System.out.println("  play OK: " + brief(play, 300));
        System.out.println("========== 结果: PASS=" + pass + " FAIL=" + fail + " ==========");
        if (fail > 0) System.exit(1);
    }

    private static void require(boolean cond, String name) {
        if (cond) {
            pass++;
            System.out.println("[PASS] " + name);
        } else {
            fail++;
            System.out.println("[FAIL] " + name);
        }
    }

    private static String brief(String s, int max) {
        if (s == null) return "null";
        String one = s.replaceAll("\\s+", " ");
        return one.length() <= max ? one : one.substring(0, max) + "...(" + one.length() + " chars)";
    }
}
