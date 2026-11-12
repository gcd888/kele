package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.merge.A.X0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0564s1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ K1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;
    public final /* synthetic */ List e;

    public /* synthetic */ RunnableC0564s1(K1 k1, String str, ArrayList arrayList, ArrayList arrayList2) {
        this.b = k1;
        this.c = str;
        this.d = arrayList;
        this.e = arrayList2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.a) {
            case 0:
                final List list = this.d;
                final List list2 = this.e;
                final String str = this.c;
                final K1 k1 = this.b;
                k1.getClass();
                try {
                    Activity activity = InitOrigin.getActivity();
                    if (activity != null) {
                        LinearLayout linearLayoutK = AbstractC0583w0.K(activity);
                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams.bottomMargin = AbstractC0583w0.Q(12, activity);
                        linearLayoutK.addView(AbstractC0583w0.p(activity, "关键词设置", "包含词用于加严结果，屏蔽词用于过滤不想看的资源"), layoutParams);
                        int i = AbstractC0583w0.c;
                        TextView textViewX = AbstractC0583w0.x(activity, "扫码输入", i);
                        textViewX.setGravity(17);
                        textViewX.setFocusable(true);
                        AbstractC0583w0.n(textViewX, i);
                        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams2.bottomMargin = AbstractC0583w0.Q(8, activity);
                        linearLayoutK.addView(textViewX, layoutParams2);
                        LinearLayout linearLayoutY = AbstractC0583w0.y(activity);
                        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                        layoutParams3.topMargin = AbstractC0583w0.Q(8, activity);
                        AbstractC0583w0.g(linearLayoutY, "包含关键词");
                        final EditText editTextF = AbstractC0583w0.f(linearLayoutY, "高码,HDR,蓝光", K1.d(list), true);
                        AbstractC0583w0.g(linearLayoutY, "屏蔽词");
                        final EditText editTextF2 = AbstractC0583w0.f(linearLayoutY, "枪版,预告,花絮,解说", K1.d(list2), true);
                        linearLayoutK.addView(linearLayoutY, layoutParams3);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("确定", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.t1
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i2) {
                                K1 k2 = k1;
                                k2.getClass();
                                P1.H1(str);
                                ArrayList arrayListH = K1.h(editTextF.getText().toString());
                                ArrayList arrayListH2 = K1.h(editTextF2.getText().toString());
                                List list3 = list;
                                list3.clear();
                                list3.addAll(arrayListH);
                                List list4 = list2;
                                list4.clear();
                                list4.addAll(arrayListH2);
                                k2.a.saveConfig();
                                X0.a("关键词设置已保存");
                            }
                        }).setNeutralButton("全部清除", new DialogInterfaceOnClickListenerC0562s(k1, str, list, list2, 1)).setNegativeButton("取消", new D1(str, 2)).setOnCancelListener(new O(str, 2)).create();
                        textViewX.setOnClickListener(new ViewOnClickListenerC0574u1(str, i, 0));
                        P1.w(str, new String[]{"include", "exclude"}, new EditText[]{editTextF, editTextF2}, null);
                        AbstractC0583w0.j0(alertDialogCreate);
                    }
                } catch (Exception e) {
                    SpiderDebug.log("[FishPsDialog] showKeywordDialog: " + e.getMessage());
                    X0.a("显示失败");
                    return;
                }
                break;
            default:
                K1 k2 = this.b;
                J1 j1 = k2.a;
                j1.setChannelApiUrl(this.c);
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.d);
                linkedHashSet.addAll(j1.getCustomChannels());
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(this.e);
                linkedHashSet2.addAll(j1.getCustomPlugins());
                k2.i(linkedHashSet, linkedHashSet2);
                X0.a("已读取并全选频道模板");
                break;
        }
    }

    public /* synthetic */ RunnableC0564s1(K1 k1, List list, List list2, String str) {
        this.b = k1;
        this.d = list;
        this.e = list2;
        this.c = str;
    }
}
