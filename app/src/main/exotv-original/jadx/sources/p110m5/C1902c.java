package p110m5;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m5.c */
/* loaded from: classes.dex */
public final class C1902c extends ViewOutlineProvider {

    /* renamed from: a */
    public final /* synthetic */ Chip f7113a;

    public C1902c(Chip chip) {
        this.f7113a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        C1905f c1905f = this.f7113a.f3211n;
        if (c1905f != null) {
            c1905f.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
