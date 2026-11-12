package com.github.catvod.spider.merge.p022z;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public interface J1 {
    boolean addApiUrl(String str);

    boolean addApiUrl(String str, String str2);

    boolean clearCustomApiUrls();

    void clearCustomUrls();

    String getApiName(String str);

    String[] getBuiltinUrls();

    String getChannelApiUrl();

    List getChannels();

    List getCustomChannels();

    List getCustomPlugins();

    List getCustomUrls();

    int getEnabledApiCount();

    List getEnabledTypes();

    List getExcludeKeywords();

    Map getHeaders();

    List getIncludeKeywords();

    int getLinkCheckMode();

    int getMaxPerType();

    String[][] getPanTypes();

    List getPlugins();

    List getVisibleApiUrls();

    boolean isApiEnabled(String str);

    boolean isBuiltinUrl(String str);

    boolean isFolderMode();

    boolean removeApiUrl(String str);

    void saveConfig();

    boolean setApiEnabled(String str, boolean z);

    void setChannelApiUrl(String str);

    void setChannelMode(int i);

    void setFolderMode(boolean z);

    void setLinkCheckMode(int i);

    void setMaxPerType(int i);
}
