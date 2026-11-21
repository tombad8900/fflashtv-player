package p074i5;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p104m.C1768s0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i5.a */
/* loaded from: classes.dex */
public final class RunnableC1269a implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f5278j = 1;

    /* renamed from: k */
    public final /* synthetic */ int f5279k;

    /* renamed from: l */
    public final /* synthetic */ View f5280l;

    /* renamed from: m */
    public final /* synthetic */ Object f5281m;

    public RunnableC1269a(TextView textView, Typeface typeface, int i) {
        this.f5280l = textView;
        this.f5281m = typeface;
        this.f5279k = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5278j) {
            case 0:
                ((BottomSheetBehavior) this.f5281m).m1785H(this.f5280l, this.f5279k, false);
                break;
            default:
                C1768s0.m3437d((TextView) this.f5280l, (Typeface) this.f5281m, this.f5279k);
                break;
        }
    }

    public RunnableC1269a(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f5281m = bottomSheetBehavior;
        this.f5280l = view;
        this.f5279k = i;
    }
}
