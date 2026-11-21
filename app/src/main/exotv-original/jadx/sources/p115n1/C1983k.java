package p115n1;

import androidx.media3.common.AbstractC0229p0;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.k */
/* loaded from: classes.dex */
public final class C1983k implements InterfaceC1988o {

    /* renamed from: k */
    public final InterfaceC0219m f7356k;

    /* renamed from: l */
    public final long f7357l;

    /* renamed from: m */
    public long f7358m;

    /* renamed from: o */
    public int f7360o;

    /* renamed from: p */
    public int f7361p;

    /* renamed from: n */
    public byte[] f7359n = new byte[65536];

    /* renamed from: j */
    public final byte[] f7355j = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED];

    static {
        AbstractC0229p0.m658a("media3.extractor");
    }

    public C1983k(InterfaceC0219m interfaceC0219m, long j, long j8) {
        this.f7356k = interfaceC0219m;
        this.f7358m = j;
        this.f7357l = j8;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: a */
    public final boolean mo3854a(byte[] bArr, int i, int i4, boolean z7) throws EOFException, InterruptedIOException {
        int iMin;
        int i8 = this.f7361p;
        if (i8 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i8, i4);
            System.arraycopy(this.f7359n, 0, bArr, i, iMin);
            m3866m(iMin);
        }
        int iM3865l = iMin;
        while (iM3865l < i4 && iM3865l != -1) {
            iM3865l = m3865l(bArr, i, i4, iM3865l, z7);
        }
        if (iM3865l != -1) {
            this.f7358m += iM3865l;
        }
        return iM3865l != -1;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: b */
    public final boolean mo3855b(byte[] bArr, int i, int i4, boolean z7) {
        if (!m3863j(i4, z7)) {
            return false;
        }
        System.arraycopy(this.f7359n, this.f7360o - i4, bArr, i, i4);
        return true;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: c */
    public final long mo3856c() {
        return this.f7358m + this.f7360o;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: d */
    public final void mo3857d(int i) throws EOFException, InterruptedIOException {
        m3863j(i, false);
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: e */
    public final int mo3858e(int i) throws EOFException, InterruptedIOException {
        C1983k c1983k;
        int iMin = Math.min(this.f7361p, i);
        m3866m(iMin);
        if (iMin == 0) {
            byte[] bArr = this.f7355j;
            c1983k = this;
            iMin = c1983k.m3865l(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            c1983k = this;
        }
        if (iMin != -1) {
            c1983k.f7358m += iMin;
        }
        return iMin;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: f */
    public final int mo3859f(byte[] bArr, int i, int i4) throws EOFException, InterruptedIOException {
        C1983k c1983k;
        int iMin;
        m3864k(i4);
        int i8 = this.f7361p;
        int i9 = this.f7360o;
        int i10 = i8 - i9;
        if (i10 == 0) {
            c1983k = this;
            iMin = c1983k.m3865l(this.f7359n, i9, i4, 0, true);
            if (iMin == -1) {
                return -1;
            }
            c1983k.f7361p += iMin;
        } else {
            c1983k = this;
            iMin = Math.min(i4, i10);
        }
        System.arraycopy(c1983k.f7359n, c1983k.f7360o, bArr, i, iMin);
        c1983k.f7360o += iMin;
        return iMin;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: g */
    public final void mo3860g() {
        this.f7360o = 0;
    }

    @Override // p115n1.InterfaceC1988o
    public final long getLength() {
        return this.f7357l;
    }

    @Override // p115n1.InterfaceC1988o
    public final long getPosition() {
        return this.f7358m;
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: h */
    public final void mo3861h(int i) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f7361p, i);
        m3866m(iMin);
        int iM3865l = iMin;
        while (iM3865l < i && iM3865l != -1) {
            byte[] bArr = this.f7355j;
            iM3865l = m3865l(bArr, -iM3865l, Math.min(i, bArr.length + iM3865l), iM3865l, false);
        }
        if (iM3865l != -1) {
            this.f7358m += iM3865l;
        }
    }

    @Override // p115n1.InterfaceC1988o
    /* renamed from: i */
    public final void mo3862i(byte[] bArr, int i, int i4) {
        mo3855b(bArr, i, i4, false);
    }

    /* renamed from: j */
    public final boolean m3863j(int i, boolean z7) throws EOFException, InterruptedIOException {
        m3864k(i);
        int iM3865l = this.f7361p - this.f7360o;
        while (iM3865l < i) {
            int i4 = i;
            boolean z8 = z7;
            iM3865l = m3865l(this.f7359n, this.f7360o, i4, iM3865l, z8);
            if (iM3865l == -1) {
                return false;
            }
            this.f7361p = this.f7360o + iM3865l;
            i = i4;
            z7 = z8;
        }
        this.f7360o += i;
        return true;
    }

    /* renamed from: k */
    public final void m3864k(int i) {
        int i4 = this.f7360o + i;
        byte[] bArr = this.f7359n;
        if (i4 > bArr.length) {
            this.f7359n = Arrays.copyOf(this.f7359n, AbstractC1118i0.m2451j(bArr.length * 2, 65536 + i4, i4 + 524288));
        }
    }

    /* renamed from: l */
    public final int m3865l(byte[] bArr, int i, int i4, int i8, boolean z7) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i9 = this.f7356k.read(bArr, i + i8, i4 - i8);
        if (i9 != -1) {
            return i8 + i9;
        }
        if (i8 == 0 && z7) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: m */
    public final void m3866m(int i) {
        int i4 = this.f7361p - i;
        this.f7361p = i4;
        this.f7360o = 0;
        byte[] bArr = this.f7359n;
        byte[] bArr2 = i4 < bArr.length - 524288 ? new byte[65536 + i4] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i4);
        this.f7359n = bArr2;
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) throws EOFException, InterruptedIOException {
        C1983k c1983k;
        int i8 = this.f7361p;
        int iM3865l = 0;
        if (i8 != 0) {
            int iMin = Math.min(i8, i4);
            System.arraycopy(this.f7359n, 0, bArr, i, iMin);
            m3866m(iMin);
            iM3865l = iMin;
        }
        if (iM3865l == 0) {
            c1983k = this;
            iM3865l = c1983k.m3865l(bArr, i, i4, 0, true);
        } else {
            c1983k = this;
        }
        if (iM3865l != -1) {
            c1983k.f7358m += iM3865l;
        }
        return iM3865l;
    }

    @Override // p115n1.InterfaceC1988o
    public final void readFully(byte[] bArr, int i, int i4) throws EOFException, InterruptedIOException {
        mo3854a(bArr, i, i4, false);
    }
}
