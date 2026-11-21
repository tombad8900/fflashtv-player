package p193w2;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0248v1;
import androidx.media3.common.InterfaceC0193d1;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.List;
import p017b6.ViewOnClickListenerC0591a;
import p052f6.C0981l1;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.e */
/* loaded from: classes.dex */
public final class C2609e extends AbstractC2923x {

    /* renamed from: d */
    public List f9416d = new ArrayList();

    /* renamed from: e */
    public final /* synthetic */ C2627o f9417e;

    /* renamed from: f */
    public final /* synthetic */ int f9418f;

    /* renamed from: g */
    public final /* synthetic */ C2627o f9419g;

    public C2609e(C2627o c2627o, int i) {
        this.f9418f = i;
        this.f9419g = c2627o;
        this.f9417e = c2627o;
    }

    /* renamed from: k */
    private final void m4693k(String str) {
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: a */
    public final int mo1455a() {
        if (this.f9416d.isEmpty()) {
            return 0;
        }
        return this.f9416d.size() + 1;
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: d */
    public /* bridge */ /* synthetic */ void mo1456d(AbstractC2920v0 abstractC2920v0, int i) {
        switch (this.f9418f) {
            case 1:
                m4696i((C2621k) abstractC2920v0, i);
                break;
            default:
                m4696i((C2621k) abstractC2920v0, i);
                break;
        }
    }

    @Override // p216z2.AbstractC2923x
    /* renamed from: e */
    public final AbstractC2920v0 mo1457e(ViewGroup viewGroup) {
        return new C2621k(LayoutInflater.from(this.f9417e.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
    }

    /* renamed from: g */
    public boolean m4694g(C0248v1 c0248v1) {
        for (int i = 0; i < this.f9416d.size(); i++) {
            if (c0248v1.overrides.containsKey(((C2623l) this.f9416d.get(i)).f9470a.f1538b)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public void m4695h(List list) {
        C2627o c2627o = this.f9419g;
        ImageView imageView = c2627o.f9495F;
        boolean z7 = false;
        int i = 0;
        while (true) {
            if (i >= ((C0981l1) list).f4213m) {
                break;
            }
            C2623l c2623l = (C2623l) ((C0981l1) list).get(i);
            if (c2623l.f9470a.f1541e[c2623l.f9471b]) {
                z7 = true;
                break;
            }
            i++;
        }
        if (imageView != null) {
            imageView.setImageDrawable(z7 ? c2627o.f9528k0 : c2627o.f9530l0);
            imageView.setContentDescription(z7 ? c2627o.f9532m0 : c2627o.f9534n0);
        }
        this.f9416d = list;
    }

    /* renamed from: i */
    public void m4696i(C2621k c2621k, int i) {
        switch (this.f9418f) {
            case 1:
                m4697j(c2621k, i);
                if (i > 0) {
                    C2623l c2623l = (C2623l) this.f9416d.get(i - 1);
                    c2621k.f9468v.setVisibility(c2623l.f9470a.f1541e[c2623l.f9471b] ? 0 : 4);
                    break;
                }
                break;
            default:
                m4697j(c2621k, i);
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4697j(C2621k c2621k, int i) {
        boolean z7;
        boolean z8;
        InterfaceC0193d1 interfaceC0193d1 = this.f9417e.f9544s0;
        if (interfaceC0193d1 == null) {
        }
        if (i != 0) {
            C2623l c2623l = (C2623l) this.f9416d.get(i - 1);
            C0233q1 c0233q1 = c2623l.f9470a.f1538b;
            if (interfaceC0193d1.getTrackSelectionParameters().overrides.get(c0233q1) != null) {
                z7 = c2623l.f9470a.f1541e[c2623l.f9471b];
            }
            c2621k.f9467u.setText(c2623l.f9472c);
            c2621k.f9468v.setVisibility(z7 ? 0 : 4);
            c2621k.f10848a.setOnClickListener(new ViewOnClickListenerC2625m(this, interfaceC0193d1, c0233q1, c2623l, 0));
            return;
        }
        switch (this.f9418f) {
            case 0:
                c2621k.f9467u.setText(R.string.exo_track_selection_auto);
                InterfaceC0193d1 interfaceC0193d12 = this.f9419g.f9544s0;
                interfaceC0193d12.getClass();
                c2621k.f9468v.setVisibility(m4694g(interfaceC0193d12.getTrackSelectionParameters()) ? 4 : 0);
                c2621k.f10848a.setOnClickListener(new ViewOnClickListenerC0591a(6, this));
                break;
            default:
                c2621k.f9467u.setText(R.string.exo_track_selection_none);
                int i4 = 0;
                while (true) {
                    if (i4 < this.f9416d.size()) {
                        C2623l c2623l2 = (C2623l) this.f9416d.get(i4);
                        if (c2623l2.f9470a.f1541e[c2623l2.f9471b]) {
                            z8 = false;
                        } else {
                            i4++;
                        }
                    } else {
                        z8 = true;
                    }
                }
                c2621k.f9468v.setVisibility(z8 ? 0 : 4);
                c2621k.f10848a.setOnClickListener(new ViewOnClickListenerC0591a(8, this));
                break;
        }
    }
}
