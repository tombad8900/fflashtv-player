package p066h4;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import java.security.MessageDigest;
import p005a4.InterfaceC0080f0;
import p015b4.InterfaceC0567a;
import p210y3.InterfaceC2808l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.r */
/* loaded from: classes.dex */
public final class C1184r implements InterfaceC2808l {

    /* renamed from: b */
    public final InterfaceC2808l f5049b;

    /* renamed from: c */
    public final boolean f5050c;

    public C1184r(InterfaceC2808l interfaceC2808l, boolean z7) {
        this.f5049b = interfaceC2808l;
        this.f5050c = z7;
    }

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        this.f5049b.mo309a(messageDigest);
    }

    @Override // p210y3.InterfaceC2808l
    /* renamed from: b */
    public final InterfaceC0080f0 mo2242b(Context context, InterfaceC0080f0 interfaceC0080f0, int i, int i4) {
        InterfaceC0567a interfaceC0567a = ComponentCallbacks2C0713b.m1484a(context).f2774j;
        Drawable drawable = (Drawable) interfaceC0080f0.get();
        C1168c c1168cM2605a = AbstractC1183q.m2605a(interfaceC0567a, drawable, i, i4);
        if (c1168cM2605a != null) {
            InterfaceC0080f0 interfaceC0080f0Mo2242b = this.f5049b.mo2242b(context, c1168cM2605a, i, i4);
            if (!interfaceC0080f0Mo2242b.equals(c1168cM2605a)) {
                return new C1168c(context.getResources(), interfaceC0080f0Mo2242b);
            }
            interfaceC0080f0Mo2242b.mo305b();
            return interfaceC0080f0;
        }
        if (!this.f5050c) {
            return interfaceC0080f0;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        if (obj instanceof C1184r) {
            return this.f5049b.equals(((C1184r) obj).f5049b);
        }
        return false;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        return this.f5049b.hashCode();
    }
}
