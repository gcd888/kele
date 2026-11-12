package com.github.catvod.spider;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.Base64;
import android.util.TypedValue;
import android.widget.Scroller;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.D.C0011;
import com.github.catvod.spider.merge.F.C0017;
import com.github.catvod.spider.merge.F.C0018;
import com.github.catvod.spider.merge.f0.C0079;
import com.github.catvod.spider.merge.p017u.K;
import com.github.catvod.spider.merge.p022z.C0547o3;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class Notice extends Spider {

    /* JADX INFO: renamed from: short, reason: not valid java name */
    private static final short[] f73short = {2068, 2068, 2068, 2068, 2080, 2080, 2057, 2057, 2085, 2085, 2048, 2048, 2078, 2078, 2346, 2358, 2358, 2354, 433, 431, 443, 1183, 1166, 1161, 1178, 1167, 1170, 1172, 1173, 2748, 2745, 2732, 2749, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1227, 1011, 1012, 1014, 1022, 984, 1012, 1013, 1007, 1022, 1013, 1007};
    public C0547o3 a;
    public String b;
    public int c;
    public String d;
    public final Runnable e = new Runnable() { // from class: com.github.catvod.spider.Notice.1
        @Override // java.lang.Runnable
        public void run() {
            Random random = new Random();
            Notice notice = Notice.this;
            notice.a.setTextColor(Color.argb(255, random.nextInt(128), random.nextInt(128), random.nextInt(128)));
            InitOrigin.run(notice.e, 500);
        }
    };

    private /* synthetic */ String $host$1b26b551389a5dab(boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(C0018.m70(f73short, 0, 14, 2157), Locale.getDefault());
        JSONObject jSONObject = new JSONObject(this.b.startsWith(C0011.m42(f73short, 14, 4, 2370)) ? X1.X(this.b, null, null) : new String(Base64.decode(this.b, 0)));
        this.d = jSONObject.optString(C0079.m314(f73short, 18, 3, 476));
        this.c = jSONObject.optInt(C0018.m70(f73short, 21, 8, 1275), 30);
        String strOptString = jSONObject.optString(C0017.m65(f73short, 29, 4, 2776));
        if (this.d.length() <= 0) {
            return "";
        }
        if (!strOptString.isEmpty() && !new Date().after(simpleDateFormat.parse(strOptString))) {
            return "";
        }
        InitOrigin.run(new K(this, 0), 500);
        return "";
    }

    public static void show(String str) {
        try {
            Notice notice = new Notice();
            notice.init(null, str);
            notice.homeContent(false);
        } catch (Exception unused) {
        }
    }

    public final void a() {
        int iApplyDimension;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            sb.append(C0142.m567(f73short, 33, 40, 1259));
            sb.append(this.d);
        }
        C0547o3 c0547o3 = new C0547o3(InitOrigin.context());
        this.a = c0547o3;
        c0547o3.setTextSize(20.0f);
        C0547o3 c0547o4 = this.a;
        c0547o4.b = this.c;
        c0547o4.setText(sb.toString());
        this.a.setTypeface(null, 1);
        C0547o3 c0547o5 = this.a;
        int iApplyDimension2 = 16;
        float f = 16;
        try {
            iApplyDimension = (int) TypedValue.applyDimension(1, f, InitOrigin.context().getResources().getDisplayMetrics());
        } catch (Exception unused) {
            iApplyDimension = 16;
        }
        try {
            iApplyDimension2 = (int) TypedValue.applyDimension(1, f, InitOrigin.context().getResources().getDisplayMetrics());
        } catch (Exception unused2) {
        }
        c0547o5.setPadding(0, iApplyDimension, 0, iApplyDimension2);
        this.a.setBackgroundColor(Color.argb(200, 255, 255, 255));
        C0547o3 c0547o6 = this.a;
        Scroller scroller = c0547o6.a;
        int i2 = -c0547o6.getWidth();
        TextPaint paint = c0547o6.getPaint();
        Rect rect = new Rect();
        String string = c0547o6.getText().toString();
        paint.getTextBounds(string, 0, string.length(), rect);
        scroller.startScroll(i2, 0, c0547o6.getWidth() + rect.width(), 0, c0547o6.b * 1000);
    }

    public String homeContent(boolean z) {
        String strBeginHostEntry = FishCrypto.beginHostEntry(this, C0011.m42(f73short, 73, 11, 923));
        if (strBeginHostEntry != null) {
            return strBeginHostEntry;
        }
        try {
            String str$host$1b26b551389a5dab = $host$1b26b551389a5dab(z);
            FishCrypto.endHostEntry(null);
            return str$host$1b26b551389a5dab;
        } catch (Throwable th) {
            FishCrypto.endHostEntry(th);
            throw th;
        }
    }

    public void init(Context context, String str) {
        Init.init(context);
        this.b = str;
    }
}
