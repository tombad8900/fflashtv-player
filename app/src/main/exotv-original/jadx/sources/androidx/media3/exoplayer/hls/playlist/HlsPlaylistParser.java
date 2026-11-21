package androidx.media3.exoplayer.hls.playlist;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.media3.common.AbstractC0213k;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0234r;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0241t0;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.hls.HlsTrackMetadataEntry;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.hls.playlist.HlsMultivariantPlaylist;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.TreeMap;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;
import p052f6.AbstractC1006u;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p064h2.AbstractC1151p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class HlsPlaylistParser implements ParsingLoadable.Parser<HlsPlaylist> {
    private static final String ATTR_CLOSED_CAPTIONS_NONE = "CLOSED-CAPTIONS=NONE";
    private static final String BOOLEAN_FALSE = "NO";
    private static final String BOOLEAN_TRUE = "YES";
    private static final String KEYFORMAT_IDENTITY = "identity";
    private static final String KEYFORMAT_PLAYREADY = "com.microsoft.playready";
    private static final String KEYFORMAT_WIDEVINE_PSSH_BINARY = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed";
    private static final String KEYFORMAT_WIDEVINE_PSSH_JSON = "com.widevine";
    private static final String LOG_TAG = "HlsPlaylistParser";
    private static final String METHOD_AES_128 = "AES-128";
    private static final String METHOD_NONE = "NONE";
    private static final String METHOD_SAMPLE_AES = "SAMPLE-AES";
    private static final String METHOD_SAMPLE_AES_CENC = "SAMPLE-AES-CENC";
    private static final String METHOD_SAMPLE_AES_CTR = "SAMPLE-AES-CTR";
    private static final String PLAYLIST_HEADER = "#EXTM3U";
    private static final String TAG_BYTERANGE = "#EXT-X-BYTERANGE";
    private static final String TAG_DEFINE = "#EXT-X-DEFINE";
    private static final String TAG_DISCONTINUITY = "#EXT-X-DISCONTINUITY";
    private static final String TAG_DISCONTINUITY_SEQUENCE = "#EXT-X-DISCONTINUITY-SEQUENCE";
    private static final String TAG_ENDLIST = "#EXT-X-ENDLIST";
    private static final String TAG_GAP = "#EXT-X-GAP";
    private static final String TAG_IFRAME = "#EXT-X-I-FRAMES-ONLY";
    private static final String TAG_INDEPENDENT_SEGMENTS = "#EXT-X-INDEPENDENT-SEGMENTS";
    private static final String TAG_INIT_SEGMENT = "#EXT-X-MAP";
    private static final String TAG_I_FRAME_STREAM_INF = "#EXT-X-I-FRAME-STREAM-INF";
    private static final String TAG_KEY = "#EXT-X-KEY";
    private static final String TAG_MEDIA = "#EXT-X-MEDIA";
    private static final String TAG_MEDIA_DURATION = "#EXTINF";
    private static final String TAG_MEDIA_SEQUENCE = "#EXT-X-MEDIA-SEQUENCE";
    private static final String TAG_PART = "#EXT-X-PART";
    private static final String TAG_PART_INF = "#EXT-X-PART-INF";
    private static final String TAG_PLAYLIST_TYPE = "#EXT-X-PLAYLIST-TYPE";
    private static final String TAG_PREFIX = "#EXT";
    private static final String TAG_PRELOAD_HINT = "#EXT-X-PRELOAD-HINT";
    private static final String TAG_PROGRAM_DATE_TIME = "#EXT-X-PROGRAM-DATE-TIME";
    private static final String TAG_RENDITION_REPORT = "#EXT-X-RENDITION-REPORT";
    private static final String TAG_SERVER_CONTROL = "#EXT-X-SERVER-CONTROL";
    private static final String TAG_SESSION_KEY = "#EXT-X-SESSION-KEY";
    private static final String TAG_SKIP = "#EXT-X-SKIP";
    private static final String TAG_START = "#EXT-X-START";
    private static final String TAG_STREAM_INF = "#EXT-X-STREAM-INF";
    private static final String TAG_TARGET_DURATION = "#EXT-X-TARGETDURATION";
    private static final String TAG_VERSION = "#EXT-X-VERSION";
    private static final String TYPE_AUDIO = "AUDIO";
    private static final String TYPE_CLOSED_CAPTIONS = "CLOSED-CAPTIONS";
    private static final String TYPE_MAP = "MAP";
    private static final String TYPE_PART = "PART";
    private static final String TYPE_SUBTITLES = "SUBTITLES";
    private static final String TYPE_VIDEO = "VIDEO";
    private final HlsMultivariantPlaylist multivariantPlaylist;
    private final HlsMediaPlaylist previousMediaPlaylist;
    private static final Pattern REGEX_AVERAGE_BANDWIDTH = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_VIDEO = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern REGEX_AUDIO = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern REGEX_SUBTITLES = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern REGEX_CLOSED_CAPTIONS = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern REGEX_BANDWIDTH = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern REGEX_CHANNELS = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern REGEX_CODECS = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern REGEX_RESOLUTION = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern REGEX_FRAME_RATE = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern REGEX_TARGET_DURATION = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern REGEX_ATTR_DURATION = Pattern.compile("DURATION=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_TARGET_DURATION = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");
    private static final Pattern REGEX_VERSION = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern REGEX_PLAYLIST_TYPE = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern REGEX_CAN_SKIP_UNTIL = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_SKIP_DATE_RANGES = compileBooleanAttrPattern("CAN-SKIP-DATERANGES");
    private static final Pattern REGEX_SKIPPED_SEGMENTS = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");
    private static final Pattern REGEX_HOLD_BACK = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_PART_HOLD_BACK = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");
    private static final Pattern REGEX_CAN_BLOCK_RELOAD = compileBooleanAttrPattern("CAN-BLOCK-RELOAD");
    private static final Pattern REGEX_MEDIA_SEQUENCE = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern REGEX_MEDIA_DURATION = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern REGEX_MEDIA_TITLE = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern REGEX_LAST_MSN = Pattern.compile("LAST-MSN=(\\d+)\\b");
    private static final Pattern REGEX_LAST_PART = Pattern.compile("LAST-PART=(\\d+)\\b");
    private static final Pattern REGEX_TIME_OFFSET = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern REGEX_BYTERANGE = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern REGEX_ATTR_BYTERANGE = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern REGEX_BYTERANGE_START = Pattern.compile("BYTERANGE-START=(\\d+)\\b");
    private static final Pattern REGEX_BYTERANGE_LENGTH = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");
    private static final Pattern REGEX_METHOD = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern REGEX_KEYFORMAT = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern REGEX_KEYFORMATVERSIONS = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern REGEX_URI = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern REGEX_IV = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern REGEX_TYPE = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern REGEX_PRELOAD_HINT_TYPE = Pattern.compile("TYPE=(PART|MAP)");
    private static final Pattern REGEX_LANGUAGE = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private static final Pattern REGEX_NAME = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern REGEX_GROUP_ID = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern REGEX_CHARACTERISTICS = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern REGEX_INSTREAM_ID = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern REGEX_AUTOSELECT = compileBooleanAttrPattern("AUTOSELECT");
    private static final Pattern REGEX_DEFAULT = compileBooleanAttrPattern("DEFAULT");
    private static final Pattern REGEX_FORCED = compileBooleanAttrPattern("FORCED");
    private static final Pattern REGEX_INDEPENDENT = compileBooleanAttrPattern("INDEPENDENT");
    private static final Pattern REGEX_GAP = compileBooleanAttrPattern("GAP");
    private static final Pattern REGEX_PRECISE = compileBooleanAttrPattern("PRECISE");
    private static final Pattern REGEX_VALUE = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern REGEX_IMPORT = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern REGEX_VARIABLE_REFERENCE = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class DeltaUpdateException extends IOException {
    }

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static class LineIterator {
        private final Queue<String> extraLines;
        private String next;
        private final BufferedReader reader;

        public LineIterator(Queue<String> queue, BufferedReader bufferedReader) {
            this.extraLines = queue;
            this.reader = bufferedReader;
        }

        @EnsuresNonNullIf(expression = {"next"}, result = true)
        public boolean hasNext() throws IOException {
            String strTrim;
            if (this.next != null) {
                return true;
            }
            if (!this.extraLines.isEmpty()) {
                String strPoll = this.extraLines.poll();
                strPoll.getClass();
                this.next = strPoll;
                return true;
            }
            do {
                String line = this.reader.readLine();
                this.next = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.next = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.next;
            this.next = null;
            return str;
        }
    }

    public HlsPlaylistParser() {
        this(HlsMultivariantPlaylist.EMPTY, null);
    }

    private static boolean checkPlaylistHeader(BufferedReader bufferedReader) throws IOException {
        int i = bufferedReader.read();
        if (i == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i = bufferedReader.read();
        }
        int iSkipIgnorableWhitespace = skipIgnorableWhitespace(bufferedReader, true, i);
        for (int i4 = 0; i4 < 7; i4++) {
            if (iSkipIgnorableWhitespace != PLAYLIST_HEADER.charAt(i4)) {
                return false;
            }
            iSkipIgnorableWhitespace = bufferedReader.read();
        }
        return AbstractC1118i0.m2425P(skipIgnorableWhitespace(bufferedReader, false, iSkipIgnorableWhitespace));
    }

    private static Pattern compileBooleanAttrPattern(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static C0237s getPlaylistProtectionSchemes(String str, C0234r[] c0234rArr) {
        C0234r[] c0234rArr2 = new C0234r[c0234rArr.length];
        for (int i = 0; i < c0234rArr.length; i++) {
            C0234r c0234r = c0234rArr[i];
            c0234rArr2[i] = new C0234r(c0234r.f1325k, c0234r.f1326l, c0234r.f1327m, null);
        }
        return new C0237s(str, true, c0234rArr2);
    }

    private static String getSegmentEncryptionIV(long j, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j);
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithAudioGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.audioGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithSubtitleGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.subtitleGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static HlsMultivariantPlaylist.Variant getVariantWithVideoGroup(ArrayList<HlsMultivariantPlaylist.Variant> arrayList, String str) {
        for (int i = 0; i < arrayList.size(); i++) {
            HlsMultivariantPlaylist.Variant variant = arrayList.get(i);
            if (str.equals(variant.videoGroupId)) {
                return variant;
            }
        }
        return null;
    }

    private static double parseDoubleAttr(String str, Pattern pattern) {
        return Double.parseDouble(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static C0234r parseDrmSchemeData(String str, String str2, Map<String, String> map) throws C0247v0 {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_KEYFORMATVERSIONS, "1", map);
        if (KEYFORMAT_WIDEVINE_PSSH_BINARY.equals(str2)) {
            String stringAttr = parseStringAttr(str, REGEX_URI, map);
            return new C0234r(AbstractC0213k.f1165d, null, "video/mp4", Base64.decode(stringAttr.substring(stringAttr.indexOf(44)), 0));
        }
        if (KEYFORMAT_WIDEVINE_PSSH_JSON.equals(str2)) {
            UUID uuid = AbstractC0213k.f1165d;
            int i = AbstractC1118i0.f4750a;
            return new C0234r(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!KEYFORMAT_PLAYREADY.equals(str2) || !"1".equals(optionalStringAttr)) {
            return null;
        }
        String stringAttr2 = parseStringAttr(str, REGEX_URI, map);
        byte[] bArrDecode = Base64.decode(stringAttr2.substring(stringAttr2.indexOf(44)), 0);
        UUID uuid2 = AbstractC0213k.f1166e;
        return new C0234r(uuid2, null, "video/mp4", AbstractC1151p.m2563a(uuid2, null, bArrDecode));
    }

    private static String parseEncryptionScheme(String str) {
        return (METHOD_SAMPLE_AES_CENC.equals(str) || METHOD_SAMPLE_AES_CTR.equals(str)) ? "cenc" : "cbcs";
    }

    private static int parseIntAttr(String str, Pattern pattern) {
        return Integer.parseInt(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    private static long parseLongAttr(String str, Pattern pattern) {
        return Long.parseLong(parseStringAttr(str, pattern, Collections.EMPTY_MAP));
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0321 A[PHI: r13
      0x0321: PHI (r13v7 java.lang.String) = (r13v5 java.lang.String), (r13v2 java.lang.String) binds: [B:118:0x0330, B:112:0x0314] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:228:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x064f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HlsMediaPlaylist parseMediaPlaylist(HlsMultivariantPlaylist hlsMultivariantPlaylist, HlsMediaPlaylist hlsMediaPlaylist, LineIterator lineIterator, String str) throws DeltaUpdateException, NumberFormatException, C0247v0 {
        HlsMediaPlaylist.ServerControl serverControl;
        TreeMap treeMap;
        long j;
        String str2;
        HlsMediaPlaylist.Segment segment;
        int i;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        HlsMediaPlaylist.Segment segment2;
        long j13;
        boolean z7;
        C0237s c0237s;
        C0237s playlistProtectionSchemes;
        HlsMultivariantPlaylist hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
        HlsMediaPlaylist hlsMediaPlaylist2 = hlsMediaPlaylist;
        boolean z8 = hlsMultivariantPlaylist2.hasIndependentSegments;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        HlsMediaPlaylist.ServerControl serverControl2 = new HlsMediaPlaylist.ServerControl(-9223372036854775807L, false, -9223372036854775807L, -9223372036854775807L, false);
        TreeMap treeMap2 = new TreeMap();
        boolean z9 = z8;
        long j14 = -9223372036854775807L;
        long doubleAttr = -9223372036854775807L;
        long j15 = 0;
        long j16 = 0;
        long jM2428S = 0;
        long j17 = 0;
        long longAttr = 0;
        long timeSecondsToUs = 0;
        long j18 = 0;
        String optionalStringAttr = C2181z.FRAGMENT_ENCODE_SET;
        String str3 = optionalStringAttr;
        boolean optionalBooleanAttribute = false;
        String encryptionScheme = null;
        C0237s c0237s2 = null;
        HlsMediaPlaylist.Part part = null;
        int i4 = 0;
        boolean z10 = false;
        C0237s playlistProtectionSchemes2 = null;
        String str4 = null;
        long j19 = -1;
        boolean z11 = false;
        boolean z12 = false;
        int i8 = 0;
        HlsMediaPlaylist.Segment segment3 = null;
        int i9 = 0;
        String stringAttr = null;
        long j20 = -1;
        boolean z13 = false;
        long intAttr = -9223372036854775807L;
        long j21 = 0;
        int intAttr2 = 1;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList4.add(next);
            }
            if (next.startsWith(TAG_PLAYLIST_TYPE)) {
                String stringAttr2 = parseStringAttr(next, REGEX_PLAYLIST_TYPE, map);
                if ("VOD".equals(stringAttr2)) {
                    i4 = 1;
                } else if ("EVENT".equals(stringAttr2)) {
                    i4 = 2;
                }
            } else if (next.equals(TAG_IFRAME)) {
                z13 = true;
            } else {
                if (next.startsWith(TAG_START)) {
                    ArrayList arrayList5 = arrayList4;
                    serverControl = serverControl2;
                    long doubleAttr2 = (long) (parseDoubleAttr(next, REGEX_TIME_OFFSET) * 1000000.0d);
                    optionalBooleanAttribute = parseOptionalBooleanAttribute(next, REGEX_PRECISE, false);
                    arrayList4 = arrayList5;
                    j14 = doubleAttr2;
                } else {
                    ArrayList arrayList6 = arrayList4;
                    serverControl = serverControl2;
                    if (next.startsWith(TAG_SERVER_CONTROL)) {
                        serverControl2 = parseServerControl(next);
                        arrayList4 = arrayList6;
                    } else if (next.startsWith(TAG_PART_INF)) {
                        doubleAttr = (long) (parseDoubleAttr(next, REGEX_PART_TARGET_DURATION) * 1000000.0d);
                        arrayList4 = arrayList6;
                    } else if (next.startsWith(TAG_INIT_SEGMENT)) {
                        String stringAttr3 = parseStringAttr(next, REGEX_URI, map);
                        boolean z14 = optionalBooleanAttribute;
                        String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map);
                        if (optionalStringAttr2 != null) {
                            int i10 = AbstractC1118i0.f4750a;
                            String[] strArrSplit = optionalStringAttr2.split("@", -1);
                            j19 = Long.parseLong(strArrSplit[0]);
                            if (strArrSplit.length > 1) {
                                j15 = Long.parseLong(strArrSplit[1]);
                            }
                        }
                        long j22 = j19;
                        long j23 = j22 == j20 ? 0L : j15;
                        if (stringAttr != null && str4 == null) {
                            throw C0247v0.createForMalformedManifest("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.", null);
                        }
                        HlsMediaPlaylist.Segment segment4 = new HlsMediaPlaylist.Segment(stringAttr3, j23, j22, stringAttr, str4);
                        String str5 = str4;
                        if (j22 != j20) {
                            j23 += j22;
                        }
                        str4 = str5;
                        arrayList4 = arrayList6;
                        segment3 = segment4;
                        j15 = j23;
                        j19 = j20;
                        serverControl2 = serverControl;
                        optionalBooleanAttribute = z14;
                    } else {
                        boolean z15 = optionalBooleanAttribute;
                        String str6 = str4;
                        String str7 = stringAttr;
                        if (next.startsWith(TAG_TARGET_DURATION)) {
                            intAttr = 1000000 * parseIntAttr(next, REGEX_TARGET_DURATION);
                        } else if (next.startsWith(TAG_MEDIA_SEQUENCE)) {
                            longAttr = parseLongAttr(next, REGEX_MEDIA_SEQUENCE);
                            stringAttr = str7;
                            str4 = str6;
                            j21 = longAttr;
                            serverControl2 = serverControl;
                            optionalBooleanAttribute = z15;
                            arrayList4 = arrayList6;
                        } else if (next.startsWith(TAG_VERSION)) {
                            intAttr2 = parseIntAttr(next, REGEX_VERSION);
                        } else {
                            if (next.startsWith(TAG_DEFINE)) {
                                String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_IMPORT, map);
                                if (optionalStringAttr3 != null) {
                                    String str8 = hlsMultivariantPlaylist2.variableDefinitions.get(optionalStringAttr3);
                                    if (str8 != null) {
                                        map.put(optionalStringAttr3, str8);
                                    }
                                } else {
                                    map.put(parseStringAttr(next, REGEX_NAME, map), parseStringAttr(next, REGEX_VALUE, map));
                                }
                                treeMap = treeMap2;
                                j = j16;
                                str2 = str3;
                            } else if (next.startsWith(TAG_MEDIA_DURATION)) {
                                timeSecondsToUs = parseTimeSecondsToUs(next, REGEX_MEDIA_DURATION);
                                optionalStringAttr = parseOptionalStringAttr(next, REGEX_MEDIA_TITLE, str3, map);
                            } else {
                                String str9 = str3;
                                if (next.startsWith(TAG_SKIP)) {
                                    int intAttr3 = parseIntAttr(next, REGEX_SKIPPED_SEGMENTS);
                                    AbstractC1101a.m2359j(hlsMediaPlaylist2 != null && arrayList.isEmpty());
                                    int i11 = AbstractC1118i0.f4750a;
                                    str2 = str9;
                                    int i12 = (int) (j21 - hlsMediaPlaylist2.mediaSequence);
                                    int i13 = intAttr3 + i12;
                                    if (i12 < 0 || i13 > hlsMediaPlaylist2.segments.size()) {
                                        throw new DeltaUpdateException();
                                    }
                                    stringAttr = str7;
                                    str4 = str6;
                                    long j24 = j16;
                                    while (i12 < i13) {
                                        HlsMediaPlaylist.Segment segmentCopyWith = hlsMediaPlaylist2.segments.get(i12);
                                        int i14 = i12;
                                        if (j21 != hlsMediaPlaylist2.mediaSequence) {
                                            segmentCopyWith = segmentCopyWith.copyWith(j24, (hlsMediaPlaylist2.discontinuitySequence - i8) + segmentCopyWith.relativeDiscontinuitySequence);
                                        }
                                        arrayList.add(segmentCopyWith);
                                        j17 = j24 + segmentCopyWith.durationUs;
                                        long j25 = segmentCopyWith.byteRangeLength;
                                        if (j25 != j20) {
                                            j15 = segmentCopyWith.byteRangeOffset + j25;
                                        }
                                        int i15 = segmentCopyWith.relativeDiscontinuitySequence;
                                        HlsMediaPlaylist.Segment segment5 = segmentCopyWith.initializationSegment;
                                        c0237s2 = segmentCopyWith.drmInitData;
                                        String str10 = segmentCopyWith.fullSegmentEncryptionKeyUri;
                                        String str11 = segmentCopyWith.encryptionIV;
                                        int i16 = i13;
                                        if (str11 == null || !str11.equals(Long.toHexString(longAttr))) {
                                            str4 = segmentCopyWith.encryptionIV;
                                        }
                                        longAttr++;
                                        i9 = i15;
                                        segment3 = segment5;
                                        stringAttr = str10;
                                        j24 = j17;
                                        i12 = i14 + 1;
                                        i13 = i16;
                                    }
                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                    j16 = j24;
                                } else {
                                    str2 = str9;
                                    if (next.startsWith(TAG_KEY)) {
                                        String stringAttr4 = parseStringAttr(next, REGEX_METHOD, map);
                                        String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map);
                                        if (METHOD_NONE.equals(stringAttr4)) {
                                            treeMap2.clear();
                                            c0237s2 = null;
                                            str4 = null;
                                            stringAttr = null;
                                        } else {
                                            String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_IV, map);
                                            if (!KEYFORMAT_IDENTITY.equals(optionalStringAttr4)) {
                                                if (encryptionScheme == null) {
                                                    encryptionScheme = parseEncryptionScheme(stringAttr4);
                                                }
                                                C0234r drmSchemeData = parseDrmSchemeData(next, optionalStringAttr4, map);
                                                if (drmSchemeData != null) {
                                                    treeMap2.put(optionalStringAttr4, drmSchemeData);
                                                    str4 = optionalStringAttr5;
                                                    c0237s2 = null;
                                                    stringAttr = null;
                                                }
                                            } else if (METHOD_AES_128.equals(stringAttr4)) {
                                                stringAttr = parseStringAttr(next, REGEX_URI, map);
                                                str4 = optionalStringAttr5;
                                            } else {
                                                str4 = optionalStringAttr5;
                                                stringAttr = null;
                                            }
                                        }
                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                    } else {
                                        if (next.startsWith(TAG_BYTERANGE)) {
                                            String stringAttr5 = parseStringAttr(next, REGEX_BYTERANGE, map);
                                            int i17 = AbstractC1118i0.f4750a;
                                            String[] strArrSplit2 = stringAttr5.split("@", -1);
                                            j19 = Long.parseLong(strArrSplit2[0]);
                                            if (strArrSplit2.length > 1) {
                                                j15 = Long.parseLong(strArrSplit2[1]);
                                            }
                                        } else if (next.startsWith(TAG_DISCONTINUITY_SEQUENCE)) {
                                            i8 = Integer.parseInt(next.substring(next.indexOf(58) + 1));
                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                            stringAttr = str7;
                                            str4 = str6;
                                            serverControl2 = serverControl;
                                            optionalBooleanAttribute = z15;
                                            arrayList4 = arrayList6;
                                            str3 = str2;
                                            z12 = true;
                                        } else if (next.equals(TAG_DISCONTINUITY)) {
                                            i9++;
                                        } else {
                                            if (next.startsWith(TAG_PROGRAM_DATE_TIME)) {
                                                if (jM2428S == 0) {
                                                    jM2428S = AbstractC1118i0.m2428S(AbstractC1118i0.m2431V(next.substring(next.indexOf(58) + 1))) - j16;
                                                } else {
                                                    treeMap = treeMap2;
                                                }
                                            } else if (next.equals(TAG_GAP)) {
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                stringAttr = str7;
                                                str4 = str6;
                                                serverControl2 = serverControl;
                                                optionalBooleanAttribute = z15;
                                                arrayList4 = arrayList6;
                                                str3 = str2;
                                                z11 = true;
                                            } else if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                stringAttr = str7;
                                                str4 = str6;
                                                serverControl2 = serverControl;
                                                optionalBooleanAttribute = z15;
                                                arrayList4 = arrayList6;
                                                str3 = str2;
                                                z9 = true;
                                            } else if (next.equals(TAG_ENDLIST)) {
                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                stringAttr = str7;
                                                str4 = str6;
                                                serverControl2 = serverControl;
                                                optionalBooleanAttribute = z15;
                                                arrayList4 = arrayList6;
                                                str3 = str2;
                                                z10 = true;
                                            } else if (next.startsWith(TAG_RENDITION_REPORT)) {
                                                treeMap = treeMap2;
                                                arrayList3.add(new HlsMediaPlaylist.RenditionReport(Uri.parse(AbstractC1101a.m2344B(str, parseStringAttr(next, REGEX_URI, map))), parseOptionalLongAttr(next, REGEX_LAST_MSN, j20), parseOptionalIntAttr(next, REGEX_LAST_PART, -1)));
                                            } else {
                                                treeMap = treeMap2;
                                                if (!next.startsWith(TAG_PRELOAD_HINT)) {
                                                    j8 = longAttr;
                                                    if (next.startsWith(TAG_PART)) {
                                                        String segmentEncryptionIV = getSegmentEncryptionIV(j8, str7, str6);
                                                        String stringAttr6 = parseStringAttr(next, REGEX_URI, map);
                                                        long doubleAttr3 = (long) (parseDoubleAttr(next, REGEX_ATTR_DURATION) * 1000000.0d);
                                                        boolean optionalBooleanAttribute2 = parseOptionalBooleanAttribute(next, REGEX_INDEPENDENT, false) | (z9 && arrayList2.isEmpty());
                                                        boolean optionalBooleanAttribute3 = parseOptionalBooleanAttribute(next, REGEX_GAP, false);
                                                        String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_ATTR_BYTERANGE, map);
                                                        if (optionalStringAttr6 != null) {
                                                            int i18 = AbstractC1118i0.f4750a;
                                                            String[] strArrSplit3 = optionalStringAttr6.split("@", -1);
                                                            long j26 = Long.parseLong(strArrSplit3[0]);
                                                            if (strArrSplit3.length > 1) {
                                                                j18 = Long.parseLong(strArrSplit3[1]);
                                                            }
                                                            j11 = j26;
                                                        } else {
                                                            j11 = -1;
                                                        }
                                                        long j27 = j11 == -1 ? 0L : j18;
                                                        if (c0237s2 == null && !treeMap.isEmpty()) {
                                                            C0234r[] c0234rArr = (C0234r[]) treeMap.values().toArray(new C0234r[0]);
                                                            c0237s2 = new C0237s(encryptionScheme, true, c0234rArr);
                                                            if (playlistProtectionSchemes2 == null) {
                                                                playlistProtectionSchemes2 = getPlaylistProtectionSchemes(encryptionScheme, c0234rArr);
                                                            }
                                                        }
                                                        C0237s c0237s3 = c0237s2;
                                                        HlsMediaPlaylist.Segment segment6 = segment3;
                                                        int i19 = i9;
                                                        arrayList2.add(new HlsMediaPlaylist.Part(stringAttr6, segment3, doubleAttr3, i9, j17, c0237s3, str7, segmentEncryptionIV, j27, j11, optionalBooleanAttribute3, optionalBooleanAttribute2, false));
                                                        j17 += doubleAttr3;
                                                        if (j11 != -1) {
                                                            j27 += j11;
                                                        }
                                                        j18 = j27;
                                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                        segment3 = segment6;
                                                        stringAttr = str7;
                                                        str4 = str6;
                                                        longAttr = j8;
                                                        i9 = i19;
                                                        c0237s2 = c0237s3;
                                                        serverControl2 = serverControl;
                                                        optionalBooleanAttribute = z15;
                                                        arrayList4 = arrayList6;
                                                        str3 = str2;
                                                        treeMap2 = treeMap;
                                                    } else {
                                                        segment = segment3;
                                                        i = i9;
                                                        if (next.startsWith("#")) {
                                                            j9 = j15;
                                                            j = j16;
                                                            j10 = timeSecondsToUs;
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                            segment3 = segment;
                                                            stringAttr = str7;
                                                            str4 = str6;
                                                            longAttr = j8;
                                                            optionalStringAttr = optionalStringAttr;
                                                            timeSecondsToUs = j10;
                                                            j16 = j;
                                                            j15 = j9;
                                                            serverControl2 = serverControl;
                                                            optionalBooleanAttribute = z15;
                                                            arrayList4 = arrayList6;
                                                            str3 = str2;
                                                            treeMap2 = treeMap;
                                                            j20 = -1;
                                                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                            i9 = i;
                                                        } else {
                                                            long j28 = j16;
                                                            String segmentEncryptionIV2 = getSegmentEncryptionIV(j8, str7, str6);
                                                            longAttr = j8 + 1;
                                                            String strReplaceVariableReferences = replaceVariableReferences(next, map);
                                                            HlsMediaPlaylist.Segment segment7 = (HlsMediaPlaylist.Segment) map2.get(strReplaceVariableReferences);
                                                            if (j19 == -1) {
                                                                segment2 = segment7;
                                                                j13 = 0;
                                                            } else {
                                                                if (z13 && segment == null && segment7 == null) {
                                                                    j12 = j15;
                                                                    segment7 = new HlsMediaPlaylist.Segment(strReplaceVariableReferences, 0L, j12, null, null);
                                                                    map2.put(strReplaceVariableReferences, segment7);
                                                                } else {
                                                                    j12 = j15;
                                                                }
                                                                segment2 = segment7;
                                                                j13 = j12;
                                                            }
                                                            if (c0237s2 != null || treeMap.isEmpty()) {
                                                                z7 = false;
                                                            } else {
                                                                z7 = false;
                                                                C0234r[] c0234rArr2 = (C0234r[]) treeMap.values().toArray(new C0234r[0]);
                                                                c0237s2 = new C0237s(encryptionScheme, true, c0234rArr2);
                                                                if (playlistProtectionSchemes2 == null) {
                                                                    playlistProtectionSchemes = getPlaylistProtectionSchemes(encryptionScheme, c0234rArr2);
                                                                    c0237s = c0237s2;
                                                                }
                                                                long j29 = timeSecondsToUs;
                                                                arrayList.add(new HlsMediaPlaylist.Segment(strReplaceVariableReferences, segment == null ? segment : segment2, optionalStringAttr, j29, i, j28, c0237s, str7, segmentEncryptionIV2, j13, j19, z11, arrayList2));
                                                                j17 = j28 + j29;
                                                                arrayList2 = new ArrayList();
                                                                if (j19 != -1) {
                                                                    j13 += j19;
                                                                }
                                                                j15 = j13;
                                                                hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                                segment3 = segment;
                                                                stringAttr = str7;
                                                                str4 = str6;
                                                                playlistProtectionSchemes2 = playlistProtectionSchemes;
                                                                z11 = z7;
                                                                i9 = i;
                                                                c0237s2 = c0237s;
                                                                j16 = j17;
                                                                timeSecondsToUs = 0;
                                                                serverControl2 = serverControl;
                                                                optionalBooleanAttribute = z15;
                                                                arrayList4 = arrayList6;
                                                                optionalStringAttr = str2;
                                                                str3 = optionalStringAttr;
                                                                treeMap2 = treeMap;
                                                                j19 = -1;
                                                            }
                                                            c0237s = c0237s2;
                                                            playlistProtectionSchemes = playlistProtectionSchemes2;
                                                            long j292 = timeSecondsToUs;
                                                            arrayList.add(new HlsMediaPlaylist.Segment(strReplaceVariableReferences, segment == null ? segment : segment2, optionalStringAttr, j292, i, j28, c0237s, str7, segmentEncryptionIV2, j13, j19, z11, arrayList2));
                                                            j17 = j28 + j292;
                                                            arrayList2 = new ArrayList();
                                                            if (j19 != -1) {
                                                            }
                                                            j15 = j13;
                                                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                            segment3 = segment;
                                                            stringAttr = str7;
                                                            str4 = str6;
                                                            playlistProtectionSchemes2 = playlistProtectionSchemes;
                                                            z11 = z7;
                                                            i9 = i;
                                                            c0237s2 = c0237s;
                                                            j16 = j17;
                                                            timeSecondsToUs = 0;
                                                            serverControl2 = serverControl;
                                                            optionalBooleanAttribute = z15;
                                                            arrayList4 = arrayList6;
                                                            optionalStringAttr = str2;
                                                            str3 = optionalStringAttr;
                                                            treeMap2 = treeMap;
                                                            j19 = -1;
                                                        }
                                                    }
                                                    j20 = -1;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                } else if (part == null && TYPE_PART.equals(parseStringAttr(next, REGEX_PRELOAD_HINT_TYPE, map))) {
                                                    String stringAttr7 = parseStringAttr(next, REGEX_URI, map);
                                                    long optionalLongAttr = parseOptionalLongAttr(next, REGEX_BYTERANGE_START, -1L);
                                                    long optionalLongAttr2 = parseOptionalLongAttr(next, REGEX_BYTERANGE_LENGTH, -1L);
                                                    long j30 = longAttr;
                                                    String segmentEncryptionIV3 = getSegmentEncryptionIV(j30, str7, str6);
                                                    if (c0237s2 == null && !treeMap.isEmpty()) {
                                                        C0234r[] c0234rArr3 = (C0234r[]) treeMap.values().toArray(new C0234r[0]);
                                                        c0237s2 = new C0237s(encryptionScheme, true, c0234rArr3);
                                                        if (playlistProtectionSchemes2 == null) {
                                                            playlistProtectionSchemes2 = getPlaylistProtectionSchemes(encryptionScheme, c0234rArr3);
                                                        }
                                                    }
                                                    C0237s c0237s4 = c0237s2;
                                                    if (optionalLongAttr == -1 || optionalLongAttr2 != -1) {
                                                        part = new HlsMediaPlaylist.Part(stringAttr7, segment3, 0L, i9, j17, c0237s4, str7, segmentEncryptionIV3, optionalLongAttr != -1 ? optionalLongAttr : 0L, optionalLongAttr2, false, false, true);
                                                    }
                                                    hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                                    hlsMediaPlaylist2 = hlsMediaPlaylist;
                                                    stringAttr = str7;
                                                    str4 = str6;
                                                    longAttr = j30;
                                                    c0237s2 = c0237s4;
                                                    serverControl2 = serverControl;
                                                    optionalBooleanAttribute = z15;
                                                    arrayList4 = arrayList6;
                                                    str3 = str2;
                                                    treeMap2 = treeMap;
                                                    j20 = -1;
                                                }
                                            }
                                            j = j16;
                                        }
                                        hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                                        stringAttr = str7;
                                        str4 = str6;
                                    }
                                }
                                serverControl2 = serverControl;
                                optionalBooleanAttribute = z15;
                                arrayList4 = arrayList6;
                                str3 = str2;
                            }
                            segment = segment3;
                            i = i9;
                            j8 = longAttr;
                            j9 = j15;
                            j10 = timeSecondsToUs;
                            hlsMultivariantPlaylist2 = hlsMultivariantPlaylist;
                            segment3 = segment;
                            stringAttr = str7;
                            str4 = str6;
                            longAttr = j8;
                            optionalStringAttr = optionalStringAttr;
                            timeSecondsToUs = j10;
                            j16 = j;
                            j15 = j9;
                            serverControl2 = serverControl;
                            optionalBooleanAttribute = z15;
                            arrayList4 = arrayList6;
                            str3 = str2;
                            treeMap2 = treeMap;
                            j20 = -1;
                            hlsMediaPlaylist2 = hlsMediaPlaylist;
                            i9 = i;
                        }
                        stringAttr = str7;
                        str4 = str6;
                        serverControl2 = serverControl;
                        optionalBooleanAttribute = z15;
                        arrayList4 = arrayList6;
                    }
                }
                serverControl2 = serverControl;
            }
        }
        boolean z16 = optionalBooleanAttribute;
        ArrayList arrayList7 = arrayList4;
        HlsMediaPlaylist.ServerControl serverControl3 = serverControl2;
        HashMap map3 = new HashMap();
        for (int i20 = 0; i20 < arrayList3.size(); i20++) {
            HlsMediaPlaylist.RenditionReport renditionReport = (HlsMediaPlaylist.RenditionReport) arrayList3.get(i20);
            long size = renditionReport.lastMediaSequence;
            if (size == -1) {
                size = (j21 + arrayList.size()) - (arrayList2.isEmpty() ? 1L : 0L);
            }
            int size2 = renditionReport.lastPartIndex;
            if (size2 == -1 && doubleAttr != -9223372036854775807L) {
                size2 = (arrayList2.isEmpty() ? ((HlsMediaPlaylist.Segment) AbstractC1006u.m2194i(arrayList)).parts : arrayList2).size() - 1;
            }
            Uri uri = renditionReport.playlistUri;
            map3.put(uri, new HlsMediaPlaylist.RenditionReport(uri, size, size2));
        }
        if (part != null) {
            arrayList2.add(part);
        }
        return new HlsMediaPlaylist(i4, str, arrayList7, j14, z16, jM2428S, z12, i8, j21, intAttr2, intAttr, doubleAttr, z9, z10, jM2428S != 0, playlistProtectionSchemes2, arrayList, arrayList2, serverControl3, map3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:97:0x030b. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static HlsMultivariantPlaylist parseMultivariantPlaylist(LineIterator lineIterator, String str) throws NumberFormatException, C0247v0 {
        String str2;
        String stringAttr;
        String stringAttr2;
        C0246v c0246v;
        ArrayList arrayList;
        Uri uriM2345C;
        C0241t0 c0241t0;
        ArrayList arrayList2;
        String strM676e;
        ArrayList arrayList3;
        int i;
        String str3;
        ArrayList arrayList4;
        HlsMultivariantPlaylist.Variant variant;
        String strM676e2;
        ArrayList arrayList5;
        ArrayList arrayList6;
        boolean z7;
        String str4;
        int i4;
        int i8;
        ArrayList arrayList7;
        Uri uriM2345C2;
        ArrayList arrayList8;
        String str5 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        ArrayList arrayList14 = new ArrayList();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        boolean z8 = false;
        boolean z9 = false;
        while (lineIterator.hasNext()) {
            String next = lineIterator.next();
            if (next.startsWith(TAG_PREFIX)) {
                arrayList16.add(next);
            }
            boolean zStartsWith = next.startsWith(TAG_I_FRAME_STREAM_INF);
            ArrayList arrayList17 = arrayList13;
            if (next.startsWith(TAG_DEFINE)) {
                map2.put(parseStringAttr(next, REGEX_NAME, map2), parseStringAttr(next, REGEX_VALUE, map2));
            } else {
                if (next.equals(TAG_INDEPENDENT_SEGMENTS)) {
                    arrayList7 = arrayList12;
                    arrayList5 = arrayList16;
                    arrayList6 = arrayList15;
                    z9 = true;
                } else if (next.startsWith(TAG_MEDIA)) {
                    arrayList14.add(next);
                } else if (next.startsWith(TAG_SESSION_KEY)) {
                    C0234r drmSchemeData = parseDrmSchemeData(next, parseOptionalStringAttr(next, REGEX_KEYFORMAT, KEYFORMAT_IDENTITY, map2), map2);
                    if (drmSchemeData != null) {
                        arrayList15.add(new C0237s(parseEncryptionScheme(parseStringAttr(next, REGEX_METHOD, map2)), true, drmSchemeData));
                    }
                } else if (next.startsWith(TAG_STREAM_INF) || zStartsWith) {
                    boolean zContains = z8 | next.contains(ATTR_CLOSED_CAPTIONS_NONE);
                    int i9 = zStartsWith ? 16384 : 0;
                    arrayList5 = arrayList16;
                    int intAttr = parseIntAttr(next, REGEX_BANDWIDTH);
                    int optionalIntAttr = parseOptionalIntAttr(next, REGEX_AVERAGE_BANDWIDTH, -1);
                    String optionalStringAttr = parseOptionalStringAttr(next, REGEX_CODECS, map2);
                    arrayList6 = arrayList15;
                    String optionalStringAttr2 = parseOptionalStringAttr(next, REGEX_RESOLUTION, map2);
                    if (optionalStringAttr2 != null) {
                        int i10 = AbstractC1118i0.f4750a;
                        z7 = z9;
                        str4 = "application/x-mpegURL";
                        i4 = -1;
                        String[] strArrSplit = optionalStringAttr2.split("x", -1);
                        int i11 = Integer.parseInt(strArrSplit[0]);
                        i8 = Integer.parseInt(strArrSplit[1]);
                        if (i11 > 0 && i8 > 0) {
                            i4 = i11;
                        }
                        String optionalStringAttr3 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map2);
                        float f8 = optionalStringAttr3 == null ? Float.parseFloat(optionalStringAttr3) : -1.0f;
                        arrayList7 = arrayList12;
                        String optionalStringAttr4 = parseOptionalStringAttr(next, REGEX_VIDEO, map2);
                        String optionalStringAttr5 = parseOptionalStringAttr(next, REGEX_AUDIO, map2);
                        String optionalStringAttr6 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map2);
                        String optionalStringAttr7 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map2);
                        if (!zStartsWith) {
                            uriM2345C2 = AbstractC1101a.m2345C(str5, parseStringAttr(next, REGEX_URI, map2));
                        } else {
                            if (!lineIterator.hasNext()) {
                                throw C0247v0.createForMalformedManifest("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriM2345C2 = AbstractC1101a.m2345C(str5, replaceVariableReferences(lineIterator.next(), map2));
                        }
                        Uri uri = uriM2345C2;
                        C0246v c0246v2 = new C0246v();
                        c0246v2.f1435a = Integer.toString(arrayList9.size());
                        c0246v2.f1446l = AbstractC0244u0.m687p(str4);
                        c0246v2.f1444j = optionalStringAttr;
                        c0246v2.f1442h = optionalIntAttr;
                        c0246v2.f1443i = intAttr;
                        c0246v2.f1454t = i4;
                        c0246v2.f1455u = i8;
                        c0246v2.f1456v = f8;
                        c0246v2.f1440f = i9;
                        arrayList9.add(new HlsMultivariantPlaylist.Variant(uri, new C0249w(c0246v2), optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                        arrayList8 = (ArrayList) map.get(uri);
                        if (arrayList8 == null) {
                            arrayList8 = new ArrayList();
                            map.put(uri, arrayList8);
                        }
                        arrayList8.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr4, optionalStringAttr5, optionalStringAttr6, optionalStringAttr7));
                        z8 = zContains;
                        z9 = z7;
                    } else {
                        z7 = z9;
                        str4 = "application/x-mpegURL";
                        i4 = -1;
                    }
                    i8 = i4;
                    String optionalStringAttr32 = parseOptionalStringAttr(next, REGEX_FRAME_RATE, map2);
                    if (optionalStringAttr32 == null) {
                    }
                    arrayList7 = arrayList12;
                    String optionalStringAttr42 = parseOptionalStringAttr(next, REGEX_VIDEO, map2);
                    String optionalStringAttr52 = parseOptionalStringAttr(next, REGEX_AUDIO, map2);
                    String optionalStringAttr62 = parseOptionalStringAttr(next, REGEX_SUBTITLES, map2);
                    String optionalStringAttr72 = parseOptionalStringAttr(next, REGEX_CLOSED_CAPTIONS, map2);
                    if (!zStartsWith) {
                    }
                    Uri uri2 = uriM2345C2;
                    C0246v c0246v22 = new C0246v();
                    c0246v22.f1435a = Integer.toString(arrayList9.size());
                    c0246v22.f1446l = AbstractC0244u0.m687p(str4);
                    c0246v22.f1444j = optionalStringAttr;
                    c0246v22.f1442h = optionalIntAttr;
                    c0246v22.f1443i = intAttr;
                    c0246v22.f1454t = i4;
                    c0246v22.f1455u = i8;
                    c0246v22.f1456v = f8;
                    c0246v22.f1440f = i9;
                    arrayList9.add(new HlsMultivariantPlaylist.Variant(uri2, new C0249w(c0246v22), optionalStringAttr42, optionalStringAttr52, optionalStringAttr62, optionalStringAttr72));
                    arrayList8 = (ArrayList) map.get(uri2);
                    if (arrayList8 == null) {
                    }
                    arrayList8.add(new HlsTrackMetadataEntry.VariantInfo(optionalIntAttr, intAttr, optionalStringAttr42, optionalStringAttr52, optionalStringAttr62, optionalStringAttr72));
                    z8 = zContains;
                    z9 = z7;
                }
                arrayList12 = arrayList7;
                arrayList13 = arrayList17;
                arrayList16 = arrayList5;
                arrayList15 = arrayList6;
            }
            arrayList7 = arrayList12;
            arrayList5 = arrayList16;
            arrayList6 = arrayList15;
            arrayList12 = arrayList7;
            arrayList13 = arrayList17;
            arrayList16 = arrayList5;
            arrayList15 = arrayList6;
        }
        ArrayList arrayList18 = arrayList12;
        ArrayList arrayList19 = arrayList13;
        ArrayList arrayList20 = arrayList16;
        boolean z10 = z8;
        ArrayList arrayList21 = arrayList15;
        boolean z11 = z9;
        ArrayList arrayList22 = new ArrayList();
        HashSet hashSet = new HashSet();
        for (int i12 = 0; i12 < arrayList9.size(); i12++) {
            HlsMultivariantPlaylist.Variant variant2 = (HlsMultivariantPlaylist.Variant) arrayList9.get(i12);
            if (hashSet.add(variant2.url)) {
                AbstractC1101a.m2359j(variant2.format.f1520l == null);
                ArrayList arrayList23 = (ArrayList) map.get(variant2.url);
                arrayList23.getClass();
                C0241t0 c0241t02 = new C0241t0(new HlsTrackMetadataEntry(null, null, arrayList23));
                C0246v c0246vM692a = variant2.format.m692a();
                c0246vM692a.f1445k = c0241t02;
                arrayList22.add(variant2.copyWithFormat(new C0249w(c0246vM692a)));
            }
        }
        int i13 = 0;
        ArrayList arrayList24 = null;
        C0249w c0249w = null;
        while (i13 < arrayList14.size()) {
            str2 = (String) arrayList14.get(i13);
            stringAttr = parseStringAttr(str2, REGEX_GROUP_ID, map2);
            stringAttr2 = parseStringAttr(str2, REGEX_NAME, map2);
            c0246v = new C0246v();
            StringBuilder sb = new StringBuilder();
            sb.append(stringAttr);
            arrayList = arrayList24;
            sb.append(":");
            sb.append(stringAttr2);
            c0246v.f1435a = sb.toString();
            c0246v.f1436b = stringAttr2;
            c0246v.f1446l = AbstractC0244u0.m687p("application/x-mpegURL");
            c0246v.f1439e = parseSelectionFlags(str2);
            c0246v.f1440f = parseRoleFlags(str2, map2);
            c0246v.f1438d = parseOptionalStringAttr(str2, REGEX_LANGUAGE, map2);
            String optionalStringAttr8 = parseOptionalStringAttr(str2, REGEX_URI, map2);
            uriM2345C = optionalStringAttr8 == null ? null : AbstractC1101a.m2345C(str5, optionalStringAttr8);
            ArrayList arrayList25 = arrayList14;
            c0241t0 = new C0241t0(new HlsTrackMetadataEntry(stringAttr, stringAttr2, Collections.EMPTY_LIST));
            String stringAttr3 = parseStringAttr(str2, REGEX_TYPE, map2);
            stringAttr3.getClass();
            switch (stringAttr3) {
                case "SUBTITLES":
                    arrayList2 = arrayList10;
                    HlsMultivariantPlaylist.Variant variantWithSubtitleGroup = getVariantWithSubtitleGroup(arrayList9, stringAttr);
                    if (variantWithSubtitleGroup != null) {
                        String strM2464w = AbstractC1118i0.m2464w(3, variantWithSubtitleGroup.format.f1519k);
                        c0246v.f1444j = strM2464w;
                        strM676e = AbstractC0244u0.m676e(strM2464w);
                    } else {
                        strM676e = null;
                    }
                    if (strM676e == null) {
                        strM676e = "text/vtt";
                    }
                    c0246v.f1447m = AbstractC0244u0.m687p(strM676e);
                    c0246v.f1445k = c0241t0;
                    if (uriM2345C != null) {
                        HlsMultivariantPlaylist.Rendition rendition = new HlsMultivariantPlaylist.Rendition(uriM2345C, new C0249w(c0246v), stringAttr, stringAttr2);
                        arrayList3 = arrayList18;
                        arrayList3.add(rendition);
                    } else {
                        arrayList3 = arrayList18;
                        AbstractC1101a.m2348F(LOG_TAG, "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                    }
                    arrayList4 = arrayList;
                    break;
                case "CLOSED-CAPTIONS":
                    arrayList2 = arrayList10;
                    String stringAttr4 = parseStringAttr(str2, REGEX_INSTREAM_ID, map2);
                    if (stringAttr4.startsWith("CC")) {
                        i = Integer.parseInt(stringAttr4.substring(2));
                        str3 = "application/cea-608";
                    } else {
                        i = Integer.parseInt(stringAttr4.substring(7));
                        str3 = "application/cea-708";
                    }
                    arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                    c0246v.f1447m = AbstractC0244u0.m687p(str3);
                    c0246v.f1430G = i;
                    arrayList4.add(new C0249w(c0246v));
                    arrayList3 = arrayList18;
                    break;
                case "AUDIO":
                    HlsMultivariantPlaylist.Variant variantWithAudioGroup = getVariantWithAudioGroup(arrayList9, stringAttr);
                    if (variantWithAudioGroup != null) {
                        variant = variantWithAudioGroup;
                        String strM2464w2 = AbstractC1118i0.m2464w(1, variantWithAudioGroup.format.f1519k);
                        c0246v.f1444j = strM2464w2;
                        strM676e2 = AbstractC0244u0.m676e(strM2464w2);
                    } else {
                        variant = variantWithAudioGroup;
                        strM676e2 = null;
                    }
                    String optionalStringAttr9 = parseOptionalStringAttr(str2, REGEX_CHANNELS, map2);
                    if (optionalStringAttr9 != null) {
                        int i14 = AbstractC1118i0.f4750a;
                        arrayList2 = arrayList10;
                        c0246v.f1425B = Integer.parseInt(optionalStringAttr9.split("/", 2)[0]);
                        if ("audio/eac3".equals(strM676e2) && optionalStringAttr9.endsWith("/JOC")) {
                            c0246v.f1444j = "ec+3";
                            strM676e2 = "audio/eac3-joc";
                        }
                    } else {
                        arrayList2 = arrayList10;
                    }
                    c0246v.f1447m = AbstractC0244u0.m687p(strM676e2);
                    if (uriM2345C != null) {
                        c0246v.f1445k = c0241t0;
                        arrayList11.add(new HlsMultivariantPlaylist.Rendition(uriM2345C, new C0249w(c0246v), stringAttr, stringAttr2));
                    } else if (variant != null) {
                        arrayList4 = arrayList;
                        c0249w = new C0249w(c0246v);
                        arrayList3 = arrayList18;
                        break;
                    }
                    arrayList3 = arrayList18;
                    arrayList4 = arrayList;
                    break;
                case "VIDEO":
                    HlsMultivariantPlaylist.Variant variantWithVideoGroup = getVariantWithVideoGroup(arrayList9, stringAttr);
                    if (variantWithVideoGroup != null) {
                        C0249w c0249w2 = variantWithVideoGroup.format;
                        String strM2464w3 = AbstractC1118i0.m2464w(2, c0249w2.f1519k);
                        c0246v.f1444j = strM2464w3;
                        c0246v.f1447m = AbstractC0244u0.m687p(AbstractC0244u0.m676e(strM2464w3));
                        c0246v.f1454t = c0249w2.f1529u;
                        c0246v.f1455u = c0249w2.f1530v;
                        c0246v.f1456v = c0249w2.f1531w;
                    }
                    if (uriM2345C != null) {
                        c0246v.f1445k = c0241t0;
                        arrayList10.add(new HlsMultivariantPlaylist.Rendition(uriM2345C, new C0249w(c0246v), stringAttr, stringAttr2));
                    }
                default:
                    arrayList2 = arrayList10;
                    arrayList3 = arrayList18;
                    arrayList4 = arrayList;
                    break;
            }
            i13++;
            str5 = str;
            arrayList18 = arrayList3;
            arrayList24 = arrayList4;
            arrayList14 = arrayList25;
            arrayList10 = arrayList2;
        }
        return new HlsMultivariantPlaylist(str, arrayList20, arrayList22, arrayList10, arrayList11, arrayList18, arrayList19, c0249w, z10 ? Collections.EMPTY_LIST : arrayList24, z11, map2, arrayList21);
    }

    private static boolean parseOptionalBooleanAttribute(String str, Pattern pattern, boolean z7) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? BOOLEAN_TRUE.equals(matcher.group(1)) : z7;
    }

    private static double parseOptionalDoubleAttr(String str, Pattern pattern, double d8) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return d8;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Double.parseDouble(strGroup);
    }

    private static int parseOptionalIntAttr(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return i;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Integer.parseInt(strGroup);
    }

    private static long parseOptionalLongAttr(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find()) {
            return j;
        }
        String strGroup = matcher.group(1);
        strGroup.getClass();
        return Long.parseLong(strGroup);
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, Map<String, String> map) {
        return parseOptionalStringAttr(str, pattern, null, map);
    }

    private static int parseRoleFlags(String str, Map<String, String> map) {
        String optionalStringAttr = parseOptionalStringAttr(str, REGEX_CHARACTERISTICS, map);
        if (TextUtils.isEmpty(optionalStringAttr)) {
            return 0;
        }
        int i = AbstractC1118i0.f4750a;
        String[] strArrSplit = optionalStringAttr.split(",", -1);
        int i4 = AbstractC1118i0.m2453l(strArrSplit, "public.accessibility.describes-video") ? 512 : 0;
        if (AbstractC1118i0.m2453l(strArrSplit, "public.accessibility.transcribes-spoken-dialog")) {
            i4 |= DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
        }
        if (AbstractC1118i0.m2453l(strArrSplit, "public.accessibility.describes-music-and-sound")) {
            i4 |= 1024;
        }
        return AbstractC1118i0.m2453l(strArrSplit, "public.easy-to-read") ? i4 | DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED : i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int parseSelectionFlags(String str) {
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_DEFAULT, false);
        ?? r02 = optionalBooleanAttribute;
        if (parseOptionalBooleanAttribute(str, REGEX_FORCED, false)) {
            r02 = (optionalBooleanAttribute ? 1 : 0) | 2;
        }
        return parseOptionalBooleanAttribute(str, REGEX_AUTOSELECT, false) ? r02 | 4 : r02;
    }

    private static HlsMediaPlaylist.ServerControl parseServerControl(String str) {
        double optionalDoubleAttr = parseOptionalDoubleAttr(str, REGEX_CAN_SKIP_UNTIL, -9.223372036854776E18d);
        long j = optionalDoubleAttr == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr * 1000000.0d);
        boolean optionalBooleanAttribute = parseOptionalBooleanAttribute(str, REGEX_CAN_SKIP_DATE_RANGES, false);
        double optionalDoubleAttr2 = parseOptionalDoubleAttr(str, REGEX_HOLD_BACK, -9.223372036854776E18d);
        long j8 = optionalDoubleAttr2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (optionalDoubleAttr2 * 1000000.0d);
        double optionalDoubleAttr3 = parseOptionalDoubleAttr(str, REGEX_PART_HOLD_BACK, -9.223372036854776E18d);
        return new HlsMediaPlaylist.ServerControl(j, optionalBooleanAttribute, j8, optionalDoubleAttr3 != -9.223372036854776E18d ? (long) (optionalDoubleAttr3 * 1000000.0d) : -9223372036854775807L, parseOptionalBooleanAttribute(str, REGEX_CAN_BLOCK_RELOAD, false));
    }

    private static String parseStringAttr(String str, Pattern pattern, Map<String, String> map) throws C0247v0 {
        String optionalStringAttr = parseOptionalStringAttr(str, pattern, map);
        if (optionalStringAttr != null) {
            return optionalStringAttr;
        }
        throw C0247v0.createForMalformedManifest("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long parseTimeSecondsToUs(String str, Pattern pattern) {
        return new BigDecimal(parseStringAttr(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String replaceVariableReferences(String str, Map<String, String> map) {
        Matcher matcher = REGEX_VARIABLE_REFERENCE.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int skipIgnorableWhitespace(BufferedReader bufferedReader, boolean z7, int i) throws IOException {
        while (i != -1 && Character.isWhitespace(i) && (z7 || !AbstractC1118i0.m2425P(i))) {
            i = bufferedReader.read();
        }
        return i;
    }

    public HlsPlaylistParser(HlsMultivariantPlaylist hlsMultivariantPlaylist, HlsMediaPlaylist hlsMediaPlaylist) {
        this.multivariantPlaylist = hlsMultivariantPlaylist;
        this.previousMediaPlaylist = hlsMediaPlaylist;
    }

    private static String parseOptionalStringAttr(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : replaceVariableReferences(str2, map);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public HlsPlaylist parse(Uri uri, InputStream inputStream) throws C0247v0 {
        String strTrim;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!checkPlaylistHeader(bufferedReader)) {
                throw C0247v0.createForMalformedManifest("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    AbstractC1118i0.m2448g(bufferedReader);
                    throw C0247v0.createForMalformedManifest("Failed to parse the playlist, could not identify any tags.", null);
                }
                strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (!strTrim.startsWith(TAG_STREAM_INF)) {
                        if (strTrim.startsWith(TAG_TARGET_DURATION) || strTrim.startsWith(TAG_MEDIA_SEQUENCE) || strTrim.startsWith(TAG_MEDIA_DURATION) || strTrim.startsWith(TAG_KEY) || strTrim.startsWith(TAG_BYTERANGE) || strTrim.equals(TAG_DISCONTINUITY) || strTrim.equals(TAG_DISCONTINUITY_SEQUENCE) || strTrim.equals(TAG_ENDLIST)) {
                            break;
                        }
                        arrayDeque.add(strTrim);
                    } else {
                        arrayDeque.add(strTrim);
                        return parseMultivariantPlaylist(new LineIterator(arrayDeque, bufferedReader), uri.toString());
                    }
                }
            }
            arrayDeque.add(strTrim);
            return parseMediaPlaylist(this.multivariantPlaylist, this.previousMediaPlaylist, new LineIterator(arrayDeque, bufferedReader), uri.toString());
        } finally {
            AbstractC1118i0.m2448g(bufferedReader);
        }
    }
}
