package p195w4;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.q */
/* loaded from: classes.dex */
public final class EnumC2683q {

    /* renamed from: j */
    public static final EnumC2683q f9746j;

    /* renamed from: k */
    public static final EnumC2683q f9747k;

    /* renamed from: l */
    public static final EnumC2683q f9748l;

    /* renamed from: m */
    public static final EnumC2683q f9749m;

    /* renamed from: n */
    public static final /* synthetic */ EnumC2683q[] f9750n;

    static {
        EnumC2683q enumC2683q = new EnumC2683q("LIVE", 0);
        f9746j = enumC2683q;
        EnumC2683q enumC2683q2 = new EnumC2683q("MOVIES", 1);
        f9747k = enumC2683q2;
        EnumC2683q enumC2683q3 = new EnumC2683q("SERIES", 2);
        f9748l = enumC2683q3;
        EnumC2683q enumC2683q4 = new EnumC2683q("SEARCH", 3);
        f9749m = enumC2683q4;
        EnumC2683q[] enumC2683qArr = {enumC2683q, enumC2683q2, enumC2683q3, enumC2683q4};
        f9750n = enumC2683qArr;
        AbstractC0120b.m421q(enumC2683qArr);
    }

    public static EnumC2683q valueOf(String str) {
        return (EnumC2683q) Enum.valueOf(EnumC2683q.class, str);
    }

    public static EnumC2683q[] values() {
        return (EnumC2683q[]) f9750n.clone();
    }
}
