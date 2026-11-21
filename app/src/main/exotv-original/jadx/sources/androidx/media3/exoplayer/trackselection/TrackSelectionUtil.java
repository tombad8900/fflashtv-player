package androidx.media3.exoplayer.trackselection;

import android.graphics.Point;
import android.os.SystemClock;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0251w1;
import androidx.media3.common.C0254x1;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.util.Arrays;
import java.util.List;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class TrackSelectionUtil {

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public interface AdaptiveTrackSelectionFactory {
        ExoTrackSelection createAdaptiveTrackSelection(ExoTrackSelection.Definition definition);
    }

    private TrackSelectionUtil() {
    }

    public static C0254x1 buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, TrackSelection[] trackSelectionArr) {
        C0981l1 c0981l1M2168n;
        List[] listArr = new List[trackSelectionArr.length];
        for (int i = 0; i < trackSelectionArr.length; i++) {
            TrackSelection trackSelection = trackSelectionArr[i];
            if (trackSelection != null) {
                c0981l1M2168n = AbstractC0983m0.m2168n(trackSelection);
            } else {
                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                c0981l1M2168n = C0981l1.f4211n;
            }
            listArr[i] = c0981l1M2168n;
        }
        return buildTracks(mappedTrackInfo, (List<? extends TrackSelection>[]) listArr);
    }

    public static LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i = 0;
        for (int i4 = 0; i4 < length; i4++) {
            if (exoTrackSelection.isTrackExcluded(i4, jElapsedRealtime)) {
                i++;
            }
        }
        return new LoadErrorHandlingPolicy.FallbackOptions(1, 0, length, i);
    }

    public static ExoTrackSelection[] createTrackSelectionsForDefinitions(ExoTrackSelection.Definition[] definitionArr, AdaptiveTrackSelectionFactory adaptiveTrackSelectionFactory) {
        ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
        boolean z7 = false;
        for (int i = 0; i < definitionArr.length; i++) {
            ExoTrackSelection.Definition definition = definitionArr[i];
            if (definition != null) {
                int[] iArr = definition.tracks;
                if (iArr.length <= 1 || z7) {
                    exoTrackSelectionArr[i] = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                } else {
                    exoTrackSelectionArr[i] = adaptiveTrackSelectionFactory.createAdaptiveTrackSelection(definition);
                    z7 = true;
                }
            }
        }
        return exoTrackSelectionArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Point getMaxVideoSizeInViewport(boolean z7, int i, int i4, int i8, int i9) {
        if (z7) {
            if ((i8 > i9) == (i > i4)) {
                i4 = i;
                i = i4;
            }
        }
        int i10 = i8 * i;
        int i11 = i9 * i4;
        return i10 >= i11 ? new Point(i4, AbstractC1118i0.m2446f(i11, i8)) : new Point(AbstractC1118i0.m2446f(i10, i9), i);
    }

    @Deprecated
    public static DefaultTrackSelector.Parameters updateParametersWithOverride(DefaultTrackSelector.Parameters parameters, int i, TrackGroupArray trackGroupArray, boolean z7, DefaultTrackSelector.SelectionOverride selectionOverride) {
        DefaultTrackSelector.Parameters.Builder rendererDisabled = parameters.buildUpon().clearSelectionOverrides(i).setRendererDisabled(i, z7);
        if (selectionOverride != null) {
            rendererDisabled.setSelectionOverride(i, trackGroupArray, selectionOverride);
        }
        return rendererDisabled.build();
    }

    public static C0254x1 buildTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, List<? extends TrackSelection>[] listArr) {
        boolean z7;
        C0974j0 c0974j0 = new C0974j0(4);
        for (int i = 0; i < mappedTrackInfo.getRendererCount(); i++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            List<? extends TrackSelection> list = listArr[i];
            for (int i4 = 0; i4 < trackGroups.length; i4++) {
                C0233q1 c0233q1 = trackGroups.get(i4);
                boolean z8 = mappedTrackInfo.getAdaptiveSupport(i, i4, false) != 0;
                int i8 = c0233q1.f1319a;
                int[] iArr = new int[i8];
                boolean[] zArr = new boolean[i8];
                for (int i9 = 0; i9 < c0233q1.f1319a; i9++) {
                    iArr[i9] = mappedTrackInfo.getTrackSupport(i, i4, i9);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= list.size()) {
                            z7 = false;
                            break;
                        }
                        TrackSelection trackSelection = list.get(i10);
                        if (trackSelection.getTrackGroup().equals(c0233q1) && trackSelection.indexOf(i9) != -1) {
                            z7 = true;
                            break;
                        }
                        i10++;
                    }
                    zArr[i9] = z7;
                }
                c0974j0.m2141a(new C0251w1(c0233q1, z8, iArr, zArr));
            }
        }
        TrackGroupArray unmappedTrackGroups = mappedTrackInfo.getUnmappedTrackGroups();
        for (int i11 = 0; i11 < unmappedTrackGroups.length; i11++) {
            C0233q1 c0233q12 = unmappedTrackGroups.get(i11);
            int[] iArr2 = new int[c0233q12.f1319a];
            Arrays.fill(iArr2, 0);
            c0974j0.m2141a(new C0251w1(c0233q12, false, iArr2, new boolean[c0233q12.f1319a]));
        }
        return new C0254x1(c0974j0.m2159f());
    }
}
