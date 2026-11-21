package p002a1;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.m */
/* loaded from: classes.dex */
public final class DialogInterfaceOnCancelListenerC0032m implements DialogInterface.OnCancelListener {

    /* renamed from: j */
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0040q f98j;

    public DialogInterfaceOnCancelListenerC0032m(DialogInterfaceOnCancelListenerC0040q dialogInterfaceOnCancelListenerC0040q) {
        this.f98j = dialogInterfaceOnCancelListenerC0040q;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterfaceOnCancelListenerC0040q dialogInterfaceOnCancelListenerC0040q = this.f98j;
        Dialog dialog = dialogInterfaceOnCancelListenerC0040q.f164l0;
        if (dialog != null) {
            dialogInterfaceOnCancelListenerC0040q.onCancel(dialog);
        }
    }
}
