package p024c5;

import android.util.TypedValue;
import com.exotv.net.MainActivity;
import p002a1.C0016e;
import p082j3.C1493f;
import p102l6.C1693j;
import p111m6.AbstractC1908c;
import p138p7.C2229a;
import p138p7.C2230b;
import p212y6.InterfaceC2851l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class C0654c1 implements InterfaceC2851l {

    /* renamed from: j */
    public final /* synthetic */ int f2582j;

    /* renamed from: k */
    public final /* synthetic */ Object f2583k;

    public /* synthetic */ C0654c1(int i, Object obj) {
        this.f2582j = i;
        this.f2583k = obj;
    }

    @Override // p212y6.InterfaceC2851l
    public final Object invoke(Object obj) {
        switch (this.f2582j) {
            case 0:
                return Integer.valueOf((int) TypedValue.applyDimension(1, ((Integer) obj).intValue(), ((MainActivity) ((C0016e) this.f2583k).f62k).getResources().getDisplayMetrics()));
            case 1:
                ((C1493f) this.f2583k).f5751t = true;
                return C1693j.f6497a;
            case 2:
                return obj == ((AbstractC1908c) this.f2583k) ? "(this Collection)" : String.valueOf(obj);
            default:
                ((C2230b) this.f2583k).m4008c(null);
                return C1693j.f6497a;
        }
    }

    public /* synthetic */ C0654c1(C2230b c2230b, C2229a c2229a) {
        this.f2582j = 3;
        this.f2583k = c2230b;
    }
}
