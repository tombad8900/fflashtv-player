package p002a1;

import android.app.Dialog;
import android.view.View;
import com.bumptech.glide.AbstractC0714c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.p */
/* loaded from: classes.dex */
public final class C0038p extends AbstractC0714c {

    /* renamed from: p */
    public final /* synthetic */ C0044s f152p;

    /* renamed from: q */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0040q f153q;

    public C0038p(DialogInterfaceOnCancelListenerC0040q dialogInterfaceOnCancelListenerC0040q, C0044s c0044s) {
        this.f153q = dialogInterfaceOnCancelListenerC0040q;
        this.f152p = c0044s;
    }

    @Override // com.bumptech.glide.AbstractC0714c
    /* renamed from: U */
    public final View mo175U(int i) {
        C0044s c0044s = this.f152p;
        if (c0044s.mo176V()) {
            return c0044s.mo175U(i);
        }
        Dialog dialog = this.f153q.f164l0;
        if (dialog != null) {
            return dialog.findViewById(i);
        }
        return null;
    }

    @Override // com.bumptech.glide.AbstractC0714c
    /* renamed from: V */
    public final boolean mo176V() {
        return this.f152p.mo176V() || this.f153q.f167o0;
    }
}
