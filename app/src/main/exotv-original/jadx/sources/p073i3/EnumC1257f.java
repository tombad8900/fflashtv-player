package p073i3;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i3.f */
/* loaded from: classes.dex */
public final class EnumC1257f {

    /* renamed from: j */
    public static final EnumC1257f f5251j;

    /* renamed from: k */
    public static final EnumC1257f f5252k;

    /* renamed from: l */
    public static final EnumC1257f f5253l;

    /* renamed from: m */
    public static final EnumC1257f f5254m;

    /* renamed from: n */
    public static final /* synthetic */ EnumC1257f[] f5255n;

    static {
        EnumC1257f enumC1257f = new EnumC1257f("MEMORY_CACHE", 0);
        f5251j = enumC1257f;
        EnumC1257f enumC1257f2 = new EnumC1257f("MEMORY", 1);
        f5252k = enumC1257f2;
        EnumC1257f enumC1257f3 = new EnumC1257f("DISK", 2);
        f5253l = enumC1257f3;
        EnumC1257f enumC1257f4 = new EnumC1257f("NETWORK", 3);
        f5254m = enumC1257f4;
        EnumC1257f[] enumC1257fArr = {enumC1257f, enumC1257f2, enumC1257f3, enumC1257f4};
        f5255n = enumC1257fArr;
        AbstractC0120b.m421q(enumC1257fArr);
    }

    public static EnumC1257f valueOf(String str) {
        return (EnumC1257f) Enum.valueOf(EnumC1257f.class, str);
    }

    public static EnumC1257f[] values() {
        return (EnumC1257f[]) f5255n.clone();
    }
}
