package p204x4;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.C2181z;
import org.json.JSONArray;
import org.json.JSONObject;
import p044e7.C0925b;
import p044e7.C0926c;
import p069h7.AbstractC1206h;
import p102l6.C1687d;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1924s;
import p111m6.C1921p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.w */
/* loaded from: classes.dex */
public final class C2780w {

    /* renamed from: a */
    public static final C2780w f10327a = new C2780w();

    /* renamed from: b */
    public static final Object f10328b;

    /* renamed from: c */
    public static final Object f10329c;

    static {
        EnumC2770m enumC2770m = EnumC2770m.f10247j;
        C1687d c1687d = new C1687d(enumC2770m, AbstractC1914i.m3753t0("title", "original_title", "name"));
        EnumC2770m enumC2770m2 = EnumC2770m.f10248k;
        f10328b = AbstractC1924s.m3760U(c1687d, new C1687d(enumC2770m2, AbstractC1914i.m3753t0("name", "original_name", "title")));
        f10329c = AbstractC1924s.m3760U(new C1687d(enumC2770m, AbstractC0715d.m1551T("release_date")), new C1687d(enumC2770m2, AbstractC1914i.m3753t0("first_air_date", "release_date")));
    }

    /* renamed from: a */
    public static String m4863a(JSONObject jSONObject, List list) {
        Object next;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String str = (String) next;
            if (!jSONObject.isNull(str)) {
                String strOptString = jSONObject.optString(str);
                AbstractC2980h.m5135d("optString(...)", strOptString);
                if (!AbstractC1206h.m2630D0(strOptString)) {
                    break;
                }
            }
        }
        String str2 = (String) next;
        if (str2 != null) {
            return jSONObject.optString(str2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, java.util.Map] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static List m4864b(JSONArray jSONArray, EnumC2770m enumC2770m, Set set) {
        String strM4863a;
        JSONArray jSONArrayOptJSONArray;
        AbstractC2980h.m5136e("kind", enumC2770m);
        if (jSONArray == null) {
            return C1921p.f7187j;
        }
        C0926c c0926cM1521g0 = AbstractC0714c.m1521g0(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = c0926cM1521g0.iterator();
        while (true) {
            C0925b c0925b = (C0925b) it;
            if (!c0925b.f3991l) {
                return arrayList;
            }
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(c0925b.nextInt());
            C2769l c2769l = null;
            if (jSONObjectOptJSONObject != null) {
                long jOptLong = jSONObjectOptJSONObject.optLong("id", 0L);
                if (jOptLong != 0) {
                    if (set.isEmpty() || (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("genre_ids")) == null) {
                        strM4863a = m4863a(jSONObjectOptJSONObject, (List) AbstractC1924s.m3758S(f10328b, enumC2770m));
                        if (strM4863a == null) {
                            strM4863a = "Untitled";
                        }
                        String strM4866d = m4866d(jSONObjectOptJSONObject, enumC2770m);
                        String strOptString = jSONObjectOptJSONObject.optString("poster_path");
                        AbstractC2980h.m5133b(strOptString);
                        String str = (strOptString.length() > 0 || strOptString.equals("null")) ? null : strOptString;
                        String strOptString2 = jSONObjectOptJSONObject.optString("backdrop_path");
                        AbstractC2980h.m5133b(strOptString2);
                        c2769l = new C2769l(jOptLong, strM4863a, strM4866d, str, (strOptString2.length() > 0 || strOptString2.equals("null")) ? null : strOptString2, m4865c(jSONObjectOptJSONObject));
                    } else {
                        int length = jSONArrayOptJSONArray.length();
                        for (int i = 0; i < length; i++) {
                            if (set.contains(Integer.valueOf(jSONArrayOptJSONArray.optInt(i, -1)))) {
                                break;
                            }
                        }
                        strM4863a = m4863a(jSONObjectOptJSONObject, (List) AbstractC1924s.m3758S(f10328b, enumC2770m));
                        if (strM4863a == null) {
                        }
                        String strM4866d2 = m4866d(jSONObjectOptJSONObject, enumC2770m);
                        String strOptString3 = jSONObjectOptJSONObject.optString("poster_path");
                        AbstractC2980h.m5133b(strOptString3);
                        if (strOptString3.length() > 0) {
                            String strOptString22 = jSONObjectOptJSONObject.optString("backdrop_path");
                            AbstractC2980h.m5133b(strOptString22);
                            if (strOptString22.length() > 0) {
                                c2769l = new C2769l(jOptLong, strM4863a, strM4866d2, str, (strOptString22.length() > 0 || strOptString22.equals("null")) ? null : strOptString22, m4865c(jSONObjectOptJSONObject));
                            }
                        }
                    }
                }
            }
            if (c2769l != null) {
                arrayList.add(c2769l);
            }
        }
    }

    /* renamed from: c */
    public static Double m4865c(JSONObject jSONObject) {
        if (jSONObject.isNull("vote_average")) {
            return null;
        }
        double dOptDouble = jSONObject.optDouble("vote_average");
        Double dValueOf = Double.valueOf(dOptDouble);
        if (dOptDouble > 0.0d) {
            return dValueOf;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    /* renamed from: d */
    public static String m4866d(JSONObject jSONObject, EnumC2770m enumC2770m) {
        AbstractC2980h.m5136e("kind", enumC2770m);
        String strM4863a = m4863a(jSONObject, (List) AbstractC1924s.m3758S(f10329c, enumC2770m));
        String strM2644R0 = strM4863a != null ? AbstractC1206h.m2644R0(4, strM4863a) : null;
        return strM2644R0 == null ? C2181z.FRAGMENT_ENCODE_SET : strM2644R0;
    }
}
