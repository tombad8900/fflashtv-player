package p195w4;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.p */
/* loaded from: classes.dex */
public final class EnumC2681p {

    /* renamed from: j */
    public static final EnumC2681p f9737j;

    /* renamed from: k */
    public static final EnumC2681p f9738k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC2681p[] f9739l;

    static {
        EnumC2681p enumC2681p = new EnumC2681p("FEATURED", 0);
        f9737j = enumC2681p;
        EnumC2681p enumC2681p2 = new EnumC2681p("ROW", 1);
        f9738k = enumC2681p2;
        EnumC2681p[] enumC2681pArr = {enumC2681p, enumC2681p2};
        f9739l = enumC2681pArr;
        AbstractC0120b.m421q(enumC2681pArr);
    }

    public static EnumC2681p valueOf(String str) {
        return (EnumC2681p) Enum.valueOf(EnumC2681p.class, str);
    }

    public static EnumC2681p[] values() {
        return (EnumC2681p[]) f9739l.clone();
    }
}
