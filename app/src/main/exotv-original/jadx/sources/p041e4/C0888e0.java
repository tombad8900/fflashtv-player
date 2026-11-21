package p041e4;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.e0 */
/* loaded from: classes.dex */
public final class C0888e0 implements InterfaceC0901r {

    /* renamed from: b */
    public static final Set f3903b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a */
    public final InterfaceC0901r f3904a;

    public C0888e0(InterfaceC0901r interfaceC0901r) {
        this.f3904a = interfaceC0901r;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: a */
    public final boolean mo2049a(Object obj) {
        return f3903b.contains(((Uri) obj).getScheme());
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: b */
    public final C0900q mo2050b(Object obj, int i, int i4, C2804h c2804h) {
        return this.f3904a.mo2050b(new C0891h(((Uri) obj).toString()), i, i4, c2804h);
    }
}
