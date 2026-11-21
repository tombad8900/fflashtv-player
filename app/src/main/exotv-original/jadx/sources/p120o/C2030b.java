package p120o;

import java.util.Iterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o.b */
/* loaded from: classes.dex */
public final class C2030b extends AbstractC2033e implements Iterator {

    /* renamed from: j */
    public C2031c f7489j;

    /* renamed from: k */
    public C2031c f7490k;

    /* renamed from: l */
    public final /* synthetic */ int f7491l;

    public C2030b(C2031c c2031c, C2031c c2031c2, int i) {
        this.f7491l = i;
        this.f7489j = c2031c2;
        this.f7490k = c2031c;
    }

    @Override // p120o.AbstractC2033e
    /* renamed from: a */
    public final void mo3923a(C2031c c2031c) {
        C2031c c2031c2;
        C2031c c2031cM3924b = null;
        if (this.f7489j == c2031c && c2031c == this.f7490k) {
            this.f7490k = null;
            this.f7489j = null;
        }
        C2031c c2031c3 = this.f7489j;
        if (c2031c3 == c2031c) {
            switch (this.f7491l) {
                case 0:
                    c2031c2 = c2031c3.f7495m;
                    break;
                default:
                    c2031c2 = c2031c3.f7494l;
                    break;
            }
            this.f7489j = c2031c2;
        }
        C2031c c2031c4 = this.f7490k;
        if (c2031c4 == c2031c) {
            C2031c c2031c5 = this.f7489j;
            if (c2031c4 != c2031c5 && c2031c5 != null) {
                c2031cM3924b = m3924b(c2031c4);
            }
            this.f7490k = c2031cM3924b;
        }
    }

    /* renamed from: b */
    public final C2031c m3924b(C2031c c2031c) {
        switch (this.f7491l) {
            case 0:
                return c2031c.f7494l;
            default:
                return c2031c.f7495m;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f7490k != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2031c c2031c = this.f7490k;
        C2031c c2031c2 = this.f7489j;
        this.f7490k = (c2031c == c2031c2 || c2031c2 == null) ? null : m3924b(c2031c);
        return c2031c;
    }
}
