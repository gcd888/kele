package com.github.catvod.spider.merge.p017u;

import com.github.catvod.spider.FishCrypto;
import com.github.catvod.spider.Kan360;
import com.github.catvod.spider.merge.A.InterfaceC0245c;
import com.github.catvod.spider.merge.A.X0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class E implements InterfaceC0245c {
    public final /* synthetic */ int a;
    public final /* synthetic */ Kan360 b;

    public /* synthetic */ E(Kan360 kan360, int i) {
        this.a = i;
        this.b = kan360;
    }

    public void a(Object obj) {
        Object obj2;
        String strV;
        switch (this.a) {
            case 1:
                Kan360 kan360 = this.b;
                kan360.g = (String) obj;
                kan360.j();
                X0.a(kan360.g.isEmpty() ? "已清除过滤" : "已过滤: " + kan360.g);
                break;
            case 2:
                String str = (String) obj;
                Kan360 kan361 = this.b;
                kan361.getClass();
                if (str.startsWith("http")) {
                    ArrayList arrayList = kan361.f;
                    if (arrayList.contains(str)) {
                        X0.a("该接口已存在");
                    } else {
                        arrayList.add(str);
                        if (kan361.d.isEmpty()) {
                            kan361.d = str;
                        }
                        kan361.j();
                        X0.a("已添加");
                    }
                } else {
                    X0.a("请输入有效URL");
                }
                break;
            case 3:
                List<String> list = (List) obj;
                Kan360 kan362 = this.b;
                kan362.getClass();
                for (String str2 : list) {
                    ArrayList arrayList2 = kan362.f;
                    arrayList2.remove(str2);
                    if (str2.equals(kan362.d)) {
                        if (arrayList2.isEmpty()) {
                            ArrayList arrayList3 = kan362.e;
                            if (arrayList3.isEmpty()) {
                                strV = FishCrypto.v("N1.4iwspm5bld4weaxsV9YXxpta8VsYgkzg0+9Iu0eOBAmoX8PhmiyYKzA9sKtp2eI3T3EmUSlUvcxwW69yEzpCTbTbWIBOpa3uuf7lOL1zHuk=");
                            } else {
                                obj2 = arrayList3.get(0);
                            }
                            kan362.d = strV;
                        } else {
                            obj2 = arrayList2.get(0);
                        }
                        strV = (String) obj2;
                        kan362.d = strV;
                    }
                }
                kan362.j();
                X0.a("已删除 " + list.size() + " 个接口");
                break;
            case 4:
                String str3 = (String) obj;
                Kan360 kan363 = this.b;
                kan363.d = str3;
                kan363.j();
                X0.a("已切换: " + str3.replace("https://", "").replace("http://", ""));
                break;
            default:
                Kan360 kan364 = this.b;
                kan364.getClass();
                kan364.h = ((Boolean) obj).booleanValue();
                kan364.j();
                X0.a(kan364.h ? "已启用源内解析" : "已禁用，使用全局解析");
                break;
        }
    }

    @Override // com.github.catvod.spider.merge.A.InterfaceC0245c
    public String dispatch(String str) {
        return this.b.action(str);
    }
}
