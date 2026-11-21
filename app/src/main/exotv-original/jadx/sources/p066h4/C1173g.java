package p066h4;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import java.security.MessageDigest;
import p015b4.InterfaceC0567a;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.g */
/* loaded from: classes.dex */
public final class C1173g extends AbstractC1170d {

    /* renamed from: b */
    public static final byte[] f5023b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(InterfaceC2801e.f10418a);

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        messageDigest.update(f5023b);
    }

    @Override // p066h4.AbstractC1170d
    /* renamed from: c */
    public final Bitmap mo2587c(InterfaceC0567a interfaceC0567a, Bitmap bitmap, int i, int i4) {
        float width;
        float height;
        Paint paint = AbstractC1191y.f5066a;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i4) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i4 > bitmap.getHeight() * i) {
            width = i4 / bitmap.getHeight();
            width2 = (i - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i / bitmap.getWidth();
            height = (i4 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapMo1310k = interfaceC0567a.mo1310k(i, i4, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        bitmapMo1310k.setHasAlpha(bitmap.hasAlpha());
        AbstractC1191y.m2612a(bitmap, bitmapMo1310k, matrix);
        return bitmapMo1310k;
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        return obj instanceof C1173g;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        return -599754482;
    }
}
