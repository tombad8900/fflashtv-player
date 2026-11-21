package p210y3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y3.a */
/* loaded from: classes.dex */
public final class EnumC2797a {

    /* renamed from: j */
    public static final EnumC2797a f10413j;

    /* renamed from: k */
    public static final EnumC2797a f10414k;

    /* renamed from: l */
    public static final EnumC2797a f10415l;

    /* renamed from: m */
    public static final /* synthetic */ EnumC2797a[] f10416m;

    static {
        EnumC2797a enumC2797a = new EnumC2797a("PREFER_ARGB_8888", 0);
        f10413j = enumC2797a;
        EnumC2797a enumC2797a2 = new EnumC2797a("PREFER_RGB_565", 1);
        f10414k = enumC2797a2;
        f10416m = new EnumC2797a[]{enumC2797a, enumC2797a2};
        f10415l = enumC2797a;
    }

    public static EnumC2797a valueOf(String str) {
        return (EnumC2797a) Enum.valueOf(EnumC2797a.class, str);
    }

    public static EnumC2797a[] values() {
        return (EnumC2797a[]) f10416m.clone();
    }
}
