package p127o7;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o7.b */
/* loaded from: classes.dex */
public final class EnumC2051b {

    /* renamed from: j */
    public static final EnumC2051b f7581j;

    /* renamed from: k */
    public static final EnumC2051b f7582k;

    /* renamed from: l */
    public static final EnumC2051b f7583l;

    /* renamed from: m */
    public static final EnumC2051b f7584m;

    /* renamed from: n */
    public static final EnumC2051b f7585n;

    /* renamed from: o */
    public static final /* synthetic */ EnumC2051b[] f7586o;

    static {
        EnumC2051b enumC2051b = new EnumC2051b("CPU_ACQUIRED", 0);
        f7581j = enumC2051b;
        EnumC2051b enumC2051b2 = new EnumC2051b("BLOCKING", 1);
        f7582k = enumC2051b2;
        EnumC2051b enumC2051b3 = new EnumC2051b("PARKING", 2);
        f7583l = enumC2051b3;
        EnumC2051b enumC2051b4 = new EnumC2051b("DORMANT", 3);
        f7584m = enumC2051b4;
        EnumC2051b enumC2051b5 = new EnumC2051b("TERMINATED", 4);
        f7585n = enumC2051b5;
        EnumC2051b[] enumC2051bArr = {enumC2051b, enumC2051b2, enumC2051b3, enumC2051b4, enumC2051b5};
        f7586o = enumC2051bArr;
        AbstractC0120b.m421q(enumC2051bArr);
    }

    public static EnumC2051b valueOf(String str) {
        return (EnumC2051b) Enum.valueOf(EnumC2051b.class, str);
    }

    public static EnumC2051b[] values() {
        return (EnumC2051b[]) f7586o.clone();
    }
}
