package p024c5;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.w0 */
/* loaded from: classes.dex */
public final class EnumC0699w0 {

    /* renamed from: l */
    public static final EnumC0699w0 f2723l;

    /* renamed from: m */
    public static final EnumC0699w0 f2724m;

    /* renamed from: n */
    public static final /* synthetic */ EnumC0699w0[] f2725n;

    /* renamed from: j */
    public final String f2726j;

    /* renamed from: k */
    public final String f2727k;

    static {
        EnumC0699w0 enumC0699w0 = new EnumC0699w0(0, "MOVIES", "Movies", "/search/movie");
        f2723l = enumC0699w0;
        EnumC0699w0 enumC0699w02 = new EnumC0699w0(1, "SERIES", "Series", "/search/tv");
        f2724m = enumC0699w02;
        EnumC0699w0[] enumC0699w0Arr = {enumC0699w0, enumC0699w02};
        f2725n = enumC0699w0Arr;
        AbstractC0120b.m421q(enumC0699w0Arr);
    }

    public EnumC0699w0(int i, String str, String str2, String str3) {
        this.f2726j = str2;
        this.f2727k = str3;
    }

    public static EnumC0699w0 valueOf(String str) {
        return (EnumC0699w0) Enum.valueOf(EnumC0699w0.class, str);
    }

    public static EnumC0699w0[] values() {
        return (EnumC0699w0[]) f2725n.clone();
    }
}
