package p195w4;

import com.exotv.net.MovieDetailActivity;
import com.exotv.net.PlayerActivity;
import p024c5.C0672j;
import p062h.AbstractActivityC1083i;
import p102l6.C1693j;
import p204x4.C2771n;
import p212y6.InterfaceC2840a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.y */
/* loaded from: classes.dex */
public final /* synthetic */ class C2699y implements InterfaceC2840a {

    /* renamed from: j */
    public final /* synthetic */ int f9802j;

    /* renamed from: k */
    public final /* synthetic */ AbstractActivityC1083i f9803k;

    /* renamed from: l */
    public final /* synthetic */ Object f9804l;

    public /* synthetic */ C2699y(AbstractActivityC1083i abstractActivityC1083i, Object obj, int i) {
        this.f9802j = i;
        this.f9803k = abstractActivityC1083i;
        this.f9804l = obj;
    }

    @Override // p212y6.InterfaceC2840a
    public final Object invoke() {
        int i = this.f9802j;
        C1693j c1693j = C1693j.f6497a;
        Object obj = this.f9804l;
        AbstractActivityC1083i abstractActivityC1083i = this.f9803k;
        switch (i) {
            case 0:
                MovieDetailActivity movieDetailActivity = (MovieDetailActivity) abstractActivityC1083i;
                C2771n c2771n = (C2771n) obj;
                int i4 = MovieDetailActivity.f2918Y;
                C0672j.m1452l(movieDetailActivity, String.valueOf(c2771n.f10250a), c2771n.f10251b, new C2647a0(movieDetailActivity, 1), 88);
                break;
            default:
                PlayerActivity playerActivity = (PlayerActivity) abstractActivityC1083i;
                playerActivity.f2972q0 = (Integer) obj;
                playerActivity.m1730u();
                playerActivity.m1716J();
                playerActivity.m1735z();
                playerActivity.m1723Q();
                break;
        }
        return c1693j;
    }
}
