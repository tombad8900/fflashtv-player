package p204x4;

import com.bumptech.glide.AbstractC0714c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import okhttp3.C2072e0;
import okhttp3.C2076g0;
import okhttp3.C2181z;
import org.json.JSONArray;
import org.json.JSONObject;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p002a1.C0048u;
import p016b5.C0585h;
import p016b5.C0586i;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1213o;
import p069h7.AbstractC1214p;
import p069h7.C1203e;
import p069h7.C1204f;
import p069h7.EnumC1205g;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p154r6.AbstractC2325h;
import p211y5.C2819f;
import p212y6.InterfaceC2856q;
import p218z4.C2961q;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.k */
/* loaded from: classes.dex */
public final class C2768k {

    /* renamed from: a */
    public static final C2768k f10237a = new C2768k();

    /* renamed from: b */
    public static final C1204f f10238b = new C1204f("^[\\w-]+(\\.[\\w-]+)+$");

    /* renamed from: c */
    public static final C2072e0 f10239c;

    /* renamed from: d */
    public static final List f10240d;

    static {
        C2072e0.a aVar = new C2072e0.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f10239c = aVar.connectTimeout(15L, timeUnit).readTimeout(25L, timeUnit).callTimeout(40L, timeUnit).followRedirects(true).build();
        f10240d = AbstractC1914i.m3753t0("window.CFG", "window.CONFIG");
    }

    /* renamed from: a */
    public static final C2076g0 m4847a(String str, String str2) {
        C2076g0.a aVarUrl = new C2076g0.a().url(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
        if (str2 != null && str2.length() != 0) {
            linkedHashMap.put("Referer", str2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            aVarUrl.header((String) entry.getKey(), (String) entry.getValue());
        }
        return aVarUrl.build();
    }

    /* renamed from: c */
    public static Object m4848c(String str, C2961q c2961q) {
        C2763f c2763f = new C2763f(3, null, 0);
        return f10237a.m4853b(EnumC2761d.f10216j, str, 0, 0, c2763f, c2961q);
    }

    /* renamed from: d */
    public static Object m4849d(String str, int i, int i4, C2961q c2961q) {
        C2763f c2763f = new C2763f(3, null, 1);
        return f10237a.m4853b(EnumC2761d.f10217k, str, i, i4, c2763f, c2961q);
    }

    /* renamed from: e */
    public static Object m4850e(String str, String str2, AbstractC2320c abstractC2320c) {
        C2054e c2054e = AbstractC1290e0.f5316a;
        return AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2766i(str, str2, null, 0), abstractC2320c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static Object m4851f(String str, AbstractC2325h abstractC2325h) {
        C2054e c2054e = AbstractC1290e0.f5316a;
        return AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2766i(str, null, 0 == true ? 1 : 0, 1), abstractC2325h);
    }

    /* renamed from: h */
    public static String m4852h(String str) {
        int i;
        if (!AbstractC1206h.m2650v0(str, '\\')) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        int length = 0;
        while (length < str.length()) {
            char cCharAt = str.charAt(length);
            if (cCharAt != '\\' || (i = length + 1) >= str.length()) {
                sb.append(cCharAt);
                length++;
            } else {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 == 'n') {
                    sb.append('\n');
                } else if (cCharAt2 == 'r') {
                    sb.append('\r');
                } else if (cCharAt2 == 't') {
                    sb.append('\t');
                } else if (cCharAt2 != 'u') {
                    sb.append(cCharAt2);
                } else {
                    String strSubstring = str.substring(length + 2, Math.min(length + 6, str.length()));
                    AbstractC2980h.m5135d("substring(...)", strSubstring);
                    Integer numM2657j0 = AbstractC1213o.m2657j0(16, strSubstring);
                    if (numM2657j0 != null) {
                        cCharAt2 = (char) numM2657j0.intValue();
                    }
                    sb.append(cCharAt2);
                    length += strSubstring.length() + 2;
                }
                length += 2;
            }
        }
        String string = sb.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x028e A[LOOP:0: B:67:0x020b->B:107:0x028e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0449  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x048c  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0297 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4853b(EnumC2761d enumC2761d, String str, int i, int i4, InterfaceC2856q interfaceC2856q, AbstractC2320c abstractC2320c) throws Throwable {
        C2764g c2764g;
        String strM2646T0;
        String str2;
        String str3;
        InterfaceC2856q interfaceC2856q2;
        C2768k c2768k;
        String str4;
        String str5;
        String strOptString;
        C2768k c2768k2;
        InterfaceC2856q interfaceC2856q3;
        String str6;
        String str7;
        InterfaceC2856q interfaceC2856q4;
        C2768k c2768k3;
        Iterator it;
        JSONObject jSONObject;
        C0016e c0016eM2622b;
        char c8;
        String str8;
        String str9;
        Integer num;
        String strM2644R0;
        InterfaceC2856q interfaceC2856q5;
        JSONObject jSONObject2;
        C2768k c2768k4;
        String str10;
        String str11;
        int iM2627A0;
        Iterator it2;
        String strSubstring;
        String str12;
        JSONObject jSONObject3;
        String strOptString2;
        String strM4852h;
        String strConcat;
        String str13;
        Object objM4850e;
        InterfaceC2856q interfaceC2856q6;
        String str14;
        Object obj;
        String str15;
        C0016e c0016eM2622b2;
        JSONObject jSONObjectOptJSONObject;
        String str16;
        String str17;
        String str18;
        JSONObject jSONObject4;
        String string;
        Integer numM2658k0;
        String strOptString3;
        String strOptString4;
        if (abstractC2320c instanceof C2764g) {
            c2764g = (C2764g) abstractC2320c;
            int i8 = c2764g.f10228u;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2764g.f10228u = i8 - Integer.MIN_VALUE;
            } else {
                c2764g = new C2764g(this, abstractC2320c);
            }
        }
        Object objM4850e2 = c2764g.f10226s;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        boolean z7 = false;
        int i9 = 1;
        switch (c2764g.f10228u) {
            case 0:
                AbstractC0714c.m1516d0(objM4850e2);
                C0586i c0586i = C0585h.f2325a;
                if (c0586i == null || (str5 = c0586i.f2344s) == null || (strM2646T0 = AbstractC1206h.m2646T0(str5, '/')) == null || strM2646T0.length() <= 0) {
                    strM2646T0 = null;
                }
                if (strM2646T0 == null) {
                    throw new IOException("no gateBase in the server config");
                }
                int iOrdinal = enumC2761d.ordinal();
                if (iOrdinal == 0) {
                    str2 = strM2646T0 + "/embed/movie/" + str;
                } else {
                    if (iOrdinal != 1) {
                        throw new C0048u();
                    }
                    str2 = strM2646T0 + "/embed/tv/" + str + "/" + i + "/" + i4;
                }
                int iOrdinal2 = enumC2761d.ordinal();
                if (iOrdinal2 == 0) {
                    str3 = strM2646T0 + "/vs_src.php?type=movie&id=" + str;
                } else {
                    if (iOrdinal2 != 1) {
                        throw new C0048u();
                    }
                    str3 = strM2646T0 + "/vs_src.php?type=tv&id=" + str + "&season=" + i + "&episode=" + i4;
                }
                c2764g.f10220m = this;
                interfaceC2856q2 = interfaceC2856q;
                c2764g.f10221n = interfaceC2856q2;
                c2764g.f10222o = str2;
                c2764g.f10228u = 1;
                objM4850e2 = m4850e(str3, str2, c2764g);
                if (objM4850e2 != enumC2273a) {
                    c2768k = this;
                    str4 = str2;
                    strOptString = ((JSONObject) objM4850e2).optString("src");
                    AbstractC2980h.m5133b(strOptString);
                    if (strOptString.length() > 0 || strOptString.equals("null")) {
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        throw new IOException("no src in vs_src.php response");
                    }
                    Integer num2 = new Integer(1);
                    String strM2644R02 = AbstractC1206h.m2644R0(90, strOptString);
                    c2764g.f10220m = c2768k;
                    c2764g.f10221n = interfaceC2856q2;
                    c2764g.f10222o = str4;
                    c2764g.f10223p = strOptString;
                    c2764g.f10228u = 2;
                    if (interfaceC2856q2.mo2793b(num2, strM2644R02, c2764g) != enumC2273a) {
                        c2768k2 = c2768k;
                        interfaceC2856q3 = interfaceC2856q2;
                        str6 = str4;
                        str7 = strOptString;
                        c2764g.f10220m = c2768k2;
                        c2764g.f10221n = interfaceC2856q3;
                        c2764g.f10222o = str7;
                        c2764g.f10223p = null;
                        c2764g.f10228u = 3;
                        c2768k2.getClass();
                        C2054e c2054e = AbstractC1290e0.f5316a;
                        objM4850e2 = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2766i(str7, str6, null, i9), c2764g);
                        if (objM4850e2 != enumC2273a) {
                            interfaceC2856q4 = interfaceC2856q3;
                            c2768k3 = c2768k2;
                            String str19 = (String) objM4850e2;
                            c2768k3.getClass();
                            AbstractC2980h.m5136e("html", str19);
                            it = f10240d.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    jSONObject = null;
                                } else {
                                    boolean z8 = z7;
                                    int iM2628B0 = AbstractC1206h.m2628B0(str19, (String) it.next(), z8 ? 1 : 0, z8, 6);
                                    if (iM2628B0 >= 0 && (iM2627A0 = AbstractC1206h.m2627A0(str19, '{', iM2628B0, 4)) >= 0) {
                                        int length = str19.length();
                                        int i10 = iM2627A0;
                                        boolean z9 = false;
                                        boolean z10 = false;
                                        int i11 = 0;
                                        while (true) {
                                            if (i10 < length) {
                                                it2 = it;
                                                char cCharAt = str19.charAt(i10);
                                                int i12 = i10;
                                                if (z9) {
                                                    if (z10) {
                                                        z10 = false;
                                                    } else if (cCharAt == '\\') {
                                                        z10 = true;
                                                    } else if (cCharAt == '\"') {
                                                        z9 = false;
                                                    }
                                                } else if (cCharAt == '\"') {
                                                    z9 = true;
                                                } else if (cCharAt == '{') {
                                                    i11++;
                                                } else if (cCharAt == '}' && i11 - 1 == 0) {
                                                    strSubstring = str19.substring(iM2627A0, i12 + 1);
                                                    AbstractC2980h.m5135d("substring(...)", strSubstring);
                                                }
                                                i10 = i12 + 1;
                                                it = it2;
                                            } else {
                                                it2 = it;
                                                strSubstring = null;
                                            }
                                        }
                                        if (strSubstring != null) {
                                            try {
                                                jSONObject = new JSONObject(strSubstring);
                                            } catch (Exception unused) {
                                            }
                                            if (jSONObject != null) {
                                                it = it2;
                                                z7 = false;
                                            }
                                        }
                                    } else {
                                        it2 = it;
                                    }
                                    jSONObject = null;
                                    if (jSONObject != null) {
                                    }
                                }
                            }
                            if (jSONObject != null) {
                                throw new IOException("window.CFG not found in landing HTML");
                            }
                            String strOptString5 = jSONObject.optString("playerUrl");
                            AbstractC2980h.m5133b(strOptString5);
                            if (strOptString5.length() <= 0 || strOptString5.equals("null")) {
                                strOptString5 = null;
                            }
                            if (strOptString5 == null) {
                                throw new IOException("window.CFG has no playerUrl");
                            }
                            AbstractC2980h.m5136e("base", str7);
                            if (strOptString5.length() == 0) {
                                strOptString5 = str7;
                            } else {
                                EnumC1205g enumC1205g = EnumC1205g.f5092k;
                                Pattern patternCompile = Pattern.compile("^https?://", C2819f.m4927o(2));
                                AbstractC2980h.m5135d("compile(...)", patternCompile);
                                if (!patternCompile.matcher(strOptString5).find() && (c0016eM2622b = C1204f.m2622b(new C1204f("^([a-z]+://[^/?#]+)(/[^?#]*)?", 0), str7)) != null) {
                                    String str20 = (String) ((C1203e) c0016eM2622b.m31A()).get(1);
                                    if (AbstractC1214p.m2667t0(strOptString5, "/", false)) {
                                        strOptString5 = AbstractC0008a1.m16l(str20, strOptString5);
                                    } else {
                                        String str21 = (String) AbstractC1913h.m3738C0(2, c0016eM2622b.m31A());
                                        if (str21 == null) {
                                            str21 = C2181z.FRAGMENT_ENCODE_SET;
                                        }
                                        if (str21.length() == 0) {
                                            c8 = '/';
                                            str8 = C2181z.FRAGMENT_ENCODE_SET;
                                            str21 = "/";
                                        } else {
                                            c8 = '/';
                                            str8 = C2181z.FRAGMENT_ENCODE_SET;
                                        }
                                        str9 = "stream_urls";
                                        char c9 = c8;
                                        String strSubstring2 = str21.substring(0, AbstractC1206h.m2631E0(str21, c8, 0, 6) + 1);
                                        AbstractC2980h.m5135d("substring(...)", strSubstring2);
                                        ArrayList arrayList = new ArrayList();
                                        for (String str22 : AbstractC1206h.m2638L0(strSubstring2.concat(strOptString5), new char[]{c9})) {
                                            if (str22.length() != 0 && !str22.equals(".")) {
                                                if (!str22.equals("..")) {
                                                    arrayList.add(str22);
                                                } else if (!arrayList.isEmpty()) {
                                                    arrayList.remove(arrayList.size() - 1);
                                                }
                                            }
                                        }
                                        strOptString5 = str20 + "/" + AbstractC1913h.m3740E0(arrayList, "/", null, null, null, 62);
                                        num = new Integer(2);
                                        strM2644R0 = AbstractC1206h.m2644R0(90, strOptString5);
                                        c2764g.f10220m = c2768k3;
                                        c2764g.f10221n = interfaceC2856q4;
                                        c2764g.f10222o = str7;
                                        c2764g.f10223p = jSONObject;
                                        c2764g.f10224q = strOptString5;
                                        c2764g.f10228u = 4;
                                        if (interfaceC2856q4.mo2793b(num, strM2644R0, c2764g) != enumC2273a) {
                                            JSONObject jSONObject5 = jSONObject;
                                            interfaceC2856q5 = interfaceC2856q4;
                                            jSONObject2 = jSONObject5;
                                            c2768k4 = c2768k3;
                                            str10 = str7;
                                            str11 = strOptString5;
                                            try {
                                                c2764g.f10220m = c2768k4;
                                                c2764g.f10221n = interfaceC2856q5;
                                                c2764g.f10222o = str10;
                                                c2764g.f10223p = jSONObject2;
                                                c2764g.f10224q = str11;
                                                c2764g.f10228u = 5;
                                                c2768k4.getClass();
                                                C2054e c2054e2 = AbstractC1290e0.f5316a;
                                                objM4850e2 = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2766i(str11, str10, null, 1), c2764g);
                                                if (objM4850e2 == enumC2273a) {
                                                }
                                                str12 = (String) objM4850e2;
                                            } catch (Exception unused2) {
                                                str12 = null;
                                                String str23 = str10;
                                                jSONObject3 = jSONObject2;
                                                strOptString2 = jSONObject3.optString("metaApi");
                                                AbstractC2980h.m5133b(strOptString2);
                                                if (strOptString2.length() > 0) {
                                                }
                                                strOptString2 = null;
                                                if (strOptString2 == null) {
                                                }
                                                if (str12 != null) {
                                                }
                                                strM4852h = null;
                                                c2768k4.getClass();
                                                if (str12 != null) {
                                                }
                                                strConcat = strOptString2.concat(!AbstractC1206h.m2650v0(strOptString2, '?') ? "&" : "?");
                                                if (AbstractC1206h.m2649u0(strConcat, "stream_urls=", false)) {
                                                }
                                                if (strM4852h != null) {
                                                }
                                                c2764g.f10220m = c2768k4;
                                                c2764g.f10221n = interfaceC2856q5;
                                                c2764g.f10222o = str23;
                                                c2764g.f10223p = jSONObject3;
                                                c2764g.f10224q = str11;
                                                c2764g.f10225r = strM4852h;
                                                c2764g.f10228u = 6;
                                                objM4850e = m4850e(strConcat, str11, c2764g);
                                                if (objM4850e != enumC2273a) {
                                                }
                                                return enumC2273a;
                                            }
                                            String str232 = str10;
                                            jSONObject3 = jSONObject2;
                                            strOptString2 = jSONObject3.optString("metaApi");
                                            AbstractC2980h.m5133b(strOptString2);
                                            if (strOptString2.length() > 0 || strOptString2.equals("null")) {
                                                strOptString2 = null;
                                            }
                                            if (strOptString2 == null) {
                                                c2768k4.getClass();
                                                if (str12 != null && (c0016eM2622b2 = C1204f.m2622b(new C1204f("\"metaApi\"\\s*:\\s*\"((?:[^\"\\\\]|\\\\.)*)\""), str12)) != null) {
                                                    strOptString2 = m4852h((String) ((C1203e) c0016eM2622b2.m31A()).get(1));
                                                    if (strOptString2.length() <= 0) {
                                                    }
                                                    if (strOptString2 == null) {
                                                        throw new IOException("window.CFG has no metaApi");
                                                    }
                                                }
                                                strOptString2 = null;
                                                if (strOptString2 == null) {
                                                }
                                            }
                                            if (str12 != null) {
                                                c2768k4.getClass();
                                                C0016e c0016eM2622b3 = C1204f.m2622b(new C1204f("\"apiToken\"\\s*:\\s*\"([^\"]+)\""), str12);
                                                if (c0016eM2622b3 != null) {
                                                    strM4852h = m4852h((String) ((C1203e) c0016eM2622b3.m31A()).get(1));
                                                    if (!f10238b.m2624c(AbstractC1206h.m2645S0(strM4852h).toString())) {
                                                    }
                                                    c2768k4.getClass();
                                                    if (str12 != null) {
                                                        Pattern patternCompile2 = Pattern.compile("\"rateLimited\"\\s*:\\s*true");
                                                        AbstractC2980h.m5135d("compile(...)", patternCompile2);
                                                        if (patternCompile2.matcher(str12).find()) {
                                                            throw new IOException("site is rate limiting this connection (rateLimited); try again shortly");
                                                        }
                                                    }
                                                    strConcat = strOptString2.concat(!AbstractC1206h.m2650v0(strOptString2, '?') ? "&" : "?");
                                                    if (AbstractC1206h.m2649u0(strConcat, "stream_urls=", false)) {
                                                        str13 = str9;
                                                        strConcat = AbstractC0008a1.m16l(strConcat, str13);
                                                    } else {
                                                        str13 = str9;
                                                    }
                                                    if (strM4852h != null && strM4852h.length() != 0) {
                                                        strConcat = strConcat + "&api_token=" + strM4852h;
                                                    }
                                                    c2764g.f10220m = c2768k4;
                                                    c2764g.f10221n = interfaceC2856q5;
                                                    c2764g.f10222o = str232;
                                                    c2764g.f10223p = jSONObject3;
                                                    c2764g.f10224q = str11;
                                                    c2764g.f10225r = strM4852h;
                                                    c2764g.f10228u = 6;
                                                    objM4850e = m4850e(strConcat, str11, c2764g);
                                                    if (objM4850e != enumC2273a) {
                                                        interfaceC2856q6 = interfaceC2856q5;
                                                        str14 = str232;
                                                        obj = objM4850e;
                                                        str15 = strM4852h;
                                                        JSONObject jSONObject6 = (JSONObject) obj;
                                                        jSONObjectOptJSONObject = jSONObject6.optJSONObject("data");
                                                        if (jSONObjectOptJSONObject != null) {
                                                            Object objOpt = jSONObject6.opt("status_code");
                                                            c2768k4.getClass();
                                                            if (objOpt != null && (string = objOpt.toString()) != null && (numM2658k0 = AbstractC1213o.m2658k0(string)) != null && numM2658k0.intValue() == 404) {
                                                                throw new C2762e("primary has no source for this title (404)");
                                                            }
                                                            throw new IOException("no source (status " + jSONObject6.opt("status_code") + ")");
                                                        }
                                                        boolean z11 = jSONObjectOptJSONObject.opt(str13) instanceof JSONArray;
                                                        String strOptString6 = jSONObject3.optString("epLabel");
                                                        AbstractC2980h.m5135d("optString(...)", strOptString6);
                                                        String string2 = AbstractC1206h.m2645S0(AbstractC1206h.m2648V0(AbstractC1206h.m2645S0(strOptString6).toString(), '\u00b7')).toString();
                                                        Integer num3 = new Integer(3);
                                                        String str24 = jSONObjectOptJSONObject.optString("title") + (string2.length() == 0 ? str8 : AbstractC0008a1.m17m("  [", string2, "]")) + " | " + (z11 ? "plain array" : "encrypted blob") + (str15 != null ? " | token" : " | no token");
                                                        c2764g.f10220m = str14;
                                                        c2764g.f10221n = str11;
                                                        c2764g.f10222o = str15;
                                                        c2764g.f10223p = jSONObjectOptJSONObject;
                                                        str16 = null;
                                                        c2764g.f10224q = null;
                                                        c2764g.f10225r = null;
                                                        c2764g.f10228u = 7;
                                                        if (interfaceC2856q6.mo2793b(num3, str24, c2764g) != enumC2273a) {
                                                            str17 = str11;
                                                            str18 = str14;
                                                            jSONObject4 = jSONObjectOptJSONObject;
                                                            strOptString3 = jSONObject4.optString("file_name");
                                                            AbstractC2980h.m5133b(strOptString3);
                                                            if (!AbstractC1206h.m2630D0(strOptString3) || strOptString3.equals("null")) {
                                                                strOptString3 = str16;
                                                            }
                                                            strOptString4 = jSONObject4.optString("imdb_id");
                                                            AbstractC2980h.m5133b(strOptString4);
                                                            if (!AbstractC1206h.m2630D0(strOptString4) || strOptString4.equals("null")) {
                                                                strOptString4 = str16;
                                                            }
                                                            return new C2760c(str18, str17, strOptString3, strOptString4 == null ? AbstractC1206h.m2635I0(strOptString4, "tt") : str16, str15);
                                                        }
                                                    }
                                                }
                                            }
                                            strM4852h = null;
                                            c2768k4.getClass();
                                            if (str12 != null) {
                                            }
                                            strConcat = strOptString2.concat(!AbstractC1206h.m2650v0(strOptString2, '?') ? "&" : "?");
                                            if (AbstractC1206h.m2649u0(strConcat, "stream_urls=", false)) {
                                            }
                                            if (strM4852h != null) {
                                                strConcat = strConcat + "&api_token=" + strM4852h;
                                            }
                                            c2764g.f10220m = c2768k4;
                                            c2764g.f10221n = interfaceC2856q5;
                                            c2764g.f10222o = str232;
                                            c2764g.f10223p = jSONObject3;
                                            c2764g.f10224q = str11;
                                            c2764g.f10225r = strM4852h;
                                            c2764g.f10228u = 6;
                                            objM4850e = m4850e(strConcat, str11, c2764g);
                                            if (objM4850e != enumC2273a) {
                                            }
                                        }
                                    }
                                }
                            }
                            str9 = "stream_urls";
                            str8 = C2181z.FRAGMENT_ENCODE_SET;
                            num = new Integer(2);
                            strM2644R0 = AbstractC1206h.m2644R0(90, strOptString5);
                            c2764g.f10220m = c2768k3;
                            c2764g.f10221n = interfaceC2856q4;
                            c2764g.f10222o = str7;
                            c2764g.f10223p = jSONObject;
                            c2764g.f10224q = strOptString5;
                            c2764g.f10228u = 4;
                            if (interfaceC2856q4.mo2793b(num, strM2644R0, c2764g) != enumC2273a) {
                            }
                        }
                    }
                }
                return enumC2273a;
            case 1:
                str4 = c2764g.f10222o;
                interfaceC2856q2 = (InterfaceC2856q) c2764g.f10221n;
                c2768k = (C2768k) c2764g.f10220m;
                AbstractC0714c.m1516d0(objM4850e2);
                strOptString = ((JSONObject) objM4850e2).optString("src");
                AbstractC2980h.m5133b(strOptString);
                if (strOptString.length() > 0) {
                    break;
                }
                strOptString = null;
                if (strOptString != null) {
                }
                break;
            case 2:
                str7 = (String) c2764g.f10223p;
                str6 = c2764g.f10222o;
                interfaceC2856q3 = (InterfaceC2856q) c2764g.f10221n;
                c2768k2 = (C2768k) c2764g.f10220m;
                AbstractC0714c.m1516d0(objM4850e2);
                c2764g.f10220m = c2768k2;
                c2764g.f10221n = interfaceC2856q3;
                c2764g.f10222o = str7;
                c2764g.f10223p = null;
                c2764g.f10228u = 3;
                c2768k2.getClass();
                C2054e c2054e3 = AbstractC1290e0.f5316a;
                objM4850e2 = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2766i(str7, str6, null, i9), c2764g);
                if (objM4850e2 != enumC2273a) {
                }
                return enumC2273a;
            case 3:
                str7 = c2764g.f10222o;
                interfaceC2856q4 = (InterfaceC2856q) c2764g.f10221n;
                c2768k3 = (C2768k) c2764g.f10220m;
                AbstractC0714c.m1516d0(objM4850e2);
                String str192 = (String) objM4850e2;
                c2768k3.getClass();
                AbstractC2980h.m5136e("html", str192);
                it = f10240d.iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                    it = it2;
                    z7 = false;
                }
                if (jSONObject != null) {
                }
                break;
            case 4:
                str11 = c2764g.f10224q;
                jSONObject2 = (JSONObject) c2764g.f10223p;
                str10 = c2764g.f10222o;
                interfaceC2856q5 = (InterfaceC2856q) c2764g.f10221n;
                c2768k4 = (C2768k) c2764g.f10220m;
                AbstractC0714c.m1516d0(objM4850e2);
                str9 = "stream_urls";
                str8 = C2181z.FRAGMENT_ENCODE_SET;
                c2764g.f10220m = c2768k4;
                c2764g.f10221n = interfaceC2856q5;
                c2764g.f10222o = str10;
                c2764g.f10223p = jSONObject2;
                c2764g.f10224q = str11;
                c2764g.f10228u = 5;
                c2768k4.getClass();
                C2054e c2054e22 = AbstractC1290e0.f5316a;
                objM4850e2 = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2766i(str11, str10, null, 1), c2764g);
                if (objM4850e2 == enumC2273a) {
                }
                str12 = (String) objM4850e2;
                String str2322 = str10;
                jSONObject3 = jSONObject2;
                strOptString2 = jSONObject3.optString("metaApi");
                AbstractC2980h.m5133b(strOptString2);
                if (strOptString2.length() > 0) {
                    break;
                }
                strOptString2 = null;
                if (strOptString2 == null) {
                }
                if (str12 != null) {
                }
                strM4852h = null;
                c2768k4.getClass();
                if (str12 != null) {
                }
                strConcat = strOptString2.concat(!AbstractC1206h.m2650v0(strOptString2, '?') ? "&" : "?");
                if (AbstractC1206h.m2649u0(strConcat, "stream_urls=", false)) {
                }
                if (strM4852h != null) {
                }
                c2764g.f10220m = c2768k4;
                c2764g.f10221n = interfaceC2856q5;
                c2764g.f10222o = str2322;
                c2764g.f10223p = jSONObject3;
                c2764g.f10224q = str11;
                c2764g.f10225r = strM4852h;
                c2764g.f10228u = 6;
                objM4850e = m4850e(strConcat, str11, c2764g);
                if (objM4850e != enumC2273a) {
                }
                return enumC2273a;
            case 5:
                str11 = c2764g.f10224q;
                jSONObject2 = (JSONObject) c2764g.f10223p;
                str10 = c2764g.f10222o;
                interfaceC2856q5 = (InterfaceC2856q) c2764g.f10221n;
                c2768k4 = (C2768k) c2764g.f10220m;
                try {
                    AbstractC0714c.m1516d0(objM4850e2);
                    str9 = "stream_urls";
                    str8 = C2181z.FRAGMENT_ENCODE_SET;
                    str12 = (String) objM4850e2;
                } catch (Exception unused3) {
                    str9 = "stream_urls";
                    str8 = C2181z.FRAGMENT_ENCODE_SET;
                    str12 = null;
                    String str23222 = str10;
                    jSONObject3 = jSONObject2;
                    strOptString2 = jSONObject3.optString("metaApi");
                    AbstractC2980h.m5133b(strOptString2);
                    if (strOptString2.length() > 0) {
                    }
                    strOptString2 = null;
                    if (strOptString2 == null) {
                    }
                    if (str12 != null) {
                    }
                    strM4852h = null;
                    c2768k4.getClass();
                    if (str12 != null) {
                    }
                    strConcat = strOptString2.concat(!AbstractC1206h.m2650v0(strOptString2, '?') ? "&" : "?");
                    if (AbstractC1206h.m2649u0(strConcat, "stream_urls=", false)) {
                    }
                    if (strM4852h != null) {
                    }
                    c2764g.f10220m = c2768k4;
                    c2764g.f10221n = interfaceC2856q5;
                    c2764g.f10222o = str23222;
                    c2764g.f10223p = jSONObject3;
                    c2764g.f10224q = str11;
                    c2764g.f10225r = strM4852h;
                    c2764g.f10228u = 6;
                    objM4850e = m4850e(strConcat, str11, c2764g);
                    if (objM4850e != enumC2273a) {
                    }
                    return enumC2273a;
                }
                String str232222 = str10;
                jSONObject3 = jSONObject2;
                strOptString2 = jSONObject3.optString("metaApi");
                AbstractC2980h.m5133b(strOptString2);
                if (strOptString2.length() > 0) {
                }
                strOptString2 = null;
                if (strOptString2 == null) {
                }
                if (str12 != null) {
                }
                strM4852h = null;
                c2768k4.getClass();
                if (str12 != null) {
                }
                strConcat = strOptString2.concat(!AbstractC1206h.m2650v0(strOptString2, '?') ? "&" : "?");
                if (AbstractC1206h.m2649u0(strConcat, "stream_urls=", false)) {
                }
                if (strM4852h != null) {
                }
                c2764g.f10220m = c2768k4;
                c2764g.f10221n = interfaceC2856q5;
                c2764g.f10222o = str232222;
                c2764g.f10223p = jSONObject3;
                c2764g.f10224q = str11;
                c2764g.f10225r = strM4852h;
                c2764g.f10228u = 6;
                objM4850e = m4850e(strConcat, str11, c2764g);
                if (objM4850e != enumC2273a) {
                }
                return enumC2273a;
            case 6:
                String str25 = c2764g.f10225r;
                String str26 = c2764g.f10224q;
                jSONObject3 = (JSONObject) c2764g.f10223p;
                str14 = c2764g.f10222o;
                interfaceC2856q6 = (InterfaceC2856q) c2764g.f10221n;
                c2768k4 = (C2768k) c2764g.f10220m;
                AbstractC0714c.m1516d0(objM4850e2);
                str15 = str25;
                str11 = str26;
                obj = objM4850e2;
                str13 = "stream_urls";
                str8 = C2181z.FRAGMENT_ENCODE_SET;
                JSONObject jSONObject62 = (JSONObject) obj;
                jSONObjectOptJSONObject = jSONObject62.optJSONObject("data");
                if (jSONObjectOptJSONObject != null) {
                }
                break;
            case 7:
                jSONObject4 = (JSONObject) c2764g.f10223p;
                str15 = c2764g.f10222o;
                str17 = (String) c2764g.f10221n;
                str18 = (String) c2764g.f10220m;
                AbstractC0714c.m1516d0(objM4850e2);
                str16 = null;
                strOptString3 = jSONObject4.optString("file_name");
                AbstractC2980h.m5133b(strOptString3);
                if (!AbstractC1206h.m2630D0(strOptString3)) {
                    strOptString3 = str16;
                    break;
                }
                strOptString4 = jSONObject4.optString("imdb_id");
                AbstractC2980h.m5133b(strOptString4);
                if (!AbstractC1206h.m2630D0(strOptString4)) {
                    strOptString4 = str16;
                    break;
                }
                return new C2760c(str18, str17, strOptString3, strOptString4 == null ? AbstractC1206h.m2635I0(strOptString4, "tt") : str16, str15);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4854g(int i, int i4, String str, String str2, AbstractC2320c abstractC2320c) throws Throwable {
        C2767j c2767j;
        String string;
        String strM2646T0;
        String strM25u;
        String str3;
        if (abstractC2320c instanceof C2767j) {
            c2767j = (C2767j) abstractC2320c;
            int i8 = c2767j.f10236o;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2767j.f10236o = i8 - Integer.MIN_VALUE;
            } else {
                c2767j = new C2767j(this, abstractC2320c);
            }
        }
        Object objM2857r = c2767j.f10234m;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i9 = c2767j.f10236o;
        int i10 = 1;
        Object[] objArr = 0;
        if (i9 == 0) {
            AbstractC0714c.m1516d0(objM2857r);
            C0586i c0586i = C0585h.f2325a;
            if (c0586i == null || (str3 = c0586i.f2346u) == null || (string = AbstractC1206h.m2645S0(str3).toString()) == null || string.length() <= 0) {
                string = null;
            }
            if (string != null && (strM2646T0 = AbstractC1206h.m2646T0(string, '/')) != null) {
                if (i < 0 || i4 < 0) {
                    strM25u = AbstractC0008a1.m25u("/api.php?type=movie&tmdb=", str);
                } else {
                    strM25u = "/api.php?type=tv&tmdb=" + str + "&season=" + i + "&episode=" + i4;
                }
                if (str2 != null && str2.length() != 0) {
                    strM25u = strM25u + "&api_token=" + str2;
                }
                c2767j.f10236o = 1;
                C2054e c2054e = AbstractC1290e0.f5316a;
                objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2765h(strM2646T0 + strM25u, objArr == true ? 1 : 0, i10), c2767j);
                if (objM2857r == enumC2273a) {
                    return enumC2273a;
                }
            }
            return null;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC0714c.m1516d0(objM2857r);
        JSONObject jSONObject = (JSONObject) objM2857r;
        if (jSONObject != null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("file_name");
                AbstractC2980h.m5133b(strOptString);
                if (AbstractC1206h.m2630D0(strOptString) || strOptString.equals("null")) {
                    strOptString = null;
                }
                String strOptString2 = jSONObjectOptJSONObject.optString("imdb_id");
                AbstractC2980h.m5133b(strOptString2);
                if (AbstractC1206h.m2630D0(strOptString2) || strOptString2.equals("null")) {
                    strOptString2 = null;
                }
                return new C2759b(strOptString, strOptString2 != null ? AbstractC1206h.m2635I0(strOptString2, "tt") : null);
            }
        }
        return null;
    }
}
