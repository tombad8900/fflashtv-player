package p218z4;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import android.util.Log;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.MainActivity;
import com.exotv.net.model.Channel;
import com.exotv.net.model.ResolvedStream;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.C2181z;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import p002a1.AbstractC0008a1;
import p016b5.C0584g;
import p016b5.C0585h;
import p016b5.C0586i;
import p026c7.AbstractC0711e;
import p026c7.C0710d;
import p044e7.C0925b;
import p044e7.C0926c;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1213o;
import p069h7.AbstractC1214p;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p111m6.AbstractC1912g;
import p111m6.C1921p;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p168t2.AbstractC2415i0;
import p168t2.AbstractC2429w;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.k */
/* loaded from: classes.dex */
public final class C2952k {

    /* renamed from: a */
    public static final C2952k f11010a = new C2952k();

    /* renamed from: b */
    public static final AtomicReference f11011b = new AtomicReference(null);

    /* renamed from: c */
    public static final AtomicReference f11012c = new AtomicReference(0L);

    /* renamed from: d */
    public static final Set f11013d = AbstractC0714c.m1512a0("use-multi-hosts", "id", "key");

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Map] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LinkedHashMap m5113a(C0586i c0586i, Context context, String str) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        String string;
        String str2;
        AtomicReference atomicReference = AbstractC2936c.f10904a;
        AbstractC2980h.m5136e("context", context);
        AtomicReference atomicReference2 = AbstractC2936c.f10904a;
        String str3 = (String) atomicReference2.get();
        if (str3 == null) {
            try {
                string = Settings.Secure.getString(context.getContentResolver(), "android_id");
            } catch (Throwable unused) {
                string = null;
            }
            if (string == null || !AbstractC2936c.f10905b.m2624c(string)) {
                string = "43a5eaa56716eb6f";
            }
            str3 = string;
            atomicReference2.set(str3);
        }
        String strM15k = AbstractC0008a1.m15k("GENRAL TV|com.genraltvpro.app|2.19|29CA406BCB43A33B2FECBD228BDDC7A1E11E772D|", (System.currentTimeMillis() / 1000) / 300);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str4 = (String) c0586i.f2341p.get("User-Agent");
        if (str4 == null) {
            str2 = "okhttp/5.4.0";
        } else {
            str2 = AbstractC1206h.m2630D0(str4) ? null : str4;
            if (str2 == null) {
            }
        }
        linkedHashMap.put("User-Agent", str2);
        AbstractC2980h.m5136e("data", strM15k);
        Mac mac = Mac.getInstance("HmacSHA256");
        Charset charset = AbstractC1199a.f5077a;
        byte[] bytes = str3.getBytes(charset);
        AbstractC2980h.m5135d("getBytes(...)", bytes);
        mac.init(new SecretKeySpec(bytes, "HmacSHA256"));
        byte[] bytes2 = strM15k.getBytes(charset);
        AbstractC2980h.m5135d("getBytes(...)", bytes2);
        byte[] bArrDoFinal = mac.doFinal(bytes2);
        AbstractC2980h.m5135d("doFinal(...)", bArrDoFinal);
        StringBuilder sb = new StringBuilder(bArrDoFinal.length * 2);
        for (byte b7 : bArrDoFinal) {
            sb.append("0123456789abcdef".charAt((b7 & 255) >>> 4));
            sb.append("0123456789abcdef".charAt(b7 & 15));
        }
        String string2 = sb.toString();
        AbstractC2980h.m5135d("toString(...)", string2);
        linkedHashMap.put("x-v3-token", string2);
        linkedHashMap.put("x-app-id", str3);
        if (str != null && str.length() != 0) {
            linkedHashMap.put("x-cat-info", str);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:88:0x034a  */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m5114b(JSONObject jSONObject, JSONObject jSONObject2, String str) throws NoSuchAlgorithmException {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        ArrayList arrayList;
        int i;
        int i4;
        char c8;
        List<C2940e> listM1551T;
        String strOptString;
        String str2;
        int i8;
        ArrayList arrayList2;
        char c9;
        JSONObject jSONObject3 = jSONObject2;
        Object objOpt = jSONObject.opt("servers");
        if (objOpt instanceof JSONArray) {
            jSONArray = (JSONArray) objOpt;
        } else if (objOpt instanceof String) {
            try {
                jSONArray = new JSONArray((String) objOpt);
            } catch (Throwable unused) {
                jSONArray = new JSONArray();
            }
        } else {
            jSONArray = new JSONArray();
        }
        if (jSONArray.length() == 0) {
            return C1921p.f7187j;
        }
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        ?? r52 = 0;
        int i9 = 0;
        while (i9 < length) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            if (jSONObjectOptJSONObject == null) {
                jSONArray2 = jSONArray;
                arrayList2 = arrayList3;
                i = length;
                c8 = r52;
                i4 = i9;
            } else {
                String strOptString2 = jSONObjectOptJSONObject.optString("url");
                JSONObject jSONObjectM5121j = m5121j(jSONObjectOptJSONObject.opt("headers"));
                AbstractC2980h.m5133b(strOptString2);
                if (AbstractC1214p.m2667t0(strOptString2, "stream=", r52)) {
                    String strSubstring = strOptString2.substring(7);
                    AbstractC2980h.m5135d("substring(...)", strSubstring);
                    if (AbstractC2980h.m5132a(jSONObjectM5121j.optString("use-multi-hosts"), "true")) {
                        JSONArray jSONArrayOptJSONArray = jSONObject3.optJSONArray("stream_hosts");
                        c9 = '/';
                        C0926c c0926cM1521g0 = AbstractC0714c.m1521g0(r52, jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.length() : r52);
                        c8 = r52;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it = c0926cM1521g0.iterator();
                        while (true) {
                            C0925b c0925b = (C0925b) it;
                            jSONArray2 = jSONArray;
                            if (!c0925b.f3991l) {
                                break;
                            }
                            int iNextInt = c0925b.nextInt();
                            AbstractC2980h.m5133b(jSONArrayOptJSONArray);
                            String strOptString3 = jSONArrayOptJSONArray.optString(iNextInt);
                            if (AbstractC1206h.m2630D0(strOptString3)) {
                                strOptString3 = null;
                            }
                            if (strOptString3 != null) {
                                arrayList4.add(strOptString3);
                            }
                            jSONArray = jSONArray2;
                        }
                        String strOptString4 = jSONObject3.optString("stream_key");
                        AbstractC2980h.m5133b(strOptString4);
                        if (AbstractC1206h.m2630D0(strOptString4)) {
                            strOptString4 = null;
                        }
                        str2 = strOptString4 != null ? strOptString4 : "your_secret_key";
                        if (!arrayList4.isEmpty()) {
                            C0710d c0710d = AbstractC0711e.f2769j;
                            if (arrayList4.isEmpty()) {
                                throw new NoSuchElementException("Collection is empty.");
                            }
                            listM1551T = AbstractC0715d.m1551T(m5116d(jSONObjectM5121j, jSONObjectOptJSONObject, ((String) arrayList4.get(c0710d.mo1477a(arrayList4.size()))) + strSubstring + "?token=" + m5120i(str, str2) + "&ip=" + str, "multi-host"));
                        }
                        arrayList = arrayList3;
                        i = length;
                        i4 = i9;
                    } else {
                        jSONArray2 = jSONArray;
                        c8 = r52;
                        c9 = '/';
                    }
                    String strOptString5 = jSONObject3.optString("remote_url_2");
                    String strOptString6 = jSONObject3.optString("remote_key_2");
                    AbstractC2980h.m5133b(strOptString6);
                    strOptString = AbstractC1206h.m2630D0(strOptString6) ? null : strOptString6;
                    if (strOptString == null) {
                        strOptString = jSONObject3.optString("stream_key");
                    }
                    String str3 = strOptString;
                    AbstractC2980h.m5133b(strOptString5);
                    if (AbstractC1206h.m2630D0(strOptString5) || str3 == null || str3.length() == 0) {
                        listM1551T = AbstractC0715d.m1551T(m5116d(jSONObjectM5121j, jSONObjectOptJSONObject, strSubstring, "stream(no-base)"));
                    } else {
                        char[] cArr = new char[1];
                        cArr[c8] = c9;
                        listM1551T = AbstractC0715d.m1551T(m5116d(jSONObjectM5121j, jSONObjectOptJSONObject, AbstractC1206h.m2646T0(strOptString5, cArr) + strSubstring + "?token=" + m5120i(str, str3), "remote_url_2"));
                    }
                    arrayList = arrayList3;
                    i = length;
                    i4 = i9;
                } else {
                    jSONArray2 = jSONArray;
                    if (AbstractC1214p.m2667t0(strOptString2, "id=", r52)) {
                        String strSubstring2 = strOptString2.substring(3);
                        AbstractC2980h.m5135d("substring(...)", strSubstring2);
                        String strOptString7 = jSONObject3.optString("remote_url");
                        String strOptString8 = jSONObject3.optString("stream_key");
                        AbstractC2980h.m5133b(strOptString8);
                        strOptString = AbstractC1206h.m2630D0(strOptString8) ? null : strOptString8;
                        str2 = strOptString != null ? strOptString : "your_secret_key";
                        AbstractC2980h.m5133b(strOptString7);
                        if (AbstractC1206h.m2630D0(strOptString7)) {
                            arrayList = arrayList3;
                            i = length;
                            i8 = i9;
                            listM1551T = AbstractC0715d.m1551T(m5116d(jSONObjectM5121j, jSONObjectOptJSONObject, strSubstring2, "id(no-base)"));
                        } else {
                            String strM2646T0 = AbstractC1206h.m2646T0(strOptString7, '/');
                            arrayList = arrayList3;
                            i = length;
                            long jCurrentTimeMillis = (System.currentTimeMillis() / 1000) - 1062;
                            i8 = i9;
                            long j = 10800 + jCurrentTimeMillis;
                            byte[] bArr = new byte[8];
                            new SecureRandom().nextBytes(bArr);
                            String strM4306k = AbstractC2429w.m4306k(bArr);
                            listM1551T = AbstractC0715d.m1551T(m5116d(jSONObjectM5121j, jSONObjectOptJSONObject, strM2646T0 + "/" + strSubstring2 + "/index.m3u8?token=" + AbstractC2429w.m4311p(strSubstring2 + str + jCurrentTimeMillis + j + str2 + strM4306k) + "-" + strM4306k + "-" + j + "-" + jCurrentTimeMillis + "&remote=" + str, "id-signed"));
                        }
                        i4 = i8;
                        c8 = 0;
                    } else {
                        arrayList = arrayList3;
                        i = length;
                        int i10 = i9;
                        if (AbstractC1214p.m2667t0(strOptString2, "http", false)) {
                            String strOptString9 = jSONObjectM5121j.optString("id");
                            String strOptString10 = jSONObjectM5121j.optString("key");
                            AbstractC2980h.m5133b(strOptString9);
                            if (!AbstractC1206h.m2630D0(strOptString9)) {
                                AbstractC2980h.m5133b(strOptString10);
                                if (AbstractC1206h.m2630D0(strOptString10)) {
                                    i4 = i10;
                                    c8 = 0;
                                    listM1551T = AbstractC0715d.m1551T(m5116d(jSONObjectM5121j, jSONObjectOptJSONObject, strOptString2, "direct"));
                                } else {
                                    long jCurrentTimeMillis2 = (System.currentTimeMillis() / 1000) - 1062;
                                    long j8 = 10800 + jCurrentTimeMillis2;
                                    byte[] bArr2 = new byte[8];
                                    i4 = i10;
                                    new SecureRandom().nextBytes(bArr2);
                                    String strM4306k2 = AbstractC2429w.m4306k(bArr2);
                                    String strM4311p = AbstractC2429w.m4311p(strOptString9 + str + jCurrentTimeMillis2 + j8 + strOptString10 + strM4306k2);
                                    c8 = 0;
                                    listM1551T = AbstractC0715d.m1551T(m5116d(jSONObjectM5121j, jSONObjectOptJSONObject, AbstractC1206h.m2646T0(strOptString2, '/') + "/" + strOptString9 + "/index.m3u8?token=" + strM4311p + "-" + strM4306k2 + "-" + j8 + "-" + jCurrentTimeMillis2 + "&remote=" + str, "cdn-signed"));
                                }
                            }
                        } else {
                            i4 = i10;
                            c8 = 0;
                            listM1551T = AbstractC0715d.m1551T(m5116d(jSONObjectM5121j, jSONObjectOptJSONObject, strOptString2, "direct"));
                        }
                    }
                }
                for (C2940e c2940e : listM1551T) {
                    arrayList.add(new C2938d(c2940e.f10933a, c2940e.f10934b, c2940e.f10935c, c2940e.f10936d, c2940e.f10937e, c2940e.f10938f));
                }
                arrayList2 = arrayList;
            }
            i9 = i4 + 1;
            jSONObject3 = jSONObject2;
            arrayList3 = arrayList2;
            r52 = c8;
            jSONArray = jSONArray2;
            length = i;
        }
        return arrayList3;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object, java.util.Map] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static LinkedHashMap m5115c(C2938d c2938d, C0586i c0586i) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        JSONObject jSONObject = c2938d.f10919c;
        String str = c2938d.f10922f;
        String str2 = c2938d.f10921e;
        String str3 = c2938d.f10920d;
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC2980h.m5135d("keys(...)", itKeys);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            AbstractC2980h.m5133b(next);
            String lowerCase = next.toLowerCase(Locale.ROOT);
            AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
            if (!f11013d.contains(lowerCase)) {
                String strOptString = jSONObject.optString(next);
                AbstractC2980h.m5133b(strOptString);
                if (strOptString.length() != 0) {
                    linkedHashMap.put(next, strOptString);
                }
            }
        }
        if (str3.length() > 0) {
            linkedHashMap.put("Referer", str3);
        }
        if (str2.length() > 0) {
            linkedHashMap.put("User-Agent", str2);
        }
        if (str.length() > 0) {
            try {
                JSONObject jSONObjectM5121j = m5121j(str);
                Iterator<String> itKeys2 = jSONObjectM5121j.keys();
                AbstractC2980h.m5135d("keys(...)", itKeys2);
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    String strOptString2 = jSONObjectM5121j.optString(next2);
                    AbstractC2980h.m5133b(strOptString2);
                    if (strOptString2.length() > 0) {
                        linkedHashMap.put(next2, strOptString2);
                    }
                }
            } catch (Throwable unused) {
            }
        }
        CharSequence charSequence = (CharSequence) linkedHashMap.get("User-Agent");
        if (charSequence == null || charSequence.length() == 0) {
            String str4 = (String) c0586i.f2342q.get("User-Agent");
            if (str4 == null) {
                str4 = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36";
                linkedHashMap.put("User-Agent", str4);
            } else {
                if (AbstractC1206h.m2630D0(str4)) {
                    str4 = null;
                }
                if (str4 == null) {
                }
                linkedHashMap.put("User-Agent", str4);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: d */
    public static final C2940e m5116d(JSONObject jSONObject, JSONObject jSONObject2, String str, String str2) {
        String strOptString = jSONObject2.optString("Referer");
        AbstractC2980h.m5135d("optString(...)", strOptString);
        String strOptString2 = jSONObject2.optString("userAgent");
        AbstractC2980h.m5135d("optString(...)", strOptString2);
        String strOptString3 = jSONObject2.optString("otherHeaders");
        AbstractC2980h.m5135d("optString(...)", strOptString3);
        return new C2940e(str, str2, jSONObject, strOptString, strOptString2, strOptString3);
    }

    /* renamed from: e */
    public static String m5117e(String str) {
        try {
            Charset charset = AbstractC1199a.f5077a;
            byte[] bytes = "yNPSFW@;Au,!ir%2".getBytes(charset);
            AbstractC2980h.m5135d("getBytes(...)", bytes);
            byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(bytes);
            AbstractC2980h.m5135d("digest(...)", bArrDigest);
            byte[] bArrM4262a = AbstractC2415i0.m4262a(str);
            if (bArrM4262a.length <= 16) {
                return C2181z.FRAGMENT_ENCODE_SET;
            }
            byte[] bArrM3730n0 = AbstractC1912g.m3730n0(bArrM4262a, 16, bArrM4262a.length);
            byte[] bArrM3730n02 = AbstractC1912g.m3730n0(bArrM4262a, 0, 16);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, new SecretKeySpec(bArrDigest, "AES"), new IvParameterSpec(bArrM3730n02));
            byte[] bArrDoFinal = cipher.doFinal(bArrM3730n0);
            AbstractC2980h.m5135d("doFinal(...)", bArrDoFinal);
            return new String(bArrDoFinal, charset);
        } catch (Throwable unused) {
            return C2181z.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a2 -> B:58:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00d5 -> B:58:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0148 -> B:54:0x0154). Please report as a decompilation issue!!! */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5118g(HashSet hashSet, String str, C0586i c0586i, Context context, String str2, Object obj, int i, AbstractC2320c abstractC2320c) throws Throwable {
        C2946h c2946h;
        Context context2;
        String str3;
        int i4;
        JSONArray jSONArray;
        int length;
        C2946h c2946h2;
        int i8;
        HashSet hashSet2;
        String str4;
        C0586i c0586i2;
        Object obj2;
        HashSet hashSet3;
        String str5;
        C0586i c0586i3;
        Context context3;
        String str6;
        JSONArray jSONArray2;
        int i9;
        int i10;
        int i11;
        if (abstractC2320c instanceof C2946h) {
            c2946h = (C2946h) abstractC2320c;
            int i12 = c2946h.f10983w;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c2946h.f10983w = i12 - Integer.MIN_VALUE;
            } else {
                c2946h = new C2946h(abstractC2320c);
            }
        }
        Object objM5118g = c2946h.f10982v;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i13 = c2946h.f10983w;
        if (i13 == 0) {
            AbstractC0714c.m1516d0(objM5118g);
            JSONArray jSONArrayPut = obj instanceof JSONArray ? (JSONArray) obj : obj instanceof JSONObject ? new JSONArray().put(obj) : null;
            if (jSONArrayPut == null) {
                return null;
            }
            context2 = context;
            str3 = str2;
            i4 = i;
            jSONArray = jSONArrayPut;
            length = jSONArrayPut.length();
            c2946h2 = c2946h;
            i8 = 0;
            hashSet2 = hashSet;
            str4 = str;
            c0586i2 = c0586i;
            if (i8 >= length) {
            }
        } else {
            if (i13 == 1) {
                i11 = c2946h.f10981u;
                i10 = c2946h.f10980t;
                i9 = c2946h.f10979s;
                jSONArray2 = c2946h.f10978r;
                str6 = c2946h.f10977q;
                context3 = c2946h.f10976p;
                c0586i3 = c2946h.f10975o;
                str5 = c2946h.f10974n;
                hashSet3 = c2946h.f10973m;
                AbstractC0714c.m1516d0(objM5118g);
                obj2 = objM5118g;
                c2946h.f10973m = hashSet3;
                c2946h.f10974n = str5;
                c2946h.f10975o = c0586i3;
                c2946h.f10976p = context3;
                c2946h.f10977q = str6;
                c2946h.f10978r = jSONArray2;
                c2946h.f10979s = i9;
                c2946h.f10980t = i10;
                c2946h.f10981u = i11;
                c2946h.f10983w = 2;
                C2946h c2946h3 = c2946h;
                String str7 = str6;
                Context context4 = context3;
                C0586i c0586i4 = c0586i3;
                String str8 = str5;
                HashSet hashSet4 = hashSet3;
                objM5118g = m5118g(hashSet4, str8, c0586i4, context4, str7, obj2, i9 + 1, c2946h3);
                if (objM5118g != enumC2273a) {
                }
                return enumC2273a;
            }
            if (i13 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = c2946h.f10981u;
            i10 = c2946h.f10980t;
            i9 = c2946h.f10979s;
            jSONArray2 = c2946h.f10978r;
            String str9 = c2946h.f10977q;
            Context context5 = c2946h.f10976p;
            C0586i c0586i5 = c2946h.f10975o;
            String str10 = c2946h.f10974n;
            HashSet hashSet5 = c2946h.f10973m;
            AbstractC0714c.m1516d0(objM5118g);
            JSONObject jSONObject = (JSONObject) objM5118g;
            if (jSONObject == null) {
                return jSONObject;
            }
            C0586i c0586i6 = c0586i5;
            c2946h2 = c2946h;
            c0586i2 = c0586i6;
            JSONArray jSONArray3 = jSONArray2;
            i4 = i9;
            str3 = str9;
            jSONArray = jSONArray3;
            str4 = str10;
            i8 = i10;
            context2 = context5;
            length = i11;
            hashSet2 = hashSet5;
            i8++;
            if (i8 >= length) {
                return null;
            }
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i8);
            if (jSONObjectOptJSONObject != null) {
                String string = jSONObjectOptJSONObject.toString();
                AbstractC2980h.m5135d("toString(...)", string);
                if (hashSet2.add(string)) {
                    if (jSONObjectOptJSONObject.has("servers")) {
                        Object objOpt = jSONObjectOptJSONObject.opt("id");
                        if (AbstractC2980h.m5132a(objOpt != null ? objOpt.toString() : null, str4)) {
                            return jSONObjectOptJSONObject;
                        }
                    } else {
                        String strOptString = jSONObjectOptJSONObject.optString("url");
                        AbstractC2980h.m5133b(strOptString);
                        if (AbstractC1214p.m2667t0(strOptString, "/get/", false) && i4 < 3) {
                            String strSubstring = strOptString.substring(1);
                            AbstractC2980h.m5135d("substring(...)", strSubstring);
                            c2946h2.f10973m = hashSet2;
                            c2946h2.f10974n = str4;
                            c2946h2.f10975o = c0586i2;
                            c2946h2.f10976p = context2;
                            c2946h2.f10977q = str3;
                            c2946h2.f10978r = jSONArray;
                            c2946h2.f10979s = i4;
                            c2946h2.f10980t = i8;
                            c2946h2.f10981u = length;
                            c2946h2.f10983w = 1;
                            Object objM5119h = m5119h(c0586i2, context2, strSubstring, str3, c2946h2);
                            if (objM5119h != enumC2273a) {
                                C2946h c2946h4 = c2946h2;
                                c0586i3 = c0586i2;
                                c2946h = c2946h4;
                                JSONArray jSONArray4 = jSONArray;
                                str6 = str3;
                                i9 = i4;
                                jSONArray2 = jSONArray4;
                                hashSet3 = hashSet2;
                                obj2 = objM5119h;
                                i11 = length;
                                context3 = context2;
                                i10 = i8;
                                str5 = str4;
                                c2946h.f10973m = hashSet3;
                                c2946h.f10974n = str5;
                                c2946h.f10975o = c0586i3;
                                c2946h.f10976p = context3;
                                c2946h.f10977q = str6;
                                c2946h.f10978r = jSONArray2;
                                c2946h.f10979s = i9;
                                c2946h.f10980t = i10;
                                c2946h.f10981u = i11;
                                c2946h.f10983w = 2;
                                C2946h c2946h32 = c2946h;
                                String str72 = str6;
                                Context context42 = context3;
                                C0586i c0586i42 = c0586i3;
                                String str82 = str5;
                                HashSet hashSet42 = hashSet3;
                                objM5118g = m5118g(hashSet42, str82, c0586i42, context42, str72, obj2, i9 + 1, c2946h32);
                                if (objM5118g != enumC2273a) {
                                    hashSet5 = hashSet42;
                                    str10 = str82;
                                    c0586i5 = c0586i42;
                                    context5 = context42;
                                    str9 = str72;
                                    c2946h = c2946h32;
                                    JSONObject jSONObject2 = (JSONObject) objM5118g;
                                    if (jSONObject2 == null) {
                                    }
                                }
                            }
                            return enumC2273a;
                        }
                    }
                }
            }
            i8++;
            if (i8 >= length) {
            }
        }
    }

    /* renamed from: h */
    public static Object m5119h(C0586i c0586i, Context context, String str, String str2, AbstractC2320c abstractC2320c) {
        C2054e c2054e = AbstractC1290e0.f5316a;
        return AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2948i(str, c0586i, context, str2, null), abstractC2320c);
    }

    /* renamed from: i */
    public static String m5120i(String str, String str2) throws NoSuchAlgorithmException {
        String str3 = str + ":" + str2;
        AbstractC2980h.m5136e("input", str3);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str3.getBytes(AbstractC1199a.f5077a);
        AbstractC2980h.m5135d("getBytes(...)", bytes);
        byte[] bArrDigest = messageDigest.digest(bytes);
        AbstractC2980h.m5135d("digest(...)", bArrDigest);
        StringBuilder sb = new StringBuilder(bArrDigest.length * 2);
        for (byte b7 : bArrDigest) {
            sb.append("0123456789abcdef".charAt((b7 & 255) >>> 4));
            sb.append("0123456789abcdef".charAt(b7 & 15));
        }
        String string = sb.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        return string;
    }

    /* renamed from: j */
    public static JSONObject m5121j(Object obj) {
        if (obj instanceof JSONObject) {
            return (JSONObject) obj;
        }
        if (!(obj instanceof String)) {
            return new JSONObject();
        }
        try {
            return new JSONObject((String) obj);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5122f(C0586i c0586i, Context context, AbstractC2320c abstractC2320c) throws Throwable {
        C2944g c2944g;
        JSONObject jSONObject;
        if (abstractC2320c instanceof C2944g) {
            c2944g = (C2944g) abstractC2320c;
            int i = c2944g.f10964o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2944g.f10964o = i - Integer.MIN_VALUE;
            } else {
                c2944g = new C2944g(this, abstractC2320c);
            }
        }
        Object objM5119h = c2944g.f10962m;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2944g.f10964o;
        AtomicReference atomicReference = f11012c;
        AtomicReference atomicReference2 = f11011b;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(objM5119h);
            JSONObject jSONObject2 = (JSONObject) atomicReference2.get();
            if (jSONObject2 != null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Object obj = atomicReference.get();
                AbstractC2980h.m5135d("get(...)", obj);
                if (jCurrentTimeMillis - ((Number) obj).longValue() < 21600000) {
                    return jSONObject2;
                }
            }
            c2944g.f10964o = 1;
            objM5119h = m5119h(c0586i, context, "settings/app_tv_box.php?v=", null, c2944g);
            if (objM5119h == enumC2273a) {
                return enumC2273a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0714c.m1516d0(objM5119h);
        }
        if (objM5119h instanceof JSONArray) {
            jSONObject = ((JSONArray) objM5119h).optJSONObject(0);
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = objM5119h instanceof JSONObject ? (JSONObject) objM5119h : new JSONObject();
        }
        JSONObject jSONObject3 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        AbstractC2980h.m5135d("keys(...)", itKeys);
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objOpt = jSONObject.opt(next);
            if (objOpt instanceof String) {
                String str = (String) objOpt;
                if (str.length() >= 2 && AbstractC1214p.m2667t0(str, "\"", false) && AbstractC1214p.m2660m0(str, "\"", false)) {
                    try {
                        Object objNextValue = new JSONTokener((String) objOpt).nextValue();
                        String str2 = objNextValue instanceof String ? (String) objNextValue : null;
                        str = str2 == null ? (String) objOpt : str2;
                    } catch (Throwable unused) {
                    }
                    String strM5117e = m5117e(str);
                    if (strM5117e.length() > 0) {
                        str = strM5117e;
                    }
                    jSONObject3.put(next, str);
                }
            }
            if (objOpt == null) {
                objOpt = JSONObject.NULL;
            }
            jSONObject3.put(next, objOpt);
        }
        String strOptString = jSONObject3.optString("stream_hosts");
        AbstractC2980h.m5135d("optString(...)", strOptString);
        List listM2637K0 = AbstractC1206h.m2637K0(strOptString, new String[]{"|"});
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : listM2637K0) {
            if (((String) obj2).length() > 0) {
                arrayList.add(obj2);
            }
        }
        jSONObject3.put("stream_hosts", new JSONArray((Collection) arrayList));
        atomicReference2.set(jSONObject3);
        atomicReference.set(new Long(System.currentTimeMillis()));
        return jSONObject3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x011a A[Catch: all -> 0x0053, TryCatch #2 {all -> 0x0053, blocks: (B:14:0x004d, B:19:0x0065, B:24:0x009c, B:27:0x00ae, B:44:0x0112, B:46:0x011a, B:54:0x0140, B:56:0x0146, B:60:0x017a, B:53:0x0129, B:30:0x00c2, B:40:0x00f2, B:33:0x00ce, B:36:0x00df), top: B:125:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0146 A[Catch: all -> 0x0053, TryCatch #2 {all -> 0x0053, blocks: (B:14:0x004d, B:19:0x0065, B:24:0x009c, B:27:0x00ae, B:44:0x0112, B:46:0x011a, B:54:0x0140, B:56:0x0146, B:60:0x017a, B:53:0x0129, B:30:0x00c2, B:40:0x00f2, B:33:0x00ce, B:36:0x00df), top: B:125:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017a A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #2 {all -> 0x0053, blocks: (B:14:0x004d, B:19:0x0065, B:24:0x009c, B:27:0x00ae, B:44:0x0112, B:46:0x011a, B:54:0x0140, B:56:0x0146, B:60:0x017a, B:53:0x0129, B:30:0x00c2, B:40:0x00f2, B:33:0x00ce, B:36:0x00df), top: B:125:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e6 A[Catch: all -> 0x0206, TryCatch #3 {all -> 0x0206, blocks: (B:95:0x024f, B:98:0x025f, B:100:0x0265, B:102:0x026b, B:109:0x027b, B:111:0x0281, B:113:0x0298, B:112:0x028d, B:72:0x01e2, B:74:0x01e6, B:78:0x0209, B:83:0x022c, B:85:0x0230, B:91:0x023c, B:68:0x01d4), top: B:126:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0209 A[Catch: all -> 0x0206, TryCatch #3 {all -> 0x0206, blocks: (B:95:0x024f, B:98:0x025f, B:100:0x0265, B:102:0x026b, B:109:0x027b, B:111:0x0281, B:113:0x0298, B:112:0x028d, B:72:0x01e2, B:74:0x01e6, B:78:0x0209, B:83:0x022c, B:85:0x0230, B:91:0x023c, B:68:0x01d4), top: B:126:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025f A[Catch: all -> 0x0206, TryCatch #3 {all -> 0x0206, blocks: (B:95:0x024f, B:98:0x025f, B:100:0x0265, B:102:0x026b, B:109:0x027b, B:111:0x0281, B:113:0x0298, B:112:0x028d, B:72:0x01e2, B:74:0x01e6, B:78:0x0209, B:83:0x022c, B:85:0x0230, B:91:0x023c, B:68:0x01d4), top: B:126:0x01d4 }] */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v19, types: [p6.c] */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r10v9, types: [android.content.Context] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5123k(MainActivity mainActivity, Channel channel, AbstractC2320c abstractC2320c) {
        C2950j c2950j;
        String str;
        MainActivity mainActivity2;
        Channel channel2;
        Object objM2857r;
        C2952k c2952k;
        Object objM5122f;
        Context context;
        C2952k c2952k2;
        Channel channel3;
        C0586i c0586i;
        String xCatInfo;
        String strEncodeToString;
        JSONObject jSONObject;
        Channel channel4;
        String str2;
        Context context2;
        Object obj;
        C0586i c0586i2;
        String str3;
        C2952k c2952k3;
        String str4;
        String str5;
        Channel channel5;
        ?? r02;
        Object objM5118g;
        C2952k c2952k4;
        JSONObject jSONObject2;
        C0586i c0586i3;
        Channel channel6;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        Channel channel7;
        C2952k c2952k5;
        List listM5114b;
        Integer numM2658k0;
        C1921p c1921p = C1921p.f7187j;
        if (abstractC2320c instanceof C2950j) {
            c2950j = (C2950j) abstractC2320c;
            int i = c2950j.f11004u;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2950j.f11004u = i - Integer.MIN_VALUE;
            } else {
                c2950j = new C2950j(this, abstractC2320c);
            }
        }
        C2950j c2950j2 = c2950j;
        Object objM2857r2 = c2950j2.f11002s;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        try {
            switch (c2950j2.f11004u) {
                case 0:
                    AbstractC0714c.m1516d0(objM2857r2);
                    c2950j2.f10996m = this;
                    mainActivity2 = mainActivity;
                    c2950j2.f10997n = mainActivity2;
                    channel2 = channel;
                    c2950j2.f10998o = channel2;
                    c2950j2.f11004u = 1;
                    objM2857r = C0585h.f2325a;
                    if (objM2857r == null) {
                        C2054e c2054e = AbstractC1290e0.f5316a;
                        objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0584g(2, null), c2950j2);
                    }
                    if (objM2857r == enumC2273a) {
                        return enumC2273a;
                    }
                    c2952k = this;
                    C0586i c0586i4 = (C0586i) objM2857r;
                    c2950j2.f10996m = c2952k;
                    c2950j2.f10997n = mainActivity2;
                    c2950j2.f10998o = channel2;
                    c2950j2.f10999p = c0586i4;
                    c2950j2.f11004u = 2;
                    objM5122f = c2952k.m5122f(c0586i4, mainActivity2, c2950j2);
                    if (objM5122f != enumC2273a) {
                        return enumC2273a;
                    }
                    C2952k c2952k6 = c2952k;
                    context = mainActivity2;
                    objM2857r2 = objM5122f;
                    c2952k2 = c2952k6;
                    channel3 = channel2;
                    c0586i = c0586i4;
                    JSONObject jSONObject5 = (JSONObject) objM2857r2;
                    xCatInfo = channel3.getXCatInfo();
                    if (xCatInfo != null) {
                        if (AbstractC1206h.m2630D0(xCatInfo)) {
                            xCatInfo = null;
                        }
                        if (xCatInfo != null) {
                            strEncodeToString = xCatInfo;
                            if (channel3.isSub()) {
                                String str6 = "get/?from=channels2&parent=" + channel3.getParent() + "&cat=channels";
                                c2950j2.f10996m = c2952k2;
                                c2950j2.f10997n = context;
                                c2950j2.f10998o = channel3;
                                c2950j2.f10999p = c0586i;
                                c2950j2.f11000q = jSONObject5;
                                c2950j2.f11001r = strEncodeToString;
                                c2950j2.f11004u = 3;
                                c2952k2.getClass();
                                Object objM5119h = m5119h(c0586i, context, str6, strEncodeToString, c2950j2);
                                if (objM5119h != enumC2273a) {
                                    jSONObject = jSONObject5;
                                    objM2857r2 = objM5119h;
                                    str4 = strEncodeToString;
                                    str2 = str4;
                                    context2 = context;
                                    c2952k3 = c2952k2;
                                    obj = objM2857r2;
                                    channel4 = channel3;
                                    c0586i2 = c0586i;
                                    str3 = "GenResolver";
                                    try {
                                        String idGen = channel4.getIdGen();
                                        AbstractC2980h.m5133b(idGen);
                                        c2950j2.f10996m = c2952k3;
                                        c2950j2.f10997n = channel4;
                                        c2950j2.f10998o = c0586i2;
                                        c2950j2.f10999p = jSONObject;
                                        c2950j2.f11000q = null;
                                        c2950j2.f11001r = null;
                                        c2950j2.f11004u = 5;
                                        c2952k3.getClass();
                                        str5 = str3;
                                        try {
                                            channel5 = channel4;
                                            str = str5;
                                            r02 = 0;
                                        } catch (Throwable th) {
                                            th = th;
                                            str = str5;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str = str3;
                                    }
                                    try {
                                        objM5118g = m5118g(new HashSet(), idGen, c0586i2, context2, str2, obj, 0, c2950j2);
                                        if (objM5118g == enumC2273a) {
                                            C0586i c0586i5 = c0586i2;
                                            c2952k4 = c2952k3;
                                            jSONObject2 = jSONObject;
                                            c0586i3 = c0586i5;
                                            channel6 = channel5;
                                            jSONObject3 = (JSONObject) objM5118g;
                                            if (jSONObject3 != null) {
                                                Log.w(str, "no GEN match for id_gen=" + channel6.getIdGen() + " parent=" + channel6.getParent());
                                                return c1921p;
                                            }
                                            c2950j2.f10996m = c2952k4;
                                            c2950j2.f10997n = channel6;
                                            c2950j2.f10998o = c0586i3;
                                            c2950j2.f10999p = jSONObject2;
                                            c2950j2.f11000q = jSONObject3;
                                            c2950j2.f11004u = 6;
                                            c2952k4.getClass();
                                            String strOptString = jSONObject2.optString("remote_addr_url");
                                            AbstractC2980h.m5133b(strOptString);
                                            if (AbstractC1206h.m2630D0(strOptString)) {
                                                strOptString = r02;
                                            }
                                            if (strOptString == null) {
                                                strOptString = c0586i3.f2348w;
                                                if (strOptString == null || AbstractC1206h.m2630D0(strOptString)) {
                                                    strOptString = r02;
                                                }
                                                if (strOptString == null) {
                                                    strOptString = "https://api.ipify.org/";
                                                }
                                            }
                                            C2054e c2054e2 = AbstractC1290e0.f5316a;
                                            objM2857r2 = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2942f(strOptString, c0586i3, r02), c2950j2);
                                            if (objM2857r2 != enumC2273a) {
                                                jSONObject4 = jSONObject3;
                                                channel7 = channel6;
                                                c2952k5 = c2952k4;
                                                c2952k5.getClass();
                                                listM5114b = m5114b(jSONObject4, jSONObject2, (String) objM2857r2);
                                                if (!listM5114b.isEmpty()) {
                                                    return c1921p;
                                                }
                                                String server = channel7.getServer();
                                                int iIntValue = (server == null || (numM2658k0 = AbstractC1213o.m2658k0(server)) == null) ? 0 : numM2658k0.intValue();
                                                if (iIntValue == 0) {
                                                    iIntValue = 1;
                                                }
                                                C2938d c2938d = (iIntValue < 1 || iIntValue > listM5114b.size()) ? (C2938d) listM5114b.get(listM5114b.size() - 1) : (C2938d) listM5114b.get(listM5114b.size() - iIntValue);
                                                Log.i(str, "resolved kind=" + c2938d.f10918b + " server=" + iIntValue + " of " + listM5114b.size());
                                                return AbstractC0715d.m1551T(new ResolvedStream(c2938d.f10917a, m5115c(c2938d, c0586i3), null, 4, null));
                                            }
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        Log.w(str, "gen stream error: " + th.getMessage(), th);
                                        return c1921p;
                                    }
                                }
                            } else {
                                String str7 = "get/?from=channels&cat=categories&parent=" + channel3.getParent();
                                c2950j2.f10996m = c2952k2;
                                c2950j2.f10997n = context;
                                c2950j2.f10998o = channel3;
                                c2950j2.f10999p = c0586i;
                                c2950j2.f11000q = jSONObject5;
                                c2950j2.f11001r = strEncodeToString;
                                c2950j2.f11004u = 4;
                                c2952k2.getClass();
                                Object objM5119h2 = m5119h(c0586i, context, str7, strEncodeToString, c2950j2);
                                if (objM5119h2 != enumC2273a) {
                                    jSONObject = jSONObject5;
                                    channel4 = channel3;
                                    str2 = strEncodeToString;
                                    context2 = context;
                                    obj = objM5119h2;
                                    c0586i2 = c0586i;
                                    str3 = "GenResolver";
                                    c2952k3 = c2952k2;
                                    String idGen2 = channel4.getIdGen();
                                    AbstractC2980h.m5133b(idGen2);
                                    c2950j2.f10996m = c2952k3;
                                    c2950j2.f10997n = channel4;
                                    c2950j2.f10998o = c0586i2;
                                    c2950j2.f10999p = jSONObject;
                                    c2950j2.f11000q = null;
                                    c2950j2.f11001r = null;
                                    c2950j2.f11004u = 5;
                                    c2952k3.getClass();
                                    str5 = str3;
                                    channel5 = channel4;
                                    str = str5;
                                    r02 = 0;
                                    objM5118g = m5118g(new HashSet(), idGen2, c0586i2, context2, str2, obj, 0, c2950j2);
                                    if (objM5118g == enumC2273a) {
                                    }
                                }
                            }
                            return enumC2273a;
                        }
                    }
                    String parent = channel3.getParent();
                    AbstractC2980h.m5133b(parent);
                    byte[] bytes = parent.getBytes(AbstractC1199a.f5077a);
                    AbstractC2980h.m5135d("getBytes(...)", bytes);
                    strEncodeToString = Base64.encodeToString(bytes, 2);
                    if (channel3.isSub()) {
                    }
                    return enumC2273a;
                case 1:
                    channel2 = (Channel) c2950j2.f10998o;
                    ?? r10 = (Context) c2950j2.f10997n;
                    c2952k = c2950j2.f10996m;
                    AbstractC0714c.m1516d0(objM2857r2);
                    objM2857r = objM2857r2;
                    mainActivity2 = r10;
                    C0586i c0586i42 = (C0586i) objM2857r;
                    c2950j2.f10996m = c2952k;
                    c2950j2.f10997n = mainActivity2;
                    c2950j2.f10998o = channel2;
                    c2950j2.f10999p = c0586i42;
                    c2950j2.f11004u = 2;
                    objM5122f = c2952k.m5122f(c0586i42, mainActivity2, c2950j2);
                    if (objM5122f != enumC2273a) {
                    }
                    break;
                case 2:
                    c0586i = (C0586i) c2950j2.f10999p;
                    Channel channel8 = (Channel) c2950j2.f10998o;
                    Context context3 = (Context) c2950j2.f10997n;
                    C2952k c2952k7 = c2950j2.f10996m;
                    AbstractC0714c.m1516d0(objM2857r2);
                    c2952k2 = c2952k7;
                    channel3 = channel8;
                    context = context3;
                    JSONObject jSONObject52 = (JSONObject) objM2857r2;
                    xCatInfo = channel3.getXCatInfo();
                    if (xCatInfo != null) {
                    }
                    String parent2 = channel3.getParent();
                    AbstractC2980h.m5133b(parent2);
                    byte[] bytes2 = parent2.getBytes(AbstractC1199a.f5077a);
                    AbstractC2980h.m5135d("getBytes(...)", bytes2);
                    strEncodeToString = Base64.encodeToString(bytes2, 2);
                    if (channel3.isSub()) {
                    }
                    return enumC2273a;
                case 3:
                    str4 = c2950j2.f11001r;
                    jSONObject = c2950j2.f11000q;
                    c0586i = (C0586i) c2950j2.f10999p;
                    channel3 = (Channel) c2950j2.f10998o;
                    context = (Context) c2950j2.f10997n;
                    c2952k2 = c2950j2.f10996m;
                    AbstractC0714c.m1516d0(objM2857r2);
                    str2 = str4;
                    context2 = context;
                    c2952k3 = c2952k2;
                    obj = objM2857r2;
                    channel4 = channel3;
                    c0586i2 = c0586i;
                    str3 = "GenResolver";
                    String idGen22 = channel4.getIdGen();
                    AbstractC2980h.m5133b(idGen22);
                    c2950j2.f10996m = c2952k3;
                    c2950j2.f10997n = channel4;
                    c2950j2.f10998o = c0586i2;
                    c2950j2.f10999p = jSONObject;
                    c2950j2.f11000q = null;
                    c2950j2.f11001r = null;
                    c2950j2.f11004u = 5;
                    c2952k3.getClass();
                    str5 = str3;
                    channel5 = channel4;
                    str = str5;
                    r02 = 0;
                    objM5118g = m5118g(new HashSet(), idGen22, c0586i2, context2, str2, obj, 0, c2950j2);
                    if (objM5118g == enumC2273a) {
                    }
                    break;
                case 4:
                    str4 = c2950j2.f11001r;
                    jSONObject = c2950j2.f11000q;
                    c0586i = (C0586i) c2950j2.f10999p;
                    channel3 = (Channel) c2950j2.f10998o;
                    context = (Context) c2950j2.f10997n;
                    c2952k2 = c2950j2.f10996m;
                    AbstractC0714c.m1516d0(objM2857r2);
                    str2 = str4;
                    context2 = context;
                    c2952k3 = c2952k2;
                    obj = objM2857r2;
                    channel4 = channel3;
                    c0586i2 = c0586i;
                    str3 = "GenResolver";
                    String idGen222 = channel4.getIdGen();
                    AbstractC2980h.m5133b(idGen222);
                    c2950j2.f10996m = c2952k3;
                    c2950j2.f10997n = channel4;
                    c2950j2.f10998o = c0586i2;
                    c2950j2.f10999p = jSONObject;
                    c2950j2.f11000q = null;
                    c2950j2.f11001r = null;
                    c2950j2.f11004u = 5;
                    c2952k3.getClass();
                    str5 = str3;
                    channel5 = channel4;
                    str = str5;
                    r02 = 0;
                    objM5118g = m5118g(new HashSet(), idGen222, c0586i2, context2, str2, obj, 0, c2950j2);
                    if (objM5118g == enumC2273a) {
                    }
                    break;
                case 5:
                    jSONObject2 = (JSONObject) c2950j2.f10999p;
                    c0586i3 = (C0586i) c2950j2.f10998o;
                    Channel channel9 = (Channel) c2950j2.f10997n;
                    c2952k4 = c2950j2.f10996m;
                    AbstractC0714c.m1516d0(objM2857r2);
                    str = "GenResolver";
                    channel6 = channel9;
                    objM5118g = objM2857r2;
                    r02 = 0;
                    jSONObject3 = (JSONObject) objM5118g;
                    if (jSONObject3 != null) {
                    }
                    break;
                case 6:
                    jSONObject4 = c2950j2.f11000q;
                    jSONObject2 = (JSONObject) c2950j2.f10999p;
                    c0586i3 = (C0586i) c2950j2.f10998o;
                    channel7 = (Channel) c2950j2.f10997n;
                    c2952k5 = c2950j2.f10996m;
                    AbstractC0714c.m1516d0(objM2857r2);
                    str = "GenResolver";
                    c2952k5.getClass();
                    listM5114b = m5114b(jSONObject4, jSONObject2, (String) objM2857r2);
                    if (!listM5114b.isEmpty()) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th4) {
            th = th4;
            str = "GenResolver";
        }
    }
}
