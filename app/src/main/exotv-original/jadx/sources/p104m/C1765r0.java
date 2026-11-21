package p104m;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;
import java.util.Objects;
import p096l0.InterfaceC1641a;
import p130p.C2191j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.r0 */
/* loaded from: classes.dex */
public final class C1765r0 {

    /* renamed from: a */
    public final TextView f6722a;

    /* renamed from: b */
    public final InterfaceC1641a f6723b;

    /* renamed from: c */
    public Typeface f6724c;

    /* renamed from: d */
    public Typeface f6725d;

    /* renamed from: e */
    public String f6726e;

    public C1765r0(TextView textView, InterfaceC1641a interfaceC1641a) {
        this.f6722a = textView;
        this.f6723b = interfaceC1641a;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ed  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3436a(String str) {
        int i;
        String fontVariationSettings;
        boolean z7;
        FontVariationAxis[] fontVariationAxisArrFromFontVariationSettings;
        Typeface typeface = this.f6724c;
        TextView textView = this.f6722a;
        TextPaint paint = textView.getPaint();
        if (this.f6725d != paint.getTypeface()) {
            Log.w("FontVarSettings", "getPaint().getTypeface() changed unexpectedly. App code should not modify the result of getPaint().");
            typeface = paint.getTypeface();
        }
        if (Build.VERSION.SDK_INT < 31 || (i = textView.getContext().getResources().getConfiguration().fontWeightAdjustment) == Integer.MAX_VALUE) {
            i = 0;
        }
        if (i == Integer.MAX_VALUE) {
            i = 0;
        }
        C1757p0 c1757p0 = new C1757p0(typeface, str, i);
        C2191j c2191j = AbstractC1761q0.f6712a;
        Typeface typeface2 = (Typeface) c2191j.m3979g(c1757p0);
        if (typeface2 != null) {
            z7 = true;
        } else {
            Paint paint2 = AbstractC1761q0.f6713b;
            if (paint2 == null) {
                paint2 = new Paint();
                AbstractC1761q0.f6713b = paint2;
            }
            if (i != 0) {
                if (TextUtils.isEmpty(str)) {
                    fontVariationAxisArrFromFontVariationSettings = new FontVariationAxis[0];
                } else {
                    fontVariationAxisArrFromFontVariationSettings = FontVariationAxis.fromFontVariationSettings(str);
                    if (fontVariationAxisArrFromFontVariationSettings == null) {
                        fontVariationSettings = str;
                        z7 = true;
                    }
                    if (Objects.equals(paint2.getFontVariationSettings(), fontVariationSettings)) {
                        paint2.setFontVariationSettings(null);
                    }
                    paint2.setTypeface(typeface);
                    if (paint2.setFontVariationSettings(fontVariationSettings)) {
                        typeface2 = null;
                    } else {
                        typeface2 = paint2.getTypeface();
                        c2191j.m3983k(c1757p0, typeface2);
                    }
                }
                int i4 = 0;
                boolean z8 = false;
                while (true) {
                    if (i4 >= fontVariationAxisArrFromFontVariationSettings.length) {
                        break;
                    }
                    FontVariationAxis fontVariationAxis = fontVariationAxisArrFromFontVariationSettings[i4];
                    if ("wght".equals(fontVariationAxis.getTag())) {
                        float styleValue = fontVariationAxis.getStyleValue() + i;
                        fontVariationAxisArrFromFontVariationSettings[i4] = new FontVariationAxis("wght", styleValue >= 1.0f ? Math.min(styleValue, 1000.0f) : 1.0f);
                        z8 = true;
                    }
                    i4++;
                }
                z7 = true;
                if (!z8) {
                    FontVariationAxis[] fontVariationAxisArr = new FontVariationAxis[fontVariationAxisArrFromFontVariationSettings.length + 1];
                    System.arraycopy(fontVariationAxisArrFromFontVariationSettings, 0, fontVariationAxisArr, 0, fontVariationAxisArrFromFontVariationSettings.length);
                    float f8 = i + 400;
                    fontVariationAxisArr[fontVariationAxisArrFromFontVariationSettings.length] = new FontVariationAxis("wght", f8 >= 1.0f ? Math.min(f8, 1000.0f) : 1.0f);
                    fontVariationAxisArrFromFontVariationSettings = fontVariationAxisArr;
                }
                fontVariationSettings = FontVariationAxis.toFontVariationSettings(fontVariationAxisArrFromFontVariationSettings);
                if (Objects.equals(paint2.getFontVariationSettings(), fontVariationSettings)) {
                }
                paint2.setTypeface(typeface);
                if (paint2.setFontVariationSettings(fontVariationSettings)) {
                }
            }
        }
        if (typeface2 == null) {
            return false;
        }
        this.f6725d = typeface2;
        this.f6723b.accept(typeface2);
        this.f6726e = str;
        return z7;
    }
}
