package p077j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: j$.time.format.l */
/* loaded from: classes2.dex */
public final class EnumC1407l implements InterfaceC1400e {
    public static final EnumC1407l INSENSITIVE;
    public static final EnumC1407l LENIENT;
    public static final EnumC1407l SENSITIVE;
    public static final EnumC1407l STRICT;

    /* renamed from: a */
    public static final /* synthetic */ EnumC1407l[] f5527a;

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: w */
    public final boolean mo3009w(C1413r c1413r, StringBuilder sb) {
        return true;
    }

    public static EnumC1407l valueOf(String str) {
        return (EnumC1407l) Enum.valueOf(EnumC1407l.class, str);
    }

    public static EnumC1407l[] values() {
        return (EnumC1407l[]) f5527a.clone();
    }

    static {
        EnumC1407l enumC1407l = new EnumC1407l("SENSITIVE", 0);
        SENSITIVE = enumC1407l;
        EnumC1407l enumC1407l2 = new EnumC1407l("INSENSITIVE", 1);
        INSENSITIVE = enumC1407l2;
        EnumC1407l enumC1407l3 = new EnumC1407l("STRICT", 2);
        STRICT = enumC1407l3;
        EnumC1407l enumC1407l4 = new EnumC1407l("LENIENT", 3);
        LENIENT = enumC1407l4;
        f5527a = new EnumC1407l[]{enumC1407l, enumC1407l2, enumC1407l3, enumC1407l4};
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: A */
    public final int mo3008A(C1411p c1411p, CharSequence charSequence, int i) {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            c1411p.f5540b = true;
            return i;
        }
        if (iOrdinal == 1) {
            c1411p.f5540b = false;
            return i;
        }
        if (iOrdinal == 2) {
            c1411p.f5541c = true;
            return i;
        }
        if (iOrdinal != 3) {
            return i;
        }
        c1411p.f5541c = false;
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (iOrdinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (iOrdinal == 2) {
            return "ParseStrict(true)";
        }
        if (iOrdinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
