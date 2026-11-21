package com.google.android.material.carousel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.R;
import com.google.android.material.datepicker.C0768z;
import p002a1.AbstractC0008a1;
import p034d5.AbstractC0847a;
import p071i1.AbstractC1225d;
import p092k5.C1603b;
import p092k5.C1604c;
import p092k5.C1606e;
import p092k5.ViewOnLayoutChangeListenerC1602a;
import p216z2.AbstractC2888f0;
import p216z2.C2890g0;
import p216z2.C2900l0;
import p216z2.C2912r0;
import p216z2.InterfaceC2910q0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class CarouselLayoutManager extends AbstractC2888f0 implements InterfaceC2910q0 {

    /* renamed from: p */
    public final C1606e f3200p;

    /* renamed from: q */
    public AbstractC1225d f3201q;

    /* renamed from: r */
    public final View.OnLayoutChangeListener f3202r;

    public CarouselLayoutManager() {
        C1606e c1606e = new C1606e();
        new C1603b();
        this.f3202r = new ViewOnLayoutChangeListenerC1602a(0, this);
        this.f3200p = c1606e;
        m5004n0();
        m1830F0(0);
    }

    /* renamed from: C0 */
    public final float m1827C0(float f8, float f9) {
        return m1829E0() ? f8 - f9 : f8 + f9;
    }

    /* renamed from: D0 */
    public final boolean m1828D0() {
        return this.f3201q.f5114b == 0;
    }

    /* renamed from: E0 */
    public final boolean m1829E0() {
        return m1828D0() && m4992C() == 1;
    }

    /* renamed from: F0 */
    public final void m1830F0(int i) {
        C1604c c1604c;
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "invalid orientation:"));
        }
        mo1125c(null);
        AbstractC1225d abstractC1225d = this.f3201q;
        if (abstractC1225d == null || i != abstractC1225d.f5114b) {
            if (i == 0) {
                c1604c = new C1604c(this, 1);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException("invalid orientation");
                }
                c1604c = new C1604c(this, 0);
            }
            this.f3201q = c1604c;
            m5004n0();
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: L */
    public final boolean mo1107L() {
        return true;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: R */
    public final void mo1831R(RecyclerView recyclerView) throws Resources.NotFoundException {
        Context context = recyclerView.getContext();
        C1606e c1606e = this.f3200p;
        float dimension = c1606e.f6106a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_min);
        }
        c1606e.f6106a = dimension;
        float dimension2 = c1606e.f6107b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R.dimen.m3_carousel_small_item_size_max);
        }
        c1606e.f6107b = dimension2;
        m5004n0();
        recyclerView.addOnLayoutChangeListener(this.f3202r);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: S */
    public final void mo1114S(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f3202r);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    @Override // p216z2.AbstractC2888f0
    /* renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View mo1065T(View view, int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        char c8;
        if (m5010v() == 0) {
            return null;
        }
        int i4 = this.f3201q.f5114b;
        if (i == 1) {
            c8 = '\uffff';
        } else if (i == 2) {
            c8 = 1;
        } else if (i == 17) {
            if (i4 == 0) {
                if (m1829E0()) {
                }
            }
            c8 = 0;
        } else if (i != 33) {
            if (i != 66) {
                if (i != 130) {
                    Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                } else if (i4 == 1) {
                }
                c8 = 0;
            } else {
                if (i4 == 0) {
                    if (m1829E0()) {
                    }
                }
                c8 = 0;
            }
        } else if (i4 != 1) {
            c8 = 0;
        }
        if (c8 == 0) {
            return null;
        }
        if (c8 == '\uffff') {
            if (AbstractC2888f0.m4983H(view) == 0) {
                return null;
            }
            int iM4983H = AbstractC2888f0.m4983H(m5008u(0)) - 1;
            if (iM4983H < 0 || iM4983H >= m4991B()) {
                return m5008u(m1829E0() ? m5010v() - 1 : 0);
            }
            this.f3201q.mo2678e();
            throw null;
        }
        if (AbstractC2888f0.m4983H(view) == m4991B() - 1) {
            return null;
        }
        int iM4983H2 = AbstractC2888f0.m4983H(m5008u(m5010v() - 1)) + 1;
        if (iM4983H2 < 0 || iM4983H2 >= m4991B()) {
            return m5008u(m1829E0() ? 0 : m5010v() - 1);
        }
        this.f3201q.mo2678e();
        throw null;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: U */
    public final void mo1117U(AccessibilityEvent accessibilityEvent) {
        super.mo1117U(accessibilityEvent);
        if (m5010v() > 0) {
            accessibilityEvent.setFromIndex(AbstractC2888f0.m4983H(m5008u(0)));
            accessibilityEvent.setToIndex(AbstractC2888f0.m4983H(m5008u(m5010v() - 1)));
        }
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: Y */
    public final void mo1070Y(int i, int i4) {
        m4991B();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: Z */
    public final void mo1071Z() {
        m4991B();
    }

    @Override // p216z2.InterfaceC2910q0
    /* renamed from: a */
    public final PointF mo1122a(int i) {
        return null;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: b0 */
    public final void mo1073b0(int i, int i4) {
        m4991B();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: d */
    public final boolean mo1127d() {
        return m1828D0();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: d0 */
    public final void mo1075d0(C2900l0 c2900l0, C2912r0 c2912r0) {
        if (c2912r0.m5052b() > 0) {
            if ((m1828D0() ? this.f10682n : this.f10683o) > 0.0f) {
                m1829E0();
                c2900l0.m5032d(0);
                throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
            }
        }
        m5000i0(c2900l0);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: e */
    public final boolean mo1128e() {
        return !m1828D0();
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: e0 */
    public final void mo1077e0(C2912r0 c2912r0) {
        if (m5010v() == 0) {
            return;
        }
        AbstractC2888f0.m4983H(m5008u(0));
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: j */
    public final int mo1136j(C2912r0 c2912r0) {
        m5010v();
        return 0;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: k */
    public final int mo1082k(C2912r0 c2912r0) {
        return 0;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: l */
    public final int mo1084l(C2912r0 c2912r0) {
        return 0;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: m */
    public final int mo1137m(C2912r0 c2912r0) {
        m5010v();
        return 0;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: m0 */
    public final boolean mo1832m0(RecyclerView recyclerView, View view, Rect rect, boolean z7, boolean z8) {
        return false;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: n */
    public final int mo1087n(C2912r0 c2912r0) {
        return 0;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: o */
    public final int mo1089o(C2912r0 c2912r0) {
        return 0;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: o0 */
    public final int mo1090o0(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        if (!m1828D0() || m5010v() == 0 || i == 0) {
            return 0;
        }
        c2900l0.m5032d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: p0 */
    public final void mo1138p0(int i) {
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: q0 */
    public final int mo1093q0(int i, C2900l0 c2900l0, C2912r0 c2912r0) {
        if (!mo1128e() || m5010v() == 0 || i == 0) {
            return 0;
        }
        c2900l0.m5032d(0);
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: r */
    public final C2890g0 mo1094r() {
        return new C2890g0(-2, -2);
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: y */
    public final void mo1833y(View view, Rect rect) {
        super.mo1833y(view, rect);
        rect.centerY();
        if (m1828D0()) {
            rect.centerX();
        }
        throw null;
    }

    @Override // p216z2.AbstractC2888f0
    /* renamed from: z0 */
    public final void mo1141z0(RecyclerView recyclerView, int i) {
        C0768z c0768z = new C0768z(this, recyclerView.getContext());
        c0768z.f10803a = i;
        m4990A0(c0768z);
    }

    @SuppressLint({"UnknownNullness"})
    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i4) {
        new C1603b();
        this.f3202r = new ViewOnLayoutChangeListenerC1602a(0, this);
        this.f3200p = new C1606e();
        m5004n0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3740b);
            typedArrayObtainStyledAttributes.getInt(0, 0);
            m5004n0();
            m1830F0(typedArrayObtainStyledAttributes.getInt(0, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
