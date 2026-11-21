package androidx.media3.common;

import android.net.Uri;
import java.util.List;
import okhttp3.C2181z;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.b0 */
/* loaded from: classes.dex */
public final class C0184b0 {

    /* renamed from: a */
    public String f1030a;

    /* renamed from: b */
    public Uri f1031b;

    /* renamed from: c */
    public String f1032c;

    /* renamed from: d */
    public C0188c0 f1033d;

    /* renamed from: e */
    public C0199f0 f1034e;

    /* renamed from: f */
    public List f1035f;

    /* renamed from: g */
    public String f1036g;

    /* renamed from: h */
    public AbstractC0983m0 f1037h;

    /* renamed from: i */
    public C0170a0 f1038i;

    /* renamed from: j */
    public Object f1039j;

    /* renamed from: k */
    public long f1040k;

    /* renamed from: l */
    public C0235r0 f1041l;

    /* renamed from: m */
    public C0205h0 f1042m;

    /* renamed from: n */
    public C0214k0 f1043n;

    /* renamed from: a */
    public final C0226o0 m608a() {
        C0211j0 c0211j0;
        C0199f0 c0199f0 = this.f1034e;
        AbstractC1101a.m2359j(c0199f0.f1091b == null || c0199f0.f1090a != null);
        Uri uri = this.f1031b;
        if (uri != null) {
            String str = this.f1032c;
            C0199f0 c0199f02 = this.f1034e;
            c0211j0 = new C0211j0(uri, str, c0199f02.f1090a != null ? new C0202g0(c0199f02) : null, this.f1038i, this.f1035f, this.f1036g, this.f1037h, this.f1039j, this.f1040k);
        } else {
            c0211j0 = null;
        }
        String str2 = this.f1030a;
        if (str2 == null) {
            str2 = C2181z.FRAGMENT_ENCODE_SET;
        }
        String str3 = str2;
        C0188c0 c0188c0 = this.f1033d;
        c0188c0.getClass();
        C0196e0 c0196e0 = new C0196e0(c0188c0);
        C0205h0 c0205h0 = this.f1042m;
        c0205h0.getClass();
        C0208i0 c0208i0 = new C0208i0(c0205h0);
        C0235r0 c0235r0 = this.f1041l;
        if (c0235r0 == null) {
            c0235r0 = C0235r0.f1329K;
        }
        return new C0226o0(str3, c0196e0, c0211j0, c0208i0, c0235r0, this.f1043n);
    }
}
