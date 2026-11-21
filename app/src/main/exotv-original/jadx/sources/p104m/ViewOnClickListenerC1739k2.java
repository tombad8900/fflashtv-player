package p104m;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import p095l.C1609a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.k2 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1739k2 implements View.OnClickListener {

    /* renamed from: j */
    public final C1609a f6614j;

    /* renamed from: k */
    public final /* synthetic */ C1743l2 f6615k;

    public ViewOnClickListenerC1739k2(C1743l2 c1743l2) {
        this.f6615k = c1743l2;
        Context context = c1743l2.f6626a.getContext();
        CharSequence charSequence = c1743l2.f6633h;
        C1609a c1609a = new C1609a();
        c1609a.f6114n = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
        c1609a.f6116p = DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
        c1609a.f6121u = null;
        c1609a.f6122v = null;
        c1609a.f6123w = false;
        c1609a.f6124x = false;
        c1609a.f6125y = 16;
        c1609a.f6118r = context;
        c1609a.f6110j = charSequence;
        this.f6614j = c1609a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1743l2 c1743l2 = this.f6615k;
        Window.Callback callback = c1743l2.f6636k;
        if (callback == null || !c1743l2.f6637l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f6614j);
    }
}
