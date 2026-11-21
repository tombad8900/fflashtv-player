package p067h5;

import android.view.View;
import com.exotv.net.MainActivity;
import p006a5.C0106a;
import p216z2.AbstractC2920v0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h5.a */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1193a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f5070a;

    /* renamed from: b */
    public final /* synthetic */ Object f5071b;

    public /* synthetic */ ViewOnLayoutChangeListenerC1193a(int i, Object obj) {
        this.f5070a = i;
        this.f5071b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i4, int i8, int i9, int i10, int i11, int i12, int i13) {
        View view2;
        switch (this.f5070a) {
            case 0:
                throw null;
            default:
                view.removeOnLayoutChangeListener(this);
                C0106a c0106a = ((MainActivity) this.f5071b).f2892P;
                if (c0106a == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                AbstractC2920v0 abstractC2920v0M1159H = c0106a.f502c.m1159H(0);
                if (abstractC2920v0M1159H == null || (view2 = abstractC2920v0M1159H.f10848a) == null) {
                    return;
                }
                view2.requestFocus();
                return;
        }
    }
}
