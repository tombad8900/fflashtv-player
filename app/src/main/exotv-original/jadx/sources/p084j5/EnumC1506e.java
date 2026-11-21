package p084j5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j5.e */
/* loaded from: classes.dex */
public final class EnumC1506e {

    /* renamed from: j */
    public static final EnumC1506e f5775j;

    /* renamed from: k */
    public static final EnumC1506e f5776k;

    /* renamed from: l */
    public static final EnumC1506e f5777l;

    /* renamed from: m */
    public static final EnumC1506e f5778m;

    /* renamed from: n */
    public static final /* synthetic */ EnumC1506e[] f5779n;

    static {
        EnumC1506e enumC1506e = new EnumC1506e("NONE", 0);
        f5775j = enumC1506e;
        EnumC1506e enumC1506e2 = new EnumC1506e("START", 1);
        f5776k = enumC1506e2;
        EnumC1506e enumC1506e3 = new EnumC1506e("END", 2);
        f5777l = enumC1506e3;
        EnumC1506e enumC1506e4 = new EnumC1506e("BOTH", 3);
        f5778m = enumC1506e4;
        f5779n = new EnumC1506e[]{enumC1506e, enumC1506e2, enumC1506e3, enumC1506e4};
    }

    public static EnumC1506e valueOf(String str) {
        return (EnumC1506e) Enum.valueOf(EnumC1506e.class, str);
    }

    public static EnumC1506e[] values() {
        return (EnumC1506e[]) f5779n.clone();
    }
}
