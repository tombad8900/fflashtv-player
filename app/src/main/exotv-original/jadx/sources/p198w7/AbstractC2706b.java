package p198w7;

import android.support.v4.media.session.AbstractC0120b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import okhttp3.internal.p129ws.C2155f;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p102l6.C1687d;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1924s;
import p156s.C2331d;
import p189v7.C2556a0;
import p189v7.C2558b0;
import p189v7.C2564e0;
import p189v7.C2570h0;
import p189v7.C2573j;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;
import p220z6.C2983k;
import p220z6.C2985m;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w7.b */
/* loaded from: classes.dex */
public abstract class AbstractC2706b {

    /* renamed from: a */
    public static final char[] f9823a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static final int m4761a(char c8) {
        if ('0' <= c8 && c8 < ':') {
            return c8 - '0';
        }
        if ('a' <= c8 && c8 < 'g') {
            return c8 - 'W';
        }
        if ('A' <= c8 && c8 < 'G') {
            return c8 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c8);
    }

    /* renamed from: b */
    public static final LinkedHashMap m4762b(ArrayList arrayList) {
        String str = C2558b0.f9272k;
        C2558b0 c2558b0M4571c = C2556a0.m4571c("/");
        C1687d[] c1687dArr = {new C1687d(c2558b0M4571c, new C2711g(c2558b0M4571c, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532))};
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC1924s.m3759T(1));
        AbstractC1924s.m3761V(linkedHashMap, c1687dArr);
        for (C2711g c2711g : AbstractC1913h.m3745J0(arrayList, new C2331d(4))) {
            if (((C2711g) linkedHashMap.put(c2711g.f9838a, c2711g)) == null) {
                while (true) {
                    C2558b0 c2558b0 = c2711g.f9838a;
                    C2558b0 c2558b0M4588b = c2558b0.m4588b();
                    if (c2558b0M4588b != null) {
                        C2711g c2711g2 = (C2711g) linkedHashMap.get(c2558b0M4588b);
                        if (c2711g2 != null) {
                            c2711g2.f9854q.add(c2558b0);
                            break;
                        }
                        C2711g c2711g3 = new C2711g(c2558b0M4588b, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        linkedHashMap.put(c2558b0M4588b, c2711g3);
                        c2711g3.f9854q.add(c2558b0);
                        c2711g = c2711g3;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* renamed from: c */
    public static final String m4763c(int i) {
        AbstractC0120b.m411g(16);
        String string = Integer.toString(i, 16);
        AbstractC2980h.m5135d("toString(...)", string);
        return "0x".concat(string);
    }

    /* renamed from: d */
    public static final C2711g m4764d(C2564e0 c2564e0) throws IOException {
        int iM4609c = c2564e0.m4609c();
        if (iM4609c != 33639248) {
            throw new IOException("bad zip: expected " + m4763c(33639248) + " but was " + m4763c(iM4609c));
        }
        c2564e0.skip(4L);
        short sM4615k = c2564e0.m4615k();
        int i = sM4615k & 65535;
        if ((sM4615k & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m4763c(i));
        }
        int iM4615k = c2564e0.m4615k() & 65535;
        int iM4615k2 = c2564e0.m4615k() & 65535;
        int iM4615k3 = c2564e0.m4615k() & 65535;
        long jM4609c = c2564e0.m4609c() & 4294967295L;
        C2985m c2985m = new C2985m();
        c2985m.f11116j = c2564e0.m4609c() & 4294967295L;
        C2985m c2985m2 = new C2985m();
        c2985m2.f11116j = c2564e0.m4609c() & 4294967295L;
        int iM4615k4 = c2564e0.m4615k() & 65535;
        int iM4615k5 = c2564e0.m4615k() & 65535;
        int iM4615k6 = 65535 & c2564e0.m4615k();
        c2564e0.skip(8L);
        C2985m c2985m3 = new C2985m();
        c2985m3.f11116j = c2564e0.m4609c() & 4294967295L;
        String strM4618p = c2564e0.m4618p(iM4615k4);
        if (AbstractC1206h.m2650v0(strM4618p, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = c2985m2.f11116j == 4294967295L ? 8 : 0L;
        if (c2985m.f11116j == 4294967295L) {
            j += 8;
        }
        if (c2985m3.f11116j == 4294967295L) {
            j += 8;
        }
        C2986n c2986n = new C2986n();
        C2986n c2986n2 = new C2986n();
        C2986n c2986n3 = new C2986n();
        C2983k c2983k = new C2983k();
        m4765e(c2564e0, iM4615k5, new C2713i(c2983k, j, c2985m2, c2564e0, c2985m, c2985m3, c2986n, c2986n2, c2986n3));
        if (j > 0 && !c2983k.f11114j) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strM4618p2 = c2564e0.m4618p(iM4615k6);
        String str = C2558b0.f9272k;
        return new C2711g(C2556a0.m4571c("/").m4590d(strM4618p), AbstractC1214p.m2660m0(strM4618p, "/", false), strM4618p2, jM4609c, c2985m.f11116j, c2985m2.f11116j, iM4615k, c2985m3.f11116j, iM4615k3, iM4615k2, (Long) c2986n.f11117j, (Long) c2986n2.f11117j, (Long) c2986n3.f11117j, 57344);
    }

    /* renamed from: e */
    public static final void m4765e(C2564e0 c2564e0, int i, InterfaceC2855p interfaceC2855p) throws IOException {
        C2573j c2573j = c2564e0.f9290k;
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iM4615k = c2564e0.m4615k() & 65535;
            long jM4615k = c2564e0.m4615k() & C2155f.PAYLOAD_SHORT_MAX;
            long j8 = j - 4;
            if (j8 < jM4615k) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            c2564e0.mo4623y(jM4615k);
            long j9 = c2573j.f9314k;
            interfaceC2855p.mo576c(Integer.valueOf(iM4615k), Long.valueOf(jM4615k));
            long j10 = (c2573j.f9314k + jM4615k) - j9;
            if (j10 < 0) {
                throw new IOException(AbstractC0008a1.m12h(iM4615k, "unsupported zip: too many bytes processed for "));
            }
            if (j10 > 0) {
                c2573j.skip(j10);
            }
            j = j8 - jM4615k;
        }
    }

    /* renamed from: f */
    public static final C2711g m4766f(C2564e0 c2564e0, C2711g c2711g) throws IOException {
        int iM4609c = c2564e0.m4609c();
        if (iM4609c != 67324752) {
            throw new IOException("bad zip: expected " + m4763c(67324752) + " but was " + m4763c(iM4609c));
        }
        c2564e0.skip(2L);
        short sM4615k = c2564e0.m4615k();
        int i = sM4615k & 65535;
        if ((sM4615k & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m4763c(i));
        }
        c2564e0.skip(18L);
        long jM4615k = c2564e0.m4615k() & C2155f.PAYLOAD_SHORT_MAX;
        int iM4615k = c2564e0.m4615k() & 65535;
        c2564e0.skip(jM4615k);
        if (c2711g == null) {
            c2564e0.skip(iM4615k);
            return null;
        }
        C2986n c2986n = new C2986n();
        C2986n c2986n2 = new C2986n();
        C2986n c2986n3 = new C2986n();
        m4765e(c2564e0, iM4615k, new C2712h(c2564e0, c2986n, c2986n2, c2986n3));
        return new C2711g(c2711g.f9838a, c2711g.f9839b, c2711g.f9840c, c2711g.f9841d, c2711g.f9842e, c2711g.f9843f, c2711g.f9844g, c2711g.f9845h, c2711g.f9846i, c2711g.f9847j, c2711g.f9848k, c2711g.f9849l, c2711g.f9850m, (Integer) c2986n.f11117j, (Integer) c2986n2.f11117j, (Integer) c2986n3.f11117j);
    }

    /* renamed from: g */
    public static final int m4767g(C2570h0 c2570h0, int i) {
        int i4;
        int[] iArr = c2570h0.f9310o;
        int i8 = i + 1;
        int length = c2570h0.f9309n.length;
        AbstractC2980h.m5136e("<this>", iArr);
        int i9 = length - 1;
        int i10 = 0;
        while (true) {
            if (i10 <= i9) {
                i4 = (i10 + i9) >>> 1;
                int i11 = iArr[i4];
                if (i11 >= i8) {
                    if (i11 <= i8) {
                        break;
                    }
                    i9 = i4 - 1;
                } else {
                    i10 = i4 + 1;
                }
            } else {
                i4 = (-i10) - 1;
                break;
            }
        }
        return i4 >= 0 ? i4 : ~i4;
    }
}
