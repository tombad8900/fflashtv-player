package androidx.media3.exoplayer.dash.offline;

import androidx.media3.common.C0226o0;
import androidx.media3.exoplayer.dash.BaseUrlExclusionList;
import androidx.media3.exoplayer.dash.DashSegmentIndex;
import androidx.media3.exoplayer.dash.DashUtil;
import androidx.media3.exoplayer.dash.DashWrappingSegmentIndex;
import androidx.media3.exoplayer.dash.manifest.AdaptationSet;
import androidx.media3.exoplayer.dash.manifest.BaseUrl;
import androidx.media3.exoplayer.dash.manifest.DashManifest;
import androidx.media3.exoplayer.dash.manifest.DashManifestParser;
import androidx.media3.exoplayer.dash.manifest.Period;
import androidx.media3.exoplayer.dash.manifest.RangedUri;
import androidx.media3.exoplayer.dash.manifest.Representation;
import androidx.media3.exoplayer.offline.DownloadException;
import androidx.media3.exoplayer.offline.SegmentDownloader;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import p052f6.C0996q1;
import p063h1.AbstractC1118i0;
import p063h1.AbstractRunnableFutureC1133x;
import p089k1.InterfaceC1564h;
import p097l1.C1646b;
import p115n1.C1981j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    public DashDownloader(C0226o0 c0226o0, C1646b c1646b) {
        this(c0226o0, c1646b, new ExecutorC0339a());
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void addSegmentsForAdaptationSet(InterfaceC1564h interfaceC1564h, AdaptationSet adaptationSet, long j, long j8, boolean z7, ArrayList<SegmentDownloader.Segment> arrayList) throws IOException {
        DashSegmentIndex segmentIndex;
        DashDownloader dashDownloader = this;
        int i = 0;
        while (i < adaptationSet.representations.size()) {
            Representation representation = adaptationSet.representations.get(i);
            try {
                try {
                    segmentIndex = dashDownloader.getSegmentIndex(interfaceC1564h, adaptationSet.type, representation, z7);
                } catch (IOException e) {
                    e = e;
                    if (z7) {
                        throw e;
                    }
                    i++;
                    dashDownloader = this;
                }
            } catch (IOException e8) {
                e = e8;
            }
            if (segmentIndex != null) {
                long segmentCount = segmentIndex.getSegmentCount(j8);
                if (segmentCount == -1) {
                    throw new DownloadException("Unbounded segment index");
                }
                BaseUrl baseUrlSelectBaseUrl = dashDownloader.baseUrlExclusionList.selectBaseUrl(representation.baseUrls);
                int i4 = AbstractC1118i0.f4750a;
                String str = baseUrlSelectBaseUrl.url;
                RangedUri initializationUri = representation.getInitializationUri();
                if (initializationUri != null) {
                    arrayList.add(dashDownloader.createSegment(representation, str, j, initializationUri));
                }
                RangedUri indexUri = representation.getIndexUri();
                if (indexUri != null) {
                    arrayList.add(createSegment(representation, str, j, indexUri));
                }
                long firstSegmentNum = segmentIndex.getFirstSegmentNum();
                long j9 = (segmentCount + firstSegmentNum) - 1;
                while (firstSegmentNum <= j9) {
                    arrayList.add(createSegment(representation, str, segmentIndex.getTimeUs(firstSegmentNum) + j, segmentIndex.getSegmentUrl(firstSegmentNum)));
                    firstSegmentNum++;
                }
                i++;
                dashDownloader = this;
            } else {
                try {
                    throw new DownloadException("Missing segment index");
                } catch (IOException e9) {
                    e = e9;
                    if (z7) {
                    }
                }
            }
        }
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j, RangedUri rangedUri) {
        return new SegmentDownloader.Segment(j, DashUtil.buildDataSpec(representation, str, rangedUri, 0, C0996q1.f4246p));
    }

    private DashSegmentIndex getSegmentIndex(final InterfaceC1564h interfaceC1564h, final int i, final Representation representation, boolean z7) {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        C1981j c1981j = (C1981j) execute(new AbstractRunnableFutureC1133x() { // from class: androidx.media3.exoplayer.dash.offline.DashDownloader.1
            @Override // p063h1.AbstractRunnableFutureC1133x
            public C1981j doWork() {
                return DashUtil.loadChunkIndex(interfaceC1564h, i, representation);
            }
        }, z7);
        if (c1981j == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(c1981j, representation.presentationTimeOffsetUs);
    }

    public DashDownloader(C0226o0 c0226o0, C1646b c1646b, Executor executor) {
        this(c0226o0, new DashManifestParser(), c1646b, executor, 20000L);
    }

    @Override // androidx.media3.exoplayer.offline.SegmentDownloader
    public List<SegmentDownloader.Segment> getSegments(InterfaceC1564h interfaceC1564h, DashManifest dashManifest, boolean z7) throws IOException {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            Period period = dashManifest.getPeriod(i);
            long jM2428S = AbstractC1118i0.m2428S(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            List<AdaptationSet> list = period.adaptationSets;
            for (int i4 = 0; i4 < list.size(); i4++) {
                addSegmentsForAdaptationSet(interfaceC1564h, list.get(i4), jM2428S, periodDurationUs, z7, arrayList);
            }
        }
        return arrayList;
    }

    @Deprecated
    public DashDownloader(C0226o0 c0226o0, ParsingLoadable.Parser<DashManifest> parser, C1646b c1646b, Executor executor) {
        this(c0226o0, parser, c1646b, executor, 20000L);
    }

    public DashDownloader(C0226o0 c0226o0, ParsingLoadable.Parser<DashManifest> parser, C1646b c1646b, Executor executor, long j) {
        super(c0226o0, parser, c1646b, executor, j);
        this.baseUrlExclusionList = new BaseUrlExclusionList();
    }
}
