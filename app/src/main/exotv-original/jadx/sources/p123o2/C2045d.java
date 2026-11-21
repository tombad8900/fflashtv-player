package p123o2;

import android.graphics.PointF;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o2.d */
/* loaded from: classes.dex */
public final class C2045d {

    /* renamed from: a */
    public static final Pattern f7550a = Pattern.compile("\\{([^}]*)\\}");

    /* renamed from: b */
    public static final Pattern f7551b;

    /* renamed from: c */
    public static final Pattern f7552c;

    /* renamed from: d */
    public static final Pattern f7553d;

    static {
        int i = AbstractC1118i0.f4750a;
        Locale locale = Locale.US;
        f7551b = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f7552c = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
        f7553d = Pattern.compile("\\\\an(\\d+)");
    }

    /* renamed from: a */
    public static PointF m3936a(String str) throws NumberFormatException {
        String strGroup;
        String strGroup2;
        Matcher matcher = f7551b.matcher(str);
        Matcher matcher2 = f7552c.matcher(str);
        boolean zFind = matcher.find();
        boolean zFind2 = matcher2.find();
        if (zFind) {
            if (zFind2) {
                AbstractC1101a.m2371v("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
            }
            strGroup = matcher.group(1);
            strGroup2 = matcher.group(2);
        } else {
            if (!zFind2) {
                return null;
            }
            strGroup = matcher2.group(1);
            strGroup2 = matcher2.group(2);
        }
        strGroup.getClass();
        float f8 = Float.parseFloat(strGroup.trim());
        strGroup2.getClass();
        return new PointF(f8, Float.parseFloat(strGroup2.trim()));
    }
}
