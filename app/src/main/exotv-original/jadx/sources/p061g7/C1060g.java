package p061g7;

import java.util.Iterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.g */
/* loaded from: classes.dex */
public final class C1060g implements InterfaceC1061h {

    /* renamed from: a */
    public final /* synthetic */ int f4485a;

    /* renamed from: b */
    public final Object f4486b;

    public /* synthetic */ C1060g(int i, Object obj) {
        this.f4485a = i;
        this.f4486b = obj;
    }

    @Override // p061g7.InterfaceC1061h
    public final Iterator iterator() {
        switch (this.f4485a) {
            case 0:
                return new C1059f(this);
            case 1:
                return (Iterator) this.f4486b;
            default:
                return ((Iterable) this.f4486b).iterator();
        }
    }
}
