package p182v;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p090k2.C1584b;
import p156s.C2330c;
import p174u.AbstractC2448j;
import p174u.C2442d;
import p174u.C2443e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v.n */
/* loaded from: classes.dex */
public final class C2499n {

    /* renamed from: f */
    public static int f9116f;

    /* renamed from: a */
    public ArrayList f9117a;

    /* renamed from: b */
    public int f9118b;

    /* renamed from: c */
    public int f9119c;

    /* renamed from: d */
    public ArrayList f9120d;

    /* renamed from: e */
    public int f9121e;

    /* renamed from: a */
    public final void m4496a(ArrayList arrayList) {
        int size = this.f9117a.size();
        if (this.f9121e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C2499n c2499n = (C2499n) arrayList.get(i);
                if (this.f9121e == c2499n.f9118b) {
                    m4498c(this.f9119c, c2499n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: b */
    public final int m4497b(C2330c c2330c, int i) {
        int iM4125n;
        int iM4125n2;
        ArrayList arrayList = this.f9117a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C2443e c2443e = (C2443e) ((C2442d) arrayList.get(0)).f8839T;
        c2330c.m4144t();
        c2443e.mo4353b(c2330c, false);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            ((C2442d) arrayList.get(i4)).mo4353b(c2330c, false);
        }
        if (i == 0 && c2443e.f8909z0 > 0) {
            AbstractC2448j.m4425a(c2443e, c2330c, arrayList, 0);
        }
        if (i == 1 && c2443e.f8888A0 > 0) {
            AbstractC2448j.m4425a(c2443e, c2330c, arrayList, 1);
        }
        try {
            c2330c.m4140p();
        } catch (Exception e) {
            System.err.println(e.toString() + "\n" + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", C2181z.FRAGMENT_ENCODE_SET));
        }
        this.f9120d = new ArrayList();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            C2442d c2442d = (C2442d) arrayList.get(i8);
            C1584b c1584b = new C1584b(21);
            new WeakReference(c2442d);
            C2330c.m4125n(c2442d.f8828I);
            C2330c.m4125n(c2442d.f8829J);
            C2330c.m4125n(c2442d.f8830K);
            C2330c.m4125n(c2442d.f8831L);
            C2330c.m4125n(c2442d.f8832M);
            this.f9120d.add(c1584b);
        }
        if (i == 0) {
            iM4125n = C2330c.m4125n(c2443e.f8828I);
            iM4125n2 = C2330c.m4125n(c2443e.f8830K);
            c2330c.m4144t();
        } else {
            iM4125n = C2330c.m4125n(c2443e.f8829J);
            iM4125n2 = C2330c.m4125n(c2443e.f8831L);
            c2330c.m4144t();
        }
        return iM4125n2 - iM4125n;
    }

    /* renamed from: c */
    public final void m4498c(int i, C2499n c2499n) {
        int i4 = c2499n.f9118b;
        ArrayList arrayList = this.f9117a;
        int size = arrayList.size();
        int i8 = 0;
        while (i8 < size) {
            Object obj = arrayList.get(i8);
            i8++;
            C2442d c2442d = (C2442d) obj;
            ArrayList arrayList2 = c2499n.f9117a;
            if (!arrayList2.contains(c2442d)) {
                arrayList2.add(c2442d);
            }
            if (i == 0) {
                c2442d.f8873n0 = i4;
            } else {
                c2442d.f8875o0 = i4;
            }
        }
        this.f9121e = i4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f9119c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f9118b);
        sb.append("] <");
        String string = sb.toString();
        ArrayList arrayList = this.f9117a;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            string = string + " " + ((C2442d) obj).f8861h0;
        }
        return AbstractC0008a1.m16l(string, " >");
    }
}
