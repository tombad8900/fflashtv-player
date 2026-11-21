package p041e4;

import java.util.ArrayDeque;
import p178u4.C2474i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e4.o */
/* loaded from: classes.dex */
public final class C0898o extends C2474i {
    @Override // p178u4.C2474i
    /* renamed from: c */
    public final void mo1426c(Object obj, Object obj2) {
        C0899p c0899p = (C0899p) obj;
        c0899p.getClass();
        ArrayDeque arrayDeque = C0899p.f3928b;
        synchronized (arrayDeque) {
            arrayDeque.offer(c0899p);
        }
    }
}
