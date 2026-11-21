package p115n1;

import p005a4.C0087j;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.y */
/* loaded from: classes.dex */
public final class C1998y implements InterfaceC1968c0 {

    /* renamed from: a */
    public final C0087j f7406a;

    /* renamed from: b */
    public final C0087j f7407b;

    /* renamed from: c */
    public long f7408c;

    public C1998y(long j, long[] jArr, long[] jArr2) {
        AbstractC1101a.m2353d(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f7406a = new C0087j(length);
            this.f7407b = new C0087j(length);
        } else {
            int i = length + 1;
            C0087j c0087j = new C0087j(i);
            this.f7406a = c0087j;
            C0087j c0087j2 = new C0087j(i);
            this.f7407b = c0087j2;
            c0087j.m317b(0L);
            c0087j2.m317b(0L);
        }
        this.f7406a.m318c(jArr);
        this.f7407b.m318c(jArr2);
        this.f7408c = j;
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return this.f7408c;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        C0087j c0087j = this.f7407b;
        if (c0087j.f385j == 0) {
            C1970d0 c1970d0 = C1970d0.f7310c;
            return new C1966b0(c1970d0, c1970d0);
        }
        int iM2438b = AbstractC1118i0.m2438b(c0087j, j);
        long jM320f = c0087j.m320f(iM2438b);
        C0087j c0087j2 = this.f7406a;
        C1970d0 c1970d02 = new C1970d0(jM320f, c0087j2.m320f(iM2438b));
        if (jM320f == j || iM2438b == c0087j.f385j - 1) {
            return new C1966b0(c1970d02, c1970d02);
        }
        int i = iM2438b + 1;
        return new C1966b0(c1970d02, new C1970d0(c0087j.m320f(i), c0087j2.m320f(i)));
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return this.f7407b.f385j > 0;
    }
}
