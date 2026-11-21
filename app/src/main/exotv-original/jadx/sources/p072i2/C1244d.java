package p072i2;

import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import java.util.Arrays;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p064h2.C1137b;
import p115n1.AbstractC1965b;
import p115n1.C1964a0;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.d */
/* loaded from: classes.dex */
public final class C1244d implements InterfaceC1987n {

    /* renamed from: a */
    public InterfaceC1989p f5197a;

    /* renamed from: b */
    public AbstractC1249i f5198b;

    /* renamed from: c */
    public boolean f5199c;

    /* renamed from: a */
    public final boolean m2717a(InterfaceC1988o interfaceC1988o) {
        boolean zM3848x;
        C1246f c1246f = new C1246f();
        if (c1246f.m2720a(interfaceC1988o, true) && (c1246f.f5205a & 2) == 2) {
            int iMin = Math.min(c1246f.f5209e, 8);
            C1132w c1132w = new C1132w(iMin);
            interfaceC1988o.mo3862i(c1132w.f4799a, 0, iMin);
            c1132w.m2513G(0);
            if (c1132w.m2515a() >= 5 && c1132w.m2535u() == 127 && c1132w.m2537w() == 1179402563) {
                this.f5198b = new C1243c();
                return true;
            }
            c1132w.m2513G(0);
            try {
                zM3848x = AbstractC1965b.m3848x(1, c1132w, true);
            } catch (C0247v0 unused) {
                zM3848x = false;
            }
            if (zM3848x) {
                this.f5198b = new C1251k();
            } else {
                c1132w.m2513G(0);
                if (C1248h.m2722e(c1132w, C1248h.f5212o)) {
                    this.f5198b = new C1248h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f5197a = interfaceC1989p;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0174  */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        int i;
        C1132w c1132w;
        byte[] bArr;
        AbstractC1101a.m2360k(this.f5197a);
        if (this.f5198b == null) {
            if (!m2717a(interfaceC1988o)) {
                throw C0247v0.createForMalformedContainer("Failed to determine bitstream type", null);
            }
            interfaceC1988o.mo3860g();
        }
        if (!this.f5199c) {
            InterfaceC1980i0 interfaceC1980i0Track = this.f5197a.track(0, 1);
            this.f5197a.endTracks();
            AbstractC1249i abstractC1249i = this.f5198b;
            abstractC1249i.f5217c = this.f5197a;
            abstractC1249i.f5216b = interfaceC1980i0Track;
            abstractC1249i.mo2716d(true);
            this.f5199c = true;
        }
        AbstractC1249i abstractC1249i2 = this.f5198b;
        C1245e c1245e = abstractC1249i2.f5215a;
        AbstractC1101a.m2360k(abstractC1249i2.f5216b);
        int i4 = AbstractC1118i0.f4750a;
        int i8 = abstractC1249i2.f5222h;
        long j = -1;
        if (i8 != 0) {
            if (i8 == 1) {
                interfaceC1988o.mo3861h((int) abstractC1249i2.f5220f);
                abstractC1249i2.f5222h = 2;
                return 0;
            }
            if (i8 != 2) {
                if (i8 == 3) {
                    return -1;
                }
                throw new IllegalStateException();
            }
            long j8 = abstractC1249i2.f5218d.read(interfaceC1988o);
            if (j8 >= 0) {
                c1964a0.f7264a = j8;
                return 1;
            }
            if (j8 < -1) {
                abstractC1249i2.mo2723a(-(j8 + 2));
            }
            if (!abstractC1249i2.f5226l) {
                InterfaceC1968c0 interfaceC1968c0Mo2543j = abstractC1249i2.f5218d.mo2543j();
                AbstractC1101a.m2360k(interfaceC1968c0Mo2543j);
                abstractC1249i2.f5217c.seekMap(interfaceC1968c0Mo2543j);
                abstractC1249i2.f5226l = true;
            }
            if (abstractC1249i2.f5225k <= 0 && !c1245e.m2719b(interfaceC1988o)) {
                abstractC1249i2.f5222h = 3;
                return -1;
            }
            abstractC1249i2.f5225k = 0L;
            C1132w c1132w2 = (C1132w) c1245e.f5204n;
            long jMo2714b = abstractC1249i2.mo2714b(c1132w2);
            if (jMo2714b >= 0) {
                long j9 = abstractC1249i2.f5221g;
                if (j9 + jMo2714b >= abstractC1249i2.f5219e) {
                    abstractC1249i2.f5216b.sampleData(c1132w2, c1132w2.f4801c);
                    abstractC1249i2.f5216b.sampleMetadata((j9 * 1000000) / abstractC1249i2.f5223i, 1, c1132w2.f4801c, 0, null);
                    abstractC1249i2.f5219e = -1L;
                }
            }
            abstractC1249i2.f5221g += jMo2714b;
            return 0;
        }
        while (true) {
            boolean zM2719b = c1245e.m2719b(interfaceC1988o);
            C1132w c1132w3 = (C1132w) c1245e.f5204n;
            if (!zM2719b) {
                abstractC1249i2.f5222h = 3;
                return -1;
            }
            long position = interfaceC1988o.getPosition();
            long j10 = j;
            long j11 = abstractC1249i2.f5220f;
            abstractC1249i2.f5225k = position - j11;
            if (abstractC1249i2.mo2715c(c1132w3, j11, abstractC1249i2.f5224j)) {
                abstractC1249i2.f5220f = interfaceC1988o.getPosition();
                j = j10;
            } else {
                C0249w c0249w = (C0249w) abstractC1249i2.f5224j.f62k;
                abstractC1249i2.f5223i = c0249w.f1499D;
                if (!abstractC1249i2.f5227m) {
                    abstractC1249i2.f5216b.format(c0249w);
                    abstractC1249i2.f5227m = true;
                }
                C1137b c1137b = (C1137b) abstractC1249i2.f5224j.f63l;
                if (c1137b != null) {
                    abstractC1249i2.f5218d = c1137b;
                } else {
                    if (interfaceC1988o.getLength() != j10) {
                        C1246f c1246f = (C1246f) c1245e.f5203m;
                        boolean z7 = (c1246f.f5205a & 4) != 0;
                        long j12 = abstractC1249i2.f5220f;
                        long length = interfaceC1988o.getLength();
                        long j13 = c1246f.f5208d + c1246f.f5209e;
                        long j14 = c1246f.f5206b;
                        i = 2;
                        c1132w = c1132w3;
                        abstractC1249i2.f5218d = new C1242b(abstractC1249i2, j12, length, j13, j14, z7);
                        abstractC1249i2.f5222h = i;
                        bArr = c1132w.f4799a;
                        if (bArr.length != 65025) {
                            return 0;
                        }
                        c1132w.m2511E(Arrays.copyOf(bArr, Math.max(65025, c1132w.f4801c)), c1132w.f4801c);
                        return 0;
                    }
                    abstractC1249i2.f5218d = new C2819f(28);
                }
                i = 2;
                c1132w = c1132w3;
                abstractC1249i2.f5222h = i;
                bArr = c1132w.f4799a;
                if (bArr.length != 65025) {
                }
            }
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        AbstractC1249i abstractC1249i = this.f5198b;
        if (abstractC1249i != null) {
            C1245e c1245e = abstractC1249i.f5215a;
            C1246f c1246f = (C1246f) c1245e.f5203m;
            c1246f.f5205a = 0;
            c1246f.f5206b = 0L;
            c1246f.f5207c = 0;
            c1246f.f5208d = 0;
            c1246f.f5209e = 0;
            ((C1132w) c1245e.f5204n).m2510D(0);
            c1245e.f5200j = -1;
            c1245e.f5202l = false;
            if (j == 0) {
                abstractC1249i.mo2716d(!abstractC1249i.f5226l);
                return;
            }
            if (abstractC1249i.f5222h != 0) {
                long j9 = (abstractC1249i.f5223i * j8) / 1000000;
                abstractC1249i.f5219e = j9;
                InterfaceC1247g interfaceC1247g = abstractC1249i.f5218d;
                int i = AbstractC1118i0.f4750a;
                interfaceC1247g.mo2544n(j9);
                abstractC1249i.f5222h = 2;
            }
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        try {
            return m2717a(interfaceC1988o);
        } catch (C0247v0 unused) {
            return false;
        }
    }
}
