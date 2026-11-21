package androidx.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.UUID;
import p043e6.C0917e;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC1006u;
import p052f6.C0981l1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p068h6.AbstractC1196c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.w */
/* loaded from: classes.dex */
public final class C0249w {

    /* renamed from: N */
    public static final C0249w f1461N = new C0249w(new C0246v());

    /* renamed from: O */
    public static final String f1462O = Integer.toString(0, 36);

    /* renamed from: P */
    public static final String f1463P = Integer.toString(1, 36);

    /* renamed from: Q */
    public static final String f1464Q = Integer.toString(2, 36);

    /* renamed from: R */
    public static final String f1465R = Integer.toString(3, 36);

    /* renamed from: S */
    public static final String f1466S = Integer.toString(4, 36);

    /* renamed from: T */
    public static final String f1467T = Integer.toString(5, 36);

    /* renamed from: U */
    public static final String f1468U = Integer.toString(6, 36);

    /* renamed from: V */
    public static final String f1469V = Integer.toString(7, 36);

    /* renamed from: W */
    public static final String f1470W = Integer.toString(8, 36);

    /* renamed from: X */
    public static final String f1471X = Integer.toString(9, 36);

    /* renamed from: Y */
    public static final String f1472Y = Integer.toString(10, 36);

    /* renamed from: Z */
    public static final String f1473Z = Integer.toString(11, 36);

    /* renamed from: a0 */
    public static final String f1474a0 = Integer.toString(12, 36);

    /* renamed from: b0 */
    public static final String f1475b0 = Integer.toString(13, 36);

    /* renamed from: c0 */
    public static final String f1476c0 = Integer.toString(14, 36);

    /* renamed from: d0 */
    public static final String f1477d0 = Integer.toString(15, 36);

    /* renamed from: e0 */
    public static final String f1478e0 = Integer.toString(16, 36);

    /* renamed from: f0 */
    public static final String f1479f0 = Integer.toString(17, 36);

    /* renamed from: g0 */
    public static final String f1480g0 = Integer.toString(18, 36);

    /* renamed from: h0 */
    public static final String f1481h0 = Integer.toString(19, 36);

    /* renamed from: i0 */
    public static final String f1482i0 = Integer.toString(20, 36);

    /* renamed from: j0 */
    public static final String f1483j0 = Integer.toString(21, 36);

    /* renamed from: k0 */
    public static final String f1484k0 = Integer.toString(22, 36);

    /* renamed from: l0 */
    public static final String f1485l0 = Integer.toString(23, 36);

    /* renamed from: m0 */
    public static final String f1486m0 = Integer.toString(24, 36);

    /* renamed from: n0 */
    public static final String f1487n0 = Integer.toString(25, 36);

    /* renamed from: o0 */
    public static final String f1488o0 = Integer.toString(26, 36);

    /* renamed from: p0 */
    public static final String f1489p0 = Integer.toString(27, 36);

    /* renamed from: q0 */
    public static final String f1490q0 = Integer.toString(28, 36);

    /* renamed from: r0 */
    public static final String f1491r0 = Integer.toString(29, 36);

    /* renamed from: s0 */
    public static final String f1492s0 = Integer.toString(30, 36);

    /* renamed from: t0 */
    public static final String f1493t0 = Integer.toString(31, 36);

    /* renamed from: u0 */
    public static final String f1494u0 = Integer.toString(32, 36);

    /* renamed from: v0 */
    public static final String f1495v0 = Integer.toString(33, 36);

    /* renamed from: A */
    public final int f1496A;

    /* renamed from: B */
    public final C0216l f1497B;

    /* renamed from: C */
    public final int f1498C;

    /* renamed from: D */
    public final int f1499D;

    /* renamed from: E */
    public final int f1500E;

    /* renamed from: F */
    public final int f1501F;

    /* renamed from: G */
    public final int f1502G;

    /* renamed from: H */
    public final int f1503H;

    /* renamed from: I */
    public final int f1504I;

    /* renamed from: J */
    public final int f1505J;

    /* renamed from: K */
    public final int f1506K;

    /* renamed from: L */
    public final int f1507L;

    /* renamed from: M */
    public int f1508M;

    /* renamed from: a */
    public final String f1509a;

    /* renamed from: b */
    public final String f1510b;

    /* renamed from: c */
    public final AbstractC0983m0 f1511c;

    /* renamed from: d */
    public final String f1512d;

    /* renamed from: e */
    public final int f1513e;

    /* renamed from: f */
    public final int f1514f;

    /* renamed from: g */
    public final int f1515g;

    /* renamed from: h */
    public final int f1516h;

    /* renamed from: i */
    public final int f1517i;

    /* renamed from: j */
    public final int f1518j;

    /* renamed from: k */
    public final String f1519k;

    /* renamed from: l */
    public final C0241t0 f1520l;

    /* renamed from: m */
    public final String f1521m;

    /* renamed from: n */
    public final String f1522n;

    /* renamed from: o */
    public final int f1523o;

    /* renamed from: p */
    public final int f1524p;

    /* renamed from: q */
    public final List f1525q;

    /* renamed from: r */
    public final C0237s f1526r;

    /* renamed from: s */
    public final long f1527s;

    /* renamed from: t */
    public final boolean f1528t;

    /* renamed from: u */
    public final int f1529u;

    /* renamed from: v */
    public final int f1530v;

    /* renamed from: w */
    public final float f1531w;

    /* renamed from: x */
    public final int f1532x;

    /* renamed from: y */
    public final float f1533y;

    /* renamed from: z */
    public final byte[] f1534z;

    public C0249w(C0246v c0246v) throws MissingResourceException {
        boolean z7;
        String str;
        this.f1509a = c0246v.f1435a;
        String strM2429T = AbstractC1118i0.m2429T(c0246v.f1438d);
        this.f1512d = strM2429T;
        if (c0246v.f1437c.isEmpty() && c0246v.f1436b != null) {
            this.f1511c = AbstractC0983m0.m2168n(new C0258z(strM2429T, c0246v.f1436b));
            this.f1510b = c0246v.f1436b;
        } else if (!c0246v.f1437c.isEmpty() && c0246v.f1436b == null) {
            AbstractC0983m0 abstractC0983m0 = c0246v.f1437c;
            this.f1511c = abstractC0983m0;
            int size = abstractC0983m0.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    str = ((C0258z) abstractC0983m0.get(0)).f1556b;
                    break;
                }
                Object obj = abstractC0983m0.get(i);
                i++;
                C0258z c0258z = (C0258z) obj;
                if (TextUtils.equals(c0258z.f1555a, strM2429T)) {
                    str = c0258z.f1556b;
                    break;
                }
            }
            this.f1510b = str;
        } else if (c0246v.f1437c.isEmpty() && c0246v.f1436b == null) {
            z7 = true;
            AbstractC1101a.m2359j(z7);
            this.f1511c = c0246v.f1437c;
            this.f1510b = c0246v.f1436b;
        } else {
            for (int i4 = 0; i4 < c0246v.f1437c.size(); i4++) {
                if (((C0258z) c0246v.f1437c.get(i4)).f1556b.equals(c0246v.f1436b)) {
                    z7 = true;
                    break;
                }
            }
            z7 = false;
            AbstractC1101a.m2359j(z7);
            this.f1511c = c0246v.f1437c;
            this.f1510b = c0246v.f1436b;
        }
        this.f1513e = c0246v.f1439e;
        AbstractC1101a.m2358i("Auxiliary track type must only be set to a value other than AUXILIARY_TRACK_TYPE_UNDEFINED only when ROLE_FLAG_AUXILIARY is set", c0246v.f1441g == 0 || (c0246v.f1440f & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE) != 0);
        this.f1514f = c0246v.f1440f;
        this.f1515g = c0246v.f1441g;
        int i8 = c0246v.f1442h;
        this.f1516h = i8;
        int i9 = c0246v.f1443i;
        this.f1517i = i9;
        this.f1518j = i9 != -1 ? i9 : i8;
        this.f1519k = c0246v.f1444j;
        this.f1520l = c0246v.f1445k;
        this.f1521m = c0246v.f1446l;
        this.f1522n = c0246v.f1447m;
        this.f1523o = c0246v.f1448n;
        this.f1524p = c0246v.f1449o;
        List list = c0246v.f1450p;
        this.f1525q = list == null ? Collections.EMPTY_LIST : list;
        C0237s c0237s = c0246v.f1451q;
        this.f1526r = c0237s;
        this.f1527s = c0246v.f1452r;
        this.f1528t = c0246v.f1453s;
        this.f1529u = c0246v.f1454t;
        this.f1530v = c0246v.f1455u;
        this.f1531w = c0246v.f1456v;
        int i10 = c0246v.f1457w;
        this.f1532x = i10 == -1 ? 0 : i10;
        float f8 = c0246v.f1458x;
        this.f1533y = f8 == -1.0f ? 1.0f : f8;
        this.f1534z = c0246v.f1459y;
        this.f1496A = c0246v.f1460z;
        this.f1497B = c0246v.f1424A;
        this.f1498C = c0246v.f1425B;
        this.f1499D = c0246v.f1426C;
        this.f1500E = c0246v.f1427D;
        int i11 = c0246v.f1428E;
        this.f1501F = i11 == -1 ? 0 : i11;
        int i12 = c0246v.f1429F;
        this.f1502G = i12 != -1 ? i12 : 0;
        this.f1503H = c0246v.f1430G;
        this.f1504I = c0246v.f1431H;
        this.f1505J = c0246v.f1432I;
        this.f1506K = c0246v.f1433J;
        int i13 = c0246v.f1434K;
        if (i13 != 0 || c0237s == null) {
            this.f1507L = i13;
        } else {
            this.f1507L = 1;
        }
    }

    /* renamed from: b */
    public static C0249w m690b(Bundle bundle) {
        C0246v c0246v = new C0246v();
        if (bundle != null) {
            ClassLoader classLoader = AbstractC1101a.class.getClassLoader();
            int i = AbstractC1118i0.f4750a;
            bundle.setClassLoader(classLoader);
        }
        String string = bundle.getString(f1462O);
        C0249w c0249w = f1461N;
        String str = c0249w.f1509a;
        if (string == null) {
            string = str;
        }
        c0246v.f1435a = string;
        String string2 = bundle.getString(f1463P);
        String str2 = c0249w.f1510b;
        if (string2 == null) {
            string2 = str2;
        }
        c0246v.f1436b = string2;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1494u0);
        c0246v.f1437c = AbstractC0983m0.m2165j(parcelableArrayList == null ? C0981l1.f4211n : AbstractC1101a.m2366q(new C0222n(1), parcelableArrayList));
        String string3 = bundle.getString(f1464Q);
        String str3 = c0249w.f1512d;
        if (string3 == null) {
            string3 = str3;
        }
        c0246v.f1438d = string3;
        c0246v.f1439e = bundle.getInt(f1465R, c0249w.f1513e);
        c0246v.f1440f = bundle.getInt(f1466S, c0249w.f1514f);
        c0246v.f1441g = bundle.getInt(f1495v0, c0249w.f1515g);
        c0246v.f1442h = bundle.getInt(f1467T, c0249w.f1516h);
        c0246v.f1443i = bundle.getInt(f1468U, c0249w.f1517i);
        String string4 = bundle.getString(f1469V);
        String str4 = c0249w.f1519k;
        if (string4 == null) {
            string4 = str4;
        }
        c0246v.f1444j = string4;
        C0241t0 c0241t0 = (C0241t0) bundle.getParcelable(f1470W);
        C0241t0 c0241t02 = c0249w.f1520l;
        if (c0241t0 == null) {
            c0241t0 = c0241t02;
        }
        c0246v.f1445k = c0241t0;
        String string5 = bundle.getString(f1471X);
        String str5 = c0249w.f1521m;
        if (string5 == null) {
            string5 = str5;
        }
        c0246v.f1446l = AbstractC0244u0.m687p(string5);
        String string6 = bundle.getString(f1472Y);
        String str6 = c0249w.f1522n;
        if (string6 == null) {
            string6 = str6;
        }
        c0246v.f1447m = AbstractC0244u0.m687p(string6);
        c0246v.f1448n = bundle.getInt(f1473Z, c0249w.f1523o);
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        while (true) {
            byte[] byteArray = bundle.getByteArray(f1474a0 + "_" + Integer.toString(i4, 36));
            if (byteArray == null) {
                break;
            }
            arrayList.add(byteArray);
            i4++;
        }
        c0246v.f1450p = arrayList;
        c0246v.f1451q = (C0237s) bundle.getParcelable(f1475b0);
        c0246v.f1452r = bundle.getLong(f1476c0, c0249w.f1527s);
        c0246v.f1454t = bundle.getInt(f1477d0, c0249w.f1529u);
        c0246v.f1455u = bundle.getInt(f1478e0, c0249w.f1530v);
        c0246v.f1456v = bundle.getFloat(f1479f0, c0249w.f1531w);
        c0246v.f1457w = bundle.getInt(f1480g0, c0249w.f1532x);
        c0246v.f1458x = bundle.getFloat(f1481h0, c0249w.f1533y);
        c0246v.f1459y = bundle.getByteArray(f1482i0);
        c0246v.f1460z = bundle.getInt(f1483j0, c0249w.f1496A);
        Bundle bundle2 = bundle.getBundle(f1484k0);
        if (bundle2 != null) {
            c0246v.f1424A = new C0216l(bundle2.getInt(C0216l.f1179i, -1), bundle2.getInt(C0216l.f1180j, -1), bundle2.getInt(C0216l.f1181k, -1), bundle2.getInt(C0216l.f1183m, -1), bundle2.getInt(C0216l.f1184n, -1), bundle2.getByteArray(C0216l.f1182l));
        }
        c0246v.f1425B = bundle.getInt(f1485l0, c0249w.f1498C);
        c0246v.f1426C = bundle.getInt(f1486m0, c0249w.f1499D);
        c0246v.f1427D = bundle.getInt(f1487n0, c0249w.f1500E);
        c0246v.f1428E = bundle.getInt(f1488o0, c0249w.f1501F);
        c0246v.f1429F = bundle.getInt(f1489p0, c0249w.f1502G);
        c0246v.f1430G = bundle.getInt(f1490q0, c0249w.f1503H);
        c0246v.f1432I = bundle.getInt(f1492s0, c0249w.f1505J);
        c0246v.f1433J = bundle.getInt(f1493t0, c0249w.f1506K);
        c0246v.f1434K = bundle.getInt(f1491r0, c0249w.f1507L);
        return new C0249w(c0246v);
    }

    /* renamed from: e */
    public static String m691e(C0249w c0249w) {
        int i;
        String str;
        C0237s c0237s;
        if (c0249w == null) {
            return "null";
        }
        int i4 = c0249w.f1513e;
        AbstractC0983m0 abstractC0983m0 = c0249w.f1511c;
        String str2 = c0249w.f1512d;
        int i8 = c0249w.f1499D;
        int i9 = c0249w.f1498C;
        float f8 = c0249w.f1531w;
        C0216l c0216l = c0249w.f1497B;
        float f9 = c0249w.f1533y;
        int i10 = c0249w.f1530v;
        int i11 = c0249w.f1529u;
        C0237s c0237s2 = c0249w.f1526r;
        String str3 = c0249w.f1519k;
        int i12 = c0249w.f1518j;
        String str4 = c0249w.f1521m;
        int i13 = c0249w.f1514f;
        C0917e c0917e = new C0917e(String.valueOf(','));
        StringBuilder sb = new StringBuilder();
        sb.append("id=");
        sb.append(c0249w.f1509a);
        sb.append(", mimeType=");
        sb.append(c0249w.f1522n);
        if (str4 != null) {
            sb.append(", container=");
            sb.append(str4);
        }
        int i14 = -1;
        if (i12 != -1) {
            sb.append(", bitrate=");
            sb.append(i12);
        }
        if (str3 != null) {
            sb.append(", codecs=");
            sb.append(str3);
        }
        if (c0237s2 != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int i15 = 0;
            while (i15 < c0237s2.f1408m) {
                UUID uuid = c0237s2.f1405j[i15].f1325k;
                if (uuid.equals(AbstractC0213k.f1163b)) {
                    linkedHashSet.add("cenc");
                } else if (uuid.equals(AbstractC0213k.f1164c)) {
                    linkedHashSet.add("clearkey");
                } else if (uuid.equals(AbstractC0213k.f1166e)) {
                    linkedHashSet.add("playready");
                } else if (uuid.equals(AbstractC0213k.f1165d)) {
                    linkedHashSet.add("widevine");
                } else if (uuid.equals(AbstractC0213k.f1162a)) {
                    linkedHashSet.add("universal");
                } else {
                    c0237s = c0237s2;
                    linkedHashSet.add("unknown (" + uuid + ")");
                    i15++;
                    c0237s2 = c0237s;
                }
                c0237s = c0237s2;
                i15++;
                c0237s2 = c0237s;
            }
            sb.append(", drm=[");
            c0917e.m2084a(sb, linkedHashSet.iterator());
            sb.append(']');
            i14 = -1;
        }
        if (i11 != i14 && i10 != i14) {
            sb.append(", res=");
            sb.append(i11);
            sb.append("x");
            sb.append(i10);
        }
        double d8 = f9;
        int i16 = AbstractC1196c.f5074a;
        if (Math.copySign(d8 - 1.0d, 1.0d) > 0.001d && d8 != 1.0d && (!Double.isNaN(d8) || !Double.isNaN(1.0d))) {
            sb.append(", par=");
            Object[] objArr = {Float.valueOf(f9)};
            int i17 = AbstractC1118i0.f4750a;
            sb.append(String.format(Locale.US, "%.3f", objArr));
        }
        if (c0216l != null && ((c0216l.f1189e != -1 && c0216l.f1190f != -1) || c0216l.m634d())) {
            sb.append(", color=");
            sb.append(c0216l.m635h());
        }
        if (f8 != -1.0f) {
            sb.append(", fps=");
            sb.append(f8);
        }
        if (i9 != -1) {
            sb.append(", channels=");
            sb.append(i9);
        }
        if (i8 != -1) {
            sb.append(", sample_rate=");
            sb.append(i8);
        }
        if (str2 != null) {
            sb.append(", language=");
            sb.append(str2);
        }
        int i18 = 2;
        if (!abstractC0983m0.isEmpty()) {
            sb.append(", labels=[");
            c0917e.m2084a(sb, AbstractC1006u.m2206u(new C0222n(i18), abstractC0983m0).iterator());
            sb.append("]");
        }
        if (i4 != 0) {
            sb.append(", selectionFlags=[");
            int i19 = AbstractC1118i0.f4750a;
            ArrayList arrayList = new ArrayList();
            if ((i4 & 4) != 0) {
                arrayList.add("auto");
            }
            if ((i4 & 1) != 0) {
                arrayList.add("default");
            }
            if ((i4 & 2) != 0) {
                arrayList.add("forced");
            }
            c0917e.m2084a(sb, arrayList.iterator());
            sb.append("]");
        }
        if (i13 != 0) {
            sb.append(", roleFlags=[");
            int i20 = AbstractC1118i0.f4750a;
            ArrayList arrayList2 = new ArrayList();
            if ((i13 & 1) != 0) {
                arrayList2.add("main");
            }
            if ((i13 & 2) != 0) {
                arrayList2.add("alt");
            }
            if ((i13 & 4) != 0) {
                arrayList2.add("supplementary");
            }
            if ((i13 & 8) != 0) {
                arrayList2.add("commentary");
            }
            if ((i13 & 16) != 0) {
                arrayList2.add("dub");
            }
            if ((i13 & 32) != 0) {
                arrayList2.add("emergency");
            }
            if ((i13 & 64) != 0) {
                arrayList2.add("caption");
            }
            i = i13;
            if ((i & 128) != 0) {
                arrayList2.add("subtitle");
            }
            if ((i & 256) != 0) {
                arrayList2.add("sign");
            }
            if ((i & 512) != 0) {
                arrayList2.add("describes-video");
            }
            if ((i & 1024) != 0) {
                arrayList2.add("describes-music");
            }
            if ((i & 2048) != 0) {
                arrayList2.add("enhanced-intelligibility");
            }
            if ((i & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED) != 0) {
                arrayList2.add("transcribes-dialog");
            }
            if ((i & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED) != 0) {
                arrayList2.add("easy-read");
            }
            if ((i & 16384) != 0) {
                arrayList2.add("trick-play");
            }
            if ((i & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE) != 0) {
                arrayList2.add("auxiliary");
            }
            c0917e.m2084a(sb, arrayList2.iterator());
            sb.append("]");
        } else {
            i = i13;
        }
        if ((i & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_BYPASS_POSSIBLE) != 0) {
            sb.append(", auxiliaryTrackType=");
            int i21 = c0249w.f1515g;
            int i22 = AbstractC1118i0.f4750a;
            if (i21 == 0) {
                str = "undefined";
            } else if (i21 == 1) {
                str = "original";
            } else if (i21 == 2) {
                str = "depth-linear";
            } else if (i21 == 3) {
                str = "depth-inverse";
            } else {
                if (i21 != 4) {
                    throw new IllegalStateException("Unsupported auxiliary track type");
                }
                str = "depth metadata";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public final C0246v m692a() {
        C0246v c0246v = new C0246v();
        c0246v.f1435a = this.f1509a;
        c0246v.f1436b = this.f1510b;
        c0246v.f1437c = this.f1511c;
        c0246v.f1438d = this.f1512d;
        c0246v.f1439e = this.f1513e;
        c0246v.f1440f = this.f1514f;
        c0246v.f1442h = this.f1516h;
        c0246v.f1443i = this.f1517i;
        c0246v.f1444j = this.f1519k;
        c0246v.f1445k = this.f1520l;
        c0246v.f1446l = this.f1521m;
        c0246v.f1447m = this.f1522n;
        c0246v.f1448n = this.f1523o;
        c0246v.f1449o = this.f1524p;
        c0246v.f1450p = this.f1525q;
        c0246v.f1451q = this.f1526r;
        c0246v.f1452r = this.f1527s;
        c0246v.f1453s = this.f1528t;
        c0246v.f1454t = this.f1529u;
        c0246v.f1455u = this.f1530v;
        c0246v.f1456v = this.f1531w;
        c0246v.f1457w = this.f1532x;
        c0246v.f1458x = this.f1533y;
        c0246v.f1459y = this.f1534z;
        c0246v.f1460z = this.f1496A;
        c0246v.f1424A = this.f1497B;
        c0246v.f1425B = this.f1498C;
        c0246v.f1426C = this.f1499D;
        c0246v.f1427D = this.f1500E;
        c0246v.f1428E = this.f1501F;
        c0246v.f1429F = this.f1502G;
        c0246v.f1430G = this.f1503H;
        c0246v.f1431H = this.f1504I;
        c0246v.f1432I = this.f1505J;
        c0246v.f1433J = this.f1506K;
        c0246v.f1434K = this.f1507L;
        return c0246v;
    }

    /* renamed from: c */
    public final boolean m693c(C0249w c0249w) {
        List list = this.f1525q;
        if (list.size() != c0249w.f1525q.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) c0249w.f1525q.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public final Bundle m694d(boolean z7) {
        Bundle bundle = new Bundle();
        bundle.putString(f1462O, this.f1509a);
        bundle.putString(f1463P, this.f1510b);
        AbstractC0983m0 abstractC0983m0 = this.f1511c;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(abstractC0983m0.size());
        int size = abstractC0983m0.size();
        int i = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = abstractC0983m0.get(i4);
            i4++;
            C0258z c0258z = (C0258z) obj;
            c0258z.getClass();
            Bundle bundle2 = new Bundle();
            String str = c0258z.f1555a;
            if (str != null) {
                bundle2.putString(C0258z.f1553c, str);
            }
            bundle2.putString(C0258z.f1554d, c0258z.f1556b);
            arrayList.add(bundle2);
        }
        bundle.putParcelableArrayList(f1494u0, arrayList);
        bundle.putString(f1464Q, this.f1512d);
        bundle.putInt(f1465R, this.f1513e);
        bundle.putInt(f1466S, this.f1514f);
        int i8 = f1461N.f1515g;
        int i9 = this.f1515g;
        if (i9 != i8) {
            bundle.putInt(f1495v0, i9);
        }
        bundle.putInt(f1467T, this.f1516h);
        bundle.putInt(f1468U, this.f1517i);
        bundle.putString(f1469V, this.f1519k);
        if (!z7) {
            bundle.putParcelable(f1470W, this.f1520l);
        }
        bundle.putString(f1471X, this.f1521m);
        bundle.putString(f1472Y, this.f1522n);
        bundle.putInt(f1473Z, this.f1523o);
        while (true) {
            List list = this.f1525q;
            if (i >= list.size()) {
                break;
            }
            bundle.putByteArray(f1474a0 + "_" + Integer.toString(i, 36), (byte[]) list.get(i));
            i++;
        }
        bundle.putParcelable(f1475b0, this.f1526r);
        bundle.putLong(f1476c0, this.f1527s);
        bundle.putInt(f1477d0, this.f1529u);
        bundle.putInt(f1478e0, this.f1530v);
        bundle.putFloat(f1479f0, this.f1531w);
        bundle.putInt(f1480g0, this.f1532x);
        bundle.putFloat(f1481h0, this.f1533y);
        bundle.putByteArray(f1482i0, this.f1534z);
        bundle.putInt(f1483j0, this.f1496A);
        C0216l c0216l = this.f1497B;
        if (c0216l != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putInt(C0216l.f1179i, c0216l.f1185a);
            bundle3.putInt(C0216l.f1180j, c0216l.f1186b);
            bundle3.putInt(C0216l.f1181k, c0216l.f1187c);
            bundle3.putByteArray(C0216l.f1182l, c0216l.f1188d);
            bundle3.putInt(C0216l.f1183m, c0216l.f1189e);
            bundle3.putInt(C0216l.f1184n, c0216l.f1190f);
            bundle.putBundle(f1484k0, bundle3);
        }
        bundle.putInt(f1485l0, this.f1498C);
        bundle.putInt(f1486m0, this.f1499D);
        bundle.putInt(f1487n0, this.f1500E);
        bundle.putInt(f1488o0, this.f1501F);
        bundle.putInt(f1489p0, this.f1502G);
        bundle.putInt(f1490q0, this.f1503H);
        bundle.putInt(f1492s0, this.f1505J);
        bundle.putInt(f1493t0, this.f1506K);
        bundle.putInt(f1491r0, this.f1507L);
        return bundle;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || C0249w.class != obj.getClass()) {
            return false;
        }
        C0249w c0249w = (C0249w) obj;
        int i4 = this.f1508M;
        return (i4 == 0 || (i = c0249w.f1508M) == 0 || i4 == i) && this.f1513e == c0249w.f1513e && this.f1514f == c0249w.f1514f && this.f1515g == c0249w.f1515g && this.f1516h == c0249w.f1516h && this.f1517i == c0249w.f1517i && this.f1523o == c0249w.f1523o && this.f1527s == c0249w.f1527s && this.f1529u == c0249w.f1529u && this.f1530v == c0249w.f1530v && this.f1532x == c0249w.f1532x && this.f1496A == c0249w.f1496A && this.f1498C == c0249w.f1498C && this.f1499D == c0249w.f1499D && this.f1500E == c0249w.f1500E && this.f1501F == c0249w.f1501F && this.f1502G == c0249w.f1502G && this.f1503H == c0249w.f1503H && this.f1505J == c0249w.f1505J && this.f1506K == c0249w.f1506K && this.f1507L == c0249w.f1507L && Float.compare(this.f1531w, c0249w.f1531w) == 0 && Float.compare(this.f1533y, c0249w.f1533y) == 0 && Objects.equals(this.f1509a, c0249w.f1509a) && Objects.equals(this.f1510b, c0249w.f1510b) && this.f1511c.equals(c0249w.f1511c) && Objects.equals(this.f1519k, c0249w.f1519k) && Objects.equals(this.f1521m, c0249w.f1521m) && Objects.equals(this.f1522n, c0249w.f1522n) && Objects.equals(this.f1512d, c0249w.f1512d) && Arrays.equals(this.f1534z, c0249w.f1534z) && Objects.equals(this.f1520l, c0249w.f1520l) && Objects.equals(this.f1497B, c0249w.f1497B) && Objects.equals(this.f1526r, c0249w.f1526r) && m693c(c0249w);
    }

    /* renamed from: f */
    public final C0249w m695f(C0249w c0249w) {
        String str;
        String str2;
        int i;
        int i4;
        if (this == c0249w) {
            return this;
        }
        int iM680i = AbstractC0244u0.m680i(this.f1522n);
        String str3 = c0249w.f1509a;
        C0241t0 c0241t0M669b = c0249w.f1520l;
        AbstractC0983m0 abstractC0983m0 = c0249w.f1511c;
        int i8 = c0249w.f1505J;
        int i9 = c0249w.f1506K;
        String str4 = c0249w.f1510b;
        if (str4 == null) {
            str4 = this.f1510b;
        }
        if (abstractC0983m0.isEmpty()) {
            abstractC0983m0 = this.f1511c;
        }
        if ((iM680i != 3 && iM680i != 1) || (str = c0249w.f1512d) == null) {
            str = this.f1512d;
        }
        int i10 = this.f1516h;
        if (i10 == -1) {
            i10 = c0249w.f1516h;
        }
        int i11 = this.f1517i;
        if (i11 == -1) {
            i11 = c0249w.f1517i;
        }
        String str5 = this.f1519k;
        if (str5 == null) {
            String strM2464w = AbstractC1118i0.m2464w(iM680i, c0249w.f1519k);
            if (AbstractC1118i0.m2443d0(strM2464w).length == 1) {
                str5 = strM2464w;
            }
        }
        C0241t0 c0241t0 = this.f1520l;
        if (c0241t0 != null) {
            c0241t0M669b = c0241t0.m669b(c0241t0M669b);
        }
        float f8 = this.f1531w;
        if (f8 == -1.0f && iM680i == 2) {
            f8 = c0249w.f1531w;
        }
        int i12 = this.f1513e | c0249w.f1513e;
        int i13 = this.f1514f | c0249w.f1514f;
        C0237s c0237s = c0249w.f1526r;
        ArrayList arrayList = new ArrayList();
        AbstractC0983m0 abstractC0983m02 = abstractC0983m0;
        if (c0237s != null) {
            String str6 = c0237s.f1407l;
            C0234r[] c0234rArr = c0237s.f1405j;
            int length = c0234rArr.length;
            int i14 = 0;
            while (i14 < length) {
                int i15 = i14;
                C0234r c0234r = c0234rArr[i15];
                int i16 = length;
                if (c0234r.f1328n != null) {
                    arrayList.add(c0234r);
                }
                i14 = i15 + 1;
                length = i16;
            }
            str2 = str6;
        } else {
            str2 = null;
        }
        C0237s c0237s2 = this.f1526r;
        if (c0237s2 != null) {
            if (str2 == null) {
                str2 = c0237s2.f1407l;
            }
            int size = arrayList.size();
            C0234r[] c0234rArr2 = c0237s2.f1405j;
            String str7 = str2;
            int length2 = c0234rArr2.length;
            int i17 = 0;
            while (i17 < length2) {
                int i18 = i17;
                C0234r c0234r2 = c0234rArr2[i18];
                int i19 = length2;
                if (c0234r2.f1328n != null) {
                    UUID uuid = c0234r2.f1325k;
                    i4 = i9;
                    int i20 = 0;
                    while (true) {
                        if (i20 >= size) {
                            i = size;
                            arrayList.add(c0234r2);
                            break;
                        }
                        i = size;
                        if (((C0234r) arrayList.get(i20)).f1325k.equals(uuid)) {
                            break;
                        }
                        i20++;
                        size = i;
                    }
                } else {
                    i = size;
                    i4 = i9;
                }
                i17 = i18 + 1;
                length2 = i19;
                i9 = i4;
                size = i;
            }
            str2 = str7;
        }
        int i21 = i9;
        C0237s c0237s3 = arrayList.isEmpty() ? null : new C0237s(str2, arrayList);
        C0246v c0246vM692a = m692a();
        c0246vM692a.f1435a = str3;
        c0246vM692a.f1436b = str4;
        c0246vM692a.f1437c = AbstractC0983m0.m2165j(abstractC0983m02);
        c0246vM692a.f1438d = str;
        c0246vM692a.f1439e = i12;
        c0246vM692a.f1440f = i13;
        c0246vM692a.f1442h = i10;
        c0246vM692a.f1443i = i11;
        c0246vM692a.f1444j = str5;
        c0246vM692a.f1445k = c0241t0M669b;
        c0246vM692a.f1451q = c0237s3;
        c0246vM692a.f1456v = f8;
        c0246vM692a.f1432I = i8;
        c0246vM692a.f1433J = i21;
        return new C0249w(c0246vM692a);
    }

    public final int hashCode() {
        if (this.f1508M == 0) {
            String str = this.f1509a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f1510b;
            int iHashCode2 = (this.f1511c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            String str3 = this.f1512d;
            int iHashCode3 = (((((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f1513e) * 31) + this.f1514f) * 31) + this.f1515g) * 31) + this.f1516h) * 31) + this.f1517i) * 31;
            String str4 = this.f1519k;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            C0241t0 c0241t0 = this.f1520l;
            int iHashCode5 = (iHashCode4 + (c0241t0 == null ? 0 : c0241t0.hashCode())) * 961;
            String str5 = this.f1521m;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f1522n;
            this.f1508M = ((((((((((((((((((((Float.floatToIntBits(this.f1533y) + ((((Float.floatToIntBits(this.f1531w) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.f1523o) * 31) + ((int) this.f1527s)) * 31) + this.f1529u) * 31) + this.f1530v) * 31)) * 31) + this.f1532x) * 31)) * 31) + this.f1496A) * 31) + this.f1498C) * 31) + this.f1499D) * 31) + this.f1500E) * 31) + this.f1501F) * 31) + this.f1502G) * 31) + this.f1503H) * 31) + this.f1505J) * 31) + this.f1506K) * 31) + this.f1507L;
        }
        return this.f1508M;
    }

    public final String toString() {
        return "Format(" + this.f1509a + ", " + this.f1510b + ", " + this.f1521m + ", " + this.f1522n + ", " + this.f1519k + ", " + this.f1518j + ", " + this.f1512d + ", [" + this.f1529u + ", " + this.f1530v + ", " + this.f1531w + ", " + this.f1497B + "], [" + this.f1498C + ", " + this.f1499D + "])";
    }
}
