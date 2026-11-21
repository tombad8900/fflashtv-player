package p090k2;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.source.preload.C0456a;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p115n1.C1964a0;
import p115n1.C1998y;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k2.l */
/* loaded from: classes.dex */
public final class C1594l implements InterfaceC1987n {

    /* renamed from: a */
    public final InterfaceC1599q f6064a;

    /* renamed from: b */
    public final C0249w f6065b;

    /* renamed from: c */
    public final ArrayList f6066c;

    /* renamed from: f */
    public InterfaceC1980i0 f6069f;

    /* renamed from: g */
    public int f6070g;

    /* renamed from: h */
    public int f6071h;

    /* renamed from: i */
    public long[] f6072i;

    /* renamed from: j */
    public long f6073j;

    /* renamed from: e */
    public byte[] f6068e = AbstractC1118i0.f4755f;

    /* renamed from: d */
    public final C1132w f6067d = new C1132w();

    public C1594l(InterfaceC1599q interfaceC1599q, C0249w c0249w) {
        this.f6064a = interfaceC1599q;
        C0246v c0246vM692a = c0249w.m692a();
        c0246vM692a.f1447m = AbstractC0244u0.m687p("application/x-media3-cues");
        c0246vM692a.f1444j = c0249w.f1522n;
        c0246vM692a.f1431H = interfaceC1599q.mo77h();
        this.f6065b = new C0249w(c0246vM692a);
        this.f6066c = new ArrayList();
        this.f6071h = 0;
        this.f6072i = AbstractC1118i0.f4756g;
        this.f6073j = -9223372036854775807L;
    }

    /* renamed from: a */
    public final void m3263a(C1593k c1593k) {
        AbstractC1101a.m2360k(this.f6069f);
        byte[] bArr = c1593k.f6063k;
        int length = bArr.length;
        C1132w c1132w = this.f6067d;
        c1132w.getClass();
        c1132w.m2511E(bArr, bArr.length);
        this.f6069f.sampleData(c1132w, length);
        this.f6069f.sampleMetadata(c1593k.f6062j, 1, length, 0, null);
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        AbstractC1101a.m2359j(this.f6071h == 0);
        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(0, 3);
        this.f6069f = interfaceC1980i0Track;
        interfaceC1980i0Track.format(this.f6065b);
        interfaceC1989p.endTracks();
        interfaceC1989p.seekMap(new C1998y(-9223372036854775807L, new long[]{0}, new long[]{0}));
        this.f6071h = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
      0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        int i;
        int i4 = this.f6071h;
        AbstractC1101a.m2359j((i4 == 0 || i4 == 5) ? false : true);
        if (this.f6071h == 1) {
            int iM1566m = interfaceC1988o.getLength() != -1 ? AbstractC0715d.m1566m(interfaceC1988o.getLength()) : 1024;
            if (iM1566m > this.f6068e.length) {
                this.f6068e = new byte[iM1566m];
            }
            this.f6070g = 0;
            this.f6071h = 2;
        }
        int i8 = this.f6071h;
        ArrayList arrayList = this.f6066c;
        if (i8 == 2) {
            byte[] bArr = this.f6068e;
            if (bArr.length == this.f6070g) {
                this.f6068e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.f6068e;
            int i9 = this.f6070g;
            int i10 = interfaceC1988o.read(bArr2, i9, bArr2.length - i9);
            if (i10 != -1) {
                this.f6070g += i10;
            }
            long length = interfaceC1988o.getLength();
            if (length != -1) {
                i = 0;
                if (this.f6070g == length) {
                    try {
                        long j = this.f6073j;
                        this.f6064a.mo75f(this.f6068e, 0, this.f6070g, j != -9223372036854775807L ? new C1598p(j, true) : C1598p.f6078c, new C0456a(7, this));
                        Collections.sort(arrayList);
                        this.f6072i = new long[arrayList.size()];
                        for (int i11 = i; i11 < arrayList.size(); i11++) {
                            this.f6072i[i11] = ((C1593k) arrayList.get(i11)).f6062j;
                        }
                        this.f6068e = AbstractC1118i0.f4755f;
                        this.f6071h = 4;
                    } catch (RuntimeException e) {
                        throw C0247v0.createForMalformedContainer("SubtitleParser failed.", e);
                    }
                }
            } else {
                i = 0;
            }
            if (i10 == -1) {
            }
        } else {
            i = 0;
        }
        if (this.f6071h == 3) {
            if (interfaceC1988o.mo3858e(interfaceC1988o.getLength() != -1 ? AbstractC0715d.m1566m(interfaceC1988o.getLength()) : 1024) == -1) {
                long j8 = this.f6073j;
                for (int iM2444e = j8 == -9223372036854775807L ? i : AbstractC1118i0.m2444e(this.f6072i, j8, true); iM2444e < arrayList.size(); iM2444e++) {
                    m3263a((C1593k) arrayList.get(iM2444e));
                }
                this.f6071h = 4;
            }
        }
        if (this.f6071h == 4) {
            return -1;
        }
        return i;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
        if (this.f6071h == 5) {
            return;
        }
        this.f6064a.reset();
        this.f6071h = 5;
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        int i = this.f6071h;
        AbstractC1101a.m2359j((i == 0 || i == 5) ? false : true);
        this.f6073j = j8;
        if (this.f6071h == 2) {
            this.f6071h = 1;
        }
        if (this.f6071h == 4) {
            this.f6071h = 3;
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        return true;
    }
}
