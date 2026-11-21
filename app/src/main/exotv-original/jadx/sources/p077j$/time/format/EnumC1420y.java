package p077j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.y */
/* loaded from: classes2.dex */
public final class EnumC1420y {
    public static final EnumC1420y FULL;
    public static final EnumC1420y FULL_STANDALONE;
    public static final EnumC1420y NARROW;
    public static final EnumC1420y NARROW_STANDALONE;
    public static final EnumC1420y SHORT;
    public static final EnumC1420y SHORT_STANDALONE;

    /* renamed from: a */
    public static final /* synthetic */ EnumC1420y[] f5563a;

    public static EnumC1420y valueOf(String str) {
        return (EnumC1420y) Enum.valueOf(EnumC1420y.class, str);
    }

    public static EnumC1420y[] values() {
        return (EnumC1420y[]) f5563a.clone();
    }

    static {
        EnumC1420y enumC1420y = new EnumC1420y("FULL", 0);
        FULL = enumC1420y;
        EnumC1420y enumC1420y2 = new EnumC1420y("FULL_STANDALONE", 1);
        FULL_STANDALONE = enumC1420y2;
        EnumC1420y enumC1420y3 = new EnumC1420y("SHORT", 2);
        SHORT = enumC1420y3;
        EnumC1420y enumC1420y4 = new EnumC1420y("SHORT_STANDALONE", 3);
        SHORT_STANDALONE = enumC1420y4;
        EnumC1420y enumC1420y5 = new EnumC1420y("NARROW", 4);
        NARROW = enumC1420y5;
        EnumC1420y enumC1420y6 = new EnumC1420y("NARROW_STANDALONE", 5);
        NARROW_STANDALONE = enumC1420y6;
        f5563a = new EnumC1420y[]{enumC1420y, enumC1420y2, enumC1420y3, enumC1420y4, enumC1420y5, enumC1420y6};
    }
}
