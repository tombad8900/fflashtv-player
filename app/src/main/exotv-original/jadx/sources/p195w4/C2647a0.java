package p195w4;

import com.exotv.net.MovieDetailActivity;
import com.exotv.net.R;
import p102l6.C1693j;
import p212y6.InterfaceC2840a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.a0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2647a0 implements InterfaceC2840a {

    /* renamed from: j */
    public final /* synthetic */ int f9634j;

    /* renamed from: k */
    public final /* synthetic */ MovieDetailActivity f9635k;

    public /* synthetic */ C2647a0(MovieDetailActivity movieDetailActivity, int i) {
        this.f9634j = i;
        this.f9635k = movieDetailActivity;
    }

    @Override // p212y6.InterfaceC2840a
    public final Object invoke() {
        int i = this.f9634j;
        MovieDetailActivity movieDetailActivity = this.f9635k;
        switch (i) {
            case 0:
                int i4 = MovieDetailActivity.f2918Y;
                return Boolean.valueOf(movieDetailActivity.getResources().getBoolean(R.bool.is_large_screen));
            default:
                int i8 = MovieDetailActivity.f2918Y;
                movieDetailActivity.m1703v(false);
                return C1693j.f6497a;
        }
    }
}
