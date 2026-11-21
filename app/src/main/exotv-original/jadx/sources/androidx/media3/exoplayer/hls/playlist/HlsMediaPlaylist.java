package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import androidx.media3.common.C0212j1;
import androidx.media3.common.C0237s;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.C2181z;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC0995q0;
import p052f6.AbstractC1006u;
import p052f6.C0977k0;
import p052f6.C0981l1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class HlsMediaPlaylist extends HlsPlaylist {
    public static final int PLAYLIST_TYPE_EVENT = 2;
    public static final int PLAYLIST_TYPE_UNKNOWN = 0;
    public static final int PLAYLIST_TYPE_VOD = 1;
    public final int discontinuitySequence;
    public final long durationUs;
    public final boolean hasDiscontinuitySequence;
    public final boolean hasEndTag;
    public final boolean hasPositiveStartOffset;
    public final boolean hasProgramDateTime;
    public final long mediaSequence;
    public final long partTargetDurationUs;
    public final int playlistType;
    public final boolean preciseStart;
    public final C0237s protectionSchemes;
    public final Map<Uri, RenditionReport> renditionReports;
    public final List<Segment> segments;
    public final ServerControl serverControl;
    public final long startOffsetUs;
    public final long startTimeUs;
    public final long targetDurationUs;
    public final List<Part> trailingParts;
    public final int version;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Part extends SegmentBase {
        public final boolean isIndependent;
        public final boolean isPreload;

        public Part(String str, Segment segment, long j, int i, long j8, C0237s c0237s, String str2, String str3, long j9, long j10, boolean z7, boolean z8, boolean z9) {
            super(str, segment, j, i, j8, c0237s, str2, str3, j9, j10, z7);
            this.isIndependent = z8;
            this.isPreload = z9;
        }

        public Part copyWith(long j, int i) {
            return new Part(this.url, this.initializationSegment, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, this.isIndependent, this.isPreload);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaylistType {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class RenditionReport {
        public final long lastMediaSequence;
        public final int lastPartIndex;
        public final Uri playlistUri;

        public RenditionReport(Uri uri, long j, int i) {
            this.playlistUri = uri;
            this.lastMediaSequence = j;
            this.lastPartIndex = i;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class SegmentBase implements Comparable<Long> {
        public final long byteRangeLength;
        public final long byteRangeOffset;
        public final C0237s drmInitData;
        public final long durationUs;
        public final String encryptionIV;
        public final String fullSegmentEncryptionKeyUri;
        public final boolean hasGapTag;
        public final Segment initializationSegment;
        public final int relativeDiscontinuitySequence;
        public final long relativeStartTimeUs;
        public final String url;

        private SegmentBase(String str, Segment segment, long j, int i, long j8, C0237s c0237s, String str2, String str3, long j9, long j10, boolean z7) {
            this.url = str;
            this.initializationSegment = segment;
            this.durationUs = j;
            this.relativeDiscontinuitySequence = i;
            this.relativeStartTimeUs = j8;
            this.drmInitData = c0237s;
            this.fullSegmentEncryptionKeyUri = str2;
            this.encryptionIV = str3;
            this.byteRangeOffset = j9;
            this.byteRangeLength = j10;
            this.hasGapTag = z7;
        }

        @Override // java.lang.Comparable
        public int compareTo(Long l8) {
            if (this.relativeStartTimeUs > l8.longValue()) {
                return 1;
            }
            return this.relativeStartTimeUs < l8.longValue() ? -1 : 0;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ServerControl {
        public final boolean canBlockReload;
        public final boolean canSkipDateRanges;
        public final long holdBackUs;
        public final long partHoldBackUs;
        public final long skipUntilUs;

        public ServerControl(long j, boolean z7, long j8, long j9, boolean z8) {
            this.skipUntilUs = j;
            this.canSkipDateRanges = z7;
            this.holdBackUs = j8;
            this.partHoldBackUs = j9;
            this.canBlockReload = z8;
        }
    }

    public HlsMediaPlaylist(int i, String str, List<String> list, long j, boolean z7, long j8, boolean z8, int i4, long j9, int i8, long j10, long j11, boolean z9, boolean z10, boolean z11, C0237s c0237s, List<Segment> list2, List<Part> list3, ServerControl serverControl, Map<Uri, RenditionReport> map) {
        super(str, list, z9);
        this.playlistType = i;
        this.startTimeUs = j8;
        this.preciseStart = z7;
        this.hasDiscontinuitySequence = z8;
        this.discontinuitySequence = i4;
        this.mediaSequence = j9;
        this.version = i8;
        this.targetDurationUs = j10;
        this.partTargetDurationUs = j11;
        this.hasEndTag = z10;
        this.hasProgramDateTime = z11;
        this.protectionSchemes = c0237s;
        this.segments = AbstractC0983m0.m2165j(list2);
        this.trailingParts = AbstractC0983m0.m2165j(list3);
        this.renditionReports = AbstractC0995q0.m2182a(map);
        if (!list3.isEmpty()) {
            Part part = (Part) AbstractC1006u.m2194i(list3);
            this.durationUs = part.relativeStartTimeUs + part.durationUs;
        } else if (list2.isEmpty()) {
            this.durationUs = 0L;
        } else {
            Segment segment = (Segment) AbstractC1006u.m2194i(list2);
            this.durationUs = segment.relativeStartTimeUs + segment.durationUs;
        }
        this.startOffsetUs = j != -9223372036854775807L ? j >= 0 ? Math.min(this.durationUs, j) : Math.max(0L, this.durationUs + j) : -9223372036854775807L;
        this.hasPositiveStartOffset = j >= 0;
        this.serverControl = serverControl;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    public HlsPlaylist copy(List<C0212j1> list) {
        return this;
    }

    public HlsMediaPlaylist copyWith(long j, int i) {
        return new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, j, true, i, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, this.hasEndTag, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public HlsMediaPlaylist copyWithEndTag() {
        return this.hasEndTag ? this : new HlsMediaPlaylist(this.playlistType, this.baseUri, this.tags, this.startOffsetUs, this.preciseStart, this.startTimeUs, this.hasDiscontinuitySequence, this.discontinuitySequence, this.mediaSequence, this.version, this.targetDurationUs, this.partTargetDurationUs, this.hasIndependentSegments, true, this.hasProgramDateTime, this.protectionSchemes, this.segments, this.trailingParts, this.serverControl, this.renditionReports);
    }

    public long getEndTimeUs() {
        return this.startTimeUs + this.durationUs;
    }

    public boolean isNewerThan(HlsMediaPlaylist hlsMediaPlaylist) {
        if (hlsMediaPlaylist != null) {
            long j = this.mediaSequence;
            long j8 = hlsMediaPlaylist.mediaSequence;
            if (j <= j8) {
                if (j < j8) {
                    return false;
                }
                int size = this.segments.size() - hlsMediaPlaylist.segments.size();
                if (size != 0) {
                    return size > 0;
                }
                int size2 = this.trailingParts.size();
                int size3 = hlsMediaPlaylist.trailingParts.size();
                if (size2 <= size3 && (size2 != size3 || !this.hasEndTag || hlsMediaPlaylist.hasEndTag)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.offline.FilterableManifest
    /* renamed from: copy, reason: avoid collision after fix types in other method */
    public /* bridge */ /* synthetic */ HlsPlaylist copy2(List list) {
        return copy((List<C0212j1>) list);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Segment extends SegmentBase {
        public final List<Part> parts;
        public final String title;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Segment(String str, long j, long j8, String str2, String str3) {
            this(str, null, C2181z.FRAGMENT_ENCODE_SET, 0L, -1, -9223372036854775807L, null, str2, str3, j, j8, false, C0981l1.f4211n);
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        }

        public Segment copyWith(long j, int i) {
            ArrayList arrayList = new ArrayList();
            long j8 = j;
            for (int i4 = 0; i4 < this.parts.size(); i4++) {
                Part part = this.parts.get(i4);
                arrayList.add(part.copyWith(j8, i));
                j8 += part.durationUs;
            }
            return new Segment(this.url, this.initializationSegment, this.title, this.durationUs, i, j, this.drmInitData, this.fullSegmentEncryptionKeyUri, this.encryptionIV, this.byteRangeOffset, this.byteRangeLength, this.hasGapTag, arrayList);
        }

        public Segment(String str, Segment segment, String str2, long j, int i, long j8, C0237s c0237s, String str3, String str4, long j9, long j10, boolean z7, List<Part> list) {
            super(str, segment, j, i, j8, c0237s, str3, str4, j9, j10, z7);
            this.title = str2;
            this.parts = AbstractC0983m0.m2165j(list);
        }
    }
}
