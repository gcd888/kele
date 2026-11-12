package com.github.catvod.spider.merge.p022z;

import android.app.Dialog;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.A.X0;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class W3 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ W3(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((View.OnClickListener) this.b).onClick((EditText) this.c);
                break;
            case 1:
                LinearLayout[] linearLayoutArr = (LinearLayout[]) this.c;
                h4.l((ImageView) this.b, linearLayoutArr[0], linearLayoutArr[1]);
                break;
            default:
                String[] strArr = (String[]) this.b;
                final String str = strArr[0];
                final String str2 = strArr[1];
                final String str3 = strArr[2];
                final String str4 = strArr[3];
                final String str5 = strArr[4];
                if (TextUtils.isEmpty(str)) {
                    X0.a("图片地址为空");
                } else {
                    final long jBeginSelectedUpdate = Wallpaper.beginSelectedUpdate();
                    X0.a("正在设置...");
                    InitOrigin.execute(new Runnable() { // from class: com.github.catvod.spider.merge.z.d4
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str6 = str;
                            long j = jBeginSelectedUpdate;
                            String str7 = str2;
                            String str8 = str3;
                            String str9 = str4;
                            String str10 = str5;
                            Handler handler = h4.a;
                            try {
                                byte[] bArrF = h4.f(str6);
                                if (bArrF == null || bArrF.length == 0) {
                                    handler.post(new e4(0));
                                } else if (Wallpaper.saveSelected(j, bArrF, str6, str7, str8, str9, str10)) {
                                    handler.post(new e4(1));
                                }
                            } catch (Exception e) {
                                SpiderDebug.log("[WallpaperDialog] applyWallpaperFromUrl error: " + e.getMessage());
                                handler.post(new e4(3));
                            }
                        }
                    });
                }
                Dialog dialog = (Dialog) this.c;
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
        }
    }
}
