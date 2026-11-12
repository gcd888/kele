package com.github.catvod.spider;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.C0001;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.E.C0014;
import com.github.catvod.spider.merge.L.C0032;
import com.github.catvod.spider.merge.S.C0043;
import com.github.catvod.spider.merge.S.C0044;
import com.github.catvod.spider.merge.j.C0093;
import com.github.catvod.spider.merge.p001b.C0059;
import com.github.catvod.spider.merge.p006g.C0081;
import com.github.catvod.spider.merge.p022z.F0;
import com.github.catvod.spider.merge.p022z.G0;
import com.github.catvod.spider.merge.q0.C0115;
import com.github.catvod.spider.merge.s0.C0119;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class e implements F0, G0 {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f124short = {24942, -27059, 25773, 18623, 18705, 21570, 31295, 21546, 23544, -24644, 2552, 2784, 17642, 22726, 30395, -2612, 22775, 28528, 32735, 28552, -29547, -30479, 22023, 21860, 31513, 21359, 32402, -32394, -31470, 23524, 22663, 17450, -24961, 26916, 22015, 31618, 23051, 23713, 20689, 1591, 1587, 1575, 1588, 1581, 1685, 1667, 25183, 25335, 28987, 21945, 18708, -27839, 25626, 28547, 22704, -24977, 26932, 17567, -25960, 26744, 31765, 30144, 31817, 30442, 23834, 17564, 22952, -25636, 24415, 28502, 20493, 12961, 15108, -3067, 22846, 28345, 32278, 28225};
    public final /* synthetic */ Market a;

    public /* synthetic */ e(Market market) {
        this.a = market;
    }

    @Override // com.github.catvod.spider.merge.p022z.G0
    public void a(ArrayList arrayList) {
        Pattern pattern = Market.c;
        Market market = this.a;
        market.getClass();
        if (arrayList.isEmpty()) {
            X0.a("未选择任何分类");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ArrayList arrayList3 = market.b;
            if (!zHasNext) {
                arrayList3.removeAll(arrayList2);
                market.p();
                X0.a("已删除 " + arrayList2.size() + " 个分类，刷新生效");
                return;
            }
            arrayList2.add((Market.Category) arrayList3.get(((Integer) it.next()).intValue()));
        }
    }

    @Override // com.github.catvod.spider.merge.p022z.F0
    public void c(int i, String str, String str2, String str3) {
        Pattern pattern = Market.c;
        Market market = this.a;
        market.getClass();
        if (TextUtils.isEmpty(str)) {
            X0.a("请输入分类名称");
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            X0.a("请输入分享链接");
            return;
        }
        ArrayList arrayList = market.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((Market.Category) it.next()).a.equals(str)) {
                X0.a("分类已存在");
                return;
            }
        }
        String strM54 = i == 0 ? "quark" : "uc";
        Market.Category category = new Market.Category(0);
        category.a = str;
        category.b = str2;
        category.c = str3;
        category.a();
        String str4 = category.d;
        if (str4 == null) {
            X0.a("无效的分享链接格式");
            return;
        }
        if (!str4.equals(strM54)) {
            X0.a("链接与选择的网盘类型不匹配");
            return;
        }
        arrayList.add(category);
        market.p();
        X0.a("已添加「" + str + "」，刷新生效");
    }
}
