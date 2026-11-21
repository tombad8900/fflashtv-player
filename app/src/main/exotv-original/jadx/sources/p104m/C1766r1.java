package p104m;

import android.widget.AbsListView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.r1 */
/* loaded from: classes.dex */
public final class C1766r1 implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ C1772t1 f6727a;

    public C1766r1(C1772t1 c1772t1) {
        this.f6727a = c1772t1;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i4, int i8) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        C1772t1 c1772t1 = this.f6727a;
        RunnableC1758p1 runnableC1758p1 = c1772t1.f6752A;
        C1697a0 c1697a0 = c1772t1.f6760I;
        if (i != 1 || c1697a0.getInputMethodMode() == 2 || c1697a0.getContentView() == null) {
            return;
        }
        c1772t1.f6756E.removeCallbacks(runnableC1758p1);
        runnableC1758p1.run();
    }
}
