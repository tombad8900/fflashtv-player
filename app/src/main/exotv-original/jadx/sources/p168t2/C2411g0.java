package p168t2;

import okhttp3.C2181z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t2.g0 */
/* loaded from: classes.dex */
public final class C2411g0 {

    /* renamed from: a */
    public final String f8569a;

    /* renamed from: b */
    public final int f8570b;

    /* renamed from: c */
    public final int f8571c;

    /* renamed from: d */
    public int f8572d;

    /* renamed from: e */
    public String f8573e;

    public C2411g0(int i, int i4) {
        this(Integer.MIN_VALUE, i, i4);
    }

    /* renamed from: a */
    public final void m4255a() {
        int i = this.f8572d;
        this.f8572d = i == Integer.MIN_VALUE ? this.f8570b : i + this.f8571c;
        this.f8573e = this.f8569a + this.f8572d;
    }

    /* renamed from: b */
    public final void m4256b() {
        if (this.f8572d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public C2411g0(int i, int i4, int i8) {
        String str;
        if (i != Integer.MIN_VALUE) {
            str = i + "/";
        } else {
            str = C2181z.FRAGMENT_ENCODE_SET;
        }
        this.f8569a = str;
        this.f8570b = i4;
        this.f8571c = i8;
        this.f8572d = Integer.MIN_VALUE;
        this.f8573e = C2181z.FRAGMENT_ENCODE_SET;
    }
}
