package p176u2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import com.google.android.material.datepicker.C0758p;
import java.math.RoundingMode;
import okhttp3.internal.http.C2114m;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u2.a */
/* loaded from: classes.dex */
public final class C2456a implements InterfaceC2457b {

    /* renamed from: m */
    public static final int[] f9016m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};

    /* renamed from: n */
    public static final int[] f9017n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, C2114m.HTTP_TEMP_REDIRECT, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

    /* renamed from: a */
    public final InterfaceC1989p f9018a;

    /* renamed from: b */
    public final InterfaceC1980i0 f9019b;

    /* renamed from: c */
    public final C0758p f9020c;

    /* renamed from: d */
    public final int f9021d;

    /* renamed from: e */
    public final byte[] f9022e;

    /* renamed from: f */
    public final C1132w f9023f;

    /* renamed from: g */
    public final int f9024g;

    /* renamed from: h */
    public final C0249w f9025h;

    /* renamed from: i */
    public int f9026i;

    /* renamed from: j */
    public long f9027j;

    /* renamed from: k */
    public int f9028k;

    /* renamed from: l */
    public long f9029l;

    public C2456a(InterfaceC1989p interfaceC1989p, InterfaceC1980i0 interfaceC1980i0, C0758p c0758p) throws C0247v0 {
        this.f9018a = interfaceC1989p;
        this.f9019b = interfaceC1980i0;
        this.f9020c = c0758p;
        int i = c0758p.f3276k;
        int iMax = Math.max(1, i / 10);
        this.f9024g = iMax;
        C1132w c1132w = new C1132w((byte[]) c0758p.f3279n);
        c1132w.m2528n();
        int iM2528n = c1132w.m2528n();
        this.f9021d = iM2528n;
        int i4 = c0758p.f3275j;
        int i8 = c0758p.f3277l;
        int i9 = (((i8 - (i4 * 4)) * 8) / (c0758p.f3278m * i4)) + 1;
        if (iM2528n != i9) {
            throw C0247v0.createForMalformedContainer("Expected frames per block: " + i9 + "; got: " + iM2528n, null);
        }
        int iM2446f = AbstractC1118i0.m2446f(iMax, iM2528n);
        this.f9022e = new byte[iM2446f * i8];
        this.f9023f = new C1132w(iM2528n * 2 * i4 * iM2446f);
        int i10 = ((i8 * i) * 8) / iM2528n;
        C0246v c0246v = new C0246v();
        c0246v.f1447m = AbstractC0244u0.m687p("audio/raw");
        c0246v.f1442h = i10;
        c0246v.f1443i = i10;
        c0246v.f1448n = iMax * 2 * i4;
        c0246v.f1425B = i4;
        c0246v.f1426C = i;
        c0246v.f1427D = 2;
        this.f9025h = new C0249w(c0246v);
    }

    @Override // p176u2.InterfaceC2457b
    /* renamed from: a */
    public final void mo3233a(long j) {
        this.f9026i = 0;
        this.f9027j = j;
        this.f9028k = 0;
        this.f9029l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
    @Override // p176u2.InterfaceC2457b
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo3234b(p115n1.InterfaceC1988o r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p176u2.C2456a.mo3234b(n1.o, long):boolean");
    }

    @Override // p176u2.InterfaceC2457b
    /* renamed from: c */
    public final void mo3235c(int i, long j) {
        this.f9018a.seekMap(new C2460e(this.f9020c, this.f9021d, i, j));
        this.f9019b.format(this.f9025h);
    }

    /* renamed from: d */
    public final void m4435d(int i) {
        long j = this.f9027j;
        long j8 = this.f9029l;
        C0758p c0758p = this.f9020c;
        long j9 = c0758p.f3276k;
        int i4 = AbstractC1118i0.f4750a;
        long jM2437a0 = j + AbstractC1118i0.m2437a0(j8, 1000000L, j9, RoundingMode.DOWN);
        int i8 = i * 2 * c0758p.f3275j;
        this.f9019b.sampleMetadata(jM2437a0, 1, i8, this.f9028k - i8, null);
        this.f9029l += i;
        this.f9028k -= i8;
    }
}
