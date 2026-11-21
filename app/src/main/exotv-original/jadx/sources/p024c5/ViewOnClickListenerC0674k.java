package p024c5;

import android.view.View;
import com.exotv.net.SeriesDetailActivity;
import p193w2.C2615h;
import p193w2.C2627o;
import p216z2.AbstractC2923x;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.k */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0674k implements View.OnClickListener {

    /* renamed from: j */
    public final /* synthetic */ int f2649j;

    /* renamed from: k */
    public final /* synthetic */ int f2650k;

    /* renamed from: l */
    public final /* synthetic */ Object f2651l;

    public /* synthetic */ ViewOnClickListenerC0674k(int i, SeriesDetailActivity seriesDetailActivity) {
        this.f2649j = 2;
        this.f2650k = i;
        this.f2651l = seriesDetailActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2649j) {
            case 0:
                ((C0682o) this.f2651l).f2674d.invoke(Integer.valueOf(this.f2650k));
                break;
            case 1:
                C2615h c2615h = (C2615h) this.f2651l;
                C2627o c2627o = c2615h.f9460g;
                int i = c2615h.f9459f;
                int i4 = this.f2650k;
                if (i4 != i) {
                    c2627o.setPlaybackSpeed(c2615h.f9458e[i4]);
                }
                c2627o.f9545t.dismiss();
                break;
            default:
                SeriesDetailActivity seriesDetailActivity = (SeriesDetailActivity) this.f2651l;
                int i8 = seriesDetailActivity.f3030h0;
                int i9 = this.f2650k;
                if (i9 != i8) {
                    seriesDetailActivity.f3016T = Integer.valueOf(i9);
                    seriesDetailActivity.f3030h0 = i9;
                    seriesDetailActivity.m1741C();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC0674k(AbstractC2923x abstractC2923x, int i, int i4) {
        this.f2649j = i4;
        this.f2651l = abstractC2923x;
        this.f2650k = i;
    }
}
