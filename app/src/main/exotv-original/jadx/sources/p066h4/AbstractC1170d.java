package p066h4;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import p005a4.InterfaceC0080f0;
import p015b4.InterfaceC0567a;
import p178u4.AbstractC2478m;
import p210y3.InterfaceC2808l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.d */
/* loaded from: classes.dex */
public abstract class AbstractC1170d implements InterfaceC2808l {
    @Override // p210y3.InterfaceC2808l
    /* renamed from: b */
    public final InterfaceC0080f0 mo2242b(Context context, InterfaceC0080f0 interfaceC0080f0, int i, int i4) {
        if (!AbstractC2478m.m4461i(i, i4)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i4 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        InterfaceC0567a interfaceC0567a = ComponentCallbacks2C0713b.m1484a(context).f2774j;
        Bitmap bitmap = (Bitmap) interfaceC0080f0.get();
        if (i == Integer.MIN_VALUE) {
            i = bitmap.getWidth();
        }
        if (i4 == Integer.MIN_VALUE) {
            i4 = bitmap.getHeight();
        }
        Bitmap bitmapMo2587c = mo2587c(interfaceC0567a, bitmap, i, i4);
        return bitmap.equals(bitmapMo2587c) ? interfaceC0080f0 : C1168c.m2585e(bitmapMo2587c, interfaceC0567a);
    }

    /* renamed from: c */
    public abstract Bitmap mo2587c(InterfaceC0567a interfaceC0567a, Bitmap bitmap, int i, int i4);
}
