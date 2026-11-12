# 桌面注册测试：生成 VerifyXhsDesktop 变体后，main 尾部插入 registerDevice 实调，打印注册响应
$ErrorActionPreference = "Stop"
$root = Split-Path -Parent $MyInvocation.MyCommand.Path
$src = Join-Path $root "src\com\github\catvod\spider\Xihongshiduanju.java"
$dstDir = Join-Path $root "build\desktop"
New-Item -ItemType Directory -Path $dstDir -Force | Out-Null
$dst = Join-Path $dstDir "VerifyXhsDesktop.java"

$t = Get-Content $src -Raw -Encoding UTF8
$t = $t -replace 'public class Xihongshiduanju extends Spider', 'public class VerifyXhsDesktop'
$t = $t -replace '(?m)^\s*@Override\s*\r?\n', ''
$t = $t -replace 'Base64\.encodeToString\(([^;]+?), Base64\.NO_WRAP\)', 'java.util.Base64.getEncoder().encodeToString($1)'
$t = $t -replace 'Base64\.decode\(([^;]+?), Base64\.DEFAULT\)', 'java.util.Base64.getDecoder().decode($1)'
$t = $t -replace 'Base64\.decode\(([^;]+?), Base64\.URL_SAFE\)', 'java.util.Base64.getUrlDecoder().decode($1)'
$t = $t -replace '(?s)private static void fileLog\(String msg\) \{.*?\r?\n    \}\r?\n\r?\n', "private static void fileLog(String msg) { System.out.println(`"[log] `" + msg); }`r`n`r`n"
$t = $t -replace 'import android\.util\.Base64;\r?\n', ''
$t = $t -replace 'import android\.util\.Log;\r?\n', ''
$t = $t -replace 'import com\.github\.catvod\.crawler\.Spider;\r?\n', ''
$t = $t.Replace('private static final String TAG = "echo-xhs-drama-jar";', "private static final String TAG = `"echo-xhs-drama-jar`";`r`n    private static Object mContext;`r`n    private String siteKey = `"xihongshiduanju`";")
$t = $t -replace '(?s)    /\*\* 设备存档读取（SharedPreferences；桌面 golden 变体整体替换本方法） \*/\r?\n    private static String devLoad\(\) \{.*?\n    \}', '    private static String devLoad() { return ""; }'
$t = $t -replace '(?s)    /\*\* 设备存档写入（桌面 golden 变体整体替换本方法） \*/\r?\n    private static void devSave\(String json\) \{.*?\n    \}', '    private static void devSave(String json) { }'
# main 尾部插入注册实调
$t = $t.Replace('if (!ok) System.exit(1);', @'
if (!ok) System.exit(1);
        System.out.println("REG-TEST begin");
        try {
            JSONObject d = registerDevice();
            System.out.println("REG-TEST device_id=" + d.optString("device_id") + " install_id=" + d.optString("install_id"));
            java.util.List<Series> items = new VerifyXhsDesktop().appSearchPage("热播", 1);
            System.out.println("SEARCH-TEST items=" + items.size());
            if (!items.isEmpty()) {
                System.out.println("SEARCH-TEST first=" + items.get(0).id + " | " + items.get(0).name + " | " + items.get(0).cover.substring(0, Math.min(40, items.get(0).cover.length())));
                JSONObject det = detailAll(items.get(0).id);
                System.out.println("DETAIL-TEST eps=" + det.optJSONArray("eps").length());
                String vid0 = det.optJSONArray("eps").optJSONObject(0).optString("vid");
                StreamInfo si = stream(vid0);
                System.out.println("STREAM-TEST quality=" + si.quality + " url_ok=" + si.url.startsWith("http") + " len=" + si.url.length());
                java.util.Map<String, String> pq = new java.util.HashMap<>();
                pq.put("do", "play");
                pq.put("vid", vid0);
                pq.put("range", "bytes=0-1048575");
                Object[] pr = new VerifyXhsDesktop().proxy(pq);
                if (pr == null) {
                    System.out.println("PROXY-TEST null");
                } else {
                    java.io.InputStream pin = (java.io.InputStream) pr[2];
                    byte[] head = new byte[64];
                    int got = pin.read(head);
                    pin.close();
                    System.out.println("PROXY-TEST code=" + pr[0] + " mime=" + pr[1]
                            + " got=" + got + " magic=" + new String(head, 4, 4, StandardCharsets.US_ASCII));
                    java.util.Map<String, String> pq2 = new java.util.HashMap<>();
                    pq2.put("do", "play");
                    pq2.put("vid", vid0);
                    pq2.put("range", "bytes=1048576-2097151");
                    Object[] pr2 = new VerifyXhsDesktop().proxy(pq2);
                    java.io.InputStream pin2 = (java.io.InputStream) pr2[2];
                    byte[] mid = new byte[4096];
                    int got2 = pin2.read(mid);
                    pin2.close();
                    System.out.println("PROXY-TEST mid code=" + pr2[0] + " got=" + got2);
                }
            }
        } catch (Throwable tr) {
            System.out.println("TEST FAIL " + tr);
        }
'@)
[System.IO.File]::WriteAllText($dst, $t, [System.Text.UTF8Encoding]::new($false))
Write-Host "desktop variant: $dst"
$androidJar = "D:\Tool\platforms\android-35\android.jar"
$clsDir = Join-Path $dstDir "classes"
Add-Type -AssemblyName System.IO.Compression.FileSystem
$zip = [System.IO.Compression.ZipFile]::OpenRead($androidJar)
try {
    foreach ($e in $zip.Entries) {
        if ($e.FullName -like "org/json/*" -and $e.FullName.EndsWith(".class")) {
            $target = Join-Path $clsDir $e.FullName
            New-Item -ItemType Directory -Path (Split-Path -Parent $target) -Force | Out-Null
            [System.IO.Compression.ZipFileExtensions]::ExtractToFile($e, $target, $true)
        }
    }
} finally {
    $zip.Dispose()
}
& javac -encoding UTF-8 -nowarn -cp "C:\Users\gcd888\.gradle\caches\modules-2\files-2.1\org.json\json\20240303\ebb88e8fb5122b7506d5cf1d69f1ccdb790d22a\json-20240303.jar;$clsDir" -d $clsDir $dst
if ($LASTEXITCODE -ne 0) { throw "desktop javac failed" }
& java -cp "C:\Users\gcd888\.gradle\caches\modules-2\files-2.1\org.json\json\20240303\ebb88e8fb5122b7506d5cf1d69f1ccdb790d22a\json-20240303.jar;$clsDir" com.github.catvod.spider.VerifyXhsDesktop
