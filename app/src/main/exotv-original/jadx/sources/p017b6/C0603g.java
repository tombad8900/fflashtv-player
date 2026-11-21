package p017b6;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import p211y5.C2821h;
import p211y5.C2828o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.g */
/* loaded from: classes.dex */
public final class C0603g extends C2821h {

    /* renamed from: q */
    public final RectF f2406q;

    public C0603g(C2828o c2828o, RectF rectF) {
        super(c2828o);
        this.f2406q = rectF;
    }

    @Override // p211y5.C2821h, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C0605h c0605h = new C0605h(this);
        c0605h.f2409P = this;
        c0605h.invalidateSelf();
        return c0605h;
    }

    public C0603g(C0603g c0603g) {
        super(c0603g);
        this.f2406q = c0603g.f2406q;
    }
}
