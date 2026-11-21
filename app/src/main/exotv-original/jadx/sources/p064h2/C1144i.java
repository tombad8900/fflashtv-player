package p064h2;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0234r;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p002a1.AbstractC0008a1;
import p005a4.C0073c;
import p005a4.C0094o;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1108d0;
import p063h1.C1132w;
import p071i1.AbstractC1237p;
import p071i1.C1223b;
import p071i1.C1224c;
import p071i1.C1240s;
import p090k2.InterfaceC1597o;
import p115n1.C1964a0;
import p115n1.C1981j;
import p115n1.C1992s;
import p115n1.C1995v;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1976g0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p208y1.C2793a;
import p208y1.C2795c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h2.i */
/* loaded from: classes.dex */
public final class C1144i implements InterfaceC1987n {

    /* renamed from: M */
    public static final byte[] f4839M = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: N */
    public static final C0249w f4840N;

    /* renamed from: A */
    public long f4841A;

    /* renamed from: B */
    public long f4842B;

    /* renamed from: C */
    public C1143h f4843C;

    /* renamed from: D */
    public int f4844D;

    /* renamed from: E */
    public int f4845E;

    /* renamed from: F */
    public int f4846F;

    /* renamed from: G */
    public boolean f4847G;

    /* renamed from: H */
    public boolean f4848H;

    /* renamed from: I */
    public InterfaceC1989p f4849I;

    /* renamed from: J */
    public InterfaceC1980i0[] f4850J;

    /* renamed from: K */
    public InterfaceC1980i0[] f4851K;

    /* renamed from: L */
    public boolean f4852L;

    /* renamed from: a */
    public final InterfaceC1597o f4853a;

    /* renamed from: b */
    public final int f4854b;

    /* renamed from: c */
    public final C1152q f4855c;

    /* renamed from: d */
    public final List f4856d;

    /* renamed from: e */
    public final SparseArray f4857e;

    /* renamed from: f */
    public final C1132w f4858f;

    /* renamed from: g */
    public final C1132w f4859g;

    /* renamed from: h */
    public final C1132w f4860h;

    /* renamed from: i */
    public final byte[] f4861i;

    /* renamed from: j */
    public final C1132w f4862j;

    /* renamed from: k */
    public final C1108d0 f4863k;

    /* renamed from: l */
    public final C2795c f4864l;

    /* renamed from: m */
    public final C1132w f4865m;

    /* renamed from: n */
    public final ArrayDeque f4866n;

    /* renamed from: o */
    public final ArrayDeque f4867o;

    /* renamed from: p */
    public final C1240s f4868p;

    /* renamed from: q */
    public final InterfaceC1980i0 f4869q;

    /* renamed from: r */
    public C0981l1 f4870r;

    /* renamed from: s */
    public int f4871s;

    /* renamed from: t */
    public int f4872t;

    /* renamed from: u */
    public long f4873u;

    /* renamed from: v */
    public int f4874v;

    /* renamed from: w */
    public C1132w f4875w;

    /* renamed from: x */
    public long f4876x;

    /* renamed from: y */
    public int f4877y;

    /* renamed from: z */
    public long f4878z;

    static {
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p("application/x-emsg");
        f4840N = new C0249w(c0246v);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1144i(int i, InterfaceC1597o interfaceC1597o) {
        this(interfaceC1597o, i, null, null, C0981l1.f4211n, null);
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
    }

    /* renamed from: a */
    public static C0237s m2558a(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            C1224c c1224c = (C1224c) list.get(i);
            if (c1224c.f5114b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c1224c.f5112c.f4799a;
                C0094o c0094oM2571i = AbstractC1151p.m2571i(bArr);
                UUID uuid = c0094oM2571i == null ? null : (UUID) c0094oM2571i.f441k;
                if (uuid == null) {
                    AbstractC1101a.m2348F("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new C0234r(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new C0237s(null, false, (C0234r[]) arrayList.toArray(new C0234r[0]));
    }

    /* renamed from: b */
    public static void m2559b(C1132w c1132w, int i, C1154s c1154s) throws C0247v0 {
        c1132w.m2513G(i + 8);
        int iM2521g = c1132w.m2521g();
        byte[] bArr = AbstractC1139d.f4818a;
        if ((iM2521g & 1) != 0) {
            throw C0247v0.createForUnsupportedContainerFeature("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z7 = (iM2521g & 2) != 0;
        int iM2539y = c1132w.m2539y();
        if (iM2539y == 0) {
            Arrays.fill(c1154s.f4956l, 0, c1154s.f4949e, false);
            return;
        }
        int i4 = c1154s.f4949e;
        C1132w c1132w2 = c1154s.f4958n;
        if (iM2539y != i4) {
            throw C0247v0.createForMalformedContainer("Senc sample count " + iM2539y + " is different from fragment sample count" + c1154s.f4949e, null);
        }
        Arrays.fill(c1154s.f4956l, 0, iM2539y, z7);
        c1132w2.m2510D(c1132w.m2515a());
        c1154s.f4955k = true;
        c1154s.f4959o = true;
        c1132w.m2519e(c1132w2.f4799a, 0, c1132w2.f4801c);
        c1132w2.m2513G(0);
        c1154s.f4959o = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:346:0x0794, code lost:
    
        r53.f4871s = 0;
        r53.f4874v = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x0799, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05f9  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06a6  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2560c(long j) throws C0247v0 {
        C1140e c1140e;
        C1140e c1140e2;
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i4;
        C1223b c1223b;
        int iM2521g;
        int i8;
        int size;
        int i9;
        byte[] bArr;
        int i10;
        boolean z7;
        int i11;
        ArrayList arrayList4;
        int i12;
        C1223b c1223b2;
        int i13;
        int iM2521g2;
        int i14;
        int iM2521g3;
        C1140e c1140e3;
        int iM2521g4;
        while (true) {
            ArrayDeque arrayDeque = this.f4866n;
            if (arrayDeque.isEmpty() || ((C1223b) arrayDeque.peek()).f5109c != j) {
                break;
            }
            C1223b c1223b3 = (C1223b) arrayDeque.pop();
            int i15 = c1223b3.f5114b;
            ArrayList arrayList5 = c1223b3.f5111e;
            ArrayList arrayList6 = c1223b3.f5110d;
            int i16 = this.f4854b;
            int i17 = 12;
            C1152q c1152q = this.f4855c;
            SparseArray sparseArray = this.f4857e;
            if (i15 == 1836019574) {
                AbstractC1101a.m2358i("Unexpected moov box.", c1152q == null);
                C0237s c0237sM2558a = m2558a(arrayList6);
                C1223b c1223bM2672g = c1223b3.m2672g(1836475768);
                c1223bM2672g.getClass();
                ArrayList arrayList7 = c1223bM2672g.f5110d;
                SparseArray sparseArray2 = new SparseArray();
                int size2 = arrayList7.size();
                int i18 = 0;
                long jM2537w = -9223372036854775807L;
                while (i18 < size2) {
                    C1224c c1224c = (C1224c) arrayList7.get(i18);
                    int i19 = c1224c.f5114b;
                    C1132w c1132w = c1224c.f5112c;
                    if (i19 == 1953654136) {
                        c1132w.m2513G(i17);
                        arrayList = arrayList7;
                        Pair pairCreate = Pair.create(Integer.valueOf(c1132w.m2521g()), new C1140e(c1132w.m2521g() - 1, c1132w.m2521g(), c1132w.m2521g(), c1132w.m2521g()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (C1140e) pairCreate.second);
                    } else {
                        arrayList = arrayList7;
                        if (i19 == 1835362404) {
                            c1132w.m2513G(8);
                            jM2537w = AbstractC1139d.m2547c(c1132w.m2521g()) == 0 ? c1132w.m2537w() : c1132w.m2540z();
                        }
                    }
                    i18++;
                    arrayList7 = arrayList;
                    i17 = 12;
                }
                int i20 = 1;
                ArrayList arrayListM2551g = AbstractC1139d.m2551g(c1223b3, new C1995v(), jM2537w, c0237sM2558a, (i16 & 16) != 0, false, new C1141f(this));
                int size3 = arrayListM2551g.size();
                if (sparseArray.size() == 0) {
                    int i21 = 0;
                    while (i21 < size3) {
                        C1155t c1155t = (C1155t) arrayListM2551g.get(i21);
                        C1152q c1152q2 = c1155t.f4962a;
                        InterfaceC1989p interfaceC1989p = this.f4849I;
                        int i22 = c1152q2.f4929b;
                        int i23 = c1152q2.f4928a;
                        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(i21, i22);
                        if (sparseArray2.size() == i20) {
                            c1140e = (C1140e) sparseArray2.valueAt(0);
                        } else {
                            c1140e = (C1140e) sparseArray2.get(i23);
                            c1140e.getClass();
                        }
                        sparseArray.put(i23, new C1143h(interfaceC1980i0Track, c1155t, c1140e));
                        this.f4841A = Math.max(this.f4841A, c1152q2.f4932e);
                        i21++;
                        i20 = 1;
                    }
                    this.f4849I.endTracks();
                } else {
                    AbstractC1101a.m2359j(sparseArray.size() == size3);
                    for (int i24 = 0; i24 < size3; i24++) {
                        C1155t c1155t2 = (C1155t) arrayListM2551g.get(i24);
                        C1152q c1152q3 = c1155t2.f4962a;
                        C1143h c1143h = (C1143h) sparseArray.get(c1152q3.f4928a);
                        int i25 = c1152q3.f4928a;
                        if (sparseArray2.size() == 1) {
                            c1140e2 = (C1140e) sparseArray2.valueAt(0);
                        } else {
                            c1140e2 = (C1140e) sparseArray2.get(i25);
                            c1140e2.getClass();
                        }
                        c1143h.f4830d = c1155t2;
                        c1143h.f4831e = c1140e2;
                        c1143h.f4827a.format(c1155t2.f4962a.f4934g);
                        c1143h.m2557e();
                    }
                }
            } else {
                int i26 = i16;
                if (i15 == 1836019558) {
                    boolean z8 = c1152q != null;
                    int size4 = arrayList5.size();
                    int i27 = 0;
                    while (i27 < size4) {
                        C1223b c1223b4 = (C1223b) arrayList5.get(i27);
                        if (c1223b4.f5114b == 1953653094) {
                            C1224c c1224cM2673h = c1223b4.m2673h(1952868452);
                            ArrayList arrayList8 = c1223b4.f5110d;
                            c1224cM2673h.getClass();
                            C1132w c1132w2 = c1224cM2673h.f5112c;
                            c1132w2.m2513G(8);
                            int iM2521g5 = c1132w2.m2521g();
                            byte[] bArr2 = AbstractC1139d.f4818a;
                            C1143h c1143h2 = (C1143h) (z8 ? sparseArray.valueAt(0) : sparseArray.get(c1132w2.m2521g()));
                            if (c1143h2 == null) {
                                i = size4;
                                c1223b = c1223b4;
                                c1143h2 = null;
                            } else {
                                C1154s c1154s = c1143h2.f4828b;
                                c1223b = c1223b4;
                                if ((iM2521g5 & 1) != 0) {
                                    long jM2540z = c1132w2.m2540z();
                                    c1154s.f4946b = jM2540z;
                                    c1154s.f4947c = jM2540z;
                                }
                                C1140e c1140e4 = c1143h2.f4831e;
                                int iM2521g6 = (iM2521g5 & 2) != 0 ? c1132w2.m2521g() - 1 : c1140e4.f4819a;
                                int iM2521g7 = (iM2521g5 & 8) != 0 ? c1132w2.m2521g() : c1140e4.f4820b;
                                if ((iM2521g5 & 16) != 0) {
                                    i = size4;
                                    iM2521g = c1132w2.m2521g();
                                } else {
                                    i = size4;
                                    iM2521g = c1140e4.f4821c;
                                }
                                c1154s.f4945a = new C1140e(iM2521g6, iM2521g7, iM2521g, (iM2521g5 & 32) != 0 ? c1132w2.m2521g() : c1140e4.f4822d);
                            }
                            if (c1143h2 == null) {
                                arrayList2 = arrayList5;
                                arrayList3 = arrayList6;
                                i4 = i26;
                            } else {
                                C1154s c1154s2 = c1143h2.f4828b;
                                long j8 = c1154s2.f4960p;
                                boolean z9 = c1154s2.f4961q;
                                c1143h2.m2557e();
                                c1143h2.f4838l = true;
                                C1223b c1223b5 = c1223b;
                                C1224c c1224cM2673h2 = c1223b5.m2673h(1952867444);
                                if (c1224cM2673h2 == null || (i26 & 2) != 0) {
                                    c1154s2.f4960p = j8;
                                    c1154s2.f4961q = z9;
                                } else {
                                    C1132w c1132w3 = c1224cM2673h2.f5112c;
                                    c1132w3.m2513G(8);
                                    c1154s2.f4960p = AbstractC1139d.m2547c(c1132w3.m2521g()) == 1 ? c1132w3.m2540z() : c1132w3.m2537w();
                                    c1154s2.f4961q = true;
                                }
                                int size5 = arrayList8.size();
                                int i28 = 0;
                                int i29 = 0;
                                int i30 = 0;
                                while (true) {
                                    i8 = 1953658222;
                                    if (i28 >= size5) {
                                        break;
                                    }
                                    int i31 = i28;
                                    C1224c c1224c2 = (C1224c) arrayList8.get(i28);
                                    ArrayList arrayList9 = arrayList5;
                                    if (c1224c2.f5114b == 1953658222) {
                                        C1132w c1132w4 = c1224c2.f5112c;
                                        c1132w4.m2513G(12);
                                        int iM2539y = c1132w4.m2539y();
                                        if (iM2539y > 0) {
                                            i30 += iM2539y;
                                            i29++;
                                        }
                                    }
                                    i28 = i31 + 1;
                                    arrayList5 = arrayList9;
                                }
                                arrayList2 = arrayList5;
                                c1143h2.f4834h = 0;
                                c1143h2.f4833g = 0;
                                c1143h2.f4832f = 0;
                                c1154s2.f4948d = i29;
                                c1154s2.f4949e = i30;
                                if (c1154s2.f4951g.length < i29) {
                                    c1154s2.f4950f = new long[i29];
                                    c1154s2.f4951g = new int[i29];
                                }
                                if (c1154s2.f4952h.length < i30) {
                                    int i32 = (i30 * 125) / 100;
                                    c1154s2.f4952h = new int[i32];
                                    c1154s2.f4953i = new long[i32];
                                    c1154s2.f4954j = new boolean[i32];
                                    c1154s2.f4956l = new boolean[i32];
                                }
                                int i33 = 0;
                                int i34 = 0;
                                int i35 = 0;
                                while (true) {
                                    long j9 = 0;
                                    if (i33 < size5) {
                                        C1224c c1224c3 = (C1224c) arrayList8.get(i33);
                                        int i36 = size5;
                                        if (c1224c3.f5114b == i8) {
                                            int i37 = i34 + 1;
                                            C1132w c1132w5 = c1224c3.f5112c;
                                            c1132w5.m2513G(8);
                                            int iM2521g8 = c1132w5.m2521g();
                                            byte[] bArr3 = AbstractC1139d.f4818a;
                                            C1152q c1152q4 = c1143h2.f4830d.f4962a;
                                            i11 = i33;
                                            C1140e c1140e5 = c1154s2.f4945a;
                                            int i38 = AbstractC1118i0.f4750a;
                                            int i39 = i34;
                                            c1154s2.f4951g[i39] = c1132w5.m2539y();
                                            long[] jArr = c1154s2.f4950f;
                                            int i40 = i35;
                                            long j10 = c1154s2.f4946b;
                                            jArr[i39] = j10;
                                            if ((iM2521g8 & 1) != 0) {
                                                jArr[i39] = j10 + c1132w5.m2521g();
                                            }
                                            boolean z10 = (iM2521g8 & 4) != 0;
                                            int iM2521g9 = c1140e5.f4822d;
                                            if (z10) {
                                                iM2521g9 = c1132w5.m2521g();
                                            }
                                            boolean z11 = z10;
                                            boolean z12 = (iM2521g8 & 256) != 0;
                                            boolean z13 = (iM2521g8 & 512) != 0;
                                            boolean z14 = (iM2521g8 & 1024) != 0;
                                            boolean z15 = (iM2521g8 & 2048) != 0;
                                            boolean z16 = z14;
                                            long[] jArr2 = c1152q4.f4936i;
                                            int i41 = iM2521g9;
                                            long[] jArr3 = c1152q4.f4937j;
                                            if (jArr2 != null && jArr2.length == 1 && jArr3 != null) {
                                                long j11 = jArr2[0];
                                                if (j11 == 0) {
                                                    j9 = jArr3[0];
                                                } else {
                                                    long j12 = c1152q4.f4931d;
                                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                                    if (AbstractC1118i0.m2437a0(j11, 1000000L, j12, roundingMode) + AbstractC1118i0.m2437a0(jArr3[0], 1000000L, c1152q4.f4930c, roundingMode) >= c1152q4.f4932e) {
                                                    }
                                                }
                                            }
                                            int[] iArr = c1154s2.f4952h;
                                            long[] jArr4 = c1154s2.f4953i;
                                            boolean[] zArr = c1154s2.f4954j;
                                            boolean z17 = c1152q4.f4929b == 2 && (i26 & 1) != 0;
                                            i35 = i40 + c1154s2.f4951g[i39];
                                            arrayList4 = arrayList6;
                                            i12 = i26;
                                            long j13 = c1152q4.f4930c;
                                            long j14 = c1154s2.f4960p;
                                            int i42 = i40;
                                            while (i42 < i35) {
                                                if (z12) {
                                                    i13 = i42;
                                                    iM2521g2 = c1132w5.m2521g();
                                                } else {
                                                    i13 = i42;
                                                    iM2521g2 = c1140e5.f4820b;
                                                }
                                                boolean z18 = z17;
                                                if (iM2521g2 < 0) {
                                                    throw C0247v0.createForMalformedContainer("Unexpected negative value: " + iM2521g2, null);
                                                }
                                                if (z13) {
                                                    i14 = i35;
                                                    iM2521g3 = c1132w5.m2521g();
                                                } else {
                                                    i14 = i35;
                                                    iM2521g3 = c1140e5.f4821c;
                                                }
                                                if (iM2521g3 < 0) {
                                                    throw C0247v0.createForMalformedContainer("Unexpected negative value: " + iM2521g3, null);
                                                }
                                                int iM2521g10 = z16 ? c1132w5.m2521g() : (i13 == 0 && z11) ? i41 : c1140e5.f4822d;
                                                if (z15) {
                                                    c1140e3 = c1140e5;
                                                    iM2521g4 = c1132w5.m2521g();
                                                } else {
                                                    c1140e3 = c1140e5;
                                                    iM2521g4 = 0;
                                                }
                                                int i43 = iM2521g10;
                                                long jM2437a0 = AbstractC1118i0.m2437a0((iM2521g4 + j14) - j9, 1000000L, j13, RoundingMode.DOWN);
                                                jArr4[i13] = jM2437a0;
                                                if (!c1154s2.f4961q) {
                                                    jArr4[i13] = jM2437a0 + c1143h2.f4830d.f4969h;
                                                }
                                                iArr[i13] = iM2521g3;
                                                zArr[i13] = ((i43 >> 16) & 1) == 0 && (!z18 || i13 == 0);
                                                j14 += iM2521g2;
                                                i42 = i13 + 1;
                                                i35 = i14;
                                                z17 = z18;
                                                c1140e5 = c1140e3;
                                            }
                                            c1223b2 = c1223b5;
                                            c1154s2.f4960p = j14;
                                            i34 = i37;
                                        } else {
                                            i11 = i33;
                                            arrayList4 = arrayList6;
                                            i12 = i26;
                                            c1223b2 = c1223b5;
                                        }
                                        c1223b5 = c1223b2;
                                        arrayList6 = arrayList4;
                                        i26 = i12;
                                        i8 = 1953658222;
                                        i33 = i11 + 1;
                                        size5 = i36;
                                    } else {
                                        arrayList3 = arrayList6;
                                        i4 = i26;
                                        C1223b c1223b6 = c1223b5;
                                        C1152q c1152q5 = c1143h2.f4830d.f4962a;
                                        C1140e c1140e6 = c1154s2.f4945a;
                                        c1140e6.getClass();
                                        int i44 = c1140e6.f4819a;
                                        C1153r[] c1153rArr = c1152q5.f4939l;
                                        C1153r c1153r = c1153rArr == null ? null : c1153rArr[i44];
                                        C1224c c1224cM2673h3 = c1223b6.m2673h(1935763834);
                                        if (c1224cM2673h3 != null) {
                                            c1153r.getClass();
                                            C1132w c1132w6 = c1224cM2673h3.f5112c;
                                            int i45 = c1153r.f4943d;
                                            c1132w6.m2513G(8);
                                            int iM2521g11 = c1132w6.m2521g();
                                            byte[] bArr4 = AbstractC1139d.f4818a;
                                            if ((iM2521g11 & 1) == 1) {
                                                c1132w6.m2514H(8);
                                            }
                                            int iM2535u = c1132w6.m2535u();
                                            int iM2539y2 = c1132w6.m2539y();
                                            if (iM2539y2 > c1154s2.f4949e) {
                                                throw C0247v0.createForMalformedContainer("Saiz sample count " + iM2539y2 + " is greater than fragment sample count" + c1154s2.f4949e, null);
                                            }
                                            if (iM2535u == 0) {
                                                boolean[] zArr2 = c1154s2.f4956l;
                                                i10 = 0;
                                                for (int i46 = 0; i46 < iM2539y2; i46++) {
                                                    int iM2535u2 = c1132w6.m2535u();
                                                    i10 += iM2535u2;
                                                    zArr2[i46] = iM2535u2 > i45;
                                                }
                                                z7 = false;
                                            } else {
                                                i10 = iM2535u * iM2539y2;
                                                z7 = false;
                                                Arrays.fill(c1154s2.f4956l, 0, iM2539y2, iM2535u > i45);
                                            }
                                            Arrays.fill(c1154s2.f4956l, iM2539y2, c1154s2.f4949e, z7);
                                            if (i10 > 0) {
                                                c1154s2.f4958n.m2510D(i10);
                                                c1154s2.f4955k = true;
                                                c1154s2.f4959o = true;
                                            }
                                        }
                                        C1224c c1224cM2673h4 = c1223b6.m2673h(1935763823);
                                        if (c1224cM2673h4 != null) {
                                            C1132w c1132w7 = c1224cM2673h4.f5112c;
                                            c1132w7.m2513G(8);
                                            int iM2521g12 = c1132w7.m2521g();
                                            byte[] bArr5 = AbstractC1139d.f4818a;
                                            if ((iM2521g12 & 1) == 1) {
                                                c1132w7.m2514H(8);
                                            }
                                            int iM2539y3 = c1132w7.m2539y();
                                            if (iM2539y3 != 1) {
                                                throw C0247v0.createForMalformedContainer("Unexpected saio entry count: " + iM2539y3, null);
                                            }
                                            c1154s2.f4947c += AbstractC1139d.m2547c(iM2521g12) == 0 ? c1132w7.m2537w() : c1132w7.m2540z();
                                        }
                                        C1224c c1224cM2673h5 = c1223b6.m2673h(1936027235);
                                        if (c1224cM2673h5 != null) {
                                            m2559b(c1224cM2673h5.f5112c, 0, c1154s2);
                                        }
                                        String str = c1153r != null ? c1153r.f4941b : null;
                                        C1132w c1132w8 = null;
                                        C1132w c1132w9 = null;
                                        for (int i47 = 0; i47 < arrayList8.size(); i47++) {
                                            C1224c c1224c4 = (C1224c) arrayList8.get(i47);
                                            C1132w c1132w10 = c1224c4.f5112c;
                                            int i48 = c1224c4.f5114b;
                                            if (i48 == 1935828848) {
                                                c1132w10.m2513G(12);
                                                if (c1132w10.m2521g() == 1936025959) {
                                                    c1132w8 = c1132w10;
                                                }
                                            } else if (i48 == 1936158820) {
                                                c1132w10.m2513G(12);
                                                if (c1132w10.m2521g() == 1936025959) {
                                                    c1132w9 = c1132w10;
                                                }
                                            }
                                        }
                                        if (c1132w8 == null || c1132w9 == null) {
                                            size = arrayList8.size();
                                            for (i9 = 0; i9 < size; i9++) {
                                                C1224c c1224c5 = (C1224c) arrayList8.get(i9);
                                                if (c1224c5.f5114b == 1970628964) {
                                                    C1132w c1132w11 = c1224c5.f5112c;
                                                    c1132w11.m2513G(8);
                                                    byte[] bArr6 = this.f4861i;
                                                    c1132w11.m2519e(bArr6, 0, 16);
                                                    if (Arrays.equals(bArr6, f4839M)) {
                                                        m2559b(c1132w11, 16, c1154s2);
                                                    }
                                                }
                                            }
                                        } else {
                                            c1132w8.m2513G(8);
                                            int iM2547c = AbstractC1139d.m2547c(c1132w8.m2521g());
                                            c1132w8.m2514H(4);
                                            if (iM2547c == 1) {
                                                c1132w8.m2514H(4);
                                            }
                                            if (c1132w8.m2521g() != 1) {
                                                throw C0247v0.createForUnsupportedContainerFeature("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            c1132w9.m2513G(8);
                                            int iM2547c2 = AbstractC1139d.m2547c(c1132w9.m2521g());
                                            c1132w9.m2514H(4);
                                            if (iM2547c2 == 1) {
                                                if (c1132w9.m2537w() == 0) {
                                                    throw C0247v0.createForUnsupportedContainerFeature("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iM2547c2 >= 2) {
                                                c1132w9.m2514H(4);
                                            }
                                            if (c1132w9.m2537w() != 1) {
                                                throw C0247v0.createForUnsupportedContainerFeature("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            c1132w9.m2514H(1);
                                            int iM2535u3 = c1132w9.m2535u();
                                            int i49 = (iM2535u3 & 240) >> 4;
                                            int i50 = iM2535u3 & 15;
                                            boolean z19 = c1132w9.m2535u() == 1;
                                            if (z19) {
                                                int iM2535u4 = c1132w9.m2535u();
                                                byte[] bArr7 = new byte[16];
                                                c1132w9.m2519e(bArr7, 0, 16);
                                                if (iM2535u4 == 0) {
                                                    int iM2535u5 = c1132w9.m2535u();
                                                    byte[] bArr8 = new byte[iM2535u5];
                                                    c1132w9.m2519e(bArr8, 0, iM2535u5);
                                                    bArr = bArr8;
                                                } else {
                                                    bArr = null;
                                                }
                                                c1154s2.f4955k = true;
                                                c1154s2.f4957m = new C1153r(z19, str, iM2535u4, bArr7, i49, i50, bArr);
                                            }
                                            size = arrayList8.size();
                                            while (i9 < size) {
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            i = size4;
                            arrayList2 = arrayList5;
                            arrayList3 = arrayList6;
                            i4 = i26;
                        }
                        i27++;
                        arrayList5 = arrayList2;
                        size4 = i;
                        arrayList6 = arrayList3;
                        i26 = i4;
                    }
                    C0237s c0237sM2558a2 = m2558a(arrayList6);
                    if (c0237sM2558a2 != null) {
                        int size6 = sparseArray.size();
                        for (int i51 = 0; i51 < size6; i51++) {
                            C1143h c1143h3 = (C1143h) sparseArray.valueAt(i51);
                            C1152q c1152q6 = c1143h3.f4830d.f4962a;
                            C1140e c1140e7 = c1143h3.f4828b.f4945a;
                            int i52 = AbstractC1118i0.f4750a;
                            int i53 = c1140e7.f4819a;
                            C1153r[] c1153rArr2 = c1152q6.f4939l;
                            C1153r c1153r2 = c1153rArr2 == null ? null : c1153rArr2[i53];
                            C0237s c0237sM667a = c0237sM2558a2.m667a(c1153r2 != null ? c1153r2.f4941b : null);
                            C0246v c0246vM692a = c1143h3.f4830d.f4962a.f4934g.m692a();
                            c0246vM692a.f1451q = c0237sM667a;
                            c1143h3.f4827a.format(new C0249w(c0246vM692a));
                        }
                    }
                    if (this.f4878z != -9223372036854775807L) {
                        int size7 = sparseArray.size();
                        for (int i54 = 0; i54 < size7; i54++) {
                            C1143h c1143h4 = (C1143h) sparseArray.valueAt(i54);
                            long j15 = this.f4878z;
                            int i55 = c1143h4.f4832f;
                            while (true) {
                                C1154s c1154s3 = c1143h4.f4828b;
                                if (i55 >= c1154s3.f4949e || c1154s3.f4953i[i55] > j15) {
                                    break;
                                }
                                if (c1154s3.f4954j[i55]) {
                                    c1143h4.f4835i = i55;
                                }
                                i55++;
                            }
                        }
                        this.f4878z = -9223372036854775807L;
                    }
                } else if (!arrayDeque.isEmpty()) {
                    ((C1223b) arrayDeque.peek()).f5111e.add(c1223b3);
                }
            }
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final List getSniffFailureDetails() {
        return this.f4870r;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        int i;
        int i4 = this.f4854b;
        if ((i4 & 32) == 0) {
            interfaceC1989p = new C0073c(interfaceC1989p, this.f4853a);
        }
        this.f4849I = interfaceC1989p;
        this.f4871s = 0;
        this.f4874v = 0;
        InterfaceC1980i0[] interfaceC1980i0Arr = new InterfaceC1980i0[2];
        this.f4850J = interfaceC1980i0Arr;
        InterfaceC1980i0 interfaceC1980i0 = this.f4869q;
        if (interfaceC1980i0 != null) {
            interfaceC1980i0Arr[0] = interfaceC1980i0;
            i = 1;
        } else {
            i = 0;
        }
        int i8 = 100;
        if ((i4 & 4) != 0) {
            interfaceC1980i0Arr[i] = interfaceC1989p.track(100, 5);
            i8 = 101;
            i++;
        }
        InterfaceC1980i0[] interfaceC1980i0Arr2 = (InterfaceC1980i0[]) AbstractC1118i0.m2430U(i, this.f4850J);
        this.f4850J = interfaceC1980i0Arr2;
        for (InterfaceC1980i0 interfaceC1980i02 : interfaceC1980i0Arr2) {
            interfaceC1980i02.format(f4840N);
        }
        List list = this.f4856d;
        this.f4851K = new InterfaceC1980i0[list.size()];
        int i9 = 0;
        while (i9 < this.f4851K.length) {
            InterfaceC1980i0 interfaceC1980i0Track = this.f4849I.track(i8, 3);
            interfaceC1980i0Track.format((C0249w) list.get(i9));
            this.f4851K[i9] = interfaceC1980i0Track;
            i9++;
            i8++;
        }
        C1152q c1152q = this.f4855c;
        if (c1152q != null) {
            this.f4857e.put(0, new C1143h(this.f4849I.track(0, c1152q.f4929b), new C1155t(this.f4855c, new long[0], new int[0], 0, new long[0], new int[0], 0L), new C1140e(0, 0, 0, 0)));
            this.f4849I.endTracks();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ec, code lost:
    
        if (r35.f4851K.length <= 0) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ee, code lost:
    
        r3 = r24[4];
        r5 = r10.f1522n;
        r3 = r10.f1519k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01fa, code lost:
    
        if (java.util.Objects.equals(r5, "video/avc") != false) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0200, code lost:
    
        if (androidx.media3.common.AbstractC0244u0.m674c(r3, "video/avc") == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0203, code lost:
    
        r25 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0207, code lost:
    
        r25 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x020c, code lost:
    
        if ((r3 & 31) == 6) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0214, code lost:
    
        if (java.util.Objects.equals(r10.f1522n, "video/hevc") != false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x021a, code lost:
    
        if (androidx.media3.common.AbstractC0244u0.m674c(r3, "video/hevc") == null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0224, code lost:
    
        if (((r3 & 126) >> 1) != 39) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0226, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0228, code lost:
    
        r25 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x022b, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x022c, code lost:
    
        r35.f4848H = r3;
        r35.f4845E += 5;
        r35.f4844D += r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x023c, code lost:
    
        if (r35.f4847G != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x024a, code lost:
    
        if (java.util.Objects.equals(r2.f4830d.f4962a.f4934g.f1522n, "video/avc") == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0254, code lost:
    
        if (p071i1.AbstractC1237p.m2682c(r24[4]) == false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0256, code lost:
    
        r35.f4847G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0259, code lost:
    
        r8 = r20;
        r5 = r24;
        r12 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0268, code lost:
    
        throw androidx.media3.common.C0247v0.createForMalformedContainer("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0269, code lost:
    
        r24 = r5;
        r25 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0270, code lost:
    
        if (r35.f4848H == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0272, code lost:
    
        r5 = r35.f4860h;
        r5.m2510D(r3);
        r32 = r2;
        r36.readFully(r5.f4799a, 0, r35.f4846F);
        r11.sampleData(r5, r35.f4846F);
        r2 = r35.f4846F;
        r3 = p071i1.AbstractC1237p.m2690k(r5.f4799a, r5.f4801c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0296, code lost:
    
        if (java.util.Objects.equals(r10.f1522n, "video/hevc") != false) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x029e, code lost:
    
        if (androidx.media3.common.AbstractC0244u0.m674c(r10.f1519k, "video/hevc") == null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02a1, code lost:
    
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x02a3, code lost:
    
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02a4, code lost:
    
        r5.m2513G(r8);
        r5.m2512F(r3);
        r3 = r10.f1524p;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02ad, code lost:
    
        if (r3 != (-1)) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x02af, code lost:
    
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02b3, code lost:
    
        if (r12.f5176a == 0) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02b5, code lost:
    
        r12.f5176a = 0;
        r12.m2699i(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x02bc, code lost:
    
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02c0, code lost:
    
        if (r12.f5176a == r3) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02c2, code lost:
    
        if (r3 < 0) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x02c4, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02c6, code lost:
    
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02c7, code lost:
    
        p063h1.AbstractC1101a.m2359j(r8);
        r12.f5176a = r3;
        r12.m2699i(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02cf, code lost:
    
        r12.m2691a(r6, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02db, code lost:
    
        if ((r32.m2553a() & 4) == 0) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02dd, code lost:
    
        r12.m2699i(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02e1, code lost:
    
        r32 = r2;
        r12 = r17;
        r2 = r11.sampleData((androidx.media3.common.InterfaceC0219m) r36, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ea, code lost:
    
        r35.f4845E += r2;
        r35.f4846F -= r2;
        r17 = r12;
        r8 = r20;
        r5 = r24;
        r12 = r25;
        r2 = r32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0300, code lost:
    
        r32 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0303, code lost:
    
        r32 = r2;
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0307, code lost:
    
        r2 = r35.f4845E;
        r3 = r35.f4844D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x030b, code lost:
    
        if (r2 >= r3) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x030d, code lost:
    
        r35.f4845E += r11.sampleData((androidx.media3.common.InterfaceC0219m) r36, r3 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0319, code lost:
    
        r1 = r32.m2553a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x031f, code lost:
    
        if ((r20 & 64) == 0) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0323, code lost:
    
        if (r35.f4847G != false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0325, code lost:
    
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0328, code lost:
    
        r27 = r1;
        r1 = r32.m2554b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x032e, code lost:
    
        if (r1 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0330, code lost:
    
        r30 = r1.f4942c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0335, code lost:
    
        r30 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0337, code lost:
    
        r25 = r6;
        r11.sampleMetadata(r25, r27, r35.f4844D, 0, r30);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0348, code lost:
    
        if (r14.isEmpty() != false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x034a, code lost:
    
        r1 = (p064h2.C1142g) r14.removeFirst();
        r35.f4877y -= r1.f4826c;
        r2 = r1.f4824a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x035b, code lost:
    
        if (r1.f4825b == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x035d, code lost:
    
        r2 = r2 + r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x035f, code lost:
    
        if (r4 == null) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0361, code lost:
    
        r2 = r4.m2396a(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0365, code lost:
    
        r6 = r2;
        r2 = r35.f4850J;
        r3 = r2.length;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x036a, code lost:
    
        if (r12 >= r3) goto L481;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x036c, code lost:
    
        r2[r12].sampleMetadata(r6, 1, r1.f4826c, r35.f4877y, null);
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x037e, code lost:
    
        if (r32.m2555c() != false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0380, code lost:
    
        r35.f4843C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0383, code lost:
    
        r35.f4871s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x0388, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b7, code lost:
    
        r3 = r2.f4828b;
        r5 = r35.f4871s;
        r8 = r35.f4854b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c1, code lost:
    
        if (r5 != 3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c5, code lost:
    
        if (r2.f4838l != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c7, code lost:
    
        r5 = r2.f4830d.f4965d[r2.f4832f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00d0, code lost:
    
        r5 = r3.f4952h[r2.f4832f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d6, code lost:
    
        r35.f4844D = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00da, code lost:
    
        if ((r8 & 64) == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
    
        if (java.util.Objects.equals(r2.f4830d.f4962a.f4934g.f1522n, "video/avc") != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00eb, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ed, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
    
        r35.f4847G = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00f4, code lost:
    
        if (r2.f4832f >= r2.f4835i) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f6, code lost:
    
        r36.mo3861h(r35.f4844D);
        r1 = r2.m2554b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ff, code lost:
    
        if (r1 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0102, code lost:
    
        r4 = r3.f4958n;
        r1 = r1.f4943d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
    
        if (r1 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0108, code lost:
    
        r4.m2514H(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010b, code lost:
    
        r1 = r2.f4832f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x010f, code lost:
    
        if (r3.f4955k == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        if (r3.f4956l[r1] == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0117, code lost:
    
        r4.m2514H(r4.m2507A() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0123, code lost:
    
        if (r2.m2555c() != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0125, code lost:
    
        r35.f4843C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0128, code lost:
    
        r35.f4871s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012b, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0133, code lost:
    
        if (r2.f4830d.f4962a.f4935h != 1) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0135, code lost:
    
        r35.f4844D -= 8;
        r36.mo3861h(r20);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014e, code lost:
    
        if ("audio/ac4".equals(r2.f4830d.f4962a.f4934g.f1522n) == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0150, code lost:
    
        r35.f4845E = r2.m2556d(r35.f4844D, 7);
        r5 = r35.f4844D;
        r11 = r35.f4862j;
        p115n1.AbstractC1965b.m3832h(r11, r5);
        r2.f4827a.sampleData(r11, 7);
        r35.f4845E += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016b, code lost:
    
        r35.f4845E = r2.m2556d(r35.f4844D, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0173, code lost:
    
        r35.f4844D += r35.f4845E;
        r35.f4871s = 4;
        r35.f4846F = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017f, code lost:
    
        r5 = r2.f4830d;
        r10 = r5.f4962a;
        r11 = r2.f4827a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0187, code lost:
    
        if (r2.f4838l != false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0189, code lost:
    
        r15 = r5.f4967f[r2.f4832f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x018f, code lost:
    
        r6 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0192, code lost:
    
        r15 = r3.f4953i[r2.f4832f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0199, code lost:
    
        if (r4 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019b, code lost:
    
        r6 = r4.m2396a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019f, code lost:
    
        r12 = r10.f4938k;
        r10 = r10.f4934g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a3, code lost:
    
        if (r12 == 0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a5, code lost:
    
        r15 = r35.f4859g;
        r5 = r15.f4799a;
        r5[0] = 0;
        r5[1] = 0;
        r5[r18] = 0;
        r13 = r12 + 1;
        r12 = 4 - r12;
        r17 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b9, code lost:
    
        r20 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bf, code lost:
    
        if (r35.f4845E >= r35.f4844D) goto L471;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c1, code lost:
    
        r3 = r35.f4846F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c5, code lost:
    
        if (r3 != 0) goto L472;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c7, code lost:
    
        r36.readFully(r5, r12, r13);
        r15.m2513G(0);
        r3 = r15.m2521g();
        r24 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d5, code lost:
    
        if (r3 < 1) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01d7, code lost:
    
        r35.f4846F = r3 - 1;
        r3 = r35.f4858f;
        r3.m2513G(0);
        r11.sampleData(r3, 4);
        r11.sampleData(r15, 1);
     */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        char c8;
        int i;
        String strM2530p;
        String strM2530p2;
        long jM2437a0;
        long jM2396a;
        long jM2437a02;
        long jM2537w;
        long jM2540z;
        long jM2540z2;
        while (true) {
            int i4 = this.f4871s;
            ArrayDeque arrayDeque = this.f4866n;
            C1240s c1240s = this.f4868p;
            SparseArray sparseArray = this.f4857e;
            if (i4 != 0) {
                ArrayDeque arrayDeque2 = this.f4867o;
                C1108d0 c1108d0 = this.f4863k;
                if (i4 != 1) {
                    long j = Long.MAX_VALUE;
                    if (i4 != 2) {
                        C1143h c1143h = this.f4843C;
                        if (c1143h != null) {
                            c8 = 2;
                            i = 8;
                            break;
                        }
                        int size = sparseArray.size();
                        c8 = 2;
                        C1143h c1143h2 = null;
                        for (int i8 = 0; i8 < size; i8++) {
                            C1143h c1143h3 = (C1143h) sparseArray.valueAt(i8);
                            boolean z7 = c1143h3.f4838l;
                            C1154s c1154s = c1143h3.f4828b;
                            if ((z7 || c1143h3.f4832f != c1143h3.f4830d.f4963b) && (!z7 || c1143h3.f4834h != c1154s.f4948d)) {
                                long j8 = !z7 ? c1143h3.f4830d.f4964c[c1143h3.f4832f] : c1154s.f4950f[c1143h3.f4834h];
                                if (j8 < j) {
                                    c1143h2 = c1143h3;
                                    j = j8;
                                }
                            }
                        }
                        i = 8;
                        if (c1143h2 == null) {
                            int position = (int) (this.f4876x - interfaceC1988o.getPosition());
                            if (position < 0) {
                                throw C0247v0.createForMalformedContainer("Offset to end of mdat was negative.", null);
                            }
                            interfaceC1988o.mo3861h(position);
                            this.f4871s = 0;
                            this.f4874v = 0;
                        } else {
                            int position2 = (int) ((!c1143h2.f4838l ? c1143h2.f4830d.f4964c[c1143h2.f4832f] : c1143h2.f4828b.f4950f[c1143h2.f4834h]) - interfaceC1988o.getPosition());
                            if (position2 < 0) {
                                AbstractC1101a.m2348F("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                position2 = 0;
                            }
                            interfaceC1988o.mo3861h(position2);
                            this.f4843C = c1143h2;
                            c1143h = c1143h2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        C1143h c1143h4 = null;
                        for (int i9 = 0; i9 < size2; i9++) {
                            C1154s c1154s2 = ((C1143h) sparseArray.valueAt(i9)).f4828b;
                            if (c1154s2.f4959o) {
                                long j9 = c1154s2.f4947c;
                                if (j9 < j) {
                                    c1143h4 = (C1143h) sparseArray.valueAt(i9);
                                    j = j9;
                                }
                            }
                        }
                        if (c1143h4 == null) {
                            this.f4871s = 3;
                        } else {
                            int position3 = (int) (j - interfaceC1988o.getPosition());
                            if (position3 < 0) {
                                throw C0247v0.createForMalformedContainer("Offset to encryption data was negative.", null);
                            }
                            interfaceC1988o.mo3861h(position3);
                            C1154s c1154s3 = c1143h4.f4828b;
                            C1132w c1132w = c1154s3.f4958n;
                            interfaceC1988o.readFully(c1132w.f4799a, 0, c1132w.f4801c);
                            c1132w.m2513G(0);
                            c1154s3.f4959o = false;
                        }
                    }
                } else {
                    int i10 = ((int) this.f4873u) - this.f4874v;
                    C1132w c1132w2 = this.f4875w;
                    if (c1132w2 != null) {
                        interfaceC1988o.readFully(c1132w2.f4799a, 8, i10);
                        int i11 = this.f4872t;
                        C1224c c1224c = new C1224c(c1132w2, i11);
                        long position4 = interfaceC1988o.getPosition();
                        if (!arrayDeque.isEmpty()) {
                            ((C1223b) arrayDeque.peek()).f5110d.add(c1224c);
                        } else if (i11 == 1936286840) {
                            c1132w2.m2513G(8);
                            int iM2547c = AbstractC1139d.m2547c(c1132w2.m2521g());
                            c1132w2.m2514H(4);
                            long jM2537w2 = c1132w2.m2537w();
                            if (iM2547c == 0) {
                                jM2540z = c1132w2.m2537w();
                                jM2540z2 = c1132w2.m2537w();
                            } else {
                                jM2540z = c1132w2.m2540z();
                                jM2540z2 = c1132w2.m2540z();
                            }
                            long j10 = jM2540z2 + position4;
                            long j11 = jM2540z;
                            long j12 = j10;
                            int i12 = AbstractC1118i0.f4750a;
                            long jM2437a03 = AbstractC1118i0.m2437a0(j11, 1000000L, jM2537w2, RoundingMode.DOWN);
                            c1132w2.m2514H(2);
                            int iM2507A = c1132w2.m2507A();
                            int[] iArr = new int[iM2507A];
                            long[] jArr = new long[iM2507A];
                            long[] jArr2 = new long[iM2507A];
                            long j13 = jM2437a03;
                            long[] jArr3 = new long[iM2507A];
                            int i13 = 0;
                            while (i13 < iM2507A) {
                                int iM2521g = c1132w2.m2521g();
                                if ((iM2521g & Integer.MIN_VALUE) != 0) {
                                    throw C0247v0.createForMalformedContainer("Unhandled indirect reference", null);
                                }
                                long jM2537w3 = c1132w2.m2537w();
                                iArr[i13] = iM2521g & Integer.MAX_VALUE;
                                jArr3[i13] = j12;
                                jArr2[i13] = j13;
                                j11 += jM2537w3;
                                int i14 = i13;
                                long[] jArr4 = jArr;
                                long[] jArr5 = jArr2;
                                long jM2437a04 = AbstractC1118i0.m2437a0(j11, 1000000L, jM2537w2, RoundingMode.DOWN);
                                jArr4[i14] = jM2437a04 - jArr5[i14];
                                c1132w2.m2514H(4);
                                jArr3 = jArr3;
                                iM2507A = iM2507A;
                                jArr = jArr4;
                                i13 = i14 + 1;
                                jArr2 = jArr5;
                                j12 += iArr[i14];
                                jM2437a03 = jM2437a03;
                                j13 = jM2437a04;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jM2437a03), new C1981j(iArr, jArr3, jArr, jArr2));
                            this.f4842B = ((Long) pairCreate.first).longValue();
                            this.f4849I.seekMap((InterfaceC1968c0) pairCreate.second);
                            this.f4852L = true;
                        } else if (i11 == 1701671783 && this.f4850J.length != 0) {
                            c1132w2.m2513G(8);
                            int iM2547c2 = AbstractC1139d.m2547c(c1132w2.m2521g());
                            long j14 = -9223372036854775807L;
                            if (iM2547c2 == 0) {
                                strM2530p = c1132w2.m2530p();
                                strM2530p.getClass();
                                strM2530p2 = c1132w2.m2530p();
                                strM2530p2.getClass();
                                long jM2537w4 = c1132w2.m2537w();
                                long jM2537w5 = c1132w2.m2537w();
                                RoundingMode roundingMode = RoundingMode.DOWN;
                                jM2437a0 = AbstractC1118i0.m2437a0(jM2537w5, 1000000L, jM2537w4, roundingMode);
                                long j15 = this.f4842B;
                                jM2396a = j15 != -9223372036854775807L ? j15 + jM2437a0 : -9223372036854775807L;
                                jM2437a02 = AbstractC1118i0.m2437a0(c1132w2.m2537w(), 1000L, jM2537w4, roundingMode);
                                jM2537w = c1132w2.m2537w();
                            } else if (iM2547c2 != 1) {
                                AbstractC0008a1.m23s("Skipping unsupported emsg version: ", iM2547c2, "FragmentedMp4Extractor");
                            } else {
                                long jM2537w6 = c1132w2.m2537w();
                                long jM2540z3 = c1132w2.m2540z();
                                RoundingMode roundingMode2 = RoundingMode.DOWN;
                                long jM2437a05 = AbstractC1118i0.m2437a0(jM2540z3, 1000000L, jM2537w6, roundingMode2);
                                long jM2437a06 = AbstractC1118i0.m2437a0(c1132w2.m2537w(), 1000L, jM2537w6, roundingMode2);
                                long jM2537w7 = c1132w2.m2537w();
                                strM2530p = c1132w2.m2530p();
                                strM2530p.getClass();
                                strM2530p2 = c1132w2.m2530p();
                                strM2530p2.getClass();
                                jM2437a02 = jM2437a06;
                                jM2537w = jM2537w7;
                                jM2396a = jM2437a05;
                                jM2437a0 = -9223372036854775807L;
                            }
                            String str = strM2530p;
                            String str2 = strM2530p2;
                            byte[] bArr = new byte[c1132w2.m2515a()];
                            c1132w2.m2519e(bArr, 0, c1132w2.m2515a());
                            C1132w c1132w3 = new C1132w(this.f4864l.m4906a(new C2793a(str, str2, jM2437a02, jM2537w, bArr)));
                            int iM2515a = c1132w3.m2515a();
                            InterfaceC1980i0[] interfaceC1980i0Arr = this.f4850J;
                            int length = interfaceC1980i0Arr.length;
                            int i15 = 0;
                            while (i15 < length) {
                                InterfaceC1980i0 interfaceC1980i0 = interfaceC1980i0Arr[i15];
                                c1132w3.m2513G(0);
                                interfaceC1980i0.sampleData(c1132w3, iM2515a);
                                i15++;
                                j14 = j14;
                            }
                            if (jM2396a == j14) {
                                arrayDeque2.addLast(new C1142g(iM2515a, true, jM2437a0));
                                this.f4877y += iM2515a;
                            } else if (!arrayDeque2.isEmpty()) {
                                arrayDeque2.addLast(new C1142g(iM2515a, false, jM2396a));
                                this.f4877y += iM2515a;
                            } else if (c1108d0 == null || c1108d0.m2400e()) {
                                if (c1108d0 != null) {
                                    jM2396a = c1108d0.m2396a(jM2396a);
                                }
                                long j16 = jM2396a;
                                for (InterfaceC1980i0 interfaceC1980i02 : this.f4850J) {
                                    interfaceC1980i02.sampleMetadata(j16, 1, iM2515a, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new C1142g(iM2515a, false, jM2396a));
                                this.f4877y += iM2515a;
                            }
                        }
                    } else {
                        interfaceC1988o.mo3861h(i10);
                    }
                    m2560c(interfaceC1988o.getPosition());
                }
            } else {
                int i16 = this.f4874v;
                C1132w c1132w4 = this.f4865m;
                if (i16 == 0) {
                    if (!interfaceC1988o.mo3854a(c1132w4.f4799a, 0, 8, true)) {
                        c1240s.m2699i(0);
                        return -1;
                    }
                    this.f4874v = 8;
                    c1132w4.m2513G(0);
                    this.f4873u = c1132w4.m2537w();
                    this.f4872t = c1132w4.m2521g();
                }
                long j17 = this.f4873u;
                if (j17 == 1) {
                    interfaceC1988o.readFully(c1132w4.f4799a, 8, 8);
                    this.f4874v += 8;
                    this.f4873u = c1132w4.m2540z();
                } else if (j17 == 0) {
                    long length2 = interfaceC1988o.getLength();
                    if (length2 == -1 && !arrayDeque.isEmpty()) {
                        length2 = ((C1223b) arrayDeque.peek()).f5109c;
                    }
                    if (length2 != -1) {
                        this.f4873u = (length2 - interfaceC1988o.getPosition()) + this.f4874v;
                    }
                }
                if (this.f4873u < this.f4874v) {
                    throw C0247v0.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
                }
                long position5 = interfaceC1988o.getPosition() - this.f4874v;
                int i17 = this.f4872t;
                if ((i17 == 1836019558 || i17 == 1835295092) && !this.f4852L) {
                    this.f4849I.seekMap(new C1992s(this.f4841A, position5));
                    this.f4852L = true;
                }
                if (this.f4872t == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i18 = 0; i18 < size3; i18++) {
                        C1154s c1154s4 = ((C1143h) sparseArray.valueAt(i18)).f4828b;
                        c1154s4.getClass();
                        c1154s4.f4947c = position5;
                        c1154s4.f4946b = position5;
                    }
                }
                int i19 = this.f4872t;
                if (i19 == 1835295092) {
                    this.f4843C = null;
                    this.f4876x = position5 + this.f4873u;
                    this.f4871s = 2;
                } else if (i19 == 1836019574 || i19 == 1953653099 || i19 == 1835297121 || i19 == 1835626086 || i19 == 1937007212 || i19 == 1836019558 || i19 == 1953653094 || i19 == 1836475768 || i19 == 1701082227) {
                    long position6 = (interfaceC1988o.getPosition() + this.f4873u) - 8;
                    arrayDeque.push(new C1223b(this.f4872t, position6));
                    if (this.f4873u == this.f4874v) {
                        m2560c(position6);
                    } else {
                        this.f4871s = 0;
                        this.f4874v = 0;
                    }
                } else if (i19 == 1751411826 || i19 == 1835296868 || i19 == 1836476516 || i19 == 1936286840 || i19 == 1937011556 || i19 == 1937011827 || i19 == 1668576371 || i19 == 1937011555 || i19 == 1937011578 || i19 == 1937013298 || i19 == 1937007471 || i19 == 1668232756 || i19 == 1937011571 || i19 == 1952867444 || i19 == 1952868452 || i19 == 1953196132 || i19 == 1953654136 || i19 == 1953658222 || i19 == 1886614376 || i19 == 1935763834 || i19 == 1935763823 || i19 == 1936027235 || i19 == 1970628964 || i19 == 1935828848 || i19 == 1936158820 || i19 == 1701606260 || i19 == 1835362404 || i19 == 1701671783) {
                    if (this.f4874v != 8) {
                        throw C0247v0.createForUnsupportedContainerFeature("Leaf atom defines extended atom size (unsupported).");
                    }
                    if (this.f4873u > 2147483647L) {
                        throw C0247v0.createForUnsupportedContainerFeature("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    C1132w c1132w5 = new C1132w((int) this.f4873u);
                    System.arraycopy(c1132w4.f4799a, 0, c1132w5.f4799a, 0, 8);
                    this.f4875w = c1132w5;
                    this.f4871s = 1;
                } else {
                    if (this.f4873u > 2147483647L) {
                        throw C0247v0.createForUnsupportedContainerFeature("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f4875w = null;
                    this.f4871s = 1;
                }
            }
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        SparseArray sparseArray = this.f4857e;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((C1143h) sparseArray.valueAt(i)).m2557e();
        }
        this.f4867o.clear();
        this.f4877y = 0;
        this.f4868p.m2699i(0);
        this.f4878z = j8;
        this.f4866n.clear();
        this.f4871s = 0;
        this.f4874v = 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        C0981l1 c0981l1M2168n;
        InterfaceC1976g0 interfaceC1976g0M2574l = AbstractC1151p.m2574l(interfaceC1988o, true, false);
        if (interfaceC1976g0M2574l != null) {
            c0981l1M2168n = AbstractC0983m0.m2168n(interfaceC1976g0M2574l);
        } else {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            c0981l1M2168n = C0981l1.f4211n;
        }
        this.f4870r = c0981l1M2168n;
        return interfaceC1976g0M2574l == null;
    }

    public C1144i(InterfaceC1597o interfaceC1597o, int i, C1108d0 c1108d0, C1152q c1152q, List list, InterfaceC1980i0 interfaceC1980i0) {
        this.f4853a = interfaceC1597o;
        this.f4854b = i;
        this.f4863k = c1108d0;
        this.f4855c = c1152q;
        this.f4856d = Collections.unmodifiableList(list);
        this.f4869q = interfaceC1980i0;
        this.f4864l = new C2795c();
        this.f4865m = new C1132w(16);
        this.f4858f = new C1132w(AbstractC1237p.f5170a);
        this.f4859g = new C1132w(5);
        this.f4860h = new C1132w();
        byte[] bArr = new byte[16];
        this.f4861i = bArr;
        this.f4862j = new C1132w(bArr);
        this.f4866n = new ArrayDeque();
        this.f4867o = new ArrayDeque();
        this.f4857e = new SparseArray();
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        this.f4870r = C0981l1.f4211n;
        this.f4841A = -9223372036854775807L;
        this.f4878z = -9223372036854775807L;
        this.f4842B = -9223372036854775807L;
        this.f4849I = InterfaceC1989p.f7372i;
        this.f4850J = new InterfaceC1980i0[0];
        this.f4851K = new InterfaceC1980i0[0];
        this.f4868p = new C1240s(new C1141f(this));
    }
}
