package p174u;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p005a4.C0073c;
import p156s.C2330c;
import p182v.AbstractC2493h;
import p182v.AbstractC2500o;
import p182v.C2487b;
import p182v.C2488c;
import p182v.C2490e;
import p182v.C2499n;
import p199x.C2719f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u.e */
/* loaded from: classes.dex */
public final class C2443e extends C2442d {

    /* renamed from: A0 */
    public int f8888A0;

    /* renamed from: B0 */
    public C2440b[] f8889B0;

    /* renamed from: C0 */
    public C2440b[] f8890C0;

    /* renamed from: D0 */
    public int f8891D0;

    /* renamed from: E0 */
    public boolean f8892E0;

    /* renamed from: F0 */
    public boolean f8893F0;

    /* renamed from: G0 */
    public WeakReference f8894G0;

    /* renamed from: H0 */
    public WeakReference f8895H0;

    /* renamed from: I0 */
    public WeakReference f8896I0;

    /* renamed from: J0 */
    public WeakReference f8897J0;

    /* renamed from: K0 */
    public final HashSet f8898K0;

    /* renamed from: L0 */
    public final C2487b f8899L0;

    /* renamed from: q0 */
    public ArrayList f8900q0 = new ArrayList();

    /* renamed from: r0 */
    public final C0073c f8901r0 = new C0073c(this);

    /* renamed from: s0 */
    public final C2490e f8902s0;

    /* renamed from: t0 */
    public int f8903t0;

    /* renamed from: u0 */
    public C2719f f8904u0;

    /* renamed from: v0 */
    public boolean f8905v0;

    /* renamed from: w0 */
    public final C2330c f8906w0;

    /* renamed from: x0 */
    public int f8907x0;

    /* renamed from: y0 */
    public int f8908y0;

    /* renamed from: z0 */
    public int f8909z0;

    public C2443e() {
        C2490e c2490e = new C2490e();
        c2490e.f9089b = true;
        c2490e.f9090c = true;
        c2490e.f9093f = new ArrayList();
        new ArrayList();
        c2490e.f9095h = null;
        c2490e.f9096i = new C2487b();
        c2490e.f9094g = new ArrayList();
        c2490e.f9091d = this;
        c2490e.f9092e = this;
        this.f8902s0 = c2490e;
        this.f8904u0 = null;
        this.f8905v0 = false;
        this.f8906w0 = new C2330c();
        this.f8909z0 = 0;
        this.f8888A0 = 0;
        this.f8889B0 = new C2440b[4];
        this.f8890C0 = new C2440b[4];
        this.f8891D0 = 257;
        this.f8892E0 = false;
        this.f8893F0 = false;
        this.f8894G0 = null;
        this.f8895H0 = null;
        this.f8896I0 = null;
        this.f8897J0 = null;
        this.f8898K0 = new HashSet();
        this.f8899L0 = new C2487b();
    }

    /* renamed from: V */
    public static void m4406V(C2442d c2442d, C2719f c2719f, C2487b c2487b) {
        int i;
        int i4;
        if (c2719f == null) {
            return;
        }
        int i8 = c2442d.f8859g0;
        int[] iArr = c2442d.f8881t;
        if (i8 == 8 || (c2442d instanceof C2446h) || (c2442d instanceof C2439a)) {
            c2487b.f9080e = 0;
            c2487b.f9081f = 0;
            return;
        }
        int[] iArr2 = c2442d.f8877p0;
        c2487b.f9076a = iArr2[0];
        c2487b.f9077b = iArr2[1];
        c2487b.f9078c = c2442d.m4396q();
        c2487b.f9079d = c2442d.m4392k();
        c2487b.f9084i = false;
        c2487b.f9085j = 0;
        boolean z7 = c2487b.f9076a == 3;
        boolean z8 = c2487b.f9077b == 3;
        boolean z9 = z7 && c2442d.f8842W > 0.0f;
        boolean z10 = z8 && c2442d.f8842W > 0.0f;
        if (z7 && c2442d.m4399t(0) && c2442d.f8879r == 0 && !z9) {
            c2487b.f9076a = 2;
            if (z8 && c2442d.f8880s == 0) {
                c2487b.f9076a = 1;
            }
            z7 = false;
        }
        if (z8 && c2442d.m4399t(1) && c2442d.f8880s == 0 && !z10) {
            c2487b.f9077b = 2;
            if (z7 && c2442d.f8879r == 0) {
                c2487b.f9077b = 1;
            }
            z8 = false;
        }
        if (c2442d.mo4349A()) {
            c2487b.f9076a = 1;
            z7 = false;
        }
        if (c2442d.mo4350B()) {
            c2487b.f9077b = 1;
            z8 = false;
        }
        if (z9) {
            if (iArr[0] == 4) {
                c2487b.f9076a = 1;
            } else if (!z8) {
                if (c2487b.f9077b == 1) {
                    i4 = c2487b.f9079d;
                } else {
                    c2487b.f9076a = 2;
                    c2719f.m4786b(c2442d, c2487b);
                    i4 = c2487b.f9081f;
                }
                c2487b.f9076a = 1;
                c2487b.f9078c = (int) (c2442d.f8842W * i4);
            }
        }
        if (z10) {
            if (iArr[1] == 4) {
                c2487b.f9077b = 1;
            } else if (!z7) {
                if (c2487b.f9076a == 1) {
                    i = c2487b.f9078c;
                } else {
                    c2487b.f9077b = 2;
                    c2719f.m4786b(c2442d, c2487b);
                    i = c2487b.f9080e;
                }
                c2487b.f9077b = 1;
                if (c2442d.f8843X == -1) {
                    c2487b.f9079d = (int) (i / c2442d.f8842W);
                } else {
                    c2487b.f9079d = (int) (c2442d.f8842W * i);
                }
            }
        }
        c2719f.m4786b(c2442d, c2487b);
        c2442d.m4381O(c2487b.f9080e);
        c2442d.m4378L(c2487b.f9081f);
        c2442d.f8824E = c2487b.f9083h;
        c2442d.m4375I(c2487b.f9082g);
        c2487b.f9085j = 0;
    }

    @Override // p174u.C2442d
    /* renamed from: C */
    public final void mo4371C() {
        this.f8906w0.m4144t();
        this.f8907x0 = 0;
        this.f8908y0 = 0;
        this.f8900q0.clear();
        super.mo4371C();
    }

    @Override // p174u.C2442d
    /* renamed from: F */
    public final void mo4374F(C0073c c0073c) {
        super.mo4374F(c0073c);
        int size = this.f8900q0.size();
        for (int i = 0; i < size; i++) {
            ((C2442d) this.f8900q0.get(i)).mo4374F(c0073c);
        }
    }

    @Override // p174u.C2442d
    /* renamed from: P */
    public final void mo4382P(boolean z7, boolean z8) {
        super.mo4382P(z7, z8);
        int size = this.f8900q0.size();
        for (int i = 0; i < size; i++) {
            ((C2442d) this.f8900q0.get(i)).mo4382P(z7, z8);
        }
    }

    /* renamed from: R */
    public final void m4407R(C2442d c2442d, int i) {
        if (i == 0) {
            int i4 = this.f8909z0 + 1;
            C2440b[] c2440bArr = this.f8890C0;
            if (i4 >= c2440bArr.length) {
                this.f8890C0 = (C2440b[]) Arrays.copyOf(c2440bArr, c2440bArr.length * 2);
            }
            C2440b[] c2440bArr2 = this.f8890C0;
            int i8 = this.f8909z0;
            c2440bArr2[i8] = new C2440b(c2442d, 0, this.f8905v0);
            this.f8909z0 = i8 + 1;
            return;
        }
        if (i == 1) {
            int i9 = this.f8888A0 + 1;
            C2440b[] c2440bArr3 = this.f8889B0;
            if (i9 >= c2440bArr3.length) {
                this.f8889B0 = (C2440b[]) Arrays.copyOf(c2440bArr3, c2440bArr3.length * 2);
            }
            C2440b[] c2440bArr4 = this.f8889B0;
            int i10 = this.f8888A0;
            c2440bArr4[i10] = new C2440b(c2442d, 1, this.f8905v0);
            this.f8888A0 = i10 + 1;
        }
    }

    /* renamed from: S */
    public final void m4408S(C2330c c2330c) {
        C2443e c2443e;
        C2330c c2330c2;
        boolean zM4411W = m4411W(64);
        mo4353b(c2330c, zM4411W);
        int size = this.f8900q0.size();
        boolean z7 = false;
        for (int i = 0; i < size; i++) {
            C2442d c2442d = (C2442d) this.f8900q0.get(i);
            boolean[] zArr = c2442d.f8838S;
            zArr[0] = false;
            zArr[1] = false;
            if (c2442d instanceof C2439a) {
                z7 = true;
            }
        }
        if (z7) {
            for (int i4 = 0; i4 < size; i4++) {
                C2442d c2442d2 = (C2442d) this.f8900q0.get(i4);
                if (c2442d2 instanceof C2439a) {
                    C2439a c2439a = (C2439a) c2442d2;
                    for (int i8 = 0; i8 < c2439a.f8971r0; i8++) {
                        C2442d c2442d3 = c2439a.f8970q0[i8];
                        if (c2439a.f8791t0 || c2442d3.mo4354c()) {
                            int i9 = c2439a.f8790s0;
                            if (i9 == 0 || i9 == 1) {
                                c2442d3.f8838S[0] = true;
                            } else if (i9 == 2 || i9 == 3) {
                                c2442d3.f8838S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f8898K0;
        hashSet.clear();
        for (int i10 = 0; i10 < size; i10++) {
            C2442d c2442d4 = (C2442d) this.f8900q0.get(i10);
            c2442d4.getClass();
            boolean z8 = c2442d4 instanceof C2445g;
            if (z8 || (c2442d4 instanceof C2446h)) {
                if (z8) {
                    hashSet.add(c2442d4);
                } else {
                    c2442d4.mo4353b(c2330c, zM4411W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C2445g c2445g = (C2445g) ((C2442d) it.next());
                for (int i11 = 0; i11 < c2445g.f8971r0; i11++) {
                    if (hashSet.contains(c2445g.f8970q0[i11])) {
                        c2445g.mo4353b(c2330c, zM4411W);
                        hashSet.remove(c2445g);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C2442d) it2.next()).mo4353b(c2330c, zM4411W);
                }
                hashSet.clear();
            }
        }
        if (C2330c.f8151q) {
            HashSet hashSet2 = new HashSet();
            for (int i12 = 0; i12 < size; i12++) {
                C2442d c2442d5 = (C2442d) this.f8900q0.get(i12);
                c2442d5.getClass();
                if (!(c2442d5 instanceof C2445g) && !(c2442d5 instanceof C2446h)) {
                    hashSet2.add(c2442d5);
                }
            }
            c2443e = this;
            c2330c2 = c2330c;
            c2443e.m4384a(this, c2330c2, hashSet2, this.f8877p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C2442d c2442d6 = (C2442d) it3.next();
                AbstractC2448j.m4426b(this, c2330c2, c2442d6);
                c2442d6.mo4353b(c2330c2, zM4411W);
            }
        } else {
            c2443e = this;
            c2330c2 = c2330c;
            for (int i13 = 0; i13 < size; i13++) {
                C2442d c2442d7 = (C2442d) c2443e.f8900q0.get(i13);
                if (c2442d7 instanceof C2443e) {
                    int[] iArr = c2442d7.f8877p0;
                    int i14 = iArr[0];
                    int i15 = iArr[1];
                    if (i14 == 2) {
                        c2442d7.m4379M(1);
                    }
                    if (i15 == 2) {
                        c2442d7.m4380N(1);
                    }
                    c2442d7.mo4353b(c2330c2, zM4411W);
                    if (i14 == 2) {
                        c2442d7.m4379M(i14);
                    }
                    if (i15 == 2) {
                        c2442d7.m4380N(i15);
                    }
                } else {
                    AbstractC2448j.m4426b(this, c2330c2, c2442d7);
                    if (!(c2442d7 instanceof C2445g) && !(c2442d7 instanceof C2446h)) {
                        c2442d7.mo4353b(c2330c2, zM4411W);
                    }
                }
            }
        }
        if (c2443e.f8909z0 > 0) {
            AbstractC2448j.m4425a(this, c2330c2, null, 0);
        }
        if (c2443e.f8888A0 > 0) {
            AbstractC2448j.m4425a(this, c2330c2, null, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: T */
    public final boolean m4409T(int i, boolean z7) {
        int i4;
        int i8;
        boolean z8;
        boolean z9;
        C2490e c2490e = this.f8902s0;
        ArrayList arrayList = (ArrayList) c2490e.f9093f;
        C2443e c2443e = (C2443e) c2490e.f9091d;
        int iM4391j = c2443e.m4391j(0);
        int[] iArr = c2443e.f8877p0;
        int iM4391j2 = c2443e.m4391j(1);
        int iM4397r = c2443e.m4397r();
        int iM4398s = c2443e.m4398s();
        if (z7 && (iM4391j == 2 || iM4391j2 == 2)) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    z9 = z7;
                    break;
                }
                Object obj = arrayList.get(i9);
                i9++;
                AbstractC2500o abstractC2500o = (AbstractC2500o) obj;
                if (abstractC2500o.f9127f == i && !abstractC2500o.mo4467k()) {
                    z9 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z9 && iM4391j == 2) {
                    c2443e.m4379M(1);
                    c2443e.m4381O(c2490e.m4473d(c2443e, 0));
                    c2443e.f8852d.f9126e.mo4479d(c2443e.m4396q());
                }
            } else if (z9 && iM4391j2 == 2) {
                c2443e.m4380N(1);
                c2443e.m4378L(c2490e.m4473d(c2443e, 1));
                c2443e.f8854e.f9126e.mo4479d(c2443e.m4392k());
            }
        }
        if (i == 0) {
            i4 = 0;
            int i10 = iArr[0];
            if (i10 == 1 || i10 == 4) {
                int iM4396q = c2443e.m4396q() + iM4397r;
                c2443e.f8852d.f9130i.mo4479d(iM4396q);
                c2443e.f8852d.f9126e.mo4479d(iM4396q - iM4397r);
                i8 = 1;
            }
            i8 = i4;
        } else {
            i4 = 0;
            int i11 = iArr[1];
            if (i11 == 1 || i11 == 4) {
                int iM4392k = c2443e.m4392k() + iM4398s;
                c2443e.f8854e.f9130i.mo4479d(iM4392k);
                c2443e.f8854e.f9126e.mo4479d(iM4392k - iM4398s);
                i8 = 1;
            }
            i8 = i4;
        }
        c2490e.m4476g();
        int size2 = arrayList.size();
        int i12 = i4;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            AbstractC2500o abstractC2500o2 = (AbstractC2500o) obj2;
            if (abstractC2500o2.f9127f == i && (abstractC2500o2.f9123b != c2443e || abstractC2500o2.f9128g)) {
                abstractC2500o2.mo4464e();
            }
        }
        int size3 = arrayList.size();
        int i13 = i4;
        while (i13 < size3) {
            Object obj3 = arrayList.get(i13);
            i13++;
            AbstractC2500o abstractC2500o3 = (AbstractC2500o) obj3;
            if (abstractC2500o3.f9127f == i && (i8 != 0 || abstractC2500o3.f9123b != c2443e)) {
                if (!abstractC2500o3.f9129h.f9106j || !abstractC2500o3.f9130i.f9106j || (!(abstractC2500o3 instanceof C2488c) && !abstractC2500o3.f9126e.f9106j)) {
                    z8 = i4;
                    break;
                }
            }
        }
        z8 = 1;
        c2443e.m4379M(iM4391j);
        c2443e.m4380N(iM4391j2);
        return z8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:339:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0666  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0671 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0677  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x067f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0690  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x0710  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07bf  */
    /* JADX WARN: Removed duplicated region for block: B:478:0x0800  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x081d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:489:0x082a A[LOOP:14: B:488:0x0828->B:489:0x082a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:502:0x089f  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x08bb  */
    /* JADX WARN: Removed duplicated region for block: B:508:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0127  */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [boolean] */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4410U() {
        Object[] objArr;
        int i;
        int i4;
        int i8;
        int i9;
        C2441c c2441c;
        C2441c c2441c2;
        int i10;
        boolean z7;
        char c8;
        int i11;
        int i12;
        boolean z8;
        boolean z9;
        C2441c c2441c3;
        boolean z10;
        boolean z11;
        boolean[] zArr;
        boolean z12;
        int iMax;
        ?? r8;
        boolean z13;
        int iMax2;
        boolean z14;
        boolean z15;
        int i13;
        int iMax3;
        int iMax4;
        int i14;
        int i15;
        int i16;
        int i17;
        char c9;
        C2499n c2499n;
        int i18;
        int iM4396q;
        int i19;
        int iM4392k;
        int iM4497b;
        int iM4497b2;
        C2499n c2499n2;
        C2499n c2499n3;
        int i20;
        boolean z16;
        this.f8844Y = 0;
        this.f8845Z = 0;
        this.f8892E0 = false;
        this.f8893F0 = false;
        int size = this.f8900q0.size();
        int iMax5 = Math.max(0, m4396q());
        int iMax6 = Math.max(0, m4392k());
        int[] iArr = this.f8877p0;
        int i21 = iArr[1];
        int i22 = iArr[0];
        int i23 = this.f8903t0;
        C2441c c2441c4 = this.f8829J;
        C2441c c2441c5 = this.f8828I;
        if (i23 == 0 && AbstractC2448j.m4427c(this.f8891D0, 1)) {
            C2719f c2719f = this.f8904u0;
            int i24 = iArr[0];
            int i25 = iArr[1];
            m4373E();
            ArrayList arrayList = this.f8900q0;
            int size2 = arrayList.size();
            for (int i26 = 0; i26 < size2; i26++) {
                ((C2442d) arrayList.get(i26)).m4373E();
            }
            boolean z17 = this.f8905v0;
            if (i24 == 1) {
                m4376J(0, m4396q());
            } else {
                c2441c5.m4366l(0);
                this.f8844Y = 0;
            }
            int i27 = 0;
            boolean z18 = false;
            boolean z19 = false;
            while (i27 < size2) {
                int[] iArr2 = iArr;
                C2442d c2442d = (C2442d) arrayList.get(i27);
                int i28 = i27;
                if (c2442d instanceof C2446h) {
                    C2446h c2446h = (C2446h) c2442d;
                    z16 = z18;
                    if (c2446h.f8968u0 == 1) {
                        int i29 = c2446h.f8965r0;
                        if (i29 != -1) {
                            c2446h.m4422R(i29);
                        } else if (c2446h.f8966s0 != -1 && mo4349A()) {
                            c2446h.m4422R(m4396q() - c2446h.f8966s0);
                        } else if (mo4349A()) {
                            c2446h.m4422R((int) ((c2446h.f8964q0 * m4396q()) + 0.5f));
                        }
                        z16 = true;
                    }
                } else {
                    z16 = z18;
                    if ((c2442d instanceof C2439a) && ((C2439a) c2442d).m4352U() == 0) {
                        z18 = z16;
                        z19 = true;
                    }
                    i27 = i28 + 1;
                    iArr = iArr2;
                }
                z18 = z16;
                i27 = i28 + 1;
                iArr = iArr2;
            }
            objArr = iArr;
            if (z18) {
                for (int i30 = 0; i30 < size2; i30 = i20 + 1) {
                    C2442d c2442d2 = (C2442d) arrayList.get(i30);
                    if (c2442d2 instanceof C2446h) {
                        C2446h c2446h2 = (C2446h) c2442d2;
                        i20 = i30;
                        if (c2446h2.f8968u0 == 1) {
                            AbstractC2493h.m4482c(0, c2446h2, c2719f, z17);
                        }
                    } else {
                        i20 = i30;
                    }
                }
            }
            AbstractC2493h.m4482c(0, this, c2719f, z17);
            if (z19) {
                for (int i31 = 0; i31 < size2; i31++) {
                    C2442d c2442d3 = (C2442d) arrayList.get(i31);
                    if (c2442d3 instanceof C2439a) {
                        C2439a c2439a = (C2439a) c2442d3;
                        if (c2439a.m4352U() == 0 && c2439a.m4351T()) {
                            AbstractC2493h.m4482c(1, c2439a, c2719f, z17);
                        }
                    }
                }
            }
            if (i25 == 1) {
                m4377K(0, m4392k());
            } else {
                c2441c4.m4366l(0);
                this.f8845Z = 0;
            }
            int i32 = 0;
            boolean z20 = false;
            boolean z21 = false;
            while (i32 < size2) {
                C2442d c2442d4 = (C2442d) arrayList.get(i32);
                int i33 = i32;
                if (c2442d4 instanceof C2446h) {
                    C2446h c2446h3 = (C2446h) c2442d4;
                    if (c2446h3.f8968u0 == 0) {
                        int i34 = c2446h3.f8965r0;
                        if (i34 != -1) {
                            c2446h3.m4422R(i34);
                        } else if (c2446h3.f8966s0 != -1 && mo4350B()) {
                            c2446h3.m4422R(m4392k() - c2446h3.f8966s0);
                        } else if (mo4350B()) {
                            c2446h3.m4422R((int) ((c2446h3.f8964q0 * m4392k()) + 0.5f));
                        }
                        z20 = true;
                    }
                } else if ((c2442d4 instanceof C2439a) && ((C2439a) c2442d4).m4352U() == 1) {
                    z21 = true;
                }
                i32 = i33 + 1;
            }
            if (z20) {
                for (int i35 = 0; i35 < size2; i35++) {
                    C2442d c2442d5 = (C2442d) arrayList.get(i35);
                    if (c2442d5 instanceof C2446h) {
                        C2446h c2446h4 = (C2446h) c2442d5;
                        if (c2446h4.f8968u0 == 0) {
                            AbstractC2493h.m4488i(1, c2446h4, c2719f);
                        }
                    }
                }
            }
            AbstractC2493h.m4488i(0, this, c2719f);
            if (z21) {
                for (int i36 = 0; i36 < size2; i36++) {
                    C2442d c2442d6 = (C2442d) arrayList.get(i36);
                    if (c2442d6 instanceof C2439a) {
                        C2439a c2439a2 = (C2439a) c2442d6;
                        if (c2439a2.m4352U() == 1 && c2439a2.m4351T()) {
                            AbstractC2493h.m4488i(1, c2439a2, c2719f);
                        }
                    }
                }
            }
            for (int i37 = 0; i37 < size2; i37++) {
                C2442d c2442d7 = (C2442d) arrayList.get(i37);
                if (c2442d7.m4405z() && AbstractC2493h.m4480a(c2442d7)) {
                    m4406V(c2442d7, c2719f, AbstractC2493h.f9110a);
                    if (!(c2442d7 instanceof C2446h)) {
                        AbstractC2493h.m4482c(0, c2442d7, c2719f, z17);
                        AbstractC2493h.m4488i(0, c2442d7, c2719f);
                    } else if (((C2446h) c2442d7).f8968u0 == 0) {
                        AbstractC2493h.m4488i(0, c2442d7, c2719f);
                    } else {
                        AbstractC2493h.m4482c(0, c2442d7, c2719f, z17);
                    }
                }
            }
            for (int i38 = 0; i38 < size; i38++) {
                C2442d c2442d8 = (C2442d) this.f8900q0.get(i38);
                if (c2442d8.m4405z() && !(c2442d8 instanceof C2446h) && !(c2442d8 instanceof C2439a) && !(c2442d8 instanceof C2445g) && !c2442d8.f8825F) {
                    int iM4391j = c2442d8.m4391j(0);
                    int iM4391j2 = c2442d8.m4391j(1);
                    if (iM4391j != 3 || c2442d8.f8879r == 1 || iM4391j2 != 3 || c2442d8.f8880s == 1) {
                        m4406V(c2442d8, this.f8904u0, new C2487b());
                    }
                }
            }
        } else {
            objArr = iArr;
        }
        C2330c c2330c = this.f8906w0;
        if (size <= 2 || !((i22 == 2 || i21 == 2) && AbstractC2448j.m4427c(this.f8891D0, 1024))) {
            i = size;
            i4 = iMax6;
            i8 = i21;
            i9 = i22;
            c2441c = c2441c4;
            c2441c2 = c2441c5;
            i10 = iMax5;
        } else {
            C2719f c2719f2 = this.f8904u0;
            ArrayList arrayList2 = this.f8900q0;
            int size3 = arrayList2.size();
            int i39 = 0;
            while (i39 < size3) {
                C2442d c2442d9 = (C2442d) arrayList2.get(i39);
                char c10 = objArr[0];
                char c11 = objArr[1];
                int i40 = i39;
                int[] iArr3 = c2442d9.f8877p0;
                c2441c2 = c2441c5;
                if (!AbstractC2493h.m4487h(c10, c11, iArr3[0], iArr3[1]) || (c2442d9 instanceof C2445g)) {
                    i14 = iMax5;
                    i = size;
                    i15 = iMax6;
                    i16 = i21;
                    i17 = i22;
                    c2441c = c2441c4;
                    break;
                }
                i39 = i40 + 1;
                c2441c5 = c2441c2;
            }
            c2441c2 = c2441c5;
            i = size;
            c2441c = c2441c4;
            int i41 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i41 < size3) {
                int i42 = i41;
                C2442d c2442d10 = (C2442d) arrayList2.get(i41);
                int i43 = iMax6;
                char c12 = objArr[0];
                int i44 = i21;
                char c13 = objArr[1];
                int i45 = iMax5;
                int[] iArr4 = c2442d10.f8877p0;
                int i46 = i22;
                if (!AbstractC2493h.m4487h(c12, c13, iArr4[0], iArr4[1])) {
                    m4406V(c2442d10, c2719f2, this.f8899L0);
                }
                boolean z22 = c2442d10 instanceof C2446h;
                if (z22) {
                    C2446h c2446h5 = (C2446h) c2442d10;
                    if (c2446h5.f8968u0 == 0) {
                        if (arrayList7 == null) {
                            arrayList7 = new ArrayList();
                        }
                        arrayList7.add(c2446h5);
                    }
                    if (c2446h5.f8968u0 == 1) {
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(c2446h5);
                    }
                }
                if (c2442d10 instanceof AbstractC2447i) {
                    if (c2442d10 instanceof C2439a) {
                        C2439a c2439a3 = (C2439a) c2442d10;
                        if (c2439a3.m4352U() == 0) {
                            if (arrayList5 == null) {
                                arrayList5 = new ArrayList();
                            }
                            arrayList5.add(c2439a3);
                        }
                        if (c2439a3.m4352U() == 1) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(c2439a3);
                        }
                    } else {
                        AbstractC2447i abstractC2447i = (AbstractC2447i) c2442d10;
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(abstractC2447i);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                        }
                        arrayList8.add(abstractC2447i);
                    }
                }
                if (c2442d10.f8828I.f8816f == null && c2442d10.f8830K.f8816f == null && !z22 && !(c2442d10 instanceof C2439a)) {
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                    }
                    arrayList6.add(c2442d10);
                }
                if (c2442d10.f8829J.f8816f == null && c2442d10.f8831L.f8816f == null && c2442d10.f8832M.f8816f == null && !z22 && !(c2442d10 instanceof C2439a)) {
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    arrayList3.add(c2442d10);
                }
                i41 = i42 + 1;
                iMax6 = i43;
                i21 = i44;
                iMax5 = i45;
                i22 = i46;
            }
            i14 = iMax5;
            i15 = iMax6;
            i16 = i21;
            i17 = i22;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList4 != null) {
                int size4 = arrayList4.size();
                int i47 = 0;
                while (i47 < size4) {
                    Object obj = arrayList4.get(i47);
                    i47++;
                    AbstractC2493h.m4481b((C2446h) obj, 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                int size5 = arrayList5.size();
                int i48 = 0;
                while (i48 < size5) {
                    Object obj2 = arrayList5.get(i48);
                    i48++;
                    AbstractC2447i abstractC2447i2 = (AbstractC2447i) obj2;
                    C2499n c2499nM4481b = AbstractC2493h.m4481b(abstractC2447i2, 0, arrayList9, null);
                    abstractC2447i2.m4424R(0, arrayList9, c2499nM4481b);
                    c2499nM4481b.m4496a(arrayList9);
                }
            }
            HashSet hashSet = mo4390i(2).f8811a;
            if (hashSet != null) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    AbstractC2493h.m4481b(((C2441c) it.next()).f8814d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = mo4390i(4).f8811a;
            if (hashSet2 != null) {
                Iterator it2 = hashSet2.iterator();
                while (it2.hasNext()) {
                    AbstractC2493h.m4481b(((C2441c) it2.next()).f8814d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = mo4390i(7).f8811a;
            if (hashSet3 != null) {
                Iterator it3 = hashSet3.iterator();
                while (it3.hasNext()) {
                    AbstractC2493h.m4481b(((C2441c) it3.next()).f8814d, 0, arrayList9, null);
                }
            }
            if (arrayList6 != null) {
                int size6 = arrayList6.size();
                int i49 = 0;
                while (i49 < size6) {
                    Object obj3 = arrayList6.get(i49);
                    i49++;
                    AbstractC2493h.m4481b((C2442d) obj3, 0, arrayList9, null);
                }
            }
            if (arrayList7 != null) {
                int size7 = arrayList7.size();
                int i50 = 0;
                while (i50 < size7) {
                    Object obj4 = arrayList7.get(i50);
                    i50++;
                    AbstractC2493h.m4481b((C2446h) obj4, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                int size8 = arrayList8.size();
                int i51 = 0;
                while (i51 < size8) {
                    Object obj5 = arrayList8.get(i51);
                    i51++;
                    AbstractC2447i abstractC2447i3 = (AbstractC2447i) obj5;
                    C2499n c2499nM4481b2 = AbstractC2493h.m4481b(abstractC2447i3, 1, arrayList9, null);
                    abstractC2447i3.m4424R(1, arrayList9, c2499nM4481b2);
                    c2499nM4481b2.m4496a(arrayList9);
                }
            }
            HashSet hashSet4 = mo4390i(3).f8811a;
            if (hashSet4 != null) {
                Iterator it4 = hashSet4.iterator();
                while (it4.hasNext()) {
                    AbstractC2493h.m4481b(((C2441c) it4.next()).f8814d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = mo4390i(6).f8811a;
            if (hashSet5 != null) {
                Iterator it5 = hashSet5.iterator();
                while (it5.hasNext()) {
                    AbstractC2493h.m4481b(((C2441c) it5.next()).f8814d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = mo4390i(5).f8811a;
            if (hashSet6 != null) {
                Iterator it6 = hashSet6.iterator();
                while (it6.hasNext()) {
                    AbstractC2493h.m4481b(((C2441c) it6.next()).f8814d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = mo4390i(7).f8811a;
            if (hashSet7 != null) {
                Iterator it7 = hashSet7.iterator();
                while (it7.hasNext()) {
                    AbstractC2493h.m4481b(((C2441c) it7.next()).f8814d, 1, arrayList9, null);
                }
            }
            if (arrayList3 != null) {
                int size9 = arrayList3.size();
                int i52 = 0;
                while (i52 < size9) {
                    Object obj6 = arrayList3.get(i52);
                    i52++;
                    AbstractC2493h.m4481b((C2442d) obj6, 1, arrayList9, null);
                }
            }
            char c14 = 1;
            int i53 = 0;
            while (i53 < size3) {
                C2442d c2442d11 = (C2442d) arrayList2.get(i53);
                int[] iArr5 = c2442d11.f8877p0;
                if (iArr5[0] == 3 && iArr5[c14] == 3) {
                    int i54 = c2442d11.f8873n0;
                    int size10 = arrayList9.size();
                    int i55 = 0;
                    while (true) {
                        if (i55 >= size10) {
                            c2499n2 = null;
                            break;
                        }
                        c2499n2 = (C2499n) arrayList9.get(i55);
                        if (i54 == c2499n2.f9118b) {
                            break;
                        } else {
                            i55++;
                        }
                    }
                    int i56 = c2442d11.f8875o0;
                    int size11 = arrayList9.size();
                    int i57 = 0;
                    while (true) {
                        if (i57 >= size11) {
                            c2499n3 = null;
                            break;
                        }
                        c2499n3 = (C2499n) arrayList9.get(i57);
                        if (i56 == c2499n3.f9118b) {
                            break;
                        } else {
                            i57++;
                        }
                    }
                    if (c2499n2 != null && c2499n3 != null) {
                        c2499n2.m4498c(0, c2499n3);
                        c2499n3.f9119c = 2;
                        arrayList9.remove(c2499n2);
                    }
                }
                i53++;
                c14 = 1;
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    int size12 = arrayList9.size();
                    int i58 = 0;
                    int i59 = 0;
                    c2499n = null;
                    while (i59 < size12) {
                        Object obj7 = arrayList9.get(i59);
                        i59++;
                        C2499n c2499n4 = (C2499n) obj7;
                        if (c2499n4.f9119c != 1 && (iM4497b2 = c2499n4.m4497b(c2330c, 0)) > i58) {
                            c2499n = c2499n4;
                            i58 = iM4497b2;
                        }
                    }
                    c9 = 1;
                    if (c2499n != null) {
                        m4379M(1);
                        m4381O(i58);
                    }
                    if (objArr[c9] != 2) {
                        int size13 = arrayList9.size();
                        int i60 = 0;
                        int i61 = 0;
                        C2499n c2499n5 = null;
                        while (i61 < size13) {
                            Object obj8 = arrayList9.get(i61);
                            i61++;
                            C2499n c2499n6 = (C2499n) obj8;
                            if (c2499n6.f9119c != 0 && (iM4497b = c2499n6.m4497b(c2330c, 1)) > i60) {
                                c2499n5 = c2499n6;
                                i60 = iM4497b;
                            }
                        }
                        if (c2499n5 != null) {
                            m4380N(1);
                            m4378L(i60);
                        } else {
                            c2499n5 = null;
                        }
                        if (c2499n != null || c2499n5 != null) {
                            i9 = i17;
                            if (i9 == 2) {
                                i18 = i14;
                                if (i18 >= m4396q() || i18 <= 0) {
                                    iM4396q = m4396q();
                                    i8 = i16;
                                    if (i8 != 2) {
                                        i19 = i15;
                                        if (i19 >= m4392k() || i19 <= 0) {
                                            iM4392k = m4392k();
                                            i4 = iM4392k;
                                            i10 = iM4396q;
                                            z7 = true;
                                        } else {
                                            m4378L(i19);
                                            this.f8893F0 = true;
                                        }
                                    } else {
                                        i19 = i15;
                                    }
                                    iM4392k = i19;
                                    i4 = iM4392k;
                                    i10 = iM4396q;
                                    z7 = true;
                                } else {
                                    m4381O(i18);
                                    this.f8892E0 = true;
                                }
                            } else {
                                i18 = i14;
                            }
                            iM4396q = i18;
                            i8 = i16;
                            if (i8 != 2) {
                            }
                            iM4392k = i19;
                            i4 = iM4392k;
                            i10 = iM4396q;
                            z7 = true;
                        }
                    }
                    boolean z23 = m4411W(64) || m4411W(128);
                    c2330c.getClass();
                    c2330c.f8159h = false;
                    if (this.f8891D0 == 0 || !z23) {
                        c8 = 1;
                    } else {
                        c8 = 1;
                        c2330c.f8159h = true;
                    }
                    ArrayList arrayList10 = this.f8900q0;
                    boolean z24 = objArr[0] == 2 || objArr[c8] == 2;
                    this.f8909z0 = 0;
                    this.f8888A0 = 0;
                    i11 = i;
                    for (i12 = 0; i12 < i11; i12++) {
                        C2442d c2442d12 = (C2442d) this.f8900q0.get(i12);
                        if (c2442d12 instanceof C2443e) {
                            ((C2443e) c2442d12).m4410U();
                        }
                    }
                    boolean zM4411W = m4411W(64);
                    boolean z25 = z7;
                    int i62 = 0;
                    z8 = true;
                    while (z8) {
                        int i63 = i62 + 1;
                        try {
                            c2330c.m4144t();
                            this.f8909z0 = 0;
                            this.f8888A0 = 0;
                            m4388g(c2330c);
                            for (int i64 = 0; i64 < i11; i64++) {
                                ((C2442d) this.f8900q0.get(i64)).m4388g(c2330c);
                            }
                            m4408S(c2330c);
                            try {
                                WeakReference weakReference = this.f8894G0;
                                if (weakReference != null) {
                                    try {
                                        if (weakReference.get() != null) {
                                            c2441c3 = c2441c;
                                            try {
                                            } catch (Exception e) {
                                                e = e;
                                            }
                                            try {
                                                z10 = z24;
                                                try {
                                                    c2330c.m4131f(c2330c.m4136k((C2441c) this.f8894G0.get()), c2330c.m4136k(c2441c3), 0, 5);
                                                    this.f8894G0 = null;
                                                } catch (Exception e8) {
                                                    e = e8;
                                                    z8 = true;
                                                    e.printStackTrace();
                                                    z11 = z25;
                                                    System.out.println("EXCEPTION : " + e);
                                                    boolean[] zArr2 = AbstractC2448j.f8972a;
                                                    if (z8) {
                                                    }
                                                    if (z10) {
                                                        int iMax7 = 0;
                                                        int iMax8 = 0;
                                                        while (i13 < i11) {
                                                        }
                                                        iMax3 = Math.max(this.f8849b0, iMax7);
                                                        iMax4 = Math.max(this.f8851c0, iMax8);
                                                        if (i9 == 2) {
                                                            m4381O(iMax3);
                                                            objArr[0] = 2;
                                                            z12 = true;
                                                            z11 = true;
                                                        }
                                                        if (i8 == 2) {
                                                            m4378L(iMax4);
                                                            objArr[1] = 2;
                                                            z12 = true;
                                                            z11 = true;
                                                        }
                                                    }
                                                    iMax = Math.max(this.f8849b0, m4396q());
                                                    if (iMax <= m4396q()) {
                                                    }
                                                    iMax2 = Math.max(this.f8851c0, m4392k());
                                                    if (iMax2 <= m4392k()) {
                                                    }
                                                    if (!z14) {
                                                    }
                                                    z15 = z12;
                                                    if (i63 > 8) {
                                                    }
                                                    z25 = z14;
                                                    i62 = i63;
                                                    z24 = z10;
                                                    c2441c = c2441c3;
                                                }
                                            } catch (Exception e9) {
                                                e = e9;
                                                z10 = z24;
                                                z8 = true;
                                                e.printStackTrace();
                                                z11 = z25;
                                                System.out.println("EXCEPTION : " + e);
                                                boolean[] zArr22 = AbstractC2448j.f8972a;
                                                if (z8) {
                                                }
                                                if (z10) {
                                                }
                                                iMax = Math.max(this.f8849b0, m4396q());
                                                if (iMax <= m4396q()) {
                                                }
                                                iMax2 = Math.max(this.f8851c0, m4392k());
                                                if (iMax2 <= m4392k()) {
                                                }
                                                if (!z14) {
                                                }
                                                z15 = z12;
                                                if (i63 > 8) {
                                                }
                                                z25 = z14;
                                                i62 = i63;
                                                z24 = z10;
                                                c2441c = c2441c3;
                                            }
                                        } else {
                                            c2441c3 = c2441c;
                                            z10 = z24;
                                        }
                                        WeakReference weakReference2 = this.f8896I0;
                                        if (weakReference2 != null && weakReference2.get() != null) {
                                            c2330c.m4131f(c2330c.m4136k(this.f8831L), c2330c.m4136k((C2441c) this.f8896I0.get()), 0, 5);
                                            this.f8896I0 = null;
                                        }
                                        WeakReference weakReference3 = this.f8895H0;
                                        if (weakReference3 != null && weakReference3.get() != null) {
                                            C2441c c2441c6 = c2441c2;
                                            try {
                                                c2441c2 = c2441c6;
                                                c2330c.m4131f(c2330c.m4136k((C2441c) this.f8895H0.get()), c2330c.m4136k(c2441c6), 0, 5);
                                                this.f8895H0 = null;
                                            } catch (Exception e10) {
                                                e = e10;
                                                c2441c2 = c2441c6;
                                                z8 = true;
                                                e.printStackTrace();
                                                z11 = z25;
                                                System.out.println("EXCEPTION : " + e);
                                                boolean[] zArr222 = AbstractC2448j.f8972a;
                                                if (z8) {
                                                }
                                                if (z10) {
                                                }
                                                iMax = Math.max(this.f8849b0, m4396q());
                                                if (iMax <= m4396q()) {
                                                }
                                                iMax2 = Math.max(this.f8851c0, m4392k());
                                                if (iMax2 <= m4392k()) {
                                                }
                                                if (!z14) {
                                                }
                                                z15 = z12;
                                                if (i63 > 8) {
                                                }
                                                z25 = z14;
                                                i62 = i63;
                                                z24 = z10;
                                                c2441c = c2441c3;
                                            }
                                        }
                                        WeakReference weakReference4 = this.f8897J0;
                                        if (weakReference4 != null && weakReference4.get() != null) {
                                            try {
                                            } catch (Exception e11) {
                                                e = e11;
                                            }
                                            try {
                                                c2330c.m4131f(c2330c.m4136k(this.f8830K), c2330c.m4136k((C2441c) this.f8897J0.get()), 0, 5);
                                            } catch (Exception e12) {
                                                e = e12;
                                                z8 = true;
                                                e.printStackTrace();
                                                z11 = z25;
                                                System.out.println("EXCEPTION : " + e);
                                                boolean[] zArr2222 = AbstractC2448j.f8972a;
                                                if (z8) {
                                                }
                                                if (z10) {
                                                }
                                                iMax = Math.max(this.f8849b0, m4396q());
                                                if (iMax <= m4396q()) {
                                                }
                                                iMax2 = Math.max(this.f8851c0, m4392k());
                                                if (iMax2 <= m4392k()) {
                                                }
                                                if (!z14) {
                                                }
                                                z15 = z12;
                                                if (i63 > 8) {
                                                }
                                                z25 = z14;
                                                i62 = i63;
                                                z24 = z10;
                                                c2441c = c2441c3;
                                            }
                                            try {
                                                this.f8897J0 = null;
                                            } catch (Exception e13) {
                                                e = e13;
                                                z8 = true;
                                                e.printStackTrace();
                                                z11 = z25;
                                                System.out.println("EXCEPTION : " + e);
                                                boolean[] zArr22222 = AbstractC2448j.f8972a;
                                                if (z8) {
                                                }
                                                if (z10) {
                                                }
                                                iMax = Math.max(this.f8849b0, m4396q());
                                                if (iMax <= m4396q()) {
                                                }
                                                iMax2 = Math.max(this.f8851c0, m4392k());
                                                if (iMax2 <= m4392k()) {
                                                }
                                                if (!z14) {
                                                }
                                                z15 = z12;
                                                if (i63 > 8) {
                                                }
                                                z25 = z14;
                                                i62 = i63;
                                                z24 = z10;
                                                c2441c = c2441c3;
                                            }
                                        }
                                        c2330c.m4140p();
                                        z11 = z25;
                                        z8 = true;
                                    } catch (Exception e14) {
                                        e = e14;
                                        c2441c3 = c2441c;
                                    }
                                }
                            } catch (Exception e15) {
                                e = e15;
                                c2441c3 = c2441c;
                                z10 = z24;
                            }
                        } catch (Exception e16) {
                            e = e16;
                            c2441c3 = c2441c;
                            z10 = z24;
                        }
                        boolean[] zArr222222 = AbstractC2448j.f8972a;
                        if (z8) {
                            zArr = zArr222222;
                            mo4383Q(c2330c, zM4411W);
                            for (int i65 = 0; i65 < i11; i65++) {
                                ((C2442d) this.f8900q0.get(i65)).mo4383Q(c2330c, zM4411W);
                            }
                            z12 = false;
                        } else {
                            zArr222222[2] = false;
                            boolean zM4411W2 = m4411W(64);
                            mo4383Q(c2330c, zM4411W2);
                            int size14 = this.f8900q0.size();
                            int i66 = 0;
                            z12 = false;
                            while (i66 < size14) {
                                C2442d c2442d13 = (C2442d) this.f8900q0.get(i66);
                                c2442d13.mo4383Q(c2330c, zM4411W2);
                                boolean[] zArr3 = zArr222222;
                                boolean z26 = zM4411W2;
                                if (c2442d13.f8860h != -1 || c2442d13.f8862i != -1) {
                                    z12 = true;
                                }
                                i66++;
                                zArr222222 = zArr3;
                                zM4411W2 = z26;
                            }
                            zArr = zArr222222;
                        }
                        if (z10 && i63 < 8 && zArr[2]) {
                            int iMax72 = 0;
                            int iMax82 = 0;
                            for (i13 = 0; i13 < i11; i13++) {
                                C2442d c2442d14 = (C2442d) this.f8900q0.get(i13);
                                iMax72 = Math.max(iMax72, c2442d14.m4396q() + c2442d14.f8844Y);
                                iMax82 = Math.max(iMax82, c2442d14.m4392k() + c2442d14.f8845Z);
                            }
                            iMax3 = Math.max(this.f8849b0, iMax72);
                            iMax4 = Math.max(this.f8851c0, iMax82);
                            if (i9 == 2 && m4396q() < iMax3) {
                                m4381O(iMax3);
                                objArr[0] = 2;
                                z12 = true;
                                z11 = true;
                            }
                            if (i8 == 2 && m4392k() < iMax4) {
                                m4378L(iMax4);
                                objArr[1] = 2;
                                z12 = true;
                                z11 = true;
                            }
                        }
                        iMax = Math.max(this.f8849b0, m4396q());
                        if (iMax <= m4396q()) {
                            m4381O(iMax);
                            r8 = 1;
                            objArr[0] = 1;
                            z12 = true;
                            z13 = true;
                        } else {
                            r8 = 1;
                            z13 = z11;
                        }
                        iMax2 = Math.max(this.f8851c0, m4392k());
                        if (iMax2 <= m4392k()) {
                            m4378L(iMax2);
                            objArr[r8] = r8;
                            z14 = r8;
                            z12 = z14;
                        } else {
                            z14 = z13;
                        }
                        if (!z14) {
                            if (objArr[0] == 2 && i10 > 0 && m4396q() > i10) {
                                this.f8892E0 = r8;
                                objArr[0] = r8;
                                m4381O(i10);
                                z14 = r8;
                                z12 = z14;
                            }
                            if (objArr[r8] == 2 && i4 > 0 && m4392k() > i4) {
                                this.f8893F0 = r8;
                                objArr[r8] = r8;
                                m4378L(i4);
                                z14 = true;
                                z15 = true;
                            }
                            z8 = i63 > 8 ? false : z15;
                            z25 = z14;
                            i62 = i63;
                            z24 = z10;
                            c2441c = c2441c3;
                        }
                        z15 = z12;
                        if (i63 > 8) {
                        }
                        z25 = z14;
                        i62 = i63;
                        z24 = z10;
                        c2441c = c2441c3;
                    }
                    z9 = z25;
                    this.f8900q0 = arrayList10;
                    if (z9) {
                        objArr[0] = i9;
                        objArr[1] = i8;
                    }
                    mo4374F(c2330c.f8164m);
                }
                c9 = 1;
                c2499n = null;
                if (objArr[c9] != 2) {
                }
                if (m4411W(64)) {
                }
                c2330c.getClass();
                c2330c.f8159h = false;
                if (this.f8891D0 == 0) {
                    c8 = 1;
                }
                ArrayList arrayList102 = this.f8900q0;
                if (objArr[0] == 2) {
                }
                this.f8909z0 = 0;
                this.f8888A0 = 0;
                i11 = i;
                while (i12 < i11) {
                }
                boolean zM4411W3 = m4411W(64);
                boolean z252 = z7;
                int i622 = 0;
                z8 = true;
                while (z8) {
                }
                z9 = z252;
                this.f8900q0 = arrayList102;
                if (z9) {
                }
                mo4374F(c2330c.f8164m);
            }
            i4 = i15;
            i8 = i16;
            i10 = i14;
            i9 = i17;
        }
        z7 = false;
        if (m4411W(64)) {
        }
        c2330c.getClass();
        c2330c.f8159h = false;
        if (this.f8891D0 == 0) {
        }
        ArrayList arrayList1022 = this.f8900q0;
        if (objArr[0] == 2) {
        }
        this.f8909z0 = 0;
        this.f8888A0 = 0;
        i11 = i;
        while (i12 < i11) {
        }
        boolean zM4411W32 = m4411W(64);
        boolean z2522 = z7;
        int i6222 = 0;
        z8 = true;
        while (z8) {
        }
        z9 = z2522;
        this.f8900q0 = arrayList1022;
        if (z9) {
        }
        mo4374F(c2330c.f8164m);
    }

    /* renamed from: W */
    public final boolean m4411W(int i) {
        return (this.f8891D0 & i) == i;
    }

    @Override // p174u.C2442d
    /* renamed from: n */
    public final void mo4395n(StringBuilder sb) {
        sb.append(this.f8864j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f8840U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f8841V);
        sb.append("\n");
        ArrayList arrayList = this.f8900q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((C2442d) obj).mo4395n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
