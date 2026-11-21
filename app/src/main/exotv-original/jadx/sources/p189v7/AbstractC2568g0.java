package p189v7;

import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.util.concurrent.atomic.AtomicReference;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.g0 */
/* loaded from: classes.dex */
public abstract class AbstractC2568g0 {

    /* renamed from: a */
    public static final C2566f0 f9299a = new C2566f0(new byte[0], 0, 0, false, false);

    /* renamed from: b */
    public static final int f9300b;

    /* renamed from: c */
    public static final AtomicReference[] f9301c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f9300b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f9301c = atomicReferenceArr;
    }

    /* renamed from: a */
    public static final void m4628a(C2566f0 c2566f0) {
        AbstractC2980h.m5136e("segment", c2566f0);
        if (c2566f0.f9297f != null || c2566f0.f9298g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c2566f0.f9295d) {
            return;
        }
        AtomicReference atomicReference = f9301c[(int) (Thread.currentThread().getId() & (f9300b - 1))];
        C2566f0 c2566f02 = f9299a;
        C2566f0 c2566f03 = (C2566f0) atomicReference.getAndSet(c2566f02);
        if (c2566f03 == c2566f02) {
            return;
        }
        int i = c2566f03 != null ? c2566f03.f9294c : 0;
        if (i >= 65536) {
            atomicReference.set(c2566f03);
            return;
        }
        c2566f0.f9297f = c2566f03;
        c2566f0.f9293b = 0;
        c2566f0.f9294c = i + DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED;
        atomicReference.set(c2566f0);
    }

    /* renamed from: b */
    public static final C2566f0 m4629b() {
        AtomicReference atomicReference = f9301c[(int) (Thread.currentThread().getId() & (f9300b - 1))];
        C2566f0 c2566f0 = f9299a;
        C2566f0 c2566f02 = (C2566f0) atomicReference.getAndSet(c2566f0);
        if (c2566f02 == c2566f0) {
            return new C2566f0();
        }
        if (c2566f02 == null) {
            atomicReference.set(null);
            return new C2566f0();
        }
        atomicReference.set(c2566f02.f9297f);
        c2566f02.f9297f = null;
        c2566f02.f9294c = 0;
        return c2566f02;
    }
}
