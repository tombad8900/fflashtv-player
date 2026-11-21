package p123o2;

import android.graphics.Color;
import com.bumptech.glide.AbstractC0715d;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o2.e */
/* loaded from: classes.dex */
public final class C2046e {

    /* renamed from: a */
    public final String f7554a;

    /* renamed from: b */
    public final int f7555b;

    /* renamed from: c */
    public final Integer f7556c;

    /* renamed from: d */
    public final Integer f7557d;

    /* renamed from: e */
    public final float f7558e;

    /* renamed from: f */
    public final boolean f7559f;

    /* renamed from: g */
    public final boolean f7560g;

    /* renamed from: h */
    public final boolean f7561h;

    /* renamed from: i */
    public final boolean f7562i;

    /* renamed from: j */
    public final int f7563j;

    public C2046e(String str, int i, Integer num, Integer num2, float f8, boolean z7, boolean z8, boolean z9, boolean z10, int i4) {
        this.f7554a = str;
        this.f7555b = i;
        this.f7556c = num;
        this.f7557d = num2;
        this.f7558e = f8;
        this.f7559f = z7;
        this.f7560g = z8;
        this.f7561h = z9;
        this.f7562i = z10;
        this.f7563j = i4;
    }

    /* renamed from: a */
    public static int m3937a(String str) {
        boolean z7;
        try {
            int i = Integer.parseInt(str.trim());
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z7 = true;
                    break;
                default:
                    z7 = false;
                    break;
            }
            if (z7) {
                return i;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC0008a1.m24t("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    /* renamed from: b */
    public static boolean m3938b(String str) throws NumberFormatException {
        try {
            int i = Integer.parseInt(str);
            return i == 1 || i == -1;
        } catch (NumberFormatException e) {
            AbstractC1101a.m2349G("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    /* renamed from: c */
    public static Integer m3939c(String str) {
        try {
            long j = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC1101a.m2353d(j <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC0715d.m1566m(((j >> 24) & 255) ^ 255), AbstractC0715d.m1566m(j & 255), AbstractC0715d.m1566m((j >> 8) & 255), AbstractC0715d.m1566m((j >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            AbstractC1101a.m2349G("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}
