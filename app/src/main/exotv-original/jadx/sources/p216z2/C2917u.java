package p216z2;

import android.graphics.PointF;
import android.view.View;
import p183v0.AbstractC2506f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.u */
/* loaded from: classes.dex */
public final class C2917u extends AbstractC2928z0 {

    /* renamed from: c */
    public C2913s f10836c;

    /* renamed from: d */
    public C2913s f10837d;

    /* renamed from: g */
    public static int m5053g(View view, AbstractC2506f abstractC2506f) {
        return ((abstractC2506f.mo4508c(view) / 2) + abstractC2506f.mo4510e(view)) - ((abstractC2506f.mo4517l() / 2) + abstractC2506f.mo4516k());
    }

    /* renamed from: h */
    public static View m5054h(AbstractC2888f0 abstractC2888f0, AbstractC2506f abstractC2506f) {
        int iM5010v = abstractC2888f0.m5010v();
        View view = null;
        if (iM5010v == 0) {
            return null;
        }
        int iMo4517l = (abstractC2506f.mo4517l() / 2) + abstractC2506f.mo4516k();
        int i = Integer.MAX_VALUE;
        for (int i4 = 0; i4 < iM5010v; i4++) {
            View viewM5008u = abstractC2888f0.m5008u(i4);
            int iAbs = Math.abs(((abstractC2506f.mo4508c(viewM5008u) / 2) + abstractC2506f.mo4510e(viewM5008u)) - iMo4517l);
            if (iAbs < i) {
                view = viewM5008u;
                i = iAbs;
            }
        }
        return view;
    }

    @Override // p216z2.AbstractC2928z0
    /* renamed from: b */
    public final int[] mo1438b(AbstractC2888f0 abstractC2888f0, View view) {
        int[] iArr = new int[2];
        if (abstractC2888f0.mo1127d()) {
            iArr[0] = m5053g(view, m5056i(abstractC2888f0));
        } else {
            iArr[0] = 0;
        }
        if (abstractC2888f0.mo1128e()) {
            iArr[1] = m5053g(view, m5057j(abstractC2888f0));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // p216z2.AbstractC2928z0
    /* renamed from: c */
    public final C2911r mo5055c(AbstractC2888f0 abstractC2888f0) {
        if (abstractC2888f0 instanceof InterfaceC2910q0) {
            return new C2915t(this, this.f10877a.getContext(), 0);
        }
        return null;
    }

    @Override // p216z2.AbstractC2928z0
    /* renamed from: d */
    public final View mo1439d(AbstractC2888f0 abstractC2888f0) {
        if (abstractC2888f0.mo1128e()) {
            return m5054h(abstractC2888f0, m5057j(abstractC2888f0));
        }
        if (abstractC2888f0.mo1127d()) {
            return m5054h(abstractC2888f0, m5056i(abstractC2888f0));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p216z2.AbstractC2928z0
    /* renamed from: e */
    public final int mo1440e(AbstractC2888f0 abstractC2888f0, int i, int i4) {
        PointF pointFMo1122a;
        int iM4991B = abstractC2888f0.m4991B();
        if (iM4991B != 0) {
            View view = null;
            AbstractC2506f abstractC2506fM5057j = abstractC2888f0.mo1128e() ? m5057j(abstractC2888f0) : abstractC2888f0.mo1127d() ? m5056i(abstractC2888f0) : null;
            if (abstractC2506fM5057j != null) {
                int iM5010v = abstractC2888f0.m5010v();
                boolean z7 = false;
                int i8 = Integer.MAX_VALUE;
                int i9 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i10 = 0; i10 < iM5010v; i10++) {
                    View viewM5008u = abstractC2888f0.m5008u(i10);
                    if (viewM5008u != null) {
                        int iM5053g = m5053g(viewM5008u, abstractC2506fM5057j);
                        if (iM5053g <= 0 && iM5053g > i9) {
                            view2 = viewM5008u;
                            i9 = iM5053g;
                        }
                        if (iM5053g >= 0 && iM5053g < i8) {
                            view = viewM5008u;
                            i8 = iM5053g;
                        }
                    }
                }
                boolean z8 = !abstractC2888f0.mo1127d() ? i4 <= 0 : i <= 0;
                if (z8 && view != null) {
                    return AbstractC2888f0.m4983H(view);
                }
                if (!z8 && view2 != null) {
                    return AbstractC2888f0.m4983H(view2);
                }
                if (z8) {
                    view = view2;
                }
                if (view != null) {
                    int iM4983H = AbstractC2888f0.m4983H(view);
                    int iM4991B2 = abstractC2888f0.m4991B();
                    if ((abstractC2888f0 instanceof InterfaceC2910q0) && (pointFMo1122a = ((InterfaceC2910q0) abstractC2888f0).mo1122a(iM4991B2 - 1)) != null && (pointFMo1122a.x < 0.0f || pointFMo1122a.y < 0.0f)) {
                        z7 = true;
                    }
                    int i11 = iM4983H + (z7 == z8 ? -1 : 1);
                    if (i11 >= 0 && i11 < iM4991B) {
                        return i11;
                    }
                }
            }
        }
        return -1;
    }

    /* renamed from: i */
    public final AbstractC2506f m5056i(AbstractC2888f0 abstractC2888f0) {
        C2913s c2913s = this.f10837d;
        if (c2913s == null || ((AbstractC2888f0) c2913s.f9139b) != abstractC2888f0) {
            this.f10837d = new C2913s(abstractC2888f0, 0);
        }
        return this.f10837d;
    }

    /* renamed from: j */
    public final AbstractC2506f m5057j(AbstractC2888f0 abstractC2888f0) {
        C2913s c2913s = this.f10836c;
        if (c2913s == null || ((AbstractC2888f0) c2913s.f9139b) != abstractC2888f0) {
            this.f10836c = new C2913s(abstractC2888f0, 1);
        }
        return this.f10836c;
    }
}
