package com.github.catvod.spider.merge.A;

import android.database.sqlite.SQLiteConstraintException;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class U1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Exception b;

    public /* synthetic */ U1(Exception exc, int i) {
        this.a = i;
        this.b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String message;
        switch (this.a) {
            case 0:
                com.github.catvod.spider.merge.D.b.x(this.b, new StringBuilder("网络错误: "));
                break;
            default:
                Exception exc = this.b;
                if (exc instanceof SQLiteConstraintException) {
                    message = "播放历史写入失败，请更新后重试";
                } else {
                    message = (exc.getMessage() == null || exc.getMessage().isEmpty()) ? "播放历史清除失败" : exc.getMessage();
                }
                X0.a(message);
                break;
        }
    }
}
