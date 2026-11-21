package p159s2;

import androidx.media3.common.C0247v0;
import java.nio.charset.StandardCharsets;
import java.util.regex.Pattern;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s2.i */
/* loaded from: classes.dex */
public abstract class AbstractC2349i {

    /* renamed from: a */
    public static final Pattern f8259a = Pattern.compile("^NOTE([ \t].*)?$");

    /* renamed from: a */
    public static boolean m4185a(C1132w c1132w) {
        c1132w.getClass();
        String strM2522h = c1132w.m2522h(StandardCharsets.UTF_8);
        return strM2522h != null && strM2522h.startsWith("WEBVTT");
    }

    /* renamed from: b */
    public static float m4186b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    /* renamed from: c */
    public static long m4187c(String str) {
        int i = AbstractC1118i0.f4750a;
        String[] strArrSplit = str.split("\\.", 2);
        long j = 0;
        for (String str2 : strArrSplit[0].split(":", -1)) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j8 = j * 1000;
        if (strArrSplit.length == 2) {
            j8 += Long.parseLong(strArrSplit[1]);
        }
        return j8 * 1000;
    }

    /* renamed from: d */
    public static void m4188d(C1132w c1132w) {
        int i = c1132w.f4800b;
        if (m4185a(c1132w)) {
            return;
        }
        c1132w.m2513G(i);
        throw C0247v0.createForMalformedContainer("Expected WEBVTT. Got " + c1132w.m2522h(StandardCharsets.UTF_8), null);
    }
}
