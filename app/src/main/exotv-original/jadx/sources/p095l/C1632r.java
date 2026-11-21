package p095l;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p087k.InterfaceC1537b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.r */
/* loaded from: classes.dex */
public final class C1632r extends FrameLayout implements InterfaceC1537b {

    /* renamed from: j */
    public final CollapsibleActionView f6261j;

    /* JADX WARN: Multi-variable type inference failed */
    public C1632r(View view) {
        super(view.getContext());
        this.f6261j = (CollapsibleActionView) view;
        addView(view);
    }
}
