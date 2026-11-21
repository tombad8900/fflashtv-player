package p183v0;

import java.nio.ByteBuffer;
import p002a1.C0022h;
import p191w0.C2597a;
import p191w0.C2598b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.v */
/* loaded from: classes.dex */
public final class C2522v {

    /* renamed from: d */
    public static final ThreadLocal f9176d = new ThreadLocal();

    /* renamed from: a */
    public final int f9177a;

    /* renamed from: b */
    public final C0022h f9178b;

    /* renamed from: c */
    public volatile int f9179c = 0;

    public C2522v(C0022h c0022h, int i) {
        this.f9178b = c0022h;
        this.f9177a = i;
    }

    /* renamed from: a */
    public final int m4539a(int i) {
        C2597a c2597aM4540b = m4540b();
        int iM3506a = c2597aM4540b.m3506a(16);
        if (iM3506a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c2597aM4540b.f6855m;
        int i4 = iM3506a + c2597aM4540b.f6852j;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i4) + i4 + 4);
    }

    /* renamed from: b */
    public final C2597a m4540b() {
        ThreadLocal threadLocal = f9176d;
        C2597a c2597a = (C2597a) threadLocal.get();
        if (c2597a == null) {
            c2597a = new C2597a();
            threadLocal.set(c2597a);
        }
        C2598b c2598b = (C2598b) this.f9178b.f78j;
        int iM3506a = c2598b.m3506a(6);
        if (iM3506a != 0) {
            int i = iM3506a + c2598b.f6852j;
            int i4 = (this.f9177a * 4) + ((ByteBuffer) c2598b.f6855m).getInt(i) + i + 4;
            int i8 = ((ByteBuffer) c2598b.f6855m).getInt(i4) + i4;
            ByteBuffer byteBuffer = (ByteBuffer) c2598b.f6855m;
            c2597a.f6855m = byteBuffer;
            if (byteBuffer != null) {
                c2597a.f6852j = i8;
                int i9 = i8 - byteBuffer.getInt(i8);
                c2597a.f6853k = i9;
                c2597a.f6854l = ((ByteBuffer) c2597a.f6855m).getShort(i9);
                return c2597a;
            }
            c2597a.f6852j = 0;
            c2597a.f6853k = 0;
            c2597a.f6854l = 0;
        }
        return c2597a;
    }

    public final String toString() {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C2597a c2597aM4540b = m4540b();
        int iM3506a = c2597aM4540b.m3506a(4);
        sb.append(Integer.toHexString(iM3506a != 0 ? ((ByteBuffer) c2597aM4540b.f6855m).getInt(iM3506a + c2597aM4540b.f6852j) : 0));
        sb.append(", codepoints:");
        C2597a c2597aM4540b2 = m4540b();
        int iM3506a2 = c2597aM4540b2.m3506a(16);
        if (iM3506a2 != 0) {
            int i4 = iM3506a2 + c2597aM4540b2.f6852j;
            i = ((ByteBuffer) c2597aM4540b2.f6855m).getInt(((ByteBuffer) c2597aM4540b2.f6855m).getInt(i4) + i4);
        } else {
            i = 0;
        }
        for (int i8 = 0; i8 < i; i8++) {
            sb.append(Integer.toHexString(m4539a(i8)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
