package com.github.catvod.spider.merge.A;

import com.github.catvod.spider.merge.M.C0034;
import com.github.catvod.spider.merge.N.C0037;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.PrintStream;
import java.util.Map;
import moyu.fucking.C0152;
import moyu.fucking.C0162;
import moyu.fucking.C0181;
import moyu.fucking.C0182;
import moyu.fucking.C0195;
import moyu.fucking.C0198;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class I0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f130short = {3118, 3127, 3115, 3114, 3172, 3124, 3109, 3126, 3127, 3105, 3172, 3105, 3126, 3126, 3115, 3126, 3198, 3172, 3032, 3058};
    public static final Gson a = (Gson) C0162.n(80790, (GsonBuilder) C0162.n(57196, new GsonBuilder(), new Object[0]), new Object[0]);

    public I0() throws Throwable {
        int iIntValue = ((Integer) C0162.n(95596, null, new Object[0])).intValue();
        int i = 1616;
        while (true) {
            i ^= 1633;
            switch (i) {
                case 14:
                    break;
                case 49:
                    if (iIntValue <= 0) {
                        i = 1709;
                    }
                    break;
                case 204:
                    C0195.n(38669, (PrintStream) C0195.n(72538) /*=> System.out*/, new Object[]{(Long) C0182.n(56258, null, new Object[]{(String) C0162.n(1185, null, new Object[]{(String) C0162.n(26678) /*=> raw:new String(new byte[]{(byte) 73, (byte) 108, (byte) 72, (byte) 74, (byte) 117, (byte) 117, (byte) 68, (byte) 111, (byte)*/})})});
                    return;
                case 239:
                    return;
                default:
                    continue;
            }
            i = 1678;
        }
    }

    public static JsonElement a(String str) {
        try {
            return (JsonElement) C0181.n(49194, null, new Object[]{str});
        } catch (Throwable th) {
            return (JsonElement) C0181.n(1873, new JsonParser(), new Object[]{str});
        }
    }

    public static Object b(String str) throws Throwable {
        try {
            return C0181.n(86870, new Gson(), new Object[]{str, Map.class});
        } catch (JsonSyntaxException e) {
            StringBuilder sb = new StringBuilder((String) C0198.n(45548, null, new Object[]{(short[]) C0181.n(41689) /*=> I0.short*/, 0, Integer.valueOf(C0037.f193 ^ 830), 3140}));
            C0152.n(11548, null, new Object[]{(String) C0198.n(89992, sb, new Object[0])});
            return null;
        }
    }

    public static JsonObject c(String str) {
        try {
            JsonObject jsonObject = (JsonObject) C0181.n(24176, (JsonElement) C0181.n(71524, null, new Object[]{str}), new Object[0]);
            int i = 1616;
            while (true) {
                i ^= 1633;
                switch (i) {
                    case 14:
                        break;
                    case 49:
                        i = jsonObject == null ? 1709 : 1678;
                        break;
                    case 204:
                        return new JsonObject();
                    case 239:
                        return jsonObject;
                    default:
                        break;
                }
            }
        } catch (Throwable th) {
            return new JsonObject();
        }
    }

    public static String d(Object obj) throws Throwable {
        String str = "ۨۤۧ";
        Object[] objArr = null;
        String str2 = null;
        Gson gson = null;
        Object objN = null;
        while (true) {
            switch (C0034.m132(str)) {
                case 1748773:
                    str = "ۢۡۤ";
                    str2 = (String) objN;
                    break;
                case 1749637:
                    return str2;
                case 1751495:
                    objN = C0181.n(1049, gson, objArr);
                    str = "ۡۤۨ";
                    break;
                case 1751679:
                    objArr[0] = obj;
                    str = "ۤ۟ۢ";
                    break;
                case 1755345:
                    str = "ۤۥ۠";
                    objArr = new Object[1];
                    break;
                default:
                    str = "ۨ۟ۨ";
                    gson = new Gson();
                    break;
            }
        }
    }
}
