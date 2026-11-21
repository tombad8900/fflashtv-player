package p195w4;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.MainActivity;
import java.util.Set;
import p216z2.AbstractC2920v0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC2661f implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f9681j = 1;

    /* renamed from: k */
    public final /* synthetic */ RecyclerView f9682k;

    /* renamed from: l */
    public final /* synthetic */ int f9683l;

    public /* synthetic */ RunnableC2661f(int i, RecyclerView recyclerView, MainActivity mainActivity) {
        this.f9682k = recyclerView;
        this.f9683l = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        int i = this.f9681j;
        int i4 = this.f9683l;
        RecyclerView recyclerView = this.f9682k;
        switch (i) {
            case 0:
                Set set = MainActivity.f2882p0;
                AbstractC2920v0 abstractC2920v0M1159H = recyclerView.m1159H(i4);
                if (abstractC2920v0M1159H != null && (view = abstractC2920v0M1159H.f10848a) != null) {
                    view.requestFocus();
                    break;
                }
                break;
            default:
                View viewM1664C = MainActivity.m1664C(recyclerView);
                if (viewM1664C != null && !viewM1664C.isFocused()) {
                    viewM1664C.requestFocus(i4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC2661f(RecyclerView recyclerView, int i) {
        this.f9682k = recyclerView;
        this.f9683l = i;
    }
}
