package com.github.catvod.spider.merge.A;

import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.github.catvod.spider.merge.p022z.AbstractC0583w0;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.merge.A.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: E:\HelloWorld\project\kele\src\ysc\diy\摸鱼儿\extracted2\classes.dex */
public final /* synthetic */ class ViewOnKeyListenerC0307x implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ViewOnKeyListenerC0307x(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:144:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0141  */
    /* JADX WARN: Code duplicated, block: B:99:0x0145  */
    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        LinearLayout linearLayout;
        switch (this.a) {
            case 0:
                C0252e0 c0252e0 = (C0252e0) this.b;
                c0252e0.getClass();
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if (i == 23 || i == 66) {
                    c0252e0.t();
                } else if (i == 19) {
                    HorizontalScrollView horizontalScrollView = c0252e0.k;
                    if (horizontalScrollView == null || horizontalScrollView.getVisibility() != 0 || c0252e0.q >= c0252e0.o.size()) {
                        c0252e0.w();
                    } else {
                        c0252e0.x(c0252e0.q);
                    }
                } else {
                    if (i != 20) {
                        return false;
                    }
                    C0252e0.q((LinearLayout) this.c);
                }
                return true;
            case 1:
                C0252e0 c0252e1 = (C0252e0) this.b;
                c0252e1.getClass();
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if (i == 66) {
                    c0252e1.v();
                } else if (i == 23) {
                    InputMethodManager inputMethodManager = (InputMethodManager) c0252e1.a.getSystemService("input_method");
                    if (inputMethodManager != null) {
                        inputMethodManager.showSoftInput((EditText) this.c, 1);
                    }
                } else {
                    if (i != 22) {
                        if (i != 21) {
                            if (i == 20) {
                                return false;
                            }
                            return false;
                        }
                        if (i == 20) {
                            return false;
                        }
                        return false;
                    }
                    EditText editText = (EditText) view;
                    if (editText.getSelectionEnd() >= editText.getText().length()) {
                        LinearLayout linearLayout2 = c0252e1.v;
                        if (linearLayout2 != null) {
                            linearLayout2.requestFocus();
                        }
                    } else if (i != 21 && ((EditText) view).getSelectionStart() <= 0) {
                        View viewFocusSearch = view.focusSearch(17);
                        if (viewFocusSearch != null && (linearLayout = c0252e1.g) != null) {
                            for (View view2 = viewFocusSearch; view2 != null; view2 = (View) view2.getParent()) {
                                if (view2 == linearLayout) {
                                    viewFocusSearch.requestFocus();
                                } else if (view2.getParent() instanceof View) {
                                }
                            }
                        }
                    } else if (i == 20 || !c0252e1.u()) {
                        return false;
                    }
                }
                return true;
            case 2:
                C0252e0 c0252e2 = (C0252e0) this.b;
                c0252e2.getClass();
                if (i == 23 || i == 66) {
                    int action = keyEvent.getAction();
                    boolean[] zArr = (boolean[]) this.c;
                    if (action == 0) {
                        if (keyEvent.getRepeatCount() == 0) {
                            zArr[0] = false;
                            return true;
                        }
                        if (zArr[0] || keyEvent.getRepeatCount() < 3) {
                            return true;
                        }
                        zArr[0] = true;
                        view.performLongClick();
                        return true;
                    }
                    if (keyEvent.getAction() == 1) {
                        if (zArr[0]) {
                            return true;
                        }
                        c0252e2.v();
                        return true;
                    }
                }
                if (keyEvent.getAction() == 0) {
                    if (i == 21) {
                        EditText editText2 = c0252e2.u;
                        if (editText2 == null) {
                            return true;
                        }
                        editText2.requestFocus();
                        return true;
                    }
                    if (i == 20 && c0252e2.u()) {
                        return true;
                    }
                }
                return false;
            case 3:
                if (i != 20 || keyEvent.getAction() != 0) {
                    return false;
                }
                View viewFocusSearch2 = view.focusSearch(130);
                if (((List) this.b).contains(viewFocusSearch2)) {
                    viewFocusSearch2.requestFocus();
                } else {
                    if (viewFocusSearch2 != null && viewFocusSearch2 != view && AbstractC0583w0.a0(viewFocusSearch2)) {
                        return false;
                    }
                    ((View) this.c).requestFocus();
                }
                return true;
            default:
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                if (i == 21) {
                    ((View) this.b).requestFocus();
                } else {
                    if (i != 22) {
                        return false;
                    }
                    ((View) this.c).requestFocus();
                }
                return true;
        }
    }
}
