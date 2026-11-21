package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p002a1.C0016e;
import p015b4.InterfaceC0574h;
import p041e4.C0880a0;
import p041e4.C0883c;
import p041e4.C0907x;
import p041e4.InterfaceC0901r;
import p041e4.InterfaceC0902s;
import p105m0.C1796b1;
import p105m0.C1844r1;
import p178u4.AbstractC2478m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.lifecycle.o */
/* loaded from: classes.dex */
public abstract class AbstractC0150o implements InterfaceC0902s {

    /* renamed from: j */
    public Object f933j;

    public /* synthetic */ AbstractC0150o(Object obj) {
        this.f933j = obj;
    }

    /* renamed from: a */
    public abstract void mo568a(InterfaceC0162u interfaceC0162u);

    /* renamed from: b */
    public abstract EnumC0148n mo569b();

    /* renamed from: c */
    public void m570c(InterfaceC0574h interfaceC0574h) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f933j;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(interfaceC0574h);
        }
    }

    /* renamed from: d */
    public abstract void mo571d(C1796b1 c1796b1);

    /* renamed from: e */
    public abstract void mo572e(C1796b1 c1796b1);

    /* renamed from: f */
    public abstract C1844r1 mo573f(C1844r1 c1844r1, List list);

    @Override // p041e4.InterfaceC0902s
    /* renamed from: g */
    public InterfaceC0901r mo94g(C0907x c0907x) {
        return new C0883c(2, (C0880a0) this.f933j);
    }

    /* renamed from: h */
    public abstract C0016e mo574h(C1796b1 c1796b1, C0016e c0016e);

    /* renamed from: i */
    public abstract void mo575i(InterfaceC0162u interfaceC0162u);

    public AbstractC0150o(int i) {
        switch (i) {
            case 1:
                char[] cArr = AbstractC2478m.f9069a;
                this.f933j = new ArrayDeque(20);
                break;
            case 2:
                this.f933j = new LinkedHashMap();
                break;
            default:
                this.f933j = new AtomicReference(null);
                break;
        }
    }
}
