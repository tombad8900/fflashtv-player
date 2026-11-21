package p104m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.p1 */
/* loaded from: classes.dex */
public final class RunnableC1758p1 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f6706j;

    /* renamed from: k */
    public final /* synthetic */ C1772t1 f6707k;

    public /* synthetic */ RunnableC1758p1(C1772t1 c1772t1, int i) {
        this.f6706j = i;
        this.f6707k = c1772t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6706j) {
            case 0:
                C1730i1 c1730i1 = this.f6707k.f6763l;
                if (c1730i1 != null) {
                    c1730i1.setListSelectionHidden(true);
                    c1730i1.requestLayout();
                    break;
                }
                break;
            default:
                C1772t1 c1772t1 = this.f6707k;
                C1730i1 c1730i12 = c1772t1.f6763l;
                if (c1730i12 != null && c1730i12.isAttachedToWindow() && c1772t1.f6763l.getCount() > c1772t1.f6763l.getChildCount() && c1772t1.f6763l.getChildCount() <= c1772t1.f6773v) {
                    c1772t1.f6760I.setInputMethodMode(2);
                    c1772t1.mo3275f();
                    break;
                }
                break;
        }
    }
}
