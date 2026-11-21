package androidx.media3.exoplayer.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.DrmInitData;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.MediaParser$InputReader;
import android.media.MediaParser$OutputConsumer;
import android.util.Pair;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0216l;
import androidx.media3.common.C0234r;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0249w;
import androidx.media3.common.InterfaceC0219m;
import androidx.media3.exoplayer.source.C0448j;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1108d0;
import p090k2.C1584b;
import p115n1.C1966b0;
import p115n1.C1970d0;
import p115n1.C1978h0;
import p115n1.C1981j;
import p115n1.C1992s;
import p115n1.InterfaceC1968c0;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
@SuppressLint({"Override"})
/* loaded from: classes.dex */
public final class OutputConsumerAdapterV30 implements MediaParser$OutputConsumer {
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS = "chunk-index-long-us-durations";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS = "chunk-index-long-offsets";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES = "chunk-index-int-sizes";
    private static final String MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES = "chunk-index-long-us-times";
    private static final String MEDIA_FORMAT_KEY_TRACK_TYPE = "track-type-string";
    private static final Pattern REGEX_CRYPTO_INFO_PATTERN;
    private static final Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> SEEK_POINT_PAIR_START;
    private static final String TAG = "OConsumerAdapterV30";
    private String containerMimeType;
    private MediaParser.SeekMap dummySeekMap;
    private final boolean expectDummySeekMap;
    private InterfaceC1989p extractorOutput;
    private C1981j lastChunkIndex;
    private final ArrayList<C1978h0> lastOutputCryptoDatas;
    private final ArrayList<MediaCodec.CryptoInfo> lastReceivedCryptoInfos;
    private MediaParser.SeekMap lastSeekMap;
    private List<C0249w> muxedCaptionFormats;
    private int primaryTrackIndex;
    private final C0249w primaryTrackManifestFormat;
    private final int primaryTrackType;
    private long sampleTimestampUpperLimitFilterUs;
    private final DataReaderAdapter scratchDataReaderAdapter;
    private boolean seekingDisabled;
    private C1108d0 timestampAdjuster;
    private final ArrayList<C0249w> trackFormats;
    private final ArrayList<InterfaceC1980i0> trackOutputs;
    private boolean tracksEnded;
    private boolean tracksFoundCalled;

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class DataReaderAdapter implements InterfaceC0219m {
        public MediaParser$InputReader input;

        private DataReaderAdapter() {
        }

        @Override // androidx.media3.common.InterfaceC0219m
        public int read(byte[] bArr, int i, int i4) {
            MediaParser$InputReader mediaParser$InputReader = this.input;
            int i8 = AbstractC1118i0.f4750a;
            return mediaParser$InputReader.read(bArr, i, i4);
        }
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class SeekMapAdapter implements InterfaceC1968c0 {
        private final MediaParser.SeekMap adaptedSeekMap;

        public SeekMapAdapter(MediaParser.SeekMap seekMap) {
            this.adaptedSeekMap = seekMap;
        }

        private static C1970d0 asExoPlayerSeekPoint(MediaParser.SeekPoint seekPoint) {
            return new C1970d0(seekPoint.timeMicros, seekPoint.position);
        }

        @Override // p115n1.InterfaceC1968c0
        public long getDurationUs() {
            long durationMicros = this.adaptedSeekMap.getDurationMicros();
            if (durationMicros != -2147483648L) {
                return durationMicros;
            }
            return -9223372036854775807L;
        }

        @Override // p115n1.InterfaceC1968c0
        public C1966b0 getSeekPoints(long j) {
            Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> seekPoints = this.adaptedSeekMap.getSeekPoints(j);
            Object obj = seekPoints.first;
            if (obj != seekPoints.second) {
                return new C1966b0(asExoPlayerSeekPoint(C0448j.m969b(obj)), asExoPlayerSeekPoint(C0448j.m969b(seekPoints.second)));
            }
            C1970d0 c1970d0AsExoPlayerSeekPoint = asExoPlayerSeekPoint(C0448j.m969b(obj));
            return new C1966b0(c1970d0AsExoPlayerSeekPoint, c1970d0AsExoPlayerSeekPoint);
        }

        @Override // p115n1.InterfaceC1968c0
        public boolean isSeekable() {
            return this.adaptedSeekMap.isSeekable();
        }
    }

    static {
        MediaParser.SeekPoint seekPoint = MediaParser.SeekPoint.START;
        SEEK_POINT_PAIR_START = Pair.create(seekPoint, seekPoint);
        REGEX_CRYPTO_INFO_PATTERN = Pattern.compile("pattern \\(encrypt: (\\d+), skip: (\\d+)\\)");
    }

    public OutputConsumerAdapterV30() {
        this(null, -2, false);
    }

    private void ensureSpaceForTrackIndex(int i) {
        for (int size = this.trackOutputs.size(); size <= i; size++) {
            this.trackOutputs.add(null);
            this.trackFormats.add(null);
            this.lastReceivedCryptoInfos.add(null);
            this.lastOutputCryptoDatas.add(null);
        }
    }

    private static int getFlag(MediaFormat mediaFormat, String str, int i) {
        if (mediaFormat.getInteger(str, 0) != 0) {
            return i;
        }
        return 0;
    }

    private static List<byte[]> getInitializationData(MediaFormat mediaFormat) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            StringBuilder sb = new StringBuilder("csd-");
            int i4 = i + 1;
            sb.append(i);
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer(sb.toString());
            if (byteBuffer == null) {
                return arrayList;
            }
            byte[] bArr = new byte[byteBuffer.remaining()];
            byteBuffer.get(bArr);
            arrayList.add(bArr);
            i = i4;
        }
    }

    private static String getMimeType(String str) {
        str.getClass();
        switch (str) {
            case "android.media.mediaparser.Mp4Parser":
            case "android.media.mediaparser.FragmentedMp4Parser":
                return "video/mp4";
            case "android.media.mediaparser.OggParser":
                return "audio/ogg";
            case "android.media.mediaparser.TsParser":
                return "video/mp2t";
            case "android.media.mediaparser.AdtsParser":
                return "audio/mp4a-latm";
            case "android.media.mediaparser.WavParser":
                return "audio/raw";
            case "android.media.mediaparser.PsParser":
                return "video/mp2p";
            case "android.media.mediaparser.Ac3Parser":
                return "audio/ac3";
            case "android.media.mediaparser.AmrParser":
                return "audio/amr";
            case "android.media.mediaparser.FlacParser":
                return "audio/flac";
            case "android.media.mediaparser.MatroskaParser":
                return "video/webm";
            case "android.media.mediaparser.Ac4Parser":
                return "audio/ac4";
            case "android.media.mediaparser.Mp3Parser":
                return "audio/mpeg";
            case "android.media.mediaparser.FlvParser":
                return "video/x-flv";
            default:
                throw new IllegalArgumentException("Illegal parser name: ".concat(str));
        }
    }

    private static int getSelectionFlags(MediaFormat mediaFormat) {
        return getFlag(mediaFormat, "is-forced-subtitle", 2) | getFlag(mediaFormat, "is-autoselect", 4) | getFlag(mediaFormat, "is-default", 1);
    }

    private void maybeEndTracks() {
        if (!this.tracksFoundCalled || this.tracksEnded) {
            return;
        }
        int size = this.trackOutputs.size();
        for (int i = 0; i < size; i++) {
            if (this.trackOutputs.get(i) == null) {
                return;
            }
        }
        this.extractorOutput.endTracks();
        this.tracksEnded = true;
    }

    private boolean maybeObtainChunkIndex(MediaFormat mediaFormat) {
        ByteBuffer byteBuffer = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_SIZES);
        if (byteBuffer == null) {
            return false;
        }
        IntBuffer intBufferAsIntBuffer = byteBuffer.asIntBuffer();
        ByteBuffer byteBuffer2 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_OFFSETS);
        byteBuffer2.getClass();
        LongBuffer longBufferAsLongBuffer = byteBuffer2.asLongBuffer();
        ByteBuffer byteBuffer3 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_DURATIONS);
        byteBuffer3.getClass();
        LongBuffer longBufferAsLongBuffer2 = byteBuffer3.asLongBuffer();
        ByteBuffer byteBuffer4 = mediaFormat.getByteBuffer(MEDIA_FORMAT_KEY_CHUNK_INDEX_TIMES);
        byteBuffer4.getClass();
        LongBuffer longBufferAsLongBuffer3 = byteBuffer4.asLongBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        long[] jArr = new long[longBufferAsLongBuffer.remaining()];
        long[] jArr2 = new long[longBufferAsLongBuffer2.remaining()];
        long[] jArr3 = new long[longBufferAsLongBuffer3.remaining()];
        intBufferAsIntBuffer.get(iArr);
        longBufferAsLongBuffer.get(jArr);
        longBufferAsLongBuffer2.get(jArr2);
        longBufferAsLongBuffer3.get(jArr3);
        C1981j c1981j = new C1981j(iArr, jArr, jArr2, jArr3);
        this.lastChunkIndex = c1981j;
        this.extractorOutput.seekMap(c1981j);
        return true;
    }

    private C1978h0 toExoPlayerCryptoData(int i, MediaCodec.CryptoInfo cryptoInfo) throws NumberFormatException {
        int i4;
        int i8;
        if (cryptoInfo == null) {
            return null;
        }
        if (this.lastReceivedCryptoInfos.get(i) == cryptoInfo) {
            C1978h0 c1978h0 = this.lastOutputCryptoDatas.get(i);
            c1978h0.getClass();
            return c1978h0;
        }
        try {
            Matcher matcher = REGEX_CRYPTO_INFO_PATTERN.matcher(cryptoInfo.toString());
            matcher.find();
            String strGroup = matcher.group(1);
            int i9 = AbstractC1118i0.f4750a;
            i4 = Integer.parseInt(strGroup);
            i8 = Integer.parseInt(matcher.group(2));
        } catch (RuntimeException e) {
            AbstractC1101a.m2365p(TAG, "Unexpected error while parsing CryptoInfo: " + cryptoInfo, e);
            i4 = 0;
            i8 = 0;
        }
        C1978h0 c1978h02 = new C1978h0(cryptoInfo.mode, i4, i8, cryptoInfo.key);
        this.lastReceivedCryptoInfos.set(i, cryptoInfo);
        this.lastOutputCryptoDatas.set(i, c1978h02);
        return c1978h02;
    }

    private static C0237s toExoPlayerDrmInitData(String str, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return null;
        }
        int schemeInitDataCount = drmInitData.getSchemeInitDataCount();
        C0234r[] c0234rArr = new C0234r[schemeInitDataCount];
        for (int i = 0; i < schemeInitDataCount; i++) {
            DrmInitData.SchemeInitData schemeInitDataAt = drmInitData.getSchemeInitDataAt(i);
            c0234rArr[i] = new C0234r(schemeInitDataAt.uuid, null, schemeInitDataAt.mimeType, schemeInitDataAt.data);
        }
        return new C0237s(str, true, c0234rArr);
    }

    private C0249w toExoPlayerFormat(MediaParser.TrackData trackData) {
        byte[] bArr;
        MediaFormat mediaFormat = trackData.mediaFormat;
        String string = mediaFormat.getString("mime");
        int integer = mediaFormat.getInteger("caption-service-number", -1);
        C0246v c0246v = new C0246v();
        c0246v.f1451q = toExoPlayerDrmInitData(mediaFormat.getString("crypto-mode-fourcc"), trackData.drmInitData);
        c0246v.f1446l = AbstractC0244u0.m687p(this.containerMimeType);
        c0246v.f1443i = mediaFormat.getInteger("bitrate", -1);
        c0246v.f1425B = mediaFormat.getInteger("channel-count", -1);
        C0216l c0216l = null;
        if (AbstractC1118i0.f4750a >= 24) {
            int integer2 = mediaFormat.containsKey("color-standard") ? mediaFormat.getInteger("color-standard") : -1;
            int integer3 = mediaFormat.containsKey("color-range") ? mediaFormat.getInteger("color-range") : -1;
            int integer4 = mediaFormat.containsKey("color-transfer") ? mediaFormat.getInteger("color-transfer") : -1;
            ByteBuffer byteBuffer = mediaFormat.getByteBuffer("hdr-static-info");
            if (byteBuffer != null) {
                byte[] bArr2 = new byte[byteBuffer.remaining()];
                byteBuffer.get(bArr2);
                bArr = bArr2;
            } else {
                bArr = null;
            }
            int i = (integer2 == 2 || integer2 == 1 || integer2 == 6 || integer2 == -1) ? integer2 : -1;
            int i4 = (integer3 == 2 || integer3 == 1 || integer3 == -1) ? integer3 : -1;
            int i8 = (integer4 == 1 || integer4 == 3 || integer4 == 6 || integer4 == 7 || integer4 == -1) ? integer4 : -1;
            if (i != -1 || i4 != -1 || i8 != -1 || bArr != null) {
                c0216l = new C0216l(i, i4, i8, -1, -1, bArr);
            }
        }
        c0246v.f1424A = c0216l;
        c0246v.f1447m = AbstractC0244u0.m687p(string);
        c0246v.f1444j = mediaFormat.getString("codecs-string");
        c0246v.f1456v = mediaFormat.getFloat("frame-rate", -1.0f);
        c0246v.f1454t = mediaFormat.getInteger("width", -1);
        c0246v.f1455u = mediaFormat.getInteger("height", -1);
        c0246v.f1450p = getInitializationData(mediaFormat);
        c0246v.f1438d = mediaFormat.getString("language");
        c0246v.f1448n = mediaFormat.getInteger("max-input-size", -1);
        c0246v.f1427D = mediaFormat.getInteger("exo-pcm-encoding", -1);
        int i9 = 0;
        c0246v.f1457w = mediaFormat.getInteger("rotation-degrees", 0);
        c0246v.f1426C = mediaFormat.getInteger("sample-rate", -1);
        c0246v.f1439e = getSelectionFlags(mediaFormat);
        c0246v.f1428E = mediaFormat.getInteger("encoder-delay", 0);
        c0246v.f1429F = mediaFormat.getInteger("encoder-padding", 0);
        c0246v.f1458x = mediaFormat.getFloat("pixel-width-height-ratio-float", 1.0f);
        c0246v.f1452r = mediaFormat.getLong("subsample-offset-us-long", Long.MAX_VALUE);
        c0246v.f1430G = integer;
        while (true) {
            if (i9 >= this.muxedCaptionFormats.size()) {
                break;
            }
            C0249w c0249w = this.muxedCaptionFormats.get(i9);
            if (Objects.equals(c0249w.f1522n, string) && c0249w.f1503H == integer) {
                c0246v.f1438d = c0249w.f1512d;
                c0246v.f1440f = c0249w.f1514f;
                c0246v.f1439e = c0249w.f1513e;
                c0246v.f1436b = c0249w.f1510b;
                c0246v.f1437c = AbstractC0983m0.m2165j(c0249w.f1511c);
                c0246v.f1445k = c0249w.f1520l;
                break;
            }
            i9++;
        }
        return new C0249w(c0246v);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int toTrackTypeConstant(String str) {
        if (str == null) {
            return -1;
        }
        switch (str) {
            case "metadata":
                return 5;
            case "unknown":
                return -1;
            case "text":
                return 3;
            case "audio":
                return 1;
            case "video":
                return 2;
            default:
                return AbstractC0244u0.m680i(str);
        }
    }

    public void disableSeeking() {
        this.seekingDisabled = true;
    }

    public C1981j getChunkIndex() {
        return this.lastChunkIndex;
    }

    public MediaParser.SeekMap getDummySeekMap() {
        return this.dummySeekMap;
    }

    public C0249w[] getSampleFormats() {
        if (!this.tracksFoundCalled) {
            return null;
        }
        C0249w[] c0249wArr = new C0249w[this.trackFormats.size()];
        for (int i = 0; i < this.trackFormats.size(); i++) {
            C0249w c0249w = this.trackFormats.get(i);
            c0249w.getClass();
            c0249wArr[i] = c0249w;
        }
        return c0249wArr;
    }

    public Pair<MediaParser.SeekPoint, MediaParser.SeekPoint> getSeekPoints(long j) {
        MediaParser.SeekMap seekMap = this.lastSeekMap;
        return seekMap != null ? seekMap.getSeekPoints(j) : SEEK_POINT_PAIR_START;
    }

    public void onSampleCompleted(int i, long j, int i4, int i8, int i9, MediaCodec.CryptoInfo cryptoInfo) {
        long j8 = this.sampleTimestampUpperLimitFilterUs;
        if (j8 == -9223372036854775807L || j < j8) {
            C1108d0 c1108d0 = this.timestampAdjuster;
            if (c1108d0 != null) {
                j = c1108d0.m2396a(j);
            }
            InterfaceC1980i0 interfaceC1980i0 = this.trackOutputs.get(i);
            interfaceC1980i0.getClass();
            interfaceC1980i0.sampleMetadata(j, i4, i8, i9, toExoPlayerCryptoData(i, cryptoInfo));
        }
    }

    public void onSampleDataFound(int i, MediaParser$InputReader mediaParser$InputReader) {
        ensureSpaceForTrackIndex(i);
        this.scratchDataReaderAdapter.input = mediaParser$InputReader;
        InterfaceC1980i0 interfaceC1980i0Track = this.trackOutputs.get(i);
        if (interfaceC1980i0Track == null) {
            interfaceC1980i0Track = this.extractorOutput.track(i, -1);
            this.trackOutputs.set(i, interfaceC1980i0Track);
        }
        interfaceC1980i0Track.sampleData((InterfaceC0219m) this.scratchDataReaderAdapter, (int) mediaParser$InputReader.getLength(), true);
    }

    public void onSeekMapFound(MediaParser.SeekMap seekMap) {
        InterfaceC1968c0 seekMapAdapter;
        if (this.expectDummySeekMap && this.dummySeekMap == null) {
            this.dummySeekMap = seekMap;
            return;
        }
        this.lastSeekMap = seekMap;
        long durationMicros = seekMap.getDurationMicros();
        InterfaceC1989p interfaceC1989p = this.extractorOutput;
        if (this.seekingDisabled) {
            if (durationMicros == -2147483648L) {
                durationMicros = -9223372036854775807L;
            }
            seekMapAdapter = new C1992s(durationMicros);
        } else {
            seekMapAdapter = new SeekMapAdapter(seekMap);
        }
        interfaceC1989p.seekMap(seekMapAdapter);
    }

    public void onTrackCountFound(int i) {
        this.tracksFoundCalled = true;
        maybeEndTracks();
    }

    public void onTrackDataFound(int i, MediaParser.TrackData trackData) {
        if (maybeObtainChunkIndex(trackData.mediaFormat)) {
            return;
        }
        ensureSpaceForTrackIndex(i);
        InterfaceC1980i0 interfaceC1980i0 = this.trackOutputs.get(i);
        if (interfaceC1980i0 == null) {
            String string = trackData.mediaFormat.getString(MEDIA_FORMAT_KEY_TRACK_TYPE);
            int trackTypeConstant = toTrackTypeConstant(string != null ? string : trackData.mediaFormat.getString("mime"));
            if (trackTypeConstant == this.primaryTrackType) {
                this.primaryTrackIndex = i;
            }
            InterfaceC1980i0 interfaceC1980i0Track = this.extractorOutput.track(i, trackTypeConstant);
            this.trackOutputs.set(i, interfaceC1980i0Track);
            if (string != null) {
                return;
            } else {
                interfaceC1980i0 = interfaceC1980i0Track;
            }
        }
        C0249w exoPlayerFormat = toExoPlayerFormat(trackData);
        C0249w c0249w = this.primaryTrackManifestFormat;
        interfaceC1980i0.format((c0249w == null || i != this.primaryTrackIndex) ? exoPlayerFormat : exoPlayerFormat.m695f(c0249w));
        this.trackFormats.set(i, exoPlayerFormat);
        maybeEndTracks();
    }

    public void setExtractorOutput(InterfaceC1989p interfaceC1989p) {
        this.extractorOutput = interfaceC1989p;
    }

    public void setMuxedCaptionFormats(List<C0249w> list) {
        this.muxedCaptionFormats = list;
    }

    public void setSampleTimestampUpperLimitFilterUs(long j) {
        this.sampleTimestampUpperLimitFilterUs = j;
    }

    public void setSelectedParserName(String str) {
        this.containerMimeType = getMimeType(str);
    }

    public void setTimestampAdjuster(C1108d0 c1108d0) {
        this.timestampAdjuster = c1108d0;
    }

    public OutputConsumerAdapterV30(C0249w c0249w, int i, boolean z7) {
        this.expectDummySeekMap = z7;
        this.primaryTrackManifestFormat = c0249w;
        this.primaryTrackType = i;
        this.trackOutputs = new ArrayList<>();
        this.trackFormats = new ArrayList<>();
        this.lastReceivedCryptoInfos = new ArrayList<>();
        this.lastOutputCryptoDatas = new ArrayList<>();
        this.scratchDataReaderAdapter = new DataReaderAdapter();
        this.extractorOutput = new C1584b(8);
        this.sampleTimestampUpperLimitFilterUs = -9223372036854775807L;
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        this.muxedCaptionFormats = C0981l1.f4211n;
    }
}
