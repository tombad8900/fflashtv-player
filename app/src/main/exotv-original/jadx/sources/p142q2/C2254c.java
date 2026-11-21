package p142q2;

import android.support.v4.media.session.AbstractC0120b;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.bumptech.glide.AbstractC0714c;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.C2181z;
import p056g1.C1028a;
import p056g1.C1032e;
import p056g1.C1034g;
import p056g1.C1035h;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q2.c */
/* loaded from: classes.dex */
public final class C2254c {

    /* renamed from: a */
    public final String f7816a;

    /* renamed from: b */
    public final String f7817b;

    /* renamed from: c */
    public final boolean f7818c;

    /* renamed from: d */
    public final long f7819d;

    /* renamed from: e */
    public final long f7820e;

    /* renamed from: f */
    public final C2258g f7821f;

    /* renamed from: g */
    public final String[] f7822g;

    /* renamed from: h */
    public final String f7823h;

    /* renamed from: i */
    public final String f7824i;

    /* renamed from: j */
    public final C2254c f7825j;

    /* renamed from: k */
    public final HashMap f7826k;

    /* renamed from: l */
    public final HashMap f7827l;

    /* renamed from: m */
    public ArrayList f7828m;

    public C2254c(String str, String str2, long j, long j8, C2258g c2258g, String[] strArr, String str3, String str4, C2254c c2254c) {
        this.f7816a = str;
        this.f7817b = str2;
        this.f7824i = str4;
        this.f7821f = c2258g;
        this.f7822g = strArr;
        this.f7818c = str2 != null;
        this.f7819d = j;
        this.f7820e = j8;
        str3.getClass();
        this.f7823h = str3;
        this.f7825j = c2254c;
        this.f7826k = new HashMap();
        this.f7827l = new HashMap();
    }

    /* renamed from: a */
    public static C2254c m4028a(String str) {
        return new C2254c(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, C2181z.FRAGMENT_ENCODE_SET, null, null);
    }

    /* renamed from: e */
    public static SpannableStringBuilder m4029e(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            C1028a c1028a = new C1028a();
            c1028a.f4334a = new SpannableStringBuilder();
            treeMap.put(str, c1028a);
        }
        CharSequence charSequence = ((C1028a) treeMap.get(str)).f4334a;
        charSequence.getClass();
        return (SpannableStringBuilder) charSequence;
    }

    /* renamed from: b */
    public final C2254c m4030b(int i) {
        ArrayList arrayList = this.f7828m;
        if (arrayList != null) {
            return (C2254c) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    /* renamed from: c */
    public final int m4031c() {
        ArrayList arrayList = this.f7828m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    /* renamed from: d */
    public final void m4032d(TreeSet treeSet, boolean z7) {
        String str = this.f7816a;
        boolean zEquals = "p".equals(str);
        boolean zEquals2 = "div".equals(str);
        if (z7 || zEquals || (zEquals2 && this.f7824i != null)) {
            long j = this.f7819d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j8 = this.f7820e;
            if (j8 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j8));
            }
        }
        if (this.f7828m == null) {
            return;
        }
        for (int i = 0; i < this.f7828m.size(); i++) {
            ((C2254c) this.f7828m.get(i)).m4032d(treeSet, z7 || zEquals);
        }
    }

    /* renamed from: f */
    public final boolean m4033f(long j) {
        long j8 = this.f7819d;
        long j9 = this.f7820e;
        if (j8 == -9223372036854775807L && j9 == -9223372036854775807L) {
            return true;
        }
        if (j8 <= j && j9 == -9223372036854775807L) {
            return true;
        }
        if (j8 != -9223372036854775807L || j >= j9) {
            return j8 <= j && j < j9;
        }
        return true;
    }

    /* renamed from: g */
    public final void m4034g(long j, String str, ArrayList arrayList) {
        String str2;
        String str3 = this.f7823h;
        if (!C2181z.FRAGMENT_ENCODE_SET.equals(str3)) {
            str = str3;
        }
        if (m4033f(j) && "div".equals(this.f7816a) && (str2 = this.f7824i) != null) {
            arrayList.add(new Pair(str, str2));
            return;
        }
        for (int i = 0; i < m4031c(); i++) {
            m4030b(i).m4034g(j, str, arrayList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bb  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4035h(long j, Map map, HashMap map2, String str, TreeMap treeMap) {
        Iterator it;
        int i;
        C2254c c2254c;
        int i4;
        C2258g c2258gM1510Y;
        int i8;
        float f8;
        int i9;
        int i10;
        int i11;
        Map map3 = map;
        if (m4033f(j)) {
            String str2 = this.f7823h;
            String str3 = C2181z.FRAGMENT_ENCODE_SET.equals(str2) ? str : str2;
            Iterator it2 = this.f7827l.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                HashMap map4 = this.f7826k;
                int iIntValue = map4.containsKey(str4) ? ((Integer) map4.get(str4)).intValue() : 0;
                int iIntValue2 = ((Integer) entry.getValue()).intValue();
                if (iIntValue != iIntValue2) {
                    C1028a c1028a = (C1028a) treeMap.get(str4);
                    c1028a.getClass();
                    C2257f c2257f = (C2257f) map2.get(str3);
                    c2257f.getClass();
                    int i12 = c2257f.f7850j;
                    C2258g c2258gM1510Y2 = AbstractC0714c.m1510Y(this.f7821f, this.f7822g, map3);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) c1028a.f4334a;
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        c1028a.f4334a = spannableStringBuilder;
                    }
                    if (c2258gM1510Y2 != null) {
                        int i13 = c2258gM1510Y2.f7858h;
                        int i14 = 1;
                        if (((i13 == -1 && c2258gM1510Y2.f7859i == -1) ? -1 : (i13 == 1 ? (char) 1 : (char) 0) | (c2258gM1510Y2.f7859i == 1 ? (char) 2 : (char) 0)) != -1) {
                            int i15 = c2258gM1510Y2.f7858h;
                            if (i15 != -1) {
                                i11 = (i15 != i14 ? i14 : 0) | (c2258gM1510Y2.f7859i != i14 ? 2 : 0);
                                StyleSpan styleSpan = new StyleSpan(i11);
                                i = 33;
                                spannableStringBuilder.setSpan(styleSpan, iIntValue, iIntValue2, 33);
                            } else if (c2258gM1510Y2.f7859i == -1) {
                                i11 = -1;
                                i14 = 1;
                                StyleSpan styleSpan2 = new StyleSpan(i11);
                                i = 33;
                                spannableStringBuilder.setSpan(styleSpan2, iIntValue, iIntValue2, 33);
                            } else {
                                i14 = 1;
                                i11 = (i15 != i14 ? i14 : 0) | (c2258gM1510Y2.f7859i != i14 ? 2 : 0);
                                StyleSpan styleSpan22 = new StyleSpan(i11);
                                i = 33;
                                spannableStringBuilder.setSpan(styleSpan22, iIntValue, iIntValue2, 33);
                            }
                        } else {
                            i = 33;
                        }
                        if (c2258gM1510Y2.f7856f == i14) {
                            spannableStringBuilder.setSpan(new StrikethroughSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c2258gM1510Y2.f7857g == i14) {
                            spannableStringBuilder.setSpan(new UnderlineSpan(), iIntValue, iIntValue2, i);
                        }
                        if (c2258gM1510Y2.f7853c) {
                            if (!c2258gM1510Y2.f7853c) {
                                throw new IllegalStateException("Font color has not been defined.");
                            }
                            AbstractC0120b.m410c(spannableStringBuilder, new ForegroundColorSpan(c2258gM1510Y2.f7852b), iIntValue, iIntValue2);
                        }
                        if (c2258gM1510Y2.f7855e) {
                            if (!c2258gM1510Y2.f7855e) {
                                throw new IllegalStateException("Background color has not been defined.");
                            }
                            AbstractC0120b.m410c(spannableStringBuilder, new BackgroundColorSpan(c2258gM1510Y2.f7854d), iIntValue, iIntValue2);
                        }
                        if (c2258gM1510Y2.f7851a != null) {
                            AbstractC0120b.m410c(spannableStringBuilder, new TypefaceSpan(c2258gM1510Y2.f7851a), iIntValue, iIntValue2);
                        }
                        C2253b c2253b = c2258gM1510Y2.f7868r;
                        if (c2253b != null) {
                            int i16 = c2253b.f7813a;
                            if (i16 == -1) {
                                i16 = (i12 == 2 || i12 == 1) ? 3 : 1;
                                i10 = 1;
                            } else {
                                i10 = c2253b.f7814b;
                            }
                            int i17 = c2253b.f7815c;
                            if (i17 == -2) {
                                i17 = 1;
                            }
                            AbstractC0120b.m410c(spannableStringBuilder, new C1035h(i16, i10, i17), iIntValue, iIntValue2);
                        }
                        int i18 = c2258gM1510Y2.f7863m;
                        if (i18 == 2) {
                            C2254c c2254c2 = this.f7825j;
                            while (true) {
                                if (c2254c2 == null) {
                                    c2254c2 = null;
                                    break;
                                }
                                C2258g c2258gM1510Y3 = AbstractC0714c.m1510Y(c2254c2.f7821f, c2254c2.f7822g, map3);
                                if (c2258gM1510Y3 != null && c2258gM1510Y3.f7863m == 1) {
                                    break;
                                } else {
                                    c2254c2 = c2254c2.f7825j;
                                }
                            }
                            if (c2254c2 != null) {
                                ArrayDeque arrayDeque = new ArrayDeque();
                                arrayDeque.push(c2254c2);
                                while (true) {
                                    if (arrayDeque.isEmpty()) {
                                        c2254c = null;
                                        break;
                                    }
                                    C2254c c2254c3 = (C2254c) arrayDeque.pop();
                                    C2258g c2258gM1510Y4 = AbstractC0714c.m1510Y(c2254c3.f7821f, c2254c3.f7822g, map3);
                                    if (c2258gM1510Y4 != null && c2258gM1510Y4.f7863m == 3) {
                                        c2254c = c2254c3;
                                        break;
                                    }
                                    for (int iM4031c = c2254c3.m4031c() - 1; iM4031c >= 0; iM4031c--) {
                                        arrayDeque.push(c2254c3.m4030b(iM4031c));
                                    }
                                }
                                if (c2254c != null) {
                                    if (c2254c.m4031c() == 1) {
                                        i4 = 0;
                                        if (c2254c.m4030b(0).f7817b != null) {
                                            String str5 = c2254c.m4030b(0).f7817b;
                                            int i19 = AbstractC1118i0.f4750a;
                                            C2258g c2258gM1510Y5 = AbstractC0714c.m1510Y(c2254c.f7821f, c2254c.f7822g, map3);
                                            int i20 = c2258gM1510Y5 != null ? c2258gM1510Y5.f7864n : -1;
                                            if (i20 == -1 && (c2258gM1510Y = AbstractC0714c.m1510Y(c2254c2.f7821f, c2254c2.f7822g, map3)) != null) {
                                                i20 = c2258gM1510Y.f7864n;
                                            }
                                            spannableStringBuilder.setSpan(new C1034g(str5, i20), iIntValue, iIntValue2, 33);
                                        }
                                    } else {
                                        i4 = 0;
                                    }
                                    AbstractC1101a.m2371v("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                                }
                                if (c2258gM1510Y2.f7867q == 1) {
                                    AbstractC0120b.m410c(spannableStringBuilder, new C1032e(), iIntValue, iIntValue2);
                                }
                                i8 = c2258gM1510Y2.f7860j;
                                float f9 = 100.0f;
                                if (i8 != 1) {
                                    it = it2;
                                    f8 = 100.0f;
                                    AbstractC0120b.m410c(spannableStringBuilder, new AbsoluteSizeSpan((int) c2258gM1510Y2.f7861k, true), iIntValue, iIntValue2);
                                } else if (i8 == 2) {
                                    it = it2;
                                    f8 = 100.0f;
                                    AbstractC0120b.m410c(spannableStringBuilder, new RelativeSizeSpan(c2258gM1510Y2.f7861k), iIntValue, iIntValue2);
                                } else if (i8 != 3) {
                                    it = it2;
                                    f8 = 100.0f;
                                } else {
                                    float f10 = c2258gM1510Y2.f7861k / 100.0f;
                                    RelativeSizeSpan[] relativeSizeSpanArr = (RelativeSizeSpan[]) spannableStringBuilder.getSpans(iIntValue, iIntValue2, RelativeSizeSpan.class);
                                    int length = relativeSizeSpanArr.length;
                                    int i21 = i4;
                                    float sizeChange = f10;
                                    int i22 = i21;
                                    while (i22 < length) {
                                        float f11 = f9;
                                        RelativeSizeSpan relativeSizeSpan = relativeSizeSpanArr[i22];
                                        Iterator it3 = it2;
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) <= iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) >= iIntValue2) {
                                            sizeChange = relativeSizeSpan.getSizeChange() * sizeChange;
                                        }
                                        if (spannableStringBuilder.getSpanStart(relativeSizeSpan) == iIntValue && spannableStringBuilder.getSpanEnd(relativeSizeSpan) == iIntValue2) {
                                            i9 = i22;
                                            if (spannableStringBuilder.getSpanFlags(relativeSizeSpan) == 33) {
                                                spannableStringBuilder.removeSpan(relativeSizeSpan);
                                            }
                                        } else {
                                            i9 = i22;
                                        }
                                        i22 = i9 + 1;
                                        f9 = f11;
                                        it2 = it3;
                                    }
                                    it = it2;
                                    f8 = f9;
                                    spannableStringBuilder.setSpan(new RelativeSizeSpan(sizeChange), iIntValue, iIntValue2, 33);
                                }
                                if (!"p".equals(this.f7816a)) {
                                    float f12 = c2258gM1510Y2.f7869s;
                                    if (f12 != Float.MAX_VALUE) {
                                        c1028a.f4350q = (f12 * (-90.0f)) / f8;
                                    }
                                    Layout.Alignment alignment = c2258gM1510Y2.f7865o;
                                    if (alignment != null) {
                                        c1028a.f4336c = alignment;
                                    }
                                    Layout.Alignment alignment2 = c2258gM1510Y2.f7866p;
                                    if (alignment2 != null) {
                                        c1028a.f4337d = alignment2;
                                    }
                                }
                            }
                        } else if (i18 == 3 || i18 == 4) {
                            spannableStringBuilder.setSpan(new C2252a(), iIntValue, iIntValue2, 33);
                        }
                        i4 = 0;
                        if (c2258gM1510Y2.f7867q == 1) {
                        }
                        i8 = c2258gM1510Y2.f7860j;
                        float f92 = 100.0f;
                        if (i8 != 1) {
                        }
                        if (!"p".equals(this.f7816a)) {
                        }
                    }
                    it2 = it;
                }
                it = it2;
                it2 = it;
            }
            int i23 = 0;
            while (i23 < m4031c()) {
                m4030b(i23).m4035h(j, map3, map2, str3, treeMap);
                i23++;
                map3 = map;
            }
        }
    }

    /* renamed from: i */
    public final void m4036i(long j, boolean z7, String str, TreeMap treeMap) {
        boolean z8;
        TreeMap treeMap2;
        long j8;
        HashMap map = this.f7826k;
        map.clear();
        HashMap map2 = this.f7827l;
        map2.clear();
        String str2 = this.f7816a;
        if ("metadata".equals(str2)) {
            return;
        }
        String str3 = this.f7823h;
        String str4 = C2181z.FRAGMENT_ENCODE_SET.equals(str3) ? str : str3;
        if (this.f7818c && z7) {
            SpannableStringBuilder spannableStringBuilderM4029e = m4029e(str4, treeMap);
            String str5 = this.f7817b;
            str5.getClass();
            spannableStringBuilderM4029e.append((CharSequence) str5);
            return;
        }
        if (CmcdConfiguration.KEY_BITRATE.equals(str2) && z7) {
            m4029e(str4, treeMap).append('\n');
            return;
        }
        if (m4033f(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                String str6 = (String) entry.getKey();
                CharSequence charSequence = ((C1028a) entry.getValue()).f4334a;
                charSequence.getClass();
                map.put(str6, Integer.valueOf(charSequence.length()));
            }
            boolean zEquals = "p".equals(str2);
            for (int i = 0; i < m4031c(); i++) {
                C2254c c2254cM4030b = m4030b(i);
                if (z7 || zEquals) {
                    z8 = true;
                    treeMap2 = treeMap;
                    j8 = j;
                } else {
                    z8 = false;
                    j8 = j;
                    treeMap2 = treeMap;
                }
                c2254cM4030b.m4036i(j8, z8, str4, treeMap2);
            }
            if (zEquals) {
                SpannableStringBuilder spannableStringBuilderM4029e2 = m4029e(str4, treeMap);
                int length = spannableStringBuilderM4029e2.length() - 1;
                while (length >= 0 && spannableStringBuilderM4029e2.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && spannableStringBuilderM4029e2.charAt(length) != '\n') {
                    spannableStringBuilderM4029e2.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap.entrySet()) {
                String str7 = (String) entry2.getKey();
                CharSequence charSequence2 = ((C1028a) entry2.getValue()).f4334a;
                charSequence2.getClass();
                map2.put(str7, Integer.valueOf(charSequence2.length()));
            }
        }
    }
}
