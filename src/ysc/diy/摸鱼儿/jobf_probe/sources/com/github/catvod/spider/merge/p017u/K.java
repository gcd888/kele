package com.github.catvod.spider.merge.p017u;

import android.R;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Notice;
import com.github.catvod.spider.merge.A.AbstractC0309x1;
import com.github.catvod.spider.merge.p022z.C0547o3;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class K implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Notice b;

    public /* synthetic */ K(Notice notice, int i) {
        this.a = i;
        this.b = notice;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Notice notice = this.b;
        switch (this.a) {
            case 0:
                notice.getClass();
                try {
                    notice.a();
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 48;
                    C0547o3 c0547o3 = notice.a;
                    Pattern pattern = AbstractC0309x1.a;
                    try {
                        ((ViewGroup) InitOrigin.getActivity().getWindow().getDecorView().findViewById(R.id.content)).addView(c0547o3, layoutParams);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    InitOrigin.run(notice.e, 500);
                    InitOrigin.run(new K(notice, 1), notice.c * 1000);
                } catch (Exception unused) {
                    return;
                }
                break;
            default:
                C0547o3 c0547o4 = notice.a;
                Pattern pattern2 = AbstractC0309x1.a;
                try {
                    ((ViewGroup) InitOrigin.getActivity().getWindow().getDecorView().findViewById(R.id.content)).removeView(c0547o4);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                break;
        }
    }
}
