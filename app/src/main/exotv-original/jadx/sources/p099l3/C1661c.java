package p099l3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import java.nio.ByteBuffer;
import p040e3.C0878p;
import p073i3.C1268q;
import p073i3.EnumC1257f;
import p137p6.InterfaceC2222c;
import p151r3.C2303o;
import p168t2.AbstractC2415i0;
import p185v3.AbstractC2536f;
import p189v7.C2573j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l3.c */
/* loaded from: classes.dex */
public final class C1661c implements InterfaceC1666h {

    /* renamed from: a */
    public final /* synthetic */ int f6381a;

    /* renamed from: b */
    public final C2303o f6382b;

    /* renamed from: c */
    public final Object f6383c;

    public /* synthetic */ C1661c(Object obj, C2303o c2303o, int i) {
        this.f6381a = i;
        this.f6383c = obj;
        this.f6382b = c2303o;
    }

    @Override // p099l3.InterfaceC1666h
    /* renamed from: a */
    public final Object mo3366a(InterfaceC2222c interfaceC2222c) {
        int i = this.f6381a;
        Object obj = this.f6383c;
        C2303o c2303o = this.f6382b;
        switch (i) {
            case 0:
                return new C1663e(new BitmapDrawable(c2303o.f8055a.getResources(), (Bitmap) obj), false, EnumC1257f.f5252k);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    C2573j c2573j = new C2573j();
                    c2573j.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = c2303o.f8055a;
                    return new C1672n(new C1268q(c2573j, null), null, EnumC1257f.f5252k);
                } catch (Throwable th) {
                    byteBuffer.position(0);
                    throw th;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = AbstractC2536f.f9216a;
                boolean z7 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof C0878p);
                if (z7) {
                    bitmapDrawable = new BitmapDrawable(c2303o.f8055a.getResources(), AbstractC2415i0.m4266g(bitmapDrawable, c2303o.f8056b, c2303o.f8058d, c2303o.f8059e, c2303o.f8060f));
                }
                return new C1663e(bitmapDrawable, z7, EnumC1257f.f5252k);
        }
    }
}
