package p024c5;

import android.view.View;
import com.exotv.net.MainActivity;
import p204x4.C2769l;
import p212y6.InterfaceC2851l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.a0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLongClickListenerC0647a0 implements View.OnLongClickListener {

    /* renamed from: j */
    public final /* synthetic */ int f2548j;

    /* renamed from: k */
    public final /* synthetic */ Object f2549k;

    /* renamed from: l */
    public final /* synthetic */ C2769l f2550l;

    public /* synthetic */ ViewOnLongClickListenerC0647a0(Object obj, C2769l c2769l, int i) {
        this.f2548j = i;
        this.f2549k = obj;
        this.f2550l = c2769l;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f2548j) {
            case 0:
                ((InterfaceC2851l) this.f2549k).invoke(this.f2550l);
                break;
            case 1:
                ((InterfaceC2851l) this.f2549k).invoke(this.f2550l);
                break;
            default:
                MainActivity mainActivity = ((C0648a1) this.f2549k).f2551a;
                C2769l c2769l = this.f2550l;
                C0672j.m1452l(mainActivity, String.valueOf(c2769l.f10241a), c2769l.f10242b, null, 120);
                break;
        }
        return true;
    }
}
