package p199x;

import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.h */
/* loaded from: classes.dex */
public final class C2721h {

    /* renamed from: a */
    public int[] f9968a;

    /* renamed from: b */
    public int[] f9969b;

    /* renamed from: c */
    public int f9970c;

    /* renamed from: d */
    public int[] f9971d;

    /* renamed from: e */
    public float[] f9972e;

    /* renamed from: f */
    public int f9973f;

    /* renamed from: g */
    public int[] f9974g;

    /* renamed from: h */
    public String[] f9975h;

    /* renamed from: i */
    public int f9976i;

    /* renamed from: j */
    public int[] f9977j;

    /* renamed from: k */
    public boolean[] f9978k;

    /* renamed from: l */
    public int f9979l;

    /* renamed from: a */
    public final void m4787a(int i, float f8) {
        int i4 = this.f9973f;
        int[] iArr = this.f9971d;
        if (i4 >= iArr.length) {
            this.f9971d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f9972e;
            this.f9972e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f9971d;
        int i8 = this.f9973f;
        iArr2[i8] = i;
        float[] fArr2 = this.f9972e;
        this.f9973f = i8 + 1;
        fArr2[i8] = f8;
    }

    /* renamed from: b */
    public final void m4788b(int i, int i4) {
        int i8 = this.f9970c;
        int[] iArr = this.f9968a;
        if (i8 >= iArr.length) {
            this.f9968a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f9969b;
            this.f9969b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f9968a;
        int i9 = this.f9970c;
        iArr3[i9] = i;
        int[] iArr4 = this.f9969b;
        this.f9970c = i9 + 1;
        iArr4[i9] = i4;
    }

    /* renamed from: c */
    public final void m4789c(int i, String str) {
        int i4 = this.f9976i;
        int[] iArr = this.f9974g;
        if (i4 >= iArr.length) {
            this.f9974g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f9975h;
            this.f9975h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f9974g;
        int i8 = this.f9976i;
        iArr2[i8] = i;
        String[] strArr2 = this.f9975h;
        this.f9976i = i8 + 1;
        strArr2[i8] = str;
    }

    /* renamed from: d */
    public final void m4790d(int i, boolean z7) {
        int i4 = this.f9979l;
        int[] iArr = this.f9977j;
        if (i4 >= iArr.length) {
            this.f9977j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f9978k;
            this.f9978k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f9977j;
        int i8 = this.f9979l;
        iArr2[i8] = i;
        boolean[] zArr2 = this.f9978k;
        this.f9979l = i8 + 1;
        zArr2[i8] = z7;
    }
}
