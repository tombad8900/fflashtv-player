package p037e0;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import p029d0.C0789e;
import p029d0.C0790f;
import p079j0.C1482j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e0.j */
/* loaded from: classes.dex */
public final class C0859j extends AbstractC0715d {
    /* renamed from: s0 */
    public static Font m2038s0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iM2040u0 = m2040u0(fontStyle, font.getStyle());
        for (int i4 = 1; i4 < fontFamily.getSize(); i4++) {
            Font font2 = fontFamily.getFont(i4);
            int iM2040u02 = m2040u0(fontStyle, font2.getStyle());
            if (iM2040u02 < iM2040u0) {
                font = font2;
                iM2040u0 = iM2040u02;
            }
        }
        return font;
    }

    /* renamed from: t0 */
    public static FontFamily m2039t0(C1482j[] c1482jArr, ContentResolver contentResolver) throws IOException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        FontFamily.Builder builder = null;
        for (C1482j c1482j : c1482jArr) {
            try {
                parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(c1482j.f5709a, "r", null);
            } catch (IOException e) {
                Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            }
            if (parcelFileDescriptorOpenFileDescriptor == null) {
                if (parcelFileDescriptorOpenFileDescriptor != null) {
                }
            } else {
                try {
                    Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(c1482j.f5711c).setSlant(c1482j.f5712d ? 1 : 0).setTtcIndex(c1482j.f5710b).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            parcelFileDescriptorOpenFileDescriptor.close();
        }
        if (builder == null) {
            return null;
        }
        return builder.build();
    }

    /* renamed from: u0 */
    public static int m2040u0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: r */
    public final Typeface mo1604r(Context context, C0789e c0789e, Resources resources, int i) throws IOException {
        try {
            FontFamily.Builder builder = null;
            for (C0790f c0790f : c0789e.f3551a) {
                try {
                    Font fontBuild = new Font.Builder(resources, c0790f.f3557f).setWeight(c0790f.f3553b).setSlant(c0790f.f3554c ? 1 : 0).setTtcIndex(c0790f.f3556e).setFontVariationSettings(c0790f.f3555d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface.CustomFallbackBuilder(fontFamilyBuild).setStyle(m2038s0(fontFamilyBuild, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: s */
    public final Typeface mo1605s(Context context, C1482j[] c1482jArr, int i) {
        try {
            FontFamily fontFamilyM2039t0 = m2039t0(c1482jArr, context.getContentResolver());
            if (fontFamilyM2039t0 == null) {
                return null;
            }
            return new Typeface.CustomFallbackBuilder(fontFamilyM2039t0).setStyle(m2038s0(fontFamilyM2039t0, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: t */
    public final Typeface mo1606t(Context context, List list, int i) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily fontFamilyM2039t0 = m2039t0((C1482j[]) list.get(0), contentResolver);
            if (fontFamilyM2039t0 == null) {
                return null;
            }
            Typeface.CustomFallbackBuilder customFallbackBuilder = new Typeface.CustomFallbackBuilder(fontFamilyM2039t0);
            for (int i4 = 1; i4 < list.size(); i4++) {
                FontFamily fontFamilyM2039t02 = m2039t0((C1482j[]) list.get(i4), contentResolver);
                if (fontFamilyM2039t02 != null) {
                    customFallbackBuilder.addCustomFallback(fontFamilyM2039t02);
                }
            }
            return customFallbackBuilder.setStyle(m2038s0(fontFamilyM2039t0, i).getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: u */
    public final Typeface mo1607u(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: v */
    public final Typeface mo1608v(Context context, Resources resources, int i, String str, int i4) throws IOException {
        try {
            Font fontBuild = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception e) {
            Log.w("TypefaceCompatApi29Impl", "Font load failed", e);
            return null;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: x */
    public final C1482j mo1609x(C1482j[] c1482jArr, int i) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
