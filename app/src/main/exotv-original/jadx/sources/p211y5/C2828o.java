package p211y5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p034d5.AbstractC0847a;
import p168t2.AbstractC2429w;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.o */
/* loaded from: classes.dex */
public final class C2828o implements InterfaceC2826m {

    /* renamed from: a */
    public AbstractC2436a f10521a = new C2825l();

    /* renamed from: b */
    public AbstractC2436a f10522b = new C2825l();

    /* renamed from: c */
    public AbstractC2436a f10523c = new C2825l();

    /* renamed from: d */
    public AbstractC2436a f10524d = new C2825l();

    /* renamed from: e */
    public InterfaceC2815d f10525e = new C2809a(0.0f);

    /* renamed from: f */
    public InterfaceC2815d f10526f = new C2809a(0.0f);

    /* renamed from: g */
    public InterfaceC2815d f10527g = new C2809a(0.0f);

    /* renamed from: h */
    public InterfaceC2815d f10528h = new C2809a(0.0f);

    /* renamed from: i */
    public C2819f f10529i;

    /* renamed from: j */
    public C2819f f10530j;

    /* renamed from: k */
    public C2819f f10531k;

    /* renamed from: l */
    public C2819f f10532l;

    public C2828o() {
        int i = 0;
        this.f10529i = new C2819f(i);
        this.f10530j = new C2819f(i);
        this.f10531k = new C2819f(i);
        this.f10532l = new C2819f(i);
    }

    /* renamed from: f */
    public static C2827n m4952f(Context context, AttributeSet attributeSet, int i, int i4) {
        C2809a c2809a = new C2809a(0);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3758t, i, i4);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, resourceId);
        if (resourceId2 != 0) {
            contextThemeWrapper.getTheme().applyStyle(resourceId2, true);
        }
        return m4953g(contextThemeWrapper.obtainStyledAttributes(AbstractC0847a.f3732A), c2809a);
    }

    /* renamed from: g */
    public static C2827n m4953g(TypedArray typedArray, C2809a c2809a) {
        try {
            int i = typedArray.getInt(0, 0);
            int i4 = typedArray.getInt(3, i);
            int i8 = typedArray.getInt(4, i);
            int i9 = typedArray.getInt(2, i);
            int i10 = typedArray.getInt(1, i);
            InterfaceC2815d interfaceC2815dM4954h = m4954h(typedArray, 5, c2809a);
            InterfaceC2815d interfaceC2815dM4954h2 = m4954h(typedArray, 8, interfaceC2815dM4954h);
            InterfaceC2815d interfaceC2815dM4954h3 = m4954h(typedArray, 9, interfaceC2815dM4954h);
            InterfaceC2815d interfaceC2815dM4954h4 = m4954h(typedArray, 7, interfaceC2815dM4954h);
            InterfaceC2815d interfaceC2815dM4954h5 = m4954h(typedArray, 6, interfaceC2815dM4954h);
            C2827n c2827n = new C2827n();
            c2827n.f10509a = AbstractC2429w.m4299d(i4);
            c2827n.f10513e = interfaceC2815dM4954h2;
            c2827n.f10510b = AbstractC2429w.m4299d(i8);
            c2827n.f10514f = interfaceC2815dM4954h3;
            c2827n.f10511c = AbstractC2429w.m4299d(i9);
            c2827n.f10515g = interfaceC2815dM4954h4;
            c2827n.f10512d = AbstractC2429w.m4299d(i10);
            c2827n.f10516h = interfaceC2815dM4954h5;
            return c2827n;
        } finally {
            typedArray.recycle();
        }
    }

    /* renamed from: h */
    public static InterfaceC2815d m4954h(TypedArray typedArray, int i, InterfaceC2815d interfaceC2815d) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i);
        if (typedValuePeekValue != null) {
            int i4 = typedValuePeekValue.type;
            if (i4 == 5) {
                return new C2809a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics()));
            }
            if (i4 == 6) {
                return new C2824k(typedValuePeekValue.getFraction(1.0f, 1.0f));
            }
        }
        return interfaceC2815d;
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: a */
    public final C2828o mo4919a(float f8) {
        C2827n c2827nM4956j = m4956j();
        c2827nM4956j.getClass();
        c2827nM4956j.f10513e = new C2809a(f8);
        c2827nM4956j.f10514f = new C2809a(f8);
        c2827nM4956j.f10515g = new C2809a(f8);
        c2827nM4956j.f10516h = new C2809a(f8);
        return c2827nM4956j.m4951a();
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: b */
    public final C2828o mo4920b(int[] iArr) {
        return this;
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: c */
    public final C2828o mo4921c(C2824k c2824k) {
        C2827n c2827nM4956j = m4956j();
        c2827nM4956j.f10513e = c2824k;
        c2827nM4956j.f10514f = c2824k;
        c2827nM4956j.f10515g = c2824k;
        c2827nM4956j.f10516h = c2824k;
        return c2827nM4956j.m4951a();
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: d */
    public final C2828o mo4922d() {
        return this;
    }

    @Override // p211y5.InterfaceC2826m
    /* renamed from: e */
    public final boolean mo4923e() {
        return false;
    }

    /* renamed from: i */
    public final boolean m4955i(RectF rectF) {
        boolean z7 = this.f10532l.getClass().equals(C2819f.class) && this.f10530j.getClass().equals(C2819f.class) && this.f10529i.getClass().equals(C2819f.class) && this.f10531k.getClass().equals(C2819f.class);
        float fMo4909a = this.f10525e.mo4909a(rectF);
        return z7 && ((this.f10526f.mo4909a(rectF) > fMo4909a ? 1 : (this.f10526f.mo4909a(rectF) == fMo4909a ? 0 : -1)) == 0 && (this.f10528h.mo4909a(rectF) > fMo4909a ? 1 : (this.f10528h.mo4909a(rectF) == fMo4909a ? 0 : -1)) == 0 && (this.f10527g.mo4909a(rectF) > fMo4909a ? 1 : (this.f10527g.mo4909a(rectF) == fMo4909a ? 0 : -1)) == 0) && (this.f10522b instanceof C2825l) && (this.f10521a instanceof C2825l) && (this.f10523c instanceof C2825l) && (this.f10524d instanceof C2825l);
    }

    /* renamed from: j */
    public final C2827n m4956j() {
        C2827n c2827n = new C2827n();
        c2827n.f10509a = this.f10521a;
        c2827n.f10510b = this.f10522b;
        c2827n.f10511c = this.f10523c;
        c2827n.f10512d = this.f10524d;
        c2827n.f10513e = this.f10525e;
        c2827n.f10514f = this.f10526f;
        c2827n.f10515g = this.f10527g;
        c2827n.f10516h = this.f10528h;
        c2827n.f10517i = this.f10529i;
        c2827n.f10518j = this.f10530j;
        c2827n.f10519k = this.f10531k;
        c2827n.f10520l = this.f10532l;
        return c2827n;
    }

    public final String toString() {
        return "[" + this.f10525e + ", " + this.f10526f + ", " + this.f10527g + ", " + this.f10528h + "]";
    }
}
