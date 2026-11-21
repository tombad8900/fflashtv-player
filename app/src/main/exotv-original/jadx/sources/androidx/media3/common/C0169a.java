package androidx.media3.common;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import p105m0.RunnableC1848t;
import p151r3.InterfaceC2293e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.a */
/* loaded from: classes.dex */
public class C0169a implements InterfaceC2293e {

    /* renamed from: a */
    public final View f972a;

    /* renamed from: a */
    public void mo592a() {
        View view = this.f972a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    /* renamed from: b */
    public void mo593b() {
        View viewFindViewById;
        View view = this.f972a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new RunnableC1848t(viewFindViewById, 0));
    }
}
