package com.github.catvod.spider.merge.p017u;

import android.text.TextUtils;
import com.github.catvod.spider.FishDrive;
import com.github.catvod.spider.merge.A.X1;
import com.github.catvod.spider.merge.p007h.a;
import com.github.catvod.spider.merge.p022z.C0559r1;
import com.github.catvod.spider.merge.p022z.P1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.u.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class RunnableC0464p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FishDrive b;

    public /* synthetic */ RunnableC0464p(FishDrive fishDrive, int i) {
        this.a = i;
        this.b = fishDrive;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        FishDrive fishDrive = this.b;
        int i = 0;
        switch (this.a) {
            case 0:
                JSONObject jSONObject = FishDrive.f;
                fishDrive.getClass();
                String str2 = FishDrive.h.size() + " 个服务器";
                C0559r1 c0559r1 = fishDrive.b;
                Objects.requireNonNull(c0559r1);
                RunnableC0463o runnableC0463o = new RunnableC0463o(c0559r1, 6);
                C0559r1 c0559r2 = fishDrive.b;
                Objects.requireNonNull(c0559r2);
                P1.K0("排序", "选择对象", new String[]{"服务器排序", "分类排序"}, new String[]{str2, FishDrive.s.size() + " 个分类"}, new int[]{-14575885, -26624}, new Runnable[]{runnableC0463o, new RunnableC0463o(c0559r2, 7)});
                break;
            case 1:
                JSONObject jSONObject2 = FishDrive.f;
                fishDrive.getClass();
                ArrayList arrayList = FishDrive.h;
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    if (FishDrive.D((JSONObject) it.next())) {
                        i2++;
                    }
                }
                int size = arrayList.size() - FishDrive.C.size();
                String[] strArr = {"添加服务器", "管理服务器", "删除服务器", "启用管理", "Emby 登录与安全"};
                String str3 = arrayList.size() + " 个";
                String str4 = arrayList.size() + " 个";
                String str5 = "启用 " + size + "/" + arrayList.size();
                if (i2 > 0) {
                    str = i2 + "个服务器";
                } else {
                    str = "未配置";
                }
                C0559r1 c0559r3 = fishDrive.b;
                Objects.requireNonNull(c0559r3);
                RunnableC0463o runnableC0463o2 = new RunnableC0463o(c0559r3, 0);
                C0559r1 c0559r4 = fishDrive.b;
                Objects.requireNonNull(c0559r4);
                RunnableC0463o runnableC0463o3 = new RunnableC0463o(c0559r4, 1);
                C0559r1 c0559r5 = fishDrive.b;
                Objects.requireNonNull(c0559r5);
                RunnableC0463o runnableC0463o4 = new RunnableC0463o(c0559r5, 2);
                C0559r1 c0559r6 = fishDrive.b;
                Objects.requireNonNull(c0559r6);
                RunnableC0463o runnableC0463o5 = new RunnableC0463o(c0559r6, 3);
                C0559r1 c0559r7 = fishDrive.b;
                Objects.requireNonNull(c0559r7);
                P1.K0("服务器与账号", "管理连接和登录", strArr, new String[]{"WebDAV、Emby", str3, str4, str5, str}, new int[]{-14575885, -11751600, -769226, -11751600, -26624}, new Runnable[]{runnableC0463o2, runnableC0463o3, runnableC0463o4, runnableC0463o5, new RunnableC0463o(c0559r7, 4)});
                break;
            case 2:
                if (fishDrive.c == null) {
                    fishDrive.c = new X1(12, fishDrive.e);
                }
                int i3 = (FishDrive.y ? 1 : 0) + (FishDrive.z ? 1 : 0) + (FishDrive.A ? 1 : 0) + (FishDrive.B ? 1 : 0);
                a aVarR = FishDrive.r();
                String[] strArr2 = {"我的 Emby", "内容与搜索"};
                String str6 = i3 + "项内容";
                StringBuilder sb = new StringBuilder();
                ArrayList arrayList2 = new ArrayList();
                String str7 = aVarR.a;
                if (str7.contains("Movie")) {
                    arrayList2.add("电影");
                }
                if (str7.contains("Series")) {
                    arrayList2.add("剧集");
                }
                if (str7.contains("BoxSet")) {
                    arrayList2.add("合集");
                }
                sb.append(arrayList2.isEmpty() ? "未设置" : TextUtils.join("、", arrayList2));
                sb.append(" · 每页");
                sb.append(aVarR.d);
                X1 x1 = fishDrive.c;
                Objects.requireNonNull(x1);
                RunnableC0462n runnableC0462n = new RunnableC0462n(x1, 2);
                X1 x2 = fishDrive.c;
                Objects.requireNonNull(x2);
                P1.K0("Emby 设置", "管理内容和搜索", strArr2, new String[]{str6, sb.toString()}, new int[]{-14575885, -11751600}, new Runnable[]{runnableC0462n, new RunnableC0462n(x2, 3)});
                break;
            case 3:
                JSONObject jSONObject3 = FishDrive.f;
                fishDrive.getClass();
                C0559r1 c0559r8 = fishDrive.b;
                Objects.requireNonNull(c0559r8);
                P1.K0("分类与排序", "管理显示和顺序", new String[]{"分类显示", "排序"}, new String[]{"隐藏 " + FishDrive.u.size() + " 个", "服务器、分类"}, new int[]{-14575885, -26624}, new Runnable[]{new RunnableC0463o(c0559r8, 5), new RunnableC0464p(fishDrive, i)});
                break;
            default:
                if (fishDrive.c == null) {
                    fishDrive.c = new X1(12, fishDrive.e);
                }
                X1 x3 = fishDrive.c;
                Objects.requireNonNull(x3);
                RunnableC0462n runnableC0462n2 = new RunnableC0462n(x3, 0);
                X1 x4 = fishDrive.c;
                Objects.requireNonNull(x4);
                P1.K0("缓存与维护", "刷新或清理", new String[]{"刷新媒体库", "清除缓存"}, new String[]{"重新读取媒体库", "清除各类缓存"}, new int[]{-11751600, -769226}, new Runnable[]{runnableC0462n2, new RunnableC0462n(x4, 1)});
                break;
        }
    }
}
