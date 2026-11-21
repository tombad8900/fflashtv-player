package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public final class EnumC0146m {
    private static final /* synthetic */ EnumC0146m[] $VALUES;
    public static final C0142k Companion;
    public static final EnumC0146m ON_ANY;
    public static final EnumC0146m ON_CREATE;
    public static final EnumC0146m ON_DESTROY;
    public static final EnumC0146m ON_PAUSE;
    public static final EnumC0146m ON_RESUME;
    public static final EnumC0146m ON_START;
    public static final EnumC0146m ON_STOP;

    static {
        EnumC0146m enumC0146m = new EnumC0146m("ON_CREATE", 0);
        ON_CREATE = enumC0146m;
        EnumC0146m enumC0146m2 = new EnumC0146m("ON_START", 1);
        ON_START = enumC0146m2;
        EnumC0146m enumC0146m3 = new EnumC0146m("ON_RESUME", 2);
        ON_RESUME = enumC0146m3;
        EnumC0146m enumC0146m4 = new EnumC0146m("ON_PAUSE", 3);
        ON_PAUSE = enumC0146m4;
        EnumC0146m enumC0146m5 = new EnumC0146m("ON_STOP", 4);
        ON_STOP = enumC0146m5;
        EnumC0146m enumC0146m6 = new EnumC0146m("ON_DESTROY", 5);
        ON_DESTROY = enumC0146m6;
        EnumC0146m enumC0146m7 = new EnumC0146m("ON_ANY", 6);
        ON_ANY = enumC0146m7;
        $VALUES = new EnumC0146m[]{enumC0146m, enumC0146m2, enumC0146m3, enumC0146m4, enumC0146m5, enumC0146m6, enumC0146m7};
        Companion = new C0142k();
    }

    public static EnumC0146m valueOf(String str) {
        return (EnumC0146m) Enum.valueOf(EnumC0146m.class, str);
    }

    public static EnumC0146m[] values() {
        return (EnumC0146m[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final EnumC0148n m563a() {
        switch (AbstractC0144l.f920a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0148n.f927l;
            case 3:
            case 4:
                return EnumC0148n.f928m;
            case 5:
                return EnumC0148n.f929n;
            case 6:
                return EnumC0148n.f925j;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
