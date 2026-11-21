package p044e7;

import java.util.Iterator;
import p008a7.InterfaceC0113a;
import p168t2.AbstractC2429w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e7.a */
/* loaded from: classes.dex */
public class C0924a implements Iterable, InterfaceC0113a {

    /* renamed from: j */
    public final int f3986j;

    /* renamed from: k */
    public final int f3987k;

    /* renamed from: l */
    public final int f3988l;

    public C0924a(int i, int i4, int i8) {
        if (i8 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i8 == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f3986j = i;
        this.f3987k = AbstractC2429w.m4305j(i, i4, i8);
        this.f3988l = i8;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0924a)) {
            return false;
        }
        if (isEmpty() && ((C0924a) obj).isEmpty()) {
            return true;
        }
        C0924a c0924a = (C0924a) obj;
        return this.f3986j == c0924a.f3986j && this.f3987k == c0924a.f3987k && this.f3988l == c0924a.f3988l;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f3986j * 31) + this.f3987k) * 31) + this.f3988l;
    }

    public boolean isEmpty() {
        int i = this.f3988l;
        int i4 = this.f3987k;
        int i8 = this.f3986j;
        return i > 0 ? i8 > i4 : i8 < i4;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C0925b(this.f3986j, this.f3987k, this.f3988l);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f3987k;
        int i4 = this.f3986j;
        int i8 = this.f3988l;
        if (i8 > 0) {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i8);
        } else {
            sb = new StringBuilder();
            sb.append(i4);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i8);
        }
        return sb.toString();
    }
}
