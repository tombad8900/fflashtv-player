package p066h4;

import p210y3.C2803g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.m */
/* loaded from: classes.dex */
public final class C1179m {

    /* renamed from: b */
    public static final C1179m f5029b = new C1179m(2);

    /* renamed from: c */
    public static final C1179m f5030c = new C1179m(0);

    /* renamed from: d */
    public static final C1179m f5031d;

    /* renamed from: e */
    public static final C1179m f5032e;

    /* renamed from: f */
    public static final C1179m f5033f;

    /* renamed from: g */
    public static final C2803g f5034g;

    /* renamed from: h */
    public static final boolean f5035h;

    /* renamed from: a */
    public final /* synthetic */ int f5036a;

    static {
        C1179m c1179m = new C1179m(1);
        f5031d = c1179m;
        f5032e = new C1179m(3);
        f5033f = c1179m;
        f5034g = C2803g.m4907a("com.bumptech.glide.load.resource.bitmap.Downsampler.DownsampleStrategy", c1179m);
        f5035h = true;
    }

    public /* synthetic */ C1179m(int i) {
        this.f5036a = i;
    }

    /* renamed from: a */
    public final int m2598a(int i, int i4, int i8, int i9) {
        switch (this.f5036a) {
            case 0:
                if (m2599b(i, i4, i8, i9) != 1.0f) {
                    break;
                }
                break;
            case 2:
                if (f5035h) {
                }
                break;
        }
        return 2;
    }

    /* renamed from: b */
    public final float m2599b(int i, int i4, int i8, int i9) {
        switch (this.f5036a) {
            case 0:
                return Math.min(1.0f, f5029b.m2599b(i, i4, i8, i9));
            case 1:
                return Math.max(i8 / i, i9 / i4);
            case 2:
                if (f5035h) {
                    return Math.min(i8 / i, i9 / i4);
                }
                if (Math.max(i4 / i9, i / i8) == 0) {
                    return 1.0f;
                }
                return 1.0f / Integer.highestOneBit(r2);
            default:
                return 1.0f;
        }
    }
}
