package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.RunnableC0240a0;
import com.github.catvod.spider.merge.A.RunnableC0271k1;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.W;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class K1 {
    public static final int[] f = {AbstractC0583w0.d, AbstractC0583w0.c, -15610385, AbstractC0583w0.f, AbstractC0583w0.e};
    public final J1 a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public LinearLayout d;
    public TextView e;

    public K1(J1 j1) {
        this.a = j1;
    }

    public static String c(String str) {
        return str == null ? "" : str.replace("https://", "").replace("http://", "");
    }

    public static String d(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append((String) list.get(i));
        }
        return sb.toString();
    }

    public static ArrayList e(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            String strTrim = jSONArray.optString(i, "").trim();
            if (!strTrim.isEmpty() && !arrayList.contains(strTrim)) {
                arrayList.add(strTrim);
            }
        }
        return arrayList;
    }

    public static TextView f(ContextWrapper contextWrapper, String str, int i) {
        TextView textView = new TextView(contextWrapper);
        textView.setText(str);
        textView.setTextSize(11.0f);
        textView.setTextColor(-1);
        textView.setTypeface(null, 1);
        textView.setGravity(17);
        textView.setMinWidth(AbstractC0583w0.Q(22, contextWrapper));
        textView.setPadding(AbstractC0583w0.Q(5, contextWrapper), AbstractC0583w0.Q(3, contextWrapper), AbstractC0583w0.Q(5, contextWrapper), AbstractC0583w0.Q(3, contextWrapper));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(AbstractC0583w0.Q(11, contextWrapper));
        gradientDrawable.setColor(i);
        textView.setBackground(gradientDrawable);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = AbstractC0583w0.Q(12, contextWrapper);
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    public static LinearLayout g(ContextWrapper contextWrapper, int i) {
        LinearLayout linearLayout = new LinearLayout(contextWrapper);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setPadding(AbstractC0583w0.Q(12, contextWrapper), AbstractC0583w0.Q(12, contextWrapper), AbstractC0583w0.Q(12, contextWrapper), AbstractC0583w0.Q(12, contextWrapper));
        linearLayout.setClickable(true);
        AbstractC0583w0.n(linearLayout, i);
        return linearLayout;
    }

    public static ArrayList h(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null && !str.trim().isEmpty()) {
            for (String str2 : str.split("[,，]")) {
                String strTrim = str2.trim();
                if (!strTrim.isEmpty() && !arrayList.contains(strTrim)) {
                    arrayList.add(strTrim);
                }
            }
        }
        return arrayList;
    }

    public final void a(LinearLayout linearLayout, final String str, final AlertDialog[] alertDialogArr) {
        J1 j1 = this.a;
        final boolean zIsBuiltinUrl = j1.isBuiltinUrl(str);
        String apiName = j1.getApiName(str);
        StringBuilder sb = new StringBuilder();
        sb.append(j1.isBuiltinUrl(str) ? "推荐" : "自定义");
        sb.append(" · ");
        sb.append(c(str));
        AbstractC0583w0.d(linearLayout, apiName, sb.toString(), AbstractC0583w0.e, linearLayout.getChildCount() > 0).setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.F1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String str2 = str;
                AlertDialog[] alertDialogArr2 = alertDialogArr;
                K1 k1 = this.a;
                k1.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity == null) {
                        return;
                    }
                    int i = AbstractC0583w0.e;
                    String[][] strArr = {new String[]{"名称", k1.a.getApiName(str2)}, new String[]{"类型", zIsBuiltinUrl ? "推荐" : "自定义"}, new String[]{"地址", str2}};
                    int i2 = AbstractC0583w0.a;
                    AbstractC0583w0.j0(AbstractC0583w0.r(activity, "删除接口", "确认删除这个搜索接口", i, strArr, new int[]{AbstractC0583w0.c, AbstractC0583w0.f, i}, new String[]{"删除", "取消"}, new Runnable[]{new W(k1, str2, alertDialogArr2, 9), null}));
                } catch (Exception e) {
                    b.D(e, new StringBuilder("[FishPsDialog] deleteCustomUrl: "));
                }
            }
        });
    }

    public final String b() {
        J1 j1 = this.a;
        if (j1.getCustomChannels().isEmpty() && j1.getCustomPlugins().isEmpty()) {
            return "无自定义";
        }
        return "自定义 TG " + j1.getCustomChannels().size() + " / 插件 " + j1.getCustomPlugins().size();
    }

    public final void i(Set set, Set set2) {
        J1 j1 = this.a;
        List channels = j1.getChannels();
        ArrayList arrayList = new ArrayList(set);
        channels.clear();
        channels.addAll(arrayList);
        List plugins = j1.getPlugins();
        ArrayList arrayList2 = new ArrayList(set2);
        plugins.clear();
        plugins.addAll(arrayList2);
        if (set.isEmpty() && set2.isEmpty()) {
            j1.setChannelMode(0);
        } else if (!set.isEmpty() && set2.isEmpty()) {
            j1.setChannelMode(1);
        } else if (set.isEmpty()) {
            j1.setChannelMode(2);
        } else {
            j1.setChannelMode(3);
        }
        j1.saveConfig();
    }

    public final String j() {
        J1 j1 = this.a;
        String channelApiUrl = j1.getChannelApiUrl();
        if (!TextUtils.isEmpty(channelApiUrl)) {
            for (String str : j1.getVisibleApiUrls()) {
                if (channelApiUrl.equals(str) && j1.isApiEnabled(str)) {
                    return channelApiUrl;
                }
            }
        }
        for (String str2 : j1.getVisibleApiUrls()) {
            if (j1.isApiEnabled(str2)) {
                return str2;
            }
        }
        return "";
    }

    public final void k(Application application, List list) {
        int i;
        this.d.removeAllViews();
        int i2 = 0;
        while (i2 < list.size()) {
            String str = (String) list.get(i2);
            int i3 = i2 + 1;
            J1 j1 = this.a;
            if (!j1.isBuiltinUrl(str)) {
                i = -6543440;
            } else {
                int[] iArr = f;
                i = iArr[i2 % iArr.length];
            }
            LinearLayout linearLayoutG = g(application, i);
            linearLayoutG.setPadding(AbstractC0583w0.Q(12, application), AbstractC0583w0.Q(10, application), AbstractC0583w0.Q(12, application), AbstractC0583w0.Q(10, application));
            linearLayoutG.addView(f(application, String.valueOf(i3), i));
            TextView textView = new TextView(application);
            StringBuilder sb = new StringBuilder();
            sb.append(j1.isApiEnabled(str) ? "" : "[关] ");
            sb.append(j1.getApiName(str));
            sb.append(" · ");
            sb.append(c(str));
            textView.setText(sb.toString());
            textView.setTextSize(13.0f);
            textView.setTextColor(AbstractC0583w0.g);
            textView.setSingleLine(true);
            textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
            textView.setPadding(AbstractC0583w0.Q(10, application), 0, 0, 0);
            linearLayoutG.addView(textView, new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView2 = new TextView(application);
            textView2.setTextSize(11.0f);
            textView2.setTypeface(null, 1);
            textView2.setPadding(AbstractC0583w0.Q(8, application), AbstractC0583w0.Q(3, application), AbstractC0583w0.Q(8, application), AbstractC0583w0.Q(3, application));
            textView2.setText("待测");
            textView2.setTextColor(AbstractC0583w0.i);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(AbstractC0583w0.Q(4, application));
            gradientDrawable.setColor(AbstractC0583w0.j);
            textView2.setBackground(gradientDrawable);
            linearLayoutG.addView(textView2);
            this.c.put(str, textView2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, AbstractC0583w0.Q(6, application));
            this.d.addView(linearLayoutG, layoutParams);
            i2 = i3;
        }
    }

    public final void l(boolean z) {
        String strJ = j();
        if (TextUtils.isEmpty(strJ)) {
            m(new ArrayList(), z);
        } else {
            X0.a("读取默认列表中...");
            InitOrigin.execute(new RunnableC0271k1(1, this, strJ, z));
        }
    }

    public final void m(final ArrayList arrayList, final boolean z) {
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null) {
                return;
            }
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            final String str = z ? "搜索插件" : "TG频道";
            linearLayoutK.addView(AbstractC0583w0.p(activity, str, "管理模板默认列表"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
            J1 j1 = this.a;
            final LinkedHashSet linkedHashSet = new LinkedHashSet(z ? j1.getPlugins() : j1.getChannels());
            if (linkedHashSet.isEmpty() && !arrayList.isEmpty()) {
                linkedHashSet.addAll(arrayList);
            }
            TextView textView = new TextView(activity);
            textView.setTextSize(13.0f);
            textView.setTextColor(AbstractC0583w0.h);
            textView.setPadding(AbstractC0583w0.Q(4, activity), 0, 0, AbstractC0583w0.Q(8, activity));
            linearLayoutK.addView(textView);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
            final Runnable[] runnableArr = {null};
            final TextView[] textViewArr = {null};
            runnableArr[0] = new RunnableC0473a(this, linearLayout, textView, arrayList, linkedHashSet, runnableArr, textViewArr, 2);
            final AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("保存", (DialogInterface.OnClickListener) null).setNeutralButton("全选", (DialogInterface.OnClickListener) null).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.github.catvod.spider.merge.z.B1
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    final K1 k1 = this.a;
                    k1.getClass();
                    final AlertDialog alertDialog = alertDialogCreate;
                    Button button = alertDialog.getButton(-3);
                    TextView[] textViewArr2 = textViewArr;
                    textViewArr2[0] = button;
                    ArrayList arrayList2 = (ArrayList) arrayList;
                    final LinkedHashSet linkedHashSet2 = (LinkedHashSet) linkedHashSet;
                    if (button != null) {
                        button.setText(arrayList2.isEmpty() ? linkedHashSet2.isEmpty() ^ true : linkedHashSet2.containsAll(arrayList2) ? "全不选" : "全选");
                    }
                    Button button2 = alertDialog.getButton(-1);
                    final boolean z2 = z;
                    final String str2 = str;
                    button2.setOnClickListener(new View.OnClickListener() { // from class: com.github.catvod.spider.merge.z.H1
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            LinkedHashSet linkedHashSet3 = (LinkedHashSet) linkedHashSet2;
                            K1 k2 = k1;
                            k2.getClass();
                            J1 j2 = k2.a;
                            LinkedHashSet linkedHashSet4 = new LinkedHashSet(j2.getChannels());
                            LinkedHashSet linkedHashSet5 = new LinkedHashSet(j2.getPlugins());
                            if (z2) {
                                linkedHashSet5 = linkedHashSet3;
                                linkedHashSet3 = linkedHashSet4;
                            }
                            k2.i(linkedHashSet3, linkedHashSet5);
                            X0.a(str2 + "已保存");
                            alertDialog.dismiss();
                        }
                    });
                    textViewArr2[0].setOnClickListener(new M(k1, arrayList2, linkedHashSet2, runnableArr, 5));
                }
            });
            alertDialogCreate.show();
            AbstractC0583w0.l0(alertDialogCreate, 0.0f);
            runnableArr[0].run();
        } catch (Exception e) {
            b.D(e, new StringBuilder("[FishPsDialog] showChannelListPage: "));
        }
    }

    public final void n(boolean z) {
        try {
            Activity activity = InitOrigin.getActivity();
            if (activity == null) {
                return;
            }
            LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
            linearLayoutK.addView(AbstractC0583w0.p(activity, z ? "自定义搜索插件" : "自定义TG频道", "关闭开关即删除"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
            J1 j1 = this.a;
            ArrayList arrayList = new ArrayList(z ? j1.getCustomPlugins() : j1.getCustomChannels());
            int size = arrayList.size();
            boolean[] zArr = new boolean[size];
            for (int i = 0; i < size; i++) {
                zArr[i] = true;
            }
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setOrientation(1);
            if (arrayList.isEmpty()) {
                AbstractC0583w0.l(linearLayout, "暂无自定义");
            } else {
                int i2 = 0;
                while (i2 < arrayList.size()) {
                    AbstractC0583w0.m(linearLayout, (String) arrayList.get(i2), "关闭后删除", z ? AbstractC0583w0.f : AbstractC0583w0.d, true, i2, i2 > 0, null, zArr, null);
                    i2++;
                    zArr = zArr;
                }
            }
            boolean[] zArr2 = zArr;
            linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
            AbstractC0583w0.j0(new AlertDialog.Builder(activity).setView(linearLayoutK).setPositiveButton("保存", new C1(this, arrayList, zArr2, z)).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create());
        } catch (Exception e) {
            b.D(e, new StringBuilder("[FishPsDialog] showCustomTypeDialog: "));
        }
    }

    public final void o() {
        J1 j1 = this.a;
        String[][] panTypes = j1.getPanTypes();
        List enabledTypes = j1.getEnabledTypes();
        boolean[] zArr = new boolean[panTypes.length];
        for (int i = 0; i < panTypes.length; i++) {
            zArr[i] = enabledTypes.contains(panTypes[i][0]);
        }
        InitOrigin.run(new RunnableC0240a0((Object) this, panTypes, zArr, (Object) enabledTypes, 10));
    }

    public final void p() {
        J1 j1 = this.a;
        List<String> enabledTypes = j1.getEnabledTypes();
        if (enabledTypes.isEmpty()) {
            X0.a("请先启用网盘");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : enabledTypes) {
            for (String[] strArr : j1.getPanTypes()) {
                if (strArr[0].equals(str)) {
                    str = strArr[1];
                    break;
                }
            }
            arrayList.add(str);
        }
        InitOrigin.run(new W(this, arrayList, enabledTypes, 7));
    }
}
