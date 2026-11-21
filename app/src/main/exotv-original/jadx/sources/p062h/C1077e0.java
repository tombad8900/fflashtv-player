package p062h;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.bumptech.glide.AbstractC0715d;
import java.util.WeakHashMap;
import p002a1.C0016e;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.e0 */
/* loaded from: classes.dex */
public final class C1077e0 extends AbstractC0715d {

    /* renamed from: n */
    public final /* synthetic */ int f4560n;

    /* renamed from: o */
    public final /* synthetic */ C1081g0 f4561o;

    public /* synthetic */ C1077e0(C1081g0 c1081g0, int i) {
        this.f4560n = i;
        this.f4561o = c1081g0;
    }

    @Override // p105m0.InterfaceC1846s0
    /* renamed from: c */
    public final void mo2256c() {
        View view;
        int i = this.f4560n;
        C1081g0 c1081g0 = this.f4561o;
        switch (i) {
            case 0:
                if (c1081g0.f4577D && (view = c1081g0.f4593v) != null) {
                    view.setTranslationY(0.0f);
                    c1081g0.f4590s.setTranslationY(0.0f);
                }
                c1081g0.f4590s.setVisibility(8);
                c1081g0.f4590s.setTransitioning(false);
                c1081g0.f4581H = null;
                C0016e c0016e = c1081g0.f4597z;
                if (c0016e != null) {
                    c0016e.m37G(c1081g0.f4596y);
                    c1081g0.f4596y = null;
                    c1081g0.f4597z = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c1081g0.f4589r;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    AbstractC1798c0.m3516c(actionBarOverlayLayout);
                    break;
                }
                break;
            default:
                c1081g0.f4581H = null;
                c1081g0.f4590s.requestLayout();
                break;
        }
    }
}
