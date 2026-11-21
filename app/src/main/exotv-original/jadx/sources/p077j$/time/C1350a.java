package p077j$.time;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.a */
/* loaded from: classes2.dex */
public final class C1350a extends AbstractC1352b implements Serializable {
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a */
    public final AbstractC1462z f5413a;

    public C1350a(AbstractC1462z abstractC1462z) {
        this.f5413a = abstractC1462z;
    }

    static {
        System.currentTimeMillis();
        C1351a0 c1351a0 = C1351a0.f5416f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1350a) {
            return this.f5413a.equals(((C1350a) obj).f5413a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5413a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f5413a + "]";
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
    }
}
