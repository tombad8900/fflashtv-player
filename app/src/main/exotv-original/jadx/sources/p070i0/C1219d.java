package p070i0;

import android.os.LocaleList;
import java.util.Locale;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i0.d */
/* loaded from: classes.dex */
public final class C1219d {

    /* renamed from: b */
    public static final C1219d f5101b = new C1219d(new C1220e(new LocaleList(new Locale[0])));

    /* renamed from: a */
    public final C1220e f5102a;

    public C1219d(C1220e c1220e) {
        this.f5102a = c1220e;
    }

    /* renamed from: a */
    public static C1219d m2669a(String str) {
        if (str == null || str.isEmpty()) {
            return f5101b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i4 = AbstractC1218c.f5100a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return new C1219d(new C1220e(new LocaleList(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1219d) {
            return this.f5102a.equals(((C1219d) obj).f5102a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5102a.f5103a.hashCode();
    }

    public final String toString() {
        return this.f5102a.f5103a.toString();
    }
}
