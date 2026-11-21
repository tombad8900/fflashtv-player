package p195w4;

import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.AbstractC0147m0;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.MainActivity;
import com.exotv.net.R;
import com.exotv.net.model.Channel;
import com.exotv.net.model.ChannelCategory;
import java.io.Serializable;
import java.util.Set;
import p002a1.C0048u;
import p006a5.C0106a;
import p024c5.C0682o;
import p024c5.C0692t;
import p024c5.EnumC0698w;
import p067h5.ViewOnLayoutChangeListenerC1193a;
import p076i7.AbstractC1339x;
import p102l6.C1689f;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p212y6.InterfaceC2851l;
import p216z2.AbstractC2920v0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.e */
/* loaded from: classes.dex */
public final /* synthetic */ class C2658e implements InterfaceC2851l {

    /* renamed from: j */
    public final /* synthetic */ int f9672j;

    /* renamed from: k */
    public final /* synthetic */ MainActivity f9673k;

    public /* synthetic */ C2658e(MainActivity mainActivity, int i) {
        this.f9672j = i;
        this.f9673k = mainActivity;
    }

    @Override // p212y6.InterfaceC2851l
    public final Object invoke(Object obj) {
        View view;
        int i = this.f9672j;
        int i4 = 1;
        C1693j c1693j = C1693j.f6497a;
        MainActivity mainActivity = this.f9673k;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                LinearLayout linearLayout = mainActivity.f2908f0;
                if (linearLayout != null) {
                    return MainActivity.m1665D(linearLayout.getChildAt(iIntValue));
                }
                AbstractC2980h.m5139h("catalogContent");
                throw null;
            case 1:
                EnumC0698w enumC0698w = (EnumC0698w) obj;
                Set set = MainActivity.f2882p0;
                AbstractC2980h.m5136e("dest", enumC0698w);
                mainActivity.getClass();
                int iOrdinal = enumC0698w.ordinal();
                if (iOrdinal == 0) {
                    mainActivity.m1685O(EnumC2683q.f9746j);
                } else if (iOrdinal == 1) {
                    mainActivity.m1685O(EnumC2683q.f9747k);
                } else if (iOrdinal == 2) {
                    mainActivity.m1685O(EnumC2683q.f9748l);
                } else {
                    if (iOrdinal != 3) {
                        throw new C0048u();
                    }
                    mainActivity.m1685O(EnumC2683q.f9749m);
                }
                return c1693j;
            case 2:
                Set set2 = MainActivity.f2882p0;
                mainActivity.m1688R(false);
                Serializable serializable = ((C1689f) obj).f6489j;
                Throwable thM3382a = C1689f.m3382a(serializable);
                if (thM3382a == null) {
                    C0106a c0106a = mainActivity.f2892P;
                    if (c0106a == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a.f512m.setText(mainActivity.getString(R.string.open_installer));
                    C0106a c0106a2 = mainActivity.f2892P;
                    if (c0106a2 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a2.f514o.setVisibility(0);
                } else {
                    String message = thM3382a.getMessage();
                    if (message == null) {
                        message = mainActivity.getString(R.string.download_failed);
                        AbstractC2980h.m5135d("getString(...)", message);
                    }
                    mainActivity.m1692V(message);
                }
                return c1693j;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                if (iIntValue2 != mainActivity.f2898V) {
                    mainActivity.f2898V = iIntValue2;
                    C0682o c0682o = mainActivity.f2895S;
                    if (c0682o == null) {
                        AbstractC2980h.m5139h("categoryAdapter");
                        throw null;
                    }
                    c0682o.m1459g(iIntValue2);
                    C0106a c0106a3 = mainActivity.f2892P;
                    if (c0106a3 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c0106a3.f502c.m1182g0(0);
                    mainActivity.m1689S(((ChannelCategory) mainActivity.f2897U.get(iIntValue2)).getChannels());
                    C0106a c0106a4 = mainActivity.f2892P;
                    if (c0106a4 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    View viewFindFocus = c0106a4.f501b.findFocus();
                    if (viewFindFocus != null) {
                        viewFindFocus.clearFocus();
                    }
                    if (mainActivity.m1682J() && mainActivity.f2887K == EnumC2683q.f9746j) {
                        C0106a c0106a5 = mainActivity.f2892P;
                        if (c0106a5 == null) {
                            AbstractC2980h.m5139h("b");
                            throw null;
                        }
                        RecyclerView recyclerView = c0106a5.f502c;
                        if (!recyclerView.isLaidOut() || recyclerView.isLayoutRequested()) {
                            recyclerView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC1193a(i4, mainActivity));
                        } else {
                            C0106a c0106a6 = mainActivity.f2892P;
                            if (c0106a6 == null) {
                                AbstractC2980h.m5139h("b");
                                throw null;
                            }
                            AbstractC2920v0 abstractC2920v0M1159H = c0106a6.f502c.m1159H(0);
                            if (abstractC2920v0M1159H != null && (view = abstractC2920v0M1159H.f10848a) != null) {
                                view.requestFocus();
                            }
                        }
                    }
                }
                return c1693j;
            default:
                Channel channel = (Channel) obj;
                Set set3 = MainActivity.f2882p0;
                AbstractC2980h.m5136e("channel", channel);
                if (!mainActivity.f2899W) {
                    mainActivity.f2899W = true;
                    mainActivity.f2902Z = channel;
                    C0692t c0692t = mainActivity.f2896T;
                    if (c0692t == null) {
                        AbstractC2980h.m5139h("channelAdapter");
                        throw null;
                    }
                    c0692t.m1468g(channel);
                    mainActivity.m1690T(true, mainActivity.getString(R.string.opening_channel), false, EnumC2683q.f9746j);
                    AbstractC1339x.m2850k(AbstractC0147m0.m566e(mainActivity), null, new C2697x(channel, mainActivity, (InterfaceC2222c) null), 3);
                }
                return c1693j;
        }
    }
}
