package p198w7;

import java.io.EOFException;
import java.util.ArrayList;
import p002a1.AbstractC0008a1;
import p090k2.C1584b;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p189v7.C2558b0;
import p189v7.C2573j;
import p189v7.C2579m;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w7.c */
/* loaded from: classes.dex */
public abstract class AbstractC2707c {

    /* renamed from: a */
    public static final C2579m f9824a;

    /* renamed from: b */
    public static final C2579m f9825b;

    /* renamed from: c */
    public static final C2579m f9826c;

    /* renamed from: d */
    public static final C2579m f9827d;

    /* renamed from: e */
    public static final C2579m f9828e;

    static {
        C2579m c2579m = C2579m.f9316m;
        f9824a = C1584b.m3251p("/");
        f9825b = C1584b.m3251p("\\");
        f9826c = C1584b.m3251p("/\\");
        f9827d = C1584b.m3251p(".");
        f9828e = C1584b.m3251p("..");
    }

    /* renamed from: a */
    public static final int m4768a(C2558b0 c2558b0) {
        C2579m c2579m = c2558b0.f9273j;
        if (c2579m.mo4634d() != 0) {
            if (c2579m.mo4638i(0) != 47) {
                if (c2579m.mo4638i(0) == 92) {
                    if (c2579m.mo4634d() > 2 && c2579m.mo4638i(1) == 92) {
                        C2579m c2579m2 = f9825b;
                        AbstractC2980h.m5136e("other", c2579m2);
                        int iMo4636f = c2579m.mo4636f(c2579m2.mo4637h(), 2);
                        return iMo4636f == -1 ? c2579m.mo4634d() : iMo4636f;
                    }
                } else if (c2579m.mo4634d() > 2 && c2579m.mo4638i(1) == 58 && c2579m.mo4638i(2) == 92) {
                    char cMo4638i = (char) c2579m.mo4638i(0);
                    if ('a' <= cMo4638i && cMo4638i < '{') {
                        return 3;
                    }
                    if ('A' <= cMo4638i && cMo4638i < '[') {
                        return 3;
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    /* renamed from: b */
    public static final C2558b0 m4769b(C2558b0 c2558b0, C2558b0 c2558b02, boolean z7) {
        AbstractC2980h.m5136e("child", c2558b02);
        if (m4768a(c2558b02) != -1 || c2558b02.m4592f() != null) {
            return c2558b02;
        }
        C2579m c2579mM4770c = m4770c(c2558b0);
        if (c2579mM4770c == null && (c2579mM4770c = m4770c(c2558b02)) == null) {
            c2579mM4770c = m4773f(C2558b0.f9272k);
        }
        C2573j c2573j = new C2573j();
        c2573j.m4654J(c2558b0.f9273j);
        if (c2573j.f9314k > 0) {
            c2573j.m4654J(c2579mM4770c);
        }
        c2573j.m4654J(c2558b02.f9273j);
        return m4771d(c2573j, z7);
    }

    /* renamed from: c */
    public static final C2579m m4770c(C2558b0 c2558b0) {
        C2579m c2579m = c2558b0.f9273j;
        C2579m c2579m2 = f9824a;
        if (C2579m.m4671g(c2579m, c2579m2) != -1) {
            return c2579m2;
        }
        C2579m c2579m3 = c2558b0.f9273j;
        C2579m c2579m4 = f9825b;
        if (C2579m.m4671g(c2579m3, c2579m4) != -1) {
            return c2579m4;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b A[EDGE_INSN: B:101:0x011b->B:84:0x011b BREAK  A[LOOP:1: B:53:0x00ab->B:116:0x00ab], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0139  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2558b0 m4771d(C2573j c2573j, boolean z7) throws EOFException {
        C2579m c2579m;
        long j;
        char cM4666g;
        boolean zMo4614j;
        C2579m c2579m2;
        int size;
        int i;
        C2579m c2579mMo4610d;
        C2573j c2573j2 = new C2573j();
        C2579m c2579mM4772e = null;
        int i4 = 0;
        while (true) {
            if (!c2573j.m4669t(0L, f9824a)) {
                c2579m = f9825b;
                if (!c2573j.m4669t(0L, c2579m)) {
                    break;
                }
            }
            byte b7 = c2573j.readByte();
            if (c2579mM4772e == null) {
                c2579mM4772e = m4772e(b7);
            }
            i4++;
        }
        boolean z8 = i4 >= 2 && AbstractC2980h.m5132a(c2579mM4772e, c2579m);
        C2579m c2579m3 = f9826c;
        if (z8) {
            AbstractC2980h.m5133b(c2579mM4772e);
            c2573j2.m4654J(c2579mM4772e);
            c2573j2.m4654J(c2579mM4772e);
        } else {
            if (i4 <= 0) {
                long jM4668p = c2573j.m4668p(c2579m3);
                if (c2579mM4772e == null) {
                    c2579mM4772e = jM4668p == -1 ? m4773f(C2558b0.f9272k) : m4772e(c2573j.m4666g(jM4668p));
                }
                if (AbstractC2980h.m5132a(c2579mM4772e, c2579m) && c2573j.f9314k >= 2) {
                    j = -1;
                    if (c2573j.m4666g(1L) == 58 && (('a' <= (cM4666g = (char) c2573j.m4666g(0L)) && cM4666g < '{') || ('A' <= cM4666g && cM4666g < '['))) {
                        if (jM4668p == 2) {
                            c2573j2.write(c2573j, 3L);
                        } else {
                            c2573j2.write(c2573j, 2L);
                        }
                    }
                }
                boolean z9 = c2573j2.f9314k <= 0;
                ArrayList arrayList = new ArrayList();
                while (true) {
                    zMo4614j = c2573j.mo4614j();
                    c2579m2 = f9827d;
                    if (!zMo4614j) {
                        break;
                    }
                    long jM4668p2 = c2573j.m4668p(c2579m3);
                    if (jM4668p2 == j) {
                        c2579mMo4610d = c2573j.mo4610d(c2573j.f9314k);
                    } else {
                        c2579mMo4610d = c2573j.mo4610d(jM4668p2);
                        c2573j.readByte();
                    }
                    C2579m c2579m4 = f9828e;
                    if (AbstractC2980h.m5132a(c2579mMo4610d, c2579m4)) {
                        if (!z9 || !arrayList.isEmpty()) {
                            if (!z7 || (!z9 && (arrayList.isEmpty() || AbstractC2980h.m5132a(AbstractC1913h.m3741F0(arrayList), c2579m4)))) {
                                arrayList.add(c2579mMo4610d);
                            } else if (!z8 || arrayList.size() != 1) {
                                if (!arrayList.isEmpty()) {
                                    arrayList.remove(AbstractC1914i.m3752s0(arrayList));
                                }
                            }
                        }
                    } else if (!AbstractC2980h.m5132a(c2579mMo4610d, c2579m2) && !AbstractC2980h.m5132a(c2579mMo4610d, C2579m.f9316m)) {
                        arrayList.add(c2579mMo4610d);
                    }
                }
                size = arrayList.size();
                for (i = 0; i < size; i++) {
                    if (i > 0) {
                        c2573j2.m4654J(c2579mM4772e);
                    }
                    c2573j2.m4654J((C2579m) arrayList.get(i));
                }
                if (c2573j2.f9314k == 0) {
                    c2573j2.m4654J(c2579m2);
                }
                return new C2558b0(c2573j2.mo4610d(c2573j2.f9314k));
            }
            AbstractC2980h.m5133b(c2579mM4772e);
            c2573j2.m4654J(c2579mM4772e);
        }
        j = -1;
        if (c2573j2.f9314k <= 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (true) {
            zMo4614j = c2573j.mo4614j();
            c2579m2 = f9827d;
            if (!zMo4614j) {
            }
        }
        size = arrayList2.size();
        while (i < size) {
        }
        if (c2573j2.f9314k == 0) {
        }
        return new C2558b0(c2573j2.mo4610d(c2573j2.f9314k));
    }

    /* renamed from: e */
    public static final C2579m m4772e(byte b7) {
        if (b7 == 47) {
            return f9824a;
        }
        if (b7 == 92) {
            return f9825b;
        }
        throw new IllegalArgumentException(AbstractC0008a1.m12h(b7, "not a directory separator: "));
    }

    /* renamed from: f */
    public static final C2579m m4773f(String str) {
        if (AbstractC2980h.m5132a(str, "/")) {
            return f9824a;
        }
        if (AbstractC2980h.m5132a(str, "\\")) {
            return f9825b;
        }
        throw new IllegalArgumentException(AbstractC0008a1.m25u("not a directory separator: ", str));
    }
}
