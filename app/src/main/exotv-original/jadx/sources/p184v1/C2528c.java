package p184v1;

import p063h1.AbstractC1101a;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v1.c */
/* loaded from: classes.dex */
public final class C2528c implements InterfaceC1988o, InterfaceC1989p {

    /* renamed from: j */
    public final /* synthetic */ int f9200j;

    /* renamed from: k */
    public long f9201k;

    /* renamed from: l */
    public Object f9202l;

    public /* synthetic */ C2528c(int i, long j, Object obj) {
        this.f9200j = i;
        this.f9201k = j;
        this.f9202l = obj;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: a */
    public boolean mo3854a(byte[] bArr, int i, int i4, boolean z7) {
        return ((InterfaceC1988o) this.f9202l).mo3854a(bArr, 0, i4, z7);
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: b */
    public boolean mo3855b(byte[] bArr, int i, int i4, boolean z7) {
        return ((InterfaceC1988o) this.f9202l).mo3855b(bArr, i, i4, z7);
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: c */
    public long mo3856c() {
        return ((InterfaceC1988o) this.f9202l).mo3856c() - this.f9201k;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: d */
    public void mo3857d(int i) {
        ((InterfaceC1988o) this.f9202l).mo3857d(i);
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: e */
    public int mo3858e(int i) {
        return ((InterfaceC1988o) this.f9202l).mo3858e(i);
    }

    @Override // p115n1.InterfaceC1989p
    public void endTracks() {
        ((InterfaceC1989p) this.f9202l).endTracks();
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: f */
    public int mo3859f(byte[] bArr, int i, int i4) {
        return ((InterfaceC1988o) this.f9202l).mo3859f(bArr, i, i4);
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: g */
    public void mo3860g() {
        ((InterfaceC1988o) this.f9202l).mo3860g();
    }

    @Override // p115n1.InterfaceC1988o
    public long getLength() {
        return ((InterfaceC1988o) this.f9202l).getLength() - this.f9201k;
    }

    @Override // p115n1.InterfaceC1988o
    public long getPosition() {
        return ((InterfaceC1988o) this.f9202l).getPosition() - this.f9201k;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: h */
    public void mo3861h(int i) {
        ((InterfaceC1988o) this.f9202l).mo3861h(i);
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: i */
    public void mo3862i(byte[] bArr, int i, int i4) {
        ((InterfaceC1988o) this.f9202l).mo3862i(bArr, i, i4);
    }

    /* renamed from: j */
    public void m4543j(int i) {
        if (i < 64) {
            this.f9201k &= ~(1 << i);
            return;
        }
        C2528c c2528c = (C2528c) this.f9202l;
        if (c2528c != null) {
            c2528c.m4543j(i - 64);
        }
    }

    /* renamed from: k */
    public int m4544k(int i) {
        C2528c c2528c = (C2528c) this.f9202l;
        if (c2528c == null) {
            return i >= 64 ? Long.bitCount(this.f9201k) : Long.bitCount(this.f9201k & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.f9201k & ((1 << i) - 1));
        }
        return Long.bitCount(this.f9201k) + c2528c.m4544k(i - 64);
    }

    /* renamed from: l */
    public void m4545l() {
        if (((C2528c) this.f9202l) == null) {
            this.f9202l = new C2528c();
        }
    }

    /* renamed from: m */
    public boolean m4546m(int i) {
        if (i < 64) {
            return (this.f9201k & (1 << i)) != 0;
        }
        m4545l();
        return ((C2528c) this.f9202l).m4546m(i - 64);
    }

    /* renamed from: n */
    public void m4547n(int i, boolean z7) {
        if (i >= 64) {
            m4545l();
            ((C2528c) this.f9202l).m4547n(i - 64, z7);
            return;
        }
        long j = this.f9201k;
        boolean z8 = (Long.MIN_VALUE & j) != 0;
        long j8 = (1 << i) - 1;
        this.f9201k = ((j & (~j8)) << 1) | (j & j8);
        if (z7) {
            m4550q(i);
        } else {
            m4543j(i);
        }
        if (z8 || ((C2528c) this.f9202l) != null) {
            m4545l();
            ((C2528c) this.f9202l).m4547n(0, z8);
        }
    }

    /* renamed from: o */
    public boolean m4548o(int i) {
        if (i >= 64) {
            m4545l();
            return ((C2528c) this.f9202l).m4548o(i - 64);
        }
        long j = 1 << i;
        long j8 = this.f9201k;
        boolean z7 = (j8 & j) != 0;
        long j9 = j8 & (~j);
        this.f9201k = j9;
        long j10 = j - 1;
        this.f9201k = (j9 & j10) | Long.rotateRight((~j10) & j9, 1);
        C2528c c2528c = (C2528c) this.f9202l;
        if (c2528c != null) {
            if (c2528c.m4546m(0)) {
                m4550q(63);
            }
            ((C2528c) this.f9202l).m4548o(0);
        }
        return z7;
    }

    /* renamed from: p */
    public void m4549p() {
        this.f9201k = 0L;
        C2528c c2528c = (C2528c) this.f9202l;
        if (c2528c != null) {
            c2528c.m4549p();
        }
    }

    /* renamed from: q */
    public void m4550q(int i) {
        if (i < 64) {
            this.f9201k |= 1 << i;
        } else {
            m4545l();
            ((C2528c) this.f9202l).m4550q(i - 64);
        }
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public int read(byte[] bArr, int i, int i4) {
        return ((InterfaceC1988o) this.f9202l).read(bArr, i, i4);
    }

    @Override // p115n1.InterfaceC1988o
    public void readFully(byte[] bArr, int i, int i4) {
        ((InterfaceC1988o) this.f9202l).readFully(bArr, i, i4);
    }

    @Override // p115n1.InterfaceC1989p
    public void seekMap(InterfaceC1968c0 interfaceC1968c0) {
        ((InterfaceC1989p) this.f9202l).seekMap(new C2529d(this, interfaceC1968c0, interfaceC1968c0));
    }

    public String toString() {
        switch (this.f9200j) {
            case 3:
                if (((C2528c) this.f9202l) == null) {
                    return Long.toBinaryString(this.f9201k);
                }
                return ((C2528c) this.f9202l).toString() + "xx" + Long.toBinaryString(this.f9201k);
            default:
                return super.toString();
        }
    }

    @Override // p115n1.InterfaceC1989p
    public InterfaceC1980i0 track(int i, int i4) {
        return ((InterfaceC1989p) this.f9202l).track(i, i4);
    }

    public C2528c(InterfaceC1988o interfaceC1988o, long j) {
        this.f9200j = 1;
        this.f9202l = interfaceC1988o;
        AbstractC1101a.m2353d(interfaceC1988o.getPosition() >= j);
        this.f9201k = j;
    }

    public C2528c() {
        this.f9200j = 3;
        this.f9201k = 0L;
    }
}
