package p104m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.support.v4.media.session.AbstractC0120b;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p002a1.AbstractC0008a1;
import p005a4.C0073c;
import p046f0.AbstractC0928a;
import p054g.AbstractC1026a;
import p105m0.AbstractC1828m0;
import p105m0.AbstractC1857w;
import p121o0.AbstractC2035a;
import p121o0.AbstractC2036b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.s0 */
/* loaded from: classes.dex */
public final class C1768s0 {

    /* renamed from: a */
    public final TextView f6732a;

    /* renamed from: b */
    public C1711d2 f6733b;

    /* renamed from: c */
    public C1711d2 f6734c;

    /* renamed from: d */
    public C1711d2 f6735d;

    /* renamed from: e */
    public C1711d2 f6736e;

    /* renamed from: f */
    public C1711d2 f6737f;

    /* renamed from: g */
    public C1711d2 f6738g;

    /* renamed from: h */
    public C1711d2 f6739h;

    /* renamed from: i */
    public final C1789z0 f6740i;

    /* renamed from: l */
    public Typeface f6743l;

    /* renamed from: n */
    public boolean f6745n;

    /* renamed from: j */
    public int f6741j = 0;

    /* renamed from: k */
    public int f6742k = -1;

    /* renamed from: m */
    public String f6744m = null;

    public C1768s0(TextView textView) {
        this.f6732a = textView;
        this.f6740i = new C1789z0(textView);
    }

    /* renamed from: d */
    public static void m3437d(TextView textView, Typeface typeface, int i) {
        int i4 = Build.VERSION.SDK_INT;
        String str = null;
        if (i4 >= 26) {
            String strM3432b = AbstractC1761q0.m3432b(textView);
            if (!TextUtils.isEmpty(strM3432b)) {
                AbstractC1761q0.m3435e(textView, null);
            }
            str = strM3432b;
        }
        textView.setTypeface(typeface, i);
        if (i4 < 26 || TextUtils.isEmpty(str)) {
            return;
        }
        AbstractC1761q0.m3435e(textView, str);
    }

    /* renamed from: e */
    public static C1711d2 m3438e(Context context, C1770t c1770t, int i) {
        ColorStateList colorStateListM3482f;
        synchronized (c1770t) {
            colorStateListM3482f = c1770t.f6749a.m3482f(context, i);
        }
        if (colorStateListM3482f == null) {
            return null;
        }
        C1711d2 c1711d2 = new C1711d2();
        c1711d2.f6529d = true;
        c1711d2.f6526a = colorStateListM3482f;
        return c1711d2;
    }

    /* renamed from: j */
    public static void m3439j(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC2035a.m3925a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC2035a.m3925a(editorInfo, text);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i8 = editorInfo.initialSelEnd;
        int i9 = i4 > i8 ? i8 : i4;
        if (i4 <= i8) {
            i4 = i8;
        }
        int length = text.length();
        if (i9 < 0 || i4 > length) {
            AbstractC2036b.m3928c(editorInfo, null, 0, 0);
            return;
        }
        int i10 = editorInfo.inputType & 4095;
        if (i10 == 129 || i10 == 225 || i10 == 18) {
            AbstractC2036b.m3928c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC2036b.m3928c(editorInfo, text, i9, i4);
            return;
        }
        int i11 = i4 - i9;
        int i12 = i11 > 1024 ? 0 : i11;
        int i13 = 2048 - i12;
        int iMin = Math.min(text.length() - i4, i13 - Math.min(i9, (int) (i13 * 0.8d)));
        int iMin2 = Math.min(i9, i13 - iMin);
        int i14 = i9 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i14))) {
            i14++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i4 + iMin) - 1))) {
            iMin--;
        }
        int i15 = iMin2 + i12;
        AbstractC2036b.m3928c(editorInfo, i12 != i11 ? TextUtils.concat(text.subSequence(i14, i14 + iMin2), text.subSequence(i4, iMin + i4)) : text.subSequence(i14, i15 + iMin + i14), iMin2, i15);
    }

    /* renamed from: a */
    public final void m3440a(Drawable drawable, C1711d2 c1711d2) {
        if (drawable == null || c1711d2 == null) {
            return;
        }
        C1770t.m3456e(drawable, c1711d2, this.f6732a.getDrawableState());
    }

    /* renamed from: b */
    public final void m3441b() {
        C1711d2 c1711d2 = this.f6733b;
        TextView textView = this.f6732a;
        if (c1711d2 != null || this.f6734c != null || this.f6735d != null || this.f6736e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m3440a(compoundDrawables[0], this.f6733b);
            m3440a(compoundDrawables[1], this.f6734c);
            m3440a(compoundDrawables[2], this.f6735d);
            m3440a(compoundDrawables[3], this.f6736e);
        }
        if (this.f6737f == null && this.f6738g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m3440a(compoundDrawablesRelative[0], this.f6737f);
        m3440a(compoundDrawablesRelative[2], this.f6738g);
    }

    /* renamed from: c */
    public final void m3442c(boolean z7) {
        Typeface typeface = this.f6743l;
        TextView textView = this.f6732a;
        if (typeface != null) {
            if (this.f6742k == -1) {
                textView.setTypeface(typeface, this.f6741j);
            } else {
                textView.setTypeface(typeface);
            }
        } else if (z7) {
            textView.setTypeface(null);
        }
        String str = this.f6744m;
        if (str == null || Build.VERSION.SDK_INT < 26) {
            return;
        }
        AbstractC1761q0.m3435e(textView, str);
    }

    /* renamed from: f */
    public final ColorStateList m3443f() {
        C1711d2 c1711d2 = this.f6739h;
        if (c1711d2 != null) {
            return c1711d2.f6526a;
        }
        return null;
    }

    /* renamed from: g */
    public final PorterDuff.Mode m3444g() {
        C1711d2 c1711d2 = this.f6739h;
        if (c1711d2 != null) {
            return c1711d2.f6527b;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3445h(AttributeSet attributeSet, int i) {
        boolean z7;
        boolean z8;
        String string;
        int i4;
        float dimensionPixelSize;
        int i8;
        ColorStateList colorStateList;
        int resourceId;
        int i9;
        int resourceId2;
        TextView textView = this.f6732a;
        Context context = textView.getContext();
        C1770t c1770tM3453a = C1770t.m3453a();
        int[] iArr = AbstractC1026a.f4315h;
        C0073c c0073cM263F = C0073c.m263F(i, 0, context, attributeSet, iArr);
        AbstractC1828m0.m3607l(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c0073cM263F.f325l, i);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f6733b = m3438e(context, c1770tM3453a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f6734c = m3438e(context, c1770tM3453a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f6735d = m3438e(context, c1770tM3453a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f6736e = m3438e(context, c1770tM3453a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f6737f = m3438e(context, c1770tM3453a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f6738g = m3438e(context, c1770tM3453a, typedArray.getResourceId(6, 0));
        }
        c0073cM263F.m275I();
        boolean z9 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC1026a.f4329v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0073c c0073c = new C0073c(context, typedArrayObtainStyledAttributes);
            if (z9 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z7 = false;
                z8 = false;
            } else {
                z8 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z7 = true;
            }
            m3452p(context, c0073c);
            string = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            c0073c.m275I();
        } else {
            z7 = false;
            z8 = false;
            string = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0073c c0073c2 = new C0073c(context, typedArrayObtainStyledAttributes2);
        if (!z9 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z8 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z7 = true;
        }
        boolean z10 = z8;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (Build.VERSION.SDK_INT >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m3452p(context, c0073c2);
        c0073c2.m275I();
        if (!z9 && z7) {
            textView.setAllCaps(z10);
        }
        m3442c(false);
        if (string != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(string));
        }
        C1789z0 c1789z0 = this.f6740i;
        Context context2 = c1789z0.f6833j;
        int[] iArr3 = AbstractC1026a.f4316i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c1789z0.f6832i;
        AbstractC1828m0.m3607l(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c1789z0.f6824a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr4[i10] = typedArrayObtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                c1789z0.f6829f = C1789z0.m3484b(iArr4);
                c1789z0.m3492i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c1789z0.m3493j()) {
            c1789z0.f6824a = 0;
        } else if (c1789z0.f6824a == 1) {
            if (!c1789z0.f6830g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i9 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i9 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i9, 112.0f, displayMetrics);
                }
                float f8 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c1789z0.m3494k(dimension2, f8, dimension);
            }
            c1789z0.m3491h();
        }
        if (AbstractC1763q2.f6717c && c1789z0.f6824a != 0) {
            int[] iArr5 = c1789z0.f6829f;
            if (iArr5.length > 0) {
                if (AbstractC1761q0.m3431a(textView) != -1.0f) {
                    AbstractC1761q0.m3433c(textView, Math.round(c1789z0.f6827d), Math.round(c1789z0.f6828e), Math.round(c1789z0.f6826c));
                } else {
                    AbstractC1761q0.m3434d(textView, iArr5);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM3457b = resourceId4 != -1 ? c1770tM3453a.m3457b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM3457b2 = resourceId5 != -1 ? c1770tM3453a.m3457b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM3457b3 = resourceId6 != -1 ? c1770tM3453a.m3457b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM3457b4 = resourceId7 != -1 ? c1770tM3453a.m3457b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM3457b5 = resourceId8 != -1 ? c1770tM3453a.m3457b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM3457b6 = resourceId9 != -1 ? c1770tM3453a.m3457b(context, resourceId9) : null;
        if (drawableM3457b5 != null || drawableM3457b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM3457b5 == null) {
                drawableM3457b5 = compoundDrawablesRelative[0];
            }
            if (drawableM3457b2 == null) {
                drawableM3457b2 = compoundDrawablesRelative[1];
            }
            if (drawableM3457b6 == null) {
                drawableM3457b6 = compoundDrawablesRelative[2];
            }
            if (drawableM3457b4 == null) {
                drawableM3457b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM3457b5, drawableM3457b2, drawableM3457b6, drawableM3457b4);
        } else if (drawableM3457b != null || drawableM3457b2 != null || drawableM3457b3 != null || drawableM3457b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM3457b == null) {
                    drawableM3457b = compoundDrawables[0];
                }
                if (drawableM3457b2 == null) {
                    drawableM3457b2 = compoundDrawables[1];
                }
                if (drawableM3457b3 == null) {
                    drawableM3457b3 = compoundDrawables[2];
                }
                if (drawableM3457b4 == null) {
                    drawableM3457b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM3457b, drawableM3457b2, drawableM3457b3, drawableM3457b4);
            } else {
                if (drawableM3457b2 == null) {
                    drawableM3457b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM3457b4 == null) {
                    drawableM3457b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM3457b2, compoundDrawablesRelative2[2], drawableM3457b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC0120b.m424t(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC1714e1.m3393b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue != null && typedValuePeekValue.type == 5) {
                int i11 = typedValuePeekValue.data;
                int i12 = i11 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i11);
                i8 = i12;
                i4 = -1;
                typedArrayObtainStyledAttributes4.recycle();
                if (dimensionPixelSize2 != i4) {
                    AbstractC0120b.m397H(textView, dimensionPixelSize2);
                }
                if (dimensionPixelSize3 != i4) {
                    AbstractC0120b.m398I(textView, dimensionPixelSize3);
                }
                if (dimensionPixelSize == -1.0f) {
                    if (i8 == i4) {
                        AbstractC0120b.m399J(textView, (int) dimensionPixelSize);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC1857w.m3642h(textView, i8, dimensionPixelSize);
                        return;
                    } else {
                        AbstractC0120b.m399J(textView, Math.round(TypedValue.applyDimension(i8, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i4 = -1;
            dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i4 = -1;
            dimensionPixelSize = -1.0f;
        }
        i8 = i4;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != i4) {
        }
        if (dimensionPixelSize3 != i4) {
        }
        if (dimensionPixelSize == -1.0f) {
        }
    }

    /* renamed from: i */
    public final void m3446i(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1026a.f4329v);
        C0073c c0073c = new C0073c(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f6732a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        boolean zM3452p = m3452p(context, c0073c);
        c0073c.m275I();
        m3442c(zM3452p);
    }

    /* renamed from: k */
    public final void m3447k(int i, int i4, int i8, int i9) {
        C1789z0 c1789z0 = this.f6740i;
        if (c1789z0.m3493j()) {
            DisplayMetrics displayMetrics = c1789z0.f6833j.getResources().getDisplayMetrics();
            c1789z0.m3494k(TypedValue.applyDimension(i9, i, displayMetrics), TypedValue.applyDimension(i9, i4, displayMetrics), TypedValue.applyDimension(i9, i8, displayMetrics));
            if (c1789z0.m3491h()) {
                c1789z0.m3487a();
            }
        }
    }

    /* renamed from: l */
    public final void m3448l(int[] iArr, int i) {
        C1789z0 c1789z0 = this.f6740i;
        if (c1789z0.m3493j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c1789z0.f6833j.getResources().getDisplayMetrics();
                    for (int i4 = 0; i4 < length; i4++) {
                        iArrCopyOf[i4] = Math.round(TypedValue.applyDimension(i, iArr[i4], displayMetrics));
                    }
                }
                c1789z0.f6829f = C1789z0.m3484b(iArrCopyOf);
                if (!c1789z0.m3492i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c1789z0.f6830g = false;
            }
            if (c1789z0.m3491h()) {
                c1789z0.m3487a();
            }
        }
    }

    /* renamed from: m */
    public final void m3449m(int i) {
        C1789z0 c1789z0 = this.f6740i;
        if (c1789z0.m3493j()) {
            if (i == 0) {
                c1789z0.f6824a = 0;
                c1789z0.f6827d = -1.0f;
                c1789z0.f6828e = -1.0f;
                c1789z0.f6826c = -1.0f;
                c1789z0.f6829f = new int[0];
                c1789z0.f6825b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c1789z0.f6833j.getResources().getDisplayMetrics();
            c1789z0.m3494k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c1789z0.m3491h()) {
                c1789z0.m3487a();
            }
        }
    }

    /* renamed from: n */
    public final void m3450n(ColorStateList colorStateList) {
        if (this.f6739h == null) {
            this.f6739h = new C1711d2();
        }
        C1711d2 c1711d2 = this.f6739h;
        c1711d2.f6526a = colorStateList;
        c1711d2.f6529d = colorStateList != null;
        this.f6733b = c1711d2;
        this.f6734c = c1711d2;
        this.f6735d = c1711d2;
        this.f6736e = c1711d2;
        this.f6737f = c1711d2;
        this.f6738g = c1711d2;
    }

    /* renamed from: o */
    public final void m3451o(PorterDuff.Mode mode) {
        if (this.f6739h == null) {
            this.f6739h = new C1711d2();
        }
        C1711d2 c1711d2 = this.f6739h;
        c1711d2.f6527b = mode;
        c1711d2.f6528c = mode != null;
        this.f6733b = c1711d2;
        this.f6734c = c1711d2;
        this.f6735d = c1711d2;
        this.f6736e = c1711d2;
        this.f6737f = c1711d2;
        this.f6738g = c1711d2;
    }

    /* renamed from: p */
    public final boolean m3452p(Context context, C0073c c0073c) {
        String string;
        int i;
        Typeface typeface;
        int i4 = this.f6741j;
        TypedArray typedArray = (TypedArray) c0073c.f325l;
        this.f6741j = typedArray.getInt(2, i4);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.f6742k = i9;
            if (i9 != -1) {
                this.f6741j &= 2;
            }
        }
        if (i8 >= 26 && typedArray.hasValue(13)) {
            this.f6744m = typedArray.getString(13);
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.f6743l = null;
            int i10 = typedArray.hasValue(12) ? 12 : 10;
            int i11 = this.f6742k;
            int i12 = this.f6741j;
            if (!context.isRestricted()) {
                try {
                    Typeface typefaceM301z = c0073c.m301z(i10, this.f6741j, new C1753o0(this, i11, i12, new WeakReference(this.f6732a)));
                    if (typefaceM301z != null) {
                        if (i8 < 28 || this.f6742k == -1) {
                            this.f6743l = typefaceM301z;
                        } else {
                            this.f6743l = AbstractC0928a.m2086a(Typeface.create(typefaceM301z, 0), this.f6742k, (this.f6741j & 2) != 0);
                        }
                    }
                    this.f6745n = this.f6743l == null;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.f6743l == null && (string = typedArray.getString(i10)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.f6742k == -1) {
                    this.f6743l = Typeface.create(string, this.f6741j);
                } else {
                    this.f6743l = AbstractC0928a.m2086a(Typeface.create(string, 0), this.f6742k, (this.f6741j & 2) != 0);
                }
            }
        } else {
            if (!typedArray.hasValue(1)) {
                if (i8 < 28 || (i = this.f6742k) == -1 || (typeface = this.f6743l) == null) {
                    return false;
                }
                this.f6743l = AbstractC0928a.m2086a(typeface, i, (this.f6741j & 2) != 0);
                return true;
            }
            this.f6745n = false;
            int i13 = typedArray.getInt(1, 1);
            if (i13 == 1) {
                this.f6743l = Typeface.SANS_SERIF;
                return true;
            }
            if (i13 == 2) {
                this.f6743l = Typeface.SERIF;
                return true;
            }
            if (i13 == 3) {
                this.f6743l = Typeface.MONOSPACE;
                return true;
            }
        }
        return true;
    }
}
