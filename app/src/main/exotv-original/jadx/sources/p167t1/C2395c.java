package p167t1;

import androidx.lifecycle.AbstractC0150o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t1.c */
/* loaded from: classes.dex */
public final class C2395c extends AbstractC0150o {

    /* renamed from: k */
    public long f8439k;

    /* renamed from: l */
    public long[] f8440l;

    /* renamed from: m */
    public long[] f8441m;

    /* renamed from: j */
    public static Serializable m4240j(C1132w c1132w, int i) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(c1132w.m2529o()));
        }
        if (i == 1) {
            return Boolean.valueOf(c1132w.m2535u() == 1);
        }
        if (i == 2) {
            return m4242l(c1132w);
        }
        if (i != 3) {
            if (i == 8) {
                return m4241k(c1132w);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(c1132w.m2529o()));
                c1132w.m2514H(2);
                return date;
            }
            int iM2539y = c1132w.m2539y();
            ArrayList arrayList = new ArrayList(iM2539y);
            for (int i4 = 0; i4 < iM2539y; i4++) {
                Serializable serializableM4240j = m4240j(c1132w, c1132w.m2535u());
                if (serializableM4240j != null) {
                    arrayList.add(serializableM4240j);
                }
            }
            return arrayList;
        }
        HashMap map = new HashMap();
        while (true) {
            String strM4242l = m4242l(c1132w);
            int iM2535u = c1132w.m2535u();
            if (iM2535u == 9) {
                return map;
            }
            Serializable serializableM4240j2 = m4240j(c1132w, iM2535u);
            if (serializableM4240j2 != null) {
                map.put(strM4242l, serializableM4240j2);
            }
        }
    }

    /* renamed from: k */
    public static HashMap m4241k(C1132w c1132w) {
        int iM2539y = c1132w.m2539y();
        HashMap map = new HashMap(iM2539y);
        for (int i = 0; i < iM2539y; i++) {
            String strM4242l = m4242l(c1132w);
            Serializable serializableM4240j = m4240j(c1132w, c1132w.m2535u());
            if (serializableM4240j != null) {
                map.put(strM4242l, serializableM4240j);
            }
        }
        return map;
    }

    /* renamed from: l */
    public static String m4242l(C1132w c1132w) {
        int iM2507A = c1132w.m2507A();
        int i = c1132w.f4800b;
        c1132w.m2514H(iM2507A);
        return new String(c1132w.f4799a, i, iM2507A);
    }
}
