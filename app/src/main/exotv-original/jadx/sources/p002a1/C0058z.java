package p002a1;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.C0161t0;
import androidx.lifecycle.InterfaceC0163u0;
import androidx.lifecycle.InterfaceC0164v;
import com.bumptech.glide.AbstractC0714c;
import p004a3.C0067e;
import p004a3.InterfaceC0068f;
import p062h.AbstractActivityC1083i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.z */
/* loaded from: classes.dex */
public final class C0058z extends AbstractC0714c implements InterfaceC0163u0, InterfaceC0164v, InterfaceC0068f, InterfaceC0043r0 {

    /* renamed from: p */
    public final AbstractActivityC1083i f277p;

    /* renamed from: q */
    public final AbstractActivityC1083i f278q;

    /* renamed from: r */
    public final Handler f279r;

    /* renamed from: s */
    public final C0035n0 f280s;

    /* renamed from: t */
    public final /* synthetic */ AbstractActivityC1083i f281t;

    public C0058z(AbstractActivityC1083i abstractActivityC1083i) {
        this.f281t = abstractActivityC1083i;
        Handler handler = new Handler();
        this.f280s = new C0035n0();
        this.f277p = abstractActivityC1083i;
        this.f278q = abstractActivityC1083i;
        this.f279r = handler;
    }

    @Override // com.bumptech.glide.AbstractC0714c
    /* renamed from: U */
    public final View mo175U(int i) {
        return this.f281t.findViewById(i);
    }

    @Override // com.bumptech.glide.AbstractC0714c
    /* renamed from: V */
    public final boolean mo176V() {
        Window window = this.f281t.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p002a1.InterfaceC0043r0
    /* renamed from: a */
    public final void mo89a() {
    }

    @Override // androidx.lifecycle.InterfaceC0163u0
    /* renamed from: b */
    public final C0161t0 mo222b() {
        return this.f281t.mo222b();
    }

    @Override // p004a3.InterfaceC0068f
    /* renamed from: c */
    public final C0067e mo223c() {
        return (C0067e) this.f281t.f2140m.f7451m;
    }

    @Override // androidx.lifecycle.InterfaceC0164v
    /* renamed from: e */
    public final AbstractC0150o mo224e() {
        return this.f281t.f4600C;
    }
}
