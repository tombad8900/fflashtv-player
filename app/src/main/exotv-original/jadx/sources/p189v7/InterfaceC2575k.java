package p189v7;

import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.k */
/* loaded from: classes.dex */
public interface InterfaceC2575k extends InterfaceC2572i0, WritableByteChannel {
    /* renamed from: a */
    C2573j mo4596a();

    /* renamed from: e */
    InterfaceC2575k mo4597e();

    /* renamed from: f */
    long mo4598f(InterfaceC2576k0 interfaceC2576k0);

    @Override // p189v7.InterfaceC2572i0, java.io.Flushable
    void flush();

    /* renamed from: l */
    InterfaceC2575k mo4599l();

    /* renamed from: o */
    InterfaceC2575k mo4600o(String str);

    /* renamed from: r */
    InterfaceC2575k mo4601r(long j);

    /* renamed from: w */
    InterfaceC2575k mo4602w(C2579m c2579m);

    InterfaceC2575k write(byte[] bArr);

    InterfaceC2575k write(byte[] bArr, int i, int i4);

    InterfaceC2575k writeByte(int i);

    InterfaceC2575k writeInt(int i);

    InterfaceC2575k writeShort(int i);

    /* renamed from: z */
    InterfaceC2575k mo4603z(long j);
}
