package p052f6;

import java.io.Serializable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.j1 */
/* loaded from: classes.dex */
public final class C0975j1 extends AbstractC0978k1 implements Serializable {

    /* renamed from: k */
    public static final C0975j1 f4201k = new C0975j1(0);

    /* renamed from: l */
    public static final C0975j1 f4202l = new C0975j1(1);

    /* renamed from: j */
    public final /* synthetic */ int f4203j;

    public /* synthetic */ C0975j1(int i) {
        this.f4203j = i;
    }

    @Override // p052f6.AbstractC0978k1
    /* renamed from: a */
    public final AbstractC0978k1 mo2160a() {
        switch (this.f4203j) {
            case 0:
                return f4202l;
            default:
                return f4201k;
        }
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f4203j) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                if (comparable3 == comparable4) {
                    return 0;
                }
                return comparable4.compareTo(comparable3);
        }
    }

    public final String toString() {
        switch (this.f4203j) {
            case 0:
                return "Ordering.natural()";
            default:
                return "Ordering.natural().reverse()";
        }
    }
}
