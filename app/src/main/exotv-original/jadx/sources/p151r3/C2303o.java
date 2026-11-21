package p151r3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import okhttp3.C2180y;
import p160s3.C2357h;
import p160s3.EnumC2356g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r3.o */
/* loaded from: classes.dex */
public final class C2303o {

    /* renamed from: a */
    public final Context f8055a;

    /* renamed from: b */
    public final Bitmap.Config f8056b;

    /* renamed from: c */
    public final ColorSpace f8057c;

    /* renamed from: d */
    public final C2357h f8058d;

    /* renamed from: e */
    public final EnumC2356g f8059e;

    /* renamed from: f */
    public final boolean f8060f;

    /* renamed from: g */
    public final boolean f8061g;

    /* renamed from: h */
    public final boolean f8062h;

    /* renamed from: i */
    public final String f8063i;

    /* renamed from: j */
    public final C2180y f8064j;

    /* renamed from: k */
    public final C2307s f8065k;

    /* renamed from: l */
    public final C2304p f8066l;

    /* renamed from: m */
    public final EnumC2290b f8067m;

    /* renamed from: n */
    public final EnumC2290b f8068n;

    /* renamed from: o */
    public final EnumC2290b f8069o;

    public C2303o(Context context, Bitmap.Config config, ColorSpace colorSpace, C2357h c2357h, EnumC2356g enumC2356g, boolean z7, boolean z8, boolean z9, String str, C2180y c2180y, C2307s c2307s, C2304p c2304p, EnumC2290b enumC2290b, EnumC2290b enumC2290b2, EnumC2290b enumC2290b3) {
        this.f8055a = context;
        this.f8056b = config;
        this.f8057c = colorSpace;
        this.f8058d = c2357h;
        this.f8059e = enumC2356g;
        this.f8060f = z7;
        this.f8061g = z8;
        this.f8062h = z9;
        this.f8063i = str;
        this.f8064j = c2180y;
        this.f8065k = c2307s;
        this.f8066l = c2304p;
        this.f8067m = enumC2290b;
        this.f8068n = enumC2290b2;
        this.f8069o = enumC2290b3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2303o)) {
            return false;
        }
        C2303o c2303o = (C2303o) obj;
        if (AbstractC2980h.m5132a(this.f8055a, c2303o.f8055a) && this.f8056b == c2303o.f8056b) {
            return (Build.VERSION.SDK_INT < 26 || AbstractC2980h.m5132a(this.f8057c, c2303o.f8057c)) && AbstractC2980h.m5132a(this.f8058d, c2303o.f8058d) && this.f8059e == c2303o.f8059e && this.f8060f == c2303o.f8060f && this.f8061g == c2303o.f8061g && this.f8062h == c2303o.f8062h && AbstractC2980h.m5132a(this.f8063i, c2303o.f8063i) && AbstractC2980h.m5132a(this.f8064j, c2303o.f8064j) && AbstractC2980h.m5132a(this.f8065k, c2303o.f8065k) && AbstractC2980h.m5132a(this.f8066l, c2303o.f8066l) && this.f8067m == c2303o.f8067m && this.f8068n == c2303o.f8068n && this.f8069o == c2303o.f8069o;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f8056b.hashCode() + (this.f8055a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f8057c;
        int iHashCode2 = (Boolean.hashCode(this.f8062h) + ((Boolean.hashCode(this.f8061g) + ((Boolean.hashCode(this.f8060f) + ((this.f8059e.hashCode() + ((this.f8058d.hashCode() + ((iHashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.f8063i;
        return this.f8069o.hashCode() + ((this.f8068n.hashCode() + ((this.f8067m.hashCode() + ((this.f8066l.f8071j.hashCode() + ((this.f8065k.f8080a.hashCode() + ((this.f8064j.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
