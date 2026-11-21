package p064h2;

import p002a1.C0016e;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p072i2.InterfaceC1247g;
import p115n1.C1992s;
import p115n1.C1993t;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h2.b */
/* loaded from: classes.dex */
public final class C1137b implements InterfaceC1247g {

    /* renamed from: j */
    public long f4814j;

    /* renamed from: k */
    public long f4815k;

    /* renamed from: l */
    public Object f4816l;

    /* renamed from: m */
    public Object f4817m;

    public C1137b(String str, byte[] bArr, long j, long j8) {
        this.f4816l = str;
        this.f4817m = bArr;
        this.f4814j = j;
        this.f4815k = j8;
    }

    @Override // p072i2.InterfaceC1247g
    /* renamed from: j */
    public InterfaceC1968c0 mo2543j() {
        AbstractC1101a.m2359j(this.f4814j != -1);
        return new C1992s((C1993t) this.f4816l, this.f4814j, 0);
    }

    @Override // p072i2.InterfaceC1247g
    /* renamed from: n */
    public void mo2544n(long j) {
        long[] jArr = (long[]) ((C0016e) this.f4817m).f62k;
        this.f4815k = jArr[AbstractC1118i0.m2444e(jArr, j, true)];
    }

    @Override // p072i2.InterfaceC1247g
    public long read(InterfaceC1988o interfaceC1988o) {
        long j = this.f4815k;
        if (j < 0) {
            return -1L;
        }
        long j8 = -(j + 2);
        this.f4815k = -1L;
        return j8;
    }
}
