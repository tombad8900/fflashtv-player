package p076i7;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.h1 */
/* loaded from: classes.dex */
public abstract class AbstractC1300h1 {

    /* renamed from: a */
    public static final ThreadLocal f5328a = new ThreadLocal();

    /* renamed from: a */
    public static AbstractC1314m0 m2815a() {
        ThreadLocal threadLocal = f5328a;
        AbstractC1314m0 abstractC1314m0 = (AbstractC1314m0) threadLocal.get();
        if (abstractC1314m0 != null) {
            return abstractC1314m0;
        }
        C1283c c1283c = new C1283c(Thread.currentThread());
        threadLocal.set(c1283c);
        return c1283c;
    }
}
