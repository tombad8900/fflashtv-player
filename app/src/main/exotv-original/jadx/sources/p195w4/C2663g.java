package p195w4;

import com.exotv.net.MainActivity;
import com.exotv.net.model.Channel;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p006a5.C0106a;
import p024c5.C0692t;
import p024c5.C0702y;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.g */
/* loaded from: classes.dex */
public final /* synthetic */ class C2663g implements InterfaceC2840a {

    /* renamed from: j */
    public final /* synthetic */ int f9686j;

    /* renamed from: k */
    public final /* synthetic */ MainActivity f9687k;

    public /* synthetic */ C2663g(MainActivity mainActivity, int i) {
        this.f9686j = i;
        this.f9687k = mainActivity;
    }

    @Override // p212y6.InterfaceC2840a
    public final Object invoke() {
        String selectionKey;
        int i = this.f9686j;
        boolean z7 = false;
        boolean zM1676z = false;
        MainActivity mainActivity = this.f9687k;
        switch (i) {
            case 0:
                Set set = MainActivity.f2882p0;
                return Boolean.valueOf(mainActivity.m1677A());
            case 1:
                C0702y c0702y = mainActivity.f2886J;
                if (c0702y != null) {
                    return Integer.valueOf(c0702y.m1471b());
                }
                AbstractC2980h.m5139h("nav");
                throw null;
            case 2:
                if (mainActivity.f2887K == EnumC2683q.f9746j) {
                    C0702y c0702y2 = mainActivity.f2886J;
                    if (c0702y2 == null) {
                        AbstractC2980h.m5139h("nav");
                        throw null;
                    }
                    c0702y2.m1470a();
                    z7 = true;
                }
                return Boolean.valueOf(z7);
            case 3:
                if (mainActivity.f2887K == EnumC2683q.f9746j) {
                    C0692t c0692t = mainActivity.f2896T;
                    if (c0692t == null) {
                        AbstractC2980h.m5139h("channelAdapter");
                        throw null;
                    }
                    Channel channel = mainActivity.f2902Z;
                    int i4 = -1;
                    if (channel != null && (selectionKey = channel.getSelectionKey()) != null) {
                        Iterator it = ((List) c0692t.f2703g).iterator();
                        int i8 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                if (AbstractC2980h.m5132a(((Channel) it.next()).getSelectionKey(), selectionKey)) {
                                    i4 = i8;
                                } else {
                                    i8++;
                                }
                            }
                        }
                    }
                    C0106a c0106a = mainActivity.f2892P;
                    if (c0106a == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    zM1676z = MainActivity.m1676z(c0106a.f502c, i4 >= 0 ? i4 : 0);
                }
                return Boolean.valueOf(zM1676z);
            case 4:
                Set set2 = MainActivity.f2882p0;
                return Boolean.valueOf(mainActivity.m1677A());
            case 5:
                C0702y c0702y3 = mainActivity.f2886J;
                if (c0702y3 != null) {
                    return Integer.valueOf(c0702y3.m1471b());
                }
                AbstractC2980h.m5139h("nav");
                throw null;
            default:
                C0702y c0702y4 = mainActivity.f2886J;
                if (c0702y4 != null) {
                    return Integer.valueOf(c0702y4.m1471b());
                }
                AbstractC2980h.m5139h("nav");
                throw null;
        }
    }
}
