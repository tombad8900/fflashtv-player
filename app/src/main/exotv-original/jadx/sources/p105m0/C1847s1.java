package p105m0;

import android.view.View;
import android.view.Window;
import androidx.media3.common.C0169a;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import com.bumptech.glide.AbstractC0715d;
import p095l.C1629o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.s1 */
/* loaded from: classes.dex */
public class C1847s1 extends AbstractC0715d {

    /* renamed from: n */
    public final Window f6936n;

    /* renamed from: o */
    public final C1629o f6937o;

    public C1847s1(Window window, C1629o c1629o) {
        this.f6936n = window;
        this.f6937o = c1629o;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: L */
    public final void mo1583L(int i) {
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i & i4) != 0) {
                if (i4 == 1) {
                    m3627s0(4);
                } else if (i4 == 2) {
                    m3627s0(2);
                } else if (i4 == 8) {
                    ((C0169a) this.f6937o.f6229j).mo592a();
                }
            }
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: i0 */
    public final void mo1594i0(boolean z7) {
        if (!z7) {
            m3628t0(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED);
            return;
        }
        Window window = this.f6936n;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        m3627s0(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: j0 */
    public final void mo1596j0() {
        this.f6936n.getDecorView().setTag(356039078, 2);
        m3628t0(2048);
        m3627s0(DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED);
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: n0 */
    public final void mo1601n0(int i) {
        for (int i4 = 1; i4 <= 512; i4 <<= 1) {
            if ((i & i4) != 0) {
                if (i4 == 1) {
                    m3628t0(4);
                    this.f6936n.clearFlags(1024);
                } else if (i4 == 2) {
                    m3628t0(2);
                } else if (i4 == 8) {
                    ((C0169a) this.f6937o.f6229j).mo593b();
                }
            }
        }
    }

    /* renamed from: s0 */
    public final void m3627s0(int i) {
        View decorView = this.f6936n.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    /* renamed from: t0 */
    public final void m3628t0(int i) {
        View decorView = this.f6936n.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
