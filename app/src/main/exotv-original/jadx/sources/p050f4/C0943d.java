package p050f4;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import p041e4.C0900q;
import p041e4.InterfaceC0901r;
import p170t4.C2435b;
import p171t5.AbstractC2436a;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f4.d */
/* loaded from: classes.dex */
public final class C0943d implements InterfaceC0901r {

    /* renamed from: a */
    public final Context f4147a;

    /* renamed from: b */
    public final InterfaceC0901r f4148b;

    /* renamed from: c */
    public final InterfaceC0901r f4149c;

    /* renamed from: d */
    public final Class f4150d;

    public C0943d(Context context, InterfaceC0901r interfaceC0901r, InterfaceC0901r interfaceC0901r2, Class cls) {
        this.f4147a = context.getApplicationContext();
        this.f4148b = interfaceC0901r;
        this.f4149c = interfaceC0901r2;
        this.f4150d = cls;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: a */
    public final boolean mo2049a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && AbstractC2436a.m4339n((Uri) obj);
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: b */
    public final C0900q mo2050b(Object obj, int i, int i4, C2804h c2804h) {
        Uri uri = (Uri) obj;
        return new C0900q(new C2435b(uri), new C0942c(this.f4147a, this.f4148b, this.f4149c, uri, i, i4, c2804h, this.f4150d));
    }
}
