package com.github.catvod.spider.merge.p022z;

import android.view.View;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class Z implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ Z(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                P1.J0("AI匹配测试", "扫码在手机上输入测试数据", this.b, "name,剧名,如: 凡人修仙传|episode,集数,如: 179|total,总集数,留空", AbstractC0583w0.c);
                break;
            case 1:
                P1.J0("Emby数量设置", "扫码在手机上输入数量", this.b, "searchLimit,搜索上限,50|pageSize,每页数量,20", AbstractC0583w0.c);
                break;
            case 2:
                P1.J0("Emby客户端身份", "扫码在手机上输入详细参数", this.b, "embyUA,User-Agent,Emby for iOS/2.2.31|embyClient,客户端名称,Emby for iOS|embyVersion,客户端版本,2.2.31|embyDevice,设备名称,iPhone", AbstractC0583w0.c);
                break;
            case 3:
                P1.r1(AbstractC0583w0.c, "添加自定义", this.b, "name", "名称", "leoziyuan");
                break;
            case 4:
                P1.J0("导入WebDAV配置", "扫码在手机上粘贴配置", this.b, "config,分享配置,粘贴 moyu_webdav: 开头的配置", AbstractC0583w0.c);
                break;
            default:
                P1.J0("WebDAV配置", "扫码在手机上填入服务器信息", this.b, "url,服务器地址,https://dav.jianguoyun.com/dav/|user,用户名,your@email.com|pass,密码,应用密码,pwd", AbstractC0583w0.c);
                break;
        }
    }
}
