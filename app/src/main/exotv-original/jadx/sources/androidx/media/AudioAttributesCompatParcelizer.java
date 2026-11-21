package androidx.media;

import java.lang.reflect.InvocationTargetException;
import p049f3.AbstractC0937a;
import p049f3.InterfaceC0939c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0937a abstractC0937a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        InterfaceC0939c interfaceC0939cM2118h = audioAttributesCompat.f965a;
        if (abstractC0937a.mo2115e(1)) {
            interfaceC0939cM2118h = abstractC0937a.m2118h();
        }
        audioAttributesCompat.f965a = (AudioAttributesImpl) interfaceC0939cM2118h;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0937a abstractC0937a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        abstractC0937a.getClass();
        AudioAttributesImpl audioAttributesImpl = audioAttributesCompat.f965a;
        abstractC0937a.mo2119i(1);
        abstractC0937a.m2122l(audioAttributesImpl);
    }
}
