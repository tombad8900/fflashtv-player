package p017b6;

import android.view.View;
import com.exotv.net.PlayerActivity;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.b */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnFocusChangeListenerC0593b implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f2371a;

    /* renamed from: b */
    public final /* synthetic */ Object f2372b;

    public /* synthetic */ ViewOnFocusChangeListenerC0593b(int i, Object obj) {
        this.f2371a = i;
        this.f2372b = obj;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z7) {
        int i = this.f2371a;
        Object obj = this.f2372b;
        switch (i) {
            case 0:
                C0599e c0599e = (C0599e) obj;
                c0599e.m1358s(c0599e.m1359t());
                break;
            case 1:
                C0615o c0615o = (C0615o) obj;
                c0615o.f2427l = z7;
                c0615o.m1388p();
                if (!z7) {
                    c0615o.m1370s(false);
                    c0615o.f2428m = false;
                    break;
                }
                break;
            default:
                PlayerActivity playerActivity = (PlayerActivity) obj;
                if (z7) {
                    playerActivity.f2975t0 = view;
                } else {
                    int i4 = PlayerActivity.f2936z0;
                }
                view.animate().scaleX(z7 ? 1.08f : 1.0f).scaleY(z7 ? 1.08f : 1.0f).setDuration(120L).start();
                view.setTranslationZ(z7 ? 12.0f : 0.0f);
                break;
        }
    }
}
