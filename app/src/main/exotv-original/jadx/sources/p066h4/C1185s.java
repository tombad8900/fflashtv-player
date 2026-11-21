package p066h4;

import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;
import p015b4.C0572f;
import p073i3.C1261j;
import p178u4.AbstractC2466a;
import p207y0.C2790g;
import p210y3.InterfaceC2800d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.s */
/* loaded from: classes.dex */
public final class C1185s implements InterfaceC2800d {
    @Override // p210y3.InterfaceC2800d
    /* renamed from: a */
    public final ImageHeaderParser$ImageType mo2594a(ByteBuffer byteBuffer) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p210y3.InterfaceC2800d
    /* renamed from: b */
    public final int mo2595b(ByteBuffer byteBuffer, C0572f c0572f) {
        AtomicReference atomicReference = AbstractC2466a.f9048a;
        return mo2597d(new C1261j(byteBuffer), c0572f);
    }

    @Override // p210y3.InterfaceC2800d
    /* renamed from: c */
    public final ImageHeaderParser$ImageType mo2596c(InputStream inputStream) {
        return ImageHeaderParser$ImageType.UNKNOWN;
    }

    @Override // p210y3.InterfaceC2800d
    /* renamed from: d */
    public final int mo2597d(InputStream inputStream, C0572f c0572f) {
        int iM4879c = new C2790g(inputStream).m4879c();
        if (iM4879c == 0) {
            return -1;
        }
        return iM4879c;
    }
}
