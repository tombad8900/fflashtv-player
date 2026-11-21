package p204x4;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.m */
/* loaded from: classes.dex */
public final class EnumC2770m {

    /* renamed from: j */
    public static final EnumC2770m f10247j;

    /* renamed from: k */
    public static final EnumC2770m f10248k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC2770m[] f10249l;

    static {
        EnumC2770m enumC2770m = new EnumC2770m("MOVIE", 0);
        f10247j = enumC2770m;
        EnumC2770m enumC2770m2 = new EnumC2770m("SERIES", 1);
        f10248k = enumC2770m2;
        EnumC2770m[] enumC2770mArr = {enumC2770m, enumC2770m2};
        f10249l = enumC2770mArr;
        AbstractC0120b.m421q(enumC2770mArr);
    }

    public static EnumC2770m valueOf(String str) {
        return (EnumC2770m) Enum.valueOf(EnumC2770m.class, str);
    }

    public static EnumC2770m[] values() {
        return (EnumC2770m[]) f10249l.clone();
    }
}
