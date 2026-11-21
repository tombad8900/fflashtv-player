package androidx.media3.exoplayer.analytics;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0231q;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0243u;
import androidx.media3.common.C0248v1;
import androidx.media3.common.C0254x1;
import androidx.media3.common.C0256y0;
import androidx.media3.common.C0259z0;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import com.exotv.net.MovieDetailActivity;
import com.exotv.net.R;
import java.util.List;
import p037e0.C0851b;
import p056g1.C1029b;
import p056g1.C1030c;
import p063h1.InterfaceC1122m;
import p063h1.InterfaceC1123n;
import p105m0.C1835o1;
import p105m0.C1844r1;
import p105m0.InterfaceC1833o;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.analytics.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0279a implements InterfaceC1122m, InterfaceC1123n, DefaultTrackSelector.TrackInfo.Factory, InterfaceC1833o {

    /* renamed from: j */
    public final /* synthetic */ int f1566j;

    /* renamed from: k */
    public final /* synthetic */ Object f1567k;

    /* renamed from: l */
    public final /* synthetic */ Object f1568l;

    public /* synthetic */ C0279a(Object obj, int i, Object obj2) {
        this.f1566j = i;
        this.f1567k = obj;
        this.f1568l = obj2;
    }

    @Override // p063h1.InterfaceC1123n
    /* renamed from: c */
    public void mo648c(Object obj, C0243u c0243u) {
        ((DefaultAnalyticsCollector) this.f1567k).lambda$setPlayer$1((InterfaceC0193d1) this.f1568l, (AnalyticsListener) obj, c0243u);
    }

    @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
    public List create(int i, C0233q1 c0233q1, int[] iArr) {
        switch (this.f1566j) {
            case 11:
                return DefaultTrackSelector.lambda$selectVideoTrack$1((DefaultTrackSelector.Parameters) this.f1567k, (int[]) this.f1568l, i, c0233q1, iArr);
            default:
                return DefaultTrackSelector.lambda$selectTextTrack$3((DefaultTrackSelector.Parameters) this.f1567k, (String) this.f1568l, i, c0233q1, iArr);
        }
    }

    @Override // p063h1.InterfaceC1122m
    public void invoke(Object obj) {
        switch (this.f1566j) {
            case 0:
                ((AnalyticsListener) obj).onPlaybackParametersChanged((AnalyticsListener.EventTime) this.f1567k, (C0256y0) this.f1568l);
                break;
            case 1:
                ((AnalyticsListener) obj).onAvailableCommandsChanged((AnalyticsListener.EventTime) this.f1567k, (C0259z0) this.f1568l);
                break;
            case 2:
            default:
                ((AnalyticsListener) obj).onTrackSelectionParametersChanged((AnalyticsListener.EventTime) this.f1567k, (C0248v1) this.f1568l);
                break;
            case 3:
                ((AnalyticsListener) obj).onAudioAttributesChanged((AnalyticsListener.EventTime) this.f1567k, (C0201g) this.f1568l);
                break;
            case 4:
                ((AnalyticsListener) obj).onMetadata((AnalyticsListener.EventTime) this.f1567k, (C0241t0) this.f1568l);
                break;
            case 5:
                ((AnalyticsListener) obj).onTracksChanged((AnalyticsListener.EventTime) this.f1567k, (C0254x1) this.f1568l);
                break;
            case 6:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.f1567k, (List<C1029b>) this.f1568l);
                break;
            case 7:
                ((AnalyticsListener) obj).onDeviceInfoChanged((AnalyticsListener.EventTime) this.f1567k, (C0231q) this.f1568l);
                break;
            case 8:
                DefaultAnalyticsCollector.lambda$onVideoSizeChanged$59((AnalyticsListener.EventTime) this.f1567k, (C0194d2) this.f1568l, (AnalyticsListener) obj);
                break;
            case 9:
                ((AnalyticsListener) obj).onCues((AnalyticsListener.EventTime) this.f1567k, (C1030c) this.f1568l);
                break;
        }
    }

    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) {
        MovieDetailActivity movieDetailActivity = (MovieDetailActivity) this.f1567k;
        View view2 = (View) this.f1568l;
        int i = MovieDetailActivity.f2918Y;
        C1835o1 c1835o1 = c1844r1.f6934a;
        C0851b c0851bMo3563f = c1835o1.mo3563f(647);
        movieDetailActivity.f2932U = !movieDetailActivity.getResources().getBoolean(R.bool.is_large_screen) ? c1835o1.mo3563f(647).f3770b : c1835o1.mo3563f(128).f3770b;
        LinearLayout linearLayout = movieDetailActivity.f2921J;
        if (linearLayout == null) {
            AbstractC2980h.m5139h("body");
            throw null;
        }
        int i4 = c0851bMo3563f.f3769a;
        int i8 = c0851bMo3563f.f3772d;
        linearLayout.setPadding(i4, 0, c0851bMo3563f.f3771c, movieDetailActivity.m1700s(20) + i8);
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.height = i8;
        view2.setLayoutParams(layoutParams2);
        TextView textView = movieDetailActivity.f2924M;
        if (textView == null) {
            AbstractC2980h.m5139h("back");
            throw null;
        }
        textView.setTranslationX(c0851bMo3563f.f3769a);
        TextView textView2 = movieDetailActivity.f2924M;
        if (textView2 != null) {
            textView2.setTranslationY(c0851bMo3563f.f3770b);
            return C1844r1.f6933b;
        }
        AbstractC2980h.m5139h("back");
        throw null;
    }
}
