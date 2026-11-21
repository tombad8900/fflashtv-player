package p041e4;

import android.content.Context;
import android.net.Uri;
import p066h4.C1169c0;
import p170t4.C2435b;
import p171t5.AbstractC2436a;
import p210y3.C2804h;
import p217z3.C2929a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.n */
/* loaded from: classes.dex */
public final class C0897n implements InterfaceC0901r {

    /* renamed from: a */
    public final /* synthetic */ int f3926a;

    /* renamed from: b */
    public final Context f3927b;

    public C0897n(Context context, int i) {
        this.f3926a = i;
        switch (i) {
            case 1:
                this.f3927b = context.getApplicationContext();
                break;
            case 2:
                this.f3927b = context.getApplicationContext();
                break;
            default:
                this.f3927b = context;
                break;
        }
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: a */
    public final boolean mo2049a(Object obj) {
        switch (this.f3926a) {
            case 0:
                return AbstractC2436a.m4339n((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return AbstractC2436a.m4339n(uri) && !uri.getPathSegments().contains("video");
            default:
                Uri uri2 = (Uri) obj;
                return AbstractC2436a.m4339n(uri2) && uri2.getPathSegments().contains("video");
        }
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: b */
    public final C0900q mo2050b(Object obj, int i, int i4, C2804h c2804h) {
        Long l8;
        switch (this.f3926a) {
            case 0:
                Uri uri = (Uri) obj;
                return new C0900q(new C2435b(uri), new C0896m(this.f3927b, 0, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || i > 512 || i4 > 384) {
                    return null;
                }
                C2435b c2435b = new C2435b(uri2);
                Context context = this.f3927b;
                return new C0900q(c2435b, C0887e.m2055d(context, uri2, new C2929a(context.getContentResolver(), 0)));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i4 == Integer.MIN_VALUE || i > 512 || i4 > 384 || (l8 = (Long) c2804h.m4908c(C1169c0.f5012d)) == null || l8.longValue() != -1) {
                    return null;
                }
                C2435b c2435b2 = new C2435b(uri3);
                Context context2 = this.f3927b;
                return new C0900q(c2435b2, C0887e.m2055d(context2, uri3, new C2929a(context2.getContentResolver(), 1)));
        }
    }
}
