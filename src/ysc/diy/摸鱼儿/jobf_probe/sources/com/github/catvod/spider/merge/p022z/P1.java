package com.github.catvod.spider.merge.p022z;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.CZ;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.PanWebShare123;
import com.github.catvod.spider.PanWebShareGuangYa;
import com.github.catvod.spider.PianDan;
import com.github.catvod.spider.merge.A.AbstractC0251e;
import com.github.catvod.spider.merge.A.AbstractC0302v0;
import com.github.catvod.spider.merge.A.C0253e1;
import com.github.catvod.spider.merge.A.C0256f1;
import com.github.catvod.spider.merge.A.C0299u0;
import com.github.catvod.spider.merge.A.E0;
import com.github.catvod.spider.merge.A.G0;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.N0;
import com.github.catvod.spider.merge.A.P;
import com.github.catvod.spider.merge.A.RunnableC0240a0;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.T1;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.p000a.A0;
import com.github.catvod.spider.merge.p000a.C0342a0;
import com.github.catvod.spider.merge.p000a.C0349e;
import com.github.catvod.spider.merge.p000a.C0353g;
import com.github.catvod.spider.merge.p000a.C0357i;
import com.github.catvod.spider.merge.p000a.C0364l0;
import com.github.catvod.spider.merge.p000a.C0377s0;
import com.github.catvod.spider.merge.p000a.Q0;
import com.github.catvod.spider.merge.p000a.RunnableC0341a;
import com.github.catvod.spider.merge.p000a.RunnableC0383v0;
import com.github.catvod.spider.merge.p000a.Z0;
import com.github.catvod.spider.merge.p000a.l1;
import com.github.catvod.spider.merge.p000a.t1;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.B;
import com.github.catvod.spider.merge.p017u.DialogInterfaceOnClickListenerC0454f;
import com.github.catvod.spider.merge.p017u.DialogInterfaceOnDismissListenerC0472y;
import com.github.catvod.spider.merge.p017u.L;
import com.github.catvod.spider.merge.p017u.RunnableC0466s;
import com.github.catvod.spider.merge.p017u.T;
import com.github.catvod.spider.merge.p017u.ViewOnClickListenerC0470w;
import com.github.catvod.spider.merge.p017u.W;
import com.github.catvod.spider.merge.p019w.a;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import java.io.File;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public abstract class P1 {
    public static C0568t0 b = null;
    public static long c = 0;
    public static long d = 0;
    public static int e = 0;
    public static String f = "等待AI任务 0/3";
    public static String g = "";
    public static int h = 0;
    public static volatile boolean o = false;
    public static long p = -1;
    public static AlertDialog q;
    public static Activity r;
    public static volatile Dialog s;
    public static volatile Runnable t;
    public static String u;
    public static final String[] a = {"日", "一", "二", "三", "四", "五", "六"};
    public static final String[][] i = {new String[]{"备用 API", "https://api.tmdb.org/3"}, new String[]{"官方 API", "https://api.themoviedb.org/3"}};
    public static final String[][] j = {new String[]{"图片加速", "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500"}, new String[]{"官方图片", "https://image.tmdb.org/t/p/w500"}};
    public static final String[] k = {"中文", "English"};
    public static final String[] l = {"CN", "US"};
    public static final String[] m = {"简体中文", "English"};
    public static final int[] n = {8, 16, 32, 64, 128, 256};

    public static boolean A(String str, String[] strArr) {
        boolean zEquals = "poster_tmdb_home_menu".equals(str);
        if (!zEquals && !"poster_douban_home_menu".equals(str)) {
            return true;
        }
        if (PianDan.isHomeMenuReady(zEquals) && Arrays.equals(strArr, PianDan.posterHomeIds(zEquals))) {
            return true;
        }
        X0.a("分类配置尚未加载或已变化，请重新进入片单后再设置");
        return false;
    }

    public static void A0(final String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        u = str;
        H0 h0 = H0.a;
        G0 g0 = new G0() { // from class: com.github.catvod.spider.merge.z.k3
            @Override // com.github.catvod.spider.merge.A.G0
            public final void a() {
                if (str.equals(P1.u)) {
                    X0.a("扫码成功，请在扫码设备上完成操作");
                    P1.R();
                    P1.u = null;
                }
            }
        };
        h0.getClass();
        H0.e.put(str, g0);
        ConcurrentHashMap concurrentHashMap = H0.d;
        final E0 e0 = (E0) concurrentHashMap.get(str);
        concurrentHashMap.put(str, new E0() { // from class: com.github.catvod.spider.merge.z.l3
            @Override // com.github.catvod.spider.merge.A.E0
            public final void a() {
                InitOrigin.run(new a(str, 12));
                E0 e1 = e0;
                if (e1 != null) {
                    e1.a();
                }
            }
        });
    }

    public static void A1() {
        if (!l1.I().Z()) {
            InitOrigin.run(new U2(3));
            return;
        }
        C0512h3[] c0512h3Arr = {null};
        InitOrigin.run(new RunnableC0482b3(c0512h3Arr, 5));
        InitOrigin.execute(new RunnableC0482b3(c0512h3Arr, 6));
    }

    public static String B(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("origin_country");
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; jSONArrayOptJSONArray != null && i2 < jSONArrayOptJSONArray.length() && arrayList.size() < 2; i2++) {
            String strOptString = jSONArrayOptJSONArray.optString(i2);
            String displayCountry = strOptString.isEmpty() ? "" : new Locale("", strOptString).getDisplayCountry(Locale.CHINA);
            if (!displayCountry.isEmpty()) {
                strOptString = displayCountry;
            }
            if (!strOptString.isEmpty()) {
                arrayList.add(strOptString);
            }
        }
        return TextUtils.join(" / ", arrayList);
    }

    public static String B0(String str, HashMap map) {
        if (str == null || map == null || map.isEmpty()) {
            return str == null ? "" : str;
        }
        for (Map.Entry entry : map.entrySet()) {
            str = str.replace(b.m(new StringBuilder("{"), (String) entry.getKey(), "}"), entry.getValue() == null ? "" : (CharSequence) entry.getValue());
        }
        return str;
    }

    public static void B1() {
        int iX0 = AbstractC0302v0.X0("yidong");
        ArrayList arrayList = new ArrayList();
        int i2 = AbstractC0583w0.d;
        arrayList.add(new C0477a3(i2, new S2(17), "App扫码登录", "移动云盘APP / 微信登录"));
        arrayList.add(new C0477a3(i2, new S2(18), "账号密码登录", "手机号 + 密码"));
        arrayList.add(new C0477a3(AbstractC0583w0.h, new S2(19), "导入凭证", "Authorization / Cookie"));
        String strY0 = AbstractC0302v0.Y0("yidong");
        t1.u().getClass();
        d1(iX0, null, strY0, "扫码 / 密码 / 凭证", "yidong", arrayList, t1.F());
    }

    public static String C(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("original_name");
        String strOptString2 = jSONObject.optString("name");
        StringBuilder sb = new StringBuilder();
        if (!strOptString.isEmpty() && !strOptString.equals(strOptString2)) {
            sb.append(strOptString);
            sb.append('\n');
        }
        String strOptString3 = jSONObject.optString("first_air_date");
        if (strOptString3.isEmpty()) {
            strOptString3 = "首播日期未知";
        }
        sb.append(strOptString3);
        String strB = B(jSONObject);
        if (!strB.isEmpty()) {
            sb.append(" · ");
            sb.append(strB);
        }
        return sb.toString();
    }

    public static File C0(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            return file2;
        }
        int iLastIndexOf = str.lastIndexOf(46);
        String strSubstring = iLastIndexOf > 0 ? str.substring(0, iLastIndexOf) : str;
        String strSubstring2 = iLastIndexOf > 0 ? str.substring(iLastIndexOf) : "";
        for (int i2 = 1; i2 < 10000; i2++) {
            File file3 = new File(file, strSubstring + " (" + i2 + ")" + strSubstring2);
            if (!file3.exists()) {
                return file3;
            }
        }
        StringBuilder sbP = b.p(strSubstring, "_");
        sbP.append(System.currentTimeMillis());
        sbP.append(strSubstring2);
        return new File(file, sbP.toString());
    }

    public static String C1(String[] strArr, int i2) {
        String str;
        return (i2 < 0 || i2 >= strArr.length || (str = strArr[i2]) == null || str.isEmpty()) ? "加载中..." : str;
    }

    public static void D(int i2) {
        int i3 = h;
        if (i2 != i3) {
            return;
        }
        b = null;
        h = i3 + 1;
    }

    public static Activity D0() {
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity != null) {
                return activity;
            }
            X0.a("请先打开主界面");
            return null;
        } catch (Exception unused) {
            X0.a("请先打开主界面");
            return null;
        }
    }

    public static String D1(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.startsWith("cookie:")) {
            return str.substring(7).trim();
        }
        return lowerCase.startsWith("set-cookie:") ? str.substring(11).trim() : str;
    }

    public static String E(int i2, String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.length() <= i2) {
            return strTrim;
        }
        return strTrim.substring(0, i2) + "...";
    }

    public static String E0(String str) {
        String strTrim = (str == null ? "" : str.trim()).replaceAll("[\\\\/:*?\"<>|\\r\\n\\t]+", "_").trim();
        while (strTrim.startsWith(".")) {
            strTrim = strTrim.substring(1).trim();
        }
        if (TextUtils.isEmpty(strTrim)) {
            strTrim = "download";
        }
        if (strTrim.length() <= 160) {
            return strTrim;
        }
        int iLastIndexOf = strTrim.lastIndexOf(46);
        if (iLastIndexOf <= 0 || iLastIndexOf >= strTrim.length() - 1) {
            return strTrim.substring(0, 160).trim();
        }
        String strSubstring = strTrim.substring(iLastIndexOf);
        return strTrim.substring(0, Math.min(Math.max(1, 160 - strSubstring.length()), iLastIndexOf)).trim() + strSubstring;
    }

    public static String E1(String str, String str2) {
        return (str == null || str.trim().isEmpty()) ? str2 : str.trim();
    }

    public static void F(String str, String str2) {
        ClipboardManager clipboardManager;
        if (str2 != null) {
            try {
                if (!str2.isEmpty()) {
                    Activity activityD0 = D0();
                    if (activityD0 == null || (clipboardManager = (ClipboardManager) activityD0.getSystemService("clipboard")) == null) {
                        return;
                    }
                    clipboardManager.setPrimaryClip(ClipData.newPlainText(str, str2));
                    X0.a(str.concat("已复制"));
                    return;
                }
            } catch (Exception unused) {
                X0.a("复制失败");
                return;
            }
        }
        X0.a(str.concat("为空"));
    }

    public static void F0(TextView textView, boolean z) {
        textView.setEnabled(z);
        textView.setFocusable(z);
        textView.setTextColor(z ? -16747385 : AbstractC0583w0.i);
        textView.setAlpha(z ? 1.0f : 0.55f);
        textView.setContentDescription(String.valueOf(textView.getTag()).concat(z ? "" : "，不可用"));
    }

    public static void F1(ProgressBar progressBar) {
        if (Build.VERSION.SDK_INT < 21) {
            return;
        }
        int i2 = AbstractC0583w0.c;
        progressBar.setProgressTintList(ColorStateList.valueOf(i2));
        progressBar.setProgressBackgroundTintList(ColorStateList.valueOf(AbstractC0583w0.j));
        progressBar.setIndeterminateTintList(ColorStateList.valueOf(i2));
    }

    public static LinearLayout G(Context context) {
        LinearLayout linearLayoutY = AbstractC0583w0.y(context);
        linearLayoutY.setPadding(AbstractC0583w0.Q(14, context), AbstractC0583w0.Q(10, context), AbstractC0583w0.Q(14, context), AbstractC0583w0.Q(10, context));
        return linearLayoutY;
    }

    public static int G0(String str, String str2) {
        Bitmap bitmapP = AbstractC0583w0.P(str);
        Bitmap bitmapP2 = AbstractC0583w0.P(str2);
        if (bitmapP == null || bitmapP2 == null) {
            X0.a("验证码图片解码失败");
            return 0;
        }
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicInteger atomicInteger = new AtomicInteger(0);
        InitOrigin.run(new RunnableC0240a0(countDownLatch, bitmapP, bitmapP2, atomicInteger, 16));
        try {
            countDownLatch.await(120L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
        }
        return atomicInteger.get();
    }

    public static String G1() {
        return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(Calendar.getInstance().getTime());
    }

    public static LinearLayout H(Context context) {
        LinearLayout linearLayoutK = AbstractC0583w0.K(context);
        linearLayoutK.setPadding(AbstractC0583w0.Q(16, context), AbstractC0583w0.Q(20, context), AbstractC0583w0.Q(16, context), AbstractC0583w0.Q(20, context));
        return linearLayoutK;
    }

    public static void H0() {
        K0("追更排期", "选择查看方式", new String[]{"列表展示", "完整月历"}, new String[]{"按日期顺序查看追更", "在月历上查看每日排期"}, new int[]{AbstractC0583w0.d, -16732991}, new Runnable[]{new S(5), new S(6)});
    }

    public static void H1(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        H0.a.getClass();
        H0.k(str);
    }

    public static LinearLayout I(Activity activity, O1 o1) {
        int i2;
        String strOptString = o1.b.optString("name", "未命名剧集");
        int i3 = o1.d;
        String str = (i3 <= 0 || (i2 = o1.e) <= 0) ? "" : String.format(Locale.US, "S%02dE%02d", Integer.valueOf(i3), Integer.valueOf(i2));
        StringBuilder sb = new StringBuilder();
        sb.append(str.isEmpty() ? "" : str.concat(" · "));
        boolean z = o1.c;
        sb.append(z ? "已更新" : "待更新");
        LinearLayout linearLayoutA = AbstractC0484c0.a(activity, o1.b.optString("posterPath"), strOptString, sb.toString(), z ? AbstractC0583w0.d : -16732991, new RunnableC0242b(activity, o1, 19));
        if (linearLayoutA.getId() == -1) {
            linearLayoutA.setId(View.generateViewId());
        }
        return linearLayoutA;
    }

    public static void I0(int i2) {
        Activity activity;
        try {
            JSONObject jSONObject = new JSONObject(FishCrypto.o());
            long jOptLong = jSONObject.optLong("revision", 0L);
            if (!"deny".equals(jSONObject.optString("state"))) {
                AlertDialog alertDialog = q;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                    q = null;
                    r = null;
                }
                p = -1L;
                return;
            }
            if (jOptLong <= 0 || p == jOptLong) {
                return;
            }
            try {
                activity = InitOrigin.getActivity();
            } catch (Throwable unused) {
                activity = null;
            }
            String strOptString = jSONObject.optString("message", "");
            if ("dialog".equals(jSONObject.optString("presentation")) && ((activity == null || activity.isFinishing()) && i2 < 3)) {
                InitOrigin.run(new T1(i2, 4), 500);
                return;
            }
            AlertDialog alertDialog2 = q;
            if (alertDialog2 != null) {
                alertDialog2.dismiss();
                q = null;
                r = null;
            }
            if (!"dialog".equals(jSONObject.optString("presentation")) || activity == null || activity.isFinishing()) {
                X0.a(strOptString);
            } else {
                r = activity;
                AlertDialog[] alertDialogArr = new AlertDialog[1];
                try {
                    AlertDialog alertDialogL = C2.l(activity, x0(jSONObject), new X1(14, new RunnableC0341a(13, alertDialogArr)));
                    alertDialogArr[0] = alertDialogL;
                    q = alertDialogL;
                } catch (Throwable unused2) {
                    r = null;
                    X0.a(strOptString);
                }
            }
            p = jOptLong;
            if ("exit".equals(jSONObject.optString("action"))) {
                InitOrigin.run(new U1(0, jOptLong), 8500);
            }
        } catch (Throwable unused3) {
        }
    }

    public static Y3 I1(String str, JSONObject jSONObject) throws JSONException {
        int i2;
        if (str == null || str.length() > 16384) {
            throw new IllegalArgumentException("answer size");
        }
        JSONObject jSONObject2 = new JSONObject(str);
        if (!jSONObject.getString("challenge_id").equals(jSONObject2.getString("challenge_id")) || !jSONObject.getString("scope").equals(jSONObject2.getString("scope"))) {
            throw new IllegalArgumentException("challenge mismatch");
        }
        String string = jSONObject2.getString("action");
        if (string == null) {
            throw new NullPointerException("Name is null");
        }
        if (string.equals("CONFIRM")) {
            i2 = 1;
        } else if (string.equals("REFRESH")) {
            i2 = 2;
        } else {
            if (!string.equals("CANCEL")) {
                throw new IllegalArgumentException("No enum constant com.github.catvod.ui.TextCaptchaDialog.Action.".concat(string));
            }
            i2 = 3;
        }
        if (i2 != 1) {
            return new Y3(i2, "");
        }
        long jM0 = m0("x", jSONObject2);
        long j2 = jSONObject.getLong("max_x");
        JSONArray jSONArray = jSONObject2.getJSONArray("points");
        if (jM0 <= 1 || jM0 > j2 || jSONArray.length() < 2 || jSONArray.length() > 96) {
            throw new IllegalArgumentException("answer bounds");
        }
        long j3 = -1;
        int i3 = 0;
        while (i3 < jSONArray.length()) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i3);
            long jM1 = m0("x", jSONObject3);
            long jM2 = m0("y", jSONObject3);
            long jM3 = m0("t", jSONObject3);
            if (jSONObject3.length() != 3 || jM1 < 0 || jM1 > j2 || jM2 < -10000 || jM2 > 10000 || jM3 < j3 || jM3 > 900000) {
                throw new IllegalArgumentException("trace bounds");
            }
            i3++;
            j3 = jM3;
        }
        if (m0("x", jSONArray.getJSONObject(jSONArray.length() - 1)) != jM0) {
            throw new IllegalArgumentException("endpoint mismatch");
        }
        jSONObject2.remove("action");
        return new Y3(i2, jSONObject2.toString());
    }

    public static AlertDialog J(Activity activity, String str) {
        LinearLayout linearLayoutH = H(activity);
        linearLayoutH.setMinimumWidth(AbstractC0583w0.Q(300, activity));
        Context context = linearLayoutH.getContext();
        int i2 = AbstractC0583w0.c;
        if (!TextUtils.isEmpty(null)) {
            str = b.i(str, "\nnull");
        }
        linearLayoutH.addView(AbstractC0583w0.q(context, "正在下载", str, i2), AbstractC0583w0.c0(AbstractC0583w0.Q(16, context)));
        LinearLayout linearLayoutG = G(activity);
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleHorizontal);
        progressBar.setId(R.id.progress);
        progressBar.setMax(100);
        progressBar.setProgress(0);
        F1(progressBar);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, AbstractC0583w0.Q(6, activity));
        layoutParams.setMargins(0, 0, 0, AbstractC0583w0.Q(12, activity));
        linearLayoutG.addView(progressBar, layoutParams);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(activity);
        textView.setId(R.id.text1);
        textView.setText("0 B / 未知");
        textView.setTextSize(13.0f);
        textView.setTextColor(AbstractC0583w0.h);
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(activity);
        textView2.setId(R.id.text2);
        textView2.setText("0 B/s");
        textView2.setTextSize(13.0f);
        textView2.setTextColor(i2);
        textView2.setGravity(8388613);
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-2, -2));
        linearLayoutG.addView(linearLayout, new LinearLayout.LayoutParams(-1, -2));
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        TextView textView3 = new TextView(activity);
        textView3.setId(R.id.message);
        textView3.setText("保存至: " + externalStoragePublicDirectory.getAbsolutePath());
        textView3.setTextSize(11.0f);
        textView3.setTextColor(AbstractC0583w0.i);
        textView3.setPadding(0, AbstractC0583w0.Q(10, activity), 0, 0);
        textView3.setSingleLine(true);
        linearLayoutG.addView(textView3, new LinearLayout.LayoutParams(-1, -2));
        linearLayoutH.addView(linearLayoutG);
        return new AlertDialog.Builder(activity).setView(AbstractC0583w0.p0(linearLayoutH)).setPositiveButton("暂停", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
    }

    public static void J0(String str, String str2, String str3, String str4, int i2) {
        InitOrigin.execute(new RunnableC0553q(str3, str, str4, str2, i2));
    }

    public static String J1(String str, String str2, ArrayList arrayList) {
        String str3;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0517i3 c0517i3 = (C0517i3) it.next();
            if (c0517i3 != null && str.equals(c0517i3.a) && (str3 = c0517i3.b) != null && !str3.isEmpty()) {
                return str3;
            }
        }
        return str2;
    }

    public static LinearLayout K(Context context, String str, String str2, int i2, String[][] strArr, int[] iArr) {
        LinearLayout linearLayoutH = H(context);
        linearLayoutH.addView(AbstractC0583w0.q(context, str, str2, i2), AbstractC0583w0.c0(AbstractC0583w0.Q(16, context)));
        if (strArr != null && strArr.length > 0) {
            LinearLayout linearLayoutG = G(context);
            int i3 = 0;
            while (i3 < strArr.length) {
                int i4 = i3 < iArr.length ? iArr[i3] : i2;
                String[] strArr2 = strArr[i3];
                AbstractC0583w0.k(linearLayoutG, strArr2[0], strArr2[1], i4);
                i3++;
            }
            linearLayoutH.addView(linearLayoutG);
        }
        return linearLayoutH;
    }

    public static void K0(String str, String str2, String[] strArr, String[] strArr2, int[] iArr, Runnable[] runnableArr) {
        L0(str, str2, strArr, strArr2, iArr, runnableArr, null, false);
    }

    public static LinearLayout L(Activity activity, String str, String[][] strArr, int[] iArr) {
        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
        linearLayoutY.setFocusable(false);
        linearLayoutY.setFocusableInTouchMode(false);
        AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY, str);
        int i2 = 0;
        while (i2 < strArr.length) {
            String[] strArr2 = strArr[i2];
            if (strArr2 != null && strArr2.length >= 2) {
                AbstractC0583w0.k(linearLayoutY, strArr2[0], strArr2[1], i2 < iArr.length ? iArr[i2] : AbstractC0583w0.c);
            }
            i2++;
        }
        return linearLayoutY;
    }

    public static void L0(final String str, final String str2, final String[] strArr, final String[] strArr2, final int[] iArr, final Runnable[] runnableArr, final Runnable runnable, final boolean z) {
        InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.L3
            @Override // java.lang.Runnable
            public final void run() {
                String str3;
                String str4 = str;
                String str5 = str2;
                String[] strArr3 = strArr;
                Runnable[] runnableArr2 = runnableArr;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        X0.a("请在应用界面中操作");
                        return;
                    }
                    int iQ = AbstractC0583w0.Q(8, activity);
                    LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                    linearLayoutK.addView(AbstractC0583w0.p(activity, str4, str5), AbstractC0583w0.c0(iQ));
                    LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                    LinearLayout linearLayout = new LinearLayout(activity);
                    linearLayout.setOrientation(1);
                    linearLayout.setDescendantFocusability(262144);
                    AlertDialog[] alertDialogArr = new AlertDialog[1];
                    int i2 = 0;
                    while (i2 < strArr3.length) {
                        String[] strArr4 = strArr2;
                        if (strArr4 == null || i2 >= strArr4.length || (str3 = strArr4[i2]) == null) {
                            str3 = "点击查看";
                        }
                        int[] iArr2 = iArr;
                        AbstractC0583w0.d(linearLayout, strArr3[i2], str3, (iArr2 == null || i2 >= iArr2.length) ? AbstractC0583w0.c : iArr2[i2], i2 > 0).setOnClickListener(new V2(alertDialogArr, runnableArr2, i2, 2));
                        i2++;
                    }
                    linearLayoutY.addView(AbstractC0583w0.J(activity, linearLayout, 320));
                    linearLayoutK.addView(linearLayoutY);
                    View childAt = null;
                    AlertDialog.Builder positiveButton = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("关闭", (DialogInterface.OnClickListener) null);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        positiveButton.setNeutralButton("帮助", new E(runnable2, 9));
                    }
                    AlertDialog alertDialogCreate = positiveButton.create();
                    alertDialogArr[0] = alertDialogCreate;
                    AbstractC0583w0.j0(alertDialogCreate);
                    if (z && C0299u0.Z()) {
                        View childAt2 = linearLayout.getChildAt(0);
                        if ((childAt2 instanceof LinearLayout) && ((LinearLayout) childAt2).getChildCount() > 2) {
                            childAt = ((LinearLayout) childAt2).getChildAt(2);
                        }
                        if (childAt instanceof TextView) {
                            TextView textView = (TextView) childAt;
                            AlertDialog alertDialog = alertDialogArr[0];
                            Q3 q3 = new Q3(alertDialog, textView, new i(26, textView));
                            textView.addOnAttachStateChangeListener(q3);
                            alertDialog.setOnDismissListener(new Y1(4, q3));
                            q3.a.post(q3);
                        }
                    }
                } catch (Exception e2) {
                    b.x(e2, new StringBuilder("显示失败: "));
                }
            }
        });
    }

    public static String M(String str, boolean z) {
        com.github.catvod.spider.merge.p010l.a aVarI = com.github.catvod.spider.merge.p010l.a.i();
        return t(s0(z ? j : i, z ? (String[]) aVarI.f.clone() : (String[]) aVarI.e.clone()), str, z);
    }

    public static void M0(String[] strArr, String str, String str2, F0 f0) {
        if (strArr.length == 0) {
            return;
        }
        String[] strArr2 = new String[strArr.length];
        int[] iArr = new int[strArr.length];
        Runnable[] runnableArr = new Runnable[strArr.length];
        int i2 = 0;
        while (i2 < strArr.length) {
            strArr2[i2] = b.m(new StringBuilder("选择"), strArr[i2], "分享");
            iArr[i2] = i2 == 0 ? AbstractC0583w0.c : AbstractC0583w0.f;
            runnableArr[i2] = new RunnableC0553q(i2, strArr, str, str2, f0);
            i2++;
        }
        K0("选择网盘类型", "选择要添加的分享来源", strArr, strArr2, iArr, runnableArr);
    }

    public static Calendar N(String str) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(Integer.parseInt(str.substring(0, 4)), Integer.parseInt(str.substring(5, 7)) - 1, Integer.parseInt(str.substring(8, 10)));
        return calendar;
    }

    public static void N0(boolean z) {
        InitOrigin.run(new RunnableC0383v0(13, z));
    }

    public static boolean O(File file) {
        boolean z;
        File[] fileArrListFiles;
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory() || (fileArrListFiles = file.listFiles()) == null || fileArrListFiles.length <= 0) {
            z = true;
        } else {
            z = true;
            for (File file2 : fileArrListFiles) {
                if (file2 != null && !O(file2)) {
                    z = false;
                }
            }
        }
        try {
            if (file.exists() && !file.delete()) {
                file.setWritable(true);
                if (!file.delete()) {
                    return false;
                }
            }
            return z;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static void O0(Activity activity, String str, final boolean z, final EditText editText, final boolean z2, final Runnable runnable) throws Throwable {
        String string;
        char c2 = 0;
        char c3 = 1;
        com.github.catvod.spider.merge.p010l.a aVarI = com.github.catvod.spider.merge.p010l.a.i();
        String str2 = "smart_poster_address_" + System.currentTimeMillis();
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        int iQ = AbstractC0583w0.Q(8, activity);
        linearLayoutK.addView(AbstractC0583w0.q(activity, str, "选择线路，或在底部新增", -16732991), AbstractC0583w0.c0(iQ));
        String[][] strArrS0 = s0(z ? j : i, z ? (String[]) aVarI.f.clone() : (String[]) aVarI.e.clone());
        if (editText == null) {
            string = z ? aVarI.d : aVarI.c;
        } else {
            string = editText.getText().toString();
        }
        String str3 = string;
        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
        linearLayoutY.setDescendantFocusability(262144);
        AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY, "可选 · 当前 " + t(strArrS0, str3, z));
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        int i2 = 0;
        while (i2 < strArrS0.length) {
            String[] strArr = strArrS0[i2];
            String str4 = strArr[c2];
            final String str5 = strArr[c3];
            boolean zEquals = str5.equals(str3);
            int i3 = zEquals ? AbstractC0583w0.d : AbstractC0583w0.f;
            StringBuilder sb = new StringBuilder();
            sb.append(zEquals ? "当前 · " : "启用 · ");
            String strTrim = str5.trim();
            if (strTrim.startsWith("https://")) {
                strTrim = strTrim.substring(8);
            }
            if (strTrim.startsWith("http://")) {
                strTrim = strTrim.substring(7);
            }
            final AlertDialog[] alertDialogArr2 = alertDialogArr;
            if (strTrim.length() > 42) {
                strTrim = strTrim.substring(0, 28) + "..." + strTrim.substring(strTrim.length() - 11);
            }
            sb.append(strTrim);
            LinearLayout linearLayoutD = AbstractC0583w0.d(linearLayoutY, str4, sb.toString(), i3, i2 > 0);
            int i4 = i2;
            final com.github.catvod.spider.merge.p010l.a aVar = aVarI;
            final String[][] strArr2 = strArrS0;
            final String str6 = str2;
            linearLayoutD.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.C3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str7 = str5;
                    EditText editText2 = editText;
                    if (editText2 != null) {
                        editText2.setText(str7);
                    }
                    boolean z3 = z;
                    if (z2) {
                        com.github.catvod.spider.merge.p010l.a aVar2 = aVar;
                        if (z3) {
                            aVar2.d = str7;
                            aVar2.k();
                        } else {
                            aVar2.c = str7;
                            aVar2.k();
                        }
                        aVar2.q();
                    }
                    P1.H1(str6);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    X0.a("已启用: " + P1.t(strArr2, str7, z3));
                    AlertDialog alertDialog = alertDialogArr2[0];
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                }
            });
            i2 = i4 + 1;
            linearLayoutK = linearLayoutK;
            linearLayoutY = linearLayoutY;
            alertDialogArr = alertDialogArr2;
            str3 = str3;
            strArrS0 = strArr2;
            str2 = str2;
            aVarI = aVarI;
            c2 = 0;
            c3 = 1;
        }
        final AlertDialog[] alertDialogArr3 = alertDialogArr;
        LinearLayout linearLayout = linearLayoutK;
        final String str7 = str2;
        final com.github.catvod.spider.merge.p010l.a aVar2 = aVarI;
        linearLayout.addView(linearLayoutY, AbstractC0583w0.c0(iQ));
        LinearLayout linearLayoutY2 = AbstractC0583w0.y(activity);
        AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY2, "新增线路");
        final EditText editTextF = AbstractC0583w0.f(linearLayoutY2, z ? "https://wsrv.nl/?url=https://image.tmdb.org/t/p/w500" : "https://api.tmdb.org/3", "", false);
        TextView textViewF = AbstractC0583w0.F(activity, "添加并启用", AbstractC0583w0.d, -1);
        Runnable runnable2 = new Runnable() { // from class: com.github.catvod.spider.merge.z.D3
            @Override // java.lang.Runnable
            public final void run() {
                String strE = AbstractC0449a.e(editTextF);
                if (strE.isEmpty()) {
                    X0.a("请先输入地址");
                    return;
                }
                com.github.catvod.spider.merge.p010l.a aVar3 = aVar2;
                boolean z3 = z;
                if (z3) {
                    aVar3.f = com.github.catvod.spider.merge.p010l.a.a(strE, aVar3.f);
                    aVar3.k();
                } else {
                    aVar3.e = com.github.catvod.spider.merge.p010l.a.a(strE, aVar3.e);
                    aVar3.k();
                }
                EditText editText2 = editText;
                if (editText2 != null) {
                    editText2.setText(strE);
                }
                if (z2) {
                    if (z3) {
                        aVar3.d = strE;
                        aVar3.k();
                    } else {
                        aVar3.c = strE;
                        aVar3.k();
                    }
                    aVar3.q();
                }
                aVar3.q();
                P1.H1(str7);
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    runnable3.run();
                }
                X0.a("已添加并启用: " + P1.M(strE, z3));
                AlertDialog alertDialog = alertDialogArr3[0];
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
            }
        };
        textViewF.setOnClickListener(new ViewOnClickListenerC0470w(runnable2, 8));
        linearLayoutY2.addView(textViewF);
        linearLayout.addView(linearLayoutY2);
        w(str7, new String[]{"address"}, new EditText[]{editTextF}, runnable2);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayout)).setNeutralButton("扫码新增", (DialogInterface.OnClickListener) null).setNegativeButton("关闭", new D1(str7, 2)).setOnCancelListener(new O(str7, 2)).create();
        alertDialogArr3[0] = alertDialogCreate;
        y1(alertDialogCreate, new W(str, str7, (Object) editTextF, 15));
    }

    public static String P(String[] strArr, int i2, String str) {
        return i2 < strArr.length ? E1(strArr[i2], str) : str;
    }

    public static void P0() {
        j1(AbstractC0302v0.Y0("ali"), AbstractC0302v0.X0("ali"), C0349e.j().A(), false, "Token", null, new S(10), new M2(1), new P2(12), "ali");
    }

    public static void Q(String str) {
        int i2 = 0;
        while (true) {
            String[] strArr = C0299u0.S;
            if (i2 >= strArr.length) {
                return;
            }
            if (str.equals(strArr[i2])) {
                if (i2 >= 0) {
                    boolean[] zArr = C0299u0.V;
                    if (i2 < zArr.length) {
                        zArr[i2] = false;
                        C0299u0.N0();
                    }
                }
                X0.a("已禁用" + AbstractC0302v0.Y0(str) + "，可在设置中心重新启用");
                return;
            }
            i2++;
        }
    }

    public static void Q0() {
        int iX0 = AbstractC0302v0.X0("baidu");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0477a3(AbstractC0583w0.d, new S2(11), "扫码登录", "推荐 - 使用百度网盘APP扫码"));
        arrayList.add(new C0477a3(AbstractC0583w0.h, new T1(iX0, 5), "手动输入Cookie", "粘贴或扫码填入Cookie"));
        String strY0 = AbstractC0302v0.Y0("baidu");
        C0353g.a().getClass();
        d1(iX0, new S2(12), strY0, "使用APP扫码或手动输入Cookie", "baidu", arrayList, C0357i.i());
    }

    public static void R() {
        Dialog dialog = s;
        s = null;
        t = null;
        InitOrigin.run(new RunnableC0514i0(dialog, 3));
    }

    public static void R0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0477a3(AbstractC0583w0.d, new S2(9), "账号密码登录", "调用厂长站点登录接口获取会话Cookie"));
        arrayList.add(new C0477a3(AbstractC0583w0.h, new S2(10), "手动输入Cookie", "网页登录后复制Cookie，支持扫码填入"));
        d1(-5018830, null, "厂长影视", "账号密码登录或手动输入Cookie", null, arrayList, CZ.hasLoginConfig());
    }

    public static void S(Dialog dialog) {
        if (dialog == null) {
            return;
        }
        InitOrigin.run(new RunnableC0514i0(dialog, 2));
    }

    public static void S0(final Activity activity, final TreeMap treeMap, final String str) {
        View button;
        Calendar calendarN = N(str);
        calendarN.add(5, 30);
        final String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(calendarN.getTime());
        String strG1 = G1();
        final Calendar calendarN2 = N(str);
        calendarN2.set(5, 1);
        Calendar calendarN3 = N(str);
        final int i2 = calendarN3.get(2) + (calendarN3.get(1) * 12);
        Calendar calendarN4 = N(str2);
        final int i3 = calendarN4.get(2) + (calendarN4.get(1) * 12);
        final int iQ = AbstractC0583w0.Q(4, activity);
        int iQ2 = AbstractC0583w0.Q(8, activity);
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        linearLayoutK.setPadding(AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(8, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(2, activity));
        linearLayoutK.addView(AbstractC0583w0.q(activity, "我的追更日历", "未来 31 天 · 共 " + treeMap.size() + " 个更新日", -16732991), AbstractC0583w0.c0(iQ2));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        final TextView textViewT0 = t0(activity, "‹", "上一月");
        final TextView textViewT1 = t0(activity, "›", "下一月");
        textViewT0.setId(View.generateViewId());
        textViewT1.setId(View.generateViewId());
        textViewT0.setNextFocusRightId(textViewT1.getId());
        textViewT1.setNextFocusLeftId(textViewT0.getId());
        final TextView textView = new TextView(activity);
        int i4 = 17;
        textView.setGravity(17);
        textView.setTextSize(14.0f);
        textView.setTextColor(AbstractC0583w0.g);
        textView.setTypeface(null, 1);
        textView.setSingleLine(true);
        int iQ3 = AbstractC0583w0.Q(48, activity);
        linearLayout.addView(textViewT0, new LinearLayout.LayoutParams(iQ3, iQ3));
        linearLayout.addView(textView, new LinearLayout.LayoutParams(0, iQ3, 1.0f));
        linearLayout.addView(textViewT1, new LinearLayout.LayoutParams(iQ3, iQ3));
        linearLayoutK.addView(linearLayout, AbstractC0583w0.c0(iQ));
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(0);
        String[] strArr = a;
        int i5 = 0;
        while (i5 < 7) {
            String str3 = strArr[i5];
            TextView textView2 = new TextView(activity);
            textView2.setText(str3);
            textView2.setTextSize(11.0f);
            textView2.setTextColor(AbstractC0583w0.h);
            textView2.setGravity(i4);
            linearLayout2.addView(textView2, new LinearLayout.LayoutParams(0, AbstractC0583w0.Q(28, activity), 1.0f));
            i5++;
            strG1 = strG1;
            strArr = strArr;
            i4 = 17;
        }
        final String str4 = strG1;
        linearLayoutK.addView(linearLayout2);
        final LinearLayout linearLayout3 = new LinearLayout(activity);
        linearLayout3.setOrientation(1);
        linearLayoutK.addView(linearLayout3);
        final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).create();
        final View[] viewArr = {null};
        final Runnable[] runnableArr = {new Runnable() { // from class: com.github.catvod.spider.merge.z.L1
            @Override // java.lang.Runnable
            public final void run() {
                int i6;
                int i7;
                Calendar calendar = calendarN2;
                int i8 = calendar.get(2) + (calendar.get(1) * 12);
                boolean z = i8 > i2;
                TextView textView3 = textViewT0;
                P1.F0(textView3, z);
                boolean z2 = i8 < i3;
                TextView textView4 = textViewT1;
                P1.F0(textView4, z2);
                StringBuilder sb = new StringBuilder();
                sb.append(new SimpleDateFormat("yyyy年M月", Locale.CHINA).format(calendar.getTime()));
                sb.append(" · ");
                String str5 = new SimpleDateFormat("yyyy-MM-", Locale.US).format(calendar.getTime());
                Map map = treeMap;
                Iterator it = map.entrySet().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    if (((String) ((Map.Entry) it.next()).getKey()).startsWith(str5)) {
                        i9++;
                    }
                }
                textView.setText(b.l(sb, i9, " 个更新日"));
                LinearLayout linearLayout4 = linearLayout3;
                linearLayout4.removeAllViews();
                View[] viewArr2 = viewArr;
                viewArr2[0] = null;
                textView3.setNextFocusDownId(-1);
                textView4.setNextFocusDownId(-1);
                int i10 = calendar.get(1);
                int i11 = calendar.get(2);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.clear();
                calendar2.set(i10, i11, 1);
                calendar2.add(5, -(calendar2.get(7) - 1));
                ArrayList arrayList = new ArrayList(42);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                for (int i12 = 0; i12 < 42; i12++) {
                    arrayList.add(simpleDateFormat.format(calendar2.getTime()));
                    calendar2.add(5, 1);
                }
                String str6 = new SimpleDateFormat("yyyy-MM-", Locale.US).format(calendar.getTime());
                int i13 = 0;
                while (i13 < 6) {
                    Context context = activity;
                    LinearLayout linearLayout5 = new LinearLayout(context);
                    linearLayout5.setOrientation(0);
                    int i14 = 0;
                    while (i14 < 7) {
                        String str7 = (String) arrayList.get((i13 * 7) + i14);
                        boolean zStartsWith = str7.startsWith(str6);
                        boolean z3 = str7.compareTo(str) >= 0 && str7.compareTo(str2) <= 0;
                        List list = (List) map.get(str7);
                        int size = list == null ? 0 : list.size();
                        boolean z4 = zStartsWith && z3 && size > 0;
                        boolean zEquals = str7.equals(str4);
                        ArrayList arrayList2 = arrayList;
                        Calendar calendarN5 = P1.N(str7);
                        TextView textView5 = textView4;
                        TextView textView6 = new TextView(context);
                        TextView textView7 = textView3;
                        textView6.setId(View.generateViewId());
                        StringBuilder sb2 = new StringBuilder();
                        int i15 = i13;
                        sb2.append(String.valueOf(calendarN5.get(5)));
                        sb2.append(z4 ? b.h("\n", size, " 部") : "");
                        textView6.setText(sb2.toString());
                        textView6.setTextSize(11.0f);
                        textView6.setGravity(17);
                        textView6.setTypeface(null, (z4 || zEquals) ? 1 : 0);
                        if (zStartsWith) {
                            i6 = -16747385;
                            if (!z4 && !zEquals) {
                                i6 = AbstractC0583w0.h;
                            }
                        } else {
                            i6 = AbstractC0583w0.i;
                        }
                        textView6.setTextColor(!z4 ? ColorStateList.valueOf(i6) : new ColorStateList(new int[][]{new int[]{R.attr.state_focused}, new int[]{R.attr.state_pressed}, new int[0]}, new int[]{-1, -1, i6}));
                        textView6.setAlpha(zStartsWith ? z3 ? 1.0f : 0.5f : 0.35f);
                        textView6.setBackground(z4 ? AbstractC0583w0.G(context, -2033670, -16747385, 10, 2, -16732991) : null);
                        textView6.setFocusable(z4);
                        textView6.setClickable(z4);
                        textView6.setEnabled(z4);
                        textView6.setContentDescription(P1.T(str7) + "，" + size + " 部更新");
                        if (z4) {
                            textView6.setOnClickListener(new K(context, str7, (Object) list, 5));
                            i7 = 0;
                            if (viewArr2[0] == null) {
                                viewArr2[0] = textView6;
                            }
                        } else {
                            i7 = 0;
                        }
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i7, AbstractC0583w0.Q(48, context), 1.0f);
                        int i16 = iQ;
                        int i17 = i16 / 2;
                        layoutParams.setMargins(i16, i17, i16, i17);
                        linearLayout5.addView(textView6, layoutParams);
                        i14++;
                        str6 = str6;
                        map = map;
                        arrayList = arrayList2;
                        textView4 = textView5;
                        textView3 = textView7;
                        i13 = i15;
                    }
                    linearLayout4.addView(linearLayout5, new LinearLayout.LayoutParams(-1, -2));
                    i13++;
                    str6 = str6;
                    textView3 = textView3;
                }
                TextView textView8 = textView4;
                TextView textView9 = textView3;
                View view = viewArr2[0];
                if (view != null) {
                    view.setNextFocusUpId(textView9.isEnabled() ? textView9.getId() : textView8.getId());
                    textView9.setNextFocusDownId(viewArr2[0].getId());
                    textView8.setNextFocusDownId(viewArr2[0].getId());
                }
                AbstractC0583w0.f0(alertDialogCreate);
            }
        }};
        final int i6 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.M1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        TextView textView3 = textViewT0;
                        if (textView3.isEnabled()) {
                            calendarN2.add(2, -1);
                            runnableArr[0].run();
                            View view2 = viewArr[0];
                            if (!textView3.isEnabled()) {
                                textView3 = textViewT1;
                            }
                            if (view2 == null) {
                                view2 = textView3;
                            }
                            Objects.requireNonNull(view2);
                            view2.post(new RunnableC0494e0(view2, 3));
                            break;
                        }
                        break;
                    default:
                        TextView textView4 = textViewT0;
                        if (textView4.isEnabled()) {
                            calendarN2.add(2, 1);
                            runnableArr[0].run();
                            View view3 = viewArr[0];
                            if (!textView4.isEnabled()) {
                                textView4 = textViewT1;
                            }
                            if (view3 == null) {
                                view3 = textView4;
                            }
                            Objects.requireNonNull(view3);
                            view3.post(new RunnableC0494e0(view3, 3));
                            break;
                        }
                        break;
                }
            }
        };
        final TextView textView3 = textViewT0;
        textView3.setOnClickListener(onClickListener);
        final int i7 = 1;
        textViewT1.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.M1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        TextView textView4 = textViewT1;
                        if (textView4.isEnabled()) {
                            calendarN2.add(2, -1);
                            runnableArr[0].run();
                            View view2 = viewArr[0];
                            if (!textView4.isEnabled()) {
                                textView4 = textView3;
                            }
                            if (view2 == null) {
                                view2 = textView4;
                            }
                            Objects.requireNonNull(view2);
                            view2.post(new RunnableC0494e0(view2, 3));
                            break;
                        }
                        break;
                    default:
                        TextView textView5 = textViewT1;
                        if (textView5.isEnabled()) {
                            calendarN2.add(2, 1);
                            runnableArr[0].run();
                            View view3 = viewArr[0];
                            if (!textView5.isEnabled()) {
                                textView5 = textView3;
                            }
                            if (view3 == null) {
                                view3 = textView5;
                            }
                            Objects.requireNonNull(view3);
                            view3.post(new RunnableC0494e0(view3, 3));
                            break;
                        }
                        break;
                }
            }
        });
        runnableArr[0].run();
        AbstractC0583w0.j0(alertDialogCreate);
        View view = viewArr[0];
        if (view != null) {
            button = view;
        } else if (textViewT1.isEnabled()) {
            button = textViewT1;
        } else if (!textView3.isEnabled()) {
            button = textView3;
            button = null;
        }
        if (button == null) {
            button = alertDialogCreate.getButton(-1);
        }
        if (button != null) {
            button.post(new RunnableC0494e0(button, 3));
        }
    }

    public static String T(String str) {
        if (str == null || !str.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return "未选择日期";
        }
        Calendar calendarN = N(str);
        Locale locale = Locale.CHINA;
        String str2 = new SimpleDateFormat("M月d日", locale).format(calendarN.getTime());
        String str3 = new SimpleDateFormat("E", locale).format(calendarN.getTime());
        StringBuilder sb = new StringBuilder();
        sb.append(str.equals(G1()) ? "今天 · " : "");
        sb.append(str2);
        sb.append(" ");
        sb.append(str3);
        return sb.toString();
    }

    public static void T0(String str, Runnable runnable) {
        InitOrigin.run(new RunnableC0593y0(str, runnable, 4));
    }

    public static void U(Runnable runnable, String str, Callable callable) {
        InitOrigin.run(new W(runnable, str, callable));
    }

    public static void U0() {
        String strConcat;
        boolean zQ = k2.q();
        boolean zM = k2.m(zQ);
        String strI = k2.i(zQ);
        String strConcat2 = "当前方式：".concat(strI);
        String[] strArr = {"配置备份", "播放历史同步"};
        if (zM) {
            strConcat = strI.concat("已就绪 · 备份或恢复应用设置");
        } else {
            strConcat = zQ ? "夸克未登录 · 点击完成登录" : "WebDAV未配置 · 点击完成配置";
        }
        L0("云端备份", strConcat2, strArr, new String[]{strConcat, b.m(new StringBuilder("自动同步"), k2.p(zQ) ? "开" : "关", " · 立即同步与清除")}, new int[]{AbstractC0583w0.d, AbstractC0583w0.f}, new Runnable[]{new RunnableC0383v0(9, zQ), new RunnableC0383v0(10, zQ)}, new P2(15), false);
    }

    public static void V(String str) {
        o = false;
        X0.a(str);
    }

    public static void V0(String str, String str2) {
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(str)) {
            str = "当前站点";
        }
        map.put("siteName", str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "登录弹窗里的站点地址";
        }
        map.put("websiteUrl", str2);
        X0("cookie_login_help", map);
    }

    public static String W(LinkedHashMap linkedHashMap, String... strArr) {
        for (String str : strArr) {
            Object obj = linkedHashMap.get(str);
            if (obj != null && !obj.toString().isEmpty()) {
                return obj.toString();
            }
        }
        return null;
    }

    public static void W0() {
        String strConcat;
        int iN = AbstractC0251e.n();
        com.github.catvod.spider.merge.p010l.a aVarI = com.github.catvod.spider.merge.p010l.a.i();
        String[] strArr = {"我的追更日历", "添加追更", "已订阅追更", "更新提醒", "追更展示"};
        String strH = iN > 0 ? b.h("按日期查看 ", iN, " 部追更") : "暂无订阅 · 可先添加追更";
        String strH2 = iN > 0 ? b.h("共 ", iN, " 部 · 每页 5 部") : "暂无订阅";
        String str = aVarI.l ? "已开启 · 启动时提示今日更新" : "已关闭 · 当天有更新才提示";
        if (aVarI.k == 1) {
            strConcat = "海报展示 · ".concat(aVarI.j == 1 ? "宽图卡片" : "竖版海报");
        } else {
            strConcat = "列表展示";
        }
        L0("管理追更", "日历、订阅、提醒和展示设置", strArr, new String[]{strH, "搜索剧名，通过海报和资料确认作品", strH2, str, strConcat}, new int[]{-16732991, AbstractC0583w0.d, -16732991, AbstractC0583w0.f, -16732991}, new Runnable[]{new U2(16), new U2(17), new U2(18), new U2(19), new U2(13)}, new U2(20), false);
    }

    public static String X(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("nextAirDate");
        if (!strOptString.isEmpty()) {
            int iOptInt = jSONObject.optInt("nextSeason");
            int iOptInt2 = jSONObject.optInt("nextEpisode");
            return b.j("下次更新 ", strOptString, (iOptInt <= 0 || iOptInt2 <= 0) ? "" : String.format(Locale.US, " · S%02dE%02d", Integer.valueOf(iOptInt), Integer.valueOf(iOptInt2)));
        }
        String strOptString2 = jSONObject.optString("status");
        if ("Ended".equalsIgnoreCase(strOptString2) || "Canceled".equalsIgnoreCase(strOptString2)) {
            return "已完结";
        }
        String strOptString3 = jSONObject.optString("year");
        return strOptString3.isEmpty() ? "待官宣" : strOptString3.concat(" · 待官宣");
    }

    public static void X0(String str, HashMap map) {
        if (o) {
            return;
        }
        o = true;
        InitOrigin.run(new Q1(0, str, map));
    }

    public static String Y(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("status");
        String strOptString2 = jSONObject.optString("nextAirDate");
        if (strOptString2.matches("\\d{4}-\\d{2}-\\d{2}")) {
            return "0|" + strOptString2 + '|' + jSONObject.optString("name");
        }
        boolean z = "Ended".equalsIgnoreCase(strOptString) || "Canceled".equalsIgnoreCase(strOptString);
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "2|" : "1|");
        sb.append(jSONObject.optString("name"));
        return sb.toString();
    }

    public static void Y0(String str, Bitmap bitmap, Runnable runnable, Callable callable) {
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null) {
                U(runnable, "获取Activity失败", callable);
                return;
            }
            int iQ = AbstractC0583w0.Q(14, activity);
            int iQ2 = AbstractC0583w0.Q(20, activity);
            int iQ3 = AbstractC0583w0.Q(24, activity);
            int iQ4 = AbstractC0583w0.Q(5, activity);
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            boolean zY = AbstractC0583w0.Y(activity);
            DisplayMetrics displayMetrics2 = activity.getResources().getDisplayMetrics();
            boolean zY2 = AbstractC0583w0.Y(activity);
            int iMax = Math.max(AbstractC0583w0.Q(zY2 ? 150 : 170, activity), Math.min(Math.min((int) (displayMetrics2.widthPixels * (zY2 ? 0.36f : 0.7f)), (int) (displayMetrics2.heightPixels * (zY2 ? 0.62f : 0.5f))), AbstractC0583w0.Q(zY2 ? 380 : 420, activity)));
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(17);
            int i2 = zY ? iQ2 : iQ3;
            if (!zY) {
                iQ2 = iQ3;
            }
            linearLayout.setPadding(iQ3, i2, iQ3, iQ2);
            linearLayout.setBackgroundColor(0);
            ImageView imageView = new ImageView(activity);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setBackgroundColor(-1);
            imageView.setPadding(iQ4, iQ4, iQ4, iQ4);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, iMax);
            layoutParams.gravity = 17;
            linearLayout.addView(imageView, layoutParams);
            String str2 = (str == null || str.isEmpty()) ? "使用浏览器或微信扫描二维码" : str;
            TextView textView = new TextView(activity);
            textView.setText(str2);
            textView.setTextSize(zY ? 14.0f : 15.0f);
            textView.setTextColor(-1);
            textView.setGravity(17);
            textView.setMaxLines(2);
            textView.setLineSpacing(AbstractC0583w0.Q(2, activity), 1.0f);
            textView.setShadowLayer(3.0f, 0.0f, 1.0f, -1728053248);
            textView.setPadding(0, iQ, 0, 0);
            linearLayout.addView(textView, new LinearLayout.LayoutParams(Math.max(iMax, Math.min(displayMetrics.widthPixels - AbstractC0583w0.Q(32, activity), AbstractC0583w0.Q(520, activity))), -2));
            try {
                Dialog dialog = s;
                s = null;
                t = null;
                if (dialog != null && dialog.isShowing()) {
                    dialog.dismiss();
                }
            } catch (Exception unused) {
            }
            Dialog dialog2 = new Dialog(activity, R.style.Theme.Translucent.NoTitleBar);
            dialog2.setContentView(linearLayout, new ViewGroup.LayoutParams(-1, -1));
            dialog2.setCancelable(true);
            dialog2.setCanceledOnTouchOutside(true);
            dialog2.setOnCancelListener(new C0(runnable, 3));
            s = dialog2;
            t = runnable;
            dialog2.setOnDismissListener(new Y1(1, dialog2));
            dialog2.show();
            Window window = dialog2.getWindow();
            if (window == null) {
                return;
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setWindowAnimations(0);
            window.addFlags(2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.62f;
            attributes.gravity = 17;
            window.setAttributes(attributes);
            window.setLayout(-1, -1);
            try {
                window.getDecorView().setPadding(0, 0, 0, 0);
            } catch (Exception unused2) {
            }
        } catch (Exception unused3) {
            U(runnable, "显示二维码失败", callable);
        }
    }

    public static ArrayList Z() {
        JSONArray jSONArrayO = AbstractC0251e.o();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArrayO.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayO.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("tmdbId") > 0) {
                arrayList.add(jSONObjectOptJSONObject);
            }
        }
        Collections.sort(arrayList, new L(4));
        return arrayList;
    }

    public static void Z0(String str, String str2, String str3, int i2, Runnable runnable, Runnable runnable2, Callable callable) {
        try {
            if (n0(callable)) {
                Bitmap bitmapB0 = b0(str3);
                if (bitmapB0 == null) {
                    U(runnable, "二维码生成失败", callable);
                } else {
                    InitOrigin.run(new RunnableC0466s(callable, str, str2, bitmapB0, i2, runnable, runnable2));
                }
            }
        } catch (Exception unused) {
            U(runnable, "二维码生成失败", callable);
        }
    }

    public static double[] a(JSONObject jSONObject, double d2) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("curve");
        if (!"arc".equals(jSONObject.optString("motion")) || jSONObjectOptJSONObject == null) {
            double dOptInt = jSONObject.optInt("max_x");
            Double.isNaN(dOptInt);
            return new double[]{d2 * dOptInt, jSONObject.optInt("piece_y")};
        }
        double d3 = 1.0d - d2;
        double d4 = 3.0d * d3;
        double[] dArr = {d3 * d3 * d3, d3 * d4 * d2, d4 * d2 * d2, d2 * d2 * d2};
        String[] strArr = {"start", "control1", "control2", "end"};
        double dOptDouble = 0.0d;
        double dOptDouble2 = 0.0d;
        for (int i2 = 0; i2 < 4; i2++) {
            dOptDouble += jSONObjectOptJSONObject.optDouble(strArr[i2] + "_x") * dArr[i2];
            dOptDouble2 += jSONObjectOptJSONObject.optDouble(strArr[i2] + "_y") * dArr[i2];
        }
        return new double[]{dOptDouble, dOptDouble2};
    }

    public static String a0(long j2) {
        if (j2 < 1024) {
            return j2 + " B";
        }
        if (j2 < 1048576) {
            double d2 = j2;
            Double.isNaN(d2);
            return String.format("%.1f KB", Double.valueOf(d2 / 1024.0d));
        }
        if (j2 < 1073741824) {
            double d3 = j2;
            Double.isNaN(d3);
            return String.format("%.1f MB", Double.valueOf(d3 / 1048576.0d));
        }
        double d4 = j2;
        Double.isNaN(d4);
        return String.format("%.2f GB", Double.valueOf(d4 / 1.073741824E9d));
    }

    public static void a1() {
        int i2 = 5;
        e1("光鸭社区", -16728155, "Cookie", "登录" + PanWebShareGuangYa.getCurrentSiteUrl() + "后复制Cookie", PanWebShareGuangYa.getSavedCookie(), new M2(i2), "清除", new S2(i2), PanWebShareGuangYa.getCurrentSiteUrl());
    }

    public static LinearLayout b(Context context, List list, int i2, int i3, int i4) {
        LinearLayout linearLayoutY = AbstractC0583w0.y(context);
        for (int i5 = 0; i5 < list.size(); i5++) {
            C0517i3 c0517i3 = (C0517i3) list.get(i5);
            if (i5 > 0) {
                View view = new View(context);
                view.setBackgroundColor(AbstractC0583w0.j);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 1);
                layoutParams.setMargins(i2 + i3 + i4, 0, i2, 0);
                linearLayoutY.addView(view, layoutParams);
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setPadding(i2, i3, i2, i3);
            linearLayout.setGravity(16);
            View view2 = new View(context);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setColor(c0517i3.c);
            view2.setBackground(gradientDrawable);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, i3);
            layoutParams2.rightMargin = i4;
            view2.setLayoutParams(layoutParams2);
            linearLayout.addView(view2);
            TextView textView = new TextView(context);
            textView.setText(c0517i3.a);
            textView.setTextSize(13.0f);
            textView.setTextColor(AbstractC0583w0.h);
            textView.setSingleLine(true);
            textView.setMinWidth(AbstractC0583w0.Q(68, context));
            textView.setMaxWidth(AbstractC0583w0.Q(86, context));
            textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(textView);
            TextView textView2 = new TextView(context);
            textView2.setText(c0517i3.b);
            textView2.setTextSize(13.0f);
            textView2.setTextColor(c0517i3.c);
            textView2.setGravity(8388613);
            textView2.setMaxLines(3);
            textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (c0517i3.d) {
                textView2.getPaint().setFakeBoldText(true);
            }
            linearLayout.addView(textView2);
            linearLayoutY.addView(linearLayout);
        }
        return linearLayoutY;
    }

    public static Bitmap b0(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        try {
            EnumMap enumMap = new EnumMap(EncodeHintType.class);
            enumMap.put(EncodeHintType.CHARACTER_SET, "UTF-8");
            enumMap.put(EncodeHintType.MARGIN, 2);
            BitMatrix bitMatrixEncode = new MultiFormatWriter().encode(str, BarcodeFormat.QR_CODE, 720, 720, enumMap);
            int width = bitMatrixEncode.getWidth();
            int height = bitMatrixEncode.getHeight();
            int[] iArr = new int[width * height];
            for (int i2 = 0; i2 < height; i2++) {
                int i3 = i2 * width;
                for (int i4 = 0; i4 < width; i4++) {
                    iArr[i3 + i4] = bitMatrixEncode.get(i4, i2) ? -16777216 : -1;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
            return bitmapCreateBitmap;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void b1() {
        int iX0 = AbstractC0302v0.X0("guangya");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0477a3(AbstractC0583w0.d, new P2(6), "扫码登录", "推荐 - 使用光鸭扫码登录"));
        arrayList.add(new C0477a3(AbstractC0583w0.h, new P2(7), "手动输入Token", "粘贴或扫码填入Token"));
        d1(iX0, new P2(8), AbstractC0302v0.Y0("guangya"), "扫码或Token登录", "guangya", arrayList, C0342a0.x.G());
    }

    public static TextView c(Context context, int i2, String str, String str2, int i3, int i4) {
        TextView textViewX = AbstractC0583w0.x(context, "复制" + str2, i2);
        textViewX.setFocusable(true);
        textViewX.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0499f0(i4, i2, 5));
        K k2 = new K((Object) context, str2, (Object) str, 8);
        textViewX.setOnClickListener(k2);
        textViewX.setOnKeyListener(new ViewOnKeyListenerC0497e3(0, k2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = i3;
        textViewX.setLayoutParams(layoutParams);
        return textViewX;
    }

    public static Runnable c0(String str) {
        int i2 = 15;
        int i3 = 12;
        int i4 = 9;
        int i5 = 8;
        int i6 = 7;
        int i7 = 6;
        int i8 = 5;
        int i9 = 3;
        int i10 = 14;
        int i11 = 13;
        int i12 = 11;
        int i13 = 10;
        if (str == null) {
            return null;
        }
        switch (str) {
            case "poster_personal":
            case "poster_ai":
                return new U2(23);
            case "poster_experience":
                return new U2(i2);
            case "poster_fallback":
            case "poster_source":
                return new B3(i10);
            case "poster_tmdb_menu":
                return new U2(i5);
            case "poster_image":
                return new U2(i13);
            case "poster_reset":
                return new B3(i11);
            case "poster_token":
            case "poster_tmdb":
                return new U2(i6);
            case "home_menu_manage":
                return new B3(i12);
            case "poster_follow_display":
                return new U2(i11);
            case "poster_ai_config":
                return new B3(i7);
            case "poster_ai_manage":
                return new B3(i9);
            case "poster_calendar":
            case "poster_region":
                return new U2(i12);
            case "poster_help":
                return new B3(i13);
            case "poster_main":
                return new U2(i8);
            case "poster_follow_manage":
                return new U2(i3);
            case "poster_mirror":
            case "poster_api":
                return new U2(i4);
            case "poster_ai_profile":
                return new U2(29);
            case "poster_display":
                return new U2(i10);
            default:
                return null;
        }
    }

    public static void c1(Activity activity, TreeMap treeMap) {
        int iQ = AbstractC0583w0.Q(8, activity);
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList(treeMap.keySet());
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        linearLayoutK.addView(AbstractC0583w0.q(activity, "追更列表", "未来 31 天 · " + treeMap.size() + " 个更新日", -16732991), AbstractC0583w0.c0(iQ));
        TextView textView = new TextView(activity);
        textView.setTextSize(12.0f);
        textView.setTextColor(AbstractC0583w0.h);
        textView.setGravity(5);
        textView.setTypeface(null, 1);
        linearLayoutK.addView(textView, AbstractC0583w0.c0(iQ));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        ScrollView scrollViewJ = AbstractC0583w0.J(activity, linearLayout, 340);
        linearLayoutK.addView(scrollViewJ);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("关闭", (DialogInterface.OnClickListener) null).setNeutralButton("上一页", (DialogInterface.OnClickListener) null).setNegativeButton("下一页", (DialogInterface.OnClickListener) null).create();
        Runnable[] runnableArr = {new I(arrayList, iArr, textView, linearLayout, new View[]{null}, activity, treeMap, scrollViewJ, alertDialogCreate)};
        AbstractC0583w0.j0(alertDialogCreate);
        alertDialogCreate.getButton(-3).setOnClickListener(new N1(iArr, runnableArr, 0));
        alertDialogCreate.getButton(-2).setOnClickListener(new N1(iArr, runnableArr, 1));
        runnableArr[0].run();
    }

    public static void d(Button button, boolean z, boolean z2) {
        if (button == null) {
            return;
        }
        boolean z3 = false;
        button.setVisibility(z ? 0 : 8);
        button.setEnabled(z2);
        if (z && z2 && AbstractC0583w0.h0(button.getContext())) {
            z3 = true;
        }
        button.setFocusable(z3);
        button.setFocusableInTouchMode(z3);
        button.setAlpha(z2 ? 1.0f : 0.45f);
    }

    public static Activity d0() {
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity != null && !activity.isFinishing()) {
                return activity;
            }
        } catch (Exception unused) {
        }
        X0.a("当前页面不可用，请稍后重试");
        return null;
    }

    public static void d1(int i2, Runnable runnable, String str, String str2, String str3, ArrayList arrayList, boolean z) {
        InitOrigin.run(new T2(i2, runnable, str, str2, str3, arrayList, z));
    }

    public static void e(ArrayList arrayList, C0256f1 c0256f1) {
        f(arrayList, c0256f1, true, true, null);
    }

    public static int e0(boolean z) {
        int i2 = 0;
        try {
            if (C0299u0.Z() && !z) {
                i2 = 1;
            }
        } catch (Exception unused) {
        }
        try {
            if (C0299u0.z() == 0) {
                i2++;
            }
        } catch (Exception unused2) {
        }
        try {
            return !k2.l() ? i2 + 1 : i2;
        } catch (Exception unused3) {
            return i2;
        }
    }

    public static void e1(String str, int i2, String str2, String str3, String str4, Z2 z2, String str5, Runnable runnable, String str6) {
        InitOrigin.run(new I(str, str2, i2, str6, str5, runnable, str3, str4, String.valueOf(System.currentTimeMillis()), new i(22, z2)));
    }

    public static void f(ArrayList arrayList, C0256f1 c0256f1, boolean z, boolean z2, String str) {
        if (o0(str)) {
            str = c0256f1.c;
        }
        s("用户名", r0(str), arrayList);
        String str2 = c0256f1.d;
        if (!o0(str2) && !str2.equals(str)) {
            s("登录账号", r0(str2), arrayList);
        }
        if (z) {
            s("手机号", r0(c0256f1.e), arrayList);
        }
        if (z2) {
            String strP0 = c0256f1.f;
            if (!o0(strP0) && strP0.length() > 10) {
                strP0 = p0(strP0, 4, 4);
            }
            s("用户ID", strP0, arrayList);
        }
    }

    public static String f0() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress inetAddressNextElement = inetAddresses.nextElement();
                    if (!inetAddressNextElement.isLoopbackAddress() && (inetAddressNextElement instanceof Inet4Address)) {
                        return inetAddressNextElement.getHostAddress();
                    }
                }
            }
            return "127.0.0.1";
        } catch (Exception unused) {
            return "127.0.0.1";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void f1(String str, String str2, String str3, String[] strArr, String[] strArr2, String... strArr3) {
        if (A(str3, strArr)) {
            K0(str, str2, new String[]{"开关管理", "排序管理"}, new String[]{U0.d(str3, strArr, strArr3), "调整一级菜单显示顺序"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.f}, new Runnable[]{new RunnableC0466s(str, (Serializable) str3, (Serializable) strArr, (Object) strArr2, (Object) strArr3, 13), new RunnableC0240a0(str, (Object) str3, (Object) strArr, (Object) strArr2, 21)});
        }
    }

    public static void g(final Activity activity, LinearLayout linearLayout, final EditText editText, final EditText editText2) {
        int iQ = AbstractC0583w0.Q(8, activity);
        final TextView textViewF = AbstractC0583w0.F(activity, "API 地址 · " + M(editText.getText().toString(), false), -16732991, -1);
        final int i2 = 0;
        textViewF.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.G3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                switch (i2) {
                    case 0:
                        final TextView textView = textViewF;
                        final EditText editText3 = editText;
                        final int i3 = 1;
                        P1.O0((Activity) activity, "API 地址", false, editText3, false, new Runnable() { // from class: com.github.catvod.spider.merge.z.J3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        textView.setText("图片地址 · " + P1.M(editText3.getText().toString(), true));
                                        break;
                                    default:
                                        textView.setText("API 地址 · " + P1.M(editText3.getText().toString(), false));
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final TextView textView2 = textViewF;
                        final EditText editText4 = editText;
                        final int i4 = 0;
                        P1.O0((Activity) activity, "图片地址", true, editText4, false, new Runnable() { // from class: com.github.catvod.spider.merge.z.J3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        textView2.setText("图片地址 · " + P1.M(editText4.getText().toString(), true));
                                        break;
                                    default:
                                        textView2.setText("API 地址 · " + P1.M(editText4.getText().toString(), false));
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = iQ;
        linearLayout.addView(textViewF, layoutParams);
        StringBuilder sb = new StringBuilder("图片地址 · ");
        final int i3 = 1;
        sb.append(M(editText2.getText().toString(), true));
        final TextView textViewF2 = AbstractC0583w0.F(activity, sb.toString(), AbstractC0583w0.f, -1);
        textViewF2.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.G3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) throws Throwable {
                switch (i3) {
                    case 0:
                        final TextView textView = textViewF2;
                        final EditText editText3 = editText2;
                        final int i4 = 1;
                        P1.O0((Activity) activity, "API 地址", false, editText3, false, new Runnable() { // from class: com.github.catvod.spider.merge.z.J3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        textView.setText("图片地址 · " + P1.M(editText3.getText().toString(), true));
                                        break;
                                    default:
                                        textView.setText("API 地址 · " + P1.M(editText3.getText().toString(), false));
                                        break;
                                }
                            }
                        });
                        break;
                    default:
                        final TextView textView2 = textViewF2;
                        final EditText editText4 = editText2;
                        final int i5 = 0;
                        P1.O0((Activity) activity, "图片地址", true, editText4, false, new Runnable() { // from class: com.github.catvod.spider.merge.z.J3
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i5) {
                                    case 0:
                                        textView2.setText("图片地址 · " + P1.M(editText4.getText().toString(), true));
                                        break;
                                    default:
                                        textView2.setText("API 地址 · " + P1.M(editText4.getText().toString(), false));
                                        break;
                                }
                            }
                        });
                        break;
                }
            }
        });
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = iQ;
        linearLayout.addView(textViewF2, layoutParams2);
    }

    public static String g0() {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        for (boolean z : C0299u0.V) {
            if (z) {
                i2++;
            }
        }
        sb.append(i2);
        sb.append("/");
        return b.l(sb, C0299u0.T.length, "个");
    }

    public static void g1() {
        j1(AbstractC0302v0.Y0("115"), AbstractC0302v0.X0("115"), C0364l0.O(C0364l0.C().a), false, "Cookie", null, new S2(15), new M2(6), new S2(16), "115");
    }

    public static void h(LinearLayout linearLayout, String str, String str2, int i2, int i3) {
        Context context = linearLayout.getContext();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setPadding(0, i3, 0, i3);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setGravity(16);
        TextView textView = new TextView(context);
        textView.setText("●");
        textView.setTextSize(12.0f);
        textView.setTextColor(i2);
        linearLayout3.addView(textView, new LinearLayout.LayoutParams(AbstractC0583w0.Q(18, context), -2));
        TextView textView2 = new TextView(context);
        textView2.setText(str);
        textView2.setTextSize(13.0f);
        textView2.setTextColor(AbstractC0583w0.g);
        textView2.setTypeface(null, 1);
        linearLayout3.addView(textView2);
        linearLayout2.addView(linearLayout3);
        TextView textView3 = new TextView(context);
        textView3.setText((str2 == null || str2.trim().isEmpty()) ? "暂无" : str2.trim());
        textView3.setTextSize(13.0f);
        textView3.setTextColor(AbstractC0583w0.h);
        textView3.setLineSpacing(AbstractC0583w0.Q(1, context), 1.0f);
        textView3.setPadding(AbstractC0583w0.Q(18, context), AbstractC0583w0.Q(2, context), 0, 0);
        linearLayout2.addView(textView3);
        linearLayout.addView(linearLayout2);
    }

    public static String h0(boolean z) {
        if (!C0299u0.Z()) {
            return "Java代理";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C0299u0.g1() ? "SO代理" : "Go代理");
        sb.append(" · ");
        sb.append(z ? "运行中" : "未启动");
        return sb.toString();
    }

    public static void h1() {
        e1("123社区", -1499549, "Cookie", "登录" + PanWebShare123.getCurrentSiteUrl() + "后复制Cookie", PanWebShare123.getSavedCookie(), new M2(2), "清除", new P2(9), PanWebShare123.getCurrentSiteUrl());
    }

    public static void i(ArrayList arrayList, C0256f1 c0256f1, String str) {
        String string = "";
        if (!TextUtils.isEmpty(c0256f1.j)) {
            if (TextUtils.isEmpty(c0256f1.k)) {
                string = c0256f1.j;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(c0256f1.k);
                sb.append(" / ");
                sb.append(c0256f1.j);
                sb.append(TextUtils.isEmpty(c0256f1.l) ? "" : b.m(new StringBuilder(" ("), c0256f1.l, "%)"));
                string = sb.toString();
            }
        }
        if (string == null || string.isEmpty()) {
            return;
        }
        arrayList.add(new C0517i3(str, AbstractC0583w0.h, string, false));
    }

    public static String i0(boolean z) {
        boolean[] zArr = C0299u0.b0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            String[] strArr = C0299u0.W;
            if (i2 >= strArr.length) {
                return i3 + "/" + i4 + "条";
            }
            C0253e1 c0253e1J1 = AbstractC0302v0.J1(strArr[i2]);
            if ((c0253e1J1 != null && "unlimited".equals(c0253e1J1.c)) == z) {
                i4++;
                if (zArr[i2]) {
                    i3++;
                }
            }
            i2++;
        }
    }

    public static void i1() {
        int iX0 = AbstractC0302v0.X0("pan123");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0477a3(AbstractC0583w0.d, new P2(10), "扫码授权", "手机扫码登录123并允许Open授权"));
        int i2 = AbstractC0583w0.h;
        arrayList.add(new C0477a3(i2, new P2(11), "账号密码授权", "在应用内完成登录及Open授权"));
        C0377s0 c0377s0 = C0377s0.u;
        arrayList.add(new C0477a3(i2, new P2(13), "手动输入Token", c0377s0.s() ? "Open Token已配置" : "粘贴Open Token JSON"));
        d1(iX0, new RunnableC0341a(2, c0377s0), AbstractC0302v0.Y0("pan123"), "扫码、账号密码或Token授权", "pan123", arrayList, c0377s0.u() || c0377s0.s());
    }

    public static void j(LinearLayout linearLayout, com.github.catvod.spider.merge.p006g.a aVar) {
        AbstractC0583w0.m(linearLayout, "自动推送弹幕", "播放时自动匹配；关闭后仍可手动搜索", AbstractC0583w0.d, aVar.j(), 0, false, null, null, new Y(aVar, 1));
        AbstractC0583w0.m(linearLayout, "匹配失败时打开搜索", "需开启自动推送；本次播放只弹一次，不唤起键盘", AbstractC0583w0.c, aVar.o(), 1, true, null, null, new Y(aVar, 2));
        AbstractC0583w0.m(linearLayout, "弹幕随机位置", "开启混合滚动与顶部/底部；关闭统一滚动", AbstractC0583w0.f, aVar.n(), 2, true, null, null, new Y(aVar, 3));
        AbstractC0583w0.m(linearLayout, "弹幕随机颜色", "开启随机彩色；关闭按服务端默认颜色", AbstractC0583w0.e, aVar.m(), 3, true, null, null, new Y(aVar, 4));
    }

    public static String j0(String str) {
        int iLastIndexOf;
        String lowerCase = (TextUtils.isEmpty(str) || (iLastIndexOf = str.lastIndexOf(46)) < 0 || iLastIndexOf >= str.length() + (-1)) ? "" : str.substring(iLastIndexOf + 1).toLowerCase();
        if (TextUtils.isEmpty(lowerCase)) {
            return "文件";
        }
        if (Arrays.asList("mp4", "mkv", "avi", "mov", "wmv", "flv", "rmvb", "ts", "m3u8", "iso").contains(lowerCase)) {
            return "视频文件";
        }
        if (Arrays.asList("srt", "ass", "ssa", "vtt").contains(lowerCase)) {
            return "字幕文件";
        }
        if (Arrays.asList("zip", "rar", "7z", "tar", "gz").contains(lowerCase)) {
            return "压缩包";
        }
        if (Arrays.asList("apk").contains(lowerCase)) {
            return "安装包";
        }
        if (Arrays.asList("jpg", "jpeg", "png", "gif", "bmp", "webp").contains(lowerCase)) {
            return "图片文件";
        }
        if (Arrays.asList("doc", "docx", "pdf", "txt", "md").contains(lowerCase)) {
            return "文档文件";
        }
        if (Arrays.asList("xls", "xlsx", "csv").contains(lowerCase)) {
            return "表格文件";
        }
        if (Arrays.asList("ppt", "pptx").contains(lowerCase)) {
            return "演示文件";
        }
        return lowerCase.toUpperCase() + " 文件";
    }

    public static void j1(String str, int i2, boolean z, boolean z2, String str2, Runnable runnable, Runnable runnable2, Z2 z3, Runnable runnable3, String str3) {
        String str4;
        String str5;
        ArrayList arrayList = new ArrayList();
        if (runnable != null) {
            arrayList.add(new C0477a3(i2, new B(runnable, 6), "APP跳转登录", "已安装APP时使用"));
        }
        if (runnable != null) {
            str4 = "无APP或跨设备扫码登录";
        } else {
            str4 = z2 ? "推荐 - 有APP跳转 无APP扫码" : "推荐 - 使用APP扫码";
        }
        arrayList.add(new C0477a3(AbstractC0583w0.d, new B(runnable2, 7), "扫码登录", str4));
        arrayList.add(new C0477a3(AbstractC0583w0.h, new N0(str, i2, z, z2, str2, runnable, runnable2, z3, runnable3, str3), "手动输入".concat(str2), "粘贴或扫码填入"));
        if (runnable != null) {
            str5 = "选择APP跳转或扫码登录";
        } else {
            str5 = z2 ? "已安装APP会自动跳转登录" : "使用APP扫码或手动输入";
        }
        d1(i2, runnable3, str, str5, str3, arrayList, z);
    }

    public static void k(String str, ArrayList arrayList) {
        if (str.isEmpty()) {
            return;
        }
        arrayList.add(new C0517i3("凭证类型", AbstractC0583w0.h, str, false));
    }

    public static String k0(String str) {
        String strTrim = str == null ? "" : str.trim();
        int iIndexOf = strTrim.indexOf("?url=");
        if (iIndexOf >= 0) {
            strTrim = strTrim.substring(iIndexOf + 5);
        }
        if (strTrim.startsWith("https://")) {
            strTrim = strTrim.substring(8);
        }
        if (strTrim.startsWith("http://")) {
            strTrim = strTrim.substring(7);
        }
        int iIndexOf2 = strTrim.indexOf(47);
        return iIndexOf2 > 0 ? strTrim.substring(0, iIndexOf2) : strTrim;
    }

    public static Dialog k1(String str) {
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity != null && !activity.isFinishing()) {
                Dialog dialog = new Dialog(activity);
                dialog.requestWindowFeature(1);
                dialog.setCancelable(false);
                LinearLayout linearLayoutH = H(activity);
                linearLayoutH.addView(AbstractC0583w0.q(activity, "准备下载", str, AbstractC0583w0.c), AbstractC0583w0.c0(AbstractC0583w0.Q(16, activity)));
                LinearLayout linearLayoutG = G(activity);
                linearLayoutG.setOrientation(0);
                linearLayoutG.setGravity(16);
                ProgressBar progressBar = new ProgressBar(activity);
                F1(progressBar);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(AbstractC0583w0.Q(30, activity), AbstractC0583w0.Q(30, activity));
                layoutParams.rightMargin = AbstractC0583w0.Q(12, activity);
                linearLayoutG.addView(progressBar, layoutParams);
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(activity);
                TextUtils.isEmpty("正在获取下载地址...");
                textView.setText("正在获取下载地址...");
                textView.setTextSize(14.0f);
                textView.setTextColor(AbstractC0583w0.g);
                linearLayout.addView(textView);
                TextView textView2 = new TextView(activity);
                textView2.setText(str);
                textView2.setTextSize(12.0f);
                textView2.setTextColor(AbstractC0583w0.h);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout.addView(textView2);
                linearLayoutG.addView(linearLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
                linearLayoutH.addView(linearLayoutG);
                dialog.setContentView(AbstractC0583w0.p0(linearLayoutH));
                dialog.show();
                AbstractC0583w0.l0(dialog, 0.0f);
                return dialog;
            }
            X0.a(TextUtils.isEmpty("正在获取下载地址...") ? "正在准备下载" : "正在获取下载地址...");
            return null;
        } catch (Exception e2) {
            b.D(e2, new StringBuilder("[DownloadDialog] showPreparing error: "));
            return null;
        }
    }

    public static void l(LinearLayout linearLayout, String str) {
        Context context = linearLayout.getContext();
        LinearLayout linearLayoutZ = AbstractC0583w0.z(context, -3104, 8);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(12.0f);
        textView.setTextColor(AbstractC0583w0.e);
        linearLayoutZ.addView(textView);
        linearLayout.addView(linearLayoutZ);
    }

    public static void l0(Context context, File file) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
            }
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.addFlags(1);
            intent.setDataAndType(Uri.fromFile(file), "application/vnd.android.package-archive");
            context.startActivity(intent);
        } catch (Exception e2) {
            SpiderDebug.log("[DownloadDialog] installApk error: " + e2.getMessage());
            b.x(e2, new StringBuilder("安装失败: "));
        }
    }

    public static void l1(int i2, Runnable runnable, String str, String str2) {
        String strY0 = y0(str);
        if (str2 == null || str2.isEmpty()) {
            U(runnable, "二维码内容为空", null);
        } else {
            InitOrigin.execute(new RunnableC0543o(str, strY0, str2, i2, runnable, null, 5));
        }
    }

    public static void m(TreeMap treeMap, HashSet hashSet, JSONObject jSONObject, String str, boolean z, int i2, int i3, String str2, String str3) {
        if (str == null || !str.matches("\\d{4}-\\d{2}-\\d{2}") || str.compareTo(str2) < 0 || str.compareTo(str3) > 0) {
            return;
        }
        if (hashSet.add(jSONObject.optInt("tmdbId") + "|" + str)) {
            List arrayList = (List) treeMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                treeMap.put(str, arrayList);
            }
            arrayList.add(new O1(str, jSONObject, z, i2, i3));
        }
    }

    public static long m0(String str, JSONObject jSONObject) throws JSONException {
        Object obj = jSONObject.get(str);
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return ((Number) obj).longValue();
        }
        throw new IllegalArgumentException("integer required");
    }

    public static void m1(String str, int i2, byte[] bArr, Runnable runnable) {
        String strY0 = y0(str);
        if (bArr == null || bArr.length == 0) {
            U(runnable, "二维码数据为空", null);
        } else {
            InitOrigin.execute(new RunnableC0553q(bArr, str, strY0, i2, runnable));
        }
    }

    public static void n(LinearLayout linearLayout, String str, int i2, String[] strArr, String str2) {
        Context context = linearLayout.getContext();
        LinearLayout linearLayoutY = AbstractC0583w0.y(context);
        AbstractC0583w0.h(linearLayoutY, str);
        if (strArr.length == 0) {
            AbstractC0583w0.k(linearLayoutY, "状态", str2, i2);
        } else {
            for (String str3 : strArr) {
                AbstractC0583w0.k(linearLayoutY, "分类", str3, i2);
            }
        }
        linearLayout.addView(linearLayoutY, AbstractC0583w0.c0(AbstractC0583w0.Q(8, context)));
    }

    public static boolean n0(Callable callable) {
        if (callable != null) {
            try {
                if (!Boolean.TRUE.equals(callable.call())) {
                    return false;
                }
            } catch (Exception unused) {
                return false;
            }
        }
        return true;
    }

    public static void n1() {
        K0("启用播放源", "分类管理各播放源的启用状态", new String[]{"常规播放源", "无限播放源"}, new String[]{i0(false) + " · 原画、智能、秒传", i0(true) + " · 支持转存时优先、无限兜底"}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d}, new Runnable[]{new B3(26), new B3(27)});
    }

    public static void o(ArrayList arrayList, C0256f1 c0256f1, int i2) {
        if (c0256f1.g == null) {
            Map map = c0256f1.a;
            if ((map != null ? map.get("isVip") : null) == null) {
                if ((map != null ? map.get("vip_type") : null) == null) {
                    if ((map != null ? map.get("vipType") : null) == null) {
                        return;
                    }
                }
            }
        }
        String strF = C0256f1.f(c0256f1.g);
        if (TextUtils.isEmpty(strF)) {
            strF = c0256f1.h ? "会员用户" : "普通用户";
        }
        String string = "";
        if (!TextUtils.isEmpty(strF)) {
            StringBuilder sbO = b.o(strF);
            if (c0256f1.h && !TextUtils.isEmpty(c0256f1.i)) {
                string = b.m(new StringBuilder(" (到期:"), c0256f1.i, ")");
            }
            sbO.append(string);
            string = sbO.toString();
        }
        if (string == null || string.isEmpty()) {
            return;
        }
        if (!c0256f1.h) {
            i2 = AbstractC0583w0.h;
        }
        arrayList.add(new C0517i3("会员状态", i2, string, false));
    }

    public static boolean o0(String str) {
        return str == null || str.isEmpty();
    }

    public static void o1() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = C0299u0.X;
        int length = strArr.length;
        String[] strArr2 = new String[length];
        int i2 = 0;
        while (true) {
            int[] iArr = C0299u0.a0;
            if (i2 >= iArr.length) {
                break;
            }
            strArr2[i2] = strArr[iArr[i2]];
            i2++;
        }
        for (int i3 = 0; i3 < length; i3++) {
            arrayList.add(strArr2[i3]);
        }
        InitOrigin.run(new RunnableC0341a(16, arrayList));
    }

    public static void p(Activity activity, LinearLayout linearLayout, String str, int i2) {
        LinearLayout linearLayoutZ = AbstractC0583w0.z(activity, -328966, 8);
        AbstractC0583w0.c(AbstractC0583w0.h, linearLayoutZ, "AI原始输出");
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(11.0f);
        textView.setTextColor(AbstractC0583w0.g);
        textView.setTypeface(Typeface.MONOSPACE);
        textView.setPadding(0, AbstractC0583w0.Q(4, activity), 0, 0);
        linearLayoutZ.addView(textView);
        linearLayout.addView(linearLayoutZ, AbstractC0583w0.c0(i2));
    }

    public static String p0(String str, int i2, int i3) {
        if (o0(str) || str.length() <= i2 + i3 + 2) {
            return str;
        }
        return str.substring(0, i2) + "****" + str.substring(str.length() - i3);
    }

    public static void p1() {
        int i2 = 11;
        j1(AbstractC0302v0.Y0("quark"), AbstractC0302v0.X0("quark"), A0.s().P(), true, "Cookie", new S2(21), new S2(27), new M2(i2), new S(i2), "quark");
    }

    public static void q(ArrayList arrayList, ArrayList arrayList2, String str, String str2, int i2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        arrayList.add(new String[]{str, str2});
        arrayList2.add(Integer.valueOf(i2));
    }

    public static String q0(String str) {
        int length = str == null ? 0 : str.trim().length();
        if (length <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int iMin = Math.min(24, Math.max(8, length / 4));
        for (int i2 = 0; i2 < iMin; i2++) {
            sb.append('*');
        }
        sb.append("  (已隐藏)");
        return sb.toString();
    }

    public static void q1() {
        InitOrigin.run(new W(new String[][]{new String[]{AbstractC0302v0.Y0("quark"), "扫码登录" + AbstractC0302v0.c1("quark") + "账号"}, new String[]{AbstractC0302v0.Y0("uc"), "扫码登录" + AbstractC0302v0.c1("uc") + "账号"}, new String[]{AbstractC0302v0.Y0("ali"), "扫码登录" + AbstractC0302v0.c1("ali") + "账号"}, new String[]{AbstractC0302v0.Y0("tianyi"), "账号密码或扫码登录"}, new String[]{AbstractC0302v0.Y0("xunlei"), "扫码登录" + AbstractC0302v0.c1("xunlei") + "账号"}, new String[]{AbstractC0302v0.Y0("115"), "扫码登录" + AbstractC0302v0.c1("115") + "账号"}, new String[]{AbstractC0302v0.Y0("yidong"), "导入" + AbstractC0302v0.Y0("yidong") + "凭证"}, new String[]{AbstractC0302v0.Y0("baidu"), "扫码登录" + AbstractC0302v0.c1("baidu") + "账号"}, new String[]{AbstractC0302v0.Y0("pan123"), "扫码、账号密码或Token授权"}, new String[]{"哔哩哔哩", "扫码登录哔哩哔哩账号"}, new String[]{AbstractC0302v0.Y0("guangya"), "扫码登录" + AbstractC0302v0.c1("guangya") + "账号"}}, new int[]{AbstractC0302v0.X0("quark"), AbstractC0302v0.X0("uc"), AbstractC0302v0.X0("ali"), AbstractC0302v0.X0("tianyi"), AbstractC0302v0.X0("xunlei"), AbstractC0302v0.X0("115"), AbstractC0302v0.X0("yidong"), AbstractC0302v0.X0("baidu"), AbstractC0302v0.X0("pan123"), AbstractC0583w0.e, AbstractC0302v0.X0("guangya")}, new Runnable[]{new P2(20), new P2(22), new P2(23), new P2(24), new P2(25), new P2(26), new P2(27), new P2(28), new S2(0), new S2(1), new P2(21)}, 12));
    }

    public static void r(Activity activity, LinearLayout linearLayout, K3 k3, K3 k4) {
        View viewF = AbstractC0583w0.F(activity, "测试连接", AbstractC0583w0.d, -1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = AbstractC0583w0.Q(8, activity);
        linearLayout.addView(viewF, layoutParams);
        viewF.setOnClickListener(new com.github.catvod.spider.merge.A.B(k3, k4, 7));
    }

    public static String r0(String str) {
        if (o0(str)) {
            return str;
        }
        String strTrim = str.trim();
        int iIndexOf = strTrim.indexOf(64);
        if (iIndexOf > 0) {
            String strSubstring = strTrim.substring(0, iIndexOf);
            return p0(strSubstring, 2, 1) + strTrim.substring(iIndexOf);
        }
        if (!strTrim.matches("\\d{7,}")) {
            return (strTrim.length() <= 14 || !strTrim.matches("[A-Za-z0-9._-]+")) ? strTrim : p0(strTrim, 4, 4);
        }
        if (strTrim.length() < 11) {
            return p0(strTrim, 2, 2);
        }
        return strTrim.substring(0, 3) + "****" + strTrim.substring(strTrim.length() - 4);
    }

    public static void r1(int i2, String str, String str2, String str3, String str4, String str5) {
        J0(str, "扫码在手机上输入".concat(str4), str2, str3 + "," + str4 + "," + str5, i2);
    }

    public static void s(String str, String str2, ArrayList arrayList) {
        if (str2 == null || str2.isEmpty()) {
            return;
        }
        arrayList.add(new C0517i3(str, AbstractC0583w0.h, str2, false));
    }

    public static String[][] s0(String[][] strArr, String[] strArr2) {
        int i2 = 0;
        String[][] strArr3 = (String[][]) Array.newInstance((Class<?>) String.class, strArr.length + strArr2.length, 2);
        int length = strArr.length;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            strArr3[i4] = strArr[i3];
            i3++;
            i4++;
        }
        int length2 = strArr2.length;
        while (i2 < length2) {
            String str = strArr2[i2];
            strArr3[i4] = new String[]{"自定义 " + k0(str), str};
            i2++;
            i4++;
        }
        return strArr3;
    }

    public static void s1(int i2, long j2, String str, boolean z) {
        Activity activity;
        String str2;
        try {
            activity = InitOrigin.getActivity();
        } catch (Exception unused) {
            activity = null;
        }
        if (activity == null) {
            return;
        }
        int i3 = z ? AbstractC0583w0.d : AbstractC0583w0.e;
        String str3 = z ? "模型连接成功" : "模型连接失败";
        if (z) {
            str2 = j2 + "ms";
        } else {
            str2 = "请检查当前填写的配置";
        }
        AbstractC0583w0.j0(AbstractC0583w0.r(activity, str3, str2, z ? i2 : i3, new String[][]{new String[]{z ? "回复" : "原因", str}}, new int[]{i3}, new String[]{"关闭"}, new Runnable[]{null}));
    }

    public static String t(String[][] strArr, String str, boolean z) {
        String strTrim = str == null ? "" : str.trim();
        for (String[] strArr2 : strArr) {
            if (strTrim.equals(strArr2[1])) {
                return strArr2[0];
            }
        }
        String strK0 = k0(strTrim);
        if (strK0.isEmpty()) {
            return z ? "图片线路" : "API线路";
        }
        StringBuilder sbP = b.p(strK0, " · ");
        sbP.append(z ? "图片" : "API");
        return sbP.toString();
    }

    public static TextView t0(Activity activity, String str, String str2) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(26.0f);
        textView.setTextColor(-16747385);
        textView.setGravity(17);
        textView.setFocusable(true);
        textView.setClickable(true);
        textView.setContentDescription(str2);
        textView.setTag(str2);
        textView.setBackground(AbstractC0583w0.G(activity, 0, AbstractC0583w0.k, 10, 2, -16747385));
        return textView;
    }

    public static void t1(String str, String str2) {
        int[] iArr = n;
        int iF = C0299u0.F(str);
        char c2 = 2;
        String[][] strArr = {new String[]{"#43A047", "#E8F5E9", "稳定"}, new String[]{"#1976D2", "#E3F2FD", "稳定"}, new String[]{"#FF9800", "#FFF8E1", "适中"}, new String[]{"#F57C00", "#FFF3E0", "较快"}, new String[]{"#E53935", "#FFEBEE", "高速"}, new String[]{"#C62828", "#FFCDD2", "极速"}};
        String[][] strArr2 = (String[][]) Array.newInstance((Class<?>) String.class, 7, 4);
        int[] iArr2 = new int[strArr2.length];
        int i2 = 0;
        boolean z = false;
        while (true) {
            String str3 = "● 当前";
            if (i2 >= 6) {
                break;
            }
            boolean z2 = iArr[i2] == iF;
            z |= z2;
            if (!z2) {
                str3 = strArr[i2][c2];
            }
            String strL = b.l(new StringBuilder(), iArr[i2], "线程");
            String[] strArr3 = strArr[i2];
            strArr2[i2] = new String[]{strL, str3, strArr3[0], strArr3[1]};
            iArr2[i2] = iArr[i2];
            i2++;
            c2 = 2;
        }
        strArr2[6] = new String[]{"自定义线程数", z ? "确认后手动填写" : b.h("● 当前", iF, "线程，确认后修改"), "#607D8B", "#ECEFF1"};
        iArr2[6] = z ? -1 : iF;
        InitOrigin.run(new T(str2, strArr2, iArr2, iF, new O2(str, 5, str2), new N3(iArr, str, str2, iF)));
    }

    public static String u(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("status");
        strOptString.getClass();
        switch (strOptString) {
            case "resolving":
                return "正在验证作品";
            case "failed":
                return jSONObject.optInt("count") > 0 ? "更新失败 · 继续使用旧结果" : "更新失败";
            case "pending":
                return "等待生成";
            case "ready":
                return "已更新 · " + jSONObject.optInt("count") + "部";
            case "stale":
                return "等待更新";
            case "loading":
                return "正在生成";
            case "discovered":
                return "等待验证";
            default:
                return "尚未生成";
        }
    }

    public static String u0(String str) {
        int iIndexOf;
        if (str == null) {
            return "";
        }
        String strTrim = str.trim();
        if (strTrim.isEmpty()) {
            return "";
        }
        if (strTrim.startsWith("{")) {
            try {
                return u0(new JSONObject(strTrim).optString("cookie", ""));
            } catch (Exception unused) {
            }
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : strTrim.replace("\r", "\n").split("\n")) {
            String strD1 = D1(str2.trim());
            if (!strD1.equals(str2.trim())) {
                if (sb.length() > 0) {
                    sb.append("; ");
                }
                sb.append(strD1);
            }
        }
        String string = sb.length() > 0 ? sb.toString() : D1(strTrim.trim());
        String[] strArrSplit = string.replace("\r", "\n").replace("\n", "; ").split(";");
        StringBuilder sb2 = new StringBuilder();
        for (String str3 : strArrSplit) {
            String strD2 = D1(str3.trim());
            if (!strD2.isEmpty() && (iIndexOf = strD2.indexOf(61)) > 0) {
                String strTrim2 = strD2.substring(0, iIndexOf).trim();
                String strTrim3 = strD2.substring(iIndexOf + 1).trim();
                if (!strTrim2.isEmpty()) {
                    String lowerCase = strTrim2.toLowerCase();
                    if (!lowerCase.equals("path") && !lowerCase.equals("domain") && !lowerCase.equals("expires") && !lowerCase.equals("max-age") && !lowerCase.equals("samesite") && !lowerCase.equals("secure") && !lowerCase.equals("httponly") && !lowerCase.equals("priority")) {
                        if (sb2.length() > 0) {
                            sb2.append("; ");
                        }
                        sb2.append(strTrim2);
                        sb2.append("=");
                        sb2.append(strTrim3);
                    }
                }
            }
        }
        return sb2.length() > 0 ? sb2.toString() : string.trim();
    }

    /* JADX WARN: Type inference failed for: r11v1, types: [java.io.Serializable, java.lang.String[][]] */
    public static void u1(String[] strArr, String[] strArr2, String[] strArr3, String str, String str2) {
        if (strArr == null || strArr2 == null || strArr3 == null || strArr.length == 0) {
            return;
        }
        if (strArr.length == 1) {
            t1(strArr[0], strArr3[0]);
            return;
        }
        String[][] strArr4 = {new String[]{"#43A047", "#E8F5E9"}, new String[]{"#2E7D32", "#C8E6C9"}, new String[]{"#FF9800", "#FFF8E1"}, new String[]{"#F57C00", "#FFE0B2"}, new String[]{"#00BCD4", "#E0F7FA"}, new String[]{"#1976D2", "#E3F2FD"}, new String[]{"#9C27B0", "#F3E5F5"}, new String[]{"#1565C0", "#E3F2FD"}, new String[]{"#E91E63", "#FCE4EC"}, new String[]{"#607D8B", "#ECEFF1"}};
        ?? r11 = (String[][]) Array.newInstance((Class<?>) String.class, strArr.length, 6);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String[] strArr5 = strArr4[i2 % 10];
            r11[i2] = new String[]{strArr2[i2], C0299u0.F(strArr[i2]) + "线程", strArr5[0], strArr5[1], strArr[i2], strArr3[i2]};
        }
        InitOrigin.run(new RunnableC0466s(str, (Serializable) str2, (Serializable) r11, (Object) new M2(12), (Object) new RunnableC0242b(strArr, str, 29), 11));
    }

    public static void v(String str, String str2, EditText editText, Runnable runnable) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        H0 h0 = H0.a;
        P p2 = new P(editText, (Object) str2, 3);
        h0.getClass();
        H0.f(str, p2);
        if (runnable != null) {
            C0542n3 c0542n3 = new C0542n3(runnable, 0);
            if (str != null) {
                H0.d.put(str, c0542n3);
            }
        }
    }

    public static String v0(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            String[] strArr = {"scope", "challenge_id", "width", "height", "size", "max_x", "piece_y", "motion", "curve", "bg", "piece"};
            for (int i2 = 0; i2 < 11; i2++) {
                String str2 = strArr[i2];
                if (jSONObject.has(str2)) {
                    jSONObject2.put(str2, jSONObject.get(str2));
                }
            }
            return b.m(new StringBuilder("<!doctype html><html lang=\"zh-CN\"><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width,initial-scale=1\"><meta name=\"referrer\" content=\"no-referrer\"><meta http-equiv=\"Content-Security-Policy\" content=\"default-src 'none'; img-src data:; script-src 'unsafe-inline'; style-src 'unsafe-inline'; connect-src 'self'; base-uri 'none'; form-action 'none'\"><title>番薯人工验证</title><style>body{font:16px sans-serif;color:#182230;margin:12px;background:#fff}#stage{position:relative;max-width:520px;overflow:hidden;margin:0 auto}#bg{width:100%;display:block}#piece{position:absolute;top:0;left:0;pointer-events:none}input{width:100%;min-height:44px}button{padding:10px;margin:4px}button:disabled{opacity:.4}#status{min-height:24px}</style></head><body><p>拖动滑块对齐图案，也可使用方向键。确认后请等待设备上的结果。</p><div id=\"stage\"><img id=\"bg\" alt=\"验证背景\"><img id=\"piece\" alt=\"待对齐拼图\"></div><label for=\"slider\">滑块位置</label><input type=\"range\" id=\"slider\" min=\"0\" max=\"10000\" step=\"1\" value=\"0\"><div id=\"status\" role=\"status\" aria-live=\"polite\">等待操作</div><button id=\"submit\" disabled>确认</button><button id=\"refresh\">换一张</button><button id=\"cancel\">取消</button><script>"), "const C=CHALLENGE,SID=SESSION,$=id=>document.getElementById(id);\nlet points=[],elapsed=0,started=null,closed=false;\nconst roundAway=x=>{const n=Math.trunc(x),f=x-n;return n+(f>=.5?1:f<=-.5?-1:0);};\nfunction geometry(u){const q=C.curve;if(C.motion==='arc'&&q){const a=1-u,b=[a*a*a,3*a*a*u,3*a*u*u,u*u*u];return {x:b[0]*q.start_x+b[1]*q.control1_x+b[2]*q.control2_x+b[3]*q.end_x,y:b[0]*q.start_y+b[1]*q.control1_y+b[2]*q.control2_y+b[3]*q.end_y};}return {x:u*C.max_x,y:C.piece_y};}\nfunction draw(){const p=geometry(Number($('slider').value)/10000),scale=$('stage').clientWidth/C.width;$('piece').style.width=C.size*scale+'px';$('piece').style.transform=`translate(${p.x*scale}px,${p.y*scale}px)`;}\nfunction record(force){if(started===null||closed)return;const u=Number($('slider').value)/10000,p=geometry(u),next={x:roundAway(u*C.max_x),y:roundAway(p.y),t:Math.floor(elapsed+performance.now()-started)},last=points[points.length-1];if(!force&&last&&last.x===next.x&&last.y===next.y)return;points.push(next);if(points.length>96){let best=Infinity,index=1;for(let i=1;i<points.length-1;i++){const a=points[i-1],b=points[i],c=points[i+1],dt=c.t-a.t,w=dt>0?(b.t-a.t)/dt:.5,dx=b.x-(a.x+(c.x-a.x)*w),dy=b.y-(a.y+(c.y-a.y)*w),score=dx*dx+dy*dy+((b.x-a.x)*(c.x-b.x)<0?1e9:0);if(score<best){best=score;index=i;}}points.splice(index,1);}$('status').textContent='已记录 '+points.length+' 个操作点';}\nfunction begin(e){if(!e.isTrusted||started!==null||closed)return;started=performance.now();$('submit').disabled=true;record(false);}\nfunction end(e){if(!e.isTrusted||started===null)return;record(true);elapsed+=performance.now()-started;started=null;const last=points[points.length-1];$('submit').disabled=closed||points.length<2||!last||last.x<=1;}\n$('slider').addEventListener('pointerdown',begin);window.addEventListener('pointerup',end);\n$('slider').addEventListener('keydown',e=>{if(['ArrowLeft','ArrowRight','ArrowUp','ArrowDown','Home','End','PageUp','PageDown'].includes(e.key))begin(e);});$('slider').addEventListener('keyup',end);\n$('slider').addEventListener('input',e=>{draw();if(e.isTrusted)record(false);});\n$('slider').addEventListener('pointercancel',()=>{if(started!==null){elapsed+=performance.now()-started;started=null;}$('submit').disabled=true;});\nasync function finish(action){if(closed)return;if(action==='CONFIRM'&&(started!==null||points.length<2||points[points.length-1].x<=1))return;closed=true;for(const el of document.querySelectorAll('button,input'))el.disabled=true;const answer={action,scope:C.scope,challenge_id:C.challenge_id};if(action==='CONFIRM'){answer.x=points[points.length-1].x;answer.points=points;}const raw=JSON.stringify(answer);try{if(window.FanShuInput){window.FanShuInput.submit(raw);}else{const r=await fetch('/proxy?do=config&action=push&sid='+encodeURIComponent(SID)+'&key=slider_result&value='+encodeURIComponent(raw),{cache:'no-store'});if(!r.ok)throw Error('transport');const data=await r.json();if(data.success!==true)throw Error('expired');}$('status').textContent='已回传，请在设备上查看验证结果';}catch(e){$('status').textContent='回传未确认，请在设备上重新打开验证';}}\n$('submit').onclick=()=>finish('CONFIRM');$('refresh').onclick=()=>finish('REFRESH');$('cancel').onclick=()=>finish('CANCEL');\n$('bg').onload=draw;window.addEventListener('resize',draw);$('bg').src='data:image/png;base64,'+C.bg;$('piece').src='data:image/png;base64,'+C.piece;draw();\n".replace("SESSION", JSONObject.quote(str).replace("<", "\\u003c")).replace("CHALLENGE", jSONObject2.toString().replace("<", "\\u003c")), "</script></body></html>");
        } catch (Exception e2) {
            throw new IllegalArgumentException("challenge invalid", e2);
        }
    }

    public static void v1() {
        int iX0 = AbstractC0302v0.X0("tianyi");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0477a3(AbstractC0583w0.d, new P2(19), "扫码登录", "推荐 - 使用天翼云盘APP扫码"));
        arrayList.add(new C0477a3(AbstractC0583w0.h, new P2(29), "账号密码登录", "输入手机号和密码"));
        arrayList.add(new C0477a3(-29696, new S2(8), "短信验证码登录", "推荐 - 无需图形验证码"));
        d1(iX0, new S2(14), AbstractC0302v0.Y0("tianyi"), "使用APP扫码或账号密码登录", "tianyi", arrayList, Q0.f().s());
    }

    public static void w(String str, String[] strArr, EditText[] editTextArr, Runnable runnable) throws Throwable {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        H0 h0 = H0.a;
        P p2 = new P(strArr, editTextArr, 4);
        h0.getClass();
        H0.f(str, p2);
        if (TextUtils.isEmpty(str) || runnable == null) {
            return;
        }
        C0542n3 c0542n3 = new C0542n3(runnable, 1);
        h0.getClass();
        if (str != null) {
            H0.d.put(str, c0542n3);
        }
    }

    public static void w0(int i2) {
        if (i2 != h || b == null) {
            return;
        }
        JSONObject jSONObjectA = AbstractC0251e.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jSONObjectA.optLong("successAt") > c) {
            C0568t0 c0568t0 = b;
            c0568t0.b.post(new RunnableC0554q0(c0568t0, new T1(i2, 7), 2));
            return;
        }
        String strOptString = jSONObjectA.optString("status");
        long j2 = jCurrentTimeMillis - d;
        if ("failed".equals(strOptString) && (jSONObjectA.optLong("failureAt") >= d || j2 >= 1500)) {
            b.b(new T1(i2, 8));
            return;
        }
        if (("ready".equals(strOptString) || "idle".equals(strOptString)) && j2 >= 1500) {
            b.b(new T1(i2, 9));
        } else if (j2 >= 180000) {
            b.b(new T1(i2, 10));
        } else {
            InitOrigin.run(new T1(i2, 11), 500);
        }
    }

    public static void w1() {
        String strY0 = AbstractC0302v0.Y0("uc");
        int iX0 = AbstractC0302v0.X0("uc");
        Z0.t().getClass();
        j1(strY0, iX0, Z0.N(), true, "Cookie", new S(15), new S(21), new M2(0), new S(26), "uc");
    }

    public static void x(TextView textView, String str, String str2, String str3, String str4, String str5, int i2, EditText editText, Runnable runnable) throws Throwable {
        if (textView != null) {
            textView.setOnClickListener(new ViewOnClickListenerC0598z0(str, str2, str3, str4, str5, i2, 1));
        }
        v(str2, str3, editText, runnable);
    }

    public static com.github.catvod.spider.merge.S.a x0(JSONObject jSONObject) {
        ArrayList arrayList;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("popup");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("pages");
        int i2 = 1;
        if (jSONArrayOptJSONArray != null) {
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray.length() && i3 < 8) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2 == null ? null : jSONObjectOptJSONObject2.optJSONArray("blocks");
                if (jSONArrayOptJSONArray2 != null) {
                    C0590x2 c0590x2 = new C0590x2();
                    int i4 = 0;
                    while (true) {
                        int length = jSONArrayOptJSONArray2.length();
                        arrayList = c0590x2.a;
                        if (i4 >= length || i4 >= 24) {
                            break;
                        }
                        JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i4);
                        if (jSONObjectOptJSONObject3 != null) {
                            String strOptString = jSONObjectOptJSONObject3.optString("type", "text");
                            if ("image".equals(strOptString)) {
                                String strOptString2 = jSONObjectOptJSONObject3.optString("url", "");
                                if (!strOptString2.isEmpty()) {
                                    arrayList.add(new C0585w2(i2, "", strOptString2, jSONObjectOptJSONObject3.optString("image_sha256", jSONObjectOptJSONObject3.optString("sha256", ""))));
                                }
                            } else if ("divider".equals(strOptString)) {
                                arrayList.add(new C0585w2(2, "", "", ""));
                            } else if ("text".equals(strOptString)) {
                                String strOptString3 = jSONObjectOptJSONObject3.optString("text", "");
                                if (!strOptString3.isEmpty()) {
                                    arrayList.add(new C0585w2(0, strOptString3, "", ""));
                                }
                            }
                        }
                        i4++;
                        i2 = 1;
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList2.add(c0590x2);
                    }
                }
                i3++;
                i2 = 1;
            }
        }
        if (arrayList2.isEmpty()) {
            C0590x2 c0590x3 = new C0590x2();
            String strOptString4 = jSONObjectOptJSONObject.optString("image", "");
            boolean zIsEmpty = strOptString4.isEmpty();
            ArrayList arrayList3 = c0590x3.a;
            if (!zIsEmpty) {
                arrayList3.add(new C0585w2(1, "", strOptString4, jSONObjectOptJSONObject.optString("image_sha256", "")));
            }
            String strOptString5 = jSONObjectOptJSONObject.optString("content", jSONObject.optString("message", ""));
            if (!strOptString5.isEmpty()) {
                arrayList3.add(new C0585w2(0, strOptString5, "", ""));
            }
            arrayList2.add(c0590x3);
        }
        return new com.github.catvod.spider.merge.S.a(jSONObject.optString("title", ""), jSONObjectOptJSONObject.optString("button", "知道了"), jSONObjectOptJSONObject.optString("titleColor", jSONObjectOptJSONObject.optString("title_color", "")), jSONObjectOptJSONObject.optString("buttonColor", jSONObjectOptJSONObject.optString("button_color", "")), arrayList2);
    }

    public static void x1(Activity activity, String str) throws Throwable {
        int i2 = 1;
        int i3 = 4;
        try {
            int iQ = AbstractC0583w0.Q(8, activity);
            int iQ2 = AbstractC0583w0.Q(10, activity);
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            linearLayoutK.addView(AbstractC0583w0.H(activity, "配置备份", "首次配置 · 导入已有配置或手动创建连接", -11896091), AbstractC0583w0.c0(iQ));
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(0);
            int i4 = AbstractC0583w0.c;
            LinearLayout linearLayoutW = AbstractC0583w0.w(activity, "扫码导入", "导入已有分享配置", i4);
            linearLayoutW.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayoutW.setOnClickListener(new Z(str, i3));
            linearLayout.addView(linearLayoutW);
            View view = new View(activity);
            view.setLayoutParams(new LinearLayout.LayoutParams(iQ, 1));
            linearLayout.addView(view);
            int i5 = AbstractC0583w0.d;
            LinearLayout linearLayoutW2 = AbstractC0583w0.w(activity, "手动配置", "新建 WebDAV 连接", i5);
            linearLayoutW2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            linearLayoutW2.setOnClickListener(new N2(i2));
            linearLayout.addView(linearLayoutW2);
            linearLayoutK.addView(linearLayout, AbstractC0583w0.c0(iQ));
            LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
            AbstractC0583w0.c(AbstractC0583w0.g, linearLayoutY, "粘贴分享配置");
            TextView textView = new TextView(activity);
            textView.setText("已有 moyu_webdav: 开头的分享配置时，可直接粘贴导入");
            textView.setTextSize(11.0f);
            textView.setTextColor(AbstractC0583w0.h);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = iQ;
            linearLayoutY.addView(textView, layoutParams);
            EditText editTextF = AbstractC0583w0.f(linearLayoutY, "粘贴 moyu_webdav: 开头的配置文本", "", false);
            TextView textViewF = AbstractC0583w0.F(activity, "确认导入", i5, -1);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.topMargin = iQ2;
            linearLayoutY.addView(textViewF, layoutParams2);
            linearLayoutK.addView(linearLayoutY, AbstractC0583w0.c0(iQ));
            linearLayoutK.addView(L(activity, "使用说明", new String[][]{new String[]{"导入", "扫码或粘贴已有分享配置"}, new String[]{"配置", "手动新建 WebDAV 连接"}, new String[]{"恢复", "导入后自动恢复云端配置"}, new String[]{"备份", "配置完成后可进行首次备份"}}, new int[]{i4, i5, AbstractC0583w0.f, -16728876}));
            RunnableC0242b runnableC0242b = new RunnableC0242b(editTextF, new AlertDialog[]{alertDialogCreate}, 26);
            textViewF.setOnClickListener(new ViewOnClickListenerC0470w(runnableC0242b, 6));
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setNeutralButton("使用教程", new DialogInterfaceOnClickListenerC0454f(7)).setNegativeButton("返回", new DialogInterfaceOnClickListenerC0454f(8)).setOnCancelListener(new H2(2)).setCancelable(true).create();
            v(str, "config", editTextF, runnableC0242b);
            alertDialogCreate.setOnDismissListener(new DialogInterfaceOnDismissListenerC0472y(str, i3));
            alertDialogCreate.show();
            AbstractC0583w0.l0(alertDialogCreate, 0.0f);
        } catch (Exception e2) {
            b.x(e2, new StringBuilder("显示失败: "));
        }
    }

    public static AlertDialog y(Activity activity, JSONObject jSONObject) {
        int iQ = AbstractC0583w0.Q(6, activity);
        int iQ2 = AbstractC0583w0.Q(8, activity);
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        linearLayoutK.addView(AbstractC0583w0.q(activity, "我的口味画像", E(58, jSONObject.optString("summary")), -16732991), AbstractC0583w0.c0(iQ2));
        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("tasteTags");
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; jSONArrayOptJSONArray != null && i2 < jSONArrayOptJSONArray.length(); i2++) {
            String strTrim = jSONArrayOptJSONArray.optString(i2).trim();
            if (!strTrim.isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(" · ");
                }
                sb.append(strTrim);
            }
        }
        h(linearLayoutY, "偏好标签", sb.length() == 0 ? "暂无" : sb.toString(), AbstractC0583w0.d, iQ);
        h(linearLayoutY, "口味倾向", E(96, jSONObject.optString("preferences")), AbstractC0583w0.f, iQ);
        h(linearLayoutY, "观影性格 · 仅供参考", E(96, jSONObject.optString("personality")), -8708190, iQ);
        linearLayoutK.addView(linearLayoutY);
        return new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("重新生成", new DialogInterfaceOnClickListenerC0454f(11)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create();
    }

    public static String y0(String str) {
        String strTrim = str == null ? "" : str.trim();
        if (strTrim.isEmpty()) {
            return "打开APP扫一扫";
        }
        if ("UC智能画质授权".equals(strTrim)) {
            return "请使用 UC网盘 APP 扫码授权智能画质";
        }
        return "123 Open授权".equals(strTrim) ? "手机扫码后登录123并允许授权" : b.j("请使用 ", strTrim, " 扫码");
    }

    public static void y1(AlertDialog alertDialog, Runnable runnable) {
        AbstractC0583w0.j0(alertDialog);
        Button button = alertDialog.getButton(-3);
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC0470w(runnable, 10));
        }
    }

    public static TreeMap z(String str, JSONArray jSONArray) {
        TreeMap treeMap = new TreeMap();
        HashSet hashSet = new HashSet();
        int iMax = Math.max(0, 30);
        Calendar calendarN = N(str);
        calendarN.add(5, iMax);
        String str2 = new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(calendarN.getTime());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i2);
            if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("tmdbId") > 0) {
                m(treeMap, hashSet, jSONObjectOptJSONObject, jSONObjectOptJSONObject.optString("lastAirDate"), true, jSONObjectOptJSONObject.optInt("lastSeason"), jSONObjectOptJSONObject.optInt("lastEpisode"), str, str2);
                m(treeMap, hashSet, jSONObjectOptJSONObject, jSONObjectOptJSONObject.optString("nextAirDate"), false, jSONObjectOptJSONObject.optInt("nextSeason"), jSONObjectOptJSONObject.optInt("nextEpisode"), str, str2);
                int i3 = 0;
                for (JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("schedule"); jSONArrayOptJSONArray != null && i3 < jSONArrayOptJSONArray.length(); jSONArrayOptJSONArray = jSONArrayOptJSONArray) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i3);
                    if (jSONObjectOptJSONObject2 != null) {
                        m(treeMap, hashSet, jSONObjectOptJSONObject, jSONObjectOptJSONObject2.optString("date"), false, jSONObjectOptJSONObject2.optInt("season"), jSONObjectOptJSONObject2.optInt("episode"), str, str2);
                    }
                    i3++;
                }
            }
        }
        Iterator it = treeMap.values().iterator();
        while (it.hasNext()) {
            Collections.sort((List) it.next(), new L(3));
        }
        return treeMap;
    }

    public static boolean z0() {
        synchronized (AbstractC0251e.a) {
            try {
                JSONObject jSONObjectH = AbstractC0251e.H();
                try {
                    JSONObject jSONObjectD = AbstractC0251e.D(jSONObjectH.optInt("revision", 0), jSONObjectH.optJSONObject("ai"));
                    jSONObjectD.put("refreshGeneration", jSONObjectD.optInt("refreshGeneration", 0) + 1);
                    jSONObjectD.put("stale", true);
                    jSONObjectD.put("status", jSONObjectD.optJSONArray("resolvedItems").length() > 0 ? "stale" : "pending");
                    jSONObjectD.put("requestedAt", System.currentTimeMillis());
                    jSONObjectD.put("requestKey", "");
                    jSONObjectD.put("lastError", "");
                    jSONObjectH.put("ai", jSONObjectD);
                    AbstractC0251e.V(jSONObjectH);
                } catch (Exception unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return PianDan.refreshAiNow();
    }

    public static void z1() {
        int iX0 = AbstractC0302v0.X0("xunlei");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0477a3(AbstractC0583w0.d, new S2(2), "扫码登录", "推荐 - 使用迅雷APP扫码"));
        arrayList.add(new C0477a3(AbstractC0583w0.h, new S2(3), "手动输入Token", "粘贴或扫码填入Token JSON"));
        d1(iX0, new S2(4), AbstractC0302v0.Y0("xunlei"), "使用迅雷APP扫码或Token登录", "xunlei", arrayList, l1.I().Z());
    }
}
