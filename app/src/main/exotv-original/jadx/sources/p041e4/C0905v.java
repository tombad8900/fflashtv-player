package p041e4;

import com.bumptech.glide.EnumC0717f;
import com.bumptech.glide.load.data.InterfaceC0727d;
import com.bumptech.glide.load.data.InterfaceC0728e;
import java.util.ArrayList;
import java.util.List;
import p005a4.C0070a0;
import p096l0.InterfaceC1642b;
import p178u4.AbstractC2470e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.v */
/* loaded from: classes.dex */
public final class C0905v implements InterfaceC0728e, InterfaceC0727d {

    /* renamed from: j */
    public final ArrayList f3936j;

    /* renamed from: k */
    public final InterfaceC1642b f3937k;

    /* renamed from: l */
    public int f3938l;

    /* renamed from: m */
    public EnumC0717f f3939m;

    /* renamed from: n */
    public InterfaceC0727d f3940n;

    /* renamed from: o */
    public List f3941o;

    /* renamed from: p */
    public boolean f3942p;

    public C0905v(ArrayList arrayList, InterfaceC1642b interfaceC1642b) {
        this.f3937k = interfaceC1642b;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f3936j = arrayList;
        this.f3938l = 0;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: a */
    public final Class mo1641a() {
        return ((InterfaceC0728e) this.f3936j.get(0)).mo1641a();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: b */
    public final void mo1646b() {
        List list = this.f3941o;
        if (list != null) {
            this.f3937k.mo285g(list);
        }
        this.f3941o = null;
        ArrayList arrayList = this.f3936j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC0728e) obj).mo1646b();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: c */
    public final int mo1647c() {
        return ((InterfaceC0728e) this.f3936j.get(0)).mo1647c();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    public final void cancel() {
        this.f3942p = true;
        ArrayList arrayList = this.f3936j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC0728e) obj).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0727d
    /* renamed from: d */
    public final void mo47d(Exception exc) {
        List list = this.f3941o;
        AbstractC2470e.m4446c("Argument must not be null", list);
        list.add(exc);
        m2069g();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0728e
    /* renamed from: e */
    public final void mo1648e(EnumC0717f enumC0717f, InterfaceC0727d interfaceC0727d) {
        this.f3939m = enumC0717f;
        this.f3940n = interfaceC0727d;
        this.f3941o = (List) this.f3937k.acquire();
        ((InterfaceC0728e) this.f3936j.get(this.f3938l)).mo1648e(enumC0717f, this);
        if (this.f3942p) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0727d
    /* renamed from: f */
    public final void mo49f(Object obj) {
        if (obj != null) {
            this.f3940n.mo49f(obj);
        } else {
            m2069g();
        }
    }

    /* renamed from: g */
    public final void m2069g() {
        if (this.f3942p) {
            return;
        }
        if (this.f3938l < this.f3936j.size() - 1) {
            this.f3938l++;
            mo1648e(this.f3939m, this.f3940n);
        } else {
            AbstractC2470e.m4445b(this.f3941o);
            this.f3940n.mo47d(new C0070a0("Fetch failed", new ArrayList(this.f3941o)));
        }
    }
}
