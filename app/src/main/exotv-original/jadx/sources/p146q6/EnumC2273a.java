package p146q6;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q6.a */
/* loaded from: classes.dex */
public final class EnumC2273a {

    /* renamed from: j */
    public static final EnumC2273a f7953j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC2273a[] f7954k;

    static {
        EnumC2273a enumC2273a = new EnumC2273a("COROUTINE_SUSPENDED", 0);
        f7953j = enumC2273a;
        EnumC2273a[] enumC2273aArr = {enumC2273a, new EnumC2273a("UNDECIDED", 1), new EnumC2273a("RESUMED", 2)};
        f7954k = enumC2273aArr;
        AbstractC0120b.m421q(enumC2273aArr);
    }

    public static EnumC2273a valueOf(String str) {
        return (EnumC2273a) Enum.valueOf(EnumC2273a.class, str);
    }

    public static EnumC2273a[] values() {
        return (EnumC2273a[]) f7954k.clone();
    }
}
