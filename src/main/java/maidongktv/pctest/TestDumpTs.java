import com.github.catvod.spider.maidongktv.MuseApi;
import com.github.catvod.spider.maidongktv.SongGateway;
import com.github.catvod.spider.maidongktv.ThunderDecrypt;

import java.io.FileOutputStream;

/** 导出解密后的 TS 供 ffprobe 分析音频声道（验证左右声道分轨假设）。 */
public class TestDumpTs {
    public static void main(String[] args) throws Exception {
        MuseApi api = new MuseApi();
        api.ensureLogin();
        MuseApi.Song[] songs = api.getSongs(1, 5);
        MuseApi.Song first = songs[0];
        System.out.println("song: tid=" + first.tid + " " + first.name);
        String url = SongGateway.resolve(first.tid, "720", false);
        if (url == null) { System.out.println("resolve FAIL"); return; }
        byte[] file = MuseApi.downloadFull(url);
        System.out.println("encrypted=" + file.length);
        byte[] ts = ThunderDecrypt.decryptAll(file);
        System.out.println("decrypted=" + ts.length);
        FileOutputStream out = new FileOutputStream("sample.ts");
        // 只导前 4MB 足够分析
        out.write(ts, 0, Math.min(48 * 1024 * 1024, ts.length));
        out.close();
        System.out.println("saved sample.ts");
    }
}
