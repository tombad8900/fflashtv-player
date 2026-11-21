package p002a1;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.n */
/* loaded from: classes.dex */
public final class DialogInterfaceOnDismissListenerC0034n implements DialogInterface.OnDismissListener {

    /* renamed from: j */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0040q f101j;

    public DialogInterfaceOnDismissListenerC0034n(DialogInterfaceOnCancelListenerC0040q dialogInterfaceOnCancelListenerC0040q) {
        this.f101j = dialogInterfaceOnCancelListenerC0040q;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0040q dialogInterfaceOnCancelListenerC0040q = this.f101j;
        Dialog dialog = dialogInterfaceOnCancelListenerC0040q.f164l0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0040q.onDismiss(dialog);
        }
    }
}
