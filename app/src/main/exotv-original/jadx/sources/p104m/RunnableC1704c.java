package p104m;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.c */
/* loaded from: classes.dex */
public final class RunnableC1704c implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f6512j;

    /* renamed from: k */
    public final /* synthetic */ ActionBarOverlayLayout f6513k;

    public /* synthetic */ RunnableC1704c(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f6512j = i;
        this.f6513k = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6512j) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f6513k;
                actionBarOverlayLayout.m461g();
                actionBarOverlayLayout.f687I = actionBarOverlayLayout.f696m.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f688J);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f6513k;
                actionBarOverlayLayout2.m461g();
                actionBarOverlayLayout2.f687I = actionBarOverlayLayout2.f696m.animate().translationY(-actionBarOverlayLayout2.f696m.getHeight()).setListener(actionBarOverlayLayout2.f688J);
                break;
        }
    }
}
