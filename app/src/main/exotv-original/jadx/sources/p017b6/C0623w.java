package p017b6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p104m.C1780w0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.w */
/* loaded from: classes.dex */
public final class C0623w extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f2468a;

    /* renamed from: b */
    public final /* synthetic */ TextView f2469b;

    /* renamed from: c */
    public final /* synthetic */ int f2470c;

    /* renamed from: d */
    public final /* synthetic */ TextView f2471d;

    /* renamed from: e */
    public final /* synthetic */ C0624x f2472e;

    public C0623w(C0624x c0624x, int i, TextView textView, int i4, TextView textView2) {
        this.f2472e = c0624x;
        this.f2468a = i;
        this.f2469b = textView;
        this.f2470c = i4;
        this.f2471d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1780w0 c1780w0;
        int i = this.f2468a;
        C0624x c0624x = this.f2472e;
        c0624x.f2488n = i;
        c0624x.f2486l = null;
        TextView textView = this.f2469b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f2470c == 1 && (c1780w0 = c0624x.f2492r) != null) {
                c1780w0.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f2471d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f2471d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
