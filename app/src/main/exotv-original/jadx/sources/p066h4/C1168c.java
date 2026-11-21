package p066h4;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import p005a4.InterfaceC0072b0;
import p005a4.InterfaceC0080f0;
import p015b4.InterfaceC0567a;
import p178u4.AbstractC2470e;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.c */
/* loaded from: classes.dex */
public final class C1168c implements InterfaceC0080f0, InterfaceC0072b0 {

    /* renamed from: j */
    public final /* synthetic */ int f5009j = 1;

    /* renamed from: k */
    public final Object f5010k;

    /* renamed from: l */
    public final Object f5011l;

    public C1168c(Bitmap bitmap, InterfaceC0567a interfaceC0567a) {
        AbstractC2470e.m4446c("Bitmap must not be null", bitmap);
        this.f5010k = bitmap;
        AbstractC2470e.m4446c("BitmapPool must not be null", interfaceC0567a);
        this.f5011l = interfaceC0567a;
    }

    /* renamed from: e */
    public static C1168c m2585e(Bitmap bitmap, InterfaceC0567a interfaceC0567a) {
        if (bitmap == null) {
            return null;
        }
        return new C1168c(bitmap, interfaceC0567a);
    }

    @Override // p005a4.InterfaceC0072b0
    /* renamed from: a */
    public final void mo261a() {
        switch (this.f5009j) {
            case 0:
                ((Bitmap) this.f5010k).prepareToDraw();
                break;
            default:
                InterfaceC0080f0 interfaceC0080f0 = (InterfaceC0080f0) this.f5011l;
                if (interfaceC0080f0 instanceof InterfaceC0072b0) {
                    ((InterfaceC0072b0) interfaceC0080f0).mo261a();
                    break;
                }
                break;
        }
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: b */
    public final void mo305b() {
        switch (this.f5009j) {
            case 0:
                ((InterfaceC0567a) this.f5011l).mo1309e((Bitmap) this.f5010k);
                break;
            default:
                ((InterfaceC0080f0) this.f5011l).mo305b();
                break;
        }
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: c */
    public final int mo306c() {
        switch (this.f5009j) {
            case 0:
                return AbstractC2478m.m4455c((Bitmap) this.f5010k);
            default:
                return ((InterfaceC0080f0) this.f5011l).mo306c();
        }
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: d */
    public final Class mo307d() {
        switch (this.f5009j) {
            case 0:
                return Bitmap.class;
            default:
                return BitmapDrawable.class;
        }
    }

    @Override // p005a4.InterfaceC0080f0
    public final Object get() {
        switch (this.f5009j) {
            case 0:
                return (Bitmap) this.f5010k;
            default:
                return new BitmapDrawable((Resources) this.f5010k, (Bitmap) ((InterfaceC0080f0) this.f5011l).get());
        }
    }

    public C1168c(Resources resources, InterfaceC0080f0 interfaceC0080f0) {
        AbstractC2470e.m4446c("Argument must not be null", resources);
        this.f5010k = resources;
        AbstractC2470e.m4446c("Argument must not be null", interfaceC0080f0);
        this.f5011l = interfaceC0080f0;
    }
}
