package p052f6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p043e6.InterfaceC0918f;
import p156s.AbstractC2334g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.x0 */
/* loaded from: classes.dex */
public final class C1016x0 extends AbstractC1023z1 {

    /* renamed from: j */
    public int f4285j;

    /* renamed from: k */
    public Object f4286k;

    /* renamed from: l */
    public final /* synthetic */ int f4287l;

    /* renamed from: m */
    public final Iterator f4288m;

    /* renamed from: n */
    public final /* synthetic */ Object f4289n;

    public C1016x0() {
        this.f4285j = 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        Object next;
        int i = this.f4285j;
        if (i == 4) {
            throw new IllegalStateException();
        }
        int iM4162a = AbstractC2334g.m4162a(i);
        if (iM4162a == 0) {
            return true;
        }
        if (iM4162a == 2) {
            return false;
        }
        this.f4285j = 4;
        switch (this.f4287l) {
            case 0:
                do {
                    Iterator it = this.f4288m;
                    if (!it.hasNext()) {
                        this.f4285j = 3;
                        next = null;
                        break;
                    } else {
                        next = it.next();
                    }
                } while (!((InterfaceC0918f) this.f4289n).apply(next));
            default:
                do {
                    Iterator it2 = this.f4288m;
                    if (!it2.hasNext()) {
                        this.f4285j = 3;
                        next = null;
                        break;
                    } else {
                        next = it2.next();
                    }
                } while (!((C1005t1) this.f4289n).f4268k.contains(next));
        }
        this.f4286k = next;
        if (this.f4285j == 3) {
            return false;
        }
        this.f4285j = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f4285j = 2;
        Object obj = this.f4286k;
        this.f4286k = null;
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1016x0(Iterator it, InterfaceC0918f interfaceC0918f) {
        this();
        this.f4287l = 0;
        this.f4288m = it;
        this.f4289n = interfaceC0918f;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1016x0(C1005t1 c1005t1) {
        this();
        this.f4287l = 1;
        this.f4289n = c1005t1;
        this.f4288m = c1005t1.f4267j.iterator();
    }
}
