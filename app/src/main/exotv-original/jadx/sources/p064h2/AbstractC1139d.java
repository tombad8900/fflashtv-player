package p064h2;

import android.util.Pair;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.Renderer;
import com.bumptech.glide.AbstractC0715d;
import com.google.android.material.datepicker.C0758p;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import okhttp3.C2181z;
import p002a1.C0022h;
import p002a1.C0036o;
import p005a4.C0089k;
import p017b6.C0619s;
import p043e6.InterfaceC0916d;
import p051f5.C0945b;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1105c;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p071i1.AbstractC1225d;
import p071i1.C1223b;
import p071i1.C1224c;
import p071i1.C1227f;
import p112m7.C1943s;
import p115n1.AbstractC1965b;
import p115n1.C1963a;
import p115n1.C1967c;
import p115n1.C1969d;
import p115n1.C1995v;
import p115n1.C1996w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h2.d */
/* loaded from: classes.dex */
public abstract class AbstractC1139d {

    /* renamed from: a */
    public static final byte[] f4818a;

    static {
        int i = AbstractC1118i0.f4750a;
        f4818a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    /* renamed from: a */
    public static C1137b m2545a(C1132w c1132w, int i) {
        c1132w.m2513G(i + 12);
        c1132w.m2514H(1);
        m2546b(c1132w);
        c1132w.m2514H(2);
        int iM2535u = c1132w.m2535u();
        if ((iM2535u & 128) != 0) {
            c1132w.m2514H(2);
        }
        if ((iM2535u & 64) != 0) {
            c1132w.m2514H(c1132w.m2535u());
        }
        if ((iM2535u & 32) != 0) {
            c1132w.m2514H(2);
        }
        c1132w.m2514H(1);
        m2546b(c1132w);
        String strM677f = AbstractC0244u0.m677f(c1132w.m2535u());
        if ("audio/mpeg".equals(strM677f) || "audio/vnd.dts".equals(strM677f) || "audio/vnd.dts.hd".equals(strM677f)) {
            return new C1137b(strM677f, null, -1L, -1L);
        }
        c1132w.m2514H(4);
        long jM2537w = c1132w.m2537w();
        long jM2537w2 = c1132w.m2537w();
        c1132w.m2514H(1);
        int iM2546b = m2546b(c1132w);
        long j = jM2537w2;
        byte[] bArr = new byte[iM2546b];
        c1132w.m2519e(bArr, 0, iM2546b);
        if (j <= 0) {
            j = -1;
        }
        return new C1137b(strM677f, bArr, j, jM2537w > 0 ? jM2537w : -1L);
    }

    /* renamed from: b */
    public static int m2546b(C1132w c1132w) {
        int iM2535u = c1132w.m2535u();
        int i = iM2535u & 127;
        while ((iM2535u & 128) == 128) {
            iM2535u = c1132w.m2535u();
            i = (i << 7) | (iM2535u & 127);
        }
        return i;
    }

    /* renamed from: c */
    public static int m2547c(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: d */
    public static C1227f m2548d(C1132w c1132w) {
        long jM2529o;
        long jM2529o2;
        c1132w.m2513G(8);
        if (m2547c(c1132w.m2521g()) == 0) {
            jM2529o = c1132w.m2537w();
            jM2529o2 = c1132w.m2537w();
        } else {
            jM2529o = c1132w.m2529o();
            jM2529o2 = c1132w.m2529o();
        }
        return new C1227f(jM2529o, jM2529o2, c1132w.m2537w());
    }

    /* renamed from: e */
    public static Pair m2549e(C1132w c1132w, int i, int i4) throws C0247v0 {
        Integer num;
        C1153r c1153r;
        Pair pairCreate;
        int i8;
        int i9;
        Integer num2;
        boolean z7;
        int i10 = c1132w.f4800b;
        while (i10 - i < i4) {
            c1132w.m2513G(i10);
            int iM2521g = c1132w.m2521g();
            AbstractC1965b.m3828d("childAtomSize must be positive", iM2521g > 0);
            if (c1132w.m2521g() == 1936289382) {
                int i11 = i10 + 8;
                int i12 = 0;
                int i13 = -1;
                Integer numValueOf = null;
                String strM2533s = null;
                while (i11 - i10 < iM2521g) {
                    c1132w.m2513G(i11);
                    int iM2521g2 = c1132w.m2521g();
                    int iM2521g3 = c1132w.m2521g();
                    if (iM2521g3 == 1718775137) {
                        numValueOf = Integer.valueOf(c1132w.m2521g());
                    } else if (iM2521g3 == 1935894637) {
                        c1132w.m2514H(4);
                        strM2533s = c1132w.m2533s(4, StandardCharsets.UTF_8);
                    } else if (iM2521g3 == 1935894633) {
                        i13 = i11;
                        i12 = iM2521g2;
                    }
                    i11 += iM2521g2;
                }
                byte[] bArr = null;
                if ("cenc".equals(strM2533s) || "cbc1".equals(strM2533s) || "cens".equals(strM2533s) || "cbcs".equals(strM2533s)) {
                    AbstractC1965b.m3828d("frma atom is mandatory", numValueOf != null);
                    AbstractC1965b.m3828d("schi atom is mandatory", i13 != -1);
                    int i14 = i13 + 8;
                    while (true) {
                        if (i14 - i13 >= i12) {
                            num = numValueOf;
                            c1153r = null;
                            break;
                        }
                        c1132w.m2513G(i14);
                        int iM2521g4 = c1132w.m2521g();
                        if (c1132w.m2521g() == 1952804451) {
                            int iM2547c = m2547c(c1132w.m2521g());
                            c1132w.m2514H(1);
                            if (iM2547c == 0) {
                                c1132w.m2514H(1);
                                i9 = 0;
                                i8 = 0;
                            } else {
                                int iM2535u = c1132w.m2535u();
                                i8 = iM2535u & 15;
                                i9 = (iM2535u & 240) >> 4;
                            }
                            if (c1132w.m2535u() == 1) {
                                num2 = numValueOf;
                                z7 = true;
                            } else {
                                num2 = numValueOf;
                                z7 = false;
                            }
                            int iM2535u2 = c1132w.m2535u();
                            byte[] bArr2 = new byte[16];
                            c1132w.m2519e(bArr2, 0, 16);
                            if (z7 && iM2535u2 == 0) {
                                int iM2535u3 = c1132w.m2535u();
                                byte[] bArr3 = new byte[iM2535u3];
                                c1132w.m2519e(bArr3, 0, iM2535u3);
                                bArr = bArr3;
                            }
                            num = num2;
                            c1153r = new C1153r(z7, strM2533s, iM2535u2, bArr2, i9, i8, bArr);
                        } else {
                            i14 += iM2521g4;
                        }
                    }
                    AbstractC1965b.m3828d("tenc atom is mandatory", c1153r != null);
                    int i15 = AbstractC1118i0.f4750a;
                    pairCreate = Pair.create(num, c1153r);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            i10 += iM2521g;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0842  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x08a8  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x08f4  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0961  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x099f A[SYNTHETIC] */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0619s m2550f(C1132w c1132w, int i, int i4, String str, C0237s c0237s, boolean z7) throws C0247v0 {
        int[] iArr;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int iM2507A;
        int iM2536v;
        int iM2521g;
        int i17;
        int i18;
        int i19;
        C0237s c0237s2;
        String str2;
        String str3;
        String str4;
        int i20;
        int i21;
        String str5;
        List list;
        String str6;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        String str7;
        int i27;
        C1137b c1137b;
        String str8;
        String str9;
        int i28;
        C1137b c1137b2;
        List list2;
        String str10;
        String str11;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int iM2494k;
        int i38;
        boolean z8;
        boolean z9;
        int iM2494k2;
        int i39;
        int i40;
        boolean zM2493j;
        int i41;
        boolean z10;
        C0237s c0237sM667a;
        int i42;
        long j;
        C0981l1 c0981l1M2168n;
        C1132w c1132w2 = c1132w;
        C0237s c0237s3 = c0237s;
        int[] iArr2 = AbstractC1965b.f7268d;
        c1132w2.m2513G(12);
        int iM2521g2 = c1132w2.m2521g();
        C0619s c0619s = new C0619s(iM2521g2);
        int i43 = 0;
        while (i43 < iM2521g2) {
            int i44 = c1132w2.f4800b;
            int iM2521g3 = c1132w2.m2521g();
            String str12 = "childAtomSize must be positive";
            AbstractC1965b.m3828d("childAtomSize must be positive", iM2521g3 > 0);
            int iM2521g4 = c1132w2.m2521g();
            if (iM2521g4 == 1635148593 || iM2521g4 == 1635148595 || iM2521g4 == 1701733238 || iM2521g4 == 1831958048 || iM2521g4 == 1836070006 || iM2521g4 == 1752589105 || iM2521g4 == 1751479857 || iM2521g4 == 1932670515 || iM2521g4 == 1211250227 || iM2521g4 == 1748121139 || iM2521g4 == 1987063864 || iM2521g4 == 1987063865 || iM2521g4 == 1635135537 || iM2521g4 == 1685479798 || iM2521g4 == 1685479729 || iM2521g4 == 1685481573) {
                iArr = iArr2;
                i8 = iM2521g2;
                c1132w2 = c1132w;
                i9 = i4;
                c0237s3 = c0237s;
                i10 = iM2521g4;
            } else if (iM2521g4 == 1685481521) {
                i9 = i4;
                i10 = iM2521g4;
                iArr = iArr2;
                i8 = iM2521g2;
            } else {
                if (iM2521g4 == 1836069985 || iM2521g4 == 1701733217 || iM2521g4 == 1633889587 || iM2521g4 == 1700998451 || iM2521g4 == 1633889588 || iM2521g4 == 1835823201 || iM2521g4 == 1685353315 || iM2521g4 == 1685353317 || iM2521g4 == 1685353320 || iM2521g4 == 1685353324 || iM2521g4 == 1685353336 || iM2521g4 == 1935764850 || iM2521g4 == 1935767394 || iM2521g4 == 1819304813 || iM2521g4 == 1936684916 || iM2521g4 == 1953984371 || iM2521g4 == 778924082 || iM2521g4 == 778924083 || iM2521g4 == 1835557169 || iM2521g4 == 1835560241 || iM2521g4 == 1634492771 || iM2521g4 == 1634492791 || iM2521g4 == 1970037111 || iM2521g4 == 1332770163 || iM2521g4 == 1716281667 || iM2521g4 == 1767992678) {
                    c1132w2.m2513G(i44 + 16);
                    if (z7) {
                        int iM2507A2 = c1132w2.m2507A();
                        c1132w2.m2514H(6);
                        i14 = iM2507A2;
                    } else {
                        c1132w2.m2514H(8);
                        i14 = 0;
                    }
                    if (i14 == 0 || i14 == 1) {
                        i15 = i44;
                        i16 = 4;
                        iM2507A = c1132w2.m2507A();
                        c1132w2.m2514H(6);
                        iM2536v = c1132w2.m2536v();
                        c1132w2.m2513G(c1132w2.f4800b - 4);
                        iM2521g = c1132w2.m2521g();
                        if (i14 == 1) {
                            c1132w2.m2514H(16);
                        }
                        i17 = -1;
                    } else if (i14 == 2) {
                        c1132w2.m2514H(16);
                        i15 = i44;
                        int iRound = (int) Math.round(Double.longBitsToDouble(c1132w2.m2529o()));
                        int iM2539y = c1132w2.m2539y();
                        c1132w2.m2514H(4);
                        int iM2539y2 = c1132w2.m2539y();
                        int iM2539y3 = c1132w2.m2539y();
                        boolean z11 = (iM2539y3 & 1) != 0;
                        boolean z12 = (iM2539y3 & 2) != 0;
                        i16 = 4;
                        if (z11) {
                            if (iM2539y2 == 32) {
                                i17 = 4;
                            }
                            i42 = 8;
                            c1132w2.m2514H(i42);
                            iM2536v = iRound;
                            iM2507A = iM2539y;
                            iM2521g = 0;
                        } else {
                            i42 = 8;
                            if (iM2539y2 == 8) {
                                i17 = 3;
                                c1132w2.m2514H(i42);
                                iM2536v = iRound;
                                iM2507A = iM2539y;
                                iM2521g = 0;
                            } else {
                                i17 = iM2539y2 == 16 ? z12 ? 268435456 : 2 : iM2539y2 == 24 ? z12 ? 1342177280 : 21 : iM2539y2 == 32 ? z12 ? 1610612736 : 22 : -1;
                                i42 = 8;
                                c1132w2.m2514H(i42);
                                iM2536v = iRound;
                                iM2507A = iM2539y;
                                iM2521g = 0;
                            }
                        }
                    } else {
                        i18 = i44;
                        i11 = iM2521g3;
                        i12 = i43;
                        iArr = iArr2;
                        i8 = iM2521g2;
                        c1132w2 = c1132w;
                        i13 = i18;
                    }
                    if (iM2521g4 == 1767992678) {
                        iM2507A = -1;
                        iM2536v = -1;
                    }
                    int i45 = c1132w2.f4800b;
                    int i46 = iM2507A;
                    if (iM2521g4 == 1701733217) {
                        Pair pairM2549e = m2549e(c1132w2, i15, iM2521g3);
                        if (pairM2549e != null) {
                            iM2521g4 = ((Integer) pairM2549e.first).intValue();
                            if (c0237s3 == null) {
                                i19 = iM2536v;
                                c0237sM667a = null;
                            } else {
                                i19 = iM2536v;
                                c0237sM667a = c0237s3.m667a(((C1153r) pairM2549e.second).f4941b);
                            }
                            ((C1153r[]) c0619s.f2440c)[i43] = (C1153r) pairM2549e.second;
                            c0237s2 = c0237sM667a;
                        } else {
                            i19 = iM2536v;
                            c0237s2 = c0237s3;
                        }
                        c1132w2.m2513G(i45);
                    } else {
                        i19 = iM2536v;
                        c0237s2 = c0237s3;
                    }
                    String str13 = "audio/mhm1";
                    if (iM2521g4 == 1633889587) {
                        str2 = "audio/ac3";
                    } else if (iM2521g4 == 1700998451) {
                        str2 = "audio/eac3";
                    } else if (iM2521g4 == 1633889588) {
                        str2 = "audio/ac4";
                    } else if (iM2521g4 == 1685353315) {
                        str2 = "audio/vnd.dts";
                    } else if (iM2521g4 == 1685353320 || iM2521g4 == 1685353324) {
                        str2 = "audio/vnd.dts.hd";
                    } else if (iM2521g4 == 1685353317) {
                        str2 = "audio/vnd.dts.hd;profile=lbr";
                    } else if (iM2521g4 == 1685353336) {
                        str2 = "audio/vnd.dts.uhd;profile=p2";
                    } else if (iM2521g4 == 1935764850) {
                        str2 = "audio/3gpp";
                    } else if (iM2521g4 == 1935767394) {
                        str2 = "audio/amr-wb";
                    } else if (iM2521g4 != 1936684916) {
                        if (iM2521g4 == 1953984371) {
                            str2 = "audio/raw";
                            i17 = 268435456;
                        } else if (iM2521g4 != 1819304813) {
                            str2 = (iM2521g4 == 778924082 || iM2521g4 == 778924083) ? "audio/mpeg" : iM2521g4 == 1835557169 ? "audio/mha1" : iM2521g4 == 1835560241 ? "audio/mhm1" : iM2521g4 == 1634492771 ? "audio/alac" : iM2521g4 == 1634492791 ? "audio/g711-alaw" : iM2521g4 == 1970037111 ? "audio/g711-mlaw" : iM2521g4 == 1332770163 ? "audio/opus" : iM2521g4 == 1716281667 ? "audio/flac" : iM2521g4 == 1835823201 ? "audio/true-hd" : iM2521g4 == 1767992678 ? "audio/iamf" : null;
                        } else if (i17 == -1) {
                            str2 = "audio/raw";
                            i17 = 2;
                        } else {
                            str2 = "audio/raw";
                        }
                    }
                    i12 = i43;
                    iArr = iArr2;
                    i8 = iM2521g2;
                    int i47 = i45;
                    i18 = i15;
                    int i48 = i19;
                    String str14 = null;
                    List listM2168n = null;
                    C1137b c1137b3 = null;
                    String str15 = str2;
                    int i49 = i46;
                    while (i47 - i18 < iM2521g3) {
                        c1132w2.m2513G(i47);
                        int iM2521g5 = c1132w2.m2521g();
                        int i50 = iM2521g3;
                        AbstractC1965b.m3828d(str12, iM2521g5 > 0);
                        int iM2521g6 = c1132w2.m2521g();
                        int i51 = i17;
                        if (iM2521g6 == 1835557187) {
                            c1132w2.m2513G(i47 + 8);
                            c1132w2.m2514H(1);
                            int iM2535u = c1132w2.m2535u();
                            c1132w2.m2514H(1);
                            str14 = Objects.equals(str15, str13) ? String.format("mhm1.%02X", Integer.valueOf(iM2535u)) : String.format("mha1.%02X", Integer.valueOf(iM2535u));
                            int iM2507A3 = c1132w2.m2507A();
                            byte[] bArr = new byte[iM2507A3];
                            str3 = str13;
                            c1132w2.m2519e(bArr, 0, iM2507A3);
                            listM2168n = listM2168n == null ? AbstractC0983m0.m2168n(bArr) : AbstractC0983m0.m2169o(bArr, (byte[]) listM2168n.get(0));
                        } else {
                            str3 = str13;
                            if (iM2521g6 == 1835557200) {
                                c1132w2.m2513G(i47 + 8);
                                int iM2535u2 = c1132w2.m2535u();
                                if (iM2535u2 > 0) {
                                    byte[] bArr2 = new byte[iM2535u2];
                                    c1132w2.m2519e(bArr2, 0, iM2535u2);
                                    listM2168n = listM2168n == null ? AbstractC0983m0.m2168n(bArr2) : AbstractC0983m0.m2169o((byte[]) listM2168n.get(0), bArr2);
                                }
                            } else {
                                if (iM2521g6 == 1702061171) {
                                    str4 = str12;
                                    i20 = i48;
                                    i21 = i47;
                                    str5 = str14;
                                    list = listM2168n;
                                    str6 = str15;
                                    i22 = iM2521g5;
                                    i23 = 1702061171;
                                } else if (z7 && iM2521g6 == 2002876005) {
                                    str4 = str12;
                                    i20 = i48;
                                    i21 = i47;
                                    str5 = str14;
                                    list = listM2168n;
                                    str6 = str15;
                                    i22 = iM2521g5;
                                    i23 = 1702061171;
                                } else {
                                    if (iM2521g6 == 1684103987) {
                                        c1132w2.m2513G(i47 + 8);
                                        String string = Integer.toString(i);
                                        C1131v c1131v = new C1131v(0);
                                        c1131v.m2500q(c1132w2);
                                        int i52 = iArr[c1131v.m2494k(2)];
                                        str9 = str15;
                                        c1131v.m2505v(8);
                                        int i53 = AbstractC1965b.f7270f[c1131v.m2494k(3)];
                                        int i54 = c1131v.m2494k(1) != 0 ? i53 + 1 : i53;
                                        list2 = listM2168n;
                                        int i55 = AbstractC1965b.f7271g[c1131v.m2494k(5)] * 1000;
                                        c1131v.m2487d();
                                        c1132w2.m2513G(c1131v.m2491h());
                                        C0246v c0246v = new C0246v();
                                        c0246v.f1435a = string;
                                        c0246v.f1447m = AbstractC0244u0.m687p("audio/ac3");
                                        c0246v.f1425B = i54;
                                        c0246v.f1426C = i52;
                                        c0246v.f1451q = c0237s2;
                                        c0246v.f1438d = str;
                                        c0246v.f1442h = i55;
                                        c0246v.f1443i = i55;
                                        c0619s.f2441d = new C0249w(c0246v);
                                        str10 = str12;
                                        i31 = i48;
                                        i29 = i47;
                                        str11 = str14;
                                        i30 = iM2521g5;
                                    } else {
                                        list2 = listM2168n;
                                        str9 = str15;
                                        if (iM2521g6 == 1684366131) {
                                            c1132w2.m2513G(i47 + 8);
                                            String string2 = Integer.toString(i);
                                            C1131v c1131v2 = new C1131v(0);
                                            c1131v2.m2500q(c1132w2);
                                            int iM2494k3 = c1131v2.m2494k(13) * 1000;
                                            c1131v2.m2505v(3);
                                            int i56 = iArr[c1131v2.m2494k(2)];
                                            c1131v2.m2505v(10);
                                            int i57 = AbstractC1965b.f7270f[c1131v2.m2494k(3)];
                                            if (c1131v2.m2494k(1) != 0) {
                                                i57++;
                                            }
                                            c1131v2.m2505v(3);
                                            int iM2494k4 = c1131v2.m2494k(i16);
                                            c1131v2.m2505v(1);
                                            str11 = str14;
                                            if (iM2494k4 > 0) {
                                                c1131v2.m2505v(6);
                                                if (c1131v2.m2494k(1) != 0) {
                                                    i57 += 2;
                                                }
                                                c1131v2.m2505v(1);
                                            }
                                            int i58 = i57;
                                            str10 = str12;
                                            if (c1131v2.m2486c() > 7) {
                                                c1131v2.m2505v(7);
                                                String str16 = c1131v2.m2494k(1) != 0 ? "audio/eac3-joc" : "audio/eac3";
                                                c1131v2.m2487d();
                                                c1132w2.m2513G(c1131v2.m2491h());
                                                C0246v c0246v2 = new C0246v();
                                                c0246v2.f1435a = string2;
                                                c0246v2.f1447m = AbstractC0244u0.m687p(str16);
                                                c0246v2.f1425B = i58;
                                                c0246v2.f1426C = i56;
                                                c0246v2.f1451q = c0237s2;
                                                c0246v2.f1438d = str;
                                                c0246v2.f1443i = iM2494k3;
                                                c0619s.f2441d = new C0249w(c0246v2);
                                                i31 = i48;
                                                i29 = i47;
                                                i30 = iM2521g5;
                                            }
                                            i47 = i26 + i25;
                                            c1132w2 = c1132w;
                                            str12 = str7;
                                            iM2521g = i27;
                                            iM2521g3 = i50;
                                            i17 = i51;
                                            str13 = str3;
                                            str15 = str9;
                                            i48 = i28;
                                            i16 = 4;
                                        } else {
                                            str10 = str12;
                                            str11 = str14;
                                            if (iM2521g6 == 1684103988) {
                                                c1132w2.m2513G(i47 + 8);
                                                String string3 = Integer.toString(i);
                                                C1131v c1131v3 = new C1131v(0);
                                                c1131v3.m2500q(c1132w2);
                                                int iM2486c = c1131v3.m2486c();
                                                int iM2494k5 = c1131v3.m2494k(3);
                                                if (iM2494k5 > 1) {
                                                    throw C0247v0.createForUnsupportedContainerFeature("Unsupported AC-4 DSI version: " + iM2494k5);
                                                }
                                                int iM2494k6 = c1131v3.m2494k(7);
                                                int i59 = c1131v3.m2493j() ? 48000 : 44100;
                                                c1131v3.m2505v(4);
                                                int iM2494k7 = c1131v3.m2494k(9);
                                                if (iM2494k6 > 1) {
                                                    if (iM2494k5 == 0) {
                                                        throw C0247v0.createForUnsupportedContainerFeature("Invalid AC-4 DSI version: " + iM2494k5);
                                                    }
                                                    if (c1131v3.m2493j()) {
                                                        c1131v3.m2505v(16);
                                                        if (c1131v3.m2493j()) {
                                                            c1131v3.m2505v(128);
                                                        }
                                                    }
                                                }
                                                if (iM2494k5 == 1) {
                                                    if (c1131v3.m2486c() < 66) {
                                                        throw C0247v0.createForUnsupportedContainerFeature("Invalid AC-4 DSI bitrate.");
                                                    }
                                                    c1131v3.m2505v(66);
                                                    c1131v3.m2487d();
                                                }
                                                C1967c c1967c = new C1967c();
                                                c1967c.f7292a = true;
                                                c1967c.f7293b = -1;
                                                c1967c.f7294c = -1;
                                                c1967c.f7295d = true;
                                                c1967c.f7296e = 2;
                                                c1967c.f7297f = 0;
                                                i30 = iM2521g5;
                                                int i60 = 0;
                                                while (i60 < iM2494k7) {
                                                    if (iM2494k5 == 0) {
                                                        boolean zM2493j2 = c1131v3.m2493j();
                                                        int iM2494k8 = c1131v3.m2494k(5);
                                                        i29 = i47;
                                                        iM2494k = c1131v3.m2494k(5);
                                                        i38 = 0;
                                                        z8 = false;
                                                        z9 = zM2493j2;
                                                        iM2494k2 = iM2494k8;
                                                        i39 = 0;
                                                    } else {
                                                        int i61 = iM2494k7;
                                                        int iM2494k9 = c1131v3.m2494k(8);
                                                        i29 = i47;
                                                        int iM2494k10 = c1131v3.m2494k(8);
                                                        int iM2494k11 = iM2494k10 == 255 ? c1131v3.m2494k(16) + iM2494k10 : iM2494k10;
                                                        if (iM2494k9 > 2) {
                                                            c1131v3.m2505v(iM2494k11 * 8);
                                                            i60++;
                                                            iM2494k7 = i61;
                                                            i47 = i29;
                                                        } else {
                                                            int iM2486c2 = (iM2486c - c1131v3.m2486c()) / 8;
                                                            iM2494k2 = c1131v3.m2494k(5);
                                                            i39 = iM2486c2;
                                                            i38 = iM2494k11;
                                                            z8 = iM2494k2 == 31;
                                                            iM2494k = iM2494k9;
                                                            z9 = false;
                                                        }
                                                    }
                                                    i33 = i48;
                                                    if (z9 || z8 || iM2494k2 != 6) {
                                                        i32 = i49;
                                                        c1967c.f7297f = c1131v3.m2494k(3);
                                                        if (c1131v3.m2493j()) {
                                                            c1131v3.m2505v(5);
                                                        }
                                                        c1131v3.m2505v(2);
                                                        if (iM2494k5 == 1 && (iM2494k == 1 || iM2494k == 2)) {
                                                            c1131v3.m2505v(2);
                                                        }
                                                        c1131v3.m2505v(5);
                                                        c1131v3.m2505v(10);
                                                        if (iM2494k5 != 1) {
                                                            i40 = iM2494k;
                                                            if (z9 && !z8) {
                                                                c1131v3.m2504u();
                                                                if (iM2494k2 == 0 || iM2494k2 == 1 || iM2494k2 == 2) {
                                                                    if (i40 == 0) {
                                                                        for (int i62 = 0; i62 < 2; i62++) {
                                                                            AbstractC1965b.m3839o(c1131v3, c1967c);
                                                                        }
                                                                    } else {
                                                                        for (int i63 = 0; i63 < 2; i63++) {
                                                                            AbstractC1965b.m3840p(c1131v3, c1967c);
                                                                        }
                                                                    }
                                                                } else if (iM2494k2 == 3 || iM2494k2 == 4) {
                                                                    if (i40 == 0) {
                                                                        for (int i64 = 0; i64 < 3; i64++) {
                                                                            AbstractC1965b.m3839o(c1131v3, c1967c);
                                                                        }
                                                                    } else {
                                                                        for (int i65 = 0; i65 < 3; i65++) {
                                                                            AbstractC1965b.m3840p(c1131v3, c1967c);
                                                                        }
                                                                    }
                                                                } else if (iM2494k2 != 5) {
                                                                    int iM2494k12 = c1131v3.m2494k(7);
                                                                    for (int i66 = 0; i66 < iM2494k12; i66++) {
                                                                        c1131v3.m2505v(8);
                                                                    }
                                                                } else if (i40 == 0) {
                                                                    AbstractC1965b.m3839o(c1131v3, c1967c);
                                                                } else {
                                                                    int iM2494k13 = c1131v3.m2494k(3);
                                                                    for (int i67 = 0; i67 < iM2494k13 + 2; i67++) {
                                                                        AbstractC1965b.m3840p(c1131v3, c1967c);
                                                                    }
                                                                }
                                                            } else if (i40 != 0) {
                                                                AbstractC1965b.m3839o(c1131v3, c1967c);
                                                            } else {
                                                                AbstractC1965b.m3840p(c1131v3, c1967c);
                                                            }
                                                            c1131v3.m2504u();
                                                            zM2493j = c1131v3.m2493j();
                                                        } else {
                                                            if (iM2494k > 0) {
                                                                c1967c.f7292a = c1131v3.m2493j();
                                                            }
                                                            if (!c1967c.f7292a) {
                                                                i41 = 2;
                                                            } else if (iM2494k != 1) {
                                                                i41 = 2;
                                                                if (iM2494k == 2) {
                                                                    int iM2494k14 = c1131v3.m2494k(5);
                                                                    if (iM2494k14 >= 0 && iM2494k14 <= 15) {
                                                                        c1967c.f7293b = iM2494k14;
                                                                    }
                                                                    if (iM2494k14 < 11 || iM2494k14 > 14) {
                                                                        i41 = 2;
                                                                    } else {
                                                                        c1967c.f7295d = c1131v3.m2493j();
                                                                        i41 = 2;
                                                                        c1967c.f7296e = c1131v3.m2494k(2);
                                                                    }
                                                                }
                                                                c1131v3.m2505v(24);
                                                            }
                                                            if (iM2494k == 1 || iM2494k == i41) {
                                                                if (c1131v3.m2493j() && c1131v3.m2493j()) {
                                                                    c1131v3.m2505v(i41);
                                                                }
                                                                if (c1131v3.m2493j()) {
                                                                    c1131v3.m2504u();
                                                                    int i68 = 8;
                                                                    int iM2494k15 = c1131v3.m2494k(8);
                                                                    i40 = iM2494k;
                                                                    int i69 = 0;
                                                                    while (i69 < iM2494k15) {
                                                                        c1131v3.m2505v(i68);
                                                                        i69++;
                                                                        i68 = 8;
                                                                    }
                                                                }
                                                                if (z9) {
                                                                    if (i40 != 0) {
                                                                    }
                                                                    c1131v3.m2504u();
                                                                    zM2493j = c1131v3.m2493j();
                                                                }
                                                            }
                                                        }
                                                        i47 = i26 + i25;
                                                        c1132w2 = c1132w;
                                                        str12 = str7;
                                                        iM2521g = i27;
                                                        iM2521g3 = i50;
                                                        i17 = i51;
                                                        str13 = str3;
                                                        str15 = str9;
                                                        i48 = i28;
                                                        i16 = 4;
                                                    } else {
                                                        i32 = i49;
                                                        i40 = iM2494k;
                                                        zM2493j = true;
                                                    }
                                                    if (zM2493j) {
                                                        int iM2494k16 = c1131v3.m2494k(7);
                                                        for (int i70 = 0; i70 < iM2494k16; i70++) {
                                                            c1131v3.m2505v(15);
                                                        }
                                                    }
                                                    if (i40 <= 0) {
                                                        i34 = 8;
                                                        c1131v3.m2487d();
                                                        if (iM2494k5 == 1) {
                                                            int iM2486c3 = ((iM2486c - c1131v3.m2486c()) / i34) - i39;
                                                            if (i38 < iM2486c3) {
                                                                throw C0247v0.createForUnsupportedContainerFeature("pres_bytes is smaller than presentation bytes read.");
                                                            }
                                                            c1131v3.m2506w(i38 - iM2486c3);
                                                        }
                                                        if (c1967c.f7292a && c1967c.f7293b == -1) {
                                                            throw C0247v0.createForUnsupportedContainerFeature("Can't determine channel mode of presentation " + i60);
                                                        }
                                                        if (c1967c.f7292a) {
                                                            int i71 = c1967c.f7293b;
                                                            boolean z13 = c1967c.f7295d;
                                                            int i72 = c1967c.f7296e;
                                                            switch (i71) {
                                                                case 0:
                                                                    i37 = 11;
                                                                    i36 = 1;
                                                                    break;
                                                                case 1:
                                                                    i37 = 11;
                                                                    i36 = 2;
                                                                    break;
                                                                case 2:
                                                                    i37 = 11;
                                                                    i36 = 3;
                                                                    break;
                                                                case 3:
                                                                    i37 = 11;
                                                                    i36 = 5;
                                                                    break;
                                                                case 4:
                                                                    i37 = 11;
                                                                    i36 = 6;
                                                                    break;
                                                                case 5:
                                                                case 7:
                                                                case 9:
                                                                    i37 = 11;
                                                                    i36 = 7;
                                                                    break;
                                                                case 6:
                                                                case 8:
                                                                case 10:
                                                                    i36 = i34;
                                                                    i37 = 11;
                                                                    break;
                                                                case 11:
                                                                    i37 = 11;
                                                                    i36 = 11;
                                                                    break;
                                                                case 12:
                                                                    i37 = 11;
                                                                    i36 = 12;
                                                                    break;
                                                                case 13:
                                                                    i37 = 11;
                                                                    i36 = 13;
                                                                    break;
                                                                case 14:
                                                                    i37 = 11;
                                                                    i36 = 14;
                                                                    break;
                                                                case 15:
                                                                    i37 = 11;
                                                                    i36 = 24;
                                                                    break;
                                                                default:
                                                                    i37 = 11;
                                                                    i36 = -1;
                                                                    break;
                                                            }
                                                            if (i71 == i37 || i71 == 12 || i71 == 13 || i71 == 14) {
                                                                if (!z13) {
                                                                    i36 -= 2;
                                                                }
                                                                if (i72 == 0) {
                                                                    i36 -= 4;
                                                                } else if (i72 == 1) {
                                                                    i36 -= 2;
                                                                }
                                                            }
                                                        } else {
                                                            i35 = c1967c.f7294c + 1;
                                                            if (c1967c.f7297f == 4) {
                                                                i36 = i35 == 17 ? 21 : i35;
                                                            }
                                                            if (i35 > 0) {
                                                                throw C0247v0.createForUnsupportedContainerFeature("Can't determine channel count of presentation.");
                                                            }
                                                            C0246v c0246v3 = new C0246v();
                                                            c0246v3.f1435a = string3;
                                                            c0246v3.f1447m = AbstractC0244u0.m687p("audio/ac4");
                                                            c0246v3.f1425B = i35;
                                                            c0246v3.f1426C = i59;
                                                            c0246v3.f1451q = c0237s2;
                                                            c0246v3.f1438d = str;
                                                            c0619s.f2441d = new C0249w(c0246v3);
                                                            i31 = i33;
                                                            i49 = i32;
                                                            i28 = i31;
                                                            i27 = iM2521g;
                                                            listM2168n = list2;
                                                            str14 = str11;
                                                            str7 = str10;
                                                            i26 = i30;
                                                            i25 = i29;
                                                        }
                                                        i35 = i36;
                                                        if (i35 > 0) {
                                                        }
                                                    } else {
                                                        if (c1131v3.m2493j()) {
                                                            if (c1131v3.m2486c() < 66) {
                                                                z10 = false;
                                                            } else {
                                                                c1131v3.m2505v(66);
                                                                z10 = true;
                                                            }
                                                            if (!z10) {
                                                                throw C0247v0.createForUnsupportedContainerFeature("Can't parse bitrate DSI.");
                                                            }
                                                        }
                                                        if (c1131v3.m2493j()) {
                                                            c1131v3.m2487d();
                                                            c1131v3.m2506w(c1131v3.m2494k(16));
                                                            int iM2494k17 = c1131v3.m2494k(5);
                                                            for (int i73 = 0; i73 < iM2494k17; i73++) {
                                                                c1131v3.m2505v(3);
                                                                c1131v3.m2505v(8);
                                                            }
                                                            i34 = 8;
                                                        }
                                                        c1131v3.m2487d();
                                                        if (iM2494k5 == 1) {
                                                        }
                                                        if (c1967c.f7292a) {
                                                            throw C0247v0.createForUnsupportedContainerFeature("Can't determine channel mode of presentation " + i60);
                                                        }
                                                        if (c1967c.f7292a) {
                                                        }
                                                        i35 = i36;
                                                        if (i35 > 0) {
                                                        }
                                                    }
                                                    i47 = i26 + i25;
                                                    c1132w2 = c1132w;
                                                    str12 = str7;
                                                    iM2521g = i27;
                                                    iM2521g3 = i50;
                                                    i17 = i51;
                                                    str13 = str3;
                                                    str15 = str9;
                                                    i48 = i28;
                                                    i16 = 4;
                                                }
                                                i32 = i49;
                                                i33 = i48;
                                                i29 = i47;
                                                i34 = 8;
                                                if (c1967c.f7292a) {
                                                }
                                                i35 = i36;
                                                if (i35 > 0) {
                                                }
                                            } else {
                                                int i74 = i49;
                                                i28 = i48;
                                                i29 = i47;
                                                i30 = iM2521g5;
                                                if (iM2521g6 != 1684892784) {
                                                    if (iM2521g6 == 1684305011 || iM2521g6 == 1969517683) {
                                                        C0246v c0246v4 = new C0246v();
                                                        c0246v4.f1435a = Integer.toString(i);
                                                        c0246v4.f1447m = AbstractC0244u0.m687p(str9);
                                                        i49 = i74;
                                                        c0246v4.f1425B = i49;
                                                        i31 = i28;
                                                        c0246v4.f1426C = i31;
                                                        c0246v4.f1451q = c0237s2;
                                                        c0246v4.f1438d = str;
                                                        c0619s.f2441d = new C0249w(c0246v4);
                                                    } else if (iM2521g6 == 1682927731) {
                                                        int i75 = i30 - 8;
                                                        byte[] bArr3 = f4818a;
                                                        byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length + i75);
                                                        c1132w2.m2513G(i29 + 8);
                                                        c1132w2.m2519e(bArrCopyOf, bArr3.length, i75);
                                                        listM2168n = AbstractC1965b.m3826b(bArrCopyOf);
                                                        i27 = iM2521g;
                                                        str14 = str11;
                                                        str7 = str10;
                                                        i26 = i30;
                                                        i25 = i29;
                                                        i49 = i74;
                                                    } else {
                                                        if (iM2521g6 == 1684425825) {
                                                            byte[] bArr4 = new byte[i30 - 8];
                                                            bArr4[0] = 102;
                                                            bArr4[1] = 76;
                                                            bArr4[2] = 97;
                                                            bArr4[3] = 67;
                                                            c1132w2.m2513G(i29 + 12);
                                                            c1132w2.m2519e(bArr4, 4, i30 - 12);
                                                            listM2168n = AbstractC0983m0.m2168n(bArr4);
                                                        } else if (iM2521g6 == 1634492771) {
                                                            int i76 = i30 - 12;
                                                            byte[] bArr5 = new byte[i76];
                                                            c1132w2.m2513G(i29 + 12);
                                                            c1132w2.m2519e(bArr5, 0, i76);
                                                            byte[] bArr6 = AbstractC1105c.f4716a;
                                                            C1132w c1132w3 = new C1132w(bArr5);
                                                            c1132w3.m2513G(9);
                                                            int iM2535u3 = c1132w3.m2535u();
                                                            c1132w3.m2513G(20);
                                                            Pair pairCreate = Pair.create(Integer.valueOf(c1132w3.m2539y()), Integer.valueOf(iM2535u3));
                                                            int iIntValue = ((Integer) pairCreate.first).intValue();
                                                            int iIntValue2 = ((Integer) pairCreate.second).intValue();
                                                            listM2168n = AbstractC0983m0.m2168n(bArr5);
                                                            i28 = iIntValue;
                                                            i27 = iM2521g;
                                                            str14 = str11;
                                                            str7 = str10;
                                                            i26 = i30;
                                                            i25 = i29;
                                                            i49 = iIntValue2;
                                                            i47 = i26 + i25;
                                                            c1132w2 = c1132w;
                                                            str12 = str7;
                                                            iM2521g = i27;
                                                            iM2521g3 = i50;
                                                            i17 = i51;
                                                            str13 = str3;
                                                            str15 = str9;
                                                            i48 = i28;
                                                            i16 = 4;
                                                        } else if (iM2521g6 == 1767990114) {
                                                            c1132w2.m2513G(i29 + 9);
                                                            long j8 = 0;
                                                            int i77 = 0;
                                                            for (int i78 = 9; i77 < i78; i78 = 9) {
                                                                if (c1132w2.f4800b == c1132w2.f4801c) {
                                                                    throw new IllegalStateException("Attempting to read a byte over the limit.");
                                                                }
                                                                long jM2535u = c1132w2.m2535u();
                                                                j8 |= (jM2535u & 127) << (i77 * 7);
                                                                if ((jM2535u & 128) == 0) {
                                                                    int iM1566m = AbstractC0715d.m1566m(j8);
                                                                    byte[] bArr7 = new byte[iM1566m];
                                                                    c1132w2.m2519e(bArr7, 0, iM1566m);
                                                                    listM2168n = AbstractC0983m0.m2168n(bArr7);
                                                                } else {
                                                                    i77++;
                                                                }
                                                            }
                                                            int iM1566m2 = AbstractC0715d.m1566m(j8);
                                                            byte[] bArr72 = new byte[iM1566m2];
                                                            c1132w2.m2519e(bArr72, 0, iM1566m2);
                                                            listM2168n = AbstractC0983m0.m2168n(bArr72);
                                                        } else {
                                                            i31 = i28;
                                                            i49 = i74;
                                                        }
                                                        i27 = iM2521g;
                                                        str14 = str11;
                                                        str7 = str10;
                                                        i26 = i30;
                                                        i25 = i29;
                                                        i49 = i74;
                                                        i47 = i26 + i25;
                                                        c1132w2 = c1132w;
                                                        str12 = str7;
                                                        iM2521g = i27;
                                                        iM2521g3 = i50;
                                                        i17 = i51;
                                                        str13 = str3;
                                                        str15 = str9;
                                                        i48 = i28;
                                                        i16 = 4;
                                                    }
                                                    i28 = i31;
                                                    i27 = iM2521g;
                                                    listM2168n = list2;
                                                    str14 = str11;
                                                    str7 = str10;
                                                    i26 = i30;
                                                    i25 = i29;
                                                    i47 = i26 + i25;
                                                    c1132w2 = c1132w;
                                                    str12 = str7;
                                                    iM2521g = i27;
                                                    iM2521g3 = i50;
                                                    i17 = i51;
                                                    str13 = str3;
                                                    str15 = str9;
                                                    i48 = i28;
                                                    i16 = 4;
                                                } else {
                                                    if (iM2521g <= 0) {
                                                        throw C0247v0.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + iM2521g, null);
                                                    }
                                                    i27 = iM2521g;
                                                    i28 = i27;
                                                    listM2168n = list2;
                                                    str14 = str11;
                                                    str7 = str10;
                                                    i26 = i30;
                                                    i25 = i29;
                                                    i49 = 2;
                                                }
                                                i47 = i26 + i25;
                                                c1132w2 = c1132w;
                                                str12 = str7;
                                                iM2521g = i27;
                                                iM2521g3 = i50;
                                                i17 = i51;
                                                str13 = str3;
                                                str15 = str9;
                                                i48 = i28;
                                                i16 = 4;
                                            }
                                        }
                                    }
                                    i28 = i31;
                                    i27 = iM2521g;
                                    listM2168n = list2;
                                    str14 = str11;
                                    str7 = str10;
                                    i26 = i30;
                                    i25 = i29;
                                    i47 = i26 + i25;
                                    c1132w2 = c1132w;
                                    str12 = str7;
                                    iM2521g = i27;
                                    iM2521g3 = i50;
                                    i17 = i51;
                                    str13 = str3;
                                    str15 = str9;
                                    i48 = i28;
                                    i16 = 4;
                                }
                                if (iM2521g6 == i23) {
                                    str7 = str4;
                                    i26 = i22;
                                    i24 = i21;
                                    i25 = i24;
                                } else {
                                    i24 = c1132w2.f4800b;
                                    i25 = i21;
                                    AbstractC1965b.m3828d(null, i24 >= i25);
                                    while (true) {
                                        i26 = i22;
                                        if (i24 - i25 < i26) {
                                            c1132w2.m2513G(i24);
                                            int iM2521g7 = c1132w2.m2521g();
                                            str7 = str4;
                                            AbstractC1965b.m3828d(str7, iM2521g7 > 0);
                                            if (c1132w2.m2521g() != 1702061171) {
                                                i24 += iM2521g7;
                                                str4 = str7;
                                                i22 = i26;
                                            }
                                        } else {
                                            str7 = str4;
                                            i24 = -1;
                                        }
                                    }
                                }
                                if (i24 != -1) {
                                    C1137b c1137bM2545a = m2545a(c1132w2, i24);
                                    str8 = (String) c1137bM2545a.f4816l;
                                    byte[] bArr8 = (byte[]) c1137bM2545a.f4817m;
                                    if (bArr8 == null) {
                                        i27 = iM2521g;
                                        c1137b = c1137bM2545a;
                                    } else if ("audio/vorbis".equals(str8)) {
                                        C1132w c1132w4 = new C1132w(bArr8);
                                        c1132w4.m2514H(1);
                                        int i79 = 0;
                                        while (c1132w4.m2515a() > 0 && (c1132w4.f4799a[c1132w4.f4800b] & 255) == 255) {
                                            i79 += 255;
                                            c1132w4.m2514H(1);
                                        }
                                        int iM2535u4 = c1132w4.m2535u() + i79;
                                        int i80 = 0;
                                        while (true) {
                                            if (c1132w4.m2515a() > 0) {
                                                c1137b2 = c1137bM2545a;
                                                if ((c1132w4.f4799a[c1132w4.f4800b] & 255) == 255) {
                                                    i80 += 255;
                                                    c1132w4.m2514H(1);
                                                    c1137bM2545a = c1137b2;
                                                }
                                            } else {
                                                c1137b2 = c1137bM2545a;
                                            }
                                        }
                                        int iM2535u5 = c1132w4.m2535u() + i80;
                                        byte[] bArr9 = new byte[iM2535u4];
                                        int i81 = c1132w4.f4800b;
                                        i27 = iM2521g;
                                        System.arraycopy(bArr8, i81, bArr9, 0, iM2535u4);
                                        int i82 = i81 + iM2535u4 + iM2535u5;
                                        int length = bArr8.length - i82;
                                        byte[] bArr10 = new byte[length];
                                        System.arraycopy(bArr8, i82, bArr10, 0, length);
                                        listM2168n = AbstractC0983m0.m2169o(bArr9, bArr10);
                                        c1137b = c1137b2;
                                        str14 = str5;
                                        str9 = str8;
                                        i28 = i20;
                                        c1137b3 = c1137b;
                                        i47 = i26 + i25;
                                        c1132w2 = c1132w;
                                        str12 = str7;
                                        iM2521g = i27;
                                        iM2521g3 = i50;
                                        i17 = i51;
                                        str13 = str3;
                                        str15 = str9;
                                        i48 = i28;
                                        i16 = 4;
                                    } else {
                                        i27 = iM2521g;
                                        if ("audio/mp4a-latm".equals(str8)) {
                                            C1963a c1963aM3838n = AbstractC1965b.m3838n(new C1131v(bArr8, bArr8.length), false);
                                            int i83 = c1963aM3838n.f7262b;
                                            int i84 = c1963aM3838n.f7263c;
                                            str14 = c1963aM3838n.f7261a;
                                            i20 = i83;
                                            i49 = i84;
                                        } else {
                                            str14 = str5;
                                        }
                                        listM2168n = AbstractC0983m0.m2168n(bArr8);
                                        c1137b = c1137bM2545a;
                                        str9 = str8;
                                        i28 = i20;
                                        c1137b3 = c1137b;
                                        i47 = i26 + i25;
                                        c1132w2 = c1132w;
                                        str12 = str7;
                                        iM2521g = i27;
                                        iM2521g3 = i50;
                                        i17 = i51;
                                        str13 = str3;
                                        str15 = str9;
                                        i48 = i28;
                                        i16 = 4;
                                    }
                                } else {
                                    i27 = iM2521g;
                                    c1137b = c1137b3;
                                    str8 = str6;
                                }
                                listM2168n = list;
                                str14 = str5;
                                str9 = str8;
                                i28 = i20;
                                c1137b3 = c1137b;
                                i47 = i26 + i25;
                                c1132w2 = c1132w;
                                str12 = str7;
                                iM2521g = i27;
                                iM2521g3 = i50;
                                i17 = i51;
                                str13 = str3;
                                str15 = str9;
                                i48 = i28;
                                i16 = 4;
                            }
                        }
                        i28 = i48;
                        i27 = iM2521g;
                        str9 = str15;
                        str7 = str12;
                        i25 = i47;
                        i26 = iM2521g5;
                        i47 = i26 + i25;
                        c1132w2 = c1132w;
                        str12 = str7;
                        iM2521g = i27;
                        iM2521g3 = i50;
                        i17 = i51;
                        str13 = str3;
                        str15 = str9;
                        i48 = i28;
                        i16 = 4;
                    }
                    i11 = iM2521g3;
                    int i85 = i48;
                    String str17 = str14;
                    int i86 = i17;
                    List list3 = listM2168n;
                    String str18 = str15;
                    if (((C0249w) c0619s.f2441d) == null && str18 != null) {
                        C0246v c0246v5 = new C0246v();
                        c0246v5.f1435a = Integer.toString(i);
                        c0246v5.f1447m = AbstractC0244u0.m687p(str18);
                        c0246v5.f1444j = str17;
                        c0246v5.f1425B = i49;
                        c0246v5.f1426C = i85;
                        c0246v5.f1427D = i86;
                        c0246v5.f1450p = list3;
                        c0246v5.f1451q = c0237s2;
                        c0246v5.f1438d = str;
                        if (c1137b3 != null) {
                            C1137b c1137b4 = c1137b3;
                            c0246v5.f1442h = AbstractC0715d.m1562g0(c1137b4.f4814j);
                            c0246v5.f1443i = AbstractC0715d.m1562g0(c1137b4.f4815k);
                        }
                        c0619s.f2441d = new C0249w(c0246v5);
                    }
                    c1132w2 = c1132w;
                    i13 = i18;
                } else {
                    if (iM2521g4 == 1414810956 || iM2521g4 == 1954034535 || iM2521g4 == 2004251764 || iM2521g4 == 1937010800 || iM2521g4 == 1664495672) {
                        c1132w2.m2513G(i44 + 16);
                        String str19 = "application/ttml+xml";
                        if (iM2521g4 == 1414810956) {
                            j = Long.MAX_VALUE;
                            c0981l1M2168n = null;
                            C0246v c0246v6 = new C0246v();
                            c0246v6.f1435a = Integer.toString(i);
                            c0246v6.f1447m = AbstractC0244u0.m687p(str19);
                            c0246v6.f1438d = str;
                            c0246v6.f1452r = j;
                            c0246v6.f1450p = c0981l1M2168n;
                            c0619s.f2441d = new C0249w(c0246v6);
                        } else if (iM2521g4 == 1954034535) {
                            int i87 = iM2521g3 - 16;
                            byte[] bArr11 = new byte[i87];
                            c1132w2.m2519e(bArr11, 0, i87);
                            str19 = "application/x-quicktime-tx3g";
                            c0981l1M2168n = AbstractC0983m0.m2168n(bArr11);
                            j = Long.MAX_VALUE;
                            C0246v c0246v62 = new C0246v();
                            c0246v62.f1435a = Integer.toString(i);
                            c0246v62.f1447m = AbstractC0244u0.m687p(str19);
                            c0246v62.f1438d = str;
                            c0246v62.f1452r = j;
                            c0246v62.f1450p = c0981l1M2168n;
                            c0619s.f2441d = new C0249w(c0246v62);
                        } else {
                            if (iM2521g4 == 2004251764) {
                                str19 = "application/x-mp4-vtt";
                            } else if (iM2521g4 == 1937010800) {
                                j = 0;
                                c0981l1M2168n = null;
                                C0246v c0246v622 = new C0246v();
                                c0246v622.f1435a = Integer.toString(i);
                                c0246v622.f1447m = AbstractC0244u0.m687p(str19);
                                c0246v622.f1438d = str;
                                c0246v622.f1452r = j;
                                c0246v622.f1450p = c0981l1M2168n;
                                c0619s.f2441d = new C0249w(c0246v622);
                            } else {
                                if (iM2521g4 != 1664495672) {
                                    throw new IllegalStateException();
                                }
                                c0619s.f2439b = 1;
                                str19 = "application/x-mp4-cea-608";
                            }
                            j = Long.MAX_VALUE;
                            c0981l1M2168n = null;
                            C0246v c0246v6222 = new C0246v();
                            c0246v6222.f1435a = Integer.toString(i);
                            c0246v6222.f1447m = AbstractC0244u0.m687p(str19);
                            c0246v6222.f1438d = str;
                            c0246v6222.f1452r = j;
                            c0246v6222.f1450p = c0981l1M2168n;
                            c0619s.f2441d = new C0249w(c0246v6222);
                        }
                    } else if (iM2521g4 == 1835365492) {
                        c1132w2.m2513G(i44 + 16);
                        if (iM2521g4 == 1835365492) {
                            c1132w2.m2530p();
                            String strM2530p = c1132w2.m2530p();
                            if (strM2530p != null) {
                                C0246v c0246v7 = new C0246v();
                                c0246v7.f1435a = Integer.toString(i);
                                c0246v7.f1447m = AbstractC0244u0.m687p(strM2530p);
                                c0619s.f2441d = new C0249w(c0246v7);
                            }
                        }
                    } else if (iM2521g4 == 1667329389) {
                        C0246v c0246v8 = new C0246v();
                        c0246v8.f1435a = Integer.toString(i);
                        c0246v8.f1447m = AbstractC0244u0.m687p("application/x-camera-motion");
                        c0619s.f2441d = new C0249w(c0246v8);
                    }
                    i13 = i44;
                    i11 = iM2521g3;
                    i12 = i43;
                    iArr = iArr2;
                    i8 = iM2521g2;
                }
                c1132w2.m2513G(i13 + i11);
                i43 = i12 + 1;
                c0237s3 = c0237s;
                iArr2 = iArr;
                iM2521g2 = i8;
            }
            m2552h(c1132w2, i10, i44, iM2521g3, i, i9, c0237s3, c0619s, i43);
            i13 = i44;
            i11 = iM2521g3;
            i12 = i43;
            c1132w2.m2513G(i13 + i11);
            i43 = i12 + 1;
            c0237s3 = c0237s;
            iArr2 = iArr;
            iM2521g2 = i8;
        }
        return c0619s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00db, code lost:
    
        r22 = -9223372036854775807L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b4, code lost:
    
        r13 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x05f8 A[ADDED_TO_REGION, LOOP:14: B:244:0x05f8->B:248:0x0602, LOOP_START, PHI: r20
      0x05f8: PHI (r20v8 int) = (r20v6 int), (r20v9 int) binds: [B:243:0x05f6, B:248:0x0602] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0824  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x082c  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0835  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x092f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x05eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:416:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x019a  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m2551g(C1223b c1223b, C1995v c1995v, long j, C0237s c0237s, boolean z7, boolean z8, InterfaceC0916d interfaceC0916d) {
        long jM2537w;
        long j8;
        int i;
        int i4;
        long j9;
        long j10;
        long jM2437a0;
        int i8;
        int i9;
        ArrayList arrayList;
        long jM2437a02;
        C1224c c1224cM2673h;
        int i10;
        long[] jArr;
        long[] jArr2;
        C0249w c0249w;
        InterfaceC0916d interfaceC0916d2;
        C1152q c1152q;
        C1223b c1223bM2672g;
        Pair pairCreate;
        int i11;
        long jM2521g;
        InterfaceC1138c c0758p;
        InterfaceC1138c interfaceC1138c;
        boolean z9;
        int iM2539y;
        int i12;
        int iM2539y2;
        int iMo1856a;
        C1132w c1132w;
        int i13;
        ArrayList arrayList2;
        int[] iArrCopyOf;
        int i14;
        long j11;
        long[] jArr3;
        long j12;
        int i15;
        int i16;
        int i17;
        C1152q c1152q2;
        int i18;
        int[] iArrCopyOf2;
        long[] jArr4;
        boolean z10;
        long[] jArr5;
        int[] iArr;
        int i19;
        long j13;
        int i20;
        int i21;
        boolean z11;
        int i22;
        boolean z12;
        C1152q c1152q3;
        ArrayList arrayList3;
        C1155t c1155t;
        int[] iArr2;
        int i23;
        C1155t c1155t2;
        C1223b c1223b2 = c1223b;
        ArrayList arrayList4 = c1223b2.f5111e;
        ArrayList arrayList5 = new ArrayList();
        int i24 = 0;
        while (i24 < arrayList4.size()) {
            C1223b c1223b3 = (C1223b) arrayList4.get(i24);
            if (c1223b3.f5114b != 1953653099) {
                arrayList = arrayList4;
                arrayList3 = arrayList5;
                i10 = i24;
            } else {
                C1224c c1224cM2673h2 = c1223b2.m2673h(1836476516);
                c1224cM2673h2.getClass();
                C1223b c1223bM2672g2 = c1223b3.m2672g(1835297121);
                c1223bM2672g2.getClass();
                C1224c c1224cM2673h3 = c1223bM2672g2.m2673h(1751411826);
                c1224cM2673h3.getClass();
                C1132w c1132w2 = c1224cM2673h3.f5112c;
                c1132w2.m2513G(16);
                int iM2521g = c1132w2.m2521g();
                int i25 = iM2521g == 1936684398 ? 1 : iM2521g == 1986618469 ? 2 : (iM2521g == 1952807028 || iM2521g == 1935832172 || iM2521g == 1937072756 || iM2521g == 1668047728) ? 3 : iM2521g == 1835365473 ? 5 : -1;
                if (i25 == -1) {
                    arrayList = arrayList4;
                    i10 = i24;
                    c1152q = null;
                    interfaceC0916d2 = interfaceC0916d;
                } else {
                    C1224c c1224cM2673h4 = c1223b3.m2673h(1953196132);
                    c1224cM2673h4.getClass();
                    C1132w c1132w3 = c1224cM2673h4.f5112c;
                    c1132w3.m2513G(8);
                    int iM2547c = m2547c(c1132w3.m2521g());
                    c1132w3.m2514H(iM2547c != 0 ? 16 : 8);
                    int iM2521g2 = c1132w3.m2521g();
                    c1132w3.m2514H(4);
                    int i26 = c1132w3.f4800b;
                    int i27 = iM2547c == 0 ? 4 : 8;
                    int i28 = 0;
                    while (true) {
                        if (i28 >= i27) {
                            c1132w3.m2514H(i27);
                            break;
                        }
                        if (c1132w3.f4799a[i26 + i28] != -1) {
                            jM2537w = iM2547c == 0 ? c1132w3.m2537w() : c1132w3.m2540z();
                            if (jM2537w == 0) {
                                break;
                            }
                        } else {
                            i28++;
                        }
                    }
                    c1132w3.m2514H(16);
                    int iM2521g3 = c1132w3.m2521g();
                    int iM2521g4 = c1132w3.m2521g();
                    c1132w3.m2514H(4);
                    int iM2521g5 = c1132w3.m2521g();
                    int iM2521g6 = c1132w3.m2521g();
                    if (iM2521g3 == 0 && iM2521g4 == 65536 && iM2521g5 == -65536 && iM2521g6 == 0) {
                        i4 = 90;
                    } else if (iM2521g3 == 0 && iM2521g4 == -65536 && iM2521g5 == 65536 && iM2521g6 == 0) {
                        i4 = 270;
                    } else if (iM2521g3 == -65536 && iM2521g4 == 0 && iM2521g5 == 0 && iM2521g6 == -65536) {
                        i4 = 180;
                    } else {
                        j8 = -9223372036854775807L;
                        i = 0;
                        j9 = j != j8 ? jM2537w : j;
                        long j14 = m2548d(c1224cM2673h2.f5112c).f5119l;
                        if (j9 != j8) {
                            j10 = j14;
                            jM2437a0 = j8;
                        } else {
                            int i29 = AbstractC1118i0.f4750a;
                            j10 = j14;
                            jM2437a0 = AbstractC1118i0.m2437a0(j9, 1000000L, j10, RoundingMode.DOWN);
                        }
                        C1223b c1223bM2672g3 = c1223bM2672g2.m2672g(1835626086);
                        c1223bM2672g3.getClass();
                        C1223b c1223bM2672g4 = c1223bM2672g3.m2672g(1937007212);
                        c1223bM2672g4.getClass();
                        C1224c c1224cM2673h5 = c1223bM2672g2.m2673h(1835296868);
                        c1224cM2673h5.getClass();
                        C1132w c1132w4 = c1224cM2673h5.f5112c;
                        c1132w4.m2513G(8);
                        int iM2547c2 = m2547c(c1132w4.m2521g());
                        c1132w4.m2514H(iM2547c2 != 0 ? 8 : 16);
                        long jM2537w2 = c1132w4.m2537w();
                        int i30 = c1132w4.f4800b;
                        i8 = iM2547c2 != 0 ? 4 : 8;
                        i9 = 0;
                        while (true) {
                            if (i9 < i8) {
                                arrayList = arrayList4;
                                c1132w4.m2514H(i8);
                                break;
                            }
                            arrayList = arrayList4;
                            if (c1132w4.f4799a[i30 + i9] != -1) {
                                long jM2537w3 = iM2547c2 == 0 ? c1132w4.m2537w() : c1132w4.m2540z();
                                if (jM2537w3 == 0) {
                                    break;
                                }
                                int i31 = AbstractC1118i0.f4750a;
                                jM2437a02 = AbstractC1118i0.m2437a0(jM2537w3, 1000000L, jM2537w2, RoundingMode.DOWN);
                            } else {
                                i9++;
                                arrayList4 = arrayList;
                            }
                        }
                        int iM2507A = c1132w4.m2507A();
                        String str = C2181z.FRAGMENT_ENCODE_SET + ((char) (((iM2507A >> 10) & 31) + 96)) + ((char) (((iM2507A >> 5) & 31) + 96)) + ((char) ((iM2507A & 31) + 96));
                        c1224cM2673h = c1223bM2672g4.m2673h(1937011556);
                        if (c1224cM2673h != null) {
                            throw C0247v0.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
                        }
                        C0619s c0619sM2550f = m2550f(c1224cM2673h.f5112c, iM2521g2, i, str, c0237s, z8);
                        if (z7 || (c1223bM2672g = c1223b3.m2672g(1701082227)) == null) {
                            i10 = i24;
                        } else {
                            C1224c c1224cM2673h6 = c1223bM2672g.m2673h(1701606260);
                            if (c1224cM2673h6 == null) {
                                i10 = i24;
                                pairCreate = null;
                            } else {
                                C1132w c1132w5 = c1224cM2673h6.f5112c;
                                c1132w5.m2513G(8);
                                int iM2547c3 = m2547c(c1132w5.m2521g());
                                int iM2539y3 = c1132w5.m2539y();
                                long[] jArr6 = new long[iM2539y3];
                                long[] jArr7 = new long[iM2539y3];
                                i10 = i24;
                                int i32 = 0;
                                while (i32 < iM2539y3) {
                                    int i33 = i32;
                                    jArr6[i33] = iM2547c3 == 1 ? c1132w5.m2540z() : c1132w5.m2537w();
                                    if (iM2547c3 == 1) {
                                        i11 = iM2547c3;
                                        jM2521g = c1132w5.m2529o();
                                    } else {
                                        i11 = iM2547c3;
                                        jM2521g = c1132w5.m2521g();
                                    }
                                    jArr7[i33] = jM2521g;
                                    if (c1132w5.m2532r() != 1) {
                                        throw new IllegalArgumentException("Unsupported media rate.");
                                    }
                                    c1132w5.m2514H(2);
                                    i32 = i33 + 1;
                                    iM2547c3 = i11;
                                }
                                pairCreate = Pair.create(jArr6, jArr7);
                            }
                            if (pairCreate != null) {
                                long[] jArr8 = (long[]) pairCreate.first;
                                jArr2 = (long[]) pairCreate.second;
                                jArr = jArr8;
                            }
                            c0249w = (C0249w) c0619sM2550f.f2441d;
                            if (c0249w != null) {
                                interfaceC0916d2 = interfaceC0916d;
                                c1152q = null;
                            } else {
                                interfaceC0916d2 = interfaceC0916d;
                                c1152q = new C1152q(iM2521g2, i25, jM2537w2, j10, jM2437a0, jM2437a02, c0249w, c0619sM2550f.f2439b, (C1153r[]) c0619sM2550f.f2440c, c0619sM2550f.f2438a, jArr, jArr2);
                            }
                        }
                        jArr = null;
                        jArr2 = null;
                        c0249w = (C0249w) c0619sM2550f.f2441d;
                        if (c0249w != null) {
                        }
                    }
                    j8 = -9223372036854775807L;
                    i = i4;
                    if (j != j8) {
                    }
                    long j142 = m2548d(c1224cM2673h2.f5112c).f5119l;
                    if (j9 != j8) {
                    }
                    C1223b c1223bM2672g32 = c1223bM2672g2.m2672g(1835626086);
                    c1223bM2672g32.getClass();
                    C1223b c1223bM2672g42 = c1223bM2672g32.m2672g(1937007212);
                    c1223bM2672g42.getClass();
                    C1224c c1224cM2673h52 = c1223bM2672g2.m2673h(1835296868);
                    c1224cM2673h52.getClass();
                    C1132w c1132w42 = c1224cM2673h52.f5112c;
                    c1132w42.m2513G(8);
                    int iM2547c22 = m2547c(c1132w42.m2521g());
                    c1132w42.m2514H(iM2547c22 != 0 ? 8 : 16);
                    long jM2537w22 = c1132w42.m2537w();
                    int i302 = c1132w42.f4800b;
                    if (iM2547c22 != 0) {
                    }
                    i9 = 0;
                    while (true) {
                        if (i9 < i8) {
                        }
                        i9++;
                        arrayList4 = arrayList;
                    }
                    int iM2507A2 = c1132w42.m2507A();
                    String str2 = C2181z.FRAGMENT_ENCODE_SET + ((char) (((iM2507A2 >> 10) & 31) + 96)) + ((char) (((iM2507A2 >> 5) & 31) + 96)) + ((char) ((iM2507A2 & 31) + 96));
                    c1224cM2673h = c1223bM2672g42.m2673h(1937011556);
                    if (c1224cM2673h != null) {
                    }
                }
                C1152q c1152q4 = (C1152q) interfaceC0916d2.apply(c1152q);
                if (c1152q4 == null) {
                    arrayList3 = arrayList5;
                } else {
                    C0249w c0249w2 = c1152q4.f4934g;
                    C1223b c1223bM2672g5 = c1223b3.m2672g(1835297121);
                    c1223bM2672g5.getClass();
                    C1223b c1223bM2672g6 = c1223bM2672g5.m2672g(1835626086);
                    c1223bM2672g6.getClass();
                    C1223b c1223bM2672g7 = c1223bM2672g6.m2672g(1937007212);
                    c1223bM2672g7.getClass();
                    C1224c c1224cM2673h7 = c1223bM2672g7.m2673h(1937011578);
                    if (c1224cM2673h7 != null) {
                        c0758p = new C0945b(c1224cM2673h7, c0249w2);
                    } else {
                        C1224c c1224cM2673h8 = c1223bM2672g7.m2673h(1937013298);
                        if (c1224cM2673h8 == null) {
                            throw C0247v0.createForMalformedContainer("Track has no sample table size information", null);
                        }
                        c0758p = new C0758p(c1224cM2673h8);
                    }
                    int iMo1857b = c0758p.mo1857b();
                    if (iMo1857b == 0) {
                        c1155t = new C1155t(c1152q4, new long[0], new int[0], 0, new long[0], new int[0], 0L);
                        arrayList3 = arrayList5;
                    } else {
                        if (c1152q4.f4929b == 2) {
                            long j15 = c1152q4.f4933f;
                            if (j15 > 0) {
                                C0246v c0246vM692a = c0249w2.m692a();
                                c0246vM692a.f1456v = iMo1857b / (j15 / 1000000.0f);
                                interfaceC1138c = c0758p;
                                c1152q4 = new C1152q(c1152q4.f4928a, c1152q4.f4929b, c1152q4.f4930c, c1152q4.f4931d, c1152q4.f4932e, c1152q4.f4933f, new C0249w(c0246vM692a), c1152q4.f4935h, c1152q4.f4939l, c1152q4.f4938k, c1152q4.f4936i, c1152q4.f4937j);
                            } else {
                                interfaceC1138c = c0758p;
                            }
                            long j16 = c1152q4.f4930c;
                            int i34 = c1152q4.f4929b;
                            long[] jArr9 = c1152q4.f4937j;
                            C0249w c0249w3 = c1152q4.f4934g;
                            long[] jArr10 = c1152q4.f4936i;
                            C1224c c1224cM2673h9 = c1223bM2672g7.m2673h(1937007471);
                            if (c1224cM2673h9 == null) {
                                c1224cM2673h9 = c1223bM2672g7.m2673h(1668232756);
                                c1224cM2673h9.getClass();
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            C1132w c1132w6 = c1224cM2673h9.f5112c;
                            C1224c c1224cM2673h10 = c1223bM2672g7.m2673h(1937011555);
                            c1224cM2673h10.getClass();
                            C1132w c1132w7 = c1224cM2673h10.f5112c;
                            C1224c c1224cM2673h11 = c1223bM2672g7.m2673h(1937011827);
                            c1224cM2673h11.getClass();
                            C1132w c1132w8 = c1224cM2673h11.f5112c;
                            InterfaceC1138c interfaceC1138c2 = interfaceC1138c;
                            C1224c c1224cM2673h12 = c1223bM2672g7.m2673h(1937011571);
                            C1132w c1132w9 = c1224cM2673h12 != null ? c1224cM2673h12.f5112c : null;
                            C1224c c1224cM2673h13 = c1223bM2672g7.m2673h(1668576371);
                            C1132w c1132w10 = c1224cM2673h13 != null ? c1224cM2673h13.f5112c : null;
                            C1136a c1136a = new C1136a(c1132w7, c1132w6, z9);
                            c1132w8.m2513G(12);
                            int iM2539y4 = c1132w8.m2539y() - 1;
                            int iM2539y5 = c1132w8.m2539y();
                            int iM2539y6 = c1132w8.m2539y();
                            if (c1132w10 != null) {
                                c1132w10.m2513G(12);
                                iM2539y = c1132w10.m2539y();
                            } else {
                                iM2539y = 0;
                            }
                            if (c1132w9 != null) {
                                c1132w9.m2513G(12);
                                int iM2539y7 = c1132w9.m2539y();
                                if (iM2539y7 > 0) {
                                    iM2539y2 = c1132w9.m2539y() - 1;
                                    i12 = iM2539y7;
                                    iMo1856a = interfaceC1138c2.mo1856a();
                                    c1132w = c1132w10;
                                    String str3 = c0249w3.f1522n;
                                    C1132w c1132w11 = c1132w9;
                                    i13 = c0249w3.f1499D;
                                    if (iMo1856a == -1 && (("audio/raw".equals(str3) || "audio/g711-mlaw".equals(str3) || "audio/g711-alaw".equals(str3)) && iM2539y4 == 0 && iM2539y == 0 && i12 == 0)) {
                                        int i35 = c1136a.f4805a;
                                        long[] jArr11 = new long[i35];
                                        int[] iArr3 = new int[i35];
                                        while (c1136a.m2542a()) {
                                            int i36 = c1136a.f4806b;
                                            jArr11[i36] = c1136a.f4808d;
                                            iArr3[i36] = c1136a.f4807c;
                                            arrayList5 = arrayList5;
                                            iMo1856a = iMo1856a;
                                        }
                                        int i37 = iMo1856a;
                                        arrayList2 = arrayList5;
                                        long j17 = iM2539y6;
                                        int i38 = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED / i37;
                                        int i39 = 0;
                                        int iM2446f = 0;
                                        while (i39 < i35) {
                                            iM2446f += AbstractC1118i0.m2446f(iArr3[i39], i38);
                                            i39++;
                                            j17 = j17;
                                        }
                                        long j18 = j17;
                                        long[] jArr12 = new long[iM2446f];
                                        int[] iArr4 = new int[iM2446f];
                                        jArr4 = new long[iM2446f];
                                        iArrCopyOf2 = new int[iM2446f];
                                        int i40 = 0;
                                        int i41 = 0;
                                        int i42 = 0;
                                        int i43 = 0;
                                        while (i40 < i35) {
                                            int i44 = iArr3[i40];
                                            long j19 = jArr11[i40];
                                            int i45 = i43;
                                            int i46 = i40;
                                            int iMax = i42;
                                            int i47 = i45;
                                            int i48 = i35;
                                            int i49 = i44;
                                            while (i49 > 0) {
                                                int iMin = Math.min(i38, i49);
                                                jArr12[i47] = j19;
                                                int i50 = i49;
                                                int i51 = i37 * iMin;
                                                iArr4[i47] = i51;
                                                iMax = Math.max(iMax, i51);
                                                jArr4[i47] = i41 * j18;
                                                iArrCopyOf2[i47] = 1;
                                                j19 += iArr4[i47];
                                                i41 += iMin;
                                                i47++;
                                                jArr11 = jArr11;
                                                i49 = i50 - iMin;
                                                i38 = i38;
                                            }
                                            int i52 = i38;
                                            int i53 = i46 + 1;
                                            i43 = i47;
                                            i35 = i48;
                                            i42 = iMax;
                                            i40 = i53;
                                            i38 = i52;
                                        }
                                        i16 = i34;
                                        j13 = i41 * j18;
                                        j11 = j16;
                                        jArr3 = jArr10;
                                        jArr5 = jArr12;
                                        iArr = iArr4;
                                        i19 = i42;
                                        i14 = i13;
                                    } else {
                                        arrayList2 = arrayList5;
                                        long[] jArrCopyOf = new long[iMo1857b];
                                        iArrCopyOf = new int[iMo1857b];
                                        long[] jArrCopyOf2 = new long[iMo1857b];
                                        int[] iArr5 = new int[iMo1857b];
                                        int i54 = i12;
                                        i14 = i13;
                                        int i55 = i54;
                                        j11 = j16;
                                        jArr3 = jArr10;
                                        int iM2539y8 = iM2539y5;
                                        long j20 = 0;
                                        j12 = 0;
                                        int i56 = 0;
                                        int iM2521g7 = 0;
                                        i15 = 0;
                                        int i57 = 0;
                                        int i58 = iM2539y4;
                                        int iM2521g8 = iM2539y6;
                                        int iM2539y9 = iM2539y2;
                                        i16 = i34;
                                        i17 = 0;
                                        while (true) {
                                            if (i17 < iMo1857b) {
                                                c1152q2 = c1152q4;
                                                i18 = i58;
                                                iArrCopyOf2 = iArr5;
                                                break;
                                            }
                                            boolean zM2542a = true;
                                            while (i15 == 0) {
                                                zM2542a = c1136a.m2542a();
                                                if (!zM2542a) {
                                                    break;
                                                }
                                                C1152q c1152q5 = c1152q4;
                                                long j21 = c1136a.f4808d;
                                                i15 = c1136a.f4807c;
                                                j12 = j21;
                                                c1152q4 = c1152q5;
                                                i58 = i58;
                                                iMo1857b = iMo1857b;
                                            }
                                            i20 = iMo1857b;
                                            c1152q2 = c1152q4;
                                            i18 = i58;
                                            if (!zM2542a) {
                                                AbstractC1101a.m2348F("BoxParsers", "Unexpected end of chunk data");
                                                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i17);
                                                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i17);
                                                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i17);
                                                iArrCopyOf2 = Arrays.copyOf(iArr5, i17);
                                                iMo1857b = i17;
                                                break;
                                            }
                                            if (c1132w != null) {
                                                int iM2539y10 = i57;
                                                while (iM2539y10 == 0 && iM2539y > 0) {
                                                    iM2539y10 = c1132w.m2539y();
                                                    iM2521g7 = c1132w.m2521g();
                                                    iM2539y--;
                                                }
                                                i57 = iM2539y10 - 1;
                                            }
                                            jArrCopyOf[i17] = j12;
                                            int iMo1858c = interfaceC1138c2.mo1858c();
                                            iArrCopyOf[i17] = iMo1858c;
                                            if (iMo1858c > i56) {
                                                i56 = iMo1858c;
                                            }
                                            jArrCopyOf2[i17] = j20 + iM2521g7;
                                            iArr5[i17] = c1132w11 == null ? 1 : 0;
                                            if (i17 == iM2539y9) {
                                                iArr5[i17] = 1;
                                                i55--;
                                                if (i55 > 0) {
                                                    c1132w11.getClass();
                                                    iM2539y9 = c1132w11.m2539y() - 1;
                                                }
                                            }
                                            j20 += iM2521g8;
                                            iM2539y8--;
                                            if (iM2539y8 != 0 || i18 <= 0) {
                                                i58 = i18;
                                            } else {
                                                iM2539y8 = c1132w8.m2539y();
                                                i58 = i18 - 1;
                                                iM2521g8 = c1132w8.m2521g();
                                            }
                                            j12 += iArrCopyOf[i17];
                                            i15--;
                                            i17++;
                                            c1152q4 = c1152q2;
                                            iMo1857b = i20;
                                        }
                                        jArr4 = jArrCopyOf2;
                                        int i59 = i15;
                                        long j22 = j20 + iM2521g7;
                                        if (c1132w == null) {
                                            while (iM2539y > 0) {
                                                if (c1132w.m2539y() != 0) {
                                                    z10 = false;
                                                    break;
                                                }
                                                c1132w.m2521g();
                                                iM2539y--;
                                            }
                                            z10 = true;
                                            if (i55 != 0 && iM2539y8 == 0 && i59 == 0 && i18 == 0 && i57 == 0 && z10) {
                                                c1152q4 = c1152q2;
                                            } else {
                                                StringBuilder sb = new StringBuilder("Inconsistent stbl box for track ");
                                                c1152q4 = c1152q2;
                                                sb.append(c1152q4.f4928a);
                                                sb.append(": remainingSynchronizationSamples ");
                                                sb.append(i55);
                                                sb.append(", remainingSamplesAtTimestampDelta ");
                                                sb.append(iM2539y8);
                                                sb.append(", remainingSamplesInChunk ");
                                                sb.append(i59);
                                                sb.append(", remainingTimestampDeltaChanges ");
                                                sb.append(i18);
                                                sb.append(", remainingSamplesAtTimestampOffset ");
                                                sb.append(i57);
                                                sb.append(z10 ? ", ctts invalid" : C2181z.FRAGMENT_ENCODE_SET);
                                                AbstractC1101a.m2348F("BoxParsers", sb.toString());
                                            }
                                            jArr5 = jArrCopyOf;
                                            iArr = iArrCopyOf;
                                            i19 = i56;
                                            j13 = j22;
                                        } else {
                                            z10 = true;
                                            if (i55 != 0) {
                                                StringBuilder sb2 = new StringBuilder("Inconsistent stbl box for track ");
                                                c1152q4 = c1152q2;
                                                sb2.append(c1152q4.f4928a);
                                                sb2.append(": remainingSynchronizationSamples ");
                                                sb2.append(i55);
                                                sb2.append(", remainingSamplesAtTimestampDelta ");
                                                sb2.append(iM2539y8);
                                                sb2.append(", remainingSamplesInChunk ");
                                                sb2.append(i59);
                                                sb2.append(", remainingTimestampDeltaChanges ");
                                                sb2.append(i18);
                                                sb2.append(", remainingSamplesAtTimestampOffset ");
                                                sb2.append(i57);
                                                sb2.append(z10 ? ", ctts invalid" : C2181z.FRAGMENT_ENCODE_SET);
                                                AbstractC1101a.m2348F("BoxParsers", sb2.toString());
                                                jArr5 = jArrCopyOf;
                                                iArr = iArrCopyOf;
                                                i19 = i56;
                                                j13 = j22;
                                            }
                                        }
                                    }
                                    long j23 = c1152q4.f4930c;
                                    RoundingMode roundingMode = RoundingMode.DOWN;
                                    long jM2437a03 = AbstractC1118i0.m2437a0(j13, 1000000L, j23, roundingMode);
                                    if (jArr3 == null) {
                                        AbstractC1118i0.m2435Z(jArr4, j11);
                                        c1155t2 = new C1155t(c1152q4, jArr5, iArr, i19, jArr4, iArrCopyOf2, jM2437a03);
                                    } else {
                                        int i60 = i16;
                                        long[] jArr13 = jArr3;
                                        long j24 = j11;
                                        int[] iArr6 = iArrCopyOf2;
                                        if (jArr13.length == 1 && i60 == 1 && jArr4.length >= 2) {
                                            jArr9.getClass();
                                            long j25 = jArr9[0];
                                            long jM2437a04 = j25 + AbstractC1118i0.m2437a0(jArr13[0], c1152q4.f4930c, c1152q4.f4931d, roundingMode);
                                            int length = jArr4.length - 1;
                                            int iM2451j = AbstractC1118i0.m2451j(4, 0, length);
                                            int iM2451j2 = AbstractC1118i0.m2451j(jArr4.length - 4, 0, length);
                                            long j26 = jArr4[0];
                                            if (j26 <= j25 && j25 < jArr4[iM2451j] && jArr4[iM2451j2] < jM2437a04 && jM2437a04 <= j13) {
                                                long j27 = i14;
                                                long jM2437a05 = AbstractC1118i0.m2437a0(j25 - j26, j27, c1152q4.f4930c, roundingMode);
                                                long jM2437a06 = AbstractC1118i0.m2437a0(j13 - jM2437a04, j27, c1152q4.f4930c, roundingMode);
                                                if ((jM2437a05 != 0 || jM2437a06 != 0) && jM2437a05 <= 2147483647L && jM2437a06 <= 2147483647L) {
                                                    c1995v.f7391a = (int) jM2437a05;
                                                    c1995v.f7392b = (int) jM2437a06;
                                                    AbstractC1118i0.m2435Z(jArr4, j24);
                                                    c1155t2 = new C1155t(c1152q4, jArr5, iArr, i19, jArr4, iArr6, AbstractC1118i0.m2437a0(jArr13[0], 1000000L, c1152q4.f4931d, roundingMode));
                                                }
                                            }
                                        }
                                        int i61 = 1;
                                        if (jArr13.length != 1) {
                                            long[] jArr14 = jArr5;
                                            int[] iArr7 = iArr;
                                            boolean z13 = i60 != i61;
                                            int[] iArr8 = new int[jArr13.length];
                                            int[] iArr9 = new int[jArr13.length];
                                            jArr9.getClass();
                                            i21 = 0;
                                            boolean z14 = false;
                                            int i62 = 0;
                                            int i63 = 0;
                                            while (i21 < jArr13.length) {
                                                int[] iArr10 = iArr8;
                                                int[] iArr11 = iArr9;
                                                long j28 = jArr9[i21];
                                                if (j28 != -1) {
                                                    i23 = i21;
                                                    boolean z15 = z14;
                                                    long jM2437a07 = AbstractC1118i0.m2437a0(jArr13[i21], c1152q4.f4930c, c1152q4.f4931d, RoundingMode.DOWN);
                                                    iArr2 = iArr10;
                                                    iArr2[i23] = AbstractC1118i0.m2444e(jArr4, j28, true);
                                                    while (true) {
                                                        int i64 = iArr2[i23];
                                                        if (i64 < 0 || (iArr6[i64] & 1) != 0) {
                                                            break;
                                                        }
                                                        iArr2[i23] = i64 - 1;
                                                    }
                                                    long j29 = j28 + jM2437a07;
                                                    iArr11[i23] = AbstractC1118i0.m2436a(jArr4, j29, z13);
                                                    if (i60 == 2) {
                                                        while (true) {
                                                            int i65 = iArr11[i23];
                                                            if (i65 >= jArr4.length - 1) {
                                                                break;
                                                            }
                                                            int i66 = i65 + 1;
                                                            if (jArr4[i66] > j29) {
                                                                break;
                                                            }
                                                            iArr11[i23] = i66;
                                                        }
                                                    }
                                                    int i67 = iArr11[i23];
                                                    int i68 = iArr2[i23];
                                                    int i69 = (i67 - i68) + i62;
                                                    boolean z16 = i63 != i68;
                                                    i63 = i67;
                                                    z14 = z15 | z16;
                                                    i62 = i69;
                                                } else {
                                                    iArr2 = iArr10;
                                                    i23 = i21;
                                                }
                                                i21 = i23 + 1;
                                                iArr9 = iArr11;
                                                iArr8 = iArr2;
                                            }
                                            int[] iArr12 = iArr8;
                                            int[] iArr13 = iArr9;
                                            z11 = z14 | (i62 == iMo1857b);
                                            long[] jArr15 = !z11 ? new long[i62] : jArr14;
                                            int[] iArr14 = !z11 ? new int[i62] : iArr7;
                                            if (z11) {
                                                i19 = 0;
                                            }
                                            int[] iArr15 = !z11 ? new int[i62] : iArr6;
                                            long[] jArr16 = new long[i62];
                                            int i70 = i19;
                                            i22 = 0;
                                            z12 = false;
                                            int i71 = 0;
                                            long j30 = 0;
                                            while (i22 < jArr13.length) {
                                                long j31 = jArr9[i22];
                                                int i72 = iArr12[i22];
                                                int i73 = iArr13[i22];
                                                long[] jArr17 = jArr13;
                                                if (z11) {
                                                    int i74 = i73 - i72;
                                                    System.arraycopy(jArr14, i72, jArr15, i71, i74);
                                                    System.arraycopy(iArr7, i72, iArr14, i71, i74);
                                                    System.arraycopy(iArr6, i72, iArr15, i71, i74);
                                                }
                                                int i75 = i70;
                                                while (i72 < i73) {
                                                    long[] jArr18 = jArr14;
                                                    int[] iArr16 = iArr7;
                                                    long j32 = c1152q4.f4931d;
                                                    RoundingMode roundingMode2 = RoundingMode.DOWN;
                                                    long jM2437a08 = AbstractC1118i0.m2437a0(j30, 1000000L, j32, roundingMode2);
                                                    long jM2437a09 = AbstractC1118i0.m2437a0(jArr4[i72] - j31, 1000000L, c1152q4.f4930c, roundingMode2);
                                                    if (jM2437a09 < 0) {
                                                        z12 = true;
                                                    }
                                                    jArr16[i71] = jM2437a08 + jM2437a09;
                                                    if (z11 && iArr14[i71] > i75) {
                                                        i75 = iArr16[i72];
                                                    }
                                                    i71++;
                                                    i72++;
                                                    jArr14 = jArr18;
                                                    iArr7 = iArr16;
                                                }
                                                j30 += jArr17[i22];
                                                i22++;
                                                i70 = i75;
                                                jArr14 = jArr14;
                                                iArr7 = iArr7;
                                                jArr13 = jArr17;
                                            }
                                            long jM2437a010 = AbstractC1118i0.m2437a0(j30, 1000000L, c1152q4.f4931d, RoundingMode.DOWN);
                                            if (z12) {
                                                c1152q3 = c1152q4;
                                            } else {
                                                C0246v c0246vM692a2 = c0249w3.m692a();
                                                c0246vM692a2.f1453s = true;
                                                c1152q3 = new C1152q(c1152q4.f4928a, c1152q4.f4929b, c1152q4.f4930c, c1152q4.f4931d, c1152q4.f4932e, c1152q4.f4933f, new C0249w(c0246vM692a2), c1152q4.f4935h, c1152q4.f4939l, c1152q4.f4938k, c1152q4.f4936i, c1152q4.f4937j);
                                            }
                                            arrayList3 = arrayList2;
                                            c1155t = new C1155t(c1152q3, jArr15, iArr14, i70, jArr16, iArr15, jM2437a010);
                                            arrayList3.add(c1155t);
                                        } else if (jArr13[0] == 0) {
                                            jArr9.getClass();
                                            long j33 = jArr9[0];
                                            for (int i76 = 0; i76 < jArr4.length; i76++) {
                                                jArr4[i76] = AbstractC1118i0.m2437a0(jArr4[i76] - j33, 1000000L, c1152q4.f4930c, RoundingMode.DOWN);
                                            }
                                            c1155t = new C1155t(c1152q4, jArr5, iArr, i19, jArr4, iArr6, AbstractC1118i0.m2437a0(j13 - j33, 1000000L, c1152q4.f4930c, RoundingMode.DOWN));
                                            arrayList3 = arrayList2;
                                            arrayList3.add(c1155t);
                                        } else {
                                            i61 = 1;
                                            long[] jArr142 = jArr5;
                                            int[] iArr72 = iArr;
                                            if (i60 != i61) {
                                            }
                                            int[] iArr82 = new int[jArr13.length];
                                            int[] iArr92 = new int[jArr13.length];
                                            jArr9.getClass();
                                            i21 = 0;
                                            boolean z142 = false;
                                            int i622 = 0;
                                            int i632 = 0;
                                            while (i21 < jArr13.length) {
                                            }
                                            int[] iArr122 = iArr82;
                                            int[] iArr132 = iArr92;
                                            z11 = z142 | (i622 == iMo1857b);
                                            if (!z11) {
                                            }
                                            if (!z11) {
                                            }
                                            if (z11) {
                                            }
                                            if (!z11) {
                                            }
                                            long[] jArr162 = new long[i622];
                                            int i702 = i19;
                                            i22 = 0;
                                            z12 = false;
                                            int i712 = 0;
                                            long j302 = 0;
                                            while (i22 < jArr13.length) {
                                            }
                                            long jM2437a0102 = AbstractC1118i0.m2437a0(j302, 1000000L, c1152q4.f4931d, RoundingMode.DOWN);
                                            if (z12) {
                                            }
                                            arrayList3 = arrayList2;
                                            c1155t = new C1155t(c1152q3, jArr15, iArr14, i702, jArr162, iArr15, jM2437a0102);
                                            arrayList3.add(c1155t);
                                        }
                                    }
                                    c1155t = c1155t2;
                                    arrayList3 = arrayList2;
                                } else {
                                    i12 = iM2539y7;
                                    c1132w9 = null;
                                }
                            } else {
                                i12 = 0;
                            }
                            iM2539y2 = -1;
                            iMo1856a = interfaceC1138c2.mo1856a();
                            c1132w = c1132w10;
                            String str32 = c0249w3.f1522n;
                            C1132w c1132w112 = c1132w9;
                            i13 = c0249w3.f1499D;
                            if (iMo1856a == -1) {
                                arrayList2 = arrayList5;
                                long[] jArrCopyOf3 = new long[iMo1857b];
                                iArrCopyOf = new int[iMo1857b];
                                long[] jArrCopyOf22 = new long[iMo1857b];
                                int[] iArr52 = new int[iMo1857b];
                                int i542 = i12;
                                i14 = i13;
                                int i552 = i542;
                                j11 = j16;
                                jArr3 = jArr10;
                                int iM2539y82 = iM2539y5;
                                long j202 = 0;
                                j12 = 0;
                                int i562 = 0;
                                int iM2521g72 = 0;
                                i15 = 0;
                                int i572 = 0;
                                int i582 = iM2539y4;
                                int iM2521g82 = iM2539y6;
                                int iM2539y92 = iM2539y2;
                                i16 = i34;
                                i17 = 0;
                                while (true) {
                                    if (i17 < iMo1857b) {
                                    }
                                    j12 += iArrCopyOf[i17];
                                    i15--;
                                    i17++;
                                    c1152q4 = c1152q2;
                                    iMo1857b = i20;
                                }
                                jArr4 = jArrCopyOf22;
                                int i592 = i15;
                                long j222 = j202 + iM2521g72;
                                if (c1132w == null) {
                                }
                            }
                        }
                        i24 = i10 + 1;
                        arrayList5 = arrayList3;
                        arrayList4 = arrayList;
                        c1223b2 = c1223b;
                    }
                    arrayList3.add(c1155t);
                    i24 = i10 + 1;
                    arrayList5 = arrayList3;
                    arrayList4 = arrayList;
                    c1223b2 = c1223b;
                }
            }
            i24 = i10 + 1;
            arrayList5 = arrayList3;
            arrayList4 = arrayList;
            c1223b2 = c1223b;
        }
        return arrayList5;
    }

    /* JADX WARN: Removed duplicated region for block: B:212:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07a7  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2552h(C1132w c1132w, int i, int i4, int i8, int i9, int i10, C0237s c0237s, C0619s c0619s, int i11) throws C0247v0 {
        int iM632f;
        int i12;
        int i13;
        String str;
        int i14;
        C0237s c0237s2;
        String str2;
        C0022h c0022h;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int iM2494k;
        int i21;
        int iM2494k2;
        int i22;
        int i23;
        int iM633g;
        C0216l c0216l;
        int i24;
        int iM2494k3;
        C0216l c0216l2;
        int i25;
        String str3;
        C0237s c0237s3;
        int i26;
        C0036o c0036o;
        int i27 = i4;
        int i28 = i8;
        C0237s c0237sM667a = c0237s;
        C0619s c0619s2 = c0619s;
        c1132w.m2513G(i27 + 16);
        c1132w.m2514H(16);
        int iM2507A = c1132w.m2507A();
        int iM2507A2 = c1132w.m2507A();
        c1132w.m2514H(50);
        int i29 = c1132w.f4800b;
        int iIntValue = i;
        if (iIntValue == 1701733238) {
            Pair pairM2549e = m2549e(c1132w, i27, i28);
            if (pairM2549e != null) {
                iIntValue = ((Integer) pairM2549e.first).intValue();
                c0237sM667a = c0237sM667a == null ? null : c0237sM667a.m667a(((C1153r) pairM2549e.second).f4941b);
                ((C1153r[]) c0619s2.f2440c)[i11] = (C1153r) pairM2549e.second;
            }
            c1132w.m2513G(i29);
        }
        String str4 = "video/3gpp";
        String str5 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fM2539y = 1.0f;
        List listM2168n = null;
        String str6 = null;
        byte[] bArrCopyOfRange = null;
        int i30 = -1;
        int i31 = -1;
        ByteBuffer byteBufferOrder = null;
        boolean z7 = false;
        int i32 = -1;
        int i33 = -1;
        int iM633g2 = -1;
        int i34 = 8;
        int i35 = 8;
        C1137b c1137b = null;
        C0022h c0022h2 = null;
        while (i29 - i27 < i28) {
            c1132w.m2513G(i29);
            int i36 = c1132w.f4800b;
            int iM2521g = c1132w.m2521g();
            if (iM2521g == 0 && c1132w.f4800b - i27 == i28) {
                break;
            }
            String str7 = "childAtomSize must be positive";
            AbstractC1965b.m3828d("childAtomSize must be positive", iM2521g > 0);
            int iM2521g2 = c1132w.m2521g();
            if (iM2521g2 == 1635148611) {
                AbstractC1965b.m3828d(null, str5 == null);
                c1132w.m2513G(i36 + 8);
                C1969d c1969dM3849a = C1969d.m3849a(c1132w);
                listM2168n = c1969dM3849a.f7298a;
                c0619s2.f2438a = c1969dM3849a.f7299b;
                if (!z7) {
                    fM2539y = c1969dM3849a.f7308k;
                }
                String str8 = c1969dM3849a.f7309l;
                int i37 = c1969dM3849a.f7307j;
                int i38 = c1969dM3849a.f7304g;
                int i39 = c1969dM3849a.f7305h;
                str6 = str8;
                int i40 = c1969dM3849a.f7306i;
                int i41 = c1969dM3849a.f7302e;
                i14 = c1969dM3849a.f7303f;
                i34 = i41;
                c0237s2 = c0237sM667a;
                i13 = i29;
                iM632f = i38;
                i16 = iIntValue;
                str = str4;
                i12 = i39;
                iM633g2 = i40;
                i31 = i37;
                str5 = "video/avc";
            } else {
                int i42 = i29;
                if (iM2521g2 == 1752589123) {
                    AbstractC1965b.m3828d(null, str5 == null);
                    c1132w.m2513G(i36 + 8);
                    C1996w c1996wM3878a = C1996w.m3878a(c1132w, false, null);
                    listM2168n = c1996wM3878a.f7393a;
                    c0619s2.f2438a = c1996wM3878a.f7394b;
                    if (!z7) {
                        fM2539y = c1996wM3878a.f7401i;
                    }
                    int i43 = c1996wM3878a.f7402j;
                    String str9 = c1996wM3878a.f7403k;
                    int i44 = c1996wM3878a.f7400h;
                    if (i44 != -1) {
                        i30 = i44;
                    }
                    int i45 = c1996wM3878a.f7397e;
                    int i46 = c1996wM3878a.f7398f;
                    int i47 = c1996wM3878a.f7399g;
                    int i48 = c1996wM3878a.f7395c;
                    i14 = c1996wM3878a.f7396d;
                    c0237s2 = c0237sM667a;
                    c0022h2 = c1996wM3878a.f7404l;
                    i16 = iIntValue;
                    str = str4;
                    i12 = i46;
                    iM633g2 = i47;
                    i34 = i48;
                    i13 = i42;
                    str5 = "video/hevc";
                    iM632f = i45;
                    i31 = i43;
                    str6 = str9;
                } else {
                    String str10 = str4;
                    if (iM2521g2 == 1818785347) {
                        AbstractC1965b.m3828d("lhvC must follow hvcC atom", "video/hevc".equals(str5));
                        C0022h c0022h3 = c0022h2;
                        AbstractC1965b.m3828d("must have at least two layers", c0022h3 != null && ((AbstractC0983m0) c0022h3.f78j).size() >= 2);
                        c1132w.m2513G(i36 + 8);
                        c0022h3.getClass();
                        C1996w c1996wM3878a2 = C1996w.m3878a(c1132w, true, c0022h3);
                        AbstractC1965b.m3828d("nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms", c0619s2.f2438a == c1996wM3878a2.f7394b);
                        int i49 = c1996wM3878a2.f7397e;
                        int i50 = i32;
                        if (i49 != -1) {
                            AbstractC1965b.m3828d("colorSpace must be the same for both views", i50 == i49);
                        }
                        int i51 = c1996wM3878a2.f7398f;
                        int i52 = i33;
                        if (i51 != -1) {
                            AbstractC1965b.m3828d("colorRange must be the same for both views", i52 == i51);
                        }
                        int i53 = c1996wM3878a2.f7399g;
                        int i54 = iM633g2;
                        if (i53 != -1) {
                            AbstractC1965b.m3828d("colorTransfer must be the same for both views", i54 == i53);
                        }
                        int i55 = i34;
                        AbstractC1965b.m3828d("bitdepthLuma must be the same for both views", i55 == c1996wM3878a2.f7395c);
                        int i56 = i35;
                        AbstractC1965b.m3828d("bitdepthChroma must be the same for both views", i56 == c1996wM3878a2.f7396d);
                        if (listM2168n != null) {
                            C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
                            c0974j0M2164i.m2143c(listM2168n);
                            c0974j0M2164i.m2143c(c1996wM3878a2.f7393a);
                            listM2168n = c0974j0M2164i.m2159f();
                        } else {
                            AbstractC1965b.m3828d("initializationData must be already set from hvcC atom", false);
                        }
                        String str11 = c1996wM3878a2.f7403k;
                        c0022h2 = c0022h3;
                        c0237s2 = c0237sM667a;
                        str5 = "video/mv-hevc";
                        i16 = iIntValue;
                        iM633g2 = i54;
                        i34 = i55;
                        iM632f = i50;
                        i13 = i42;
                        str = str10;
                        i14 = i56;
                        str6 = str11;
                        i12 = i52;
                    } else {
                        iM632f = i32;
                        i12 = i33;
                        int i57 = iM633g2;
                        C0022h c0022h4 = c0022h2;
                        i13 = i42;
                        str = str10;
                        int i58 = i34;
                        i14 = i35;
                        if (iM2521g2 == 1986361461) {
                            c1132w.m2513G(i36 + 8);
                            int i59 = c1132w.f4800b;
                            str2 = str5;
                            C0036o c0036o2 = null;
                            while (i59 - i36 < iM2521g) {
                                c1132w.m2513G(i59);
                                int iM2521g3 = c1132w.m2521g();
                                int i60 = i59;
                                AbstractC1965b.m3828d(str7, iM2521g3 > 0);
                                if (c1132w.m2521g() == 1702454643) {
                                    c1132w.m2513G(i60 + 8);
                                    int i61 = c1132w.f4800b;
                                    while (true) {
                                        if (i61 - i60 >= iM2521g3) {
                                            str3 = str7;
                                            c0237s3 = c0237sM667a;
                                            i26 = iM2521g3;
                                            c0036o = null;
                                            break;
                                        }
                                        c1132w.m2513G(i61);
                                        int iM2521g4 = c1132w.m2521g();
                                        AbstractC1965b.m3828d(str7, iM2521g4 > 0);
                                        str3 = str7;
                                        if (c1132w.m2521g() == 1937011305) {
                                            c1132w.m2514H(4);
                                            int iM2535u = c1132w.m2535u();
                                            boolean z8 = (iM2535u & 1) == 1;
                                            i26 = iM2521g3;
                                            boolean z9 = (iM2535u & 2) == 2;
                                            c0237s3 = c0237sM667a;
                                            boolean z10 = (iM2535u & 8) == 8;
                                            C0089k c0089k = new C0089k();
                                            c0089k.f389a = z8;
                                            c0089k.f390b = z9;
                                            c0089k.f391c = z10;
                                            c0036o = new C0036o(24, c0089k);
                                        } else {
                                            i61 += iM2521g4;
                                            str7 = str3;
                                        }
                                    }
                                    c0036o2 = c0036o;
                                } else {
                                    str3 = str7;
                                    c0237s3 = c0237sM667a;
                                    i26 = iM2521g3;
                                }
                                i59 = i60 + i26;
                                str7 = str3;
                                c0237sM667a = c0237s3;
                            }
                            c0237s2 = c0237sM667a;
                            C0036o c0036o3 = c0036o2 == null ? null : new C0036o(25, c0036o2);
                            if (c0036o3 != null) {
                                C0089k c0089k2 = (C0089k) ((C0036o) c0036o3.f143k).f143k;
                                if (c0022h4 == null || ((AbstractC0983m0) c0022h4.f78j).size() < 2) {
                                    i25 = i30;
                                    i30 = i25 == -1 ? c0089k2.f391c ? 5 : 4 : i25;
                                    c0022h2 = c0022h4;
                                } else {
                                    AbstractC1965b.m3828d("both eye views must be marked as available", c0089k2.f389a && c0089k2.f390b);
                                    AbstractC1965b.m3828d("for MV-HEVC, eye_views_reversed must be set to false", !c0089k2.f391c);
                                    i25 = i30;
                                    c0022h2 = c0022h4;
                                }
                            } else {
                                i25 = i30;
                                c0022h2 = c0022h4;
                            }
                        } else {
                            c0237s2 = c0237sM667a;
                            str2 = str5;
                            int i62 = i30;
                            if (iM2521g2 == 1685480259 || iM2521g2 == 1685485123) {
                                c0022h = c0022h4;
                                i15 = i62;
                                i16 = iIntValue;
                                List list = listM2168n;
                                C1943s c1943sM3797a = C1943s.m3797a(c1132w);
                                if (c1943sM3797a != null) {
                                    str5 = "video/dolby-vision";
                                    str6 = c1943sM3797a.f7233k;
                                } else {
                                    str5 = str2;
                                }
                                iM633g2 = i57;
                                i34 = i58;
                                listM2168n = list;
                            } else {
                                int i63 = 12;
                                int i64 = 7;
                                if (iM2521g2 == 1987076931) {
                                    AbstractC1965b.m3828d(null, str2 == null);
                                    String str12 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                    c1132w.m2513G(i36 + 12);
                                    byte bM2535u = (byte) c1132w.m2535u();
                                    byte bM2535u2 = (byte) c1132w.m2535u();
                                    int iM2535u2 = c1132w.m2535u();
                                    int i65 = iM2535u2 >> 4;
                                    byte b7 = (byte) ((iM2535u2 >> 1) & 7);
                                    if (str12.equals("video/x-vnd.on2.vp9")) {
                                        byte[] bArr = AbstractC1105c.f4716a;
                                        listM2168n = AbstractC0983m0.m2168n(new byte[]{1, 1, bM2535u, 2, 1, bM2535u2, 3, 1, (byte) i65, 4, 1, b7});
                                    }
                                    boolean z11 = (iM2535u2 & 1) != 0;
                                    int iM2535u3 = c1132w.m2535u();
                                    int iM2535u4 = c1132w.m2535u();
                                    iM632f = C0216l.m632f(iM2535u3);
                                    int i66 = z11 ? 1 : 2;
                                    iM633g2 = C0216l.m633g(iM2535u4);
                                    c0022h2 = c0022h4;
                                    i30 = i62;
                                    i14 = i65;
                                    i34 = i14;
                                    i16 = iIntValue;
                                    i12 = i66;
                                    str5 = str12;
                                } else if (iM2521g2 == 1635135811) {
                                    int i67 = iM2521g - 8;
                                    byte[] bArr2 = new byte[i67];
                                    c1132w.m2519e(bArr2, 0, i67);
                                    listM2168n = AbstractC0983m0.m2168n(bArr2);
                                    c1132w.m2513G(i36 + 8);
                                    byte[] bArr3 = c1132w.f4799a;
                                    C1131v c1131v = new C1131v(bArr3, bArr3.length);
                                    c1131v.m2502s(c1132w.f4800b * 8);
                                    c1131v.m2506w(1);
                                    int iM2494k4 = c1131v.m2494k(3);
                                    c1131v.m2505v(6);
                                    boolean zM2493j = c1131v.m2493j();
                                    boolean zM2493j2 = c1131v.m2493j();
                                    int i68 = -1;
                                    if (iM2494k4 == 2 && zM2493j) {
                                        int i69 = zM2493j2 ? 12 : 10;
                                        i20 = zM2493j2 ? 12 : 10;
                                        i18 = i69;
                                    } else if (iM2494k4 <= 2) {
                                        int i70 = zM2493j ? 10 : 8;
                                        i20 = zM2493j ? 10 : 8;
                                        i18 = i70;
                                    } else {
                                        i18 = -1;
                                        i19 = -1;
                                        c1131v.m2505v(13);
                                        c1131v.m2504u();
                                        iM2494k = c1131v.m2494k(4);
                                        if (iM2494k == 1) {
                                            AbstractC1101a.m2371v("BoxParsers", "Unsupported obu_type: " + iM2494k);
                                            c0216l2 = new C0216l(-1, -1, -1, i18, i19, null);
                                        } else if (c1131v.m2493j()) {
                                            AbstractC1101a.m2371v("BoxParsers", "Unsupported obu_extension_flag");
                                            c0216l2 = new C0216l(-1, -1, -1, i18, i19, null);
                                        } else {
                                            boolean zM2493j3 = c1131v.m2493j();
                                            c1131v.m2504u();
                                            if (!zM2493j3 || c1131v.m2494k(8) <= 127) {
                                                int iM2494k5 = c1131v.m2494k(3);
                                                c1131v.m2504u();
                                                if (c1131v.m2493j()) {
                                                    AbstractC1101a.m2371v("BoxParsers", "Unsupported reduced_still_picture_header");
                                                    c0216l2 = new C0216l(-1, -1, -1, i18, i19, null);
                                                } else if (c1131v.m2493j()) {
                                                    AbstractC1101a.m2371v("BoxParsers", "Unsupported timing_info_present_flag");
                                                    c0216l2 = new C0216l(-1, -1, -1, i18, i19, null);
                                                } else if (c1131v.m2493j()) {
                                                    AbstractC1101a.m2371v("BoxParsers", "Unsupported initial_display_delay_present_flag");
                                                    c0216l2 = new C0216l(-1, -1, -1, i18, i19, null);
                                                } else {
                                                    int i71 = 5;
                                                    int iM2494k6 = c1131v.m2494k(5);
                                                    int i72 = 0;
                                                    while (i72 <= iM2494k6) {
                                                        c1131v.m2505v(i63);
                                                        if (c1131v.m2494k(i71) > i64) {
                                                            c1131v.m2504u();
                                                        }
                                                        i72++;
                                                        i63 = 12;
                                                        i71 = 5;
                                                        i64 = 7;
                                                    }
                                                    int iM2494k7 = c1131v.m2494k(4);
                                                    int iM2494k8 = c1131v.m2494k(4);
                                                    c1131v.m2505v(iM2494k7 + 1);
                                                    c1131v.m2505v(iM2494k8 + 1);
                                                    if (c1131v.m2493j()) {
                                                        c1131v.m2505v(7);
                                                    }
                                                    c1131v.m2505v(7);
                                                    boolean zM2493j4 = c1131v.m2493j();
                                                    if (zM2493j4) {
                                                        c1131v.m2505v(2);
                                                    }
                                                    if (c1131v.m2493j()) {
                                                        iM2494k2 = 2;
                                                        i21 = 1;
                                                    } else {
                                                        i21 = 1;
                                                        iM2494k2 = c1131v.m2494k(1);
                                                    }
                                                    if (iM2494k2 > 0 && !c1131v.m2493j()) {
                                                        c1131v.m2505v(i21);
                                                    }
                                                    if (zM2493j4) {
                                                        c1131v.m2505v(3);
                                                    }
                                                    c1131v.m2505v(3);
                                                    boolean zM2493j5 = c1131v.m2493j();
                                                    if (iM2494k5 == 2 && zM2493j5) {
                                                        c1131v.m2504u();
                                                    }
                                                    boolean z12 = iM2494k5 != 1 && c1131v.m2493j();
                                                    if (c1131v.m2493j()) {
                                                        int iM2494k9 = c1131v.m2494k(8);
                                                        int iM2494k10 = c1131v.m2494k(8);
                                                        int iM2494k11 = c1131v.m2494k(8);
                                                        if (z12) {
                                                            i24 = 1;
                                                        } else {
                                                            i24 = 1;
                                                            if (iM2494k9 == 1 && iM2494k10 == 13 && iM2494k11 == 0) {
                                                                iM2494k3 = 1;
                                                            }
                                                            int iM632f2 = C0216l.m632f(iM2494k9);
                                                            int i73 = iM2494k3 != i24 ? 1 : 2;
                                                            i22 = iM632f2;
                                                            i23 = i19;
                                                            iM633g = C0216l.m633g(iM2494k10);
                                                            i68 = i73;
                                                        }
                                                        iM2494k3 = c1131v.m2494k(i24);
                                                        int iM632f22 = C0216l.m632f(iM2494k9);
                                                        if (iM2494k3 != i24) {
                                                        }
                                                        i22 = iM632f22;
                                                        i23 = i19;
                                                        iM633g = C0216l.m633g(iM2494k10);
                                                        i68 = i73;
                                                    } else {
                                                        i22 = -1;
                                                        i23 = i19;
                                                        iM633g = -1;
                                                    }
                                                    c0216l = new C0216l(i22, i68, iM633g, i18, i23, null);
                                                    int i74 = c0216l.f1189e;
                                                    int i75 = c0216l.f1190f;
                                                    int i76 = c0216l.f1185a;
                                                    int i77 = c0216l.f1186b;
                                                    iM633g2 = c0216l.f1187c;
                                                    c0022h2 = c0022h4;
                                                    i30 = i62;
                                                    i34 = i74;
                                                    i14 = i75;
                                                    iM632f = i76;
                                                    i16 = iIntValue;
                                                    i12 = i77;
                                                    str5 = "video/av01";
                                                }
                                            } else {
                                                AbstractC1101a.m2371v("BoxParsers", "Excessive obu_size");
                                                c0216l2 = new C0216l(-1, -1, -1, i18, i19, null);
                                            }
                                        }
                                        c0216l = c0216l2;
                                        int i742 = c0216l.f1189e;
                                        int i752 = c0216l.f1190f;
                                        int i762 = c0216l.f1185a;
                                        int i772 = c0216l.f1186b;
                                        iM633g2 = c0216l.f1187c;
                                        c0022h2 = c0022h4;
                                        i30 = i62;
                                        i34 = i742;
                                        i14 = i752;
                                        iM632f = i762;
                                        i16 = iIntValue;
                                        i12 = i772;
                                        str5 = "video/av01";
                                    }
                                    i19 = i20;
                                    c1131v.m2505v(13);
                                    c1131v.m2504u();
                                    iM2494k = c1131v.m2494k(4);
                                    if (iM2494k == 1) {
                                    }
                                    c0216l = c0216l2;
                                    int i7422 = c0216l.f1189e;
                                    int i7522 = c0216l.f1190f;
                                    int i7622 = c0216l.f1185a;
                                    int i7722 = c0216l.f1186b;
                                    iM633g2 = c0216l.f1187c;
                                    c0022h2 = c0022h4;
                                    i30 = i62;
                                    i34 = i7422;
                                    i14 = i7522;
                                    iM632f = i7622;
                                    i16 = iIntValue;
                                    i12 = i7722;
                                    str5 = "video/av01";
                                } else if (iM2521g2 == 1668050025) {
                                    if (byteBufferOrder == null) {
                                        byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                    }
                                    ByteBuffer byteBuffer = byteBufferOrder;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(c1132w.m2532r());
                                    byteBuffer.putShort(c1132w.m2532r());
                                    byteBufferOrder = byteBuffer;
                                    c0022h2 = c0022h4;
                                    i30 = i62;
                                } else {
                                    if (iM2521g2 == 1835295606) {
                                        if (byteBufferOrder == null) {
                                            byteBufferOrder = ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
                                        }
                                        ByteBuffer byteBuffer2 = byteBufferOrder;
                                        short sM2532r = c1132w.m2532r();
                                        short sM2532r2 = c1132w.m2532r();
                                        short sM2532r3 = c1132w.m2532r();
                                        short sM2532r4 = c1132w.m2532r();
                                        short sM2532r5 = c1132w.m2532r();
                                        c0022h = c0022h4;
                                        short sM2532r6 = c1132w.m2532r();
                                        i16 = iIntValue;
                                        short sM2532r7 = c1132w.m2532r();
                                        List list2 = listM2168n;
                                        short sM2532r8 = c1132w.m2532r();
                                        long jM2537w = c1132w.m2537w();
                                        long jM2537w2 = c1132w.m2537w();
                                        i15 = i62;
                                        byteBuffer2.position(1);
                                        byteBuffer2.putShort(sM2532r5);
                                        byteBuffer2.putShort(sM2532r6);
                                        byteBuffer2.putShort(sM2532r);
                                        byteBuffer2.putShort(sM2532r2);
                                        byteBuffer2.putShort(sM2532r3);
                                        byteBuffer2.putShort(sM2532r4);
                                        byteBuffer2.putShort(sM2532r7);
                                        byteBuffer2.putShort(sM2532r8);
                                        byteBuffer2.putShort((short) (jM2537w / Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                                        byteBuffer2.putShort((short) (jM2537w2 / Renderer.DEFAULT_DURATION_TO_PROGRESS_US));
                                        byteBufferOrder = byteBuffer2;
                                        str5 = str2;
                                        listM2168n = list2;
                                        iM633g2 = i57;
                                    } else {
                                        c0022h = c0022h4;
                                        i15 = i62;
                                        i16 = iIntValue;
                                        List list3 = listM2168n;
                                        if (iM2521g2 == 1681012275) {
                                            AbstractC1965b.m3828d(null, str2 == null);
                                            i34 = i58;
                                            str5 = str;
                                            listM2168n = list3;
                                            iM633g2 = i57;
                                        } else if (iM2521g2 == 1702061171) {
                                            AbstractC1965b.m3828d(null, str2 == null);
                                            C1137b c1137bM2545a = m2545a(c1132w, i36);
                                            String str13 = (String) c1137bM2545a.f4816l;
                                            byte[] bArr4 = (byte[]) c1137bM2545a.f4817m;
                                            listM2168n = bArr4 != null ? AbstractC0983m0.m2168n(bArr4) : list3;
                                            c1137b = c1137bM2545a;
                                            str5 = str13;
                                            c0022h2 = c0022h;
                                            i34 = i58;
                                            iM633g2 = i57;
                                            i30 = i15;
                                        } else {
                                            if (iM2521g2 == 1885434736) {
                                                c1132w.m2513G(i36 + 8);
                                                fM2539y = c1132w.m2539y() / c1132w.m2539y();
                                                str5 = str2;
                                                listM2168n = list3;
                                                iM633g2 = i57;
                                                z7 = true;
                                            } else if (iM2521g2 == 1937126244) {
                                                int i78 = i36 + 8;
                                                while (true) {
                                                    if (i78 - i36 >= iM2521g) {
                                                        bArrCopyOfRange = null;
                                                        break;
                                                    }
                                                    c1132w.m2513G(i78);
                                                    int iM2521g5 = c1132w.m2521g();
                                                    if (c1132w.m2521g() == 1886547818) {
                                                        bArrCopyOfRange = Arrays.copyOfRange(c1132w.f4799a, i78, iM2521g5 + i78);
                                                        break;
                                                    }
                                                    i78 += iM2521g5;
                                                }
                                                str5 = str2;
                                                listM2168n = list3;
                                                iM633g2 = i57;
                                            } else if (iM2521g2 == 1936995172) {
                                                int iM2535u5 = c1132w.m2535u();
                                                int i79 = 3;
                                                c1132w.m2514H(3);
                                                if (iM2535u5 != 0) {
                                                    i79 = i15;
                                                    str5 = str2;
                                                    listM2168n = list3;
                                                    iM633g2 = i57;
                                                    c0022h2 = c0022h;
                                                    i34 = i58;
                                                    i30 = i79;
                                                } else {
                                                    int iM2535u6 = c1132w.m2535u();
                                                    if (iM2535u6 == 0) {
                                                        i79 = 0;
                                                    } else if (iM2535u6 == 1) {
                                                        i79 = 1;
                                                    } else if (iM2535u6 == 2) {
                                                        i79 = 2;
                                                    } else if (iM2535u6 != 3) {
                                                    }
                                                    str5 = str2;
                                                    listM2168n = list3;
                                                    iM633g2 = i57;
                                                    c0022h2 = c0022h;
                                                    i34 = i58;
                                                    i30 = i79;
                                                }
                                            } else {
                                                if (iM2521g2 == 1668246642) {
                                                    i17 = i57;
                                                    if (iM632f == -1 && i17 == -1) {
                                                        int iM2521g6 = c1132w.m2521g();
                                                        if (iM2521g6 == 1852009592 || iM2521g6 == 1852009571) {
                                                            int iM2507A3 = c1132w.m2507A();
                                                            int iM2507A4 = c1132w.m2507A();
                                                            c1132w.m2514H(2);
                                                            boolean z13 = iM2521g == 19 && (c1132w.m2535u() & 128) != 0;
                                                            int iM632f3 = C0216l.m632f(iM2507A3);
                                                            int i80 = z13 ? 1 : 2;
                                                            iM633g2 = C0216l.m633g(iM2507A4);
                                                            iM632f = iM632f3;
                                                            i12 = i80;
                                                            str5 = str2;
                                                            listM2168n = list3;
                                                        } else {
                                                            AbstractC1101a.m2348F("BoxParsers", "Unsupported color type: " + AbstractC1225d.m2674a(iM2521g6));
                                                        }
                                                    }
                                                } else {
                                                    i17 = i57;
                                                }
                                                iM633g2 = i17;
                                                str5 = str2;
                                                listM2168n = list3;
                                            }
                                            c0022h2 = c0022h;
                                            i34 = i58;
                                            i30 = i15;
                                        }
                                    }
                                    c0022h2 = c0022h;
                                    i34 = i58;
                                    i30 = i15;
                                }
                            }
                            c0022h2 = c0022h;
                            i30 = i15;
                        }
                        i16 = iIntValue;
                        str5 = str2;
                        iM633g2 = i57;
                        i34 = i58;
                    }
                }
            }
            int i81 = i13 + iM2521g;
            i28 = i8;
            c0619s2 = c0619s;
            i32 = iM632f;
            str4 = str;
            iIntValue = i16;
            c0237sM667a = c0237s2;
            i29 = i81;
            i35 = i14;
            i33 = i12;
            i27 = i4;
        }
        C0237s c0237s4 = c0237sM667a;
        List list4 = listM2168n;
        int i82 = i30;
        int i83 = i32;
        int i84 = i33;
        int i85 = iM633g2;
        int i86 = i34;
        int i87 = i35;
        String str14 = str5;
        if (str14 == null) {
            return;
        }
        C0246v c0246v = new C0246v();
        c0246v.f1435a = Integer.toString(i9);
        c0246v.f1447m = AbstractC0244u0.m687p(str14);
        c0246v.f1444j = str6;
        c0246v.f1454t = iM2507A;
        c0246v.f1455u = iM2507A2;
        c0246v.f1458x = fM2539y;
        c0246v.f1457w = i10;
        c0246v.f1459y = bArrCopyOfRange;
        c0246v.f1460z = i82;
        c0246v.f1450p = list4;
        c0246v.f1449o = i31;
        c0246v.f1451q = c0237s4;
        c0246v.f1424A = new C0216l(i83, i84, i85, i86, i87, byteBufferOrder != null ? byteBufferOrder.array() : null);
        C1137b c1137b2 = c1137b;
        if (c1137b2 != null) {
            c0246v.f1442h = AbstractC0715d.m1562g0(c1137b2.f4814j);
            c0246v.f1443i = AbstractC0715d.m1562g0(c1137b2.f4815k);
        }
        c0619s.f2441d = new C0249w(c0246v);
    }
}
