package p160s3;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s3.d */
/* loaded from: classes.dex */
public final class EnumC2353d {

    /* renamed from: j */
    public static final EnumC2353d f8263j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC2353d[] f8264k;

    static {
        EnumC2353d enumC2353d = new EnumC2353d("EXACT", 0);
        EnumC2353d enumC2353d2 = new EnumC2353d("INEXACT", 1);
        EnumC2353d enumC2353d3 = new EnumC2353d("AUTOMATIC", 2);
        f8263j = enumC2353d3;
        EnumC2353d[] enumC2353dArr = {enumC2353d, enumC2353d2, enumC2353d3};
        f8264k = enumC2353dArr;
        AbstractC0120b.m421q(enumC2353dArr);
    }

    public static EnumC2353d valueOf(String str) {
        return (EnumC2353d) Enum.valueOf(EnumC2353d.class, str);
    }

    public static EnumC2353d[] values() {
        return (EnumC2353d[]) f8264k.clone();
    }
}
