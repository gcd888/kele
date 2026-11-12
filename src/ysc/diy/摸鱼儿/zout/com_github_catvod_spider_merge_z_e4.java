package com.github.catvod.spider.merge.p022z;

import android.app.AlertDialog;
import android.app.Application;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.github.catvod.spider.InitOrigin;
import com.github.catvod.spider.Wallpaper;
import com.github.catvod.spider.merge.A.X0;
import com.github.catvod.spider.merge.D.b;

/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class e4 implements Runnable {
    public final /* synthetic */ int a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                X0.a("设置失败，图片无法获取");
                break;
            case 1:
                X0.a("已设为壁纸");
                break;
            case 2:
                try {
                    Application applicationContext = InitOrigin.context();
                    if (applicationContext != null) {
                        LinearLayout linearLayoutK = AbstractC0583w0.K(applicationContext);
                        int i = AbstractC0583w0.c;
                        linearLayoutK.addView(AbstractC0583w0.H(applicationContext, "壁纸设置", null, i), AbstractC0583w0.c0(AbstractC0583w0.Q(12, applicationContext)));
                        final LinearLayout linearLayoutY = AbstractC0583w0.y(applicationContext);
                        boolean zHasSelected = Wallpaper.hasSelected();
                        String str = zHasSelected ? "已设置 (点击清除)" : "未设置";
                        if (!zHasSelected) {
                            i = AbstractC0583w0.i;
                        }
                        AbstractC0583w0.j(linearLayoutY, "当前壁纸", str, i);
                        linearLayoutY.setFocusable(true);
                        linearLayoutY.setClickable(true);
                        linearLayoutY.setOnClickListener(new ViewOnClickListenerC0531l2(linearLayoutY, 2));
                        linearLayoutK.addView(linearLayoutY, AbstractC0583w0.c0(AbstractC0583w0.Q(12, applicationContext)));
                        TextView textView = new TextView(applicationContext);
                        textView.setText("设置壁纸后，下次随机将固定显示该壁纸\n用户自行决定选择横屏或竖屏壁纸");
                        textView.setTextSize(12.0f);
                        textView.setTextColor(AbstractC0583w0.i);
                        textView.setPadding(AbstractC0583w0.Q(4, applicationContext), AbstractC0583w0.Q(4, applicationContext), AbstractC0583w0.Q(4, applicationContext), 0);
                        linearLayoutK.addView(textView);
                        AlertDialog alertDialogCreate = new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.p0(linearLayoutK)).create();
                        linearLayoutY.setFocusableInTouchMode(true);
                        alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.github.catvod.spider.merge.z.f4
                            @Override // android.content.DialogInterface.OnShowListener
                            public final void onShow(DialogInterface dialogInterface) {
                                linearLayoutY.requestFocus();
                            }
                        });
                        alertDialogCreate.show();
                        AbstractC0583w0.l0(alertDialogCreate, 0.0f);
                    }
                } catch (Exception e) {
                    b.D(e, new StringBuilder("[WallpaperDialog] showSettings error: "));
                    return;
                }
                break;
            case 3:
                X0.a("设置失败");
                break;
            case 4:
                X0.a("下载失败，图片无法获取");
                break;
            default:
                try {
                    Application applicationContext2 = InitOrigin.context();
                    if (applicationContext2 != null) {
                        LinearLayout linearLayoutK2 = AbstractC0583w0.K(applicationContext2);
                        linearLayoutK2.setGravity(17);
                        FrameLayout frameLayout = new FrameLayout(applicationContext2);
                        int iQ = AbstractC0583w0.Q(72, applicationContext2);
                        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(iQ, iQ));
                        GradientDrawable gradientDrawable = new GradientDrawable();
                        gradientDrawable.setShape(1);
                        gradientDrawable.setColor(452946795);
                        frameLayout.setBackground(gradientDrawable);
                        ImageView imageView = new ImageView(applicationContext2);
                        int iQ2 = AbstractC0583w0.Q(40, applicationContext2);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iQ2, iQ2);
                        layoutParams.gravity = 17;
                        imageView.setLayoutParams(layoutParams);
                        imageView.setImageDrawable(new g4(-38037, iQ2, 4));
                        frameLayout.addView(imageView);
                        linearLayoutK2.addView(frameLayout);
                        TextView textView2 = new TextView(applicationContext2);
                        textView2.setText("图片加载失败");
                        textView2.setTextSize(18.0f);
                        textView2.setTextColor(AbstractC0583w0.g);
                        textView2.setGravity(17);
                        textView2.setPadding(0, AbstractC0583w0.Q(20, applicationContext2), 0, 0);
                        linearLayoutK2.addView(textView2);
                        TextView textView3 = new TextView(applicationContext2);
                        textView3.setText("可能是网络问题或图源防盗链限制");
                        textView3.setTextSize(13.0f);
                        textView3.setTextColor(AbstractC0583w0.i);
                        textView3.setGravity(17);
                        textView3.setPadding(0, AbstractC0583w0.Q(8, applicationContext2), 0, AbstractC0583w0.Q(20, applicationContext2));
                        linearLayoutK2.addView(textView3);
                        AbstractC0583w0.j0(new AlertDialog.Builder(InitOrigin.getActivity()).setView(AbstractC0583w0.p0(linearLayoutK2)).setPositiveButton("我知道了", (DialogInterface.OnClickListener) null).create());
                    }
                } catch (Exception e2) {
                    b.D(e2, new StringBuilder("[WallpaperDialog] showLoadFailedDialog error: "));
                    return;
                }
                break;
        }
    }
}
