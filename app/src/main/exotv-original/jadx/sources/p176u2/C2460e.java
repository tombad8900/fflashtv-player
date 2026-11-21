package p176u2;

import com.google.android.material.datepicker.C0758p;
import java.math.RoundingMode;
import p063h1.AbstractC1118i0;
import p115n1.C1966b0;
import p115n1.C1970d0;
import p115n1.InterfaceC1968c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u2.e */
/* loaded from: classes.dex */
public final class C2460e implements InterfaceC1968c0 {

    /* renamed from: a */
    public final C0758p f9039a;

    /* renamed from: b */
    public final int f9040b;

    /* renamed from: c */
    public final long f9041c;

    /* renamed from: d */
    public final long f9042d;

    /* renamed from: e */
    public final long f9043e;

    public C2460e(C0758p c0758p, int i, long j, long j8) {
        this.f9039a = c0758p;
        this.f9040b = i;
        this.f9041c = j;
        long j9 = (j8 - j) / c0758p.f3277l;
        this.f9042d = j9;
        this.f9043e = m4437c(j9);
    }

    /* renamed from: c */
    public final long m4437c(long j) {
        long j8 = j * this.f9040b;
        long j9 = this.f9039a.f3276k;
        int i = AbstractC1118i0.f4750a;
        return AbstractC1118i0.m2437a0(j8, 1000000L, j9, RoundingMode.DOWN);
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return this.f9043e;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        C0758p c0758p = this.f9039a;
        long j8 = this.f9042d;
        long jM2452k = AbstractC1118i0.m2452k((c0758p.f3276k * j) / (this.f9040b * 1000000), 0L, j8 - 1);
        long j9 = this.f9041c;
        long jM4437c = m4437c(jM2452k);
        C1970d0 c1970d0 = new C1970d0(jM4437c, (c0758p.f3277l * jM2452k) + j9);
        if (jM4437c >= j || jM2452k == j8 - 1) {
            return new C1966b0(c1970d0, c1970d0);
        }
        long j10 = jM2452k + 1;
        return new C1966b0(c1970d0, new C1970d0(m4437c(j10), (c0758p.f3277l * j10) + j9));
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return true;
    }
}
