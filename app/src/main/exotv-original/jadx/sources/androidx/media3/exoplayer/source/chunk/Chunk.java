package androidx.media3.exoplayer.source.chunk;

import android.net.Uri;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.upstream.Loader;
import java.util.List;
import java.util.Map;
import p089k1.C1555b0;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class Chunk implements Loader.Loadable {
    protected final C1555b0 dataSource;
    public final C1568l dataSpec;
    public final long endTimeUs;
    public final long loadTaskId;
    public final long startTimeUs;
    public final C0249w trackFormat;
    public final Object trackSelectionData;
    public final int trackSelectionReason;
    public final int type;

    public Chunk(InterfaceC1564h interfaceC1564h, C1568l c1568l, int i, C0249w c0249w, int i4, Object obj, long j, long j8) {
        this.dataSource = new C1555b0(interfaceC1564h);
        c1568l.getClass();
        this.dataSpec = c1568l;
        this.type = i;
        this.trackFormat = c0249w;
        this.trackSelectionReason = i4;
        this.trackSelectionData = obj;
        this.startTimeUs = j;
        this.endTimeUs = j8;
        this.loadTaskId = LoadEventInfo.getNewId();
    }

    public final long bytesLoaded() {
        return this.dataSource.f5954k;
    }

    public final long getDurationUs() {
        return this.endTimeUs - this.startTimeUs;
    }

    public final Map<String, List<String>> getResponseHeaders() {
        return this.dataSource.f5956m;
    }

    public final Uri getUri() {
        return this.dataSource.f5955l;
    }
}
