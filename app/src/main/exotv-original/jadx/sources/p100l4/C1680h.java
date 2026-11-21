package p100l4;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import p005a4.InterfaceC0080f0;
import p015b4.C0572f;
import p171t5.AbstractC2436a;
import p210y3.C2804h;
import p210y3.InterfaceC2806j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l4.h */
/* loaded from: classes.dex */
public final class C1680h implements InterfaceC2806j {

    /* renamed from: a */
    public final ArrayList f6455a;

    /* renamed from: b */
    public final C1673a f6456b;

    /* renamed from: c */
    public final C0572f f6457c;

    public C1680h(ArrayList arrayList, C1673a c1673a, C0572f c0572f) {
        this.f6455a = arrayList;
        this.f6456b = c1673a;
        this.f6457c = c0572f;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: a */
    public final boolean mo2583a(Object obj, C2804h c2804h) {
        return !((Boolean) c2804h.m4908c(AbstractC1679g.f6454b)).booleanValue() && AbstractC2436a.m4335j(this.f6455a, (InputStream) obj, this.f6457c) == ImageHeaderParser$ImageType.GIF;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: b */
    public final InterfaceC0080f0 mo2584b(Object obj, int i, int i4, C2804h c2804h) throws IOException {
        byte[] byteArray;
        InputStream inputStream = (InputStream) obj;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i8 = inputStream.read(bArr);
                if (i8 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i8);
            }
            byteArrayOutputStream.flush();
            byteArray = byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            if (Log.isLoggable("StreamGifDecoder", 5)) {
                Log.w("StreamGifDecoder", "Error reading data from stream", e);
            }
            byteArray = null;
        }
        if (byteArray == null) {
            return null;
        }
        return this.f6456b.mo2584b(ByteBuffer.wrap(byteArray), i, i4, c2804h);
    }
}
