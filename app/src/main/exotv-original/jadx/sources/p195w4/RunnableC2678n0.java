package p195w4;

import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.Renderer;
import com.exotv.net.PlayerActivity;
import p024c5.C0651b1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.n0 */
/* loaded from: classes.dex */
public final class RunnableC2678n0 implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f9726j;

    /* renamed from: k */
    public final /* synthetic */ PlayerActivity f9727k;

    public /* synthetic */ RunnableC2678n0(PlayerActivity playerActivity, int i) {
        this.f9726j = i;
        this.f9727k = playerActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f9726j;
        PlayerActivity playerActivity = this.f9727k;
        switch (i) {
            case 0:
                int i4 = PlayerActivity.f2936z0;
                playerActivity.m1715I();
                playerActivity.f2939J.postDelayed(this, 250L);
                break;
            case 1:
                PlayerActivity.m1707t(playerActivity);
                playerActivity.f2939J.postDelayed(this, 500L);
                break;
            default:
                C0651b1 c0651b1 = playerActivity.f2944O;
                ExoPlayer exoPlayer = playerActivity.f2938I;
                if (exoPlayer != null && exoPlayer.isPlaying()) {
                    long currentPosition = exoPlayer.getCurrentPosition();
                    if (currentPosition != playerActivity.f2946Q) {
                        playerActivity.f2946Q = currentPosition;
                        c0651b1.f2576c = System.currentTimeMillis();
                    }
                }
                if (playerActivity.f2947R) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    if (playerActivity.f2945P) {
                        c0651b1.getClass();
                    } else if (jCurrentTimeMillis - c0651b1.f2576c > Renderer.DEFAULT_DURATION_TO_PROGRESS_US) {
                        playerActivity.m1720N("stall");
                    }
                }
                playerActivity.f2939J.postDelayed(this, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                break;
        }
    }
}
