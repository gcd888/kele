package com.github.catvod.spider.merge.p005f;

import android.text.TextUtils;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p001b.k;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public class w {

    @SerializedName("bvid")
    private String a;

    @SerializedName("aid")
    private String b;

    @SerializedName("title")
    private String c;

    @SerializedName("pic")
    private String d;

    @SerializedName("duration")
    private String e;

    @SerializedName("length")
    private String f;

    @SerializedName("season_id")
    private String g;

    @SerializedName("cover")
    private String h;

    @SerializedName("index_show")
    private String i;

    @SerializedName("media_score")
    private u j;

    public static List a(JsonElement jsonElement) {
        return (List) new Gson().fromJson(jsonElement, new v().getType());
    }

    public final String b() {
        return TextUtils.isEmpty(this.b) ? "" : this.b;
    }

    public final String c() {
        return TextUtils.isEmpty(this.a) ? "" : this.a;
    }

    public final k d() {
        if (TextUtils.isEmpty(this.g)) {
            return null;
        }
        k kVar = new k();
        kVar.n("season_" + this.g);
        kVar.o(X1.L(TextUtils.isEmpty(this.c) ? "" : this.c, "").T());
        String strE = TextUtils.isEmpty(this.h) ? e() : this.h;
        if (strE.startsWith("//")) {
            strE = "https:".concat(strE);
        }
        kVar.p(strE);
        String string = !TextUtils.isEmpty(this.i) ? this.i : "";
        u uVar = this.j;
        if (uVar != null && uVar.a > 0.0d) {
            StringBuilder sb = new StringBuilder();
            sb.append(string.isEmpty() ? "" : string.concat(" "));
            sb.append(this.j.a);
            sb.append("分");
            string = sb.toString();
        }
        kVar.s(string);
        return kVar;
    }

    public final String e() {
        return TextUtils.isEmpty(this.d) ? "" : this.d;
    }

    public final k f() {
        String strE;
        String str;
        k kVar = new k();
        kVar.n(c() + "@" + b());
        String str2 = "";
        kVar.o(X1.L(TextUtils.isEmpty(this.c) ? "" : this.c, "").T());
        if (e().startsWith("//")) {
            strE = "https:" + e();
        } else {
            strE = e();
        }
        kVar.p(strE);
        if (!TextUtils.isEmpty(this.e)) {
            try {
                if (this.e.contains(":")) {
                    String[] strArrSplit = this.e.split(":");
                    if (strArrSplit.length > 0) {
                        str = strArrSplit[0] + "分鐘";
                    } else {
                        str = this.e;
                    }
                    str2 = str;
                } else {
                    int i = Integer.parseInt(this.e);
                    if (i < 60) {
                        str2 = this.e + "秒";
                    } else {
                        str2 = (i / 60) + "分鐘";
                    }
                }
            } catch (Exception unused) {
                str2 = this.e;
            }
        } else if (!TextUtils.isEmpty(this.f)) {
            str2 = this.f;
        }
        kVar.s(str2);
        return kVar;
    }
}
