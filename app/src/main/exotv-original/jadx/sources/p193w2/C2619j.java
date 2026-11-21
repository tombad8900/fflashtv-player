package p193w2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.exotv.net.R;
import p017b6.ViewOnClickListenerC0591a;
import p063h1.AbstractC1118i0;
import p216z2.AbstractC2920v0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.j */
/* loaded from: classes.dex */
public final class C2619j extends AbstractC2920v0 {

    /* renamed from: u */
    public final TextView f9463u;

    /* renamed from: v */
    public final TextView f9464v;

    /* renamed from: w */
    public final ImageView f9465w;

    /* renamed from: x */
    public final /* synthetic */ C2627o f9466x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2619j(C2627o c2627o, View view) {
        super(view);
        this.f9466x = c2627o;
        if (AbstractC1118i0.f4750a < 26) {
            view.setFocusable(true);
        }
        this.f9463u = (TextView) view.findViewById(R.id.exo_main_text);
        this.f9464v = (TextView) view.findViewById(R.id.exo_sub_text);
        this.f9465w = (ImageView) view.findViewById(R.id.exo_icon);
        view.setOnClickListener(new ViewOnClickListenerC0591a(7, this));
    }
}
