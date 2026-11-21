package p073i3;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i3.k */
/* loaded from: classes.dex */
public final class EnumC1262k {

    /* renamed from: j */
    public static final EnumC1262k f5264j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC1262k[] f5265k;

    static {
        EnumC1262k enumC1262k = new EnumC1262k("IGNORE", 0);
        EnumC1262k enumC1262k2 = new EnumC1262k("RESPECT_PERFORMANCE", 1);
        f5264j = enumC1262k2;
        EnumC1262k[] enumC1262kArr = {enumC1262k, enumC1262k2, new EnumC1262k("RESPECT_ALL", 2)};
        f5265k = enumC1262kArr;
        AbstractC0120b.m421q(enumC1262kArr);
    }

    public static EnumC1262k valueOf(String str) {
        return (EnumC1262k) Enum.valueOf(EnumC1262k.class, str);
    }

    public static EnumC1262k[] values() {
        return (EnumC1262k[]) f5265k.clone();
    }
}
