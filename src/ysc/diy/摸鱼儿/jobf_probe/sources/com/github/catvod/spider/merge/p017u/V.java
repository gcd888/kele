package com.github.catvod.spider.merge.p017u;

import android.content.DialogInterface;
import com.github.catvod.spider.FishConfig;
import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.WoNiu;
import com.github.catvod.spider.merge.A.C0297t1;
import com.github.catvod.spider.merge.A.U0;
import com.github.catvod.spider.merge.A.V0;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.A.k2;
import com.github.catvod.spider.merge.p021y.b;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class V implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;

    public /* synthetic */ V(int[] iArr, int i) {
        this.a = i;
        this.b = iArr;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        boolean z;
        switch (this.a) {
            case 0:
                Pattern pattern = WoNiu.v;
                int i2 = this.b[0] + 1;
                String strValueOf = String.valueOf(i2);
                boolean z2 = FishCrypto.a;
                C0297t1.j("woniu_extract_count", strValueOf);
                X0.a("每次解析前 " + i2 + " 条搜索结果");
                break;
            case 1:
                Pattern pattern2 = WoNiu.v;
                z = this.b[0] == 0;
                String str = z ? "1" : "0";
                boolean z3 = FishCrypto.a;
                C0297t1.j("woniu_search_folder", str);
                X0.a(z ? "完整搜索已切换为文件夹解析" : "搜索已切换为原站列表");
                break;
            case 2:
                String[] strArr = b.d;
                int[] iArr = this.b;
                C0297t1.j("local_file_sort", strArr[iArr[0]]);
                X0.a("文件排序已设置为 " + b.b[iArr[0]]);
                break;
            case 3:
                z = this.b[0] == 1;
                k2.s();
                String str2 = z ? "quark" : "webdav";
                if (!str2.equals(C0297t1.h("smart_history_sync_backend"))) {
                    k2.D(new V0(str2, 5));
                    if (k2.o() && k2.l()) {
                        k2.B(false, false);
                    }
                }
                X0.a("云端备份方式已切换为".concat(k2.i(z)));
                FishConfig.refreshAllStatus();
                break;
            default:
                z = this.b[0] == 0;
                String[] strArr2 = U0.a;
                C0297t1.j("fish_config_light_mode", z ? "1" : "0");
                X0.a(U0.i() ? "已切换到轻量模式" : "已切换到完整模式");
                break;
        }
    }
}
