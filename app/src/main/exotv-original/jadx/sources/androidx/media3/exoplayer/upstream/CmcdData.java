package androidx.media3.exoplayer.upstream;

import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0233q1;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import p043e6.C0917e;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC0986n0;
import p052f6.AbstractC1023z1;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p052f6.C0992p0;
import p052f6.C0996q1;
import p052f6.C0997r;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p089k1.C1567k;
import p089k1.C1568l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class CmcdData {
    private static final C0917e COMMA_JOINER = new C0917e(",");
    private final CmcdObject cmcdObject;
    private final CmcdRequest cmcdRequest;
    private final CmcdSession cmcdSession;
    private final CmcdStatus cmcdStatus;
    private final int dataTransmissionMode;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class CmcdObject {
        public final int bitrateKbps;
        public final AbstractC0983m0 customDataList;
        public final long objectDurationMs;
        public final String objectType;
        public final int topBitrateKbps;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        public static final class Builder {
            private AbstractC0983m0 customDataList;
            private String objectType;
            private int bitrateKbps = -2147483647;
            private int topBitrateKbps = -2147483647;
            private long objectDurationMs = -9223372036854775807L;

            public Builder() {
                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                this.customDataList = C0981l1.f4211n;
            }

            public CmcdObject build() {
                return new CmcdObject(this);
            }

            public Builder setBitrateKbps(int i) {
                AbstractC1101a.m2353d(i >= 0 || i == -2147483647);
                this.bitrateKbps = i;
                return this;
            }

            public Builder setCustomDataList(List<String> list) {
                this.customDataList = AbstractC0983m0.m2165j(list);
                return this;
            }

            public Builder setObjectDurationMs(long j) {
                AbstractC1101a.m2353d(j >= 0 || j == -9223372036854775807L);
                this.objectDurationMs = j;
                return this;
            }

            public Builder setObjectType(String str) {
                this.objectType = str;
                return this;
            }

            public Builder setTopBitrateKbps(int i) {
                AbstractC1101a.m2353d(i >= 0 || i == -2147483647);
                this.topBitrateKbps = i;
                return this;
            }
        }

        public void populateCmcdDataMap(C0997r c0997r) {
            ArrayList arrayList = new ArrayList();
            if (this.bitrateKbps != -2147483647) {
                arrayList.add("br=" + this.bitrateKbps);
            }
            if (this.topBitrateKbps != -2147483647) {
                arrayList.add("tb=" + this.topBitrateKbps);
            }
            if (this.objectDurationMs != -9223372036854775807L) {
                arrayList.add("d=" + this.objectDurationMs);
            }
            if (!TextUtils.isEmpty(this.objectType)) {
                arrayList.add("ot=" + this.objectType);
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            c0997r.m2181d(arrayList, CmcdConfiguration.KEY_CMCD_OBJECT);
        }

        private CmcdObject(Builder builder) {
            this.bitrateKbps = builder.bitrateKbps;
            this.topBitrateKbps = builder.topBitrateKbps;
            this.objectDurationMs = builder.objectDurationMs;
            this.objectType = builder.objectType;
            this.customDataList = builder.customDataList;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class CmcdRequest {
        public final long bufferLengthMs;
        public final AbstractC0983m0 customDataList;
        public final long deadlineMs;
        public final long measuredThroughputInKbps;
        public final String nextObjectRequest;
        public final String nextRangeRequest;
        public final boolean startup;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        public static final class Builder {
            private AbstractC0983m0 customDataList;
            private String nextObjectRequest;
            private String nextRangeRequest;
            private boolean startup;
            private long bufferLengthMs = -9223372036854775807L;
            private long measuredThroughputInKbps = -2147483647L;
            private long deadlineMs = -9223372036854775807L;

            public Builder() {
                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                this.customDataList = C0981l1.f4211n;
            }

            public CmcdRequest build() {
                return new CmcdRequest(this);
            }

            public Builder setBufferLengthMs(long j) {
                AbstractC1101a.m2353d(j >= 0 || j == -9223372036854775807L);
                this.bufferLengthMs = ((j + 50) / 100) * 100;
                return this;
            }

            public Builder setCustomDataList(List<String> list) {
                this.customDataList = AbstractC0983m0.m2165j(list);
                return this;
            }

            public Builder setDeadlineMs(long j) {
                AbstractC1101a.m2353d(j >= 0 || j == -9223372036854775807L);
                this.deadlineMs = ((j + 50) / 100) * 100;
                return this;
            }

            public Builder setMeasuredThroughputInKbps(long j) {
                AbstractC1101a.m2353d(j >= 0 || j == -2147483647L);
                this.measuredThroughputInKbps = ((j + 50) / 100) * 100;
                return this;
            }

            public Builder setNextObjectRequest(String str) {
                this.nextObjectRequest = str == null ? null : Uri.encode(str);
                return this;
            }

            public Builder setNextRangeRequest(String str) {
                this.nextRangeRequest = str;
                return this;
            }

            public Builder setStartup(boolean z7) {
                this.startup = z7;
                return this;
            }
        }

        public void populateCmcdDataMap(C0997r c0997r) {
            ArrayList arrayList = new ArrayList();
            if (this.bufferLengthMs != -9223372036854775807L) {
                arrayList.add("bl=" + this.bufferLengthMs);
            }
            if (this.measuredThroughputInKbps != -2147483647L) {
                arrayList.add("mtp=" + this.measuredThroughputInKbps);
            }
            if (this.deadlineMs != -9223372036854775807L) {
                arrayList.add("dl=" + this.deadlineMs);
            }
            if (this.startup) {
                arrayList.add(CmcdConfiguration.KEY_STARTUP);
            }
            if (!TextUtils.isEmpty(this.nextObjectRequest)) {
                String str = this.nextObjectRequest;
                int i = AbstractC1118i0.f4750a;
                Locale locale = Locale.US;
                arrayList.add("nor=\"" + str + "\"");
            }
            if (!TextUtils.isEmpty(this.nextRangeRequest)) {
                String str2 = this.nextRangeRequest;
                int i4 = AbstractC1118i0.f4750a;
                Locale locale2 = Locale.US;
                arrayList.add("nrr=\"" + str2 + "\"");
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            c0997r.m2181d(arrayList, CmcdConfiguration.KEY_CMCD_REQUEST);
        }

        private CmcdRequest(Builder builder) {
            this.bufferLengthMs = builder.bufferLengthMs;
            this.measuredThroughputInKbps = builder.measuredThroughputInKbps;
            this.deadlineMs = builder.deadlineMs;
            this.startup = builder.startup;
            this.nextObjectRequest = builder.nextObjectRequest;
            this.nextRangeRequest = builder.nextRangeRequest;
            this.customDataList = builder.customDataList;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class CmcdSession {
        public static final int VERSION = 1;
        public final String contentId;
        public final AbstractC0983m0 customDataList;
        public final float playbackRate;
        public final String sessionId;
        public final String streamType;
        public final String streamingFormat;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        public static final class Builder {
            private String contentId;
            private AbstractC0983m0 customDataList;
            private float playbackRate;
            private String sessionId;
            private String streamType;
            private String streamingFormat;

            public Builder() {
                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                this.customDataList = C0981l1.f4211n;
            }

            public CmcdSession build() {
                return new CmcdSession(this);
            }

            public Builder setContentId(String str) {
                AbstractC1101a.m2353d(str == null || str.length() <= 64);
                this.contentId = str;
                return this;
            }

            public Builder setCustomDataList(List<String> list) {
                this.customDataList = AbstractC0983m0.m2165j(list);
                return this;
            }

            public Builder setPlaybackRate(float f8) {
                AbstractC1101a.m2353d(f8 > 0.0f || f8 == -3.4028235E38f);
                this.playbackRate = f8;
                return this;
            }

            public Builder setSessionId(String str) {
                AbstractC1101a.m2353d(str == null || str.length() <= 64);
                this.sessionId = str;
                return this;
            }

            public Builder setStreamType(String str) {
                this.streamType = str;
                return this;
            }

            public Builder setStreamingFormat(String str) {
                this.streamingFormat = str;
                return this;
            }
        }

        public void populateCmcdDataMap(C0997r c0997r) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.contentId)) {
                String str = this.contentId;
                int i = AbstractC1118i0.f4750a;
                Locale locale = Locale.US;
                arrayList.add("cid=\"" + str + "\"");
            }
            if (!TextUtils.isEmpty(this.sessionId)) {
                String str2 = this.sessionId;
                int i4 = AbstractC1118i0.f4750a;
                Locale locale2 = Locale.US;
                arrayList.add("sid=\"" + str2 + "\"");
            }
            if (!TextUtils.isEmpty(this.streamingFormat)) {
                arrayList.add("sf=" + this.streamingFormat);
            }
            if (!TextUtils.isEmpty(this.streamType)) {
                arrayList.add("st=" + this.streamType);
            }
            float f8 = this.playbackRate;
            if (f8 != -3.4028235E38f && f8 != 1.0f) {
                Object[] objArr = {CmcdConfiguration.KEY_PLAYBACK_RATE, Float.valueOf(f8)};
                int i8 = AbstractC1118i0.f4750a;
                arrayList.add(String.format(Locale.US, "%s=%.2f", objArr));
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            c0997r.m2181d(arrayList, CmcdConfiguration.KEY_CMCD_SESSION);
        }

        private CmcdSession(Builder builder) {
            this.contentId = builder.contentId;
            this.sessionId = builder.sessionId;
            this.streamingFormat = builder.streamingFormat;
            this.streamType = builder.streamType;
            this.playbackRate = builder.playbackRate;
            this.customDataList = builder.customDataList;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class CmcdStatus {
        public final boolean bufferStarvation;
        public final AbstractC0983m0 customDataList;
        public final int maximumRequestedThroughputKbps;

        /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
        public static final class Builder {
            private boolean bufferStarvation;
            private AbstractC0983m0 customDataList;
            private int maximumRequestedThroughputKbps = -2147483647;

            public Builder() {
                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                this.customDataList = C0981l1.f4211n;
            }

            public CmcdStatus build() {
                return new CmcdStatus(this);
            }

            public Builder setBufferStarvation(boolean z7) {
                this.bufferStarvation = z7;
                return this;
            }

            public Builder setCustomDataList(List<String> list) {
                this.customDataList = AbstractC0983m0.m2165j(list);
                return this;
            }

            public Builder setMaximumRequestedThroughputKbps(int i) {
                AbstractC1101a.m2353d(i >= 0 || i == -2147483647);
                if (i != -2147483647) {
                    i = ((i + 50) / 100) * 100;
                }
                this.maximumRequestedThroughputKbps = i;
                return this;
            }
        }

        public void populateCmcdDataMap(C0997r c0997r) {
            ArrayList arrayList = new ArrayList();
            if (this.maximumRequestedThroughputKbps != -2147483647) {
                arrayList.add("rtp=" + this.maximumRequestedThroughputKbps);
            }
            if (this.bufferStarvation) {
                arrayList.add(CmcdConfiguration.KEY_BUFFER_STARVATION);
            }
            arrayList.addAll(this.customDataList);
            if (arrayList.isEmpty()) {
                return;
            }
            c0997r.m2181d(arrayList, CmcdConfiguration.KEY_CMCD_STATUS);
        }

        private CmcdStatus(Builder builder) {
            this.maximumRequestedThroughputKbps = builder.maximumRequestedThroughputKbps;
            this.bufferStarvation = builder.bufferStarvation;
            this.customDataList = builder.customDataList;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class Factory {
        private static final Pattern CUSTOM_KEY_NAME_PATTERN = Pattern.compile(".*-.*");
        public static final String OBJECT_TYPE_AUDIO_ONLY = "a";
        public static final String OBJECT_TYPE_INIT_SEGMENT = "i";
        public static final String OBJECT_TYPE_MUXED_AUDIO_AND_VIDEO = "av";
        public static final String OBJECT_TYPE_VIDEO_ONLY = "v";
        public static final String STREAMING_FORMAT_DASH = "d";
        public static final String STREAMING_FORMAT_HLS = "h";
        public static final String STREAMING_FORMAT_SS = "s";
        public static final String STREAM_TYPE_LIVE = "l";
        public static final String STREAM_TYPE_VOD = "v";
        private final long bufferedDurationUs;
        private long chunkDurationUs;
        private final CmcdConfiguration cmcdConfiguration;
        private final boolean didRebuffer;
        private final boolean isBufferEmpty;
        private final boolean isLive;
        private String nextObjectRequest;
        private String nextRangeRequest;
        private String objectType;
        private final float playbackRate;
        private final String streamingFormat;
        private final ExoTrackSelection trackSelection;

        public Factory(CmcdConfiguration cmcdConfiguration, ExoTrackSelection exoTrackSelection, long j, float f8, String str, boolean z7, boolean z8, boolean z9) {
            AbstractC1101a.m2353d(j >= 0);
            AbstractC1101a.m2353d(f8 == -3.4028235E38f || f8 > 0.0f);
            this.cmcdConfiguration = cmcdConfiguration;
            this.trackSelection = exoTrackSelection;
            this.bufferedDurationUs = j;
            this.playbackRate = f8;
            this.streamingFormat = str;
            this.isLive = z7;
            this.didRebuffer = z8;
            this.isBufferEmpty = z9;
            this.chunkDurationUs = -9223372036854775807L;
        }

        private boolean getIsInitSegment() {
            String str = this.objectType;
            return str != null && str.equals(OBJECT_TYPE_INIT_SEGMENT);
        }

        public static String getObjectType(ExoTrackSelection exoTrackSelection) {
            AbstractC1101a.m2353d(exoTrackSelection != null);
            int iM680i = AbstractC0244u0.m680i(exoTrackSelection.getSelectedFormat().f1522n);
            if (iM680i == -1) {
                iM680i = AbstractC0244u0.m680i(exoTrackSelection.getSelectedFormat().f1521m);
            }
            if (iM680i == 1) {
                return OBJECT_TYPE_AUDIO_ONLY;
            }
            if (iM680i == 2) {
                return "v";
            }
            return null;
        }

        private void validateCustomDataListFormat(List<String> list) {
            for (String str : list) {
                int i = AbstractC1118i0.f4750a;
                AbstractC1101a.m2359j(CUSTOM_KEY_NAME_PATTERN.matcher(str.split("=", -1)[0]).matches());
            }
        }

        public CmcdData createCmcdData() {
            AbstractC0986n0 customData = this.cmcdConfiguration.requestConfig.getCustomData();
            customData.getClass();
            C0996q1 c0996q1 = C0996q1.f4246p;
            AbstractC1023z1 it = c0996q1.keySet().iterator();
            while (it.hasNext()) {
                validateCustomDataListFormat(customData.get((String) it.next()));
            }
            int iM2446f = AbstractC1118i0.m2446f(this.trackSelection.getSelectedFormat().f1518j, 1000);
            CmcdObject.Builder builder = new CmcdObject.Builder();
            if (!getIsInitSegment()) {
                if (this.cmcdConfiguration.isBitrateLoggingAllowed()) {
                    builder.setBitrateKbps(iM2446f);
                }
                if (this.cmcdConfiguration.isTopBitrateLoggingAllowed()) {
                    C0233q1 trackGroup = this.trackSelection.getTrackGroup();
                    int iMax = this.trackSelection.getSelectedFormat().f1518j;
                    for (int i = 0; i < trackGroup.f1319a; i++) {
                        iMax = Math.max(iMax, trackGroup.f1322d[i].f1518j);
                    }
                    builder.setTopBitrateKbps(AbstractC1118i0.m2446f(iMax, 1000));
                }
                if (this.cmcdConfiguration.isObjectDurationLoggingAllowed()) {
                    builder.setObjectDurationMs(AbstractC1118i0.m2447f0(this.chunkDurationUs));
                }
            }
            if (this.cmcdConfiguration.isObjectTypeLoggingAllowed()) {
                builder.setObjectType(this.objectType);
            }
            if (c0996q1.containsKey(CmcdConfiguration.KEY_CMCD_OBJECT)) {
                builder.setCustomDataList(customData.get(CmcdConfiguration.KEY_CMCD_OBJECT));
            }
            CmcdRequest.Builder builder2 = new CmcdRequest.Builder();
            if (!getIsInitSegment() && this.cmcdConfiguration.isBufferLengthLoggingAllowed()) {
                builder2.setBufferLengthMs(AbstractC1118i0.m2447f0(this.bufferedDurationUs));
            }
            if (this.cmcdConfiguration.isMeasuredThroughputLoggingAllowed() && this.trackSelection.getLatestBitrateEstimate() != -2147483647L) {
                builder2.setMeasuredThroughputInKbps((this.trackSelection.getLatestBitrateEstimate() + 999) / 1000);
            }
            if (this.cmcdConfiguration.isDeadlineLoggingAllowed()) {
                builder2.setDeadlineMs(AbstractC1118i0.m2447f0((long) (this.bufferedDurationUs / this.playbackRate)));
            }
            if (this.cmcdConfiguration.isStartupLoggingAllowed()) {
                builder2.setStartup(this.didRebuffer || this.isBufferEmpty);
            }
            if (this.cmcdConfiguration.isNextObjectRequestLoggingAllowed()) {
                builder2.setNextObjectRequest(this.nextObjectRequest);
            }
            if (this.cmcdConfiguration.isNextRangeRequestLoggingAllowed()) {
                builder2.setNextRangeRequest(this.nextRangeRequest);
            }
            if (c0996q1.containsKey(CmcdConfiguration.KEY_CMCD_REQUEST)) {
                builder2.setCustomDataList(customData.get(CmcdConfiguration.KEY_CMCD_REQUEST));
            }
            CmcdSession.Builder builder3 = new CmcdSession.Builder();
            if (this.cmcdConfiguration.isContentIdLoggingAllowed()) {
                builder3.setContentId(this.cmcdConfiguration.contentId);
            }
            if (this.cmcdConfiguration.isSessionIdLoggingAllowed()) {
                builder3.setSessionId(this.cmcdConfiguration.sessionId);
            }
            if (this.cmcdConfiguration.isStreamingFormatLoggingAllowed()) {
                builder3.setStreamingFormat(this.streamingFormat);
            }
            if (this.cmcdConfiguration.isStreamTypeLoggingAllowed()) {
                builder3.setStreamType(this.isLive ? STREAM_TYPE_LIVE : "v");
            }
            if (this.cmcdConfiguration.isPlaybackRateLoggingAllowed()) {
                builder3.setPlaybackRate(this.playbackRate);
            }
            if (c0996q1.containsKey(CmcdConfiguration.KEY_CMCD_SESSION)) {
                builder3.setCustomDataList(customData.get(CmcdConfiguration.KEY_CMCD_SESSION));
            }
            CmcdStatus.Builder builder4 = new CmcdStatus.Builder();
            if (this.cmcdConfiguration.isMaximumRequestThroughputLoggingAllowed()) {
                builder4.setMaximumRequestedThroughputKbps(this.cmcdConfiguration.requestConfig.getRequestedMaximumThroughputKbps(iM2446f));
            }
            if (this.cmcdConfiguration.isBufferStarvationLoggingAllowed()) {
                builder4.setBufferStarvation(this.didRebuffer);
            }
            if (c0996q1.containsKey(CmcdConfiguration.KEY_CMCD_STATUS)) {
                builder4.setCustomDataList(customData.get(CmcdConfiguration.KEY_CMCD_STATUS));
            }
            return new CmcdData(builder.build(), builder2.build(), builder3.build(), builder4.build(), this.cmcdConfiguration.dataTransmissionMode);
        }

        public Factory setChunkDurationUs(long j) {
            AbstractC1101a.m2353d(j >= 0);
            this.chunkDurationUs = j;
            return this;
        }

        public Factory setNextObjectRequest(String str) {
            this.nextObjectRequest = str;
            return this;
        }

        public Factory setNextRangeRequest(String str) {
            this.nextRangeRequest = str;
            return this;
        }

        public Factory setObjectType(String str) {
            this.objectType = str;
            return this;
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ObjectType {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamType {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface StreamingFormat {
    }

    public C1568l addToDataSpec(C1568l c1568l) {
        C0997r c0997r = new C0997r();
        this.cmcdObject.populateCmcdDataMap(c0997r);
        this.cmcdRequest.populateCmcdDataMap(c0997r);
        this.cmcdSession.populateCmcdDataMap(c0997r);
        this.cmcdStatus.populateCmcdDataMap(c0997r);
        if (this.dataTransmissionMode != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = c0997r.mo2126b().values().iterator();
            while (it.hasNext()) {
                arrayList.addAll((Collection) it.next());
            }
            Collections.sort(arrayList);
            Uri.Builder builderAppendQueryParameter = c1568l.f5996a.buildUpon().appendQueryParameter(CmcdConfiguration.CMCD_QUERY_PARAMETER_KEY, COMMA_JOINER.m2085b(arrayList));
            C1567k c1567kM3237a = c1568l.m3237a();
            c1567kM3237a.f5991e = builderAppendQueryParameter.build();
            return c1567kM3237a.m3236d();
        }
        C0992p0 c0992p0 = new C0992p0(4);
        Set<String> setMo2130h = c0997r.f4240k;
        if (setMo2130h == null) {
            setMo2130h = c0997r.mo2130h();
            c0997r.f4240k = setMo2130h;
        }
        for (String str : setMo2130h) {
            List list = c0997r.get((Object) str);
            Collections.sort(list);
            c0992p0.m2180b(str, COMMA_JOINER.m2085b(list));
        }
        C0996q1 c0996q1M2179a = c0992p0.m2179a();
        c1568l.getClass();
        HashMap map = new HashMap(c1568l.f5999d);
        map.putAll(c0996q1M2179a);
        return new C1568l(c1568l.f5996a, c1568l.f5997b, c1568l.f5998c, map, c1568l.f6000e, c1568l.f6001f, c1568l.f6002g, c1568l.f6003h);
    }

    private CmcdData(CmcdObject cmcdObject, CmcdRequest cmcdRequest, CmcdSession cmcdSession, CmcdStatus cmcdStatus, int i) {
        this.cmcdObject = cmcdObject;
        this.cmcdRequest = cmcdRequest;
        this.cmcdSession = cmcdSession;
        this.cmcdStatus = cmcdStatus;
        this.dataTransmissionMode = i;
    }
}
