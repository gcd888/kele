package com.github.catvod.spider.merge.p022z;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.ProxyOrigin;
import com.github.catvod.spider.merge.A.AbstractC0303v1;
import com.github.catvod.spider.merge.A.RunnableC0242b;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p017u.AbstractC0449a;
import com.github.catvod.spider.merge.p017u.W;
import com.github.catvod.spider.merge.p018v.f;
import com.github.catvod.spider.merge.p019w.a;
import java.lang.reflect.InvocationTargetException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0553q implements Runnable {
    public final /* synthetic */ int a = 4;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ RunnableC0553q(int i, String[] strArr, String str, String str2, F0 f0) {
        this.d = i;
        this.c = strArr;
        this.b = str;
        this.e = str2;
        this.f = f0;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Activity activity;
        int i = 13;
        int i2 = 4;
        String string = "";
        String str = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.c;
        switch (this.a) {
            case 0:
                View view = (View) obj3;
                if (view.isAttachedToWindow()) {
                    view.setEnabled(true);
                    List list = (List) obj2;
                    if (list.isEmpty()) {
                        X0.a("未获取到模型列表");
                    } else {
                        String[] strArr = (String[]) list.toArray(new String[0]);
                        String[] strArr2 = new String[strArr.length];
                        int[] iArr = new int[strArr.length];
                        Runnable[] runnableArr = new Runnable[strArr.length];
                        for (int i3 = 0; i3 < strArr.length; i3++) {
                            String str2 = strArr[i3];
                            boolean zEquals = str2.equals(str);
                            strArr2[i3] = zEquals ? "当前使用" : "点击选择";
                            iArr[i3] = zEquals ? AbstractC0583w0.d : this.d;
                            runnableArr[i3] = new RunnableC0242b((C0572u) obj, str2, i);
                        }
                        P1.K0("选择模型", b.l(new StringBuilder(), strArr.length, " 个可用模型"), strArr, strArr2, iArr, runnableArr);
                    }
                    break;
                }
                break;
            case 1:
                String str3 = (String) obj2;
                String str4 = (String) obj;
                final View view2 = (View) obj3;
                final int i4 = this.d;
                try {
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    final String strH = AbstractC0303v1.h(str, str3, str4);
                    InitOrigin.run(new Runnable() { // from class: com.github.catvod.spider.merge.z.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            View view3 = view2;
                            if (view3.isAttachedToWindow()) {
                                view3.setEnabled(true);
                                P1.s1(i4, System.currentTimeMillis() - jCurrentTimeMillis, strH, true);
                            }
                        }
                    });
                } catch (Exception e) {
                    InitOrigin.run(new f(view2, e, i4));
                    return;
                }
                break;
            case 2:
                String str5 = this.b;
                String str6 = (String) obj3;
                int i5 = this.d;
                String str7 = (String) obj2;
                Runnable runnable = (Runnable) obj;
                try {
                    activity = InitOrigin.getActivity();
                } catch (Exception unused) {
                    activity = null;
                }
                if (activity == null) {
                    X0.a("请在应用界面中操作");
                } else {
                    try {
                        int i6 = AbstractC0583w0.a;
                        AbstractC0583w0.j0(AbstractC0583w0.r(activity, str5, str6, i5, null, null, new String[]{str7, "取消"}, new Runnable[]{runnable, null}));
                    } catch (Exception unused2) {
                        X0.a("显示账号操作失败");
                        return;
                    }
                }
                break;
            case 3:
                final F0 f0 = (F0) obj2;
                final int i7 = this.d;
                try {
                    Activity activity2 = InitOrigin.getActivity();
                    if (activity2 != null && !activity2.isFinishing()) {
                        try {
                            LinearLayout linearLayoutK = AbstractC0583w0.K(activity2);
                            linearLayoutK.addView(AbstractC0583w0.p(activity2, "添加" + str, "填写分享名称、链接和提取码"), AbstractC0583w0.c0(AbstractC0583w0.Q(12, activity2)));
                            LinearLayout linearLayoutY = AbstractC0583w0.y(activity2);
                            AbstractC0583w0.g(linearLayoutY, "分享名称");
                            final EditText editTextF = AbstractC0583w0.f(linearLayoutY, "例如：我的资源", "", false);
                            AbstractC0583w0.g(linearLayoutY, "分享链接");
                            final EditText editTextF2 = AbstractC0583w0.f(linearLayoutY, "https://pan.quark.cn/s/xxx", "", false);
                            AbstractC0583w0.g(linearLayoutY, "提取码");
                            final EditText editTextF3 = AbstractC0583w0.f(linearLayoutY, "无密码留空", "", false);
                            AbstractC0583w0.l(linearLayoutY, "请填写所选网盘的分享链接。");
                            linearLayoutK.addView(linearLayoutY);
                            String str8 = (String) obj3;
                            if (str8 != null) {
                                try {
                                    P1.w(str8, new String[]{"name", "url", "pwd"}, new EditText[]{editTextF, editTextF2, editTextF3}, null);
                                    break;
                                } catch (Exception unused3) {
                                }
                            }
                            final a aVar = new a(str8, 5);
                            AlertDialog.Builder onCancelListener = new AlertDialog.Builder(activity2).setView(AbstractC0583w0.q0(linearLayoutK)).setPositiveButton("添加", new DialogInterface.OnClickListener() { // from class: com.github.catvod.spider.merge.z.B0
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i8) {
                                    aVar.run();
                                    F0 f1 = f0;
                                    if (f1 != null) {
                                        f1.c(i7, AbstractC0449a.e(editTextF), AbstractC0449a.e(editTextF2), AbstractC0449a.e(editTextF3));
                                    }
                                }
                            }).setNegativeButton("取消", new E(aVar, 4)).setOnCancelListener(new C0(aVar, 0));
                            String str9 = (String) obj;
                            boolean z = (str8 == null || str9 == null) ? false : true;
                            if (z) {
                                onCancelListener.setNeutralButton("扫码输入", (DialogInterface.OnClickListener) null);
                            }
                            AlertDialog alertDialogCreate = onCancelListener.create();
                            AbstractC0583w0.j0(alertDialogCreate);
                            if (z) {
                                alertDialogCreate.getButton(-3).setOnClickListener(new K((Object) str, (Object) str8, (Object) str9, 2));
                            }
                        } catch (Exception e2) {
                            b.D(e2, new StringBuilder("[DownloadDialog] showAddCategory error: "));
                            return;
                        }
                        break;
                    }
                } catch (Exception unused4) {
                    return;
                }
                break;
            case 4:
                int i8 = this.d;
                InitOrigin.run(new RunnableC0553q(((String[]) obj3)[i8], this.b, (F0) obj, i8, (String) obj2));
                break;
            case 5:
                String str10 = (String) obj3;
                try {
                    String strF0 = P1.f0();
                    int port = ProxyOrigin.getPort();
                    if (port > 0 && port <= 65535) {
                        StringBuilder sb = new StringBuilder("http://");
                        sb.append(strF0);
                        sb.append(":");
                        sb.append(port);
                        sb.append("/proxy?do=config&action=page&sid=");
                        sb.append(str);
                        sb.append("&title=");
                        sb.append(URLEncoder.encode(str10 != null ? str10 : "输入配置", "UTF-8"));
                        String str11 = (String) obj2;
                        if (str11 != null && !str11.isEmpty()) {
                            sb.append("&fields=");
                            sb.append(URLEncoder.encode(str11, "UTF-8"));
                        }
                        string = sb.toString();
                    }
                    break;
                } catch (Exception unused5) {
                }
                String str12 = string;
                if (str12.isEmpty()) {
                    InitOrigin.run(new U2(i2));
                } else {
                    P1.Z0(str10, (String) obj, str12, this.d, null, new a(str, i), null);
                }
                break;
            default:
                byte[] bArr = (byte[]) obj3;
                String str13 = this.b;
                String str14 = (String) obj2;
                int i9 = this.d;
                Runnable runnable2 = (Runnable) obj;
                try {
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    if (bitmapDecodeByteArray == null) {
                        P1.U(runnable2, "二维码生成失败", null);
                    } else {
                        InitOrigin.run(new W(str13, str14, bitmapDecodeByteArray, i9, runnable2));
                    }
                } catch (Exception unused6) {
                    P1.U(runnable2, "二维码解码失败", null);
                    return;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0553q(View view, ArrayList arrayList, String str, int i, C0572u c0572u) {
        this.c = view;
        this.e = arrayList;
        this.b = str;
        this.d = i;
        this.f = c0572u;
    }

    public /* synthetic */ RunnableC0553q(String str, String str2, int i, String str3, Runnable runnable) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = runnable;
    }

    public /* synthetic */ RunnableC0553q(String str, String str2, F0 f0, int i, String str3) {
        this.b = str;
        this.c = str2;
        this.e = f0;
        this.d = i;
        this.f = str3;
    }

    public /* synthetic */ RunnableC0553q(String str, String str2, String str3, View view, int i) {
        this.b = str;
        this.e = str2;
        this.f = str3;
        this.c = view;
        this.d = i;
    }

    public /* synthetic */ RunnableC0553q(String str, String str2, String str3, String str4, int i) {
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.f = str4;
        this.d = i;
    }

    public /* synthetic */ RunnableC0553q(byte[] bArr, String str, String str2, int i, Runnable runnable) {
        this.c = bArr;
        this.b = str;
        this.e = str2;
        this.d = i;
        this.f = runnable;
    }
}
