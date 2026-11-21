package p074i5;

import android.view.View;
import androidx.lifecycle.RunnableC0127c0;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import p002a1.RunnableC0018f;
import p213z.AbstractC2863a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i5.d */
/* loaded from: classes.dex */
public final class C1272d {

    /* renamed from: a */
    public final /* synthetic */ int f5289a;

    /* renamed from: b */
    public int f5290b;

    /* renamed from: c */
    public boolean f5291c;

    /* renamed from: d */
    public final Runnable f5292d;

    /* renamed from: e */
    public final /* synthetic */ AbstractC2863a f5293e;

    public C1272d(SideSheetBehavior sideSheetBehavior) {
        this.f5289a = 1;
        this.f5293e = sideSheetBehavior;
        this.f5292d = new RunnableC0127c0(23, this);
    }

    /* renamed from: a */
    public final void m2738a(int i) {
        switch (this.f5289a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5293e;
                WeakReference weakReference = bottomSheetBehavior.f3114Y;
                if (weakReference != null && weakReference.get() != null) {
                    this.f5290b = i;
                    if (!this.f5291c) {
                        ((View) bottomSheetBehavior.f3114Y.get()).postOnAnimation((RunnableC0018f) this.f5292d);
                        this.f5291c = true;
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5293e;
                WeakReference weakReference2 = sideSheetBehavior.f3392p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.f5290b = i;
                    if (!this.f5291c) {
                        ((View) sideSheetBehavior.f3392p.get()).postOnAnimation((RunnableC0127c0) this.f5292d);
                        this.f5291c = true;
                        break;
                    }
                }
                break;
        }
    }

    public C1272d(BottomSheetBehavior bottomSheetBehavior) {
        this.f5289a = 0;
        this.f5293e = bottomSheetBehavior;
        this.f5292d = new RunnableC0018f(7, this);
    }
}
