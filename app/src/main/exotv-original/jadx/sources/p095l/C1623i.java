package p095l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
import p062h.C1070b;
import p062h.C1078f;
import p062h.DialogInterfaceC1080g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l.i */
/* loaded from: classes.dex */
public final class C1623i implements InterfaceC1640z, AdapterView.OnItemClickListener {

    /* renamed from: j */
    public Context f6189j;

    /* renamed from: k */
    public LayoutInflater f6190k;

    /* renamed from: l */
    public MenuC1627m f6191l;

    /* renamed from: m */
    public ExpandedMenuView f6192m;

    /* renamed from: n */
    public InterfaceC1639y f6193n;

    /* renamed from: o */
    public C1622h f6194o;

    public C1623i(Context context) {
        this.f6189j = context;
        this.f6190k = LayoutInflater.from(context);
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: b */
    public final void mo3277b(MenuC1627m menuC1627m, boolean z7) {
        InterfaceC1639y interfaceC1639y = this.f6193n;
        if (interfaceC1639y != null) {
            interfaceC1639y.mo2315b(menuC1627m, z7);
        }
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: c */
    public final boolean mo3301c(C1630p c1630p) {
        return false;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: d */
    public final boolean mo3278d() {
        return false;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: e */
    public final void mo3279e() {
        C1622h c1622h = this.f6194o;
        if (c1622h != null) {
            c1622h.notifyDataSetChanged();
        }
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: g */
    public final void mo3280g(InterfaceC1639y interfaceC1639y) {
        throw null;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: i */
    public final void mo3302i(Context context, MenuC1627m menuC1627m) {
        if (this.f6189j != null) {
            this.f6189j = context;
            if (this.f6190k == null) {
                this.f6190k = LayoutInflater.from(context);
            }
        }
        this.f6191l = menuC1627m;
        C1622h c1622h = this.f6194o;
        if (c1622h != null) {
            c1622h.notifyDataSetChanged();
        }
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: j */
    public final boolean mo3281j(SubMenuC1620f0 subMenuC1620f0) {
        boolean zHasVisibleItems = subMenuC1620f0.hasVisibleItems();
        Context context = subMenuC1620f0.f6209j;
        if (!zHasVisibleItems) {
            return false;
        }
        DialogInterfaceOnKeyListenerC1628n dialogInterfaceOnKeyListenerC1628n = new DialogInterfaceOnKeyListenerC1628n();
        dialogInterfaceOnKeyListenerC1628n.f6226j = subMenuC1620f0;
        C1078f c1078f = new C1078f(context);
        C1623i c1623i = new C1623i(c1078f.getContext());
        dialogInterfaceOnKeyListenerC1628n.f6228l = c1623i;
        c1623i.f6193n = dialogInterfaceOnKeyListenerC1628n;
        subMenuC1620f0.m3307b(c1623i, context);
        C1623i c1623i2 = dialogInterfaceOnKeyListenerC1628n.f6228l;
        if (c1623i2.f6194o == null) {
            c1623i2.f6194o = new C1622h(c1623i2);
        }
        C1622h c1622h = c1623i2.f6194o;
        C1070b c1070b = c1078f.f4562a;
        c1070b.f4516k = c1622h;
        c1070b.f4517l = dialogInterfaceOnKeyListenerC1628n;
        View view = subMenuC1620f0.f6223x;
        if (view != null) {
            c1070b.f4510e = view;
        } else {
            c1070b.f4508c = subMenuC1620f0.f6222w;
            c1078f.setTitle(subMenuC1620f0.f6221v);
        }
        c1070b.f4515j = dialogInterfaceOnKeyListenerC1628n;
        DialogInterfaceC1080g dialogInterfaceC1080gCreate = c1078f.create();
        dialogInterfaceOnKeyListenerC1628n.f6227k = dialogInterfaceC1080gCreate;
        dialogInterfaceC1080gCreate.setOnDismissListener(dialogInterfaceOnKeyListenerC1628n);
        WindowManager.LayoutParams attributes = dialogInterfaceOnKeyListenerC1628n.f6227k.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        dialogInterfaceOnKeyListenerC1628n.f6227k.show();
        InterfaceC1639y interfaceC1639y = this.f6193n;
        if (interfaceC1639y == null) {
            return true;
        }
        interfaceC1639y.mo2316i(subMenuC1620f0);
        return true;
    }

    @Override // p095l.InterfaceC1640z
    /* renamed from: k */
    public final boolean mo3303k(C1630p c1630p) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f6191l.m3314q(this.f6194o.getItem(i), this, 0);
    }
}
