package p120o;

import java.util.HashMap;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o.a */
/* loaded from: classes.dex */
public final class C2029a extends C2034f {

    /* renamed from: n */
    public final HashMap f7488n = new HashMap();

    @Override // p120o.C2034f
    /* renamed from: a */
    public final C2031c mo3921a(Object obj) {
        return (C2031c) this.f7488n.get(obj);
    }

    @Override // p120o.C2034f
    /* renamed from: b */
    public final Object mo3922b(Object obj) {
        Object objMo3922b = super.mo3922b(obj);
        this.f7488n.remove(obj);
        return objMo3922b;
    }
}
