package p015b4;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b4.b */
/* loaded from: classes.dex */
public final class C0568b {

    /* renamed from: a */
    public final /* synthetic */ int f2274a;

    /* renamed from: a */
    public final int m1312a(Object obj) {
        switch (this.f2274a) {
            case 0:
                return ((byte[]) obj).length;
            default:
                return ((int[]) obj).length;
        }
    }

    /* renamed from: b */
    public final int m1313b() {
        switch (this.f2274a) {
            case 0:
                return 1;
            default:
                return 4;
        }
    }

    /* renamed from: c */
    public final String m1314c() {
        switch (this.f2274a) {
            case 0:
                return "ByteArrayPool";
            default:
                return "IntegerArrayPool";
        }
    }
}
