package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.mediacodec.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0389a implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    public final /* synthetic */ int f1775a;

    /* renamed from: b */
    public final /* synthetic */ MediaCodecAdapter.OnFrameRenderedListener f1776b;

    /* renamed from: c */
    public final /* synthetic */ MediaCodecAdapter f1777c;

    public /* synthetic */ C0389a(MediaCodecAdapter mediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, int i) {
        this.f1775a = i;
        this.f1777c = mediaCodecAdapter;
        this.f1776b = onFrameRenderedListener;
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j8) {
        switch (this.f1775a) {
            case 0:
                ((AsynchronousMediaCodecAdapter) this.f1777c).lambda$setOnFrameRenderedListener$0(this.f1776b, mediaCodec, j, j8);
                break;
            default:
                ((SynchronousMediaCodecAdapter) this.f1777c).lambda$setOnFrameRenderedListener$0(this.f1776b, mediaCodec, j, j8);
                break;
        }
    }
}
