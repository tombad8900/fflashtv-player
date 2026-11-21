package p102l6;

import java.io.Serializable;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l6.e */
/* loaded from: classes.dex */
public final class C1688e implements Serializable {

    /* renamed from: j */
    public final Throwable f6488j;

    public C1688e(Throwable th) {
        AbstractC2980h.m5136e("exception", th);
        this.f6488j = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1688e) {
            return AbstractC2980h.m5132a(this.f6488j, ((C1688e) obj).f6488j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6488j.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f6488j + ')';
    }
}
