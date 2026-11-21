package p064h2;

import androidx.media3.common.C0241t0;
import androidx.media3.common.InterfaceC0238s0;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;
import okhttp3.C2181z;
import okhttp3.internal.http2.C2122f;
import p002a1.AbstractC0008a1;
import p005a4.C0094o;
import p013b2.AbstractC0558j;
import p013b2.C0549a;
import p013b2.C0553e;
import p013b2.C0563o;
import p052f6.AbstractC0983m0;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p071i1.AbstractC1225d;
import p071i1.C1222a;
import p075i6.C1274a;
import p115n1.InterfaceC1976g0;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h2.p */
/* loaded from: classes.dex */
public abstract class AbstractC1151p {

    /* renamed from: a */
    public static final int[] f4927a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    /* renamed from: a */
    public static byte[] m2563a(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? C2122f.OKHTTP_CLIENT_WINDOW_SIZE : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || bArr.length == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(bArr.length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    /* renamed from: b */
    public static C1222a m2564b(C0241t0 c0241t0, String str) {
        int i = 0;
        while (true) {
            InterfaceC0238s0[] interfaceC0238s0Arr = c0241t0.f1412j;
            if (i >= interfaceC0238s0Arr.length) {
                return null;
            }
            InterfaceC0238s0 interfaceC0238s0 = interfaceC0238s0Arr[i];
            if (interfaceC0238s0 instanceof C1222a) {
                C1222a c1222a = (C1222a) interfaceC0238s0;
                if (c1222a.f5105j.equals(str)) {
                    return c1222a;
                }
            }
            i++;
        }
    }

    /* renamed from: c */
    public static boolean m2565c(int i, boolean z7) {
        if ((i >>> 8) == 3368816) {
            return true;
        }
        if (i == 1751476579 && z7) {
            return true;
        }
        for (int i4 = 0; i4 < 29; i4++) {
            if (f4927a[i4] == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static C0553e m2566d(C1132w c1132w, int i) {
        int iM2521g = c1132w.m2521g();
        if (c1132w.m2521g() == 1684108385) {
            c1132w.m2514H(8);
            String strM2531q = c1132w.m2531q(iM2521g - 16);
            return new C0553e("und", strM2531q, strM2531q);
        }
        AbstractC1101a.m2348F("MetadataUtil", "Failed to parse comment attribute: " + AbstractC1225d.m2674a(i));
        return null;
    }

    /* renamed from: e */
    public static C0549a m2567e(C1132w c1132w) {
        int iM2521g = c1132w.m2521g();
        if (c1132w.m2521g() != 1684108385) {
            AbstractC1101a.m2348F("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iM2521g2 = c1132w.m2521g();
        byte[] bArr = AbstractC1139d.f4818a;
        int i = iM2521g2 & 16777215;
        String str = i == 13 ? "image/jpeg" : i == 14 ? "image/png" : null;
        if (str == null) {
            AbstractC0008a1.m23s("Unrecognized cover art flags: ", i, "MetadataUtil");
            return null;
        }
        c1132w.m2514H(4);
        int i4 = iM2521g - 16;
        byte[] bArr2 = new byte[i4];
        c1132w.m2519e(bArr2, 0, i4);
        return new C0549a(str, null, 3, bArr2);
    }

    /* renamed from: f */
    public static C0563o m2568f(int i, C1132w c1132w, String str) {
        int iM2521g = c1132w.m2521g();
        if (c1132w.m2521g() == 1684108385 && iM2521g >= 22) {
            c1132w.m2514H(10);
            int iM2507A = c1132w.m2507A();
            if (iM2507A > 0) {
                String strM12h = AbstractC0008a1.m12h(iM2507A, C2181z.FRAGMENT_ENCODE_SET);
                int iM2507A2 = c1132w.m2507A();
                if (iM2507A2 > 0) {
                    strM12h = strM12h + "/" + iM2507A2;
                }
                return new C0563o(str, null, AbstractC0983m0.m2168n(strM12h));
            }
        }
        AbstractC1101a.m2348F("MetadataUtil", "Failed to parse index/count attribute: " + AbstractC1225d.m2674a(i));
        return null;
    }

    /* renamed from: g */
    public static int m2569g(C1132w c1132w) {
        int iM2521g = c1132w.m2521g();
        if (c1132w.m2521g() == 1684108385) {
            c1132w.m2514H(8);
            int i = iM2521g - 16;
            if (i == 1) {
                return c1132w.m2535u();
            }
            if (i == 2) {
                return c1132w.m2507A();
            }
            if (i == 3) {
                return c1132w.m2538x();
            }
            if (i == 4 && (c1132w.f4799a[c1132w.f4800b] & 128) == 0) {
                return c1132w.m2539y();
            }
        }
        AbstractC1101a.m2348F("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    /* renamed from: h */
    public static AbstractC0558j m2570h(int i, String str, C1132w c1132w, boolean z7, boolean z8) {
        int iM2569g = m2569g(c1132w);
        if (z8) {
            iM2569g = Math.min(1, iM2569g);
        }
        if (iM2569g >= 0) {
            return z7 ? new C0563o(str, null, AbstractC0983m0.m2168n(Integer.toString(iM2569g))) : new C0553e("und", str, Integer.toString(iM2569g));
        }
        AbstractC1101a.m2348F("MetadataUtil", "Failed to parse uint8 attribute: " + AbstractC1225d.m2674a(i));
        return null;
    }

    /* renamed from: i */
    public static C0094o m2571i(byte[] bArr) {
        C1132w c1132w = new C1132w(bArr);
        if (c1132w.f4801c < 32) {
            return null;
        }
        c1132w.m2513G(0);
        int iM2515a = c1132w.m2515a();
        int iM2521g = c1132w.m2521g();
        if (iM2521g != iM2515a) {
            AbstractC1101a.m2348F("PsshAtomUtil", "Advertised atom size (" + iM2521g + ") does not match buffer size: " + iM2515a);
            return null;
        }
        int iM2521g2 = c1132w.m2521g();
        if (iM2521g2 != 1886614376) {
            AbstractC0008a1.m23s("Atom type is not pssh: ", iM2521g2, "PsshAtomUtil");
            return null;
        }
        int iM2547c = AbstractC1139d.m2547c(c1132w.m2521g());
        if (iM2547c > 1) {
            AbstractC0008a1.m23s("Unsupported pssh version: ", iM2547c, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(c1132w.m2529o(), c1132w.m2529o());
        if (iM2547c == 1) {
            int iM2539y = c1132w.m2539y();
            UUID[] uuidArr = new UUID[iM2539y];
            for (int i = 0; i < iM2539y; i++) {
                uuidArr[i] = new UUID(c1132w.m2529o(), c1132w.m2529o());
            }
        }
        int iM2539y2 = c1132w.m2539y();
        int iM2515a2 = c1132w.m2515a();
        if (iM2539y2 == iM2515a2) {
            byte[] bArr2 = new byte[iM2539y2];
            c1132w.m2519e(bArr2, 0, iM2539y2);
            return new C0094o(uuid, iM2547c, bArr2);
        }
        AbstractC1101a.m2348F("PsshAtomUtil", "Atom data size (" + iM2539y2 + ") does not match the bytes left: " + iM2515a2);
        return null;
    }

    /* renamed from: j */
    public static byte[] m2572j(UUID uuid, byte[] bArr) {
        C0094o c0094oM2571i = m2571i(bArr);
        if (c0094oM2571i == null) {
            return null;
        }
        UUID uuid2 = (UUID) c0094oM2571i.f441k;
        if (uuid.equals(uuid2)) {
            return (byte[]) c0094oM2571i.f442l;
        }
        AbstractC1101a.m2348F("PsshAtomUtil", "UUID mismatch. Expected: " + uuid + ", got: " + uuid2 + ".");
        return null;
    }

    /* renamed from: k */
    public static C0563o m2573k(int i, C1132w c1132w, String str) {
        int iM2521g = c1132w.m2521g();
        if (c1132w.m2521g() == 1684108385) {
            c1132w.m2514H(8);
            return new C0563o(str, null, AbstractC0983m0.m2168n(c1132w.m2531q(iM2521g - 16)));
        }
        AbstractC1101a.m2348F("MetadataUtil", "Failed to parse text attribute: " + AbstractC1225d.m2674a(i));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0077  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC1976g0 m2574l(InterfaceC1988o interfaceC1988o, boolean z7, boolean z8) {
        InterfaceC1976g0 interfaceC1976g0;
        int i;
        long j;
        int i4;
        int i8;
        int i9;
        int[] iArr;
        long length = interfaceC1988o.getLength();
        long j8 = -1;
        long j9 = 4096;
        if (length != -1 && length <= 4096) {
            j9 = length;
        }
        int i10 = (int) j9;
        C1132w c1132w = new C1132w(64);
        int i11 = 0;
        int i12 = 0;
        boolean z9 = false;
        while (i12 < i10) {
            c1132w.m2510D(8);
            boolean z10 = true;
            if (!interfaceC1988o.mo3855b(c1132w.f4799a, i11, 8, true)) {
                break;
            }
            long jM2537w = c1132w.m2537w();
            int iM2521g = c1132w.m2521g();
            if (jM2537w == 1) {
                j = j8;
                interfaceC1988o.mo3862i(c1132w.f4799a, 8, 8);
                i8 = 16;
                c1132w.m2512F(16);
                jM2537w = c1132w.m2529o();
                i4 = i12;
            } else {
                j = j8;
                if (jM2537w == 0) {
                    long length2 = interfaceC1988o.getLength();
                    if (length2 != j) {
                        i4 = i12;
                        jM2537w = (length2 - interfaceC1988o.mo3856c()) + 8;
                    } else {
                        i4 = i12;
                    }
                    i8 = 8;
                }
            }
            long j10 = jM2537w;
            long j11 = i8;
            if (j10 < j11) {
                return new C1145j();
            }
            int i13 = i4 + i8;
            interfaceC1976g0 = null;
            if (iM2521g == 1836019574) {
                i10 += (int) j10;
                if (length != -1 && i10 > length) {
                    i10 = (int) length;
                }
                i12 = i13;
                j8 = j;
                i11 = 0;
            } else {
                if (iM2521g == 1836019558 || iM2521g == 1836475768) {
                    i = 1;
                    break;
                }
                if (iM2521g == 1835295092) {
                    z9 = true;
                }
                long j12 = length;
                if ((i13 + j10) - j11 >= i10) {
                    i = 0;
                    break;
                }
                int i14 = (int) (j10 - j11);
                i12 = i13 + i14;
                if (iM2521g != 1718909296) {
                    i9 = 0;
                    if (i14 != 0) {
                        interfaceC1988o.mo3857d(i14);
                    }
                } else {
                    if (i14 < 8) {
                        return new C1145j();
                    }
                    c1132w.m2510D(i14);
                    i9 = 0;
                    interfaceC1988o.mo3862i(c1132w.f4799a, 0, i14);
                    if (m2565c(c1132w.m2521g(), z8)) {
                        z9 = true;
                    }
                    c1132w.m2514H(4);
                    int iM2515a = c1132w.m2515a() / 4;
                    if (!z9 && iM2515a > 0) {
                        iArr = new int[iM2515a];
                        int i15 = 0;
                        while (true) {
                            if (i15 >= iM2515a) {
                                z10 = z9;
                                break;
                            }
                            int iM2521g2 = c1132w.m2521g();
                            iArr[i15] = iM2521g2;
                            if (m2565c(iM2521g2, z8)) {
                                break;
                            }
                            i15++;
                        }
                    } else {
                        z10 = z9;
                        iArr = null;
                    }
                    if (!z10) {
                        C1145j c1145j = new C1145j();
                        if (iArr == null) {
                            int i16 = C1274a.f5298l;
                            return c1145j;
                        }
                        int i17 = C1274a.f5298l;
                        if (iArr.length == 0) {
                            return c1145j;
                        }
                        new C1274a(Arrays.copyOf(iArr, iArr.length));
                        return c1145j;
                    }
                    z9 = z10;
                }
                i11 = i9;
                j8 = j;
                length = j12;
            }
        }
        interfaceC1976g0 = null;
        i = i11;
        return !z9 ? C1145j.f4881c : z7 != i ? i != 0 ? C1145j.f4879a : C1145j.f4880b : interfaceC1976g0;
    }
}
