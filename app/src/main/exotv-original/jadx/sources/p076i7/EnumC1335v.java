package p076i7;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.v */
/* loaded from: classes.dex */
public final class EnumC1335v {

    /* renamed from: j */
    public static final EnumC1335v f5372j;

    /* renamed from: k */
    public static final /* synthetic */ EnumC1335v[] f5373k;

    static {
        EnumC1335v enumC1335v = new EnumC1335v("DEFAULT", 0);
        f5372j = enumC1335v;
        EnumC1335v[] enumC1335vArr = {enumC1335v, new EnumC1335v("LAZY", 1), new EnumC1335v("ATOMIC", 2), new EnumC1335v("UNDISPATCHED", 3)};
        f5373k = enumC1335vArr;
        AbstractC0120b.m421q(enumC1335vArr);
    }

    public static EnumC1335v valueOf(String str) {
        return (EnumC1335v) Enum.valueOf(EnumC1335v.class, str);
    }

    public static EnumC1335v[] values() {
        return (EnumC1335v[]) f5373k.clone();
    }
}
