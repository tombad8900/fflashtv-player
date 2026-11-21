package p040e3;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import p005a4.C0094o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.i */
/* loaded from: classes.dex */
public final class C0871i extends AbstractC0874l {

    /* renamed from: d */
    public C0094o f3819d;

    /* renamed from: e */
    public float f3820e;

    /* renamed from: f */
    public C0094o f3821f;

    /* renamed from: g */
    public float f3822g;

    /* renamed from: h */
    public float f3823h;

    /* renamed from: i */
    public float f3824i;

    /* renamed from: j */
    public float f3825j;

    /* renamed from: k */
    public float f3826k;

    /* renamed from: l */
    public Paint.Cap f3827l;

    /* renamed from: m */
    public Paint.Join f3828m;

    /* renamed from: n */
    public float f3829n;

    @Override // p040e3.AbstractC0873k
    /* renamed from: a */
    public final boolean mo2042a() {
        return this.f3821f.m349e() || this.f3819d.m349e();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    @Override // p040e3.AbstractC0873k
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2043b(int[] iArr) {
        boolean z7;
        C0094o c0094o = this.f3821f;
        boolean z8 = true;
        if (c0094o.m349e()) {
            ColorStateList colorStateList = (ColorStateList) c0094o.f442l;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0094o.f440j) {
                c0094o.f440j = colorForState;
                z7 = true;
            } else {
                z7 = false;
            }
        }
        C0094o c0094o2 = this.f3819d;
        if (c0094o2.m349e()) {
            ColorStateList colorStateList2 = (ColorStateList) c0094o2.f442l;
            int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
            if (colorForState2 != c0094o2.f440j) {
                c0094o2.f440j = colorForState2;
            } else {
                z8 = false;
            }
        }
        return z7 | z8;
    }

    public float getFillAlpha() {
        return this.f3823h;
    }

    public int getFillColor() {
        return this.f3821f.f440j;
    }

    public float getStrokeAlpha() {
        return this.f3822g;
    }

    public int getStrokeColor() {
        return this.f3819d.f440j;
    }

    public float getStrokeWidth() {
        return this.f3820e;
    }

    public float getTrimPathEnd() {
        return this.f3825j;
    }

    public float getTrimPathOffset() {
        return this.f3826k;
    }

    public float getTrimPathStart() {
        return this.f3824i;
    }

    public void setFillAlpha(float f8) {
        this.f3823h = f8;
    }

    public void setFillColor(int i) {
        this.f3821f.f440j = i;
    }

    public void setStrokeAlpha(float f8) {
        this.f3822g = f8;
    }

    public void setStrokeColor(int i) {
        this.f3819d.f440j = i;
    }

    public void setStrokeWidth(float f8) {
        this.f3820e = f8;
    }

    public void setTrimPathEnd(float f8) {
        this.f3825j = f8;
    }

    public void setTrimPathOffset(float f8) {
        this.f3826k = f8;
    }

    public void setTrimPathStart(float f8) {
        this.f3824i = f8;
    }
}
