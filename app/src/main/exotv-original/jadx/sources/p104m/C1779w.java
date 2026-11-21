package p104m;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p054g.AbstractC1026a;
import p095l.C1629o;
import p168t2.AbstractC2415i0;
import p200x0.C2739g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.w */
/* loaded from: classes.dex */
public final class C1779w {

    /* renamed from: a */
    public final TextView f6792a;

    /* renamed from: b */
    public final C1629o f6793b;

    public C1779w(TextView textView) {
        this.f6792a = textView;
        C1629o c1629o = new C1629o();
        c1629o.f6229j = new C2739g(textView);
        this.f6793b = c1629o;
    }

    /* renamed from: a */
    public final void m3468a(AttributeSet attributeSet, int i) {
        TypedArray typedArrayObtainStyledAttributes = this.f6792a.getContext().obtainStyledAttributes(attributeSet, AbstractC1026a.f4316i, i, 0);
        try {
            boolean z7 = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            m3470c(z7);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m3469b(boolean z7) {
        ((AbstractC2415i0) this.f6793b.f6229j).mo4270B(z7);
    }

    /* renamed from: c */
    public final void m3470c(boolean z7) {
        ((AbstractC2415i0) this.f6793b.f6229j).mo4271C(z7);
    }
}
