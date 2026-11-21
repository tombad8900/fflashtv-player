package p048f2;

import java.util.ArrayDeque;
import p002a1.C0036o;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f2.b */
/* loaded from: classes.dex */
public final class C0933b {

    /* renamed from: a */
    public final byte[] f3998a = new byte[8];

    /* renamed from: b */
    public final ArrayDeque f3999b = new ArrayDeque();

    /* renamed from: c */
    public final C0936e f4000c = new C0936e();

    /* renamed from: d */
    public C0036o f4001d;

    /* renamed from: e */
    public int f4002e;

    /* renamed from: f */
    public int f4003f;

    /* renamed from: g */
    public long f4004g;

    /* renamed from: a */
    public final long m2098a(InterfaceC1988o interfaceC1988o, int i) {
        interfaceC1988o.readFully(this.f3998a, 0, i);
        long j = 0;
        for (int i4 = 0; i4 < i; i4++) {
            j = (j << 8) | (r0[i4] & 255);
        }
        return j;
    }
}
