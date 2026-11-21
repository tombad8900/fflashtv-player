package p076i7;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import p002a1.C0048u;
import p102l6.C1689f;
import p102l6.C1693j;
import p112m7.AbstractC1925a;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;
import p146q6.EnumC2273a;
import p154r6.AbstractC2318a;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2989q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.a */
/* loaded from: classes.dex */
public abstract class AbstractC1277a extends C1279a1 implements InterfaceC2222c, InterfaceC1333u {

    /* renamed from: l */
    public final InterfaceC2227h f5305l;

    public AbstractC1277a(InterfaceC2227h interfaceC2227h, boolean z7) {
        super(z7);
        m2746C((InterfaceC1330s0) interfaceC2227h.mo2760b(C1329s.f5369k));
        this.f5305l = interfaceC2227h.mo2761c(this);
    }

    @Override // p076i7.C1279a1
    /* renamed from: B */
    public final void mo2739B(C0048u c0048u) {
        AbstractC1339x.m2848i(this.f5305l, c0048u);
    }

    @Override // p076i7.C1279a1
    /* renamed from: L */
    public final void mo2740L(Object obj) {
        if (obj instanceof C1319o) {
            C1319o.f5357b.get((C1319o) obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public final void m2741T(EnumC1335v enumC1335v, AbstractC1277a abstractC1277a, InterfaceC2855p interfaceC2855p) {
        int iOrdinal = enumC1335v.ordinal();
        C1693j c1693j = C1693j.f6497a;
        if (iOrdinal == 0) {
            try {
                AbstractC1925a.m3770f(c1693j, AbstractC0715d.m1547P(((AbstractC2318a) interfaceC2855p).mo577g(abstractC1277a, this)));
                return;
            } finally {
                mo2248d(AbstractC0714c.m1539y(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                AbstractC0715d.m1547P(((AbstractC2318a) interfaceC2855p).mo577g(abstractC1277a, this)).mo2248d(c1693j);
                return;
            }
            if (iOrdinal != 3) {
                throw new C0048u();
            }
            try {
                InterfaceC2227h interfaceC2227h = this.f5305l;
                Object objM3773i = AbstractC1925a.m3773i(interfaceC2227h, null);
                try {
                    AbstractC2989q.m5145b(interfaceC2855p);
                    Object objMo576c = interfaceC2855p.mo576c(abstractC1277a, this);
                    if (objMo576c != EnumC2273a.f7953j) {
                        mo2248d(objMo576c);
                    }
                } finally {
                    AbstractC1925a.m3769e(interfaceC2227h, objM3773i);
                }
            } catch (Throwable th) {
            }
        }
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: d */
    public final void mo2248d(Object obj) {
        Throwable thM3382a = C1689f.m3382a(obj);
        if (thM3382a != null) {
            obj = new C1319o(thM3382a, false);
        }
        Object objM2751H = m2751H(obj);
        if (objM2751H == AbstractC1339x.f5379e) {
            return;
        }
        mo2764l(objM2751H);
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: f */
    public final InterfaceC2227h mo2249f() {
        return this.f5305l;
    }

    @Override // p076i7.InterfaceC1333u
    /* renamed from: h */
    public final InterfaceC2227h mo579h() {
        return this.f5305l;
    }

    @Override // p076i7.C1279a1
    /* renamed from: o */
    public final String mo2742o() {
        return getClass().getSimpleName().concat(" was cancelled");
    }
}
