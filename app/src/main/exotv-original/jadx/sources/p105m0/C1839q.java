package p105m0;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.q */
/* loaded from: classes.dex */
public final class C1839q implements InterfaceC1842r {

    /* renamed from: j */
    public final ScrollFeedbackProvider f6929j;

    public C1839q(NestedScrollView nestedScrollView) {
        this.f6929j = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // p105m0.InterfaceC1842r
    public final void onScrollLimit(int i, int i4, int i8, boolean z7) {
        this.f6929j.onScrollLimit(i, i4, i8, z7);
    }

    @Override // p105m0.InterfaceC1842r
    public final void onScrollProgress(int i, int i4, int i8, int i9) {
        this.f6929j.onScrollProgress(i, i4, i8, i9);
    }
}
