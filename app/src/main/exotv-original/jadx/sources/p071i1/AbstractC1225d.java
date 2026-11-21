package p071i1;

import okhttp3.C2181z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i1.d */
/* loaded from: classes.dex */
public abstract class AbstractC1225d {

    /* renamed from: a */
    public final /* synthetic */ int f5113a;

    /* renamed from: b */
    public final int f5114b;

    public /* synthetic */ AbstractC1225d(int i, int i4) {
        this.f5113a = i4;
        this.f5114b = i;
    }

    /* renamed from: a */
    public static String m2674a(int i) {
        return C2181z.FRAGMENT_ENCODE_SET + ((char) ((i >> 24) & 255)) + ((char) ((i >> 16) & 255)) + ((char) ((i >> 8) & 255)) + ((char) (i & 255));
    }

    /* renamed from: b */
    public abstract int mo2675b();

    /* renamed from: c */
    public abstract int mo2676c();

    /* renamed from: d */
    public abstract int mo2677d();

    /* renamed from: e */
    public abstract int mo2678e();

    /* renamed from: f */
    public abstract int mo2679f();

    public String toString() {
        switch (this.f5113a) {
            case 0:
                return m2674a(this.f5114b);
            default:
                return super.toString();
        }
    }
}
