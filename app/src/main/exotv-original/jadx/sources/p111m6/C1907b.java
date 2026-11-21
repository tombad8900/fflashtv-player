package p111m6;

import android.support.v4.media.session.AbstractC0120b;
import java.util.RandomAccess;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m6.b */
/* loaded from: classes.dex */
public final class C1907b extends AbstractC1908c implements RandomAccess {

    /* renamed from: j */
    public final AbstractC1908c f7178j;

    /* renamed from: k */
    public final int f7179k;

    /* renamed from: l */
    public final int f7180l;

    public C1907b(AbstractC1908c abstractC1908c, int i, int i4) {
        this.f7178j = abstractC1908c;
        this.f7179k = i;
        AbstractC0120b.m412h(i, i4, abstractC1908c.mo2621a());
        this.f7180l = i4 - i;
    }

    @Override // p111m6.AbstractC1908c
    /* renamed from: a */
    public final int mo2621a() {
        return this.f7180l;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i4 = this.f7180l;
        if (i < 0 || i >= i4) {
            throw new IndexOutOfBoundsException(AbstractC0008a1.m11g(i, i4, "index: ", ", size: "));
        }
        return this.f7178j.get(this.f7179k + i);
    }
}
