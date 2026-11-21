package androidx.media3.exoplayer.text;

import java.util.List;
import p056g1.C1029b;
import p056g1.C1030c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface TextOutput {
    void onCues(C1030c c1030c);

    @Deprecated
    default void onCues(List<C1029b> list) {
    }
}
