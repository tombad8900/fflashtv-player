package p077j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import p077j$.time.C1354c;

/* renamed from: j$.time.temporal.v */
/* loaded from: classes2.dex */
public final class C1456v implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* renamed from: a */
    public final long f5627a;

    /* renamed from: b */
    public final long f5628b;

    /* renamed from: c */
    public final long f5629c;

    /* renamed from: d */
    public final long f5630d;

    /* renamed from: f */
    public static C1456v m3103f(long j, long j8) {
        if (j > j8) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C1456v(j, j, j8, j8);
    }

    /* renamed from: g */
    public static C1456v m3104g(long j, long j8) {
        if (j > j8) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j8) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new C1456v(1L, 1L, j, j8);
    }

    public C1456v(long j, long j8, long j9, long j10) {
        this.f5627a = j;
        this.f5628b = j8;
        this.f5629c = j9;
        this.f5630d = j10;
    }

    /* renamed from: d */
    public final boolean m3108d() {
        return this.f5627a >= -2147483648L && this.f5630d <= 2147483647L;
    }

    /* renamed from: e */
    public final boolean m3109e(long j) {
        return j >= this.f5627a && j <= this.f5630d;
    }

    /* renamed from: a */
    public final int m3105a(long j, InterfaceC1452r interfaceC1452r) {
        if (m3108d() && m3109e(j)) {
            return (int) j;
        }
        throw new C1354c(m3107c(j, interfaceC1452r));
    }

    /* renamed from: b */
    public final void m3106b(long j, InterfaceC1452r interfaceC1452r) {
        if (!m3109e(j)) {
            throw new C1354c(m3107c(j, interfaceC1452r));
        }
    }

    /* renamed from: c */
    public final String m3107c(long j, InterfaceC1452r interfaceC1452r) {
        if (interfaceC1452r != null) {
            return "Invalid value for " + interfaceC1452r + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.f5627a;
        long j8 = this.f5628b;
        if (j > j8) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j9 = this.f5629c;
        long j10 = this.f5630d;
        if (j9 > j10) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j8 > j10) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1456v) {
            C1456v c1456v = (C1456v) obj;
            if (this.f5627a == c1456v.f5627a && this.f5628b == c1456v.f5628b && this.f5629c == c1456v.f5629c && this.f5630d == c1456v.f5630d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f5627a;
        long j8 = this.f5628b;
        long j9 = j + (j8 << 16) + (j8 >> 48);
        long j10 = this.f5629c;
        long j11 = j9 + (j10 << 32) + (j10 >> 32);
        long j12 = this.f5630d;
        long j13 = j11 + (j12 << 48) + (j12 >> 16);
        return (int) (j13 ^ (j13 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5627a);
        if (this.f5627a != this.f5628b) {
            sb.append('/');
            sb.append(this.f5628b);
        }
        sb.append(" - ");
        sb.append(this.f5629c);
        if (this.f5629c != this.f5630d) {
            sb.append('/');
            sb.append(this.f5630d);
        }
        return sb.toString();
    }
}
