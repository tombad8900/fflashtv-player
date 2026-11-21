package p189v7;

import androidx.media3.exoplayer.DecoderReuseEvaluation;
import p111m6.AbstractC1912g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.f0 */
/* loaded from: classes.dex */
public final class C2566f0 {

    /* renamed from: a */
    public final byte[] f9292a;

    /* renamed from: b */
    public int f9293b;

    /* renamed from: c */
    public int f9294c;

    /* renamed from: d */
    public boolean f9295d;

    /* renamed from: e */
    public final boolean f9296e;

    /* renamed from: f */
    public C2566f0 f9297f;

    /* renamed from: g */
    public C2566f0 f9298g;

    public C2566f0() {
        this.f9292a = new byte[DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED];
        this.f9296e = true;
        this.f9295d = false;
    }

    /* renamed from: a */
    public final C2566f0 m4624a() {
        C2566f0 c2566f0 = this.f9297f;
        if (c2566f0 == this) {
            c2566f0 = null;
        }
        C2566f0 c2566f02 = this.f9298g;
        AbstractC2980h.m5133b(c2566f02);
        c2566f02.f9297f = this.f9297f;
        C2566f0 c2566f03 = this.f9297f;
        AbstractC2980h.m5133b(c2566f03);
        c2566f03.f9298g = this.f9298g;
        this.f9297f = null;
        this.f9298g = null;
        return c2566f0;
    }

    /* renamed from: b */
    public final void m4625b(C2566f0 c2566f0) {
        AbstractC2980h.m5136e("segment", c2566f0);
        c2566f0.f9298g = this;
        c2566f0.f9297f = this.f9297f;
        C2566f0 c2566f02 = this.f9297f;
        AbstractC2980h.m5133b(c2566f02);
        c2566f02.f9298g = c2566f0;
        this.f9297f = c2566f0;
    }

    /* renamed from: c */
    public final C2566f0 m4626c() {
        this.f9295d = true;
        return new C2566f0(this.f9292a, this.f9293b, this.f9294c, true, false);
    }

    /* renamed from: d */
    public final void m4627d(C2566f0 c2566f0, int i) {
        AbstractC2980h.m5136e("sink", c2566f0);
        byte[] bArr = c2566f0.f9292a;
        if (!c2566f0.f9296e) {
            throw new IllegalStateException("only owner can write");
        }
        int i4 = c2566f0.f9294c;
        int i8 = i4 + i;
        if (i8 > 8192) {
            if (c2566f0.f9295d) {
                throw new IllegalArgumentException();
            }
            int i9 = c2566f0.f9293b;
            if (i8 - i9 > 8192) {
                throw new IllegalArgumentException();
            }
            AbstractC1912g.m3726j0(0, i9, i4, bArr, bArr);
            c2566f0.f9294c -= c2566f0.f9293b;
            c2566f0.f9293b = 0;
        }
        int i10 = c2566f0.f9294c;
        int i11 = this.f9293b;
        AbstractC1912g.m3726j0(i10, i11, i11 + i, this.f9292a, bArr);
        c2566f0.f9294c += i;
        this.f9293b += i;
    }

    public C2566f0(byte[] bArr, int i, int i4, boolean z7, boolean z8) {
        AbstractC2980h.m5136e("data", bArr);
        this.f9292a = bArr;
        this.f9293b = i;
        this.f9294c = i4;
        this.f9295d = z7;
        this.f9296e = z8;
    }
}
