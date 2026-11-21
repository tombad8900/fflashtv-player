package p118n4;

import androidx.lifecycle.AbstractC0150o;
import androidx.lifecycle.EnumC0146m;
import androidx.lifecycle.EnumC0148n;
import androidx.lifecycle.InterfaceC0125b0;
import androidx.lifecycle.InterfaceC0162u;
import androidx.lifecycle.InterfaceC0164v;
import java.util.ArrayList;
import java.util.HashSet;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n4.h */
/* loaded from: classes.dex */
public final class C2011h implements InterfaceC2010g, InterfaceC0162u {

    /* renamed from: j */
    public final HashSet f7432j = new HashSet();

    /* renamed from: k */
    public final AbstractC0150o f7433k;

    public C2011h(AbstractC0150o abstractC0150o) {
        this.f7433k = abstractC0150o;
        abstractC0150o.mo568a(this);
    }

    @Override // p118n4.InterfaceC2010g
    /* renamed from: a */
    public final void mo3256a(InterfaceC2012i interfaceC2012i) {
        this.f7432j.add(interfaceC2012i);
        AbstractC0150o abstractC0150o = this.f7433k;
        if (abstractC0150o.mo569b() == EnumC0148n.f925j) {
            interfaceC2012i.mo1632d();
        } else if (abstractC0150o.mo569b().compareTo(EnumC0148n.f928m) >= 0) {
            interfaceC2012i.mo1639k();
        } else {
            interfaceC2012i.mo1634f();
        }
    }

    @Override // p118n4.InterfaceC2010g
    /* renamed from: l */
    public final void mo3260l(InterfaceC2012i interfaceC2012i) {
        this.f7432j.remove(interfaceC2012i);
    }

    @InterfaceC0125b0(EnumC0146m.ON_DESTROY)
    public void onDestroy(InterfaceC0164v interfaceC0164v) {
        ArrayList arrayListM4457e = AbstractC2478m.m4457e(this.f7432j);
        int size = arrayListM4457e.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM4457e.get(i);
            i++;
            ((InterfaceC2012i) obj).mo1632d();
        }
        interfaceC0164v.mo224e().mo575i(this);
    }

    @InterfaceC0125b0(EnumC0146m.ON_START)
    public void onStart(InterfaceC0164v interfaceC0164v) {
        ArrayList arrayListM4457e = AbstractC2478m.m4457e(this.f7432j);
        int size = arrayListM4457e.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM4457e.get(i);
            i++;
            ((InterfaceC2012i) obj).mo1639k();
        }
    }

    @InterfaceC0125b0(EnumC0146m.ON_STOP)
    public void onStop(InterfaceC0164v interfaceC0164v) {
        ArrayList arrayListM4457e = AbstractC2478m.m4457e(this.f7432j);
        int size = arrayListM4457e.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM4457e.get(i);
            i++;
            ((InterfaceC2012i) obj).mo1634f();
        }
    }
}
