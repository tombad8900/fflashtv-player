package p154r6;

import p137p6.InterfaceC2222c;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2987o;
import p220z6.C2988p;
import p220z6.InterfaceC2978f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r6.h */
/* loaded from: classes.dex */
public abstract class AbstractC2325h extends AbstractC2320c implements InterfaceC2978f {

    /* renamed from: m */
    public final int f8135m;

    public AbstractC2325h(int i, InterfaceC2222c interfaceC2222c) {
        super(interfaceC2222c);
        this.f8135m = i;
    }

    @Override // p220z6.InterfaceC2978f
    public final int getArity() {
        return this.f8135m;
    }

    @Override // p154r6.AbstractC2318a
    public final String toString() {
        if (this.f8129j != null) {
            return super.toString();
        }
        AbstractC2987o.f11118a.getClass();
        String strM5143a = C2988p.m5143a(this);
        AbstractC2980h.m5135d("renderLambdaToString(...)", strM5143a);
        return strM5143a;
    }
}
