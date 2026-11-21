package p115n1;

import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.io.EOFException;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n1.m */
/* loaded from: classes.dex */
public final class C1986m implements InterfaceC1980i0 {

    /* renamed from: a */
    public final byte[] f7371a = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED];

    @Override // p115n1.InterfaceC1980i0
    public final void format(C0249w c0249w) {
    }

    @Override // p115n1.InterfaceC1980i0
    public final int sampleData(InterfaceC0219m interfaceC0219m, int i, boolean z7, int i4) throws EOFException {
        byte[] bArr = this.f7371a;
        int i8 = interfaceC0219m.read(bArr, 0, Math.min(bArr.length, i));
        if (i8 != -1) {
            return i8;
        }
        if (z7) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // p115n1.InterfaceC1980i0
    public final void sampleMetadata(long j, int i, int i4, int i8, C1978h0 c1978h0) {
    }

    @Override // p115n1.InterfaceC1980i0
    public final void sampleData(C1132w c1132w, int i, int i4) {
        c1132w.m2514H(i);
    }
}
