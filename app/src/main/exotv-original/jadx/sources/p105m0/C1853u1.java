package p105m0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.media3.common.C0169a;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.bumptech.glide.AbstractC0715d;
import p095l.C1629o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.u1 */
/* loaded from: classes.dex */
public class C1853u1 extends AbstractC0715d {

    /* renamed from: n */
    public final WindowInsetsController f6946n;

    /* renamed from: o */
    public final C1629o f6947o;

    /* renamed from: p */
    public final Window f6948p;

    public C1853u1(Window window, C1629o c1629o) {
        this.f6946n = window.getInsetsController();
        this.f6947o = c1629o;
        this.f6948p = window;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: L */
    public final void mo1583L(int i) {
        this.f6946n.hide(i & (-9));
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: h0 */
    public final void mo1592h0(boolean z7) {
        Window window = this.f6948p;
        if (z7) {
            if (window != null) {
                m3633s0(16);
            }
            this.f6946n.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                m3634t0(16);
            }
            this.f6946n.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: i0 */
    public final void mo1594i0(boolean z7) {
        Window window = this.f6948p;
        if (z7) {
            if (window != null) {
                m3633s0(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED);
            }
            this.f6946n.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                m3634t0(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED);
            }
            this.f6946n.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: j0 */
    public void mo1596j0() {
        Window window = this.f6948p;
        if (window == null) {
            this.f6946n.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        m3634t0(2048);
        m3633s0(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: n0 */
    public final void mo1601n0(int i) {
        if ((i & 8) != 0) {
            ((C0169a) this.f6947o.f6229j).mo593b();
        }
        this.f6946n.show(i & (-9));
    }

    /* renamed from: s0 */
    public final void m3633s0(int i) {
        View decorView = this.f6948p.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* renamed from: t0 */
    public final void m3634t0(int i) {
        View decorView = this.f6948p.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
