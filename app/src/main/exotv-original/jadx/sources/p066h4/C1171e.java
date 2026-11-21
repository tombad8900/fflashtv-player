package p066h4;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;
import p005a4.C0073c;
import p005a4.InterfaceC0080f0;
import p015b4.InterfaceC0567a;
import p203x3.C2757d;
import p210y3.C2804h;
import p210y3.InterfaceC2806j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h4.e */
/* loaded from: classes.dex */
public final class C1171e implements InterfaceC2806j {

    /* renamed from: a */
    public final /* synthetic */ int f5019a;

    /* renamed from: b */
    public final Object f5020b;

    public /* synthetic */ C1171e(int i, Object obj) {
        this.f5019a = i;
        this.f5020b = obj;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: a */
    public final boolean mo2583a(Object obj, C2804h c2804h) {
        switch (this.f5019a) {
            case 0:
                ((C1181o) this.f5020b).getClass();
                break;
            case 1:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if ((("HUAWEI".equalsIgnoreCase(str) || "HONOR".equalsIgnoreCase(str)) && parcelFileDescriptor.getStatSize() > 536870912) || "robolectric".equals(Build.FINGERPRINT)) {
                }
                break;
            default:
                break;
        }
        return true;
    }

    @Override // p210y3.InterfaceC2806j
    /* renamed from: b */
    public final InterfaceC0080f0 mo2584b(Object obj, int i, int i4, C2804h c2804h) {
        switch (this.f5019a) {
            case 0:
                C1181o c1181o = (C1181o) this.f5020b;
                return c1181o.m2603a(new C0073c((ByteBuffer) obj, c1181o.f5046d, c1181o.f5045c, 11), i, i4, c2804h, C1181o.f5041j);
            case 1:
                C1181o c1181o2 = (C1181o) this.f5020b;
                return c1181o2.m2603a(new C0073c((ParcelFileDescriptor) obj, c1181o2.f5046d, c1181o2.f5045c), i, i4, c2804h, C1181o.f5041j);
            default:
                return C1168c.m2585e(((C2757d) obj).m4844b(), (InterfaceC0567a) this.f5020b);
        }
    }
}
