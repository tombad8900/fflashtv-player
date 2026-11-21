package p066h4;

import android.graphics.Bitmap;
import java.io.File;
import p005a4.InterfaceC0080f0;
import p178u4.AbstractC2470e;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.z */
/* loaded from: classes.dex */
public final class C1192z implements InterfaceC0080f0 {

    /* renamed from: j */
    public final /* synthetic */ int f5068j = 0;

    /* renamed from: k */
    public final Object f5069k;

    public C1192z(byte[] bArr) {
        AbstractC2470e.m4446c("Argument must not be null", bArr);
        this.f5069k = bArr;
    }

    /* renamed from: a */
    private final void m2614a() {
    }

    /* renamed from: e */
    private final void m2615e() {
    }

    /* renamed from: f */
    private final void m2616f() {
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: b */
    public final void mo305b() {
        int i = this.f5068j;
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: c */
    public final int mo306c() {
        switch (this.f5068j) {
            case 0:
                return AbstractC2478m.m4455c((Bitmap) this.f5069k);
            case 1:
                return ((byte[]) this.f5069k).length;
            default:
                return 1;
        }
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: d */
    public final Class mo307d() {
        switch (this.f5068j) {
            case 0:
                return Bitmap.class;
            case 1:
                return byte[].class;
            default:
                return ((File) this.f5069k).getClass();
        }
    }

    @Override // p005a4.InterfaceC0080f0
    public final Object get() {
        switch (this.f5068j) {
            case 0:
                return (Bitmap) this.f5069k;
            case 1:
                return (byte[]) this.f5069k;
            default:
                return (File) this.f5069k;
        }
    }

    public C1192z(File file) {
        AbstractC2470e.m4446c("Argument must not be null", file);
        this.f5069k = file;
    }

    public C1192z(Bitmap bitmap) {
        this.f5069k = bitmap;
    }
}
