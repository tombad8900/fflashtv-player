package p168t2;

import android.util.SparseArray;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import p063h1.AbstractC1101a;
import p063h1.C1108d0;
import p063h1.C1131v;
import p063h1.C1132w;
import p090k2.C1584b;
import p115n1.C1964a0;
import p115n1.C1992s;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p156s.C2332e;
import p158s1.C2339b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.b0 */
/* loaded from: classes.dex */
public final class C2401b0 implements InterfaceC1987n {

    /* renamed from: e */
    public boolean f8476e;

    /* renamed from: f */
    public boolean f8477f;

    /* renamed from: g */
    public boolean f8478g;

    /* renamed from: h */
    public long f8479h;

    /* renamed from: i */
    public C2339b f8480i;

    /* renamed from: j */
    public InterfaceC1989p f8481j;

    /* renamed from: k */
    public boolean f8482k;

    /* renamed from: a */
    public final C1108d0 f8472a = new C1108d0(0);

    /* renamed from: c */
    public final C1132w f8474c = new C1132w(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED);

    /* renamed from: b */
    public final SparseArray f8473b = new SparseArray();

    /* renamed from: d */
    public final C2432z f8475d = new C2432z(0);

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f8481j = interfaceC1989p;
    }

    @Override // p115n1.InterfaceC1987n
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) {
        int i;
        int i4;
        C1108d0 c1108d0;
        InterfaceC2412h c2416j;
        long j;
        AbstractC1101a.m2360k(this.f8481j);
        long length = interfaceC1988o.getLength();
        int i8 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j8 = -9223372036854775807L;
        C2432z c2432z = this.f8475d;
        if (i8 != 0 && !c2432z.f8779d) {
            C1108d0 c1108d02 = c2432z.f8777b;
            C1132w c1132w = c2432z.f8778c;
            if (!c2432z.f8781f) {
                long length2 = interfaceC1988o.getLength();
                int iMin = (int) Math.min(20000L, length2);
                long j9 = length2 - iMin;
                if (interfaceC1988o.getPosition() != j9) {
                    c1964a0.f7264a = j9;
                    return 1;
                }
                c1132w.m2510D(iMin);
                interfaceC1988o.mo3860g();
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, iMin);
                int i9 = c1132w.f4800b;
                int i10 = c1132w.f4801c - 4;
                while (true) {
                    if (i10 < i9) {
                        break;
                    }
                    if (C2432z.m4324b(c1132w.f4799a, i10) == 442) {
                        c1132w.m2513G(i10 + 4);
                        long jM4325c = C2432z.m4325c(c1132w);
                        if (jM4325c != -9223372036854775807L) {
                            j8 = jM4325c;
                            break;
                        }
                    }
                    i10--;
                }
                c2432z.f8783h = j8;
                c2432z.f8781f = true;
                return 0;
            }
            if (c2432z.f8783h == -9223372036854775807L) {
                c2432z.m4326a(interfaceC1988o);
                return 0;
            }
            if (c2432z.f8780e) {
                long j10 = c2432z.f8782g;
                if (j10 == -9223372036854775807L) {
                    c2432z.m4326a(interfaceC1988o);
                    return 0;
                }
                c2432z.f8784i = c1108d02.m2398c(c2432z.f8783h) - c1108d02.m2397b(j10);
                c2432z.m4326a(interfaceC1988o);
                return 0;
            }
            int iMin2 = (int) Math.min(20000L, interfaceC1988o.getLength());
            long j11 = 0;
            if (interfaceC1988o.getPosition() != j11) {
                c1964a0.f7264a = j11;
                return 1;
            }
            c1132w.m2510D(iMin2);
            interfaceC1988o.mo3860g();
            interfaceC1988o.mo3862i(c1132w.f4799a, 0, iMin2);
            int i11 = c1132w.f4800b;
            int i12 = c1132w.f4801c;
            while (true) {
                if (i11 >= i12 - 3) {
                    j = -9223372036854775807L;
                    break;
                }
                if (C2432z.m4324b(c1132w.f4799a, i11) == 442) {
                    c1132w.m2513G(i11 + 4);
                    long jM4325c2 = C2432z.m4325c(c1132w);
                    if (jM4325c2 != -9223372036854775807L) {
                        j = jM4325c2;
                        break;
                    }
                }
                i11++;
            }
            c2432z.f8782g = j;
            c2432z.f8780e = true;
            return 0;
        }
        if (this.f8482k) {
            i = i8;
            i4 = 4;
        } else {
            this.f8482k = true;
            long j12 = c2432z.f8784i;
            if (j12 != -9223372036854775807L) {
                i = i8;
                i4 = 4;
                C2339b c2339b = new C2339b(new C1584b(6), new C2332e(c2432z.f8777b), j12, j12 + 1, 0L, length, 188L, 1000);
                this.f8480i = c2339b;
                this.f8481j.seekMap(c2339b.f8193a);
            } else {
                i = i8;
                i4 = 4;
                this.f8481j.seekMap(new C1992s(j12));
            }
        }
        C2339b c2339b2 = this.f8480i;
        if (c2339b2 != null && c2339b2.f8195c != null) {
            return c2339b2.m4171b(interfaceC1988o, c1964a0);
        }
        interfaceC1988o.mo3860g();
        long jMo3856c = i != 0 ? length - interfaceC1988o.mo3856c() : -1L;
        if (jMo3856c != -1 && jMo3856c < 4) {
            return -1;
        }
        C1132w c1132w2 = this.f8474c;
        if (!interfaceC1988o.mo3855b(c1132w2.f4799a, 0, i4, true)) {
            return -1;
        }
        c1132w2.m2513G(0);
        int iM2521g = c1132w2.m2521g();
        if (iM2521g == 441) {
            return -1;
        }
        if (iM2521g == 442) {
            interfaceC1988o.mo3862i(c1132w2.f4799a, 0, 10);
            c1132w2.m2513G(9);
            interfaceC1988o.mo3861h((c1132w2.m2535u() & 7) + 14);
            return 0;
        }
        if (iM2521g == 443) {
            interfaceC1988o.mo3862i(c1132w2.f4799a, 0, 2);
            c1132w2.m2513G(0);
            interfaceC1988o.mo3861h(c1132w2.m2507A() + 6);
            return 0;
        }
        if (((iM2521g & (-256)) >> 8) != 1) {
            interfaceC1988o.mo3861h(1);
            return 0;
        }
        int i13 = iM2521g & 255;
        SparseArray sparseArray = this.f8473b;
        C2399a0 c2399a0 = (C2399a0) sparseArray.get(i13);
        if (!this.f8476e) {
            if (c2399a0 == null) {
                if (i13 == 189) {
                    c2416j = new C2400b();
                    this.f8477f = true;
                    this.f8479h = interfaceC1988o.getPosition();
                } else if ((iM2521g & 224) == 192) {
                    c2416j = new C2426t(null, 0);
                    this.f8477f = true;
                    this.f8479h = interfaceC1988o.getPosition();
                } else if ((iM2521g & 240) == 224) {
                    c2416j = new C2416j(null);
                    this.f8478g = true;
                    this.f8479h = interfaceC1988o.getPosition();
                } else {
                    c2416j = null;
                }
                if (c2416j != null) {
                    c2416j.mo4248e(this.f8481j, new C2411g0(i13, 256));
                    c2399a0 = new C2399a0(c2416j, this.f8472a);
                    sparseArray.put(i13, c2399a0);
                }
            }
            if (interfaceC1988o.getPosition() > ((this.f8477f && this.f8478g) ? this.f8479h + 8192 : 1048576L)) {
                this.f8476e = true;
                this.f8481j.endTracks();
            }
        }
        interfaceC1988o.mo3862i(c1132w2.f4799a, 0, 2);
        c1132w2.m2513G(0);
        int iM2507A = c1132w2.m2507A() + 6;
        if (c2399a0 == null) {
            interfaceC1988o.mo3861h(iM2507A);
            return 0;
        }
        c1132w2.m2510D(iM2507A);
        interfaceC1988o.readFully(c1132w2.f4799a, 0, iM2507A);
        c1132w2.m2513G(6);
        InterfaceC2412h interfaceC2412h = c2399a0.f8451a;
        C1131v c1131v = c2399a0.f8453c;
        c1132w2.m2519e((byte[]) c1131v.f4792b, 0, 3);
        c1131v.m2502s(0);
        c1131v.m2505v(8);
        c2399a0.f8454d = c1131v.m2493j();
        c2399a0.f8455e = c1131v.m2493j();
        c1131v.m2505v(6);
        c1132w2.m2519e((byte[]) c1131v.f4792b, 0, c1131v.m2494k(8));
        c1131v.m2502s(0);
        C1108d0 c1108d03 = c2399a0.f8452b;
        c2399a0.f8457g = 0L;
        if (c2399a0.f8454d) {
            c1131v.m2505v(i4);
            c1131v.m2505v(1);
            c1131v.m2505v(1);
            long jM2494k = (c1131v.m2494k(3) << 30) | (c1131v.m2494k(15) << 15) | c1131v.m2494k(15);
            c1131v.m2505v(1);
            if (c2399a0.f8456f || !c2399a0.f8455e) {
                c1108d0 = c1108d03;
            } else {
                c1131v.m2505v(i4);
                c1131v.m2505v(1);
                c1108d0 = c1108d03;
                c1131v.m2505v(1);
                c1131v.m2505v(1);
                c1108d0.m2397b((c1131v.m2494k(15) << 15) | (c1131v.m2494k(3) << 30) | c1131v.m2494k(15));
                c2399a0.f8456f = true;
            }
            c2399a0.f8457g = c1108d0.m2397b(jM2494k);
        }
        interfaceC2412h.mo4249f(i4, c2399a0.f8457g);
        interfaceC2412h.mo4245a(c1132w2);
        interfaceC2412h.mo4247d(false);
        c1132w2.m2512F(c1132w2.f4799a.length);
        return 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        long j9;
        SparseArray sparseArray = this.f8473b;
        C1108d0 c1108d0 = this.f8472a;
        synchronized (c1108d0) {
            j9 = c1108d0.f4728b;
        }
        boolean z7 = j9 == -9223372036854775807L;
        if (!z7) {
            long jM2399d = c1108d0.m2399d();
            z7 = (jM2399d == -9223372036854775807L || jM2399d == 0 || jM2399d == j8) ? false : true;
        }
        if (z7) {
            c1108d0.m2401f(j8);
        }
        C2339b c2339b = this.f8480i;
        if (c2339b != null) {
            c2339b.m4172d(j8);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            C2399a0 c2399a0 = (C2399a0) sparseArray.valueAt(i);
            c2399a0.f8456f = false;
            c2399a0.f8451a.mo4246c();
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        byte[] bArr = new byte[14];
        interfaceC1988o.mo3862i(bArr, 0, 14);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            interfaceC1988o.mo3857d(bArr[13] & 7);
            interfaceC1988o.mo3862i(bArr, 0, 3);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }
}
