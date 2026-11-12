package com.github.catvod.spider.merge.p022z;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.C0246c0;
import com.github.catvod.spider.merge.A.H0;
import com.github.catvod.spider.merge.A.N0;
import com.github.catvod.spider.merge.A.P0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class C0559r1 implements InterfaceC0573u0, InterfaceC0580v2 {
    public static final String[][] c = {new String[]{"Android 手机版（默认）", "Android Mobile", "3.3.67", "Android Mobile/3.3.67", ""}, new String[]{"Emby for iOS · iPhone", "Emby for iOS", "2.2.31", "Emby for iOS/2.2.31", "iPhone"}, new String[]{"Emby for iOS · iPad", "Emby for iOS", "2.2.31", "Emby for iOS/2.2.31", "iPad"}, new String[]{"Android TV · NVIDIA SHIELD", "Emby for Android TV", "1.1.90g", "Emby for Android TV/1.1.90g", "NVIDIA SHIELD Android TV"}, new String[]{"Emby Theater · Windows", "Emby Theater", "3.0.21", "Emby Theater/3.0.21", "Windows PC"}, new String[]{"Samsung 智能电视", "Samsung TV", "2.2.9a", "Samsung TV/2.2.9a", "Samsung Smart TV"}};
    public final Object a;
    public Object b;

    public /* synthetic */ C0559r1(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static void d(C0559r1 c0559r1) {
        c0559r1.getClass();
        Activity activity = InitOrigin.getActivity();
        List drives = ((InterfaceC0545o1) c0559r1.a).getDrives();
        if (drives.size() < 2) {
            X0.a("至少需要2个服务器才能排序");
            return;
        }
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
        linearLayoutK.addView(AbstractC0583w0.p(activity, "服务器排序", "共 " + drives.size() + " 个服务器，调整显示顺序"), layoutParams);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        int i = 0;
        while (i < drives.size()) {
            JSONObject jSONObject = (JSONObject) drives.get(i);
            String strOptString = jSONObject.optString("name", "");
            boolean zEquals = "emby".equals(jSONObject.optString("type", "webdav"));
            AbstractC0583w0.i(linearLayout, b.m(new StringBuilder(), zEquals ? "[Emby] " : "[DAV] ", strOptString), i, drives.size(), zEquals ? AbstractC0583w0.d : AbstractC0583w0.c, i > 0, new C0559r1(c0559r1, alertDialogArr));
            i++;
        }
        linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("完成", (DialogInterface.OnClickListener) null).setCancelable(true).create();
        alertDialogArr[0] = alertDialogCreate;
        AbstractC0583w0.j0(alertDialogCreate);
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [android.app.AlertDialog[], java.io.Serializable] */
    public static void e(C0559r1 c0559r1) {
        c0559r1.getClass();
        Activity activity = InitOrigin.getActivity();
        InterfaceC0545o1 interfaceC0545o1 = (InterfaceC0545o1) c0559r1.a;
        List<String[]> allCategories = interfaceC0545o1.getAllCategories();
        if (allCategories.size() < 2) {
            X0.a("至少需要2个分类才能排序");
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<String> categoryOrder = interfaceC0545o1.getCategoryOrder();
        if (!categoryOrder.isEmpty()) {
            for (String str : categoryOrder) {
                for (String[] strArr : allCategories) {
                    if (str.equals(strArr[0])) {
                        arrayList.add(strArr);
                        break;
                    }
                }
            }
            for (String[] strArr2 : allCategories) {
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        arrayList.add(strArr2);
                        break;
                    }
                } while (!strArr2[0].equals(((String[]) it.next())[0]));
            }
        } else {
            arrayList.addAll(allCategories);
        }
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
        linearLayoutK.addView(AbstractC0583w0.p(activity, "分类排序", "共 " + arrayList.size() + " 个分类，调整显示顺序"), layoutParams);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        ?? r15 = new AlertDialog[1];
        int i = 0;
        while (i < arrayList.size()) {
            String[] strArr3 = (String[]) arrayList.get(i);
            AbstractC0583w0.i(linearLayout, strArr3[1], i, arrayList.size(), "E".equals(strArr3[2]) ? AbstractC0583w0.d : AbstractC0583w0.c, i > 0, new C0246c0((Object) c0559r1, (Object) arrayList, (Serializable) r15));
            i++;
        }
        linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("完成", (DialogInterface.OnClickListener) null).setCancelable(true).create();
        r15[0] = alertDialogCreate;
        AbstractC0583w0.j0(alertDialogCreate);
    }

    public static void f(C0559r1 c0559r1) {
        c0559r1.getClass();
        Activity activity = InitOrigin.getActivity();
        InterfaceC0545o1 interfaceC0545o1 = (InterfaceC0545o1) c0559r1.a;
        List drives = interfaceC0545o1.getDrives();
        if (drives.isEmpty()) {
            X0.a("暂无服务器");
            return;
        }
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
        linearLayoutK.addView(AbstractC0583w0.p(activity, "服务器开关", "关闭的服务器将不会加载和搜索"), layoutParams);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        ArrayList arrayList = new ArrayList(interfaceC0545o1.getDisabledServers());
        boolean[] zArr = new boolean[drives.size()];
        View[] viewArr = new View[drives.size()];
        int i = 0;
        while (i < drives.size()) {
            String strOptString = ((JSONObject) drives.get(i)).optString("name", "");
            boolean zEqualsIgnoreCase = "emby".equalsIgnoreCase(((JSONObject) drives.get(i)).optString("type", ""));
            boolean z = !arrayList.contains(strOptString);
            zArr[i] = z;
            AbstractC0583w0.m(linearLayout, strOptString, zEqualsIgnoreCase ? "Emby" : "WebDAV", zEqualsIgnoreCase ? AbstractC0583w0.d : AbstractC0583w0.c, z, i, i > 0, viewArr, zArr, new C0485c1(zArr, arrayList, strOptString, 0));
            i++;
            arrayList = arrayList;
        }
        linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
        AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0490d1(c0559r1, arrayList, 0)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
    }

    public static void g(C0559r1 c0559r1) {
        c0559r1.getClass();
        Activity activity = InitOrigin.getActivity();
        InterfaceC0545o1 interfaceC0545o1 = (InterfaceC0545o1) c0559r1.a;
        List allCategories = interfaceC0545o1.getAllCategories();
        if (allCategories.isEmpty()) {
            X0.a("暂无分类");
            return;
        }
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
        linearLayoutK.addView(AbstractC0583w0.p(activity, "分类过滤", "关闭的分类将不会在首页显示"), layoutParams);
        LinearLayout linearLayout = new LinearLayout(activity);
        char c2 = 1;
        linearLayout.setOrientation(1);
        ArrayList arrayList = new ArrayList(interfaceC0545o1.getHiddenCategories());
        boolean[] zArr = new boolean[allCategories.size()];
        View[] viewArr = new View[allCategories.size()];
        int i = 0;
        while (i < allCategories.size()) {
            String str = ((String[]) allCategories.get(i))[0];
            String str2 = ((String[]) allCategories.get(i))[c2];
            boolean z = !arrayList.contains(str);
            zArr[i] = z;
            AbstractC0583w0.m(linearLayout, str2, z ? "显示" : "隐藏", "E".equals(((String[]) allCategories.get(i))[2]) ? AbstractC0583w0.d : AbstractC0583w0.c, z, i, i > 0, viewArr, zArr, new C0485c1(zArr, arrayList, str, 1));
            i++;
            arrayList = arrayList;
            allCategories = allCategories;
            c2 = 1;
        }
        linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
        AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("保存", new DialogInterfaceOnClickListenerC0490d1(c0559r1, arrayList, 1)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:30:0x0133  */
    /* JADX WARN: Code duplicated, block: B:33:0x0162  */
    /* JADX WARN: Code duplicated, block: B:35:0x017c  */
    /* JADX WARN: Code duplicated, block: B:38:0x018c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0192  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:46:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:52:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:56:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x01e4  */
    /* JADX WARN: Instruction removed from duplicated block: B:58:0x01e4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public static void h(C0559r1 c0559r1) {
        LinearLayout linearLayout;
        boolean z;
        int i;
        TextView textView;
        StringBuilder sb;
        String strOptString;
        String strOptString2;
        String strOptString3;
        String strOptString4;
        C0559r1 c0559r2 = c0559r1;
        c0559r1.getClass();
        Activity activity = InitOrigin.getActivity();
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        InterfaceC0545o1 interfaceC0545o1 = (InterfaceC0545o1) c0559r2.a;
        List drives = interfaceC0545o1.getDrives();
        ArrayList arrayList = new ArrayList();
        char c2 = 0;
        for (int i2 = 0; i2 < drives.size(); i2++) {
            if ("emby".equals(((JSONObject) drives.get(i2)).optString("type", ""))) {
                arrayList.add(new int[]{i2});
            }
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
        linearLayoutK.addView(AbstractC0583w0.p(activity, "Emby安全配置", arrayList.size() + " 个Emby服务器，点击编辑安全配置"), layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(1);
        int i3 = 0;
        ?? r7 = linearLayout2;
        while (i3 < arrayList.size()) {
            int i4 = ((int[]) arrayList.get(i3))[c2];
            JSONObject jSONObject = (JSONObject) drives.get(i4);
            String strOptString5 = jSONObject.optString("name", "");
            String strOptString6 = jSONObject.optString("server", "");
            List list = drives;
            ArrayList arrayList2 = arrayList;
            if (jSONObject.optString("embyUA", "").isEmpty() && jSONObject.optString("embyClient", "").isEmpty() && jSONObject.optString("embyVersion", "").isEmpty() && jSONObject.optString("embyDevice", "").isEmpty()) {
                linearLayout = linearLayoutK;
                if (!jSONObject.optBoolean("embyInsecureTls", false)) {
                    z = false;
                }
                if (i3 > 0) {
                    r7.addView(AbstractC0583w0.C(activity));
                }
                i = AbstractC0583w0.d;
                ?? r22 = r7;
                ?? O = o(activity, i);
                O.setPadding(AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(10, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(10, activity));
                i3++;
                O.addView(n(activity, String.valueOf(i3), i));
                LinearLayout linearLayout3 = new LinearLayout(activity);
                linearLayout3.setOrientation(1);
                TextView textView2 = new TextView(activity);
                if (strOptString5.isEmpty()) {
                    strOptString5 = "未命名";
                }
                textView2.setText(strOptString5);
                textView2.setTextSize(14.0f);
                textView2.setTextColor(AbstractC0583w0.g);
                textView2.setTypeface(null, 1);
                textView2.setSingleLine(true);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView2.setEllipsize(truncateAt);
                linearLayout3.addView(textView2);
                textView = new TextView(activity);
                sb = new StringBuilder(interfaceC0545o1.getEmbyAuthStatus(jSONObject));
                if (z) {
                    strOptString = jSONObject.optString("embyUA", "");
                    strOptString2 = jSONObject.optString("embyClient", "");
                    strOptString3 = jSONObject.optString("embyVersion", "");
                    strOptString4 = jSONObject.optString("embyDevice", "");
                    if (!strOptString.isEmpty()) {
                        sb.append(" · UA: ");
                        sb.append(strOptString);
                    }
                    if (!strOptString2.isEmpty()) {
                        if (sb.length() > 0) {
                            sb.append(" | ");
                        }
                        sb.append("Client: ");
                        sb.append(strOptString2);
                    }
                    if (!strOptString3.isEmpty()) {
                        if (sb.length() > 0) {
                            sb.append(" | ");
                        }
                        sb.append("Ver: ");
                        sb.append(strOptString3);
                    }
                    if (!strOptString4.isEmpty()) {
                        if (sb.length() > 0) {
                            sb.append(" | ");
                        }
                        sb.append("Device: ");
                        sb.append(strOptString4);
                    }
                    if (jSONObject.optBoolean("embyInsecureTls", false)) {
                        sb.append(" | 不校验证书");
                    }
                    textView.setText(sb.toString());
                    textView.setTextColor(i);
                } else {
                    textView.setText(((Object) sb) + " · " + strOptString6.replace("https://", "").replace("http://", "") + " | 默认配置");
                    textView.setTextColor(AbstractC0583w0.i);
                }
                textView.setTextSize(11.0f);
                textView.setSingleLine(true);
                textView.setEllipsize(truncateAt);
                linearLayout3.addView(textView);
                O.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
                TextView textViewF = AbstractC0583w0.F(activity, "编辑", AbstractC0583w0.f, -1);
                textViewF.setTextSize(11.0f);
                textViewF.setPadding(AbstractC0583w0.Q(8, activity), AbstractC0583w0.Q(4, activity), AbstractC0583w0.Q(8, activity), AbstractC0583w0.Q(4, activity));
                O.addView(textViewF);
                textViewF.setOnClickListener(new ViewOnClickListenerC0495e1(c0559r1, i4));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams2.setMargins(0, 0, 0, AbstractC0583w0.Q(4, activity));
                r22.addView(O, layoutParams2);
                c0559r2 = c0559r1;
                r7 = r22;
                linearLayoutK = linearLayout;
                drives = list;
                arrayList = arrayList2;
                c2 = 0;
            } else {
                linearLayout = linearLayoutK;
            }
            z = true;
            if (i3 > 0) {
                r7.addView(AbstractC0583w0.C(activity));
            }
            i = AbstractC0583w0.d;
            ?? r23 = r7;
            ?? O2 = o(activity, i);
            O2.setPadding(AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(10, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(10, activity));
            i3++;
            O2.addView(n(activity, String.valueOf(i3), i));
            LinearLayout linearLayout4 = new LinearLayout(activity);
            linearLayout4.setOrientation(1);
            TextView textView3 = new TextView(activity);
            if (strOptString5.isEmpty()) {
                strOptString5 = "未命名";
            }
            textView3.setText(strOptString5);
            textView3.setTextSize(14.0f);
            textView3.setTextColor(AbstractC0583w0.g);
            textView3.setTypeface(null, 1);
            textView3.setSingleLine(true);
            TextUtils.TruncateAt truncateAt2 = TextUtils.TruncateAt.END;
            textView3.setEllipsize(truncateAt2);
            linearLayout4.addView(textView3);
            textView = new TextView(activity);
            sb = new StringBuilder(interfaceC0545o1.getEmbyAuthStatus(jSONObject));
            if (z) {
                strOptString = jSONObject.optString("embyUA", "");
                strOptString2 = jSONObject.optString("embyClient", "");
                strOptString3 = jSONObject.optString("embyVersion", "");
                strOptString4 = jSONObject.optString("embyDevice", "");
                if (!strOptString.isEmpty()) {
                    sb.append(" · UA: ");
                    sb.append(strOptString);
                }
                if (!strOptString2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append(" | ");
                    }
                    sb.append("Client: ");
                    sb.append(strOptString2);
                }
                if (!strOptString3.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append(" | ");
                    }
                    sb.append("Ver: ");
                    sb.append(strOptString3);
                }
                if (!strOptString4.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append(" | ");
                    }
                    sb.append("Device: ");
                    sb.append(strOptString4);
                }
                if (jSONObject.optBoolean("embyInsecureTls", false)) {
                    sb.append(" | 不校验证书");
                }
                textView.setText(sb.toString());
                textView.setTextColor(i);
            } else {
                textView.setText(((Object) sb) + " · " + strOptString6.replace("https://", "").replace("http://", "") + " | 默认配置");
                textView.setTextColor(AbstractC0583w0.i);
            }
            textView.setTextSize(11.0f);
            textView.setSingleLine(true);
            textView.setEllipsize(truncateAt2);
            linearLayout4.addView(textView);
            O2.addView(linearLayout4, new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textViewF2 = AbstractC0583w0.F(activity, "编辑", AbstractC0583w0.f, -1);
            textViewF2.setTextSize(11.0f);
            textViewF2.setPadding(AbstractC0583w0.Q(8, activity), AbstractC0583w0.Q(4, activity), AbstractC0583w0.Q(8, activity), AbstractC0583w0.Q(4, activity));
            O2.addView(textViewF2);
            textViewF2.setOnClickListener(new ViewOnClickListenerC0495e1(c0559r1, i4));
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(0, 0, 0, AbstractC0583w0.Q(4, activity));
            r23.addView(O2, layoutParams3);
            c0559r2 = c0559r1;
            r7 = r23;
            linearLayoutK = linearLayout;
            drives = list;
            arrayList = arrayList2;
            c2 = 0;
        }
        C0559r1 c0559r3 = c0559r2;
        linearLayoutK.addView(AbstractC0583w0.s(activity, r7));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create();
        c0559r3.b = alertDialogCreate;
        AbstractC0583w0.j0(alertDialogCreate);
    }

    public static String k(JSONObject jSONObject) {
        return jSONObject.optString("embyClient", "Android Mobile") + " " + jSONObject.optString("embyVersion", "3.3.67") + " · " + jSONObject.optString("embyDevice", "本机型号");
    }

    public static TextView n(Activity activity, String str, int i) {
        TextView textView = new TextView(activity);
        textView.setText(str);
        textView.setTextSize(11.0f);
        textView.setTextColor(-1);
        textView.setTypeface(null, 1);
        textView.setGravity(17);
        textView.setMinWidth(AbstractC0583w0.Q(22, activity));
        textView.setPadding(AbstractC0583w0.Q(5, activity), AbstractC0583w0.Q(3, activity), AbstractC0583w0.Q(5, activity), AbstractC0583w0.Q(3, activity));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(11, activity));
        gradientDrawable.setColor(i);
        textView.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = AbstractC0583w0.Q(12, activity);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public static LinearLayout o(Activity activity, int i) {
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(12, activity));
        linearLayout.setClickable(true);
        AbstractC0583w0.n(linearLayout, i);
        return linearLayout;
    }

    public static void q(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        if (str.isEmpty() || "Android Mobile/3.3.67".equals(str)) {
            jSONObject.remove("embyUA");
        } else {
            jSONObject.put("embyUA", str);
        }
        if (str2.isEmpty() || "Android Mobile".equals(str2)) {
            jSONObject.remove("embyClient");
        } else {
            jSONObject.put("embyClient", str2);
        }
        if (str3.isEmpty() || "3.3.67".equals(str3)) {
            jSONObject.remove("embyVersion");
        } else {
            jSONObject.put("embyVersion", str3);
        }
        if (str4.isEmpty()) {
            jSONObject.remove("embyDevice");
        } else {
            jSONObject.put("embyDevice", str4);
        }
    }

    public static void s(Activity activity, String str, String str2, String str3, String str4, InterfaceC0550p1 interfaceC0550p1) {
        int i;
        String[] strArr = new String[6];
        String[] strArr2 = new String[6];
        int[] iArr = new int[6];
        int[] iArr2 = {0};
        int i2 = 0;
        while (i2 < 6) {
            String[] strArr3 = c[i2];
            strArr[i2] = strArr3[0];
            StringBuilder sb = new StringBuilder();
            sb.append(strArr3[1]);
            sb.append(" · ");
            sb.append(strArr3[4].isEmpty() ? "本机型号" : strArr3[4]);
            strArr2[i2] = sb.toString();
            if (i2 == 1 || i2 == 2) {
                i = AbstractC0583w0.d;
            } else {
                i = (i2 == 3 || i2 == 5) ? AbstractC0583w0.f : AbstractC0583w0.c;
            }
            iArr[i2] = i;
            if (strArr3[1].equals(str2) && strArr3[2].equals(str3) && strArr3[3].equals(str)) {
                if (strArr3[4].equals(str4)) {
                    iArr2[0] = i2;
                }
            }
            i2++;
        }
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        linearLayoutK.addView(AbstractC0583w0.p(activity, "常见客户端预设", "选择一个设备身份，应用后自动填写参数"), AbstractC0583w0.c0(AbstractC0583w0.Q(8, activity)));
        linearLayoutK.addView(AbstractC0583w0.E(activity, strArr, strArr2, iArr, iArr2, "详细参数仍可单独修改"));
        AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("应用", new P0(interfaceC0550p1, iArr2, 8)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create());
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0580v2
    public void a(String str) {
        InterfaceC0580v2 interfaceC0580v2;
        if (!((AtomicBoolean) this.a).compareAndSet(false, true) || (interfaceC0580v2 = (InterfaceC0580v2) this.b) == null) {
            return;
        }
        interfaceC0580v2.a(str);
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0580v2
    public void b() {
        InterfaceC0580v2 interfaceC0580v2;
        if (!((AtomicBoolean) this.a).compareAndSet(false, true) || (interfaceC0580v2 = (InterfaceC0580v2) this.b) == null) {
            return;
        }
        try {
            interfaceC0580v2.b();
        } catch (Throwable unused) {
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0573u0
    public void c(int i, int i2) {
        C0559r1 c0559r1 = (C0559r1) this.b;
        ((InterfaceC0545o1) c0559r1.a).swapDrives(i, i2);
        AlertDialog alertDialog = ((AlertDialog[]) this.a)[0];
        if (alertDialog != null) {
            alertDialog.dismiss();
        }
        InitOrigin.run(new RunnableC0480b1(c0559r1, 4));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r22v0, types: [android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.ViewGroup, android.widget.LinearLayout] */
    public void i(String str, int i, final String str2) throws Throwable {
        JSONObject jSONObject;
        ?? r0;
        String str3;
        JSONObject jSONObject2;
        EditText editText;
        int i2;
        ?? r11;
        LinearLayout.LayoutParams layoutParams;
        EditText editText2;
        EditText editTextE;
        EditText editTextE2;
        EditText editTextE3;
        String str4;
        boolean z;
        Activity activity = InitOrigin.getActivity();
        boolean z2 = i >= 0;
        final boolean zEquals = "emby".equals(str);
        if (z2) {
            List drives = ((InterfaceC0545o1) this.a).getDrives();
            if (i < drives.size()) {
                jSONObject = (JSONObject) drives.get(i);
            } else {
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        StringBuilder sb = new StringBuilder();
        sb.append(z2 ? "编辑" : "添加");
        String strM = b.m(sb, zEquals ? " Emby" : " WebDAV", " 服务器");
        String str5 = zEquals ? "填写服务器地址和账号" : "填写WebDAV服务器地址和认证信息";
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.bottomMargin = AbstractC0583w0.Q(12, activity);
        linearLayoutK.addView(AbstractC0583w0.p(activity, strM, str5), layoutParams2);
        final int i3 = AbstractC0583w0.c;
        ?? Y = AbstractC0583w0.y(activity);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = AbstractC0583w0.Q(8, activity);
        AbstractC0583w0.g(Y, "名称 (用于标识)");
        EditText editTextE4 = AbstractC0583w0.e(Y, "例如: 我的NAS", jSONObject != null ? jSONObject.optString("name", "") : "", false);
        AbstractC0583w0.g(Y, zEquals ? "服务器地址" : "WebDAV地址");
        EditText editTextE5 = AbstractC0583w0.e(Y, zEquals ? "http://192.168.1.100:8096" : "https://dav.example.com/path", jSONObject != null ? jSONObject.optString("server", "") : "", false);
        AbstractC0583w0.g(Y, "用户名");
        EditText editTextE6 = AbstractC0583w0.e(Y, "请输入用户名", jSONObject != null ? jSONObject.optString("user", "") : "", false);
        AbstractC0583w0.g(Y, "密码");
        EditText editTextE7 = AbstractC0583w0.e(Y, "请输入密码(可选)", jSONObject != null ? jSONObject.optString("pass", "") : "", false);
        editTextE7.setInputType(129);
        if (zEquals) {
            LinearLayout linearLayoutD = AbstractC0583w0.d(Y, "客户端预设", "选择常见客户端并自动填写兼容标识", i3, true);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(activity);
            textView.setText("[ + ] 兼容设置 (可选)");
            textView.setTextSize(13.0f);
            textView.setTextColor(AbstractC0583w0.i);
            textView.setGravity(17);
            textView.setPadding(AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(8, activity), AbstractC0583w0.Q(12, activity), AbstractC0583w0.Q(8, activity));
            textView.setFocusable(true);
            textView.setFocusableInTouchMode(true);
            textView.setClickable(true);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AbstractC0583w0.Q(6, activity));
            gradientDrawable.setColor(-657931);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(AbstractC0583w0.Q(6, activity));
            gradientDrawable2.setColor(AbstractC0583w0.k);
            gradientDrawable2.setStroke(AbstractC0583w0.Q(2, activity), i3);
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable2);
            stateListDrawable.addState(new int[]{R.attr.state_focused}, gradientDrawable2);
            stateListDrawable.addState(new int[0], gradientDrawable);
            textView.setBackground(stateListDrawable);
            textView.setOnClickListener(new J0(linearLayout, textView));
            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams4.topMargin = AbstractC0583w0.Q(8, activity);
            Y.addView(textView, layoutParams4);
            AbstractC0583w0.g(linearLayout, "User-Agent");
            String strOptString = jSONObject != null ? jSONObject.optString("embyUA", "") : "";
            if (strOptString.isEmpty()) {
                strOptString = "Android Mobile/3.3.67";
            }
            editTextE = AbstractC0583w0.e(linearLayout, "Android Mobile/3.3.67", strOptString, false);
            AbstractC0583w0.g(linearLayout, "客户端名称 (Client)");
            String strOptString2 = jSONObject != null ? jSONObject.optString("embyClient", "") : "";
            if (strOptString2.isEmpty()) {
                strOptString2 = "Android Mobile";
            }
            EditText editTextE8 = AbstractC0583w0.e(linearLayout, "Android Mobile", strOptString2, false);
            AbstractC0583w0.g(linearLayout, "客户端版本 (Version)");
            String strOptString3 = jSONObject != null ? jSONObject.optString("embyVersion", "") : "";
            String str6 = strOptString3;
            if (strOptString3.isEmpty()) {
                z = false;
                str4 = "3.3.67";
            } else {
                str4 = str6;
                z = false;
            }
            editTextE2 = AbstractC0583w0.e(linearLayout, "3.3.67", str4, z);
            AbstractC0583w0.g(linearLayout, "设备名称 (Device)");
            editTextE3 = AbstractC0583w0.e(linearLayout, "留空使用本机品牌和型号", jSONObject != null ? jSONObject.optString("embyDevice", "") : "", z);
            jSONObject2 = jSONObject;
            editText = editTextE4;
            linearLayoutD.setOnClickListener(new U0(this, activity, editTextE, editTextE8, editTextE2, editTextE3, 0));
            ?? r1 = Y;
            r1.addView(linearLayout);
            str3 = "";
            if (jSONObject2 == null || (jSONObject2.optString("embyUA", str3).isEmpty() && jSONObject2.optString("embyClient", str3).isEmpty() && jSONObject2.optString("embyVersion", str3).isEmpty() && jSONObject2.optString("embyDevice", str3).isEmpty())) {
                i2 = 0;
            } else {
                i2 = 0;
                linearLayout.setVisibility(0);
                textView.setText("[ - ] 高级设置 (可选)");
            }
            editText2 = editTextE8;
            layoutParams = layoutParams3;
            r11 = linearLayoutK;
            r0 = r1;
        } else {
            r0 = Y;
            str3 = "";
            jSONObject2 = jSONObject;
            editText = editTextE4;
            i2 = 0;
            r11 = linearLayoutK;
            layoutParams = layoutParams3;
            editText2 = null;
            editTextE = null;
            editTextE2 = null;
            editTextE3 = null;
        }
        r11.addView(r0, layoutParams);
        LinearLayout linearLayout2 = new LinearLayout(activity);
        linearLayout2.setOrientation(i2);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams5.topMargin = AbstractC0583w0.Q(10, activity);
        TextView textViewF = AbstractC0583w0.F(activity, "测试连接", -10453621, -1);
        textViewF.setTextSize(13.0f);
        textViewF.setPadding(AbstractC0583w0.Q(14, activity), AbstractC0583w0.Q(6, activity), AbstractC0583w0.Q(14, activity), AbstractC0583w0.Q(6, activity));
        TextView textView2 = new TextView(activity);
        textView2.setTextSize(12.0f);
        textView2.setPadding(AbstractC0583w0.Q(10, activity), 0, 0, 0);
        if (zEquals) {
            str3 = "Emby需开启远程访问";
        }
        textView2.setText(str3);
        textView2.setTextColor(AbstractC0583w0.i);
        linearLayout2.addView(textViewF);
        linearLayout2.addView(textView2, new LinearLayout.LayoutParams(0, -2, 1.0f));
        r11.addView(linearLayout2, layoutParams5);
        JSONObject jSONObject3 = jSONObject2;
        EditText editText3 = editText2;
        final boolean z3 = z2;
        textViewF.setOnClickListener(new ViewOnClickListenerC0505g1(this, editTextE5, editTextE6, editTextE7, textView2, textViewF, zEquals, editTextE, editText2, editTextE2, editTextE3));
        H0 h0 = H0.a;
        EditText editText4 = editText;
        C0515i1 c0515i1 = new C0515i1(editText4, editTextE5, editTextE6, editTextE7);
        h0.getClass();
        H0.f(str2, c0515i1);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(r11)).setPositiveButton(z3 ? "保存修改" : "添加", (DialogInterface.OnClickListener) null).setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).setOnCancelListener(new DialogInterfaceOnCancelListenerC0520j1(str2)).create();
        AbstractC0583w0.j0(alertDialogCreate);
        alertDialogCreate.getButton(-3).setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.V0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                P1.J0((z3 ? "编辑" : "添加").concat("服务器"), "扫码在手机上输入服务器信息", str2, b.m(new StringBuilder("name,名称,例如我的NAS|server,服务器地址,"), zEquals ? "http://192.168.1.100:8096" : "https://dav.example.com/path", "|user,用户名,请输入用户名|pass,密码,请输入密码,pwd"), i3);
            }
        });
        alertDialogCreate.getButton(-1).setOnClickListener(new ViewOnClickListenerC0525k1(this, editText4, editTextE5, editTextE6, editTextE7, zEquals, i, z3, jSONObject3, str, editTextE, editText3, editTextE2, editTextE3, str2, alertDialogCreate));
        alertDialogCreate.getButton(-2).setOnClickListener(new ViewOnClickListenerC0530l1(this, str2, alertDialogCreate, z3));
    }

    public void j(final boolean z) {
        int i;
        Activity activity = InitOrigin.getActivity();
        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int i2 = 12;
        layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
        List drives = ((InterfaceC0545o1) this.a).getDrives();
        String str = z ? "删除服务器" : "管理服务器";
        StringBuilder sb = new StringBuilder();
        sb.append(drives.size());
        sb.append(" 个 · 点击");
        sb.append(z ? "删除" : "编辑");
        linearLayoutK.addView(AbstractC0583w0.p(activity, str, sb.toString()), layoutParams);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        AlertDialog[] alertDialogArr = new AlertDialog[1];
        if (drives.isEmpty()) {
            TextView textView = new TextView(activity);
            textView.setText("暂无服务器");
            textView.setTextSize(14.0f);
            textView.setTextColor(AbstractC0583w0.i);
            textView.setGravity(17);
            textView.setPadding(0, AbstractC0583w0.Q(16, activity), 0, AbstractC0583w0.Q(16, activity));
            linearLayout.addView(textView);
        } else {
            int i3 = 0;
            while (i3 < drives.size()) {
                if (i3 > 0) {
                    linearLayout.addView(AbstractC0583w0.C(activity));
                }
                JSONObject jSONObject = (JSONObject) drives.get(i3);
                final String strOptString = jSONObject.optString("type", "webdav");
                final String strOptString2 = jSONObject.optString("name", "");
                String strOptString3 = jSONObject.optString("server", "");
                boolean zEquals = "emby".equals(strOptString);
                if (z) {
                    i = AbstractC0583w0.e;
                } else {
                    i = zEquals ? AbstractC0583w0.d : AbstractC0583w0.c;
                }
                int i4 = i;
                LinearLayout linearLayoutO = o(activity, i4);
                linearLayoutO.setPadding(AbstractC0583w0.Q(i2, activity), AbstractC0583w0.Q(10, activity), AbstractC0583w0.Q(i2, activity), AbstractC0583w0.Q(10, activity));
                int i5 = i3 + 1;
                linearLayoutO.addView(n(activity, String.valueOf(i5), i4));
                TextView textView2 = new TextView(activity);
                textView2.setText(zEquals ? "Emby" : "DAV");
                textView2.setTextSize(10.0f);
                textView2.setTextColor(-1);
                textView2.setTypeface(null, 1);
                textView2.setGravity(17);
                textView2.setPadding(AbstractC0583w0.Q(6, activity), AbstractC0583w0.Q(2, activity), AbstractC0583w0.Q(6, activity), AbstractC0583w0.Q(2, activity));
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(AbstractC0583w0.Q(4, activity));
                gradientDrawable.setColor(i4);
                textView2.setBackground(gradientDrawable);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.rightMargin = AbstractC0583w0.Q(8, activity);
                linearLayoutO.addView(textView2, layoutParams2);
                LinearLayout linearLayout2 = new LinearLayout(activity);
                linearLayout2.setOrientation(1);
                TextView textView3 = new TextView(activity);
                textView3.setText(strOptString2.isEmpty() ? "未命名" : strOptString2);
                textView3.setTextSize(14.0f);
                textView3.setTextColor(AbstractC0583w0.g);
                textView3.setTypeface(null, 1);
                textView3.setSingleLine(true);
                textView3.setEllipsize(TextUtils.TruncateAt.END);
                linearLayout2.addView(textView3);
                if (!strOptString3.isEmpty()) {
                    TextView textView4 = new TextView(activity);
                    textView4.setText(strOptString3.replace("https://", "").replace("http://", ""));
                    textView4.setTextSize(11.0f);
                    textView4.setTextColor(AbstractC0583w0.i);
                    textView4.setSingleLine(true);
                    textView4.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                    linearLayout2.addView(textView4);
                }
                linearLayoutO.addView(linearLayout2, new LinearLayout.LayoutParams(0, -2, 1.0f));
                final int i6 = i3;
                final AlertDialog[] alertDialogArr2 = alertDialogArr;
                linearLayoutO.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.S0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C0559r1 c0559r1 = this.a;
                        c0559r1.getClass();
                        AlertDialog alertDialog = alertDialogArr2[0];
                        if (alertDialog != null) {
                            alertDialog.dismiss();
                        }
                        boolean z2 = z;
                        int i7 = i6;
                        if (z2) {
                            InitOrigin.run(new RunnableC0540n1(c0559r1, strOptString2, i7));
                        } else {
                            InitOrigin.run(new N0(c0559r1, strOptString, i7, String.valueOf(System.currentTimeMillis())));
                        }
                    }
                });
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                layoutParams3.setMargins(0, 0, 0, AbstractC0583w0.Q(4, activity));
                linearLayout.addView(linearLayoutO, layoutParams3);
                i3 = i5;
                alertDialogArr = alertDialogArr;
                i2 = 12;
            }
        }
        AlertDialog[] alertDialogArr3 = alertDialogArr;
        linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create();
        alertDialogArr3[0] = alertDialogCreate;
        AbstractC0583w0.j0(alertDialogCreate);
    }

    public JSONObject l(int i) {
        List drives = ((InterfaceC0545o1) this.a).getDrives();
        if (i < 0 || i >= drives.size()) {
            return null;
        }
        return (JSONObject) drives.get(i);
    }

    public void m(String str) {
        InterfaceC0476a2 interfaceC0476a2 = (InterfaceC0476a2) this.a;
        if (interfaceC0476a2.getItems().contains(str)) {
            X0.a(((C0481b2) this.b).b + "已存在");
            return;
        }
        interfaceC0476a2.addItem(str);
        interfaceC0476a2.saveConfig();
        X0.a("已添加: " + str + "，刷新生效");
    }

    public void p() {
        AlertDialog alertDialog = (AlertDialog) this.b;
        if (alertDialog != null) {
            alertDialog.dismiss();
            this.b = null;
        }
        InitOrigin.run(new RunnableC0480b1(this, 3));
    }

    public void r() {
        List items = ((InterfaceC0476a2) this.a).getItems();
        if (!items.isEmpty()) {
            InitOrigin.run(new X1(this, items, 1));
            return;
        }
        X0.a("没有可删除的" + ((C0481b2) this.b).b);
    }

    public void t(boolean z) {
        InitOrigin.run(new R0(this, z, 0));
    }

    public void u() {
        List items = ((InterfaceC0476a2) this.a).getItems();
        if (items.size() >= 2) {
            InitOrigin.run(new X1(this, items, 0));
            return;
        }
        X0.a(((C0481b2) this.b).b + "太少，无需排序");
    }

    public C0559r1(InterfaceC0545o1 interfaceC0545o1) {
        this.a = interfaceC0545o1;
    }

    public C0559r1(C0559r1 c0559r1, AlertDialog[] alertDialogArr) {
        this.b = c0559r1;
        this.a = alertDialogArr;
    }
}
