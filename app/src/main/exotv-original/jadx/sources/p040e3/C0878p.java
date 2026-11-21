package p040e3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p029d0.AbstractC0786b;
import p029d0.AbstractC0787c;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.p */
/* loaded from: classes.dex */
public final class C0878p extends AbstractC0869g {

    /* renamed from: s */
    public static final PorterDuff.Mode f3873s = PorterDuff.Mode.SRC_IN;

    /* renamed from: k */
    public C0876n f3874k;

    /* renamed from: l */
    public PorterDuffColorFilter f3875l;

    /* renamed from: m */
    public ColorFilter f3876m;

    /* renamed from: n */
    public boolean f3877n;

    /* renamed from: o */
    public boolean f3878o;

    /* renamed from: p */
    public final float[] f3879p;

    /* renamed from: q */
    public final Matrix f3880q;

    /* renamed from: r */
    public final Rect f3881r;

    public C0878p() {
        this.f3878o = true;
        this.f3879p = new float[9];
        this.f3880q = new Matrix();
        this.f3881r = new Rect();
        C0876n c0876n = new C0876n();
        c0876n.f3862c = null;
        c0876n.f3863d = f3873s;
        c0876n.f3861b = new C0875m();
        this.f3874k = c0876n;
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m2046a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3818j;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f3881r;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3876m;
        if (colorFilter == null) {
            colorFilter = this.f3875l;
        }
        Matrix matrix = this.f3880q;
        canvas.getMatrix(matrix);
        float[] fArr = this.f3879p;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, (int) (rect.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C0876n c0876n = this.f3874k;
        Bitmap bitmap = c0876n.f3865f;
        if (bitmap == null || iMin != bitmap.getWidth() || iMin2 != c0876n.f3865f.getHeight()) {
            c0876n.f3865f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            c0876n.f3870k = true;
        }
        if (this.f3878o) {
            C0876n c0876n2 = this.f3874k;
            if (c0876n2.f3870k || c0876n2.f3866g != c0876n2.f3862c || c0876n2.f3867h != c0876n2.f3863d || c0876n2.f3869j != c0876n2.f3864e || c0876n2.f3868i != c0876n2.f3861b.getRootAlpha()) {
                C0876n c0876n3 = this.f3874k;
                c0876n3.f3865f.eraseColor(0);
                Canvas canvas2 = new Canvas(c0876n3.f3865f);
                C0875m c0875m = c0876n3.f3861b;
                c0875m.m2045a(c0875m.f3851g, C0875m.f3844p, canvas2, iMin, iMin2);
                C0876n c0876n4 = this.f3874k;
                c0876n4.f3866g = c0876n4.f3862c;
                c0876n4.f3867h = c0876n4.f3863d;
                c0876n4.f3868i = c0876n4.f3861b.getRootAlpha();
                c0876n4.f3869j = c0876n4.f3864e;
                c0876n4.f3870k = false;
            }
        } else {
            C0876n c0876n5 = this.f3874k;
            c0876n5.f3865f.eraseColor(0);
            Canvas canvas3 = new Canvas(c0876n5.f3865f);
            C0875m c0875m2 = c0876n5.f3861b;
            c0875m2.m2045a(c0875m2.f3851g, C0875m.f3844p, canvas3, iMin, iMin2);
        }
        C0876n c0876n6 = this.f3874k;
        if (c0876n6.f3861b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c0876n6.f3871l == null) {
                Paint paint2 = new Paint();
                c0876n6.f3871l = paint2;
                paint2.setFilterBitmap(true);
            }
            c0876n6.f3871l.setAlpha(c0876n6.f3861b.getRootAlpha());
            c0876n6.f3871l.setColorFilter(colorFilter);
            paint = c0876n6.f3871l;
        }
        canvas.drawBitmap(c0876n6.f3865f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getAlpha() : this.f3874k.f3861b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3874k.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getColorFilter() : this.f3876m;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3818j != null) {
            return new C0877o(this.f3818j.getConstantState());
        }
        this.f3874k.f3860a = getChangingConfigurations();
        return this.f3874k;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3874k.f3861b.f3853i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3874k.f3861b.f3852h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.isAutoMirrored() : this.f3874k.f3864e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        C0876n c0876n = this.f3874k;
        if (c0876n == null) {
            return false;
        }
        C0875m c0875m = c0876n.f3861b;
        if (c0875m.f3858n == null) {
            c0875m.f3858n = Boolean.valueOf(c0875m.f3851g.mo2042a());
        }
        if (c0875m.f3858n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f3874k.f3862c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3877n && super.mutate() == this) {
            C0876n c0876n = this.f3874k;
            C0876n c0876n2 = new C0876n();
            c0876n2.f3862c = null;
            c0876n2.f3863d = f3873s;
            if (c0876n != null) {
                c0876n2.f3860a = c0876n.f3860a;
                C0875m c0875m = new C0875m(c0876n.f3861b);
                c0876n2.f3861b = c0875m;
                if (c0876n.f3861b.f3849e != null) {
                    c0875m.f3849e = new Paint(c0876n.f3861b.f3849e);
                }
                if (c0876n.f3861b.f3848d != null) {
                    c0876n2.f3861b.f3848d = new Paint(c0876n.f3861b.f3848d);
                }
                c0876n2.f3862c = c0876n.f3862c;
                c0876n2.f3863d = c0876n.f3863d;
                c0876n2.f3864e = c0876n.f3864e;
            }
            this.f3874k = c0876n2;
            this.f3877n = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z7;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C0876n c0876n = this.f3874k;
        ColorStateList colorStateList = c0876n.f3862c;
        if (colorStateList == null || (mode = c0876n.f3863d) == null) {
            z7 = false;
        } else {
            this.f3875l = m2046a(colorStateList, mode);
            invalidateSelf();
            z7 = true;
        }
        C0875m c0875m = c0876n.f3861b;
        if (c0875m.f3858n == null) {
            c0875m.f3858n = Boolean.valueOf(c0875m.f3851g.mo2042a());
        }
        if (c0875m.f3858n.booleanValue()) {
            boolean zMo2043b = c0876n.f3861b.f3851g.mo2043b(iArr);
            c0876n.f3870k |= zMo2043b;
            if (zMo2043b) {
                invalidateSelf();
                return true;
            }
        }
        return z7;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f3874k.f3861b.getRootAlpha() != i) {
            this.f3874k.f3861b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setAutoMirrored(z7);
        } else {
            this.f3874k.f3864e = z7;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3876m = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            AbstractC0715d.m1564k0(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        C0876n c0876n = this.f3874k;
        if (c0876n.f3862c != colorStateList) {
            c0876n.f3862c = colorStateList;
            this.f3875l = m2046a(colorStateList, c0876n.f3863d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        C0876n c0876n = this.f3874k;
        if (c0876n.f3863d != mode) {
            c0876n.f3863d = mode;
            this.f3875l = m2046a(c0876n.f3862c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.setVisible(z7, z8) : super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i;
        char c8;
        int i4;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C0876n c0876n = this.f3874k;
        c0876n.f3861b = new C0875m();
        TypedArray typedArrayM1936f = AbstractC0786b.m1936f(resources, theme, attributeSet, AbstractC0863a.f3799a);
        C0876n c0876n2 = this.f3874k;
        C0875m c0875m = c0876n2.f3861b;
        int i8 = !AbstractC0786b.m1933c(xmlPullParser, "tintMode") ? -1 : typedArrayM1936f.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i8 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i8 != 5) {
            if (i8 != 9) {
                switch (i8) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c0876n2.f3863d = mode;
        ColorStateList colorStateListM1944a = null;
        int i9 = 1;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            typedArrayM1936f.getValue(1, typedValue);
            int i10 = typedValue.type;
            if (i10 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i10 >= 28 && i10 <= 31) {
                colorStateListM1944a = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = typedArrayM1936f.getResources();
                int resourceId = typedArrayM1936f.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0787c.f3550a;
                try {
                    colorStateListM1944a = AbstractC0787c.m1944a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e);
                }
            }
        }
        ColorStateList colorStateList = colorStateListM1944a;
        if (colorStateList != null) {
            c0876n2.f3862c = colorStateList;
        }
        boolean z7 = c0876n2.f3864e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z7 = typedArrayM1936f.getBoolean(5, z7);
        }
        c0876n2.f3864e = z7;
        float f8 = c0875m.f3854j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f8 = typedArrayM1936f.getFloat(7, f8);
        }
        c0875m.f3854j = f8;
        float f9 = c0875m.f3855k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f9 = typedArrayM1936f.getFloat(8, f9);
        }
        c0875m.f3855k = f9;
        if (c0875m.f3854j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM1936f.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f9 > 0.0f) {
            c0875m.f3852h = typedArrayM1936f.getDimension(3, c0875m.f3852h);
            float dimension = typedArrayM1936f.getDimension(2, c0875m.f3853i);
            c0875m.f3853i = dimension;
            if (c0875m.f3852h <= 0.0f) {
                throw new XmlPullParserException(typedArrayM1936f.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c0875m.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = typedArrayM1936f.getFloat(4, alpha);
                }
                c0875m.setAlpha(alpha);
                String string = typedArrayM1936f.getString(0);
                if (string != null) {
                    c0875m.f3857m = string;
                    c0875m.f3859o.put(string, c0875m);
                }
                typedArrayM1936f.recycle();
                c0876n.f3860a = getChangingConfigurations();
                c0876n.f3870k = true;
                C0876n c0876n3 = this.f3874k;
                C0875m c0875m2 = c0876n3.f3861b;
                ArrayDeque arrayDeque = new ArrayDeque();
                C0872j c0872j = c0875m2.f3851g;
                C2186e c2186e = c0875m2.f3859o;
                arrayDeque.push(c0872j);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z8 = true;
                while (eventType != i9 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C0872j c0872j2 = (C0872j) arrayDeque.peek();
                        i = depth;
                        if ("path".equals(name)) {
                            C0871i c0871i = new C0871i();
                            c0871i.f3820e = 0.0f;
                            c0871i.f3822g = 1.0f;
                            c0871i.f3823h = 1.0f;
                            c0871i.f3824i = 0.0f;
                            c0871i.f3825j = 1.0f;
                            c0871i.f3826k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c0871i.f3827l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            c0871i.f3828m = join2;
                            c0871i.f3829n = 4.0f;
                            TypedArray typedArrayM1936f2 = AbstractC0786b.m1936f(resources, theme, attributeSet, AbstractC0863a.f3801c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = typedArrayM1936f2.getString(0);
                                if (string2 != null) {
                                    c0871i.f3842b = string2;
                                }
                                String string3 = typedArrayM1936f2.getString(2);
                                if (string3 != null) {
                                    c0871i.f3841a = AbstractC0714c.m1540z(string3);
                                }
                                c0871i.f3821f = AbstractC0786b.m1932b(typedArrayM1936f2, xmlPullParser, theme, "fillColor", 1);
                                float f10 = c0871i.f3823h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f10 = typedArrayM1936f2.getFloat(12, f10);
                                }
                                c0871i.f3823h = f10;
                                int i11 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? typedArrayM1936f2.getInt(8, -1) : -1;
                                Paint.Cap cap3 = c0871i.f3827l;
                                if (i11 == 0) {
                                    cap = cap2;
                                } else if (i11 != 1) {
                                    cap = i11 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                c0871i.f3827l = cap;
                                int i12 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? typedArrayM1936f2.getInt(9, -1) : -1;
                                Paint.Join join3 = c0871i.f3828m;
                                if (i12 == 0) {
                                    join = join2;
                                } else if (i12 != 1) {
                                    join = i12 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                c0871i.f3828m = join;
                                float f11 = c0871i.f3829n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f11 = typedArrayM1936f2.getFloat(10, f11);
                                }
                                c0871i.f3829n = f11;
                                c0871i.f3819d = AbstractC0786b.m1932b(typedArrayM1936f2, xmlPullParser, theme, "strokeColor", 3);
                                float f12 = c0871i.f3822g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f12 = typedArrayM1936f2.getFloat(11, f12);
                                }
                                c0871i.f3822g = f12;
                                float f13 = c0871i.f3820e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f13 = typedArrayM1936f2.getFloat(4, f13);
                                }
                                c0871i.f3820e = f13;
                                float f14 = c0871i.f3825j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f14 = typedArrayM1936f2.getFloat(6, f14);
                                }
                                c0871i.f3825j = f14;
                                float f15 = c0871i.f3826k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f15 = typedArrayM1936f2.getFloat(7, f15);
                                }
                                c0871i.f3826k = f15;
                                float f16 = c0871i.f3824i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f16 = typedArrayM1936f2.getFloat(5, f16);
                                }
                                c0871i.f3824i = f16;
                                int i13 = c0871i.f3843c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i13 = typedArrayM1936f2.getInt(13, i13);
                                }
                                c0871i.f3843c = i13;
                            }
                            typedArrayM1936f2.recycle();
                            c0872j2.f3831b.add(c0871i);
                            if (c0871i.getPathName() != null) {
                                c2186e.put(c0871i.getPathName(), c0871i);
                            }
                            c0876n3.f3860a = c0876n3.f3860a;
                            z8 = false;
                            c8 = '\b';
                        } else {
                            c8 = '\b';
                            if ("clip-path".equals(name)) {
                                C0870h c0870h = new C0870h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray typedArrayM1936f3 = AbstractC0786b.m1936f(resources, theme, attributeSet, AbstractC0863a.f3802d);
                                    String string4 = typedArrayM1936f3.getString(0);
                                    if (string4 != null) {
                                        c0870h.f3842b = string4;
                                    }
                                    String string5 = typedArrayM1936f3.getString(1);
                                    if (string5 != null) {
                                        c0870h.f3841a = AbstractC0714c.m1540z(string5);
                                    }
                                    c0870h.f3843c = !AbstractC0786b.m1933c(xmlPullParser, "fillType") ? 0 : typedArrayM1936f3.getInt(2, 0);
                                    typedArrayM1936f3.recycle();
                                }
                                c0872j2.f3831b.add(c0870h);
                                if (c0870h.getPathName() != null) {
                                    c2186e.put(c0870h.getPathName(), c0870h);
                                }
                                c0876n3.f3860a = c0876n3.f3860a;
                            } else if ("group".equals(name)) {
                                C0872j c0872j3 = new C0872j();
                                TypedArray typedArrayM1936f4 = AbstractC0786b.m1936f(resources, theme, attributeSet, AbstractC0863a.f3800b);
                                float f17 = c0872j3.f3832c;
                                if (AbstractC0786b.m1933c(xmlPullParser, "rotation")) {
                                    f17 = typedArrayM1936f4.getFloat(5, f17);
                                }
                                c0872j3.f3832c = f17;
                                c0872j3.f3833d = typedArrayM1936f4.getFloat(1, c0872j3.f3833d);
                                c0872j3.f3834e = typedArrayM1936f4.getFloat(2, c0872j3.f3834e);
                                float f18 = c0872j3.f3835f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f18 = typedArrayM1936f4.getFloat(3, f18);
                                }
                                c0872j3.f3835f = f18;
                                float f19 = c0872j3.f3836g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f19 = typedArrayM1936f4.getFloat(4, f19);
                                }
                                c0872j3.f3836g = f19;
                                float f20 = c0872j3.f3837h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f20 = typedArrayM1936f4.getFloat(6, f20);
                                }
                                c0872j3.f3837h = f20;
                                float f21 = c0872j3.f3838i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f21 = typedArrayM1936f4.getFloat(7, f21);
                                }
                                c0872j3.f3838i = f21;
                                String string6 = typedArrayM1936f4.getString(0);
                                if (string6 != null) {
                                    c0872j3.f3840k = string6;
                                }
                                c0872j3.m2044c();
                                typedArrayM1936f4.recycle();
                                c0872j2.f3831b.add(c0872j3);
                                arrayDeque.push(c0872j3);
                                if (c0872j3.getGroupName() != null) {
                                    c2186e.put(c0872j3.getGroupName(), c0872j3);
                                }
                                c0876n3.f3860a = c0876n3.f3860a;
                            }
                        }
                        i4 = 1;
                    } else {
                        i = depth;
                        c8 = '\b';
                        i4 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i9 = i4;
                    depth = i;
                }
                if (!z8) {
                    this.f3875l = m2046a(c0876n.f3862c, c0876n.f3863d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(typedArrayM1936f.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(typedArrayM1936f.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C0878p(C0876n c0876n) {
        this.f3878o = true;
        this.f3879p = new float[9];
        this.f3880q = new Matrix();
        this.f3881r = new Rect();
        this.f3874k = c0876n;
        this.f3875l = m2046a(c0876n.f3862c, c0876n.f3863d);
    }
}
