package p182v;

import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.l */
/* loaded from: classes.dex */
public final class C2497l {

    /* renamed from: a */
    public AbstractC2500o f9112a;

    /* renamed from: b */
    public ArrayList f9113b;

    /* renamed from: a */
    public static long m4493a(C2491f c2491f, long j) {
        AbstractC2500o abstractC2500o = c2491f.f9100d;
        ArrayList arrayList = c2491f.f9107k;
        if (abstractC2500o instanceof C2495j) {
            return j;
        }
        int size = arrayList.size();
        long jMin = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2489d interfaceC2489d = (InterfaceC2489d) arrayList.get(i);
            if (interfaceC2489d instanceof C2491f) {
                C2491f c2491f2 = (C2491f) interfaceC2489d;
                if (c2491f2.f9100d != abstractC2500o) {
                    jMin = Math.min(jMin, m4493a(c2491f2, c2491f2.f9102f + j));
                }
            }
        }
        C2491f c2491f3 = abstractC2500o.f9130i;
        C2491f c2491f4 = abstractC2500o.f9129h;
        if (c2491f != c2491f3) {
            return jMin;
        }
        long jMo4466j = j - abstractC2500o.mo4466j();
        return Math.min(Math.min(jMin, m4493a(c2491f4, jMo4466j)), jMo4466j - c2491f4.f9102f);
    }

    /* renamed from: b */
    public static long m4494b(C2491f c2491f, long j) {
        AbstractC2500o abstractC2500o = c2491f.f9100d;
        ArrayList arrayList = c2491f.f9107k;
        if (abstractC2500o instanceof C2495j) {
            return j;
        }
        int size = arrayList.size();
        long jMax = j;
        for (int i = 0; i < size; i++) {
            InterfaceC2489d interfaceC2489d = (InterfaceC2489d) arrayList.get(i);
            if (interfaceC2489d instanceof C2491f) {
                C2491f c2491f2 = (C2491f) interfaceC2489d;
                if (c2491f2.f9100d != abstractC2500o) {
                    jMax = Math.max(jMax, m4494b(c2491f2, c2491f2.f9102f + j));
                }
            }
        }
        C2491f c2491f3 = abstractC2500o.f9129h;
        C2491f c2491f4 = abstractC2500o.f9130i;
        if (c2491f != c2491f3) {
            return jMax;
        }
        long jMo4466j = abstractC2500o.mo4466j() + j;
        return Math.max(Math.max(jMax, m4494b(c2491f4, jMo4466j)), jMo4466j - c2491f4.f9102f);
    }
}
