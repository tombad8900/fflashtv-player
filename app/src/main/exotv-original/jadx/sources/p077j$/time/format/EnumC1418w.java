package p077j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.w */
/* loaded from: classes2.dex */
public final class EnumC1418w {
    public static final EnumC1418w LENIENT;
    public static final EnumC1418w SMART;
    public static final EnumC1418w STRICT;

    /* renamed from: a */
    public static final /* synthetic */ EnumC1418w[] f5561a;

    public static EnumC1418w valueOf(String str) {
        return (EnumC1418w) Enum.valueOf(EnumC1418w.class, str);
    }

    public static EnumC1418w[] values() {
        return (EnumC1418w[]) f5561a.clone();
    }

    static {
        EnumC1418w enumC1418w = new EnumC1418w("STRICT", 0);
        STRICT = enumC1418w;
        EnumC1418w enumC1418w2 = new EnumC1418w("SMART", 1);
        SMART = enumC1418w2;
        EnumC1418w enumC1418w3 = new EnumC1418w("LENIENT", 2);
        LENIENT = enumC1418w3;
        f5561a = new EnumC1418w[]{enumC1418w, enumC1418w2, enumC1418w3};
    }
}
