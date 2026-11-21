package p066h4;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.util.Log;
import java.security.MessageDigest;
import p015b4.InterfaceC0567a;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.h */
/* loaded from: classes.dex */
public final class C1174h extends AbstractC1170d {

    /* renamed from: b */
    public static final byte[] f5024b = "com.bumptech.glide.load.resource.bitmap.CenterInside".getBytes(InterfaceC2801e.f10418a);

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        messageDigest.update(f5024b);
    }

    @Override // p066h4.AbstractC1170d
    /* renamed from: c */
    public final Bitmap mo2587c(InterfaceC0567a interfaceC0567a, Bitmap bitmap, int i, int i4) {
        Paint paint = AbstractC1191y.f5066a;
        if (bitmap.getWidth() > i || bitmap.getHeight() > i4) {
            if (Log.isLoggable("TransformationUtils", 2)) {
                Log.v("TransformationUtils", "requested target size too big for input, fit centering instead");
            }
            return AbstractC1191y.m2613b(interfaceC0567a, bitmap, i, i4);
        }
        if (Log.isLoggable("TransformationUtils", 2)) {
            Log.v("TransformationUtils", "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        return obj instanceof C1174h;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        return -670243078;
    }
}
