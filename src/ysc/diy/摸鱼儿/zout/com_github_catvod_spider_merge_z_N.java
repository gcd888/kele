package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0239a;
import com.github.catvod.spider.merge.A.C0253e1;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.f0.i;
import com.github.catvod.spider.merge.p018v.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0538n {
    public static final int[] a = {Color.parseColor("#FF6A00"), Color.parseColor("#FF5522"), Color.parseColor("#111111"), Color.parseColor("#FF4906"), Color.parseColor("#00A1D6")};

    public C0538n(String[][] strArr) {
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0099  */
    /* JADX WARN: Code duplicated, block: B:27:0x009c  */
    public static void a(Activity activity, LinearLayout linearLayout, ArrayList arrayList, String str, String str2, int i, C0239a c0239a) {
        boolean z;
        boolean z2;
        if (arrayList.isEmpty()) {
            linearLayout.addView(AbstractC0583w0.D(activity, "无匹配分类"));
            return;
        }
        boolean[] zArr = new boolean[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str3 = ((String[]) arrayList.get(i2))[0];
            String str4 = ((String[]) arrayList.get(i2))[1];
            String str5 = ((String[]) arrayList.get(i2))[2];
            String str6 = ((String[]) arrayList.get(i2))[3];
            c0239a.getClass();
            if (str4 != null) {
                try {
                    JSONArray jSONArrayK = C0239a.k();
                    StringBuilder sb = new StringBuilder();
                    try {
                        sb.append(str);
                        sb.append("_");
                        sb.append(str3);
                        sb.append("_");
                        sb.append(str4);
                        String string = sb.toString();
                        int i3 = 0;
                        while (true) {
                            if (i3 < jSONArrayK.length()) {
                                if (string.equals(jSONArrayK.getJSONObject(i3).optString("key"))) {
                                    z = true;
                                    break;
                                }
                                i3++;
                            }
                        }
                    } catch (Exception unused) {
                    }
                } catch (Exception unused2) {
                }
                zArr[i2] = z;
                if (i2 > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                AbstractC0583w0.m(linearLayout, str6, str5, i, z, i2, z2, null, zArr, new C0498f(c0239a, str, str3, str4, str5, str6, str2, 1));
            }
            z = false;
            zArr[i2] = z;
            if (i2 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            AbstractC0583w0.m(linearLayout, str6, str5, i, z, i2, z2, null, zArr, new C0498f(c0239a, str, str3, str4, str5, str6, str2, 1));
        }
    }

    public static LinearLayout c(Activity activity, LinearLayout linearLayout) {
        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
        C0533m c0533m = new C0533m(activity, (int) (activity.getResources().getDisplayMetrics().heightPixels * 0.4f), 0);
        c0533m.setFocusable(false);
        c0533m.setFocusableInTouchMode(false);
        c0533m.setDescendantFocusability(262144);
        linearLayout.setDescendantFocusability(262144);
        c0533m.addView(linearLayout);
        AbstractC0583w0.o(c0533m, linearLayout);
        linearLayoutY.addView(c0533m);
        return linearLayoutY;
    }

    public static String d(long j) {
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        if (jCurrentTimeMillis < 60000) {
            return "刚刚";
        }
        if (jCurrentTimeMillis < 3600000) {
            return (jCurrentTimeMillis / 60000) + "分钟前";
        }
        if (jCurrentTimeMillis < 86400000) {
            return (jCurrentTimeMillis / 3600000) + "小时前";
        }
        if (jCurrentTimeMillis >= 2592000000L) {
            return new SimpleDateFormat("MM-dd", Locale.getDefault()).format(new Date(j));
        }
        return (jCurrentTimeMillis / 86400000) + "天前";
    }

    public static int e(String str) {
        str.getClass();
        switch (str) {
            case "douyin":
                return Color.parseColor("#222222");
            case "huya":
                return Color.parseColor("#FFB800");
            case "douyu":
                return Color.parseColor("#1E7CE6");
            case "bilibili":
                return Color.parseColor("#FB7299");
            case "kuaishou":
                return Color.parseColor("#FF6900");
            default:
                return Color.parseColor("#999999");
        }
    }

    public static String k(int i, String str) {
        if (str == null) {
            return "";
        }
        if (str.length() <= i) {
            return str;
        }
        return str.substring(0, i) + "...";
    }

    public final void b(LinearLayout linearLayout, JSONArray jSONArray) {
        int i;
        boolean[] zArr;
        String string;
        String str;
        C0239a c0239aE = C0239a.e();
        int iMin = Math.min(jSONArray.length(), 50);
        boolean[] zArr2 = new boolean[iMin];
        int i2 = 0;
        while (i2 < iMin) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                String strOptString = jSONObject.optString("site");
                String strOptString2 = jSONObject.optString("roomId");
                String strOptString3 = jSONObject.optString("userName", "");
                String strOptString4 = jSONObject.optString("title", "");
                String strOptString5 = jSONObject.optString("cover", "");
                int iE = e(strOptString);
                StringBuilder sb = new StringBuilder();
                sb.append(f(strOptString));
                sb.append(" · ");
                sb.append(strOptString3.isEmpty() ? "主播" : strOptString3);
                String strK = k(20, sb.toString());
                String strK2 = k(24, strOptString4);
                long jOptLong = jSONObject.optLong("time", 0L);
                if (jOptLong > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(d(jOptLong));
                    if (strK2.isEmpty()) {
                        str = "";
                    } else {
                        str = " · " + strK2;
                    }
                    sb2.append(str);
                    string = sb2.toString();
                } else {
                    string = strK2;
                }
                c0239aE.getClass();
                boolean zH = C0239a.h(strOptString, strOptString2);
                zArr2[i2] = zH;
                boolean z = i2 > 0;
                C0253e1 c0253e1 = new C0253e1(c0239aE, strOptString, strOptString2, strOptString3, strOptString5, strOptString4);
                i = i2;
                zArr = zArr2;
                try {
                    AbstractC0583w0.m(linearLayout, strK, string, iE, zH, i, z, null, zArr, c0253e1);
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                i = i2;
                zArr = zArr2;
            }
            i2 = i + 1;
            zArr2 = zArr;
        }
    }

    public final String f(String str) {
        String[][] strArr = b.a;
        for (int i = 0; i < 5; i++) {
            String[] strArr2 = strArr[i];
            if (strArr2[0].equals(str)) {
                return strArr2[1];
            }
        }
        return str;
    }

    public final void g(final i iVar) {
        final int i = 2;
        final int i2 = 1;
        final int i3 = 0;
        C0239a c0239aE = C0239a.e();
        StringBuilder sb = new StringBuilder("已收藏 ");
        c0239aE.getClass();
        sb.append(C0239a.k().length());
        sb.append(" 个分类");
        P1.K0("分类管理", "选择要管理的分类功能", new String[]{"添加分类", "收藏管理", "排序管理"}, new String[]{"选择平台，通过开关收藏分类", sb.toString(), "调整已收藏分类的显示顺序"}, new int[]{AbstractC0583w0.c, AbstractC0583w0.d, AbstractC0583w0.f}, new Runnable[]{new Runnable(this) { // from class: com.github.catvod.spider.merge.z.b
            public final /* synthetic */ C0538n b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i4;
                boolean[] zArr;
                LinearLayout linearLayout;
                switch (i3) {
                    case 0:
                        this.b.j(iVar);
                        break;
                    case 1:
                        i iVar2 = iVar;
                        C0538n c0538n = this.b;
                        c0538n.getClass();
                        try {
                            Activity activity = InitOrigin.getActivity();
                            if (activity != null) {
                                C0239a c0239aE2 = C0239a.e();
                                c0239aE2.getClass();
                                JSONArray jSONArrayK = C0239a.k();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(AbstractC0583w0.p(activity, "收藏管理", "关闭开关即取消收藏"), layoutParams);
                                if (jSONArrayK.length() == 0) {
                                    linearLayoutK.addView(AbstractC0583w0.D(activity, "暂无收藏分类"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity);
                                    linearLayout2.setOrientation(1);
                                    boolean[] zArr2 = new boolean[jSONArrayK.length()];
                                    Arrays.fill(zArr2, true);
                                    int i5 = 0;
                                    while (i5 < jSONArrayK.length()) {
                                        JSONObject jSONObjectOptJSONObject = jSONArrayK.optJSONObject(i5);
                                        if (jSONObjectOptJSONObject == null) {
                                            i4 = i5;
                                            zArr = zArr2;
                                            linearLayout = linearLayout2;
                                        } else {
                                            String strOptString = jSONObjectOptJSONObject.optString("site");
                                            String strOptString2 = jSONObjectOptJSONObject.optString("parentId");
                                            String strOptString3 = jSONObjectOptJSONObject.optString("catId");
                                            String strOptString4 = jSONObjectOptJSONObject.optString("catName");
                                            String strOptString5 = jSONObjectOptJSONObject.optString("parentName");
                                            String strOptString6 = jSONObjectOptJSONObject.optString("siteName", strOptString);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(strOptString6);
                                            boolean[] zArr3 = zArr2;
                                            sb2.append(" · ");
                                            sb2.append(strOptString5);
                                            i4 = i5;
                                            zArr = zArr3;
                                            linearLayout = linearLayout2;
                                            AbstractC0583w0.m(linearLayout, strOptString4, sb2.toString(), C0538n.e(strOptString), true, i4, i5 > 0, null, zArr, new C0498f(c0239aE2, strOptString, strOptString2, strOptString3, strOptString5, strOptString4, strOptString6, 0));
                                        }
                                        i5 = i4 + 1;
                                        zArr2 = zArr;
                                        linearLayout2 = linearLayout;
                                    }
                                    linearLayoutK.addView(C0538n.c(activity, linearLayout2));
                                }
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setNegativeButton("返回", new DialogInterfaceOnClickListenerC0488d(c0538n, iVar2, 3)).create());
                            }
                        } catch (Exception unused) {
                            X0.a("显示收藏管理失败");
                            return;
                        }
                        break;
                    default:
                        this.b.h(iVar);
                        break;
                }
            }
        }, new Runnable(this) { // from class: com.github.catvod.spider.merge.z.b
            public final /* synthetic */ C0538n b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i4;
                boolean[] zArr;
                LinearLayout linearLayout;
                switch (i2) {
                    case 0:
                        this.b.j(iVar);
                        break;
                    case 1:
                        i iVar2 = iVar;
                        C0538n c0538n = this.b;
                        c0538n.getClass();
                        try {
                            Activity activity = InitOrigin.getActivity();
                            if (activity != null) {
                                C0239a c0239aE2 = C0239a.e();
                                c0239aE2.getClass();
                                JSONArray jSONArrayK = C0239a.k();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(AbstractC0583w0.p(activity, "收藏管理", "关闭开关即取消收藏"), layoutParams);
                                if (jSONArrayK.length() == 0) {
                                    linearLayoutK.addView(AbstractC0583w0.D(activity, "暂无收藏分类"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity);
                                    linearLayout2.setOrientation(1);
                                    boolean[] zArr2 = new boolean[jSONArrayK.length()];
                                    Arrays.fill(zArr2, true);
                                    int i5 = 0;
                                    while (i5 < jSONArrayK.length()) {
                                        JSONObject jSONObjectOptJSONObject = jSONArrayK.optJSONObject(i5);
                                        if (jSONObjectOptJSONObject == null) {
                                            i4 = i5;
                                            zArr = zArr2;
                                            linearLayout = linearLayout2;
                                        } else {
                                            String strOptString = jSONObjectOptJSONObject.optString("site");
                                            String strOptString2 = jSONObjectOptJSONObject.optString("parentId");
                                            String strOptString3 = jSONObjectOptJSONObject.optString("catId");
                                            String strOptString4 = jSONObjectOptJSONObject.optString("catName");
                                            String strOptString5 = jSONObjectOptJSONObject.optString("parentName");
                                            String strOptString6 = jSONObjectOptJSONObject.optString("siteName", strOptString);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(strOptString6);
                                            boolean[] zArr3 = zArr2;
                                            sb2.append(" · ");
                                            sb2.append(strOptString5);
                                            i4 = i5;
                                            zArr = zArr3;
                                            linearLayout = linearLayout2;
                                            AbstractC0583w0.m(linearLayout, strOptString4, sb2.toString(), C0538n.e(strOptString), true, i4, i5 > 0, null, zArr, new C0498f(c0239aE2, strOptString, strOptString2, strOptString3, strOptString5, strOptString4, strOptString6, 0));
                                        }
                                        i5 = i4 + 1;
                                        zArr2 = zArr;
                                        linearLayout2 = linearLayout;
                                    }
                                    linearLayoutK.addView(C0538n.c(activity, linearLayout2));
                                }
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setNegativeButton("返回", new DialogInterfaceOnClickListenerC0488d(c0538n, iVar2, 3)).create());
                            }
                        } catch (Exception unused) {
                            X0.a("显示收藏管理失败");
                            return;
                        }
                        break;
                    default:
                        this.b.h(iVar);
                        break;
                }
            }
        }, new Runnable(this) { // from class: com.github.catvod.spider.merge.z.b
            public final /* synthetic */ C0538n b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i4;
                boolean[] zArr;
                LinearLayout linearLayout;
                switch (i) {
                    case 0:
                        this.b.j(iVar);
                        break;
                    case 1:
                        i iVar2 = iVar;
                        C0538n c0538n = this.b;
                        c0538n.getClass();
                        try {
                            Activity activity = InitOrigin.getActivity();
                            if (activity != null) {
                                C0239a c0239aE2 = C0239a.e();
                                c0239aE2.getClass();
                                JSONArray jSONArrayK = C0239a.k();
                                LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                                linearLayoutK.addView(AbstractC0583w0.p(activity, "收藏管理", "关闭开关即取消收藏"), layoutParams);
                                if (jSONArrayK.length() == 0) {
                                    linearLayoutK.addView(AbstractC0583w0.D(activity, "暂无收藏分类"));
                                } else {
                                    LinearLayout linearLayout2 = new LinearLayout(activity);
                                    linearLayout2.setOrientation(1);
                                    boolean[] zArr2 = new boolean[jSONArrayK.length()];
                                    Arrays.fill(zArr2, true);
                                    int i5 = 0;
                                    while (i5 < jSONArrayK.length()) {
                                        JSONObject jSONObjectOptJSONObject = jSONArrayK.optJSONObject(i5);
                                        if (jSONObjectOptJSONObject == null) {
                                            i4 = i5;
                                            zArr = zArr2;
                                            linearLayout = linearLayout2;
                                        } else {
                                            String strOptString = jSONObjectOptJSONObject.optString("site");
                                            String strOptString2 = jSONObjectOptJSONObject.optString("parentId");
                                            String strOptString3 = jSONObjectOptJSONObject.optString("catId");
                                            String strOptString4 = jSONObjectOptJSONObject.optString("catName");
                                            String strOptString5 = jSONObjectOptJSONObject.optString("parentName");
                                            String strOptString6 = jSONObjectOptJSONObject.optString("siteName", strOptString);
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append(strOptString6);
                                            boolean[] zArr3 = zArr2;
                                            sb2.append(" · ");
                                            sb2.append(strOptString5);
                                            i4 = i5;
                                            zArr = zArr3;
                                            linearLayout = linearLayout2;
                                            AbstractC0583w0.m(linearLayout, strOptString4, sb2.toString(), C0538n.e(strOptString), true, i4, i5 > 0, null, zArr, new C0498f(c0239aE2, strOptString, strOptString2, strOptString3, strOptString5, strOptString4, strOptString6, 0));
                                        }
                                        i5 = i4 + 1;
                                        zArr2 = zArr;
                                        linearLayout2 = linearLayout;
                                    }
                                    linearLayoutK.addView(C0538n.c(activity, linearLayout2));
                                }
                                AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setNegativeButton("返回", new DialogInterfaceOnClickListenerC0488d(c0538n, iVar2, 3)).create());
                            }
                        } catch (Exception unused) {
                            X0.a("显示收藏管理失败");
                            return;
                        }
                        break;
                    default:
                        this.b.h(iVar);
                        break;
                }
            }
        }});
    }

    public final void h(i iVar) {
        int i;
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null) {
                return;
            }
            C0239a c0239aE = C0239a.e();
            c0239aE.getClass();
            JSONArray jSONArrayK = C0239a.k();
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
            linearLayoutK.addView(AbstractC0583w0.p(activity, "排序管理", "拖动调整分类在首页的显示顺序"), layoutParams);
            AlertDialog[] alertDialogArr = {null};
            if (jSONArrayK.length() == 0) {
                linearLayoutK.addView(AbstractC0583w0.D(activity, "暂无收藏分类"));
            } else {
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(1);
                int i2 = 0;
                while (i2 < jSONArrayK.length()) {
                    try {
                        JSONObject jSONObject = jSONArrayK.getJSONObject(i2);
                        String strOptString = jSONObject.optString("siteName");
                        String strOptString2 = jSONObject.optString("catName");
                        i = i2;
                        try {
                            AbstractC0583w0.i(linearLayout, strOptString + " - " + strOptString2, i2, jSONArrayK.length(), e(jSONObject.optString("site")), i2 > 0, new C0523k(this, c0239aE, alertDialogArr, iVar));
                        } catch (Exception unused) {
                        }
                    } catch (Exception unused2) {
                        i = i2;
                    }
                    i2 = i + 1;
                }
                linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
            }
            AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("添加分类", new DialogInterfaceOnClickListenerC0488d(this, iVar, 0)).setNeutralButton("全部清空", new DialogInterfaceOnClickListenerC0488d(this, iVar, 1)).setNegativeButton("返回", new DialogInterfaceOnClickListenerC0488d(this, iVar, 2)).create();
            alertDialogArr[0] = alertDialogCreate;
            AbstractC0583w0.j0(alertDialogCreate);
        } catch (Exception unused3) {
            X0.a("显示排序管理失败");
        }
    }

    public final void i(Runnable runnable) throws Throwable {
        String str;
        int i;
        try {
            Activity activity = InitOrigin.getActivity();
            C0239a c0239aE = C0239a.e();
            c0239aE.getClass();
            JSONArray jSONArrayL = C0239a.l();
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            linearLayoutK.addView(AbstractC0583w0.p(activity, "管理关注列表", jSONArrayL.length() == 0 ? "暂无关注" : "关闭开关即取消关注"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
            if (jSONArrayL.length() == 0) {
                linearLayoutK.addView(AbstractC0583w0.D(activity, "暂无关注，播放直播时可添加关注"));
            } else {
                LinearLayout linearLayout = new LinearLayout(activity);
                linearLayout.setOrientation(1);
                int length = jSONArrayL.length() - 1;
                int i2 = 0;
                while (length >= 0) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayL.optJSONObject(length);
                    if (jSONObjectOptJSONObject == null) {
                        i = length;
                    } else {
                        String strOptString = jSONObjectOptJSONObject.optString("site");
                        String strOptString2 = jSONObjectOptJSONObject.optString("roomId");
                        String strOptString3 = jSONObjectOptJSONObject.optString("userName", "");
                        String strOptString4 = jSONObjectOptJSONObject.optString("cover", "");
                        String strOptString5 = jSONObjectOptJSONObject.optString("title", "");
                        StringBuilder sb = new StringBuilder();
                        sb.append(f(strOptString));
                        sb.append(" · ");
                        sb.append(strOptString3.isEmpty() ? strOptString2 : strOptString3);
                        String string = sb.toString();
                        if (strOptString5.isEmpty()) {
                            str = "房间号 " + strOptString2;
                        } else {
                            str = strOptString5;
                        }
                        int i3 = i2 + 1;
                        i = length;
                        AbstractC0583w0.m(linearLayout, string, str, e(strOptString), true, i, i2 > 0, null, null, new C0498f(c0239aE, strOptString, strOptString2, strOptString3, strOptString4, strOptString5, runnable, 2));
                        i2 = i3;
                    }
                    length = i - 1;
                    linearLayout = linearLayout;
                }
                linearLayoutK.addView(c(activity, linearLayout));
            }
            AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("完成", (DialogInterface.OnClickListener) null).create());
        } catch (Exception unused) {
            X0.a("显示关注管理失败");
        }
    }

    public final void j(i iVar) {
        String[] strArr = new String[5];
        String[] strArr2 = new String[5];
        int[] iArr = new int[5];
        Runnable[] runnableArr = new Runnable[5];
        for (int i = 0; i < 5; i++) {
            String[] strArr3 = b.a[i];
            String str = strArr3[0];
            String str2 = strArr3[1];
            strArr[i] = str2;
            strArr2[i] = "浏览并收藏分类";
            iArr[i] = e(str);
            runnableArr[i] = new RunnableC0493e(this, str2, iVar, str);
        }
        P1.K0("选择平台", "选择要管理分类的直播平台", strArr, strArr2, iArr, runnableArr);
    }
}
