package p017b6;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.media3.common.C0248v1;
import androidx.media3.common.InterfaceC0193d1;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.MovieDetailActivity;
import com.exotv.net.PlayerActivity;
import com.exotv.net.R;
import com.exotv.net.SeriesDetailActivity;
import com.exotv.net.p027ui.AdActivity;
import okhttp3.C2181z;
import p024c5.C0648a1;
import p063h1.AbstractC1118i0;
import p193w2.C2609e;
import p193w2.C2615h;
import p193w2.C2619j;
import p193w2.C2627o;
import p193w2.C2632t;
import p212y6.InterfaceC2840a;
import p216z2.AbstractC2923x;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0591a implements View.OnClickListener {

    /* renamed from: j */
    public final /* synthetic */ int f2360j;

    /* renamed from: k */
    public final /* synthetic */ Object f2361k;

    public /* synthetic */ ViewOnClickListenerC0591a(int i, Object obj) {
        this.f2360j = i;
        this.f2361k = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        RecyclerView recyclerView;
        AbstractC2923x adapter;
        int iM1160I;
        int i = this.f2360j;
        Object obj = this.f2361k;
        switch (i) {
            case 0:
                C0599e c0599e = (C0599e) obj;
                EditText editText = c0599e.f2397i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (view.hasFocus()) {
                    c0599e.f2397i.requestFocus();
                }
                if (text != null) {
                    text.clear();
                }
                c0599e.m1388p();
                return;
            case 1:
                ((C0615o) obj).m1371t();
                return;
            case 2:
                C0594b0 c0594b0 = (C0594b0) obj;
                EditText editText2 = c0594b0.f2374f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c0594b0.f2374f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0594b0.f2374f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0594b0.f2374f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0594b0.f2374f.setSelection(selectionEnd);
                }
                c0594b0.m1388p();
                return;
            case 3:
                AdActivity.m1749r((AdActivity) obj);
                return;
            case 4:
                EditText editText4 = ((C0648a1) obj).f2557g;
                if (editText4 != null) {
                    editText4.setText(C2181z.FRAGMENT_ENCODE_SET);
                    return;
                } else {
                    AbstractC2980h.m5139h("input");
                    throw null;
                }
            case 5:
                ((C2627o) obj).m4711k(!r5.f9546t0);
                return;
            case 6:
                C2627o c2627o = ((C2609e) obj).f9419g;
                InterfaceC0193d1 interfaceC0193d1 = c2627o.f9544s0;
                if (interfaceC0193d1 == null || !interfaceC0193d1.isCommandAvailable(29)) {
                    return;
                }
                C0248v1 trackSelectionParameters = c2627o.f9544s0.getTrackSelectionParameters();
                InterfaceC0193d1 interfaceC0193d12 = c2627o.f9544s0;
                int i4 = AbstractC1118i0.f4750a;
                interfaceC0193d12.setTrackSelectionParameters(trackSelectionParameters.buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
                ((String[]) c2627o.f9535o.f2702f)[1] = c2627o.getResources().getString(R.string.exo_track_selection_auto);
                c2627o.f9545t.dismiss();
                return;
            case 7:
                C2619j c2619j = (C2619j) obj;
                C2627o c2627o2 = c2619j.f9466x;
                int i8 = -1;
                if (c2619j.f10866s != null && (recyclerView = c2619j.f10865r) != null && (adapter = recyclerView.getAdapter()) != null && (iM1160I = c2619j.f10865r.m1160I(c2619j)) != -1 && c2619j.f10866s == adapter) {
                    i8 = iM1160I;
                }
                View view2 = c2627o2.f9501I;
                if (i8 == 0) {
                    C2615h c2615h = c2627o2.f9537p;
                    view2.getClass();
                    c2627o2.m4704d(c2615h, view2);
                    return;
                } else {
                    if (i8 != 1) {
                        c2627o2.f9545t.dismiss();
                        return;
                    }
                    C2609e c2609e = c2627o2.f9541r;
                    view2.getClass();
                    c2627o2.m4704d(c2609e, view2);
                    return;
                }
            case 8:
                C2627o c2627o3 = ((C2609e) obj).f9419g;
                InterfaceC0193d1 interfaceC0193d13 = c2627o3.f9544s0;
                if (interfaceC0193d13 == null || !interfaceC0193d13.isCommandAvailable(29)) {
                    return;
                }
                c2627o3.f9544s0.setTrackSelectionParameters(c2627o3.f9544s0.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).setPreferredTextLanguage(null).setPreferredTextRoleFlags(0).build());
                c2627o3.f9545t.dismiss();
                return;
            case 9:
                C2632t c2632t = (C2632t) obj;
                c2632t.m4728g();
                if (view.getId() == R.id.exo_overflow_show) {
                    c2632t.f9587q.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        c2632t.f9588r.start();
                        return;
                    }
                    return;
                }
            case 10:
                int i9 = MovieDetailActivity.f2918Y;
                ((MovieDetailActivity) obj).finish();
                return;
            case 11:
                InterfaceC2840a interfaceC2840a = (InterfaceC2840a) obj;
                int i10 = PlayerActivity.f2936z0;
                if (interfaceC2840a != null) {
                    interfaceC2840a.invoke();
                    return;
                }
                return;
            default:
                int i11 = SeriesDetailActivity.f3003k0;
                ((SeriesDetailActivity) obj).finish();
                return;
        }
    }
}
