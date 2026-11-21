package p066h4;

import com.bumptech.glide.load.data.InterfaceC0730g;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import p210y3.InterfaceC2802f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.i */
/* loaded from: classes.dex */
public final class C1175i implements InterfaceC1177k, InterfaceC2802f, InterfaceC0730g {

    /* renamed from: j */
    public final /* synthetic */ int f5025j;

    /* renamed from: k */
    public final ByteBuffer f5026k;

    public C1175i(int i) {
        this.f5025j = i;
        switch (i) {
            case 2:
                this.f5026k = ByteBuffer.allocate(4);
                break;
            default:
                this.f5026k = ByteBuffer.allocate(8);
                break;
        }
    }

    @Override // p210y3.InterfaceC2802f
    /* renamed from: a */
    public void mo2589a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f5025j) {
            case 1:
                Long l8 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f5026k) {
                    this.f5026k.position(0);
                    messageDigest.update(this.f5026k.putLong(l8.longValue()).array());
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num == null) {
                    return;
                }
                messageDigest.update(bArr);
                synchronized (this.f5026k) {
                    this.f5026k.position(0);
                    messageDigest.update(this.f5026k.putInt(num.intValue()).array());
                }
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0730g
    /* renamed from: b */
    public void mo1652b() {
    }

    @Override // p066h4.InterfaceC1177k
    /* renamed from: c */
    public int mo164c() {
        return (mo168h() << 8) | mo168h();
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0730g
    /* renamed from: d */
    public Object mo1653d() {
        ByteBuffer byteBuffer = this.f5026k;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // p066h4.InterfaceC1177k
    /* renamed from: e */
    public int mo166e(byte[] bArr, int i) {
        ByteBuffer byteBuffer = this.f5026k;
        int iMin = Math.min(i, byteBuffer.remaining());
        if (iMin == 0) {
            return -1;
        }
        byteBuffer.get(bArr, 0, iMin);
        return iMin;
    }

    @Override // p066h4.InterfaceC1177k
    /* renamed from: h */
    public short mo168h() throws C1176j {
        ByteBuffer byteBuffer = this.f5026k;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new C1176j();
    }

    @Override // p066h4.InterfaceC1177k
    public long skip(long j) {
        ByteBuffer byteBuffer = this.f5026k;
        int iMin = (int) Math.min(byteBuffer.remaining(), j);
        byteBuffer.position(byteBuffer.position() + iMin);
        return iMin;
    }

    public C1175i(ByteBuffer byteBuffer, int i) {
        this.f5025j = i;
        switch (i) {
            case 3:
                this.f5026k = byteBuffer;
                break;
            default:
                this.f5026k = byteBuffer;
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
                break;
        }
    }
}
