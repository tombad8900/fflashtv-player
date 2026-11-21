package p187v5;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v5.c */
/* loaded from: classes.dex */
public final class C2551c extends AbstractC2415i0 {

    /* renamed from: a */
    public final /* synthetic */ Context f9247a;

    /* renamed from: b */
    public final /* synthetic */ TextPaint f9248b;

    /* renamed from: c */
    public final /* synthetic */ AbstractC2415i0 f9249c;

    /* renamed from: d */
    public final /* synthetic */ C2552d f9250d;

    public C2551c(C2552d c2552d, Context context, TextPaint textPaint, AbstractC2415i0 abstractC2415i0) {
        this.f9250d = c2552d;
        this.f9247a = context;
        this.f9248b = textPaint;
        this.f9249c = abstractC2415i0;
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: v */
    public final void mo3675v(int i) {
        this.f9249c.mo3675v(i);
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: w */
    public final void mo3676w(Typeface typeface, boolean z7) {
        this.f9250d.m4568f(this.f9247a, this.f9248b, typeface);
        this.f9249c.mo3676w(typeface, z7);
    }
}
