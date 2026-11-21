package p201x1;

import androidx.media3.common.C0241t0;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import p063h1.C1131v;
import p171t5.AbstractC2436a;
import p192w1.C2600b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x1.b */
/* loaded from: classes.dex */
public final class C2744b extends AbstractC2436a {
    @Override // p171t5.AbstractC2436a
    /* renamed from: d */
    public final C0241t0 mo247d(C2600b c2600b, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            C1131v c1131v = new C1131v(byteBuffer.array(), byteBuffer.limit());
            c1131v.m2505v(12);
            int iM2491h = (c1131v.m2491h() + c1131v.m2494k(12)) - 4;
            c1131v.m2505v(44);
            c1131v.m2506w(c1131v.m2494k(12));
            c1131v.m2505v(16);
            ArrayList arrayList = new ArrayList();
            while (c1131v.m2491h() < iM2491h) {
                c1131v.m2505v(48);
                int iM2494k = c1131v.m2494k(8);
                c1131v.m2505v(4);
                int iM2491h2 = c1131v.m2491h() + c1131v.m2494k(12);
                String str = null;
                String str2 = null;
                while (c1131v.m2491h() < iM2491h2) {
                    int iM2494k2 = c1131v.m2494k(8);
                    int iM2494k3 = c1131v.m2494k(8);
                    int iM2491h3 = c1131v.m2491h() + iM2494k3;
                    if (iM2494k2 == 2) {
                        int iM2494k4 = c1131v.m2494k(16);
                        c1131v.m2505v(8);
                        if (iM2494k4 == 3) {
                            while (c1131v.m2491h() < iM2491h3) {
                                int iM2494k5 = c1131v.m2494k(8);
                                Charset charset = StandardCharsets.US_ASCII;
                                byte[] bArr = new byte[iM2494k5];
                                c1131v.m2497n(bArr, iM2494k5);
                                str = new String(bArr, charset);
                                int iM2494k6 = c1131v.m2494k(8);
                                for (int i = 0; i < iM2494k6; i++) {
                                    c1131v.m2506w(c1131v.m2494k(8));
                                }
                            }
                        }
                    } else if (iM2494k2 == 21) {
                        Charset charset2 = StandardCharsets.US_ASCII;
                        byte[] bArr2 = new byte[iM2494k3];
                        c1131v.m2497n(bArr2, iM2494k3);
                        str2 = new String(bArr2, charset2);
                    }
                    c1131v.m2502s(iM2491h3 * 8);
                }
                c1131v.m2502s(iM2491h2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new C2743a(iM2494k, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new C0241t0(arrayList);
            }
        }
        return null;
    }
}
