package p098l2;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.p129ws.C2155f;
import p056g1.C1029b;
import p063h1.AbstractC1101a;
import p063h1.C1132w;
import p090k2.AbstractC1596n;
import p095l.C1629o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l2.c */
/* loaded from: classes.dex */
public final class C1653c extends AbstractC1658h {

    /* renamed from: i */
    public final int f6308i;

    /* renamed from: j */
    public final int f6309j;

    /* renamed from: k */
    public final int f6310k;

    /* renamed from: o */
    public List f6314o;

    /* renamed from: p */
    public List f6315p;

    /* renamed from: q */
    public int f6316q;

    /* renamed from: r */
    public int f6317r;

    /* renamed from: s */
    public boolean f6318s;

    /* renamed from: t */
    public boolean f6319t;

    /* renamed from: u */
    public byte f6320u;

    /* renamed from: v */
    public byte f6321v;

    /* renamed from: x */
    public boolean f6323x;

    /* renamed from: y */
    public long f6324y;

    /* renamed from: z */
    public static final int[] f6306z = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: A */
    public static final int[] f6299A = {0, 4, 8, 12, 16, 20, 24, 28};

    /* renamed from: B */
    public static final int[] f6300B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: C */
    public static final int[] f6301C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};

    /* renamed from: D */
    public static final int[] f6302D = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: E */
    public static final int[] f6303E = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};

    /* renamed from: F */
    public static final int[] f6304F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, C2155f.PAYLOAD_SHORT, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: G */
    public static final boolean[] f6305G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* renamed from: h */
    public final C1132w f6307h = new C1132w();

    /* renamed from: m */
    public final ArrayList f6312m = new ArrayList();

    /* renamed from: n */
    public C1652b f6313n = new C1652b(0, 4);

    /* renamed from: w */
    public int f6322w = 0;

    /* renamed from: l */
    public final long f6311l = 16000000;

    public C1653c(String str, int i) {
        this.f6308i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i == 1) {
            this.f6310k = 0;
            this.f6309j = 0;
        } else if (i == 2) {
            this.f6310k = 1;
            this.f6309j = 0;
        } else if (i == 3) {
            this.f6310k = 0;
            this.f6309j = 1;
        } else if (i != 4) {
            AbstractC1101a.m2348F("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f6310k = 0;
            this.f6309j = 0;
        } else {
            this.f6310k = 1;
            this.f6309j = 1;
        }
        m3355g(0);
        m3354f();
        this.f6323x = true;
        this.f6324y = -9223372036854775807L;
    }

    @Override // p098l2.AbstractC1658h
    /* renamed from: a */
    public final C1629o mo3349a() {
        List list = this.f6314o;
        this.f6315p = list;
        list.getClass();
        return new C1629o(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:179:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a6 A[FALL_THROUGH] */
    @Override // p098l2.AbstractC1658h
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3350b(C1657g c1657g) {
        ByteBuffer byteBuffer = c1657g.data;
        byteBuffer.getClass();
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        C1132w c1132w = this.f6307h;
        c1132w.m2511E(bArrArray, iLimit);
        boolean z7 = false;
        while (true) {
            int iM2515a = c1132w.m2515a();
            int i = this.f6308i;
            if (iM2515a < i) {
                if (z7) {
                    int i4 = this.f6316q;
                    if (i4 == 1 || i4 == 3) {
                        this.f6314o = m3353e();
                        this.f6324y = this.f6374e;
                        return;
                    }
                    return;
                }
                return;
            }
            int iM2535u = i == 2 ? -4 : c1132w.m2535u();
            int iM2535u2 = c1132w.m2535u();
            int iM2535u3 = c1132w.m2535u();
            if ((iM2535u & 2) == 0 && (iM2535u & 1) == this.f6309j) {
                byte b7 = (byte) (iM2535u2 & 127);
                byte b8 = (byte) (iM2535u3 & 127);
                if (b7 != 0 || b8 != 0) {
                    boolean z8 = this.f6318s;
                    if ((iM2535u & 4) == 4) {
                        boolean[] zArr = f6305G;
                        boolean z9 = zArr[iM2535u2] && zArr[iM2535u3];
                        this.f6318s = z9;
                        if (!z9 || (b7 & 240) != 16) {
                            this.f6319t = false;
                            if (!z9) {
                                if (1 <= b7 && b7 <= 15) {
                                    this.f6323x = false;
                                } else if ((b7 & 246) == 20) {
                                    if (b8 != 32 && b8 != 47) {
                                        switch (b8) {
                                            default:
                                                switch (b8) {
                                                    case 42:
                                                    case 43:
                                                        this.f6323x = false;
                                                        break;
                                                }
                                            case 37:
                                            case 38:
                                            case 39:
                                                break;
                                        }
                                    } else {
                                        this.f6323x = true;
                                    }
                                }
                                if (this.f6323x) {
                                    int i8 = b7 & 224;
                                    if (i8 == 0) {
                                        this.f6322w = (b7 >> 3) & 1;
                                    }
                                    if (this.f6322w == this.f6310k) {
                                        if (i8 == 0) {
                                            int i9 = b7 & 247;
                                            if (i9 == 17 && (b8 & 240) == 48) {
                                                this.f6313n.m3344a((char) f6302D[b8 & 15]);
                                            } else {
                                                int i10 = b7 & 246;
                                                if (i10 == 18 && (b8 & 224) == 32) {
                                                    this.f6313n.m3345b();
                                                    this.f6313n.m3344a((char) ((b7 & 1) == 0 ? f6303E[b8 & 31] : f6304F[b8 & 31]));
                                                } else if (i9 == 17 && (b8 & 240) == 32) {
                                                    this.f6313n.m3344a(' ');
                                                    boolean z10 = (b8 & 1) == 1;
                                                    C1652b c1652b = this.f6313n;
                                                    c1652b.f6291a.add(new C1651a((b8 >> 1) & 7, c1652b.f6293c.length(), z10));
                                                } else if ((b7 & 240) == 16 && (b8 & 192) == 64) {
                                                    int i11 = f6306z[b7 & 7];
                                                    if ((b8 & 32) != 0) {
                                                        i11++;
                                                    }
                                                    C1652b c1652b2 = this.f6313n;
                                                    if (i11 != c1652b2.f6294d) {
                                                        if (this.f6316q != 1 && !c1652b2.m3348e()) {
                                                            C1652b c1652b3 = new C1652b(this.f6316q, this.f6317r);
                                                            this.f6313n = c1652b3;
                                                            this.f6312m.add(c1652b3);
                                                        }
                                                        this.f6313n.f6294d = i11;
                                                    }
                                                    boolean z11 = (b8 & 16) == 16;
                                                    boolean z12 = (b8 & 1) == 1;
                                                    int i12 = (b8 >> 1) & 7;
                                                    C1652b c1652b4 = this.f6313n;
                                                    c1652b4.f6291a.add(new C1651a(z11 ? 8 : i12, c1652b4.f6293c.length(), z12));
                                                    if (z11) {
                                                        this.f6313n.f6295e = f6299A[i12];
                                                    }
                                                } else if (i9 == 23 && b8 >= 33 && b8 <= 35) {
                                                    this.f6313n.f6296f = b8 - 32;
                                                } else if (i10 == 20 && (b8 & 240) == 32) {
                                                    if (b8 == 32) {
                                                        m3355g(2);
                                                    } else if (b8 != 41) {
                                                        switch (b8) {
                                                            case 37:
                                                                m3355g(1);
                                                                this.f6317r = 2;
                                                                this.f6313n.f6298h = 2;
                                                                break;
                                                            case 38:
                                                                m3355g(1);
                                                                this.f6317r = 3;
                                                                this.f6313n.f6298h = 3;
                                                                break;
                                                            case 39:
                                                                m3355g(1);
                                                                this.f6317r = 4;
                                                                this.f6313n.f6298h = 4;
                                                                break;
                                                            default:
                                                                int i13 = this.f6316q;
                                                                if (i13 != 0) {
                                                                    if (b8 == 33) {
                                                                        this.f6313n.m3345b();
                                                                        break;
                                                                    } else {
                                                                        switch (b8) {
                                                                            case 44:
                                                                                this.f6314o = Collections.EMPTY_LIST;
                                                                                if (i13 == 1 || i13 == 3) {
                                                                                    m3354f();
                                                                                    break;
                                                                                }
                                                                            case 45:
                                                                                if (i13 == 1 && !this.f6313n.m3348e()) {
                                                                                    C1652b c1652b5 = this.f6313n;
                                                                                    ArrayList arrayList = c1652b5.f6292b;
                                                                                    arrayList.add(c1652b5.m3347d());
                                                                                    c1652b5.f6293c.setLength(0);
                                                                                    c1652b5.f6291a.clear();
                                                                                    int iMin = Math.min(c1652b5.f6298h, c1652b5.f6294d);
                                                                                    while (arrayList.size() >= iMin) {
                                                                                        arrayList.remove(0);
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                m3354f();
                                                                                break;
                                                                            case 47:
                                                                                this.f6314o = m3353e();
                                                                                m3354f();
                                                                                break;
                                                                        }
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        m3355g(3);
                                                    }
                                                }
                                            }
                                        } else {
                                            C1652b c1652b6 = this.f6313n;
                                            int[] iArr = f6301C;
                                            c1652b6.m3344a((char) iArr[(b7 & Byte.MAX_VALUE) - 32]);
                                            if ((b8 & 224) != 0) {
                                                this.f6313n.m3344a((char) iArr[(b8 & Byte.MAX_VALUE) - 32]);
                                            }
                                        }
                                        z7 = true;
                                    }
                                }
                            } else if (z8) {
                                m3354f();
                                z7 = true;
                            }
                        } else if (this.f6319t && this.f6320u == b7 && this.f6321v == b8) {
                            this.f6319t = false;
                        } else {
                            this.f6319t = true;
                            this.f6320u = b7;
                            this.f6321v = b8;
                            if (!z9) {
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p098l2.AbstractC1658h, p106m1.InterfaceC1869d, androidx.media3.exoplayer.image.ImageDecoder
    /* renamed from: c */
    public final AbstractC1596n dequeueOutputBuffer() {
        AbstractC1596n abstractC1596n;
        AbstractC1596n abstractC1596nDequeueOutputBuffer = super.dequeueOutputBuffer();
        if (abstractC1596nDequeueOutputBuffer != null) {
            return abstractC1596nDequeueOutputBuffer;
        }
        long j = this.f6311l;
        if (j == -9223372036854775807L) {
            return null;
        }
        long j8 = this.f6324y;
        if (j8 == -9223372036854775807L || this.f6374e - j8 < j || (abstractC1596n = (AbstractC1596n) this.f6371b.pollFirst()) == null) {
            return null;
        }
        this.f6314o = Collections.EMPTY_LIST;
        this.f6324y = -9223372036854775807L;
        C1629o c1629oMo3349a = mo3349a();
        long j9 = this.f6374e;
        abstractC1596n.timeUs = j9;
        abstractC1596n.f6075j = c1629oMo3349a;
        abstractC1596n.f6076k = j9;
        return abstractC1596n;
    }

    @Override // p098l2.AbstractC1658h
    /* renamed from: d */
    public final boolean mo3352d() {
        return this.f6314o != this.f6315p;
    }

    /* renamed from: e */
    public final ArrayList m3353e() {
        ArrayList arrayList = this.f6312m;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            C1029b c1029bM3346c = ((C1652b) arrayList.get(i)).m3346c(Integer.MIN_VALUE);
            arrayList2.add(c1029bM3346c);
            if (c1029bM3346c != null) {
                iMin = Math.min(iMin, c1029bM3346c.f4378i);
            }
        }
        ArrayList arrayList3 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            C1029b c1029bM3346c2 = (C1029b) arrayList2.get(i4);
            if (c1029bM3346c2 != null) {
                if (c1029bM3346c2.f4378i != iMin) {
                    c1029bM3346c2 = ((C1652b) arrayList.get(i4)).m3346c(iMin);
                    c1029bM3346c2.getClass();
                }
                arrayList3.add(c1029bM3346c2);
            }
        }
        return arrayList3;
    }

    /* renamed from: f */
    public final void m3354f() {
        C1652b c1652b = this.f6313n;
        c1652b.f6297g = this.f6316q;
        c1652b.f6291a.clear();
        c1652b.f6292b.clear();
        c1652b.f6293c.setLength(0);
        c1652b.f6294d = 15;
        c1652b.f6295e = 0;
        c1652b.f6296f = 0;
        ArrayList arrayList = this.f6312m;
        arrayList.clear();
        arrayList.add(this.f6313n);
    }

    @Override // p098l2.AbstractC1658h, p106m1.InterfaceC1869d
    public final void flush() {
        super.flush();
        this.f6314o = null;
        this.f6315p = null;
        m3355g(0);
        this.f6317r = 4;
        this.f6313n.f6298h = 4;
        m3354f();
        this.f6318s = false;
        this.f6319t = false;
        this.f6320u = (byte) 0;
        this.f6321v = (byte) 0;
        this.f6322w = 0;
        this.f6323x = true;
        this.f6324y = -9223372036854775807L;
    }

    /* renamed from: g */
    public final void m3355g(int i) {
        int i4 = this.f6316q;
        if (i4 == i) {
            return;
        }
        this.f6316q = i;
        if (i != 3) {
            m3354f();
            if (i4 == 3 || i == 1 || i == 0) {
                this.f6314o = Collections.EMPTY_LIST;
                return;
            }
            return;
        }
        int i8 = 0;
        while (true) {
            ArrayList arrayList = this.f6312m;
            if (i8 >= arrayList.size()) {
                return;
            }
            ((C1652b) arrayList.get(i8)).f6297g = i;
            i8++;
        }
    }

    @Override // p106m1.InterfaceC1869d, androidx.media3.exoplayer.image.ImageDecoder
    public final String getName() {
        return "Cea608Decoder";
    }

    @Override // p098l2.AbstractC1658h, p106m1.InterfaceC1869d
    public final void release() {
    }
}
