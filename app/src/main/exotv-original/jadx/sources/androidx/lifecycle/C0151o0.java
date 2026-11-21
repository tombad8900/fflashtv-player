package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p004a3.C0067e;
import p004a3.InterfaceC0066d;
import p102l6.C1690g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.o0 */
/* loaded from: classes.dex */
public final class C0151o0 implements InterfaceC0066d {

    /* renamed from: a */
    public final C0067e f934a;

    /* renamed from: b */
    public boolean f935b;

    /* renamed from: c */
    public Bundle f936c;

    /* renamed from: d */
    public final C1690g f937d;

    public C0151o0(C0067e c0067e, InterfaceC0163u0 interfaceC0163u0) {
        AbstractC2980h.m5136e("savedStateRegistry", c0067e);
        this.f934a = c0067e;
        this.f937d = new C1690g(new C0149n0(0, interfaceC0163u0));
    }

    @Override // p004a3.InterfaceC0066d
    /* renamed from: a */
    public final Bundle mo238a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f936c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C0153p0) this.f937d.getValue()).f941b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f935b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((AbstractC0141j0) entry.getValue()).getClass();
        throw null;
    }
}
