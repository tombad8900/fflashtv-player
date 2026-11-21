package p004a3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p062h.AbstractActivityC1083i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a3.a */
/* loaded from: classes.dex */
public final class C0063a implements InterfaceC0066d {

    /* renamed from: a */
    public final /* synthetic */ int f302a;

    /* renamed from: b */
    public final Object f303b;

    public C0063a(C0067e c0067e) {
        this.f302a = 0;
        this.f303b = new LinkedHashSet();
        c0067e.m254e("androidx.savedstate.Restarter", this);
    }

    @Override // p004a3.InterfaceC0066d
    /* renamed from: a */
    public final Bundle mo238a() {
        switch (this.f302a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f303b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((AbstractActivityC1083i) this.f303b).m2285k().getClass();
                return bundle2;
        }
    }

    public C0063a(AbstractActivityC1083i abstractActivityC1083i) {
        this.f302a = 1;
        this.f303b = abstractActivityC1083i;
    }
}
