package com.github.catvod.utils;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class FishNative {
    private static final Set<String> LOADED_PATHS = new HashSet();
    private static String registeredPath;

    private FishNative() {
    }

    public static native int _guardConfig(String str);

    public static native boolean _guardReady();

    public static native String _honHonKeyId();

    public static native boolean _honHonReady();

    public static native String _honHonRoute();

    public static native byte[] _honHonServerPublicKey();

    public static native byte[] _honHonSign(byte[] bArr);

    public static native int _kChk(String str);

    public static native String _pan123ShareGetApi(String str, String str2, String str3, String str4, int i, int i2);

    public static native String _pan123UnlimitedUrl(String str);

    public static native byte[] _secAesCbcDec(String str, String str2, byte[] bArr);

    public static native byte[] _secAesCbcEnc(String str, String str2, byte[] bArr);

    public static native byte[] _secAesCbcEncJsonAccess(String str, String str2, String str3, String str4, byte[] bArr);

    public static native String _secText(String str);

    public static native String _sv(int i);

    public static native byte[] aesDec(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] aesEnc(byte[] bArr, byte[] bArr2, byte[] bArr3);

    public static native byte[] cKey(String str, String str2);

    public static native String[] cfgUrls();

    public static native void checkAlive();

    public static native String defCfg();

    public static native byte[] extDe(String str);

    public static native byte[] extEn(String str);

    public static native int fishGoAbiVersion();

    public static native long guardLease(int i, String str);

    public static native boolean guardUse(int i, long j, String str);

    public static native boolean hostAllowed();

    public static native int hostApply(String str);

    public static native void hostExit(long j);

    public static native void hostInit(Context context);

    public static native String hostStatus();

    public static synchronized void load(String str) {
        if (str != null) {
            if (!str.isEmpty()) {
                Set<String> set = LOADED_PATHS;
                if (set.contains(str)) {
                    return;
                }
                requireReadOnly(new File(str));
                System.load(str);
                set.add(str);
                return;
            }
        }
        throw new IllegalArgumentException("empty native library path");
    }

    public static synchronized void loadAndRegister(String str) {
        try {
            String str2 = registeredPath;
            if (str2 != null && !str2.equals(str)) {
                throw new IllegalStateException("native bridge already bound to another library");
            }
            load(str);
            registeredPath = str;
            register();
        } catch (Throwable th) {
            throw th;
        }
    }

    public static native void nExit();

    public static native boolean nKilled();

    public static native String popupAck(long j);

    public static native long popupArm(String str, String str2);

    public static native void popupCheck();

    public static native boolean popupRequire(String str, String str2, String str3);

    public static native void popupShown(long j);

    public static native void popupViolation(long j);

    public static native String rPub();

    private static native void register();

    public static void requireReadOnly(File file) {
        if (!file.isFile() || !file.canRead()) {
            throw new IllegalStateException("native library must be a readable file");
        }
        if ((file.canWrite() && !file.setReadOnly()) || file.canWrite()) {
            throw new IllegalStateException("native library must be read-only");
        }
    }

    public static native int spVer();

    public static native String ssKey();

    public static native int startGo(int i, String str, String str2, byte[] bArr);

    public static native void stop();

    public static native int svN();

    public static native byte[] urlDe(String str);

    public static native byte[] urlEn(String str);
}
