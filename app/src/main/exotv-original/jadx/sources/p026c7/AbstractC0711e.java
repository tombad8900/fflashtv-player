package p026c7;

import p036d7.C0849a;
import p188v6.AbstractC2554a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c7.e */
/* loaded from: classes.dex */
public abstract class AbstractC0711e {

    /* renamed from: j */
    public static final C0710d f2769j = new C0710d();

    /* renamed from: k */
    public static final AbstractC0707a f2770k;

    static {
        Integer num = AbstractC2554a.f9267a;
        f2770k = (num == null || num.intValue() >= 34) ? new C0849a() : new C0709c();
    }

    /* renamed from: a */
    public abstract int mo1477a(int i);

    /* renamed from: b */
    public abstract long mo1478b();

    /* renamed from: c */
    public long mo1480c() {
        long jMo1478b;
        long j;
        do {
            jMo1478b = mo1478b() >>> 1;
            j = jMo1478b % 4001;
        } while ((jMo1478b - j) + 4000 < 0);
        return 12000 + j;
    }
}
