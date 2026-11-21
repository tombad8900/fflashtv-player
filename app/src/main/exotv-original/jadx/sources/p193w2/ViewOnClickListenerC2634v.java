package p193w2;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.RunnableC0127c0;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0189c1;
import androidx.media3.common.C0194d2;
import androidx.media3.common.C0221m1;
import androidx.media3.common.C0254x1;
import androidx.media3.common.InterfaceC0185b1;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.audio.RunnableC0317f;
import androidx.media3.p009ui.PlayerView;
import androidx.media3.p009ui.SubtitleView;
import p056g1.C1030c;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.v */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC2634v implements InterfaceC0185b1, View.OnClickListener, InterfaceC2626n, InterfaceC2613g {

    /* renamed from: j */
    public final C0221m1 f9598j = new C0221m1();

    /* renamed from: k */
    public Object f9599k;

    /* renamed from: l */
    public final /* synthetic */ PlayerView f9600l;

    public ViewOnClickListenerC2634v(PlayerView playerView) {
        this.f9600l = playerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.f1927P;
        this.f9600l.m1048i();
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onCues(C1030c c1030c) {
        SubtitleView subtitleView = this.f9600l.f1951r;
        if (subtitleView != null) {
            subtitleView.setCues(c1030c.f4388a);
        }
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onPlayWhenReadyChanged(boolean z7, int i) {
        int i4 = PlayerView.f1927P;
        PlayerView playerView = this.f9600l;
        playerView.m1050k();
        if (!playerView.m1043d() || !playerView.f1940M) {
            playerView.m1044e(false);
            return;
        }
        C2627o c2627o = playerView.f1954u;
        if (c2627o != null) {
            c2627o.m4706f();
        }
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onPlaybackStateChanged(int i) {
        int i4 = PlayerView.f1927P;
        PlayerView playerView = this.f9600l;
        playerView.m1050k();
        playerView.m1052m();
        if (!playerView.m1043d() || !playerView.f1940M) {
            playerView.m1044e(false);
            return;
        }
        C2627o c2627o = playerView.f1954u;
        if (c2627o != null) {
            c2627o.m4706f();
        }
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onPositionDiscontinuity(C0189c1 c0189c1, C0189c1 c0189c12, int i) {
        C2627o c2627o;
        int i4 = PlayerView.f1927P;
        PlayerView playerView = this.f9600l;
        if (playerView.m1043d() && playerView.f1940M && (c2627o = playerView.f1954u) != null) {
            c2627o.m4706f();
        }
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onRenderedFirstFrame() {
        PlayerView playerView = this.f9600l;
        View view = playerView.f1945l;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.m1041b()) {
                playerView.m1042c();
                return;
            }
            ImageView imageView = playerView.f1949p;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onSurfaceSizeChanged(int i, int i4) {
        PlayerView playerView = this.f9600l;
        View view = playerView.f1946m;
        if (AbstractC1118i0.f4750a == 34 && (view instanceof SurfaceView) && playerView.f1942O) {
            C2638z c2638z = playerView.f1948o;
            c2638z.getClass();
            playerView.f1957x.post(new RunnableC0317f(c2638z, (SurfaceView) view, new RunnableC0127c0(21, playerView), 4));
        }
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onTracksChanged(C0254x1 c0254x1) {
        PlayerView playerView = this.f9600l;
        InterfaceC0193d1 interfaceC0193d1 = playerView.f1929B;
        interfaceC0193d1.getClass();
        AbstractC0230p1 currentTimeline = interfaceC0193d1.isCommandAvailable(17) ? interfaceC0193d1.getCurrentTimeline() : AbstractC0230p1.EMPTY;
        if (currentTimeline.isEmpty()) {
            this.f9599k = null;
        } else {
            boolean zIsCommandAvailable = interfaceC0193d1.isCommandAvailable(30);
            C0221m1 c0221m1 = this.f9598j;
            if (!zIsCommandAvailable || interfaceC0193d1.getCurrentTracks().f1547a.isEmpty()) {
                Object obj = this.f9599k;
                if (obj != null) {
                    int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                    if (indexOfPeriod != -1) {
                        if (interfaceC0193d1.getCurrentMediaItemIndex() == currentTimeline.getPeriod(indexOfPeriod, c0221m1).f1206c) {
                            return;
                        }
                    }
                    this.f9599k = null;
                }
            } else {
                this.f9599k = currentTimeline.getPeriod(interfaceC0193d1.getCurrentPeriodIndex(), c0221m1, true).f1205b;
            }
        }
        playerView.m1053n(false);
    }

    @Override // androidx.media3.common.InterfaceC0185b1
    public final void onVideoSizeChanged(C0194d2 c0194d2) {
        PlayerView playerView;
        InterfaceC0193d1 interfaceC0193d1;
        if (c0194d2.equals(C0194d2.f1085d) || (interfaceC0193d1 = (playerView = this.f9600l).f1929B) == null || interfaceC0193d1.getPlaybackState() == 1) {
            return;
        }
        playerView.m1049j();
    }
}
