package p175u0;

import android.view.View;
import p168t2.AbstractC2415i0;
import p211y5.InterfaceC2839z;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u0.e */
/* loaded from: classes.dex */
public final class C2453e extends AbstractC2415i0 {

    /* renamed from: a */
    public final /* synthetic */ int f8987a;

    public /* synthetic */ C2453e(int i) {
        this.f8987a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p168t2.AbstractC2415i0
    /* renamed from: D */
    public final void mo3180D(InterfaceC2839z interfaceC2839z, float f8) {
        switch (this.f8987a) {
            case 0:
                ((View) interfaceC2839z).setAlpha(f8);
                break;
            case 1:
                ((View) interfaceC2839z).setScaleX(f8);
                break;
            case 2:
                ((View) interfaceC2839z).setScaleY(f8);
                break;
            case 3:
                ((View) interfaceC2839z).setRotation(f8);
                break;
            case 4:
                ((View) interfaceC2839z).setRotationX(f8);
                break;
            default:
                ((View) interfaceC2839z).setRotationY(f8);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p168t2.AbstractC2415i0
    /* renamed from: q */
    public final float mo3181q(InterfaceC2839z interfaceC2839z) {
        switch (this.f8987a) {
            case 0:
                return ((View) interfaceC2839z).getAlpha();
            case 1:
                return ((View) interfaceC2839z).getScaleX();
            case 2:
                return ((View) interfaceC2839z).getScaleY();
            case 3:
                return ((View) interfaceC2839z).getRotation();
            case 4:
                return ((View) interfaceC2839z).getRotationX();
            default:
                return ((View) interfaceC2839z).getRotationY();
        }
    }
}
