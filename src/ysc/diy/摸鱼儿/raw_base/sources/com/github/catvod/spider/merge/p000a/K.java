package com.github.catvod.spider.merge.p000a;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final class K {
    public final byte[] a;
    public final JSONObject b;

    public K(byte[] bArr) {
        this.a = (byte[]) bArr.clone();
        this.b = null;
    }

    public K(JSONObject jSONObject) throws IOException {
        this.a = T.h(jSONObject.optString("bg", ""));
        jSONObject.optString("challenge_id", "");
        try {
            this.b = new JSONObject(jSONObject.toString());
        } catch (JSONException e) {
            throw new IOException("invalid slider challenge", e);
        }
    }
}
