package p195w4;

import android.os.Handler;
import android.widget.SeekBar;
import androidx.media3.exoplayer.ExoPlayer;
import com.exotv.net.PlayerActivity;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.q0 */
/* loaded from: classes.dex */
public final class C2684q0 implements SeekBar.OnSeekBarChangeListener {

    /* renamed from: a */
    public final /* synthetic */ PlayerActivity f9751a;

    public C2684q0(PlayerActivity playerActivity) {
        this.f9751a = playerActivity;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i, boolean z7) {
        PlayerActivity playerActivity = this.f9751a;
        RunnableC2664g0 runnableC2664g0 = playerActivity.f2968m0;
        Handler handler = playerActivity.f2939J;
        if (z7) {
            playerActivity.f2967l0 = true;
            handler.removeCallbacks(runnableC2664g0);
            handler.postDelayed(runnableC2664g0, 1200L);
            ExoPlayer exoPlayer = playerActivity.f2938I;
            if (exoPlayer != null) {
                exoPlayer.seekTo(i);
            }
            RunnableC2664g0 runnableC2664g02 = playerActivity.f2940K;
            handler.removeCallbacks(runnableC2664g02);
            handler.postDelayed(runnableC2664g02, 4000L);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        PlayerActivity playerActivity = this.f9751a;
        playerActivity.f2967l0 = true;
        Handler handler = playerActivity.f2939J;
        handler.removeCallbacks(playerActivity.f2968m0);
        handler.removeCallbacks(playerActivity.f2940K);
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        PlayerActivity playerActivity = this.f9751a;
        ExoPlayer exoPlayer = playerActivity.f2938I;
        if (exoPlayer != null) {
            exoPlayer.seekTo(seekBar != null ? seekBar.getProgress() : 0);
        }
        playerActivity.f2967l0 = false;
        playerActivity.m1723Q();
    }
}
