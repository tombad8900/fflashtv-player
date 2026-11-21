package androidx.media3.exoplayer.trackselection;

import androidx.media3.common.C0233q1;
import androidx.media3.common.C0249w;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface TrackSelection {
    public static final int TYPE_CUSTOM_BASE = 10000;
    public static final int TYPE_UNSET = 0;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    C0249w getFormat(int i);

    int getIndexInTrackGroup(int i);

    C0233q1 getTrackGroup();

    int getType();

    int indexOf(int i);

    int indexOf(C0249w c0249w);

    int length();
}
