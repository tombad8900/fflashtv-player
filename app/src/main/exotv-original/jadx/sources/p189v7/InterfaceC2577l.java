package p189v7;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.l */
/* loaded from: classes.dex */
public interface InterfaceC2577l extends InterfaceC2576k0, ReadableByteChannel {
    /* renamed from: A */
    void mo4604A(C2573j c2573j, long j);

    /* renamed from: B */
    long mo4605B();

    /* renamed from: C */
    InputStream mo4606C();

    /* renamed from: a */
    C2573j mo4607a();

    /* renamed from: d */
    C2579m mo4610d(long j);

    /* renamed from: h */
    int mo4612h(C2595z c2595z);

    /* renamed from: i */
    byte[] mo4613i();

    /* renamed from: j */
    boolean mo4614j();

    /* renamed from: m */
    long mo4616m();

    /* renamed from: n */
    String mo4617n(long j);

    C2564e0 peek();

    /* renamed from: q */
    String mo4619q(Charset charset);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    /* renamed from: s */
    C2579m mo4620s();

    void skip(long j);

    /* renamed from: u */
    long mo4621u(C2562d0 c2562d0);

    /* renamed from: v */
    String mo4622v();

    /* renamed from: y */
    void mo4623y(long j);
}
