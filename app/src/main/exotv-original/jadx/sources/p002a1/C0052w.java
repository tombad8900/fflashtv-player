package p002a1;

import android.os.Bundle;
import androidx.lifecycle.EnumC0146m;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p004a3.InterfaceC0066d;
import p010b.C0520j;
import p062h.AbstractActivityC1083i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C0052w implements InterfaceC0066d {

    /* renamed from: a */
    public final /* synthetic */ int f262a;

    /* renamed from: b */
    public final /* synthetic */ Object f263b;

    public /* synthetic */ C0052w(int i, Object obj) {
        this.f262a = i;
        this.f263b = obj;
    }

    @Override // p004a3.InterfaceC0066d
    /* renamed from: a */
    public final Bundle mo238a() {
        switch (this.f262a) {
            case 0:
                AbstractActivityC1083i abstractActivityC1083i = (AbstractActivityC1083i) this.f263b;
                while (AbstractActivityC1083i.m2284l(((C0058z) abstractActivityC1083i.f4599B.f143k).f280s)) {
                }
                abstractActivityC1083i.f4600C.m585l(EnumC0146m.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC1083i abstractActivityC1083i2 = (AbstractActivityC1083i) this.f263b;
                Bundle bundle = new Bundle();
                C0520j c0520j = abstractActivityC1083i2.f2144q;
                c0520j.getClass();
                LinkedHashMap linkedHashMap = c0520j.f2129b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0520j.f2131d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0520j.f2134g));
                return bundle;
            default:
                return ((C0035n0) this.f263b).m126T();
        }
    }
}
