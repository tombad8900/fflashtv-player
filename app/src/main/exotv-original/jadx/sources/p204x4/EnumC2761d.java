package p204x4;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.d */
/* loaded from: classes.dex */
public final class EnumC2761d {

    /* renamed from: j */
    public static final EnumC2761d f10216j;

    /* renamed from: k */
    public static final EnumC2761d f10217k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC2761d[] f10218l;

    static {
        EnumC2761d enumC2761d = new EnumC2761d("MOVIE", 0);
        f10216j = enumC2761d;
        EnumC2761d enumC2761d2 = new EnumC2761d("TV", 1);
        f10217k = enumC2761d2;
        EnumC2761d[] enumC2761dArr = {enumC2761d, enumC2761d2};
        f10218l = enumC2761dArr;
        AbstractC0120b.m421q(enumC2761dArr);
    }

    public static EnumC2761d valueOf(String str) {
        return (EnumC2761d) Enum.valueOf(EnumC2761d.class, str);
    }

    public static EnumC2761d[] values() {
        return (EnumC2761d[]) f10218l.clone();
    }
}
