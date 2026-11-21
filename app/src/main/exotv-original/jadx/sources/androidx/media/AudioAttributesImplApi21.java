package androidx.media;

import android.media.AudioAttributes;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* renamed from: a */
    public AudioAttributes f966a;

    /* renamed from: b */
    public int f967b = -1;

    public final boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f966a.equals(((AudioAttributesImplApi21) obj).f966a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f966a.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f966a;
    }
}
