package p210y3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y3.i */
/* loaded from: classes.dex */
public final class EnumC2805i {

    /* renamed from: j */
    public static final EnumC2805i f10425j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC2805i[] f10426k;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2805i EF0;

    static {
        EnumC2805i enumC2805i = new EnumC2805i("SRGB", 0);
        EnumC2805i enumC2805i2 = new EnumC2805i("DISPLAY_P3", 1);
        f10425j = enumC2805i2;
        f10426k = new EnumC2805i[]{enumC2805i, enumC2805i2};
    }

    public static EnumC2805i valueOf(String str) {
        return (EnumC2805i) Enum.valueOf(EnumC2805i.class, str);
    }

    public static EnumC2805i[] values() {
        return (EnumC2805i[]) f10426k.clone();
    }
}
