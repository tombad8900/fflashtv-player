package p151r3;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.b */
/* loaded from: classes.dex */
public final class EnumC2290b {

    /* renamed from: l */
    public static final EnumC2290b f7989l;

    /* renamed from: m */
    public static final EnumC2290b f7990m;

    /* renamed from: n */
    public static final /* synthetic */ EnumC2290b[] f7991n;

    /* renamed from: j */
    public final boolean f7992j;

    /* renamed from: k */
    public final boolean f7993k;

    static {
        EnumC2290b enumC2290b = new EnumC2290b("ENABLED", 0, true, true);
        f7989l = enumC2290b;
        EnumC2290b enumC2290b2 = new EnumC2290b("READ_ONLY", 1, true, false);
        EnumC2290b enumC2290b3 = new EnumC2290b("WRITE_ONLY", 2, false, true);
        EnumC2290b enumC2290b4 = new EnumC2290b("DISABLED", 3, false, false);
        f7990m = enumC2290b4;
        EnumC2290b[] enumC2290bArr = {enumC2290b, enumC2290b2, enumC2290b3, enumC2290b4};
        f7991n = enumC2290bArr;
        AbstractC0120b.m421q(enumC2290bArr);
    }

    public EnumC2290b(String str, int i, boolean z7, boolean z8) {
        this.f7992j = z7;
        this.f7993k = z8;
    }

    public static EnumC2290b valueOf(String str) {
        return (EnumC2290b) Enum.valueOf(EnumC2290b.class, str);
    }

    public static EnumC2290b[] values() {
        return (EnumC2290b[]) f7991n.clone();
    }
}
