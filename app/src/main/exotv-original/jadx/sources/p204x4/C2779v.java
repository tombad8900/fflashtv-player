package p204x4;

import com.bumptech.glide.AbstractC0714c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import org.json.JSONObject;
import p002a1.C0016e;
import p002a1.C0048u;
import p016b5.C0585h;
import p016b5.C0586i;
import p061g7.C1065l;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1213o;
import p069h7.AbstractC1214p;
import p069h7.C1203e;
import p069h7.C1204f;
import p069h7.EnumC1205g;
import p069h7.InterfaceC1201c;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1915j;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p211y5.C2819f;
import p220z6.AbstractC2980h;
import p220z6.C2985m;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.v */
/* loaded from: classes.dex */
public final class C2779v {

    /* renamed from: a */
    public static final C2779v f10315a = new C2779v();

    /* renamed from: b */
    public static final Set f10316b = AbstractC0714c.m1512a0("ara", "ar", "he", "heb", "fa", "per", "ur", "urd");

    /* renamed from: c */
    public static final C1204f f10317c = new C1204f("(\\d{1,2}):(\\d{2}):(\\d{2})[,.](\\d{1,3})");

    /* renamed from: d */
    public static final C1204f f10318d = new C1204f("<[^>]+>|\\{[^}]*\\}");

    /* renamed from: e */
    public static final C1204f f10319e = new C1204f("\n{2,}");

    /* renamed from: f */
    public static final C1204f f10320f = new C1204f("^\\{(\\d+)\\}\\{(\\d+)\\}(.*)$");

    /* renamed from: g */
    public static final C1204f f10321g = new C1204f("^(\\d{1,2}):(\\d{2}):(\\d{2})[.,](\\d{1,3})\\s*,\\s*(\\d{1,2}):(\\d{2}):(\\d{2})[.,](\\d{1,3})$");

    /* renamed from: h */
    public static final C1204f f10322h = new C1204f("\\{\\\\[^}]*\\}");

    /* renamed from: i */
    public static final C1204f f10323i;

    /* renamed from: j */
    public static final C1204f f10324j;

    /* renamed from: k */
    public static final C1204f f10325k;

    /* renamed from: l */
    public static final C1204f f10326l;

    static {
        Set setSingleton = Collections.singleton(EnumC1205g.f5092k);
        AbstractC2980h.m5135d("singleton(...)", setSingleton);
        Iterator it = setSingleton.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((EnumC1205g) ((InterfaceC1201c) it.next())).f5094j;
        }
        Pattern patternCompile = Pattern.compile("\\{[^}]*\\\\p[1-9]\\d*[^}]*\\}.*?\\{[^}]*\\\\p0[^}]*\\}", C2819f.m4927o(i));
        AbstractC2980h.m5135d("compile(...)", patternCompile);
        f10323i = new C1204f(patternCompile);
        f10324j = new C1204f("^(\\d+):(\\d+):(\\d+)(?:\\.(\\d+))?");
        f10325k = new C1204f("^(?:(\\d+):)?(\\d{1,2}):(\\d{1,2})[.,](\\d+)");
        f10326l = new C1204f("<[^<>]*>");
    }

    /* renamed from: b */
    public static final void m4856b(C2986n c2986n, StringBuilder sb, C2985m c2985m, ArrayList arrayList) {
        Long l8 = (Long) c2986n.f11117j;
        String string = sb.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        String string2 = AbstractC1206h.m2645S0(string).toString();
        if (l8 != null && string2.length() > 0 && c2985m.f11116j > l8.longValue()) {
            arrayList.add(new C2776s(string2, l8.longValue(), c2985m.f11116j));
        }
        c2986n.f11117j = null;
        c2985m.f11116j = 0L;
        sb.setLength(0);
    }

    /* renamed from: c */
    public static Long m4857c(String str) throws NumberFormatException {
        C0016e c0016eM2622b = C1204f.m2622b(f10317c, AbstractC1206h.m2645S0(str).toString());
        if (c0016eM2622b == null) {
            return null;
        }
        String str2 = (String) ((C1203e) c0016eM2622b.m31A()).get(1);
        String str3 = (String) ((C1203e) c0016eM2622b.m31A()).get(2);
        return Long.valueOf((Long.parseLong((String) ((C1203e) c0016eM2622b.m31A()).get(3)) * 1000) + (Long.parseLong(str3) * 60000) + (Long.parseLong(str2) * 3600000) + Long.parseLong(AbstractC1206h.m2644R0(3, AbstractC1206h.m2632F0(3, (String) ((C1203e) c0016eM2622b.m31A()).get(4)))));
    }

    /* renamed from: d */
    public static String m4858d(String str) {
        C0016e c0016eM2622b = C1204f.m2622b(f10324j, AbstractC1206h.m2645S0(str).toString());
        if (c0016eM2622b == null) {
            return AbstractC1206h.m2645S0(str).toString();
        }
        Integer numM2658k0 = AbstractC1213o.m2658k0((String) ((C1203e) c0016eM2622b.m31A()).get(1));
        int iIntValue = numM2658k0 != null ? numM2658k0.intValue() : 0;
        Integer numM2658k02 = AbstractC1213o.m2658k0((String) ((C1203e) c0016eM2622b.m31A()).get(2));
        int iIntValue2 = numM2658k02 != null ? numM2658k02.intValue() : 0;
        Integer numM2658k03 = AbstractC1213o.m2658k0((String) ((C1203e) c0016eM2622b.m31A()).get(3));
        int iIntValue3 = numM2658k03 != null ? numM2658k03.intValue() : 0;
        String str2 = (String) ((C1203e) c0016eM2622b.m31A()).get(4);
        return String.format("%02d:%02d:%02d,%03d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(str2.length() != 0 ? Integer.parseInt(AbstractC1206h.m2644R0(2, AbstractC1206h.m2632F0(2, str2))) * 10 : 0)}, 4));
    }

    /* renamed from: e */
    public static long m4859e(String str, String str2, String str3, String str4) throws NumberFormatException {
        long j;
        int i;
        long j8;
        int length = str4.length();
        if (length == 1) {
            j = Long.parseLong(str4);
            i = 100;
        } else {
            if (length != 2) {
                j8 = Long.parseLong(AbstractC1206h.m2644R0(3, str4));
                return (Long.parseLong(str3) * 1000) + (Long.parseLong(str2) * 60000) + (Long.parseLong(str) * 3600000) + j8;
            }
            j = Long.parseLong(str4);
            i = 10;
        }
        j8 = j * i;
        return (Long.parseLong(str3) * 1000) + (Long.parseLong(str2) * 60000) + (Long.parseLong(str) * 3600000) + j8;
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0335  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m4860f(String str) {
        Object obj;
        String string;
        char c8;
        int i;
        String str2;
        String str3;
        AbstractC2980h.m5136e("body", str);
        int i4 = 1;
        List listM2638L0 = AbstractC1206h.m2638L0(AbstractC1214p.m2664q0(AbstractC1214p.m2665r0(str, "\r\n", "\n"), '\r', '\n'), new char[]{'\n'});
        if (!listM2638L0.isEmpty()) {
            Iterator it = listM2638L0.iterator();
            while (it.hasNext()) {
                if (AbstractC1214p.m2667t0(AbstractC1206h.m2647U0((String) it.next()).toString(), "Dialogue:", false)) {
                    List listM3753t0 = AbstractC1914i.m3753t0("Layer", "Start", "End", "Style", "Name", "MarginL", "MarginR", "MarginV", "Effect", "Text");
                    Iterator it2 = listM2638L0.iterator();
                    boolean z7 = false;
                    while (true) {
                        c8 = ',';
                        if (!it2.hasNext()) {
                            break;
                        }
                        String string2 = AbstractC1206h.m2645S0((String) it2.next()).toString();
                        if (z7) {
                            if (!AbstractC1214p.m2667t0(string2, "Format:", false)) {
                                if (AbstractC1214p.m2667t0(string2, "[", false)) {
                                    break;
                                }
                            } else {
                                List listM2638L02 = AbstractC1206h.m2638L0(AbstractC1206h.m2635I0(string2, "Format:"), new char[]{','});
                                ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(listM2638L02));
                                Iterator it3 = listM2638L02.iterator();
                                while (it3.hasNext()) {
                                    arrayList.add(AbstractC1206h.m2645S0((String) it3.next()).toString());
                                }
                                listM3753t0 = arrayList;
                            }
                        } else if (AbstractC2980h.m5132a(string2, "[Events]")) {
                            z7 = true;
                        }
                    }
                    Iterator it4 = listM3753t0.iterator();
                    int i8 = 0;
                    while (true) {
                        i = -1;
                        if (!it4.hasNext()) {
                            i8 = -1;
                            break;
                        }
                        if (AbstractC1214p.m2661n0((String) it4.next(), "Start")) {
                            break;
                        }
                        i8++;
                    }
                    Integer numValueOf = Integer.valueOf(i8);
                    if (i8 < 0) {
                        numValueOf = null;
                    }
                    int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
                    Iterator it5 = listM3753t0.iterator();
                    int i9 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            i9 = -1;
                            break;
                        }
                        if (AbstractC1214p.m2661n0((String) it5.next(), "End")) {
                            break;
                        }
                        i9++;
                    }
                    Integer numValueOf2 = Integer.valueOf(i9);
                    if (i9 < 0) {
                        numValueOf2 = null;
                    }
                    int iIntValue2 = numValueOf2 != null ? numValueOf2.intValue() : 2;
                    Iterator it6 = listM3753t0.iterator();
                    int i10 = 0;
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        if (AbstractC1214p.m2661n0((String) it6.next(), "Text")) {
                            i = i10;
                            break;
                        }
                        i10++;
                    }
                    Integer numValueOf3 = i >= 0 ? Integer.valueOf(i) : null;
                    int iIntValue3 = numValueOf3 != null ? numValueOf3.intValue() : 9;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it7 = listM2638L0.iterator();
                    int i11 = 0;
                    while (it7.hasNext()) {
                        String string3 = AbstractC1206h.m2645S0((String) it7.next()).toString();
                        if (AbstractC1214p.m2667t0(string3, "Dialogue:", false)) {
                            String strM2635I0 = AbstractC1206h.m2635I0(string3, "Dialogue:");
                            char[] cArr = new char[i4];
                            cArr[0] = c8;
                            List listM2638L03 = AbstractC1206h.m2638L0(strM2635I0, cArr);
                            if (listM2638L03.size() > iIntValue3 && (str2 = (String) AbstractC1913h.m3738C0(iIntValue, listM2638L03)) != null && (str3 = (String) AbstractC1913h.m3738C0(iIntValue2, listM2638L03)) != null) {
                                String string4 = AbstractC1206h.m2645S0(f10322h.m2625d(f10323i.m2625d(AbstractC1214p.m2665r0(AbstractC1214p.m2665r0(AbstractC1214p.m2665r0(AbstractC1913h.m3740E0(listM2638L03.subList(iIntValue3, listM2638L03.size()), ",", null, null, null, 62), "\\N", "\n"), "\\n", "\n"), "\\h", " ")))).toString();
                                if (string4.length() != 0) {
                                    i11++;
                                    arrayList2.add(String.valueOf(i11));
                                    arrayList2.add(m4858d(str2) + " --> " + m4858d(str3));
                                    arrayList2.add(string4);
                                    arrayList2.add(C2181z.FRAGMENT_ENCODE_SET);
                                }
                            }
                        }
                        i4 = 1;
                        c8 = ',';
                    }
                    return AbstractC1913h.m3740E0(arrayList2, "\n", null, null, null, 62);
                }
            }
        }
        Iterator it8 = listM2638L0.iterator();
        while (true) {
            if (!it8.hasNext()) {
                obj = null;
                break;
            }
            Object next = it8.next();
            if (!AbstractC1206h.m2630D0((String) next)) {
                obj = next;
                break;
            }
        }
        String str4 = (String) obj;
        if (str4 == null || (string = AbstractC1206h.m2647U0(str4).toString()) == null || !AbstractC1214p.m2667t0(string, "WEBVTT", false)) {
            return AbstractC1913h.m3740E0(listM2638L0, "\n", null, null, new C1065l(4), 30);
        }
        ArrayList arrayList3 = new ArrayList();
        int size = listM2638L0.size();
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            String string5 = AbstractC1206h.m2645S0((String) listM2638L0.get(i13)).toString();
            if (AbstractC1206h.m2649u0(string5, "-->", false)) {
                List listM2637K0 = AbstractC1206h.m2637K0(string5, new String[]{"-->"});
                if (listM2637K0.size() >= 2) {
                    String strM4861g = m4861g(AbstractC1206h.m2645S0((String) listM2637K0.get(0)).toString());
                    String string6 = AbstractC1206h.m2645S0((String) listM2637K0.get(1)).toString();
                    String strM4861g2 = m4861g(AbstractC1206h.m2642P0(string6, ' ', string6));
                    ArrayList arrayList4 = new ArrayList();
                    for (int i14 = i13 + 1; i14 < listM2638L0.size() && AbstractC1206h.m2645S0((String) listM2638L0.get(i14)).toString().length() > 0; i14++) {
                        arrayList4.add(AbstractC1206h.m2645S0((String) listM2638L0.get(i14)).toString());
                    }
                    String string7 = AbstractC1206h.m2645S0(AbstractC1913h.m3740E0(arrayList4, "\n", null, null, new C1065l(5), 30)).toString();
                    if (string7.length() != 0) {
                        i12++;
                        arrayList3.add(String.valueOf(i12));
                        arrayList3.add(strM4861g + " --> " + strM4861g2);
                        arrayList3.add(string7);
                        arrayList3.add(C2181z.FRAGMENT_ENCODE_SET);
                    }
                }
            }
        }
        return AbstractC1913h.m3740E0(arrayList3, "\n", null, null, null, 62);
    }

    /* renamed from: g */
    public static String m4861g(String str) {
        C0016e c0016eM2622b = C1204f.m2622b(f10325k, str);
        if (c0016eM2622b == null) {
            return str;
        }
        Integer numM2658k0 = AbstractC1213o.m2658k0((String) ((C1203e) c0016eM2622b.m31A()).get(1));
        int iIntValue = numM2658k0 != null ? numM2658k0.intValue() : 0;
        Integer numM2658k02 = AbstractC1213o.m2658k0((String) ((C1203e) c0016eM2622b.m31A()).get(2));
        int iIntValue2 = numM2658k02 != null ? numM2658k02.intValue() : 0;
        Integer numM2658k03 = AbstractC1213o.m2658k0((String) ((C1203e) c0016eM2622b.m31A()).get(3));
        int iIntValue3 = numM2658k03 != null ? numM2658k03.intValue() : 0;
        Integer numM2658k04 = AbstractC1213o.m2658k0(AbstractC1206h.m2632F0(3, AbstractC1206h.m2644R0(3, (String) ((C1203e) c0016eM2622b.m31A()).get(4))));
        return String.format("%02d:%02d:%02d,%03d", Arrays.copyOf(new Object[]{Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue3), Integer.valueOf(numM2658k04 != null ? numM2658k04.intValue() : 0)}, 4));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4862a(String str, EnumC2761d enumC2761d, AbstractC2320c abstractC2320c) throws Throwable {
        C2778u c2778u;
        String str2;
        String str3;
        if (abstractC2320c instanceof C2778u) {
            c2778u = (C2778u) abstractC2320c;
            int i = c2778u.f10314o;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2778u.f10314o = i - Integer.MIN_VALUE;
            } else {
                c2778u = new C2778u(this, abstractC2320c);
            }
        }
        Object objM4850e = c2778u.f10312m;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c2778u.f10314o;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(objM4850e);
            int iOrdinal = enumC2761d.ordinal();
            if (iOrdinal == 0) {
                str2 = "movie";
            } else {
                if (iOrdinal != 1) {
                    throw new C0048u();
                }
                str2 = "tv";
            }
            C2768k c2768k = C2768k.f10237a;
            String str4 = "https://api.themoviedb.org/3/" + str2 + "/" + str + "/external_ids";
            AbstractC2980h.m5136e("url", str4);
            String str5 = AbstractC1206h.m2650v0(str4, '?') ? "&" : "?";
            C0586i c0586i = C0585h.f2325a;
            if (c0586i == null || (str3 = c0586i.f2343r) == null) {
                str3 = "4e44d9029b1270a757cddc766a1bcb63";
            }
            c2778u.f10314o = 1;
            objM4850e = C2768k.m4850e(str4 + str5 + "api_key=" + str3, null, c2778u);
            if (objM4850e == enumC2273a) {
                return enumC2273a;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0714c.m1516d0(objM4850e);
        }
        String strOptString = ((JSONObject) objM4850e).optString("imdb_id");
        AbstractC2980h.m5133b(strOptString);
        if (strOptString.length() <= 0 || strOptString.equals("null")) {
            strOptString = null;
        }
        if (strOptString != null) {
            return AbstractC1206h.m2635I0(strOptString, "tt");
        }
        return null;
    }
}
