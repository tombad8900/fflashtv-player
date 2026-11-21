package p061g7;

import java.util.Iterator;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.c */
/* loaded from: classes.dex */
public final class C1056c implements InterfaceC1061h {

    /* renamed from: a */
    public final InterfaceC1061h f4473a;

    /* renamed from: b */
    public final int f4474b;

    public C1056c(InterfaceC1061h interfaceC1061h, int i) {
        this.f4473a = interfaceC1061h;
        this.f4474b = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // p061g7.InterfaceC1061h
    public final Iterator iterator() {
        return new C1055b(this);
    }
}
