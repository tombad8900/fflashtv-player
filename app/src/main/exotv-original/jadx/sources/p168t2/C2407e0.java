package p168t2;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import androidx.media3.common.C0247v0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005a4.C0073c;
import p005a4.C0094o;
import p063h1.AbstractC1101a;
import p063h1.C1108d0;
import p063h1.C1132w;
import p079j0.C1481i;
import p090k2.C1584b;
import p090k2.InterfaceC1597o;
import p115n1.C1964a0;
import p115n1.C1992s;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p156s.C2332e;
import p158s1.C2339b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.e0 */
/* loaded from: classes.dex */
public final class C2407e0 implements InterfaceC1987n {

    /* renamed from: a */
    public final int f8524a;

    /* renamed from: b */
    public final int f8525b;

    /* renamed from: c */
    public final List f8526c;

    /* renamed from: d */
    public final C1132w f8527d;

    /* renamed from: e */
    public final SparseIntArray f8528e;

    /* renamed from: f */
    public final C1481i f8529f;

    /* renamed from: g */
    public final InterfaceC1597o f8530g;

    /* renamed from: h */
    public final SparseArray f8531h;

    /* renamed from: i */
    public final SparseBooleanArray f8532i;

    /* renamed from: j */
    public final SparseBooleanArray f8533j;

    /* renamed from: k */
    public final C2432z f8534k;

    /* renamed from: l */
    public C2339b f8535l;

    /* renamed from: m */
    public InterfaceC1989p f8536m;

    /* renamed from: n */
    public int f8537n;

    /* renamed from: o */
    public boolean f8538o;

    /* renamed from: p */
    public boolean f8539p;

    /* renamed from: q */
    public boolean f8540q;

    /* renamed from: r */
    public InterfaceC2413h0 f8541r;

    /* renamed from: s */
    public int f8542s;

    /* renamed from: t */
    public int f8543t;

    public C2407e0(int i, int i4, InterfaceC1597o interfaceC1597o, C1108d0 c1108d0, C1481i c1481i) {
        this.f8529f = c1481i;
        this.f8524a = i;
        this.f8525b = i4;
        this.f8530g = interfaceC1597o;
        if (i == 1 || i == 2) {
            this.f8526c = Collections.singletonList(c1108d0);
        } else {
            ArrayList arrayList = new ArrayList();
            this.f8526c = arrayList;
            arrayList.add(c1108d0);
        }
        this.f8527d = new C1132w(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f8532i = sparseBooleanArray;
        this.f8533j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f8531h = sparseArray;
        this.f8528e = new SparseIntArray();
        this.f8534k = new C2432z(1);
        this.f8536m = InterfaceC1989p.f7372i;
        this.f8543t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i8 = 0; i8 < size; i8++) {
            sparseArray.put(sparseArray2.keyAt(i8), (InterfaceC2413h0) sparseArray2.valueAt(i8));
        }
        sparseArray.put(0, new C2405d0(new C2332e(this)));
        this.f8541r = null;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        if ((this.f8525b & 1) == 0) {
            interfaceC1989p = new C0073c(interfaceC1989p, this.f8530g);
        }
        this.f8536m = interfaceC1989p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    @Override // p115n1.InterfaceC1987n
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        InterfaceC1988o interfaceC1988o2;
        ?? r1;
        int i;
        int i4;
        int i8;
        int i9;
        boolean z7;
        long length = interfaceC1988o.getLength();
        int i10 = this.f8524a;
        boolean z8 = i10 == 2;
        if (this.f8538o) {
            long j = -9223372036854775807L;
            C2432z c2432z = this.f8534k;
            if (length != -1 && !z8 && !c2432z.f8779d) {
                int i11 = this.f8543t;
                C1108d0 c1108d0 = c2432z.f8777b;
                C1132w c1132w = c2432z.f8778c;
                if (i11 <= 0) {
                    c2432z.m4326a(interfaceC1988o);
                    return 0;
                }
                if (c2432z.f8781f) {
                    if (c2432z.f8783h == -9223372036854775807L) {
                        c2432z.m4326a(interfaceC1988o);
                        return 0;
                    }
                    if (c2432z.f8780e) {
                        long j8 = c2432z.f8782g;
                        if (j8 == -9223372036854775807L) {
                            c2432z.m4326a(interfaceC1988o);
                            return 0;
                        }
                        c2432z.f8784i = c1108d0.m2398c(c2432z.f8783h) - c1108d0.m2397b(j8);
                        c2432z.m4326a(interfaceC1988o);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800, interfaceC1988o.getLength());
                    long j9 = 0;
                    if (interfaceC1988o.getPosition() != j9) {
                        c1964a0.f7264a = j9;
                        return 1;
                    }
                    c1132w.m2510D(iMin);
                    interfaceC1988o.mo3860g();
                    interfaceC1988o.mo3862i(c1132w.f4799a, 0, iMin);
                    int i12 = c1132w.f4800b;
                    int i13 = c1132w.f4801c;
                    while (true) {
                        if (i12 >= i13) {
                            break;
                        }
                        if (c1132w.f4799a[i12] == 71) {
                            long jM4268y = AbstractC2415i0.m4268y(c1132w, i12, i11);
                            if (jM4268y != -9223372036854775807L) {
                                j = jM4268y;
                                break;
                            }
                        }
                        i12++;
                    }
                    c2432z.f8782g = j;
                    c2432z.f8780e = true;
                    return 0;
                }
                long length2 = interfaceC1988o.getLength();
                int iMin2 = (int) Math.min(112800, length2);
                long j10 = length2 - iMin2;
                if (interfaceC1988o.getPosition() != j10) {
                    c1964a0.f7264a = j10;
                    return 1;
                }
                c1132w.m2510D(iMin2);
                interfaceC1988o.mo3860g();
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, iMin2);
                int i14 = c1132w.f4800b;
                int i15 = c1132w.f4801c;
                int i16 = i15 - 188;
                while (true) {
                    if (i16 < i14) {
                        break;
                    }
                    byte[] bArr = c1132w.f4799a;
                    int i17 = -4;
                    int i18 = 0;
                    while (true) {
                        if (i17 > 4) {
                            break;
                        }
                        int i19 = (i17 * 188) + i16;
                        if (i19 < i14 || i19 >= i15 || bArr[i19] != 71) {
                            i18 = 0;
                        } else {
                            i18++;
                            if (i18 == 5) {
                                long jM4268y2 = AbstractC2415i0.m4268y(c1132w, i16, i11);
                                if (jM4268y2 != -9223372036854775807L) {
                                    j = jM4268y2;
                                    break;
                                }
                            }
                        }
                        i17++;
                    }
                    i16--;
                }
                c2432z.f8783h = j;
                c2432z.f8781f = true;
                return 0;
            }
            if (this.f8539p) {
                i = 1;
                z7 = false;
                i4 = i10;
            } else {
                this.f8539p = true;
                long j11 = c2432z.f8784i;
                if (j11 != -9223372036854775807L) {
                    i = 1;
                    z7 = false;
                    i4 = i10;
                    C2339b c2339b = new C2339b(new C1584b(6), new C0094o(this.f8543t, c2432z.f8777b), j11, 1 + j11, 0L, length, 188L, 940);
                    this.f8535l = c2339b;
                    this.f8536m.seekMap(c2339b.f8193a);
                } else {
                    i = 1;
                    z7 = false;
                    i4 = i10;
                    this.f8536m.seekMap(new C1992s(j11));
                }
            }
            if (this.f8540q) {
                this.f8540q = z7;
                seek(0L, 0L);
                if (interfaceC1988o.getPosition() != 0) {
                    c1964a0.f7264a = 0L;
                    return i;
                }
            }
            C2339b c2339b2 = this.f8535l;
            if (c2339b2 != null && c2339b2.f8195c != null) {
                return c2339b2.m4171b(interfaceC1988o, c1964a0);
            }
            interfaceC1988o2 = interfaceC1988o;
            r1 = z7;
        } else {
            interfaceC1988o2 = interfaceC1988o;
            r1 = 0;
            i = 1;
            i4 = i10;
        }
        C1132w c1132w2 = this.f8527d;
        byte[] bArr2 = c1132w2.f4799a;
        if (9400 - c1132w2.f4800b < 188) {
            int iM2515a = c1132w2.m2515a();
            if (iM2515a > 0) {
                System.arraycopy(bArr2, c1132w2.f4800b, bArr2, r1, iM2515a);
            }
            c1132w2.m2511E(bArr2, iM2515a);
        }
        while (true) {
            int iM2515a2 = c1132w2.m2515a();
            SparseArray sparseArray = this.f8531h;
            if (iM2515a2 >= 188) {
                int i20 = c1132w2.f4800b;
                int i21 = c1132w2.f4801c;
                byte[] bArr3 = c1132w2.f4799a;
                int i22 = i20;
                while (i22 < i21 && bArr3[i22] != 71) {
                    i22++;
                }
                c1132w2.m2513G(i22);
                int i23 = i22 + 188;
                if (i23 > i21) {
                    int i24 = (i22 - i20) + this.f8542s;
                    this.f8542s = i24;
                    i8 = i4;
                    i9 = 2;
                    if (i8 == 2 && i24 > 376) {
                        throw C0247v0.createForMalformedContainer("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    i8 = i4;
                    i9 = 2;
                    this.f8542s = r1;
                }
                int i25 = c1132w2.f4801c;
                if (i23 > i25) {
                    return r1;
                }
                int iM2521g = c1132w2.m2521g();
                if ((8388608 & iM2521g) != 0) {
                    c1132w2.m2513G(i23);
                    return r1;
                }
                int i26 = (4194304 & iM2521g) != 0 ? 1 : r1;
                int i27 = (2096896 & iM2521g) >> 8;
                boolean z9 = (iM2521g & 32) != 0 ? true : r1;
                InterfaceC2413h0 interfaceC2413h0 = (iM2521g & 16) != 0 ? (InterfaceC2413h0) sparseArray.get(i27) : null;
                if (interfaceC2413h0 == null) {
                    c1132w2.m2513G(i23);
                    return r1;
                }
                if (i8 != i9) {
                    int i28 = iM2521g & 15;
                    SparseIntArray sparseIntArray = this.f8528e;
                    int i29 = sparseIntArray.get(i27, i28 - 1);
                    sparseIntArray.put(i27, i28);
                    if (i29 == i28) {
                        c1132w2.m2513G(i23);
                        return r1;
                    }
                    if (i28 != ((i29 + 1) & 15)) {
                        interfaceC2413h0.mo4252c();
                    }
                }
                if (z9) {
                    int iM2535u = c1132w2.m2535u();
                    i26 |= (c1132w2.m2535u() & 64) != 0 ? i9 : r1;
                    c1132w2.m2514H(iM2535u - 1);
                }
                boolean z10 = this.f8538o;
                if (i8 == i9 || z10 || !this.f8533j.get(i27, r1)) {
                    c1132w2.m2512F(i23);
                    interfaceC2413h0.mo4250a(c1132w2, i26);
                    c1132w2.m2512F(i25);
                }
                if (i8 != i9 && !z10 && this.f8538o && length != -1) {
                    this.f8540q = true;
                }
                c1132w2.m2513G(i23);
                return r1;
            }
            int i30 = c1132w2.f4801c;
            int i31 = interfaceC1988o2.read(bArr2, i30, 9400 - i30);
            if (i31 == -1) {
                int i32 = r1;
                while (i32 < sparseArray.size()) {
                    InterfaceC2413h0 interfaceC2413h02 = (InterfaceC2413h0) sparseArray.valueAt(i32);
                    if (interfaceC2413h02 instanceof C2431y) {
                        C2431y c2431y = (C2431y) interfaceC2413h02;
                        if (c2431y.f8766c == 3 && c2431y.f8773j == -1 && (!z8 || !(c2431y.f8764a instanceof C2416j))) {
                            c2431y.mo4250a(new C1132w(), i);
                        }
                    }
                    i32++;
                    i = 1;
                }
                return -1;
            }
            c1132w2.m2512F(i30 + i31);
            i = 1;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        C2339b c2339b;
        long j9;
        SparseArray sparseArray = this.f8531h;
        List list = this.f8526c;
        AbstractC1101a.m2359j(this.f8524a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C1108d0 c1108d0 = (C1108d0) list.get(i);
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
        }
        if (j8 != 0 && (c2339b = this.f8535l) != null) {
            c2339b.m4172d(j8);
        }
        this.f8527d.m2510D(0);
        this.f8528e.clear();
        for (int i4 = 0; i4 < sparseArray.size(); i4++) {
            ((InterfaceC2413h0) sparseArray.valueAt(i4)).mo4252c();
        }
        this.f8542s = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        r1 = r1 + 1;
     */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        byte[] bArr = this.f8527d.f4799a;
        interfaceC1988o.mo3862i(bArr, 0, 940);
        int i = 0;
        while (i < 188) {
            for (int i4 = 0; i4 < 5; i4++) {
                if (bArr[(i4 * 188) + i] != 71) {
                    break;
                }
            }
            interfaceC1988o.mo3861h(i);
            return true;
        }
        return false;
    }
}
