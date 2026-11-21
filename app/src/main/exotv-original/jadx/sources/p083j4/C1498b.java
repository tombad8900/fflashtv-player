package p083j4;

import android.graphics.ImageDecoder;
import android.os.Build;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p005a4.InterfaceC0080f0;
import p171t5.AbstractC2436a;
import p178u4.AbstractC2466a;
import p210y3.C2804h;
import p210y3.InterfaceC2806j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j4.b */
/* loaded from: classes.dex */
public final class C1498b implements InterfaceC2806j {

    /* renamed from: a */
    public final /* synthetic */ int f5763a;

    /* renamed from: b */
    public final C1499c f5764b;

    public /* synthetic */ C1498b(C1499c c1499c, int i) {
        this.f5763a = i;
        this.f5764b = c1499c;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: a */
    public final boolean mo2583a(Object obj, C2804h c2804h) throws IOException {
        switch (this.f5763a) {
            case 0:
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM4336k = AbstractC2436a.m4336k(this.f5764b.f5765a, (ByteBuffer) obj);
                if (imageHeaderParser$ImageTypeM4336k == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM4336k == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
            default:
                C1499c c1499c = this.f5764b;
                ImageHeaderParser$ImageType imageHeaderParser$ImageTypeM4335j = AbstractC2436a.m4335j(c1499c.f5765a, (InputStream) obj, c1499c.f5766b);
                if (imageHeaderParser$ImageTypeM4335j == ImageHeaderParser$ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageHeaderParser$ImageTypeM4335j == ImageHeaderParser$ImageType.ANIMATED_AVIF)) {
                }
                break;
        }
        return true;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: b */
    public final InterfaceC0080f0 mo2584b(Object obj, int i, int i4, C2804h c2804h) {
        switch (this.f5763a) {
            case 0:
                return C1499c.m3177a(ImageDecoder.createSource((ByteBuffer) obj), i, i4, c2804h);
            default:
                return C1499c.m3177a(ImageDecoder.createSource(AbstractC2466a.m4440b((InputStream) obj)), i, i4, c2804h);
        }
    }
}
