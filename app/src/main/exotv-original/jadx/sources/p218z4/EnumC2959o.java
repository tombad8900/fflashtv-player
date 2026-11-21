package p218z4;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.o */
/* loaded from: classes.dex */
public final class EnumC2959o {

    /* renamed from: k */
    public static final EnumC2959o f11031k;

    /* renamed from: l */
    public static final EnumC2959o f11032l;

    /* renamed from: m */
    public static final /* synthetic */ EnumC2959o[] f11033m;

    /* renamed from: j */
    public final String f11034j;

    static {
        EnumC2959o enumC2959o = new EnumC2959o("VIDSRC", 0, "vidsrc");
        f11031k = enumC2959o;
        EnumC2959o enumC2959o2 = new EnumC2959o("VIDCORE", 1, "vidcore");
        f11032l = enumC2959o2;
        EnumC2959o[] enumC2959oArr = {enumC2959o, enumC2959o2};
        f11033m = enumC2959oArr;
        AbstractC0120b.m421q(enumC2959oArr);
    }

    public EnumC2959o(String str, int i, String str2) {
        this.f11034j = str2;
    }

    public static EnumC2959o valueOf(String str) {
        return (EnumC2959o) Enum.valueOf(EnumC2959o.class, str);
    }

    public static EnumC2959o[] values() {
        return (EnumC2959o[]) f11033m.clone();
    }
}
