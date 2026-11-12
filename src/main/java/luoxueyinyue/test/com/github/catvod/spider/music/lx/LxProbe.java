package com.github.catvod.spider.music.lx;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * 桌面 JVM 探针：用 GraalJS 跑真实 LX 脚本 + 真实网络取流。
 * 用法: LxProbe <脚本路径> [platform songId] ...
 * 默认跑 聚合CF/星海/落雪 三脚本 × wy/tx 两首歌。
 */
public final class LxProbe {

    private static final String LIB = "E:/HelloWorld/project/kele/src/guoju-api/果果音乐/lib/lx/";

    public static void main(String[] args) throws Exception {
        String[] scripts;
        String[][] songs = {{"wy", "347230"}, {"tx", "0039MnYb0qxYhV"}};
        if (args.length > 0) {
            scripts = new String[]{args[0]};
            if (args.length >= 3) songs = new String[][]{{args[1], args[2]}};
        } else {
            scripts = new String[]{"lx_juhe_cf.js", "lx_xinghai.js", "lx_luoxue.js"};
        }
        int ok = 0;
        int total = 0;
        for (String script : scripts) {
            String label = script.replace("lx_", "").replace(".js", "");
            System.out.println("=========== [" + label + "] ===========");
            LxScript lx;
            try {
                lx = new LxScript(null, LIB + script, label, GraalJsRuntime::new);
            } catch (Throwable t) {
                System.out.println("CREATE FAIL: " + t);
                t.printStackTrace();
                continue;
            }
            for (String[] song : songs) {
                total++;
                String platform = song[0];
                String id = song[1];
                long t0 = System.currentTimeMillis();
                String url = "";
                Throwable err = null;
                try {
                    url = lx.musicUrl(platform, id);
                } catch (Throwable t) {
                    err = t;
                }
                long cost = System.currentTimeMillis() - t0;
                if (url == null || url.isEmpty()) {
                    System.out.println("[" + label + "] " + platform + " " + id + " FAIL cost=" + cost + "ms"
                            + (err == null ? "" : " err=" + err));
                } else {
                    String check = probe(url);
                    boolean good = check.contains("200") || check.contains("206");
                    if (good) ok++;
                    System.out.println("[" + label + "] " + platform + " " + id + " OK cost=" + cost + "ms " + check);
                    System.out.println("    url=" + url.substring(0, Math.min(160, url.length())));
                }
            }
            lx.close();
        }
        System.out.println("=========== DONE ok=" + ok + "/" + total + " ===========");
    }

    private static String probe(String url) {
        HttpURLConnection conn = null;
        try {
            conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setConnectTimeout(8000);
            conn.setReadTimeout(8000);
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Range", "bytes=0-1023");
            conn.setRequestProperty("User-Agent", "okhttp/4.9.3");
            int code = conn.getResponseCode();
            String type = conn.getContentType();
            int len = 0;
            InputStream in = code >= 400 ? conn.getErrorStream() : conn.getInputStream();
            if (in != null) {
                ByteArrayOutputStream buf = new ByteArrayOutputStream();
                byte[] tmp = new byte[4096];
                int n;
                while ((n = in.read(tmp)) > 0 && buf.size() < 65536) buf.write(tmp, 0, n);
                in.close();
                len = buf.size();
            }
            return "HTTP " + code + " type=" + type + " bytes=" + len;
        } catch (Throwable t) {
            return "PROBE FAIL: " + t;
        } finally {
            if (conn != null) {
                try {
                    conn.disconnect();
                } catch (Throwable ignore) {
                }
            }
        }
    }
}
