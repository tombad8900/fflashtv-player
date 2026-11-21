package androidx.media3.exoplayer.smoothstreaming.offline;

import android.net.Uri;
import androidx.media3.common.C0184b0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.dash.offline.ExecutorC0339a;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifest;
import androidx.media3.exoplayer.smoothstreaming.manifest.SsManifestParser;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import p063h1.AbstractC1118i0;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;
import p097l1.C1646b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class SsDownloader extends SegmentDownloader<SsManifest> {
    public SsDownloader(C0226o0 c0226o0, C1646b c1646b) {
        this(c0226o0, c1646b, new ExecutorC0339a());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SsDownloader(C0226o0 c0226o0, C1646b c1646b, Executor executor) {
        C0184b0 c0184b0M652a = c0226o0.m652a();
        C0211j0 c0211j0 = c0226o0.f1239b;
        c0211j0.getClass();
        Uri uriWithAppendedPath = c0211j0.f1147a;
        String path = uriWithAppendedPath.getPath();
        if (path != null) {
            Matcher matcher = AbstractC1118i0.f4759j.matcher(path);
            if (matcher.matches() && matcher.group(1) == null) {
                uriWithAppendedPath = Uri.withAppendedPath(uriWithAppendedPath, "Manifest");
            }
        }
        c0184b0M652a.f1031b = uriWithAppendedPath;
        this(c0184b0M652a.m608a(), new SsManifestParser(), c1646b, executor, 20000L);
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(InterfaceC1564h interfaceC1564h, SsManifest ssManifest, boolean z7) {
        ArrayList arrayList = new ArrayList();
        for (SsManifest.StreamElement streamElement : ssManifest.streamElements) {
            for (int i = 0; i < streamElement.formats.length; i++) {
                for (int i4 = 0; i4 < streamElement.chunkCount; i4++) {
                    arrayList.add(new SegmentDownloader.Segment(streamElement.getStartTimeUs(i4), new C1568l(streamElement.buildRequestUri(i, i4))));
                }
            }
        }
        return arrayList;
    }

    @Deprecated
    public SsDownloader(C0226o0 c0226o0, ParsingLoadable.Parser<SsManifest> parser, C1646b c1646b, Executor executor) {
        this(c0226o0, parser, c1646b, executor, 20000L);
    }

    public SsDownloader(C0226o0 c0226o0, ParsingLoadable.Parser<SsManifest> parser, C1646b c1646b, Executor executor, long j) {
        super(c0226o0, parser, c1646b, executor, j);
    }
}
