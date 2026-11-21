package p154r6;

import p137p6.C2228i;
import p137p6.InterfaceC2222c;
import p137p6.InterfaceC2227h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r6.g */
/* loaded from: classes.dex */
public abstract class AbstractC2324g extends AbstractC2318a {
    public AbstractC2324g(InterfaceC2222c interfaceC2222c) {
        super(interfaceC2222c);
        if (interfaceC2222c != null && interfaceC2222c.mo2249f() != C2228i.f7747j) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // p137p6.InterfaceC2222c
    /* renamed from: f */
    public final InterfaceC2227h mo2249f() {
        return C2228i.f7747j;
    }
}
