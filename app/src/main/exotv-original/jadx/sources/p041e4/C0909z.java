package p041e4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.z */
/* loaded from: classes.dex */
public final class C0909z implements InterfaceC0901r {

    /* renamed from: a */
    public final /* synthetic */ int f3954a;

    /* renamed from: b */
    public final InterfaceC0901r f3955b;

    public /* synthetic */ C0909z(InterfaceC0901r interfaceC0901r, int i) {
        this.f3954a = i;
        this.f3955b = interfaceC0901r;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2049a(Object obj) {
        switch (this.f3954a) {
            case 0:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: b */
    public final C0900q mo2050b(Object obj, int i, int i4, C2804h c2804h) {
        Uri uriFromFile;
        switch (this.f3954a) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uriFromFile = null;
                } else if (str.charAt(0) == '/') {
                    uriFromFile = Uri.fromFile(new File(str));
                } else {
                    Uri uri = Uri.parse(str);
                    uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str)) : uri;
                }
                if (uriFromFile == null) {
                    return null;
                }
                InterfaceC0901r interfaceC0901r = this.f3955b;
                if (interfaceC0901r.mo2049a(uriFromFile)) {
                    return interfaceC0901r.mo2050b(uriFromFile, i, i4, c2804h);
                }
                return null;
            default:
                return this.f3955b.mo2050b(new C0891h((URL) obj), i, i4, c2804h);
        }
    }
}
