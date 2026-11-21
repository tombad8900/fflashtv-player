package p199x;

import android.view.ViewGroup;
import p174u.C2442d;
import p174u.C2446h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.e */
/* loaded from: classes.dex */
public final class C2718e extends ViewGroup.MarginLayoutParams {

    /* renamed from: A */
    public int f9887A;

    /* renamed from: B */
    public int f9888B;

    /* renamed from: C */
    public int f9889C;

    /* renamed from: D */
    public int f9890D;

    /* renamed from: E */
    public float f9891E;

    /* renamed from: F */
    public float f9892F;

    /* renamed from: G */
    public String f9893G;

    /* renamed from: H */
    public float f9894H;

    /* renamed from: I */
    public float f9895I;

    /* renamed from: J */
    public int f9896J;

    /* renamed from: K */
    public int f9897K;

    /* renamed from: L */
    public int f9898L;

    /* renamed from: M */
    public int f9899M;

    /* renamed from: N */
    public int f9900N;

    /* renamed from: O */
    public int f9901O;

    /* renamed from: P */
    public int f9902P;

    /* renamed from: Q */
    public int f9903Q;

    /* renamed from: R */
    public float f9904R;

    /* renamed from: S */
    public float f9905S;

    /* renamed from: T */
    public int f9906T;

    /* renamed from: U */
    public int f9907U;

    /* renamed from: V */
    public int f9908V;

    /* renamed from: W */
    public boolean f9909W;

    /* renamed from: X */
    public boolean f9910X;

    /* renamed from: Y */
    public String f9911Y;

    /* renamed from: Z */
    public int f9912Z;

    /* renamed from: a */
    public int f9913a;

    /* renamed from: a0 */
    public boolean f9914a0;

    /* renamed from: b */
    public int f9915b;

    /* renamed from: b0 */
    public boolean f9916b0;

    /* renamed from: c */
    public float f9917c;

    /* renamed from: c0 */
    public boolean f9918c0;

    /* renamed from: d */
    public boolean f9919d;

    /* renamed from: d0 */
    public boolean f9920d0;

    /* renamed from: e */
    public int f9921e;

    /* renamed from: e0 */
    public boolean f9922e0;

    /* renamed from: f */
    public int f9923f;

    /* renamed from: f0 */
    public int f9924f0;

    /* renamed from: g */
    public int f9925g;

    /* renamed from: g0 */
    public int f9926g0;

    /* renamed from: h */
    public int f9927h;

    /* renamed from: h0 */
    public int f9928h0;

    /* renamed from: i */
    public int f9929i;

    /* renamed from: i0 */
    public int f9930i0;

    /* renamed from: j */
    public int f9931j;

    /* renamed from: j0 */
    public int f9932j0;

    /* renamed from: k */
    public int f9933k;

    /* renamed from: k0 */
    public int f9934k0;

    /* renamed from: l */
    public int f9935l;

    /* renamed from: l0 */
    public float f9936l0;

    /* renamed from: m */
    public int f9937m;

    /* renamed from: m0 */
    public int f9938m0;

    /* renamed from: n */
    public int f9939n;

    /* renamed from: n0 */
    public int f9940n0;

    /* renamed from: o */
    public int f9941o;

    /* renamed from: o0 */
    public float f9942o0;

    /* renamed from: p */
    public int f9943p;

    /* renamed from: p0 */
    public C2442d f9944p0;

    /* renamed from: q */
    public int f9945q;

    /* renamed from: r */
    public float f9946r;

    /* renamed from: s */
    public int f9947s;

    /* renamed from: t */
    public int f9948t;

    /* renamed from: u */
    public int f9949u;

    /* renamed from: v */
    public int f9950v;

    /* renamed from: w */
    public int f9951w;

    /* renamed from: x */
    public int f9952x;

    /* renamed from: y */
    public int f9953y;

    /* renamed from: z */
    public int f9954z;

    /* renamed from: a */
    public final void m4784a() {
        this.f9920d0 = false;
        this.f9914a0 = true;
        this.f9916b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.f9909W) {
            this.f9914a0 = false;
            if (this.f9898L == 0) {
                this.f9898L = 1;
            }
        }
        int i4 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i4 == -2 && this.f9910X) {
            this.f9916b0 = false;
            if (this.f9899M == 0) {
                this.f9899M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f9914a0 = false;
            if (i == 0 && this.f9898L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.f9909W = true;
            }
        }
        if (i4 == 0 || i4 == -1) {
            this.f9916b0 = false;
            if (i4 == 0 && this.f9899M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.f9910X = true;
            }
        }
        if (this.f9917c == -1.0f && this.f9913a == -1 && this.f9915b == -1) {
            return;
        }
        this.f9920d0 = true;
        this.f9914a0 = true;
        this.f9916b0 = true;
        if (!(this.f9944p0 instanceof C2446h)) {
            this.f9944p0 = new C2446h();
        }
        ((C2446h) this.f9944p0).m4423S(this.f9908V);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void resolveLayoutDirection(int i) {
        int i4;
        int i8;
        int i9;
        int i10;
        int i11 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i12 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z7 = false;
        boolean z8 = 1 == getLayoutDirection();
        this.f9928h0 = -1;
        this.f9930i0 = -1;
        this.f9924f0 = -1;
        this.f9926g0 = -1;
        this.f9932j0 = this.f9951w;
        this.f9934k0 = this.f9953y;
        float f8 = this.f9891E;
        this.f9936l0 = f8;
        int i13 = this.f9913a;
        this.f9938m0 = i13;
        int i14 = this.f9915b;
        this.f9940n0 = i14;
        float f9 = this.f9917c;
        this.f9942o0 = f9;
        if (z8) {
            int i15 = this.f9947s;
            if (i15 != -1) {
                this.f9928h0 = i15;
            } else {
                int i16 = this.f9948t;
                if (i16 != -1) {
                    this.f9930i0 = i16;
                }
                i4 = this.f9949u;
                if (i4 != -1) {
                    this.f9926g0 = i4;
                    z7 = true;
                }
                i8 = this.f9950v;
                if (i8 != -1) {
                    this.f9924f0 = i8;
                    z7 = true;
                }
                i9 = this.f9887A;
                if (i9 != Integer.MIN_VALUE) {
                    this.f9934k0 = i9;
                }
                i10 = this.f9888B;
                if (i10 != Integer.MIN_VALUE) {
                    this.f9932j0 = i10;
                }
                if (z7) {
                    this.f9936l0 = 1.0f - f8;
                }
                if (this.f9920d0 && this.f9908V == 1 && this.f9919d) {
                    if (f9 == -1.0f) {
                        this.f9942o0 = 1.0f - f9;
                        this.f9938m0 = -1;
                        this.f9940n0 = -1;
                    } else if (i13 != -1) {
                        this.f9940n0 = i13;
                        this.f9938m0 = -1;
                        this.f9942o0 = -1.0f;
                    } else if (i14 != -1) {
                        this.f9938m0 = i14;
                        this.f9940n0 = -1;
                        this.f9942o0 = -1.0f;
                    }
                }
            }
            z7 = true;
            i4 = this.f9949u;
            if (i4 != -1) {
            }
            i8 = this.f9950v;
            if (i8 != -1) {
            }
            i9 = this.f9887A;
            if (i9 != Integer.MIN_VALUE) {
            }
            i10 = this.f9888B;
            if (i10 != Integer.MIN_VALUE) {
            }
            if (z7) {
            }
            if (this.f9920d0) {
                if (f9 == -1.0f) {
                }
            }
        } else {
            int i17 = this.f9947s;
            if (i17 != -1) {
                this.f9926g0 = i17;
            }
            int i18 = this.f9948t;
            if (i18 != -1) {
                this.f9924f0 = i18;
            }
            int i19 = this.f9949u;
            if (i19 != -1) {
                this.f9928h0 = i19;
            }
            int i20 = this.f9950v;
            if (i20 != -1) {
                this.f9930i0 = i20;
            }
            int i21 = this.f9887A;
            if (i21 != Integer.MIN_VALUE) {
                this.f9932j0 = i21;
            }
            int i22 = this.f9888B;
            if (i22 != Integer.MIN_VALUE) {
                this.f9934k0 = i22;
            }
        }
        if (this.f9949u == -1 && this.f9950v == -1 && this.f9948t == -1 && this.f9947s == -1) {
            int i23 = this.f9925g;
            if (i23 != -1) {
                this.f9928h0 = i23;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i12 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i12;
                }
            } else {
                int i24 = this.f9927h;
                if (i24 != -1) {
                    this.f9930i0 = i24;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i12 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i12;
                    }
                }
            }
            int i25 = this.f9921e;
            if (i25 != -1) {
                this.f9924f0 = i25;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i11 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i11;
                return;
            }
            int i26 = this.f9923f;
            if (i26 != -1) {
                this.f9926g0 = i26;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i11 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i11;
            }
        }
    }
}
