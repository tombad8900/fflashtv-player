package p109m4;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p005a4.InterfaceC0080f0;
import p051f5.C0945b;
import p066h4.C1192z;
import p100l4.C1674b;
import p100l4.C1678f;
import p178u4.AbstractC2466a;
import p210y3.C2804h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m4.d */
/* loaded from: classes.dex */
public final class C1899d implements InterfaceC1896a {

    /* renamed from: k */
    public static final C1899d f7108k = new C1899d(0);

    /* renamed from: j */
    public final /* synthetic */ int f7109j;

    public /* synthetic */ C1899d(int i) {
        this.f7109j = i;
    }

    @Override // p109m4.InterfaceC1896a
    /* renamed from: d */
    public final InterfaceC0080f0 mo282d(InterfaceC0080f0 interfaceC0080f0, C2804h c2804h) {
        byte[] bArrArray;
        switch (this.f7109j) {
            case 0:
                return interfaceC0080f0;
            default:
                ByteBuffer byteBufferAsReadOnlyBuffer = ((C1678f) ((C1674b) interfaceC0080f0.get()).f6419j.f3812b).f6437a.f10188d.asReadOnlyBuffer();
                AtomicReference atomicReference = AbstractC2466a.f9048a;
                C0945b c0945b = (byteBufferAsReadOnlyBuffer.isReadOnly() || !byteBufferAsReadOnlyBuffer.hasArray()) ? null : new C0945b(byteBufferAsReadOnlyBuffer.array(), byteBufferAsReadOnlyBuffer.arrayOffset(), byteBufferAsReadOnlyBuffer.limit());
                if (c0945b != null && c0945b.f4152j == 0 && c0945b.f4153k == ((byte[]) c0945b.f4154l).length) {
                    bArrArray = byteBufferAsReadOnlyBuffer.array();
                } else {
                    ByteBuffer byteBufferAsReadOnlyBuffer2 = byteBufferAsReadOnlyBuffer.asReadOnlyBuffer();
                    byte[] bArr = new byte[byteBufferAsReadOnlyBuffer2.limit()];
                    byteBufferAsReadOnlyBuffer2.get(bArr);
                    bArrArray = bArr;
                }
                return new C1192z(bArrArray);
        }
    }
}
