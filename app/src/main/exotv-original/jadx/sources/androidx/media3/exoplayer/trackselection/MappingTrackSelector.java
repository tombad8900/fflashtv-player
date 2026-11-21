package androidx.media3.exoplayer.trackselection;

import android.util.Pair;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0233q1;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Objects;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public abstract class MappingTrackSelector extends TrackSelector {
    private MappedTrackInfo currentMappedTrackInfo;

    private static int findRenderer(RendererCapabilities[] rendererCapabilitiesArr, C0233q1 c0233q1, int[] iArr, boolean z7) {
        int length = rendererCapabilitiesArr.length;
        int i = 0;
        boolean z8 = true;
        for (int i4 = 0; i4 < rendererCapabilitiesArr.length; i4++) {
            RendererCapabilities rendererCapabilities = rendererCapabilitiesArr[i4];
            int iMax = 0;
            for (int i8 = 0; i8 < c0233q1.f1319a; i8++) {
                iMax = Math.max(iMax, RendererCapabilities.getFormatSupport(rendererCapabilities.supportsFormat(c0233q1.f1322d[i8])));
            }
            boolean z9 = iArr[i4] == 0;
            if (iMax > i || (iMax == i && z7 && !z8 && z9)) {
                length = i4;
                z8 = z9;
                i = iMax;
            }
        }
        return length;
    }

    private static int[] getFormatSupport(RendererCapabilities rendererCapabilities, C0233q1 c0233q1) {
        int[] iArr = new int[c0233q1.f1319a];
        for (int i = 0; i < c0233q1.f1319a; i++) {
            iArr[i] = rendererCapabilities.supportsFormat(c0233q1.f1322d[i]);
        }
        return iArr;
    }

    private static int[] getMixedMimeTypeAdaptationSupports(RendererCapabilities[] rendererCapabilitiesArr) {
        int length = rendererCapabilitiesArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = rendererCapabilitiesArr[i].supportsMixedMimeTypeAdaptation();
        }
        return iArr;
    }

    public final MappedTrackInfo getCurrentMappedTrackInfo() {
        return this.currentMappedTrackInfo;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final void onSelectionActivated(Object obj) {
        this.currentMappedTrackInfo = (MappedTrackInfo) obj;
    }

    public abstract Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, AbstractC0230p1 abstractC0230p1);

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public final TrackSelectorResult selectTracks(RendererCapabilities[] rendererCapabilitiesArr, TrackGroupArray trackGroupArray, MediaSource.MediaPeriodId mediaPeriodId, AbstractC0230p1 abstractC0230p1) {
        int[] iArr = new int[rendererCapabilitiesArr.length + 1];
        int length = rendererCapabilitiesArr.length + 1;
        C0233q1[][] c0233q1Arr = new C0233q1[length][];
        int[][][] iArr2 = new int[rendererCapabilitiesArr.length + 1][][];
        for (int i = 0; i < length; i++) {
            int i4 = trackGroupArray.length;
            c0233q1Arr[i] = new C0233q1[i4];
            iArr2[i] = new int[i4][];
        }
        int[] mixedMimeTypeAdaptationSupports = getMixedMimeTypeAdaptationSupports(rendererCapabilitiesArr);
        for (int i8 = 0; i8 < trackGroupArray.length; i8++) {
            C0233q1 c0233q1 = trackGroupArray.get(i8);
            int iFindRenderer = findRenderer(rendererCapabilitiesArr, c0233q1, iArr, c0233q1.f1321c == 5);
            int[] formatSupport = iFindRenderer == rendererCapabilitiesArr.length ? new int[c0233q1.f1319a] : getFormatSupport(rendererCapabilitiesArr[iFindRenderer], c0233q1);
            int i9 = iArr[iFindRenderer];
            c0233q1Arr[iFindRenderer][i9] = c0233q1;
            iArr2[iFindRenderer][i9] = formatSupport;
            iArr[iFindRenderer] = i9 + 1;
        }
        TrackGroupArray[] trackGroupArrayArr = new TrackGroupArray[rendererCapabilitiesArr.length];
        String[] strArr = new String[rendererCapabilitiesArr.length];
        int[] iArr3 = new int[rendererCapabilitiesArr.length];
        for (int i10 = 0; i10 < rendererCapabilitiesArr.length; i10++) {
            int i11 = iArr[i10];
            trackGroupArrayArr[i10] = new TrackGroupArray((C0233q1[]) AbstractC1118i0.m2430U(i11, c0233q1Arr[i10]));
            iArr2[i10] = (int[][]) AbstractC1118i0.m2430U(i11, iArr2[i10]);
            strArr[i10] = rendererCapabilitiesArr[i10].getName();
            iArr3[i10] = rendererCapabilitiesArr[i10].getTrackType();
        }
        MappedTrackInfo mappedTrackInfo = new MappedTrackInfo(strArr, iArr3, trackGroupArrayArr, mixedMimeTypeAdaptationSupports, iArr2, new TrackGroupArray((C0233q1[]) AbstractC1118i0.m2430U(iArr[rendererCapabilitiesArr.length], c0233q1Arr[rendererCapabilitiesArr.length])));
        Pair<RendererConfiguration[], ExoTrackSelection[]> pairSelectTracks = selectTracks(mappedTrackInfo, iArr2, mixedMimeTypeAdaptationSupports, mediaPeriodId, abstractC0230p1);
        return new TrackSelectorResult((RendererConfiguration[]) pairSelectTracks.first, (ExoTrackSelection[]) pairSelectTracks.second, TrackSelectionUtil.buildTracks(mappedTrackInfo, (TrackSelection[]) pairSelectTracks.second), mappedTrackInfo);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class MappedTrackInfo {
        public static final int RENDERER_SUPPORT_EXCEEDS_CAPABILITIES_TRACKS = 2;
        public static final int RENDERER_SUPPORT_NO_TRACKS = 0;
        public static final int RENDERER_SUPPORT_PLAYABLE_TRACKS = 3;
        public static final int RENDERER_SUPPORT_UNSUPPORTED_TRACKS = 1;
        private final int rendererCount;
        private final int[][][] rendererFormatSupports;
        private final int[] rendererMixedMimeTypeAdaptiveSupports;
        private final String[] rendererNames;
        private final TrackGroupArray[] rendererTrackGroups;
        private final int[] rendererTrackTypes;
        private final TrackGroupArray unmappedTrackGroups;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface RendererSupport {
        }

        public MappedTrackInfo(String[] strArr, int[] iArr, TrackGroupArray[] trackGroupArrayArr, int[] iArr2, int[][][] iArr3, TrackGroupArray trackGroupArray) {
            this.rendererNames = strArr;
            this.rendererTrackTypes = iArr;
            this.rendererTrackGroups = trackGroupArrayArr;
            this.rendererFormatSupports = iArr3;
            this.rendererMixedMimeTypeAdaptiveSupports = iArr2;
            this.unmappedTrackGroups = trackGroupArray;
            this.rendererCount = iArr.length;
        }

        public int getAdaptiveSupport(int i, int i4, boolean z7) {
            int i8 = this.rendererTrackGroups[i].get(i4).f1319a;
            int[] iArr = new int[i8];
            int i9 = 0;
            for (int i10 = 0; i10 < i8; i10++) {
                int trackSupport = getTrackSupport(i, i4, i10);
                if (trackSupport == 4 || (z7 && trackSupport == 3)) {
                    iArr[i9] = i10;
                    i9++;
                }
            }
            return getAdaptiveSupport(i, i4, Arrays.copyOf(iArr, i9));
        }

        public int getCapabilities(int i, int i4, int i8) {
            return this.rendererFormatSupports[i][i4][i8];
        }

        public int getRendererCount() {
            return this.rendererCount;
        }

        public String getRendererName(int i) {
            return this.rendererNames[i];
        }

        public int getRendererSupport(int i) {
            int iMax = 0;
            for (int[] iArr : this.rendererFormatSupports[i]) {
                for (int i4 : iArr) {
                    int formatSupport = RendererCapabilities.getFormatSupport(i4);
                    int i8 = 1;
                    if (formatSupport != 0 && formatSupport != 1 && formatSupport != 2) {
                        if (formatSupport != 3) {
                            if (formatSupport == 4) {
                                return 3;
                            }
                            throw new IllegalStateException();
                        }
                        i8 = 2;
                    }
                    iMax = Math.max(iMax, i8);
                }
            }
            return iMax;
        }

        public int getRendererType(int i) {
            return this.rendererTrackTypes[i];
        }

        public TrackGroupArray getTrackGroups(int i) {
            return this.rendererTrackGroups[i];
        }

        public int getTrackSupport(int i, int i4, int i8) {
            return RendererCapabilities.getFormatSupport(getCapabilities(i, i4, i8));
        }

        public int getTypeSupport(int i) {
            int iMax = 0;
            for (int i4 = 0; i4 < this.rendererCount; i4++) {
                if (this.rendererTrackTypes[i4] == i) {
                    iMax = Math.max(iMax, getRendererSupport(i4));
                }
            }
            return iMax;
        }

        public TrackGroupArray getUnmappedTrackGroups() {
            return this.unmappedTrackGroups;
        }

        public int getAdaptiveSupport(int i, int i4, int[] iArr) {
            int i8 = 0;
            int iMin = 16;
            String str = null;
            boolean z7 = false;
            int i9 = 0;
            while (i8 < iArr.length) {
                String str2 = this.rendererTrackGroups[i].get(i4).f1322d[iArr[i8]].f1522n;
                int i10 = i9 + 1;
                if (i9 == 0) {
                    str = str2;
                } else {
                    z7 |= !Objects.equals(str, str2);
                }
                iMin = Math.min(iMin, RendererCapabilities.getAdaptiveSupport(this.rendererFormatSupports[i][i4][i8]));
                i8++;
                i9 = i10;
            }
            return z7 ? Math.min(iMin, this.rendererMixedMimeTypeAdaptiveSupports[i]) : iMin;
        }
    }
}
