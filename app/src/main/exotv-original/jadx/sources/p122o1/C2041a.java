package p122o1;

import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.EOFException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import p005a4.C0087j;
import p057g2.C1037a;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p115n1.C1964a0;
import p115n1.C1986m;
import p115n1.C1992s;
import p115n1.C1998y;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: o1.a */
/* loaded from: classes.dex */
public final class C2041a implements InterfaceC1987n {

    /* renamed from: q */
    public static final int[] f7507q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r */
    public static final int[] f7508r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: s */
    public static final byte[] f7509s;

    /* renamed from: t */
    public static final byte[] f7510t;

    /* renamed from: b */
    public final C1986m f7512b;

    /* renamed from: c */
    public boolean f7513c;

    /* renamed from: d */
    public long f7514d;

    /* renamed from: e */
    public int f7515e;

    /* renamed from: f */
    public int f7516f;

    /* renamed from: h */
    public int f7518h;

    /* renamed from: i */
    public long f7519i;

    /* renamed from: j */
    public InterfaceC1989p f7520j;

    /* renamed from: k */
    public InterfaceC1980i0 f7521k;

    /* renamed from: l */
    public InterfaceC1980i0 f7522l;

    /* renamed from: m */
    public InterfaceC1968c0 f7523m;

    /* renamed from: n */
    public boolean f7524n;

    /* renamed from: o */
    public long f7525o;

    /* renamed from: p */
    public boolean f7526p;

    /* renamed from: a */
    public final byte[] f7511a = new byte[1];

    /* renamed from: g */
    public int f7517g = -1;

    static {
        int i = AbstractC1118i0.f4750a;
        Charset charset = StandardCharsets.UTF_8;
        f7509s = "#!AMR\n".getBytes(charset);
        f7510t = "#!AMR-WB\n".getBytes(charset);
    }

    public C2041a() {
        C1986m c1986m = new C1986m();
        this.f7512b = c1986m;
        this.f7522l = c1986m;
    }

    /* renamed from: a */
    public final int m3929a(InterfaceC1988o interfaceC1988o) throws C0247v0 {
        boolean z7;
        interfaceC1988o.mo3860g();
        byte[] bArr = this.f7511a;
        interfaceC1988o.mo3862i(bArr, 0, 1);
        byte b7 = bArr[0];
        if ((b7 & 131) > 0) {
            throw C0247v0.createForMalformedContainer("Invalid padding bits for frame header " + ((int) b7), null);
        }
        int i = (b7 >> 3) & 15;
        if (i >= 0 && i <= 15 && (((z7 = this.f7513c) && (i < 10 || i > 13)) || (!z7 && (i < 12 || i > 14)))) {
            return z7 ? f7508r[i] : f7507q[i];
        }
        StringBuilder sb = new StringBuilder("Illegal AMR ");
        sb.append(this.f7513c ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i);
        throw C0247v0.createForMalformedContainer(sb.toString(), null);
    }

    /* renamed from: b */
    public final boolean m3930b(InterfaceC1988o interfaceC1988o) {
        interfaceC1988o.mo3860g();
        byte[] bArr = f7509s;
        byte[] bArr2 = new byte[bArr.length];
        interfaceC1988o.mo3862i(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f7513c = false;
            interfaceC1988o.mo3861h(bArr.length);
            return true;
        }
        interfaceC1988o.mo3860g();
        byte[] bArr3 = f7510t;
        byte[] bArr4 = new byte[bArr3.length];
        interfaceC1988o.mo3862i(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f7513c = true;
        interfaceC1988o.mo3861h(bArr3.length);
        return true;
    }

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f7520j = interfaceC1989p;
        InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(0, 1);
        this.f7521k = interfaceC1980i0Track;
        this.f7522l = interfaceC1980i0Track;
        interfaceC1989p.endTracks();
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00e4 A[PHI: r4
      0x00e4: PHI (r4v1 n1.o) = (r4v0 n1.o), (r4v5 n1.o) binds: [B:50:0x00e2, B:53:0x00f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        InterfaceC1988o interfaceC1988o2;
        int iSampleData;
        AbstractC1101a.m2360k(this.f7521k);
        int i = AbstractC1118i0.f4750a;
        if (interfaceC1988o.getPosition() == 0 && !m3930b(interfaceC1988o)) {
            throw C0247v0.createForMalformedContainer("Could not find AMR header.", null);
        }
        if (!this.f7526p) {
            this.f7526p = true;
            boolean z7 = this.f7513c;
            String str = z7 ? "audio/amr-wb" : "audio/3gpp";
            int i4 = z7 ? 16000 : 8000;
            int i8 = z7 ? f7508r[8] : f7507q[7];
            InterfaceC1980i0 interfaceC1980i0 = this.f7522l;
            C0246v c0246v = new C0246v();
            c0246v.f1447m = AbstractC0244u0.m687p(str);
            c0246v.f1448n = i8;
            c0246v.f1425B = 1;
            c0246v.f1426C = i4;
            interfaceC1980i0.format(new C0249w(c0246v));
        }
        int i9 = 0;
        if (this.f7516f == 0) {
            try {
                int iM3929a = m3929a(interfaceC1988o);
                this.f7515e = iM3929a;
                this.f7516f = iM3929a;
                if (this.f7517g == -1) {
                    interfaceC1988o.getPosition();
                    this.f7517g = this.f7515e;
                }
                if (this.f7517g == this.f7515e) {
                    this.f7518h++;
                }
                InterfaceC1968c0 interfaceC1968c0 = this.f7523m;
                if (interfaceC1968c0 instanceof C1998y) {
                    C1998y c1998y = (C1998y) interfaceC1968c0;
                    long j = this.f7519i + this.f7514d + 20000;
                    long position = interfaceC1988o.getPosition() + this.f7515e;
                    C0087j c0087j = c1998y.f7407b;
                    int i10 = c0087j.f385j;
                    if (i10 == 0 || j - c0087j.m320f(i10 - 1) >= SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                        C0087j c0087j2 = c1998y.f7406a;
                        C0087j c0087j3 = c1998y.f7407b;
                        if (c0087j3.f385j == 0 && j > 0) {
                            c0087j2.m317b(0L);
                            c0087j3.m317b(0L);
                        }
                        c0087j2.m317b(position);
                        c0087j3.m317b(j);
                    }
                    if (this.f7524n && Math.abs(this.f7525o - j) < 20000) {
                        this.f7524n = false;
                        this.f7522l = this.f7521k;
                    }
                }
                interfaceC1988o2 = interfaceC1988o;
                iSampleData = this.f7522l.sampleData((InterfaceC0219m) interfaceC1988o2, this.f7516f, true);
            } catch (EOFException unused) {
                interfaceC1988o2 = interfaceC1988o;
            }
            if (iSampleData != -1) {
                i9 = -1;
            } else {
                int i11 = this.f7516f - iSampleData;
                this.f7516f = i11;
                if (i11 <= 0) {
                    this.f7522l.sampleMetadata(this.f7514d + this.f7519i, 1, this.f7515e, 0, null);
                    this.f7514d += 20000;
                }
            }
        } else {
            interfaceC1988o2 = interfaceC1988o;
            iSampleData = this.f7522l.sampleData((InterfaceC0219m) interfaceC1988o2, this.f7516f, true);
            if (iSampleData != -1) {
            }
        }
        interfaceC1988o2.getLength();
        if (this.f7523m == null) {
            C1992s c1992s = new C1992s(-9223372036854775807L);
            this.f7523m = c1992s;
            this.f7520j.seekMap(c1992s);
        }
        if (i9 == -1) {
            InterfaceC1968c0 interfaceC1968c02 = this.f7523m;
            if (interfaceC1968c02 instanceof C1998y) {
                ((C1998y) interfaceC1968c02).f7408c = this.f7519i + this.f7514d;
                this.f7520j.seekMap(interfaceC1968c02);
            }
        }
        return i9;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        this.f7514d = 0L;
        this.f7515e = 0;
        this.f7516f = 0;
        this.f7525o = j8;
        InterfaceC1968c0 interfaceC1968c0 = this.f7523m;
        if (!(interfaceC1968c0 instanceof C1998y)) {
            if (j == 0 || !(interfaceC1968c0 instanceof C1037a)) {
                this.f7519i = 0L;
                return;
            } else {
                this.f7519i = (Math.max(0L, j - ((C1037a) interfaceC1968c0).f4407b) * 8000000) / r7.f4410e;
                return;
            }
        }
        C1998y c1998y = (C1998y) interfaceC1968c0;
        C0087j c0087j = c1998y.f7407b;
        long jM320f = c0087j.f385j == 0 ? -9223372036854775807L : c0087j.m320f(AbstractC1118i0.m2438b(c1998y.f7406a, j));
        this.f7519i = jM320f;
        if (Math.abs(this.f7525o - jM320f) < 20000) {
            return;
        }
        this.f7524n = true;
        this.f7522l = this.f7512b;
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        return m3930b(interfaceC1988o);
    }
}
