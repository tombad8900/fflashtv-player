package p114n0;

import java.lang.reflect.Constructor;
import p115n1.InterfaceC1987n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: n0.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C1950b {

    /* renamed from: a */
    public final /* synthetic */ int f7245a;

    /* renamed from: a */
    public Constructor m3808a() {
        switch (this.f7245a) {
            case 7:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(InterfaceC1987n.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(InterfaceC1987n.class).getConstructor(null);
        }
    }
}
