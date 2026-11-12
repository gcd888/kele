package com.github.catvod.spider.merge.p017u;

import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.WoNiu;
import com.github.catvod.spider.merge.A.InterfaceC0245c;
import com.github.catvod.spider.merge.p022z.InterfaceC0549p0;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class X implements InterfaceC0245c, InterfaceC0549p0 {
    public final /* synthetic */ WoNiu a;

    public /* synthetic */ X(WoNiu woNiu) {
        this.a = woNiu;
    }

    @Override // com.github.catvod.spider.merge.p022z.InterfaceC0549p0
    public void b(String str, String str2) {
        Pattern pattern = WoNiu.v;
        WoNiu woNiu = this.a;
        woNiu.getClass();
        InitOrigin.execute(new W(woNiu, str, str2, 0));
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0245c
    public String dispatch(String str) {
        return this.a.action(str);
    }
}
