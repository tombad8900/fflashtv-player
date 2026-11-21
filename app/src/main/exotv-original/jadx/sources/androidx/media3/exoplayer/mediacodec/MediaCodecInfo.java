package androidx.media3.exoplayer.mediacodec;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.util.Objects;
import p002a1.AbstractC0008a1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class MediaCodecInfo {
    public static final int MAX_SUPPORTED_INSTANCES_UNKNOWN = -1;
    public static final String TAG = "MediaCodecInfo";
    public final boolean adaptive;
    public final MediaCodecInfo.CodecCapabilities capabilities;
    public final String codecMimeType;
    public final boolean detachedSurfaceSupported;
    public final boolean hardwareAccelerated;
    private final boolean isVideo;
    public final String mimeType;
    public final String name;
    public final boolean secure;
    public final boolean softwareOnly;
    public final boolean tunneling;
    public final boolean vendor;

    public MediaCodecInfo(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13) {
        str.getClass();
        this.name = str;
        this.mimeType = str2;
        this.codecMimeType = str3;
        this.capabilities = codecCapabilities;
        this.hardwareAccelerated = z7;
        this.softwareOnly = z8;
        this.vendor = z9;
        this.adaptive = z10;
        this.tunneling = z11;
        this.secure = z12;
        this.detachedSurfaceSupported = z13;
        this.isVideo = AbstractC0244u0.m686o(str2);
    }

    private static int adjustMaxInputChannelCount(String str, String str2, int i) {
        if (i > 1 || ((AbstractC1118i0.f4750a >= 26 && i > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i;
        }
        int i4 = "audio/ac3".equals(str2) ? 6 : "audio/eac3".equals(str2) ? 16 : 30;
        AbstractC1101a.m2348F(TAG, "AssumedMaxChannelAdjustment: " + str + ", [" + i + " to " + i4 + "]");
        return i4;
    }

    private static Point alignVideoSize(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(AbstractC1118i0.m2446f(i, widthAlignment) * widthAlignment, AbstractC1118i0.m2446f(i4, heightAlignment) * heightAlignment);
    }

    private static boolean areSizeAndRateSupported(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i4, double d8) {
        Point pointAlignVideoSize = alignVideoSize(videoCapabilities, i, i4);
        int i8 = pointAlignVideoSize.x;
        int i9 = pointAlignVideoSize.y;
        return (d8 == -1.0d || d8 < 1.0d) ? videoCapabilities.isSizeSupported(i8, i9) : videoCapabilities.areSizeAndRateSupported(i8, i9, Math.floor(d8));
    }

    private static MediaCodecInfo.CodecProfileLevel[] estimateLegacyVp9ProfileLevels(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int iIntValue = (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) ? 0 : ((Integer) videoCapabilities.getBitrateRange().getUpper()).intValue();
        int i = iIntValue >= 180000000 ? 1024 : iIntValue >= 120000000 ? 512 : iIntValue >= 60000000 ? 256 : iIntValue >= 30000000 ? 128 : iIntValue >= 18000000 ? 64 : iIntValue >= 12000000 ? 32 : iIntValue >= 7200000 ? 16 : iIntValue >= 3600000 ? 8 : iIntValue >= 1800000 ? 4 : iIntValue >= 800000 ? 2 : 1;
        MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
        codecProfileLevel.profile = 1;
        codecProfileLevel.level = i;
        return new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
    }

    private static int getMaxSupportedInstancesV23(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.getMaxSupportedInstances();
    }

    private static boolean isAdaptive(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean isCodecProfileAndLevelSupported(C0249w c0249w, boolean z7) {
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(c0249w);
        String str = c0249w.f1522n;
        if (str != null && str.equals("video/mv-hevc")) {
            String strM687p = AbstractC0244u0.m687p(this.codecMimeType);
            if (strM687p.equals("video/mv-hevc")) {
                return true;
            }
            if (strM687p.equals("video/hevc")) {
                codecProfileAndLevel = MediaCodecUtil.getHevcBaseLayerCodecProfileAndLevel(c0249w);
            }
        }
        if (codecProfileAndLevel == null) {
            return true;
        }
        int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
        int iIntValue2 = ((Integer) codecProfileAndLevel.second).intValue();
        if ("video/dolby-vision".equals(c0249w.f1522n)) {
            if (!"video/avc".equals(this.mimeType)) {
                iIntValue = "video/hevc".equals(this.mimeType) ? 2 : 8;
            }
            iIntValue2 = 0;
        }
        if (!this.isVideo && iIntValue != 42) {
            return true;
        }
        MediaCodecInfo.CodecProfileLevel[] profileLevels = getProfileLevels();
        if (AbstractC1118i0.f4750a <= 23 && "video/x-vnd.on2.vp9".equals(this.mimeType) && profileLevels.length == 0) {
            profileLevels = estimateLegacyVp9ProfileLevels(this.capabilities);
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : profileLevels) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z7) && !needsProfileExcludedWorkaround(this.mimeType, iIntValue))) {
                return true;
            }
        }
        logNoSupport("codec.profileLevel, " + c0249w.f1519k + ", " + this.codecMimeType);
        return false;
    }

    private static boolean isDetachedSurfaceSupported(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return AbstractC1118i0.f4750a >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface");
    }

    private boolean isSampleMimeTypeSupported(C0249w c0249w) {
        return this.mimeType.equals(c0249w.f1522n) || this.mimeType.equals(MediaCodecUtil.getAlternativeCodecMimeType(c0249w));
    }

    private static boolean isSecure(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean isTunneling(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void logAssumedSupport(String str) {
        AbstractC1101a.m2363n(TAG, "AssumedSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + AbstractC1118i0.f4754e + "]");
    }

    private void logNoSupport(String str) {
        AbstractC1101a.m2363n(TAG, "NoSupport [" + str + "] [" + this.name + ", " + this.mimeType + "] [" + AbstractC1118i0.f4754e + "]");
    }

    private static boolean needsAdaptationFlushWorkaround(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean needsAdaptationReconfigureWorkaround(String str) {
        return AbstractC1118i0.f4753d.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    private static boolean needsDisableAdaptationWorkaround(String str) {
        if (AbstractC1118i0.f4750a > 22) {
            return false;
        }
        String str2 = AbstractC1118i0.f4753d;
        if ("ODROID-XU3".equals(str2) || "Nexus 10".equals(str2)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static boolean needsProfileExcludedWorkaround(String str, int i) {
        if (!"video/hevc".equals(str) || 2 != i) {
            return false;
        }
        String str2 = AbstractC1118i0.f4751b;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean needsRotatedVerticalResolutionWorkaround(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(AbstractC1118i0.f4751b)) ? false : true;
    }

    public static MediaCodecInfo newInstance(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11) {
        return new MediaCodecInfo(str, str2, str3, codecCapabilities, z7, z8, z9, (z10 || codecCapabilities == null || !isAdaptive(codecCapabilities) || needsDisableAdaptationWorkaround(str)) ? false : true, codecCapabilities != null && isTunneling(codecCapabilities), z11 || (codecCapabilities != null && isSecure(codecCapabilities)), isDetachedSurfaceSupported(codecCapabilities));
    }

    public Point alignVideoSizeV21(int i, int i4) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return alignVideoSize(videoCapabilities, i, i4);
    }

    public DecoderReuseEvaluation canReuseCodec(C0249w c0249w, C0249w c0249w2) {
        C0249w c0249w3;
        C0249w c0249w4;
        String str = c0249w.f1522n;
        C0216l c0216l = c0249w.f1497B;
        String str2 = c0249w2.f1522n;
        C0216l c0216l2 = c0249w2.f1497B;
        int i = AbstractC1118i0.f4750a;
        int i4 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.isVideo) {
            if (c0249w.f1532x != c0249w2.f1532x) {
                i4 |= 1024;
            }
            if (!this.adaptive && (c0249w.f1529u != c0249w2.f1529u || c0249w.f1530v != c0249w2.f1530v)) {
                i4 |= 512;
            }
            if ((!C0216l.m631e(c0216l) || !C0216l.m631e(c0216l2)) && !Objects.equals(c0216l, c0216l2)) {
                i4 |= 2048;
            }
            if (needsAdaptationReconfigureWorkaround(this.name) && !c0249w.m693c(c0249w2)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new DecoderReuseEvaluation(this.name, c0249w, c0249w2, c0249w.m693c(c0249w2) ? 3 : 2, 0);
            }
            c0249w3 = c0249w;
            c0249w4 = c0249w2;
        } else {
            c0249w3 = c0249w;
            c0249w4 = c0249w2;
            if (c0249w3.f1498C != c0249w4.f1498C) {
                i4 |= DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
            }
            if (c0249w3.f1499D != c0249w4.f1499D) {
                i4 |= DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED;
            }
            if (c0249w3.f1500E != c0249w4.f1500E) {
                i4 |= 16384;
            }
            if (i4 == 0 && "audio/mp4a-latm".equals(this.mimeType)) {
                Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(c0249w3);
                Pair<Integer, Integer> codecProfileAndLevel2 = MediaCodecUtil.getCodecProfileAndLevel(c0249w4);
                if (codecProfileAndLevel != null && codecProfileAndLevel2 != null) {
                    int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
                    int iIntValue2 = ((Integer) codecProfileAndLevel2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new DecoderReuseEvaluation(this.name, c0249w3, c0249w4, 3, 0);
                    }
                }
            }
            if (!c0249w3.m693c(c0249w4)) {
                i4 |= 32;
            }
            if (needsAdaptationFlushWorkaround(this.mimeType)) {
                i4 |= 2;
            }
            if (i4 == 0) {
                return new DecoderReuseEvaluation(this.name, c0249w3, c0249w4, 1, 0);
            }
        }
        return new DecoderReuseEvaluation(this.name, c0249w3, c0249w4, 0, i4);
    }

    public int getMaxSupportedInstances() {
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        if (AbstractC1118i0.f4750a < 23 || (codecCapabilities = this.capabilities) == null) {
            return -1;
        }
        return getMaxSupportedInstancesV23(codecCapabilities);
    }

    public MediaCodecInfo.CodecProfileLevel[] getProfileLevels() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean isAudioChannelCountSupportedV21(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("channelCount.aCaps");
            return false;
        }
        if (adjustMaxInputChannelCount(this.name, this.mimeType, audioCapabilities.getMaxInputChannelCount()) >= i) {
            return true;
        }
        logNoSupport(AbstractC0008a1.m12h(i, "channelCount.support, "));
        return false;
    }

    public boolean isAudioSampleRateSupportedV21(int i) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            logNoSupport("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i)) {
            return true;
        }
        logNoSupport(AbstractC0008a1.m12h(i, "sampleRate.support, "));
        return false;
    }

    public boolean isFormatFunctionallySupported(C0249w c0249w) {
        return isSampleMimeTypeSupported(c0249w) && isCodecProfileAndLevelSupported(c0249w, false);
    }

    public boolean isFormatSupported(C0249w c0249w) {
        int i;
        int i4;
        if (!isSampleMimeTypeSupported(c0249w) || !isCodecProfileAndLevelSupported(c0249w, true)) {
            return false;
        }
        if (!this.isVideo) {
            int i8 = c0249w.f1499D;
            return (i8 == -1 || isAudioSampleRateSupportedV21(i8)) && ((i = c0249w.f1498C) == -1 || isAudioChannelCountSupportedV21(i));
        }
        int i9 = c0249w.f1529u;
        if (i9 <= 0 || (i4 = c0249w.f1530v) <= 0) {
            return true;
        }
        return isVideoSizeAndRateSupportedV21(i9, i4, c0249w.f1531w);
    }

    public boolean isHdr10PlusOutOfBandMetadataSupported() {
        if (AbstractC1118i0.f4750a >= 29 && "video/x-vnd.on2.vp9".equals(this.mimeType)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : getProfileLevels()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isSeamlessAdaptationSupported(C0249w c0249w) {
        if (this.isVideo) {
            return this.adaptive;
        }
        Pair<Integer, Integer> codecProfileAndLevel = MediaCodecUtil.getCodecProfileAndLevel(c0249w);
        return codecProfileAndLevel != null && ((Integer) codecProfileAndLevel.first).intValue() == 42;
    }

    public boolean isVideoSizeAndRateSupportedV21(int i, int i4, double d8) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.capabilities;
        if (codecCapabilities == null) {
            logNoSupport("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            logNoSupport("sizeAndRate.vCaps");
            return false;
        }
        if (AbstractC1118i0.f4750a >= 29) {
            int iAreResolutionAndFrameRateCovered = MediaCodecPerformancePointCoverageProvider.areResolutionAndFrameRateCovered(videoCapabilities, i, i4, d8);
            if (iAreResolutionAndFrameRateCovered == 2) {
                return true;
            }
            if (iAreResolutionAndFrameRateCovered == 1) {
                StringBuilder sbM19o = AbstractC0008a1.m19o(i, i4, "sizeAndRate.cover, ", "x", "@");
                sbM19o.append(d8);
                logNoSupport(sbM19o.toString());
                return false;
            }
        }
        if (!areSizeAndRateSupported(videoCapabilities, i, i4, d8)) {
            if (i >= i4 || !needsRotatedVerticalResolutionWorkaround(this.name) || !areSizeAndRateSupported(videoCapabilities, i4, i, d8)) {
                StringBuilder sbM19o2 = AbstractC0008a1.m19o(i, i4, "sizeAndRate.support, ", "x", "@");
                sbM19o2.append(d8);
                logNoSupport(sbM19o2.toString());
                return false;
            }
            StringBuilder sbM19o3 = AbstractC0008a1.m19o(i, i4, "sizeAndRate.rotated, ", "x", "@");
            sbM19o3.append(d8);
            logAssumedSupport(sbM19o3.toString());
        }
        return true;
    }

    public String toString() {
        return this.name;
    }
}
