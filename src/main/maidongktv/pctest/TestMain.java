import com.github.catvod.spider.maidongktv.MuseApi;
import com.github.catvod.spider.maidongktv.SongGateway;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * maidongktv 取流链路 PC 预检：
 * 1) MuseApi 登录（cherryonline mad-api）→ 热门歌曲第 1 页
 * 2) SongGateway.resolve(音乐编号) → 第三方网关 TS 直链
 * 3) 直链 Range 探测 → 确认可播
 */
public class TestMain {
    public static void main(String[] args) throws Exception {
        System.out.println("=== 1. 曲库登录 + 热门歌曲 ===");
        MuseApi api = new MuseApi();
        api.ensureLogin();
        System.out.println("登录 OK");
        MuseApi.Song[] songs = api.getSongs(1, 5);
        if (songs.length == 0) {
            System.out.println("曲库返回 0 首 —— 曲库接口异常");
            return;
        }
        for (MuseApi.Song s : songs) {
            System.out.println("  id=" + s.id + " tid=" + s.tid + " 《" + s.name + "》 " + s.singer);
        }

        System.out.println("=== 2. 网关取流（第一首） ===");
        MuseApi.Song first = songs[0];
        long t0 = System.currentTimeMillis();
        String url = SongGateway.resolve(first.id, "720", false);
        long cost = System.currentTimeMillis() - t0;
        if (url == null) {
            System.out.println("resolve FAIL（" + cost + "ms）—— 全部源不可用");
            // 容错：试 tid
            if (!first.tid.equals(first.id) && first.tid.matches("\\d+")) {
                System.out.println("尝试 tid=" + first.tid + " ...");
                url = SongGateway.resolve(first.tid, "720", false);
                if (url == null) return;
            } else {
                return;
            }
        }
        System.out.println("取流 OK（" + cost + "ms） 源=" + SongGateway.lastHost());
        System.out.println("URL: " + url);

        System.out.println("=== 3. 直链探测（Range 64KB） ===");
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestProperty("Range", "bytes=0-65535");
        conn.setConnectTimeout(8000);
        conn.setReadTimeout(8000);
        int code = conn.getResponseCode();
        String type = conn.getContentType();
        long len = code == 206 ? 64 * 1024 : conn.getContentLength();
        byte[] head = new byte[4];
        try (InputStream in = conn.getInputStream()) {
            int n = in.read(head);
            System.out.println("HTTP " + code + " type=" + type + " gotBytes=" + len);
            System.out.println("magic: " + String.format("%02X %02X %02X %02X",
                    head[0] & 0xff, head[1] & 0xff, head[2] & 0xff, head[3] & 0xff));
            boolean ts = (head[0] & 0xff) == 0x47; // MPEG-TS 同步字节 0x47
            System.out.println(ts ? "✅ MPEG-TS 确认（0x47）—— 全链路可用" : "⚠️ 非标准 TS 头，需人工确认");
        }
    }
}
