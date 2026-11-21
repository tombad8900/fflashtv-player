package p069h7;

import android.support.v4.media.session.AbstractC0120b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.g */
/* loaded from: classes.dex */
public final class EnumC1205g implements InterfaceC1201c {

    /* renamed from: k */
    public static final EnumC1205g f5092k;

    /* renamed from: l */
    public static final /* synthetic */ EnumC1205g[] f5093l;

    /* renamed from: j */
    public final int f5094j;

    static {
        EnumC1205g enumC1205g = new EnumC1205g("IGNORE_CASE", 0, 2);
        EnumC1205g enumC1205g2 = new EnumC1205g("MULTILINE", 1, 8);
        EnumC1205g enumC1205g3 = new EnumC1205g("LITERAL", 2, 16);
        EnumC1205g enumC1205g4 = new EnumC1205g("UNIX_LINES", 3, 1);
        EnumC1205g enumC1205g5 = new EnumC1205g("COMMENTS", 4, 4);
        EnumC1205g enumC1205g6 = new EnumC1205g("DOT_MATCHES_ALL", 5, 32);
        f5092k = enumC1205g6;
        EnumC1205g[] enumC1205gArr = {enumC1205g, enumC1205g2, enumC1205g3, enumC1205g4, enumC1205g5, enumC1205g6, new EnumC1205g("CANON_EQ", 6, 128)};
        f5093l = enumC1205gArr;
        AbstractC0120b.m421q(enumC1205gArr);
    }

    public EnumC1205g(String str, int i, int i4) {
        this.f5094j = i4;
    }

    public static EnumC1205g valueOf(String str) {
        return (EnumC1205g) Enum.valueOf(EnumC1205g.class, str);
    }

    public static EnumC1205g[] values() {
        return (EnumC1205g[]) f5093l.clone();
    }
}
