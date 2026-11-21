package p104m;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p029d0.AbstractC0786b;
import p046f0.AbstractC0928a;
import p074i5.RunnableC1269a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.o0 */
/* loaded from: classes.dex */
public final class C1753o0 extends AbstractC0786b {

    /* renamed from: h */
    public final /* synthetic */ int f6689h;

    /* renamed from: i */
    public final /* synthetic */ int f6690i;

    /* renamed from: j */
    public final /* synthetic */ WeakReference f6691j;

    /* renamed from: k */
    public final /* synthetic */ C1768s0 f6692k;

    public C1753o0(C1768s0 c1768s0, int i, int i4, WeakReference weakReference) {
        this.f6692k = c1768s0;
        this.f6689h = i;
        this.f6690i = i4;
        this.f6691j = weakReference;
    }

    @Override // p029d0.AbstractC0786b
    /* renamed from: g */
    public final void mo1942g(int i) {
    }

    @Override // p029d0.AbstractC0786b
    /* renamed from: h */
    public final void mo1943h(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f6689h) != -1) {
            typeface = AbstractC0928a.m2086a(typeface, i, (this.f6690i & 2) != 0);
        }
        C1768s0 c1768s0 = this.f6692k;
        if (c1768s0.f6745n) {
            c1768s0.f6743l = typeface;
            TextView textView = (TextView) this.f6691j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC1269a(textView, typeface, c1768s0.f6741j));
                } else {
                    C1768s0.m3437d(textView, typeface, c1768s0.f6741j);
                }
            }
        }
    }
}
