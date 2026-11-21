package androidx.media;

import p049f3.AbstractC0937a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC0937a abstractC0937a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f968a = abstractC0937a.m2116f(audioAttributesImplBase.f968a, 1);
        audioAttributesImplBase.f969b = abstractC0937a.m2116f(audioAttributesImplBase.f969b, 2);
        audioAttributesImplBase.f970c = abstractC0937a.m2116f(audioAttributesImplBase.f970c, 3);
        audioAttributesImplBase.f971d = abstractC0937a.m2116f(audioAttributesImplBase.f971d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC0937a abstractC0937a) {
        abstractC0937a.getClass();
        abstractC0937a.m2120j(audioAttributesImplBase.f968a, 1);
        abstractC0937a.m2120j(audioAttributesImplBase.f969b, 2);
        abstractC0937a.m2120j(audioAttributesImplBase.f970c, 3);
        abstractC0937a.m2120j(audioAttributesImplBase.f971d, 4);
    }
}
