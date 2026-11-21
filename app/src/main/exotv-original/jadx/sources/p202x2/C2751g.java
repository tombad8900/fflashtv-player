package p202x2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x2.g */
/* loaded from: classes.dex */
public final class C2751g {

    /* renamed from: a */
    public final int f10149a;

    /* renamed from: b */
    public final int f10150b;

    /* renamed from: c */
    public final long f10151c;

    /* renamed from: d */
    public final long f10152d;

    public C2751g(int i, int i4, long j, long j8) {
        this.f10149a = i;
        this.f10150b = i4;
        this.f10151c = j;
        this.f10152d = j8;
    }

    /* renamed from: a */
    public static C2751g m4832a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C2751g c2751g = new C2751g(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c2751g;
        } finally {
        }
    }

    /* renamed from: b */
    public final void m4833b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f10149a);
            dataOutputStream.writeInt(this.f10150b);
            dataOutputStream.writeLong(this.f10151c);
            dataOutputStream.writeLong(this.f10152d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C2751g)) {
            C2751g c2751g = (C2751g) obj;
            if (this.f10150b == c2751g.f10150b && this.f10151c == c2751g.f10151c && this.f10149a == c2751g.f10149a && this.f10152d == c2751g.f10152d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f10150b), Long.valueOf(this.f10151c), Integer.valueOf(this.f10149a), Long.valueOf(this.f10152d));
    }
}
