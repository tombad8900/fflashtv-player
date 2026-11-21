package p041e4;

import java.io.File;
import p170t4.C2435b;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.b0 */
/* loaded from: classes.dex */
public final class C0882b0 implements InterfaceC0901r {

    /* renamed from: b */
    public static final C0882b0 f3889b = new C0882b0(0);

    /* renamed from: a */
    public final /* synthetic */ int f3890a;

    public /* synthetic */ C0882b0(int i) {
        this.f3890a = i;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: a */
    public final boolean mo2049a(Object obj) {
        switch (this.f3890a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: b */
    public final C0900q mo2050b(Object obj, int i, int i4, C2804h c2804h) {
        switch (this.f3890a) {
            case 0:
                return new C0900q(new C2435b(obj), new C0885d(1, obj));
            case 1:
                File file = (File) obj;
                return new C0900q(new C2435b(file), new C0885d(0, file));
            default:
                return null;
        }
    }
}
