package androidx.media3.common;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import okhttp3.C2181z;
import p002a1.C0036o;
import p005a4.C0073c;
import p052f6.AbstractC0946a;
import p052f6.AbstractC0983m0;
import p052f6.AbstractC0995q0;
import p052f6.AbstractC1023z1;
import p052f6.C0974j0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p052f6.C0987n1;
import p052f6.C0996q1;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.common.o0 */
/* loaded from: classes.dex */
public final class C0226o0 {

    /* renamed from: g */
    public static final C0226o0 f1231g;

    /* renamed from: h */
    public static final String f1232h;

    /* renamed from: i */
    public static final String f1233i;

    /* renamed from: j */
    public static final String f1234j;

    /* renamed from: k */
    public static final String f1235k;

    /* renamed from: l */
    public static final String f1236l;

    /* renamed from: m */
    public static final String f1237m;

    /* renamed from: a */
    public final String f1238a;

    /* renamed from: b */
    public final C0211j0 f1239b;

    /* renamed from: c */
    public final C0208i0 f1240c;

    /* renamed from: d */
    public final C0235r0 f1241d;

    /* renamed from: e */
    public final C0196e0 f1242e;

    /* renamed from: f */
    public final C0214k0 f1243f;

    static {
        C0188c0 c0188c0 = new C0188c0();
        C0977k0 c0977k0 = AbstractC0983m0.f4215k;
        C0981l1 c0981l1 = C0981l1.f4211n;
        List list = Collections.EMPTY_LIST;
        C0981l1 c0981l12 = C0981l1.f4211n;
        C0205h0 c0205h0 = new C0205h0();
        f1231g = new C0226o0(C2181z.FRAGMENT_ENCODE_SET, new C0196e0(c0188c0), null, new C0208i0(c0205h0), C0235r0.f1329K, C0214k0.f1167d);
        f1232h = Integer.toString(0, 36);
        f1233i = Integer.toString(1, 36);
        f1234j = Integer.toString(2, 36);
        f1235k = Integer.toString(3, 36);
        f1236l = Integer.toString(4, 36);
        f1237m = Integer.toString(5, 36);
    }

    public C0226o0(String str, C0196e0 c0196e0, C0211j0 c0211j0, C0208i0 c0208i0, C0235r0 c0235r0, C0214k0 c0214k0) {
        this.f1238a = str;
        this.f1239b = c0211j0;
        this.f1240c = c0208i0;
        this.f1241d = c0235r0;
        this.f1242e = c0196e0;
        this.f1243f = c0214k0;
    }

    /* renamed from: b */
    public static C0226o0 m650b(Bundle bundle) {
        C0235r0 c0235r0;
        Bundle bundle2;
        Bundle bundle3;
        C0208i0 c0208i0;
        C0196e0 c0196e0;
        C0214k0 c0214k0;
        Map mapM2182a;
        C0202g0 c0202g0;
        C0981l1 c0981l1M2159f;
        C0981l1 c0981l1M2366q;
        C0211j0 c0211j0;
        String string = bundle.getString(f1232h, C2181z.FRAGMENT_ENCODE_SET);
        string.getClass();
        Bundle bundle4 = bundle.getBundle(f1233i);
        C0208i0 c0208i0M625b = bundle4 == null ? C0208i0.f1122f : C0208i0.m625b(bundle4);
        Bundle bundle5 = bundle.getBundle(f1234j);
        boolean z7 = false;
        C0170a0 c0170a0 = null;
        if (bundle5 == null) {
            c0235r0 = C0235r0.f1329K;
        } else {
            C0232q0 c0232q0 = new C0232q0();
            c0232q0.f1291a = bundle5.getCharSequence(C0235r0.f1330L);
            c0232q0.f1292b = bundle5.getCharSequence(C0235r0.f1331M);
            c0232q0.f1293c = bundle5.getCharSequence(C0235r0.f1332N);
            c0232q0.f1294d = bundle5.getCharSequence(C0235r0.f1333O);
            c0232q0.f1295e = bundle5.getCharSequence(C0235r0.f1334P);
            c0232q0.f1296f = bundle5.getCharSequence(C0235r0.f1335Q);
            c0232q0.f1297g = bundle5.getCharSequence(C0235r0.f1336R);
            byte[] byteArray = bundle5.getByteArray(C0235r0.f1339U);
            String str = C0235r0.f1358n0;
            Integer numValueOf = bundle5.containsKey(str) ? Integer.valueOf(bundle5.getInt(str)) : null;
            c0232q0.f1301k = byteArray == null ? null : (byte[]) byteArray.clone();
            c0232q0.f1302l = numValueOf;
            c0232q0.f1303m = (Uri) bundle5.getParcelable(C0235r0.f1340V);
            c0232q0.f1315y = bundle5.getCharSequence(C0235r0.f1351g0);
            c0232q0.f1316z = bundle5.getCharSequence(C0235r0.f1352h0);
            c0232q0.f1282A = bundle5.getCharSequence(C0235r0.f1353i0);
            c0232q0.f1285D = bundle5.getCharSequence(C0235r0.f1356l0);
            c0232q0.f1286E = bundle5.getCharSequence(C0235r0.f1357m0);
            c0232q0.f1287F = bundle5.getCharSequence(C0235r0.f1359o0);
            c0232q0.f1289H = bundle5.getBundle(C0235r0.f1364t0);
            String str2 = C0235r0.f1337S;
            if (bundle5.containsKey(str2) && (bundle3 = bundle5.getBundle(str2)) != null) {
                c0232q0.f1299i = AbstractC0206h1.m621a(bundle3);
            }
            String str3 = C0235r0.f1338T;
            if (bundle5.containsKey(str3) && (bundle2 = bundle5.getBundle(str3)) != null) {
                c0232q0.f1300j = AbstractC0206h1.m621a(bundle2);
            }
            String str4 = C0235r0.f1362r0;
            if (bundle5.containsKey(str4)) {
                long j = bundle5.getLong(str4);
                Long lValueOf = Long.valueOf(j);
                AbstractC1101a.m2353d(j >= 0);
                c0232q0.f1298h = lValueOf;
            }
            String str5 = C0235r0.f1341W;
            if (bundle5.containsKey(str5)) {
                c0232q0.f1304n = Integer.valueOf(bundle5.getInt(str5));
            }
            String str6 = C0235r0.f1342X;
            if (bundle5.containsKey(str6)) {
                c0232q0.f1305o = Integer.valueOf(bundle5.getInt(str6));
            }
            String str7 = C0235r0.f1343Y;
            if (bundle5.containsKey(str7)) {
                c0232q0.f1306p = Integer.valueOf(bundle5.getInt(str7));
            }
            String str8 = C0235r0.f1361q0;
            if (bundle5.containsKey(str8)) {
                c0232q0.f1307q = Boolean.valueOf(bundle5.getBoolean(str8));
            }
            String str9 = C0235r0.f1344Z;
            if (bundle5.containsKey(str9)) {
                c0232q0.f1308r = Boolean.valueOf(bundle5.getBoolean(str9));
            }
            String str10 = C0235r0.f1345a0;
            if (bundle5.containsKey(str10)) {
                c0232q0.f1309s = Integer.valueOf(bundle5.getInt(str10));
            }
            String str11 = C0235r0.f1346b0;
            if (bundle5.containsKey(str11)) {
                c0232q0.f1310t = Integer.valueOf(bundle5.getInt(str11));
            }
            String str12 = C0235r0.f1347c0;
            if (bundle5.containsKey(str12)) {
                c0232q0.f1311u = Integer.valueOf(bundle5.getInt(str12));
            }
            String str13 = C0235r0.f1348d0;
            if (bundle5.containsKey(str13)) {
                c0232q0.f1312v = Integer.valueOf(bundle5.getInt(str13));
            }
            String str14 = C0235r0.f1349e0;
            if (bundle5.containsKey(str14)) {
                c0232q0.f1313w = Integer.valueOf(bundle5.getInt(str14));
            }
            String str15 = C0235r0.f1350f0;
            if (bundle5.containsKey(str15)) {
                c0232q0.f1314x = Integer.valueOf(bundle5.getInt(str15));
            }
            String str16 = C0235r0.f1354j0;
            if (bundle5.containsKey(str16)) {
                c0232q0.f1283B = Integer.valueOf(bundle5.getInt(str16));
            }
            String str17 = C0235r0.f1355k0;
            if (bundle5.containsKey(str17)) {
                c0232q0.f1284C = Integer.valueOf(bundle5.getInt(str17));
            }
            String str18 = C0235r0.f1360p0;
            if (bundle5.containsKey(str18)) {
                c0232q0.f1288G = Integer.valueOf(bundle5.getInt(str18));
            }
            ArrayList<String> stringArrayList = bundle5.getStringArrayList(C0235r0.f1363s0);
            if (stringArrayList != null) {
                c0232q0.f1290I = AbstractC0983m0.m2165j(stringArrayList);
            }
            c0235r0 = new C0235r0(c0232q0);
        }
        Bundle bundle6 = bundle.getBundle(f1235k);
        if (bundle6 == null) {
            c0196e0 = C0196e0.f1089p;
            c0208i0 = c0208i0M625b;
        } else {
            C0188c0 c0188c0 = new C0188c0();
            String str19 = C0192d0.f1071i;
            C0192d0 c0192d0 = C0192d0.f1070h;
            long j8 = c0192d0.f1078a;
            long j9 = c0192d0.f1081d;
            c0208i0 = c0208i0M625b;
            long j10 = c0192d0.f1079b;
            long jM2428S = AbstractC1118i0.m2428S(bundle6.getLong(str19, j8));
            AbstractC1101a.m2353d(jM2428S >= 0);
            c0188c0.f1056a = jM2428S;
            long jM2428S2 = AbstractC1118i0.m2428S(bundle6.getLong(C0192d0.f1072j, c0192d0.f1080c));
            AbstractC1101a.m2353d(jM2428S2 == Long.MIN_VALUE || jM2428S2 >= 0);
            c0188c0.f1057b = jM2428S2;
            c0188c0.f1058c = bundle6.getBoolean(C0192d0.f1073k, c0192d0.f1082e);
            c0188c0.f1059d = bundle6.getBoolean(C0192d0.f1074l, c0192d0.f1083f);
            c0188c0.f1060e = bundle6.getBoolean(C0192d0.f1075m, c0192d0.f1084g);
            long j11 = bundle6.getLong(C0192d0.f1076n, j10);
            if (j11 != j10) {
                AbstractC1101a.m2353d(j11 >= 0);
                c0188c0.f1056a = j11;
            }
            long j12 = bundle6.getLong(C0192d0.f1077o, j9);
            if (j12 != j9) {
                AbstractC1101a.m2353d(j12 == Long.MIN_VALUE || j12 >= 0);
                c0188c0.f1057b = j12;
            }
            c0196e0 = new C0196e0(c0188c0);
        }
        Bundle bundle7 = bundle.getBundle(f1236l);
        if (bundle7 == null) {
            c0214k0 = C0214k0.f1167d;
        } else {
            C0073c c0073c = new C0073c(4);
            c0073c.f324k = (Uri) bundle7.getParcelable(C0214k0.f1168e);
            c0073c.f325l = bundle7.getString(C0214k0.f1169f);
            c0073c.f326m = bundle7.getBundle(C0214k0.f1170g);
            c0214k0 = new C0214k0(c0073c);
        }
        C0214k0 c0214k02 = c0214k0;
        Bundle bundle8 = bundle.getBundle(f1237m);
        if (bundle8 == null) {
            c0211j0 = null;
        } else {
            Bundle bundle9 = bundle8.getBundle(C0211j0.f1141l);
            if (bundle9 == null) {
                c0202g0 = null;
            } else {
                String string2 = bundle9.getString(C0202g0.f1100i);
                string2.getClass();
                UUID uuidFromString = UUID.fromString(string2);
                Uri uri = (Uri) bundle9.getParcelable(C0202g0.f1101j);
                String str20 = C0202g0.f1102k;
                Bundle bundle10 = Bundle.EMPTY;
                Bundle bundle11 = bundle9.getBundle(str20);
                if (bundle11 == null) {
                    bundle11 = bundle10;
                }
                if (bundle11 == bundle10) {
                    mapM2182a = C0996q1.f4246p;
                } else {
                    HashMap map = new HashMap();
                    if (bundle11 != bundle10) {
                        for (String str21 : bundle11.keySet()) {
                            String string3 = bundle11.getString(str21);
                            if (string3 != null) {
                                map.put(str21, string3);
                            }
                        }
                    }
                    mapM2182a = AbstractC0995q0.m2182a(map);
                }
                boolean z8 = bundle9.getBoolean(C0202g0.f1103l, false);
                boolean z9 = bundle9.getBoolean(C0202g0.f1104m, false);
                boolean z10 = bundle9.getBoolean(C0202g0.f1105n, false);
                String str22 = C0202g0.f1106o;
                ArrayList<Integer> arrayList = new ArrayList<>();
                ArrayList<Integer> integerArrayList = bundle9.getIntegerArrayList(str22);
                if (integerArrayList != null) {
                    arrayList = integerArrayList;
                }
                AbstractC0983m0 abstractC0983m0M2165j = AbstractC0983m0.m2165j(arrayList);
                byte[] byteArray2 = bundle9.getByteArray(C0202g0.f1107p);
                C0199f0 c0199f0 = new C0199f0();
                c0199f0.f1090a = uuidFromString;
                c0199f0.f1091b = uri;
                c0199f0.f1092c = AbstractC0995q0.m2182a(mapM2182a);
                c0199f0.f1093d = z8;
                c0199f0.f1095f = z10;
                c0199f0.f1094e = z9;
                c0199f0.f1096g = AbstractC0983m0.m2165j(abstractC0983m0M2165j);
                c0199f0.f1097h = byteArray2 != null ? Arrays.copyOf(byteArray2, byteArray2.length) : null;
                c0202g0 = new C0202g0(c0199f0);
            }
            Bundle bundle12 = bundle8.getBundle(C0211j0.f1142m);
            if (bundle12 != null) {
                Uri uri2 = (Uri) bundle12.getParcelable(C0170a0.f973b);
                uri2.getClass();
                C0036o c0036o = new C0036o(9, z7);
                c0036o.f143k = uri2;
                c0170a0 = new C0170a0(c0036o);
            }
            C0170a0 c0170a02 = c0170a0;
            ArrayList parcelableArrayList = bundle8.getParcelableArrayList(C0211j0.f1143n);
            if (parcelableArrayList == null) {
                C0977k0 c0977k0 = AbstractC0983m0.f4215k;
                c0981l1M2159f = C0981l1.f4211n;
            } else {
                C0974j0 c0974j0M2164i = AbstractC0983m0.m2164i();
                for (int i = 0; i < parcelableArrayList.size(); i++) {
                    Bundle bundle13 = (Bundle) parcelableArrayList.get(i);
                    bundle13.getClass();
                    c0974j0M2164i.m2141a(new C0212j1(bundle13.getInt(C0212j1.f1156m, 0), bundle13.getInt(C0212j1.f1157n, 0), bundle13.getInt(C0212j1.f1158o, 0)));
                }
                c0981l1M2159f = c0974j0M2164i.m2159f();
            }
            C0981l1 c0981l1 = c0981l1M2159f;
            ArrayList parcelableArrayList2 = bundle8.getParcelableArrayList(C0211j0.f1145p);
            if (parcelableArrayList2 == null) {
                C0977k0 c0977k02 = AbstractC0983m0.f4215k;
                c0981l1M2366q = C0981l1.f4211n;
            } else {
                c0981l1M2366q = AbstractC1101a.m2366q(new C0222n(5), parcelableArrayList2);
            }
            C0981l1 c0981l12 = c0981l1M2366q;
            long j13 = bundle8.getLong(C0211j0.f1146q, -9223372036854775807L);
            Uri uri3 = (Uri) bundle8.getParcelable(C0211j0.f1139j);
            uri3.getClass();
            c0211j0 = new C0211j0(uri3, bundle8.getString(C0211j0.f1140k), c0202g0, c0170a02, c0981l1, bundle8.getString(C0211j0.f1144o), c0981l12, null, j13);
        }
        return new C0226o0(string, c0196e0, c0211j0, c0208i0, c0235r0, c0214k02);
    }

    /* renamed from: c */
    public static C0226o0 m651c(Uri uri) {
        C0211j0 c0211j0;
        C0188c0 c0188c0 = new C0188c0();
        C0199f0 c0199f0 = new C0199f0();
        List list = Collections.EMPTY_LIST;
        C0981l1 c0981l1 = C0981l1.f4211n;
        C0205h0 c0205h0 = new C0205h0();
        C0214k0 c0214k0 = C0214k0.f1167d;
        AbstractC1101a.m2359j(c0199f0.f1091b == null || c0199f0.f1090a != null);
        C0202g0 c0202g0 = null;
        if (uri != null) {
            if (c0199f0.f1090a != null) {
                c0202g0 = new C0202g0(c0199f0);
            }
            c0211j0 = new C0211j0(uri, null, c0202g0, null, list, null, c0981l1, null, -9223372036854775807L);
        } else {
            c0211j0 = null;
        }
        return new C0226o0(C2181z.FRAGMENT_ENCODE_SET, new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0);
    }

    /* renamed from: a */
    public final C0184b0 m652a() {
        C0184b0 c0184b0 = new C0184b0();
        c0184b0.f1033d = new C0188c0();
        c0184b0.f1034e = new C0199f0();
        c0184b0.f1035f = Collections.EMPTY_LIST;
        c0184b0.f1037h = C0981l1.f4211n;
        c0184b0.f1042m = new C0205h0();
        c0184b0.f1043n = C0214k0.f1167d;
        c0184b0.f1040k = -9223372036854775807L;
        C0188c0 c0188c0 = new C0188c0();
        C0196e0 c0196e0 = this.f1242e;
        c0188c0.f1056a = c0196e0.f1079b;
        c0188c0.f1057b = c0196e0.f1081d;
        c0188c0.f1058c = c0196e0.f1082e;
        c0188c0.f1059d = c0196e0.f1083f;
        c0188c0.f1060e = c0196e0.f1084g;
        c0184b0.f1033d = c0188c0;
        c0184b0.f1030a = this.f1238a;
        c0184b0.f1041l = this.f1241d;
        c0184b0.f1042m = this.f1240c.m626a();
        c0184b0.f1043n = this.f1243f;
        C0211j0 c0211j0 = this.f1239b;
        if (c0211j0 != null) {
            c0184b0.f1036g = c0211j0.f1152f;
            c0184b0.f1032c = c0211j0.f1148b;
            c0184b0.f1031b = c0211j0.f1147a;
            c0184b0.f1035f = c0211j0.f1151e;
            c0184b0.f1037h = c0211j0.f1153g;
            c0184b0.f1039j = c0211j0.f1154h;
            C0202g0 c0202g0 = c0211j0.f1149c;
            c0184b0.f1034e = c0202g0 != null ? c0202g0.m620a() : new C0199f0();
            c0184b0.f1038i = c0211j0.f1150d;
            c0184b0.f1040k = c0211j0.f1155i;
        }
        return c0184b0;
    }

    /* renamed from: d */
    public final Bundle m653d(boolean z7) {
        C0211j0 c0211j0;
        Bundle bundle = new Bundle();
        String str = this.f1238a;
        if (!str.equals(C2181z.FRAGMENT_ENCODE_SET)) {
            bundle.putString(f1232h, str);
        }
        C0208i0 c0208i0 = C0208i0.f1122f;
        C0208i0 c0208i02 = this.f1240c;
        if (!c0208i02.equals(c0208i0)) {
            bundle.putBundle(f1233i, c0208i02.m627c());
        }
        C0235r0 c0235r0 = C0235r0.f1329K;
        C0235r0 c0235r02 = this.f1241d;
        if (!c0235r02.equals(c0235r0)) {
            AbstractC0983m0 abstractC0983m0 = c0235r02.f1374J;
            Bundle bundle2 = new Bundle();
            CharSequence charSequence = c0235r02.f1375a;
            if (charSequence != null) {
                bundle2.putCharSequence(C0235r0.f1330L, charSequence);
            }
            CharSequence charSequence2 = c0235r02.f1376b;
            if (charSequence2 != null) {
                bundle2.putCharSequence(C0235r0.f1331M, charSequence2);
            }
            CharSequence charSequence3 = c0235r02.f1377c;
            if (charSequence3 != null) {
                bundle2.putCharSequence(C0235r0.f1332N, charSequence3);
            }
            CharSequence charSequence4 = c0235r02.f1378d;
            if (charSequence4 != null) {
                bundle2.putCharSequence(C0235r0.f1333O, charSequence4);
            }
            CharSequence charSequence5 = c0235r02.f1379e;
            if (charSequence5 != null) {
                bundle2.putCharSequence(C0235r0.f1334P, charSequence5);
            }
            CharSequence charSequence6 = c0235r02.f1380f;
            if (charSequence6 != null) {
                bundle2.putCharSequence(C0235r0.f1335Q, charSequence6);
            }
            CharSequence charSequence7 = c0235r02.f1381g;
            if (charSequence7 != null) {
                bundle2.putCharSequence(C0235r0.f1336R, charSequence7);
            }
            Long l8 = c0235r02.f1382h;
            if (l8 != null) {
                bundle2.putLong(C0235r0.f1362r0, l8.longValue());
            }
            byte[] bArr = c0235r02.f1385k;
            if (bArr != null) {
                bundle2.putByteArray(C0235r0.f1339U, bArr);
            }
            Uri uri = c0235r02.f1387m;
            if (uri != null) {
                bundle2.putParcelable(C0235r0.f1340V, uri);
            }
            CharSequence charSequence8 = c0235r02.f1400z;
            if (charSequence8 != null) {
                bundle2.putCharSequence(C0235r0.f1351g0, charSequence8);
            }
            CharSequence charSequence9 = c0235r02.f1365A;
            if (charSequence9 != null) {
                bundle2.putCharSequence(C0235r0.f1352h0, charSequence9);
            }
            CharSequence charSequence10 = c0235r02.f1366B;
            if (charSequence10 != null) {
                bundle2.putCharSequence(C0235r0.f1353i0, charSequence10);
            }
            CharSequence charSequence11 = c0235r02.f1369E;
            if (charSequence11 != null) {
                bundle2.putCharSequence(C0235r0.f1356l0, charSequence11);
            }
            CharSequence charSequence12 = c0235r02.f1370F;
            if (charSequence12 != null) {
                bundle2.putCharSequence(C0235r0.f1357m0, charSequence12);
            }
            CharSequence charSequence13 = c0235r02.f1371G;
            if (charSequence13 != null) {
                bundle2.putCharSequence(C0235r0.f1359o0, charSequence13);
            }
            AbstractC0206h1 abstractC0206h1 = c0235r02.f1383i;
            if (abstractC0206h1 != null) {
                bundle2.putBundle(C0235r0.f1337S, abstractC0206h1.mo622b());
            }
            AbstractC0206h1 abstractC0206h12 = c0235r02.f1384j;
            if (abstractC0206h12 != null) {
                bundle2.putBundle(C0235r0.f1338T, abstractC0206h12.mo622b());
            }
            Integer num = c0235r02.f1388n;
            if (num != null) {
                bundle2.putInt(C0235r0.f1341W, num.intValue());
            }
            Integer num2 = c0235r02.f1389o;
            if (num2 != null) {
                bundle2.putInt(C0235r0.f1342X, num2.intValue());
            }
            Integer num3 = c0235r02.f1390p;
            if (num3 != null) {
                bundle2.putInt(C0235r0.f1343Y, num3.intValue());
            }
            Boolean bool = c0235r02.f1391q;
            if (bool != null) {
                bundle2.putBoolean(C0235r0.f1361q0, bool.booleanValue());
            }
            Boolean bool2 = c0235r02.f1392r;
            if (bool2 != null) {
                bundle2.putBoolean(C0235r0.f1344Z, bool2.booleanValue());
            }
            Integer num4 = c0235r02.f1394t;
            if (num4 != null) {
                bundle2.putInt(C0235r0.f1345a0, num4.intValue());
            }
            Integer num5 = c0235r02.f1395u;
            if (num5 != null) {
                bundle2.putInt(C0235r0.f1346b0, num5.intValue());
            }
            Integer num6 = c0235r02.f1396v;
            if (num6 != null) {
                bundle2.putInt(C0235r0.f1347c0, num6.intValue());
            }
            Integer num7 = c0235r02.f1397w;
            if (num7 != null) {
                bundle2.putInt(C0235r0.f1348d0, num7.intValue());
            }
            Integer num8 = c0235r02.f1398x;
            if (num8 != null) {
                bundle2.putInt(C0235r0.f1349e0, num8.intValue());
            }
            Integer num9 = c0235r02.f1399y;
            if (num9 != null) {
                bundle2.putInt(C0235r0.f1350f0, num9.intValue());
            }
            Integer num10 = c0235r02.f1367C;
            if (num10 != null) {
                bundle2.putInt(C0235r0.f1354j0, num10.intValue());
            }
            Integer num11 = c0235r02.f1368D;
            if (num11 != null) {
                bundle2.putInt(C0235r0.f1355k0, num11.intValue());
            }
            Integer num12 = c0235r02.f1386l;
            if (num12 != null) {
                bundle2.putInt(C0235r0.f1358n0, num12.intValue());
            }
            Integer num13 = c0235r02.f1372H;
            if (num13 != null) {
                bundle2.putInt(C0235r0.f1360p0, num13.intValue());
            }
            if (!abstractC0983m0.isEmpty()) {
                bundle2.putStringArrayList(C0235r0.f1363s0, new ArrayList<>(abstractC0983m0));
            }
            Bundle bundle3 = c0235r02.f1373I;
            if (bundle3 != null) {
                bundle2.putBundle(C0235r0.f1364t0, bundle3);
            }
            bundle.putBundle(f1234j, bundle2);
        }
        C0192d0 c0192d0 = C0192d0.f1070h;
        C0196e0 c0196e0 = this.f1242e;
        if (!c0196e0.equals(c0192d0)) {
            Bundle bundle4 = new Bundle();
            long j = c0196e0.f1078a;
            if (j != c0192d0.f1078a) {
                bundle4.putLong(C0192d0.f1071i, j);
            }
            long j8 = c0196e0.f1080c;
            if (j8 != c0192d0.f1080c) {
                bundle4.putLong(C0192d0.f1072j, j8);
            }
            long j9 = c0196e0.f1079b;
            if (j9 != c0192d0.f1079b) {
                bundle4.putLong(C0192d0.f1076n, j9);
            }
            long j10 = c0196e0.f1081d;
            if (j10 != c0192d0.f1081d) {
                bundle4.putLong(C0192d0.f1077o, j10);
            }
            boolean z8 = c0196e0.f1082e;
            if (z8 != c0192d0.f1082e) {
                bundle4.putBoolean(C0192d0.f1073k, z8);
            }
            boolean z9 = c0196e0.f1083f;
            if (z9 != c0192d0.f1083f) {
                bundle4.putBoolean(C0192d0.f1074l, z9);
            }
            boolean z10 = c0196e0.f1084g;
            if (z10 != c0192d0.f1084g) {
                bundle4.putBoolean(C0192d0.f1075m, z10);
            }
            bundle.putBundle(f1235k, bundle4);
        }
        C0214k0 c0214k0 = C0214k0.f1167d;
        C0214k0 c0214k02 = this.f1243f;
        if (!c0214k02.equals(c0214k0)) {
            Bundle bundle5 = new Bundle();
            Uri uri2 = c0214k02.f1171a;
            if (uri2 != null) {
                bundle5.putParcelable(C0214k0.f1168e, uri2);
            }
            String str2 = c0214k02.f1172b;
            if (str2 != null) {
                bundle5.putString(C0214k0.f1169f, str2);
            }
            Bundle bundle6 = c0214k02.f1173c;
            if (bundle6 != null) {
                bundle5.putBundle(C0214k0.f1170g, bundle6);
            }
            bundle.putBundle(f1236l, bundle5);
        }
        if (z7 && (c0211j0 = this.f1239b) != null) {
            AbstractC0983m0 abstractC0983m02 = c0211j0.f1153g;
            List list = c0211j0.f1151e;
            Bundle bundle7 = new Bundle();
            bundle7.putParcelable(C0211j0.f1139j, c0211j0.f1147a);
            String str3 = c0211j0.f1148b;
            if (str3 != null) {
                bundle7.putString(C0211j0.f1140k, str3);
            }
            C0202g0 c0202g0 = c0211j0.f1149c;
            if (c0202g0 != null) {
                String str4 = C0211j0.f1141l;
                AbstractC0983m0 abstractC0983m03 = c0202g0.f1114g;
                AbstractC0995q0 abstractC0995q0 = c0202g0.f1110c;
                Bundle bundle8 = new Bundle();
                bundle8.putString(C0202g0.f1100i, c0202g0.f1108a.toString());
                Uri uri3 = c0202g0.f1109b;
                if (uri3 != null) {
                    bundle8.putParcelable(C0202g0.f1101j, uri3);
                }
                if (!abstractC0995q0.isEmpty()) {
                    String str5 = C0202g0.f1102k;
                    Bundle bundle9 = new Bundle();
                    AbstractC1023z1 it = ((C0987n1) abstractC0995q0.entrySet()).iterator();
                    while (true) {
                        AbstractC0946a abstractC0946a = (AbstractC0946a) it;
                        if (!abstractC0946a.hasNext()) {
                            break;
                        }
                        Map.Entry entry = (Map.Entry) abstractC0946a.next();
                        bundle9.putString((String) entry.getKey(), (String) entry.getValue());
                    }
                    bundle8.putBundle(str5, bundle9);
                }
                boolean z11 = c0202g0.f1111d;
                if (z11) {
                    bundle8.putBoolean(C0202g0.f1103l, z11);
                }
                boolean z12 = c0202g0.f1112e;
                if (z12) {
                    bundle8.putBoolean(C0202g0.f1104m, z12);
                }
                boolean z13 = c0202g0.f1113f;
                if (z13) {
                    bundle8.putBoolean(C0202g0.f1105n, z13);
                }
                if (!abstractC0983m03.isEmpty()) {
                    bundle8.putIntegerArrayList(C0202g0.f1106o, new ArrayList<>(abstractC0983m03));
                }
                byte[] bArr2 = c0202g0.f1115h;
                if (bArr2 != null) {
                    bundle8.putByteArray(C0202g0.f1107p, bArr2);
                }
                bundle7.putBundle(str4, bundle8);
            }
            C0170a0 c0170a0 = c0211j0.f1150d;
            if (c0170a0 != null) {
                String str6 = C0211j0.f1142m;
                Bundle bundle10 = new Bundle();
                bundle10.putParcelable(C0170a0.f973b, c0170a0.f974a);
                bundle7.putBundle(str6, bundle10);
            }
            if (!list.isEmpty()) {
                bundle7.putParcelableArrayList(C0211j0.f1143n, AbstractC1101a.m2347E(list, new C0222n(3)));
            }
            String str7 = c0211j0.f1152f;
            if (str7 != null) {
                bundle7.putString(C0211j0.f1144o, str7);
            }
            if (!abstractC0983m02.isEmpty()) {
                bundle7.putParcelableArrayList(C0211j0.f1145p, AbstractC1101a.m2347E(abstractC0983m02, new C0222n(4)));
            }
            long j11 = c0211j0.f1155i;
            if (j11 != -9223372036854775807L) {
                bundle7.putLong(C0211j0.f1146q, j11);
            }
            bundle.putBundle(f1237m, bundle7);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0226o0)) {
            return false;
        }
        C0226o0 c0226o0 = (C0226o0) obj;
        String str = c0226o0.f1238a;
        int i = AbstractC1118i0.f4750a;
        return Objects.equals(this.f1238a, str) && this.f1242e.equals(c0226o0.f1242e) && Objects.equals(this.f1239b, c0226o0.f1239b) && Objects.equals(this.f1240c, c0226o0.f1240c) && Objects.equals(this.f1241d, c0226o0.f1241d) && Objects.equals(this.f1243f, c0226o0.f1243f);
    }

    public final int hashCode() {
        int iHashCode = this.f1238a.hashCode() * 31;
        C0211j0 c0211j0 = this.f1239b;
        return this.f1243f.hashCode() + ((this.f1241d.hashCode() + ((this.f1242e.hashCode() + ((this.f1240c.hashCode() + ((iHashCode + (c0211j0 != null ? c0211j0.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }
}
