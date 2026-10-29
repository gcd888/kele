# 生成桌面 golden 验证变体：Fanqieduanju.java -> build\desktop\VerifyFqDesktop.java
$ErrorActionPreference = "Stop"
$root = Split-Path -Parent $MyInvocation.MyCommand.Path
$src = Join-Path $root "src\com\github\catvod\spider\Fanqieduanju.java"
$dstDir = Join-Path $root "build\desktop"
New-Item -ItemType Directory -Path $dstDir -Force | Out-Null
$dst = Join-Path $dstDir "VerifyFqDesktop.java"

$t = Get-Content $src -Raw -Encoding UTF8
$t = $t -replace 'public class Fanqieduanju extends Spider', 'public class VerifyFqDesktop'
$t = $t -replace '(?m)^\s*@Override\s*\r?\n', ''
$t = $t -replace 'Base64\.encodeToString\(([^;]+?), Base64\.NO_WRAP\)', 'java.util.Base64.getEncoder().encodeToString($1)'
$t = $t -replace 'Base64\.decode\(([^;]+?), Base64\.DEFAULT\)', 'java.util.Base64.getDecoder().decode($1)'
$t = $t -replace 'Base64\.decode\(([^;]+?), Base64\.URL_SAFE\)', 'java.util.Base64.getUrlDecoder().decode($1)'
# fileLog：去掉 android Log 与 mContext 外写
$t = $t -replace '(?s)private static void fileLog\(String msg\) \{.*?\r?\n    \}\r?\n\r?\n', "private static void fileLog(String msg) { System.out.println(`"[log] `" + msg); }`r`n`r`n"
# main 里的 System.exit 改为 noop 便于观察？保留。
# 删除 android.util imports
$t = $t -replace 'import android\.util\.Base64;\r?\n', ''
$t = $t -replace 'import android\.util\.Log;\r?\n', ''
$t = $t -replace 'import com\.github\.catvod\.crawler\.Spider;\r?\n', ''
# mContext 仅存在于 Spider 基类：桌面变体补桩字段 + 抽空的设备存档方法
$t = $t.Replace('private static final String TAG = "echo-fq-drama-jar";', "private static final String TAG = `"echo-fq-drama-jar`";`r`n    private static Object mContext;")
$t = $t -replace '(?s)    /\*\* 设备存档读取（SharedPreferences；桌面 golden 变体整体替换本方法） \*/\r?\n    private static String devLoad\(\) \{.*?\n    \}', '    private static String devLoad() { return ""; }'
$t = $t -replace '(?s)    /\*\* 设备存档写入（桌面 golden 变体整体替换本方法） \*/\r?\n    private static void devSave\(String json\) \{.*?\n    \}', '    private static void devSave(String json) { }'
[System.IO.File]::WriteAllText($dst, $t, [System.Text.UTF8Encoding]::new($false))
Write-Host "desktop variant: $dst"
# org/json 类来自 android.jar（stub 即可，main 路径不触碰 JSON）
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
& javac -encoding UTF-8 -nowarn -cp $clsDir -d $clsDir $dst
if ($LASTEXITCODE -ne 0) { throw "desktop javac failed" }
& java -cp $clsDir com.github.catvod.spider.VerifyFqDesktop
if ($LASTEXITCODE -ne 0) { throw "golden FAIL" }
