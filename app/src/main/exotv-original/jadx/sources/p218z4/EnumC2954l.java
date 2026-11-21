package p218z4;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.l */
/* loaded from: classes.dex */
public final class EnumC2954l {

    /* renamed from: j */
    public static final EnumC2954l f11015j;

    /* renamed from: k */
    public static final EnumC2954l f11016k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC2954l[] f11017l;

    static {
        EnumC2954l enumC2954l = new EnumC2954l("RATE_LIMITED", 0);
        f11015j = enumC2954l;
        EnumC2954l enumC2954l2 = new EnumC2954l("NOT_FOUND", 1);
        f11016k = enumC2954l2;
        EnumC2954l[] enumC2954lArr = {enumC2954l, enumC2954l2};
        f11017l = enumC2954lArr;
        AbstractC0120b.m421q(enumC2954lArr);
    }

    public static EnumC2954l valueOf(String str) {
        return (EnumC2954l) Enum.valueOf(EnumC2954l.class, str);
    }

    public static EnumC2954l[] values() {
        return (EnumC2954l[]) f11017l.clone();
    }
}
