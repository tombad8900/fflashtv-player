package p089k1;

import android.net.Uri;
import androidx.media3.common.C0253x0;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k1.e0 */
/* loaded from: classes.dex */
public final class C1561e0 extends AbstractC1556c {

    /* renamed from: n */
    public final int f5967n;

    /* renamed from: o */
    public final byte[] f5968o;

    /* renamed from: p */
    public final DatagramPacket f5969p;

    /* renamed from: q */
    public Uri f5970q;

    /* renamed from: r */
    public DatagramSocket f5971r;

    /* renamed from: s */
    public MulticastSocket f5972s;

    /* renamed from: t */
    public InetAddress f5973t;

    /* renamed from: u */
    public boolean f5974u;

    /* renamed from: v */
    public int f5975v;

    public C1561e0() {
        super(true);
        this.f5967n = 8000;
        byte[] bArr = new byte[2000];
        this.f5968o = bArr;
        this.f5969p = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // p089k1.InterfaceC1564h
    public final void close() throws IOException {
        this.f5970q = null;
        MulticastSocket multicastSocket = this.f5972s;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f5973t;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f5972s = null;
        }
        DatagramSocket datagramSocket = this.f5971r;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f5971r = null;
        }
        this.f5973t = null;
        this.f5975v = 0;
        if (this.f5974u) {
            this.f5974u = false;
            m3229k();
        }
    }

    @Override // p089k1.InterfaceC1564h
    public final Uri getUri() {
        return this.f5970q;
    }

    @Override // p089k1.InterfaceC1564h
    public final long open(C1568l c1568l) throws IOException {
        Uri uri = c1568l.f5996a;
        this.f5970q = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f5970q.getPort();
        m3230l(c1568l);
        try {
            this.f5973t = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f5973t, port);
            if (this.f5973t.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f5972s = multicastSocket;
                multicastSocket.joinGroup(this.f5973t);
                this.f5971r = this.f5972s;
            } else {
                this.f5971r = new DatagramSocket(inetSocketAddress);
            }
            this.f5971r.setSoTimeout(this.f5967n);
            this.f5974u = true;
            m3231m(c1568l);
            return -1L;
        } catch (IOException e) {
            throw new C1559d0(e, C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
        } catch (SecurityException e8) {
            throw new C1559d0(e8, C0253x0.ERROR_CODE_IO_NO_PERMISSION);
        }
    }

    @Override // androidx.media3.common.InterfaceC0219m
    public final int read(byte[] bArr, int i, int i4) throws IOException {
        if (i4 == 0) {
            return 0;
        }
        int i8 = this.f5975v;
        DatagramPacket datagramPacket = this.f5969p;
        if (i8 == 0) {
            try {
                DatagramSocket datagramSocket = this.f5971r;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f5975v = length;
                m3228j(length);
            } catch (SocketTimeoutException e) {
                throw new C1559d0(e, C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_TIMEOUT);
            } catch (IOException e8) {
                throw new C1559d0(e8, C0253x0.ERROR_CODE_IO_NETWORK_CONNECTION_FAILED);
            }
        }
        int length2 = datagramPacket.getLength();
        int i9 = this.f5975v;
        int iMin = Math.min(i9, i4);
        System.arraycopy(this.f5968o, length2 - i9, bArr, i, iMin);
        this.f5975v -= iMin;
        return iMin;
    }
}
