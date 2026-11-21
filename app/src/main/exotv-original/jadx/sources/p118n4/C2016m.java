package p118n4;

import java.util.ArrayList;
import java.util.HashSet;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.m */
/* loaded from: classes.dex */
public final class C2016m implements InterfaceC2004a {

    /* renamed from: a */
    public final /* synthetic */ C2019p f7441a;

    public C2016m(C2019p c2019p) {
        this.f7441a = c2019p;
    }

    @Override // p118n4.InterfaceC2004a
    /* renamed from: a */
    public final void mo1640a(boolean z7) {
        ArrayList arrayList;
        AbstractC2478m.m4453a();
        synchronized (this.f7441a) {
            arrayList = new ArrayList((HashSet) this.f7441a.f7451m);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((InterfaceC2004a) obj).mo1640a(z7);
        }
    }
}
