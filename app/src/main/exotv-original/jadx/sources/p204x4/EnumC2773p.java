package p204x4;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.p */
/* loaded from: classes.dex */
public final class EnumC2773p {

    /* renamed from: j */
    public static final EnumC2773p f10270j;

    /* renamed from: k */
    public static final EnumC2773p f10271k;

    /* renamed from: l */
    public static final EnumC2773p f10272l;

    /* renamed from: m */
    public static final EnumC2773p f10273m;

    /* renamed from: n */
    public static final EnumC2773p f10274n;

    /* renamed from: o */
    public static final EnumC2773p f10275o;

    /* renamed from: p */
    public static final /* synthetic */ EnumC2773p[] f10276p;

    static {
        EnumC2773p enumC2773p = new EnumC2773p("CAM", 0);
        f10270j = enumC2773p;
        EnumC2773p enumC2773p2 = new EnumC2773p("WEB", 1);
        f10271k = enumC2773p2;
        EnumC2773p enumC2773p3 = new EnumC2773p("BLURAY", 2);
        f10272l = enumC2773p3;
        EnumC2773p enumC2773p4 = new EnumC2773p("HDTV", 3);
        f10273m = enumC2773p4;
        EnumC2773p enumC2773p5 = new EnumC2773p("DVD", 4);
        f10274n = enumC2773p5;
        EnumC2773p enumC2773p6 = new EnumC2773p("UNKNOWN", 5);
        f10275o = enumC2773p6;
        EnumC2773p[] enumC2773pArr = {enumC2773p, enumC2773p2, enumC2773p3, enumC2773p4, enumC2773p5, enumC2773p6};
        f10276p = enumC2773pArr;
        AbstractC0120b.m421q(enumC2773pArr);
    }

    public static EnumC2773p valueOf(String str) {
        return (EnumC2773p) Enum.valueOf(EnumC2773p.class, str);
    }

    public static EnumC2773p[] values() {
        return (EnumC2773p[]) f10276p.clone();
    }
}
