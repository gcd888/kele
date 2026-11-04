package com.github.catvod.spider.maidongktv;

import org.json.JSONObject;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.util.Locale;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/**
 * 裸 Socket「干净 GET」通道（自 maidong-ktv KtvJsBridge.rawRequest 范式移植）。
 *
 * 为什么必须裸 Socket：麦动K歌歌曲源（w.w345.my 系列）的 /music/do.php 风控只放行
 * 「干净」请求 —— 原版客户端抓包仅 Host + Accept 两个头；带任何 User-Agent /
 * Connection / Accept-Encoding 头（空 UA、Dalvik、okhttp、Chrome 均实测被拒）
 * 都会返回 403「检测到异常行为」。HttpURLConnection 无法可靠抑制默认头，
 * 因此手写 HTTP/1.1。
 *
 * 返回信封（与 maidong 原版一致）：{"status":int,"body":String,"error":String}
 * status=0 表示连接层失败；任何 HTTP 状态码都如实返回，不做二次补发
 * （限流期补发只会双倍放大请求量，加速被源限流）。
 */
public final class CleanHttp {

    private CleanHttp() {
    }

    /** 干净 GET：仅发 Host + Accept 两个请求头。 */
    public static String get(String url, int timeoutMs) {
        Socket socket = null;
        try {
            URI uri = new URL(url).toURI();
            boolean https = "https".equalsIgnoreCase(uri.getScheme());
            int port = uri.getPort() > 0 ? uri.getPort() : (https ? 443 : 80);
            int timeout = clamp(timeoutMs);

            socket = new Socket();
            socket.connect(new InetSocketAddress(uri.getHost(), port), timeout);
            socket.setSoTimeout(timeout);
            if (https) {
                // 先连接再包装：createSocket(plain, host, port, true) 补主机名（SNI/证书校验）。
                SSLSocketFactory sslFactory = (SSLSocketFactory) javax.net.ssl.SSLSocketFactory.getDefault();
                SSLSocket ssl = (SSLSocket) sslFactory
                        .createSocket(socket, uri.getHost(), port, true);
                ssl.startHandshake();
                socket = ssl;
            }

            String path = uri.getRawQuery() != null
                    ? uri.getRawPath() + "?" + uri.getRawQuery()
                    : uri.getRawPath();
            StringBuilder req = new StringBuilder();
            req.append("GET ").append(path).append(" HTTP/1.1\r\n");
            req.append("Host: ").append(uri.getHost()).append("\r\n");
            req.append("Accept: */*\r\n");
            req.append("\r\n");
            OutputStream out = socket.getOutputStream();
            out.write(req.toString().getBytes("UTF-8"));
            out.flush();

            BufferedInputStream in = new BufferedInputStream(socket.getInputStream());
            String statusLine = readAsciiLine(in);
            int status = 0;
            if (statusLine != null) {
                String[] parts = statusLine.split(" ");
                if (parts.length >= 2) {
                    try { status = Integer.parseInt(parts[1]); } catch (Exception ignored) {}
                }
            }
            long contentLength = -1L;
            boolean chunked = false;
            while (true) {
                String line = readAsciiLine(in);
                if (line == null) break;
                if (line.isEmpty()) break;
                int idx = line.indexOf(':');
                if (idx > 0) {
                    String name = line.substring(0, idx).trim().toLowerCase(Locale.ROOT);
                    String value = line.substring(idx + 1).trim();
                    if ("content-length".equals(name)) {
                        try { contentLength = Long.parseLong(value); } catch (Exception ignored) {}
                    }
                    if ("transfer-encoding".equals(name) && value.contains("chunked")) chunked = true;
                }
            }
            String body;
            if (chunked) {
                body = readChunkedBody(in);
            } else if (contentLength >= 0) {
                body = new String(readExact(in, contentLength), "UTF-8");
            } else {
                ByteArrayOutputStream rest = new ByteArrayOutputStream();
                byte[] buf = new byte[8192];
                int n;
                while ((n = in.read(buf)) > 0) rest.write(buf, 0, n);
                body = new String(rest.toByteArray(), "UTF-8");
            }
            return envelope(status, body, null);
        } catch (Throwable e) {
            return envelope(0, "", e.getMessage() == null ? e.getClass().getSimpleName() : e.getMessage());
        } finally {
            try { if (socket != null) socket.close(); } catch (Exception ignored) {}
        }
    }

    private static String envelope(int status, String body, String error) {
        try {
            JSONObject o = new JSONObject();
            o.put("status", status);
            o.put("body", body);
            if (error != null) o.put("error", error);
            return o.toString();
        } catch (Exception ignored) {
            return "{\"status\":" + status + ",\"body\":\"\"}";
        }
    }

    private static int clamp(int timeoutMs) {
        if (timeoutMs < 1000) return 1000;
        return Math.min(timeoutMs, 30000);
    }

    private static String readAsciiLine(InputStream in) throws Exception {
        StringBuilder sb = new StringBuilder();
        while (true) {
            int b = in.read();
            if (b < 0) return sb.length() == 0 ? null : sb.toString();
            if (b == '\n') {
                if (sb.length() > 0 && sb.charAt(sb.length() - 1) == '\r') sb.setLength(sb.length() - 1);
                return sb.toString();
            }
            sb.append((char) b);
        }
    }

    private static byte[] readExact(InputStream in, long length) throws Exception {
        int size = (int) Math.min(length, (long) Integer.MAX_VALUE);
        byte[] result = new byte[size];
        int off = 0;
        while (off < size) {
            int n = in.read(result, off, size - off);
            if (n < 0) break;
            off += n;
        }
        return off == size ? result : java.util.Arrays.copyOf(result, off);
    }

    private static String readChunkedBody(InputStream in) throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        while (true) {
            String sizeLine = readAsciiLine(in);
            if (sizeLine == null) break;
            int semi = sizeLine.indexOf(';');
            String hex = (semi >= 0 ? sizeLine.substring(0, semi) : sizeLine).trim();
            int size;
            try {
                size = Integer.parseInt(hex, 16);
            } catch (Exception e) {
                break;
            }
            if (size <= 0) break;
            out.write(readExact(in, size));
            readAsciiLine(in); // 吃掉 chunk 尾部 CRLF
        }
        return new String(out.toByteArray(), "UTF-8");
    }
}
