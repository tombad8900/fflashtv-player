package p193w2;

import android.view.View;
import android.widget.TextView;
import com.exotv.net.R;
import p063h1.AbstractC1118i0;
import p216z2.AbstractC2920v0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.k */
/* loaded from: classes.dex */
public final class C2621k extends AbstractC2920v0 {

    /* renamed from: u */
    public final TextView f9467u;

    /* renamed from: v */
    public final View f9468v;

    public C2621k(View view) {
        super(view);
        if (AbstractC1118i0.f4750a < 26) {
            view.setFocusable(true);
        }
        this.f9467u = (TextView) view.findViewById(R.id.exo_text);
        this.f9468v = view.findViewById(R.id.exo_check);
    }
}
