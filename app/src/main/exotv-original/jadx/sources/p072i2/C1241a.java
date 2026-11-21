package p072i2;

import java.math.BigInteger;
import p063h1.AbstractC1118i0;
import p115n1.C1966b0;
import p115n1.C1970d0;
import p115n1.InterfaceC1968c0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.a */
/* loaded from: classes.dex */
public final class C1241a implements InterfaceC1968c0 {

    /* renamed from: a */
    public final /* synthetic */ C1242b f5182a;

    public C1241a(C1242b c1242b) {
        this.f5182a = c1242b;
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return (this.f5182a.f5188o * 1000000) / r0.f5186m.f5223i;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        C1242b c1242b = this.f5182a;
        long j8 = c1242b.f5184k;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((c1242b.f5186m.f5223i * j) / 1000000);
        long j9 = c1242b.f5185l;
        C1970d0 c1970d0 = new C1970d0(j, AbstractC1118i0.m2452k((bigIntegerValueOf.multiply(BigInteger.valueOf(j9 - j8)).divide(BigInteger.valueOf(c1242b.f5188o)).longValue() + j8) - 30000, c1242b.f5184k, j9 - 1));
        return new C1966b0(c1970d0, c1970d0);
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return true;
    }
}
