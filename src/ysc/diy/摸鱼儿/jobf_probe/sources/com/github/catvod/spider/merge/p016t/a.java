package com.github.catvod.spider.merge.p016t;

import com.github.catvod.spider.FishDrive;
import com.github.catvod.spider.Guazi;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class a implements HostnameVerifier {
    public final /* synthetic */ int a;

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        switch (this.a) {
            case 1:
                JSONObject jSONObject = FishDrive.f;
            case 0:
                return true;
            default:
                String[] strArr = Guazi.i;
                return true;
        }
    }
}
