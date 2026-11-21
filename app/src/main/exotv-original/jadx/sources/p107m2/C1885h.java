package p107m2;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import java.util.ArrayList;
import java.util.List;
import p051f5.C0945b;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p056g1.C1029b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1131v;
import p063h1.C1132w;
import p063h1.InterfaceC1111f;
import p090k2.C1585c;
import p090k2.C1598p;
import p090k2.InterfaceC1599q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m2.h */
/* loaded from: classes.dex */
public final class C1885h implements InterfaceC1599q {

    /* renamed from: q */
    public static final byte[] f7016q = {0, 7, 8, 15};

    /* renamed from: r */
    public static final byte[] f7017r = {0, 119, -120, -1};

    /* renamed from: s */
    public static final byte[] f7018s = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* renamed from: j */
    public final Paint f7019j;

    /* renamed from: k */
    public final Paint f7020k;

    /* renamed from: l */
    public final Canvas f7021l;

    /* renamed from: m */
    public final C1879b f7022m;

    /* renamed from: n */
    public final C1878a f7023n;

    /* renamed from: o */
    public final C1884g f7024o;

    /* renamed from: p */
    public Bitmap f7025p;

    public C1885h(List list) {
        C1132w c1132w = new C1132w((byte[]) list.get(0));
        int iM2507A = c1132w.m2507A();
        int iM2507A2 = c1132w.m2507A();
        Paint paint = new Paint();
        this.f7019j = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.f7020k = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.f7021l = new Canvas();
        this.f7022m = new C1879b(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.f7023n = new C1878a(0, new int[]{0, -1, -16777216, -8421505}, m3660b(), m3661c());
        this.f7024o = new C1884g(iM2507A, iM2507A2);
    }

    /* renamed from: a */
    public static byte[] m3659a(int i, int i4, C1131v c1131v) {
        byte[] bArr = new byte[i];
        for (int i8 = 0; i8 < i; i8++) {
            bArr[i8] = (byte) c1131v.m2494k(i4);
        }
        return bArr;
    }

    /* renamed from: b */
    public static int[] m3660b() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i = 1; i < 16; i++) {
            if (i < 8) {
                iArr[i] = m3662e(255, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) != 0 ? 255 : 0);
            } else {
                iArr[i] = m3662e(255, (i & 1) != 0 ? 127 : 0, (i & 2) != 0 ? 127 : 0, (i & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    /* renamed from: c */
    public static int[] m3661c() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i = 0; i < 256; i++) {
            if (i < 8) {
                iArr[i] = m3662e(63, (i & 1) != 0 ? 255 : 0, (i & 2) != 0 ? 255 : 0, (i & 4) == 0 ? 0 : 255);
            } else {
                int i4 = i & 136;
                if (i4 == 0) {
                    iArr[i] = m3662e(255, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i4 == 8) {
                    iArr[i] = m3662e(127, ((i & 1) != 0 ? 85 : 0) + ((i & 16) != 0 ? 170 : 0), ((i & 2) != 0 ? 85 : 0) + ((i & 32) != 0 ? 170 : 0), ((i & 4) == 0 ? 0 : 85) + ((i & 64) == 0 ? 0 : 170));
                } else if (i4 == 128) {
                    iArr[i] = m3662e(255, ((i & 1) != 0 ? 43 : 0) + 127 + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + 127 + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + 127 + ((i & 64) == 0 ? 0 : 85));
                } else if (i4 == 136) {
                    iArr[i] = m3662e(255, ((i & 1) != 0 ? 43 : 0) + ((i & 16) != 0 ? 85 : 0), ((i & 2) != 0 ? 43 : 0) + ((i & 32) != 0 ? 85 : 0), ((i & 4) == 0 ? 0 : 43) + ((i & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    /* renamed from: e */
    public static int m3662e(int i, int i4, int i8, int i9) {
        return (i << 24) | (i4 << 16) | (i8 << 8) | i9;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x01d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ff A[SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3663g(byte[] bArr, int[] iArr, int i, int i4, int i8, Paint paint, Canvas canvas) {
        char c8;
        char c9;
        boolean z7;
        int iM2494k;
        int iM2494k2;
        int i9;
        byte[] bArr2;
        boolean z8;
        int iM2494k3;
        int iM2494k4;
        int iM2494k5;
        int i10;
        int i11;
        int i12;
        boolean z9;
        int iM2494k6;
        int i13;
        Paint paint2 = paint;
        C1131v c1131v = new C1131v(bArr, bArr.length);
        int i14 = i4;
        int i15 = i8;
        byte[] bArrM3659a = null;
        byte[] bArrM3659a2 = null;
        byte[] bArrM3659a3 = null;
        while (c1131v.m2486c() != 0) {
            int i16 = 8;
            int iM2494k7 = c1131v.m2494k(8);
            if (iM2494k7 != 240) {
                int i17 = 3;
                int i18 = 2;
                int i19 = 4;
                switch (iM2494k7) {
                    case 16:
                        byte[] bArr3 = i == 3 ? bArrM3659a == null ? f7017r : bArrM3659a : i == 2 ? bArrM3659a3 == null ? f7016q : bArrM3659a3 : null;
                        boolean z10 = false;
                        while (true) {
                            int iM2494k8 = c1131v.m2494k(2);
                            if (iM2494k8 != 0) {
                                z7 = z10;
                                iM2494k = iM2494k8;
                                iM2494k2 = 1;
                            } else if (c1131v.m2493j()) {
                                int iM2494k9 = c1131v.m2494k(3) + 3;
                                z7 = z10;
                                iM2494k = c1131v.m2494k(2);
                                iM2494k2 = iM2494k9;
                            } else {
                                if (c1131v.m2493j()) {
                                    z7 = z10;
                                    iM2494k2 = 1;
                                    c8 = '\b';
                                    c9 = 4;
                                } else {
                                    int iM2494k10 = c1131v.m2494k(2);
                                    if (iM2494k10 == 0) {
                                        c8 = '\b';
                                        c9 = 4;
                                        z7 = true;
                                    } else if (iM2494k10 == 1) {
                                        c8 = '\b';
                                        c9 = 4;
                                        z7 = z10;
                                        iM2494k2 = 2;
                                    } else if (iM2494k10 == 2) {
                                        c8 = '\b';
                                        c9 = 4;
                                        iM2494k2 = c1131v.m2494k(4) + 12;
                                        iM2494k = c1131v.m2494k(2);
                                        z7 = z10;
                                        if (iM2494k2 == 0) {
                                            i9 = i14;
                                            i14 = i9 + iM2494k2;
                                            if (!z7) {
                                            }
                                        }
                                    } else if (iM2494k10 != 3) {
                                        z7 = z10;
                                        c8 = '\b';
                                        c9 = 4;
                                    } else {
                                        c8 = '\b';
                                        int iM2494k11 = c1131v.m2494k(8) + 29;
                                        iM2494k = c1131v.m2494k(2);
                                        z7 = z10;
                                        iM2494k2 = iM2494k11;
                                        c9 = 4;
                                        if (iM2494k2 == 0 || paint2 == null) {
                                            i9 = i14;
                                        } else {
                                            if (bArr3 != 0) {
                                                iM2494k = bArr3[iM2494k];
                                            }
                                            paint2.setColor(iArr[iM2494k]);
                                            i9 = i14;
                                            canvas.drawRect(i14, i15, i14 + iM2494k2, i15 + 1, paint2);
                                        }
                                        i14 = i9 + iM2494k2;
                                        if (!z7) {
                                            c1131v.m2487d();
                                            break;
                                        } else {
                                            paint2 = paint;
                                            z10 = z7;
                                        }
                                    }
                                    iM2494k = 0;
                                    iM2494k2 = 0;
                                    if (iM2494k2 == 0) {
                                    }
                                }
                                iM2494k = 0;
                                if (iM2494k2 == 0) {
                                }
                            }
                            c8 = '\b';
                            c9 = 4;
                            if (iM2494k2 == 0) {
                            }
                        }
                    case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                        if (i == 3) {
                            bArr2 = bArrM3659a2 == null ? f7018s : bArrM3659a2;
                        } else {
                            bArr2 = null;
                        }
                        boolean z11 = false;
                        while (true) {
                            int iM2494k12 = c1131v.m2494k(i19);
                            if (iM2494k12 != 0) {
                                z8 = z11;
                                iM2494k5 = iM2494k12;
                                iM2494k3 = 1;
                            } else if (c1131v.m2493j()) {
                                if (c1131v.m2493j()) {
                                    int iM2494k13 = c1131v.m2494k(i18);
                                    if (iM2494k13 == 0) {
                                        z8 = z11;
                                        iM2494k3 = 1;
                                    } else if (iM2494k13 != 1) {
                                        if (iM2494k13 == i18) {
                                            iM2494k3 = c1131v.m2494k(i19) + 9;
                                            iM2494k4 = c1131v.m2494k(i19);
                                        } else if (iM2494k13 != i17) {
                                            z8 = z11;
                                            iM2494k3 = 0;
                                        } else {
                                            iM2494k3 = c1131v.m2494k(i16) + 25;
                                            iM2494k4 = c1131v.m2494k(i19);
                                        }
                                        iM2494k5 = iM2494k4;
                                    } else {
                                        z8 = z11;
                                        iM2494k3 = i18;
                                    }
                                    iM2494k5 = 0;
                                } else {
                                    iM2494k3 = c1131v.m2494k(i18) + 4;
                                    iM2494k5 = c1131v.m2494k(i19);
                                }
                                z8 = z11;
                            } else {
                                int iM2494k14 = c1131v.m2494k(i17);
                                if (iM2494k14 != 0) {
                                    iM2494k3 = iM2494k14 + 2;
                                    z8 = z11;
                                    iM2494k5 = 0;
                                } else {
                                    z8 = true;
                                    iM2494k3 = 0;
                                    iM2494k5 = 0;
                                }
                            }
                            if (iM2494k3 == 0 || paint2 == null) {
                                i10 = i14;
                                i11 = i17;
                                i12 = i18;
                            } else {
                                if (bArr2 != 0) {
                                    iM2494k5 = bArr2[iM2494k5];
                                }
                                paint2.setColor(iArr[iM2494k5]);
                                i11 = i17;
                                i12 = 2;
                                i10 = i14;
                                canvas.drawRect(i14, i15, i14 + iM2494k3, i15 + 1, paint2);
                            }
                            i14 = i10 + iM2494k3;
                            if (z8) {
                                c1131v.m2487d();
                                break;
                            } else {
                                z11 = z8;
                                i17 = i11;
                                i18 = i12;
                                i19 = 4;
                                i16 = 8;
                            }
                        }
                    case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                        boolean z12 = false;
                        while (true) {
                            int iM2494k15 = c1131v.m2494k(8);
                            if (iM2494k15 != 0) {
                                z9 = z12;
                                iM2494k6 = 1;
                            } else if (c1131v.m2493j()) {
                                z9 = z12;
                                iM2494k6 = c1131v.m2494k(7);
                                iM2494k15 = c1131v.m2494k(8);
                            } else {
                                int iM2494k16 = c1131v.m2494k(7);
                                if (iM2494k16 != 0) {
                                    z9 = z12;
                                    iM2494k6 = iM2494k16;
                                    iM2494k15 = 0;
                                } else {
                                    z9 = true;
                                    iM2494k15 = 0;
                                    iM2494k6 = 0;
                                }
                            }
                            if (iM2494k6 == 0 || paint2 == null) {
                                i13 = i14;
                            } else {
                                paint2.setColor(iArr[iM2494k15]);
                                i13 = i14;
                                canvas.drawRect(i14, i15, i14 + iM2494k6, i15 + 1, paint2);
                            }
                            i14 = i13 + iM2494k6;
                            if (z9) {
                                break;
                            } else {
                                z12 = z9;
                            }
                        }
                        break;
                    default:
                        switch (iM2494k7) {
                            case 32:
                                bArrM3659a3 = m3659a(4, 4, c1131v);
                                break;
                            case 33:
                                bArrM3659a = m3659a(4, 8, c1131v);
                                break;
                            case 34:
                                bArrM3659a2 = m3659a(16, 8, c1131v);
                                break;
                        }
                }
            } else {
                i15 += 2;
                i14 = i4;
            }
            paint2 = paint;
        }
    }

    /* renamed from: i */
    public static C1878a m3664i(int i, C1131v c1131v) {
        int iM2494k;
        int i4;
        int iM2494k2;
        int iM2494k3;
        int iM2494k4;
        int i8 = 8;
        int iM2494k5 = c1131v.m2494k(8);
        c1131v.m2505v(8);
        int i9 = 2;
        int i10 = i - 2;
        int i11 = 0;
        int[] iArr = {0, -1, -16777216, -8421505};
        int[] iArrM3660b = m3660b();
        int[] iArrM3661c = m3661c();
        while (i10 > 0) {
            int iM2494k6 = c1131v.m2494k(i8);
            int iM2494k7 = c1131v.m2494k(i8);
            int[] iArr2 = (iM2494k7 & 128) != 0 ? iArr : (iM2494k7 & 64) != 0 ? iArrM3660b : iArrM3661c;
            if ((iM2494k7 & 1) != 0) {
                iM2494k3 = c1131v.m2494k(i8);
                iM2494k4 = c1131v.m2494k(i8);
                iM2494k = c1131v.m2494k(i8);
                iM2494k2 = c1131v.m2494k(i8);
                i4 = i10 - 6;
            } else {
                int iM2494k8 = c1131v.m2494k(6) << i9;
                int iM2494k9 = c1131v.m2494k(4) << 4;
                iM2494k = c1131v.m2494k(4) << 4;
                i4 = i10 - 4;
                iM2494k2 = c1131v.m2494k(i9) << 6;
                iM2494k3 = iM2494k8;
                iM2494k4 = iM2494k9;
            }
            if (iM2494k3 == 0) {
                iM2494k4 = i11;
                iM2494k = iM2494k4;
                iM2494k2 = 255;
            }
            double d8 = iM2494k3;
            double d9 = iM2494k4 - 128;
            double d10 = iM2494k - 128;
            iArr2[iM2494k6] = m3662e((byte) (255 - (iM2494k2 & 255)), AbstractC1118i0.m2451j((int) ((1.402d * d9) + d8), 0, 255), AbstractC1118i0.m2451j((int) ((d8 - (0.34414d * d10)) - (d9 * 0.71414d)), 0, 255), AbstractC1118i0.m2451j((int) ((d10 * 1.772d) + d8), 0, 255));
            i10 = i4;
            i11 = 0;
            iM2494k5 = iM2494k5;
            iArrM3661c = iArrM3661c;
            i8 = 8;
            i9 = 2;
        }
        return new C1878a(iM2494k5, iArr, iArrM3660b, iArrM3661c);
    }

    /* renamed from: j */
    public static C1880c m3665j(C1131v c1131v) {
        byte[] bArr;
        int iM2494k = c1131v.m2494k(16);
        c1131v.m2505v(4);
        int iM2494k2 = c1131v.m2494k(2);
        boolean zM2493j = c1131v.m2493j();
        c1131v.m2505v(1);
        byte[] bArr2 = AbstractC1118i0.f4755f;
        if (iM2494k2 != 1) {
            if (iM2494k2 == 0) {
                int iM2494k3 = c1131v.m2494k(16);
                int iM2494k4 = c1131v.m2494k(16);
                if (iM2494k3 > 0) {
                    bArr2 = new byte[iM2494k3];
                    c1131v.m2497n(bArr2, iM2494k3);
                }
                if (iM2494k4 > 0) {
                    bArr = new byte[iM2494k4];
                    c1131v.m2497n(bArr, iM2494k4);
                }
            }
            return new C1880c(iM2494k, zM2493j, bArr2, bArr);
        }
        c1131v.m2505v(c1131v.m2494k(8) * 16);
        bArr = bArr2;
        return new C1880c(iM2494k, zM2493j, bArr2, bArr);
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: f */
    public final void mo75f(byte[] bArr, int i, int i4, C1598p c1598p, InterfaceC1111f interfaceC1111f) {
        C1884g c1884g;
        boolean z7;
        C1585c c1585c;
        char c8;
        char c9;
        char c10;
        int i8;
        ArrayList arrayList;
        int i9;
        C1879b c1879b;
        C1884g c1884g2;
        C1882e c1882e;
        int i10;
        int i11;
        int i12;
        int i13;
        C1882e c1882e2;
        int iM2494k;
        int iM2494k2;
        int i14;
        int iM2494k3;
        C1131v c1131v = new C1131v(bArr, i + i4);
        c1131v.m2502s(i);
        while (true) {
            int iM2486c = c1131v.m2486c();
            c1884g = this.f7024o;
            z7 = true;
            if (iM2486c >= 48 && c1131v.m2494k(8) == 15) {
                int iM2494k4 = c1131v.m2494k(8);
                int iM2494k5 = c1131v.m2494k(16);
                int iM2494k6 = c1131v.m2494k(16);
                int iM2491h = c1131v.m2491h() + iM2494k6;
                if (iM2494k6 * 8 > c1131v.m2486c()) {
                    AbstractC1101a.m2348F("DvbParser", "Data field length exceeds limit");
                    c1131v.m2505v(c1131v.m2486c());
                } else {
                    switch (iM2494k4) {
                        case 16:
                            if (iM2494k5 == c1884g.f7007a) {
                                C0945b c0945b = c1884g.f7015i;
                                c1131v.m2494k(8);
                                int iM2494k7 = c1131v.m2494k(4);
                                int iM2494k8 = c1131v.m2494k(2);
                                c1131v.m2505v(2);
                                int i15 = iM2494k6 - 2;
                                SparseArray sparseArray = new SparseArray();
                                while (i15 > 0) {
                                    int iM2494k9 = c1131v.m2494k(8);
                                    c1131v.m2505v(8);
                                    i15 -= 6;
                                    sparseArray.put(iM2494k9, new C1881d(c1131v.m2494k(16), c1131v.m2494k(16)));
                                }
                                C0945b c0945b2 = new C0945b(iM2494k7, iM2494k8, sparseArray);
                                if (iM2494k8 != 0) {
                                    c1884g.f7015i = c0945b2;
                                    c1884g.f7009c.clear();
                                    c1884g.f7010d.clear();
                                    c1884g.f7011e.clear();
                                    break;
                                } else if (c0945b != null && c0945b.f4152j != iM2494k7) {
                                    c1884g.f7015i = c0945b2;
                                    break;
                                }
                            }
                            break;
                        case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                            C0945b c0945b3 = c1884g.f7015i;
                            SparseArray sparseArray2 = c1884g.f7009c;
                            if (iM2494k5 == c1884g.f7007a && c0945b3 != null) {
                                int iM2494k10 = c1131v.m2494k(8);
                                c1131v.m2505v(4);
                                boolean zM2493j = c1131v.m2493j();
                                c1131v.m2505v(3);
                                int iM2494k11 = c1131v.m2494k(16);
                                int iM2494k12 = c1131v.m2494k(16);
                                c1131v.m2494k(3);
                                int iM2494k13 = c1131v.m2494k(3);
                                c1131v.m2505v(2);
                                int iM2494k14 = c1131v.m2494k(8);
                                int iM2494k15 = c1131v.m2494k(8);
                                int iM2494k16 = c1131v.m2494k(4);
                                int iM2494k17 = c1131v.m2494k(2);
                                c1131v.m2505v(2);
                                int i16 = iM2494k6 - 10;
                                SparseArray sparseArray3 = new SparseArray();
                                while (i16 > 0) {
                                    int iM2494k18 = c1131v.m2494k(16);
                                    int iM2494k19 = c1131v.m2494k(2);
                                    c1131v.m2494k(2);
                                    int iM2494k20 = c1131v.m2494k(12);
                                    c1131v.m2505v(4);
                                    int iM2494k21 = c1131v.m2494k(12);
                                    int i17 = i16 - 6;
                                    if (iM2494k19 == 1 || iM2494k19 == 2) {
                                        c1131v.m2494k(8);
                                        c1131v.m2494k(8);
                                        i16 -= 8;
                                    } else {
                                        i16 = i17;
                                    }
                                    sparseArray3.put(iM2494k18, new C1883f(iM2494k20, iM2494k21));
                                }
                                C1882e c1882e3 = new C1882e(iM2494k10, zM2493j, iM2494k11, iM2494k12, iM2494k13, iM2494k14, iM2494k15, iM2494k16, iM2494k17, sparseArray3);
                                if (c0945b3.f4153k == 0 && (c1882e2 = (C1882e) sparseArray2.get(iM2494k10)) != null) {
                                    SparseArray sparseArray4 = c1882e2.f7004j;
                                    for (int i18 = 0; i18 < sparseArray4.size(); i18++) {
                                        c1882e3.f7004j.put(sparseArray4.keyAt(i18), (C1883f) sparseArray4.valueAt(i18));
                                    }
                                }
                                sparseArray2.put(c1882e3.f6995a, c1882e3);
                                break;
                            }
                            break;
                        case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                            if (iM2494k5 == c1884g.f7007a) {
                                C1878a c1878aM3664i = m3664i(iM2494k6, c1131v);
                                c1884g.f7010d.put(c1878aM3664i.f6979a, c1878aM3664i);
                                break;
                            } else if (iM2494k5 == c1884g.f7008b) {
                                C1878a c1878aM3664i2 = m3664i(iM2494k6, c1131v);
                                c1884g.f7012f.put(c1878aM3664i2.f6979a, c1878aM3664i2);
                                break;
                            }
                            break;
                        case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                            if (iM2494k5 == c1884g.f7007a) {
                                C1880c c1880cM3665j = m3665j(c1131v);
                                c1884g.f7011e.put(c1880cM3665j.f6989a, c1880cM3665j);
                                break;
                            } else if (iM2494k5 == c1884g.f7008b) {
                                C1880c c1880cM3665j2 = m3665j(c1131v);
                                c1884g.f7013g.put(c1880cM3665j2.f6989a, c1880cM3665j2);
                                break;
                            }
                            break;
                        case 20:
                            if (iM2494k5 == c1884g.f7007a) {
                                c1131v.m2505v(4);
                                boolean zM2493j2 = c1131v.m2493j();
                                c1131v.m2505v(3);
                                int iM2494k22 = c1131v.m2494k(16);
                                int iM2494k23 = c1131v.m2494k(16);
                                if (zM2493j2) {
                                    int iM2494k24 = c1131v.m2494k(16);
                                    iM2494k = c1131v.m2494k(16);
                                    iM2494k3 = c1131v.m2494k(16);
                                    iM2494k2 = c1131v.m2494k(16);
                                    i14 = iM2494k24;
                                } else {
                                    iM2494k = iM2494k22;
                                    iM2494k2 = iM2494k23;
                                    i14 = 0;
                                    iM2494k3 = 0;
                                }
                                c1884g.f7014h = new C1879b(iM2494k22, iM2494k23, i14, iM2494k, iM2494k3, iM2494k2);
                                break;
                            }
                            break;
                    }
                    c1131v.m2506w(iM2491h - c1131v.m2491h());
                }
            }
        }
        C0945b c0945b4 = c1884g.f7015i;
        if (c0945b4 == null) {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            c1585c = new C1585c(C0981l1.f4211n, -9223372036854775807L, -9223372036854775807L);
        } else {
            C1879b c1879b2 = c1884g.f7014h;
            if (c1879b2 == null) {
                c1879b2 = this.f7022m;
            }
            Bitmap bitmap = this.f7025p;
            Canvas canvas = this.f7021l;
            if (bitmap == null || c1879b2.f6983a + 1 != bitmap.getWidth() || c1879b2.f6984b + 1 != this.f7025p.getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(c1879b2.f6983a + 1, c1879b2.f6984b + 1, Bitmap.Config.ARGB_8888);
                this.f7025p = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray5 = (SparseArray) c0945b4.f4154l;
            int i19 = 0;
            while (i19 < sparseArray5.size()) {
                canvas.save();
                C1881d c1881d = (C1881d) sparseArray5.valueAt(i19);
                C1882e c1882e4 = (C1882e) c1884g.f7009c.get(sparseArray5.keyAt(i19));
                int i20 = c1881d.f6993a + c1879b2.f6985c;
                int i21 = c1881d.f6994b + c1879b2.f6987e;
                int i22 = c1882e4.f6997c;
                int i23 = c1882e4.f7000f;
                int i24 = c1882e4.f6998d;
                boolean z8 = z7;
                int i25 = i20 + i22;
                int i26 = i21 + i24;
                SparseArray sparseArray6 = sparseArray5;
                canvas.clipRect(i20, i21, Math.min(i25, c1879b2.f6986d), Math.min(i26, c1879b2.f6988f));
                C1878a c1878a = (C1878a) c1884g.f7010d.get(i23);
                if (c1878a == null && (c1878a = (C1878a) c1884g.f7012f.get(i23)) == null) {
                    c1878a = this.f7023n;
                }
                SparseArray sparseArray7 = c1882e4.f7004j;
                int i27 = i19;
                int i28 = 0;
                while (i28 < sparseArray7.size()) {
                    int iKeyAt = sparseArray7.keyAt(i28);
                    SparseArray sparseArray8 = sparseArray7;
                    C1883f c1883f = (C1883f) sparseArray7.valueAt(i28);
                    int i29 = i21;
                    C1880c c1880c = (C1880c) c1884g.f7011e.get(iKeyAt);
                    if (c1880c == null) {
                        c1880c = (C1880c) c1884g.f7013g.get(iKeyAt);
                    }
                    C1880c c1880c2 = c1880c;
                    if (c1880c2 != null) {
                        Paint paint = c1880c2.f6990b ? null : this.f7019j;
                        int i30 = i20;
                        int i31 = c1882e4.f6999e;
                        c1884g2 = c1884g;
                        int i32 = i30 + c1883f.f7005a;
                        int i33 = i29 + c1883f.f7006b;
                        int i34 = i24;
                        Paint paint2 = paint;
                        c1879b = c1879b2;
                        i11 = i22;
                        i10 = i30;
                        arrayList = arrayList2;
                        i9 = i29;
                        C1882e c1882e5 = c1882e4;
                        int[] iArr = i31 == 3 ? c1878a.f6982d : i31 == 2 ? c1878a.f6981c : c1878a.f6980b;
                        c1882e = c1882e5;
                        i12 = i28;
                        i13 = i34;
                        m3663g(c1880c2.f6991c, iArr, i31, i32, i33, paint2, canvas);
                        m3663g(c1880c2.f6992d, iArr, i31, i32, i33 + 1, paint2, canvas);
                    } else {
                        arrayList = arrayList2;
                        i9 = i29;
                        c1879b = c1879b2;
                        c1884g2 = c1884g;
                        c1882e = c1882e4;
                        i10 = i20;
                        i11 = i22;
                        i12 = i28;
                        i13 = i24;
                    }
                    i28 = i12 + 1;
                    i22 = i11;
                    i21 = i9;
                    c1882e4 = c1882e;
                    i20 = i10;
                    arrayList2 = arrayList;
                    sparseArray7 = sparseArray8;
                    c1879b2 = c1879b;
                    c1884g = c1884g2;
                    i24 = i13;
                }
                C1879b c1879b3 = c1879b2;
                ArrayList arrayList3 = arrayList2;
                C1884g c1884g3 = c1884g;
                int i35 = i21;
                C1882e c1882e6 = c1882e4;
                int i36 = i20;
                int i37 = i22;
                int i38 = i24;
                if (c1882e6.f6996b) {
                    int i39 = c1882e6.f6999e;
                    if (i39 == 3) {
                        i8 = c1878a.f6982d[c1882e6.f7001g];
                        c10 = 2;
                    } else {
                        c10 = 2;
                        i8 = i39 == 2 ? c1878a.f6981c[c1882e6.f7002h] : c1878a.f6980b[c1882e6.f7003i];
                    }
                    Paint paint3 = this.f7020k;
                    paint3.setColor(i8);
                    c8 = c10;
                    c9 = 3;
                    canvas.drawRect(i36, i35, i25, i26, paint3);
                } else {
                    c8 = 2;
                    c9 = 3;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(this.f7025p, i36, i35, i37, i38);
                float f8 = c1879b3.f6983a;
                float f9 = c1879b3.f6984b;
                arrayList3.add(new C1029b(null, null, null, bitmapCreateBitmap2, i35 / f9, 0, 0, i36 / f8, 0, Integer.MIN_VALUE, -3.4028235E38f, i37 / f8, i38 / f9, false, -16777216, Integer.MIN_VALUE, 0.0f));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                i19 = i27 + 1;
                z7 = z8;
                c1879b2 = c1879b3;
                arrayList2 = arrayList3;
                c1884g = c1884g3;
                sparseArray5 = sparseArray6;
            }
            c1585c = new C1585c(arrayList2, -9223372036854775807L, -9223372036854775807L);
        }
        interfaceC1111f.accept(c1585c);
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: h */
    public final int mo77h() {
        return 2;
    }

    @Override // p090k2.InterfaceC1599q
    public final void reset() {
        C1884g c1884g = this.f7024o;
        c1884g.f7009c.clear();
        c1884g.f7010d.clear();
        c1884g.f7011e.clear();
        c1884g.f7012f.clear();
        c1884g.f7013g.clear();
        c1884g.f7014h = null;
        c1884g.f7015i = null;
    }
}
