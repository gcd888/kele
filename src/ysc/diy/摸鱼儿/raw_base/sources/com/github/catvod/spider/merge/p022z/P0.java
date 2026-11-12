package com.github.catvod.spider.merge.p022z;

import com.github.catvod.spider.merge.p007h.a;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public interface P0 {
    void clearAllEmbyCache();

    void clearEmbyCache(String str, boolean z, boolean z2);

    List getDisabledServers();

    List getDrives();

    int getEmbyAuthCacheCount();

    a getEmbyManagePrefs();

    boolean[] getEmbyPersonalStates();

    int getEmbyViewsCacheCount();

    void refreshEmbyViews(String str, Q0 q0);

    void setEmbyManagePrefs(a aVar);

    void setEmbyPersonalStates(boolean[] zArr);
}
