package p024c5;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.exotv.net.R;
import com.exotv.net.model.ChannelCategory;
import java.util.List;
import p002a1.C0016e;
import p111m6.C1921p;
import p195w4.C2658e;
import p195w4.C2663g;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.o */
/* loaded from: classes.dex */
public final class C0682o extends AbstractC2923x {

    /* renamed from: d */
    public final C2658e f2674d;

    /* renamed from: e */
    public final C2663g f2675e;

    /* renamed from: f */
    public final C2663g f2676f;

    /* renamed from: g */
    public List f2677g = C1921p.f7187j;

    /* renamed from: h */
    public int f2678h;

    public C0682o(C2658e c2658e, C2663g c2663g, C2663g c2663g2) {
        this.f2674d = c2658e;
        this.f2675e = c2663g;
        this.f2676f = c2663g2;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: a */
    public final int mo1455a() {
        return this.f2677g.size();
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: d */
    public final void mo1456d(AbstractC2920v0 abstractC2920v0, int i) {
        final C0680n c0680n = (C0680n) abstractC2920v0;
        C0016e c0016e = c0680n.f2667u;
        ChannelCategory channelCategory = (ChannelCategory) this.f2677g.get(i);
        final boolean z7 = i == this.f2678h;
        TextView textView = (TextView) c0016e.f63l;
        TextView textView2 = (TextView) c0016e.f62k;
        textView.setText(channelCategory.getDisplayTitle());
        textView2.setActivated(z7);
        textView.setBackgroundResource(R.drawable.bg_category);
        textView.setTextColor(textView2.getContext().getColor(z7 ? android.R.color.white : R.color.rail_label));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.getPaint().setFakeBoldText(true);
        textView2.setOnClickListener(new ViewOnClickListenerC0674k(this, i, 0));
        textView2.setOnKeyListener(new ViewOnKeyListenerC0676l(0, this));
        textView2.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: c5.m
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                view.setSelected(z8);
                ((TextView) c0680n.f2667u.f63l).setTextColor(view.getContext().getColor((z8 || z7) ? android.R.color.white : R.color.rail_label));
                if (z8) {
                    view.animate().scaleX(1.1f).scaleY(1.1f).setDuration(140L).start();
                    return;
                }
                view.animate().cancel();
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
            }
        });
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: e */
    public final AbstractC2920v0 mo1457e(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_category, viewGroup, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) viewInflate;
        return new C0680n(new C0016e(textView, 4, textView));
    }

    /* renamed from: g */
    public final void m1459g(int i) {
        int i4 = this.f2678h;
        if (i4 == i) {
            return;
        }
        this.f2678h = i;
        if (i4 >= 0 && i4 < this.f2677g.size()) {
            m5085c(i4);
        }
        int size = this.f2677g.size();
        int i8 = this.f2678h;
        if (i8 < 0 || i8 >= size) {
            return;
        }
        m5085c(i8);
    }
}
