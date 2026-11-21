package p098l2;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.p129ws.C2155f;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1105c;
import p063h1.C1131v;
import p063h1.C1132w;
import p095l.C1629o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l2.f */
/* loaded from: classes.dex */
public final class C1656f extends AbstractC1658h {

    /* renamed from: h */
    public final C1132w f6359h = new C1132w();

    /* renamed from: i */
    public final C1131v f6360i = new C1131v(0);

    /* renamed from: j */
    public int f6361j = -1;

    /* renamed from: k */
    public final int f6362k;

    /* renamed from: l */
    public final C1655e[] f6363l;

    /* renamed from: m */
    public C1655e f6364m;

    /* renamed from: n */
    public List f6365n;

    /* renamed from: o */
    public List f6366o;

    /* renamed from: p */
    public C1131v f6367p;

    /* renamed from: q */
    public int f6368q;

    public C1656f(int i, List list) {
        this.f6362k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = AbstractC1105c.f4716a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b7 = ((byte[]) list.get(0))[0];
            }
        }
        this.f6363l = new C1655e[8];
        for (int i4 = 0; i4 < 8; i4++) {
            this.f6363l[i4] = new C1655e();
        }
        this.f6364m = this.f6363l[0];
    }

    @Override // p098l2.AbstractC1658h
    /* renamed from: a */
    public final C1629o mo3349a() {
        List list = this.f6365n;
        this.f6366o = list;
        list.getClass();
        return new C1629o(list);
    }

    @Override // p098l2.AbstractC1658h
    /* renamed from: b */
    public final void mo3350b(C1657g c1657g) {
        ByteBuffer byteBuffer = c1657g.data;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C1132w c1132w = this.f6359h;
        c1132w.m2511E(bArrArray, iLimit);
        while (c1132w.m2515a() >= 3) {
            int iM2535u = c1132w.m2535u();
            int i = iM2535u & 3;
            boolean z7 = (iM2535u & 4) == 4;
            byte bM2535u = (byte) c1132w.m2535u();
            byte bM2535u2 = (byte) c1132w.m2535u();
            if (i == 2 || i == 3) {
                if (z7) {
                    if (i == 3) {
                        m3362e();
                        int i4 = (bM2535u & 192) >> 6;
                        int i8 = this.f6361j;
                        if (i8 != -1 && i4 != (i8 + 1) % 4) {
                            m3364g();
                            AbstractC1101a.m2348F("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f6361j + " current=" + i4);
                        }
                        this.f6361j = i4;
                        int i9 = bM2535u & 63;
                        if (i9 == 0) {
                            i9 = 64;
                        }
                        C1131v c1131v = new C1131v(i4, i9);
                        this.f6367p = c1131v;
                        byte[] bArr = (byte[]) c1131v.f4792b;
                        c1131v.f4795e = 1;
                        bArr[0] = bM2535u2;
                    } else {
                        AbstractC1101a.m2353d(i == 2);
                        C1131v c1131v2 = this.f6367p;
                        if (c1131v2 == null) {
                            AbstractC1101a.m2364o("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = (byte[]) c1131v2.f4792b;
                            int i10 = c1131v2.f4795e;
                            int i11 = i10 + 1;
                            c1131v2.f4795e = i11;
                            bArr2[i10] = bM2535u;
                            c1131v2.f4795e = i10 + 2;
                            bArr2[i11] = bM2535u2;
                        }
                    }
                    C1131v c1131v3 = this.f6367p;
                    if (c1131v3.f4795e == (c1131v3.f4794d * 2) - 1) {
                        m3362e();
                    }
                }
            }
        }
    }

    @Override // p098l2.AbstractC1658h
    /* renamed from: d */
    public final boolean mo3352d() {
        return this.f6365n != this.f6366o;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: e */
    public final void m3362e() {
        char c8;
        int i;
        boolean z7;
        C1131v c1131v = this.f6367p;
        if (c1131v == null) {
            return;
        }
        int i4 = 2;
        if (c1131v.f4795e != (c1131v.f4794d * 2) - 1) {
            AbstractC1101a.m2363n("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f6367p.f4794d * 2) - 1) + ", but current index is " + this.f6367p.f4795e + " (sequence number " + this.f6367p.f4793c + ");");
        }
        C1131v c1131v2 = this.f6367p;
        byte[] bArr = (byte[]) c1131v2.f4792b;
        int i8 = c1131v2.f4795e;
        C1131v c1131v3 = this.f6360i;
        c1131v3.m2501r(bArr, i8);
        boolean z8 = false;
        while (true) {
            if (c1131v3.m2486c() > 0) {
                int i9 = 3;
                int iM2494k = c1131v3.m2494k(3);
                int iM2494k2 = c1131v3.m2494k(5);
                if (iM2494k == 7) {
                    c1131v3.m2505v(i4);
                    iM2494k = c1131v3.m2494k(6);
                    if (iM2494k < 7) {
                        AbstractC0008a1.m23s("Invalid extended service number: ", iM2494k, "Cea708Decoder");
                    }
                }
                if (iM2494k2 == 0) {
                    if (iM2494k != 0) {
                        AbstractC1101a.m2348F("Cea708Decoder", "serviceNumber is non-zero (" + iM2494k + ") when blockSize is 0");
                    }
                } else if (iM2494k != this.f6362k) {
                    c1131v3.m2506w(iM2494k2);
                } else {
                    int iM2492i = (iM2494k2 * 8) + c1131v3.m2492i();
                    while (c1131v3.m2492i() < iM2492i) {
                        int iM2494k3 = c1131v3.m2494k(8);
                        if (iM2494k3 != 16) {
                            if (iM2494k3 <= 31) {
                                if (iM2494k3 != 0) {
                                    if (iM2494k3 == i9) {
                                        this.f6365n = m3363f();
                                    } else if (iM2494k3 != 8) {
                                        switch (iM2494k3) {
                                            case 12:
                                                m3364g();
                                                break;
                                            case 13:
                                                this.f6364m.m3357a('\n');
                                                break;
                                            case 14:
                                                break;
                                            default:
                                                if (iM2494k3 < 17 || iM2494k3 > 23) {
                                                    if (iM2494k3 < 24 || iM2494k3 > 31) {
                                                        AbstractC0008a1.m23s("Invalid C0 command: ", iM2494k3, "Cea708Decoder");
                                                        break;
                                                    } else {
                                                        AbstractC1101a.m2348F("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + iM2494k3);
                                                        c1131v3.m2505v(16);
                                                        break;
                                                    }
                                                } else {
                                                    AbstractC1101a.m2348F("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + iM2494k3);
                                                    c1131v3.m2505v(8);
                                                    break;
                                                }
                                        }
                                    } else {
                                        SpannableStringBuilder spannableStringBuilder = this.f6364m.f6339b;
                                        int length = spannableStringBuilder.length();
                                        if (length > 0) {
                                            spannableStringBuilder.delete(length - 1, length);
                                        }
                                    }
                                }
                                i = i4;
                            } else if (iM2494k3 <= 127) {
                                if (iM2494k3 == 127) {
                                    this.f6364m.m3357a('\u266b');
                                } else {
                                    this.f6364m.m3357a((char) (iM2494k3 & 255));
                                }
                                i = i4;
                                z8 = true;
                            } else {
                                if (iM2494k3 <= 159) {
                                    C1655e[] c1655eArr = this.f6363l;
                                    switch (iM2494k3) {
                                        case 128:
                                        case 129:
                                        case 130:
                                        case 131:
                                        case 132:
                                        case 133:
                                        case 134:
                                        case 135:
                                            z7 = true;
                                            int i10 = iM2494k3 - 128;
                                            if (this.f6368q != i10) {
                                                this.f6368q = i10;
                                                this.f6364m = c1655eArr[i10];
                                                break;
                                            }
                                            break;
                                        case 136:
                                            z7 = true;
                                            for (int i11 = 1; i11 <= 8; i11++) {
                                                if (c1131v3.m2493j()) {
                                                    C1655e c1655e = c1655eArr[8 - i11];
                                                    c1655e.f6338a.clear();
                                                    c1655e.f6339b.clear();
                                                    c1655e.f6352o = -1;
                                                    c1655e.f6353p = -1;
                                                    c1655e.f6354q = -1;
                                                    c1655e.f6356s = -1;
                                                    c1655e.f6358u = 0;
                                                }
                                            }
                                            break;
                                        case 137:
                                            for (int i12 = 1; i12 <= 8; i12++) {
                                                if (c1131v3.m2493j()) {
                                                    c1655eArr[8 - i12].f6341d = true;
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 138:
                                            for (int i13 = 1; i13 <= 8; i13++) {
                                                if (c1131v3.m2493j()) {
                                                    c1655eArr[8 - i13].f6341d = false;
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 139:
                                            for (int i14 = 1; i14 <= 8; i14++) {
                                                if (c1131v3.m2493j()) {
                                                    c1655eArr[8 - i14].f6341d = !r1.f6341d;
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 140:
                                            for (int i15 = 1; i15 <= 8; i15++) {
                                                if (c1131v3.m2493j()) {
                                                    c1655eArr[8 - i15].m3359d();
                                                }
                                            }
                                            z7 = true;
                                            break;
                                        case 141:
                                            c1131v3.m2505v(8);
                                            z7 = true;
                                            break;
                                        case 142:
                                            z7 = true;
                                            break;
                                        case 143:
                                            m3364g();
                                            z7 = true;
                                            break;
                                        case 144:
                                            int i16 = i4;
                                            if (!this.f6364m.f6340c) {
                                                c1131v3.m2505v(16);
                                                z7 = true;
                                                i9 = 3;
                                                break;
                                            } else {
                                                c1131v3.m2494k(4);
                                                c1131v3.m2494k(i16);
                                                c1131v3.m2494k(i16);
                                                boolean zM2493j = c1131v3.m2493j();
                                                boolean zM2493j2 = c1131v3.m2493j();
                                                i9 = 3;
                                                c1131v3.m2494k(3);
                                                c1131v3.m2494k(3);
                                                this.f6364m.m3360e(zM2493j, zM2493j2);
                                                z7 = true;
                                            }
                                        case 145:
                                            if (this.f6364m.f6340c) {
                                                int iM3356c = C1655e.m3356c(c1131v3.m2494k(2), c1131v3.m2494k(2), c1131v3.m2494k(2), c1131v3.m2494k(2));
                                                int iM3356c2 = C1655e.m3356c(c1131v3.m2494k(2), c1131v3.m2494k(2), c1131v3.m2494k(2), c1131v3.m2494k(2));
                                                c1131v3.m2505v(2);
                                                C1655e.m3356c(c1131v3.m2494k(2), c1131v3.m2494k(2), c1131v3.m2494k(2), 0);
                                                this.f6364m.m3361f(iM3356c, iM3356c2);
                                            } else {
                                                c1131v3.m2505v(24);
                                            }
                                            z7 = true;
                                            i9 = 3;
                                            break;
                                        case 146:
                                            if (this.f6364m.f6340c) {
                                                c1131v3.m2505v(4);
                                                int iM2494k4 = c1131v3.m2494k(4);
                                                c1131v3.m2505v(2);
                                                c1131v3.m2494k(6);
                                                C1655e c1655e2 = this.f6364m;
                                                if (c1655e2.f6358u != iM2494k4) {
                                                    c1655e2.m3357a('\n');
                                                }
                                                c1655e2.f6358u = iM2494k4;
                                            } else {
                                                c1131v3.m2505v(16);
                                            }
                                            z7 = true;
                                            i9 = 3;
                                            break;
                                        case 147:
                                        case 148:
                                        case 149:
                                        case 150:
                                        default:
                                            AbstractC0008a1.m23s("Invalid C1 command: ", iM2494k3, "Cea708Decoder");
                                            z7 = true;
                                            break;
                                        case 151:
                                            if (this.f6364m.f6340c) {
                                                int iM3356c3 = C1655e.m3356c(c1131v3.m2494k(2), c1131v3.m2494k(2), c1131v3.m2494k(2), c1131v3.m2494k(2));
                                                c1131v3.m2494k(2);
                                                C1655e.m3356c(c1131v3.m2494k(2), c1131v3.m2494k(2), c1131v3.m2494k(2), 0);
                                                c1131v3.m2493j();
                                                c1131v3.m2493j();
                                                c1131v3.m2494k(2);
                                                c1131v3.m2494k(2);
                                                int iM2494k5 = c1131v3.m2494k(2);
                                                c1131v3.m2505v(8);
                                                C1655e c1655e3 = this.f6364m;
                                                c1655e3.f6351n = iM3356c3;
                                                c1655e3.f6348k = iM2494k5;
                                            } else {
                                                c1131v3.m2505v(32);
                                            }
                                            z7 = true;
                                            i9 = 3;
                                            break;
                                        case 152:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 159:
                                            int i17 = iM2494k3 - 152;
                                            C1655e c1655e4 = c1655eArr[i17];
                                            c1131v3.m2505v(i4);
                                            boolean zM2493j3 = c1131v3.m2493j();
                                            c1131v3.m2505v(i4);
                                            int iM2494k6 = c1131v3.m2494k(i9);
                                            boolean zM2493j4 = c1131v3.m2493j();
                                            int iM2494k7 = c1131v3.m2494k(7);
                                            int iM2494k8 = c1131v3.m2494k(8);
                                            int iM2494k9 = c1131v3.m2494k(4);
                                            int iM2494k10 = c1131v3.m2494k(4);
                                            c1131v3.m2505v(i4);
                                            c1131v3.m2505v(6);
                                            c1131v3.m2505v(i4);
                                            int iM2494k11 = c1131v3.m2494k(3);
                                            int iM2494k12 = c1131v3.m2494k(3);
                                            ArrayList arrayList = c1655e4.f6338a;
                                            c1655e4.f6340c = true;
                                            c1655e4.f6341d = zM2493j3;
                                            c1655e4.f6342e = iM2494k6;
                                            c1655e4.f6343f = zM2493j4;
                                            c1655e4.f6344g = iM2494k7;
                                            c1655e4.f6345h = iM2494k8;
                                            c1655e4.f6346i = iM2494k9;
                                            int i18 = iM2494k10 + 1;
                                            if (c1655e4.f6347j != i18) {
                                                c1655e4.f6347j = i18;
                                                while (true) {
                                                    if (arrayList.size() >= c1655e4.f6347j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (iM2494k11 != 0 && c1655e4.f6349l != iM2494k11) {
                                                c1655e4.f6349l = iM2494k11;
                                                int i19 = iM2494k11 - 1;
                                                int i20 = C1655e.f6329B[i19];
                                                boolean z9 = C1655e.f6328A[i19];
                                                int i21 = C1655e.f6336y[i19];
                                                int i22 = C1655e.f6337z[i19];
                                                int i23 = C1655e.f6335x[i19];
                                                c1655e4.f6351n = i20;
                                                c1655e4.f6348k = i23;
                                            }
                                            if (iM2494k12 != 0 && c1655e4.f6350m != iM2494k12) {
                                                c1655e4.f6350m = iM2494k12;
                                                int i24 = iM2494k12 - 1;
                                                int i25 = C1655e.f6331D[i24];
                                                int i26 = C1655e.f6330C[i24];
                                                c1655e4.m3360e(false, false);
                                                c1655e4.m3361f(C1655e.f6333v, C1655e.f6332E[i24]);
                                            }
                                            if (this.f6368q != i17) {
                                                this.f6368q = i17;
                                                this.f6364m = c1655eArr[i17];
                                            }
                                            z7 = true;
                                            i9 = 3;
                                            break;
                                    }
                                } else {
                                    z7 = true;
                                    if (iM2494k3 <= 255) {
                                        this.f6364m.m3357a((char) (iM2494k3 & 255));
                                    } else {
                                        AbstractC0008a1.m23s("Invalid base command: ", iM2494k3, "Cea708Decoder");
                                        i = 2;
                                        c8 = 7;
                                    }
                                }
                                z8 = z7;
                                i = 2;
                                c8 = 7;
                            }
                            c8 = 7;
                        } else {
                            int iM2494k13 = c1131v3.m2494k(8);
                            if (iM2494k13 <= 31) {
                                c8 = 7;
                                if (iM2494k13 > 7) {
                                    if (iM2494k13 <= 15) {
                                        c1131v3.m2505v(8);
                                    } else if (iM2494k13 <= 23) {
                                        c1131v3.m2505v(16);
                                    } else if (iM2494k13 <= 31) {
                                        c1131v3.m2505v(24);
                                    }
                                }
                            } else {
                                c8 = 7;
                                if (iM2494k13 <= 127) {
                                    if (iM2494k13 == 32) {
                                        this.f6364m.m3357a(' ');
                                    } else if (iM2494k13 == 33) {
                                        this.f6364m.m3357a('\u00a0');
                                    } else if (iM2494k13 == 37) {
                                        this.f6364m.m3357a('\u2026');
                                    } else if (iM2494k13 == 42) {
                                        this.f6364m.m3357a('\u0160');
                                    } else if (iM2494k13 == 44) {
                                        this.f6364m.m3357a('\u0152');
                                    } else if (iM2494k13 == 63) {
                                        this.f6364m.m3357a('\u0178');
                                    } else if (iM2494k13 == 57) {
                                        this.f6364m.m3357a('\u2122');
                                    } else if (iM2494k13 == 58) {
                                        this.f6364m.m3357a('\u0161');
                                    } else if (iM2494k13 == 60) {
                                        this.f6364m.m3357a('\u0153');
                                    } else if (iM2494k13 != 61) {
                                        switch (iM2494k13) {
                                            case 48:
                                                this.f6364m.m3357a('\u2588');
                                                break;
                                            case 49:
                                                this.f6364m.m3357a('\u2018');
                                                break;
                                            case DefaultRenderersFactory.MAX_DROPPED_VIDEO_FRAME_COUNT_TO_NOTIFY /* 50 */:
                                                this.f6364m.m3357a('\u2019');
                                                break;
                                            case 51:
                                                this.f6364m.m3357a('\u201c');
                                                break;
                                            case 52:
                                                this.f6364m.m3357a('\u201d');
                                                break;
                                            case 53:
                                                this.f6364m.m3357a('\u2022');
                                                break;
                                            default:
                                                switch (iM2494k13) {
                                                    case 118:
                                                        this.f6364m.m3357a('\u215b');
                                                        break;
                                                    case 119:
                                                        this.f6364m.m3357a('\u215c');
                                                        break;
                                                    case 120:
                                                        this.f6364m.m3357a('\u215d');
                                                        break;
                                                    case 121:
                                                        this.f6364m.m3357a('\u215e');
                                                        break;
                                                    case 122:
                                                        this.f6364m.m3357a('\u2502');
                                                        break;
                                                    case 123:
                                                        this.f6364m.m3357a('\u2510');
                                                        break;
                                                    case 124:
                                                        this.f6364m.m3357a('\u2514');
                                                        break;
                                                    case 125:
                                                        this.f6364m.m3357a('\u2500');
                                                        break;
                                                    case C2155f.PAYLOAD_SHORT /* 126 */:
                                                        this.f6364m.m3357a('\u2518');
                                                        break;
                                                    case 127:
                                                        this.f6364m.m3357a('\u250c');
                                                        break;
                                                    default:
                                                        AbstractC0008a1.m23s("Invalid G2 character: ", iM2494k13, "Cea708Decoder");
                                                        break;
                                                }
                                        }
                                    } else {
                                        this.f6364m.m3357a('\u2120');
                                    }
                                    i = 2;
                                    z8 = true;
                                } else if (iM2494k13 > 159) {
                                    i = 2;
                                    if (iM2494k13 <= 255) {
                                        if (iM2494k13 == 160) {
                                            this.f6364m.m3357a('\u33c4');
                                        } else {
                                            AbstractC0008a1.m23s("Invalid G3 character: ", iM2494k13, "Cea708Decoder");
                                            this.f6364m.m3357a('_');
                                        }
                                        z8 = true;
                                    } else {
                                        AbstractC0008a1.m23s("Invalid extended command: ", iM2494k13, "Cea708Decoder");
                                    }
                                } else if (iM2494k13 <= 135) {
                                    c1131v3.m2505v(32);
                                } else if (iM2494k13 <= 143) {
                                    c1131v3.m2505v(40);
                                } else if (iM2494k13 <= 159) {
                                    i = 2;
                                    c1131v3.m2505v(2);
                                    c1131v3.m2505v(c1131v3.m2494k(6) * 8);
                                }
                            }
                            i = 2;
                        }
                        i4 = i;
                    }
                }
            }
        }
        if (z8) {
            this.f6365n = m3363f();
        }
        this.f6367p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00df  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List m3363f() {
        C1654d c1654d;
        Layout.Alignment alignment;
        float f8;
        float f9;
        int i;
        int i4;
        int i8;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < 8; i9++) {
            C1655e[] c1655eArr = this.f6363l;
            C1655e c1655e = c1655eArr[i9];
            if (c1655e.f6340c && (!c1655e.f6338a.isEmpty() || c1655e.f6339b.length() != 0)) {
                C1655e c1655e2 = c1655eArr[i9];
                if (c1655e2.f6341d) {
                    ArrayList arrayList2 = c1655e2.f6338a;
                    if (!c1655e2.f6340c || (arrayList2.isEmpty() && c1655e2.f6339b.length() == 0)) {
                        c1654d = null;
                    } else {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                            spannableStringBuilder.append((CharSequence) arrayList2.get(i10));
                            spannableStringBuilder.append('\n');
                        }
                        spannableStringBuilder.append((CharSequence) c1655e2.m3358b());
                        int i11 = c1655e2.f6348k;
                        if (i11 == 0) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            Layout.Alignment alignment2 = alignment;
                            if (c1655e2.f6343f) {
                                f8 = c1655e2.f6345h / 209.0f;
                                f9 = c1655e2.f6344g / 74.0f;
                            } else {
                                f8 = c1655e2.f6345h / 99.0f;
                                f9 = c1655e2.f6344g / 99.0f;
                            }
                            float f10 = (f8 * 0.9f) + 0.05f;
                            float f11 = (f9 * 0.9f) + 0.05f;
                            int i12 = c1655e2.f6346i;
                            i = i12 / 3;
                            if (i != 0) {
                                i4 = i12;
                                i8 = 0;
                            } else if (i == 1) {
                                i4 = i12;
                                i8 = 1;
                            } else {
                                i4 = i12;
                                i8 = 2;
                            }
                            int i13 = i4 % 3;
                            int i14 = i13 != 0 ? 0 : i13 == 1 ? 1 : 2;
                            int i15 = c1655e2.f6351n;
                            c1654d = new C1654d(spannableStringBuilder, alignment2, f11, i8, f10, i14, i15 == C1655e.f6334w, i15, c1655e2.f6342e);
                        } else {
                            if (i11 == 1) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else if (i11 != 2) {
                                if (i11 != 3) {
                                    throw new IllegalArgumentException("Unexpected justification value: " + c1655e2.f6348k);
                                }
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            } else {
                                alignment = Layout.Alignment.ALIGN_CENTER;
                            }
                            Layout.Alignment alignment22 = alignment;
                            if (c1655e2.f6343f) {
                            }
                            float f102 = (f8 * 0.9f) + 0.05f;
                            float f112 = (f9 * 0.9f) + 0.05f;
                            int i122 = c1655e2.f6346i;
                            i = i122 / 3;
                            if (i != 0) {
                            }
                            int i132 = i4 % 3;
                            if (i132 != 0) {
                            }
                            int i152 = c1655e2.f6351n;
                            c1654d = new C1654d(spannableStringBuilder, alignment22, f112, i8, f102, i14, i152 == C1655e.f6334w, i152, c1655e2.f6342e);
                        }
                    }
                    if (c1654d != null) {
                        arrayList.add(c1654d);
                    }
                } else {
                    continue;
                }
            }
        }
        Collections.sort(arrayList, C1654d.f6325c);
        ArrayList arrayList3 = new ArrayList(arrayList.size());
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            arrayList3.add(((C1654d) arrayList.get(i16)).f6326a);
        }
        return Collections.unmodifiableList(arrayList3);
    }

    @Override // p098l2.AbstractC1658h, p106m1.InterfaceC1869d
    public final void flush() {
        super.flush();
        this.f6365n = null;
        this.f6366o = null;
        this.f6368q = 0;
        this.f6364m = this.f6363l[0];
        m3364g();
        this.f6367p = null;
    }

    /* renamed from: g */
    public final void m3364g() {
        for (int i = 0; i < 8; i++) {
            this.f6363l[i].m3359d();
        }
    }

    @Override // p106m1.InterfaceC1869d, androidx.media3.exoplayer.image.ImageDecoder
    public final String getName() {
        return "Cea708Decoder";
    }
}
