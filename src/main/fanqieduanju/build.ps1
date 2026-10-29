# Build fanqieduanju spider jar: javac (stub + android.jar) -> R8 obfuscate+dex -> zip (fanqieduanju-spider.jar)
# Output: ..\..\guoju-api\番茄短剧\lib\fanqieduanju-spider.jar (classes.dex) + MD5 (for 番茄短剧.json dramas.jar)
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

# 2. locate r8.jar (obfuscator + dexer)
$r8Jar = "D:\Tool\cmdline-tools\latest\lib\r8.jar"
if (-not (Test-Path $r8Jar)) { throw "r8.jar not found (check D:\Tool\cmdline-tools)" }
Write-Host "r8.jar: $r8Jar"

# 3. clean + compile
if (Test-Path $outDir) { Remove-Item $outDir -Recurse -Force }
New-Item -ItemType Directory -Path $outDir | Out-Null
$classes = Join-Path $outDir "classes"
New-Item -ItemType Directory -Path $classes | Out-Null

$sources = Get-ChildItem -Path $srcDirs -Recurse -Filter *.java | ForEach-Object { $_.FullName }
Write-Host "compiling $($sources.Count) source files"
& javac -encoding UTF-8 -source 8 -target 8 -nowarn -bootclasspath "$androidJar" -d "$classes" $sources
if ($LASTEXITCODE -ne 0) { throw "javac failed" }

# 4. pack classes -> in.jar, then R8 rename-obfuscate + dex
Add-Type -AssemblyName System.IO.Compression
$inJar = Join-Path $outDir "in.jar"
$fsIn = [System.IO.File]::Create($inJar)
try {
    $zipIn = New-Object System.IO.Compression.ZipArchive($fsIn, [System.IO.Compression.ZipArchiveMode]::Create)
    Get-ChildItem -Path $classes -Recurse -Filter *.class | ForEach-Object {
        $rel = $_.FullName.Substring($classes.Length + 1).Replace("\", "/")
        $eIn = $zipIn.CreateEntry($rel)
        $esIn = $eIn.Open()
        $reader = [System.IO.File]::OpenRead($_.FullName)
        $reader.CopyTo($esIn)
        $reader.Dispose(); $esIn.Dispose()
    }
    $zipIn.Dispose()
} finally {
    $fsIn.Dispose()
}
$rules = Join-Path $root "proguard.rules"
if (-not (Test-Path $rules)) { throw "proguard.rules not found: $rules" }
$dexOutDir = Join-Path $outDir "dexout"
New-Item -ItemType Directory -Path $dexOutDir | Out-Null
& java -cp $r8Jar com.android.tools.r8.R8 --release --min-api 21 --lib $androidJar --pg-conf $rules --pg-map-output (Join-Path $outDir "mapping.txt") --output $dexOutDir $inJar
if ($LASTEXITCODE -ne 0) { throw "R8 failed" }
$dexPath = Join-Path $dexOutDir "classes.dex"
if (-not (Test-Path $dexPath)) { throw "classes.dex not generated" }

# 5. zip (MANIFEST.MF + classes.dex, forward-slash entries)
Add-Type -AssemblyName System.IO.Compression
$outRepoDir = Join-Path (Join-Path $root "..\..\guoju-api\番茄短剧") "lib"
if (-not (Test-Path $outRepoDir)) { New-Item -ItemType Directory -Path $outRepoDir -Force | Out-Null }
$jarPath = Join-Path $outRepoDir "fanqieduanju-spider.jar"
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
Write-Host "番茄短剧.json ref: ./lib/fanqieduanju-spider.jar;md5;$md5"
