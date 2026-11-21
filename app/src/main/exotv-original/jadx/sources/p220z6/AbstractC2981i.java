package p220z6;

import java.io.Serializable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z6.i */
/* loaded from: classes.dex */
public abstract class AbstractC2981i implements InterfaceC2978f, Serializable {
    private final int arity;

    public AbstractC2981i(int i) {
        this.arity = i;
    }

    @Override // p220z6.InterfaceC2978f
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        AbstractC2987o.f11118a.getClass();
        String strM5143a = C2988p.m5143a(this);
        AbstractC2980h.m5135d("renderLambdaToString(...)", strM5143a);
        return strM5143a;
    }
}
