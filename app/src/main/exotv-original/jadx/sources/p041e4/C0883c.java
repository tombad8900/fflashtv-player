package p041e4;

import java.io.File;
import p170t4.C2435b;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.c */
/* loaded from: classes.dex */
public final class C0883c implements InterfaceC0901r {

    /* renamed from: a */
    public final /* synthetic */ int f3891a;

    /* renamed from: b */
    public final Object f3892b;

    public /* synthetic */ C0883c(int i, Object obj) {
        this.f3891a = i;
        this.f3892b = obj;
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: a */
    public final boolean mo2049a(Object obj) {
        switch (this.f3891a) {
            case 0:
                return true;
            case 1:
                return obj.toString().startsWith("data:image");
            default:
                return true;
        }
    }

    @Override // p041e4.InterfaceC0901r
    /* renamed from: b */
    public final C0900q mo2050b(Object obj, int i, int i4, C2804h c2804h) {
        switch (this.f3891a) {
            case 0:
                byte[] bArr = (byte[]) obj;
                return new C0900q(new C2435b(bArr), new C0896m(bArr, 1, (C0880a0) this.f3892b));
            case 1:
                return new C0900q(new C2435b(obj), new C0887e(0, obj.toString(), (C0880a0) this.f3892b));
            default:
                File file = (File) obj;
                return new C0900q(new C2435b(file), new C0887e(1, file, (C0880a0) this.f3892b));
        }
    }
}
