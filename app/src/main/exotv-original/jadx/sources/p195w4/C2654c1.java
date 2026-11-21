package p195w4;

import android.util.Log;
import android.widget.LinearLayout;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import com.exotv.net.SeriesDetailActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p002a1.AbstractC0008a1;
import p016b5.C0585h;
import p016b5.C0586i;
import p044e7.C0925b;
import p044e7.C0926c;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1687d;
import p102l6.C1693j;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1915j;
import p111m6.C1921p;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p156s.C2331d;
import p204x4.C2768k;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.c1 */
/* loaded from: classes.dex */
public final class C2654c1 extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f9660n;

    /* renamed from: o */
    public int f9661o;

    /* renamed from: p */
    public final /* synthetic */ SeriesDetailActivity f9662p;

    /* renamed from: q */
    public final /* synthetic */ int f9663q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2654c1(SeriesDetailActivity seriesDetailActivity, int i, InterfaceC2222c interfaceC2222c, int i4) {
        super(2, interfaceC2222c);
        this.f9660n = i4;
        this.f9662p = seriesDetailActivity;
        this.f9663q = i;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f9660n) {
        }
        return ((C2654c1) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f9660n) {
            case 0:
                return new C2654c1(this.f9662p, this.f9663q, interfaceC2222c, 0);
            default:
                return new C2654c1(this.f9662p, this.f9663q, interfaceC2222c, 1);
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        String str;
        Object objM4851f;
        int iOptInt;
        C2648a1 c2648a1;
        Object objM2857r;
        InterfaceC2222c interfaceC2222c = null;
        int i = 0;
        switch (this.f9660n) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i4 = this.f9661o;
                if (i4 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    C2768k c2768k = C2768k.f10237a;
                    String str2 = "https://api.themoviedb.org/3/tv/" + this.f9662p.f3024b0 + "/season/" + this.f9663q;
                    AbstractC2980h.m5136e("url", str2);
                    String str3 = AbstractC1206h.m2650v0(str2, '?') ? "&" : "?";
                    C0586i c0586i = C0585h.f2325a;
                    if (c0586i == null || (str = c0586i.f2343r) == null) {
                        str = "4e44d9029b1270a757cddc766a1bcb63";
                    }
                    this.f9661o = 1;
                    objM4851f = C2768k.m4851f(str2 + str3 + "api_key=" + str, this);
                    if (objM4851f == enumC2273a) {
                        return enumC2273a;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    objM4851f = obj;
                }
                JSONArray jSONArrayOptJSONArray = new JSONObject((String) objM4851f).optJSONArray("episodes");
                if (jSONArrayOptJSONArray == null) {
                    return C1921p.f7187j;
                }
                C0926c c0926cM1521g0 = AbstractC0714c.m1521g0(0, jSONArrayOptJSONArray.length());
                ArrayList arrayList = new ArrayList();
                Iterator it = c0926cM1521g0.iterator();
                while (true) {
                    C0925b c0925b = (C0925b) it;
                    if (!c0925b.f3991l) {
                        List listM3745J0 = AbstractC1913h.m3745J0(arrayList, new C2331d(3));
                        ArrayList arrayList2 = new ArrayList(AbstractC1915j.m3756w0(listM3745J0));
                        Iterator it2 = listM3745J0.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(new Integer(((C2648a1) it2.next()).f9642g));
                        }
                        ArrayList arrayList3 = new ArrayList(AbstractC1915j.m3756w0(arrayList2));
                        int size = arrayList2.size();
                        int i8 = 0;
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj2 = arrayList2.get(i9);
                            i9++;
                            int i10 = i8 + 1;
                            if (i8 < 0) {
                                AbstractC1914i.m3755v0();
                                throw null;
                            }
                            arrayList3.add(new C1687d(Integer.valueOf(i10), Integer.valueOf(((Number) obj2).intValue())));
                            i8 = i10;
                        }
                        ArrayList arrayList4 = new ArrayList(AbstractC1915j.m3756w0(arrayList3));
                        int size2 = arrayList3.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj3 = arrayList3.get(i11);
                            i11++;
                            int i12 = i + 1;
                            if (i < 0) {
                                AbstractC1914i.m3755v0();
                                throw null;
                            }
                            C1687d c1687d = (C1687d) obj3;
                            int iIntValue = ((Number) c1687d.f6486j).intValue();
                            int iIntValue2 = ((Number) c1687d.f6487k).intValue();
                            C2648a1 c2648a12 = (C2648a1) listM3745J0.get(i);
                            arrayList4.add(new C2648a1(iIntValue, c2648a12.f9637b, c2648a12.f9638c, c2648a12.f9639d, c2648a12.f9640e, c2648a12.f9641f, iIntValue2));
                            i = i12;
                        }
                        return arrayList4;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(c0925b.nextInt());
                    if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("episode_number")) > 0) {
                        String strOptString = jSONObjectOptJSONObject.optString("name");
                        if (strOptString.length() == 0) {
                            strOptString = AbstractC0008a1.m12h(iOptInt, "Episode ");
                        }
                        String str4 = strOptString;
                        AbstractC2980h.m5135d("ifEmpty(...)", str4);
                        String strOptString2 = jSONObjectOptJSONObject.optString("still_path");
                        AbstractC2980h.m5133b(strOptString2);
                        if (strOptString2.length() <= 0 || strOptString2.equals("null")) {
                            strOptString2 = null;
                        }
                        int iOptInt2 = jSONObjectOptJSONObject.optInt("runtime");
                        String strOptString3 = jSONObjectOptJSONObject.optString("overview");
                        AbstractC2980h.m5135d("optString(...)", strOptString3);
                        String strOptString4 = jSONObjectOptJSONObject.optString("air_date");
                        AbstractC2980h.m5133b(strOptString4);
                        c2648a1 = new C2648a1(iOptInt, str4, strOptString2, iOptInt2, strOptString3, (AbstractC1206h.m2630D0(strOptString4) || strOptString4.equals("null")) ? null : strOptString4, iOptInt);
                    } else {
                        c2648a1 = null;
                    }
                    if (c2648a1 != null) {
                        arrayList.add(c2648a1);
                    }
                }
                break;
            default:
                C1693j c1693j = C1693j.f6497a;
                SeriesDetailActivity seriesDetailActivity = this.f9662p;
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i13 = this.f9661o;
                try {
                    if (i13 == 0) {
                        AbstractC0714c.m1516d0(obj);
                        int i14 = this.f9663q;
                        this.f9661o = 1;
                        int i15 = SeriesDetailActivity.f3003k0;
                        C2054e c2054e = AbstractC1290e0.f5316a;
                        objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2654c1(seriesDetailActivity, i14, interfaceC2222c, i), this);
                        if (objM2857r == enumC2273a2) {
                            return enumC2273a2;
                        }
                    } else {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC0714c.m1516d0(obj);
                        objM2857r = obj;
                    }
                    seriesDetailActivity.f3029g0 = (List) objM2857r;
                    seriesDetailActivity.f3030h0 = 1;
                    seriesDetailActivity.m1741C();
                    return c1693j;
                } catch (Exception e) {
                    Log.e("SeriesDetailActivity", "episodes load failed", e);
                    seriesDetailActivity.f3014R = false;
                    LinearLayout linearLayout = seriesDetailActivity.f3008L;
                    if (linearLayout == null) {
                        AbstractC2980h.m5139h("episodeBox");
                        throw null;
                    }
                    linearLayout.removeAllViews();
                    LinearLayout linearLayout2 = seriesDetailActivity.f3008L;
                    if (linearLayout2 == null) {
                        AbstractC2980h.m5139h("episodeBox");
                        throw null;
                    }
                    String string = seriesDetailActivity.getString(R.string.episodes_load_failed);
                    AbstractC2980h.m5135d("getString(...)", string);
                    linearLayout2.addView(seriesDetailActivity.m1748y(string), SeriesDetailActivity.m1738x(seriesDetailActivity, 0, 0, 0, 0, 0, 63));
                    return c1693j;
                }
        }
    }
}
