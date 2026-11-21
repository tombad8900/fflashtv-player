package p159s2;

import android.graphics.Color;
import android.support.v4.media.session.AbstractC0120b;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import p056g1.C1032e;
import p056g1.C1034g;
import p056g1.C1036i;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s2.h */
/* loaded from: classes.dex */
public abstract class AbstractC2348h {

    /* renamed from: a */
    public static final Pattern f8255a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b */
    public static final Pattern f8256b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c */
    public static final Map f8257c;

    /* renamed from: d */
    public static final Map f8258d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8257c = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f8258d = Collections.unmodifiableMap(map2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4178a(String str, C2345e c2345e, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i;
        int length;
        int i4;
        int i8;
        int i9;
        int i10;
        i = c2345e.f8239b;
        length = spannableStringBuilder.length();
        String str2 = c2345e.f8238a;
        str2.getClass();
        i4 = -1;
        switch (str2) {
            case "":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i, length, 33);
                break;
            case "c":
                for (String str3 : c2345e.f8241d) {
                    Map map = f8257c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i, length, 33);
                    } else {
                        Map map2 = f8258d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
                break;
            case "v":
                spannableStringBuilder.setSpan(new C1036i(c2345e.f8240c), i, length, 33);
                break;
            case "ruby":
                int iM4180c = m4180c(list2, str, c2345e);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, C2344d.f8235c);
                int i11 = c2345e.f8239b;
                int i12 = 0;
                int length2 = 0;
                while (i12 < arrayList.size()) {
                    if ("rt".equals(((C2344d) arrayList.get(i12)).f8236a.f8238a)) {
                        C2344d c2344d = (C2344d) arrayList.get(i12);
                        int iM4180c2 = m4180c(list2, str, c2344d.f8236a);
                        if (iM4180c2 == i4) {
                            iM4180c2 = iM4180c != i4 ? iM4180c : 1;
                        }
                        int i13 = c2344d.f8236a.f8239b - length2;
                        int i14 = c2344d.f8237b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i13, i14);
                        spannableStringBuilder.delete(i13, i14);
                        spannableStringBuilder.setSpan(new C1034g(charSequenceSubSequence.toString(), iM4180c2), i11, i13, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i11 = i13;
                    }
                    i12++;
                    i4 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList arrayListM4179b = m4179b(list2, str, c2345e);
        for (int i15 = 0; i15 < arrayListM4179b.size(); i15++) {
            C2342b c2342b = ((C2346f) arrayListM4179b.get(i15)).f8243k;
            int i16 = c2342b.f8226l;
            if (i16 == -1 && c2342b.f8227m == -1) {
                i8 = -1;
            } else {
                i8 = (c2342b.f8227m == 1 ? (char) 2 : (char) 0) | (i16 == 1 ? (char) 1 : (char) 0);
            }
            if (i8 != -1) {
                int i17 = c2342b.f8226l;
                if (i17 == -1 && c2342b.f8227m == -1) {
                    i10 = -1;
                    i9 = 1;
                } else {
                    i9 = 1;
                    i10 = (i17 == 1 ? 1 : 0) | (c2342b.f8227m == 1 ? 2 : 0);
                }
                AbstractC0120b.m410c(spannableStringBuilder, new StyleSpan(i10), i, length);
            } else {
                i9 = 1;
            }
            if (c2342b.f8224j == i9) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i, length, 33);
            }
            if (c2342b.f8225k == i9) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
            }
            if (c2342b.f8221g) {
                if (!c2342b.f8221g) {
                    throw new IllegalStateException("Font color not defined");
                }
                AbstractC0120b.m410c(spannableStringBuilder, new ForegroundColorSpan(c2342b.f8220f), i, length);
            }
            if (c2342b.f8223i) {
                if (!c2342b.f8223i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                AbstractC0120b.m410c(spannableStringBuilder, new BackgroundColorSpan(c2342b.f8222h), i, length);
            }
            if (c2342b.f8219e != null) {
                AbstractC0120b.m410c(spannableStringBuilder, new TypefaceSpan(c2342b.f8219e), i, length);
            }
            int i18 = c2342b.f8228n;
            if (i18 == 1) {
                AbstractC0120b.m410c(spannableStringBuilder, new AbsoluteSizeSpan((int) c2342b.f8229o, true), i, length);
            } else if (i18 == 2) {
                AbstractC0120b.m410c(spannableStringBuilder, new RelativeSizeSpan(c2342b.f8229o), i, length);
            } else if (i18 == 3) {
                AbstractC0120b.m410c(spannableStringBuilder, new RelativeSizeSpan(c2342b.f8229o / 100.0f), i, length);
            }
            if (c2342b.f8231q) {
                spannableStringBuilder.setSpan(new C1032e(), i, length, 33);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static ArrayList m4179b(List list, String str, C2345e c2345e) {
        int size;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            C2342b c2342b = (C2342b) list.get(i);
            String str2 = c2345e.f8238a;
            Set set = c2345e.f8241d;
            String str3 = c2345e.f8240c;
            if (c2342b.f8215a.isEmpty() && c2342b.f8216b.isEmpty() && c2342b.f8217c.isEmpty() && c2342b.f8218d.isEmpty()) {
                size = TextUtils.isEmpty(str2);
            } else {
                int iM4176a = C2342b.m4176a(C2342b.m4176a(C2342b.m4176a(0, 1073741824, c2342b.f8215a, str), 2, c2342b.f8216b, str2), 4, c2342b.f8218d, str3);
                size = (iM4176a == -1 || !set.containsAll(c2342b.f8217c)) ? 0 : iM4176a + (c2342b.f8217c.size() * 4);
            }
            if (size > 0) {
                arrayList.add(new C2346f(size, c2342b));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static int m4180c(List list, String str, C2345e c2345e) {
        ArrayList arrayListM4179b = m4179b(list, str, c2345e);
        for (int i = 0; i < arrayListM4179b.size(); i++) {
            int i4 = ((C2346f) arrayListM4179b.get(i)).f8243k.f8230p;
            if (i4 != -1) {
                return i4;
            }
        }
        return -1;
    }

    /* renamed from: d */
    public static C2343c m4181d(String str, Matcher matcher, C1132w c1132w, ArrayList arrayList) {
        C2347g c2347g = new C2347g();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            c2347g.f8244a = AbstractC2349i.m4187c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            c2347g.f8245b = AbstractC2349i.m4187c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            m4182e(strGroup3, c2347g);
            StringBuilder sb = new StringBuilder();
            c1132w.getClass();
            String strM2522h = c1132w.m2522h(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(strM2522h)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(strM2522h.trim());
                strM2522h = c1132w.m2522h(StandardCharsets.UTF_8);
            }
            c2347g.f8246c = m4183f(str, sb.toString(), arrayList);
            return new C2343c(c2347g.m4177a().m2225a(), c2347g.f8244a, c2347g.f8245b);
        } catch (NumberFormatException unused) {
            AbstractC1101a.m2348F("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bf  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4182e(String str, C2347g c2347g) {
        int i;
        int i4;
        int i8;
        Matcher matcher = f8256b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    m4184g(strGroup2, c2347g);
                } else {
                    char c8 = 5;
                    boolean z7 = false;
                    if ("align".equals(strGroup)) {
                        switch (strGroup2.hashCode()) {
                            case -1364013995:
                                if (!strGroup2.equals("center")) {
                                    z7 = -1;
                                    break;
                                }
                                break;
                            case -1074341483:
                                if (strGroup2.equals("middle")) {
                                    z7 = true;
                                    break;
                                }
                                break;
                            case 100571:
                                if (strGroup2.equals("end")) {
                                    z7 = 2;
                                    break;
                                }
                                break;
                            case 3317767:
                                if (strGroup2.equals("left")) {
                                    z7 = 3;
                                    break;
                                }
                                break;
                            case 108511772:
                                if (strGroup2.equals("right")) {
                                    z7 = 4;
                                    break;
                                }
                                break;
                            case 109757538:
                                if (strGroup2.equals("start")) {
                                    z7 = 5;
                                    break;
                                }
                                break;
                        }
                        switch (z7) {
                            case false:
                            case true:
                                i = 2;
                                break;
                            case true:
                                i = 3;
                                break;
                            case true:
                                i = 4;
                                break;
                            case true:
                                i = 5;
                                break;
                            case true:
                                i = 1;
                                break;
                            default:
                                AbstractC1101a.m2348F("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i = 2;
                                break;
                        }
                        c2347g.f8247d = i;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring.hashCode()) {
                                case -1842484672:
                                    if (!strSubstring.equals("line-left")) {
                                        c8 = '\uffff';
                                        break;
                                    } else {
                                        c8 = 0;
                                        break;
                                    }
                                case -1364013995:
                                    if (strSubstring.equals("center")) {
                                        c8 = 1;
                                        break;
                                    }
                                    break;
                                case -1276788989:
                                    if (strSubstring.equals("line-right")) {
                                        c8 = 2;
                                        break;
                                    }
                                    break;
                                case -1074341483:
                                    if (strSubstring.equals("middle")) {
                                        c8 = 3;
                                        break;
                                    }
                                    break;
                                case 100571:
                                    if (strSubstring.equals("end")) {
                                        c8 = 4;
                                        break;
                                    }
                                    break;
                                case 109757538:
                                    if (!strSubstring.equals("start")) {
                                    }
                                    break;
                            }
                            switch (c8) {
                                case 0:
                                case 5:
                                    i4 = 0;
                                    break;
                                case 1:
                                case 3:
                                    i4 = 1;
                                    break;
                                case 2:
                                case 4:
                                    i4 = 2;
                                    break;
                                default:
                                    AbstractC1101a.m2348F("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i4 = Integer.MIN_VALUE;
                                    break;
                            }
                            c2347g.f8252i = i4;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        c2347g.f8251h = AbstractC2349i.m4186b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        c2347g.f8253j = AbstractC2349i.m4186b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i8 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i8 = 1;
                        } else {
                            AbstractC1101a.m2348F("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i8 = Integer.MIN_VALUE;
                        }
                        c2347g.f8254k = i8;
                    } else {
                        AbstractC1101a.m2348F("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                AbstractC1101a.m2348F("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a7  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpannedString m4183f(String str, String str2, List list) {
        String str3;
        char c8;
        String strSubstring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int length = str2.length();
            String strTrim = C2181z.FRAGMENT_ENCODE_SET;
            if (i >= length) {
                while (!arrayDeque.isEmpty()) {
                    m4178a(str, (C2345e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                m4178a(str, new C2345e(C2181z.FRAGMENT_ENCODE_SET, 0, C2181z.FRAGMENT_ENCODE_SET, Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i);
            if (cCharAt == '&') {
                i++;
                int iIndexOf = str2.indexOf(59, i);
                int iIndexOf2 = str2.indexOf(32, i);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    strSubstring = str2.substring(i, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            AbstractC1101a.m2348F("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i++;
            } else {
                int length2 = i + 1;
                if (length2 < str2.length()) {
                    boolean z7 = str2.charAt(length2) == '/';
                    int iIndexOf3 = str2.indexOf(62, length2);
                    length2 = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i4 = length2 - 2;
                    boolean z8 = str2.charAt(i4) == '/';
                    int i8 = i + (z7 ? 2 : 1);
                    if (!z8) {
                        i4 = length2 - 1;
                    }
                    String strSubstring2 = str2.substring(i8, i4);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        AbstractC1101a.m2353d(!strTrim2.isEmpty());
                        int i9 = AbstractC1118i0.f4750a;
                        str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (z7) {
                                    while (!arrayDeque.isEmpty()) {
                                        C2345e c2345e = (C2345e) arrayDeque.pop();
                                        m4178a(str, c2345e, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new C2344d(c2345e, spannableStringBuilder.length()));
                                        }
                                        if (c2345e.f8238a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                } else if (!z8) {
                                    int length3 = spannableStringBuilder.length();
                                    String strTrim3 = strSubstring2.trim();
                                    AbstractC1101a.m2353d(!strTrim3.isEmpty());
                                    int iIndexOf4 = strTrim3.indexOf(" ");
                                    if (iIndexOf4 == -1) {
                                        c8 = 0;
                                    } else {
                                        strTrim = strTrim3.substring(iIndexOf4).trim();
                                        c8 = 0;
                                        strTrim3 = strTrim3.substring(0, iIndexOf4);
                                    }
                                    String[] strArrSplit = strTrim3.split("\\.", -1);
                                    String str4 = strArrSplit[c8];
                                    HashSet hashSet = new HashSet();
                                    for (int i10 = 1; i10 < strArrSplit.length; i10++) {
                                        hashSet.add(strArrSplit[i10]);
                                    }
                                    arrayDeque.push(new C2345e(str4, length3, strTrim, hashSet));
                                    break;
                                }
                                break;
                        }
                    }
                }
                i = length2;
            }
        }
    }

    /* renamed from: g */
    public static void m4184g(String str, C2347g c2347g) {
        String strSubstring;
        int i;
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            i = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    AbstractC1101a.m2348F("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            c2347g.f8250g = i;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            c2347g.f8248e = AbstractC2349i.m4186b(str);
            c2347g.f8249f = 0;
        } else {
            c2347g.f8248e = Integer.parseInt(str);
            c2347g.f8249f = 1;
        }
    }
}
