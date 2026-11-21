package p100l4;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import java.security.MessageDigest;
import p005a4.InterfaceC0080f0;
import p066h4.C1168c;
import p178u4.AbstractC2470e;
import p210y3.InterfaceC2808l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l4.c */
/* loaded from: classes.dex */
public final class C1675c implements InterfaceC2808l {

    /* renamed from: b */
    public final InterfaceC2808l f6429b;

    public C1675c(InterfaceC2808l interfaceC2808l) {
        AbstractC2470e.m4446c("Argument must not be null", interfaceC2808l);
        this.f6429b = interfaceC2808l;
    }

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        this.f6429b.mo309a(messageDigest);
    }

    @Override // p210y3.InterfaceC2808l
    /* renamed from: b */
    public final InterfaceC0080f0 mo2242b(Context context, InterfaceC0080f0 interfaceC0080f0, int i, int i4) {
        C1674b c1674b = (C1674b) interfaceC0080f0.get();
        InterfaceC0080f0 c1168c = new C1168c(((C1678f) c1674b.f6419j.f3812b).f6448l, ComponentCallbacks2C0713b.m1484a(context).f2774j);
        InterfaceC2808l interfaceC2808l = this.f6429b;
        InterfaceC0080f0 interfaceC0080f0Mo2242b = interfaceC2808l.mo2242b(context, c1168c, i, i4);
        if (!c1168c.equals(interfaceC0080f0Mo2242b)) {
            c1168c.mo305b();
        }
        ((C1678f) c1674b.f6419j.f3812b).m3379c(interfaceC2808l, (Bitmap) interfaceC0080f0Mo2242b.get());
        return interfaceC0080f0;
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        if (obj instanceof C1675c) {
            return this.f6429b.equals(((C1675c) obj).f6429b);
        }
        return false;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        return this.f6429b.hashCode();
    }
}
