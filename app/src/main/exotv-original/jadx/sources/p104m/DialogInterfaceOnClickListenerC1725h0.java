package p104m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p062h.C1070b;
import p062h.C1078f;
import p062h.DialogInterfaceC1080g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.h0 */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1725h0 implements InterfaceC1745m0, DialogInterface.OnClickListener {

    /* renamed from: j */
    public DialogInterfaceC1080g f6556j;

    /* renamed from: k */
    public C1729i0 f6557k;

    /* renamed from: l */
    public CharSequence f6558l;

    /* renamed from: m */
    public final /* synthetic */ C1749n0 f6559m;

    public DialogInterfaceOnClickListenerC1725h0(C1749n0 c1749n0) {
        this.f6559m = c1749n0;
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: a */
    public final boolean mo3400a() {
        DialogInterfaceC1080g dialogInterfaceC1080g = this.f6556j;
        if (dialogInterfaceC1080g != null) {
            return dialogInterfaceC1080g.isShowing();
        }
        return false;
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: b */
    public final int mo3401b() {
        return 0;
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: c */
    public final void mo3402c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p104m.InterfaceC1745m0
    public final void dismiss() {
        DialogInterfaceC1080g dialogInterfaceC1080g = this.f6556j;
        if (dialogInterfaceC1080g != null) {
            dialogInterfaceC1080g.dismiss();
            this.f6556j = null;
        }
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: e */
    public final CharSequence mo3403e() {
        return this.f6558l;
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: g */
    public final Drawable mo3404g() {
        return null;
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: i */
    public final void mo3405i(CharSequence charSequence) {
        this.f6558l = charSequence;
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: j */
    public final void mo3406j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: k */
    public final void mo3407k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: l */
    public final void mo3408l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: m */
    public final void mo3409m(int i, int i4) {
        if (this.f6557k == null) {
            return;
        }
        C1749n0 c1749n0 = this.f6559m;
        C1078f c1078f = new C1078f(c1749n0.getPopupContext());
        CharSequence charSequence = this.f6558l;
        if (charSequence != null) {
            c1078f.setTitle(charSequence);
        }
        C1729i0 c1729i0 = this.f6557k;
        int selectedItemPosition = c1749n0.getSelectedItemPosition();
        C1070b c1070b = c1078f.f4562a;
        c1070b.f4516k = c1729i0;
        c1070b.f4517l = this;
        c1070b.f4520o = selectedItemPosition;
        c1070b.f4519n = true;
        DialogInterfaceC1080g dialogInterfaceC1080gCreate = c1078f.create();
        this.f6556j = dialogInterfaceC1080gCreate;
        AlertController$RecycleListView alertController$RecycleListView = dialogInterfaceC1080gCreate.f4571o.f4538e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i4);
        this.f6556j.show();
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: o */
    public final int mo3410o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1749n0 c1749n0 = this.f6559m;
        c1749n0.setSelection(i);
        if (c1749n0.getOnItemClickListener() != null) {
            c1749n0.performItemClick(null, i, this.f6557k.getItemId(i));
        }
        dismiss();
    }

    @Override // p104m.InterfaceC1745m0
    /* renamed from: p */
    public final void mo3411p(ListAdapter listAdapter) {
        this.f6557k = (C1729i0) listAdapter;
    }
}
