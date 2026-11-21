package p115n1;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import p056g1.C1028a;
import p056g1.C1029b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p063h1.InterfaceC1111f;
import p090k2.C1585c;
import p090k2.C1598p;
import p090k2.InterfaceC1599q;
import p159s2.AbstractC2348h;
import p159s2.C2347g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.x */
/* loaded from: classes.dex */
public final class C1997x implements InterfaceC1599q {

    /* renamed from: j */
    public final C1132w f7405j;

    public C1997x(int i) {
        switch (i) {
            case 1:
                this.f7405j = new C1132w();
                break;
            default:
                this.f7405j = new C1132w(10);
                break;
        }
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: f */
    public void mo75f(byte[] bArr, int i, int i4, C1598p c1598p, InterfaceC1111f interfaceC1111f) {
        C1029b c1029bM2225a;
        C1132w c1132w = this.f7405j;
        c1132w.m2511E(bArr, i + i4);
        c1132w.m2513G(i);
        ArrayList arrayList = new ArrayList();
        while (c1132w.m2515a() > 0) {
            AbstractC1101a.m2352c("Incomplete Mp4Webvtt Top Level box header found.", c1132w.m2515a() >= 8);
            int iM2521g = c1132w.m2521g();
            if (c1132w.m2521g() == 1987343459) {
                int i8 = iM2521g - 8;
                CharSequence charSequenceM4183f = null;
                C1028a c1028aM4177a = null;
                while (i8 > 0) {
                    AbstractC1101a.m2352c("Incomplete vtt cue box header found.", i8 >= 8);
                    int iM2521g2 = c1132w.m2521g();
                    int iM2521g3 = c1132w.m2521g();
                    int i9 = iM2521g2 - 8;
                    byte[] bArr2 = c1132w.f4799a;
                    int i10 = c1132w.f4800b;
                    int i11 = AbstractC1118i0.f4750a;
                    String str = new String(bArr2, i10, i9, StandardCharsets.UTF_8);
                    c1132w.m2514H(i9);
                    i8 = (i8 - 8) - i9;
                    if (iM2521g3 == 1937011815) {
                        C2347g c2347g = new C2347g();
                        AbstractC2348h.m4182e(str, c2347g);
                        c1028aM4177a = c2347g.m4177a();
                    } else if (iM2521g3 == 1885436268) {
                        charSequenceM4183f = AbstractC2348h.m4183f(null, str.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequenceM4183f == null) {
                    charSequenceM4183f = C2181z.FRAGMENT_ENCODE_SET;
                }
                if (c1028aM4177a != null) {
                    c1028aM4177a.f4334a = charSequenceM4183f;
                    c1029bM2225a = c1028aM4177a.m2225a();
                } else {
                    Pattern pattern = AbstractC2348h.f8255a;
                    C2347g c2347g2 = new C2347g();
                    c2347g2.f8246c = charSequenceM4183f;
                    c1029bM2225a = c2347g2.m4177a().m2225a();
                }
                arrayList.add(c1029bM2225a);
            } else {
                c1132w.m2514H(iM2521g - 8);
            }
        }
        interfaceC1111f.accept(new C1585c(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: h */
    public int mo77h() {
        return 2;
    }
}
