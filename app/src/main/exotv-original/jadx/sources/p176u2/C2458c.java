package p176u2;

import android.util.Pair;
import androidx.media3.common.C0247v0;
import com.google.android.material.datepicker.C0758p;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p089k1.C1567k;
import p115n1.C1964a0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1987n;
import p115n1.InterfaceC1988o;
import p115n1.InterfaceC1989p;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u2.c */
/* loaded from: classes.dex */
public final class C2458c implements InterfaceC1987n {

    /* renamed from: a */
    public InterfaceC1989p f9030a;

    /* renamed from: b */
    public InterfaceC1980i0 f9031b;

    /* renamed from: e */
    public InterfaceC2457b f9034e;

    /* renamed from: c */
    public int f9032c = 0;

    /* renamed from: d */
    public long f9033d = -1;

    /* renamed from: f */
    public int f9035f = -1;

    /* renamed from: g */
    public long f9036g = -1;

    @Override // p115n1.InterfaceC1987n
    public final void init(InterfaceC1989p interfaceC1989p) {
        this.f9030a = interfaceC1989p;
        this.f9031b = interfaceC1989p.track(0, 1);
        interfaceC1989p.endTracks();
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017c, code lost:
    
        if (r13 != 65534) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
    @Override // p115n1.InterfaceC1987n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int read(InterfaceC1988o interfaceC1988o, C1964a0 c1964a0) throws C0247v0 {
        byte[] bArr;
        int i;
        AbstractC1101a.m2360k(this.f9031b);
        int i4 = AbstractC1118i0.f4750a;
        int i8 = this.f9032c;
        int iM2413D = 4;
        if (i8 == 0) {
            AbstractC1101a.m2359j(interfaceC1988o.getPosition() == 0);
            int i9 = this.f9035f;
            if (i9 != -1) {
                interfaceC1988o.mo3861h(i9);
                this.f9032c = 4;
                return 0;
            }
            if (!AbstractC2436a.m4329a(interfaceC1988o)) {
                throw C0247v0.createForMalformedContainer("Unsupported or unrecognized wav file type.", null);
            }
            interfaceC1988o.mo3861h((int) (interfaceC1988o.mo3856c() - interfaceC1988o.getPosition()));
            this.f9032c = 1;
            return 0;
        }
        long jM2524j = -1;
        if (i8 == 1) {
            C1132w c1132w = new C1132w(8);
            C2459d c2459dM4436a = C2459d.m4436a(interfaceC1988o, c1132w);
            if (c2459dM4436a.f9037a != 1685272116) {
                interfaceC1988o.mo3860g();
            } else {
                interfaceC1988o.mo3857d(8);
                c1132w.m2513G(0);
                interfaceC1988o.mo3862i(c1132w.f4799a, 0, 8);
                jM2524j = c1132w.m2524j();
                interfaceC1988o.mo3861h(((int) c2459dM4436a.f9038b) + 8);
            }
            this.f9033d = jM2524j;
            this.f9032c = 2;
            return 0;
        }
        if (i8 != 2) {
            if (i8 != 3) {
                if (i8 != 4) {
                    throw new IllegalStateException();
                }
                AbstractC1101a.m2359j(this.f9036g != -1);
                long position = this.f9036g - interfaceC1988o.getPosition();
                InterfaceC2457b interfaceC2457b = this.f9034e;
                interfaceC2457b.getClass();
                return interfaceC2457b.mo3234b(interfaceC1988o, position) ? -1 : 0;
            }
            interfaceC1988o.mo3860g();
            C2459d c2459dM4346u = AbstractC2436a.m4346u(1684108385, interfaceC1988o, new C1132w(8));
            interfaceC1988o.mo3861h(8);
            Pair pairCreate = Pair.create(Long.valueOf(interfaceC1988o.getPosition()), Long.valueOf(c2459dM4346u.f9038b));
            this.f9035f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.f9033d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.f9036g = this.f9035f + jLongValue;
            long length = interfaceC1988o.getLength();
            if (length != -1 && this.f9036g > length) {
                AbstractC1101a.m2348F("WavExtractor", "Data exceeds input length: " + this.f9036g + ", " + length);
                this.f9036g = length;
            }
            InterfaceC2457b interfaceC2457b2 = this.f9034e;
            interfaceC2457b2.getClass();
            interfaceC2457b2.mo3235c(this.f9035f, this.f9036g);
            this.f9032c = 4;
            return 0;
        }
        C1132w c1132w2 = new C1132w(16);
        long j8 = AbstractC2436a.m4346u(1718449184, interfaceC1988o, c1132w2).f9038b;
        AbstractC1101a.m2359j(j8 >= 16);
        interfaceC1988o.mo3862i(c1132w2.f4799a, 0, 16);
        c1132w2.m2513G(0);
        int iM2528n = c1132w2.m2528n();
        int iM2528n2 = c1132w2.m2528n();
        int iM2527m = c1132w2.m2527m();
        c1132w2.m2527m();
        int iM2528n3 = c1132w2.m2528n();
        int iM2528n4 = c1132w2.m2528n();
        int i10 = ((int) j8) - 16;
        if (i10 > 0) {
            bArr = new byte[i10];
            interfaceC1988o.mo3862i(bArr, 0, i10);
        } else {
            bArr = AbstractC1118i0.f4755f;
        }
        byte[] bArr2 = bArr;
        interfaceC1988o.mo3861h((int) (interfaceC1988o.mo3856c() - interfaceC1988o.getPosition()));
        C0758p c0758p = new C0758p(iM2528n, iM2528n2, iM2527m, iM2528n3, iM2528n4, bArr2);
        if (iM2528n == 17) {
            this.f9034e = new C2456a(this.f9030a, this.f9031b, c0758p);
        } else if (iM2528n == 6) {
            this.f9034e = new C1567k(this.f9030a, this.f9031b, c0758p, "audio/g711-alaw", -1);
        } else if (iM2528n == 7) {
            this.f9034e = new C1567k(this.f9030a, this.f9031b, c0758p, "audio/g711-mlaw", -1);
        } else if (iM2528n == 1) {
            iM2413D = AbstractC1118i0.m2413D(iM2528n4);
            i = iM2413D;
            if (i == 0) {
                throw C0247v0.createForUnsupportedContainerFeature("Unsupported WAV format type: " + iM2528n);
            }
            this.f9034e = new C1567k(this.f9030a, this.f9031b, c0758p, "audio/raw", i);
        } else {
            if (iM2528n == 3) {
                if (iM2528n4 == 32) {
                    i = iM2413D;
                }
                if (i == 0) {
                }
            }
            i = 0;
            if (i == 0) {
            }
        }
        this.f9032c = 3;
        return 0;
    }

    @Override // p115n1.InterfaceC1987n
    public final void release() {
    }

    @Override // p115n1.InterfaceC1987n
    public final void seek(long j, long j8) {
        this.f9032c = j == 0 ? 0 : 4;
        InterfaceC2457b interfaceC2457b = this.f9034e;
        if (interfaceC2457b != null) {
            interfaceC2457b.mo3233a(j8);
        }
    }

    @Override // p115n1.InterfaceC1987n
    public final boolean sniff(InterfaceC1988o interfaceC1988o) {
        return AbstractC2436a.m4329a(interfaceC1988o);
    }
}
