package p216z2;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p063h1.C1131v;
import p070i0.AbstractC1221f;
import p156s.C2331d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.l */
/* loaded from: classes.dex */
public final class RunnableC2899l implements Runnable {

    /* renamed from: n */
    public static final ThreadLocal f10750n = new ThreadLocal();

    /* renamed from: o */
    public static final C2331d f10751o = new C2331d(6);

    /* renamed from: j */
    public ArrayList f10752j;

    /* renamed from: k */
    public long f10753k;

    /* renamed from: l */
    public long f10754l;

    /* renamed from: m */
    public ArrayList f10755m;

    /* renamed from: c */
    public static AbstractC2920v0 m5026c(RecyclerView recyclerView, int i, long j) {
        int iM2731j = recyclerView.f2064o.m2731j();
        for (int i4 = 0; i4 < iM2731j; i4++) {
            AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(recyclerView.f2064o.m2730i(i4));
            if (abstractC2920v0M1144M.f10850c == i && !abstractC2920v0M1144M.m5066f()) {
                return null;
            }
        }
        C2900l0 c2900l0 = recyclerView.f2058l;
        try {
            recyclerView.m1169T();
            AbstractC2920v0 abstractC2920v0M5040l = c2900l0.m5040l(i, j);
            if (abstractC2920v0M5040l != null) {
                if (!abstractC2920v0M5040l.m5065e() || abstractC2920v0M5040l.m5066f()) {
                    c2900l0.m5029a(abstractC2920v0M5040l, false);
                } else {
                    c2900l0.m5037i(abstractC2920v0M5040l.f10848a);
                }
            }
            recyclerView.m1170U(false);
            return abstractC2920v0M5040l;
        } catch (Throwable th) {
            recyclerView.m1170U(false);
            throw th;
        }
    }

    /* renamed from: a */
    public final void m5027a(RecyclerView recyclerView, int i, int i4) {
        if (recyclerView.f2016B) {
            if (RecyclerView.f2004I0 && !this.f10752j.contains(recyclerView)) {
                throw new IllegalStateException("attempting to post unregistered view!");
            }
            if (this.f10753k == 0) {
                this.f10753k = recyclerView.getNanoTime();
                recyclerView.post(this);
            }
        }
        C1131v c1131v = recyclerView.f2065o0;
        c1131v.f4793c = i;
        c1131v.f4794d = i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00cd  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5028b(long j) {
        C2897k c2897k;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C2897k c2897k2;
        ArrayList arrayList = this.f10755m;
        ArrayList arrayList2 = this.f10752j;
        int size = arrayList2.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList2.get(i4);
            int windowVisibility = recyclerView3.getWindowVisibility();
            C1131v c1131v = recyclerView3.f2065o0;
            if (windowVisibility == 0) {
                c1131v.m2490g(recyclerView3, false);
                i += c1131v.f4795e;
            }
        }
        arrayList.ensureCapacity(i);
        int i8 = 0;
        for (int i9 = 0; i9 < size; i9++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList2.get(i9);
            if (recyclerView4.getWindowVisibility() == 0) {
                C1131v c1131v2 = recyclerView4.f2065o0;
                int iAbs = Math.abs(c1131v2.f4794d) + Math.abs(c1131v2.f4793c);
                for (int i10 = 0; i10 < c1131v2.f4795e * 2; i10 += 2) {
                    if (i8 >= arrayList.size()) {
                        c2897k2 = new C2897k();
                        arrayList.add(c2897k2);
                    } else {
                        c2897k2 = (C2897k) arrayList.get(i8);
                    }
                    int[] iArr = (int[]) c1131v2.f4792b;
                    int i11 = iArr[i10 + 1];
                    c2897k2.f10742a = i11 <= iAbs;
                    c2897k2.f10743b = iAbs;
                    c2897k2.f10744c = i11;
                    c2897k2.f10745d = recyclerView4;
                    c2897k2.f10746e = iArr[i10];
                    i8++;
                }
            }
        }
        Collections.sort(arrayList, f10751o);
        for (int i12 = 0; i12 < arrayList.size() && (recyclerView = (c2897k = (C2897k) arrayList.get(i12)).f10745d) != null; i12++) {
            AbstractC2920v0 abstractC2920v0M5026c = m5026c(recyclerView, c2897k.f10746e, c2897k.f10742a ? Long.MAX_VALUE : j);
            if (abstractC2920v0M5026c != null && abstractC2920v0M5026c.f10849b != null && abstractC2920v0M5026c.m5065e() && !abstractC2920v0M5026c.m5066f() && (recyclerView2 = (RecyclerView) abstractC2920v0M5026c.f10849b.get()) != null) {
                if (recyclerView2.f2033L && recyclerView2.f2064o.m2731j() != 0) {
                    C2900l0 c2900l0 = recyclerView2.f2058l;
                    AbstractC2876b0 abstractC2876b0 = recyclerView2.f2042U;
                    if (abstractC2876b0 != null) {
                        abstractC2876b0.mo4975e();
                    }
                    AbstractC2888f0 abstractC2888f0 = recyclerView2.f2080w;
                    if (abstractC2888f0 != null) {
                        abstractC2888f0.m5000i0(c2900l0);
                        recyclerView2.f2080w.m5001j0(c2900l0);
                    }
                    c2900l0.f10756a.clear();
                    c2900l0.m5035g();
                }
                C1131v c1131v3 = recyclerView2.f2065o0;
                c1131v3.m2490g(recyclerView2, true);
                if (c1131v3.f4795e != 0) {
                    try {
                        int i13 = AbstractC1221f.f5104a;
                        Trace.beginSection("RV Nested Prefetch");
                        C2912r0 c2912r0 = recyclerView2.f2067p0;
                        AbstractC2923x abstractC2923x = recyclerView2.f2078v;
                        c2912r0.f10822d = 1;
                        c2912r0.f10823e = abstractC2923x.mo1455a();
                        c2912r0.f10825g = false;
                        c2912r0.f10826h = false;
                        c2912r0.f10827i = false;
                        for (int i14 = 0; i14 < c1131v3.f4795e * 2; i14 += 2) {
                            m5026c(recyclerView2, ((int[]) c1131v3.f4792b)[i14], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i15 = AbstractC1221f.f5104a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c2897k.f10742a = false;
            c2897k.f10743b = 0;
            c2897k.f10744c = 0;
            c2897k.f10745d = null;
            c2897k.f10746e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ArrayList arrayList = this.f10752j;
        try {
            int i = AbstractC1221f.f5104a;
            Trace.beginSection("RV Prefetch");
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                long jMax = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    RecyclerView recyclerView = (RecyclerView) arrayList.get(i4);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    m5028b(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f10754l);
                }
            }
            this.f10753k = 0L;
            Trace.endSection();
        } catch (Throwable th) {
            this.f10753k = 0L;
            int i8 = AbstractC1221f.f5104a;
            Trace.endSection();
            throw th;
        }
    }
}
