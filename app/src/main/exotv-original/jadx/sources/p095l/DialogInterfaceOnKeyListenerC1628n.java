package p095l;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import p062h.DialogInterfaceC1080g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.n */
/* loaded from: classes.dex */
public final class DialogInterfaceOnKeyListenerC1628n implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC1639y {

    /* renamed from: j */
    public SubMenuC1620f0 f6226j;

    /* renamed from: k */
    public DialogInterfaceC1080g f6227k;

    /* renamed from: l */
    public C1623i f6228l;

    @Override // p095l.InterfaceC1639y
    /* renamed from: b */
    public final void mo2315b(MenuC1627m menuC1627m, boolean z7) {
        DialogInterfaceC1080g dialogInterfaceC1080g;
        if ((z7 || menuC1627m == this.f6226j) && (dialogInterfaceC1080g = this.f6227k) != null) {
            dialogInterfaceC1080g.dismiss();
        }
    }

    @Override // p095l.InterfaceC1639y
    /* renamed from: i */
    public final boolean mo2316i(MenuC1627m menuC1627m) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        SubMenuC1620f0 subMenuC1620f0 = this.f6226j;
        C1623i c1623i = this.f6228l;
        if (c1623i.f6194o == null) {
            c1623i.f6194o = new C1622h(c1623i);
        }
        subMenuC1620f0.m3314q(c1623i.f6194o.getItem(i), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f6228l.mo3277b(this.f6226j, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        SubMenuC1620f0 subMenuC1620f0 = this.f6226j;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f6227k.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f6227k.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                subMenuC1620f0.m3308c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return subMenuC1620f0.performShortcut(i, keyEvent, 0);
    }
}
