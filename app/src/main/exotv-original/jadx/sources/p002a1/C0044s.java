package p002a1;

import android.view.View;
import com.bumptech.glide.AbstractC0714c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.s */
/* loaded from: classes.dex */
public final class C0044s extends AbstractC0714c {

    /* renamed from: p */
    public final /* synthetic */ AbstractComponentCallbacksC0050v f176p;

    public C0044s(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        this.f176p = abstractComponentCallbacksC0050v;
    }

    @Override // com.bumptech.glide.AbstractC0714c
    /* renamed from: U */
    public final View mo175U(int i) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = this.f176p;
        View view = abstractComponentCallbacksC0050v.f222N;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + abstractComponentCallbacksC0050v + " does not have a view");
    }

    @Override // com.bumptech.glide.AbstractC0714c
    /* renamed from: V */
    public final boolean mo176V() {
        return this.f176p.f222N != null;
    }
}
