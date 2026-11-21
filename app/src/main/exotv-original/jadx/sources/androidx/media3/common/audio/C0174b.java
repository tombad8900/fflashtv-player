package androidx.media3.common.audio;

import java.util.Arrays;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.audio.b */
/* loaded from: classes.dex */
public final class C0174b {

    /* renamed from: e */
    public static final C0174b f980e = new C0174b(-1, -1, -1);

    /* renamed from: a */
    public final int f981a;

    /* renamed from: b */
    public final int f982b;

    /* renamed from: c */
    public final int f983c;

    /* renamed from: d */
    public final int f984d;

    public C0174b(int i, int i4, int i8) {
        this.f981a = i;
        this.f982b = i4;
        this.f983c = i8;
        this.f984d = AbstractC1118i0.m2423N(i8) ? AbstractC1118i0.m2414E(i8, i4) : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0174b)) {
            return false;
        }
        C0174b c0174b = (C0174b) obj;
        return this.f981a == c0174b.f981a && this.f982b == c0174b.f982b && this.f983c == c0174b.f983c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f981a), Integer.valueOf(this.f982b), Integer.valueOf(this.f983c)});
    }

    public final String toString() {
        return "AudioFormat[sampleRate=" + this.f981a + ", channelCount=" + this.f982b + ", encoding=" + this.f983c + ']';
    }
}
