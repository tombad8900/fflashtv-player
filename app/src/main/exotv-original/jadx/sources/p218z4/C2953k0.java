package p218z4;

import android.util.Log;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.model.Channel;
import com.exotv.net.model.ResolvedStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okhttp3.C2181z;
import org.json.JSONArray;
import org.json.JSONObject;
import p016b5.C0578a;
import p016b5.C0579b;
import p016b5.C0580c;
import p016b5.C0581d;
import p016b5.C0587j;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1214p;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p102l6.C1687d;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1924s;
import p111m6.C1921p;
import p119n6.C2023c;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p168t2.AbstractC2415i0;
import p168t2.AbstractC2429w;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.k0 */
/* loaded from: classes.dex */
public final class C2953k0 {

    /* renamed from: a */
    public static final C2953k0 f11014a = new C2953k0();

    /* renamed from: b */
    public static List m5124b(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("data");
        if (jSONArrayOptJSONArray == null) {
            return C1921p.f7187j;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject != null) {
                String strOptString = jSONObjectOptJSONObject.optString("url");
                AbstractC2980h.m5133b(strOptString);
                ResolvedStream resolvedStream = null;
                Object obj = null;
                String str = !AbstractC1206h.m2630D0(strOptString) ? strOptString : null;
                if (str != null) {
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("headers");
                    if (jSONObjectOptJSONObject2 != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
                        AbstractC2980h.m5135d("keys(...)", itKeys);
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            linkedHashMap2.put(next, jSONObjectOptJSONObject2.optString(next));
                        }
                    }
                    Set setKeySet = linkedHashMap2.keySet();
                    AbstractC2980h.m5135d("<get-keys>(...)", setKeySet);
                    if (!setKeySet.isEmpty()) {
                        Iterator it = setKeySet.iterator();
                        while (it.hasNext()) {
                            if (AbstractC1214p.m2661n0((String) it.next(), "User-Agent")) {
                                break;
                            }
                        }
                    }
                    String strOptString2 = jSONObjectOptJSONObject.optString("user_agent");
                    AbstractC2980h.m5133b(strOptString2);
                    if (AbstractC1206h.m2630D0(strOptString2)) {
                        strOptString2 = null;
                    }
                    if (strOptString2 != null) {
                        linkedHashMap2.put("User-Agent", strOptString2);
                    }
                    Set setKeySet2 = linkedHashMap2.keySet();
                    AbstractC2980h.m5135d("<get-keys>(...)", setKeySet2);
                    if (!setKeySet2.isEmpty()) {
                        Iterator it2 = setKeySet2.iterator();
                        while (it2.hasNext()) {
                            if (AbstractC1214p.m2661n0((String) it2.next(), "Referer")) {
                                break;
                            }
                        }
                    }
                    String strOptString3 = jSONObjectOptJSONObject.optString("referer");
                    AbstractC2980h.m5133b(strOptString3);
                    if (AbstractC1206h.m2630D0(strOptString3)) {
                        strOptString3 = null;
                    }
                    if (strOptString3 != null) {
                        linkedHashMap2.put("Referer", strOptString3);
                    }
                    Set setKeySet3 = linkedHashMap2.keySet();
                    AbstractC2980h.m5135d("<get-keys>(...)", setKeySet3);
                    Iterator it3 = setKeySet3.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (AbstractC1214p.m2661n0((String) next2, "User-Agent")) {
                            obj = next2;
                            break;
                        }
                    }
                    String str2 = (String) obj;
                    if (str2 != null) {
                        String str3 = (String) linkedHashMap2.get(str2);
                        if (str3 == null) {
                            str3 = C2181z.FRAGMENT_ENCODE_SET;
                        }
                        if (AbstractC1206h.m2649u0(str3, "\u3164 ", false)) {
                            linkedHashMap2.put(str2, C2181z.FRAGMENT_ENCODE_SET);
                        }
                    }
                    resolvedStream = new ResolvedStream(str, linkedHashMap2, null, 4, null);
                }
                if (resolvedStream != null) {
                    if (!linkedHashMap.containsKey(resolvedStream.getUrl())) {
                        linkedHashMap.put(resolvedStream.getUrl(), resolvedStream);
                    }
                    if (linkedHashMap.size() >= 6) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        Collection collectionValues = linkedHashMap.values();
        AbstractC2980h.m5135d("<get-values>(...)", collectionValues);
        return AbstractC1913h.m3747L0(collectionValues);
    }

    /* renamed from: c */
    public static List m5125c(JSONObject jSONObject) {
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArray;
        Iterator it = AbstractC1914i.m3753t0("data", "categories", "items", "channels", "list").iterator();
        while (true) {
            jSONArrayOptJSONArray = null;
            if (!it.hasNext()) {
                jSONArray = null;
                break;
            }
            Object objOpt = jSONObject.opt((String) it.next());
            if (objOpt instanceof JSONArray) {
                jSONArray = (JSONArray) objOpt;
                break;
            }
        }
        if (jSONArray == null) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
            if (jSONObjectOptJSONObject != null) {
                jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("items");
            }
        } else {
            jSONArrayOptJSONArray = jSONArray;
        }
        if (jSONArrayOptJSONArray == null) {
            return C1921p.f7187j;
        }
        C2023c c2023cM1572w = AbstractC0715d.m1572w();
        int length = jSONArrayOptJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            if (jSONObjectOptJSONObject2 != null) {
                c2023cM1572w.add(jSONObjectOptJSONObject2);
            }
        }
        return AbstractC0715d.m1563h(c2023cM1572w);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5126a(String str, String str2, AbstractC2320c abstractC2320c) {
        C2947h0 c2947h0;
        String str3;
        JSONArray jSONArray;
        CharSequence charSequenceM2645S0;
        if (abstractC2320c instanceof C2947h0) {
            c2947h0 = (C2947h0) abstractC2320c;
            int i = c2947h0.f10987p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2947h0.f10987p = i - Integer.MIN_VALUE;
            } else {
                c2947h0 = new C2947h0(this, abstractC2320c);
            }
        }
        Object objM2857r = c2947h0.f10985n;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2947h0.f10987p;
        JSONObject jSONObject = null;
        C1921p c1921p = C1921p.f7187j;
        try {
            if (i4 == 0) {
                AbstractC0714c.m1516d0(objM2857r);
                c2947h0.f10984m = str;
                c2947h0.f10987p = 1;
                C2054e c2054e = AbstractC1290e0.f5316a;
                objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0579b(str2, null), c2947h0);
                if (objM2857r == enumC2273a) {
                    return enumC2273a;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = c2947h0.f10984m;
                AbstractC0714c.m1516d0(objM2857r);
            }
            String str4 = (String) objM2857r;
            if (str4 == null) {
                return c1921p;
            }
            try {
                byte[] bArrM4315t = AbstractC2429w.m4315t("4e5c6d1a8b3fe8137a3b9df26a9c4de195267b8e6f6c0b4e1c3ae1d27f2b4e6f");
                byte[] bArrM4315t2 = AbstractC2429w.m4315t("a9c21f8d7e6b4a9db12e4f9d5c1a7b8e");
                byte[] bArrM4262a = AbstractC2415i0.m4262a(AbstractC1206h.m2645S0(str4).toString());
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(2, new SecretKeySpec(bArrM4315t, "AES"), new IvParameterSpec(bArrM4315t2));
                byte[] bArrDoFinal = cipher.doFinal(bArrM4262a);
                AbstractC2980h.m5135d("doFinal(...)", bArrDoFinal);
                str3 = new String(bArrDoFinal, AbstractC1199a.f5077a);
            } catch (Throwable unused) {
                str3 = null;
            }
            if (str3 != null) {
                JSONObject jSONObjectOptJSONObject = new JSONObject(str3).optJSONObject("data");
                if (jSONObjectOptJSONObject == null || (jSONArray = jSONObjectOptJSONObject.optJSONArray("items")) == null) {
                    jSONArray = new JSONArray();
                }
                int length = jSONArray.length();
                int i8 = 0;
                while (true) {
                    if (i8 >= length) {
                        break;
                    }
                    JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(i8);
                    if (jSONObjectOptJSONObject2 != null) {
                        Object objOpt = jSONObjectOptJSONObject2.opt("id");
                        if (AbstractC2980h.m5132a(objOpt != null ? objOpt.toString() : null, str)) {
                            jSONObject = jSONObjectOptJSONObject2;
                            break;
                        }
                    }
                    i8++;
                }
                if (jSONObject != null) {
                    String strOptString = jSONObject.optString("source");
                    AbstractC2980h.m5135d("optString(...)", strOptString);
                    int iM2628B0 = AbstractC1206h.m2628B0(strOptString, "http", 0, true, 2);
                    if (iM2628B0 >= 0) {
                        String strSubstring = strOptString.substring(iM2628B0);
                        AbstractC2980h.m5135d("substring(...)", strSubstring);
                        charSequenceM2645S0 = AbstractC1206h.m2645S0(strSubstring);
                    } else {
                        charSequenceM2645S0 = AbstractC1206h.m2645S0(strOptString);
                    }
                    String string = charSequenceM2645S0.toString();
                    return AbstractC1206h.m2630D0(string) ? c1921p : AbstractC0715d.m1551T(new ResolvedStream(string, AbstractC1924s.m3760U(new C1687d("Referer", "https://www2.maziika.shop/"), new C1687d("User-Agent", jSONObject.optString("agent"))), null, 4, null));
                }
            }
            return c1921p;
        } catch (Throwable th) {
            Log.w("SimpleResolvers", "o resolve error: " + th.getMessage(), th);
            return c1921p;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5127d(String str, AbstractC2320c abstractC2320c) {
        C2949i0 c2949i0;
        C2953k0 c2953k0;
        if (abstractC2320c instanceof C2949i0) {
            c2949i0 = (C2949i0) abstractC2320c;
            int i = c2949i0.f10995p;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2949i0.f10995p = i - Integer.MIN_VALUE;
            } else {
                c2949i0 = new C2949i0(this, abstractC2320c);
            }
        }
        Object objM2857r = c2949i0.f10993n;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2949i0.f10995p;
        C0587j c0587j = null;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(objM2857r);
            try {
                c2949i0.f10992m = this;
                c2949i0.f10995p = 1;
                try {
                    C2054e c2054e = AbstractC1290e0.f5316a;
                    objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0578a(str, null), c2949i0);
                    if (objM2857r == enumC2273a) {
                        return enumC2273a;
                    }
                    c2953k0 = this;
                } catch (Throwable th) {
                    th = th;
                    c2953k0 = this;
                    Log.w("SimpleResolvers", "yt resolve error: " + th.getMessage(), th);
                    C1921p c1921p = C1921p.f7187j;
                    if (c0587j == null) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c2953k0 = c2949i0.f10992m;
            try {
                AbstractC0714c.m1516d0(objM2857r);
            } catch (Throwable th3) {
                th = th3;
                Log.w("SimpleResolvers", "yt resolve error: " + th.getMessage(), th);
                C1921p c1921p2 = C1921p.f7187j;
                if (c0587j == null) {
                }
            }
        }
        c0587j = (C0587j) objM2857r;
        C1921p c1921p22 = C1921p.f7187j;
        if (c0587j == null) {
            return c1921p22;
        }
        String str2 = c0587j.f2350a;
        String str3 = c0587j.f2351b;
        c2953k0.getClass();
        try {
            byte[] bArrM4262a = AbstractC2415i0.m4262a(str2);
            if (str3 == null) {
                str3 = C2181z.FRAGMENT_ENCODE_SET;
            }
            byte[] bytes = "c!xZj+N9&G@Ev@vw".concat(str3).getBytes(AbstractC1199a.f5077a);
            AbstractC2980h.m5135d("getBytes(...)", bytes);
            byte[] bArr = new byte[bArrM4262a.length];
            int length = bArrM4262a.length;
            for (int i8 = 0; i8 < length; i8++) {
                bArr[i8] = (byte) (bArrM4262a[i8] ^ bytes[i8 % bytes.length]);
            }
            return m5124b(new JSONObject(new String(bArr, AbstractC1199a.f5077a)));
        } catch (Throwable th4) {
            Log.w("SimpleResolvers", "yt payload could not be read: " + th4.getMessage());
            return c1921p22;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x01e6, code lost:
    
        if (r0 == r3) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:14:0x0040, B:78:0x01e9, B:21:0x0054, B:55:0x0140, B:58:0x0145, B:61:0x0153, B:63:0x0166, B:64:0x0178, B:65:0x018f, B:67:0x0195, B:71:0x01ac, B:73:0x01b0, B:75:0x01d3, B:24:0x0060, B:31:0x0086, B:34:0x008c, B:37:0x0099, B:39:0x00b1, B:40:0x00c4, B:41:0x00d9, B:43:0x00df, B:47:0x00f6, B:49:0x00fa, B:51:0x011d, B:27:0x006c), top: B:82:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5128e(Channel channel, AbstractC2320c abstractC2320c) {
        C2951j0 c2951j0;
        Channel channel2;
        Object objM2857r;
        C2953k0 c2953k0;
        String str;
        Object next;
        int i;
        Channel channel3;
        C0587j c0587j;
        Object next2;
        if (abstractC2320c instanceof C2951j0) {
            c2951j0 = (C2951j0) abstractC2320c;
            int i4 = c2951j0.f11009q;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c2951j0.f11009q = i4 - Integer.MIN_VALUE;
            } else {
                c2951j0 = new C2951j0(this, abstractC2320c);
            }
        }
        Object objM5127d = c2951j0.f11007o;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i8 = c2951j0.f11009q;
        C1921p c1921p = C1921p.f7187j;
        try {
            if (i8 == 0) {
                AbstractC0714c.m1516d0(objM5127d);
                c2951j0.f11005m = this;
                channel2 = channel;
                c2951j0.f11006n = channel2;
                c2951j0.f11009q = 1;
                C2054e c2054e = AbstractC1290e0.f5316a;
                objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0580c(2, null), c2951j0);
                if (objM2857r == enumC2273a) {
                    return enumC2273a;
                }
                c2953k0 = this;
            } else {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0714c.m1516d0(objM5127d);
                        return (List) objM5127d;
                    }
                    channel3 = c2951j0.f11006n;
                    c2953k0 = c2951j0.f11005m;
                    AbstractC0714c.m1516d0(objM5127d);
                    str = C2181z.FRAGMENT_ENCODE_SET;
                    i = 0;
                    c0587j = (C0587j) objM5127d;
                    if (c0587j != null) {
                        String str2 = c0587j.f2350a;
                        String str3 = c0587j.f2351b;
                        byte[] bArrM4262a = AbstractC2415i0.m4262a(str2);
                        if (str3 == null) {
                            str3 = str;
                        }
                        byte[] bytes = "c!xZj+N9&G@Ev@vw".concat(str3).getBytes(AbstractC1199a.f5077a);
                        AbstractC2980h.m5135d("getBytes(...)", bytes);
                        byte[] bArr = new byte[bArrM4262a.length];
                        int length = bArrM4262a.length;
                        while (i < length) {
                            bArr[i] = (byte) (bytes[i % bytes.length] ^ bArrM4262a[i]);
                            i++;
                            channel3 = channel3;
                        }
                        Channel channel4 = channel3;
                        JSONObject jSONObject = new JSONObject(new String(bArr, AbstractC1199a.f5077a));
                        c2953k0.getClass();
                        List listM5125c = m5125c(jSONObject);
                        Iterator it = listM5125c.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                            if (AbstractC2980h.m5132a(((JSONObject) next2).optString("name"), channel4.getChRealName())) {
                                break;
                            }
                        }
                        JSONObject jSONObject2 = (JSONObject) next2;
                        if (jSONObject2 == null) {
                            Log.w("SimpleResolvers", "ytv channel '" + channel4.getChRealName() + "' not found among " + listM5125c.size());
                            return c1921p;
                        }
                        String strOptString = jSONObject2.optString("id");
                        AbstractC2980h.m5135d("optString(...)", strOptString);
                        c2951j0.f11005m = null;
                        c2951j0.f11006n = null;
                        c2951j0.f11009q = 3;
                        objM5127d = c2953k0.m5127d(strOptString, c2951j0);
                    }
                    return c1921p;
                }
                Channel channel5 = c2951j0.f11006n;
                c2953k0 = c2951j0.f11005m;
                AbstractC0714c.m1516d0(objM5127d);
                objM2857r = objM5127d;
                channel2 = channel5;
            }
            C0587j c0587j2 = (C0587j) objM2857r;
            if (c0587j2 == null) {
                return c1921p;
            }
            String str4 = c0587j2.f2350a;
            String str5 = c0587j2.f2351b;
            byte[] bArrM4262a2 = AbstractC2415i0.m4262a(str4);
            if (str5 == null) {
                str5 = C2181z.FRAGMENT_ENCODE_SET;
            }
            byte[] bytes2 = "c!xZj+N9&G@Ev@vw".concat(str5).getBytes(AbstractC1199a.f5077a);
            AbstractC2980h.m5135d("getBytes(...)", bytes2);
            byte[] bArr2 = new byte[bArrM4262a2.length];
            str = C2181z.FRAGMENT_ENCODE_SET;
            int i9 = 0;
            for (int length2 = bArrM4262a2.length; i9 < length2; length2 = length2) {
                bArr2[i9] = (byte) (bArrM4262a2[i9] ^ bytes2[i9 % bytes2.length]);
                i9++;
            }
            JSONObject jSONObject3 = new JSONObject(new String(bArr2, AbstractC1199a.f5077a));
            c2953k0.getClass();
            List listM5125c2 = m5125c(jSONObject3);
            Iterator it2 = listM5125c2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (AbstractC2980h.m5132a(((JSONObject) next).optString("name"), channel2.getCatRealName())) {
                    break;
                }
            }
            JSONObject jSONObject4 = (JSONObject) next;
            if (jSONObject4 == null) {
                Log.w("SimpleResolvers", "ytv category '" + channel2.getCatRealName() + "' not found among " + listM5125c2.size());
                return c1921p;
            }
            String strOptString2 = jSONObject4.optString("id");
            AbstractC2980h.m5135d("optString(...)", strOptString2);
            c2951j0.f11005m = c2953k0;
            c2951j0.f11006n = channel2;
            c2951j0.f11009q = 2;
            C2054e c2054e2 = AbstractC1290e0.f5316a;
            i = 0;
            Object objM2857r2 = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0581d(strOptString2, null, i), c2951j0);
            if (objM2857r2 == enumC2273a) {
                return enumC2273a;
            }
            channel3 = channel2;
            objM5127d = objM2857r2;
            c0587j = (C0587j) objM5127d;
            if (c0587j != null) {
            }
            return c1921p;
        } catch (Throwable th) {
            Log.w("SimpleResolvers", "ytv resolve error: " + th.getMessage(), th);
            return c1921p;
        }
    }
}
