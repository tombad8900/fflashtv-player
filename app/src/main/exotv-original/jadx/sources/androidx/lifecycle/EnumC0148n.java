package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.n */
/* loaded from: classes.dex */
public final class EnumC0148n {

    /* renamed from: j */
    public static final EnumC0148n f925j;

    /* renamed from: k */
    public static final EnumC0148n f926k;

    /* renamed from: l */
    public static final EnumC0148n f927l;

    /* renamed from: m */
    public static final EnumC0148n f928m;

    /* renamed from: n */
    public static final EnumC0148n f929n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC0148n[] f930o;

    static {
        EnumC0148n enumC0148n = new EnumC0148n("DESTROYED", 0);
        f925j = enumC0148n;
        EnumC0148n enumC0148n2 = new EnumC0148n("INITIALIZED", 1);
        f926k = enumC0148n2;
        EnumC0148n enumC0148n3 = new EnumC0148n("CREATED", 2);
        f927l = enumC0148n3;
        EnumC0148n enumC0148n4 = new EnumC0148n("STARTED", 3);
        f928m = enumC0148n4;
        EnumC0148n enumC0148n5 = new EnumC0148n("RESUMED", 4);
        f929n = enumC0148n5;
        f930o = new EnumC0148n[]{enumC0148n, enumC0148n2, enumC0148n3, enumC0148n4, enumC0148n5};
    }

    public static EnumC0148n valueOf(String str) {
        return (EnumC0148n) Enum.valueOf(EnumC0148n.class, str);
    }

    public static EnumC0148n[] values() {
        return (EnumC0148n[]) f930o.clone();
    }
}
