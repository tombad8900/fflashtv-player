package androidx.media3.exoplayer.dash.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import android.util.Xml;
import androidx.media3.common.AbstractC0213k;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0234r;
import androidx.media3.common.C0237s;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import androidx.media3.common.C0258z;
import androidx.media3.exoplayer.dash.manifest.SegmentBase;
import androidx.media3.exoplayer.upstream.ParsingLoadable;
import com.bumptech.glide.AbstractC0714c;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;
import p005a4.C0094o;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p064h2.AbstractC1151p;
import p208y1.C2793a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class DashManifestParser extends DefaultHandler implements ParsingLoadable.Parser<DashManifest> {
    private static final String TAG = "MpdParser";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern FRAME_RATE_PATTERN = Pattern.compile("(\\d+)(?:/(\\d+))?");
    private static final Pattern CEA_608_ACCESSIBILITY_PATTERN = Pattern.compile("CC([1-4])=.*");
    private static final Pattern CEA_708_ACCESSIBILITY_PATTERN = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");
    private static final int[] MPEG_CHANNEL_CONFIGURATION_MAPPING = {-1, 1, 2, 3, 4, 5, 6, 8, 2, 3, 4, 7, 8, 24, 8, 12, 10, 12, 14, 12, 14};

    /* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
    public static final class RepresentationInfo {
        public final AbstractC0983m0 baseUrls;
        public final ArrayList<C0234r> drmSchemeDatas;
        public final String drmSchemeType;
        public final List<Descriptor> essentialProperties;
        public final C0249w format;
        public final ArrayList<Descriptor> inbandEventStreams;
        public final long revisionId;
        public final SegmentBase segmentBase;
        public final List<Descriptor> supplementalProperties;

        public RepresentationInfo(C0249w c0249w, List<BaseUrl> list, SegmentBase segmentBase, String str, ArrayList<C0234r> arrayList, ArrayList<Descriptor> arrayList2, List<Descriptor> list2, List<Descriptor> list3, long j) {
            this.format = c0249w;
            this.baseUrls = AbstractC0983m0.m2165j(list);
            this.segmentBase = segmentBase;
            this.drmSchemeType = str;
            this.drmSchemeDatas = arrayList;
            this.inbandEventStreams = arrayList2;
            this.essentialProperties = list2;
            this.supplementalProperties = list3;
            this.revisionId = j;
        }
    }

    public DashManifestParser() {
        try {
            this.xmlParserFactory = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    private long addSegmentTimelineElementsToList(List<SegmentBase.SegmentTimelineElement> list, long j, long j8, int i, long j9) {
        int i4;
        if (i >= 0) {
            i4 = i + 1;
        } else {
            int i8 = AbstractC1118i0.f4750a;
            i4 = (int) ((((j9 - j) + j8) - 1) / j8);
        }
        for (int i9 = 0; i9 < i4; i9++) {
            list.add(buildSegmentTimelineElement(j, j8));
            j += j8;
        }
        return j;
    }

    private static int checkContentTypeConsistency(int i, int i4) {
        if (i == -1) {
            return i4;
        }
        if (i4 == -1) {
            return i;
        }
        AbstractC1101a.m2359j(i == i4);
        return i;
    }

    private static String checkLanguageConsistency(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        AbstractC1101a.m2359j(str.equals(str2));
        return str;
    }

    private static void fillInClearKeyInformation(ArrayList<C0234r> arrayList) {
        String str;
        int i = 0;
        while (true) {
            if (i >= arrayList.size()) {
                str = null;
                break;
            }
            C0234r c0234r = arrayList.get(i);
            if (AbstractC0213k.f1164c.equals(c0234r.f1325k) && (str = c0234r.f1326l) != null) {
                arrayList.remove(i);
                break;
            }
            i++;
        }
        if (str == null) {
            return;
        }
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C0234r c0234r2 = arrayList.get(i4);
            if (AbstractC0213k.f1163b.equals(c0234r2.f1325k) && c0234r2.f1326l == null) {
                arrayList.set(i4, new C0234r(AbstractC0213k.f1164c, str, c0234r2.f1327m, c0234r2.f1328n));
            }
        }
    }

    private static void filterRedundantIncompleteSchemeDatas(ArrayList<C0234r> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0234r c0234r = arrayList.get(size);
            if (c0234r.f1328n == null) {
                int i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        C0234r c0234r2 = arrayList.get(i);
                        if (c0234r2.f1328n != null && c0234r.f1328n == null && c0234r2.m665a(c0234r.f1325k)) {
                            arrayList.remove(size);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    private static long getFinalAvailabilityTimeOffset(long j, long j8) {
        if (j8 != -9223372036854775807L) {
            j = j8;
        }
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    private static String getSampleMimeType(String str, String str2) {
        if (AbstractC0244u0.m682k(str)) {
            return AbstractC0244u0.m673b(str2);
        }
        if (AbstractC0244u0.m686o(str)) {
            return AbstractC0244u0.m681j(str2);
        }
        if (AbstractC0244u0.m685n(str) || AbstractC0244u0.m683l(str)) {
            return str;
        }
        if (!"application/mp4".equals(str)) {
            return null;
        }
        String strM676e = AbstractC0244u0.m676e(str2);
        return "text/vtt".equals(strM676e) ? "application/x-mp4-vtt" : strM676e;
    }

    private boolean isDvbProfileDeclared(String[] strArr) {
        for (String str : strArr) {
            if (str.startsWith("urn:dvb:dash:profile:dvb-dash:")) {
                return true;
            }
        }
        return false;
    }

    public static void maybeSkipTag(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (xmlPullParser.getEventType() == 2) {
                    i++;
                } else if (xmlPullParser.getEventType() == 3) {
                    i--;
                }
            }
        }
    }

    public static int parseCea608AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-608:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_608_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC1101a.m2348F(TAG, "Unable to parse CEA-608 channel number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static int parseCea708AccessibilityChannel(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ("urn:scte:dash:cc:cea-708:2015".equals(descriptor.schemeIdUri) && (str = descriptor.value) != null) {
                Matcher matcher = CEA_708_ACCESSIBILITY_PATTERN.matcher(str);
                if (matcher.matches()) {
                    return Integer.parseInt(matcher.group(1));
                }
                AbstractC1101a.m2348F(TAG, "Unable to parse CEA-708 service block number from: " + descriptor.value);
            }
        }
        return -1;
    }

    public static long parseDateTime(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : AbstractC1118i0.m2431V(attributeValue);
    }

    public static Descriptor parseDescriptor(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String string = parseString(xmlPullParser, "schemeIdUri", C2181z.FRAGMENT_ENCODE_SET);
        String string2 = parseString(xmlPullParser, "value", null);
        String string3 = parseString(xmlPullParser, "id", null);
        do {
            xmlPullParser.next();
        } while (!AbstractC1101a.m2372w(xmlPullParser, str));
        return new Descriptor(string, string2, string3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int parseDolbyChannelConfiguration(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null) {
            return -1;
        }
        String strM1517e0 = AbstractC0714c.m1517e0(attributeValue);
        strM1517e0.getClass();
        switch (strM1517e0) {
        }
        return -1;
    }

    public static int parseDtsChannelConfiguration(XmlPullParser xmlPullParser) {
        int i = parseInt(xmlPullParser, "value", -1);
        if (i <= 0 || i >= 33) {
            return -1;
        }
        return i;
    }

    public static int parseDtsxChannelConfiguration(XmlPullParser xmlPullParser) {
        int iBitCount;
        String attributeValue = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue == null || (iBitCount = Integer.bitCount(Integer.parseInt(attributeValue, 16))) == 0) {
            return -1;
        }
        return iBitCount;
    }

    public static long parseDuration(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = AbstractC1118i0.f4758i.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(matcher.group(1));
        String strGroup = matcher.group(3);
        double d8 = strGroup != null ? Double.parseDouble(strGroup) * 3.1556908E7d : 0.0d;
        String strGroup2 = matcher.group(5);
        double d9 = d8 + (strGroup2 != null ? Double.parseDouble(strGroup2) * 2629739.0d : 0.0d);
        String strGroup3 = matcher.group(7);
        double d10 = d9 + (strGroup3 != null ? Double.parseDouble(strGroup3) * 86400.0d : 0.0d);
        String strGroup4 = matcher.group(10);
        double d11 = d10 + (strGroup4 != null ? Double.parseDouble(strGroup4) * 3600.0d : 0.0d);
        String strGroup5 = matcher.group(12);
        double d12 = d11 + (strGroup5 != null ? Double.parseDouble(strGroup5) * 60.0d : 0.0d);
        String strGroup6 = matcher.group(14);
        long j8 = (long) ((d12 + (strGroup6 != null ? Double.parseDouble(strGroup6) : 0.0d)) * 1000.0d);
        return !zIsEmpty ? -j8 : j8;
    }

    public static String parseEac3SupplementalProperties(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            String str = descriptor.schemeIdUri;
            if ("tag:dolby.com,2018:dash:EC3_ExtensionType:2018".equals(str) && "JOC".equals(descriptor.value)) {
                return "audio/eac3-joc";
            }
            if ("tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014".equals(str) && "ec+3".equals(descriptor.value)) {
                return "audio/eac3-joc";
            }
        }
        return "audio/eac3";
    }

    public static float parseFloat(XmlPullParser xmlPullParser, String str, float f8) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? f8 : Float.parseFloat(attributeValue);
    }

    public static float parseFrameRate(XmlPullParser xmlPullParser, float f8) throws NumberFormatException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue != null) {
            Matcher matcher = FRAME_RATE_PATTERN.matcher(attributeValue);
            if (matcher.matches()) {
                int i = Integer.parseInt(matcher.group(1));
                return !TextUtils.isEmpty(matcher.group(2)) ? i / Integer.parseInt(r2) : i;
            }
        }
        return f8;
    }

    public static int parseInt(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long parseLastSegmentNumberSupplementalProperty(List<Descriptor> list) {
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (AbstractC0714c.m1493F("http://dashif.org/guidelines/last-segment-number", descriptor.schemeIdUri)) {
                return Long.parseLong(descriptor.value);
            }
        }
        return -1L;
    }

    public static long parseLong(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    public static int parseMpegChannelConfiguration(XmlPullParser xmlPullParser) {
        int i = parseInt(xmlPullParser, "value", -1);
        if (i >= 0) {
            int[] iArr = MPEG_CHANNEL_CONFIGURATION_MAPPING;
            if (i < iArr.length) {
                return iArr[i];
            }
        }
        return -1;
    }

    public static String parseString(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? str2 : attributeValue;
    }

    public static String parseText(XmlPullParser xmlPullParser, String str) throws XmlPullParserException, IOException {
        String text = C2181z.FRAGMENT_ENCODE_SET;
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                text = xmlPullParser.getText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!AbstractC1101a.m2372w(xmlPullParser, str));
        return text;
    }

    public AdaptationSet buildAdaptationSet(long j, int i, List<Representation> list, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        return new AdaptationSet(j, i, list, list2, list3, list4);
    }

    public C2793a buildEvent(String str, String str2, long j, long j8, byte[] bArr) {
        return new C2793a(str, str2, j8, j, bArr);
    }

    public EventStream buildEventStream(String str, String str2, long j, long[] jArr, C2793a[] c2793aArr) {
        return new EventStream(str, str2, j, jArr, c2793aArr);
    }

    public C0249w buildFormat(String str, String str2, int i, int i4, float f8, int i8, int i9, int i10, String str3, List<Descriptor> list, List<Descriptor> list2, String str4, List<Descriptor> list3, List<Descriptor> list4) {
        String str5 = str4;
        String sampleMimeType = getSampleMimeType(str2, str5);
        if ("audio/eac3".equals(sampleMimeType)) {
            sampleMimeType = parseEac3SupplementalProperties(list4);
            if ("audio/eac3-joc".equals(sampleMimeType)) {
                str5 = "ec+3";
            }
        }
        int selectionFlagsFromRoleDescriptors = parseSelectionFlagsFromRoleDescriptors(list);
        int roleFlagsFromRoleDescriptors = parseRoleFlagsFromRoleDescriptors(list) | parseRoleFlagsFromAccessibilityDescriptors(list2) | parseRoleFlagsFromProperties(list3) | parseRoleFlagsFromProperties(list4);
        Pair<Integer, Integer> tileCountFromProperties = parseTileCountFromProperties(list3);
        C0246v c0246v = new C0246v();
        c0246v.f1435a = str;
        c0246v.f1446l = AbstractC0244u0.m687p(str2);
        c0246v.f1447m = AbstractC0244u0.m687p(sampleMimeType);
        c0246v.f1444j = str5;
        c0246v.f1443i = i10;
        c0246v.f1439e = selectionFlagsFromRoleDescriptors;
        c0246v.f1440f = roleFlagsFromRoleDescriptors;
        c0246v.f1438d = str3;
        int cea708AccessibilityChannel = -1;
        c0246v.f1432I = tileCountFromProperties != null ? ((Integer) tileCountFromProperties.first).intValue() : -1;
        c0246v.f1433J = tileCountFromProperties != null ? ((Integer) tileCountFromProperties.second).intValue() : -1;
        if (AbstractC0244u0.m686o(sampleMimeType)) {
            c0246v.f1454t = i;
            c0246v.f1455u = i4;
            c0246v.f1456v = f8;
        } else if (AbstractC0244u0.m682k(sampleMimeType)) {
            c0246v.f1425B = i8;
            c0246v.f1426C = i9;
        } else if (AbstractC0244u0.m685n(sampleMimeType)) {
            if ("application/cea-608".equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea608AccessibilityChannel(list2);
            } else if ("application/cea-708".equals(sampleMimeType)) {
                cea708AccessibilityChannel = parseCea708AccessibilityChannel(list2);
            }
            c0246v.f1430G = cea708AccessibilityChannel;
        } else if (AbstractC0244u0.m683l(sampleMimeType)) {
            c0246v.f1454t = i;
            c0246v.f1455u = i4;
        }
        return new C0249w(c0246v);
    }

    public DashManifest buildMediaPresentationDescription(long j, long j8, long j9, boolean z7, long j10, long j11, long j12, long j13, ProgramInformation programInformation, UtcTimingElement utcTimingElement, ServiceDescriptionElement serviceDescriptionElement, Uri uri, List<Period> list) {
        return new DashManifest(j, j8, j9, z7, j10, j11, j12, j13, programInformation, utcTimingElement, serviceDescriptionElement, uri, list);
    }

    public Period buildPeriod(String str, long j, List<AdaptationSet> list, List<EventStream> list2, Descriptor descriptor) {
        return new Period(str, j, list, list2, descriptor);
    }

    public RangedUri buildRangedUri(String str, long j, long j8) {
        return new RangedUri(str, j, j8);
    }

    public Representation buildRepresentation(RepresentationInfo representationInfo, String str, List<C0258z> list, String str2, ArrayList<C0234r> arrayList, ArrayList<Descriptor> arrayList2) {
        C0246v c0246vM692a = representationInfo.format.m692a();
        if (str == null || !list.isEmpty()) {
            c0246vM692a.f1437c = AbstractC0983m0.m2165j(list);
        } else {
            c0246vM692a.f1436b = str;
        }
        String str3 = representationInfo.drmSchemeType;
        if (str3 == null) {
            str3 = str2;
        }
        ArrayList<C0234r> arrayList3 = representationInfo.drmSchemeDatas;
        arrayList3.addAll(arrayList);
        if (!arrayList3.isEmpty()) {
            fillInClearKeyInformation(arrayList3);
            filterRedundantIncompleteSchemeDatas(arrayList3);
            c0246vM692a.f1451q = new C0237s(str3, arrayList3);
        }
        ArrayList<Descriptor> arrayList4 = representationInfo.inbandEventStreams;
        arrayList4.addAll(arrayList2);
        return Representation.newInstance(representationInfo.revisionId, new C0249w(c0246vM692a), representationInfo.baseUrls, representationInfo.segmentBase, arrayList4, representationInfo.essentialProperties, representationInfo.supplementalProperties, null);
    }

    public SegmentBase.SegmentList buildSegmentList(RangedUri rangedUri, long j, long j8, long j9, long j10, List<SegmentBase.SegmentTimelineElement> list, long j11, List<RangedUri> list2, long j12, long j13) {
        return new SegmentBase.SegmentList(rangedUri, j, j8, j9, j10, list, j11, list2, AbstractC1118i0.m2428S(j12), AbstractC1118i0.m2428S(j13));
    }

    public SegmentBase.SegmentTemplate buildSegmentTemplate(RangedUri rangedUri, long j, long j8, long j9, long j10, long j11, List<SegmentBase.SegmentTimelineElement> list, long j12, UrlTemplate urlTemplate, UrlTemplate urlTemplate2, long j13, long j14) {
        return new SegmentBase.SegmentTemplate(rangedUri, j, j8, j9, j10, j11, list, j12, urlTemplate, urlTemplate2, AbstractC1118i0.m2428S(j13), AbstractC1118i0.m2428S(j14));
    }

    public SegmentBase.SegmentTimelineElement buildSegmentTimelineElement(long j, long j8) {
        return new SegmentBase.SegmentTimelineElement(j, j8);
    }

    public SegmentBase.SingleSegmentBase buildSingleSegmentBase(RangedUri rangedUri, long j, long j8, long j9, long j10) {
        return new SegmentBase.SingleSegmentBase(rangedUri, j, j8, j9, j10);
    }

    public UtcTimingElement buildUtcTimingElement(String str, String str2) {
        return new UtcTimingElement(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0399 A[LOOP:0: B:3:0x0093->B:74:0x0399, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0349 A[EDGE_INSN: B:75:0x0349->B:68:0x0349 BREAK  A[LOOP:0: B:3:0x0093->B:74:0x0399], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AdaptationSet parseAdaptationSet(XmlPullParser xmlPullParser, List<BaseUrl> list, SegmentBase segmentBase, long j, long j8, long j9, long j10, long j11, boolean z7) throws XmlPullParserException, NumberFormatException, IOException {
        int audioChannelConfiguration;
        ArrayList arrayList;
        int iCheckContentTypeConsistency;
        String str;
        String str2;
        ArrayList arrayList2;
        SegmentBase segmentList;
        ArrayList<Descriptor> arrayList3;
        long j12;
        ArrayList arrayList4;
        ArrayList arrayList5;
        ArrayList arrayList6;
        ArrayList arrayList7;
        long j13;
        List<BaseUrl> list2;
        int i;
        ArrayList<C0234r> arrayList8;
        float f8;
        int i4;
        ArrayList arrayList9;
        ArrayList arrayList10;
        ArrayList<Descriptor> arrayList11;
        ArrayList arrayList12;
        List<BaseUrl> list3;
        ArrayList arrayList13;
        String str3;
        long j14;
        SegmentBase segmentBase2;
        String str4;
        float f9;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        long j15 = parseLong(xmlPullParser2, "id", -1L);
        int contentType = parseContentType(xmlPullParser);
        String attributeValue = xmlPullParser2.getAttributeValue(null, "mimeType");
        String attributeValue2 = xmlPullParser2.getAttributeValue(null, "codecs");
        int i8 = parseInt(xmlPullParser2, "width", -1);
        int i9 = parseInt(xmlPullParser2, "height", -1);
        float frameRate = parseFrameRate(xmlPullParser2, -1.0f);
        int i10 = parseInt(xmlPullParser2, "audioSamplingRate", -1);
        String str5 = "lang";
        String attributeValue3 = xmlPullParser2.getAttributeValue(null, "lang");
        String attributeValue4 = xmlPullParser2.getAttributeValue(null, "label");
        ArrayList arrayList14 = new ArrayList();
        ArrayList<C0234r> arrayList15 = new ArrayList<>();
        ArrayList<Descriptor> arrayList16 = new ArrayList<>();
        ArrayList arrayList17 = arrayList14;
        ArrayList arrayList18 = new ArrayList();
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        ArrayList<Descriptor> arrayList21 = arrayList16;
        ArrayList arrayList22 = new ArrayList();
        long j16 = j9;
        String str6 = attributeValue;
        String str7 = attributeValue2;
        int i11 = i8;
        int i12 = i9;
        float f10 = frameRate;
        String str8 = attributeValue3;
        int iCheckContentTypeConsistency2 = contentType;
        boolean z8 = false;
        int i13 = -1;
        String str9 = null;
        SegmentBase segmentBase3 = segmentBase;
        ArrayList arrayList23 = new ArrayList();
        long availabilityTimeOffsetUs = j8;
        ArrayList arrayList24 = new ArrayList();
        while (true) {
            xmlPullParser2.next();
            float f11 = f10;
            if (AbstractC1101a.m2373x(xmlPullParser2, "BaseURL")) {
                if (!z8) {
                    availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser2, availabilityTimeOffsetUs);
                    z8 = true;
                }
                long j17 = availabilityTimeOffsetUs;
                arrayList24.addAll(dashManifestParser.parseBaseUrl(xmlPullParser2, list, z7));
                list2 = arrayList24;
                str2 = str5;
                arrayList8 = arrayList15;
                arrayList10 = arrayList22;
                segmentList = segmentBase3;
                arrayList11 = arrayList21;
                arrayList9 = arrayList23;
                f8 = f11;
                arrayList4 = arrayList20;
                audioChannelConfiguration = i13;
                i = i10;
                arrayList5 = arrayList19;
                arrayList12 = arrayList17;
                j13 = j17;
            } else {
                long j18 = availabilityTimeOffsetUs;
                if (AbstractC1101a.m2373x(xmlPullParser2, "ContentProtection")) {
                    Pair<String, C0234r> contentProtection = parseContentProtection(xmlPullParser);
                    Object obj = contentProtection.first;
                    if (obj != null) {
                        str9 = (String) obj;
                    }
                    Object obj2 = contentProtection.second;
                    if (obj2 != null) {
                        arrayList15.add((C0234r) obj2);
                    }
                    list2 = arrayList24;
                    arrayList11 = arrayList21;
                    arrayList4 = arrayList20;
                    j13 = j18;
                    str2 = str5;
                    arrayList8 = arrayList15;
                    arrayList10 = arrayList22;
                    segmentList = segmentBase3;
                    arrayList9 = arrayList23;
                } else if (AbstractC1101a.m2373x(xmlPullParser2, "ContentComponent")) {
                    String strCheckLanguageConsistency = checkLanguageConsistency(str8, xmlPullParser2.getAttributeValue(null, str5));
                    iCheckContentTypeConsistency2 = checkContentTypeConsistency(iCheckContentTypeConsistency2, parseContentType(xmlPullParser));
                    list2 = arrayList24;
                    arrayList11 = arrayList21;
                    arrayList4 = arrayList20;
                    j13 = j18;
                    str8 = strCheckLanguageConsistency;
                    str2 = str5;
                    arrayList8 = arrayList15;
                    arrayList10 = arrayList22;
                    segmentList = segmentBase3;
                    arrayList9 = arrayList23;
                } else {
                    if (AbstractC1101a.m2373x(xmlPullParser2, "Role")) {
                        arrayList19.add(parseDescriptor(xmlPullParser2, "Role"));
                    } else {
                        if (AbstractC1101a.m2373x(xmlPullParser2, "AudioChannelConfiguration")) {
                            list2 = arrayList24;
                            arrayList11 = arrayList21;
                            arrayList4 = arrayList20;
                            j13 = j18;
                            str2 = str5;
                            arrayList8 = arrayList15;
                            arrayList10 = arrayList22;
                            arrayList12 = arrayList17;
                            arrayList9 = arrayList23;
                            f8 = f11;
                            audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                            i = i10;
                            arrayList6 = arrayList18;
                            segmentList = segmentBase3;
                            arrayList5 = arrayList19;
                        } else if (AbstractC1101a.m2373x(xmlPullParser2, "Accessibility")) {
                            arrayList18.add(parseDescriptor(xmlPullParser2, "Accessibility"));
                        } else if (AbstractC1101a.m2373x(xmlPullParser2, "EssentialProperty")) {
                            arrayList20.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                        } else if (AbstractC1101a.m2373x(xmlPullParser2, "SupplementalProperty")) {
                            arrayList22.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                        } else {
                            if (AbstractC1101a.m2373x(xmlPullParser2, "Representation")) {
                                int i14 = iCheckContentTypeConsistency2;
                                if (arrayList24.isEmpty()) {
                                    list3 = list;
                                    arrayList13 = arrayList23;
                                    str3 = str7;
                                    j14 = j18;
                                    list2 = arrayList24;
                                    str2 = str5;
                                    arrayList2 = arrayList17;
                                    segmentBase2 = segmentBase3;
                                    str4 = str6;
                                    arrayList3 = arrayList21;
                                    f9 = f11;
                                } else {
                                    arrayList13 = arrayList23;
                                    str3 = str7;
                                    j14 = j18;
                                    list3 = arrayList24;
                                    list2 = list3;
                                    f9 = f11;
                                    str2 = str5;
                                    arrayList2 = arrayList17;
                                    segmentBase2 = segmentBase3;
                                    str4 = str6;
                                    arrayList3 = arrayList21;
                                }
                                String str10 = str8;
                                arrayList8 = arrayList15;
                                int i15 = i11;
                                XmlPullParser xmlPullParser3 = xmlPullParser2;
                                ArrayList arrayList25 = arrayList20;
                                int i16 = i12;
                                RepresentationInfo representation = parseRepresentation(xmlPullParser3, list3, str4, str3, i15, i16, f9, i13, i10, str10, arrayList19, arrayList18, arrayList25, arrayList22, segmentBase2, j10, j, j14, j16, j11, z7);
                                str6 = str4;
                                i11 = i15;
                                i12 = i16;
                                str = str10;
                                arrayList5 = arrayList19;
                                arrayList4 = arrayList25;
                                segmentList = segmentBase2;
                                f8 = f9;
                                arrayList6 = arrayList18;
                                arrayList7 = arrayList22;
                                j13 = j14;
                                str7 = str3;
                                audioChannelConfiguration = i13;
                                i = i10;
                                iCheckContentTypeConsistency = checkContentTypeConsistency(i14, AbstractC0244u0.m680i(representation.format.f1522n));
                                arrayList = arrayList13;
                                arrayList.add(representation);
                                xmlPullParser2 = xmlPullParser3;
                            } else {
                                ArrayList arrayList26 = arrayList23;
                                audioChannelConfiguration = i13;
                                arrayList = arrayList26;
                                iCheckContentTypeConsistency = iCheckContentTypeConsistency2;
                                str = str8;
                                str2 = str5;
                                arrayList2 = arrayList17;
                                segmentList = segmentBase3;
                                arrayList3 = arrayList21;
                                j12 = j16;
                                arrayList4 = arrayList20;
                                arrayList5 = arrayList19;
                                arrayList6 = arrayList18;
                                arrayList7 = arrayList22;
                                j13 = j18;
                                list2 = arrayList24;
                                i = i10;
                                arrayList8 = arrayList15;
                                f8 = f11;
                                XmlPullParser xmlPullParser4 = xmlPullParser2;
                                if (AbstractC1101a.m2373x(xmlPullParser4, "SegmentBase")) {
                                    xmlPullParser2 = xmlPullParser4;
                                    segmentList = parseSegmentBase(xmlPullParser4, (SegmentBase.SingleSegmentBase) segmentList);
                                    j16 = j12;
                                } else if (AbstractC1101a.m2373x(xmlPullParser4, "SegmentList")) {
                                    long availabilityTimeOffsetUs2 = parseAvailabilityTimeOffsetUs(xmlPullParser4, j12);
                                    arrayList9 = arrayList;
                                    xmlPullParser2 = xmlPullParser;
                                    segmentList = parseSegmentList(xmlPullParser2, (SegmentBase.SegmentList) segmentList, j10, j, j13, availabilityTimeOffsetUs2, j11);
                                    arrayList10 = arrayList7;
                                    str8 = str;
                                    iCheckContentTypeConsistency2 = iCheckContentTypeConsistency;
                                    arrayList11 = arrayList3;
                                    j16 = availabilityTimeOffsetUs2;
                                    arrayList12 = arrayList2;
                                } else {
                                    i4 = iCheckContentTypeConsistency;
                                    xmlPullParser2 = xmlPullParser4;
                                    arrayList9 = arrayList;
                                    if (AbstractC1101a.m2373x(xmlPullParser2, "SegmentTemplate")) {
                                        long availabilityTimeOffsetUs3 = parseAvailabilityTimeOffsetUs(xmlPullParser2, j12);
                                        arrayList10 = arrayList7;
                                        SegmentBase segmentTemplate = parseSegmentTemplate(xmlPullParser2, (SegmentBase.SegmentTemplate) segmentList, arrayList10, j10, j, j13, availabilityTimeOffsetUs3, j11);
                                        j13 = j13;
                                        segmentList = segmentTemplate;
                                        str8 = str;
                                        iCheckContentTypeConsistency2 = i4;
                                        arrayList12 = arrayList2;
                                        arrayList11 = arrayList3;
                                        j16 = availabilityTimeOffsetUs3;
                                    } else {
                                        arrayList10 = arrayList7;
                                        if (AbstractC1101a.m2373x(xmlPullParser2, "InbandEventStream")) {
                                            arrayList11 = arrayList3;
                                            arrayList11.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                            arrayList12 = arrayList2;
                                        } else {
                                            arrayList11 = arrayList3;
                                            if (AbstractC1101a.m2373x(xmlPullParser2, "Label")) {
                                                arrayList12 = arrayList2;
                                                arrayList12.add(parseLabel(xmlPullParser));
                                            } else {
                                                arrayList12 = arrayList2;
                                                if (xmlPullParser2.getEventType() == 2) {
                                                    parseAdaptationSetChild(xmlPullParser);
                                                }
                                            }
                                        }
                                        long j19 = j12;
                                        iCheckContentTypeConsistency2 = i4;
                                        j16 = j19;
                                        str8 = str;
                                    }
                                }
                            }
                            arrayList9 = arrayList;
                            arrayList10 = arrayList7;
                            str8 = str;
                            arrayList12 = arrayList2;
                            arrayList11 = arrayList3;
                            iCheckContentTypeConsistency2 = iCheckContentTypeConsistency;
                        }
                        if (AbstractC1101a.m2372w(xmlPullParser2, "AdaptationSet")) {
                            break;
                        }
                        dashManifestParser = this;
                        i10 = i;
                        arrayList18 = arrayList6;
                        arrayList19 = arrayList5;
                        str5 = str2;
                        arrayList22 = arrayList10;
                        segmentBase3 = segmentList;
                        availabilityTimeOffsetUs = j13;
                        arrayList17 = arrayList12;
                        f10 = f8;
                        arrayList20 = arrayList4;
                        i13 = audioChannelConfiguration;
                        arrayList15 = arrayList8;
                        arrayList23 = arrayList9;
                        arrayList21 = arrayList11;
                        arrayList24 = list2;
                    }
                    list2 = arrayList24;
                    arrayList11 = arrayList21;
                    arrayList4 = arrayList20;
                    j13 = j18;
                    str = str8;
                    str2 = str5;
                    arrayList8 = arrayList15;
                    arrayList10 = arrayList22;
                    segmentList = segmentBase3;
                    arrayList9 = arrayList23;
                    f8 = f11;
                    audioChannelConfiguration = i13;
                    i = i10;
                    arrayList5 = arrayList19;
                    arrayList12 = arrayList17;
                    arrayList6 = arrayList18;
                    long j20 = j16;
                    i4 = iCheckContentTypeConsistency2;
                    j12 = j20;
                    long j192 = j12;
                    iCheckContentTypeConsistency2 = i4;
                    j16 = j192;
                    str8 = str;
                    if (AbstractC1101a.m2372w(xmlPullParser2, "AdaptationSet")) {
                    }
                }
                f8 = f11;
                audioChannelConfiguration = i13;
                i = i10;
                arrayList5 = arrayList19;
                arrayList12 = arrayList17;
            }
            arrayList6 = arrayList18;
            if (AbstractC1101a.m2372w(xmlPullParser2, "AdaptationSet")) {
            }
        }
        ArrayList arrayList27 = new ArrayList(arrayList9.size());
        int i17 = 0;
        while (i17 < arrayList9.size()) {
            ArrayList<Descriptor> arrayList28 = arrayList11;
            ArrayList arrayList29 = arrayList12;
            String str11 = attributeValue4;
            arrayList27.add(buildRepresentation((RepresentationInfo) arrayList9.get(i17), str11, arrayList29, str9, arrayList8, arrayList28));
            i17++;
            attributeValue4 = str11;
            arrayList12 = arrayList29;
            arrayList11 = arrayList28;
        }
        return buildAdaptationSet(j15, iCheckContentTypeConsistency2, arrayList27, arrayList6, arrayList4, arrayList10);
    }

    public void parseAdaptationSetChild(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        maybeSkipTag(xmlPullParser);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int parseAudioChannelConfiguration(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int dtsChannelConfiguration;
        String string = parseString(xmlPullParser, "schemeIdUri", null);
        string.getClass();
        dtsChannelConfiguration = -1;
        switch (string) {
            case "urn:dts:dash:audio_channel_configuration:2012":
            case "tag:dts.com,2014:dash:audio_channel_configuration:2012":
                dtsChannelConfiguration = parseDtsChannelConfiguration(xmlPullParser);
                break;
            case "urn:mpeg:dash:23003:3:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseInt(xmlPullParser, "value", -1);
                break;
            case "tag:dolby.com,2014:dash:audio_channel_configuration:2011":
            case "urn:dolby:dash:audio_channel_configuration:2011":
                dtsChannelConfiguration = parseDolbyChannelConfiguration(xmlPullParser);
                break;
            case "urn:mpeg:mpegB:cicp:ChannelConfiguration":
                dtsChannelConfiguration = parseMpegChannelConfiguration(xmlPullParser);
                break;
            case "tag:dts.com,2018:uhd:audio_channel_configuration":
                dtsChannelConfiguration = parseDtsxChannelConfiguration(xmlPullParser);
                break;
        }
        do {
            xmlPullParser.next();
        } while (!AbstractC1101a.m2372w(xmlPullParser, "AudioChannelConfiguration"));
        return dtsChannelConfiguration;
    }

    public long parseAvailabilityTimeOffsetUs(XmlPullParser xmlPullParser, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "availabilityTimeOffset");
        if (attributeValue == null) {
            return j;
        }
        if ("INF".equals(attributeValue)) {
            return Long.MAX_VALUE;
        }
        return (long) (Float.parseFloat(attributeValue) * 1000000.0f);
    }

    public List<BaseUrl> parseBaseUrl(XmlPullParser xmlPullParser, List<BaseUrl> list, boolean z7) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue(null, "dvb:priority");
        int i = attributeValue != null ? Integer.parseInt(attributeValue) : z7 ? 1 : Integer.MIN_VALUE;
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "dvb:weight");
        int i4 = attributeValue2 != null ? Integer.parseInt(attributeValue2) : 1;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "serviceLocation");
        String text = parseText(xmlPullParser, "BaseURL");
        if (text != null && AbstractC1101a.m2370u(text)[0] != -1) {
            if (attributeValue3 == null) {
                attributeValue3 = text;
            }
            return AbstractC1006u.m2199n(new BaseUrl(text, attributeValue3, i, i4));
        }
        ArrayList arrayList = new ArrayList();
        for (int i8 = 0; i8 < list.size(); i8++) {
            BaseUrl baseUrl = list.get(i8);
            String strM2344B = AbstractC1101a.m2344B(baseUrl.url, text);
            String str = attributeValue3 == null ? strM2344B : attributeValue3;
            if (z7) {
                i = baseUrl.priority;
                i4 = baseUrl.weight;
                str = baseUrl.serviceLocation;
            }
            arrayList.add(new BaseUrl(strM2344B, str, i, i4));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0162  */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.UUID] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v4, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Pair<String, C0234r> parseContentProtection(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String attributeValue;
        ?? r72;
        String str;
        String text;
        ?? M2563a;
        String attributeValue2;
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue3 != null) {
            String strM1517e0 = AbstractC0714c.m1517e0(attributeValue3);
            strM1517e0.getClass();
            switch (strM1517e0) {
                case "urn:uuid:e2719d58-a985-b3c9-781a-b030af78d30e":
                    r72 = AbstractC0213k.f1164c;
                    attributeValue = null;
                    str = null;
                    text = str;
                    M2563a = str;
                    break;
                case "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95":
                    r72 = AbstractC0213k.f1166e;
                    attributeValue = null;
                    str = null;
                    text = str;
                    M2563a = str;
                    break;
                case "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed":
                    r72 = AbstractC0213k.f1165d;
                    attributeValue = null;
                    str = null;
                    text = str;
                    M2563a = str;
                    break;
                case "urn:mpeg:dash:mp4protection:2011":
                    attributeValue = xmlPullParser.getAttributeValue(null, "value");
                    int attributeCount = xmlPullParser.getAttributeCount();
                    int i = 0;
                    while (true) {
                        if (i >= attributeCount) {
                            attributeValue2 = null;
                        } else {
                            String attributeName = xmlPullParser.getAttributeName(i);
                            int iIndexOf = attributeName.indexOf(58);
                            if (iIndexOf != -1) {
                                attributeName = attributeName.substring(iIndexOf + 1);
                            }
                            if (attributeName.equals("default_KID")) {
                                attributeValue2 = xmlPullParser.getAttributeValue(i);
                            } else {
                                i++;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(attributeValue2) && !"00000000-0000-0000-0000-000000000000".equals(attributeValue2)) {
                        String[] strArrSplit = attributeValue2.split("\\s+");
                        UUID[] uuidArr = new UUID[strArrSplit.length];
                        for (int i4 = 0; i4 < strArrSplit.length; i4++) {
                            uuidArr[i4] = UUID.fromString(strArrSplit[i4]);
                        }
                        r72 = AbstractC0213k.f1163b;
                        text = null;
                        M2563a = AbstractC1151p.m2563a(r72, uuidArr, null);
                        break;
                    } else {
                        AbstractC1101a.m2348F(TAG, "Ignoring <ContentProtection> with schemeIdUri=\"urn:mpeg:dash:mp4protection:2011\" (ClearKey) due to missing required default_KID attribute.");
                        r72 = null;
                        str = r72;
                        text = str;
                        M2563a = str;
                        break;
                    }
                    break;
                default:
                    attributeValue = null;
                    r72 = null;
                    str = r72;
                    text = str;
                    M2563a = str;
                    break;
            }
        }
        do {
            xmlPullParser.next();
            if ((AbstractC1101a.m2373x(xmlPullParser, "clearkey:Laurl") || AbstractC1101a.m2373x(xmlPullParser, "dashif:Laurl")) && xmlPullParser.next() == 4) {
                text = xmlPullParser.getText();
                M2563a = M2563a;
            } else if (AbstractC1101a.m2373x(xmlPullParser, "ms:laurl")) {
                text = xmlPullParser.getAttributeValue(null, "licenseUrl");
                M2563a = M2563a;
            } else if (M2563a == 0 && xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                int iIndexOf2 = name.indexOf(58);
                if (iIndexOf2 != -1) {
                    name = name.substring(iIndexOf2 + 1);
                }
                if (name.equals("pssh") && xmlPullParser.next() == 4) {
                    byte[] bArrDecode = Base64.decode(xmlPullParser.getText(), 0);
                    C0094o c0094oM2571i = AbstractC1151p.m2571i(bArrDecode);
                    UUID uuid = c0094oM2571i == null ? null : (UUID) c0094oM2571i.f441k;
                    if (uuid == null) {
                        AbstractC1101a.m2348F(TAG, "Skipping malformed cenc:pssh data");
                        r72 = uuid;
                        M2563a = 0;
                    } else {
                        UUID uuid2 = uuid;
                        M2563a = bArrDecode;
                        r72 = uuid2;
                    }
                }
            } else if (M2563a == 0) {
                ?? r10 = AbstractC0213k.f1166e;
                if (r10.equals(r72) && AbstractC1101a.m2373x(xmlPullParser, "mspr:pro") && xmlPullParser.next() == 4) {
                    M2563a = AbstractC1151p.m2563a(r10, null, Base64.decode(xmlPullParser.getText(), 0));
                } else {
                    maybeSkipTag(xmlPullParser);
                    M2563a = M2563a;
                }
            }
        } while (!AbstractC1101a.m2372w(xmlPullParser, "ContentProtection"));
        return Pair.create(attributeValue, r72 != null ? new C0234r(r72, text, "video/mp4", M2563a) : null);
    }

    public int parseContentType(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if ("text".equals(attributeValue)) {
            return 3;
        }
        return "image".equals(attributeValue) ? 4 : -1;
    }

    public Pair<Long, C2793a> parseEvent(XmlPullParser xmlPullParser, String str, String str2, long j, long j8, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        long j9 = parseLong(xmlPullParser, "id", 0L);
        long j10 = parseLong(xmlPullParser, "duration", -9223372036854775807L);
        long j11 = parseLong(xmlPullParser, "presentationTime", 0L);
        int i = AbstractC1118i0.f4750a;
        RoundingMode roundingMode = RoundingMode.DOWN;
        long jM2437a0 = AbstractC1118i0.m2437a0(j10, 1000L, j, roundingMode);
        long jM2437a02 = AbstractC1118i0.m2437a0(j11 - j8, 1000000L, j, roundingMode);
        String string = parseString(xmlPullParser, "messageData", null);
        byte[] eventObject = parseEventObject(xmlPullParser, byteArrayOutputStream);
        Long lValueOf = Long.valueOf(jM2437a02);
        if (string != null) {
            eventObject = string.getBytes(StandardCharsets.UTF_8);
        }
        return Pair.create(lValueOf, buildEvent(str, str2, j9, jM2437a0, eventObject));
    }

    public byte[] parseEventObject(XmlPullParser xmlPullParser, ByteArrayOutputStream byteArrayOutputStream) throws XmlPullParserException, IllegalStateException, IOException, IllegalArgumentException {
        byteArrayOutputStream.reset();
        XmlSerializer xmlSerializerNewSerializer = Xml.newSerializer();
        xmlSerializerNewSerializer.setOutput(byteArrayOutputStream, StandardCharsets.UTF_8.name());
        xmlPullParser.nextToken();
        while (!AbstractC1101a.m2372w(xmlPullParser, "Event")) {
            switch (xmlPullParser.getEventType()) {
                case 0:
                    xmlSerializerNewSerializer.startDocument(null, Boolean.FALSE);
                    break;
                case 1:
                    xmlSerializerNewSerializer.endDocument();
                    break;
                case 2:
                    xmlSerializerNewSerializer.startTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
                        xmlSerializerNewSerializer.attribute(xmlPullParser.getAttributeNamespace(i), xmlPullParser.getAttributeName(i), xmlPullParser.getAttributeValue(i));
                    }
                    break;
                case 3:
                    xmlSerializerNewSerializer.endTag(xmlPullParser.getNamespace(), xmlPullParser.getName());
                    break;
                case 4:
                    xmlSerializerNewSerializer.text(xmlPullParser.getText());
                    break;
                case 5:
                    xmlSerializerNewSerializer.cdsect(xmlPullParser.getText());
                    break;
                case 6:
                    xmlSerializerNewSerializer.entityRef(xmlPullParser.getText());
                    break;
                case 7:
                    xmlSerializerNewSerializer.ignorableWhitespace(xmlPullParser.getText());
                    break;
                case 8:
                    xmlSerializerNewSerializer.processingInstruction(xmlPullParser.getText());
                    break;
                case 9:
                    xmlSerializerNewSerializer.comment(xmlPullParser.getText());
                    break;
                case 10:
                    xmlSerializerNewSerializer.docdecl(xmlPullParser.getText());
                    break;
            }
            xmlPullParser.nextToken();
        }
        xmlSerializerNewSerializer.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public EventStream parseEventStream(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j;
        String str;
        String str2;
        XmlPullParser xmlPullParser2;
        String string = parseString(xmlPullParser, "schemeIdUri", C2181z.FRAGMENT_ENCODE_SET);
        String string2 = parseString(xmlPullParser, "value", C2181z.FRAGMENT_ENCODE_SET);
        long j8 = parseLong(xmlPullParser, "timescale", 1L);
        long j9 = parseLong(xmlPullParser, "presentationTimeOffset", 0L);
        ArrayList arrayList = new ArrayList();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        while (true) {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, "Event")) {
                j = j8;
                str = string2;
                str2 = string;
                xmlPullParser2 = xmlPullParser;
                arrayList.add(parseEvent(xmlPullParser2, str2, str, j, j9, byteArrayOutputStream));
            } else {
                j = j8;
                str = string2;
                str2 = string;
                xmlPullParser2 = xmlPullParser;
                maybeSkipTag(xmlPullParser2);
            }
            if (AbstractC1101a.m2372w(xmlPullParser2, "EventStream")) {
                break;
            }
            xmlPullParser = xmlPullParser2;
            string = str2;
            string2 = str;
            j8 = j;
        }
        long[] jArr = new long[arrayList.size()];
        C2793a[] c2793aArr = new C2793a[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            Pair pair = (Pair) arrayList.get(i);
            jArr[i] = ((Long) pair.first).longValue();
            c2793aArr[i] = (C2793a) pair.second;
        }
        return buildEventStream(str2, str, j, jArr, c2793aArr);
    }

    public RangedUri parseInitialization(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "sourceURL", "range");
    }

    public C0258z parseLabel(XmlPullParser xmlPullParser) {
        return new C0258z(xmlPullParser.getAttributeValue(null, "lang"), parseText(xmlPullParser, "Label"));
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x01dd A[LOOP:0: B:24:0x00a5->B:81:0x01dd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0199 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DashManifest parseMediaPresentationDescription(XmlPullParser xmlPullParser, Uri uri) throws XmlPullParserException, IOException, NumberFormatException {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j;
        ArrayList arrayList4;
        long j8;
        ArrayList arrayList5;
        long j9;
        long j10;
        long j11;
        Throwable th;
        long j12;
        DashManifestParser dashManifestParser = this;
        boolean zIsDvbProfileDeclared = dashManifestParser.isDvbProfileDeclared(dashManifestParser.parseProfiles(xmlPullParser, "profiles", new String[0]));
        long dateTime = parseDateTime(xmlPullParser, "availabilityStartTime", -9223372036854775807L);
        long duration = parseDuration(xmlPullParser, "mediaPresentationDuration", -9223372036854775807L);
        long duration2 = parseDuration(xmlPullParser, "minBufferTime", -9223372036854775807L);
        boolean zEquals = "dynamic".equals(xmlPullParser.getAttributeValue(null, "type"));
        long duration3 = zEquals ? parseDuration(xmlPullParser, "minimumUpdatePeriod", -9223372036854775807L) : -9223372036854775807L;
        long duration4 = zEquals ? parseDuration(xmlPullParser, "timeShiftBufferDepth", -9223372036854775807L) : -9223372036854775807L;
        long duration5 = zEquals ? parseDuration(xmlPullParser, "suggestedPresentationDelay", -9223372036854775807L) : -9223372036854775807L;
        long dateTime2 = parseDateTime(xmlPullParser, "publishTime", -9223372036854775807L);
        long j13 = zEquals ? 0L : -9223372036854775807L;
        ArrayList arrayListM2199n = AbstractC1006u.m2199n(new BaseUrl(uri.toString(), uri.toString(), zIsDvbProfileDeclared ? 1 : Integer.MIN_VALUE, 1));
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        long j14 = zEquals ? -9223372036854775807L : 0L;
        ArrayList arrayList8 = arrayListM2199n;
        long availabilityTimeOffsetUs = j13;
        boolean z7 = false;
        boolean z8 = false;
        ProgramInformation programInformation = null;
        UtcTimingElement utcTiming = null;
        Uri uriM2345C = null;
        ServiceDescriptionElement serviceDescription = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, "BaseURL")) {
                if (!z8) {
                    availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser, availabilityTimeOffsetUs);
                    z8 = true;
                }
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                arrayList7.addAll(dashManifestParser.parseBaseUrl(xmlPullParser, arrayList, zIsDvbProfileDeclared));
            } else {
                arrayList = arrayList8;
                arrayList2 = arrayList6;
                if (AbstractC1101a.m2373x(xmlPullParser, "ProgramInformation")) {
                    programInformation = parseProgramInformation(xmlPullParser);
                } else if (AbstractC1101a.m2373x(xmlPullParser, "UTCTiming")) {
                    utcTiming = parseUtcTiming(xmlPullParser);
                } else if (AbstractC1101a.m2373x(xmlPullParser, "Location")) {
                    uriM2345C = AbstractC1101a.m2345C(uri.toString(), xmlPullParser.nextText());
                } else if (AbstractC1101a.m2373x(xmlPullParser, "ServiceDescription")) {
                    serviceDescription = parseServiceDescription(xmlPullParser);
                } else {
                    if (!AbstractC1101a.m2373x(xmlPullParser, "Period") || z7) {
                        arrayList3 = arrayList7;
                        j = duration;
                        arrayList8 = arrayList;
                        long j15 = j14;
                        long j16 = availabilityTimeOffsetUs;
                        arrayList4 = arrayList2;
                        maybeSkipTag(xmlPullParser);
                        j14 = j15;
                        j8 = j16;
                    } else {
                        if (arrayList7.isEmpty()) {
                            arrayList3 = arrayList7;
                            arrayList5 = arrayList;
                            j9 = j14;
                            j10 = availabilityTimeOffsetUs;
                            arrayList4 = arrayList2;
                            arrayList8 = arrayList5;
                        } else {
                            arrayList5 = arrayList7;
                            arrayList3 = arrayList5;
                            arrayList8 = arrayList;
                            j9 = j14;
                            j10 = availabilityTimeOffsetUs;
                            arrayList4 = arrayList2;
                        }
                        Pair<Period, Long> period = parsePeriod(xmlPullParser, arrayList5, j9, j10, dateTime, duration4, zIsDvbProfileDeclared);
                        Period period2 = (Period) period.first;
                        j = duration;
                        if (period2.startMs != -9223372036854775807L) {
                            long jLongValue = ((Long) period.second).longValue();
                            j11 = jLongValue == -9223372036854775807L ? -9223372036854775807L : period2.startMs + jLongValue;
                            arrayList4.add(period2);
                        } else {
                            if (!zEquals) {
                                throw C0247v0.createForMalformedManifest("Unable to determine start of period " + arrayList4.size(), null);
                            }
                            j11 = j9;
                            z7 = true;
                        }
                        j8 = j10;
                        j14 = j11;
                    }
                    if (!AbstractC1101a.m2372w(xmlPullParser, "MPD")) {
                        if (j != -9223372036854775807L) {
                            th = null;
                            j12 = j;
                        } else if (j14 != -9223372036854775807L) {
                            j12 = j14;
                            th = null;
                        } else {
                            if (!zEquals) {
                                throw C0247v0.createForMalformedManifest("Unable to determine duration of static manifest.", null);
                            }
                            th = null;
                            j12 = j;
                        }
                        if (arrayList4.isEmpty()) {
                            throw C0247v0.createForMalformedManifest("No periods found.", th);
                        }
                        return buildMediaPresentationDescription(dateTime, j12, duration2, zEquals, duration3, duration4, duration5, dateTime2, programInformation, utcTiming, serviceDescription, uriM2345C, arrayList4);
                    }
                    long j17 = duration4;
                    long j18 = duration2;
                    ArrayList arrayList9 = arrayList4;
                    dashManifestParser = this;
                    zEquals = zEquals;
                    duration3 = duration3;
                    availabilityTimeOffsetUs = j8;
                    arrayList6 = arrayList9;
                    arrayList7 = arrayList3;
                    duration2 = j18;
                    duration4 = j17;
                    duration = j;
                }
            }
            arrayList3 = arrayList7;
            j8 = availabilityTimeOffsetUs;
            j = duration;
            arrayList4 = arrayList2;
            arrayList8 = arrayList;
            if (!AbstractC1101a.m2372w(xmlPullParser, "MPD")) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Pair<Period, Long> parsePeriod(XmlPullParser xmlPullParser, List<BaseUrl> list, long j, long j8, long j9, long j10, boolean z7) throws XmlPullParserException, IOException, NumberFormatException {
        List<BaseUrl> list2;
        long availabilityTimeOffsetUs;
        SegmentBase segmentBase;
        ArrayList arrayList;
        ArrayList arrayList2;
        long j11;
        Object obj;
        long j12;
        XmlPullParser xmlPullParser2;
        long j13;
        long j14;
        SegmentBase segmentTemplate;
        long j15;
        Descriptor descriptor;
        long j16;
        SegmentBase segmentBase2;
        boolean z8;
        long j17;
        List<BaseUrl> list3;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        long duration = parseDuration(xmlPullParser3, "start", j);
        long j18 = j9 != -9223372036854775807L ? j9 + duration : -9223372036854775807L;
        long duration2 = parseDuration(xmlPullParser3, "duration", -9223372036854775807L);
        ArrayList arrayList3 = new ArrayList();
        long j19 = -9223372036854775807L;
        ArrayList arrayList4 = new ArrayList();
        boolean z9 = false;
        Descriptor descriptor2 = null;
        long availabilityTimeOffsetUs2 = j8;
        ArrayList arrayList5 = arrayList3;
        SegmentBase segmentBase3 = null;
        long j20 = -9223372036854775807L;
        ArrayList arrayList6 = new ArrayList();
        while (true) {
            xmlPullParser3.next();
            if (AbstractC1101a.m2373x(xmlPullParser3, "BaseURL")) {
                if (!z9) {
                    availabilityTimeOffsetUs2 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, availabilityTimeOffsetUs2);
                    z9 = true;
                }
                arrayList6.addAll(dashManifestParser.parseBaseUrl(xmlPullParser3, list, z7));
                arrayList2 = arrayList5;
                j15 = availabilityTimeOffsetUs2;
                arrayList = arrayList4;
                z8 = z9;
                j11 = j19;
                obj = null;
                j12 = duration2;
                list2 = arrayList6;
                descriptor = descriptor2;
                xmlPullParser2 = xmlPullParser3;
                segmentBase2 = segmentBase3;
                j17 = j20;
                j14 = j18;
            } else {
                ArrayList arrayList7 = arrayList5;
                if (AbstractC1101a.m2373x(xmlPullParser3, "AdaptationSet")) {
                    if (arrayList6.isEmpty()) {
                        list2 = arrayList6;
                        list3 = list;
                    } else {
                        list3 = arrayList6;
                        list2 = list3;
                    }
                    ArrayList arrayList8 = arrayList4;
                    long j21 = availabilityTimeOffsetUs2;
                    long j22 = j18;
                    long j23 = duration2;
                    AdaptationSet adaptationSet = dashManifestParser.parseAdaptationSet(xmlPullParser3, list3, segmentBase3, j23, j21, j20, j22, j10, z7);
                    j18 = j22;
                    availabilityTimeOffsetUs = j20;
                    arrayList7.add(adaptationSet);
                    segmentBase = segmentBase3;
                    j12 = j23;
                    arrayList = arrayList8;
                    obj = null;
                    xmlPullParser2 = xmlPullParser3;
                    j13 = j21;
                    arrayList2 = arrayList7;
                    j11 = -9223372036854775807L;
                } else {
                    list2 = arrayList6;
                    ArrayList arrayList9 = arrayList4;
                    long j24 = availabilityTimeOffsetUs2;
                    availabilityTimeOffsetUs = j20;
                    if (AbstractC1101a.m2373x(xmlPullParser3, "EventStream")) {
                        arrayList9.add(parseEventStream(xmlPullParser));
                        segmentBase = segmentBase3;
                        j12 = duration2;
                        arrayList = arrayList9;
                        arrayList2 = arrayList7;
                        j11 = -9223372036854775807L;
                        obj = null;
                        xmlPullParser2 = xmlPullParser3;
                        j13 = j24;
                    } else {
                        if (AbstractC1101a.m2373x(xmlPullParser3, "SegmentBase")) {
                            segmentTemplate = dashManifestParser.parseSegmentBase(xmlPullParser3, null);
                            j15 = j24;
                            obj = null;
                            arrayList = arrayList9;
                            arrayList2 = arrayList7;
                            j11 = -9223372036854775807L;
                            j14 = j18;
                            j12 = duration2;
                            descriptor = descriptor2;
                            xmlPullParser2 = xmlPullParser3;
                        } else if (AbstractC1101a.m2373x(xmlPullParser3, "SegmentList")) {
                            long j25 = j18;
                            long j26 = duration2;
                            long availabilityTimeOffsetUs3 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                            arrayList = arrayList9;
                            arrayList2 = arrayList7;
                            j11 = -9223372036854775807L;
                            SegmentBase segmentList = dashManifestParser.parseSegmentList(xmlPullParser3, null, j25, j26, j24, availabilityTimeOffsetUs3, j10);
                            j15 = j24;
                            obj = null;
                            j14 = j25;
                            j12 = j26;
                            descriptor = descriptor2;
                            xmlPullParser2 = xmlPullParser3;
                            j16 = availabilityTimeOffsetUs3;
                            segmentBase2 = segmentList;
                            z8 = z9;
                            j17 = j16;
                        } else {
                            segmentBase = segmentBase3;
                            arrayList = arrayList9;
                            arrayList2 = arrayList7;
                            j11 = -9223372036854775807L;
                            if (AbstractC1101a.m2373x(xmlPullParser3, "SegmentTemplate")) {
                                availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, -9223372036854775807L);
                                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                                obj = null;
                                segmentTemplate = dashManifestParser.parseSegmentTemplate(xmlPullParser3, null, C0981l1.f4211n, j18, duration2, j24, availabilityTimeOffsetUs, j10);
                                j12 = duration2;
                                xmlPullParser2 = xmlPullParser3;
                                j14 = j18;
                                j15 = j24;
                                descriptor = descriptor2;
                            } else {
                                obj = null;
                                j12 = duration2;
                                xmlPullParser2 = xmlPullParser3;
                                j13 = j24;
                                j14 = j18;
                                if (AbstractC1101a.m2373x(xmlPullParser2, "AssetIdentifier")) {
                                    descriptor2 = parseDescriptor(xmlPullParser2, "AssetIdentifier");
                                } else {
                                    maybeSkipTag(xmlPullParser2);
                                }
                                j15 = j13;
                                descriptor = descriptor2;
                                j16 = availabilityTimeOffsetUs;
                                segmentBase2 = segmentBase;
                                z8 = z9;
                                j17 = j16;
                            }
                        }
                        j16 = availabilityTimeOffsetUs;
                        segmentBase2 = segmentTemplate;
                        z8 = z9;
                        j17 = j16;
                    }
                }
                j14 = j18;
                j15 = j13;
                descriptor = descriptor2;
                j16 = availabilityTimeOffsetUs;
                segmentBase2 = segmentBase;
                z8 = z9;
                j17 = j16;
            }
            if (AbstractC1101a.m2372w(xmlPullParser2, "Period")) {
                return Pair.create(buildPeriod(attributeValue, duration, arrayList2, arrayList, descriptor), Long.valueOf(j12));
            }
            dashManifestParser = this;
            xmlPullParser3 = xmlPullParser2;
            j18 = j14;
            segmentBase3 = segmentBase2;
            j20 = j17;
            arrayList6 = list2;
            arrayList5 = arrayList2;
            descriptor2 = descriptor;
            z9 = z8;
            duration2 = j12;
            j19 = j11;
            availabilityTimeOffsetUs2 = j15;
            arrayList4 = arrayList;
        }
    }

    public String[] parseProfiles(XmlPullParser xmlPullParser, String str, String[] strArr) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? strArr : attributeValue.split(",");
    }

    public ProgramInformation parseProgramInformation(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        String strNextText = null;
        String string = parseString(xmlPullParser, "moreInformationURL", null);
        String string2 = parseString(xmlPullParser, "lang", null);
        String strNextText2 = null;
        String strNextText3 = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, "Title")) {
                strNextText = xmlPullParser.nextText();
            } else if (AbstractC1101a.m2373x(xmlPullParser, "Source")) {
                strNextText2 = xmlPullParser.nextText();
            } else if (AbstractC1101a.m2373x(xmlPullParser, "Copyright")) {
                strNextText3 = xmlPullParser.nextText();
            } else {
                maybeSkipTag(xmlPullParser);
            }
            String str = strNextText2;
            String str2 = strNextText;
            String str3 = strNextText3;
            if (AbstractC1101a.m2372w(xmlPullParser, "ProgramInformation")) {
                return new ProgramInformation(str2, str, str3, string, string2);
            }
            strNextText = str2;
            strNextText2 = str;
            strNextText3 = str3;
        }
    }

    public RangedUri parseRangedUrl(XmlPullParser xmlPullParser, String str, String str2) throws NumberFormatException {
        long j;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        long j8 = -1;
        if (attributeValue2 != null) {
            String[] strArrSplit = attributeValue2.split("-");
            j = Long.parseLong(strArrSplit[0]);
            if (strArrSplit.length == 2) {
                j8 = (Long.parseLong(strArrSplit[1]) - j) + 1;
            }
        } else {
            j = 0;
        }
        return buildRangedUri(attributeValue, j, j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0214 A[LOOP:0: B:3:0x006c->B:56:0x0214, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c7 A[EDGE_INSN: B:57:0x01c7->B:46:0x01c7 BREAK  A[LOOP:0: B:3:0x006c->B:56:0x0214], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RepresentationInfo parseRepresentation(XmlPullParser xmlPullParser, List<BaseUrl> list, String str, String str2, int i, int i4, float f8, int i8, int i9, String str3, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, List<Descriptor> list5, SegmentBase segmentBase, long j, long j8, long j9, long j10, long j11, boolean z7) throws XmlPullParserException, NumberFormatException, IOException {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        XmlPullParser xmlPullParser2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        long j12;
        int audioChannelConfiguration;
        String str4;
        boolean z8;
        SegmentBase singleSegmentBase;
        long j13;
        SegmentBase segmentTemplate;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        ArrayList arrayList9;
        DashManifestParser dashManifestParser = this;
        XmlPullParser xmlPullParser3 = xmlPullParser;
        String attributeValue = xmlPullParser3.getAttributeValue(null, "id");
        int i11 = parseInt(xmlPullParser3, "bandwidth", -1);
        String string = parseString(xmlPullParser3, "mimeType", str);
        String string2 = parseString(xmlPullParser3, "codecs", str2);
        int i12 = parseInt(xmlPullParser3, "width", i);
        int i13 = parseInt(xmlPullParser3, "height", i4);
        float frameRate = parseFrameRate(xmlPullParser3, f8);
        int i14 = parseInt(xmlPullParser3, "audioSamplingRate", i9);
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList(list4);
        ArrayList arrayList13 = new ArrayList(list5);
        ArrayList arrayList14 = new ArrayList();
        int i15 = i8;
        long j14 = j10;
        String str5 = null;
        boolean z9 = false;
        SegmentBase segmentBase2 = segmentBase;
        long availabilityTimeOffsetUs = j9;
        while (true) {
            xmlPullParser3.next();
            if (AbstractC1101a.m2373x(xmlPullParser3, "BaseURL")) {
                if (!z9) {
                    availabilityTimeOffsetUs = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, availabilityTimeOffsetUs);
                    z9 = true;
                }
                ArrayList arrayList15 = arrayList11;
                arrayList14.addAll(dashManifestParser.parseBaseUrl(xmlPullParser3, list, z7));
                xmlPullParser2 = xmlPullParser3;
                arrayList9 = arrayList14;
                j12 = j14;
                arrayList5 = arrayList13;
                i10 = i11;
                audioChannelConfiguration = i15;
                str4 = str5;
                z8 = z9;
                arrayList2 = arrayList15;
                singleSegmentBase = segmentBase2;
                j13 = availabilityTimeOffsetUs;
            } else {
                ArrayList arrayList16 = arrayList11;
                if (AbstractC1101a.m2373x(xmlPullParser3, "AudioChannelConfiguration")) {
                    xmlPullParser2 = xmlPullParser3;
                    singleSegmentBase = segmentBase2;
                    arrayList7 = arrayList14;
                    j12 = j14;
                    i10 = i11;
                    str4 = str5;
                    z8 = z9;
                    arrayList2 = arrayList16;
                    audioChannelConfiguration = parseAudioChannelConfiguration(xmlPullParser);
                } else if (AbstractC1101a.m2373x(xmlPullParser3, "SegmentBase")) {
                    SegmentBase.SingleSegmentBase segmentBase3 = dashManifestParser.parseSegmentBase(xmlPullParser3, (SegmentBase.SingleSegmentBase) segmentBase2);
                    xmlPullParser2 = xmlPullParser3;
                    arrayList7 = arrayList14;
                    j12 = j14;
                    i10 = i11;
                    audioChannelConfiguration = i15;
                    str4 = str5;
                    z8 = z9;
                    arrayList2 = arrayList16;
                    singleSegmentBase = segmentBase3;
                } else {
                    if (AbstractC1101a.m2373x(xmlPullParser3, "SegmentList")) {
                        long availabilityTimeOffsetUs2 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j14);
                        arrayList6 = arrayList14;
                        arrayList = arrayList13;
                        i10 = i11;
                        arrayList2 = arrayList16;
                        segmentTemplate = dashManifestParser.parseSegmentList(xmlPullParser3, (SegmentBase.SegmentList) segmentBase2, j, j8, availabilityTimeOffsetUs, availabilityTimeOffsetUs2, j11);
                        arrayList3 = arrayList10;
                        arrayList4 = arrayList12;
                        xmlPullParser2 = xmlPullParser3;
                        j12 = availabilityTimeOffsetUs2;
                    } else {
                        ArrayList arrayList17 = arrayList14;
                        arrayList = arrayList13;
                        i10 = i11;
                        arrayList2 = arrayList16;
                        ArrayList arrayList18 = arrayList12;
                        if (AbstractC1101a.m2373x(xmlPullParser3, "SegmentTemplate")) {
                            long availabilityTimeOffsetUs3 = dashManifestParser.parseAvailabilityTimeOffsetUs(xmlPullParser3, j14);
                            long j15 = availabilityTimeOffsetUs;
                            arrayList3 = arrayList10;
                            segmentTemplate = dashManifestParser.parseSegmentTemplate(xmlPullParser3, (SegmentBase.SegmentTemplate) segmentBase2, list5, j, j8, j15, availabilityTimeOffsetUs3, j11);
                            xmlPullParser2 = xmlPullParser3;
                            availabilityTimeOffsetUs = j15;
                            arrayList4 = arrayList18;
                            j12 = availabilityTimeOffsetUs3;
                            arrayList6 = arrayList17;
                        } else {
                            xmlPullParser2 = xmlPullParser3;
                            arrayList3 = arrayList10;
                            if (AbstractC1101a.m2373x(xmlPullParser2, "ContentProtection")) {
                                Pair<String, C0234r> contentProtection = parseContentProtection(xmlPullParser);
                                Object obj = contentProtection.first;
                                if (obj != null) {
                                    str5 = (String) obj;
                                }
                                Object obj2 = contentProtection.second;
                                if (obj2 != null) {
                                    arrayList3.add((C0234r) obj2);
                                }
                                arrayList4 = arrayList18;
                            } else if (AbstractC1101a.m2373x(xmlPullParser2, "InbandEventStream")) {
                                arrayList2.add(parseDescriptor(xmlPullParser2, "InbandEventStream"));
                                arrayList4 = arrayList18;
                            } else if (AbstractC1101a.m2373x(xmlPullParser2, "EssentialProperty")) {
                                arrayList4 = arrayList18;
                                arrayList4.add(parseDescriptor(xmlPullParser2, "EssentialProperty"));
                            } else {
                                arrayList4 = arrayList18;
                                if (AbstractC1101a.m2373x(xmlPullParser2, "SupplementalProperty")) {
                                    arrayList5 = arrayList;
                                    arrayList5.add(parseDescriptor(xmlPullParser2, "SupplementalProperty"));
                                } else {
                                    arrayList5 = arrayList;
                                    maybeSkipTag(xmlPullParser2);
                                }
                                j12 = j14;
                                audioChannelConfiguration = i15;
                                str4 = str5;
                                z8 = z9;
                                singleSegmentBase = segmentBase2;
                                j13 = availabilityTimeOffsetUs;
                                arrayList8 = arrayList17;
                                if (!AbstractC1101a.m2372w(xmlPullParser2, "Representation")) {
                                    break;
                                }
                                ArrayList arrayList19 = arrayList5;
                                arrayList12 = arrayList4;
                                arrayList10 = arrayList3;
                                arrayList11 = arrayList2;
                                segmentBase2 = singleSegmentBase;
                                availabilityTimeOffsetUs = j13;
                                i11 = i10;
                                j14 = j12;
                                z9 = z8;
                                str5 = str4;
                                arrayList13 = arrayList19;
                                i15 = audioChannelConfiguration;
                                arrayList14 = arrayList8;
                                dashManifestParser = this;
                                xmlPullParser3 = xmlPullParser;
                            }
                            arrayList5 = arrayList;
                            j12 = j14;
                            audioChannelConfiguration = i15;
                            str4 = str5;
                            z8 = z9;
                            singleSegmentBase = segmentBase2;
                            j13 = availabilityTimeOffsetUs;
                            arrayList8 = arrayList17;
                            if (!AbstractC1101a.m2372w(xmlPullParser2, "Representation")) {
                            }
                        }
                    }
                    audioChannelConfiguration = i15;
                    str4 = str5;
                    z8 = z9;
                    singleSegmentBase = segmentTemplate;
                    j13 = availabilityTimeOffsetUs;
                    arrayList5 = arrayList;
                    arrayList8 = arrayList6;
                    if (!AbstractC1101a.m2372w(xmlPullParser2, "Representation")) {
                    }
                }
                j13 = availabilityTimeOffsetUs;
                arrayList5 = arrayList13;
                arrayList9 = arrayList7;
            }
            arrayList3 = arrayList10;
            arrayList4 = arrayList12;
            arrayList8 = arrayList9;
            if (!AbstractC1101a.m2372w(xmlPullParser2, "Representation")) {
            }
        }
        ArrayList arrayList20 = arrayList3;
        List<Descriptor> list6 = arrayList5;
        C0249w c0249wBuildFormat = buildFormat(attributeValue, string, i12, i13, frameRate, audioChannelConfiguration, i14, i10, str3, list2, list3, string2, arrayList4, list6);
        if (singleSegmentBase == null) {
            singleSegmentBase = new SegmentBase.SingleSegmentBase();
        }
        boolean zIsEmpty = arrayList8.isEmpty();
        List<BaseUrl> list7 = arrayList8;
        if (zIsEmpty) {
            list7 = list;
        }
        return new RepresentationInfo(c0249wBuildFormat, list7, singleSegmentBase, str4, arrayList20, arrayList2, arrayList4, list6, -1L);
    }

    public int parseRoleFlagsFromAccessibilityDescriptors(List<Descriptor> list) {
        int tvaAudioPurposeCsValue;
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            Descriptor descriptor = list.get(i4);
            if (AbstractC0714c.m1493F("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseRoleFlagsFromDashRoleScheme(descriptor.value);
            } else if (AbstractC0714c.m1493F("urn:tva:metadata:cs:AudioPurposeCS:2007", descriptor.schemeIdUri)) {
                tvaAudioPurposeCsValue = parseTvaAudioPurposeCsValue(descriptor.value);
            }
            i |= tvaAudioPurposeCsValue;
        }
        return i;
    }

    public int parseRoleFlagsFromDashRoleScheme(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public int parseRoleFlagsFromProperties(List<Descriptor> list) {
        int i = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (AbstractC0714c.m1493F("http://dashif.org/guidelines/trickmode", list.get(i4).schemeIdUri)) {
                i = 16384;
            }
        }
        return i;
    }

    public int parseRoleFlagsFromRoleDescriptors(List<Descriptor> list) {
        int roleFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (AbstractC0714c.m1493F("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                roleFlagsFromDashRoleScheme |= parseRoleFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return roleFlagsFromDashRoleScheme;
    }

    public SegmentBase.SingleSegmentBase parseSegmentBase(XmlPullParser xmlPullParser, SegmentBase.SingleSegmentBase singleSegmentBase) throws XmlPullParserException, NumberFormatException, IOException {
        long j = parseLong(xmlPullParser, "timescale", singleSegmentBase != null ? singleSegmentBase.timescale : 1L);
        long j8 = parseLong(xmlPullParser, "presentationTimeOffset", singleSegmentBase != null ? singleSegmentBase.presentationTimeOffset : 0L);
        long j9 = singleSegmentBase != null ? singleSegmentBase.indexStart : 0L;
        long j10 = singleSegmentBase != null ? singleSegmentBase.indexLength : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] strArrSplit = attributeValue.split("-");
            j9 = Long.parseLong(strArrSplit[0]);
            j10 = (Long.parseLong(strArrSplit[1]) - j9) + 1;
        }
        long j11 = j10;
        RangedUri initialization = singleSegmentBase != null ? singleSegmentBase.initialization : null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
            } else {
                maybeSkipTag(xmlPullParser);
            }
            RangedUri rangedUri = initialization;
            if (AbstractC1101a.m2372w(xmlPullParser, "SegmentBase")) {
                return buildSingleSegmentBase(rangedUri, j, j8, j9, j11);
            }
            initialization = rangedUri;
        }
    }

    public SegmentBase.SegmentList parseSegmentList(XmlPullParser xmlPullParser, SegmentBase.SegmentList segmentList, long j, long j8, long j9, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        long j13 = parseLong(xmlPullParser, "timescale", segmentList != null ? segmentList.timescale : 1L);
        long j14 = parseLong(xmlPullParser, "presentationTimeOffset", segmentList != null ? segmentList.presentationTimeOffset : 0L);
        long j15 = parseLong(xmlPullParser, "duration", segmentList != null ? segmentList.duration : -9223372036854775807L);
        long j16 = parseLong(xmlPullParser, "startNumber", segmentList != null ? segmentList.startNumber : 1L);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j9, j10);
        List<RangedUri> arrayList = null;
        RangedUri initialization = null;
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
                j12 = j13;
            } else if (AbstractC1101a.m2373x(xmlPullParser, "SegmentTimeline")) {
                j12 = j13;
                segmentTimeline = parseSegmentTimeline(xmlPullParser, j12, j8);
            } else {
                j12 = j13;
                if (AbstractC1101a.m2373x(xmlPullParser, "SegmentURL")) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(parseSegmentUrl(xmlPullParser));
                } else {
                    maybeSkipTag(xmlPullParser);
                }
            }
            if (AbstractC1101a.m2372w(xmlPullParser, "SegmentList")) {
                break;
            }
            j13 = j12;
        }
        if (segmentList != null) {
            if (initialization == null) {
                initialization = segmentList.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentList.segmentTimeline;
            }
            if (arrayList == null) {
                arrayList = segmentList.mediaSegments;
            }
        }
        return buildSegmentList(initialization, j12, j14, j16, j15, segmentTimeline, finalAvailabilityTimeOffset, arrayList, j11, j);
    }

    public SegmentBase.SegmentTemplate parseSegmentTemplate(XmlPullParser xmlPullParser, SegmentBase.SegmentTemplate segmentTemplate, List<Descriptor> list, long j, long j8, long j9, long j10, long j11) throws XmlPullParserException, IOException {
        long j12;
        DashManifestParser dashManifestParser = this;
        long j13 = parseLong(xmlPullParser, "timescale", segmentTemplate != null ? segmentTemplate.timescale : 1L);
        long j14 = parseLong(xmlPullParser, "presentationTimeOffset", segmentTemplate != null ? segmentTemplate.presentationTimeOffset : 0L);
        long j15 = parseLong(xmlPullParser, "duration", segmentTemplate != null ? segmentTemplate.duration : -9223372036854775807L);
        long j16 = parseLong(xmlPullParser, "startNumber", segmentTemplate != null ? segmentTemplate.startNumber : 1L);
        long lastSegmentNumberSupplementalProperty = parseLastSegmentNumberSupplementalProperty(list);
        long finalAvailabilityTimeOffset = getFinalAvailabilityTimeOffset(j9, j10);
        UrlTemplate urlTemplate = dashManifestParser.parseUrlTemplate(xmlPullParser, "media", segmentTemplate != null ? segmentTemplate.mediaTemplate : null);
        UrlTemplate urlTemplate2 = dashManifestParser.parseUrlTemplate(xmlPullParser, "initialization", segmentTemplate != null ? segmentTemplate.initializationTemplate : null);
        RangedUri initialization = null;
        List<SegmentBase.SegmentTimelineElement> segmentTimeline = null;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, "Initialization")) {
                initialization = parseInitialization(xmlPullParser);
                j12 = j13;
            } else if (AbstractC1101a.m2373x(xmlPullParser, "SegmentTimeline")) {
                j12 = j13;
                segmentTimeline = dashManifestParser.parseSegmentTimeline(xmlPullParser, j12, j8);
            } else {
                j12 = j13;
                maybeSkipTag(xmlPullParser);
            }
            if (AbstractC1101a.m2372w(xmlPullParser, "SegmentTemplate")) {
                break;
            }
            dashManifestParser = this;
            finalAvailabilityTimeOffset = finalAvailabilityTimeOffset;
            lastSegmentNumberSupplementalProperty = lastSegmentNumberSupplementalProperty;
            j16 = j16;
            j14 = j14;
            j13 = j12;
        }
        if (segmentTemplate != null) {
            if (initialization == null) {
                initialization = segmentTemplate.initialization;
            }
            if (segmentTimeline == null) {
                segmentTimeline = segmentTemplate.segmentTimeline;
            }
        }
        return buildSegmentTemplate(initialization, j12, j14, j16, lastSegmentNumberSupplementalProperty, j15, segmentTimeline, finalAvailabilityTimeOffset, urlTemplate2, urlTemplate, j11, j);
    }

    public List<SegmentBase.SegmentTimelineElement> parseSegmentTimeline(XmlPullParser xmlPullParser, long j, long j8) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        long jAddSegmentTimelineElementsToList = 0;
        long j9 = -9223372036854775807L;
        boolean z7 = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, "S")) {
                long j10 = parseLong(xmlPullParser, "t", -9223372036854775807L);
                if (z7) {
                    ArrayList arrayList2 = arrayList;
                    jAddSegmentTimelineElementsToList = addSegmentTimelineElementsToList(arrayList2, jAddSegmentTimelineElementsToList, j9, i, j10);
                    arrayList = arrayList2;
                }
                if (j10 != -9223372036854775807L) {
                    jAddSegmentTimelineElementsToList = j10;
                }
                j9 = parseLong(xmlPullParser, "d", -9223372036854775807L);
                i = parseInt(xmlPullParser, "r", 0);
                z7 = true;
            } else {
                maybeSkipTag(xmlPullParser);
            }
        } while (!AbstractC1101a.m2372w(xmlPullParser, "SegmentTimeline"));
        if (z7) {
            int i4 = AbstractC1118i0.f4750a;
            addSegmentTimelineElementsToList(arrayList, jAddSegmentTimelineElementsToList, j9, i, AbstractC1118i0.m2437a0(j8, j, 1000L, RoundingMode.DOWN));
        }
        return arrayList;
    }

    public RangedUri parseSegmentUrl(XmlPullParser xmlPullParser) {
        return parseRangedUrl(xmlPullParser, "media", "mediaRange");
    }

    public int parseSelectionFlagsFromDashRoleScheme(String str) {
        if (str == null) {
            return 0;
        }
        return (str.equals("forced_subtitle") || str.equals("forced-subtitle")) ? 2 : 0;
    }

    public int parseSelectionFlagsFromRoleDescriptors(List<Descriptor> list) {
        int selectionFlagsFromDashRoleScheme = 0;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if (AbstractC0714c.m1493F("urn:mpeg:dash:role:2011", descriptor.schemeIdUri)) {
                selectionFlagsFromDashRoleScheme |= parseSelectionFlagsFromDashRoleScheme(descriptor.value);
            }
        }
        return selectionFlagsFromDashRoleScheme;
    }

    public ServiceDescriptionElement parseServiceDescription(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        long j = -9223372036854775807L;
        long j8 = -9223372036854775807L;
        long j9 = -9223372036854775807L;
        float f8 = -3.4028235E38f;
        float f9 = -3.4028235E38f;
        while (true) {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, "Latency")) {
                j = parseLong(xmlPullParser, "target", -9223372036854775807L);
                j8 = parseLong(xmlPullParser, "min", -9223372036854775807L);
                j9 = parseLong(xmlPullParser, "max", -9223372036854775807L);
            } else if (AbstractC1101a.m2373x(xmlPullParser, "PlaybackRate")) {
                f8 = parseFloat(xmlPullParser, "min", -3.4028235E38f);
                f9 = parseFloat(xmlPullParser, "max", -3.4028235E38f);
            }
            long j10 = j;
            long j11 = j8;
            long j12 = j9;
            float f10 = f8;
            float f11 = f9;
            if (AbstractC1101a.m2372w(xmlPullParser, "ServiceDescription")) {
                return new ServiceDescriptionElement(j10, j11, j12, f10, f11);
            }
            j = j10;
            j8 = j11;
            j9 = j12;
            f8 = f10;
            f9 = f11;
        }
    }

    public Pair<Integer, Integer> parseTileCountFromProperties(List<Descriptor> list) {
        String str;
        for (int i = 0; i < list.size(); i++) {
            Descriptor descriptor = list.get(i);
            if ((AbstractC0714c.m1493F("http://dashif.org/thumbnail_tile", descriptor.schemeIdUri) || AbstractC0714c.m1493F("http://dashif.org/guidelines/thumbnail_tile", descriptor.schemeIdUri)) && (str = descriptor.value) != null) {
                int i4 = AbstractC1118i0.f4750a;
                String[] strArrSplit = str.split("x", -1);
                if (strArrSplit.length != 2) {
                    continue;
                } else {
                    try {
                        return Pair.create(Integer.valueOf(Integer.parseInt(strArrSplit[0])), Integer.valueOf(Integer.parseInt(strArrSplit[1])));
                    } catch (NumberFormatException unused) {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public int parseTvaAudioPurposeCsValue(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    public UrlTemplate parseUrlTemplate(XmlPullParser xmlPullParser, String str, UrlTemplate urlTemplate) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? UrlTemplate.compile(attributeValue) : urlTemplate;
    }

    public UtcTimingElement parseUtcTiming(XmlPullParser xmlPullParser) {
        return buildUtcTimingElement(xmlPullParser.getAttributeValue(null, "schemeIdUri"), xmlPullParser.getAttributeValue(null, "value"));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.media3.exoplayer.upstream.ParsingLoadable.Parser
    public DashManifest parse(Uri uri, InputStream inputStream) throws XmlPullParserException, C0247v0 {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.xmlParserFactory.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            if (xmlPullParserNewPullParser.next() == 2 && "MPD".equals(xmlPullParserNewPullParser.getName())) {
                return parseMediaPresentationDescription(xmlPullParserNewPullParser, uri);
            }
            throw C0247v0.createForMalformedManifest("inputStream does not contain a valid media presentation description", null);
        } catch (XmlPullParserException e) {
            throw C0247v0.createForMalformedManifest(null, e);
        }
    }
}
