package p132p1;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p002a1.AbstractC0008a1;
import p052f6.AbstractC0965g0;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p1.f */
/* loaded from: classes.dex */
public final class C2203f implements InterfaceC2198a {

    /* renamed from: a */
    public final AbstractC0983m0 f7710a;

    /* renamed from: b */
    public final int f7711b;

    public C2203f(int i, C0981l1 c0981l1) {
        this.f7711b = i;
        this.f7710a = c0981l1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    public static C2203f m4002b(C1132w c1132w, int i) {
        InterfaceC2198a c2204g;
        String str;
        int i4;
        int i8 = 4;
        AbstractC1006u.m2188c(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i9 = c1132w.f4801c;
        int i10 = 0;
        int i11 = -2;
        int i12 = 0;
        while (c1132w.m2515a() > 8) {
            int iM2523i = c1132w.m2523i();
            int iM2523i2 = c1132w.f4800b + c1132w.m2523i();
            c1132w.m2512F(iM2523i2);
            if (iM2523i != 1414744396) {
                C2201d c2201d = null;
                switch (iM2523i) {
                    case 1718776947:
                        if (i11 == 2) {
                            c1132w.m2514H(i8);
                            int iM2523i3 = c1132w.m2523i();
                            int iM2523i4 = c1132w.m2523i();
                            c1132w.m2514H(i8);
                            int iM2523i5 = c1132w.m2523i();
                            switch (iM2523i5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                C0246v c0246v = new C0246v();
                                c0246v.f1454t = iM2523i3;
                                c0246v.f1455u = iM2523i4;
                                c0246v.f1447m = AbstractC0244u0.m687p(str);
                                c2204g = new C2204g(new C0249w(c0246v));
                                break;
                            } else {
                                AbstractC0008a1.m23s("Ignoring track with unsupported compression ", iM2523i5, "StreamFormatChunk");
                                c2204g = c2201d;
                                break;
                            }
                        } else {
                            if (i11 == 1) {
                                int iM2528n = c1132w.m2528n();
                                String str2 = iM2528n != 1 ? iM2528n != 85 ? iM2528n != 255 ? iM2528n != 8192 ? iM2528n != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int iM2528n2 = c1132w.m2528n();
                                    int iM2523i6 = c1132w.m2523i();
                                    c1132w.m2514H(6);
                                    int iM2413D = AbstractC1118i0.m2413D(c1132w.m2528n());
                                    int iM2528n3 = c1132w.m2515a() > 0 ? c1132w.m2528n() : i10;
                                    byte[] bArr = new byte[iM2528n3];
                                    c1132w.m2519e(bArr, i10, iM2528n3);
                                    C0246v c0246v2 = new C0246v();
                                    c0246v2.f1447m = AbstractC0244u0.m687p(str2);
                                    c0246v2.f1425B = iM2528n2;
                                    c0246v2.f1426C = iM2523i6;
                                    if ("audio/raw".equals(str2) && iM2413D != 0) {
                                        c0246v2.f1427D = iM2413D;
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && iM2528n3 > 0) {
                                        c0246v2.f1450p = AbstractC0983m0.m2168n(bArr);
                                    }
                                    c2204g = new C2204g(new C0249w(c0246v2));
                                    break;
                                } else {
                                    AbstractC0008a1.m23s("Ignoring track with unsupported format tag ", iM2528n, "StreamFormatChunk");
                                }
                            } else {
                                AbstractC1101a.m2348F("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + AbstractC1118i0.m2418I(i11));
                            }
                            c2204g = c2201d;
                        }
                    case 1751742049:
                        int iM2523i7 = c1132w.m2523i();
                        c1132w.m2514H(8);
                        int iM2523i8 = c1132w.m2523i();
                        int iM2523i9 = c1132w.m2523i();
                        c1132w.m2514H(i8);
                        c1132w.m2523i();
                        c1132w.m2514H(12);
                        c2204g = new C2200c(iM2523i7, iM2523i8, iM2523i9);
                        break;
                    case 1752331379:
                        int iM2523i10 = c1132w.m2523i();
                        c1132w.m2514H(12);
                        c1132w.m2523i();
                        int iM2523i11 = c1132w.m2523i();
                        int iM2523i12 = c1132w.m2523i();
                        c1132w.m2514H(i8);
                        int iM2523i13 = c1132w.m2523i();
                        int iM2523i14 = c1132w.m2523i();
                        c1132w.m2514H(8);
                        c2201d = new C2201d(iM2523i10, iM2523i11, iM2523i12, iM2523i13, iM2523i14);
                        c2204g = c2201d;
                        break;
                    case 1852994675:
                        c2204g = new C2205h(c1132w.m2533s(c1132w.m2515a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        c2204g = c2201d;
                        break;
                }
            } else {
                c2204g = m4002b(c1132w, c1132w.m2523i());
            }
            if (c2204g != null) {
                if (c2204g.getType() == 1752331379) {
                    int i13 = ((C2201d) c2204g).f7692a;
                    if (i13 == 1935960438) {
                        i11 = 2;
                    } else if (i13 != 1935963489) {
                        if (i13 != 1937012852) {
                            AbstractC1101a.m2348F("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(i13));
                            i4 = -1;
                        } else {
                            i4 = 3;
                        }
                        i11 = i4;
                    } else {
                        i11 = 1;
                    }
                }
                int i14 = i12 + 1;
                int iM2140e = AbstractC0965g0.m2140e(objArrCopyOf.length, i14);
                if (iM2140e > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM2140e);
                }
                objArrCopyOf[i12] = c2204g;
                i12 = i14;
            }
            c1132w.m2513G(iM2523i2);
            c1132w.m2512F(i9);
            i8 = 4;
            i10 = 0;
        }
        return new C2203f(i, AbstractC0983m0.m2163h(i12, objArrCopyOf));
    }

    /* renamed from: a */
    public final InterfaceC2198a m4003a(Class cls) {
        C0977k0 c0977k0ListIterator = this.f7710a.listIterator(0);
        while (c0977k0ListIterator.hasNext()) {
            InterfaceC2198a interfaceC2198a = (InterfaceC2198a) c0977k0ListIterator.next();
            if (interfaceC2198a.getClass() == cls) {
                return interfaceC2198a;
            }
        }
        return null;
    }

    @Override // p132p1.InterfaceC2198a
    public final int getType() {
        return this.f7711b;
    }
}
