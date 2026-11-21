package p111m6;

import java.util.AbstractList;
import java.util.List;
import p008a7.InterfaceC0114b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m6.d */
/* loaded from: classes.dex */
public abstract class AbstractC1909d extends AbstractList implements List, InterfaceC0114b {
    /* renamed from: a */
    public abstract int mo3715a();

    /* renamed from: b */
    public abstract Object mo3716b(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return mo3716b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return mo3715a();
    }
}
