package p040e3;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.j */
/* loaded from: classes.dex */
public final class C0872j extends AbstractC0873k {

    /* renamed from: a */
    public final Matrix f3830a;

    /* renamed from: b */
    public final ArrayList f3831b;

    /* renamed from: c */
    public float f3832c;

    /* renamed from: d */
    public float f3833d;

    /* renamed from: e */
    public float f3834e;

    /* renamed from: f */
    public float f3835f;

    /* renamed from: g */
    public float f3836g;

    /* renamed from: h */
    public float f3837h;

    /* renamed from: i */
    public float f3838i;

    /* renamed from: j */
    public final Matrix f3839j;

    /* renamed from: k */
    public String f3840k;

    public C0872j() {
        this.f3830a = new Matrix();
        this.f3831b = new ArrayList();
        this.f3832c = 0.0f;
        this.f3833d = 0.0f;
        this.f3834e = 0.0f;
        this.f3835f = 1.0f;
        this.f3836g = 1.0f;
        this.f3837h = 0.0f;
        this.f3838i = 0.0f;
        this.f3839j = new Matrix();
        this.f3840k = null;
    }

    @Override // p040e3.AbstractC0873k
    /* renamed from: a */
    public final boolean mo2042a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f3831b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC0873k) arrayList.get(i)).mo2042a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p040e3.AbstractC0873k
    /* renamed from: b */
    public final boolean mo2043b(int[] iArr) {
        int i = 0;
        boolean zMo2043b = false;
        while (true) {
            ArrayList arrayList = this.f3831b;
            if (i >= arrayList.size()) {
                return zMo2043b;
            }
            zMo2043b |= ((AbstractC0873k) arrayList.get(i)).mo2043b(iArr);
            i++;
        }
    }

    /* renamed from: c */
    public final void m2044c() {
        Matrix matrix = this.f3839j;
        matrix.reset();
        matrix.postTranslate(-this.f3833d, -this.f3834e);
        matrix.postScale(this.f3835f, this.f3836g);
        matrix.postRotate(this.f3832c, 0.0f, 0.0f);
        matrix.postTranslate(this.f3837h + this.f3833d, this.f3838i + this.f3834e);
    }

    public String getGroupName() {
        return this.f3840k;
    }

    public Matrix getLocalMatrix() {
        return this.f3839j;
    }

    public float getPivotX() {
        return this.f3833d;
    }

    public float getPivotY() {
        return this.f3834e;
    }

    public float getRotation() {
        return this.f3832c;
    }

    public float getScaleX() {
        return this.f3835f;
    }

    public float getScaleY() {
        return this.f3836g;
    }

    public float getTranslateX() {
        return this.f3837h;
    }

    public float getTranslateY() {
        return this.f3838i;
    }

    public void setPivotX(float f8) {
        if (f8 != this.f3833d) {
            this.f3833d = f8;
            m2044c();
        }
    }

    public void setPivotY(float f8) {
        if (f8 != this.f3834e) {
            this.f3834e = f8;
            m2044c();
        }
    }

    public void setRotation(float f8) {
        if (f8 != this.f3832c) {
            this.f3832c = f8;
            m2044c();
        }
    }

    public void setScaleX(float f8) {
        if (f8 != this.f3835f) {
            this.f3835f = f8;
            m2044c();
        }
    }

    public void setScaleY(float f8) {
        if (f8 != this.f3836g) {
            this.f3836g = f8;
            m2044c();
        }
    }

    public void setTranslateX(float f8) {
        if (f8 != this.f3837h) {
            this.f3837h = f8;
            m2044c();
        }
    }

    public void setTranslateY(float f8) {
        if (f8 != this.f3838i) {
            this.f3838i = f8;
            m2044c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0872j(C0872j c0872j, C2186e c2186e) {
        C0870h c0870h;
        this.f3830a = new Matrix();
        this.f3831b = new ArrayList();
        this.f3832c = 0.0f;
        this.f3833d = 0.0f;
        this.f3834e = 0.0f;
        this.f3835f = 1.0f;
        this.f3836g = 1.0f;
        this.f3837h = 0.0f;
        this.f3838i = 0.0f;
        Matrix matrix = new Matrix();
        this.f3839j = matrix;
        this.f3840k = null;
        this.f3832c = c0872j.f3832c;
        this.f3833d = c0872j.f3833d;
        this.f3834e = c0872j.f3834e;
        this.f3835f = c0872j.f3835f;
        this.f3836g = c0872j.f3836g;
        this.f3837h = c0872j.f3837h;
        this.f3838i = c0872j.f3838i;
        String str = c0872j.f3840k;
        this.f3840k = str;
        if (str != null) {
            c2186e.put(str, this);
        }
        matrix.set(c0872j.f3839j);
        ArrayList arrayList = c0872j.f3831b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C0872j) {
                this.f3831b.add(new C0872j((C0872j) obj, c2186e));
            } else {
                if (obj instanceof C0871i) {
                    C0871i c0871i = (C0871i) obj;
                    C0871i c0871i2 = new C0871i(c0871i);
                    c0871i2.f3820e = 0.0f;
                    c0871i2.f3822g = 1.0f;
                    c0871i2.f3823h = 1.0f;
                    c0871i2.f3824i = 0.0f;
                    c0871i2.f3825j = 1.0f;
                    c0871i2.f3826k = 0.0f;
                    c0871i2.f3827l = Paint.Cap.BUTT;
                    c0871i2.f3828m = Paint.Join.MITER;
                    c0871i2.f3829n = 4.0f;
                    c0871i2.f3819d = c0871i.f3819d;
                    c0871i2.f3820e = c0871i.f3820e;
                    c0871i2.f3822g = c0871i.f3822g;
                    c0871i2.f3821f = c0871i.f3821f;
                    c0871i2.f3843c = c0871i.f3843c;
                    c0871i2.f3823h = c0871i.f3823h;
                    c0871i2.f3824i = c0871i.f3824i;
                    c0871i2.f3825j = c0871i.f3825j;
                    c0871i2.f3826k = c0871i.f3826k;
                    c0871i2.f3827l = c0871i.f3827l;
                    c0871i2.f3828m = c0871i.f3828m;
                    c0871i2.f3829n = c0871i.f3829n;
                    c0870h = c0871i2;
                } else if (obj instanceof C0870h) {
                    c0870h = new C0870h((C0870h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f3831b.add(c0870h);
                Object obj2 = c0870h.f3842b;
                if (obj2 != null) {
                    c2186e.put(obj2, c0870h);
                }
            }
        }
    }
}
