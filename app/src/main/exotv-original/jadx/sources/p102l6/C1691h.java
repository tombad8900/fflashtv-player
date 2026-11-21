package p102l6;

import java.io.Serializable;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l6.h */
/* loaded from: classes.dex */
public final class C1691h implements Serializable {

    /* renamed from: j */
    public final Integer f6493j;

    /* renamed from: k */
    public final Integer f6494k;

    /* renamed from: l */
    public final Integer f6495l;

    public C1691h(Integer num, Integer num2, Integer num3) {
        this.f6493j = num;
        this.f6494k = num2;
        this.f6495l = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1691h)) {
            return false;
        }
        C1691h c1691h = (C1691h) obj;
        return this.f6493j.equals(c1691h.f6493j) && this.f6494k.equals(c1691h.f6494k) && this.f6495l.equals(c1691h.f6495l);
    }

    public final int hashCode() {
        return this.f6495l.hashCode() + ((this.f6494k.hashCode() + (this.f6493j.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "(" + this.f6493j + ", " + this.f6494k + ", " + this.f6495l + ')';
    }
}
