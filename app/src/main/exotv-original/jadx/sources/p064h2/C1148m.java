package p064h2;

import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.common.InterfaceC0238s0;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import p002a1.AbstractC0008a1;
import p005a4.C0073c;
import p021c2.C0631a;
import p021c2.C0632b;
import p021c2.C0633c;
import p021c2.C0635e;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p057g2.C1040d;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p071i1.AbstractC1237p;
import p071i1.C1222a;
import p071i1.C1223b;
import p071i1.C1224c;
import p071i1.C1226e;
import p090k2.InterfaceC1597o;
import p115n1.AbstractC1965b;
import p115n1.C1964a0;
import p115n1.C1966b0;
import p115n1.C1970d0;
import p115n1.C1982j0;
import p115n1.C1992s;
import p115n1.C1995v;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1976g0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h2.m */
/* loaded from: classes.dex */
public final class C1148m implements InterfaceC1987n, InterfaceC1968c0 {

    /* renamed from: A */
    public C1147l[] f4888A;

    /* renamed from: B */
    public long[][] f4889B;

    /* renamed from: C */
    public int f4890C;

    /* renamed from: D */
    public long f4891D;

    /* renamed from: E */
    public int f4892E;

    /* renamed from: F */
    public C0631a f4893F;

    /* renamed from: a */
    public final InterfaceC1597o f4894a;

    /* renamed from: b */
    public final int f4895b;

    /* renamed from: c */
    public final C1132w f4896c;

    /* renamed from: d */
    public final C1132w f4897d;

    /* renamed from: e */
    public final C1132w f4898e;

    /* renamed from: f */
    public final C1132w f4899f;

    /* renamed from: g */
    public final ArrayDeque f4900g;

    /* renamed from: h */
    public final C1150o f4901h;

    /* renamed from: i */
    public final ArrayList f4902i;

    /* renamed from: j */
    public C0981l1 f4903j;

    /* renamed from: k */
    public int f4904k;

    /* renamed from: l */
    public int f4905l;

    /* renamed from: m */
    public long f4906m;

    /* renamed from: n */
    public int f4907n;

    /* renamed from: o */
    public C1132w f4908o;

    /* renamed from: p */
    public int f4909p;

    /* renamed from: q */
    public int f4910q;

    /* renamed from: r */
    public int f4911r;

    /* renamed from: s */
    public int f4912s;

    /* renamed from: t */
    public boolean f4913t;

    /* renamed from: u */
    public boolean f4914u;

    /* renamed from: v */
    public boolean f4915v;

    /* renamed from: w */
    public long f4916w;

    /* renamed from: x */
    public boolean f4917x;

    /* renamed from: y */
    public long f4918y;

    /* renamed from: z */
    public InterfaceC1989p f4919z;

    public C1148m(int i, InterfaceC1597o interfaceC1597o) {
        this.f4894a = interfaceC1597o;
        this.f4895b = i;
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        this.f4903j = C0981l1.f4211n;
        this.f4904k = (i & 4) != 0 ? 3 : 0;
        this.f4901h = new C1150o();
        this.f4902i = new ArrayList();
        this.f4899f = new C1132w(16);
        this.f4900g = new ArrayDeque();
        this.f4896c = new C1132w(AbstractC1237p.f5170a);
        this.f4897d = new C1132w(5);
        this.f4898e = new C1132w();
        this.f4909p = -1;
        this.f4919z = InterfaceC1989p.f7372i;
        this.f4888A = new C1147l[0];
        this.f4913t = (i & 32) == 0;
    }

    /* renamed from: c */
    public final C1966b0 m2561c(int i, long j) {
        long j8;
        long j9;
        long jMin;
        int i4;
        long j10;
        int iM2575a;
        long j11;
        long j12;
        int iM2575a2;
        long j13 = j;
        C1147l[] c1147lArr = this.f4888A;
        int length = c1147lArr.length;
        C1970d0 c1970d0 = C1970d0.f7310c;
        if (length == 0) {
            return new C1966b0(c1970d0, c1970d0);
        }
        int i8 = -1;
        int i9 = i != -1 ? i : this.f4890C;
        boolean z7 = false;
        long jMin2 = -1;
        if (i9 != -1) {
            C1155t c1155t = c1147lArr[i9].f4884b;
            long[] jArr = c1155t.f4967f;
            int iM2444e = AbstractC1118i0.m2444e(jArr, j13, false);
            while (true) {
                if (iM2444e < 0) {
                    iM2444e = -1;
                    break;
                }
                if ((c1155t.f4968g[iM2444e] & 1) != 0) {
                    break;
                }
                iM2444e--;
            }
            if (iM2444e == -1) {
                iM2444e = c1155t.m2575a(j13);
            }
            long[] jArr2 = c1155t.f4964c;
            if (iM2444e == -1) {
                return new C1966b0(c1970d0, c1970d0);
            }
            long j14 = jArr[iM2444e];
            j8 = jArr2[iM2444e];
            if (j14 >= j13 || iM2444e >= c1155t.f4963b - 1 || (iM2575a2 = c1155t.m2575a(j13)) == -1 || iM2575a2 == iM2444e) {
                j12 = -9223372036854775807L;
            } else {
                j12 = jArr[iM2575a2];
                jMin2 = jArr2[iM2575a2];
            }
            j9 = j12;
            j13 = j14;
        } else {
            j8 = Long.MAX_VALUE;
            j9 = -9223372036854775807L;
        }
        if (i == -1) {
            int i10 = 0;
            jMin = j8;
            while (true) {
                C1147l[] c1147lArr2 = this.f4888A;
                if (i10 >= c1147lArr2.length) {
                    break;
                }
                if (i10 != this.f4890C) {
                    C1155t c1155t2 = c1147lArr2[i10].f4884b;
                    long[] jArr3 = c1155t2.f4964c;
                    int[] iArr = c1155t2.f4968g;
                    long[] jArr4 = c1155t2.f4967f;
                    int iM2444e2 = AbstractC1118i0.m2444e(jArr4, j13, z7);
                    while (true) {
                        if (iM2444e2 < 0) {
                            iM2575a = i8;
                            break;
                        }
                        if ((iArr[iM2444e2] & 1) != 0) {
                            iM2575a = iM2444e2;
                            break;
                        }
                        iM2444e2--;
                    }
                    if (iM2575a == i8) {
                        iM2575a = c1155t2.m2575a(j13);
                    }
                    if (iM2575a == i8) {
                        j11 = j9;
                    } else {
                        j11 = j9;
                        jMin = Math.min(jArr3[iM2575a], jMin);
                    }
                    if (j11 != -9223372036854775807L) {
                        j10 = j11;
                        int iM2444e3 = AbstractC1118i0.m2444e(jArr4, j10, false);
                        while (true) {
                            if (iM2444e3 < 0) {
                                iM2444e3 = -1;
                                break;
                            }
                            if ((iArr[iM2444e3] & 1) != 0) {
                                break;
                            }
                            iM2444e3--;
                        }
                        i4 = -1;
                        if (iM2444e3 == -1) {
                            iM2444e3 = c1155t2.m2575a(j10);
                        }
                        if (iM2444e3 != -1) {
                            jMin2 = Math.min(jArr3[iM2444e3], jMin2);
                        }
                    } else {
                        j10 = j11;
                        i4 = -1;
                    }
                } else {
                    i4 = i8;
                    j10 = j9;
                }
                i10++;
                j9 = j10;
                i8 = i4;
                z7 = false;
            }
        } else {
            jMin = j8;
        }
        long j15 = j9;
        C1970d0 c1970d02 = new C1970d0(j13, jMin);
        return j15 == -9223372036854775807L ? new C1966b0(c1970d02, c1970d02) : new C1966b0(c1970d02, new C1970d0(j15, jMin2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x021d, code lost:
    
        r13 = r7.m2521g() + r13;
        r0 = r7.m2521g();
        r31 = r3;
        r3 = (r0 >> 24) & 255;
        r32 = r11;
        r33 = r12;
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x023b, code lost:
    
        if (r3 == 169) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023f, code lost:
    
        if (r3 != 253) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0249, code lost:
    
        if (r0 != 1735291493) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x024b, code lost:
    
        r0 = p013b2.AbstractC0559k.m1302a(p064h2.AbstractC1151p.m2569g(r7) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0255, code lost:
    
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0257, code lost:
    
        r3 = new p013b2.C0563o("TCON", null, p052f6.AbstractC0983m0.m2168n(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0262, code lost:
    
        p063h1.AbstractC1101a.m2348F("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0268, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0269, code lost:
    
        r7.m2513G(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0272, code lost:
    
        if (r0 != 1684632427) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0274, code lost:
    
        r3 = p064h2.AbstractC1151p.m2568f(r0, r7, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x027b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0281, code lost:
    
        if (r0 != 1953655662) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0283, code lost:
    
        r3 = p064h2.AbstractC1151p.m2568f(r0, r7, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x028d, code lost:
    
        if (r0 != 1953329263) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x028f, code lost:
    
        r3 = p064h2.AbstractC1151p.m2570h(r0, "TBPM", r7, r29, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x029c, code lost:
    
        if (r0 != 1668311404) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x029e, code lost:
    
        r3 = p064h2.AbstractC1151p.m2570h(r0, "TCMP", r7, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x02a9, code lost:
    
        if (r0 != 1668249202) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x02ab, code lost:
    
        r3 = p064h2.AbstractC1151p.m2567e(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x02b3, code lost:
    
        if (r0 != 1631670868) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x02b5, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02bf, code lost:
    
        if (r0 != 1936682605) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x02c1, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02cb, code lost:
    
        if (r0 != 1936679276) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x02cd, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02d7, code lost:
    
        if (r0 != 1936679282) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x02d9, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x02e3, code lost:
    
        if (r0 != 1936679265) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x02e5, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02f0, code lost:
    
        if (r0 != 1936679791) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x02f2, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02fd, code lost:
    
        if (r0 != 1920233063) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x02ff, code lost:
    
        r3 = p064h2.AbstractC1151p.m2570h(r0, "ITUNESADVISORY", r7, false, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x030b, code lost:
    
        if (r0 != 1885823344) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x030d, code lost:
    
        r3 = p064h2.AbstractC1151p.m2570h(r0, "ITUNESGAPLESS", r7, false, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x031a, code lost:
    
        if (r0 != 1936683886) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x031c, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0327, code lost:
    
        if (r0 != 1953919848) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0329, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0334, code lost:
    
        if (r0 != 757935405) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0336, code lost:
    
        r12 = null;
        r14 = null;
        r0 = -1;
        r3 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x033a, code lost:
    
        r15 = r7.f4800b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x033c, code lost:
    
        if (r15 >= r13) goto L451;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x033e, code lost:
    
        r21 = r7.m2521g();
        r11 = r7.m2521g();
        r35 = r3;
        r7.m2514H(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x034f, code lost:
    
        if (r11 != 1835360622) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0351, code lost:
    
        r12 = r7.m2531q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x035e, code lost:
    
        if (r11 != 1851878757) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0360, code lost:
    
        r14 = r7.m2531q(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x036a, code lost:
    
        if (r11 != 1684108385) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x036c, code lost:
    
        r0 = r15;
        r35 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x036f, code lost:
    
        r7.m2514H(r21 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0374, code lost:
    
        r3 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0378, code lost:
    
        r35 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x037d, code lost:
    
        if (r12 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x037f, code lost:
    
        if (r14 == null) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0382, code lost:
    
        if (r0 != (-1)) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0385, code lost:
    
        r7.m2513G(r0);
        r7.m2514H(16);
        r11 = new p013b2.C0560l(r12, r14, r7.m2531q(r35 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0399, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x039a, code lost:
    
        r7.m2513G(r13);
        r3 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03a0, code lost:
    
        r11 = 16777215 & r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03a7, code lost:
    
        if (r11 != 6516084) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x03a9, code lost:
    
        r3 = p064h2.AbstractC1151p.m2566d(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x03b2, code lost:
    
        if (r11 == 7233901) goto L224;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x03b7, code lost:
    
        if (r11 != 7631467) goto L195;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x03be, code lost:
    
        if (r11 == 6516589) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x03c3, code lost:
    
        if (r11 != 7828084) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x03ca, code lost:
    
        if (r11 != 6578553) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x03cc, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03d7, code lost:
    
        if (r11 != 4280916) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03d9, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03e4, code lost:
    
        if (r11 != 7630703) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03e6, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03f1, code lost:
    
        if (r11 != 6384738) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03f3, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03fe, code lost:
    
        if (r11 != 7108978) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0400, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x040b, code lost:
    
        if (r11 != 6776174) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x040d, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0416, code lost:
    
        if (r11 != 6779504) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0418, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0420, code lost:
    
        p063h1.AbstractC1101a.m2363n("MetadataUtil", "Skipped unknown metadata entry: " + p071i1.AbstractC1225d.m2674a(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0433, code lost:
    
        r7.m2513G(r13);
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0438, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0440, code lost:
    
        r3 = p064h2.AbstractC1151p.m2573k(r0, r7, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x0448, code lost:
    
        if (r3 == null) goto L450;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x044a, code lost:
    
        r8.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x044d, code lost:
    
        r3 = r31;
        r11 = r32;
        r12 = r33;
        r14 = r34;
        r29 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x045c, code lost:
    
        r7.m2513G(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x045f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0460, code lost:
    
        r32 = r11;
        r33 = r12;
        r34 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x046a, code lost:
    
        if (r8.isEmpty() == false) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x046c, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0471, code lost:
    
        r0 = new androidx.media3.common.C0241t0(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020b, code lost:
    
        r7.m2513G(r3);
        r3 = r3 + r8;
        r7.m2514H(8);
        r8 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0219, code lost:
    
        r13 = r7.f4800b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x021b, code lost:
    
        if (r13 >= r3) goto L448;
     */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x0848 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2562d(long j) {
        ArrayList arrayList;
        C0241t0 c0241t0;
        ArrayDeque arrayDeque;
        boolean z7;
        ArrayList arrayList2;
        C0241t0 c0241t02;
        C0241t0 c0241t03;
        ArrayList arrayList3;
        C1995v c1995v;
        long j8;
        C0241t0 c0241t04;
        C0241t0 c0241t05;
        ArrayList arrayList4;
        int i;
        int i4;
        int i8;
        ArrayDeque arrayDeque2;
        boolean z8;
        int i9;
        ArrayList arrayList5;
        C0241t0 c0241t06;
        C0241t0 c0241t0M669b;
        C0241t0 c0241t07;
        int iM2536v;
        C0241t0 c0241t08;
        C1222a c1222aM2564b;
        C1222a c1222a;
        while (true) {
            ArrayDeque arrayDeque3 = this.f4900g;
            if (arrayDeque3.isEmpty() || ((C1223b) arrayDeque3.peek()).f5109c != j) {
                break;
            }
            C1223b c1223b = (C1223b) arrayDeque3.pop();
            if (c1223b.f5114b == 1836019574) {
                C1223b c1223bM2672g = c1223b.m2672g(1835365473);
                ArrayList arrayList6 = new ArrayList();
                boolean z9 = true;
                int i10 = 4;
                int i11 = 1684108385;
                long j9 = 0;
                int i12 = this.f4895b;
                int i13 = 8;
                if (c1223bM2672g != null) {
                    byte[] bArr = AbstractC1139d.f4818a;
                    C1224c c1224cM2673h = c1223bM2672g.m2673h(1751411826);
                    C1224c c1224cM2673h2 = c1223bM2672g.m2673h(1801812339);
                    C1224c c1224cM2673h3 = c1223bM2672g.m2673h(1768715124);
                    if (c1224cM2673h == null || c1224cM2673h2 == null || c1224cM2673h3 == null) {
                        c0241t0 = null;
                        if (this.f4917x) {
                            if (c0241t0 != null && (i12 & 64) != 0 && (c1222aM2564b = AbstractC1151p.m2564b(c0241t0, "editable.tracks.offset")) != null) {
                                long jM2540z = new C1132w(c1222aM2564b.f5106k).m2540z();
                                if (jM2540z > 0) {
                                    this.f4916w = jM2540z;
                                    this.f4915v = true;
                                    arrayDeque = arrayDeque3;
                                    arrayDeque.clear();
                                    if (this.f4915v) {
                                        this.f4904k = 2;
                                    }
                                }
                            }
                            arrayList = arrayList6;
                        } else {
                            AbstractC1101a.m2360k(c0241t0);
                            C1222a c1222aM2564b2 = AbstractC1151p.m2564b(c0241t0, "editable.tracks.samples.location");
                            if (c1222aM2564b2 != null && c1222aM2564b2.f5106k[0] == 0) {
                                this.f4918y = this.f4916w + 16;
                            }
                            C1222a c1222aM2564b3 = AbstractC1151p.m2564b(c0241t0, "editable.tracks.map");
                            AbstractC1101a.m2360k(c1222aM2564b3);
                            ArrayList arrayListM2671a = c1222aM2564b3.m2671a();
                            ArrayList arrayList7 = new ArrayList(arrayListM2671a.size());
                            for (int i14 = 0; i14 < arrayListM2671a.size(); i14++) {
                                int iIntValue = ((Integer) arrayListM2671a.get(i14)).intValue();
                                arrayList7.add(Integer.valueOf(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? 0 : 4 : 3 : 2 : 1));
                            }
                            arrayList = arrayList7;
                        }
                    } else {
                        C1132w c1132w = c1224cM2673h.f5112c;
                        c1132w.m2513G(16);
                        if (c1132w.m2521g() == 1835299937) {
                            C1132w c1132w2 = c1224cM2673h2.f5112c;
                            c1132w2.m2513G(12);
                            int iM2521g = c1132w2.m2521g();
                            String[] strArr = new String[iM2521g];
                            int i15 = 0;
                            while (i15 < iM2521g) {
                                int iM2521g2 = c1132w2.m2521g();
                                c1132w2.m2514H(i10);
                                strArr[i15] = c1132w2.m2533s(iM2521g2 - 8, StandardCharsets.UTF_8);
                                i15++;
                                i10 = 4;
                            }
                            C1132w c1132w3 = c1224cM2673h3.f5112c;
                            c1132w3.m2513G(8);
                            ArrayList arrayList8 = new ArrayList();
                            while (c1132w3.m2515a() > i13) {
                                int i16 = c1132w3.f4800b;
                                int iM2521g3 = c1132w3.m2521g();
                                int iM2521g4 = c1132w3.m2521g() - 1;
                                if (iM2521g4 < 0 || iM2521g4 >= iM2521g) {
                                    AbstractC0008a1.m23s("Skipped metadata with unknown key index: ", iM2521g4, "BoxParsers");
                                } else {
                                    String str = strArr[iM2521g4];
                                    int i17 = i16 + iM2521g3;
                                    while (true) {
                                        int i18 = c1132w3.f4800b;
                                        if (i18 >= i17) {
                                            c1222a = null;
                                            break;
                                        }
                                        int iM2521g5 = c1132w3.m2521g();
                                        if (c1132w3.m2521g() == i11) {
                                            int iM2521g6 = c1132w3.m2521g();
                                            int iM2521g7 = c1132w3.m2521g();
                                            int i19 = iM2521g5 - 16;
                                            byte[] bArr2 = new byte[i19];
                                            c1132w3.m2519e(bArr2, 0, i19);
                                            c1222a = new C1222a(str, bArr2, iM2521g7, iM2521g6);
                                            break;
                                        }
                                        c1132w3.m2513G(i18 + iM2521g5);
                                        i11 = 1684108385;
                                    }
                                    if (c1222a != null) {
                                        arrayList8.add(c1222a);
                                    }
                                }
                                c1132w3.m2513G(i16 + iM2521g3);
                                i13 = 8;
                                i11 = 1684108385;
                            }
                            if (!arrayList8.isEmpty()) {
                                c0241t0 = new C0241t0(arrayList8);
                            }
                            if (this.f4917x) {
                            }
                        }
                    }
                } else {
                    arrayList = arrayList6;
                    c0241t0 = null;
                }
                ArrayList arrayList9 = new ArrayList();
                boolean z10 = this.f4892E == 1;
                C1995v c1995v2 = new C1995v();
                C1224c c1224cM2673h4 = c1223b.m2673h(1969517665);
                if (c1224cM2673h4 != null) {
                    byte[] bArr3 = AbstractC1139d.f4818a;
                    C1132w c1132w4 = c1224cM2673h4.f5112c;
                    int i20 = 8;
                    c1132w4.m2513G(8);
                    C0241t0 c0241t09 = new C0241t0(new InterfaceC0238s0[0]);
                    while (c1132w4.m2515a() >= i20) {
                        int i21 = c1132w4.f4800b;
                        int iM2521g8 = c1132w4.m2521g();
                        int iM2521g9 = c1132w4.m2521g();
                        if (iM2521g9 == 1835365473) {
                            c1132w4.m2513G(i21);
                            int i22 = i21 + iM2521g8;
                            c1132w4.m2514H(i20);
                            int i23 = c1132w4.f4800b;
                            c1132w4.m2514H(4);
                            boolean z11 = z9;
                            if (c1132w4.m2521g() != 1751411826) {
                                i23 += 4;
                            }
                            c1132w4.m2513G(i23);
                            while (true) {
                                int i24 = c1132w4.f4800b;
                                if (i24 >= i22) {
                                    arrayDeque2 = arrayDeque3;
                                    z8 = z10;
                                    i9 = iM2521g8;
                                    arrayList5 = arrayList9;
                                    c0241t08 = null;
                                    break;
                                }
                                int iM2521g10 = c1132w4.m2521g();
                                arrayDeque2 = arrayDeque3;
                                if (c1132w4.m2521g() == 1768715124) {
                                    break;
                                }
                                c1132w4.m2513G(i24 + iM2521g10);
                                arrayDeque3 = arrayDeque2;
                                z11 = true;
                            }
                            c0241t09 = c0241t09.m669b(c0241t08);
                            i20 = 8;
                        } else {
                            arrayDeque2 = arrayDeque3;
                            z8 = z10;
                            i9 = iM2521g8;
                            arrayList5 = arrayList9;
                            if (iM2521g9 == 1936553057) {
                                c1132w4.m2513G(i21);
                                int i25 = i21 + i9;
                                c1132w4.m2514H(12);
                                while (true) {
                                    int i26 = c1132w4.f4800b;
                                    if (i26 >= i25) {
                                        i20 = 8;
                                        break;
                                    }
                                    int iM2521g11 = c1132w4.m2521g();
                                    if (c1132w4.m2521g() == 1935766900) {
                                        if (iM2521g11 >= 16) {
                                            c1132w4.m2514H(4);
                                            int i27 = -1;
                                            int i28 = 0;
                                            for (int i29 = 0; i29 < 2; i29++) {
                                                int iM2535u = c1132w4.m2535u();
                                                int iM2535u2 = c1132w4.m2535u();
                                                if (iM2535u == 0) {
                                                    i27 = iM2535u2;
                                                } else if (iM2535u == 1) {
                                                    i28 = iM2535u2;
                                                }
                                            }
                                            if (i27 == 12) {
                                                iM2536v = 240;
                                            } else if (i27 == 13) {
                                                iM2536v = 120;
                                            } else if (i27 != 21) {
                                                iM2536v = -2147483647;
                                            } else {
                                                i20 = 8;
                                                if (c1132w4.m2515a() >= 8 && c1132w4.f4800b + 8 <= i25) {
                                                    int iM2521g12 = c1132w4.m2521g();
                                                    int iM2521g13 = c1132w4.m2521g();
                                                    if (iM2521g12 >= 12 && iM2521g13 == 1936877170) {
                                                        iM2536v = c1132w4.m2536v();
                                                    }
                                                    if (iM2536v == -2147483647) {
                                                        break;
                                                    } else {
                                                        c0241t07 = new C0241t0(new C0635e(i28, iM2536v));
                                                    }
                                                }
                                                iM2536v = -2147483647;
                                                if (iM2536v == -2147483647) {
                                                }
                                            }
                                            i20 = 8;
                                            if (iM2536v == -2147483647) {
                                                break;
                                            }
                                        } else {
                                            c0241t07 = null;
                                            i20 = 8;
                                        }
                                    } else {
                                        c1132w4.m2513G(i26 + iM2521g11);
                                    }
                                }
                                c0241t07 = null;
                                c0241t0M669b = c0241t09.m669b(c0241t07);
                            } else {
                                i20 = 8;
                                if (iM2521g9 == -1451722374) {
                                    short sM2532r = c1132w4.m2532r();
                                    c1132w4.m2514H(2);
                                    String strM2533s = c1132w4.m2533s(sM2532r, StandardCharsets.UTF_8);
                                    int iMax = Math.max(strM2533s.lastIndexOf(43), strM2533s.lastIndexOf(45));
                                    try {
                                        c0241t06 = new C0241t0(new C1226e(Float.parseFloat(strM2533s.substring(0, iMax)), Float.parseFloat(strM2533s.substring(iMax, strM2533s.length() - 1))));
                                    } catch (IndexOutOfBoundsException | NumberFormatException unused) {
                                        c0241t06 = null;
                                    }
                                    c0241t0M669b = c0241t09.m669b(c0241t06);
                                }
                            }
                            c0241t09 = c0241t0M669b;
                        }
                        c1132w4.m2513G(i21 + i9);
                        arrayDeque3 = arrayDeque2;
                        z10 = z8;
                        arrayList9 = arrayList5;
                        z9 = true;
                    }
                    arrayDeque = arrayDeque3;
                    z7 = z10;
                    arrayList2 = arrayList9;
                    c1995v2.m3877b(c0241t09);
                    c0241t02 = c0241t09;
                } else {
                    arrayDeque = arrayDeque3;
                    z7 = z10;
                    arrayList2 = arrayList9;
                    c0241t02 = null;
                }
                C1224c c1224cM2673h5 = c1223b.m2673h(1836476516);
                c1224cM2673h5.getClass();
                C0241t0 c0241t010 = new C0241t0(AbstractC1139d.m2548d(c1224cM2673h5.f5112c));
                ArrayList arrayListM2551g = AbstractC1139d.m2551g(c1223b, c1995v2, -9223372036854775807L, null, (i12 & 1) != 0, z7, new C1040d(5));
                if (this.f4917x) {
                    boolean z12 = arrayList.size() == arrayListM2551g.size();
                    Locale locale = Locale.US;
                    AbstractC1101a.m2358i("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of editable video tracks (" + arrayListM2551g.size() + ")", z12);
                }
                int i30 = 0;
                int i31 = 0;
                int size = -1;
                long j10 = -9223372036854775807L;
                while (i30 < arrayListM2551g.size()) {
                    C1155t c1155t = (C1155t) arrayListM2551g.get(i30);
                    int i32 = c1155t.f4963b;
                    int i33 = c1155t.f4966e;
                    if (i32 == 0) {
                        c0241t05 = c0241t02;
                        c0241t03 = c0241t0;
                        c0241t04 = c0241t010;
                        arrayList3 = arrayListM2551g;
                        arrayList4 = arrayList2;
                    } else {
                        C1152q c1152q = c1155t.f4962a;
                        c0241t03 = c0241t0;
                        C0241t0 c0241t011 = c0241t010;
                        long j11 = c1152q.f4932e;
                        C0249w c0249w = c1152q.f4934g;
                        int i34 = c1152q.f4929b;
                        if (j11 != -9223372036854775807L) {
                            arrayList3 = arrayListM2551g;
                            c1995v = c1995v2;
                            j8 = j11;
                        } else {
                            arrayList3 = arrayListM2551g;
                            c1995v = c1995v2;
                            j8 = c1155t.f4969h;
                        }
                        long jMax = Math.max(j10, j8);
                        int i35 = i31 + 1;
                        C1147l c1147l = new C1147l(c1152q, c1155t, this.f4919z.track(i31, i34));
                        int i36 = "audio/true-hd".equals(c0249w.f1522n) ? i33 * 16 : i33 + 30;
                        C0246v c0246vM692a = c0249w.m692a();
                        c0246vM692a.f1448n = i36;
                        if (i34 == 2) {
                            int i37 = c0249w.f1514f;
                            if ((i12 & 8) != 0) {
                                i37 |= size == -1 ? 1 : 2;
                            }
                            if (c0249w.f1531w == -1.0f && j8 > 0 && (i8 = c1155t.f4963b) > 0) {
                                c0246vM692a.f1456v = i8 / (j8 / 1000000.0f);
                            }
                            if (this.f4917x) {
                                i37 |= DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE;
                                c0246vM692a.f1441g = ((Integer) arrayList.get(i30)).intValue();
                            }
                            c0246vM692a.f1440f = i37;
                        }
                        c1995v2 = c1995v;
                        if (i34 == 1 && (i = c1995v2.f7391a) != -1 && (i4 = c1995v2.f7392b) != -1) {
                            c0246vM692a.f1428E = i;
                            c0246vM692a.f1429F = i4;
                        }
                        ArrayList arrayList10 = this.f4902i;
                        C0241t0 c0241t012 = arrayList10.isEmpty() ? null : new C0241t0(arrayList10);
                        c0241t04 = c0241t011;
                        C0241t0[] c0241t0Arr = {c0241t012, c0241t02, c0241t04};
                        C0241t0 c0241t013 = new C0241t0(new InterfaceC0238s0[0]);
                        if (c0241t03 != null) {
                            int i38 = 0;
                            while (true) {
                                InterfaceC0238s0[] interfaceC0238s0Arr = c0241t03.f1412j;
                                c0241t05 = c0241t02;
                                if (i38 >= interfaceC0238s0Arr.length) {
                                    break;
                                }
                                InterfaceC0238s0 interfaceC0238s0 = interfaceC0238s0Arr[i38];
                                if (interfaceC0238s0 instanceof C1222a) {
                                    C1222a c1222a2 = (C1222a) interfaceC0238s0;
                                    if (!c1222a2.f5105j.equals("com.android.capture.fps")) {
                                        c0241t013 = c0241t013.m668a(c1222a2);
                                    } else if (i34 == 2) {
                                        c0241t013 = c0241t013.m668a(c1222a2);
                                    }
                                }
                                i38++;
                                c0241t02 = c0241t05;
                            }
                        } else {
                            c0241t05 = c0241t02;
                        }
                        for (int i39 = 0; i39 < 3; i39++) {
                            c0241t013 = c0241t013.m669b(c0241t0Arr[i39]);
                        }
                        if (c0241t013.f1412j.length > 0) {
                            c0246vM692a.f1445k = c0241t013;
                        }
                        c1147l.f4885c.format(new C0249w(c0246vM692a));
                        if (i34 == 2 && size == -1) {
                            size = arrayList2.size();
                        }
                        arrayList4 = arrayList2;
                        arrayList4.add(c1147l);
                        i31 = i35;
                        j10 = jMax;
                    }
                    i30++;
                    arrayList2 = arrayList4;
                    c0241t02 = c0241t05;
                    arrayListM2551g = arrayList3;
                    c0241t010 = c0241t04;
                    c0241t0 = c0241t03;
                }
                this.f4890C = size;
                this.f4891D = j10;
                C1147l[] c1147lArr = (C1147l[]) arrayList2.toArray(new C1147l[0]);
                this.f4888A = c1147lArr;
                long[][] jArr = new long[c1147lArr.length][];
                int[] iArr = new int[c1147lArr.length];
                long[] jArr2 = new long[c1147lArr.length];
                boolean[] zArr = new boolean[c1147lArr.length];
                for (int i40 = 0; i40 < c1147lArr.length; i40++) {
                    jArr[i40] = new long[c1147lArr[i40].f4884b.f4963b];
                    jArr2[i40] = c1147lArr[i40].f4884b.f4967f[0];
                }
                int i41 = 0;
                while (i41 < c1147lArr.length) {
                    long j12 = Long.MAX_VALUE;
                    int i42 = -1;
                    for (int i43 = 0; i43 < c1147lArr.length; i43++) {
                        if (!zArr[i43]) {
                            long j13 = jArr2[i43];
                            if (j13 <= j12) {
                                i42 = i43;
                                j12 = j13;
                            }
                        }
                    }
                    int i44 = iArr[i42];
                    long[] jArr3 = jArr[i42];
                    jArr3[i44] = j9;
                    C1155t c1155t2 = c1147lArr[i42].f4884b;
                    j9 += c1155t2.f4965d[i44];
                    int i45 = i44 + 1;
                    iArr[i42] = i45;
                    if (i45 < jArr3.length) {
                        jArr2[i42] = c1155t2.f4967f[i45];
                    } else {
                        zArr[i42] = true;
                        i41++;
                    }
                }
                this.f4889B = jArr;
                this.f4919z.endTracks();
                this.f4919z.seekMap(this);
                arrayDeque.clear();
                if (this.f4915v) {
                }
            } else if (!arrayDeque3.isEmpty()) {
                ((C1223b) arrayDeque3.peek()).f5111e.add(c1223b);
            }
        }
        if (this.f4904k != 2) {
            this.f4904k = 0;
            this.f4907n = 0;
        }
    }

    @Override // p115n1.InterfaceC1968c0
    public final long getDurationUs() {
        return this.f4891D;
    }

    @Override // p115n1.InterfaceC1968c0
    public final C1966b0 getSeekPoints(long j) {
        return m2561c(-1, j);
    }

    @Override // p115n1.InterfaceC1987n
    public final List getSniffFailureDetails() {
        return this.f4903j;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        if ((this.f4895b & 16) == 0) {
            interfaceC1989p = new C0073c(interfaceC1989p, this.f4894a);
        }
        this.f4919z = interfaceC1989p;
    }

    @Override // p115n1.InterfaceC1968c0
    public final boolean isSeekable() {
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:252:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x04f1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:0x06e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:392:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        char c8;
        int i;
        long j;
        C1132w c1132w;
        int i4;
        char c9;
        boolean z7;
        long j8;
        C1223b c1223b;
        long j9;
        int i8;
        boolean z8;
        while (true) {
            int i9 = this.f4904k;
            ArrayDeque arrayDeque = this.f4900g;
            int i10 = this.f4895b;
            C1132w c1132w2 = this.f4898e;
            int i11 = 4;
            char c10 = 2;
            if (i9 == 0) {
                int i12 = this.f4907n;
                C1132w c1132w3 = this.f4899f;
                if (i12 != 0) {
                    j8 = this.f4906m;
                    if (j8 != 1) {
                        interfaceC1988o.readFully(c1132w3.f4799a, 8, 8);
                        this.f4907n += 8;
                        this.f4906m = c1132w3.m2540z();
                    } else if (j8 == 0) {
                        long length = interfaceC1988o.getLength();
                        if (length == -1 && (c1223b = (C1223b) arrayDeque.peek()) != null) {
                            length = c1223b.f5109c;
                        }
                        if (length != -1) {
                            this.f4906m = (length - interfaceC1988o.getPosition()) + this.f4907n;
                        }
                    }
                    j9 = this.f4906m;
                    i8 = this.f4907n;
                    if (j9 >= i8) {
                        throw C0247v0.createForUnsupportedContainerFeature("Atom size less than header length (unsupported).");
                    }
                    int i13 = this.f4905l;
                    if (i13 == 1836019574 || i13 == 1953653099 || i13 == 1835297121 || i13 == 1835626086 || i13 == 1937007212 || i13 == 1701082227 || i13 == 1835365473 || i13 == 1701082724) {
                        long position = interfaceC1988o.getPosition();
                        long j10 = this.f4906m;
                        long j11 = this.f4907n;
                        long j12 = (position + j10) - j11;
                        if (j10 != j11 && this.f4905l == 1835365473) {
                            c1132w2.m2510D(8);
                            interfaceC1988o.mo3862i(c1132w2.f4799a, 0, 8);
                            byte[] bArr = AbstractC1139d.f4818a;
                            int i14 = c1132w2.f4800b;
                            c1132w2.m2514H(4);
                            if (c1132w2.m2521g() != 1751411826) {
                                i14 += 4;
                            }
                            c1132w2.m2513G(i14);
                            interfaceC1988o.mo3861h(c1132w2.f4800b);
                            interfaceC1988o.mo3860g();
                        }
                        arrayDeque.push(new C1223b(this.f4905l, j12));
                        if (this.f4906m == this.f4907n) {
                            m2562d(j12);
                        } else {
                            this.f4904k = 0;
                            this.f4907n = 0;
                        }
                    } else if (i13 == 1835296868 || i13 == 1836476516 || i13 == 1751411826 || i13 == 1937011556 || i13 == 1937011827 || i13 == 1937011571 || i13 == 1668576371 || i13 == 1701606260 || i13 == 1937011555 || i13 == 1937011578 || i13 == 1937013298 || i13 == 1937007471 || i13 == 1668232756 || i13 == 1953196132 || i13 == 1718909296 || i13 == 1969517665 || i13 == 1801812339 || i13 == 1768715124) {
                        AbstractC1101a.m2359j(i8 == 8);
                        AbstractC1101a.m2359j(this.f4906m <= 2147483647L);
                        C1132w c1132w4 = new C1132w((int) this.f4906m);
                        System.arraycopy(c1132w3.f4799a, 0, c1132w4.f4799a, 0, 8);
                        this.f4908o = c1132w4;
                        this.f4904k = 1;
                    } else {
                        long position2 = interfaceC1988o.getPosition();
                        long j13 = this.f4907n;
                        long j14 = position2 - j13;
                        if (this.f4905l == 1836086884) {
                            this.f4893F = new C0631a(0L, j14, -9223372036854775807L, j14 + j13, this.f4906m - j13);
                        }
                        this.f4908o = null;
                        this.f4904k = 1;
                    }
                    z8 = true;
                    if (z8) {
                        return -1;
                    }
                } else if (interfaceC1988o.mo3854a(c1132w3.f4799a, 0, 8, true)) {
                    this.f4907n = 8;
                    c1132w3.m2513G(0);
                    this.f4906m = c1132w3.m2537w();
                    this.f4905l = c1132w3.m2521g();
                    j8 = this.f4906m;
                    if (j8 != 1) {
                    }
                    j9 = this.f4906m;
                    i8 = this.f4907n;
                    if (j9 >= i8) {
                    }
                } else {
                    if (this.f4892E == 2 && (i10 & 2) != 0) {
                        InterfaceC1980i0 interfaceC1980i0Track = this.f4919z.track(0, 4);
                        C0631a c0631a = this.f4893F;
                        C0241t0 c0241t0 = c0631a == null ? null : new C0241t0(c0631a);
                        C0246v c0246v = new C0246v();
                        c0246v.f1445k = c0241t0;
                        interfaceC1980i0Track.format(new C0249w(c0246v));
                        this.f4919z.endTracks();
                        this.f4919z.seekMap(new C1992s(-9223372036854775807L));
                    }
                    z8 = false;
                    if (z8) {
                    }
                }
            } else {
                if (i9 != 1) {
                    if (i9 == 2) {
                        int i15 = 4;
                        long position3 = interfaceC1988o.getPosition();
                        if (this.f4909p == -1) {
                            int i16 = 0;
                            int i17 = -1;
                            int i18 = -1;
                            boolean z9 = true;
                            boolean z10 = true;
                            long j15 = Long.MAX_VALUE;
                            long j16 = Long.MAX_VALUE;
                            long j17 = Long.MAX_VALUE;
                            while (true) {
                                C1147l[] c1147lArr = this.f4888A;
                                if (i16 >= c1147lArr.length) {
                                    break;
                                }
                                C1147l c1147l = c1147lArr[i16];
                                int i19 = c1147l.f4887e;
                                C1155t c1155t = c1147l.f4884b;
                                char c11 = c10;
                                if (i19 != c1155t.f4963b) {
                                    long j18 = c1155t.f4964c[i19];
                                    long[][] jArr = this.f4889B;
                                    int i20 = AbstractC1118i0.f4750a;
                                    long j19 = jArr[i16][i19];
                                    long j20 = j18 - position3;
                                    boolean z11 = j20 < 0 || j20 >= 262144;
                                    if ((!z11 && z9) || (z11 == z9 && j20 < j17)) {
                                        i18 = i16;
                                        z9 = z11;
                                        j16 = j19;
                                        j17 = j20;
                                    }
                                    if (j19 < j15) {
                                        i17 = i16;
                                        z10 = z11;
                                        j15 = j19;
                                    }
                                }
                                i16++;
                                c10 = c11;
                            }
                            c8 = c10;
                            if (j15 == Long.MAX_VALUE || !z10 || j16 < j15 + 10485760) {
                                i17 = i18;
                            }
                            this.f4909p = i17;
                            if (i17 == -1) {
                                return -1;
                            }
                        } else {
                            c8 = 2;
                        }
                        C1147l c1147l2 = this.f4888A[this.f4909p];
                        InterfaceC1980i0 interfaceC1980i0 = c1147l2.f4885c;
                        C1152q c1152q = c1147l2.f4883a;
                        C1155t c1155t2 = c1147l2.f4884b;
                        int i21 = c1147l2.f4887e;
                        long j21 = c1155t2.f4964c[i21] + this.f4918y;
                        int i22 = c1155t2.f4965d[i21];
                        C1982j0 c1982j0 = c1147l2.f4886d;
                        long j22 = (j21 - position3) + this.f4910q;
                        if (j22 < 0 || j22 >= 262144) {
                            c1964a0.f7264a = j21;
                            return 1;
                        }
                        int i23 = c1152q.f4935h;
                        C0249w c0249w = c1152q.f4934g;
                        if (i23 == 1) {
                            j22 += 8;
                            i22 -= 8;
                        }
                        interfaceC1988o.mo3861h((int) j22);
                        if (!Objects.equals(c0249w.f1522n, "video/avc")) {
                            this.f4913t = true;
                        }
                        int i24 = c1152q.f4938k;
                        if (i24 == 0) {
                            if ("audio/ac4".equals(c0249w.f1522n)) {
                                if (this.f4911r == 0) {
                                    AbstractC1965b.m3832h(c1132w2, i22);
                                    interfaceC1980i0.sampleData(c1132w2, 7);
                                    this.f4911r += 7;
                                }
                                i22 += 7;
                            } else if (c1982j0 != null) {
                                c1982j0.m3853c(interfaceC1988o);
                            }
                            while (true) {
                                int i25 = this.f4911r;
                                if (i25 >= i22) {
                                    break;
                                }
                                int iSampleData = interfaceC1980i0.sampleData((InterfaceC0219m) interfaceC1988o, i22 - i25, false);
                                this.f4910q += iSampleData;
                                this.f4911r += iSampleData;
                                this.f4912s -= iSampleData;
                            }
                        } else {
                            C1132w c1132w5 = this.f4897d;
                            byte[] bArr2 = c1132w5.f4799a;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[c8] = 0;
                            int i26 = i24 + 1;
                            int i27 = 4 - i24;
                            while (this.f4911r < i22) {
                                int i28 = this.f4912s;
                                if (i28 == 0) {
                                    interfaceC1988o.readFully(bArr2, i27, i26);
                                    this.f4910q += i26;
                                    c1132w5.m2513G(0);
                                    int iM2521g = c1132w5.m2521g();
                                    if (iM2521g < 1) {
                                        throw C0247v0.createForMalformedContainer("Invalid NAL length", null);
                                    }
                                    this.f4912s = iM2521g - 1;
                                    C1132w c1132w6 = this.f4896c;
                                    c1132w6.m2513G(0);
                                    int i29 = i15;
                                    interfaceC1980i0.sampleData(c1132w6, i29);
                                    interfaceC1980i0.sampleData(c1132w5, 1);
                                    this.f4911r += 5;
                                    i22 += i27;
                                    if (!this.f4913t && AbstractC1237p.m2682c(bArr2[i29])) {
                                        this.f4913t = true;
                                    }
                                } else {
                                    int iSampleData2 = interfaceC1980i0.sampleData((InterfaceC0219m) interfaceC1988o, i28, false);
                                    this.f4910q += iSampleData2;
                                    this.f4911r += iSampleData2;
                                    this.f4912s -= iSampleData2;
                                }
                                i15 = 4;
                            }
                        }
                        int i30 = i22;
                        long j23 = c1155t2.f4967f[i21];
                        int i31 = c1155t2.f4968g[i21];
                        if (!this.f4913t) {
                            i31 |= 67108864;
                        }
                        int i32 = i31;
                        if (c1982j0 != null) {
                            c1982j0.m3852b(interfaceC1980i0, j23, i32, i30, 0, null);
                            if (i21 + 1 == c1155t2.f4963b) {
                                c1982j0.m3851a(interfaceC1980i0, null);
                            }
                        } else {
                            interfaceC1980i0.sampleMetadata(j23, i32, i30, 0, null);
                        }
                        c1147l2.f4887e++;
                        this.f4909p = -1;
                        this.f4910q = 0;
                        this.f4911r = 0;
                        this.f4912s = 0;
                        this.f4913t = (i10 & 32) == 0;
                        return 0;
                    }
                    if (i9 != 3) {
                        throw new IllegalStateException();
                    }
                    C1150o c1150o = this.f4901h;
                    ArrayList arrayList = c1150o.f4924a;
                    int i33 = c1150o.f4925b;
                    if (i33 != 0) {
                        if (i33 != 1) {
                            short s8 = 2817;
                            short s9 = 2816;
                            short s10 = 2192;
                            if (i33 == 2) {
                                long length2 = interfaceC1988o.getLength();
                                int i34 = c1150o.f4926c - 20;
                                C1132w c1132w7 = new C1132w(i34);
                                interfaceC1988o.readFully(c1132w7.f4799a, 0, i34);
                                int i35 = 0;
                                while (i35 < i34 / 12) {
                                    c1132w7.m2514H(2);
                                    short sM2525k = c1132w7.m2525k();
                                    if (sM2525k != s10 && sM2525k != s9 && sM2525k != s8 && sM2525k != 2819) {
                                        if (sM2525k != 2820) {
                                            c1132w7.m2514H(8);
                                            j = length2;
                                            c1132w = c1132w7;
                                        }
                                        i35++;
                                        length2 = j;
                                        c1132w7 = c1132w;
                                        s10 = 2192;
                                        s8 = 2817;
                                        s9 = 2816;
                                    }
                                    j = length2;
                                    c1132w = c1132w7;
                                    arrayList.add(new C1149n((j - c1150o.f4926c) - c1132w7.m2523i(), c1132w.m2523i()));
                                    i35++;
                                    length2 = j;
                                    c1132w7 = c1132w;
                                    s10 = 2192;
                                    s8 = 2817;
                                    s9 = 2816;
                                }
                                if (arrayList.isEmpty()) {
                                    c1964a0.f7264a = 0L;
                                } else {
                                    c1150o.f4925b = 3;
                                    c1964a0.f7264a = ((C1149n) arrayList.get(0)).f4920a;
                                }
                            } else {
                                if (i33 != 3) {
                                    throw new IllegalStateException();
                                }
                                long position4 = interfaceC1988o.getPosition();
                                int length3 = (int) ((interfaceC1988o.getLength() - interfaceC1988o.getPosition()) - c1150o.f4926c);
                                C1132w c1132w8 = new C1132w(length3);
                                interfaceC1988o.readFully(c1132w8.f4799a, 0, length3);
                                int i36 = 0;
                                while (i36 < arrayList.size()) {
                                    C1149n c1149n = (C1149n) arrayList.get(i36);
                                    c1132w8.m2513G((int) (c1149n.f4920a - position4));
                                    c1132w8.m2514H(i11);
                                    int iM2523i = c1132w8.m2523i();
                                    Charset charset = StandardCharsets.UTF_8;
                                    String strM2533s = c1132w8.m2533s(iM2523i, charset);
                                    int i37 = i11;
                                    switch (strM2533s.hashCode()) {
                                        case -1711564334:
                                            if (strM2533s.equals("SlowMotion_Data")) {
                                                i4 = 0;
                                            }
                                            switch (i4) {
                                                case 0:
                                                    c9 = '\u0890';
                                                    break;
                                                case 1:
                                                    c9 = '\u0b03';
                                                    break;
                                                case 2:
                                                    c9 = '\u0b00';
                                                    break;
                                                case 3:
                                                    c9 = '\u0b04';
                                                    break;
                                                case 4:
                                                    c9 = '\u0b01';
                                                    break;
                                                default:
                                                    throw C0247v0.createForMalformedContainer("Invalid SEF name", null);
                                            }
                                            int i38 = c1149n.f4921b - (iM2523i + 8);
                                            if (c9 != '\u0890') {
                                                ArrayList arrayList2 = new ArrayList();
                                                List listM351g = C1150o.f4923e.m351g(c1132w8.m2533s(i38, charset));
                                                for (int i39 = 0; i39 < listM351g.size(); i39++) {
                                                    List listM351g2 = C1150o.f4922d.m351g((CharSequence) listM351g.get(i39));
                                                    if (listM351g2.size() != 3) {
                                                        throw C0247v0.createForMalformedContainer(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new C0632b(1 << (Integer.parseInt((String) listM351g2.get(2)) - 1), Long.parseLong((String) listM351g2.get(0)), Long.parseLong((String) listM351g2.get(1))));
                                                    } catch (NumberFormatException e) {
                                                        throw C0247v0.createForMalformedContainer(null, e);
                                                    }
                                                }
                                                this.f4902i.add(new C0633c(arrayList2));
                                            } else if (c9 != '\u0b00' && c9 != '\u0b01' && c9 != '\u0b03' && c9 != '\u0b04') {
                                                throw new IllegalStateException();
                                            }
                                            i36++;
                                            i11 = i37;
                                            break;
                                        case -1332107749:
                                            if (strM2533s.equals("Super_SlowMotion_Edit_Data")) {
                                                i4 = 1;
                                            }
                                            switch (i4) {
                                            }
                                            int i382 = c1149n.f4921b - (iM2523i + 8);
                                            if (c9 != '\u0890') {
                                            }
                                            i36++;
                                            i11 = i37;
                                            break;
                                        case -1251387154:
                                            if (strM2533s.equals("Super_SlowMotion_Data")) {
                                                i4 = 2;
                                            }
                                            switch (i4) {
                                            }
                                            int i3822 = c1149n.f4921b - (iM2523i + 8);
                                            if (c9 != '\u0890') {
                                            }
                                            i36++;
                                            i11 = i37;
                                            break;
                                        case -830665521:
                                            if (strM2533s.equals("Super_SlowMotion_Deflickering_On")) {
                                                i4 = 3;
                                            }
                                            switch (i4) {
                                            }
                                            int i38222 = c1149n.f4921b - (iM2523i + 8);
                                            if (c9 != '\u0890') {
                                            }
                                            i36++;
                                            i11 = i37;
                                            break;
                                        case 1760745220:
                                            if (strM2533s.equals("Super_SlowMotion_BGM")) {
                                                i4 = i37;
                                            }
                                            switch (i4) {
                                            }
                                            int i382222 = c1149n.f4921b - (iM2523i + 8);
                                            if (c9 != '\u0890') {
                                            }
                                            i36++;
                                            i11 = i37;
                                            break;
                                    }
                                    i4 = -1;
                                    switch (i4) {
                                    }
                                    int i3822222 = c1149n.f4921b - (iM2523i + 8);
                                    if (c9 != '\u0890') {
                                    }
                                    i36++;
                                    i11 = i37;
                                }
                                c1964a0.f7264a = 0L;
                            }
                        } else {
                            C1132w c1132w9 = new C1132w(8);
                            interfaceC1988o.readFully(c1132w9.f4799a, 0, 8);
                            c1150o.f4926c = c1132w9.m2523i() + 8;
                            if (c1132w9.m2521g() != 1397048916) {
                                c1964a0.f7264a = 0L;
                            } else {
                                c1964a0.f7264a = interfaceC1988o.getPosition() - (c1150o.f4926c - 12);
                                c1150o.f4925b = 2;
                            }
                        }
                        i = 1;
                    } else {
                        long length4 = interfaceC1988o.getLength();
                        c1964a0.f7264a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                        i = 1;
                        c1150o.f4925b = 1;
                    }
                    if (c1964a0.f7264a != 0) {
                        return i;
                    }
                    this.f4904k = 0;
                    this.f4907n = 0;
                    return i;
                }
                long j24 = this.f4906m - this.f4907n;
                long position5 = interfaceC1988o.getPosition() + j24;
                C1132w c1132w10 = this.f4908o;
                if (c1132w10 != null) {
                    interfaceC1988o.readFully(c1132w10.f4799a, this.f4907n, (int) j24);
                    if (this.f4905l == 1718909296) {
                        this.f4914u = true;
                        c1132w10.m2513G(8);
                        int iM2521g2 = c1132w10.m2521g();
                        int i40 = iM2521g2 != 1751476579 ? iM2521g2 != 1903435808 ? 0 : 1 : 2;
                        if (i40 == 0) {
                            c1132w10.m2514H(4);
                            while (true) {
                                if (c1132w10.m2515a() <= 0) {
                                    i40 = 0;
                                    break;
                                }
                                int iM2521g3 = c1132w10.m2521g();
                                i40 = iM2521g3 != 1751476579 ? iM2521g3 != 1903435808 ? 0 : 1 : 2;
                                if (i40 != 0) {
                                    break;
                                }
                            }
                        }
                        this.f4892E = i40;
                    } else if (!arrayDeque.isEmpty()) {
                        ((C1223b) arrayDeque.peek()).f5110d.add(new C1224c(c1132w10, this.f4905l));
                    }
                } else {
                    if (!this.f4914u && this.f4905l == 1835295092) {
                        this.f4892E = 1;
                    }
                    if (j24 < 262144) {
                        interfaceC1988o.mo3861h((int) j24);
                    } else {
                        c1964a0.f7264a = interfaceC1988o.getPosition() + j24;
                        z7 = true;
                        m2562d(position5);
                        if (this.f4915v) {
                            this.f4917x = true;
                            c1964a0.f7264a = this.f4916w;
                            this.f4915v = false;
                            z7 = true;
                        }
                        if (!((z7 || this.f4904k == 2) ? false : true)) {
                            return 1;
                        }
                    }
                }
                z7 = false;
                m2562d(position5);
                if (this.f4915v) {
                }
                if (z7) {
                    if (!((z7 || this.f4904k == 2) ? false : true)) {
                    }
                }
            }
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        this.f4900g.clear();
        this.f4907n = 0;
        this.f4909p = -1;
        this.f4910q = 0;
        this.f4911r = 0;
        this.f4912s = 0;
        this.f4913t = (this.f4895b & 32) == 0;
        if (j == 0) {
            if (this.f4904k != 3) {
                this.f4904k = 0;
                this.f4907n = 0;
                return;
            } else {
                C1150o c1150o = this.f4901h;
                c1150o.f4924a.clear();
                c1150o.f4925b = 0;
                this.f4902i.clear();
                return;
            }
        }
        for (C1147l c1147l : this.f4888A) {
            C1155t c1155t = c1147l.f4884b;
            int iM2444e = AbstractC1118i0.m2444e(c1155t.f4967f, j8, false);
            while (true) {
                if (iM2444e < 0) {
                    iM2444e = -1;
                    break;
                } else if ((c1155t.f4968g[iM2444e] & 1) != 0) {
                    break;
                } else {
                    iM2444e--;
                }
            }
            if (iM2444e == -1) {
                iM2444e = c1155t.m2575a(j8);
            }
            c1147l.f4887e = iM2444e;
            C1982j0 c1982j0 = c1147l.f4886d;
            if (c1982j0 != null) {
                c1982j0.f7349b = false;
                c1982j0.f7350c = 0;
            }
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        C0981l1 c0981l1M2168n;
        InterfaceC1976g0 interfaceC1976g0M2574l = AbstractC1151p.m2574l(interfaceC1988o, false, (this.f4895b & 2) != 0);
        if (interfaceC1976g0M2574l != null) {
            c0981l1M2168n = AbstractC0983m0.m2168n(interfaceC1976g0M2574l);
        } else {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            c0981l1M2168n = C0981l1.f4211n;
        }
        this.f4903j = c0981l1M2168n;
        return interfaceC1976g0M2574l == null;
    }
}
