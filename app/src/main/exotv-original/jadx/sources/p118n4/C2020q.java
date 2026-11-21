package p118n4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import p152r4.InterfaceC2314e;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.q */
/* loaded from: classes.dex */
public final class C2020q implements InterfaceC2012i {

    /* renamed from: j */
    public final Set f7452j = Collections.newSetFromMap(new WeakHashMap());

    @Override // p118n4.InterfaceC2012i
    /* renamed from: d */
    public final void mo1632d() {
        ArrayList arrayListM4457e = AbstractC2478m.m4457e(this.f7452j);
        int size = arrayListM4457e.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM4457e.get(i);
            i++;
            ((InterfaceC2314e) obj).mo1632d();
        }
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: f */
    public final void mo1634f() {
        ArrayList arrayListM4457e = AbstractC2478m.m4457e(this.f7452j);
        int size = arrayListM4457e.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM4457e.get(i);
            i++;
            ((InterfaceC2314e) obj).mo1634f();
        }
    }

    @Override // p118n4.InterfaceC2012i
    /* renamed from: k */
    public final void mo1639k() {
        ArrayList arrayListM4457e = AbstractC2478m.m4457e(this.f7452j);
        int size = arrayListM4457e.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM4457e.get(i);
            i++;
            ((InterfaceC2314e) obj).mo1639k();
        }
    }
}
