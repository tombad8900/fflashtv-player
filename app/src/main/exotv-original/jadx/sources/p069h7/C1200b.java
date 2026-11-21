package p069h7;

import com.bumptech.glide.AbstractC0714c;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;
import p044e7.C0926c;
import p061g7.C1058e;
import p102l6.C1687d;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.b */
/* loaded from: classes.dex */
public final class C1200b implements Iterator, InterfaceC0113a {

    /* renamed from: j */
    public int f5080j = -1;

    /* renamed from: k */
    public int f5081k;

    /* renamed from: l */
    public int f5082l;

    /* renamed from: m */
    public C0926c f5083m;

    /* renamed from: n */
    public final /* synthetic */ C1058e f5084n;

    public C1200b(C1058e c1058e) {
        this.f5084n = c1058e;
        int iM1534t = AbstractC0714c.m1534t(0, 0, ((CharSequence) c1058e.f4480b).length());
        this.f5081k = iM1534t;
        this.f5082l = iM1534t;
    }

    /* renamed from: a */
    public final void m2620a() {
        C1687d c1687d;
        C1058e c1058e = this.f5084n;
        CharSequence charSequence = (CharSequence) c1058e.f4480b;
        int i = this.f5082l;
        if (i < 0) {
            this.f5080j = 0;
            this.f5083m = null;
            return;
        }
        if (i <= charSequence.length() && (c1687d = (C1687d) ((InterfaceC2855p) c1058e.f4481c).mo576c(charSequence, Integer.valueOf(this.f5082l))) != null) {
            int iIntValue = ((Number) c1687d.f6486j).intValue();
            int iIntValue2 = ((Number) c1687d.f6487k).intValue();
            this.f5083m = AbstractC0714c.m1521g0(this.f5081k, iIntValue);
            int i4 = iIntValue + iIntValue2;
            this.f5081k = i4;
            this.f5082l = i4 + (iIntValue2 == 0 ? 1 : 0);
        } else {
            this.f5083m = new C0926c(this.f5081k, AbstractC1206h.m2652x0(charSequence), 1);
            this.f5082l = -1;
        }
        this.f5080j = 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f5080j == -1) {
            m2620a();
        }
        return this.f5080j == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f5080j == -1) {
            m2620a();
        }
        if (this.f5080j == 0) {
            throw new NoSuchElementException();
        }
        C0926c c0926c = this.f5083m;
        AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.ranges.IntRange", c0926c);
        this.f5083m = null;
        this.f5080j = -1;
        return c0926c;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
