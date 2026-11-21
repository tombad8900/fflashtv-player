package p195w4;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import p216z2.AbstractC2879c0;
import p216z2.C2912r0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.n */
/* loaded from: classes.dex */
public final class C2677n extends AbstractC2879c0 {

    /* renamed from: a */
    public final int f9724a;

    /* renamed from: b */
    public final int f9725b;

    public C2677n(int i, int i4) {
        this.f9724a = i;
        this.f9725b = i4;
    }

    @Override // p216z2.AbstractC2879c0
    /* renamed from: a */
    public final void mo4754a(Rect rect, View view, RecyclerView recyclerView, C2912r0 c2912r0) {
        AbstractC2980h.m5136e("outRect", rect);
        AbstractC2980h.m5136e("view", view);
        AbstractC2980h.m5136e("state", c2912r0);
        int i = this.f9724a / 2;
        int i4 = this.f9725b / 2;
        rect.set(i, i4, i, i4);
    }
}
