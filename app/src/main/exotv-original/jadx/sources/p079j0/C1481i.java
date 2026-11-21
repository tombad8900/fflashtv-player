package p079j0;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p005a4.C0073c;
import p063h1.AbstractC1105c;
import p063h1.C1129t;
import p063h1.C1132w;
import p156s.C2332e;
import p168t2.C2400b;
import p168t2.C2405d0;
import p168t2.C2406e;
import p168t2.C2408f;
import p168t2.C2410g;
import p168t2.C2416j;
import p168t2.C2419m;
import p168t2.C2422p;
import p168t2.C2424r;
import p168t2.C2425s;
import p168t2.C2426t;
import p168t2.C2427u;
import p168t2.C2431y;
import p168t2.InterfaceC2413h0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j0.i */
/* loaded from: classes.dex */
public final class C1481i {

    /* renamed from: a */
    public final int f5707a;

    /* renamed from: b */
    public final List f5708b;

    public C1481i(int i, List list) {
        this.f5707a = i;
        this.f5708b = list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InterfaceC2413h0 m3145a(int i, C1129t c1129t) {
        String str = (String) c1129t.f4788b;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C2431y(new C2426t(str, c1129t.m2481d()));
            }
            if (i == 21) {
                return new C2431y(new C2410g());
            }
            if (i == 27) {
                if (m3147c(4)) {
                    return null;
                }
                return new C2431y(new C2422p(new C0073c(m3146b(c1129t)), m3147c(1), m3147c(8)));
            }
            if (i == 36) {
                return new C2431y(new C2424r(new C0073c(m3146b(c1129t))));
            }
            if (i == 45) {
                return new C2431y(new C2427u());
            }
            if (i == 89) {
                return new C2431y(new C2410g(c1129t.f4789c));
            }
            if (i == 172) {
                return new C2431y(new C2400b(str, c1129t.m2481d(), 1));
            }
            if (i == 257) {
                return new C2405d0(new C0073c("application/vnd.dvb.ait", 24));
            }
            if (i != 138) {
                if (i == 139) {
                    return new C2431y(new C2408f(str, c1129t.m2481d(), 5408));
                }
                switch (i) {
                    case 15:
                        if (m3147c(2)) {
                            return null;
                        }
                        return new C2431y(new C2406e(c1129t.m2481d(), str, false));
                    case 16:
                        return new C2431y(new C2419m(new C2332e(m3146b(c1129t))));
                    case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                        if (m3147c(2)) {
                            return null;
                        }
                        return new C2431y(new C2425s(str, c1129t.m2481d()));
                    default:
                        switch (i) {
                            case 128:
                                break;
                            case 129:
                                return new C2431y(new C2400b(str, c1129t.m2481d(), 0));
                            case 130:
                                if (!m3147c(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (m3147c(16)) {
                                            return null;
                                        }
                                        return new C2405d0(new C0073c("application/x-scte35", 24));
                                    case 135:
                                        break;
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                        }
                }
            }
            return new C2431y(new C2408f(str, c1129t.m2481d(), DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED));
        }
        return new C2431y(new C2416j(new C2332e(m3146b(c1129t))));
    }

    /* renamed from: b */
    public List m3146b(C1129t c1129t) {
        String str;
        int i;
        List listSingletonList;
        boolean zM3147c = m3147c(32);
        List list = this.f5708b;
        if (zM3147c) {
            return list;
        }
        C1132w c1132w = new C1132w((byte[]) c1129t.f4790d);
        while (c1132w.m2515a() > 0) {
            int iM2535u = c1132w.m2535u();
            int iM2535u2 = c1132w.f4800b + c1132w.m2535u();
            if (iM2535u == 134) {
                ArrayList arrayList = new ArrayList();
                int iM2535u3 = c1132w.m2535u() & 31;
                for (int i4 = 0; i4 < iM2535u3; i4++) {
                    String strM2533s = c1132w.m2533s(3, StandardCharsets.UTF_8);
                    int iM2535u4 = c1132w.m2535u();
                    boolean z7 = (iM2535u4 & 128) != 0;
                    if (z7) {
                        i = iM2535u4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bM2535u = (byte) c1132w.m2535u();
                    c1132w.m2514H(1);
                    if (z7) {
                        boolean z8 = (bM2535u & 64) != 0;
                        byte[] bArr = AbstractC1105c.f4716a;
                        listSingletonList = Collections.singletonList(z8 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    C0246v c0246v = new C0246v();
                    c0246v.f1447m = AbstractC0244u0.m687p(str);
                    c0246v.f1438d = strM2533s;
                    c0246v.f1430G = i;
                    c0246v.f1450p = listSingletonList;
                    arrayList.add(new C0249w(c0246v));
                }
                list = arrayList;
            }
            c1132w.m2513G(iM2535u2);
        }
        return list;
    }

    /* renamed from: c */
    public boolean m3147c(int i) {
        return (i & this.f5707a) != 0;
    }

    public C1481i() {
        this.f5707a = 1;
        this.f5708b = Collections.singletonList(null);
    }

    public C1481i(ArrayList arrayList) {
        this.f5707a = 0;
        this.f5708b = arrayList;
    }
}
