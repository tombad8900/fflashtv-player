package p119n6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p008a7.InterfaceC0113a;
import p105m0.AbstractC1795b0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n6.d */
/* loaded from: classes.dex */
public final class C2024d extends AbstractC1795b0 implements Iterator, InterfaceC0113a {

    /* renamed from: n */
    public final /* synthetic */ int f7467n;

    public C2024d(C2026f c2026f, int i) {
        this.f7467n = i;
        AbstractC2980h.m5136e("map", c2026f);
        this.f6855m = c2026f;
        this.f6853k = -1;
        this.f6854l = c2026f.f7479q;
        m3510e();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f7467n) {
            case 0:
                m3507b();
                int i = this.f6852j;
                C2026f c2026f = (C2026f) this.f6855m;
                if (i >= c2026f.f7477o) {
                    throw new NoSuchElementException();
                }
                this.f6852j = i + 1;
                this.f6853k = i;
                C2025e c2025e = new C2025e(c2026f, i);
                m3510e();
                return c2025e;
            case 1:
                m3507b();
                int i4 = this.f6852j;
                C2026f c2026f2 = (C2026f) this.f6855m;
                if (i4 >= c2026f2.f7477o) {
                    throw new NoSuchElementException();
                }
                this.f6852j = i4 + 1;
                this.f6853k = i4;
                Object obj = c2026f2.f7472j[i4];
                m3510e();
                return obj;
            default:
                m3507b();
                int i8 = this.f6852j;
                C2026f c2026f3 = (C2026f) this.f6855m;
                if (i8 >= c2026f3.f7477o) {
                    throw new NoSuchElementException();
                }
                this.f6852j = i8 + 1;
                this.f6853k = i8;
                Object[] objArr = c2026f3.f7473k;
                AbstractC2980h.m5133b(objArr);
                Object obj2 = objArr[this.f6853k];
                m3510e();
                return obj2;
        }
    }
}
