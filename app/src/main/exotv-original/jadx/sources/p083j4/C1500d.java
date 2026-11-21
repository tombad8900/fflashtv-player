package p083j4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.ComponentCallbacks2C0738m;
import p002a1.C0016e;
import p005a4.InterfaceC0072b0;
import p005a4.InterfaceC0080f0;
import p015b4.C0572f;
import p015b4.InterfaceC0567a;
import p100l4.C1674b;
import p100l4.C1676d;
import p100l4.C1678f;
import p178u4.AbstractC2470e;
import p203x3.C2757d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j4.d */
/* loaded from: classes.dex */
public final class C1500d implements InterfaceC0080f0, InterfaceC0072b0 {

    /* renamed from: j */
    public final Drawable f5767j;

    /* renamed from: k */
    public final /* synthetic */ int f5768k;

    public C1500d(Drawable drawable, int i) {
        this.f5768k = i;
        AbstractC2470e.m4446c("Argument must not be null", drawable);
        this.f5767j = drawable;
    }

    /* renamed from: e */
    private final void m3178e() {
    }

    @Override // p005a4.InterfaceC0072b0
    /* renamed from: a */
    public void mo261a() {
        switch (this.f5768k) {
            case 1:
                ((C1678f) ((C1674b) this.f5767j).f6419j.f3812b).f6448l.prepareToDraw();
                break;
            default:
                Drawable drawable = this.f5767j;
                if (!(drawable instanceof BitmapDrawable)) {
                    if (drawable instanceof C1674b) {
                        ((C1678f) ((C1674b) drawable).f6419j.f3812b).f6448l.prepareToDraw();
                        break;
                    }
                } else {
                    ((BitmapDrawable) drawable).getBitmap().prepareToDraw();
                    break;
                }
                break;
        }
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: b */
    public final void mo305b() {
        C0572f c0572f;
        C0572f c0572f2;
        C0572f c0572f3;
        switch (this.f5768k) {
            case 0:
                break;
            default:
                C1674b c1674b = (C1674b) this.f5767j;
                c1674b.stop();
                c1674b.f6422m = true;
                C1678f c1678f = (C1678f) c1674b.f6419j.f3812b;
                ComponentCallbacks2C0738m componentCallbacks2C0738m = c1678f.f6440d;
                c1678f.f6439c.clear();
                Bitmap bitmap = c1678f.f6448l;
                if (bitmap != null) {
                    c1678f.f6441e.mo1309e(bitmap);
                    c1678f.f6448l = null;
                }
                c1678f.f6442f = false;
                C1676d c1676d = c1678f.f6445i;
                if (c1676d != null) {
                    componentCallbacks2C0738m.m1659l(c1676d);
                    c1678f.f6445i = null;
                }
                C1676d c1676d2 = c1678f.f6447k;
                if (c1676d2 != null) {
                    componentCallbacks2C0738m.m1659l(c1676d2);
                    c1678f.f6447k = null;
                }
                C1676d c1676d3 = c1678f.f6449m;
                if (c1676d3 != null) {
                    componentCallbacks2C0738m.m1659l(c1676d3);
                    c1678f.f6449m = null;
                }
                C2757d c2757d = c1678f.f6437a;
                C0016e c0016e = c2757d.f10187c;
                c2757d.f10196l = null;
                byte[] bArr = c2757d.f10193i;
                if (bArr != null && (c0572f3 = (C0572f) c0016e.f63l) != null) {
                    c0572f3.m1323g(bArr);
                }
                int[] iArr = c2757d.f10194j;
                if (iArr != null && (c0572f2 = (C0572f) c0016e.f63l) != null) {
                    c0572f2.m1323g(iArr);
                }
                Bitmap bitmap2 = c2757d.f10197m;
                if (bitmap2 != null) {
                    ((InterfaceC0567a) c0016e.f62k).mo1309e(bitmap2);
                }
                c2757d.f10197m = null;
                c2757d.f10188d = null;
                c2757d.f10203s = null;
                byte[] bArr2 = c2757d.f10189e;
                if (bArr2 != null && (c0572f = (C0572f) c0016e.f63l) != null) {
                    c0572f.m1323g(bArr2);
                }
                c1678f.f6446j = true;
                break;
        }
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: c */
    public final int mo306c() {
        switch (this.f5768k) {
            case 0:
                Drawable drawable = this.f5767j;
                return Math.max(1, drawable.getIntrinsicHeight() * drawable.getIntrinsicWidth() * 4);
            default:
                C1678f c1678f = (C1678f) ((C1674b) this.f5767j).f6419j.f3812b;
                C2757d c2757d = c1678f.f6437a;
                return (c2757d.f10194j.length * 4) + c2757d.f10188d.limit() + c2757d.f10193i.length + c1678f.f6450n;
        }
    }

    @Override // p005a4.InterfaceC0080f0
    /* renamed from: d */
    public final Class mo307d() {
        switch (this.f5768k) {
            case 0:
                return this.f5767j.getClass();
            default:
                return C1674b.class;
        }
    }

    @Override // p005a4.InterfaceC0080f0
    public final Object get() {
        Drawable drawable = this.f5767j;
        Drawable.ConstantState constantState = drawable.getConstantState();
        return constantState == null ? drawable : constantState.newDrawable();
    }
}
