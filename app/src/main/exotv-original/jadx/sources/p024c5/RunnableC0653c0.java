package p024c5;

import android.view.View;
import android.widget.HorizontalScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import p029d0.AbstractC0786b;
import p216z2.AbstractC2888f0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.c0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0653c0 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f2579j;

    /* renamed from: k */
    public final /* synthetic */ int f2580k;

    /* renamed from: l */
    public final /* synthetic */ Object f2581l;

    public /* synthetic */ RunnableC0653c0(int i, int i4, Object obj) {
        this.f2579j = i4;
        this.f2581l = obj;
        this.f2580k = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2579j;
        int i4 = this.f2580k;
        Object obj = this.f2581l;
        switch (i) {
            case 0:
                AbstractC2888f0 layoutManager = ((C0665g0) obj).getLayoutManager();
                AbstractC2980h.m5134c("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager", layoutManager);
                ((LinearLayoutManager) layoutManager).mo1138p0(i4);
                break;
            case 1:
                ((HorizontalScrollView) obj).smoothScrollTo(i4, 0);
                break;
            case 2:
                ((AbstractC0786b) obj).mo1942g(i4);
                break;
            case 3:
                int[] iArr = MaterialButton.f3154a0;
                ((MaterialButton) obj).setIconSize(i4);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                WeakReference weakReference = sideSheetBehavior.f3392p;
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view != null) {
                    sideSheetBehavior.m1888t(view, i4, false);
                    break;
                }
                break;
        }
    }
}
