package p216z2;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.a */
/* loaded from: classes.dex */
public final class C2872a {

    /* renamed from: a */
    public int f10602a;

    /* renamed from: b */
    public int f10603b;

    /* renamed from: c */
    public Object f10604c;

    /* renamed from: d */
    public int f10605d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C2872a)) {
                return false;
            }
            C2872a c2872a = (C2872a) obj;
            int i = this.f10602a;
            if (i != c2872a.f10602a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f10605d - this.f10603b) != 1 || this.f10605d != c2872a.f10603b || this.f10603b != c2872a.f10605d) {
                if (this.f10605d != c2872a.f10605d || this.f10603b != c2872a.f10603b) {
                    return false;
                }
                Object obj2 = this.f10604c;
                if (obj2 != null) {
                    if (!obj2.equals(c2872a.f10604c)) {
                        return false;
                    }
                } else if (c2872a.f10604c != null) {
                    return false;
                }
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f10602a * 31) + this.f10603b) * 31) + this.f10605d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f10602a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f10603b);
        sb.append("c:");
        sb.append(this.f10605d);
        sb.append(",p:");
        sb.append(this.f10604c);
        sb.append("]");
        return sb.toString();
    }
}
