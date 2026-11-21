package p193w2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.exotv.net.R;
import p024c5.ViewOnClickListenerC0674k;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.h */
/* loaded from: classes.dex */
public final class C2615h extends AbstractC2923x {

    /* renamed from: d */
    public final String[] f9457d;

    /* renamed from: e */
    public final float[] f9458e;

    /* renamed from: f */
    public int f9459f;

    /* renamed from: g */
    public final /* synthetic */ C2627o f9460g;

    public C2615h(C2627o c2627o, String[] strArr, float[] fArr) {
        this.f9460g = c2627o;
        this.f9457d = strArr;
        this.f9458e = fArr;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: a */
    public final int mo1455a() {
        return this.f9457d.length;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: d */
    public final void mo1456d(AbstractC2920v0 abstractC2920v0, int i) {
        C2621k c2621k = (C2621k) abstractC2920v0;
        View view = c2621k.f9468v;
        View view2 = c2621k.f10848a;
        String[] strArr = this.f9457d;
        if (i < strArr.length) {
            c2621k.f9467u.setText(strArr[i]);
        }
        if (i == this.f9459f) {
            view2.setSelected(true);
            view.setVisibility(0);
        } else {
            view2.setSelected(false);
            view.setVisibility(4);
        }
        view2.setOnClickListener(new ViewOnClickListenerC0674k(this, i, 1));
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: e */
    public final AbstractC2920v0 mo1457e(ViewGroup viewGroup) {
        return new C2621k(LayoutInflater.from(this.f9460g.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }
}
