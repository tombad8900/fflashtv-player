package p211y5;

import androidx.media3.exoplayer.source.preload.C0456a;
import com.google.android.material.button.MaterialButton;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.i */
/* loaded from: classes.dex */
public final class C2822i extends AbstractC2415i0 {

    /* renamed from: a */
    public final int f10475a;

    public C2822i(int i) {
        this.f10475a = i;
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: D */
    public final void mo3180D(InterfaceC2839z interfaceC2839z, float f8) {
        C2823j c2823j = (C2823j) interfaceC2839z;
        float[] fArr = c2823j.f10488K;
        if (fArr != null) {
            int i = this.f10475a;
            if (fArr[i] != f8) {
                fArr[i] = f8;
                C0456a c0456a = c2823j.f10490M;
                if (c0456a != null) {
                    float fM4936h = c2823j.m4936h();
                    MaterialButton materialButton = (MaterialButton) c0456a.f1850k;
                    int i4 = (int) (fM4936h * 0.11f);
                    if (materialButton.f3171O != i4) {
                        materialButton.f3171O = i4;
                        materialButton.m1822x();
                        materialButton.invalidate();
                    }
                }
                c2823j.invalidateSelf();
            }
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: q */
    public final float mo3181q(InterfaceC2839z interfaceC2839z) {
        float[] fArr = ((C2823j) interfaceC2839z).f10488K;
        if (fArr != null) {
            return fArr[this.f10475a];
        }
        return 0.0f;
    }
}
