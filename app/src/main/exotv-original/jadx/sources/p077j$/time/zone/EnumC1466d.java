package p077j$.time.zone;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.zone.d */
/* loaded from: classes2.dex */
public final class EnumC1466d {
    public static final EnumC1466d STANDARD;
    public static final EnumC1466d UTC;
    public static final EnumC1466d WALL;

    /* renamed from: a */
    public static final /* synthetic */ EnumC1466d[] f5651a;

    public static EnumC1466d valueOf(String str) {
        return (EnumC1466d) Enum.valueOf(EnumC1466d.class, str);
    }

    public static EnumC1466d[] values() {
        return (EnumC1466d[]) f5651a.clone();
    }

    static {
        EnumC1466d enumC1466d = new EnumC1466d("UTC", 0);
        UTC = enumC1466d;
        EnumC1466d enumC1466d2 = new EnumC1466d("WALL", 1);
        WALL = enumC1466d2;
        EnumC1466d enumC1466d3 = new EnumC1466d("STANDARD", 2);
        STANDARD = enumC1466d3;
        f5651a = new EnumC1466d[]{enumC1466d, enumC1466d2, enumC1466d3};
    }
}
