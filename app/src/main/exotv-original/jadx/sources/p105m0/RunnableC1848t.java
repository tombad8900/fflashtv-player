package p105m0;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.exotv.net.PlayerActivity;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.t */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1848t implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f6938j;

    /* renamed from: k */
    public final /* synthetic */ View f6939k;

    public /* synthetic */ RunnableC1848t(View view, int i) {
        this.f6938j = i;
        this.f6939k = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6938j;
        View view = this.f6939k;
        switch (i) {
            case 0:
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                break;
            case 1:
                ((InputMethodManager) view.getContext().getSystemService(InputMethodManager.class)).showSoftInput(view, 1);
                break;
            case 2:
                int i4 = PlayerActivity.f2936z0;
                view.requestFocus();
                break;
            default:
                int i8 = PlayerActivity.f2936z0;
                view.requestFocus();
                break;
        }
    }
}
