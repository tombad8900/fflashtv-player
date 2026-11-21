package p110m5;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p162s5.C2372j;
import p162s5.InterfaceC2371i;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m5.b */
/* loaded from: classes.dex */
public final class C1901b extends AbstractC2415i0 {

    /* renamed from: a */
    public final /* synthetic */ int f7111a;

    /* renamed from: b */
    public final /* synthetic */ Object f7112b;

    public /* synthetic */ C1901b(int i, Object obj) {
        this.f7111a = i;
        this.f7112b = obj;
    }

    /* renamed from: J */
    private final void m3674J(int i) {
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: v */
    public final void mo3675v(int i) {
        switch (this.f7111a) {
            case 0:
                break;
            default:
                C2372j c2372j = (C2372j) this.f7112b;
                c2372j.f8368d = true;
                InterfaceC2371i interfaceC2371i = (InterfaceC2371i) c2372j.f8369e.get();
                if (interfaceC2371i != null) {
                    C1905f c1905f = (C1905f) interfaceC2371i;
                    c1905f.m3684D();
                    c1905f.invalidateSelf();
                    break;
                }
                break;
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: w */
    public final void mo3676w(Typeface typeface, boolean z7) {
        switch (this.f7111a) {
            case 0:
                Chip chip = (Chip) this.f7112b;
                C1905f c1905f = chip.f3211n;
                chip.setText(c1905f.f7143U0 ? c1905f.f7146W : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z7) {
                    C2372j c2372j = (C2372j) this.f7112b;
                    c2372j.f8368d = true;
                    InterfaceC2371i interfaceC2371i = (InterfaceC2371i) c2372j.f8369e.get();
                    if (interfaceC2371i != null) {
                        C1905f c1905f2 = (C1905f) interfaceC2371i;
                        c1905f2.m3684D();
                        c1905f2.invalidateSelf();
                        break;
                    }
                }
                break;
        }
    }
}
