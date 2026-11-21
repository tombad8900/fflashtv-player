package p029d0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.support.v4.media.session.AbstractC0120b;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.exotv.net.R;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p001a0.AbstractC0005a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0787c {

    /* renamed from: a */
    public static final ThreadLocal f3550a = new ThreadLocal();

    /* renamed from: a */
    public static ColorStateList m1944a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m1945b(resources, xmlResourceParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0092  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m1945b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        int[] iArr;
        int i;
        int iM1934d;
        float f8;
        int i4;
        float fCbrt;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlPullParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z7 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i8 = 0;
        int i9 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == z7 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                int[] iArr4 = AbstractC0005a.f6a;
                ?? ObtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i8, i8);
                int resourceId = ObtainAttributes.getResourceId(i8, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f3550a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z7);
                    int i10 = typedValue.type;
                    if (i10 < 28 || i10 > 31) {
                        try {
                            color = m1944a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = ObtainAttributes.getColor(i8, -65281);
                        }
                    } else {
                        color = ObtainAttributes.getColor(i8, -65281);
                    }
                    float f9 = ObtainAttributes.hasValue(z7) ? ObtainAttributes.getFloat(z7, 1.0f) : ObtainAttributes.hasValue(3) ? ObtainAttributes.getFloat(3, 1.0f) : 1.0f;
                    char c8 = z7;
                    float f10 = (Build.VERSION.SDK_INT < 31 || !ObtainAttributes.hasValue(2)) ? ObtainAttributes.getFloat(4, -1.0f) : ObtainAttributes.getFloat(2, -1.0f);
                    ObtainAttributes.recycle();
                    int attributeCount = attributeSet2.getAttributeCount();
                    int[] iArr5 = new int[attributeCount];
                    int i11 = i8;
                    int i12 = i11;
                    while (i11 < attributeCount) {
                        int attributeNameResource = attributeSet2.getAttributeNameResource(i11);
                        if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                            int i13 = i12 + 1;
                            if (!attributeSet2.getAttributeBooleanValue(i11, false)) {
                                attributeNameResource = -attributeNameResource;
                            }
                            iArr5[i12] = attributeNameResource;
                            i12 = i13;
                        }
                        i11++;
                    }
                    int[] iArrTrimStateSet = StateSet.trimStateSet(iArr5, i12);
                    float f11 = 100.0f;
                    char c9 = (f10 < 0.0f || f10 > 100.0f) ? (char) 0 : c8;
                    if (f9 == 1.0f && c9 == 0) {
                        iArr = iArrTrimStateSet;
                        i = depth2;
                    } else {
                        int iM415k = AbstractC0120b.m415k((int) ((Color.alpha(color) * f9) + 0.5f), 0, 255);
                        if (c9 != 0) {
                            C0785a c0785aM1929a = C0785a.m1929a(color);
                            float f12 = c0785aM1929a.f3537a;
                            float f13 = c0785aM1929a.f3538b;
                            C0796l c0796l = C0796l.f3571k;
                            if (f13 < 1.0d || Math.round(f10) <= 0.0d || Math.round(f10) >= 100.0d) {
                                iArr = iArrTrimStateSet;
                                i = depth2;
                                iM1934d = AbstractC0786b.m1934d(f10);
                            } else {
                                float fMin = f12 < 0.0f ? 0.0f : Math.min(360.0f, f12);
                                float f14 = 0.0f;
                                float f15 = f13;
                                char c10 = c8;
                                C0785a c0785a = null;
                                while (true) {
                                    if (Math.abs(f14 - f13) >= 0.4f) {
                                        float f16 = 1000.0f;
                                        float f17 = f11;
                                        float f18 = 0.0f;
                                        float f19 = 1000.0f;
                                        C0785a c0785a2 = null;
                                        while (true) {
                                            if (Math.abs(f18 - f17) <= 0.01f) {
                                                iArr = iArrTrimStateSet;
                                                i = depth2;
                                                f8 = f11;
                                                break;
                                            }
                                            f8 = f11;
                                            float f20 = ((f17 - f18) / 2.0f) + f18;
                                            iArr = iArrTrimStateSet;
                                            int iM1931c = C0785a.m1930b(f20, f15, fMin).m1931c(C0796l.f3571k);
                                            float fM1935e = AbstractC0786b.m1935e(Color.red(iM1931c));
                                            float fM1935e2 = AbstractC0786b.m1935e(Color.green(iM1931c));
                                            float fM1935e3 = AbstractC0786b.m1935e(Color.blue(iM1931c));
                                            float[] fArr = AbstractC0786b.f3546d[c8];
                                            float f21 = ((fM1935e3 * fArr[2]) + ((fM1935e2 * fArr[c8]) + (fM1935e * fArr[0]))) / f8;
                                            if (f21 <= 0.008856452f) {
                                                fCbrt = f21 * 903.2963f;
                                                i4 = iM1931c;
                                            } else {
                                                i4 = iM1931c;
                                                fCbrt = (((float) Math.cbrt(f21)) * 116.0f) - 16.0f;
                                            }
                                            float fAbs = Math.abs(f10 - fCbrt);
                                            if (fAbs < 0.2f) {
                                                C0785a c0785aM1929a2 = C0785a.m1929a(i4);
                                                C0785a c0785aM1930b = C0785a.m1930b(c0785aM1929a2.f3539c, c0785aM1929a2.f3538b, fMin);
                                                float f22 = c0785aM1929a2.f3540d - c0785aM1930b.f3540d;
                                                float f23 = c0785aM1929a2.f3541e - c0785aM1930b.f3541e;
                                                float f24 = c0785aM1929a2.f3542f - c0785aM1930b.f3542f;
                                                i = depth2;
                                                float fPow = (float) (Math.pow(Math.sqrt((f24 * f24) + (f23 * f23) + (f22 * f22)), 0.63d) * 1.41d);
                                                if (fPow <= 1.0f) {
                                                    f19 = fPow;
                                                    f16 = fAbs;
                                                    c0785a2 = c0785aM1929a2;
                                                }
                                            } else {
                                                i = depth2;
                                            }
                                            if (f16 == 0.0f && f19 == 0.0f) {
                                                break;
                                            }
                                            if (fCbrt < f10) {
                                                f18 = f20;
                                            } else {
                                                f17 = f20;
                                            }
                                            f11 = f8;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i;
                                        }
                                        C0785a c0785a3 = c0785a2;
                                        if (c10 == 0) {
                                            if (c0785a3 == null) {
                                                f13 = f15;
                                            } else {
                                                c0785a = c0785a3;
                                                f14 = f15;
                                            }
                                            f15 = ((f13 - f14) / 2.0f) + f14;
                                            f11 = f8;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i;
                                        } else {
                                            if (c0785a3 != null) {
                                                iM1934d = c0785a3.m1931c(c0796l);
                                                break;
                                            }
                                            f15 = ((f13 - f14) / 2.0f) + f14;
                                            f11 = f8;
                                            iArrTrimStateSet = iArr;
                                            depth2 = i;
                                            c10 = 0;
                                        }
                                    } else {
                                        iArr = iArrTrimStateSet;
                                        i = depth2;
                                        iM1934d = c0785a == null ? AbstractC0786b.m1934d(f10) : c0785a.m1931c(c0796l);
                                    }
                                }
                            }
                            color = iM1934d;
                        } else {
                            iArr = iArrTrimStateSet;
                            i = depth2;
                        }
                        color = (16777215 & color) | (iM415k << 24);
                    }
                    int i14 = i9 + 1;
                    if (i14 > iArr3.length) {
                        int[] iArr6 = new int[i9 <= 4 ? 8 : i9 * 2];
                        System.arraycopy(iArr3, 0, iArr6, 0, i9);
                        iArr3 = iArr6;
                    }
                    iArr3[i9] = color;
                    if (i14 > iArr2.length) {
                        ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i9 > 4 ? i9 * 2 : 8);
                        System.arraycopy(iArr2, 0, r1, 0, i9);
                        iArr2 = r1;
                    }
                    iArr2[i9] = iArr;
                    iArr2 = iArr2;
                    attributeSet2 = attributeSet;
                    theme2 = theme;
                    i9 = i14;
                    z7 = c8;
                    depth2 = i;
                    i8 = 0;
                    r02 = resources;
                }
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z7 = z7;
                depth2 = depth2;
                i8 = 0;
            }
        }
        int[] iArr7 = new int[i9];
        int[][] iArr8 = new int[i9][];
        System.arraycopy(iArr3, 0, iArr7, 0, i9);
        System.arraycopy(iArr2, 0, iArr8, 0, i9);
        return new ColorStateList(iArr8, iArr7);
    }
}
