package p066h4;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p005a4.InterfaceC0080f0;
import p057g2.C1040d;
import p058g4.C1047b;
import p178u4.AbstractC2466a;
import p210y3.C2804h;
import p210y3.InterfaceC2806j;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.f */
/* loaded from: classes.dex */
public final class C1172f implements InterfaceC2806j {

    /* renamed from: a */
    public final /* synthetic */ int f5021a;

    /* renamed from: b */
    public final Object f5022b;

    public C1172f(int i) {
        this.f5021a = i;
        switch (i) {
            case 1:
                this.f5022b = new C1172f(2);
                break;
            case 2:
                this.f5022b = new C2819f(10);
                break;
            default:
                this.f5022b = new C1172f(2);
                break;
        }
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2583a(Object obj, C2804h c2804h) {
        switch (this.f5021a) {
            case 0:
                break;
            case 1:
                break;
            default:
                C1040d.m2233d(obj);
                break;
        }
        return true;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: b */
    public final InterfaceC0080f0 mo2584b(Object obj, int i, int i4, C2804h c2804h) {
        switch (this.f5021a) {
            case 0:
                return ((C1172f) this.f5022b).m2588c(ImageDecoder.createSource((ByteBuffer) obj), i, i4, c2804h);
            case 1:
                return ((C1172f) this.f5022b).m2588c(ImageDecoder.createSource(AbstractC2466a.m4440b((InputStream) obj)), i, i4, c2804h);
            default:
                return m2588c(C1040d.m2233d(obj), i, i4, c2804h);
        }
    }

    /* renamed from: c */
    public C1168c m2588c(ImageDecoder.Source source, int i, int i4, C2804h c2804h) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new C1047b(i, i4, c2804h));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            Log.v("BitmapImageDecoder", "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i4 + "]");
        }
        return new C1168c(bitmapDecodeBitmap, (C2819f) this.f5022b);
    }
}
