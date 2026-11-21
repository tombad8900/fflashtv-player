package android.support.v4.media;

import androidx.media.AudioAttributesCompat;
import java.lang.reflect.InvocationTargetException;
import p049f3.AbstractC0937a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class AudioAttributesCompatParcelizer extends androidx.media.AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC0937a abstractC0937a) {
        return androidx.media.AudioAttributesCompatParcelizer.read(abstractC0937a);
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC0937a abstractC0937a) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.media.AudioAttributesCompatParcelizer.write(audioAttributesCompat, abstractC0937a);
    }
}
