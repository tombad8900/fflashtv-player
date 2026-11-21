package androidx.media3.exoplayer.trackselection;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.media.Spatializer$OnSpatializerStateChangedListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.C0201g;
import androidx.media3.common.C0233q1;
import androidx.media3.common.C0236r1;
import androidx.media3.common.C0242t1;
import androidx.media3.common.C0245u1;
import androidx.media3.common.C0248v1;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.C0279a;
import androidx.media3.exoplayer.audio.ExecutorC0325n;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.source.preload.C0456a;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.MappingTrackSelector;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.RandomAccess;
import java.util.Set;
import okhttp3.C2181z;
import p043e6.InterfaceC0918f;
import p052f6.AbstractC0956d0;
import p052f6.AbstractC0978k1;
import p052f6.AbstractC0983m0;
import p052f6.C0947a0;
import p052f6.C0950b0;
import p052f6.C0974j0;
import p052f6.C0975j1;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DefaultTrackSelector extends MappingTrackSelector implements RendererCapabilities.Listener {
    private static final String AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE = "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.";
    private static final AbstractC0978k1 FORMAT_VALUE_ORDERING = new C0947a0(new C0471b(7));
    private static final float FRACTION_TO_CONSIDER_FULLSCREEN = 0.98f;
    protected static final int SELECTION_ELIGIBILITY_ADAPTIVE = 2;
    protected static final int SELECTION_ELIGIBILITY_FIXED = 1;
    protected static final int SELECTION_ELIGIBILITY_NO = 0;
    private static final String TAG = "DefaultTrackSelector";
    private C0201g audioAttributes;
    public final Context context;
    private final boolean deviceIsTV;
    private final Object lock;
    private Parameters parameters;
    private SpatializerWrapperV32 spatializer;
    private final ExoTrackSelection.Factory trackSelectionFactory;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class AudioTrackInfo extends TrackInfo<AudioTrackInfo> implements Comparable<AudioTrackInfo> {
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int channelCount;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean isDefaultSelectionFlag;
        private final boolean isObjectBasedAudio;
        private final boolean isWithinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final String language;
        private final int localeLanguageMatchIndex;
        private final int localeLanguageScore;
        private final Parameters parameters;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int sampleRate;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        public AudioTrackInfo(int i, C0233q1 c0233q1, int i4, Parameters parameters, int i8, boolean z7, InterfaceC0918f interfaceC0918f, int i9) {
            int i10;
            int formatLanguageScore;
            int formatLanguageScore2;
            super(i, c0233q1, i4);
            this.parameters = parameters;
            int i11 = parameters.allowAudioNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowAudioMixedMimeTypeAdaptiveness && (i9 & i11) != 0;
            this.language = DefaultTrackSelector.normalizeUndeterminedLanguageToNull(this.format.f1512d);
            this.isWithinRendererCapabilities = RendererCapabilities.isFormatSupported(i8, false);
            int i12 = 0;
            while (true) {
                i10 = Integer.MAX_VALUE;
                if (i12 >= parameters.preferredAudioLanguages.size()) {
                    formatLanguageScore = 0;
                    i12 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, (String) parameters.preferredAudioLanguages.get(i12), false);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
            this.preferredLanguageIndex = i12;
            this.preferredLanguageScore = formatLanguageScore;
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.f1514f, parameters.preferredAudioRoleFlags);
            C0249w c0249w = this.format;
            int i13 = c0249w.f1514f;
            this.hasMainOrNoRoleFlag = i13 == 0 || (i13 & 1) != 0;
            this.isDefaultSelectionFlag = (c0249w.f1513e & 1) != 0;
            this.isObjectBasedAudio = DefaultTrackSelector.isObjectBasedAudio(c0249w);
            C0249w c0249w2 = this.format;
            int i14 = c0249w2.f1498C;
            this.channelCount = i14;
            this.sampleRate = c0249w2.f1499D;
            int i15 = c0249w2.f1518j;
            this.bitrate = i15;
            this.isWithinConstraints = (i15 == -1 || i15 <= parameters.maxAudioBitrate) && (i14 == -1 || i14 <= parameters.maxAudioChannelCount) && interfaceC0918f.apply(c0249w2);
            int i16 = AbstractC1118i0.f4750a;
            Configuration configuration = Resources.getSystem().getConfiguration();
            String[] strArrSplit = AbstractC1118i0.f4750a >= 24 ? configuration.getLocales().toLanguageTags().split(",", -1) : new String[]{configuration.locale.toLanguageTag()};
            for (int i17 = 0; i17 < strArrSplit.length; i17++) {
                strArrSplit[i17] = AbstractC1118i0.m2429T(strArrSplit[i17]);
            }
            int i18 = 0;
            while (true) {
                if (i18 >= strArrSplit.length) {
                    formatLanguageScore2 = 0;
                    i18 = Integer.MAX_VALUE;
                    break;
                } else {
                    formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, strArrSplit[i18], false);
                    if (formatLanguageScore2 > 0) {
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            this.localeLanguageMatchIndex = i18;
            this.localeLanguageScore = formatLanguageScore2;
            int i19 = 0;
            while (true) {
                if (i19 >= parameters.preferredAudioMimeTypes.size()) {
                    break;
                }
                String str = this.format.f1522n;
                if (str != null && str.equals(parameters.preferredAudioMimeTypes.get(i19))) {
                    i10 = i19;
                    break;
                }
                i19++;
            }
            this.preferredMimeTypeMatchIndex = i10;
            this.usesPrimaryDecoder = RendererCapabilities.getDecoderSupport(i8) == 128;
            this.usesHardwareAcceleration = RendererCapabilities.getHardwareAccelerationSupport(i8) == 64;
            this.selectionEligibility = evaluateSelectionEligibility(i8, z7, i11);
        }

        public static int compareSelections(List<AudioTrackInfo> list, List<AudioTrackInfo> list2) {
            return ((AudioTrackInfo) Collections.max(list)).compareTo((AudioTrackInfo) Collections.max(list2));
        }

        public static AbstractC0983m0 createForTrackGroup(int i, C0233q1 c0233q1, Parameters parameters, int[] iArr, boolean z7, InterfaceC0918f interfaceC0918f, int i4) {
            C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
            for (int i8 = 0; i8 < c0233q1.f1319a; i8++) {
                c0974j0M2164i.m2141a(new AudioTrackInfo(i, c0233q1, i8, parameters, iArr[i8], z7, interfaceC0918f, i4));
            }
            return c0974j0M2164i.m2159f();
        }

        private int evaluateSelectionEligibility(int i, boolean z7, int i4) {
            if (!RendererCapabilities.isFormatSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinConstraints && !this.parameters.exceedAudioConstraintsIfNecessary) {
                return 0;
            }
            Parameters parameters = this.parameters;
            if (parameters.audioOffloadPreferences.f1418a == 2 && !DefaultTrackSelector.rendererSupportsOffload(parameters, i, this.format)) {
                return 0;
            }
            if (!RendererCapabilities.isFormatSupported(i, false) || !this.isWithinConstraints || this.format.f1518j == -1) {
                return 1;
            }
            Parameters parameters2 = this.parameters;
            if (parameters2.forceHighestSupportedBitrate || parameters2.forceLowestBitrate) {
                return 1;
            }
            return ((!parameters2.allowMultipleAdaptiveSelections && z7) || parameters2.audioOffloadPreferences.f1418a == 2 || (i & i4) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // java.lang.Comparable
        public int compareTo(AudioTrackInfo audioTrackInfo) {
            AbstractC0978k1 abstractC0978k1Mo2160a = (this.isWithinConstraints && this.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.mo2160a();
            AbstractC0956d0 abstractC0956d0Mo2134c = AbstractC0956d0.f4172a.mo2134c(this.isWithinRendererCapabilities, audioTrackInfo.isWithinRendererCapabilities);
            Integer numValueOf = Integer.valueOf(this.preferredLanguageIndex);
            Integer numValueOf2 = Integer.valueOf(audioTrackInfo.preferredLanguageIndex);
            C0975j1 c0975j1 = C0975j1.f4202l;
            AbstractC0956d0 abstractC0956d0Mo2133b = abstractC0956d0Mo2134c.mo2133b(numValueOf, numValueOf2, c0975j1).mo2132a(this.preferredLanguageScore, audioTrackInfo.preferredLanguageScore).mo2132a(this.preferredRoleFlagsScore, audioTrackInfo.preferredRoleFlagsScore).mo2134c(this.isDefaultSelectionFlag, audioTrackInfo.isDefaultSelectionFlag).mo2134c(this.hasMainOrNoRoleFlag, audioTrackInfo.hasMainOrNoRoleFlag).mo2133b(Integer.valueOf(this.localeLanguageMatchIndex), Integer.valueOf(audioTrackInfo.localeLanguageMatchIndex), c0975j1).mo2132a(this.localeLanguageScore, audioTrackInfo.localeLanguageScore).mo2134c(this.isWithinConstraints, audioTrackInfo.isWithinConstraints).mo2133b(Integer.valueOf(this.preferredMimeTypeMatchIndex), Integer.valueOf(audioTrackInfo.preferredMimeTypeMatchIndex), c0975j1);
            if (this.parameters.forceLowestBitrate) {
                abstractC0956d0Mo2133b = abstractC0956d0Mo2133b.mo2133b(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), DefaultTrackSelector.FORMAT_VALUE_ORDERING.mo2160a());
            }
            AbstractC0956d0 abstractC0956d0Mo2133b2 = abstractC0956d0Mo2133b.mo2134c(this.usesPrimaryDecoder, audioTrackInfo.usesPrimaryDecoder).mo2134c(this.usesHardwareAcceleration, audioTrackInfo.usesHardwareAcceleration).mo2134c(this.isObjectBasedAudio, audioTrackInfo.isObjectBasedAudio).mo2133b(Integer.valueOf(this.channelCount), Integer.valueOf(audioTrackInfo.channelCount), abstractC0978k1Mo2160a).mo2133b(Integer.valueOf(this.sampleRate), Integer.valueOf(audioTrackInfo.sampleRate), abstractC0978k1Mo2160a);
            String str = this.language;
            String str2 = audioTrackInfo.language;
            int i = AbstractC1118i0.f4750a;
            if (Objects.equals(str, str2)) {
                abstractC0956d0Mo2133b2 = abstractC0956d0Mo2133b2.mo2133b(Integer.valueOf(this.bitrate), Integer.valueOf(audioTrackInfo.bitrate), abstractC0978k1Mo2160a);
            }
            return abstractC0956d0Mo2133b2.mo2136e();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(AudioTrackInfo audioTrackInfo) {
            int i;
            String str;
            int i4;
            if (!this.parameters.allowAudioMixedChannelCountAdaptiveness && ((i4 = this.format.f1498C) == -1 || i4 != audioTrackInfo.format.f1498C)) {
                return false;
            }
            if (!this.allowMixedMimeTypes && ((str = this.format.f1522n) == null || !TextUtils.equals(str, audioTrackInfo.format.f1522n))) {
                return false;
            }
            Parameters parameters = this.parameters;
            if (!parameters.allowAudioMixedSampleRateAdaptiveness && ((i = this.format.f1499D) == -1 || i != audioTrackInfo.format.f1499D)) {
                return false;
            }
            if (parameters.allowAudioMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == audioTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == audioTrackInfo.usesHardwareAcceleration;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class ImageTrackInfo extends TrackInfo<ImageTrackInfo> implements Comparable<ImageTrackInfo> {
        private final int pixelCount;
        private final int selectionEligibility;

        public ImageTrackInfo(int i, C0233q1 c0233q1, int i4, Parameters parameters, int i8) {
            int i9;
            super(i, c0233q1, i4);
            this.selectionEligibility = RendererCapabilities.isFormatSupported(i8, parameters.exceedRendererCapabilitiesIfNecessary) ? 1 : 0;
            C0249w c0249w = this.format;
            int i10 = c0249w.f1529u;
            int i11 = -1;
            if (i10 != -1 && (i9 = c0249w.f1530v) != -1) {
                i11 = i10 * i9;
            }
            this.pixelCount = i11;
        }

        public static int compareSelections(List<ImageTrackInfo> list, List<ImageTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static AbstractC0983m0 createForTrackGroup(int i, C0233q1 c0233q1, Parameters parameters, int[] iArr) {
            C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
            for (int i4 = 0; i4 < c0233q1.f1319a; i4++) {
                c0974j0M2164i.m2141a(new ImageTrackInfo(i, c0233q1, i4, parameters, iArr[i4]));
            }
            return c0974j0M2164i.m2159f();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(ImageTrackInfo imageTrackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(ImageTrackInfo imageTrackInfo) {
            return Integer.compare(this.pixelCount, imageTrackInfo.pixelCount);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class OtherTrackScore implements Comparable<OtherTrackScore> {
        private final boolean isDefault;
        private final boolean isWithinRendererCapabilities;

        public OtherTrackScore(C0249w c0249w, int i) {
            this.isDefault = (c0249w.f1513e & 1) != 0;
            this.isWithinRendererCapabilities = RendererCapabilities.isFormatSupported(i, false);
        }

        @Override // java.lang.Comparable
        public int compareTo(OtherTrackScore otherTrackScore) {
            return AbstractC0956d0.f4172a.mo2134c(this.isWithinRendererCapabilities, otherTrackScore.isWithinRendererCapabilities).mo2134c(this.isDefault, otherTrackScore.isDefault).mo2136e();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Parameters extends C0248v1 {

        @Deprecated
        public static final Parameters DEFAULT;
        public static final Parameters DEFAULT_WITHOUT_CONTEXT;
        private static final String FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS;

        /* renamed from: FIELD_ALLOW_INVALIDATE_SELECTIONS_ON_RENDERER_CAPABILITIES_CHANGE */
        private static final String f1868xaec1bc6e;
        private static final String FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS;
        private static final String FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS;
        private static final String FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES;
        private static final String FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY;
        private static final String FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY;
        private static final String FIELD_RENDERER_DISABLED_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES;
        private static final String FIELD_SELECTION_OVERRIDES_RENDERER_INDICES;
        private static final String FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS;
        private static final String FIELD_TUNNELING_ENABLED;
        public final boolean allowAudioMixedChannelCountAdaptiveness;
        public final boolean allowAudioMixedDecoderSupportAdaptiveness;
        public final boolean allowAudioMixedMimeTypeAdaptiveness;
        public final boolean allowAudioMixedSampleRateAdaptiveness;
        public final boolean allowAudioNonSeamlessAdaptiveness;
        public final boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
        public final boolean allowMultipleAdaptiveSelections;
        public final boolean allowVideoMixedDecoderSupportAdaptiveness;
        public final boolean allowVideoMixedMimeTypeAdaptiveness;
        public final boolean allowVideoNonSeamlessAdaptiveness;
        public final boolean constrainAudioChannelCountToDeviceCapabilities;
        public final boolean exceedAudioConstraintsIfNecessary;
        public final boolean exceedRendererCapabilitiesIfNecessary;
        public final boolean exceedVideoConstraintsIfNecessary;
        private final SparseBooleanArray rendererDisabledFlags;
        private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
        public final boolean tunnelingEnabled;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        public static final class Builder extends C0245u1 {
            private boolean allowAudioMixedChannelCountAdaptiveness;
            private boolean allowAudioMixedDecoderSupportAdaptiveness;
            private boolean allowAudioMixedMimeTypeAdaptiveness;
            private boolean allowAudioMixedSampleRateAdaptiveness;
            private boolean allowAudioNonSeamlessAdaptiveness;
            private boolean allowInvalidateSelectionsOnRendererCapabilitiesChange;
            private boolean allowMultipleAdaptiveSelections;
            private boolean allowVideoMixedDecoderSupportAdaptiveness;
            private boolean allowVideoMixedMimeTypeAdaptiveness;
            private boolean allowVideoNonSeamlessAdaptiveness;
            private boolean constrainAudioChannelCountToDeviceCapabilities;
            private boolean exceedAudioConstraintsIfNecessary;
            private boolean exceedRendererCapabilitiesIfNecessary;
            private boolean exceedVideoConstraintsIfNecessary;
            private final SparseBooleanArray rendererDisabledFlags;
            private final SparseArray<Map<TrackGroupArray, SelectionOverride>> selectionOverrides;
            private boolean tunnelingEnabled;

            private Builder(Parameters parameters) {
                m689a(parameters);
                this.exceedVideoConstraintsIfNecessary = parameters.exceedVideoConstraintsIfNecessary;
                this.allowVideoMixedMimeTypeAdaptiveness = parameters.allowVideoMixedMimeTypeAdaptiveness;
                this.allowVideoNonSeamlessAdaptiveness = parameters.allowVideoNonSeamlessAdaptiveness;
                this.allowVideoMixedDecoderSupportAdaptiveness = parameters.allowVideoMixedDecoderSupportAdaptiveness;
                this.exceedAudioConstraintsIfNecessary = parameters.exceedAudioConstraintsIfNecessary;
                this.allowAudioMixedMimeTypeAdaptiveness = parameters.allowAudioMixedMimeTypeAdaptiveness;
                this.allowAudioMixedSampleRateAdaptiveness = parameters.allowAudioMixedSampleRateAdaptiveness;
                this.allowAudioMixedChannelCountAdaptiveness = parameters.allowAudioMixedChannelCountAdaptiveness;
                this.allowAudioMixedDecoderSupportAdaptiveness = parameters.allowAudioMixedDecoderSupportAdaptiveness;
                this.allowAudioNonSeamlessAdaptiveness = parameters.allowAudioNonSeamlessAdaptiveness;
                this.constrainAudioChannelCountToDeviceCapabilities = parameters.constrainAudioChannelCountToDeviceCapabilities;
                this.exceedRendererCapabilitiesIfNecessary = parameters.exceedRendererCapabilitiesIfNecessary;
                this.tunnelingEnabled = parameters.tunnelingEnabled;
                this.allowMultipleAdaptiveSelections = parameters.allowMultipleAdaptiveSelections;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
                this.selectionOverrides = cloneSelectionOverrides(parameters.selectionOverrides);
                this.rendererDisabledFlags = parameters.rendererDisabledFlags.clone();
            }

            private static SparseArray<Map<TrackGroupArray, SelectionOverride>> cloneSelectionOverrides(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
                SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2 = new SparseArray<>();
                for (int i = 0; i < sparseArray.size(); i++) {
                    sparseArray2.put(sparseArray.keyAt(i), new HashMap(sparseArray.valueAt(i)));
                }
                return sparseArray2;
            }

            private void init() {
                this.exceedVideoConstraintsIfNecessary = true;
                this.allowVideoMixedMimeTypeAdaptiveness = false;
                this.allowVideoNonSeamlessAdaptiveness = true;
                this.allowVideoMixedDecoderSupportAdaptiveness = false;
                this.exceedAudioConstraintsIfNecessary = true;
                this.allowAudioMixedMimeTypeAdaptiveness = false;
                this.allowAudioMixedSampleRateAdaptiveness = false;
                this.allowAudioMixedChannelCountAdaptiveness = false;
                this.allowAudioMixedDecoderSupportAdaptiveness = false;
                this.allowAudioNonSeamlessAdaptiveness = true;
                this.constrainAudioChannelCountToDeviceCapabilities = true;
                this.exceedRendererCapabilitiesIfNecessary = true;
                this.tunnelingEnabled = false;
                this.allowMultipleAdaptiveSelections = true;
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = false;
            }

            private SparseBooleanArray makeSparseBooleanArrayFromTrueKeys(int[] iArr) {
                if (iArr == null) {
                    return new SparseBooleanArray();
                }
                SparseBooleanArray sparseBooleanArray = new SparseBooleanArray(iArr.length);
                for (int i : iArr) {
                    sparseBooleanArray.append(i, true);
                }
                return sparseBooleanArray;
            }

            private void setSelectionOverridesFromBundle(Bundle bundle) {
                C0981l1 c0981l1M2159f;
                SparseArray sparseArray;
                int[] intArray = bundle.getIntArray(Parameters.FIELD_SELECTION_OVERRIDES_RENDERER_INDICES);
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(Parameters.FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS);
                if (parcelableArrayList == null) {
                    C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                    c0981l1M2159f = C0981l1.f4211n;
                } else {
                    C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
                    for (int i = 0; i < parcelableArrayList.size(); i++) {
                        Bundle bundle2 = (Bundle) parcelableArrayList.get(i);
                        bundle2.getClass();
                        c0974j0M2164i.m2141a(TrackGroupArray.fromBundle(bundle2));
                    }
                    c0981l1M2159f = c0974j0M2164i.m2159f();
                }
                SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(Parameters.FIELD_SELECTION_OVERRIDES);
                if (sparseParcelableArray == null) {
                    sparseArray = new SparseArray();
                } else {
                    SparseArray sparseArray2 = new SparseArray(sparseParcelableArray.size());
                    for (int i4 = 0; i4 < sparseParcelableArray.size(); i4++) {
                        sparseArray2.put(sparseParcelableArray.keyAt(i4), SelectionOverride.fromBundle((Bundle) sparseParcelableArray.valueAt(i4)));
                    }
                    sparseArray = sparseArray2;
                }
                if (intArray == null || intArray.length != c0981l1M2159f.f4213m) {
                    return;
                }
                for (int i8 = 0; i8 < intArray.length; i8++) {
                    setSelectionOverride(intArray[i8], (TrackGroupArray) c0981l1M2159f.get(i8), (SelectionOverride) sparseArray.get(i8));
                }
            }

            @Deprecated
            public Builder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && map.containsKey(trackGroupArray)) {
                    map.remove(trackGroupArray);
                    if (map.isEmpty()) {
                        this.selectionOverrides.remove(i);
                    }
                }
                return this;
            }

            @Deprecated
            public Builder clearSelectionOverrides(int i) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map != null && !map.isEmpty()) {
                    this.selectionOverrides.remove(i);
                }
                return this;
            }

            public Builder clearViewportSizeConstraints() {
                setViewportSize(Integer.MAX_VALUE, Integer.MAX_VALUE, true);
                return this;
            }

            public Builder set(C0248v1 c0248v1) {
                m689a(c0248v1);
                return this;
            }

            public Builder setAllowAudioMixedChannelCountAdaptiveness(boolean z7) {
                this.allowAudioMixedChannelCountAdaptiveness = z7;
                return this;
            }

            public Builder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z7) {
                this.allowAudioMixedDecoderSupportAdaptiveness = z7;
                return this;
            }

            public Builder setAllowAudioMixedMimeTypeAdaptiveness(boolean z7) {
                this.allowAudioMixedMimeTypeAdaptiveness = z7;
                return this;
            }

            public Builder setAllowAudioMixedSampleRateAdaptiveness(boolean z7) {
                this.allowAudioMixedSampleRateAdaptiveness = z7;
                return this;
            }

            public Builder setAllowAudioNonSeamlessAdaptiveness(boolean z7) {
                this.allowAudioNonSeamlessAdaptiveness = z7;
                return this;
            }

            public Builder setAllowInvalidateSelectionsOnRendererCapabilitiesChange(boolean z7) {
                this.allowInvalidateSelectionsOnRendererCapabilitiesChange = z7;
                return this;
            }

            public Builder setAllowMultipleAdaptiveSelections(boolean z7) {
                this.allowMultipleAdaptiveSelections = z7;
                return this;
            }

            public Builder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z7) {
                this.allowVideoMixedDecoderSupportAdaptiveness = z7;
                return this;
            }

            public Builder setAllowVideoMixedMimeTypeAdaptiveness(boolean z7) {
                this.allowVideoMixedMimeTypeAdaptiveness = z7;
                return this;
            }

            public Builder setAllowVideoNonSeamlessAdaptiveness(boolean z7) {
                this.allowVideoNonSeamlessAdaptiveness = z7;
                return this;
            }

            public Builder setConstrainAudioChannelCountToDeviceCapabilities(boolean z7) {
                this.constrainAudioChannelCountToDeviceCapabilities = z7;
                return this;
            }

            @Deprecated
            public Builder setDisabledTextTrackSelectionFlags(int i) {
                return setIgnoredTextSelectionFlags(i);
            }

            @Override // androidx.media3.common.C0245u1
            @Deprecated
            public /* bridge */ /* synthetic */ C0245u1 setDisabledTrackTypes(Set set) {
                return setDisabledTrackTypes((Set<Integer>) set);
            }

            public Builder setExceedAudioConstraintsIfNecessary(boolean z7) {
                this.exceedAudioConstraintsIfNecessary = z7;
                return this;
            }

            public Builder setExceedRendererCapabilitiesIfNecessary(boolean z7) {
                this.exceedRendererCapabilitiesIfNecessary = z7;
                return this;
            }

            public Builder setExceedVideoConstraintsIfNecessary(boolean z7) {
                this.exceedVideoConstraintsIfNecessary = z7;
                return this;
            }

            public Builder setMaxVideoSizeSd() {
                setMaxVideoSize(AdaptiveTrackSelection.DEFAULT_MAX_WIDTH_TO_DISCARD, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD);
                return this;
            }

            public Builder setPreferredAudioLanguage(String str) {
                if (str == null) {
                    setPreferredAudioLanguages(new String[0]);
                    return this;
                }
                setPreferredAudioLanguages(new String[]{str});
                return this;
            }

            public Builder setPreferredAudioMimeType(String str) {
                if (str == null) {
                    setPreferredAudioMimeTypes(new String[0]);
                    return this;
                }
                setPreferredAudioMimeTypes(new String[]{str});
                return this;
            }

            public Builder setPreferredVideoMimeType(String str) {
                if (str == null) {
                    setPreferredVideoMimeTypes(new String[0]);
                    return this;
                }
                setPreferredVideoMimeTypes(new String[]{str});
                return this;
            }

            public Builder setRendererDisabled(int i, boolean z7) {
                if (this.rendererDisabledFlags.get(i) == z7) {
                    return this;
                }
                if (z7) {
                    this.rendererDisabledFlags.put(i, true);
                    return this;
                }
                this.rendererDisabledFlags.delete(i);
                return this;
            }

            @Deprecated
            public Builder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
                Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
                if (map == null) {
                    map = new HashMap<>();
                    this.selectionOverrides.put(i, map);
                }
                if (map.containsKey(trackGroupArray)) {
                    SelectionOverride selectionOverride2 = map.get(trackGroupArray);
                    int i4 = AbstractC1118i0.f4750a;
                    if (Objects.equals(selectionOverride2, selectionOverride)) {
                        return this;
                    }
                }
                map.put(trackGroupArray, selectionOverride);
                return this;
            }

            public Builder setTunnelingEnabled(boolean z7) {
                this.tunnelingEnabled = z7;
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder addOverride(C0236r1 c0236r1) {
                super.addOverride(c0236r1);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Parameters build() {
                return new Parameters(this);
            }

            @Override // androidx.media3.common.C0245u1
            public Builder clearOverride(C0233q1 c0233q1) {
                super.clearOverride(c0233q1);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder clearOverrides() {
                super.clearOverrides();
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder clearOverridesOfType(int i) {
                super.clearOverridesOfType(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder clearVideoSizeConstraints() {
                super.clearVideoSizeConstraints();
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setAudioOffloadPreferences(C0242t1 c0242t1) {
                super.setAudioOffloadPreferences(c0242t1);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            @Deprecated
            public Builder setDisabledTrackTypes(Set<Integer> set) {
                super.setDisabledTrackTypes((Set) set);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setForceHighestSupportedBitrate(boolean z7) {
                super.setForceHighestSupportedBitrate(z7);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setForceLowestBitrate(boolean z7) {
                super.setForceLowestBitrate(z7);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setIgnoredTextSelectionFlags(int i) {
                super.setIgnoredTextSelectionFlags(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setMaxAudioBitrate(int i) {
                super.setMaxAudioBitrate(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setMaxAudioChannelCount(int i) {
                super.setMaxAudioChannelCount(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setMaxVideoBitrate(int i) {
                super.setMaxVideoBitrate(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setMaxVideoFrameRate(int i) {
                super.setMaxVideoFrameRate(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setMaxVideoSize(int i, int i4) {
                super.setMaxVideoSize(i, i4);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setMinVideoBitrate(int i) {
                super.setMinVideoBitrate(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setMinVideoFrameRate(int i) {
                super.setMinVideoFrameRate(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setMinVideoSize(int i, int i4) {
                super.setMinVideoSize(i, i4);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setOverrideForType(C0236r1 c0236r1) {
                super.setOverrideForType(c0236r1);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPreferredAudioLanguages(String... strArr) {
                super.setPreferredAudioLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPreferredAudioMimeTypes(String... strArr) {
                super.setPreferredAudioMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPreferredAudioRoleFlags(int i) {
                super.setPreferredAudioRoleFlags(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPreferredTextLanguage(String str) {
                super.setPreferredTextLanguage(str);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
                super.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPreferredTextLanguages(String... strArr) {
                super.setPreferredTextLanguages(strArr);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPreferredTextRoleFlags(int i) {
                super.setPreferredTextRoleFlags(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPreferredVideoMimeTypes(String... strArr) {
                super.setPreferredVideoMimeTypes(strArr);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPreferredVideoRoleFlags(int i) {
                super.setPreferredVideoRoleFlags(i);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setPrioritizeImageOverVideoEnabled(boolean z7) {
                super.setPrioritizeImageOverVideoEnabled(z7);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setSelectUndeterminedTextLanguage(boolean z7) {
                super.setSelectUndeterminedTextLanguage(z7);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setTrackTypeDisabled(int i, boolean z7) {
                super.setTrackTypeDisabled(i, z7);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setViewportSize(int i, int i4, boolean z7) {
                super.setViewportSize(i, i4, z7);
                return this;
            }

            @Override // androidx.media3.common.C0245u1
            public Builder setViewportSizeToPhysicalDisplaySize(Context context, boolean z7) {
                super.setViewportSizeToPhysicalDisplaySize(context, z7);
                return this;
            }

            @Deprecated
            public Builder clearSelectionOverrides() {
                if (this.selectionOverrides.size() == 0) {
                    return this;
                }
                this.selectionOverrides.clear();
                return this;
            }

            @Deprecated
            public Builder() {
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            public Builder(Context context) {
                super(context);
                this.selectionOverrides = new SparseArray<>();
                this.rendererDisabledFlags = new SparseBooleanArray();
                init();
            }

            private Builder(Bundle bundle) {
                super(bundle);
                init();
                Parameters parameters = Parameters.DEFAULT_WITHOUT_CONTEXT;
                setExceedVideoConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, parameters.exceedVideoConstraintsIfNecessary));
                setAllowVideoMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowVideoMixedMimeTypeAdaptiveness));
                setAllowVideoNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowVideoNonSeamlessAdaptiveness));
                setAllowVideoMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowVideoMixedDecoderSupportAdaptiveness));
                setExceedAudioConstraintsIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, parameters.exceedAudioConstraintsIfNecessary));
                setAllowAudioMixedMimeTypeAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, parameters.allowAudioMixedMimeTypeAdaptiveness));
                setAllowAudioMixedSampleRateAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, parameters.allowAudioMixedSampleRateAdaptiveness));
                setAllowAudioMixedChannelCountAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, parameters.allowAudioMixedChannelCountAdaptiveness));
                setAllowAudioMixedDecoderSupportAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, parameters.allowAudioMixedDecoderSupportAdaptiveness));
                setAllowAudioNonSeamlessAdaptiveness(bundle.getBoolean(Parameters.FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, parameters.allowAudioNonSeamlessAdaptiveness));
                setConstrainAudioChannelCountToDeviceCapabilities(bundle.getBoolean(Parameters.FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, parameters.constrainAudioChannelCountToDeviceCapabilities));
                setExceedRendererCapabilitiesIfNecessary(bundle.getBoolean(Parameters.FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, parameters.exceedRendererCapabilitiesIfNecessary));
                setTunnelingEnabled(bundle.getBoolean(Parameters.FIELD_TUNNELING_ENABLED, parameters.tunnelingEnabled));
                setAllowMultipleAdaptiveSelections(bundle.getBoolean(Parameters.FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, parameters.allowMultipleAdaptiveSelections));
                setAllowInvalidateSelectionsOnRendererCapabilitiesChange(bundle.getBoolean(Parameters.f1868xaec1bc6e, parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange));
                this.selectionOverrides = new SparseArray<>();
                setSelectionOverridesFromBundle(bundle);
                this.rendererDisabledFlags = makeSparseBooleanArrayFromTrueKeys(bundle.getIntArray(Parameters.FIELD_RENDERER_DISABLED_INDICES));
            }
        }

        static {
            Parameters parametersBuild = new Builder().build();
            DEFAULT_WITHOUT_CONTEXT = parametersBuild;
            DEFAULT = parametersBuild;
            int i = AbstractC1118i0.f4750a;
            FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY = Integer.toString(1000, 36);
            FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS = Integer.toString(1001, 36);
            FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS = Integer.toString(1002, 36);
            FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY = Integer.toString(1003, 36);
            FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS = Integer.toString(1004, 36);
            FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS = Integer.toString(1005, 36);
            FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS = Integer.toString(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE, 36);
            FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY = Integer.toString(AnalyticsListener.EVENT_AUDIO_ENABLED, 36);
            FIELD_TUNNELING_ENABLED = Integer.toString(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED, 36);
            FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS = Integer.toString(AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED, 36);
            FIELD_SELECTION_OVERRIDES_RENDERER_INDICES = Integer.toString(AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING, 36);
            FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS = Integer.toString(AnalyticsListener.EVENT_AUDIO_UNDERRUN, 36);
            FIELD_SELECTION_OVERRIDES = Integer.toString(AnalyticsListener.EVENT_AUDIO_DECODER_RELEASED, 36);
            FIELD_RENDERER_DISABLED_INDICES = Integer.toString(AnalyticsListener.EVENT_AUDIO_DISABLED, 36);
            FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Integer.toString(AnalyticsListener.EVENT_AUDIO_SINK_ERROR, 36);
            FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS = Integer.toString(AnalyticsListener.EVENT_VIDEO_ENABLED, 36);
            FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES = Integer.toString(AnalyticsListener.EVENT_VIDEO_DECODER_INITIALIZED, 36);
            f1868xaec1bc6e = Integer.toString(AnalyticsListener.EVENT_VIDEO_INPUT_FORMAT_CHANGED, 36);
            FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS = Integer.toString(AnalyticsListener.EVENT_DROPPED_VIDEO_FRAMES, 36);
        }

        private static boolean areRendererDisabledFlagsEqual(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean areSelectionOverridesEqual(SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i = 0; i < size; i++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i));
                if (iIndexOfKey < 0 || !areSelectionOverridesEqual(sparseArray.valueAt(i), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static Parameters fromBundle(Bundle bundle) {
            return new Builder(bundle).build();
        }

        public static Parameters getDefaults(Context context) {
            return new Builder(context).build();
        }

        private static int[] getKeysFromSparseBooleanArray(SparseBooleanArray sparseBooleanArray) {
            int[] iArr = new int[sparseBooleanArray.size()];
            for (int i = 0; i < sparseBooleanArray.size(); i++) {
                iArr[i] = sparseBooleanArray.keyAt(i);
            }
            return iArr;
        }

        private static void putSelectionOverridesToBundle(Bundle bundle, SparseArray<Map<TrackGroupArray, SelectionOverride>> sparseArray) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray2 = new SparseArray();
            for (int i = 0; i < sparseArray.size(); i++) {
                int iKeyAt = sparseArray.keyAt(i);
                for (Map.Entry<TrackGroupArray, SelectionOverride> entry : sparseArray.valueAt(i).entrySet()) {
                    SelectionOverride value = entry.getValue();
                    if (value != null) {
                        sparseArray2.put(arrayList2.size(), value);
                    }
                    arrayList2.add(entry.getKey());
                    arrayList.add(Integer.valueOf(iKeyAt));
                }
                bundle.putIntArray(FIELD_SELECTION_OVERRIDES_RENDERER_INDICES, AbstractC0715d.m1569p0(arrayList));
                String str = FIELD_SELECTION_OVERRIDES_TRACK_GROUP_ARRAYS;
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(arrayList2.size());
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((TrackGroupArray) it.next()).toBundle());
                }
                bundle.putParcelableArrayList(str, arrayList3);
                String str2 = FIELD_SELECTION_OVERRIDES;
                SparseArray<? extends Parcelable> sparseArray3 = new SparseArray<>(sparseArray2.size());
                for (int i4 = 0; i4 < sparseArray2.size(); i4++) {
                    sparseArray3.put(sparseArray2.keyAt(i4), ((SelectionOverride) sparseArray2.valueAt(i4)).toBundle());
                }
                bundle.putSparseParcelableArray(str2, sparseArray3);
            }
        }

        @Override // androidx.media3.common.C0248v1
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Parameters.class == obj.getClass()) {
                Parameters parameters = (Parameters) obj;
                if (super.equals(parameters) && this.exceedVideoConstraintsIfNecessary == parameters.exceedVideoConstraintsIfNecessary && this.allowVideoMixedMimeTypeAdaptiveness == parameters.allowVideoMixedMimeTypeAdaptiveness && this.allowVideoNonSeamlessAdaptiveness == parameters.allowVideoNonSeamlessAdaptiveness && this.allowVideoMixedDecoderSupportAdaptiveness == parameters.allowVideoMixedDecoderSupportAdaptiveness && this.exceedAudioConstraintsIfNecessary == parameters.exceedAudioConstraintsIfNecessary && this.allowAudioMixedMimeTypeAdaptiveness == parameters.allowAudioMixedMimeTypeAdaptiveness && this.allowAudioMixedSampleRateAdaptiveness == parameters.allowAudioMixedSampleRateAdaptiveness && this.allowAudioMixedChannelCountAdaptiveness == parameters.allowAudioMixedChannelCountAdaptiveness && this.allowAudioMixedDecoderSupportAdaptiveness == parameters.allowAudioMixedDecoderSupportAdaptiveness && this.allowAudioNonSeamlessAdaptiveness == parameters.allowAudioNonSeamlessAdaptiveness && this.constrainAudioChannelCountToDeviceCapabilities == parameters.constrainAudioChannelCountToDeviceCapabilities && this.exceedRendererCapabilitiesIfNecessary == parameters.exceedRendererCapabilitiesIfNecessary && this.tunnelingEnabled == parameters.tunnelingEnabled && this.allowMultipleAdaptiveSelections == parameters.allowMultipleAdaptiveSelections && this.allowInvalidateSelectionsOnRendererCapabilitiesChange == parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange && areRendererDisabledFlagsEqual(this.rendererDisabledFlags, parameters.rendererDisabledFlags) && areSelectionOverridesEqual(this.selectionOverrides, parameters.selectionOverrides)) {
                    return true;
                }
            }
            return false;
        }

        public boolean getRendererDisabled(int i) {
            return this.rendererDisabledFlags.get(i);
        }

        @Deprecated
        public SelectionOverride getSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
            if (map != null) {
                return map.get(trackGroupArray);
            }
            return null;
        }

        @Deprecated
        public boolean hasSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            Map<TrackGroupArray, SelectionOverride> map = this.selectionOverrides.get(i);
            return map != null && map.containsKey(trackGroupArray);
        }

        @Override // androidx.media3.common.C0248v1
        public int hashCode() {
            return ((((((((((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.exceedVideoConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowVideoMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.allowVideoMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.exceedAudioConstraintsIfNecessary ? 1 : 0)) * 31) + (this.allowAudioMixedMimeTypeAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedSampleRateAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedChannelCountAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioMixedDecoderSupportAdaptiveness ? 1 : 0)) * 31) + (this.allowAudioNonSeamlessAdaptiveness ? 1 : 0)) * 31) + (this.constrainAudioChannelCountToDeviceCapabilities ? 1 : 0)) * 31) + (this.exceedRendererCapabilitiesIfNecessary ? 1 : 0)) * 31) + (this.tunnelingEnabled ? 1 : 0)) * 31) + (this.allowMultipleAdaptiveSelections ? 1 : 0)) * 31) + (this.allowInvalidateSelectionsOnRendererCapabilitiesChange ? 1 : 0);
        }

        @Override // androidx.media3.common.C0248v1
        public Bundle toBundle() {
            Bundle bundle = super.toBundle();
            bundle.putBoolean(FIELD_EXCEED_VIDEO_CONSTRAINTS_IF_NECESSARY, this.exceedVideoConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowVideoMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_NON_SEAMLESS_ADAPTIVENESS, this.allowVideoNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_VIDEO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowVideoMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_EXCEED_AUDIO_CONSTRAINTS_IF_NECESSARY, this.exceedAudioConstraintsIfNecessary);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_MIME_TYPE_ADAPTIVENESS, this.allowAudioMixedMimeTypeAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_SAMPLE_RATE_ADAPTIVENESS, this.allowAudioMixedSampleRateAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_CHANNEL_COUNT_ADAPTIVENESS, this.allowAudioMixedChannelCountAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_MIXED_DECODER_SUPPORT_ADAPTIVENESS, this.allowAudioMixedDecoderSupportAdaptiveness);
            bundle.putBoolean(FIELD_ALLOW_AUDIO_NON_SEAMLESS_ADAPTIVENESS, this.allowAudioNonSeamlessAdaptiveness);
            bundle.putBoolean(FIELD_CONSTRAIN_AUDIO_CHANNEL_COUNT_TO_DEVICE_CAPABILITIES, this.constrainAudioChannelCountToDeviceCapabilities);
            bundle.putBoolean(FIELD_EXCEED_RENDERER_CAPABILITIES_IF_NECESSARY, this.exceedRendererCapabilitiesIfNecessary);
            bundle.putBoolean(FIELD_TUNNELING_ENABLED, this.tunnelingEnabled);
            bundle.putBoolean(FIELD_ALLOW_MULTIPLE_ADAPTIVE_SELECTIONS, this.allowMultipleAdaptiveSelections);
            bundle.putBoolean(f1868xaec1bc6e, this.allowInvalidateSelectionsOnRendererCapabilitiesChange);
            putSelectionOverridesToBundle(bundle, this.selectionOverrides);
            bundle.putIntArray(FIELD_RENDERER_DISABLED_INDICES, getKeysFromSparseBooleanArray(this.rendererDisabledFlags));
            return bundle;
        }

        private Parameters(Builder builder) {
            super(builder);
            this.exceedVideoConstraintsIfNecessary = builder.exceedVideoConstraintsIfNecessary;
            this.allowVideoMixedMimeTypeAdaptiveness = builder.allowVideoMixedMimeTypeAdaptiveness;
            this.allowVideoNonSeamlessAdaptiveness = builder.allowVideoNonSeamlessAdaptiveness;
            this.allowVideoMixedDecoderSupportAdaptiveness = builder.allowVideoMixedDecoderSupportAdaptiveness;
            this.exceedAudioConstraintsIfNecessary = builder.exceedAudioConstraintsIfNecessary;
            this.allowAudioMixedMimeTypeAdaptiveness = builder.allowAudioMixedMimeTypeAdaptiveness;
            this.allowAudioMixedSampleRateAdaptiveness = builder.allowAudioMixedSampleRateAdaptiveness;
            this.allowAudioMixedChannelCountAdaptiveness = builder.allowAudioMixedChannelCountAdaptiveness;
            this.allowAudioMixedDecoderSupportAdaptiveness = builder.allowAudioMixedDecoderSupportAdaptiveness;
            this.allowAudioNonSeamlessAdaptiveness = builder.allowAudioNonSeamlessAdaptiveness;
            this.constrainAudioChannelCountToDeviceCapabilities = builder.constrainAudioChannelCountToDeviceCapabilities;
            this.exceedRendererCapabilitiesIfNecessary = builder.exceedRendererCapabilitiesIfNecessary;
            this.tunnelingEnabled = builder.tunnelingEnabled;
            this.allowMultipleAdaptiveSelections = builder.allowMultipleAdaptiveSelections;
            this.allowInvalidateSelectionsOnRendererCapabilitiesChange = builder.allowInvalidateSelectionsOnRendererCapabilitiesChange;
            this.selectionOverrides = builder.selectionOverrides;
            this.rendererDisabledFlags = builder.rendererDisabledFlags;
        }

        @Override // androidx.media3.common.C0248v1
        public Builder buildUpon() {
            return new Builder();
        }

        private static boolean areSelectionOverridesEqual(Map<TrackGroupArray, SelectionOverride> map, Map<TrackGroupArray, SelectionOverride> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<TrackGroupArray, SelectionOverride> entry : map.entrySet()) {
                TrackGroupArray key = entry.getKey();
                if (map2.containsKey(key)) {
                    SelectionOverride value = entry.getValue();
                    SelectionOverride selectionOverride = map2.get(key);
                    int i = AbstractC1118i0.f4750a;
                    if (!Objects.equals(value, selectionOverride)) {
                    }
                }
                return false;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Deprecated
    public static final class ParametersBuilder extends C0245u1 {
        private final Parameters.Builder delegate;

        @Deprecated
        public ParametersBuilder() {
            this.delegate = new Parameters.Builder();
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverride(int i, TrackGroupArray trackGroupArray) {
            this.delegate.clearSelectionOverride(i, trackGroupArray);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverrides(int i) {
            this.delegate.clearSelectionOverrides(i);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedChannelCountAdaptiveness(boolean z7) {
            this.delegate.setAllowAudioMixedChannelCountAdaptiveness(z7);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedDecoderSupportAdaptiveness(boolean z7) {
            this.delegate.setAllowAudioMixedDecoderSupportAdaptiveness(z7);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedMimeTypeAdaptiveness(boolean z7) {
            this.delegate.setAllowAudioMixedMimeTypeAdaptiveness(z7);
            return this;
        }

        public ParametersBuilder setAllowAudioMixedSampleRateAdaptiveness(boolean z7) {
            this.delegate.setAllowAudioMixedSampleRateAdaptiveness(z7);
            return this;
        }

        public ParametersBuilder setAllowMultipleAdaptiveSelections(boolean z7) {
            this.delegate.setAllowMultipleAdaptiveSelections(z7);
            return this;
        }

        public ParametersBuilder setAllowVideoMixedDecoderSupportAdaptiveness(boolean z7) {
            this.delegate.setAllowVideoMixedDecoderSupportAdaptiveness(z7);
            return this;
        }

        public ParametersBuilder setAllowVideoMixedMimeTypeAdaptiveness(boolean z7) {
            this.delegate.setAllowVideoMixedMimeTypeAdaptiveness(z7);
            return this;
        }

        public ParametersBuilder setAllowVideoNonSeamlessAdaptiveness(boolean z7) {
            this.delegate.setAllowVideoNonSeamlessAdaptiveness(z7);
            return this;
        }

        @Deprecated
        public ParametersBuilder setDisabledTextTrackSelectionFlags(int i) {
            this.delegate.setDisabledTextTrackSelectionFlags(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        @Deprecated
        public /* bridge */ /* synthetic */ C0245u1 setDisabledTrackTypes(Set set) {
            return setDisabledTrackTypes((Set<Integer>) set);
        }

        public ParametersBuilder setExceedAudioConstraintsIfNecessary(boolean z7) {
            this.delegate.setExceedAudioConstraintsIfNecessary(z7);
            return this;
        }

        public ParametersBuilder setExceedRendererCapabilitiesIfNecessary(boolean z7) {
            this.delegate.setExceedRendererCapabilitiesIfNecessary(z7);
            return this;
        }

        public ParametersBuilder setExceedVideoConstraintsIfNecessary(boolean z7) {
            this.delegate.setExceedVideoConstraintsIfNecessary(z7);
            return this;
        }

        public ParametersBuilder setRendererDisabled(int i, boolean z7) {
            this.delegate.setRendererDisabled(i, z7);
            return this;
        }

        @Deprecated
        public ParametersBuilder setSelectionOverride(int i, TrackGroupArray trackGroupArray, SelectionOverride selectionOverride) {
            this.delegate.setSelectionOverride(i, trackGroupArray, selectionOverride);
            return this;
        }

        public ParametersBuilder setTunnelingEnabled(boolean z7) {
            this.delegate.setTunnelingEnabled(z7);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder addOverride(C0236r1 c0236r1) {
            this.delegate.addOverride(c0236r1);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public Parameters build() {
            return this.delegate.build();
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder clearOverride(C0233q1 c0233q1) {
            this.delegate.clearOverride(c0233q1);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder clearOverrides() {
            this.delegate.clearOverrides();
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder clearOverridesOfType(int i) {
            this.delegate.clearOverridesOfType(i);
            return this;
        }

        @Deprecated
        public ParametersBuilder clearSelectionOverrides() {
            this.delegate.clearSelectionOverrides();
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder clearVideoSizeConstraints() {
            this.delegate.clearVideoSizeConstraints();
            return this;
        }

        public ParametersBuilder clearViewportSizeConstraints() {
            this.delegate.clearViewportSizeConstraints();
            return this;
        }

        public ParametersBuilder set(C0248v1 c0248v1) {
            this.delegate.set(c0248v1);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setAudioOffloadPreferences(C0242t1 c0242t1) {
            this.delegate.setAudioOffloadPreferences(c0242t1);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        @Deprecated
        public ParametersBuilder setDisabledTrackTypes(Set<Integer> set) {
            this.delegate.setDisabledTrackTypes(set);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setForceHighestSupportedBitrate(boolean z7) {
            this.delegate.setForceHighestSupportedBitrate(z7);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setForceLowestBitrate(boolean z7) {
            this.delegate.setForceLowestBitrate(z7);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setIgnoredTextSelectionFlags(int i) {
            this.delegate.setIgnoredTextSelectionFlags(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setMaxAudioBitrate(int i) {
            this.delegate.setMaxAudioBitrate(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setMaxAudioChannelCount(int i) {
            this.delegate.setMaxAudioChannelCount(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setMaxVideoBitrate(int i) {
            this.delegate.setMaxVideoBitrate(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setMaxVideoFrameRate(int i) {
            this.delegate.setMaxVideoFrameRate(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setMaxVideoSize(int i, int i4) {
            this.delegate.setMaxVideoSize(i, i4);
            return this;
        }

        public ParametersBuilder setMaxVideoSizeSd() {
            this.delegate.setMaxVideoSizeSd();
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setMinVideoBitrate(int i) {
            this.delegate.setMinVideoBitrate(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setMinVideoFrameRate(int i) {
            this.delegate.setMinVideoFrameRate(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setMinVideoSize(int i, int i4) {
            this.delegate.setMinVideoSize(i, i4);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setOverrideForType(C0236r1 c0236r1) {
            this.delegate.setOverrideForType(c0236r1);
            return this;
        }

        public ParametersBuilder setPreferredAudioLanguage(String str) {
            this.delegate.setPreferredAudioLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPreferredAudioLanguages(String... strArr) {
            this.delegate.setPreferredAudioLanguages(strArr);
            return this;
        }

        public ParametersBuilder setPreferredAudioMimeType(String str) {
            this.delegate.setPreferredAudioMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPreferredAudioMimeTypes(String... strArr) {
            this.delegate.setPreferredAudioMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPreferredAudioRoleFlags(int i) {
            this.delegate.setPreferredAudioRoleFlags(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPreferredTextLanguage(String str) {
            this.delegate.setPreferredTextLanguage(str);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(Context context) {
            this.delegate.setPreferredTextLanguageAndRoleFlagsToCaptioningManagerSettings(context);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPreferredTextLanguages(String... strArr) {
            this.delegate.setPreferredTextLanguages(strArr);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPreferredTextRoleFlags(int i) {
            this.delegate.setPreferredTextRoleFlags(i);
            return this;
        }

        public ParametersBuilder setPreferredVideoMimeType(String str) {
            this.delegate.setPreferredVideoMimeType(str);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPreferredVideoMimeTypes(String... strArr) {
            this.delegate.setPreferredVideoMimeTypes(strArr);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPreferredVideoRoleFlags(int i) {
            this.delegate.setPreferredVideoRoleFlags(i);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setPrioritizeImageOverVideoEnabled(boolean z7) {
            this.delegate.setPrioritizeImageOverVideoEnabled(z7);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setSelectUndeterminedTextLanguage(boolean z7) {
            this.delegate.setSelectUndeterminedTextLanguage(z7);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setTrackTypeDisabled(int i, boolean z7) {
            this.delegate.setTrackTypeDisabled(i, z7);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setViewportSize(int i, int i4, boolean z7) {
            this.delegate.setViewportSize(i, i4, z7);
            return this;
        }

        @Override // androidx.media3.common.C0245u1
        public ParametersBuilder setViewportSizeToPhysicalDisplaySize(Context context, boolean z7) {
            this.delegate.setViewportSizeToPhysicalDisplaySize(context, z7);
            return this;
        }

        public ParametersBuilder(Context context) {
            this.delegate = new Parameters.Builder(context);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SelectionOverride {
        private static final String FIELD_GROUP_INDEX;
        private static final String FIELD_TRACKS;
        private static final String FIELD_TRACK_TYPE;
        public final int groupIndex;
        public final int length;
        public final int[] tracks;
        public final int type;

        static {
            int i = AbstractC1118i0.f4750a;
            FIELD_GROUP_INDEX = Integer.toString(0, 36);
            FIELD_TRACKS = Integer.toString(1, 36);
            FIELD_TRACK_TYPE = Integer.toString(2, 36);
        }

        public SelectionOverride(int i, int... iArr) {
            this(i, iArr, 0);
        }

        public static SelectionOverride fromBundle(Bundle bundle) {
            int i = bundle.getInt(FIELD_GROUP_INDEX, -1);
            int[] intArray = bundle.getIntArray(FIELD_TRACKS);
            int i4 = bundle.getInt(FIELD_TRACK_TYPE, -1);
            AbstractC1101a.m2353d(i >= 0 && i4 >= 0);
            intArray.getClass();
            return new SelectionOverride(i, intArray, i4);
        }

        public boolean containsTrack(int i) {
            for (int i4 : this.tracks) {
                if (i4 == i) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && SelectionOverride.class == obj.getClass()) {
                SelectionOverride selectionOverride = (SelectionOverride) obj;
                if (this.groupIndex == selectionOverride.groupIndex && Arrays.equals(this.tracks, selectionOverride.tracks) && this.type == selectionOverride.type) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((Arrays.hashCode(this.tracks) + (this.groupIndex * 31)) * 31) + this.type;
        }

        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putInt(FIELD_GROUP_INDEX, this.groupIndex);
            bundle.putIntArray(FIELD_TRACKS, this.tracks);
            bundle.putInt(FIELD_TRACK_TYPE, this.type);
            return bundle;
        }

        public SelectionOverride(int i, int[] iArr, int i4) {
            this.groupIndex = i;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.tracks = iArrCopyOf;
            this.length = iArr.length;
            this.type = i4;
            Arrays.sort(iArrCopyOf);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class SpatializerWrapperV32 {
        private Handler handler;
        private Spatializer$OnSpatializerStateChangedListener listener;
        private final boolean spatializationSupported;
        private final Spatializer spatializer;

        private SpatializerWrapperV32(Spatializer spatializer) {
            this.spatializer = spatializer;
            this.spatializationSupported = spatializer.getImmersiveAudioLevel() != 0;
        }

        public static SpatializerWrapperV32 tryCreateInstance(Context context) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager == null) {
                return null;
            }
            return new SpatializerWrapperV32(audioManager.getSpatializer());
        }

        public boolean canBeSpatialized(C0201g c0201g, C0249w c0249w) throws IllegalArgumentException {
            String str = c0249w.f1522n;
            String str2 = c0249w.f1522n;
            int i = c0249w.f1498C;
            if (Objects.equals(str, "audio/eac3-joc")) {
                if (i == 16) {
                    i = 12;
                }
            } else if (Objects.equals(str2, "audio/iamf")) {
                if (i == -1) {
                    i = 6;
                }
            } else if (Objects.equals(str2, "audio/ac4") && (i == 18 || i == 21)) {
                i = 24;
            }
            int iM2462u = AbstractC1118i0.m2462u(i);
            if (iM2462u == 0) {
                return false;
            }
            AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(iM2462u);
            int i4 = c0249w.f1499D;
            if (i4 != -1) {
                channelMask.setSampleRate(i4);
            }
            return this.spatializer.canBeSpatialized((AudioAttributes) c0201g.m619a().f143k, channelMask.build());
        }

        public void ensureInitialized(final DefaultTrackSelector defaultTrackSelector, Looper looper) {
            if (this.listener == null && this.handler == null) {
                this.listener = new Spatializer$OnSpatializerStateChangedListener() { // from class: androidx.media3.exoplayer.trackselection.DefaultTrackSelector.SpatializerWrapperV32.1
                    public void onSpatializerAvailableChanged(Spatializer spatializer, boolean z7) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }

                    public void onSpatializerEnabledChanged(Spatializer spatializer, boolean z7) {
                        defaultTrackSelector.maybeInvalidateForAudioChannelCountConstraints();
                    }
                };
                Handler handler = new Handler(looper);
                this.handler = handler;
                this.spatializer.addOnSpatializerStateChangedListener(new ExecutorC0325n(handler), this.listener);
            }
        }

        public boolean isAvailable() {
            return this.spatializer.isAvailable();
        }

        public boolean isEnabled() {
            return this.spatializer.isEnabled();
        }

        public boolean isSpatializationSupported() {
            return this.spatializationSupported;
        }

        public void release() {
            Spatializer$OnSpatializerStateChangedListener spatializer$OnSpatializerStateChangedListener = this.listener;
            if (spatializer$OnSpatializerStateChangedListener == null || this.handler == null) {
                return;
            }
            this.spatializer.removeOnSpatializerStateChangedListener(spatializer$OnSpatializerStateChangedListener);
            Handler handler = this.handler;
            int i = AbstractC1118i0.f4750a;
            handler.removeCallbacksAndMessages(null);
            this.handler = null;
            this.listener = null;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class TextTrackInfo extends TrackInfo<TextTrackInfo> implements Comparable<TextTrackInfo> {
        private final boolean hasCaptionRoleFlags;
        private final boolean isDefault;
        private final boolean isForced;
        private final boolean isWithinRendererCapabilities;
        private final int preferredLanguageIndex;
        private final int preferredLanguageScore;
        private final int preferredRoleFlagsScore;
        private final int selectedAudioLanguageScore;
        private final int selectionEligibility;

        public TextTrackInfo(int i, C0233q1 c0233q1, int i4, Parameters parameters, int i8, String str) {
            int formatLanguageScore;
            super(i, c0233q1, i4);
            int i9 = 0;
            this.isWithinRendererCapabilities = RendererCapabilities.isFormatSupported(i8, false);
            int i10 = this.format.f1513e & (~parameters.ignoredTextSelectionFlags);
            this.isDefault = (i10 & 1) != 0;
            this.isForced = (i10 & 2) != 0;
            AbstractC0983m0 abstractC0983m0M2168n = parameters.preferredTextLanguages.isEmpty() ? AbstractC0983m0.m2168n(C2181z.FRAGMENT_ENCODE_SET) : parameters.preferredTextLanguages;
            int i11 = 0;
            while (true) {
                if (i11 >= abstractC0983m0M2168n.size()) {
                    i11 = Integer.MAX_VALUE;
                    formatLanguageScore = 0;
                    break;
                } else {
                    formatLanguageScore = DefaultTrackSelector.getFormatLanguageScore(this.format, (String) abstractC0983m0M2168n.get(i11), parameters.selectUndeterminedTextLanguage);
                    if (formatLanguageScore > 0) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.preferredLanguageIndex = i11;
            this.preferredLanguageScore = formatLanguageScore;
            int roleFlagMatchScore = DefaultTrackSelector.getRoleFlagMatchScore(this.format.f1514f, parameters.preferredTextRoleFlags);
            this.preferredRoleFlagsScore = roleFlagMatchScore;
            this.hasCaptionRoleFlags = (this.format.f1514f & 1088) != 0;
            int formatLanguageScore2 = DefaultTrackSelector.getFormatLanguageScore(this.format, str, DefaultTrackSelector.normalizeUndeterminedLanguageToNull(str) == null);
            this.selectedAudioLanguageScore = formatLanguageScore2;
            boolean z7 = formatLanguageScore > 0 || (parameters.preferredTextLanguages.isEmpty() && roleFlagMatchScore > 0) || this.isDefault || (this.isForced && formatLanguageScore2 > 0);
            if (RendererCapabilities.isFormatSupported(i8, parameters.exceedRendererCapabilitiesIfNecessary) && z7) {
                i9 = 1;
            }
            this.selectionEligibility = i9;
        }

        public static int compareSelections(List<TextTrackInfo> list, List<TextTrackInfo> list2) {
            return list.get(0).compareTo(list2.get(0));
        }

        public static AbstractC0983m0 createForTrackGroup(int i, C0233q1 c0233q1, Parameters parameters, int[] iArr, String str) {
            C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
            for (int i4 = 0; i4 < c0233q1.f1319a; i4++) {
                c0974j0M2164i.m2141a(new TextTrackInfo(i, c0233q1, i4, parameters, iArr[i4], str));
            }
            return c0974j0M2164i.m2159f();
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(TextTrackInfo textTrackInfo) {
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(TextTrackInfo textTrackInfo) {
            AbstractC0956d0 abstractC0956d0Mo2134c = AbstractC0956d0.f4172a.mo2134c(this.isWithinRendererCapabilities, textTrackInfo.isWithinRendererCapabilities);
            Integer numValueOf = Integer.valueOf(this.preferredLanguageIndex);
            Integer numValueOf2 = Integer.valueOf(textTrackInfo.preferredLanguageIndex);
            C0975j1 c0975j1 = C0975j1.f4201k;
            C0975j1 c0975j12 = C0975j1.f4202l;
            AbstractC0956d0 abstractC0956d0Mo2134c2 = abstractC0956d0Mo2134c.mo2133b(numValueOf, numValueOf2, c0975j12).mo2132a(this.preferredLanguageScore, textTrackInfo.preferredLanguageScore).mo2132a(this.preferredRoleFlagsScore, textTrackInfo.preferredRoleFlagsScore).mo2134c(this.isDefault, textTrackInfo.isDefault);
            Boolean boolValueOf = Boolean.valueOf(this.isForced);
            Boolean boolValueOf2 = Boolean.valueOf(textTrackInfo.isForced);
            if (this.preferredLanguageScore != 0) {
                c0975j1 = c0975j12;
            }
            AbstractC0956d0 abstractC0956d0Mo2132a = abstractC0956d0Mo2134c2.mo2133b(boolValueOf, boolValueOf2, c0975j1).mo2132a(this.selectedAudioLanguageScore, textTrackInfo.selectedAudioLanguageScore);
            if (this.preferredRoleFlagsScore == 0) {
                abstractC0956d0Mo2132a = abstractC0956d0Mo2132a.mo2135d(this.hasCaptionRoleFlags, textTrackInfo.hasCaptionRoleFlags);
            }
            return abstractC0956d0Mo2132a.mo2136e();
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static abstract class TrackInfo<T extends TrackInfo<T>> {
        public final C0249w format;
        public final int rendererIndex;
        public final C0233q1 trackGroup;
        public final int trackIndex;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        public interface Factory<T extends TrackInfo<T>> {
            List<T> create(int i, C0233q1 c0233q1, int[] iArr);
        }

        public TrackInfo(int i, C0233q1 c0233q1, int i4) {
            this.rendererIndex = i;
            this.trackGroup = c0233q1;
            this.trackIndex = i4;
            this.format = c0233q1.f1322d[i4];
        }

        public abstract int getSelectionEligibility();

        public abstract boolean isCompatibleForAdaptationWith(T t8);
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class VideoTrackInfo extends TrackInfo<VideoTrackInfo> {
        private static final float MIN_REASONABLE_FRAME_RATE = 10.0f;
        private final boolean allowMixedMimeTypes;
        private final int bitrate;
        private final int codecPreferenceScore;
        private final boolean hasMainOrNoRoleFlag;
        private final boolean hasReasonableFrameRate;
        private final boolean isWithinMaxConstraints;
        private final boolean isWithinMinConstraints;
        private final boolean isWithinRendererCapabilities;
        private final Parameters parameters;
        private final int pixelCount;
        private final int preferredMimeTypeMatchIndex;
        private final int preferredRoleFlagsScore;
        private final int selectionEligibility;
        private final boolean usesHardwareAcceleration;
        private final boolean usesPrimaryDecoder;

        /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x0079  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public VideoTrackInfo(int i, C0233q1 c0233q1, int i4, Parameters parameters, int i8, int i9, boolean z7) {
            boolean z8;
            boolean z9;
            int i10;
            C0249w c0249w;
            int i11;
            int i12;
            int i13;
            C0249w c0249w2;
            int i14;
            int i15;
            int i16;
            super(i, c0233q1, i4);
            this.parameters = parameters;
            int i17 = parameters.allowVideoNonSeamlessAdaptiveness ? 24 : 16;
            this.allowMixedMimeTypes = parameters.allowVideoMixedMimeTypeAdaptiveness && (i9 & i17) != 0;
            int i18 = -1;
            if (!z7 || (((i14 = (c0249w2 = this.format).f1529u) != -1 && i14 > parameters.maxVideoWidth) || ((i15 = c0249w2.f1530v) != -1 && i15 > parameters.maxVideoHeight))) {
                z8 = false;
            } else {
                float f8 = c0249w2.f1531w;
                if ((f8 == -1.0f || f8 <= parameters.maxVideoFrameRate) && ((i16 = c0249w2.f1518j) == -1 || i16 <= parameters.maxVideoBitrate)) {
                    z8 = true;
                }
            }
            this.isWithinMaxConstraints = z8;
            if (!z7 || (((i11 = (c0249w = this.format).f1529u) != -1 && i11 < parameters.minVideoWidth) || ((i12 = c0249w.f1530v) != -1 && i12 < parameters.minVideoHeight))) {
                z9 = false;
            } else {
                float f9 = c0249w.f1531w;
                if ((f9 == -1.0f || f9 >= parameters.minVideoFrameRate) && ((i13 = c0249w.f1518j) == -1 || i13 >= parameters.minVideoBitrate)) {
                    z9 = true;
                }
            }
            this.isWithinMinConstraints = z9;
            this.isWithinRendererCapabilities = RendererCapabilities.isFormatSupported(i8, false);
            C0249w c0249w3 = this.format;
            float f10 = c0249w3.f1531w;
            this.hasReasonableFrameRate = f10 != -1.0f && f10 >= MIN_REASONABLE_FRAME_RATE;
            this.bitrate = c0249w3.f1518j;
            int i19 = c0249w3.f1529u;
            if (i19 != -1 && (i10 = c0249w3.f1530v) != -1) {
                i18 = i19 * i10;
            }
            this.pixelCount = i18;
            this.preferredRoleFlagsScore = DefaultTrackSelector.getRoleFlagMatchScore(c0249w3.f1514f, parameters.preferredVideoRoleFlags);
            int i20 = this.format.f1514f;
            this.hasMainOrNoRoleFlag = i20 == 0 || (i20 & 1) != 0;
            int i21 = 0;
            while (true) {
                if (i21 >= parameters.preferredVideoMimeTypes.size()) {
                    i21 = Integer.MAX_VALUE;
                    break;
                }
                String str = this.format.f1522n;
                if (str != null && str.equals(parameters.preferredVideoMimeTypes.get(i21))) {
                    break;
                } else {
                    i21++;
                }
            }
            this.preferredMimeTypeMatchIndex = i21;
            this.usesPrimaryDecoder = RendererCapabilities.getDecoderSupport(i8) == 128;
            this.usesHardwareAcceleration = RendererCapabilities.getHardwareAccelerationSupport(i8) == 64;
            this.codecPreferenceScore = DefaultTrackSelector.getVideoCodecPreferenceScore(this.format.f1522n);
            this.selectionEligibility = evaluateSelectionEligibility(i8, i17);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareNonQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            AbstractC0956d0 abstractC0956d0Mo2134c = AbstractC0956d0.f4172a.mo2134c(videoTrackInfo.isWithinRendererCapabilities, videoTrackInfo2.isWithinRendererCapabilities).mo2132a(videoTrackInfo.preferredRoleFlagsScore, videoTrackInfo2.preferredRoleFlagsScore).mo2134c(videoTrackInfo.hasMainOrNoRoleFlag, videoTrackInfo2.hasMainOrNoRoleFlag).mo2134c(videoTrackInfo.hasReasonableFrameRate, videoTrackInfo2.hasReasonableFrameRate).mo2134c(videoTrackInfo.isWithinMaxConstraints, videoTrackInfo2.isWithinMaxConstraints).mo2134c(videoTrackInfo.isWithinMinConstraints, videoTrackInfo2.isWithinMinConstraints).mo2133b(Integer.valueOf(videoTrackInfo.preferredMimeTypeMatchIndex), Integer.valueOf(videoTrackInfo2.preferredMimeTypeMatchIndex), C0975j1.f4202l).mo2134c(videoTrackInfo.usesPrimaryDecoder, videoTrackInfo2.usesPrimaryDecoder).mo2134c(videoTrackInfo.usesHardwareAcceleration, videoTrackInfo2.usesHardwareAcceleration);
            if (videoTrackInfo.usesPrimaryDecoder && videoTrackInfo.usesHardwareAcceleration) {
                abstractC0956d0Mo2134c = abstractC0956d0Mo2134c.mo2132a(videoTrackInfo.codecPreferenceScore, videoTrackInfo2.codecPreferenceScore);
            }
            return abstractC0956d0Mo2134c.mo2136e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int compareQualityPreferences(VideoTrackInfo videoTrackInfo, VideoTrackInfo videoTrackInfo2) {
            AbstractC0978k1 abstractC0978k1Mo2160a = (videoTrackInfo.isWithinMaxConstraints && videoTrackInfo.isWithinRendererCapabilities) ? DefaultTrackSelector.FORMAT_VALUE_ORDERING : DefaultTrackSelector.FORMAT_VALUE_ORDERING.mo2160a();
            boolean z7 = videoTrackInfo.parameters.forceLowestBitrate;
            AbstractC0956d0 abstractC0956d0Mo2133b = AbstractC0956d0.f4172a;
            if (z7) {
                abstractC0956d0Mo2133b = abstractC0956d0Mo2133b.mo2133b(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), DefaultTrackSelector.FORMAT_VALUE_ORDERING.mo2160a());
            }
            return abstractC0956d0Mo2133b.mo2133b(Integer.valueOf(videoTrackInfo.pixelCount), Integer.valueOf(videoTrackInfo2.pixelCount), abstractC0978k1Mo2160a).mo2133b(Integer.valueOf(videoTrackInfo.bitrate), Integer.valueOf(videoTrackInfo2.bitrate), abstractC0978k1Mo2160a).mo2136e();
        }

        public static int compareSelections(List<VideoTrackInfo> list, List<VideoTrackInfo> list2) {
            int i = 5;
            return C0950b0.m2131f(compareNonQualityPreferences((VideoTrackInfo) Collections.max(list, new C0471b(4)), (VideoTrackInfo) Collections.max(list2, new C0471b(4)))).mo2132a(list.size(), list2.size()).mo2133b((VideoTrackInfo) Collections.max(list, new C0471b(i)), (VideoTrackInfo) Collections.max(list2, new C0471b(i)), new C0471b(i)).mo2136e();
        }

        public static AbstractC0983m0 createForTrackGroup(int i, C0233q1 c0233q1, Parameters parameters, int[] iArr, int i4) {
            int i8;
            int maxVideoPixelsToRetainForViewport = DefaultTrackSelector.getMaxVideoPixelsToRetainForViewport(c0233q1, parameters.viewportWidth, parameters.viewportHeight, parameters.viewportOrientationMayChange);
            C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
            for (int i9 = 0; i9 < c0233q1.f1319a; i9++) {
                C0249w c0249w = c0233q1.f1322d[i9];
                int i10 = c0249w.f1529u;
                int i11 = (i10 == -1 || (i8 = c0249w.f1530v) == -1) ? -1 : i10 * i8;
                c0974j0M2164i.m2141a(new VideoTrackInfo(i, c0233q1, i9, parameters, iArr[i9], i4, maxVideoPixelsToRetainForViewport == Integer.MAX_VALUE || (i11 != -1 && i11 <= maxVideoPixelsToRetainForViewport)));
            }
            return c0974j0M2164i.m2159f();
        }

        private int evaluateSelectionEligibility(int i, int i4) {
            if ((this.format.f1514f & 16384) != 0 || !RendererCapabilities.isFormatSupported(i, this.parameters.exceedRendererCapabilitiesIfNecessary)) {
                return 0;
            }
            if (!this.isWithinMaxConstraints && !this.parameters.exceedVideoConstraintsIfNecessary) {
                return 0;
            }
            if (!RendererCapabilities.isFormatSupported(i, false) || !this.isWithinMinConstraints || !this.isWithinMaxConstraints || this.format.f1518j == -1) {
                return 1;
            }
            Parameters parameters = this.parameters;
            return (parameters.forceHighestSupportedBitrate || parameters.forceLowestBitrate || (i & i4) == 0) ? 1 : 2;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public int getSelectionEligibility() {
            return this.selectionEligibility;
        }

        @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo
        public boolean isCompatibleForAdaptationWith(VideoTrackInfo videoTrackInfo) {
            if (!this.allowMixedMimeTypes) {
                String str = this.format.f1522n;
                String str2 = videoTrackInfo.format.f1522n;
                int i = AbstractC1118i0.f4750a;
                if (!Objects.equals(str, str2)) {
                    return false;
                }
            }
            if (this.parameters.allowVideoMixedDecoderSupportAdaptiveness) {
                return true;
            }
            return this.usesPrimaryDecoder == videoTrackInfo.usesPrimaryDecoder && this.usesHardwareAcceleration == videoTrackInfo.usesHardwareAcceleration;
        }
    }

    public DefaultTrackSelector(Context context) {
        this(context, new AdaptiveTrackSelection.Factory());
    }

    private static void applyLegacyRendererOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, Parameters parameters, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        for (int i = 0; i < rendererCount; i++) {
            TrackGroupArray trackGroups = mappedTrackInfo.getTrackGroups(i);
            if (parameters.hasSelectionOverride(i, trackGroups)) {
                SelectionOverride selectionOverride = parameters.getSelectionOverride(i, trackGroups);
                definitionArr[i] = (selectionOverride == null || selectionOverride.tracks.length == 0) ? null : new ExoTrackSelection.Definition(trackGroups.get(selectionOverride.groupIndex), selectionOverride.tracks, selectionOverride.type);
            }
        }
    }

    private static void applyTrackSelectionOverrides(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, C0248v1 c0248v1, ExoTrackSelection.Definition[] definitionArr) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        HashMap map = new HashMap();
        for (int i = 0; i < rendererCount; i++) {
            collectTrackSelectionOverrides(mappedTrackInfo.getTrackGroups(i), c0248v1, map);
        }
        collectTrackSelectionOverrides(mappedTrackInfo.getUnmappedTrackGroups(), c0248v1, map);
        for (int i4 = 0; i4 < rendererCount; i4++) {
            C0236r1 c0236r1 = (C0236r1) map.get(Integer.valueOf(mappedTrackInfo.getRendererType(i4)));
            if (c0236r1 != null) {
                C0233q1 c0233q1 = c0236r1.f1403a;
                AbstractC0983m0 abstractC0983m0 = c0236r1.f1404b;
                definitionArr[i4] = (abstractC0983m0.isEmpty() || mappedTrackInfo.getTrackGroups(i4).indexOf(c0233q1) == -1) ? null : new ExoTrackSelection.Definition(c0233q1, AbstractC0715d.m1569p0(abstractC0983m0));
            }
        }
    }

    private static void collectTrackSelectionOverrides(TrackGroupArray trackGroupArray, C0248v1 c0248v1, Map<Integer, C0236r1> map) {
        for (int i = 0; i < trackGroupArray.length; i++) {
            C0236r1 c0236r1 = (C0236r1) c0248v1.overrides.get(trackGroupArray.get(i));
            if (c0236r1 != null) {
                C0233q1 c0233q1 = c0236r1.f1403a;
                C0236r1 c0236r12 = map.get(Integer.valueOf(c0233q1.f1321c));
                if (c0236r12 == null || (c0236r12.f1404b.isEmpty() && !c0236r1.f1404b.isEmpty())) {
                    map.put(Integer.valueOf(c0233q1.f1321c), c0236r1);
                }
            }
        }
    }

    public static int getFormatLanguageScore(C0249w c0249w, String str, boolean z7) {
        if (!TextUtils.isEmpty(str) && str.equals(c0249w.f1512d)) {
            return 4;
        }
        String strNormalizeUndeterminedLanguageToNull = normalizeUndeterminedLanguageToNull(str);
        String strNormalizeUndeterminedLanguageToNull2 = normalizeUndeterminedLanguageToNull(c0249w.f1512d);
        if (strNormalizeUndeterminedLanguageToNull2 == null || strNormalizeUndeterminedLanguageToNull == null) {
            return (z7 && strNormalizeUndeterminedLanguageToNull2 == null) ? 1 : 0;
        }
        if (strNormalizeUndeterminedLanguageToNull2.startsWith(strNormalizeUndeterminedLanguageToNull) || strNormalizeUndeterminedLanguageToNull.startsWith(strNormalizeUndeterminedLanguageToNull2)) {
            return 3;
        }
        int i = AbstractC1118i0.f4750a;
        return strNormalizeUndeterminedLanguageToNull2.split("-", 2)[0].equals(strNormalizeUndeterminedLanguageToNull.split("-", 2)[0]) ? 2 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getMaxVideoPixelsToRetainForViewport(C0233q1 c0233q1, int i, int i4, boolean z7) {
        int i8 = Integer.MAX_VALUE;
        if (i != Integer.MAX_VALUE && i4 != Integer.MAX_VALUE) {
            for (int i9 = 0; i9 < c0233q1.f1319a; i9++) {
                C0249w c0249w = c0233q1.f1322d[i9];
                int i10 = c0249w.f1529u;
                int i11 = c0249w.f1530v;
                if (i10 > 0 && i11 > 0) {
                    Point maxVideoSizeInViewport = TrackSelectionUtil.getMaxVideoSizeInViewport(z7, i, i4, i10, i11);
                    int i12 = c0249w.f1529u;
                    int i13 = i12 * i11;
                    if (i12 >= ((int) (maxVideoSizeInViewport.x * FRACTION_TO_CONSIDER_FULLSCREEN)) && i11 >= ((int) (maxVideoSizeInViewport.y * FRACTION_TO_CONSIDER_FULLSCREEN)) && i13 < i8) {
                        i8 = i13;
                    }
                }
            }
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getRoleFlagMatchScore(int i, int i4) {
        if (i == 0 || i != i4) {
            return Integer.bitCount(i & i4);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getVideoCodecPreferenceScore(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAudioFormatWithinAudioChannelCountConstraints(C0249w c0249w) {
        boolean z7;
        int i;
        SpatializerWrapperV32 spatializerWrapperV32;
        SpatializerWrapperV32 spatializerWrapperV322;
        synchronized (this.lock) {
            try {
                if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && (i = c0249w.f1498C) != -1 && i > 2 && (!isDolbyAudio(c0249w) || (AbstractC1118i0.f4750a >= 32 && (spatializerWrapperV322 = this.spatializer) != null && spatializerWrapperV322.isSpatializationSupported()))) {
                    z7 = AbstractC1118i0.f4750a >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported() && this.spatializer.isAvailable() && this.spatializer.isEnabled() && this.spatializer.canBeSpatialized(this.audioAttributes, c0249w);
                }
            } finally {
            }
        }
        return z7;
    }

    private static boolean isDolbyAudio(C0249w c0249w) {
        String str = c0249w.f1522n;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isObjectBasedAudio(C0249w c0249w) {
        String str = c0249w.f1522n;
        if (str == null) {
            return false;
        }
        str.getClass();
        switch (str) {
        }
        return false;
    }

    @Deprecated
    public static boolean isSupported(int i, boolean z7) {
        return RendererCapabilities.isFormatSupported(i, z7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List lambda$selectAudioTrack$2(Parameters parameters, boolean z7, int[] iArr, int i, C0233q1 c0233q1, int[] iArr2) {
        return AudioTrackInfo.createForTrackGroup(i, c0233q1, parameters, iArr2, z7, new InterfaceC0918f() { // from class: androidx.media3.exoplayer.trackselection.a
            @Override // p043e6.InterfaceC0918f
            public final boolean apply(Object obj) {
                return this.f1869j.isAudioFormatWithinAudioChannelCountConstraints((C0249w) obj);
            }
        }, iArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectImageTrack$4(Parameters parameters, int i, C0233q1 c0233q1, int[] iArr) {
        return ImageTrackInfo.createForTrackGroup(i, c0233q1, parameters, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectTextTrack$3(Parameters parameters, String str, int i, C0233q1 c0233q1, int[] iArr) {
        return TextTrackInfo.createForTrackGroup(i, c0233q1, parameters, iArr, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ List lambda$selectVideoTrack$1(Parameters parameters, int[] iArr, int i, C0233q1 c0233q1, int[] iArr2) {
        return VideoTrackInfo.createForTrackGroup(i, c0233q1, parameters, iArr2, iArr[i]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    private static void maybeConfigureRendererForOffload(Parameters parameters, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        int i = -1;
        boolean z7 = false;
        int i4 = 0;
        for (int i8 = 0; i8 < mappedTrackInfo.getRendererCount(); i8++) {
            int rendererType = mappedTrackInfo.getRendererType(i8);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i8];
            if (rendererType != 1 && exoTrackSelection != null) {
                return;
            }
            if (rendererType == 1 && exoTrackSelection != null && exoTrackSelection.length() == 1) {
                if (rendererSupportsOffload(parameters, iArr[i8][mappedTrackInfo.getTrackGroups(i8).indexOf(exoTrackSelection.getTrackGroup())][exoTrackSelection.getIndexInTrackGroup(0)], exoTrackSelection.getSelectedFormat())) {
                    i4++;
                    i = i8;
                }
            }
        }
        if (i4 == 1) {
            int i9 = parameters.audioOffloadPreferences.f1419b ? 1 : 2;
            RendererConfiguration rendererConfiguration = rendererConfigurationArr[i];
            if (rendererConfiguration != null && rendererConfiguration.tunneling) {
                z7 = true;
            }
            rendererConfigurationArr[i] = new RendererConfiguration(i9, z7);
        }
    }

    private static void maybeConfigureRenderersForTunneling(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, RendererConfiguration[] rendererConfigurationArr, ExoTrackSelection[] exoTrackSelectionArr) {
        boolean z7;
        int i = -1;
        int i4 = -1;
        for (int i8 = 0; i8 < mappedTrackInfo.getRendererCount(); i8++) {
            int rendererType = mappedTrackInfo.getRendererType(i8);
            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i8];
            if ((rendererType == 1 || rendererType == 2) && exoTrackSelection != null && rendererSupportsTunneling(iArr[i8], mappedTrackInfo.getTrackGroups(i8), exoTrackSelection)) {
                if (rendererType == 1) {
                    if (i4 != -1) {
                        z7 = false;
                        break;
                    }
                    i4 = i8;
                } else {
                    if (i != -1) {
                        z7 = false;
                        break;
                    }
                    i = i8;
                }
            }
        }
        z7 = true;
        if (z7 && ((i4 == -1 || i == -1) ? false : true)) {
            RendererConfiguration rendererConfiguration = new RendererConfiguration(0, true);
            rendererConfigurationArr[i4] = rendererConfiguration;
            rendererConfigurationArr[i] = rendererConfiguration;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeInvalidateForAudioChannelCountConstraints() {
        boolean z7;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            try {
                z7 = this.parameters.constrainAudioChannelCountToDeviceCapabilities && !this.deviceIsTV && AbstractC1118i0.f4750a >= 32 && (spatializerWrapperV32 = this.spatializer) != null && spatializerWrapperV32.isSpatializationSupported();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            invalidate();
        }
    }

    private void maybeInvalidateForRendererCapabilitiesChange(Renderer renderer) {
        boolean z7;
        synchronized (this.lock) {
            z7 = this.parameters.allowInvalidateSelectionsOnRendererCapabilitiesChange;
        }
        if (z7) {
            invalidateForRendererCapabilitiesChange(renderer);
        }
    }

    public static String normalizeUndeterminedLanguageToNull(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean rendererSupportsOffload(Parameters parameters, int i, C0249w c0249w) {
        if (RendererCapabilities.getAudioOffloadSupport(i) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.f1420c && (RendererCapabilities.getAudioOffloadSupport(i) & 2048) == 0) {
            return false;
        }
        if (parameters.audioOffloadPreferences.f1419b) {
            boolean z7 = (c0249w.f1501F == 0 && c0249w.f1502G == 0) ? false : true;
            boolean z8 = (RendererCapabilities.getAudioOffloadSupport(i) & 1024) != 0;
            if (z7 && !z8) {
                return false;
            }
        }
        return true;
    }

    private static boolean rendererSupportsTunneling(int[][] iArr, TrackGroupArray trackGroupArray, ExoTrackSelection exoTrackSelection) {
        if (exoTrackSelection == null) {
            return false;
        }
        int iIndexOf = trackGroupArray.indexOf(exoTrackSelection.getTrackGroup());
        for (int i = 0; i < exoTrackSelection.length(); i++) {
            if (RendererCapabilities.getTunnelingSupport(iArr[iIndexOf][exoTrackSelection.getIndexInTrackGroup(i)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private <T extends TrackInfo<T>> Pair<ExoTrackSelection.Definition, Integer> selectTracksForType(int i, MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, TrackInfo.Factory<T> factory, Comparator<List<T>> comparator) {
        int i4;
        RandomAccess randomAccessM2168n;
        MappingTrackSelector.MappedTrackInfo mappedTrackInfo2 = mappedTrackInfo;
        ArrayList arrayList = new ArrayList();
        int rendererCount = mappedTrackInfo2.getRendererCount();
        int i8 = 0;
        while (i8 < rendererCount) {
            if (i == mappedTrackInfo2.getRendererType(i8)) {
                TrackGroupArray trackGroups = mappedTrackInfo2.getTrackGroups(i8);
                for (int i9 = 0; i9 < trackGroups.length; i9++) {
                    C0233q1 c0233q1 = trackGroups.get(i9);
                    List<T> listCreate = factory.create(i8, c0233q1, iArr[i8][i9]);
                    int i10 = c0233q1.f1319a;
                    boolean[] zArr = new boolean[i10];
                    int i11 = 0;
                    while (i11 < i10) {
                        T t8 = listCreate.get(i11);
                        int selectionEligibility = t8.getSelectionEligibility();
                        if (zArr[i11] || selectionEligibility == 0) {
                            i4 = rendererCount;
                        } else {
                            if (selectionEligibility == 1) {
                                randomAccessM2168n = AbstractC0983m0.m2168n(t8);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(t8);
                                int i12 = i11 + 1;
                                while (i12 < i10) {
                                    T t9 = listCreate.get(i12);
                                    int i13 = rendererCount;
                                    if (t9.getSelectionEligibility() == 2 && t8.isCompatibleForAdaptationWith(t9)) {
                                        arrayList2.add(t9);
                                        zArr[i12] = true;
                                    }
                                    i12++;
                                    rendererCount = i13;
                                }
                                randomAccessM2168n = arrayList2;
                            }
                            i4 = rendererCount;
                            arrayList.add(randomAccessM2168n);
                        }
                        i11++;
                        rendererCount = i4;
                    }
                }
            }
            i8++;
            mappedTrackInfo2 = mappedTrackInfo;
            rendererCount = rendererCount;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i14 = 0; i14 < list.size(); i14++) {
            iArr2[i14] = ((TrackInfo) list.get(i14)).trackIndex;
        }
        TrackInfo trackInfo = (TrackInfo) list.get(0);
        return Pair.create(new ExoTrackSelection.Definition(trackInfo.trackGroup, iArr2), Integer.valueOf(trackInfo.rendererIndex));
    }

    private void setParametersInternal(Parameters parameters) {
        boolean zEquals;
        parameters.getClass();
        synchronized (this.lock) {
            zEquals = this.parameters.equals(parameters);
            this.parameters = parameters;
        }
        if (zEquals) {
            return;
        }
        if (parameters.constrainAudioChannelCountToDeviceCapabilities && this.context == null) {
            AbstractC1101a.m2348F(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
        invalidate();
    }

    public Parameters.Builder buildUponParameters() {
        return getParameters().buildUpon();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public RendererCapabilities.Listener getRendererCapabilitiesListener() {
        return this;
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public boolean isSetParametersSupported() {
        return true;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilities.Listener
    public void onRendererCapabilitiesChanged(Renderer renderer) {
        maybeInvalidateForRendererCapabilitiesChange(renderer);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void release() {
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            try {
                if (AbstractC1118i0.f4750a >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                    spatializerWrapperV32.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        super.release();
    }

    public ExoTrackSelection.Definition[] selectAllTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) {
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArr = new ExoTrackSelection.Definition[rendererCount];
        Pair<ExoTrackSelection.Definition, Integer> pairSelectVideoTrack = selectVideoTrack(mappedTrackInfo, iArr, iArr2, parameters);
        String str = null;
        Pair<ExoTrackSelection.Definition, Integer> pairSelectImageTrack = (parameters.isPrioritizeImageOverVideoEnabled || pairSelectVideoTrack == null) ? selectImageTrack(mappedTrackInfo, iArr, parameters) : null;
        if (pairSelectImageTrack != null) {
            definitionArr[((Integer) pairSelectImageTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectImageTrack.first;
        } else if (pairSelectVideoTrack != null) {
            definitionArr[((Integer) pairSelectVideoTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectVideoTrack.first;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectAudioTrack = selectAudioTrack(mappedTrackInfo, iArr, iArr2, parameters);
        if (pairSelectAudioTrack != null) {
            definitionArr[((Integer) pairSelectAudioTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectAudioTrack.first;
        }
        if (pairSelectAudioTrack != null) {
            Object obj = pairSelectAudioTrack.first;
            str = ((ExoTrackSelection.Definition) obj).group.f1322d[((ExoTrackSelection.Definition) obj).tracks[0]].f1512d;
        }
        Pair<ExoTrackSelection.Definition, Integer> pairSelectTextTrack = selectTextTrack(mappedTrackInfo, iArr, parameters, str);
        if (pairSelectTextTrack != null) {
            definitionArr[((Integer) pairSelectTextTrack.second).intValue()] = (ExoTrackSelection.Definition) pairSelectTextTrack.first;
        }
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (rendererType != 2 && rendererType != 1 && rendererType != 3 && rendererType != 4) {
                definitionArr[i] = selectOtherTrack(rendererType, mappedTrackInfo.getTrackGroups(i), iArr[i], parameters);
            }
        }
        return definitionArr;
    }

    public Pair<ExoTrackSelection.Definition, Integer> selectAudioTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, final int[] iArr2, final Parameters parameters) {
        final boolean z7 = false;
        int i = 0;
        while (true) {
            if (i < mappedTrackInfo.getRendererCount()) {
                if (2 == mappedTrackInfo.getRendererType(i) && mappedTrackInfo.getTrackGroups(i).length > 0) {
                    z7 = true;
                    break;
                }
                i++;
            } else {
                break;
            }
        }
        return selectTracksForType(1, mappedTrackInfo, iArr, new TrackInfo.Factory() { // from class: androidx.media3.exoplayer.trackselection.c
            @Override // androidx.media3.exoplayer.trackselection.DefaultTrackSelector.TrackInfo.Factory
            public final List create(int i4, C0233q1 c0233q1, int[] iArr3) {
                return this.f1871j.lambda$selectAudioTrack$2(parameters, z7, iArr2, i4, c0233q1, iArr3);
            }
        }, new C0471b(1));
    }

    public Pair<ExoTrackSelection.Definition, Integer> selectImageTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, Parameters parameters) {
        if (parameters.audioOffloadPreferences.f1418a == 2) {
            return null;
        }
        return selectTracksForType(4, mappedTrackInfo, iArr, new C0456a(2, parameters), new C0471b(0));
    }

    public ExoTrackSelection.Definition selectOtherTrack(int i, TrackGroupArray trackGroupArray, int[][] iArr, Parameters parameters) {
        if (parameters.audioOffloadPreferences.f1418a == 2) {
            return null;
        }
        int i4 = 0;
        C0233q1 c0233q1 = null;
        OtherTrackScore otherTrackScore = null;
        for (int i8 = 0; i8 < trackGroupArray.length; i8++) {
            C0233q1 c0233q12 = trackGroupArray.get(i8);
            int[] iArr2 = iArr[i8];
            for (int i9 = 0; i9 < c0233q12.f1319a; i9++) {
                if (RendererCapabilities.isFormatSupported(iArr2[i9], parameters.exceedRendererCapabilitiesIfNecessary)) {
                    OtherTrackScore otherTrackScore2 = new OtherTrackScore(c0233q12.f1322d[i9], iArr2[i9]);
                    if (otherTrackScore == null || otherTrackScore2.compareTo(otherTrackScore) > 0) {
                        c0233q1 = c0233q12;
                        i4 = i9;
                        otherTrackScore = otherTrackScore2;
                    }
                }
            }
        }
        if (c0233q1 == null) {
            return null;
        }
        return new ExoTrackSelection.Definition(c0233q1, i4);
    }

    public Pair<ExoTrackSelection.Definition, Integer> selectTextTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, Parameters parameters, String str) {
        if (parameters.audioOffloadPreferences.f1418a == 2) {
            return null;
        }
        return selectTracksForType(3, mappedTrackInfo, iArr, new C0279a(parameters, 12, str), new C0471b(3));
    }

    @Override // androidx.media3.exoplayer.trackselection.MappingTrackSelector
    public final Pair<RendererConfiguration[], ExoTrackSelection[]> selectTracks(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, MediaSource.MediaPeriodId mediaPeriodId, AbstractC0230p1 abstractC0230p1) {
        Parameters parameters;
        SpatializerWrapperV32 spatializerWrapperV32;
        synchronized (this.lock) {
            try {
                parameters = this.parameters;
                if (parameters.constrainAudioChannelCountToDeviceCapabilities && AbstractC1118i0.f4750a >= 32 && (spatializerWrapperV32 = this.spatializer) != null) {
                    Looper looperMyLooper = Looper.myLooper();
                    AbstractC1101a.m2360k(looperMyLooper);
                    spatializerWrapperV32.ensureInitialized(this, looperMyLooper);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        int rendererCount = mappedTrackInfo.getRendererCount();
        ExoTrackSelection.Definition[] definitionArrSelectAllTracks = selectAllTracks(mappedTrackInfo, iArr, iArr2, parameters);
        applyTrackSelectionOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        applyLegacyRendererOverrides(mappedTrackInfo, parameters, definitionArrSelectAllTracks);
        for (int i = 0; i < rendererCount; i++) {
            int rendererType = mappedTrackInfo.getRendererType(i);
            if (parameters.getRendererDisabled(i) || parameters.disabledTrackTypes.contains(Integer.valueOf(rendererType))) {
                definitionArrSelectAllTracks[i] = null;
            }
        }
        ExoTrackSelection[] exoTrackSelectionArrCreateTrackSelections = this.trackSelectionFactory.createTrackSelections(definitionArrSelectAllTracks, getBandwidthMeter(), mediaPeriodId, abstractC0230p1);
        RendererConfiguration[] rendererConfigurationArr = new RendererConfiguration[rendererCount];
        for (int i4 = 0; i4 < rendererCount; i4++) {
            rendererConfigurationArr[i4] = (parameters.getRendererDisabled(i4) || parameters.disabledTrackTypes.contains(Integer.valueOf(mappedTrackInfo.getRendererType(i4))) || (mappedTrackInfo.getRendererType(i4) != -2 && exoTrackSelectionArrCreateTrackSelections[i4] == null)) ? null : RendererConfiguration.DEFAULT;
        }
        if (parameters.tunnelingEnabled) {
            maybeConfigureRenderersForTunneling(mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        if (parameters.audioOffloadPreferences.f1418a != 0) {
            maybeConfigureRendererForOffload(parameters, mappedTrackInfo, iArr, rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
        }
        return Pair.create(rendererConfigurationArr, exoTrackSelectionArrCreateTrackSelections);
    }

    public Pair<ExoTrackSelection.Definition, Integer> selectVideoTrack(MappingTrackSelector.MappedTrackInfo mappedTrackInfo, int[][][] iArr, int[] iArr2, Parameters parameters) {
        if (parameters.audioOffloadPreferences.f1418a == 2) {
            return null;
        }
        return selectTracksForType(2, mappedTrackInfo, iArr, new C0279a(parameters, 11, iArr2), new C0471b(2));
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setAudioAttributes(C0201g c0201g) {
        boolean zEquals;
        synchronized (this.lock) {
            zEquals = this.audioAttributes.equals(c0201g);
            this.audioAttributes = c0201g;
        }
        if (zEquals) {
            return;
        }
        maybeInvalidateForAudioChannelCountConstraints();
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public void setParameters(C0248v1 c0248v1) {
        if (c0248v1 instanceof Parameters) {
            setParametersInternal((Parameters) c0248v1);
        }
        setParametersInternal(new Parameters.Builder().set(c0248v1).build());
    }

    public DefaultTrackSelector(Context context, ExoTrackSelection.Factory factory) {
        this(context, Parameters.getDefaults(context), factory);
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector
    public Parameters getParameters() {
        Parameters parameters;
        synchronized (this.lock) {
            parameters = this.parameters;
        }
        return parameters;
    }

    public DefaultTrackSelector(Context context, C0248v1 c0248v1) {
        this(context, c0248v1, new AdaptiveTrackSelection.Factory());
    }

    @Deprecated
    public DefaultTrackSelector(C0248v1 c0248v1, ExoTrackSelection.Factory factory) {
        this(c0248v1, factory, (Context) null);
    }

    public DefaultTrackSelector(Context context, C0248v1 c0248v1, ExoTrackSelection.Factory factory) {
        this(c0248v1, factory, context);
    }

    @Deprecated
    public void setParameters(ParametersBuilder parametersBuilder) {
        setParametersInternal(parametersBuilder.build());
    }

    private DefaultTrackSelector(C0248v1 c0248v1, ExoTrackSelection.Factory factory, Context context) {
        this.lock = new Object();
        this.context = context != null ? context.getApplicationContext() : null;
        this.trackSelectionFactory = factory;
        if (c0248v1 instanceof Parameters) {
            this.parameters = (Parameters) c0248v1;
        } else {
            this.parameters = (context == null ? Parameters.DEFAULT_WITHOUT_CONTEXT : Parameters.getDefaults(context)).buildUpon().set(c0248v1).build();
        }
        this.audioAttributes = C0201g.f1098b;
        boolean z7 = context != null && AbstractC1118i0.m2426Q(context);
        this.deviceIsTV = z7;
        if (!z7 && context != null && AbstractC1118i0.f4750a >= 32) {
            this.spatializer = SpatializerWrapperV32.tryCreateInstance(context);
        }
        if (this.parameters.constrainAudioChannelCountToDeviceCapabilities && context == null) {
            AbstractC1101a.m2348F(TAG, AUDIO_CHANNEL_COUNT_CONSTRAINTS_WARN_MESSAGE);
        }
    }

    public void setParameters(Parameters.Builder builder) {
        setParametersInternal(builder.build());
    }
}
