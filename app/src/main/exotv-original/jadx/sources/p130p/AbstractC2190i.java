package p130p;

import java.util.ConcurrentModificationException;
import p139q.AbstractC2239a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p.i */
/* loaded from: classes.dex */
public abstract class AbstractC2190i {

    /* renamed from: a */
    public static final Object f7645a = new Object();

    /* renamed from: b */
    public static final Object f7646b = new Object();

    /* renamed from: a */
    public static final void m3971a(C2187f c2187f, int i) {
        c2187f.f7634j = new int[i];
        c2187f.f7635k = new Object[i];
    }

    /* renamed from: b */
    public static final int m3972b(C2187f c2187f, Object obj, int i) {
        int i4 = c2187f.f7636l;
        if (i4 == 0) {
            return -1;
        }
        try {
            int iM4011a = AbstractC2239a.m4011a(i4, i, c2187f.f7634j);
            if (iM4011a < 0 || AbstractC2980h.m5132a(obj, c2187f.f7635k[iM4011a])) {
                return iM4011a;
            }
            int i8 = iM4011a + 1;
            while (i8 < i4 && c2187f.f7634j[i8] == i) {
                if (AbstractC2980h.m5132a(obj, c2187f.f7635k[i8])) {
                    return i8;
                }
                i8++;
            }
            for (int i9 = iM4011a - 1; i9 >= 0 && c2187f.f7634j[i9] == i; i9--) {
                if (AbstractC2980h.m5132a(obj, c2187f.f7635k[i9])) {
                    return i9;
                }
            }
            return ~i8;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
