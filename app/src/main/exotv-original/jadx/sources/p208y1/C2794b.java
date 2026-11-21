package p208y1;

import androidx.media3.common.C0241t0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import p063h1.C1132w;
import p171t5.AbstractC2436a;
import p192w1.C2600b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y1.b */
/* loaded from: classes.dex */
public final class C2794b extends AbstractC2436a {
    /* renamed from: v */
    public static C2793a m4905v(C1132w c1132w) {
        String strM2530p = c1132w.m2530p();
        strM2530p.getClass();
        String strM2530p2 = c1132w.m2530p();
        strM2530p2.getClass();
        return new C2793a(strM2530p, strM2530p2, c1132w.m2529o(), c1132w.m2529o(), Arrays.copyOfRange(c1132w.f4799a, c1132w.f4800b, c1132w.f4801c));
    }

    @Override // p171t5.AbstractC2436a
    /* renamed from: d */
    public final C0241t0 mo247d(C2600b c2600b, ByteBuffer byteBuffer) {
        return new C0241t0(m4905v(new C1132w(byteBuffer.array(), byteBuffer.limit())));
    }
}
