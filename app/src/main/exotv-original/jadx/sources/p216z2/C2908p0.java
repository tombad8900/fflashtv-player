package p216z2;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.p0 */
/* loaded from: classes.dex */
public final class C2908p0 {

    /* renamed from: a */
    public int f10793a;

    /* renamed from: b */
    public int f10794b;

    /* renamed from: c */
    public int f10795c;

    /* renamed from: d */
    public int f10796d;

    /* renamed from: e */
    public Interpolator f10797e;

    /* renamed from: f */
    public boolean f10798f;

    /* renamed from: g */
    public int f10799g;

    /* renamed from: a */
    public final void m5045a(RecyclerView recyclerView) {
        int i = this.f10796d;
        if (i >= 0) {
            this.f10796d = -1;
            recyclerView.m1166Q(i);
            this.f10798f = false;
            return;
        }
        if (!this.f10798f) {
            this.f10799g = 0;
            return;
        }
        Interpolator interpolator = this.f10797e;
        if (interpolator != null && this.f10795c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i4 = this.f10795c;
        if (i4 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f2061m0.m5060c(this.f10793a, this.f10794b, i4, interpolator);
        int i8 = this.f10799g + 1;
        this.f10799g = i8;
        if (i8 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f10798f = false;
    }
}
