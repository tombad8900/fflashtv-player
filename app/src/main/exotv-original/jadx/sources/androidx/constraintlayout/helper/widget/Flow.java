package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p174u.C2441c;
import p174u.C2442d;
import p174u.C2443e;
import p174u.C2444f;
import p174u.C2445g;
import p174u.C2446h;
import p182v.C2487b;
import p199x.AbstractC2730q;
import p199x.AbstractC2732s;
import p199x.C2719f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class Flow extends AbstractC2732s {

    /* renamed from: s */
    public final C2445g f783s;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9879j = new int[32];
        this.f9885p = new HashMap();
        this.f9881l = context;
        super.mo4782g(attributeSet);
        C2445g c2445g = new C2445g();
        c2445g.f8956s0 = 0;
        c2445g.f8957t0 = 0;
        c2445g.f8958u0 = 0;
        c2445g.f8959v0 = 0;
        c2445g.f8960w0 = 0;
        c2445g.f8961x0 = 0;
        c2445g.f8962y0 = false;
        c2445g.f8963z0 = 0;
        c2445g.f8928A0 = 0;
        c2445g.f8929B0 = new C2487b();
        c2445g.f8930C0 = null;
        c2445g.f8931D0 = -1;
        c2445g.f8932E0 = -1;
        c2445g.f8933F0 = -1;
        c2445g.f8934G0 = -1;
        c2445g.f8935H0 = -1;
        c2445g.f8936I0 = -1;
        c2445g.f8937J0 = 0.5f;
        c2445g.f8938K0 = 0.5f;
        c2445g.f8939L0 = 0.5f;
        c2445g.f8940M0 = 0.5f;
        c2445g.f8941N0 = 0.5f;
        c2445g.f8942O0 = 0.5f;
        c2445g.f8943P0 = 0;
        c2445g.f8944Q0 = 0;
        c2445g.f8945R0 = 2;
        c2445g.f8946S0 = 2;
        c2445g.f8947T0 = 0;
        c2445g.f8948U0 = -1;
        c2445g.f8949V0 = 0;
        c2445g.f8950W0 = new ArrayList();
        c2445g.f8951X0 = null;
        c2445g.f8952Y0 = null;
        c2445g.f8953Z0 = null;
        c2445g.f8955b1 = 0;
        this.f783s = c2445g;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2730q.f10089b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f783s.f8949V0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C2445g c2445g2 = this.f783s;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c2445g2.f8956s0 = dimensionPixelSize;
                    c2445g2.f8957t0 = dimensionPixelSize;
                    c2445g2.f8958u0 = dimensionPixelSize;
                    c2445g2.f8959v0 = dimensionPixelSize;
                } else if (index == 18) {
                    C2445g c2445g3 = this.f783s;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c2445g3.f8958u0 = dimensionPixelSize2;
                    c2445g3.f8960w0 = dimensionPixelSize2;
                    c2445g3.f8961x0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f783s.f8959v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f783s.f8960w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f783s.f8956s0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f783s.f8961x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f783s.f8957t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f783s.f8947T0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f783s.f8931D0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f783s.f8932E0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f783s.f8933F0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f783s.f8935H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f783s.f8934G0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f783s.f8936I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f783s.f8937J0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f783s.f8939L0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f783s.f8941N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f783s.f8940M0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f783s.f8942O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f783s.f8938K0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f783s.f8945R0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f783s.f8946S0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f783s.f8943P0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f783s.f8944Q0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f783s.f8948U0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f9882m = this.f783s;
        m4783i();
    }

    @Override // p199x.AbstractC2716c
    /* renamed from: h */
    public final void mo494h(C2442d c2442d, boolean z7) {
        C2445g c2445g = this.f783s;
        int i = c2445g.f8958u0;
        if (i > 0 || c2445g.f8959v0 > 0) {
            if (z7) {
                c2445g.f8960w0 = c2445g.f8959v0;
                c2445g.f8961x0 = i;
            } else {
                c2445g.f8960w0 = i;
                c2445g.f8961x0 = c2445g.f8959v0;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:391:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x072a  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0738  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x073b  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0757  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x010f A[EDGE_INSN: B:430:0x010f->B:63:0x010f BREAK  A[LOOP:1: B:57:0x00f8->B:62:0x010a], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0140  */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v46 */
    @Override // p199x.AbstractC2732s
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo495j(C2445g c2445g, int i, int i4) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C2442d[] c2442dArr;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        int i20;
        int i21;
        C2444f c2444f;
        char c8;
        ?? r12;
        boolean z7;
        int i22;
        int i23;
        int i24;
        int iCeil;
        int iCeil2;
        Object obj;
        C2442d c2442d;
        boolean z8;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        C2441c c2441c;
        C2441c c2441c2;
        C2441c c2441c3;
        ArrayList arrayList;
        int i31;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i4);
        if (c2445g == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        int[] iArr2 = c2445g.f8877p0;
        C2441c c2441c4 = c2445g.f8829J;
        C2441c c2441c5 = c2445g.f8828I;
        C2441c c2441c6 = c2445g.f8830K;
        C2441c c2441c7 = c2445g.f8831L;
        ArrayList arrayList2 = c2445g.f8950W0;
        if (c2445g.f8971r0 > 0) {
            C2487b c2487b = c2445g.f8929B0;
            C2442d c2442d2 = c2445g.f8839T;
            C2719f c2719f = c2442d2 != null ? ((C2443e) c2442d2).f8904u0 : null;
            if (c2719f == null) {
                c2445g.f8963z0 = 0;
                c2445g.f8928A0 = 0;
                c2445g.f8962y0 = false;
            } else {
                int i32 = 0;
                while (i32 < c2445g.f8971r0) {
                    C2442d c2442d3 = c2445g.f8970q0[i32];
                    if (c2442d3 == null) {
                        c2441c = c2441c5;
                    } else {
                        c2441c = c2441c5;
                        if (!(c2442d3 instanceof C2446h)) {
                            c2441c2 = c2441c6;
                            int iM4391j = c2442d3.m4391j(0);
                            c2441c3 = c2441c7;
                            int iM4391j2 = c2442d3.m4391j(1);
                            arrayList = arrayList2;
                            if (iM4391j == 3) {
                                i31 = i32;
                                if (c2442d3.f8879r == 1 || iM4391j2 != 3 || c2442d3.f8880s == 1) {
                                }
                            } else {
                                i31 = i32;
                            }
                            if (iM4391j == 3) {
                                iM4391j = 2;
                            }
                            if (iM4391j2 == 3) {
                                iM4391j2 = 2;
                            }
                            c2487b.f9076a = iM4391j;
                            c2487b.f9077b = iM4391j2;
                            c2487b.f9078c = c2442d3.m4396q();
                            c2487b.f9079d = c2442d3.m4392k();
                            c2719f.m4786b(c2442d3, c2487b);
                            c2442d3.m4381O(c2487b.f9080e);
                            c2442d3.m4378L(c2487b.f9081f);
                            c2442d3.m4375I(c2487b.f9082g);
                        }
                        i32 = i31 + 1;
                        c2441c5 = c2441c;
                        c2441c6 = c2441c2;
                        c2441c7 = c2441c3;
                        arrayList2 = arrayList;
                    }
                    c2441c2 = c2441c6;
                    c2441c3 = c2441c7;
                    arrayList = arrayList2;
                    i31 = i32;
                    i32 = i31 + 1;
                    c2441c5 = c2441c;
                    c2441c6 = c2441c2;
                    c2441c7 = c2441c3;
                    arrayList2 = arrayList;
                }
                C2441c c2441c8 = c2441c5;
                C2441c c2441c9 = c2441c6;
                C2441c c2441c10 = c2441c7;
                ArrayList arrayList3 = arrayList2;
                int i33 = c2445g.f8960w0;
                int i34 = c2445g.f8961x0;
                i8 = c2445g.f8956s0;
                int i35 = c2445g.f8957t0;
                int[] iArr3 = new int[2];
                int i36 = (size - i33) - i34;
                i9 = c2445g.f8949V0;
                if (i9 == 1) {
                    i36 = (size2 - i8) - i35;
                }
                int i37 = i36;
                if (i9 != 0) {
                    if (c2445g.f8931D0 == -1) {
                        i30 = 0;
                        c2445g.f8931D0 = 0;
                    } else {
                        i30 = 0;
                    }
                    i10 = i34;
                    if (c2445g.f8932E0 == -1) {
                        c2445g.f8932E0 = i30;
                    }
                } else {
                    i10 = i34;
                    if (c2445g.f8931D0 == -1) {
                        c2445g.f8931D0 = 0;
                    }
                    if (c2445g.f8932E0 == -1) {
                        c2445g.f8932E0 = 0;
                    }
                }
                C2442d[] c2442dArr2 = c2445g.f8970q0;
                i11 = 0;
                i12 = 0;
                while (true) {
                    i13 = c2445g.f8971r0;
                    i14 = i8;
                    if (i11 < i13) {
                        break;
                    }
                    if (c2445g.f8970q0[i11].f8859g0 == 8) {
                        i12++;
                    }
                    i11++;
                    i8 = i14;
                }
                if (i12 <= 0) {
                    c2442dArr = new C2442d[i13 - i12];
                    int i38 = 0;
                    int i39 = 0;
                    while (i38 < c2445g.f8971r0) {
                        C2442d c2442d4 = c2445g.f8970q0[i38];
                        C2442d[] c2442dArr3 = c2442dArr;
                        if (c2442d4.f8859g0 != 8) {
                            c2442dArr3[i39] = c2442d4;
                            i39++;
                        }
                        i38++;
                        c2442dArr = c2442dArr3;
                    }
                    i15 = i39;
                } else {
                    i15 = i13;
                    c2442dArr = c2442dArr2;
                }
                c2445g.f8954a1 = c2442dArr;
                c2445g.f8955b1 = i15;
                i16 = c2445g.f8947T0;
                if (i16 != 0) {
                    C2442d[] c2442dArr4 = c2442dArr;
                    int i40 = i15;
                    i17 = i35;
                    iArr = iArr3;
                    i18 = size2;
                    i19 = i33;
                    i20 = i10;
                    i21 = i14;
                    int i41 = c2445g.f8949V0;
                    if (i40 != 0) {
                        if (arrayList3.size() == 0) {
                            c2444f = new C2444f(c2445g, i41, c2445g.f8828I, c2445g.f8829J, c2445g.f8830K, c2445g.f8831L, i37);
                            arrayList3.add(c2444f);
                        } else {
                            C2444f c2444f2 = (C2444f) arrayList3.get(0);
                            c2444f2.f8912c = 0;
                            c2444f2.f8911b = null;
                            c2444f2.f8921l = 0;
                            c2444f2.f8922m = 0;
                            c2444f2.f8923n = 0;
                            c2444f2.f8924o = 0;
                            c2444f2.f8925p = 0;
                            c2444f2.m4417f(i41, c2445g.f8828I, c2445g.f8829J, c2445g.f8830K, c2445g.f8831L, c2445g.f8960w0, c2445g.f8956s0, c2445g.f8961x0, c2445g.f8957t0, i37);
                            c2444f = c2444f2;
                        }
                        for (int i42 = 0; i42 < i40; i42++) {
                            c2444f.m4412a(c2442dArr4[i42]);
                        }
                        c8 = 0;
                        iArr[0] = c2444f.m4415d();
                        r12 = 1;
                        iArr[1] = c2444f.m4414c();
                        int i43 = iArr[c8] + i19 + i20;
                        int i44 = iArr[r12] + i21 + i17;
                        if (mode != 1073741824) {
                        }
                        if (mode2 != 1073741824) {
                        }
                        c2445g.f8963z0 = size;
                        c2445g.f8928A0 = iMin;
                        c2445g.m4381O(size);
                        c2445g.m4378L(iMin);
                        c2445g.f8962y0 = c2445g.f8971r0 <= 0 ? r12 : false;
                    }
                } else if (i16 != 1) {
                    if (i16 == 2) {
                        C2442d[] c2442dArr5 = c2442dArr;
                        int i45 = i15;
                        i17 = i35;
                        iArr = iArr3;
                        i18 = size2;
                        i19 = i33;
                        i20 = i10;
                        i21 = i14;
                        int i46 = c2445g.f8949V0;
                        if (i46 == 0) {
                            int i47 = c2445g.f8948U0;
                            if (i47 <= 0) {
                                int i48 = 0;
                                iCeil2 = 0;
                                for (int i49 = 0; i49 < i45; i49++) {
                                    if (i49 > 0) {
                                        i48 += c2445g.f8943P0;
                                    }
                                    C2442d c2442d5 = c2442dArr5[i49];
                                    if (c2442d5 != null) {
                                        int iM4420U = c2445g.m4420U(c2442d5, i37) + i48;
                                        if (iM4420U > i37) {
                                            break;
                                        }
                                        iCeil2++;
                                        i48 = iM4420U;
                                    }
                                }
                            } else {
                                iCeil2 = i47;
                            }
                            iCeil = 0;
                        } else {
                            iCeil = c2445g.f8948U0;
                            if (iCeil <= 0) {
                                int i50 = 0;
                                int i51 = 0;
                                for (int i52 = 0; i52 < i45; i52++) {
                                    if (i52 > 0) {
                                        i50 += c2445g.f8944Q0;
                                    }
                                    C2442d c2442d6 = c2442dArr5[i52];
                                    if (c2442d6 != null) {
                                        int iM4419T = c2445g.m4419T(c2442d6, i37) + i50;
                                        if (iM4419T > i37) {
                                            break;
                                        }
                                        i51++;
                                        i50 = iM4419T;
                                    }
                                }
                                iCeil = i51;
                            }
                            iCeil2 = 0;
                        }
                        if (c2445g.f8953Z0 == null) {
                            c2445g.f8953Z0 = new int[2];
                        }
                        boolean z9 = (iCeil == 0 && i46 == 1) || (iCeil2 == 0 && i46 == 0);
                        while (!z9) {
                            if (i46 == 0) {
                                iCeil = (int) Math.ceil(i45 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i45 / iCeil);
                            }
                            C2442d[] c2442dArr6 = c2445g.f8952Y0;
                            if (c2442dArr6 == null || c2442dArr6.length < iCeil2) {
                                obj = null;
                                c2445g.f8952Y0 = new C2442d[iCeil2];
                            } else {
                                obj = null;
                                Arrays.fill(c2442dArr6, (Object) null);
                            }
                            C2442d[] c2442dArr7 = c2445g.f8951X0;
                            if (c2442dArr7 == null || c2442dArr7.length < iCeil) {
                                c2445g.f8951X0 = new C2442d[iCeil];
                            } else {
                                Arrays.fill(c2442dArr7, obj);
                            }
                            for (int i53 = 0; i53 < iCeil2; i53++) {
                                for (int i54 = 0; i54 < iCeil; i54++) {
                                    int i55 = (i54 * iCeil2) + i53;
                                    if (i46 == 1) {
                                        i55 = (i53 * iCeil) + i54;
                                    }
                                    if (i55 < c2442dArr5.length && (c2442d = c2442dArr5[i55]) != null) {
                                        int iM4420U2 = c2445g.m4420U(c2442d, i37);
                                        C2442d c2442d7 = c2445g.f8952Y0[i53];
                                        if (c2442d7 == null || c2442d7.m4396q() < iM4420U2) {
                                            c2445g.f8952Y0[i53] = c2442d;
                                        }
                                        int iM4419T2 = c2445g.m4419T(c2442d, i37);
                                        C2442d c2442d8 = c2445g.f8951X0[i54];
                                        if (c2442d8 == null || c2442d8.m4392k() < iM4419T2) {
                                            c2445g.f8951X0[i54] = c2442d;
                                        }
                                    }
                                }
                            }
                            int iM4420U3 = 0;
                            for (int i56 = 0; i56 < iCeil2; i56++) {
                                C2442d c2442d9 = c2445g.f8952Y0[i56];
                                if (c2442d9 != null) {
                                    if (i56 > 0) {
                                        iM4420U3 += c2445g.f8943P0;
                                    }
                                    iM4420U3 = c2445g.m4420U(c2442d9, i37) + iM4420U3;
                                }
                            }
                            int iM4419T3 = 0;
                            for (int i57 = 0; i57 < iCeil; i57++) {
                                C2442d c2442d10 = c2445g.f8951X0[i57];
                                if (c2442d10 != null) {
                                    if (i57 > 0) {
                                        iM4419T3 += c2445g.f8944Q0;
                                    }
                                    iM4419T3 = c2445g.m4419T(c2442d10, i37) + iM4419T3;
                                }
                            }
                            iArr[0] = iM4420U3;
                            iArr[1] = iM4419T3;
                            if (i46 == 0) {
                                if (iM4420U3 <= i37 || iCeil2 <= 1) {
                                    z9 = true;
                                } else {
                                    iCeil2--;
                                }
                            } else if (iM4419T3 <= i37 || iCeil <= 1) {
                                z9 = true;
                            } else {
                                iCeil--;
                            }
                        }
                        z7 = true;
                        int[] iArr4 = c2445g.f8953Z0;
                        iArr4[0] = iCeil2;
                        iArr4[1] = iCeil;
                    } else if (i16 != 3) {
                        i17 = i35;
                        iArr = iArr3;
                        i18 = size2;
                        i19 = i33;
                        i20 = i10;
                        i21 = i14;
                    } else {
                        int i58 = i15;
                        int i59 = c2445g.f8949V0;
                        if (i58 == 0) {
                            i17 = i35;
                            iArr = iArr3;
                            i18 = size2;
                            i19 = i33;
                            i20 = i10;
                            i21 = i14;
                            z8 = true;
                        } else {
                            arrayList3.clear();
                            C2442d[] c2442dArr8 = c2442dArr;
                            i19 = i33;
                            i17 = i35;
                            i20 = i10;
                            i21 = i14;
                            iArr = iArr3;
                            z8 = true;
                            C2444f c2444f3 = new C2444f(c2445g, i59, c2445g.f8828I, c2445g.f8829J, c2445g.f8830K, c2445g.f8831L, i37);
                            arrayList3.add(c2444f3);
                            if (i59 == 0) {
                                int i60 = 0;
                                int i61 = 0;
                                i25 = 0;
                                int i62 = 0;
                                while (i60 < i58) {
                                    i61++;
                                    C2442d c2442d11 = c2442dArr8[i60];
                                    int iM4420U4 = c2445g.m4420U(c2442d11, i37);
                                    int i63 = i59;
                                    int i64 = i60;
                                    if (c2442d11.f8877p0[0] == 3) {
                                        i25++;
                                    }
                                    int i65 = i25;
                                    boolean z10 = (i62 == i37 || (c2445g.f8943P0 + i62) + iM4420U4 > i37) && c2444f3.f8911b != null;
                                    if (!z10 && i64 > 0 && (i29 = c2445g.f8948U0) > 0 && i61 > i29) {
                                        z10 = true;
                                    }
                                    if (z10) {
                                        i27 = size2;
                                        i59 = i63;
                                        i28 = i64;
                                        c2444f3 = new C2444f(c2445g, i59, c2445g.f8828I, c2445g.f8829J, c2445g.f8830K, c2445g.f8831L, i37);
                                        c2444f3.f8923n = i28;
                                        arrayList3.add(c2444f3);
                                        i61 = 1;
                                    } else {
                                        i27 = size2;
                                        i59 = i63;
                                        i28 = i64;
                                        if (i28 > 0) {
                                            i62 = c2445g.f8943P0 + iM4420U4 + i62;
                                        }
                                        c2444f3.m4412a(c2442d11);
                                        i60 = i28 + 1;
                                        i25 = i65;
                                        size2 = i27;
                                    }
                                    i62 = iM4420U4;
                                    c2444f3.m4412a(c2442d11);
                                    i60 = i28 + 1;
                                    i25 = i65;
                                    size2 = i27;
                                }
                                i18 = size2;
                            } else {
                                i18 = size2;
                                int i66 = 0;
                                int i67 = 0;
                                int i68 = 0;
                                int i69 = 0;
                                while (i66 < i58) {
                                    i67++;
                                    C2442d c2442d12 = c2442dArr8[i66];
                                    int iM4419T4 = c2445g.m4419T(c2442d12, i37);
                                    int i70 = i59;
                                    if (c2442d12.f8877p0[1] == 3) {
                                        i68++;
                                    }
                                    int i71 = i68;
                                    boolean z11 = (i69 == i37 || (c2445g.f8944Q0 + i69) + iM4419T4 > i37) && c2444f3.f8911b != null;
                                    if (!z11 && i66 > 0 && (i26 = c2445g.f8948U0) > 0 && i67 > i26) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        i59 = i70;
                                        c2444f3 = new C2444f(c2445g, i59, c2445g.f8828I, c2445g.f8829J, c2445g.f8830K, c2445g.f8831L, i37);
                                        c2444f3.f8923n = i66;
                                        arrayList3.add(c2444f3);
                                        i67 = 1;
                                    } else {
                                        i59 = i70;
                                        if (i66 > 0) {
                                            i69 = c2445g.f8944Q0 + iM4419T4 + i69;
                                        }
                                        c2444f3.m4412a(c2442d12);
                                        i66++;
                                        i68 = i71;
                                    }
                                    i69 = iM4419T4;
                                    c2444f3.m4412a(c2442d12);
                                    i66++;
                                    i68 = i71;
                                }
                                i25 = i68;
                            }
                            int size3 = arrayList3.size();
                            int i72 = c2445g.f8960w0;
                            int i73 = c2445g.f8956s0;
                            int i74 = c2445g.f8961x0;
                            int i75 = c2445g.f8957t0;
                            boolean z12 = iArr2[0] == 2 || iArr2[1] == 2;
                            if (i25 > 0 && z12) {
                                for (int i76 = 0; i76 < size3; i76++) {
                                    C2444f c2444f4 = (C2444f) arrayList3.get(i76);
                                    if (i59 == 0) {
                                        c2444f4.m4416e(i37 - c2444f4.m4415d());
                                    } else {
                                        c2444f4.m4416e(i37 - c2444f4.m4414c());
                                    }
                                }
                            }
                            int i77 = i72;
                            int i78 = i73;
                            int i79 = i74;
                            int i80 = i75;
                            C2441c c2441c11 = c2441c8;
                            C2441c c2441c12 = c2441c9;
                            C2441c c2441c13 = c2441c10;
                            C2441c c2441c14 = c2441c4;
                            int iMax = 0;
                            int i81 = 0;
                            for (int i82 = 0; i82 < size3; i82++) {
                                C2444f c2444f5 = (C2444f) arrayList3.get(i82);
                                if (i59 == 0) {
                                    if (i82 < size3 - 1) {
                                        c2441c13 = ((C2444f) arrayList3.get(i82 + 1)).f8911b.f8829J;
                                        i80 = 0;
                                    } else {
                                        i80 = c2445g.f8957t0;
                                        c2441c13 = c2441c10;
                                    }
                                    C2441c c2441c15 = c2444f5.f8911b.f8831L;
                                    c2444f5.m4417f(i59, c2441c11, c2441c14, c2441c12, c2441c13, i77, i78, i79, i80, i37);
                                    iMax = Math.max(iMax, c2444f5.m4415d());
                                    int iM4414c = c2444f5.m4414c() + i81;
                                    if (i82 > 0) {
                                        iM4414c += c2445g.f8944Q0;
                                    }
                                    i81 = iM4414c;
                                    c2441c14 = c2441c15;
                                    i78 = 0;
                                } else {
                                    if (i82 < size3 - 1) {
                                        c2441c12 = ((C2444f) arrayList3.get(i82 + 1)).f8911b.f8828I;
                                        i79 = 0;
                                    } else {
                                        i79 = c2445g.f8961x0;
                                        c2441c12 = c2441c9;
                                    }
                                    C2441c c2441c16 = c2444f5.f8911b.f8830K;
                                    c2444f5.m4417f(i59, c2441c11, c2441c14, c2441c12, c2441c13, i77, i78, i79, i80, i37);
                                    int iM4415d = c2444f5.m4415d() + iMax;
                                    int iMax2 = Math.max(i81, c2444f5.m4414c());
                                    if (i82 > 0) {
                                        iM4415d += c2445g.f8943P0;
                                    }
                                    i81 = iMax2;
                                    iMax = iM4415d;
                                    c2441c11 = c2441c16;
                                    i77 = 0;
                                }
                            }
                            iArr[0] = iMax;
                            iArr[1] = i81;
                        }
                        z7 = z8;
                    }
                    c8 = 0;
                    r12 = z7;
                    int i432 = iArr[c8] + i19 + i20;
                    int i442 = iArr[r12] + i21 + i17;
                    if (mode != 1073741824) {
                        size = mode == Integer.MIN_VALUE ? Math.min(i432, size) : mode == 0 ? i432 : 0;
                    }
                    int iMin = mode2 != 1073741824 ? i18 : mode2 == Integer.MIN_VALUE ? Math.min(i442, i18) : mode2 == 0 ? i442 : 0;
                    c2445g.f8963z0 = size;
                    c2445g.f8928A0 = iMin;
                    c2445g.m4381O(size);
                    c2445g.m4378L(iMin);
                    c2445g.f8962y0 = c2445g.f8971r0 <= 0 ? r12 : false;
                } else {
                    i17 = i35;
                    iArr = iArr3;
                    i18 = size2;
                    i19 = i33;
                    i20 = i10;
                    i21 = i14;
                    int i83 = i15;
                    C2442d[] c2442dArr9 = c2442dArr;
                    int i84 = c2445g.f8949V0;
                    if (i83 != 0) {
                        arrayList3.clear();
                        C2444f c2444f6 = new C2444f(c2445g, i84, c2445g.f8828I, c2445g.f8829J, c2445g.f8830K, c2445g.f8831L, i37);
                        arrayList3.add(c2444f6);
                        if (i84 == 0) {
                            int i85 = 0;
                            i22 = 0;
                            int i86 = 0;
                            while (i85 < i83) {
                                C2442d c2442d13 = c2442dArr9[i85];
                                int iM4420U5 = c2445g.m4420U(c2442d13, i37);
                                if (c2442d13.f8877p0[0] == 3) {
                                    i22++;
                                }
                                int i87 = i22;
                                boolean z13 = (i86 == i37 || (c2445g.f8943P0 + i86) + iM4420U5 > i37) && c2444f6.f8911b != null;
                                if (!z13 && i85 > 0 && (i24 = c2445g.f8948U0) > 0 && i85 % i24 == 0) {
                                    z13 = true;
                                }
                                if (z13) {
                                    c2444f6 = new C2444f(c2445g, i84, c2445g.f8828I, c2445g.f8829J, c2445g.f8830K, c2445g.f8831L, i37);
                                    c2444f6.f8923n = i85;
                                    arrayList3.add(c2444f6);
                                } else {
                                    if (i85 > 0) {
                                        i86 = c2445g.f8943P0 + iM4420U5 + i86;
                                    }
                                    c2444f6.m4412a(c2442d13);
                                    i85++;
                                    i22 = i87;
                                }
                                i86 = iM4420U5;
                                c2444f6.m4412a(c2442d13);
                                i85++;
                                i22 = i87;
                            }
                        } else {
                            int i88 = 0;
                            i22 = 0;
                            int i89 = 0;
                            while (i88 < i83) {
                                C2442d c2442d14 = c2442dArr9[i88];
                                int iM4419T5 = c2445g.m4419T(c2442d14, i37);
                                if (c2442d14.f8877p0[1] == 3) {
                                    i22++;
                                }
                                int i90 = i22;
                                boolean z14 = (i89 == i37 || (c2445g.f8944Q0 + i89) + iM4419T5 > i37) && c2444f6.f8911b != null;
                                if (!z14 && i88 > 0 && (i23 = c2445g.f8948U0) > 0 && i88 % i23 == 0) {
                                    z14 = true;
                                }
                                if (z14) {
                                    c2444f6 = new C2444f(c2445g, i84, c2445g.f8828I, c2445g.f8829J, c2445g.f8830K, c2445g.f8831L, i37);
                                    c2444f6.f8923n = i88;
                                    arrayList3.add(c2444f6);
                                } else {
                                    if (i88 > 0) {
                                        i89 = c2445g.f8944Q0 + iM4419T5 + i89;
                                    }
                                    c2444f6.m4412a(c2442d14);
                                    i88++;
                                    i22 = i90;
                                }
                                i89 = iM4419T5;
                                c2444f6.m4412a(c2442d14);
                                i88++;
                                i22 = i90;
                            }
                        }
                        int size4 = arrayList3.size();
                        int i91 = c2445g.f8960w0;
                        int i92 = c2445g.f8956s0;
                        int i93 = c2445g.f8961x0;
                        int i94 = c2445g.f8957t0;
                        boolean z15 = iArr2[0] == 2 || iArr2[1] == 2;
                        if (i22 > 0 && z15) {
                            for (int i95 = 0; i95 < size4; i95++) {
                                C2444f c2444f7 = (C2444f) arrayList3.get(i95);
                                if (i84 == 0) {
                                    c2444f7.m4416e(i37 - c2444f7.m4415d());
                                } else {
                                    c2444f7.m4416e(i37 - c2444f7.m4414c());
                                }
                            }
                        }
                        int i96 = i91;
                        int i97 = i92;
                        int i98 = i93;
                        int i99 = i94;
                        C2441c c2441c17 = c2441c8;
                        C2441c c2441c18 = c2441c9;
                        C2441c c2441c19 = c2441c10;
                        C2441c c2441c20 = c2441c4;
                        int iMax3 = 0;
                        int i100 = 0;
                        for (int i101 = 0; i101 < size4; i101++) {
                            C2444f c2444f8 = (C2444f) arrayList3.get(i101);
                            if (i84 == 0) {
                                if (i101 < size4 - 1) {
                                    c2441c19 = ((C2444f) arrayList3.get(i101 + 1)).f8911b.f8829J;
                                    i99 = 0;
                                } else {
                                    i99 = c2445g.f8957t0;
                                    c2441c19 = c2441c10;
                                }
                                C2441c c2441c21 = c2444f8.f8911b.f8831L;
                                c2444f8.m4417f(i84, c2441c17, c2441c20, c2441c18, c2441c19, i96, i97, i98, i99, i37);
                                iMax3 = Math.max(iMax3, c2444f8.m4415d());
                                int iM4414c2 = c2444f8.m4414c() + i100;
                                if (i101 > 0) {
                                    iM4414c2 += c2445g.f8944Q0;
                                }
                                i100 = iM4414c2;
                                c2441c20 = c2441c21;
                                i97 = 0;
                            } else {
                                if (i101 < size4 - 1) {
                                    c2441c18 = ((C2444f) arrayList3.get(i101 + 1)).f8911b.f8828I;
                                    i98 = 0;
                                } else {
                                    i98 = c2445g.f8961x0;
                                    c2441c18 = c2441c9;
                                }
                                C2441c c2441c22 = c2444f8.f8911b.f8830K;
                                c2444f8.m4417f(i84, c2441c17, c2441c20, c2441c18, c2441c19, i96, i97, i98, i99, i37);
                                int iM4415d2 = c2444f8.m4415d() + iMax3;
                                int iMax4 = Math.max(i100, c2444f8.m4414c());
                                if (i101 > 0) {
                                    iM4415d2 += c2445g.f8943P0;
                                }
                                i100 = iMax4;
                                iMax3 = iM4415d2;
                                c2441c17 = c2441c22;
                                i96 = 0;
                            }
                        }
                        iArr[0] = iMax3;
                        iArr[1] = i100;
                    }
                }
                z7 = true;
                c8 = 0;
                r12 = z7;
                int i4322 = iArr[c8] + i19 + i20;
                int i4422 = iArr[r12] + i21 + i17;
                if (mode != 1073741824) {
                }
                if (mode2 != 1073741824) {
                }
                c2445g.f8963z0 = size;
                c2445g.f8928A0 = iMin;
                c2445g.m4381O(size);
                c2445g.m4378L(iMin);
                c2445g.f8962y0 = c2445g.f8971r0 <= 0 ? r12 : false;
            }
        } else {
            C2441c c2441c82 = c2441c5;
            C2441c c2441c92 = c2441c6;
            C2441c c2441c102 = c2441c7;
            ArrayList arrayList32 = arrayList2;
            int i332 = c2445g.f8960w0;
            int i342 = c2445g.f8961x0;
            i8 = c2445g.f8956s0;
            int i352 = c2445g.f8957t0;
            int[] iArr32 = new int[2];
            int i362 = (size - i332) - i342;
            i9 = c2445g.f8949V0;
            if (i9 == 1) {
            }
            int i372 = i362;
            if (i9 != 0) {
            }
            C2442d[] c2442dArr22 = c2445g.f8970q0;
            i11 = 0;
            i12 = 0;
            while (true) {
                i13 = c2445g.f8971r0;
                i14 = i8;
                if (i11 < i13) {
                }
                i11++;
                i8 = i14;
            }
            if (i12 <= 0) {
            }
            c2445g.f8954a1 = c2442dArr;
            c2445g.f8955b1 = i15;
            i16 = c2445g.f8947T0;
            if (i16 != 0) {
            }
            z7 = true;
            c8 = 0;
            r12 = z7;
            int i43222 = iArr[c8] + i19 + i20;
            int i44222 = iArr[r12] + i21 + i17;
            if (mode != 1073741824) {
            }
            if (mode2 != 1073741824) {
            }
            c2445g.f8963z0 = size;
            c2445g.f8928A0 = iMin;
            c2445g.m4381O(size);
            c2445g.m4378L(iMin);
            c2445g.f8962y0 = c2445g.f8971r0 <= 0 ? r12 : false;
        }
        setMeasuredDimension(c2445g.f8963z0, c2445g.f8928A0);
    }

    @Override // p199x.AbstractC2716c, android.view.View
    public final void onMeasure(int i, int i4) {
        mo495j(this.f783s, i, i4);
    }

    public void setFirstHorizontalBias(float f8) {
        this.f783s.f8939L0 = f8;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.f783s.f8933F0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f8) {
        this.f783s.f8940M0 = f8;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.f783s.f8934G0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.f783s.f8945R0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f8) {
        this.f783s.f8937J0 = f8;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.f783s.f8943P0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.f783s.f8931D0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f8) {
        this.f783s.f8941N0 = f8;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.f783s.f8935H0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f8) {
        this.f783s.f8942O0 = f8;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.f783s.f8936I0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.f783s.f8948U0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.f783s.f8949V0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C2445g c2445g = this.f783s;
        c2445g.f8956s0 = i;
        c2445g.f8957t0 = i;
        c2445g.f8958u0 = i;
        c2445g.f8959v0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.f783s.f8957t0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.f783s.f8960w0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.f783s.f8961x0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.f783s.f8956s0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.f783s.f8946S0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f8) {
        this.f783s.f8938K0 = f8;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.f783s.f8944Q0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.f783s.f8932E0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.f783s.f8947T0 = i;
        requestLayout();
    }
}
