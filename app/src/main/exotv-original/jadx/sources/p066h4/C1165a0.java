package p066h4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import p005a4.InterfaceC0080f0;
import p083j4.C1500d;
import p210y3.C2804h;
import p210y3.InterfaceC2806j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.a0 */
/* loaded from: classes.dex */
public final class C1165a0 implements InterfaceC2806j {

    /* renamed from: a */
    public final /* synthetic */ int f5004a;

    public /* synthetic */ C1165a0(int i) {
        this.f5004a = i;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo2583a(Object obj, C2804h c2804h) {
        switch (this.f5004a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: b */
    public final InterfaceC0080f0 mo2584b(Object obj, int i, int i4, C2804h c2804h) {
        switch (this.f5004a) {
            case 0:
                return new C1192z((Bitmap) obj);
            case 1:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C1500d(drawable, 0);
                }
                return null;
            default:
                return new C1192z((File) obj);
        }
    }
}
