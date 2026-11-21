package p061g7;

import java.util.Iterator;
import p008a7.InterfaceC0113a;
import p069h7.C1200b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.m */
/* loaded from: classes.dex */
public final class C1066m implements Iterable, InterfaceC0113a {

    /* renamed from: j */
    public final /* synthetic */ C1058e f4492j;

    public C1066m(C1058e c1058e) {
        this.f4492j = c1058e;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C1200b(this.f4492j);
    }
}
