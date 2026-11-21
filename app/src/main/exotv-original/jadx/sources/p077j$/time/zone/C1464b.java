package p077j$.time.zone;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p077j$.time.C1351a0;
import p077j$.time.C1424j;

/* renamed from: j$.time.zone.b */
/* loaded from: classes2.dex */
public final class C1464b implements Comparable, Serializable {

    /* renamed from: e */
    public static final /* synthetic */ int f5645e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* renamed from: a */
    public final long f5646a;

    /* renamed from: b */
    public final C1424j f5647b;

    /* renamed from: c */
    public final C1351a0 f5648c;

    /* renamed from: d */
    public final C1351a0 f5649d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f5646a, ((C1464b) obj).f5646a);
    }

    public C1464b(C1424j c1424j, C1351a0 c1351a0, C1351a0 c1351a02) {
        this.f5646a = c1424j.m2956v(c1351a0);
        this.f5647b = c1424j;
        this.f5648c = c1351a0;
        this.f5649d = c1351a02;
    }

    public C1464b(long j, C1351a0 c1351a0, C1351a0 c1351a02) {
        this.f5646a = j;
        this.f5647b = C1424j.m3056P(j, 0, c1351a0);
        this.f5648c = c1351a0;
        this.f5649d = c1351a02;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new C1463a((byte) 2, this);
    }

    /* renamed from: w */
    public final boolean m3128w() {
        return this.f5649d.f5419b > this.f5648c.f5419b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1464b) {
            C1464b c1464b = (C1464b) obj;
            if (this.f5646a == c1464b.f5646a && this.f5648c.equals(c1464b.f5648c) && this.f5649d.equals(c1464b.f5649d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f5647b.hashCode() ^ this.f5648c.f5419b) ^ Integer.rotateLeft(this.f5649d.f5419b, 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(m3128w() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f5647b);
        sb.append(this.f5648c);
        sb.append(" to ");
        sb.append(this.f5649d);
        sb.append(']');
        return sb.toString();
    }
}
