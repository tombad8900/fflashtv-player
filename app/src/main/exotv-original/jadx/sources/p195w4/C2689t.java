package p195w4;

import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.MainActivity;
import com.exotv.net.R;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import org.json.JSONArray;
import org.json.JSONObject;
import p002a1.AbstractC0008a1;
import p002a1.C0048u;
import p016b5.C0585h;
import p016b5.C0586i;
import p024c5.C0689r0;
import p044e7.C0925b;
import p044e7.C0926c;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1212n;
import p069h7.AbstractC1213o;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1687d;
import p102l6.C1693j;
import p111m6.AbstractC1915j;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p204x4.C2768k;
import p204x4.C2777t;
import p204x4.C2779v;
import p204x4.EnumC2770m;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.t */
/* loaded from: classes.dex */
public final class C2689t extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f9769n;

    /* renamed from: o */
    public int f9770o;

    /* renamed from: p */
    public final /* synthetic */ Object f9771p;

    /* renamed from: q */
    public final /* synthetic */ Object f9772q;

    /* renamed from: r */
    public final /* synthetic */ Object f9773r;

    /* renamed from: s */
    public final /* synthetic */ Object f9774s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2689t(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC2222c interfaceC2222c, int i) {
        super(2, interfaceC2222c);
        this.f9769n = i;
        this.f9771p = obj;
        this.f9772q = obj2;
        this.f9773r = obj3;
        this.f9774s = obj4;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f9769n) {
        }
        return ((C2689t) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f9769n) {
            case 0:
                return new C2689t((C2673l) this.f9771p, (EnumC2770m) this.f9772q, (MainActivity) this.f9773r, (List) this.f9774s, interfaceC2222c, 0);
            default:
                return new C2689t((String) this.f9771p, (String) this.f9772q, (Integer) this.f9773r, (Integer) this.f9774s, interfaceC2222c, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:147:0x0336 A[Catch: all -> 0x0248, TryCatch #8 {all -> 0x0248, blocks: (B:100:0x0242, B:114:0x0273, B:115:0x027c, B:117:0x0282, B:119:0x0297, B:122:0x02a1, B:137:0x02f5, B:145:0x030b, B:147:0x0336, B:150:0x033d, B:149:0x033a, B:154:0x0346, B:132:0x02d4, B:133:0x02d9, B:134:0x02da, B:136:0x02f1, B:142:0x02ff, B:111:0x025c), top: B:158:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x033a A[Catch: all -> 0x0248, TryCatch #8 {all -> 0x0248, blocks: (B:100:0x0242, B:114:0x0273, B:115:0x027c, B:117:0x0282, B:119:0x0297, B:122:0x02a1, B:137:0x02f5, B:145:0x030b, B:147:0x0336, B:150:0x033d, B:149:0x033a, B:154:0x0346, B:132:0x02d4, B:133:0x02d9, B:134:0x02da, B:136:0x02f1, B:142:0x02ff, B:111:0x025c), top: B:158:0x023e }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01ae  */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        LinearLayout linearLayout;
        Object objM2857r;
        View viewM1464d;
        String strM2646T0;
        Integer num;
        Integer num2;
        StringBuilder sb;
        Object objM4851f;
        String str;
        int iIntValue;
        int i = 0;
        int i4 = 1;
        switch (this.f9769n) {
            case 0:
                EnumC2770m enumC2770m = (EnumC2770m) this.f9772q;
                MainActivity mainActivity = (MainActivity) this.f9773r;
                C2673l c2673l = (C2673l) this.f9771p;
                LinearLayout linearLayout2 = c2673l.f9713b;
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i8 = this.f9770o;
                try {
                    try {
                        try {
                            if (i8 == 0) {
                                AbstractC0714c.m1516d0(obj);
                                C2054e c2054e = AbstractC1290e0.f5316a;
                                ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
                                C2687s c2687s = new C2687s((List) this.f9774s, enumC2770m, null);
                                this.f9770o = 1;
                                objM2857r = AbstractC1339x.m2857r(executorC2053d, c2687s, this);
                                if (objM2857r == enumC2273a) {
                                    return enumC2273a;
                                }
                            } else {
                                if (i8 != 1) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                AbstractC0714c.m1516d0(obj);
                                objM2857r = obj;
                            }
                            linearLayout2.removeAllViews();
                            for (C1687d c1687d : (List) objM2857r) {
                                C2671k c2671k = (C2671k) c1687d.f6486j;
                                List list = (List) c1687d.f6487k;
                                if (list.isEmpty()) {
                                    linearLayout = linearLayout2;
                                } else {
                                    int iOrdinal = c2671k.f9707b.ordinal();
                                    if (iOrdinal == 0) {
                                        linearLayout = linearLayout2;
                                        try {
                                            viewM1464d = C0689r0.m1464d(mainActivity, list, enumC2770m, new C2685r(mainActivity, 0, enumC2770m), new C2685r(enumC2770m, mainActivity, i4), new C2663g(mainActivity, 5));
                                        } catch (Exception e) {
                                            e = e;
                                            Log.w("MainActivity", "catalog " + enumC2770m + " failed", e);
                                            linearLayout.removeAllViews();
                                            String string = mainActivity.getString(R.string.load_failed_brief);
                                            c2673l.f9716e = string;
                                            mainActivity.m1690T(false, string, true, enumC2770m != EnumC2770m.f10247j ? EnumC2683q.f9747k : EnumC2683q.f9748l);
                                            c2673l.f9715d = false;
                                            mainActivity.m1693X();
                                            return C1693j.f6497a;
                                        }
                                    } else {
                                        if (iOrdinal != 1) {
                                            throw new C0048u();
                                        }
                                        C0689r0 c0689r0 = C0689r0.f2694a;
                                        try {
                                            viewM1464d = C0689r0.m1465f(mainActivity, c2671k.f9706a.f9720b, list, new C2685r(mainActivity, 2, enumC2770m), new C2685r(enumC2770m, mainActivity, 3), new C2663g(mainActivity, 6), null, null, null, 1928);
                                            linearLayout = linearLayout2;
                                        } catch (CancellationException e8) {
                                            throw e8;
                                        } catch (Exception e9) {
                                            e = e9;
                                            mainActivity = mainActivity;
                                            linearLayout = linearLayout2;
                                            Log.w("MainActivity", "catalog " + enumC2770m + " failed", e);
                                            linearLayout.removeAllViews();
                                            String string2 = mainActivity.getString(R.string.load_failed_brief);
                                            c2673l.f9716e = string2;
                                            mainActivity.m1690T(false, string2, true, enumC2770m != EnumC2770m.f10247j ? EnumC2683q.f9747k : EnumC2683q.f9748l);
                                            c2673l.f9715d = false;
                                            mainActivity.m1693X();
                                            return C1693j.f6497a;
                                        } catch (Throwable th) {
                                            th = th;
                                            mainActivity = mainActivity;
                                            c2673l.f9715d = false;
                                            Set set = MainActivity.f2882p0;
                                            mainActivity.m1693X();
                                            throw th;
                                        }
                                    }
                                    linearLayout.addView(viewM1464d);
                                }
                                linearLayout2 = linearLayout;
                            }
                            linearLayout = linearLayout2;
                            c2673l.f9714c = true;
                            c2673l.f9715d = false;
                            Set set2 = MainActivity.f2882p0;
                        } catch (CancellationException e10) {
                            throw e10;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                    mainActivity.m1693X();
                    return C1693j.f6497a;
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i9 = this.f9770o;
                try {
                    if (i9 == 0) {
                        AbstractC0714c.m1516d0(obj);
                        C2779v c2779v = C2779v.f10315a;
                        C0586i c0586i = C0585h.f2325a;
                        if (c0586i == null || (str = c0586i.f2347v) == null || (strM2646T0 = AbstractC1206h.m2646T0(str, '/')) == null) {
                            strM2646T0 = "https://rest.opensubtitles.org/search";
                            String str2 = (String) this.f9771p;
                            String str3 = (String) this.f9772q;
                            num = (Integer) this.f9773r;
                            num2 = (Integer) this.f9774s;
                            AbstractC2980h.m5136e("lang", str3);
                            sb = new StringBuilder();
                            if (num2 != null && num2.intValue() > 0) {
                                sb.append("/episode-");
                                sb.append(num2.intValue());
                            }
                            sb.append("/imdbid-");
                            sb.append(str2);
                            if (num != null && num.intValue() > 0) {
                                sb.append("/season-");
                                sb.append(num.intValue());
                            }
                            sb.append("/sublanguageid-");
                            sb.append(URLEncoder.encode(str3, "UTF-8"));
                            String strM16l = AbstractC0008a1.m16l(strM2646T0, sb.toString());
                            C2768k c2768k = C2768k.f10237a;
                            this.f9770o = 1;
                            objM4851f = C2768k.m4851f(strM16l, this);
                            if (objM4851f == enumC2273a2) {
                                return enumC2273a2;
                            }
                        } else {
                            if (strM2646T0.length() <= 0) {
                                strM2646T0 = null;
                            }
                            if (strM2646T0 == null) {
                            }
                            String str22 = (String) this.f9771p;
                            String str32 = (String) this.f9772q;
                            num = (Integer) this.f9773r;
                            num2 = (Integer) this.f9774s;
                            AbstractC2980h.m5136e("lang", str32);
                            sb = new StringBuilder();
                            if (num2 != null) {
                                sb.append("/episode-");
                                sb.append(num2.intValue());
                            }
                            sb.append("/imdbid-");
                            sb.append(str22);
                            if (num != null) {
                                sb.append("/season-");
                                sb.append(num.intValue());
                            }
                            sb.append("/sublanguageid-");
                            sb.append(URLEncoder.encode(str32, "UTF-8"));
                            String strM16l2 = AbstractC0008a1.m16l(strM2646T0, sb.toString());
                            C2768k c2768k2 = C2768k.f10237a;
                            this.f9770o = 1;
                            objM4851f = C2768k.m4851f(strM16l2, this);
                            if (objM4851f == enumC2273a2) {
                            }
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0714c.m1516d0(obj);
                        objM4851f = obj;
                    }
                    JSONArray jSONArray = new JSONArray((String) objM4851f);
                    C0926c c0926cM1521g0 = AbstractC0714c.m1521g0(0, jSONArray.length());
                    ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(c0926cM1521g0));
                    Iterator it = c0926cM1521g0.iterator();
                    while (true) {
                        C0925b c0925b = (C0925b) it;
                        if (!c0925b.f3991l) {
                            Integer num3 = (Integer) this.f9773r;
                            Integer num4 = (Integer) this.f9774s;
                            ArrayList arrayList2 = new ArrayList();
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj2 = arrayList.get(i10);
                                i10++;
                                C2777t c2777t = (C2777t) obj2;
                                if (num3 != null && num4 != null) {
                                    int i11 = c2777t.f10304h;
                                    if (i11 == 0 || i11 == num3.intValue()) {
                                        int i12 = c2777t.f10305i;
                                        if (i12 == 0 || i12 == num4.intValue()) {
                                        }
                                    }
                                }
                                arrayList2.add(obj2);
                            }
                            return arrayList2;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(c0925b.nextInt());
                        String strOptString = jSONObject.optString("IDSubtitle");
                        AbstractC2980h.m5135d("optString(...)", strOptString);
                        String strOptString2 = jSONObject.optString("SubFileName");
                        AbstractC2980h.m5135d("optString(...)", strOptString2);
                        String strOptString3 = jSONObject.optString("MovieReleaseName");
                        AbstractC2980h.m5135d("optString(...)", strOptString3);
                        String strOptString4 = jSONObject.optString("LanguageName");
                        AbstractC2980h.m5135d("optString(...)", strOptString4);
                        String strOptString5 = jSONObject.optString("SubFormat");
                        AbstractC2980h.m5135d("optString(...)", strOptString5);
                        String strOptString6 = jSONObject.optString("SubEncoding");
                        AbstractC2980h.m5135d("optString(...)", strOptString6);
                        String strOptString7 = jSONObject.optString("SubDownloadsCnt");
                        AbstractC2980h.m5135d("optString(...)", strOptString7);
                        Integer numM2658k0 = AbstractC1213o.m2658k0(strOptString7);
                        int iIntValue2 = numM2658k0 != null ? numM2658k0.intValue() : i;
                        String strOptString8 = jSONObject.optString("SeriesSeason");
                        AbstractC2980h.m5135d("optString(...)", strOptString8);
                        Integer numM2658k02 = AbstractC1213o.m2658k0(strOptString8);
                        int iIntValue3 = numM2658k02 != null ? numM2658k02.intValue() : i;
                        String strOptString9 = jSONObject.optString("SeriesEpisode");
                        AbstractC2980h.m5135d("optString(...)", strOptString9);
                        Integer numM2658k03 = AbstractC1213o.m2658k0(strOptString9);
                        int iIntValue4 = numM2658k03 != null ? numM2658k03.intValue() : i;
                        String strOptString10 = jSONObject.optString("SubDownloadLink");
                        AbstractC2980h.m5135d("optString(...)", strOptString10);
                        String strOptString11 = jSONObject.optString("MovieFPS");
                        AbstractC2980h.m5135d("optString(...)", strOptString11);
                        Double dValueOf = AbstractC1212n.m2656i0(strOptString11) ? Double.valueOf(Double.parseDouble(strOptString11)) : null;
                        double dDoubleValue = dValueOf != null ? dValueOf.doubleValue() : 0.0d;
                        String strOptString12 = jSONObject.optString("SubSumCD");
                        AbstractC2980h.m5135d("optString(...)", strOptString12);
                        Integer numM2658k04 = AbstractC1213o.m2658k0(strOptString12);
                        if (numM2658k04 == null) {
                            iIntValue = 1;
                        } else {
                            if (numM2658k04.intValue() <= 0) {
                                numM2658k04 = null;
                            }
                            if (numM2658k04 != null) {
                                iIntValue = numM2658k04.intValue();
                            }
                        }
                        arrayList.add(new C2777t(strOptString, strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, iIntValue2, iIntValue3, iIntValue4, strOptString10, dDoubleValue, iIntValue, AbstractC2980h.m5132a(jSONObject.optString("SubAutoTranslation"), "1"), AbstractC2980h.m5132a(jSONObject.optString("SubHearingImpaired"), "1"), AbstractC2980h.m5132a(jSONObject.optString("SubForeignPartsOnly"), "1")));
                        i = 0;
                    }
                } catch (Exception e12) {
                    String message = e12.getMessage();
                    if (message == null) {
                        message = e12.toString();
                    }
                    throw new IOException(message);
                }
                break;
        }
    }
}
