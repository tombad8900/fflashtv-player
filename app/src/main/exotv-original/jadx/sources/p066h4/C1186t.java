package p066h4;

import android.graphics.Bitmap;
import java.security.MessageDigest;
import p015b4.InterfaceC0567a;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.t */
/* loaded from: classes.dex */
public final class C1186t extends AbstractC1170d {

    /* renamed from: b */
    public static final byte[] f5051b = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(InterfaceC2801e.f10418a);

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        messageDigest.update(f5051b);
    }

    @Override // p066h4.AbstractC1170d
    /* renamed from: c */
    public final Bitmap mo2587c(InterfaceC0567a interfaceC0567a, Bitmap bitmap, int i, int i4) {
        return AbstractC1191y.m2613b(interfaceC0567a, bitmap, i, i4);
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        return obj instanceof C1186t;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        return 1572326941;
    }
}
