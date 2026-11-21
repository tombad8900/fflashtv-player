package p044e7;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e7.c */
/* loaded from: classes.dex */
public final class C0926c extends C0924a {

    /* renamed from: m */
    public static final C0926c f3993m = new C0926c(1, 0, 1);

    @Override // p044e7.C0924a
    public final boolean equals(Object obj) {
        if (!(obj instanceof C0926c)) {
            return false;
        }
        if (isEmpty() && ((C0926c) obj).isEmpty()) {
            return true;
        }
        C0926c c0926c = (C0926c) obj;
        return this.f3986j == c0926c.f3986j && this.f3987k == c0926c.f3987k;
    }

    @Override // p044e7.C0924a
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f3986j * 31) + this.f3987k;
    }

    @Override // p044e7.C0924a
    public final boolean isEmpty() {
        return this.f3986j > this.f3987k;
    }

    @Override // p044e7.C0924a
    public final String toString() {
        return this.f3986j + ".." + this.f3987k;
    }
}
