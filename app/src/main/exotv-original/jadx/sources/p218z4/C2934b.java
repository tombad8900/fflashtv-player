package p218z4;

import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.model.BackupSource;
import com.exotv.net.model.Channel;
import com.exotv.net.model.ChannelCategory;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.AbstractC2160j0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2181z;
import org.json.JSONArray;
import org.json.JSONObject;
import p016b5.AbstractC0590m;
import p016b5.C0584g;
import p016b5.C0585h;
import p016b5.C0586i;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p111m6.C1921p;
import p119n6.C2023c;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p146q6.EnumC2273a;
import p147q7.AbstractC2278c;
import p154r6.AbstractC2320c;
import p168t2.AbstractC2429w;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z4.b */
/* loaded from: classes.dex */
public final class C2934b {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5092a(AbstractC2320c abstractC2320c) throws Throwable {
        C2932a c2932a;
        String str;
        if (abstractC2320c instanceof C2932a) {
            c2932a = (C2932a) abstractC2320c;
            int i = c2932a.f10888n;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2932a.f10888n = i - Integer.MIN_VALUE;
            } else {
                c2932a = new C2932a(abstractC2320c);
            }
        }
        Object objM2857r = c2932a.f10887m;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2932a.f10888n;
        try {
            if (i4 == 0) {
                AbstractC0714c.m1516d0(objM2857r);
                c2932a.f10888n = 1;
                objM2857r = C0585h.f2325a;
                if (objM2857r == null) {
                    C2054e c2054e = AbstractC1290e0.f5316a;
                    objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0584g(2, null), c2932a);
                }
                if (objM2857r == enumC2273a) {
                    return enumC2273a;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC0714c.m1516d0(objM2857r);
            }
            str = ((C0586i) objM2857r).f2333h;
            if (str == null || AbstractC1206h.m2630D0(str)) {
                str = null;
            }
        } catch (Throwable unused) {
        }
        if (str == null) {
            return null;
        }
        C2080i0 c2080i0Execute = AbstractC0590m.f2359a.newCall(new C2076g0.a().url(str).header("User-Agent", AbstractC2278c.userAgent).build()).execute();
        try {
            AbstractC2160j0 abstractC2160j0Body = c2080i0Execute.body();
            String strString = abstractC2160j0Body != null ? abstractC2160j0Body.string() : null;
            if (strString == null) {
                strString = C2181z.FRAGMENT_ENCODE_SET;
            }
            c2080i0Execute.close();
            return strString;
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2023c m5093b(JSONArray jSONArray) {
        int i;
        int i4;
        int i8;
        int i9;
        JSONArray jSONArray2;
        List list;
        int i10;
        int i11;
        JSONObject jSONObject;
        String strM4296a;
        JSONArray jSONArray3;
        List list2;
        int i12;
        int i13;
        BackupSource backupSource;
        C2023c c2023cM1572w = AbstractC0715d.m1572w();
        int length = jSONArray.length();
        int i14 = 0;
        while (i14 < length) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i14);
            if (jSONObjectOptJSONObject == null) {
                i = length;
                i4 = i14;
            } else {
                JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("channels");
                List listM1563h = C1921p.f7187j;
                if (jSONArrayOptJSONArray == null) {
                    i = length;
                    i4 = i14;
                } else {
                    C2023c c2023cM1572w2 = AbstractC0715d.m1572w();
                    int length2 = jSONArrayOptJSONArray.length();
                    int i15 = 0;
                    while (i15 < length2) {
                        JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i15);
                        if (jSONObjectOptJSONObject2 != null) {
                            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("backupURLs");
                            List listM1563h2 = null;
                            i8 = length;
                            if (jSONArrayOptJSONArray2 != null) {
                                C2023c c2023cM1572w3 = AbstractC0715d.m1572w();
                                i9 = i14;
                                int length3 = jSONArrayOptJSONArray2.length();
                                int i16 = 0;
                                while (i16 < length3) {
                                    int i17 = length3;
                                    Object objOpt = jSONArrayOptJSONArray2.opt(i16);
                                    int i18 = i16;
                                    if (objOpt instanceof String) {
                                        if (AbstractC1206h.m2630D0((String) objOpt)) {
                                            objOpt = null;
                                        }
                                        String str = (String) objOpt;
                                        if (str != null) {
                                            BackupSource backupSource2 = new BackupSource(str, null, null, 6, null);
                                            list2 = listM1563h;
                                            i12 = length2;
                                            i13 = i15;
                                            backupSource = backupSource2;
                                            jSONArray3 = jSONArrayOptJSONArray;
                                        } else {
                                            jSONArray3 = jSONArrayOptJSONArray;
                                            list2 = listM1563h;
                                            i12 = length2;
                                            i13 = i15;
                                            backupSource = null;
                                        }
                                    } else if ((objOpt instanceof JSONObject) && (strM4296a = AbstractC2429w.m4296a((jSONObject = (JSONObject) objOpt), "url")) != null) {
                                        jSONArray3 = jSONArrayOptJSONArray;
                                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                                        list2 = listM1563h;
                                        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("headers");
                                        i12 = length2;
                                        if (jSONObjectOptJSONObject3 != null) {
                                            Iterator<String> itKeys = jSONObjectOptJSONObject3.keys();
                                            i13 = i15;
                                            AbstractC2980h.m5135d("keys(...)", itKeys);
                                            while (itKeys.hasNext()) {
                                                String next = itKeys.next();
                                                linkedHashMap.put(next, jSONObjectOptJSONObject3.optString(next));
                                                itKeys = itKeys;
                                            }
                                        } else {
                                            i13 = i15;
                                        }
                                        backupSource = new BackupSource(strM4296a, linkedHashMap, AbstractC2429w.m4296a(jSONObject, "name"));
                                    }
                                    if (backupSource != null) {
                                        c2023cM1572w3.add(backupSource);
                                    }
                                    i16 = i18 + 1;
                                    length3 = i17;
                                    jSONArrayOptJSONArray = jSONArray3;
                                    listM1563h = list2;
                                    length2 = i12;
                                    i15 = i13;
                                }
                                jSONArray2 = jSONArrayOptJSONArray;
                                list = listM1563h;
                                i10 = length2;
                                i11 = i15;
                                listM1563h2 = AbstractC0715d.m1563h(c2023cM1572w3);
                            } else {
                                i9 = i14;
                                jSONArray2 = jSONArrayOptJSONArray;
                                list = listM1563h;
                                i10 = length2;
                                i11 = i15;
                            }
                            c2023cM1572w2.add(new Channel(AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "id"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "id_o"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "name"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "title"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "icon"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "type"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "cat_o"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "cat_real_name"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "ch_real_name"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "id_gen"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "parent"), AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "server"), jSONObjectOptJSONObject2.isNull("isSub") ? false : jSONObjectOptJSONObject2.optBoolean("isSub"), jSONObjectOptJSONObject2.isNull("isBackup") ? false : jSONObjectOptJSONObject2.optBoolean("isBackup"), listM1563h2 == null ? list : listM1563h2, AbstractC2429w.m4296a(jSONObjectOptJSONObject2, "x_cat_info")));
                        } else {
                            i8 = length;
                            i9 = i14;
                            jSONArray2 = jSONArrayOptJSONArray;
                            list = listM1563h;
                            i10 = length2;
                            i11 = i15;
                        }
                        i15 = i11 + 1;
                        length = i8;
                        i14 = i9;
                        jSONArrayOptJSONArray = jSONArray2;
                        listM1563h = list;
                        length2 = i10;
                    }
                    i = length;
                    i4 = i14;
                    listM1563h = AbstractC0715d.m1563h(c2023cM1572w2);
                }
                String strM4296a2 = AbstractC2429w.m4296a(jSONObjectOptJSONObject, "id");
                if (strM4296a2 == null) {
                    strM4296a2 = AbstractC2429w.m4296a(jSONObjectOptJSONObject, "id_o");
                }
                c2023cM1572w.add(new ChannelCategory(strM4296a2, AbstractC2429w.m4296a(jSONObjectOptJSONObject, "id_o"), AbstractC2429w.m4296a(jSONObjectOptJSONObject, "title"), listM1563h));
            }
            i14 = i4 + 1;
            length = i;
        }
        return AbstractC0715d.m1563h(c2023cM1572w);
    }
}
