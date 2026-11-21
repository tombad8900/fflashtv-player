package androidx.media3.exoplayer.hls.offline;

import android.net.Uri;
import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.dash.offline.ExecutorC0339a;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsPlaylistParser;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import p063h1.AbstractC1101a;
import p089k1.C1568l;
import p089k1.InterfaceC1564h;
import p097l1.C1646b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class HlsDownloader extends SegmentDownloader<HlsPlaylist> {
    public HlsDownloader(C0226o0 c0226o0, C1646b c1646b) {
        this(c0226o0, c1646b, new ExecutorC0339a());
    }

    private void addMediaPlaylistDataSpecs(List<Uri> list, List<C1568l> list2) {
        for (int i = 0; i < list.size(); i++) {
            list2.add(SegmentDownloader.getCompressibleDataSpec(list.get(i)));
        }
    }

    private void addSegment(HlsMediaPlaylist hlsMediaPlaylist, HlsMediaPlaylist.Segment segment, HashSet<Uri> hashSet, ArrayList<SegmentDownloader.Segment> arrayList) {
        String str = hlsMediaPlaylist.baseUri;
        long j = hlsMediaPlaylist.startTimeUs + segment.relativeStartTimeUs;
        String str2 = segment.fullSegmentEncryptionKeyUri;
        if (str2 != null) {
            Uri uriM2345C = AbstractC1101a.m2345C(str, str2);
            if (hashSet.add(uriM2345C)) {
                arrayList.add(new SegmentDownloader.Segment(j, SegmentDownloader.getCompressibleDataSpec(uriM2345C)));
            }
        }
        arrayList.add(new SegmentDownloader.Segment(j, new C1568l(AbstractC1101a.m2345C(str, segment.url), segment.byteRangeOffset, segment.byteRangeLength)));
    }

    public HlsDownloader(C0226o0 c0226o0, C1646b c1646b, Executor executor) {
        this(c0226o0, new HlsPlaylistParser(), c1646b, executor, 20000L);
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(InterfaceC1564h interfaceC1564h, HlsPlaylist hlsPlaylist, boolean z7) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (hlsPlaylist instanceof HlsMultivariantPlaylist) {
            addMediaPlaylistDataSpecs(((HlsMultivariantPlaylist) hlsPlaylist).mediaPlaylistUrls, arrayList);
        } else {
            arrayList.add(SegmentDownloader.getCompressibleDataSpec(Uri.parse(hlsPlaylist.baseUri)));
        }
        ArrayList<SegmentDownloader.Segment> arrayList2 = new ArrayList<>();
        HashSet<Uri> hashSet = new HashSet<>();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1568l c1568l = (C1568l) obj;
            arrayList2.add(new SegmentDownloader.Segment(0L, c1568l));
            try {
                HlsMediaPlaylist hlsMediaPlaylist = (HlsMediaPlaylist) getManifest(interfaceC1564h, c1568l, z7);
                List<HlsMediaPlaylist.Segment> list = hlsMediaPlaylist.segments;
                HlsMediaPlaylist.Segment segment = null;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    HlsMediaPlaylist.Segment segment2 = list.get(i4);
                    HlsMediaPlaylist.Segment segment3 = segment2.initializationSegment;
                    if (segment3 != null && segment3 != segment) {
                        addSegment(hlsMediaPlaylist, segment3, hashSet, arrayList2);
                        segment = segment3;
                    }
                    addSegment(hlsMediaPlaylist, segment2, hashSet, arrayList2);
                }
            } catch (IOException e) {
                if (!z7) {
                    throw e;
                }
            }
        }
        return arrayList2;
    }

    @Deprecated
    public HlsDownloader(C0226o0 c0226o0, ParsingLoadable.Parser<HlsPlaylist> parser, C1646b c1646b, Executor executor) {
        this(c0226o0, parser, c1646b, executor, 20000L);
    }

    public HlsDownloader(C0226o0 c0226o0, ParsingLoadable.Parser<HlsPlaylist> parser, C1646b c1646b, Executor executor, long j) {
        super(c0226o0, parser, c1646b, executor, j);
    }
}
