package com.bumptech.glide;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: com.bumptech.glide.f */
/* loaded from: classes.dex */
public final class EnumC0717f {

    /* renamed from: j */
    public static final EnumC0717f f2811j;

    /* renamed from: k */
    public static final EnumC0717f f2812k;

    /* renamed from: l */
    public static final EnumC0717f f2813l;

    /* renamed from: m */
    public static final EnumC0717f f2814m;

    /* renamed from: n */
    public static final /* synthetic */ EnumC0717f[] f2815n;

    static {
        EnumC0717f enumC0717f = new EnumC0717f("IMMEDIATE", 0);
        f2811j = enumC0717f;
        EnumC0717f enumC0717f2 = new EnumC0717f("HIGH", 1);
        f2812k = enumC0717f2;
        EnumC0717f enumC0717f3 = new EnumC0717f("NORMAL", 2);
        f2813l = enumC0717f3;
        EnumC0717f enumC0717f4 = new EnumC0717f("LOW", 3);
        f2814m = enumC0717f4;
        f2815n = new EnumC0717f[]{enumC0717f, enumC0717f2, enumC0717f3, enumC0717f4};
    }

    public static EnumC0717f valueOf(String str) {
        return (EnumC0717f) Enum.valueOf(EnumC0717f.class, str);
    }

    public static EnumC0717f[] values() {
        return (EnumC0717f[]) f2815n.clone();
    }
}
