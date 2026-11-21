package androidx.media3.exoplayer.source;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import p089k1.C1568l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class LoadEventInfo {
    private static final AtomicLong idSource = new AtomicLong();
    public final long bytesLoaded;
    public final C1568l dataSpec;
    public final long elapsedRealtimeMs;
    public final long loadDurationMs;
    public final long loadTaskId;
    public final Map<String, List<String>> responseHeaders;
    public final Uri uri;

    public LoadEventInfo(long j, C1568l c1568l, long j8) {
        this(j, c1568l, c1568l.f5996a, Collections.EMPTY_MAP, j8, 0L, 0L);
    }

    public static long getNewId() {
        return idSource.getAndIncrement();
    }

    public LoadEventInfo(long j, C1568l c1568l, Uri uri, Map<String, List<String>> map, long j8, long j9, long j10) {
        this.loadTaskId = j;
        this.dataSpec = c1568l;
        this.uri = uri;
        this.responseHeaders = map;
        this.elapsedRealtimeMs = j8;
        this.loadDurationMs = j9;
        this.bytesLoaded = j10;
    }
}
