package p187v5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import p001a0.AbstractC0005a;
import p029d0.AbstractC0795k;
import p034d5.AbstractC0847a;
import p054g.AbstractC1026a;
import p168t2.AbstractC2415i0;
import p168t2.AbstractC2429w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v5.d */
/* loaded from: classes.dex */
public final class C2552d {

    /* renamed from: a */
    public final ColorStateList f9251a;

    /* renamed from: b */
    public final String f9252b;

    /* renamed from: c */
    public String f9253c;

    /* renamed from: d */
    public final int f9254d;

    /* renamed from: e */
    public final int f9255e;

    /* renamed from: f */
    public final float f9256f;

    /* renamed from: g */
    public final float f9257g;

    /* renamed from: h */
    public final float f9258h;

    /* renamed from: i */
    public final boolean f9259i;

    /* renamed from: j */
    public final float f9260j;

    /* renamed from: k */
    public final ColorStateList f9261k;

    /* renamed from: l */
    public float f9262l;

    /* renamed from: m */
    public final int f9263m;

    /* renamed from: n */
    public boolean f9264n = false;

    /* renamed from: o */
    public boolean f9265o = false;

    /* renamed from: p */
    public Typeface f9266p;

    public C2552d(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1026a.f4329v);
        this.f9262l = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f9261k = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 3);
        AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 4);
        AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 5);
        this.f9254d = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f9255e = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i4 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f9263m = typedArrayObtainStyledAttributes.getResourceId(i4, 0);
        this.f9252b = typedArrayObtainStyledAttributes.getString(i4);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f9251a = AbstractC2429w.m4301f(context, typedArrayObtainStyledAttributes, 6);
        this.f9256f = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f9257g = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f9258h = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, AbstractC0847a.f3760v);
        this.f9259i = typedArrayObtainStyledAttributes2.hasValue(0);
        this.f9260j = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        if (Build.VERSION.SDK_INT >= 26) {
            this.f9253c = typedArrayObtainStyledAttributes2.getString(typedArrayObtainStyledAttributes2.hasValue(3) ? 3 : 1);
        }
        typedArrayObtainStyledAttributes2.recycle();
    }

    /* renamed from: a */
    public final void m4563a() {
        String str;
        Typeface typeface = this.f9266p;
        int i = this.f9254d;
        if (typeface == null && (str = this.f9252b) != null) {
            this.f9266p = Typeface.create(str, i);
        }
        if (this.f9266p == null) {
            int i4 = this.f9255e;
            if (i4 == 1) {
                this.f9266p = Typeface.SANS_SERIF;
            } else if (i4 == 2) {
                this.f9266p = Typeface.SERIF;
            } else if (i4 != 3) {
                this.f9266p = Typeface.DEFAULT;
            } else {
                this.f9266p = Typeface.MONOSPACE;
            }
            this.f9266p = Typeface.create(this.f9266p, i);
        }
    }

    /* renamed from: b */
    public final void m4564b(Context context, AbstractC2415i0 abstractC2415i0) {
        if (!m4565c(context)) {
            m4563a();
        }
        int i = this.f9263m;
        if (i == 0) {
            this.f9264n = true;
        }
        if (this.f9264n) {
            abstractC2415i0.mo3676w(this.f9266p, true);
            return;
        }
        try {
            C2550b c2550b = new C2550b(this, abstractC2415i0);
            ThreadLocal threadLocal = AbstractC0795k.f3568a;
            if (context.isRestricted()) {
                c2550b.m1941a(-4);
            } else {
                AbstractC0795k.m1947a(context, i, new TypedValue(), 0, c2550b, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f9264n = true;
            abstractC2415i0.mo3675v(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f9252b, e);
            this.f9264n = true;
            abstractC2415i0.mo3675v(-3);
        }
    }

    /* renamed from: c */
    public final boolean m4565c(Context context) {
        Context context2;
        Typeface typefaceM1947a;
        String string;
        Typeface typefaceCreate;
        if (this.f9264n) {
            return true;
        }
        int i = this.f9263m;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC0795k.f3568a;
            Typeface typefaceCreate2 = null;
            if (context.isRestricted()) {
                context2 = context;
                typefaceM1947a = null;
            } else {
                context2 = context;
                typefaceM1947a = AbstractC0795k.m1947a(context2, i, new TypedValue(), 0, null, false, true);
            }
            if (typefaceM1947a != null) {
                this.f9266p = typefaceM1947a;
                this.f9264n = true;
                return true;
            }
            if (!this.f9265o) {
                this.f9265o = true;
                Resources resources = context2.getResources();
                int i4 = this.f9263m;
                if (i4 == 0 || !resources.getResourceTypeName(i4).equals("font")) {
                    string = null;
                    if (string != null && (typefaceCreate = Typeface.create(string, 0)) != Typeface.DEFAULT) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f9254d);
                    }
                } else {
                    try {
                        XmlResourceParser xml = resources.getXml(i4);
                        while (xml.getEventType() != 1) {
                            if (xml.getEventType() == 2 && xml.getName().equals("font-family")) {
                                TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xml), AbstractC0005a.f7b);
                                string = typedArrayObtainAttributes.getString(7);
                                typedArrayObtainAttributes.recycle();
                                break;
                            }
                            xml.next();
                        }
                    } catch (Throwable unused) {
                    }
                    string = null;
                    if (string != null) {
                        typefaceCreate2 = Typeface.create(typefaceCreate, this.f9254d);
                    }
                }
            }
            if (typefaceCreate2 != null) {
                this.f9266p = typefaceCreate2;
                this.f9264n = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final void m4566d(Context context, TextPaint textPaint, AbstractC2415i0 abstractC2415i0) {
        m4567e(context, textPaint, abstractC2415i0);
        ColorStateList colorStateList = this.f9261k;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f9251a;
        textPaint.setShadowLayer(this.f9258h, this.f9256f, this.f9257g, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    /* renamed from: e */
    public final void m4567e(Context context, TextPaint textPaint, AbstractC2415i0 abstractC2415i0) {
        Typeface typeface;
        if (m4565c(context) && this.f9264n && (typeface = this.f9266p) != null) {
            m4568f(context, textPaint, typeface);
            return;
        }
        m4563a();
        m4568f(context, textPaint, this.f9266p);
        m4564b(context, new C2551c(this, context, textPaint, abstractC2415i0));
    }

    /* renamed from: f */
    public final void m4568f(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceM4569a = AbstractC2553e.m4569a(context.getResources().getConfiguration(), typeface);
        if (typefaceM4569a != null) {
            typeface = typefaceM4569a;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f9254d;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f9262l);
        if (Build.VERSION.SDK_INT >= 26) {
            textPaint.setFontVariationSettings(null);
            textPaint.setFontVariationSettings(this.f9253c);
        }
        if (this.f9259i) {
            textPaint.setLetterSpacing(this.f9260j);
        }
    }
}
