package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.v1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0579v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ K1 b;

    public /* synthetic */ RunnableC0579v1(K1 k1, int i) {
        this.a = i;
        this.b = k1;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 0;
        final K1 k1 = this.b;
        final int i5 = 1;
        switch (this.a) {
            case 0:
                J1 j1 = k1.a;
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null) {
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                        linearLayoutK.addView(AbstractC0583w0.p(activity, "频道模板来源", "仅用于读取默认频道，不影响多源聚合搜索"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity)));
                        LinearLayout linearLayout = new LinearLayout(activity);
                        linearLayout.setOrientation(1);
                        AlertDialog[] alertDialogArr = new AlertDialog[1];
                        String strJ = k1.j();
                        List visibleApiUrls = j1.getVisibleApiUrls();
                        int i6 = 0;
                        while (i6 < visibleApiUrls.size()) {
                            String str = (String) visibleApiUrls.get(i6);
                            if (j1.isApiEnabled(str)) {
                                String apiName = j1.getApiName(str);
                                StringBuilder sb = new StringBuilder();
                                sb.append(str.equals(strJ) ? "当前 · " : "");
                                sb.append(K1.c(str));
                                AbstractC0583w0.d(linearLayout, apiName, sb.toString(), AbstractC0583w0.c, linearLayout.getChildCount() > 0).setOnClickListener(new K((Object) k1, (Object) alertDialogArr, str, 3));
                                i = 1;
                            } else {
                                i = 1;
                            }
                            i6 += i;
                        }
                        if (linearLayout.getChildCount() == 0) {
                            AbstractC0583w0.l(linearLayout, "请先在API管理里启用接口");
                        }
                        linearLayoutK.addView(AbstractC0583w0.s(activity, linearLayout));
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setView(linearLayoutK).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create();
                        alertDialogArr[0] = alertDialogCreate;
                        AbstractC0583w0.j0(alertDialogCreate);
                    }
                } catch (Exception e) {
                    b.D(e, new StringBuilder("[FishPsDialog] showChannelApiDialog: "));
                    return;
                }
                break;
            case 1:
                k1.n(false);
                break;
            case 2:
                k1.n(true);
                break;
            case 3:
                k1.getClass();
                try {
                    Application applicationContext = InitOrigin.context();
                    List visibleApiUrls2 = k1.a.getVisibleApiUrls();
                    LinearLayout linearLayoutK2 = AbstractC0583w0.K(applicationContext);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.bottomMargin = AbstractC0583w0.Q(12, applicationContext);
                    linearLayoutK2.addView(AbstractC0583w0.p(applicationContext, "删除接口", "共 " + visibleApiUrls2.size() + " 个接口，默认接口删除后可恢复默认找回"), layoutParams);
                    AlertDialog[] alertDialogArr2 = new AlertDialog[1];
                    LinearLayout linearLayout2 = new LinearLayout(applicationContext);
                    linearLayout2.setOrientation(1);
                    if (visibleApiUrls2.isEmpty()) {
                        TextView textView = new TextView(applicationContext);
                        textView.setText("暂无接口");
                        textView.setTextSize(14.0f);
                        textView.setTextColor(AbstractC0583w0.i);
                        textView.setGravity(17);
                        textView.setPadding(0, AbstractC0583w0.Q(16, applicationContext), 0, AbstractC0583w0.Q(16, applicationContext));
                        linearLayout2.addView(textView);
                    } else {
                        for (int i7 = 0; i7 < visibleApiUrls2.size(); i7++) {
                            k1.a(linearLayout2, (String) visibleApiUrls2.get(i7), alertDialogArr2);
                        }
                    }
                    linearLayoutK2.addView(AbstractC0583w0.s(applicationContext, linearLayout2));
                    AlertDialog alertDialogCreate2 = new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK2).setPositiveButton("添加接口", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.z1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) throws Throwable {
                            switch (i3) {
                                case 0:
                                    K1 k2 = k1;
                                    k2.getClass();
                                    InitOrigin.run(new RunnableC0584w1(k2, String.valueOf(System.currentTimeMillis()), 0));
                                    break;
                                case 1:
                                    K1 k3 = k1;
                                    k3.getClass();
                                    InitOrigin.run(new RunnableC0579v1(k3, 3));
                                    break;
                                case 2:
                                    K1 k4 = k1;
                                    k4.getClass();
                                    InitOrigin.run(new RunnableC0584w1(k4, String.valueOf(System.currentTimeMillis()), 0));
                                    break;
                                default:
                                    J1 j2 = k1.a;
                                    if (!j2.getCustomUrls().isEmpty()) {
                                        if (!j2.clearCustomApiUrls()) {
                                            X0.a("至少保留一个启用接口");
                                        } else {
                                            j2.saveConfig();
                                            X0.a("已清空所有自定义节点");
                                        }
                                    }
                                    break;
                            }
                        }
                    }).setNeutralButton("清空自定义", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.z1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) throws Throwable {
                            switch (i2) {
                                case 0:
                                    K1 k2 = k1;
                                    k2.getClass();
                                    InitOrigin.run(new RunnableC0584w1(k2, String.valueOf(System.currentTimeMillis()), 0));
                                    break;
                                case 1:
                                    K1 k3 = k1;
                                    k3.getClass();
                                    InitOrigin.run(new RunnableC0579v1(k3, 3));
                                    break;
                                case 2:
                                    K1 k4 = k1;
                                    k4.getClass();
                                    InitOrigin.run(new RunnableC0584w1(k4, String.valueOf(System.currentTimeMillis()), 0));
                                    break;
                                default:
                                    J1 j2 = k1.a;
                                    if (!j2.getCustomUrls().isEmpty()) {
                                        if (!j2.clearCustomApiUrls()) {
                                            X0.a("至少保留一个启用接口");
                                        } else {
                                            j2.saveConfig();
                                            X0.a("已清空所有自定义节点");
                                        }
                                    }
                                    break;
                            }
                        }
                    }).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create();
                    alertDialogArr2[0] = alertDialogCreate2;
                    AbstractC0583w0.j0(alertDialogCreate2);
                } catch (Exception e2) {
                    b.D(e2, new StringBuilder("[FishPsDialog] showCustomManageDialog: "));
                    return;
                }
                break;
            case 4:
                final K1 k2 = this.b;
                k2.getClass();
                try {
                    final Application applicationContext2 = InitOrigin.context();
                    k2.c.clear();
                    k2.b.clear();
                    List visibleApiUrls3 = k2.a.getVisibleApiUrls();
                    int size = visibleApiUrls3.size();
                    LinearLayout linearLayoutK3 = AbstractC0583w0.K(applicationContext2);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams2.bottomMargin = AbstractC0583w0.Q(12, applicationContext2);
                    linearLayoutK3.addView(AbstractC0583w0.p(applicationContext2, "测速诊断", "测试以下 " + size + " 个接口，搜索只使用已启用接口"), layoutParams2);
                    TextView textViewX = AbstractC0583w0.x(applicationContext2, "测试节点速度", AbstractC0583w0.d);
                    k2.e = textViewX;
                    textViewX.setFocusable(true);
                    k2.e.setClickable(true);
                    final GradientDrawable[] gradientDrawableArr = {(GradientDrawable) k2.e.getBackground()};
                    k2.e.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.github.catvod.spider.merge.z.y1
                        @Override // android.view.View.OnFocusChangeListener
                        public final void onFocusChange(View view, boolean z) {
                            K1 k3 = k2;
                            if (k3.e.isEnabled()) {
                                GradientDrawable gradientDrawable = new GradientDrawable();
                                Context context = applicationContext2;
                                gradientDrawable.setCornerRadius(AbstractC0583w0.Q(10, context));
                                gradientDrawable.setColor(AbstractC0583w0.d);
                                gradientDrawable.setStroke(z ? AbstractC0583w0.Q(2, context) : 0, AbstractC0583w0.c);
                                k3.e.setBackground(gradientDrawable);
                                gradientDrawableArr[0] = gradientDrawable;
                            }
                        }
                    });
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.bottomMargin = AbstractC0583w0.Q(12, applicationContext2);
                    linearLayoutK3.addView(k2.e, layoutParams3);
                    LinearLayout linearLayout3 = new LinearLayout(applicationContext2);
                    k2.d = linearLayout3;
                    linearLayout3.setOrientation(1);
                    linearLayoutK3.addView(AbstractC0583w0.s(applicationContext2, k2.d));
                    k2.k(applicationContext2, visibleApiUrls3);
                    k2.e.setOnClickListener(new M(k2, applicationContext2, visibleApiUrls3, gradientDrawableArr, 4));
                    AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(linearLayoutK3).setPositiveButton("添加", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.z1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) throws Throwable {
                            switch (i4) {
                                case 0:
                                    K1 k3 = k2;
                                    k3.getClass();
                                    InitOrigin.run(new RunnableC0584w1(k3, String.valueOf(System.currentTimeMillis()), 0));
                                    break;
                                case 1:
                                    K1 k4 = k2;
                                    k4.getClass();
                                    InitOrigin.run(new RunnableC0579v1(k4, 3));
                                    break;
                                case 2:
                                    K1 k5 = k2;
                                    k5.getClass();
                                    InitOrigin.run(new RunnableC0584w1(k5, String.valueOf(System.currentTimeMillis()), 0));
                                    break;
                                default:
                                    J1 j2 = k2.a;
                                    if (!j2.getCustomUrls().isEmpty()) {
                                        if (!j2.clearCustomApiUrls()) {
                                            X0.a("至少保留一个启用接口");
                                        } else {
                                            j2.saveConfig();
                                            X0.a("已清空所有自定义节点");
                                        }
                                    }
                                    break;
                            }
                        }
                    }).setNeutralButton("删除", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.z1
                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i8) throws Throwable {
                            switch (i5) {
                                case 0:
                                    K1 k3 = k2;
                                    k3.getClass();
                                    InitOrigin.run(new RunnableC0584w1(k3, String.valueOf(System.currentTimeMillis()), 0));
                                    break;
                                case 1:
                                    K1 k4 = k2;
                                    k4.getClass();
                                    InitOrigin.run(new RunnableC0579v1(k4, 3));
                                    break;
                                case 2:
                                    K1 k5 = k2;
                                    k5.getClass();
                                    InitOrigin.run(new RunnableC0584w1(k5, String.valueOf(System.currentTimeMillis()), 0));
                                    break;
                                default:
                                    J1 j2 = k2.a;
                                    if (!j2.getCustomUrls().isEmpty()) {
                                        if (!j2.clearCustomApiUrls()) {
                                            X0.a("至少保留一个启用接口");
                                        } else {
                                            j2.saveConfig();
                                            X0.a("已清空所有自定义节点");
                                        }
                                    }
                                    break;
                            }
                        }
                    }).setNegativeButton("关闭", (DialogInterface.OnClickListener) null).create());
                } catch (Exception e3) {
                    b.D(e3, new StringBuilder("[FishPsDialog] showSiteDialog: "));
                    return;
                }
                break;
            case 5:
                k1.getClass();
                InitOrigin.run(new RunnableC0579v1(k1, i4));
                break;
            case 6:
                k1.l(false);
                break;
            case 7:
                k1.l(true);
                break;
            case 8:
                StringBuilder sb2 = new StringBuilder("已添加 ");
                J1 j2 = k1.a;
                sb2.append(j2.getCustomChannels().size());
                sb2.append(" 个");
                P1.K0("自定义管理", k1.b(), new String[]{"自定义TG频道", "自定义搜索插件"}, new String[]{sb2.toString(), "已添加 " + j2.getCustomPlugins().size() + " 个"}, new int[]{AbstractC0583w0.d, AbstractC0583w0.f}, new Runnable[]{new RunnableC0579v1(k1, i5), new RunnableC0579v1(k1, i3)});
                break;
            case 9:
                k1.getClass();
                InitOrigin.run(new RunnableC0584w1(k1, String.valueOf(System.currentTimeMillis()), i5));
                break;
            default:
                J1 j3 = k1.a;
                j3.getCustomChannels().clear();
                j3.getCustomPlugins().clear();
                k1.i(new LinkedHashSet(), new LinkedHashSet());
                X0.a("已恢复全源");
                break;
        }
    }
}
