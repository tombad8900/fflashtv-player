package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.analytics.PlayerId;
import java.util.List;
import java.util.Map;
import p115n1.C1964a0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public interface ProgressiveMediaExtractor {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface Factory {
        ProgressiveMediaExtractor createProgressiveMediaExtractor(PlayerId playerId);
    }

    void disableSeekingOnMp3Streams();

    long getCurrentInputPosition();

    void init(InterfaceC0219m interfaceC0219m, Uri uri, Map<String, List<String>> map, long j, long j8, InterfaceC1989p interfaceC1989p);

    int read(C1964a0 c1964a0);

    void release();

    void seek(long j, long j8);
}
