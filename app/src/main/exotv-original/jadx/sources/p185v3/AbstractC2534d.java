package p185v3;

import p002a1.C0048u;
import p151r3.C2291c;
import p151r3.C2299k;
import p160s3.C2352c;
import p160s3.C2355f;
import p160s3.EnumC2353d;
import p160s3.InterfaceC2358i;
import p169t3.C2433a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v3.d */
/* loaded from: classes.dex */
public abstract class AbstractC2534d {

    /* renamed from: a */
    public static final C2291c f9214a = new C2291c();

    /* renamed from: a */
    public static final boolean m4553a(C2299k c2299k) {
        EnumC2353d enumC2353d = c2299k.f8032f;
        C2433a c2433a = c2299k.f8029c;
        InterfaceC2358i interfaceC2358i = c2299k.f8049w;
        int iOrdinal = enumC2353d.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new C0048u();
            }
            if (!(interfaceC2358i instanceof C2352c) && (!(c2433a instanceof C2433a) || !(interfaceC2358i instanceof C2355f) || c2433a.f8786k != ((C2355f) interfaceC2358i).f8265a)) {
                return false;
            }
        }
        return true;
    }
}
