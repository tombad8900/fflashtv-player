package p024c5;

import android.support.v4.media.session.AbstractC0120b;
import com.exotv.net.R;
import p163s6.C2377b;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.w */
/* loaded from: classes.dex */
public final class EnumC0698w {

    /* renamed from: m */
    public static final EnumC0698w f2714m;

    /* renamed from: n */
    public static final EnumC0698w f2715n;

    /* renamed from: o */
    public static final EnumC0698w f2716o;

    /* renamed from: p */
    public static final EnumC0698w f2717p;

    /* renamed from: q */
    public static final /* synthetic */ EnumC0698w[] f2718q;

    /* renamed from: r */
    public static final /* synthetic */ C2377b f2719r;

    /* renamed from: j */
    public final int f2720j;

    /* renamed from: k */
    public final int f2721k;

    /* renamed from: l */
    public final float f2722l;

    static {
        EnumC0698w enumC0698w = new EnumC0698w("LIVE", 0, R.string.tab_live, R.drawable.ic_tab_live, 0.92f);
        f2714m = enumC0698w;
        EnumC0698w enumC0698w2 = new EnumC0698w("MOVIES", 1, R.string.tab_movies, R.drawable.ic_tab_movies, 1.0f);
        f2715n = enumC0698w2;
        EnumC0698w enumC0698w3 = new EnumC0698w("SERIES", 2, R.string.tab_series, R.drawable.ic_tab_series, 1.1f);
        f2716o = enumC0698w3;
        EnumC0698w enumC0698w4 = new EnumC0698w("SEARCH", 3, R.string.tab_search, R.drawable.ic_tab_search, 0.92f);
        f2717p = enumC0698w4;
        EnumC0698w[] enumC0698wArr = {enumC0698w, enumC0698w2, enumC0698w3, enumC0698w4};
        f2718q = enumC0698wArr;
        f2719r = AbstractC0120b.m421q(enumC0698wArr);
    }

    public EnumC0698w(String str, int i, int i4, int i8, float f8) {
        this.f2720j = i4;
        this.f2721k = i8;
        this.f2722l = f8;
    }

    public static EnumC0698w valueOf(String str) {
        return (EnumC0698w) Enum.valueOf(EnumC0698w.class, str);
    }

    public static EnumC0698w[] values() {
        return (EnumC0698w[]) f2718q.clone();
    }
}
