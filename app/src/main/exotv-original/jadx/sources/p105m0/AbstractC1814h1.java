package p105m0;

import com.bumptech.glide.AbstractC0714c;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.h1 */
/* loaded from: classes.dex */
public abstract class AbstractC1814h1 {

    /* renamed from: a */
    public final C1844r1 f6876a;

    /* renamed from: b */
    public C0851b[] f6877b;

    public AbstractC1814h1() {
        this(new C1844r1());
    }

    /* renamed from: a */
    public final void m3554a() {
        C0851b[] c0851bArr = this.f6877b;
        if (c0851bArr != null) {
            C0851b c0851bMo3563f = c0851bArr[0];
            C0851b c0851bMo3563f2 = c0851bArr[1];
            C1844r1 c1844r1 = this.f6876a;
            if (c0851bMo3563f2 == null) {
                c0851bMo3563f2 = c1844r1.f6934a.mo3563f(2);
            }
            if (c0851bMo3563f == null) {
                c0851bMo3563f = c1844r1.f6934a.mo3563f(1);
            }
            mo3520g(C0851b.m2020a(c0851bMo3563f, c0851bMo3563f2));
            C0851b c0851b = this.f6877b[AbstractC0714c.m1498K(16)];
            if (c0851b != null) {
                mo3541f(c0851b);
            }
            C0851b c0851b2 = this.f6877b[AbstractC0714c.m1498K(32)];
            if (c0851b2 != null) {
                mo3540d(c0851b2);
            }
            C0851b c0851b3 = this.f6877b[AbstractC0714c.m1498K(64)];
            if (c0851b3 != null) {
                mo3542h(c0851b3);
            }
        }
    }

    /* renamed from: b */
    public abstract C1844r1 mo3518b();

    /* renamed from: c */
    public void mo3545c(int i, C0851b c0851b) {
        if (this.f6877b == null) {
            this.f6877b = new C0851b[10];
        }
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i & i4) != 0) {
                this.f6877b[AbstractC0714c.m1498K(i4)] = c0851b;
            }
        }
    }

    /* renamed from: d */
    public void mo3540d(C0851b c0851b) {
    }

    /* renamed from: e */
    public abstract void mo3519e(C0851b c0851b);

    /* renamed from: f */
    public void mo3541f(C0851b c0851b) {
    }

    /* renamed from: g */
    public abstract void mo3520g(C0851b c0851b);

    /* renamed from: h */
    public void mo3542h(C0851b c0851b) {
    }

    public AbstractC1814h1(C1844r1 c1844r1) {
        this.f6876a = c1844r1;
    }
}
