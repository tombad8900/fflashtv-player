package p198w7;

import java.io.IOException;
import p102l6.C1693j;
import p189v7.C2564e0;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2981i;
import p220z6.C2983k;
import p220z6.C2985m;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w7.i */
/* loaded from: classes.dex */
public final class C2713i extends AbstractC2981i implements InterfaceC2855p {

    /* renamed from: j */
    public final /* synthetic */ C2983k f9860j;

    /* renamed from: k */
    public final /* synthetic */ long f9861k;

    /* renamed from: l */
    public final /* synthetic */ C2985m f9862l;

    /* renamed from: m */
    public final /* synthetic */ C2564e0 f9863m;

    /* renamed from: n */
    public final /* synthetic */ C2985m f9864n;

    /* renamed from: o */
    public final /* synthetic */ C2985m f9865o;

    /* renamed from: p */
    public final /* synthetic */ C2986n f9866p;

    /* renamed from: q */
    public final /* synthetic */ C2986n f9867q;

    /* renamed from: r */
    public final /* synthetic */ C2986n f9868r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2713i(C2983k c2983k, long j, C2985m c2985m, C2564e0 c2564e0, C2985m c2985m2, C2985m c2985m3, C2986n c2986n, C2986n c2986n2, C2986n c2986n3) {
        super(2);
        this.f9860j = c2983k;
        this.f9861k = j;
        this.f9862l = c2985m;
        this.f9863m = c2564e0;
        this.f9864n = c2985m2;
        this.f9865o = c2985m3;
        this.f9866p = c2986n;
        this.f9867q = c2986n2;
        this.f9868r = c2986n3;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) throws IOException {
        int iIntValue = ((Number) obj).intValue();
        long jLongValue = ((Number) obj2).longValue();
        C2564e0 c2564e0 = this.f9863m;
        if (iIntValue == 1) {
            C2983k c2983k = this.f9860j;
            if (c2983k.f11114j) {
                throw new IOException("bad zip: zip64 extra repeated");
            }
            c2983k.f11114j = true;
            if (jLongValue < this.f9861k) {
                throw new IOException("bad zip: zip64 extra too short");
            }
            C2985m c2985m = this.f9862l;
            long jM4611g = c2985m.f11116j;
            if (jM4611g == 4294967295L) {
                jM4611g = c2564e0.m4611g();
            }
            c2985m.f11116j = jM4611g;
            C2985m c2985m2 = this.f9864n;
            c2985m2.f11116j = c2985m2.f11116j == 4294967295L ? c2564e0.m4611g() : 0L;
            C2985m c2985m3 = this.f9865o;
            c2985m3.f11116j = c2985m3.f11116j == 4294967295L ? c2564e0.m4611g() : 0L;
        } else if (iIntValue == 10) {
            if (jLongValue < 4) {
                throw new IOException("bad zip: NTFS extra too short");
            }
            c2564e0.skip(4L);
            AbstractC2706b.m4765e(c2564e0, (int) (jLongValue - 4), new C2712h(this.f9866p, c2564e0, this.f9867q, this.f9868r));
        }
        return C1693j.f6497a;
    }
}
