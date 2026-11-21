package p072i2;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.io.EOFException;
import java.io.IOException;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1988o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i2.b */
/* loaded from: classes.dex */
public final class C1242b implements InterfaceC1247g {

    /* renamed from: j */
    public final C1246f f5183j;

    /* renamed from: k */
    public final long f5184k;

    /* renamed from: l */
    public final long f5185l;

    /* renamed from: m */
    public final AbstractC1249i f5186m;

    /* renamed from: n */
    public int f5187n;

    /* renamed from: o */
    public long f5188o;

    /* renamed from: p */
    public long f5189p;

    /* renamed from: q */
    public long f5190q;

    /* renamed from: r */
    public long f5191r;

    /* renamed from: s */
    public long f5192s;

    /* renamed from: t */
    public long f5193t;

    /* renamed from: u */
    public long f5194u;

    public C1242b(AbstractC1249i abstractC1249i, long j, long j8, long j9, long j10, boolean z7) {
        AbstractC1101a.m2353d(j >= 0 && j8 > j);
        this.f5186m = abstractC1249i;
        this.f5184k = j;
        this.f5185l = j8;
        if (j9 == j8 - j || z7) {
            this.f5188o = j10;
            this.f5187n = 4;
        } else {
            this.f5187n = 0;
        }
        this.f5183j = new C1246f();
    }

    @Override // p072i2.InterfaceC1247g
    /* renamed from: j */
    public final InterfaceC1968c0 mo2543j() {
        if (this.f5188o != 0) {
            return new C1241a(this);
        }
        return null;
    }

    @Override // p072i2.InterfaceC1247g
    /* renamed from: n */
    public final void mo2544n(long j) {
        this.f5190q = AbstractC1118i0.m2452k(j, 0L, this.f5188o - 1);
        this.f5187n = 2;
        this.f5191r = this.f5184k;
        this.f5192s = this.f5185l;
        this.f5193t = 0L;
        this.f5194u = this.f5188o;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    @Override // p072i2.InterfaceC1247g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long read(InterfaceC1988o interfaceC1988o) throws IOException {
        long j;
        long j8;
        long jM2452k;
        int i = this.f5187n;
        long j9 = this.f5185l;
        C1246f c1246f = this.f5183j;
        if (i == 0) {
            j = 0;
            long position = interfaceC1988o.getPosition();
            this.f5189p = position;
            this.f5187n = 1;
            long j10 = j9 - 65307;
            if (j10 > position) {
                return j10;
            }
        } else if (i != 1) {
            if (i == 2) {
                if (this.f5191r == this.f5192s) {
                    jM2452k = -1;
                } else {
                    long position2 = interfaceC1988o.getPosition();
                    if (c1246f.m2721b(interfaceC1988o, this.f5192s)) {
                        c1246f.m2720a(interfaceC1988o, false);
                        interfaceC1988o.mo3860g();
                        long j11 = this.f5190q;
                        long j12 = c1246f.f5206b;
                        long j13 = j11 - j12;
                        j8 = 2;
                        int i4 = c1246f.f5208d + c1246f.f5209e;
                        if (0 > j13 || j13 >= 72000) {
                            if (j13 < 0) {
                                this.f5192s = position2;
                                this.f5194u = j12;
                            } else {
                                this.f5191r = interfaceC1988o.getPosition() + i4;
                                this.f5193t = c1246f.f5206b;
                            }
                            long j14 = this.f5192s;
                            long j15 = this.f5191r;
                            if (j14 - j15 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.f5192s = j15;
                                jM2452k = j15;
                            } else {
                                long position3 = interfaceC1988o.getPosition() - (i4 * (j13 <= 0 ? 2L : 1L));
                                long j16 = this.f5192s;
                                long j17 = this.f5191r;
                                jM2452k = AbstractC1118i0.m2452k((((j16 - j17) * j13) / (this.f5194u - this.f5193t)) + position3, j17, j16 - 1);
                            }
                        } else {
                            jM2452k = -1;
                        }
                        if (jM2452k == -1) {
                            return jM2452k;
                        }
                        this.f5187n = 3;
                    } else {
                        jM2452k = this.f5191r;
                        if (jM2452k == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j8 = 2;
                if (jM2452k == -1) {
                }
            } else {
                if (i != 3) {
                    if (i == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j8 = 2;
            }
            while (true) {
                c1246f.m2721b(interfaceC1988o, -1L);
                c1246f.m2720a(interfaceC1988o, false);
                if (c1246f.f5206b > this.f5190q) {
                    interfaceC1988o.mo3860g();
                    this.f5187n = 4;
                    return -(this.f5193t + j8);
                }
                interfaceC1988o.mo3861h(c1246f.f5208d + c1246f.f5209e);
                this.f5191r = interfaceC1988o.getPosition();
                this.f5193t = c1246f.f5206b;
            }
        } else {
            j = 0;
        }
        c1246f.f5205a = 0;
        c1246f.f5206b = j;
        c1246f.f5207c = 0;
        c1246f.f5208d = 0;
        c1246f.f5209e = 0;
        if (!c1246f.m2721b(interfaceC1988o, -1L)) {
            throw new EOFException();
        }
        c1246f.m2720a(interfaceC1988o, false);
        interfaceC1988o.mo3861h(c1246f.f5208d + c1246f.f5209e);
        long j18 = c1246f.f5206b;
        while ((c1246f.f5205a & 4) != 4 && c1246f.m2721b(interfaceC1988o, -1L) && interfaceC1988o.getPosition() < j9 && c1246f.m2720a(interfaceC1988o, true)) {
            try {
                interfaceC1988o.mo3861h(c1246f.f5208d + c1246f.f5209e);
                j18 = c1246f.f5206b;
            } catch (EOFException unused) {
            }
        }
        this.f5188o = j18;
        this.f5187n = 4;
        return this.f5189p;
    }
}
