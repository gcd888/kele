package com.github.catvod.spider.merge.p022z;

import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.z.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public interface InterfaceC0545o1 {
    void addDrive(JSONObject jSONObject);

    List getAllCategories();

    List getCategoryOrder();

    List getDisabledServers();

    List getDrives();

    String getEmbyAuthStatus(JSONObject jSONObject);

    List getHiddenCategories();

    void logoutEmby(JSONObject jSONObject);

    void removeDrive(int i);

    void setCategoryOrder(List list);

    void setDisabledServers(List list);

    void setHiddenCategories(List list);

    void swapDrives(int i, int i2);

    void testConnection(JSONObject jSONObject, InterfaceC0555q1 interfaceC0555q1);

    void updateDrive(int i, JSONObject jSONObject);
}
