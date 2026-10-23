# Build qsyg (music) spider jar: javac (stub + android.jar) -> d8 --dex -> zip (qsyg-spider.jar)
# Output: ..\..\ysc\diy\Q水易购\lib\qsyg-spider.jar (classes.dex) + MD5 (for Q水易购.json musics.jar)
$ErrorActionPreference = "Stop"

$root = Split-Path -Parent $MyInvocation.MyCommand.Path
$srcDirs = @((Join-Path $root "src"), (Join-Path $root "stub"))
$outDir = Join-Path $root "build"

# 1. locate android.jar (highest API under platforms)
$androidJar = $null
$sdks = @()
if ($env:ANDROID_HOME -and (Test-Path $env:ANDROID_HOME)) { $sdks += $env:ANDROID_HOME }
if (Test-Path "D:\Tool") { $sdks += "D:\Tool" }
foreach ($sdk in $sdks) {
    $platforms = Join-Path $sdk "platforms"
    if (-not (Test-Path $platforms)) { continue }
    $best = $null; $bestApi = -1
    Get-ChildItem -Path $platforms -Directory | ForEach-Object {
        $jar = Join-Path $_.FullName "android.jar"
        if (Test-Path $jar) {
            $api = 0
            if ($_.Name -match '(\d+)$') { $api = [int]$Matches[1] }
            if ($api -gt $bestApi) { $bestApi = $api; $best = $jar }
        }
    }
    if ($best) { $androidJar = $best; break }
}
if (-not $androidJar) { throw "android.jar not found (set ANDROID_HOME or check D:\Tool\platforms)" }
Write-Host "android.jar: $androidJar"

# 2. locate d8 (latest build-tools)
$d8 = $null
$btRoots = @()
foreach ($sdk in $sdks) {
    $bt = Join-Path $sdk "build-tools"
    if (Test-Path $bt) { $btRoots += $bt }
}
foreach ($bt in $btRoots) {
    $cand = Get-ChildItem -Path $bt -Directory | Sort-Object { [version]$_.Name } -Descending
    foreach ($c in $cand) {
        $p = Join-Path $c.FullName "d8.bat"
        if (Test-Path $p) { $d8 = $p; break }
        $p2 = Join-Path $c.FullName "d8"
        if (Test-Path $p2) { $d8 = $p2; break }
    }
    if ($d8) { break }
}
if (-not $d8) { throw "d8 not found (check SDK build-tools)" }
Write-Host "d8: $d8"

# 3. clean + compile
if (Test-Path $outDir) { Remove-Item $outDir -Recurse -Force }
New-Item -ItemType Directory -Path $outDir | Out-Null
$classes = Join-Path $outDir "classes"
New-Item -ItemType Directory -Path $classes | Out-Null

$sources = Get-ChildItem -Path $srcDirs -Recurse -Filter *.java | ForEach-Object { $_.FullName }
Write-Host "compiling $($sources.Count) source files"
& javac -encoding UTF-8 -source 8 -target 8 -nowarn -bootclasspath "$androidJar" -d "$classes" $sources
if ($LASTEXITCODE -ne 0) { throw "javac failed" }

# 4. d8 -> dex
& $d8 --release --min-api 21 --output $outDir (Get-ChildItem -Path $classes -Recurse -Filter *.class | ForEach-Object { $_.FullName })
if ($LASTEXITCODE -ne 0) { throw "d8 failed" }
$dexPath = Join-Path $outDir "classes.dex"
if (-not (Test-Path $dexPath)) { throw "classes.dex not generated" }

# 5. zip (MANIFEST.MF + classes.dex, forward-slash entries)
Add-Type -AssemblyName System.IO.Compression
$outRepoDir = Join-Path (Join-Path $root "..\..\ysc\diy\Q水易购") "lib"
if (-not (Test-Path $outRepoDir)) { New-Item -ItemType Directory -Path $outRepoDir -Force | Out-Null }
$jarPath = Join-Path $outRepoDir "qsyg-spider.jar"
if (Test-Path $jarPath) { Remove-Item $jarPath -Force }
$fs = [System.IO.File]::Create($jarPath)
try {
    $zip = New-Object System.IO.Compression.ZipArchive($fs, [System.IO.Compression.ZipArchiveMode]::Create)
    $e1 = $zip.CreateEntry("META-INF/MANIFEST.MF")
    $w = New-Object System.IO.StreamWriter($e1.Open())
    $w.Write("Manifest-Version: 1.0`r`n`r`n")
    $w.Dispose()
    $e2 = $zip.CreateEntry("classes.dex")
    $es = $e2.Open()
    $ds = [System.IO.File]::OpenRead($dexPath)
    $ds.CopyTo($es)
    $ds.Dispose(); $es.Dispose()
    $zip.Dispose()
} finally {
    $fs.Dispose()
}

# 6. md5
$md5 = (Get-FileHash $jarPath -Algorithm MD5).Hash.ToLower()
$size = (Get-Item $jarPath).Length
Write-Host ""
Write-Host "BUILD OK: $jarPath ($size bytes)"
Write-Host "MD5: $md5"
Write-Host "Q水易购.json ref: ./lib/qsyg-spider.jar;md5;$md5"
