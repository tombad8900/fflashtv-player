package androidx.media;

import android.media.AudioAttributes;
import p049f3.AbstractC0937a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class AudioAttributesImplApi26Parcelizer {
    public static AudioAttributesImplApi26 read(AbstractC0937a abstractC0937a) {
        AudioAttributesImplApi26 audioAttributesImplApi26 = new AudioAttributesImplApi26();
        audioAttributesImplApi26.f966a = (AudioAttributes) abstractC0937a.m2117g(audioAttributesImplApi26.f966a, 1);
        audioAttributesImplApi26.f967b = abstractC0937a.m2116f(audioAttributesImplApi26.f967b, 2);
        return audioAttributesImplApi26;
    }

    public static void write(AudioAttributesImplApi26 audioAttributesImplApi26, AbstractC0937a abstractC0937a) {
        abstractC0937a.getClass();
        abstractC0937a.m2121k(audioAttributesImplApi26.f966a, 1);
        abstractC0937a.m2120j(audioAttributesImplApi26.f967b, 2);
    }
}
