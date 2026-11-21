package p041e4;

import android.net.Uri;
import com.bumptech.glide.load.data.C0724a;
import com.bumptech.glide.load.data.C0737n;
import com.bumptech.glide.load.data.InterfaceC0728e;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p170t4.C2435b;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.d0 */
/* loaded from: classes.dex */
public final class C0886d0 implements InterfaceC0901r {

    /* renamed from: b */
    public static final Set f3897b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));

    /* renamed from: a */
    public final Object f3898a;

    public C0886d0(C0884c0 c0884c0) {
        this.f3898a = c0884c0;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: a */
    public final boolean mo2049a(Object obj) {
        return f3897b.contains(((Uri) obj).getScheme());
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: b */
    public final C0900q mo2050b(Object obj, int i, int i4, C2804h c2804h) {
        InterfaceC0728e c0724a;
        Uri uri = (Uri) obj;
        C2435b c2435b = new C2435b(uri);
        C0884c0 c0884c0 = (C0884c0) this.f3898a;
        switch (c0884c0.f3893j) {
            case 0:
                c0724a = new C0724a(c0884c0.f3894k, uri, 0);
                break;
            case 1:
                c0724a = new C0724a(c0884c0.f3894k, uri, 1);
                break;
            default:
                c0724a = new C0737n(1, uri, c0884c0.f3894k);
                break;
        }
        return new C0900q(c2435b, c0724a);
    }
}
