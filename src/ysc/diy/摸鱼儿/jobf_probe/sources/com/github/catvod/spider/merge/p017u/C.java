package com.github.catvod.spider.merge.p017u;

import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.KaiFan;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;
import com.github.catvod.spider.merge.p021y.i;
import com.github.catvod.spider.merge.p021y.k;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import com.github.catvod.spider.merge.p022z.F0;
import com.github.catvod.spider.merge.p022z.G0;
import com.github.catvod.spider.merge.p022z.InterfaceC0578v0;
import com.github.catvod.spider.merge.p022z.R3;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Dns;
import okhttp3.Request;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class C implements Dns, G0, F0, InterfaceC0578v0, R3 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ C(Object obj, Object obj2) {
        this.b = obj;
        this.a = obj2;
    }

    @Override // com.github.catvod.spider.merge.p022z.G0
    public void a(ArrayList arrayList) {
        k kVar = (k) this.b;
        kVar.getClass();
        if (arrayList.isEmpty()) {
            X0.a("未选择任何分享");
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (iIntValue >= 0) {
                List list = (List) this.a;
                if (iIntValue < list.size()) {
                    i iVar = (i) list.get(iIntValue);
                    if (iVar.d) {
                        kVar.d.add(iVar.a());
                    } else {
                        kVar.c.remove(iVar);
                    }
                }
            }
        }
        kVar.o();
        kVar.q();
        X0.a("已删除 " + arrayList.size() + " 个分享，刷新生效");
    }

    @Override // com.github.catvod.spider.merge.p022z.R3
    public void b(boolean z) {
        LinearLayout linearLayout = (LinearLayout) this.b;
        StringBuilder sb = new StringBuilder();
        sb.append((String) this.a);
        sb.append(z ? " · 运行中" : " · 未启动 · 播放回退Java代理");
        String string = sb.toString();
        String str = z ? "正常" : "停止";
        int i = z ? AbstractC0583w0.d : AbstractC0583w0.h;
        try {
            TextView textView = (TextView) ((LinearLayout) linearLayout.getChildAt(0)).getChildAt(1);
            textView.setText(string);
            textView.setTextColor(i);
            TextView textView2 = (TextView) linearLayout.getChildAt(1);
            textView2.setText(str);
            textView2.setBackground(AbstractC0583w0.L(linearLayout.getContext(), i, 12));
        } catch (Exception unused) {
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.F0
    public void c(int i, String str, String str2, String str3) {
        k kVar = (k) this.b;
        kVar.getClass();
        String strTrim = "";
        String strTrim2 = str == null ? "" : str.trim();
        if (strTrim2.isEmpty()) {
            X0.a("请输入分享名称");
            return;
        }
        boolean zIsEmpty = TextUtils.isEmpty(str2);
        String str4 = (String) this.a;
        if (!zIsEmpty) {
            String strTrim3 = str2.trim();
            strTrim = str3 != null ? str3.trim() : "";
            String lowerCase = strTrim3.toLowerCase();
            boolean z = lowerCase.contains("pwd=") || lowerCase.contains("password=") || strTrim3.contains("提取码") || strTrim3.contains("访问码");
            if (!strTrim.isEmpty() && !z) {
                if ("tianyi".equals(str4) && (strTrim3.startsWith("http://") || strTrim3.startsWith("https://"))) {
                    strTrim3 = b.C(strTrim3, " 访问码:", strTrim);
                } else {
                    String str5 = "115".equals(str4) ? "password" : "pwd";
                    StringBuilder sbO = b.o(strTrim3);
                    sbO.append(strTrim3.contains("?") ? "&" : "?");
                    sbO.append(str5);
                    sbO.append("=");
                    sbO.append(strTrim);
                    strTrim3 = sbO.toString();
                }
            }
            strTrim = k.c(str4, strTrim3);
        }
        if (strTrim.isEmpty()) {
            X0.a("分享链接无效或与网盘类型不匹配");
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr = k.g;
        for (int i2 = 0; i2 < 9; i2++) {
            List list = (List) kVar.b.get(strArr[i2]);
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((i) it.next()).b.equals(strTrim)) {
                X0.a("该分享已存在");
                return;
            }
        }
        kVar.c.add(new i(str4, strTrim, strTrim2, false));
        kVar.o();
        kVar.q();
        X0.a("已添加「" + strTrim2 + "」，刷新生效");
    }

    public void d(String str) {
        TextView textView = (TextView) this.b;
        if (textView == null) {
            return;
        }
        String str2 = (String) this.a;
        textView.setText(str != null ? b.C(str2, "备份 · 最近备份：", str) : b.i(str2, "备份 · 尚未备份，点击下方备份"));
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0578v0
    public void g(int i, boolean z) {
        ArrayList arrayList = (ArrayList) this.b;
        String str = (String) this.a;
        if (z && !arrayList.contains(str)) {
            arrayList.add(str);
        } else {
            if (z) {
                return;
            }
            arrayList.remove(str);
        }
    }

    public List lookup(String str) throws UnknownHostException {
        List list = KaiFan.i;
        if (str.equals(((Request) this.b).url().host())) {
            return (List) this.a;
        }
        throw new UnknownHostException("请求域名发生变化");
    }
}
