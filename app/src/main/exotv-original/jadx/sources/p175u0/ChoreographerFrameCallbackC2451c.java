package p175u0;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.media3.exoplayer.DefaultLoadControl;
import java.util.Random;
import p062h.RunnableC1085k;
import p202x2.AbstractC2749e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u0.c */
/* loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC2451c implements Choreographer.FrameCallback {

    /* renamed from: j */
    public final /* synthetic */ int f8976j = 1;

    /* renamed from: k */
    public final /* synthetic */ Object f8977k;

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f8976j) {
            case 0:
                ((Runnable) this.f8977k).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? AbstractC2749e.m4830a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new RunnableC1085k((Context) this.f8977k, 1), new Random().nextInt(Math.max(1000, 1)) + DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS);
                break;
        }
    }

    public /* synthetic */ ChoreographerFrameCallbackC2451c(Runnable runnable) {
        this.f8977k = runnable;
    }
}
