package p184v1;

import androidx.media3.common.C0247v0;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p052f6.AbstractC0983m0;
import p052f6.C0974j0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v1.e */
/* loaded from: classes.dex */
public abstract class AbstractC2530e {

    /* renamed from: a */
    public static final String[] f9205a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    public static final String[] f9206b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    public static final String[] f9207c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c9, code lost:
    
        return null;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2528c m4551a(String str) throws XmlPullParserException, IOException, NumberFormatException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!AbstractC1101a.m2373x(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw C0247v0.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        C0981l1 c0981l1M4552b = C0981l1.f4211n;
        long j = -9223372036854775807L;
        loop0: while (true) {
            xmlPullParserNewPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParserNewPullParser, "rdf:Description")) {
                int i = 0;
                while (true) {
                    if (i >= 4) {
                        break loop0;
                    }
                    String strM2367r = AbstractC1101a.m2367r(xmlPullParserNewPullParser, f9205a[i]);
                    if (strM2367r == null) {
                        i++;
                    } else {
                        if (Integer.parseInt(strM2367r) != 1) {
                            break;
                        }
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 4) {
                                break;
                            }
                            String strM2367r2 = AbstractC1101a.m2367r(xmlPullParserNewPullParser, f9206b[i4]);
                            if (strM2367r2 != null) {
                                j = Long.parseLong(strM2367r2);
                                if (j == -1) {
                                    break;
                                }
                            } else {
                                i4++;
                            }
                        }
                        j = -9223372036854775807L;
                        int i8 = 0;
                        while (true) {
                            if (i8 >= 2) {
                                C0977k0 c0977k02 = AbstractC0983m0.f4215k;
                                c0981l1M4552b = C0981l1.f4211n;
                                break;
                            }
                            String strM2367r3 = AbstractC1101a.m2367r(xmlPullParserNewPullParser, f9207c[i8]);
                            if (strM2367r3 != null) {
                                c0981l1M4552b = AbstractC0983m0.m2169o(new C2527b("image/jpeg", 0L, 0L), new C2527b("video/mp4", Long.parseLong(strM2367r3), 0L));
                                break;
                            }
                            i8++;
                        }
                    }
                }
            } else if (AbstractC1101a.m2373x(xmlPullParserNewPullParser, "Container:Directory")) {
                c0981l1M4552b = m4552b(xmlPullParserNewPullParser, "Container", "Item");
            } else if (AbstractC1101a.m2373x(xmlPullParserNewPullParser, "GContainer:Directory")) {
                c0981l1M4552b = m4552b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
            if (AbstractC1101a.m2372w(xmlPullParserNewPullParser, "x:xmpmeta")) {
                if (!c0981l1M4552b.isEmpty()) {
                    return new C2528c(0, j, c0981l1M4552b);
                }
            }
        }
    }

    /* renamed from: b */
    public static C0981l1 m4552b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
        String strConcat = str.concat(":Item");
        String strConcat2 = str.concat(":Directory");
        do {
            xmlPullParser.next();
            if (AbstractC1101a.m2373x(xmlPullParser, strConcat)) {
                String strConcat3 = str2.concat(":Mime");
                String strConcat4 = str2.concat(":Semantic");
                String strConcat5 = str2.concat(":Length");
                String strConcat6 = str2.concat(":Padding");
                String strM2367r = AbstractC1101a.m2367r(xmlPullParser, strConcat3);
                String strM2367r2 = AbstractC1101a.m2367r(xmlPullParser, strConcat4);
                String strM2367r3 = AbstractC1101a.m2367r(xmlPullParser, strConcat5);
                String strM2367r4 = AbstractC1101a.m2367r(xmlPullParser, strConcat6);
                if (strM2367r == null || strM2367r2 == null) {
                    return C0981l1.f4211n;
                }
                c0974j0M2164i.m2141a(new C2527b(strM2367r, strM2367r3 != null ? Long.parseLong(strM2367r3) : 0L, strM2367r4 != null ? Long.parseLong(strM2367r4) : 0L));
            }
        } while (!AbstractC1101a.m2372w(xmlPullParser, strConcat2));
        return c0974j0M2164i.m2159f();
    }
}
