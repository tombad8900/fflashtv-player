package p065h3;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import okhttp3.C2181z;
import p056g1.C1028a;
import p056g1.C1029b;
import p063h1.AbstractC1118i0;
import p090k2.InterfaceC1590h;
import p099l3.InterfaceC1665g;
import p102l6.C1687d;
import p111m6.AbstractC1913h;
import p124o3.C2047a;
import p142q2.C2252a;
import p142q2.C2254c;
import p142q2.C2257f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h3.b */
/* loaded from: classes.dex */
public final class C1157b implements InterfaceC1590h {

    /* renamed from: j */
    public final Object f4972j;

    /* renamed from: k */
    public final Object f4973k;

    /* renamed from: l */
    public final Object f4974l;

    /* renamed from: m */
    public final Object f4975m;

    /* renamed from: n */
    public final Object f4976n;

    public C1157b(C2254c c2254c, HashMap map, HashMap map2, HashMap map3) {
        this.f4972j = c2254c;
        this.f4975m = map2;
        this.f4976n = map3;
        this.f4974l = Collections.unmodifiableMap(map);
        TreeSet treeSet = new TreeSet();
        int i = 0;
        c2254c.m4032d(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = ((Long) it.next()).longValue();
            i++;
        }
        this.f4973k = jArr;
    }

    /* renamed from: a */
    public void m2576a(InterfaceC1665g interfaceC1665g, Class cls) {
        ((ArrayList) this.f4975m).add(new C1687d(interfaceC1665g, cls));
    }

    /* renamed from: b */
    public void m2577b(C2047a c2047a, Class cls) {
        ((ArrayList) this.f4973k).add(new C1687d(c2047a, cls));
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: c */
    public int mo281c(long j) {
        long[] jArr = (long[]) this.f4973k;
        int iM2436a = AbstractC1118i0.m2436a(jArr, j, false);
        if (iM2436a < jArr.length) {
            return iM2436a;
        }
        return -1;
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: f */
    public long mo284f(int i) {
        return ((long[]) this.f4973k)[i];
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: m */
    public List mo291m(long j) {
        C2254c c2254c = (C2254c) this.f4972j;
        Map map = (Map) this.f4974l;
        HashMap map2 = (HashMap) this.f4975m;
        HashMap map3 = (HashMap) this.f4976n;
        ArrayList arrayList = new ArrayList();
        c2254c.m4034g(j, c2254c.f7823h, arrayList);
        TreeMap treeMap = new TreeMap();
        c2254c.m4036i(j, false, c2254c.f7823h, treeMap);
        c2254c.m4035h(j, map, map2, c2254c.f7823h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Pair pair = (Pair) obj;
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                C2257f c2257f = (C2257f) map2.get(pair.first);
                c2257f.getClass();
                arrayList2.add(new C1029b(null, null, null, bitmapDecodeByteArray, c2257f.f7843c, 0, c2257f.f7845e, c2257f.f7842b, 0, Integer.MIN_VALUE, -3.4028235E38f, c2257f.f7846f, c2257f.f7847g, false, -16777216, c2257f.f7850j, 0.0f));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            C2257f c2257f2 = (C2257f) map2.get(entry.getKey());
            c2257f2.getClass();
            C1028a c1028a = (C1028a) entry.getValue();
            CharSequence charSequence = c1028a.f4334a;
            charSequence.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) charSequence;
            for (C2252a c2252a : (C2252a[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), C2252a.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(c2252a), spannableStringBuilder.getSpanEnd(c2252a), (CharSequence) C2181z.FRAGMENT_ENCODE_SET);
            }
            for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i8 = i4 + 1;
                    int i9 = i8;
                    while (i9 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i9) == ' ') {
                        i9++;
                    }
                    int i10 = i9 - i8;
                    if (i10 > 0) {
                        spannableStringBuilder.delete(i4, i10 + i4);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i11 = 0; i11 < spannableStringBuilder.length() - 1; i11++) {
                if (spannableStringBuilder.charAt(i11) == '\n') {
                    int i12 = i11 + 1;
                    if (spannableStringBuilder.charAt(i12) == ' ') {
                        spannableStringBuilder.delete(i12, i11 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i13 = 0; i13 < spannableStringBuilder.length() - 1; i13++) {
                if (spannableStringBuilder.charAt(i13) == ' ') {
                    int i14 = i13 + 1;
                    if (spannableStringBuilder.charAt(i14) == '\n') {
                        spannableStringBuilder.delete(i13, i14);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            float f8 = c2257f2.f7843c;
            int i15 = c2257f2.f7844d;
            c1028a.f4338e = f8;
            c1028a.f4339f = i15;
            c1028a.f4340g = c2257f2.f7845e;
            c1028a.f4341h = c2257f2.f7842b;
            c1028a.f4345l = c2257f2.f7846f;
            float f9 = c2257f2.f7849i;
            int i16 = c2257f2.f7848h;
            c1028a.f4344k = f9;
            c1028a.f4343j = i16;
            c1028a.f4349p = c2257f2.f7850j;
            arrayList2.add(c1028a.m2225a());
        }
        return arrayList2;
    }

    @Override // p090k2.InterfaceC1590h
    /* renamed from: n */
    public int mo292n() {
        return ((long[]) this.f4973k).length;
    }

    public C1157b(C1158c c1158c) {
        this.f4972j = AbstractC1913h.m3748M0(c1158c.f4977a);
        this.f4973k = AbstractC1913h.m3748M0(c1158c.f4978b);
        this.f4974l = AbstractC1913h.m3748M0(c1158c.f4979c);
        this.f4975m = AbstractC1913h.m3748M0(c1158c.f4980d);
        this.f4976n = AbstractC1913h.m3748M0(c1158c.f4981e);
    }
}
