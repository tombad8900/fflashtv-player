package p024c5;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.media3.common.InterfaceC0193d1;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import com.exotv.net.model.Channel;
import java.util.Iterator;
import java.util.List;
import p005a4.C0073c;
import p006a5.C0108c;
import p065h3.C1156a;
import p065h3.C1163h;
import p069h7.AbstractC1206h;
import p111m6.C1921p;
import p151r3.C2297i;
import p169t3.C2433a;
import p177u3.C2461a;
import p185v3.AbstractC2536f;
import p193w2.C2619j;
import p193w2.C2627o;
import p195w4.C2658e;
import p195w4.C2663g;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;
import p216z2.C2890g0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.t */
/* loaded from: classes.dex */
public final class C0692t extends AbstractC2923x {

    /* renamed from: d */
    public final /* synthetic */ int f2700d;

    /* renamed from: e */
    public final Object f2701e;

    /* renamed from: f */
    public final Object f2702f;

    /* renamed from: g */
    public Object f2703g;

    /* renamed from: h */
    public Object f2704h;

    public C0692t(C2658e c2658e, C2663g c2663g) {
        this.f2700d = 0;
        this.f2701e = c2658e;
        this.f2702f = c2663g;
        this.f2703g = C1921p.f7187j;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: a */
    public final int mo1455a() {
        switch (this.f2700d) {
            case 0:
                return ((List) this.f2703g).size();
            default:
                return ((String[]) this.f2701e).length;
        }
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: b */
    public long mo1467b(int i) {
        switch (this.f2700d) {
            case 1:
                return i;
            default:
                return super.mo1467b(i);
        }
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: d */
    public final void mo1456d(AbstractC2920v0 abstractC2920v0, int i) {
        switch (this.f2700d) {
            case 0:
                final C0690s c0690s = (C0690s) abstractC2920v0;
                Channel channel = (Channel) ((List) this.f2703g).get(i);
                String displayName = channel.getDisplayName();
                final Context context = ((ConstraintLayout) c0690s.f2698u.f550a).getContext();
                ((TextView) c0690s.f2698u.f553d).setText(displayName);
                ((ConstraintLayout) c0690s.f2698u.f550a).setOnClickListener(new ViewOnClickListenerC0684p(this, 0, channel));
                ((ConstraintLayout) c0690s.f2698u.f550a).setOnKeyListener(new ViewOnKeyListenerC0686q(i, this));
                String icon = channel.getIcon();
                if (icon == null || AbstractC1206h.m2630D0(icon)) {
                    AbstractC2536f.m4556c((ImageView) c0690s.f2698u.f555f).m4098a();
                    ((ImageView) c0690s.f2698u.f555f).setVisibility(8);
                    ((ImageView) c0690s.f2698u.f555f).setImageDrawable(null);
                    ((TextView) c0690s.f2698u.f552c).setVisibility(0);
                    ((TextView) c0690s.f2698u.f552c).setText(displayName);
                } else {
                    ((TextView) c0690s.f2698u.f552c).setVisibility(8);
                    ((ImageView) c0690s.f2698u.f555f).setVisibility(0);
                    ImageView imageView = (ImageView) c0690s.f2698u.f555f;
                    Context context2 = imageView.getContext();
                    C1163h c1163hM1538x = C1156a.f4971b;
                    if (c1163hM1538x == null) {
                        synchronized (C1156a.f4970a) {
                            c1163hM1538x = C1156a.f4971b;
                            if (c1163hM1538x == null) {
                                context2.getApplicationContext();
                                c1163hM1538x = AbstractC0714c.m1538x(context2);
                                C1156a.f4971b = c1163hM1538x;
                            }
                        }
                    }
                    C2297i c2297i = new C2297i(imageView.getContext());
                    c2297i.f8013c = icon;
                    c2297i.f8014d = new C2433a(imageView);
                    c2297i.f8023m = null;
                    c2297i.f8024n = null;
                    c2297i.f8025o = null;
                    c2297i.f8017g = new C2461a(100);
                    c2297i.f8015e = new C0073c(c0690s, displayName, c0690s, 5);
                    c1163hM1538x.m2582b(c2297i.m4096a());
                }
                final boolean zM5132a = AbstractC2980h.m5132a(channel.getSelectionKey(), (String) this.f2704h);
                ((TextView) c0690s.f2698u.f554e).setVisibility(zM5132a ? 0 : 8);
                ((TextView) c0690s.f2698u.f553d).setTextColor(context.getColor(zM5132a ? R.color.selected : R.color.label));
                ((TextView) c0690s.f2698u.f552c).setTextColor(-1);
                ((FrameLayout) c0690s.f2698u.f551b).setBackgroundResource(zM5132a ? R.drawable.bg_channel_selected : R.drawable.bg_channel);
                ((ConstraintLayout) c0690s.f2698u.f550a).setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: c5.r
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view, boolean z7) {
                        C0690s c0690s2 = c0690s;
                        Context context3 = context;
                        boolean z8 = zM5132a;
                        int i4 = R.color.selected;
                        if (z7) {
                            view.animate().scaleX(1.01f).scaleY(1.01f).setDuration(120L).start();
                            view.setElevation(view.getResources().getDisplayMetrics().density * 10.0f);
                            TextView textView = (TextView) c0690s2.f2698u.f553d;
                            if (!z8) {
                                i4 = android.R.color.white;
                            }
                            textView.setTextColor(context3.getColor(i4));
                            return;
                        }
                        view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(120L).start();
                        view.setElevation(0.0f);
                        TextView textView2 = (TextView) c0690s2.f2698u.f553d;
                        if (!z8) {
                            i4 = R.color.label;
                        }
                        textView2.setTextColor(context3.getColor(i4));
                    }
                });
                return;
            default:
                C2619j c2619j = (C2619j) abstractC2920v0;
                View view = c2619j.f10848a;
                if (m1469h(i)) {
                    view.setLayoutParams(new C2890g0(-1, -2));
                } else {
                    view.setLayoutParams(new C2890g0(0, 0));
                }
                TextView textView = c2619j.f9463u;
                ImageView imageView2 = c2619j.f9465w;
                TextView textView2 = c2619j.f9464v;
                textView.setText(((String[]) this.f2701e)[i]);
                String str = ((String[]) this.f2702f)[i];
                if (str == null) {
                    textView2.setVisibility(8);
                } else {
                    textView2.setText(str);
                }
                Drawable drawable = ((Drawable[]) this.f2703g)[i];
                if (drawable == null) {
                    imageView2.setVisibility(8);
                    return;
                } else {
                    imageView2.setImageDrawable(drawable);
                    return;
                }
        }
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: e */
    public final AbstractC2920v0 mo1457e(ViewGroup viewGroup) {
        switch (this.f2700d) {
            case 0:
                View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_channel, viewGroup, false);
                int i = R.id.channelCard;
                FrameLayout frameLayout = (FrameLayout) AbstractC0714c.m1494G(viewInflate, R.id.channelCard);
                if (frameLayout != null) {
                    i = R.id.channelInitial;
                    TextView textView = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.channelInitial);
                    if (textView != null) {
                        i = R.id.channelLogo;
                        ImageView imageView = (ImageView) AbstractC0714c.m1494G(viewInflate, R.id.channelLogo);
                        if (imageView != null) {
                            i = R.id.channelName;
                            TextView textView2 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.channelName);
                            if (textView2 != null) {
                                i = R.id.channelPlayBadge;
                                TextView textView3 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.channelPlayBadge);
                                if (textView3 != null) {
                                    return new C0690s(new C0108c((ConstraintLayout) viewInflate, frameLayout, textView, imageView, textView2, textView3));
                                }
                            }
                        }
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
            default:
                C2627o c2627o = (C2627o) this.f2704h;
                return new C2619j(c2627o, LayoutInflater.from(c2627o.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    /* renamed from: g */
    public void m1468g(Channel channel) {
        int i;
        String selectionKey = channel != null ? channel.getSelectionKey() : null;
        if (AbstractC2980h.m5132a(selectionKey, (String) this.f2704h)) {
            return;
        }
        Iterator it = ((List) this.f2703g).iterator();
        int i4 = 0;
        int i8 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i8 = -1;
                break;
            } else if (AbstractC2980h.m5132a(((Channel) it.next()).getSelectionKey(), (String) this.f2704h)) {
                break;
            } else {
                i8++;
            }
        }
        this.f2704h = selectionKey;
        Iterator it2 = ((List) this.f2703g).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            if (AbstractC2980h.m5132a(((Channel) it2.next()).getSelectionKey(), selectionKey)) {
                i = i4;
                break;
            }
            i4++;
        }
        if (i8 >= 0) {
            m5085c(i8);
        }
        if (i >= 0) {
            m5085c(i);
        }
    }

    /* renamed from: h */
    public boolean m1469h(int i) {
        C2627o c2627o = (C2627o) this.f2704h;
        InterfaceC0193d1 interfaceC0193d1 = c2627o.f9544s0;
        if (interfaceC0193d1 == null) {
            return false;
        }
        if (i == 0) {
            return interfaceC0193d1.isCommandAvailable(13);
        }
        if (i != 1) {
            return true;
        }
        return interfaceC0193d1.isCommandAvailable(30) && c2627o.f9544s0.isCommandAvailable(29);
    }

    public C0692t(C2627o c2627o, String[] strArr, Drawable[] drawableArr) {
        this.f2700d = 1;
        this.f2704h = c2627o;
        this.f2701e = strArr;
        this.f2702f = new String[strArr.length];
        this.f2703g = drawableArr;
    }
}
