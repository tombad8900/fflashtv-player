package com.exotv.net;

import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.media.session.AbstractC0120b;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC0147m0;
import androidx.media3.common.C0188c0;
import androidx.media3.common.C0196e0;
import androidx.media3.common.C0199f0;
import androidx.media3.common.C0202g0;
import androidx.media3.common.C0205h0;
import androidx.media3.common.C0208i0;
import androidx.media3.common.C0211j0;
import androidx.media3.common.C0214k0;
import androidx.media3.common.C0226o0;
import androidx.media3.common.C0235r0;
import androidx.media3.common.C0245u1;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.DefaultRenderersFactory;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.p009ui.PlayerView;
import com.bumptech.glide.AbstractC0714c;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.PlayerActivity;
import com.exotv.net.R;
import com.exotv.net.model.BackupSource;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import okhttp3.C2181z;
import org.json.JSONArray;
import org.json.JSONObject;
import p002a1.AbstractC0008a1;
import p002a1.C0016e;
import p002a1.C0019f0;
import p006a5.C0107b;
import p017b6.ViewOnClickListenerC0591a;
import p017b6.ViewOnFocusChangeListenerC0593b;
import p024c5.C0651b1;
import p024c5.C0685p0;
import p024c5.C0687q0;
import p024c5.ViewOnClickListenerC0684p;
import p052f6.C0981l1;
import p061g7.C1054a;
import p061g7.C1060g;
import p061g7.C1065l;
import p062h.AbstractActivityC1083i;
import p063h1.AbstractC1101a;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1212n;
import p069h7.AbstractC1214p;
import p069h7.C1203e;
import p069h7.C1204f;
import p072i2.C1245e;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.C1278a0;
import p095l.C1629o;
import p102l6.C1687d;
import p102l6.C1688e;
import p102l6.C1693j;
import p105m0.C1847s1;
import p105m0.C1850t1;
import p105m0.C1853u1;
import p105m0.C1859w1;
import p105m0.RunnableC1848t;
import p111m6.AbstractC1913h;
import p111m6.AbstractC1914i;
import p111m6.AbstractC1915j;
import p111m6.C1921p;
import p111m6.C1922q;
import p119n6.C2023c;
import p119n6.C2026f;
import p119n6.C2027g;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p146q6.EnumC2273a;
import p154r6.AbstractC2320c;
import p195w4.C2674l0;
import p195w4.C2676m0;
import p195w4.C2680o0;
import p195w4.C2682p0;
import p195w4.C2684q0;
import p195w4.C2686r0;
import p195w4.C2689t;
import p195w4.C2699y;
import p195w4.RunnableC2664g0;
import p195w4.RunnableC2670j0;
import p195w4.RunnableC2678n0;
import p195w4.ViewTreeObserverOnGlobalFocusChangeListenerC2672k0;
import p204x4.AbstractC2775r;
import p204x4.C2772o;
import p204x4.C2774q;
import p204x4.C2776s;
import p204x4.C2777t;
import p204x4.C2779v;
import p204x4.EnumC2761d;
import p204x4.EnumC2773p;
import p212y6.InterfaceC2840a;
import p220z6.AbstractC2980h;
import p220z6.C2985m;
import p220z6.C2986n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class PlayerActivity extends AbstractActivityC1083i {

    /* renamed from: z0 */
    public static final /* synthetic */ int f2936z0 = 0;

    /* renamed from: H */
    public C0107b f2937H;

    /* renamed from: I */
    public ExoPlayer f2938I;

    /* renamed from: J */
    public final Handler f2939J = new Handler(Looper.getMainLooper());

    /* renamed from: K */
    public final RunnableC2664g0 f2940K = new RunnableC2664g0(this, 1);

    /* renamed from: L */
    public List f2941L;

    /* renamed from: M */
    public int f2942M;

    /* renamed from: N */
    public boolean f2943N;

    /* renamed from: O */
    public final C0651b1 f2944O;

    /* renamed from: P */
    public boolean f2945P;

    /* renamed from: Q */
    public long f2946Q;

    /* renamed from: R */
    public boolean f2947R;

    /* renamed from: S */
    public String f2948S;

    /* renamed from: T */
    public final RunnableC2678n0 f2949T;

    /* renamed from: U */
    public final RunnableC2664g0 f2950U;

    /* renamed from: V */
    public final RunnableC2664g0 f2951V;

    /* renamed from: W */
    public final RunnableC2664g0 f2952W;

    /* renamed from: X */
    public final HashMap f2953X;

    /* renamed from: Y */
    public String f2954Y;

    /* renamed from: Z */
    public String f2955Z;

    /* renamed from: a0 */
    public int f2956a0;

    /* renamed from: b0 */
    public C1278a0 f2957b0;

    /* renamed from: c0 */
    public String f2958c0;

    /* renamed from: d0 */
    public int f2959d0;

    /* renamed from: e0 */
    public int f2960e0;

    /* renamed from: f0 */
    public int f2961f0;

    /* renamed from: g0 */
    public final List f2962g0;

    /* renamed from: h0 */
    public final LinkedHashMap f2963h0;

    /* renamed from: i0 */
    public String f2964i0;

    /* renamed from: j0 */
    public String f2965j0;

    /* renamed from: k0 */
    public boolean f2966k0;

    /* renamed from: l0 */
    public boolean f2967l0;

    /* renamed from: m0 */
    public final RunnableC2664g0 f2968m0;

    /* renamed from: n0 */
    public List f2969n0;

    /* renamed from: o0 */
    public TextView f2970o0;

    /* renamed from: p0 */
    public List f2971p0;

    /* renamed from: q0 */
    public Integer f2972q0;

    /* renamed from: r0 */
    public TextView f2973r0;

    /* renamed from: s0 */
    public TextView f2974s0;

    /* renamed from: t0 */
    public View f2975t0;

    /* renamed from: u0 */
    public ViewTreeObserverOnGlobalFocusChangeListenerC2672k0 f2976u0;

    /* renamed from: v0 */
    public final RunnableC2678n0 f2977v0;

    /* renamed from: w0 */
    public final RunnableC2678n0 f2978w0;

    /* renamed from: x0 */
    public String f2979x0;

    /* renamed from: y0 */
    public Map f2980y0;

    public PlayerActivity() {
        C1921p c1921p = C1921p.f7187j;
        this.f2941L = c1921p;
        C0651b1 c0651b1 = new C0651b1();
        c0651b1.f2574a = 3;
        this.f2944O = c0651b1;
        this.f2946Q = -1L;
        this.f2949T = new RunnableC2678n0(this, 2);
        this.f2950U = new RunnableC2664g0(this, 2);
        this.f2951V = new RunnableC2664g0(this, 3);
        this.f2952W = new RunnableC2664g0(this, 4);
        this.f2953X = new HashMap();
        this.f2959d0 = -1;
        this.f2960e0 = -1;
        this.f2961f0 = -1;
        this.f2962g0 = AbstractC1914i.m3753t0(new C2676m0(null, R.string.subs_lang_off), new C2676m0("ara", R.string.subs_lang_ara), new C2676m0("eng", R.string.subs_lang_eng), new C2676m0("fre", R.string.subs_lang_fre), new C2676m0("por", R.string.subs_lang_por), new C2676m0("pob", R.string.subs_lang_pob), new C2676m0("spa", R.string.subs_lang_spa));
        this.f2963h0 = new LinkedHashMap();
        this.f2968m0 = new RunnableC2664g0(this, 5);
        this.f2969n0 = c1921p;
        this.f2971p0 = c1921p;
        this.f2977v0 = new RunnableC2678n0(this, 1);
        this.f2978w0 = new RunnableC2678n0(this, 0);
        this.f2980y0 = C1922q.f7188j;
    }

    /* renamed from: C */
    public static String m1704C(long j) {
        long j8 = j / 1000;
        if (j8 < 0) {
            j8 = 0;
        }
        long j9 = 3600;
        long j10 = 60;
        return String.format(Locale.US, "%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j8 / j9), Long.valueOf((j8 % j9) / j10), Long.valueOf(j8 % j10)}, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02cb  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1705r(PlayerActivity playerActivity, String str, boolean z7) throws NumberFormatException {
        Iterator it;
        int i;
        List listM3745J0;
        Long lM4857c;
        C1204f c1204f;
        Iterator it2;
        String str2;
        String str3;
        int i4;
        String string;
        C2779v c2779v = C2779v.f10315a;
        C1204f c1204f2 = C2779v.f10321g;
        C1204f c1204f3 = C2779v.f10318d;
        C1204f c1204f4 = C2779v.f10320f;
        AbstractC2980h.m5136e("body", str);
        String strM2664q0 = AbstractC1214p.m2664q0(AbstractC1214p.m2665r0(AbstractC1206h.m2635I0(str, "\ufeff"), "\r\n", "\n"), '\r', '\n');
        int i8 = 1;
        List listM2638L0 = AbstractC1206h.m2638L0(strM2664q0, new char[]{'\n'});
        String str4 = "matcher(...)";
        String str5 = "input";
        if (listM2638L0.isEmpty()) {
            if (!listM2638L0.isEmpty()) {
                Iterator it3 = listM2638L0.iterator();
                while (it3.hasNext()) {
                    if (c1204f2.m2624c(AbstractC1206h.m2645S0((String) it3.next()).toString())) {
                        ArrayList arrayList = new ArrayList();
                        C2986n c2986n = new C2986n();
                        C2985m c2985m = new C2985m();
                        StringBuilder sb = new StringBuilder();
                        Iterator it4 = listM2638L0.iterator();
                        while (it4.hasNext()) {
                            String string2 = AbstractC1206h.m2645S0((String) it4.next()).toString();
                            AbstractC2980h.m5136e(str5, string2);
                            Matcher matcher = c1204f2.f5091j.matcher(string2);
                            AbstractC2980h.m5135d(str4, matcher);
                            C0016e c0016e = !matcher.matches() ? null : new C0016e(matcher, string2);
                            if (c0016e != null) {
                                C2779v.m4856b(c2986n, sb, c2985m, arrayList);
                                String str6 = (String) ((C1203e) c0016e.m31A()).get(1);
                                String str7 = (String) ((C1203e) c0016e.m31A()).get(2);
                                String str8 = (String) ((C1203e) c0016e.m31A()).get(3);
                                c1204f = c1204f2;
                                String str9 = (String) ((C1203e) c0016e.m31A()).get(4);
                                it2 = it4;
                                String str10 = (String) ((C1203e) c0016e.m31A()).get(5);
                                str2 = str4;
                                String str11 = (String) ((C1203e) c0016e.m31A()).get(6);
                                str3 = str5;
                                String str12 = (String) ((C1203e) c0016e.m31A()).get(7);
                                String str13 = (String) ((C1203e) c0016e.m31A()).get(8);
                                c2986n.f11117j = Long.valueOf(C2779v.m4859e(str6, str7, str8, str9));
                                c2985m.f11116j = C2779v.m4859e(str10, str11, str12, str13);
                            } else {
                                c1204f = c1204f2;
                                it2 = it4;
                                str2 = str4;
                                str3 = str5;
                                if (string2.length() == 0 || (AbstractC1214p.m2667t0(string2, "[", false) && AbstractC1214p.m2660m0(string2, "]", false))) {
                                    C2779v.m4856b(c2986n, sb, c2985m, arrayList);
                                } else if (c2986n.f11117j != null) {
                                    if (sb.length() > 0) {
                                        sb.append('\n');
                                    }
                                    sb.append(AbstractC1206h.m2645S0(c1204f3.m2625d(string2)).toString());
                                }
                            }
                            it4 = it2;
                            c1204f2 = c1204f;
                            str4 = str2;
                            str5 = str3;
                        }
                        C2779v.m4856b(c2986n, sb, c2985m, arrayList);
                        listM3745J0 = AbstractC1913h.m3745J0(arrayList, new C2774q(3));
                        i = 0;
                    }
                }
            }
            String strM4860f = C2779v.m4860f(strM2664q0);
            AbstractC2980h.m5136e("body", strM4860f);
            String strM2664q02 = AbstractC1214p.m2664q0(AbstractC1214p.m2665r0(AbstractC1206h.m2635I0(strM4860f, "\ufeff"), "\r\n", "\n"), '\r', '\n');
            ArrayList arrayList2 = new ArrayList();
            it = C2779v.f10319e.m2626e(strM2664q02).iterator();
            while (it.hasNext()) {
                List listM2638L02 = AbstractC1206h.m2638L0((String) it.next(), new char[]{'\n'});
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : listM2638L02) {
                    if (!AbstractC1206h.m2630D0((String) obj)) {
                        arrayList3.add(obj);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    int size = arrayList3.size();
                    int i9 = 0;
                    int i10 = 0;
                    while (true) {
                        if (i9 >= size) {
                            i10 = -1;
                            break;
                        }
                        Object obj2 = arrayList3.get(i9);
                        i9++;
                        if (AbstractC1206h.m2649u0((String) obj2, "-->", false)) {
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 >= 0) {
                        List listM2637K0 = AbstractC1206h.m2637K0((CharSequence) arrayList3.get(i10), new String[]{"-->"});
                        if (listM2637K0.size() >= 2 && (lM4857c = C2779v.m4857c((String) listM2637K0.get(0))) != null) {
                            long jLongValue = lM4857c.longValue();
                            Long lM4857c2 = C2779v.m4857c((String) listM2637K0.get(1));
                            if (lM4857c2 != null) {
                                long jLongValue2 = lM4857c2.longValue();
                                if (jLongValue2 > jLongValue) {
                                    String string3 = AbstractC1206h.m2645S0(AbstractC1913h.m3740E0(AbstractC1913h.m3750y0(i10 + 1, arrayList3), "\n", null, null, new C1065l(3), 30)).toString();
                                    if (string3.length() != 0) {
                                        arrayList2.add(new C2776s(string3, jLongValue, jLongValue2));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            i = 0;
            listM3745J0 = AbstractC1913h.m3745J0(arrayList2, new C2774q(2));
        } else {
            Iterator it5 = listM2638L0.iterator();
            while (it5.hasNext()) {
                if (c1204f4.m2624c(AbstractC1206h.m2645S0((String) it5.next()).toString())) {
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it6 = listM2638L0.iterator();
                    double dDoubleValue = 25.0d;
                    while (it6.hasNext()) {
                        String string4 = AbstractC1206h.m2645S0((String) it6.next()).toString();
                        AbstractC2980h.m5136e("input", string4);
                        Matcher matcher2 = c1204f4.f5091j.matcher(string4);
                        AbstractC2980h.m5135d("matcher(...)", matcher2);
                        C0016e c0016e2 = !matcher2.matches() ? null : new C0016e(matcher2, string4);
                        if (c0016e2 != null) {
                            String str14 = (String) ((C1203e) c0016e2.m31A()).get(i8);
                            String str15 = (String) ((C1203e) c0016e2.m31A()).get(2);
                            String str16 = (String) ((C1203e) c0016e2.m31A()).get(3);
                            String string5 = AbstractC1206h.m2645S0(str16).toString();
                            AbstractC2980h.m5136e("<this>", string5);
                            Double dValueOf = AbstractC1212n.m2656i0(string5) ? Double.valueOf(Double.parseDouble(string5)) : null;
                            if (!AbstractC2980h.m5132a(str14, str15) || dValueOf == null) {
                                String string6 = AbstractC1206h.m2645S0(AbstractC1214p.m2665r0(c1204f3.m2625d(str16), "|", "\n")).toString();
                                if (string6.length() != 0) {
                                    long j = (long) ((Double.parseDouble(str14) * 1000.0d) / dDoubleValue);
                                    long j8 = (long) ((Double.parseDouble(str15) * 1000.0d) / dDoubleValue);
                                    if (j8 > j) {
                                        arrayList4.add(new C2776s(string6, j, j8));
                                    }
                                }
                            } else {
                                double dDoubleValue2 = dValueOf.doubleValue();
                                if (dDoubleValue2 >= 1.0d && dDoubleValue2 <= 121.0d) {
                                    dDoubleValue = dValueOf.doubleValue();
                                }
                            }
                        }
                        i8 = 1;
                    }
                    listM3745J0 = AbstractC1913h.m3745J0(arrayList4, new C2774q(1));
                    i = 0;
                }
            }
            if (!listM2638L0.isEmpty()) {
            }
            String strM4860f2 = C2779v.m4860f(strM2664q0);
            AbstractC2980h.m5136e("body", strM4860f2);
            String strM2664q022 = AbstractC1214p.m2664q0(AbstractC1214p.m2665r0(AbstractC1206h.m2635I0(strM4860f2, "\ufeff"), "\r\n", "\n"), '\r', '\n');
            ArrayList arrayList22 = new ArrayList();
            it = C2779v.f10319e.m2626e(strM2664q022).iterator();
            while (it.hasNext()) {
            }
            i = 0;
            listM3745J0 = AbstractC1913h.m3745J0(arrayList22, new C2774q(2));
        }
        if (listM3745J0.isEmpty()) {
            String string7 = playerActivity.getString(R.string.subs_empty_file);
            AbstractC2980h.m5135d("getString(...)", string7);
            playerActivity.m1725S(string7);
            playerActivity.m1718L();
            playerActivity.m1709B(z7);
            return;
        }
        playerActivity.f2969n0 = listM3745J0;
        C2779v c2779v2 = C2779v.f10315a;
        String str17 = playerActivity.f2955Z;
        if (str17 == null || (string = AbstractC1206h.m2645S0(str17).toString()) == null) {
            i4 = i;
        } else {
            String lowerCase = string.toLowerCase(Locale.ROOT);
            AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
            i4 = 1;
            if (!C2779v.f10316b.contains(lowerCase)) {
            }
        }
        C0107b c0107b = playerActivity.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b.f521E.setLayoutDirection(i4);
        Handler handler = playerActivity.f2939J;
        RunnableC2678n0 runnableC2678n0 = playerActivity.f2978w0;
        handler.removeCallbacks(runnableC2678n0);
        handler.post(runnableC2678n0);
        playerActivity.m1715I();
        boolean zIsEmpty = playerActivity.f2969n0.isEmpty();
        C0107b c0107b2 = playerActivity.f2937H;
        if (c0107b2 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b2.f531h.setColorFilter(zIsEmpty ? -1 : -2354116);
        playerActivity.m1718L();
        playerActivity.m1709B(z7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cc, code lost:
    
        if (r1 != r3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019a  */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1706s(PlayerActivity playerActivity, String str, AbstractC2320c abstractC2320c) throws Throwable {
        C2682p0 c2682p0;
        EnumC2761d enumC2761d;
        String str2;
        String str3;
        Object obj;
        EnumC2761d enumC2761d2;
        String str4;
        int i;
        double d8;
        double d9;
        double d10;
        Integer num;
        PlayerActivity playerActivity2 = playerActivity;
        if (abstractC2320c instanceof C2682p0) {
            c2682p0 = (C2682p0) abstractC2320c;
            int i4 = c2682p0.f9745r;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c2682p0.f9745r = i4 - Integer.MIN_VALUE;
            } else {
                c2682p0 = new C2682p0(playerActivity2, abstractC2320c);
            }
        }
        Object objM2857r = c2682p0.f9743p;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i8 = c2682p0.f9745r;
        int i9 = 2;
        EnumC2773p enumC2773p = null;
        if (i8 == 0) {
            AbstractC0714c.m1516d0(objM2857r);
            String str5 = playerActivity2.f2958c0;
            if (str5 == null) {
                throw new IllegalStateException("no TMDB id");
            }
            enumC2761d = (playerActivity2.f2959d0 < 0 || playerActivity2.f2960e0 < 0) ? EnumC2761d.f10216j : EnumC2761d.f10217k;
            str2 = playerActivity2.f2965j0;
            if (str2 == null) {
                C2779v c2779v = C2779v.f10315a;
                c2682p0.f9740m = playerActivity2;
                c2682p0.f9741n = str;
                c2682p0.f9742o = enumC2761d;
                c2682p0.f9745r = 1;
                Object objM4862a = c2779v.m4862a(str5, enumC2761d, c2682p0);
                if (objM4862a != enumC2273a) {
                    obj = objM4862a;
                    enumC2761d2 = enumC2761d;
                    str4 = str;
                }
                return enumC2273a;
            }
            str3 = str;
            String str6 = str2;
            C2779v c2779v2 = C2779v.f10315a;
            EnumC2761d enumC2761d3 = EnumC2761d.f10217k;
            Integer num2 = enumC2761d != enumC2761d3 ? new Integer(playerActivity2.f2959d0) : null;
            Integer num3 = enumC2761d != enumC2761d3 ? new Integer(playerActivity2.f2961f0) : null;
            c2682p0.f9740m = playerActivity2;
            c2682p0.f9741n = null;
            c2682p0.f9742o = null;
            c2682p0.f9745r = 2;
            C2054e c2054e = AbstractC1290e0.f5316a;
            objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2689t(str6, str3, num2, num3, null, 1), c2682p0);
        } else {
            if (i8 != 1) {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                playerActivity2 = c2682p0.f9740m;
                AbstractC0714c.m1516d0(objM2857r);
                List list = (List) objM2857r;
                C1204f c1204f = AbstractC2775r.f10278a;
                String str7 = playerActivity2.f2964i0;
                AbstractC2980h.m5136e("hits", list);
                if (list.size() < 2) {
                    return list;
                }
                C2772o c2772oM4855a = AbstractC2775r.m4855a(str7);
                ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(list));
                Iterator it = list.iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    C2777t c2777t = (C2777t) it.next();
                    C1204f c1204f2 = AbstractC2775r.f10278a;
                    AbstractC2980h.m5136e("hit", c2777t);
                    String str8 = c2777t.f10299c;
                    String str9 = c2777t.f10298b;
                    List listM3753t0 = AbstractC1914i.m3753t0(str8, str9);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : listM3753t0) {
                        if (!AbstractC1206h.m2630D0((String) obj2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    String strM3740E0 = AbstractC1913h.m3740E0(arrayList2, " ", null, null, null, 62);
                    Locale locale = Locale.US;
                    AbstractC2980h.m5135d("US", locale);
                    String lowerCase = strM3740E0.toLowerCase(locale);
                    AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
                    if (AbstractC1206h.m2630D0(str8)) {
                        str8 = str9;
                    }
                    C2772o c2772oM4855a2 = AbstractC2775r.m4855a(str8);
                    if (c2772oM4855a == null || c2772oM4855a2 == null) {
                        EnumC2773p enumC2773p2 = c2772oM4855a2 != null ? c2772oM4855a2.f10264c : enumC2773p;
                        EnumC2773p enumC2773p3 = EnumC2773p.f10270j;
                        if (enumC2773p2 == enumC2773p3 && c2772oM4855a != null && c2772oM4855a.f10264c != enumC2773p3) {
                            d8 = -12.0d;
                        } else if ((c2772oM4855a2 != null ? c2772oM4855a2.f10264c : enumC2773p) == enumC2773p3 && c2772oM4855a == null) {
                            d8 = -4.0d;
                        } else if (c2772oM4855a == null || c2772oM4855a2 == null) {
                            d8 = 0.0d;
                        } else {
                            EnumC2773p enumC2773p4 = c2772oM4855a2.f10264c;
                            EnumC2773p enumC2773p5 = EnumC2773p.f10275o;
                            if (enumC2773p4 != enumC2773p5 && c2772oM4855a.f10264c != enumC2773p5) {
                                d8 = -2.0d;
                            }
                        }
                    } else {
                        EnumC2773p enumC2773p6 = c2772oM4855a2.f10264c;
                        EnumC2773p enumC2773p7 = c2772oM4855a.f10264c;
                        if (enumC2773p6 == enumC2773p7 && enumC2773p7 != EnumC2773p.f10275o) {
                            d8 = 4.0d;
                        }
                    }
                    if (c2772oM4855a != null) {
                        String str10 = c2772oM4855a.f10269h;
                        Integer num4 = c2772oM4855a.f10268g;
                        d9 = 4.0d;
                        String str11 = c2772oM4855a.f10265d;
                        if (c2772oM4855a2 != null) {
                            String str12 = c2772oM4855a2.f10269h;
                            Integer num5 = c2772oM4855a2.f10268g;
                            if (str11.length() > 0 && str11.equals(c2772oM4855a2.f10265d)) {
                                d8 += 10.0d;
                            }
                            Integer num6 = c2772oM4855a.f10263b;
                            if (num6 != null && AbstractC2980h.m5132a(c2772oM4855a2.f10263b, num6)) {
                                d8 += 2.0d;
                            }
                            Integer num7 = c2772oM4855a.f10262a;
                            if (num7 != null && AbstractC2980h.m5132a(c2772oM4855a2.f10262a, num7)) {
                                d8 += 2.0d;
                            }
                            Integer num8 = c2772oM4855a.f10267f;
                            if (num8 != null && num4 != null && (num = c2772oM4855a2.f10267f) != null && num5 != null) {
                                d8 += (num.equals(num8) && num5.equals(num4)) ? 6.0d : -8.0d;
                            }
                            if (str10.length() > 0 && str12.length() > 0) {
                                d8 += str12.equals(str10) ? 2.0d : -10.0d;
                            }
                            double d11 = c2772oM4855a.f10266e;
                            double d12 = c2777t.f10307k;
                            if (d11 <= 0.0d || d12 <= 0.0d) {
                                d10 = 0.0d;
                            } else {
                                double dAbs = Math.abs((d12 / d11) - 1.0d);
                                d10 = dAbs <= 0.002d ? 3.0d : dAbs <= 0.02d ? 2.0d : -6.0d;
                            }
                            d8 += d10;
                            if (AbstractC1206h.m2649u0(lowerCase, "x264", false) || AbstractC1206h.m2649u0(lowerCase, "h.264", false) || AbstractC1206h.m2649u0(lowerCase, "avc", false)) {
                                d8 += 1.0d;
                            }
                        }
                    } else {
                        d9 = 4.0d;
                    }
                    if (c2777t.f10311o || AbstractC1206h.m2649u0(lowerCase, "forced", false)) {
                        d8 -= 12.0d;
                    }
                    if (c2777t.f10308l > 1) {
                        d8 -= d9;
                    }
                    if (c2777t.f10309m) {
                        d8 -= 3.0d;
                    }
                    if (c2777t.f10310n) {
                        d8 -= 1.0d;
                    }
                    int i10 = c2777t.f10303g;
                    if (i10 >= 0) {
                        i = i10;
                    }
                    arrayList.add(new C1687d(c2777t, Double.valueOf((Math.log(i + 1.0d) / 10.0d) + d8)));
                    enumC2773p = null;
                }
                List listM3745J0 = AbstractC1913h.m3745J0(arrayList, new C0685p0(new C2774q(i), i9));
                ArrayList arrayList3 = new ArrayList(AbstractC1915j.m3756w0(listM3745J0));
                Iterator it2 = listM3745J0.iterator();
                while (it2.hasNext()) {
                    arrayList3.add((C2777t) ((C1687d) it2.next()).f6486j);
                }
                return arrayList3;
            }
            EnumC2761d enumC2761d4 = c2682p0.f9742o;
            str4 = c2682p0.f9741n;
            PlayerActivity playerActivity3 = c2682p0.f9740m;
            AbstractC0714c.m1516d0(objM2857r);
            enumC2761d2 = enumC2761d4;
            playerActivity2 = playerActivity3;
            obj = objM2857r;
        }
        str2 = (String) obj;
        if (str2 == null) {
            String string = playerActivity2.getString(R.string.subs_no_imdb);
            AbstractC2980h.m5135d("getString(...)", string);
            throw new IllegalStateException(string.toString());
        }
        str3 = str4;
        enumC2761d = enumC2761d2;
        String str62 = str2;
        C2779v c2779v22 = C2779v.f10315a;
        EnumC2761d enumC2761d32 = EnumC2761d.f10217k;
        if (enumC2761d != enumC2761d32) {
        }
        if (enumC2761d != enumC2761d32) {
        }
        c2682p0.f9740m = playerActivity2;
        c2682p0.f9741n = null;
        c2682p0.f9742o = null;
        c2682p0.f9745r = 2;
        C2054e c2054e2 = AbstractC1290e0.f5316a;
        objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2689t(str62, str3, num2, num3, null, 1), c2682p0);
    }

    /* renamed from: t */
    public static final void m1707t(PlayerActivity playerActivity) {
        ExoPlayer exoPlayer = playerActivity.f2938I;
        if (exoPlayer == null) {
            return;
        }
        long duration = exoPlayer.getDuration();
        if (duration <= 0) {
            return;
        }
        C0107b c0107b = playerActivity.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        int i = (int) duration;
        if (c0107b.f542s.getMax() != i) {
            C0107b c0107b2 = playerActivity.f2937H;
            if (c0107b2 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0107b2.f542s.setMax(i);
            C0107b c0107b3 = playerActivity.f2937H;
            if (c0107b3 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0107b3.f542s.setKeyProgressIncrement(10000);
        }
        if (!playerActivity.f2967l0) {
            C0107b c0107b4 = playerActivity.f2937H;
            if (c0107b4 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0107b4.f542s.setProgress((int) exoPlayer.getCurrentPosition());
        }
        C0107b c0107b5 = playerActivity.f2937H;
        if (c0107b5 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b5.f544u.setText(m1704C(exoPlayer.getCurrentPosition()));
        C0107b c0107b6 = playerActivity.f2937H;
        if (c0107b6 != null) {
            c0107b6.f545v.setText(m1704C(duration));
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* renamed from: A */
    public final void m1708A() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f547x.getVisibility() != 0) {
            return;
        }
        View childAt = this.f2974s0;
        if (childAt == null) {
            C0107b c0107b2 = this.f2937H;
            if (c0107b2 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            childAt = c0107b2.f546w.getChildAt(0);
            if (childAt == null) {
                return;
            }
        }
        childAt.post(new RunnableC1848t(childAt, 3));
    }

    /* renamed from: B */
    public final void m1709B(boolean z7) {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f519C.getVisibility() != 0) {
            return;
        }
        View view = z7 ? this.f2970o0 : null;
        if (view == null) {
            String str = this.f2954Y;
            LinkedHashMap linkedHashMap = this.f2963h0;
            view = (TextView) linkedHashMap.get(str);
            if (view == null) {
                view = (View) linkedHashMap.get(null);
            }
            if (view == null) {
                return;
            }
        }
        view.post(new RunnableC2670j0(this, view, 0));
    }

    /* renamed from: D */
    public final void m1710D() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f519C.getVisibility() == 0) {
            return;
        }
        C0107b c0107b2 = this.f2937H;
        if (c0107b2 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b2.f541r.getVisibility() == 0) {
            return;
        }
        C0107b c0107b3 = this.f2937H;
        if (c0107b3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b3.f547x.getVisibility() == 0) {
            return;
        }
        C0107b c0107b4 = this.f2937H;
        if (c0107b4 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b4.f533j.clearFocus();
        C0107b c0107b5 = this.f2937H;
        if (c0107b5 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b5.f533j.setVisibility(8);
        C0107b c0107b6 = this.f2937H;
        if (c0107b6 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b6.f522F.setVisibility(8);
        this.f2939J.removeCallbacks(this.f2977v0);
    }

    /* renamed from: E */
    public final void m1711E() {
        Window window = getWindow();
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        C1629o c1629o = new C1629o((View) c0107b.f524a);
        int i = Build.VERSION.SDK_INT;
        AbstractC0715d c1859w1 = i >= 35 ? new C1859w1(window, c1629o) : i >= 30 ? new C1853u1(window, c1629o) : i >= 26 ? new C1850t1(window, c1629o) : new C1847s1(window, c1629o);
        c1859w1.mo1583L(519);
        c1859w1.mo1596j0();
    }

    /* renamed from: F */
    public final void m1712F(int i, List list, boolean z7) {
        if (i < 0 || i >= list.size()) {
            return;
        }
        C1278a0 c1278a0 = this.f2957b0;
        if (c1278a0 != null) {
            AbstractC1339x.m2841b(c1278a0);
        }
        this.f2956a0 = i;
        this.f2957b0 = AbstractC1339x.m2850k(AbstractC0147m0.m566e(this), null, new C2680o0(list, i, this, z7, null), 3);
    }

    /* renamed from: G */
    public final TextView m1713G(String str, boolean z7, InterfaceC2840a interfaceC2840a) {
        TextView textView = new TextView(this);
        textView.setText(str);
        textView.setTextSize(14.0f);
        textView.setTextColor(z7 ? -1 : -6052957);
        textView.setPadding(m1734y(10), m1734y(10), m1734y(10), m1734y(10));
        textView.setMaxLines(2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setFocusable(z7);
        textView.setClickable(z7);
        if (z7) {
            textView.setBackground(getDrawable(R.drawable.bg_player_btn));
            textView.setOnClickListener(new ViewOnClickListenerC0591a(11, interfaceC2840a));
        }
        return textView;
    }

    /* renamed from: H */
    public final void m1714H() {
        ViewTreeObserverOnGlobalFocusChangeListenerC2672k0 viewTreeObserverOnGlobalFocusChangeListenerC2672k0 = this.f2976u0;
        if (viewTreeObserverOnGlobalFocusChangeListenerC2672k0 == null) {
            return;
        }
        this.f2976u0 = null;
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f524a.getViewTreeObserver().isAlive()) {
            C0107b c0107b2 = this.f2937H;
            if (c0107b2 != null) {
                c0107b2.f524a.getViewTreeObserver().removeOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC2672k0);
            } else {
                AbstractC2980h.m5139h("b");
                throw null;
            }
        }
    }

    /* renamed from: I */
    public final void m1715I() {
        C0107b c0107b = this.f2937H;
        C2776s c2776s = null;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        TextView textView = c0107b.f521E;
        AbstractC2980h.m5135d("subtitleText", textView);
        ExoPlayer exoPlayer = this.f2938I;
        if (exoPlayer == null || this.f2969n0.isEmpty()) {
            textView.setVisibility(8);
            return;
        }
        long currentPosition = exoPlayer.getCurrentPosition();
        int size = this.f2969n0.size() - 1;
        int i = -1;
        int i4 = 0;
        while (i4 <= size) {
            int i8 = (i4 + size) / 2;
            if (((C2776s) this.f2969n0.get(i8)).f10295b > currentPosition) {
                size = i8 - 1;
                i = i8;
            } else {
                i4 = i8 + 1;
            }
        }
        if (i >= 0) {
            C2776s c2776s2 = (C2776s) this.f2969n0.get(i);
            if (currentPosition >= c2776s2.f10294a) {
                c2776s = c2776s2;
            }
        }
        if (c2776s == null) {
            textView.setVisibility(8);
            return;
        }
        String str = c2776s.f10296c;
        if (!AbstractC2980h.m5132a(textView.getText(), str)) {
            textView.setText(str);
        }
        textView.setVisibility(0);
    }

    /* renamed from: J */
    public final void m1716J() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        LinearLayout linearLayout = c0107b.f540q;
        linearLayout.removeAllViews();
        this.f2973r0 = null;
        List listM1551T = AbstractC0715d.m1551T(null);
        List list = this.f2971p0;
        ArrayList arrayList = new ArrayList(AbstractC1915j.m3756w0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((C2674l0) it.next()).f9717a));
        }
        ArrayList arrayListM3743H0 = AbstractC1913h.m3743H0(listM1551T, arrayList);
        int size = arrayListM3743H0.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListM3743H0.get(i);
            i++;
            Integer num = (Integer) obj;
            boolean zM5132a = AbstractC2980h.m5132a(num, this.f2972q0);
            String string = num == null ? getString(R.string.quality_auto) : getString(R.string.quality_tier, num);
            AbstractC2980h.m5135d("getString(...)", string);
            if (zM5132a) {
                string = getString(R.string.subs_checked, string);
            }
            AbstractC2980h.m5133b(string);
            TextView textViewM1713G = m1713G(string, true, new C2699y(this, num, 1));
            if (zM5132a) {
                this.f2973r0 = textViewM1713G;
            }
            linearLayout.addView(textViewM1713G);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1717K() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        LinearLayout linearLayout = c0107b.f546w;
        linearLayout.removeAllViews();
        this.f2974s0 = null;
        if (this.f2941L.isEmpty()) {
            String string = getString(R.string.servers_none);
            AbstractC2980h.m5135d("getString(...)", string);
            linearLayout.addView(m1713G(string, false, null));
            return;
        }
        final int i = 0;
        for (Object obj : this.f2941L) {
            int i4 = i + 1;
            if (i < 0) {
                AbstractC1914i.m3755v0();
                throw null;
            }
            String name = ((BackupSource) obj).getName();
            if (name == null) {
                name = getString(R.string.server_number, Integer.valueOf(i4));
                AbstractC2980h.m5135d("getString(...)", name);
            } else {
                if (AbstractC1206h.m2630D0(name)) {
                    name = null;
                }
                if (name == null) {
                }
            }
            boolean z7 = i == this.f2942M;
            if (z7) {
                name = getString(R.string.subs_checked, name);
            }
            AbstractC2980h.m5133b(name);
            TextView textViewM1713G = m1713G(name, true, new InterfaceC2840a() { // from class: w4.i0
                @Override // p212y6.InterfaceC2840a
                public final Object invoke() {
                    PlayerActivity playerActivity = this.f9697j;
                    int i8 = playerActivity.f2942M;
                    int i9 = i;
                    if (i9 == i8) {
                        C0107b c0107b2 = playerActivity.f2937H;
                        if (c0107b2 == null) {
                            AbstractC2980h.m5139h("b");
                            throw null;
                        }
                        c0107b2.f547x.setVisibility(8);
                        playerActivity.m1723Q();
                    } else {
                        playerActivity.f2942M = i9;
                        C0651b1 c0651b1 = playerActivity.f2944O;
                        c0651b1.f2577d = 0;
                        c0651b1.f2575b = false;
                        playerActivity.f2939J.removeCallbacks(playerActivity.f2952W);
                        BackupSource backupSource = (BackupSource) playerActivity.f2941L.get(i9);
                        playerActivity.m1726T(backupSource.getUrl(), backupSource.getHeaders(), playerActivity.m1719M());
                        playerActivity.m1717K();
                        playerActivity.m1708A();
                        playerActivity.m1723Q();
                    }
                    return C1693j.f6497a;
                }
            });
            if (z7) {
                this.f2974s0 = textViewM1713G;
            }
            linearLayout.addView(textViewM1713G);
            i = i4;
        }
    }

    /* renamed from: L */
    public final void m1718L() {
        CharSequence charSequenceSubSequence;
        for (Map.Entry entry : this.f2963h0.entrySet()) {
            ((TextView) entry.getValue()).setSelected(AbstractC2980h.m5132a((String) entry.getKey(), this.f2954Y));
        }
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        LinearLayout linearLayout = c0107b.f517A;
        linearLayout.removeAllViews();
        this.f2970o0 = null;
        String str = this.f2954Y;
        if (str == null) {
            String string = getString(R.string.subs_choose_lang);
            AbstractC2980h.m5135d("getString(...)", string);
            linearLayout.addView(m1713G(string, false, null));
            return;
        }
        final List list = (List) this.f2953X.get(str);
        if (list == null) {
            String string2 = getString(R.string.subs_searching, str);
            AbstractC2980h.m5135d("getString(...)", string2);
            linearLayout.addView(m1713G(string2, false, null));
            return;
        }
        if (list.isEmpty()) {
            String string3 = getString(R.string.subs_empty, str);
            AbstractC2980h.m5135d("getString(...)", string3);
            linearLayout.addView(m1713G(string3, false, null));
            return;
        }
        final int i = 0;
        for (Object obj : list) {
            int i4 = i + 1;
            if (i < 0) {
                AbstractC1914i.m3755v0();
                throw null;
            }
            C2777t c2777t = (C2777t) obj;
            boolean z7 = AbstractC2980h.m5132a(this.f2955Z, str) && this.f2956a0 == i;
            String string4 = c2777t.f10298b;
            if (string4.length() > 42) {
                String strM2644R0 = AbstractC1206h.m2644R0(42, string4);
                int length = strM2644R0.length() - 1;
                if (length >= 0) {
                    while (true) {
                        int i8 = length - 1;
                        if (!AbstractC0120b.m429y(strM2644R0.charAt(length))) {
                            charSequenceSubSequence = strM2644R0.subSequence(0, length + 1);
                            break;
                        } else if (i8 < 0) {
                            break;
                        } else {
                            length = i8;
                        }
                    }
                    charSequenceSubSequence = C2181z.FRAGMENT_ENCODE_SET;
                    string4 = AbstractC0008a1.m16l(charSequenceSubSequence.toString(), "\u2026");
                } else {
                    charSequenceSubSequence = C2181z.FRAGMENT_ENCODE_SET;
                    string4 = AbstractC0008a1.m16l(charSequenceSubSequence.toString(), "\u2026");
                }
            }
            if (z7) {
                string4 = getString(R.string.subs_checked, string4);
            }
            AbstractC2980h.m5133b(string4);
            TextView textViewM1713G = m1713G(string4, true, new InterfaceC2840a() { // from class: w4.h0
                @Override // p212y6.InterfaceC2840a
                public final Object invoke() {
                    int i9 = PlayerActivity.f2936z0;
                    this.f9692j.m1712F(i, list, true);
                    return C1693j.f6497a;
                }
            });
            if (z7) {
                this.f2970o0 = textViewM1713G;
            }
            linearLayout.addView(textViewM1713G);
            i = i4;
        }
    }

    /* renamed from: M */
    public final long m1719M() {
        if (!this.f2966k0) {
            return 0L;
        }
        ExoPlayer exoPlayer = this.f2938I;
        long currentPosition = exoPlayer != null ? exoPlayer.getCurrentPosition() : 0L;
        if (currentPosition <= 0) {
            currentPosition = this.f2946Q;
        }
        if (currentPosition > DefaultRenderersFactory.DEFAULT_ALLOWED_VIDEO_JOINING_TIME_MS) {
            return currentPosition;
        }
        return 0L;
    }

    /* renamed from: N */
    public final void m1720N(String str) {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f535l.getVisibility() == 0) {
            Log.i("PlayerActivity", "ignoring " + str + ": the failure screen is up");
            return;
        }
        C0651b1 c0651b1 = this.f2944O;
        int i = c0651b1.f2577d;
        int i4 = c0651b1.f2574a;
        RunnableC2664g0 runnableC2664g0 = this.f2952W;
        Handler handler = this.f2939J;
        if (i < i4) {
            c0651b1.f2577d = i + 1;
            m1722P(true);
            handler.removeCallbacks(runnableC2664g0);
            handler.postDelayed(runnableC2664g0, 700L);
            return;
        }
        int i8 = this.f2942M + 1;
        if (i8 < 0 || i8 >= this.f2941L.size()) {
            Log.w("PlayerActivity", "giving up after " + i + " retries (reason=" + str + ")");
            m1722P(false);
            String string = this.f2948S;
            if (string == null) {
                string = getString(R.string.player_error_generic);
                AbstractC2980h.m5135d("getString(...)", string);
            }
            m1724R(string);
            return;
        }
        this.f2942M = i8;
        c0651b1.f2577d = 0;
        c0651b1.f2575b = false;
        handler.removeCallbacks(runnableC2664g0);
        this.f2948S = null;
        BackupSource backupSource = (BackupSource) this.f2941L.get(i8);
        m1726T(backupSource.getUrl(), backupSource.getHeaders(), m1719M());
        C0107b c0107b2 = this.f2937H;
        if (c0107b2 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b2.f547x.getVisibility() == 0) {
            m1717K();
            m1708A();
        }
        int i9 = this.f2942M + 1;
        int size = this.f2941L.size();
        StringBuilder sbM19o = AbstractC0008a1.m19o(i8, i, "server ", " spent ", " retries (reason=");
        sbM19o.append(str);
        sbM19o.append("), now on server ");
        sbM19o.append(i9);
        sbM19o.append(" of ");
        sbM19o.append(size);
        Log.w("PlayerActivity", sbM19o.toString());
    }

    /* renamed from: O */
    public final void m1721O(String str) {
        this.f2954Y = str;
        getSharedPreferences("exotv_subtitles", 0).edit().putString("language", str == null ? "off" : str).apply();
        C1278a0 c1278a0 = this.f2957b0;
        if (c1278a0 != null) {
            AbstractC1339x.m2841b(c1278a0);
        }
        if (this.f2953X.containsKey(str)) {
            m1718L();
            m1732w(str);
        } else {
            m1718L();
            this.f2957b0 = AbstractC1339x.m2850k(AbstractC0147m0.m566e(this), null, new C0687q0(this, str, null, 4), 3);
        }
    }

    /* renamed from: P */
    public final void m1722P(boolean z7) {
        C0107b c0107b = this.f2937H;
        if (c0107b != null) {
            c0107b.f532i.setVisibility((!z7 || c0107b.f535l.getVisibility() == 0) ? 8 : 0);
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* renamed from: Q */
    public final void m1723Q() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f533j.getVisibility() != 0) {
            C0107b c0107b2 = this.f2937H;
            if (c0107b2 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0107b2.f533j.setVisibility(0);
            C0107b c0107b3 = this.f2937H;
            if (c0107b3 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0107b3.f522F.setVisibility(0);
            if (getResources().getBoolean(R.bool.is_tv_layout)) {
                C0107b c0107b4 = this.f2937H;
                if (c0107b4 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                c0107b4.f525b.requestFocus();
                C0107b c0107b5 = this.f2937H;
                if (c0107b5 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                c0107b5.f525b.post(new RunnableC2664g0(this, 0));
            }
        }
        boolean z7 = this.f2966k0;
        Handler handler = this.f2939J;
        if (z7) {
            RunnableC2678n0 runnableC2678n0 = this.f2977v0;
            handler.removeCallbacks(runnableC2678n0);
            handler.post(runnableC2678n0);
        }
        RunnableC2664g0 runnableC2664g0 = this.f2940K;
        handler.removeCallbacks(runnableC2664g0);
        handler.postDelayed(runnableC2664g0, 4000L);
    }

    /* renamed from: R */
    public final void m1724R(String str) {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        boolean z7 = c0107b.f535l.getVisibility() == 0;
        RunnableC2664g0 runnableC2664g0 = this.f2940K;
        Handler handler = this.f2939J;
        handler.removeCallbacks(runnableC2664g0);
        handler.removeCallbacks(this.f2950U);
        handler.removeCallbacks(this.f2951V);
        handler.removeCallbacks(this.f2952W);
        handler.removeCallbacks(this.f2949T);
        C0107b c0107b2 = this.f2937H;
        if (c0107b2 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b2.f533j.setVisibility(8);
        C0107b c0107b3 = this.f2937H;
        if (c0107b3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b3.f522F.setVisibility(8);
        C0107b c0107b4 = this.f2937H;
        if (c0107b4 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b4.f519C.setVisibility(8);
        C0107b c0107b5 = this.f2937H;
        if (c0107b5 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b5.f541r.setVisibility(8);
        C0107b c0107b6 = this.f2937H;
        if (c0107b6 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b6.f547x.setVisibility(8);
        handler.removeCallbacks(this.f2977v0);
        ExoPlayer exoPlayer = this.f2938I;
        if (exoPlayer != null) {
            long currentPosition = exoPlayer.getCurrentPosition();
            if (currentPosition > 0) {
                this.f2946Q = currentPosition;
            }
            exoPlayer.setPlayWhenReady(false);
            exoPlayer.stop();
        }
        m1722P(false);
        C0107b c0107b7 = this.f2937H;
        if (c0107b7 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b7.f535l.setVisibility(0);
        C0107b c0107b8 = this.f2937H;
        if (c0107b8 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b8.f534k.setText(str);
        if (!getResources().getBoolean(R.bool.is_tv_layout) || z7) {
            return;
        }
        C0107b c0107b9 = this.f2937H;
        if (c0107b9 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        this.f2975t0 = c0107b9.f537n;
        if (this.f2976u0 == null) {
            ViewTreeObserverOnGlobalFocusChangeListenerC2672k0 viewTreeObserverOnGlobalFocusChangeListenerC2672k0 = new ViewTreeObserverOnGlobalFocusChangeListenerC2672k0(this, 0);
            this.f2976u0 = viewTreeObserverOnGlobalFocusChangeListenerC2672k0;
            c0107b9.f524a.getViewTreeObserver().addOnGlobalFocusChangeListener(viewTreeObserverOnGlobalFocusChangeListenerC2672k0);
        }
        C0107b c0107b10 = this.f2937H;
        if (c0107b10 != null) {
            c0107b10.f537n.post(new RunnableC2664g0(this, 6));
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* renamed from: S */
    public final void m1725S(String str) {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b.f520D.setText(str);
        C0107b c0107b2 = this.f2937H;
        if (c0107b2 != null) {
            c0107b2.f520D.setVisibility(0);
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* renamed from: T */
    public final void m1726T(String str, Map map, long j) {
        boolean z7;
        String lowerCase;
        C0211j0 c0211j0;
        ExoPlayer exoPlayer = this.f2938I;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
        }
        this.f2938I = null;
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b.f539p.setPlayer(null);
        C0107b c0107b2 = this.f2937H;
        if (c0107b2 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b2.f535l.setVisibility(8);
        m1714H();
        C0651b1 c0651b1 = this.f2944O;
        c0651b1.f2574a = c0651b1.f2575b ? 2 : this.f2942M + 1 < this.f2941L.size() ? 1 : 3;
        this.f2979x0 = str;
        this.f2980y0 = map;
        Set setKeySet = map.keySet();
        if (setKeySet == null || !setKeySet.isEmpty()) {
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                if (AbstractC1214p.m2661n0((String) it.next(), "User-Agent")) {
                    z7 = true;
                    break;
                }
            }
            z7 = false;
        } else {
            z7 = false;
        }
        C2026f c2026f = new C2026f(8);
        c2026f.putAll(map);
        String stringExtra = getIntent().getStringExtra("exo_referer");
        if (stringExtra != null) {
            if (AbstractC1206h.m2630D0(stringExtra)) {
                stringExtra = null;
            }
            if (stringExtra != null) {
                Set setKeySet2 = c2026f.keySet();
                if (((C2027g) setKeySet2).f7486k.isEmpty()) {
                    c2026f.put("Referer", stringExtra);
                } else {
                    Iterator it2 = ((C2027g) setKeySet2).iterator();
                    while (it2.hasNext()) {
                        if (AbstractC1214p.m2661n0((String) it2.next(), "Referer")) {
                            break;
                        }
                    }
                    c2026f.put("Referer", stringExtra);
                }
            }
        }
        c2026f.m3911b();
        c2026f.f7484v = true;
        if (c2026f.f7480r <= 0) {
            c2026f = C2026f.f7471w;
            AbstractC2980h.m5134c("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>", c2026f);
        }
        C1245e c1245e = new C1245e(1);
        c1245e.f5202l = true;
        C0016e c0016e = (C0016e) c1245e.f5203m;
        synchronized (c0016e) {
            c0016e.f63l = null;
            ((HashMap) c0016e.f62k).clear();
            ((HashMap) c0016e.f62k).putAll(c2026f);
        }
        c1245e.f5200j = DefaultLoadControl.DEFAULT_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS;
        c1245e.f5201k = 12000;
        c1245e.f5204n = z7 ? null : "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/151.0.0.0 Safari/537.36";
        DefaultMediaSourceFactory dataSourceFactory = new DefaultMediaSourceFactory(this).setDataSourceFactory(c1245e);
        AbstractC2980h.m5135d("setDataSourceFactory(...)", dataSourceFactory);
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this).setMediaSourceFactory(dataSourceFactory).build();
        AbstractC2980h.m5135d("build(...)", exoPlayerBuild);
        C0188c0 c0188c0 = new C0188c0();
        C0199f0 c0199f0 = new C0199f0();
        List list = Collections.EMPTY_LIST;
        C0981l1 c0981l1 = C0981l1.f4211n;
        C0205h0 c0205h0 = new C0205h0();
        C0214k0 c0214k0 = C0214k0.f1167d;
        Uri uri = str == null ? null : Uri.parse(str);
        String str2 = "application/x-mpegURL";
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (lastPathSegment != null) {
            lowerCase = lastPathSegment.toLowerCase(Locale.ROOT);
            AbstractC2980h.m5135d("toLowerCase(...)", lowerCase);
        } else {
            lowerCase = null;
        }
        if (lowerCase == null) {
            lowerCase = C2181z.FRAGMENT_ENCODE_SET;
        }
        if (!AbstractC1214p.m2660m0(lowerCase, ".m3u8", false)) {
            if (AbstractC1214p.m2660m0(lowerCase, ".mpd", false)) {
                str2 = "application/dash+xml";
            } else if (AbstractC1214p.m2660m0(lowerCase, ".mp4", false) || AbstractC1214p.m2660m0(lowerCase, ".m4v", false)) {
                str2 = "video/mp4";
            }
        }
        AbstractC1101a.m2359j(c0199f0.f1091b == null || c0199f0.f1090a != null);
        if (uri != null) {
            c0211j0 = new C0211j0(uri, str2, c0199f0.f1090a != null ? new C0202g0(c0199f0) : null, null, list, null, c0981l1, null, -9223372036854775807L);
        } else {
            c0211j0 = null;
        }
        exoPlayerBuild.setMediaItem(new C0226o0(C2181z.FRAGMENT_ENCODE_SET, new C0196e0(c0188c0), c0211j0, new C0208i0(c0205h0), C0235r0.f1329K, c0214k0));
        if (j > 0) {
            exoPlayerBuild.seekTo(j);
        }
        exoPlayerBuild.setPlayWhenReady(true);
        exoPlayerBuild.addListener(new C2686r0(this, exoPlayerBuild));
        C0107b c0107b3 = this.f2937H;
        if (c0107b3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b3.f539p.setPlayer(exoPlayerBuild);
        exoPlayerBuild.prepare();
        this.f2938I = exoPlayerBuild;
        m1730u();
        this.f2946Q = -1L;
        this.f2944O.f2576c = System.currentTimeMillis();
        m1722P(true);
        this.f2939J.removeCallbacks(this.f2950U);
        this.f2939J.removeCallbacks(this.f2951V);
        this.f2939J.removeCallbacks(this.f2952W);
        this.f2939J.postDelayed(this.f2950U, Renderer.DEFAULT_DURATION_TO_PROGRESS_US);
        m1731v();
    }

    /* renamed from: U */
    public final void m1727U() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f541r.getVisibility() == 0) {
            C0107b c0107b2 = this.f2937H;
            if (c0107b2 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0107b2.f541r.setVisibility(8);
            m1723Q();
            return;
        }
        C0107b c0107b3 = this.f2937H;
        if (c0107b3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b3.f519C.setVisibility(8);
        C0107b c0107b4 = this.f2937H;
        if (c0107b4 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b4.f547x.setVisibility(8);
        m1716J();
        C0107b c0107b5 = this.f2937H;
        if (c0107b5 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b5.f541r.setVisibility(0);
        m1735z();
        m1723Q();
    }

    /* renamed from: V */
    public final void m1728V() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f547x.getVisibility() == 0) {
            C0107b c0107b2 = this.f2937H;
            if (c0107b2 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0107b2.f547x.setVisibility(8);
            m1723Q();
            return;
        }
        C0107b c0107b3 = this.f2937H;
        if (c0107b3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b3.f519C.setVisibility(8);
        C0107b c0107b4 = this.f2937H;
        if (c0107b4 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b4.f541r.setVisibility(8);
        m1717K();
        C0107b c0107b5 = this.f2937H;
        if (c0107b5 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b5.f547x.setVisibility(0);
        m1708A();
        m1723Q();
    }

    /* renamed from: W */
    public final void m1729W() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f519C.getVisibility() == 0) {
            C0107b c0107b2 = this.f2937H;
            if (c0107b2 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0107b2.f519C.setVisibility(8);
            m1723Q();
            return;
        }
        C0107b c0107b3 = this.f2937H;
        if (c0107b3 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b3.f519C.setVisibility(0);
        C0107b c0107b4 = this.f2937H;
        if (c0107b4 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b4.f541r.setVisibility(8);
        C0107b c0107b5 = this.f2937H;
        if (c0107b5 == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b5.f547x.setVisibility(8);
        m1718L();
        m1709B(false);
        m1723Q();
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x016a, code lost:
    
        if (((android.widget.ImageView) r6.f6487k).requestFocus() != false) goto L126;
     */
    @Override // p062h.AbstractActivityC1083i, p011b0.AbstractActivityC0539e, android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C1687d c1687d;
        AbstractC2980h.m5136e("event", keyEvent);
        if (keyEvent.getAction() == 0) {
            C0107b c0107b = this.f2937H;
            if (c0107b == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            if (c0107b.f535l.getVisibility() == 0) {
                return super.dispatchKeyEvent(keyEvent);
            }
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19 || keyCode == 20 || keyCode == 21 || keyCode == 22 || keyCode == 23 || keyCode == 66) {
                C0107b c0107b2 = this.f2937H;
                if (c0107b2 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b2.f533j.getVisibility() != 0) {
                    m1723Q();
                    return true;
                }
                Handler handler = this.f2939J;
                RunnableC2664g0 runnableC2664g0 = this.f2940K;
                handler.removeCallbacks(runnableC2664g0);
                handler.postDelayed(runnableC2664g0, 4000L);
            }
            C0107b c0107b3 = this.f2937H;
            if (c0107b3 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            boolean z7 = false;
            if (c0107b3.f519C.getVisibility() == 0) {
                boolean z8 = keyEvent.getKeyCode() == 19;
                boolean z9 = keyEvent.getKeyCode() == 20;
                if (z8 || z9) {
                    View currentFocus = getCurrentFocus();
                    if (currentFocus != null) {
                        C0107b c0107b4 = this.f2937H;
                        if (c0107b4 == null) {
                            AbstractC2980h.m5139h("b");
                            throw null;
                        }
                        LinearLayout linearLayout = c0107b4.f548y;
                        if (currentFocus == linearLayout.getChildAt(linearLayout.getChildCount() - 1) && z9) {
                            C0107b c0107b5 = this.f2937H;
                            if (c0107b5 != null) {
                                if (!c0107b5.f531h.requestFocus()) {
                                }
                                return true;
                            }
                            AbstractC2980h.m5139h("b");
                            throw null;
                        }
                    }
                    if (currentFocus != null) {
                        C0107b c0107b6 = this.f2937H;
                        if (c0107b6 == null) {
                            AbstractC2980h.m5139h("b");
                            throw null;
                        }
                        if (currentFocus == c0107b6.f548y.getChildAt(0) && z8) {
                            C0107b c0107b7 = this.f2937H;
                            if (c0107b7 != null) {
                                if (!c0107b7.f531h.requestFocus()) {
                                }
                                return true;
                            }
                            AbstractC2980h.m5139h("b");
                            throw null;
                        }
                    }
                }
            }
            C0107b c0107b8 = this.f2937H;
            if (c0107b8 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            if (c0107b8.f541r.getVisibility() == 0) {
                C0107b c0107b9 = this.f2937H;
                if (c0107b9 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                c1687d = new C1687d(c0107b9.f541r, c0107b9.f528e);
            } else {
                C0107b c0107b10 = this.f2937H;
                if (c0107b10 == null) {
                    AbstractC2980h.m5139h("b");
                    throw null;
                }
                if (c0107b10.f547x.getVisibility() == 0) {
                    C0107b c0107b11 = this.f2937H;
                    if (c0107b11 == null) {
                        AbstractC2980h.m5139h("b");
                        throw null;
                    }
                    c1687d = new C1687d(c0107b11.f547x, c0107b11.f530g);
                } else {
                    c1687d = null;
                }
            }
            if (c1687d != null) {
                boolean z10 = keyEvent.getKeyCode() == 21 || keyEvent.getKeyCode() == 22;
                View currentFocus2 = getCurrentFocus();
                if (currentFocus2 != null) {
                    Object parent = currentFocus2.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            C0107b c0107b12 = this.f2937H;
                            if (c0107b12 == null) {
                                AbstractC2980h.m5139h("b");
                                throw null;
                            }
                            if (parent == c0107b12.f540q) {
                                break;
                            }
                            parent = ((View) parent).getParent();
                        } else {
                            for (Object parent2 = currentFocus2.getParent(); parent2 instanceof View; parent2 = ((View) parent2).getParent()) {
                                C0107b c0107b13 = this.f2937H;
                                if (c0107b13 == null) {
                                    AbstractC2980h.m5139h("b");
                                    throw null;
                                }
                                if (parent2 != c0107b13.f546w) {
                                }
                            }
                        }
                    }
                    z7 = true;
                }
                if (z10) {
                    if (z7) {
                    }
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x029d  */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v110, types: [android.content.SharedPreferences] */
    /* JADX WARN: Type inference failed for: r0v133 */
    /* JADX WARN: Type inference failed for: r0v134 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.util.LinkedHashMap, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r41v0, types: [android.app.Activity, android.content.Context, androidx.lifecycle.v, b.l, com.exotv.net.PlayerActivity, h.i, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v76, types: [java.lang.String] */
    @Override // p062h.AbstractActivityC1083i, p010b.AbstractActivityC0522l, p011b0.AbstractActivityC0539e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) throws Throwable {
        Object objM1539y;
        ?? linkedHashMap;
        Throwable th;
        Object objM1539y2;
        List listM3743H0;
        C0107b c0107b;
        Object next;
        Iterator it;
        super.onCreate(bundle);
        m1247i().m1255a(this, new C0019f0(this, 2));
        getWindow().addFlags(128);
        Window window = getWindow();
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.rotationAnimation = 2;
        window.setAttributes(attributes);
        if (Build.VERSION.SDK_INT >= 28) {
            Window window2 = getWindow();
            WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
            attributes2.layoutInDisplayCutoutMode = 1;
            window2.setAttributes(attributes2);
        }
        AbstractC0120b.m396G(getWindow(), false);
        Throwable th2 = null;
        View viewInflate = getLayoutInflater().inflate(R.layout.activity_player, (ViewGroup) null, false);
        int i = R.id.btnClose;
        ImageView imageView = (ImageView) AbstractC0714c.m1494G(viewInflate, R.id.btnClose);
        if (imageView != null) {
            i = R.id.btnMute;
            ImageView imageView2 = (ImageView) AbstractC0714c.m1494G(viewInflate, R.id.btnMute);
            if (imageView2 != null) {
                i = R.id.btnPlayPause;
                ImageView imageView3 = (ImageView) AbstractC0714c.m1494G(viewInflate, R.id.btnPlayPause);
                if (imageView3 != null) {
                    i = R.id.btnQuality;
                    ImageView imageView4 = (ImageView) AbstractC0714c.m1494G(viewInflate, R.id.btnQuality);
                    if (imageView4 != null) {
                        i = R.id.btnResize;
                        ImageView imageView5 = (ImageView) AbstractC0714c.m1494G(viewInflate, R.id.btnResize);
                        if (imageView5 != null) {
                            i = R.id.btnServers;
                            ImageView imageView6 = (ImageView) AbstractC0714c.m1494G(viewInflate, R.id.btnServers);
                            if (imageView6 != null) {
                                i = R.id.btnSubs;
                                ImageView imageView7 = (ImageView) AbstractC0714c.m1494G(viewInflate, R.id.btnSubs);
                                if (imageView7 != null) {
                                    i = R.id.bufferOverlay;
                                    FrameLayout frameLayout = (FrameLayout) AbstractC0714c.m1494G(viewInflate, R.id.bufferOverlay);
                                    if (frameLayout != null) {
                                        i = R.id.bufferSpinner;
                                        if (((ProgressBar) AbstractC0714c.m1494G(viewInflate, R.id.bufferSpinner)) != null) {
                                            i = R.id.controlsPanel;
                                            LinearLayout linearLayout = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.controlsPanel);
                                            if (linearLayout != null) {
                                                i = R.id.controlsRow;
                                                if (((LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.controlsRow)) != null) {
                                                    i = R.id.playerError;
                                                    TextView textView = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.playerError);
                                                    if (textView != null) {
                                                        i = R.id.playerErrorOverlay;
                                                        LinearLayout linearLayout2 = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.playerErrorOverlay);
                                                        if (linearLayout2 != null) {
                                                            i = R.id.playerExit;
                                                            TextView textView2 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.playerExit);
                                                            if (textView2 != null) {
                                                                i = R.id.playerRetry;
                                                                TextView textView3 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.playerRetry);
                                                                if (textView3 != null) {
                                                                    i = R.id.playerTitle;
                                                                    TextView textView4 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.playerTitle);
                                                                    if (textView4 != null) {
                                                                        i = R.id.playerView;
                                                                        PlayerView playerView = (PlayerView) AbstractC0714c.m1494G(viewInflate, R.id.playerView);
                                                                        if (playerView != null) {
                                                                            i = R.id.qualityList;
                                                                            LinearLayout linearLayout3 = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.qualityList);
                                                                            if (linearLayout3 != null) {
                                                                                i = R.id.qualityPanel;
                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) AbstractC0714c.m1494G(viewInflate, R.id.qualityPanel);
                                                                                if (constraintLayout != null) {
                                                                                    i = R.id.seekBar;
                                                                                    SeekBar seekBar = (SeekBar) AbstractC0714c.m1494G(viewInflate, R.id.seekBar);
                                                                                    if (seekBar != null) {
                                                                                        i = R.id.seekRow;
                                                                                        LinearLayout linearLayout4 = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.seekRow);
                                                                                        if (linearLayout4 != null) {
                                                                                            i = R.id.seekTimeCurrent;
                                                                                            TextView textView5 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.seekTimeCurrent);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.seekTimeTotal;
                                                                                                TextView textView6 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.seekTimeTotal);
                                                                                                if (textView6 != null) {
                                                                                                    i = R.id.serversList;
                                                                                                    LinearLayout linearLayout5 = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.serversList);
                                                                                                    if (linearLayout5 != null) {
                                                                                                        i = R.id.serversPanel;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) AbstractC0714c.m1494G(viewInflate, R.id.serversPanel);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i = R.id.subsLangs;
                                                                                                            LinearLayout linearLayout6 = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.subsLangs);
                                                                                                            if (linearLayout6 != null) {
                                                                                                                i = R.id.subsLangsScroll;
                                                                                                                ScrollView scrollView = (ScrollView) AbstractC0714c.m1494G(viewInflate, R.id.subsLangsScroll);
                                                                                                                if (scrollView != null) {
                                                                                                                    i = R.id.subsList;
                                                                                                                    LinearLayout linearLayout7 = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.subsList);
                                                                                                                    if (linearLayout7 != null) {
                                                                                                                        i = R.id.subsListScroll;
                                                                                                                        ScrollView scrollView2 = (ScrollView) AbstractC0714c.m1494G(viewInflate, R.id.subsListScroll);
                                                                                                                        if (scrollView2 != null) {
                                                                                                                            i = R.id.subsPanel;
                                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) AbstractC0714c.m1494G(viewInflate, R.id.subsPanel);
                                                                                                                            if (constraintLayout3 != null) {
                                                                                                                                i = R.id.subsStatus;
                                                                                                                                TextView textView7 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.subsStatus);
                                                                                                                                if (textView7 != null) {
                                                                                                                                    i = R.id.subtitleText;
                                                                                                                                    TextView textView8 = (TextView) AbstractC0714c.m1494G(viewInflate, R.id.subtitleText);
                                                                                                                                    if (textView8 != null) {
                                                                                                                                        i = R.id.topBar;
                                                                                                                                        LinearLayout linearLayout8 = (LinearLayout) AbstractC0714c.m1494G(viewInflate, R.id.topBar);
                                                                                                                                        if (linearLayout8 != null) {
                                                                                                                                            i = R.id.touchLayer;
                                                                                                                                            View viewM1494G = AbstractC0714c.m1494G(viewInflate, R.id.touchLayer);
                                                                                                                                            if (viewM1494G != null) {
                                                                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) viewInflate;
                                                                                                                                                this.f2937H = new C0107b(constraintLayout4, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, frameLayout, linearLayout, textView, linearLayout2, textView2, textView3, textView4, playerView, linearLayout3, constraintLayout, seekBar, linearLayout4, textView5, textView6, linearLayout5, constraintLayout2, linearLayout6, scrollView, linearLayout7, scrollView2, constraintLayout3, textView7, textView8, linearLayout8, viewM1494G);
                                                                                                                                                setContentView(constraintLayout4);
                                                                                                                                                m1711E();
                                                                                                                                                String stringExtra = getIntent().getStringExtra("exo_url");
                                                                                                                                                String stringExtra2 = getIntent().getStringExtra("exo_title");
                                                                                                                                                if (stringExtra2 == null) {
                                                                                                                                                    stringExtra2 = C2181z.FRAGMENT_ENCODE_SET;
                                                                                                                                                }
                                                                                                                                                String str = stringExtra2;
                                                                                                                                                String stringExtra3 = getIntent().getStringExtra("exo_headers");
                                                                                                                                                Object obj = C1922q.f7188j;
                                                                                                                                                if (stringExtra3 != null) {
                                                                                                                                                    try {
                                                                                                                                                        if (AbstractC1206h.m2630D0(stringExtra3)) {
                                                                                                                                                            linkedHashMap = obj;
                                                                                                                                                            objM1539y = linkedHashMap;
                                                                                                                                                        } else {
                                                                                                                                                            JSONObject jSONObject = new JSONObject(stringExtra3);
                                                                                                                                                            Iterator<String> itKeys = jSONObject.keys();
                                                                                                                                                            AbstractC2980h.m5135d("keys(...)", itKeys);
                                                                                                                                                            C1054a c1054a = new C1054a(new C1060g(1, itKeys));
                                                                                                                                                            linkedHashMap = new LinkedHashMap();
                                                                                                                                                            Iterator it2 = c1054a.iterator();
                                                                                                                                                            while (it2.hasNext()) {
                                                                                                                                                                Object next2 = it2.next();
                                                                                                                                                                linkedHashMap.put(next2, jSONObject.getString((String) next2));
                                                                                                                                                            }
                                                                                                                                                            objM1539y = linkedHashMap;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th3) {
                                                                                                                                                        objM1539y = AbstractC0714c.m1539y(th3);
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    linkedHashMap = obj;
                                                                                                                                                    objM1539y = linkedHashMap;
                                                                                                                                                }
                                                                                                                                                if (!(objM1539y instanceof C1688e)) {
                                                                                                                                                    obj = objM1539y;
                                                                                                                                                }
                                                                                                                                                C1922q c1922q = (Map) obj;
                                                                                                                                                String stringExtra4 = getIntent().getStringExtra("exo_backups");
                                                                                                                                                Object obj2 = C1921p.f7187j;
                                                                                                                                                if (stringExtra4 != null) {
                                                                                                                                                    try {
                                                                                                                                                        if (AbstractC1206h.m2630D0(stringExtra4)) {
                                                                                                                                                            th = null;
                                                                                                                                                            objM1539y2 = obj2;
                                                                                                                                                        } else {
                                                                                                                                                            JSONArray jSONArray = new JSONArray(stringExtra4);
                                                                                                                                                            C2023c c2023cM1572w = AbstractC0715d.m1572w();
                                                                                                                                                            int length = jSONArray.length();
                                                                                                                                                            int i4 = 0;
                                                                                                                                                            while (i4 < length) {
                                                                                                                                                                Object objOpt = jSONArray.opt(i4);
                                                                                                                                                                if (objOpt instanceof String) {
                                                                                                                                                                    if (AbstractC1206h.m2630D0((String) objOpt)) {
                                                                                                                                                                        objOpt = th2;
                                                                                                                                                                    }
                                                                                                                                                                    String str2 = (String) objOpt;
                                                                                                                                                                    if (str2 != null) {
                                                                                                                                                                        c2023cM1572w.add(new BackupSource(str2, null, null, 6, null));
                                                                                                                                                                    }
                                                                                                                                                                } else {
                                                                                                                                                                    if (objOpt instanceof JSONObject) {
                                                                                                                                                                        String strOptString = ((JSONObject) objOpt).optString("url");
                                                                                                                                                                        AbstractC2980h.m5133b(strOptString);
                                                                                                                                                                        if (!AbstractC1206h.m2630D0(strOptString)) {
                                                                                                                                                                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                                                                                                                                            th = th2;
                                                                                                                                                                            try {
                                                                                                                                                                                JSONObject jSONObjectOptJSONObject = ((JSONObject) objOpt).optJSONObject("headers");
                                                                                                                                                                                if (jSONObjectOptJSONObject != null) {
                                                                                                                                                                                    Iterator<String> itKeys2 = jSONObjectOptJSONObject.keys();
                                                                                                                                                                                    AbstractC2980h.m5135d("keys(...)", itKeys2);
                                                                                                                                                                                    while (itKeys2.hasNext()) {
                                                                                                                                                                                        String next3 = itKeys2.next();
                                                                                                                                                                                        linkedHashMap2.put(next3, jSONObjectOptJSONObject.optString(next3));
                                                                                                                                                                                        itKeys2 = itKeys2;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                String strOptString2 = ((JSONObject) objOpt).optString("name");
                                                                                                                                                                                AbstractC2980h.m5133b(strOptString2);
                                                                                                                                                                                c2023cM1572w.add(new BackupSource(strOptString, linkedHashMap2, !AbstractC1206h.m2630D0(strOptString2) ? strOptString2 : th));
                                                                                                                                                                            } catch (Throwable th4) {
                                                                                                                                                                                th = th4;
                                                                                                                                                                                objM1539y2 = AbstractC0714c.m1539y(th);
                                                                                                                                                                                if (!(objM1539y2 instanceof C1688e)) {
                                                                                                                                                                                }
                                                                                                                                                                                listM3743H0 = (List) obj2;
                                                                                                                                                                                if (stringExtra != null) {
                                                                                                                                                                                    if (listM3743H0 == null) {
                                                                                                                                                                                        it = listM3743H0.iterator();
                                                                                                                                                                                        while (it.hasNext()) {
                                                                                                                                                                                        }
                                                                                                                                                                                        listM3743H0 = AbstractC1913h.m3743H0(AbstractC0715d.m1551T(new BackupSource(stringExtra, c1922q, null, 4, null)), listM3743H0);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                this.f2941L = listM3743H0;
                                                                                                                                                                                String stringExtra5 = getIntent().getStringExtra("exo_tmdb_id");
                                                                                                                                                                                if (stringExtra5 != null) {
                                                                                                                                                                                }
                                                                                                                                                                                this.f2966k0 = !z;
                                                                                                                                                                                c0107b = this.f2937H;
                                                                                                                                                                                if (c0107b != null) {
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    i4++;
                                                                                                                                                                    th2 = th;
                                                                                                                                                                }
                                                                                                                                                                th = th2;
                                                                                                                                                                i4++;
                                                                                                                                                                th2 = th;
                                                                                                                                                            }
                                                                                                                                                            th = th2;
                                                                                                                                                            objM1539y2 = AbstractC0715d.m1563h(c2023cM1572w);
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th5) {
                                                                                                                                                        th = th5;
                                                                                                                                                        th = th2;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                if (!(objM1539y2 instanceof C1688e)) {
                                                                                                                                                    obj2 = objM1539y2;
                                                                                                                                                }
                                                                                                                                                listM3743H0 = (List) obj2;
                                                                                                                                                if (stringExtra != null && !AbstractC1206h.m2630D0(stringExtra)) {
                                                                                                                                                    if (listM3743H0 == null && listM3743H0.isEmpty()) {
                                                                                                                                                        listM3743H0 = AbstractC1913h.m3743H0(AbstractC0715d.m1551T(new BackupSource(stringExtra, c1922q, null, 4, null)), listM3743H0);
                                                                                                                                                    } else {
                                                                                                                                                        it = listM3743H0.iterator();
                                                                                                                                                        while (it.hasNext()) {
                                                                                                                                                            if (AbstractC2980h.m5132a(((BackupSource) it.next()).getUrl(), stringExtra)) {
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        listM3743H0 = AbstractC1913h.m3743H0(AbstractC0715d.m1551T(new BackupSource(stringExtra, c1922q, null, 4, null)), listM3743H0);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                this.f2941L = listM3743H0;
                                                                                                                                                String stringExtra52 = getIntent().getStringExtra("exo_tmdb_id");
                                                                                                                                                boolean z7 = stringExtra52 != null || AbstractC1206h.m2630D0(stringExtra52);
                                                                                                                                                this.f2966k0 = !z7;
                                                                                                                                                c0107b = this.f2937H;
                                                                                                                                                if (c0107b != null) {
                                                                                                                                                    Throwable th6 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th6;
                                                                                                                                                }
                                                                                                                                                c0107b.f543t.setVisibility(!z7 ? 0 : 8);
                                                                                                                                                C0107b c0107b2 = this.f2937H;
                                                                                                                                                if (c0107b2 == null) {
                                                                                                                                                    Throwable th7 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th7;
                                                                                                                                                }
                                                                                                                                                c0107b2.f538o.setText(str);
                                                                                                                                                C0107b c0107b3 = this.f2937H;
                                                                                                                                                if (c0107b3 == null) {
                                                                                                                                                    Throwable th8 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th8;
                                                                                                                                                }
                                                                                                                                                c0107b3.f538o.setVisibility(AbstractC1206h.m2630D0(str) ? 8 : 0);
                                                                                                                                                C0107b c0107b4 = this.f2937H;
                                                                                                                                                if (c0107b4 == null) {
                                                                                                                                                    Throwable th9 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th9;
                                                                                                                                                }
                                                                                                                                                final int i8 = 0;
                                                                                                                                                c0107b4.f537n.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i9 = i8;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i9) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i10 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i11 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i12 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b5 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b5 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b5.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b6 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b6 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b6.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b7 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b7 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b7.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i13 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i14 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b8 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b8 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b8.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b9 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b9 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b9.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b10 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b10 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b10.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b11 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b11 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b11.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b12 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b12 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b12.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b13 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b13 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b13.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b14 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b14 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b14.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b15 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b15 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b15.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                C0107b c0107b5 = this.f2937H;
                                                                                                                                                if (c0107b5 == null) {
                                                                                                                                                    Throwable th10 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th10;
                                                                                                                                                }
                                                                                                                                                final int i9 = 1;
                                                                                                                                                c0107b5.f536m.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i92 = i9;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i92) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i10 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i11 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i12 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b52 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b52 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b52.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b6 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b6 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b6.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b7 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b7 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b7.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i13 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i14 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b8 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b8 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b8.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b9 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b9 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b9.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b10 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b10 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b10.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b11 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b11 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b11.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b12 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b12 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b12.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b13 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b13 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b13.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b14 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b14 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b14.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b15 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b15 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b15.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                C0107b c0107b6 = this.f2937H;
                                                                                                                                                if (c0107b6 == null) {
                                                                                                                                                    Throwable th11 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th11;
                                                                                                                                                }
                                                                                                                                                Iterator it3 = AbstractC1914i.m3753t0(c0107b6.f537n, c0107b6.f536m).iterator();
                                                                                                                                                while (it3.hasNext()) {
                                                                                                                                                    ((TextView) it3.next()).setOnFocusChangeListener(new ViewOnFocusChangeListenerC0593b(2, this));
                                                                                                                                                }
                                                                                                                                                if (stringExtra == null || AbstractC1206h.m2630D0(stringExtra)) {
                                                                                                                                                    String string = getString(R.string.player_no_url);
                                                                                                                                                    AbstractC2980h.m5135d("getString(...)", string);
                                                                                                                                                    m1724R(string);
                                                                                                                                                    return;
                                                                                                                                                }
                                                                                                                                                C0107b c0107b7 = this.f2937H;
                                                                                                                                                if (c0107b7 == null) {
                                                                                                                                                    Throwable th12 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th12;
                                                                                                                                                }
                                                                                                                                                final int i10 = 3;
                                                                                                                                                c0107b7.f525b.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i92 = i10;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i92) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i102 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i11 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i12 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b52 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b52 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b52.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b62 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b62 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b62.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b72 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b72 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b72.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i13 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i14 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b8 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b8 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b8.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b9 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b9 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b9.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b10 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b10 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b10.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b11 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b11 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b11.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b12 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b12 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b12.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b13 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b13 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b13.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b14 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b14 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b14.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b15 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b15 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b15.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                C0107b c0107b8 = this.f2937H;
                                                                                                                                                if (c0107b8 == null) {
                                                                                                                                                    Throwable th13 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th13;
                                                                                                                                                }
                                                                                                                                                final int i11 = 4;
                                                                                                                                                c0107b8.f527d.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i92 = i11;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i92) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i102 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i112 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i12 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b52 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b52 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b52.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b62 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b62 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b62.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b72 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b72 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b72.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i13 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i14 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b82 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b82 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b82.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b9 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b9 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b9.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b10 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b10 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b10.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b11 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b11 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b11.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b12 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b12 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b12.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b13 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b13 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b13.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b14 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b14 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b14.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b15 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b15 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b15.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                C0107b c0107b9 = this.f2937H;
                                                                                                                                                if (c0107b9 == null) {
                                                                                                                                                    Throwable th14 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th14;
                                                                                                                                                }
                                                                                                                                                final int i12 = 5;
                                                                                                                                                c0107b9.f526c.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i92 = i12;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i92) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i102 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i112 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i122 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b52 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b52 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b52.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b62 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b62 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b62.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b72 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b72 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b72.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i13 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i14 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b82 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b82 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b82.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b92 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b92 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b92.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b10 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b10 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b10.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b11 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b11 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b11.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b12 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b12 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b12.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b13 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b13 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b13.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b14 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b14 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b14.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b15 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b15 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b15.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                C0107b c0107b10 = this.f2937H;
                                                                                                                                                if (c0107b10 == null) {
                                                                                                                                                    Throwable th15 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th15;
                                                                                                                                                }
                                                                                                                                                final int i13 = 6;
                                                                                                                                                c0107b10.f529f.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i92 = i13;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i92) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i102 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i112 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i122 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b52 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b52 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b52.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b62 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b62 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b62.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b72 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b72 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b72.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i132 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i14 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b82 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b82 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b82.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b92 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b92 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b92.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b102 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b102 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b102.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b11 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b11 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b11.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b12 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b12 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b12.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b13 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b13 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b13.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b14 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b14 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b14.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b15 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b15 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b15.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                C0107b c0107b11 = this.f2937H;
                                                                                                                                                if (c0107b11 == null) {
                                                                                                                                                    Throwable th16 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th16;
                                                                                                                                                }
                                                                                                                                                final int i14 = 7;
                                                                                                                                                c0107b11.f530g.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i92 = i14;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i92) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i102 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i112 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i122 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b52 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b52 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b52.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b62 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b62 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b62.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b72 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b72 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b72.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i132 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i142 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b82 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b82 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b82.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b92 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b92 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b92.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b102 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b102 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b102.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b112 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b112 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b112.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b12 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b12 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b12.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b13 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b13 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b13.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b14 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b14 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b14.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b15 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b15 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b15.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                C0107b c0107b12 = this.f2937H;
                                                                                                                                                if (c0107b12 == null) {
                                                                                                                                                    Throwable th17 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th17;
                                                                                                                                                }
                                                                                                                                                final int i15 = 8;
                                                                                                                                                c0107b12.f528e.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i92 = i15;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i92) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i102 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i112 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i122 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b52 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b52 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b52.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b62 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b62 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b62.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b72 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b72 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b72.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i132 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i142 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b82 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b82 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b82.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b92 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b92 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b92.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b102 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b102 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b102.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b112 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b112 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b112.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b122 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b122 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b122.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b13 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b13 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b13.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b14 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b14 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b14.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b15 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b15 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b15.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                if (!getResources().getBoolean(R.bool.is_tv_layout)) {
                                                                                                                                                    C0107b c0107b13 = this.f2937H;
                                                                                                                                                    if (c0107b13 == null) {
                                                                                                                                                        Throwable th18 = th;
                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                        throw th18;
                                                                                                                                                    }
                                                                                                                                                    Iterator it4 = AbstractC1914i.m3753t0(c0107b13.f527d, c0107b13.f526c, c0107b13.f529f, c0107b13.f531h, c0107b13.f528e, c0107b13.f525b, c0107b13.f530g).iterator();
                                                                                                                                                    while (it4.hasNext()) {
                                                                                                                                                        ((ImageView) it4.next()).setBackground(getDrawable(R.drawable.bg_player_btn_touch));
                                                                                                                                                    }
                                                                                                                                                    C0107b c0107b14 = this.f2937H;
                                                                                                                                                    if (c0107b14 == null) {
                                                                                                                                                        Throwable th19 = th;
                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                        throw th19;
                                                                                                                                                    }
                                                                                                                                                    c0107b14.f533j.setClickable(true);
                                                                                                                                                    C0107b c0107b15 = this.f2937H;
                                                                                                                                                    if (c0107b15 == null) {
                                                                                                                                                        Throwable th20 = th;
                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                        throw th20;
                                                                                                                                                    }
                                                                                                                                                    c0107b15.f519C.setClickable(true);
                                                                                                                                                    C0107b c0107b16 = this.f2937H;
                                                                                                                                                    if (c0107b16 == null) {
                                                                                                                                                        Throwable th21 = th;
                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                        throw th21;
                                                                                                                                                    }
                                                                                                                                                    c0107b16.f541r.setClickable(true);
                                                                                                                                                    C0107b c0107b17 = this.f2937H;
                                                                                                                                                    if (c0107b17 == null) {
                                                                                                                                                        Throwable th22 = th;
                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                        throw th22;
                                                                                                                                                    }
                                                                                                                                                    c0107b17.f547x.setClickable(true);
                                                                                                                                                }
                                                                                                                                                C0107b c0107b18 = this.f2937H;
                                                                                                                                                if (c0107b18 == null) {
                                                                                                                                                    Throwable th23 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th23;
                                                                                                                                                }
                                                                                                                                                final int i16 = 2;
                                                                                                                                                c0107b18.f531h.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i92 = i16;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i92) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i102 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i112 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i122 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b52 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b52 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b52.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b62 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b62 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b62.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b72 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b72 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b72.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i132 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i142 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b82 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b82 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b82.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b92 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b92 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b92.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b102 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b102 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b102.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b112 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b112 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b112.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b122 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b122 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b122.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b132 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b132 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b132.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b142 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b142 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b142.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b152 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b152 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b152.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                C0107b c0107b19 = this.f2937H;
                                                                                                                                                if (c0107b19 == null) {
                                                                                                                                                    Throwable th24 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th24;
                                                                                                                                                }
                                                                                                                                                c0107b19.f548y.removeAllViews();
                                                                                                                                                LinkedHashMap linkedHashMap3 = this.f2963h0;
                                                                                                                                                linkedHashMap3.clear();
                                                                                                                                                List<C2676m0> list = this.f2962g0;
                                                                                                                                                for (C2676m0 c2676m0 : list) {
                                                                                                                                                    TextView textView9 = new TextView(this);
                                                                                                                                                    textView9.setText(getString(c2676m0.f9723b));
                                                                                                                                                    textView9.setTextSize(14.0f);
                                                                                                                                                    textView9.setTextColor(-1);
                                                                                                                                                    textView9.setGravity(17);
                                                                                                                                                    textView9.setPadding(m1734y(10), m1734y(5), m1734y(10), m1734y(5));
                                                                                                                                                    textView9.setBackground(getDrawable(R.drawable.bg_subs_chip));
                                                                                                                                                    textView9.setFocusable(true);
                                                                                                                                                    textView9.setClickable(true);
                                                                                                                                                    textView9.setOnClickListener(new ViewOnClickListenerC0684p(c2676m0, 7, this));
                                                                                                                                                    C0107b c0107b20 = this.f2937H;
                                                                                                                                                    if (c0107b20 == null) {
                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                    LinearLayout linearLayout9 = c0107b20.f548y;
                                                                                                                                                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                                                                                                                                                    layoutParams.bottomMargin = m1734y(4);
                                                                                                                                                    linearLayout9.addView(textView9, layoutParams);
                                                                                                                                                    linkedHashMap3.put(c2676m0.f9722a, textView9);
                                                                                                                                                }
                                                                                                                                                C0107b c0107b21 = this.f2937H;
                                                                                                                                                if (c0107b21 == null) {
                                                                                                                                                    Throwable th25 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th25;
                                                                                                                                                }
                                                                                                                                                c0107b21.f518B.setFocusable(false);
                                                                                                                                                C0107b c0107b22 = this.f2937H;
                                                                                                                                                if (c0107b22 == null) {
                                                                                                                                                    Throwable th26 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th26;
                                                                                                                                                }
                                                                                                                                                c0107b22.f549z.setFocusable(false);
                                                                                                                                                C0107b c0107b23 = this.f2937H;
                                                                                                                                                if (c0107b23 == null) {
                                                                                                                                                    Throwable th27 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th27;
                                                                                                                                                }
                                                                                                                                                c0107b23.f542s.setKeyProgressIncrement(10000);
                                                                                                                                                C0107b c0107b24 = this.f2937H;
                                                                                                                                                if (c0107b24 == null) {
                                                                                                                                                    Throwable th28 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th28;
                                                                                                                                                }
                                                                                                                                                c0107b24.f542s.setOnSeekBarChangeListener(new C2684q0(this));
                                                                                                                                                C0107b c0107b25 = this.f2937H;
                                                                                                                                                if (c0107b25 == null) {
                                                                                                                                                    Throwable th29 = th;
                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                    throw th29;
                                                                                                                                                }
                                                                                                                                                final int i17 = 9;
                                                                                                                                                c0107b25.f523G.setOnClickListener(new View.OnClickListener(this) { // from class: w4.f0

                                                                                                                                                    /* renamed from: k */
                                                                                                                                                    public final /* synthetic */ PlayerActivity f9685k;

                                                                                                                                                    {
                                                                                                                                                        this.f9685k = this;
                                                                                                                                                    }

                                                                                                                                                    @Override // android.view.View.OnClickListener
                                                                                                                                                    public final void onClick(View view) {
                                                                                                                                                        int i92 = i17;
                                                                                                                                                        PlayerActivity playerActivity = this.f9685k;
                                                                                                                                                        switch (i92) {
                                                                                                                                                            case 0:
                                                                                                                                                                Handler handler = playerActivity.f2939J;
                                                                                                                                                                String stringExtra6 = playerActivity.f2979x0;
                                                                                                                                                                if (stringExtra6 == null && (stringExtra6 = playerActivity.getIntent().getStringExtra("exo_url")) == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                C0651b1 c0651b1 = playerActivity.f2944O;
                                                                                                                                                                c0651b1.f2577d = 0;
                                                                                                                                                                c0651b1.f2575b = false;
                                                                                                                                                                RunnableC2678n0 runnableC2678n0 = playerActivity.f2949T;
                                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                                handler.removeCallbacks(playerActivity.f2952W);
                                                                                                                                                                playerActivity.f2945P = false;
                                                                                                                                                                playerActivity.m1726T(stringExtra6, playerActivity.f2980y0, playerActivity.m1719M());
                                                                                                                                                                return;
                                                                                                                                                            case 1:
                                                                                                                                                                int i102 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 2:
                                                                                                                                                                int i112 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1729W();
                                                                                                                                                                return;
                                                                                                                                                            case 3:
                                                                                                                                                                int i122 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.finish();
                                                                                                                                                                return;
                                                                                                                                                            case 4:
                                                                                                                                                                ExoPlayer exoPlayer = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                boolean playWhenReady = exoPlayer.getPlayWhenReady();
                                                                                                                                                                if (playWhenReady) {
                                                                                                                                                                    exoPlayer.pause();
                                                                                                                                                                    C0107b c0107b52 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b52 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b52.f527d.setImageResource(R.drawable.ic_play);
                                                                                                                                                                } else {
                                                                                                                                                                    exoPlayer.play();
                                                                                                                                                                    C0107b c0107b62 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b62 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b62.f527d.setImageResource(R.drawable.ic_pause);
                                                                                                                                                                    playerActivity.f2944O.f2576c = System.currentTimeMillis();
                                                                                                                                                                }
                                                                                                                                                                playerActivity.f2945P = playWhenReady;
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 5:
                                                                                                                                                                ExoPlayer exoPlayer2 = playerActivity.f2938I;
                                                                                                                                                                if (exoPlayer2 == null) {
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                exoPlayer2.setVolume(exoPlayer2.getVolume() > 0.0f ? 0.0f : 1.0f);
                                                                                                                                                                C0107b c0107b72 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b72 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                c0107b72.f526c.setImageResource(exoPlayer2.getVolume() > 0.0f ? R.drawable.ic_volume_on : R.drawable.ic_volume_off);
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 6:
                                                                                                                                                                boolean z8 = !playerActivity.f2943N;
                                                                                                                                                                playerActivity.f2943N = z8;
                                                                                                                                                                playerActivity.getSharedPreferences("exotv_player", 0).edit().putBoolean("stretch", z8).apply();
                                                                                                                                                                playerActivity.m1731v();
                                                                                                                                                                playerActivity.m1723Q();
                                                                                                                                                                return;
                                                                                                                                                            case 7:
                                                                                                                                                                int i132 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1728V();
                                                                                                                                                                return;
                                                                                                                                                            case 8:
                                                                                                                                                                int i142 = PlayerActivity.f2936z0;
                                                                                                                                                                playerActivity.m1727U();
                                                                                                                                                                return;
                                                                                                                                                            default:
                                                                                                                                                                C0107b c0107b82 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b82 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b82.f519C.getVisibility() != 0) {
                                                                                                                                                                    C0107b c0107b92 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b92 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    if (c0107b92.f533j.getVisibility() != 0) {
                                                                                                                                                                        playerActivity.m1723Q();
                                                                                                                                                                        return;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b102 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b102 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b102.f519C.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b112 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b112 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b112.f519C.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b122 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b122 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b122.f541r.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b132 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b132 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b132.f541r.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                C0107b c0107b142 = playerActivity.f2937H;
                                                                                                                                                                if (c0107b142 == null) {
                                                                                                                                                                    AbstractC2980h.m5139h("b");
                                                                                                                                                                    throw null;
                                                                                                                                                                }
                                                                                                                                                                if (c0107b142.f547x.getVisibility() == 0) {
                                                                                                                                                                    C0107b c0107b152 = playerActivity.f2937H;
                                                                                                                                                                    if (c0107b152 == null) {
                                                                                                                                                                        AbstractC2980h.m5139h("b");
                                                                                                                                                                        throw null;
                                                                                                                                                                    }
                                                                                                                                                                    c0107b152.f547x.setVisibility(8);
                                                                                                                                                                }
                                                                                                                                                                playerActivity.m1710D();
                                                                                                                                                                return;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                });
                                                                                                                                                this.f2943N = getSharedPreferences("exotv_player", 0).getBoolean("stretch", false);
                                                                                                                                                m1731v();
                                                                                                                                                Handler handler = this.f2939J;
                                                                                                                                                RunnableC2678n0 runnableC2678n0 = this.f2949T;
                                                                                                                                                handler.removeCallbacks(runnableC2678n0);
                                                                                                                                                handler.postDelayed(runnableC2678n0, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                                                                                                                                                String stringExtra6 = getIntent().getStringExtra("exo_tmdb_id");
                                                                                                                                                if (stringExtra6 != null && !AbstractC1206h.m2630D0(stringExtra6)) {
                                                                                                                                                    this.f2958c0 = stringExtra6;
                                                                                                                                                    this.f2959d0 = getIntent().getIntExtra("exo_season", -1);
                                                                                                                                                    this.f2960e0 = getIntent().getIntExtra("exo_episode", -1);
                                                                                                                                                    int intExtra = getIntent().getIntExtra("exo_episode_tmdb", -1);
                                                                                                                                                    ?? ValueOf = Integer.valueOf(intExtra);
                                                                                                                                                    if (intExtra <= 0) {
                                                                                                                                                        ValueOf = th;
                                                                                                                                                    }
                                                                                                                                                    int iIntValue = ValueOf != 0 ? ValueOf.intValue() : this.f2960e0;
                                                                                                                                                    this.f2961f0 = iIntValue;
                                                                                                                                                    if (this.f2959d0 < 0) {
                                                                                                                                                        this.f2959d0 = -1;
                                                                                                                                                    }
                                                                                                                                                    if (this.f2960e0 < 0) {
                                                                                                                                                        this.f2960e0 = -1;
                                                                                                                                                    }
                                                                                                                                                    if (iIntValue < 0) {
                                                                                                                                                        this.f2961f0 = -1;
                                                                                                                                                    }
                                                                                                                                                    String stringExtra7 = getIntent().getStringExtra("exo_file_name");
                                                                                                                                                    if (stringExtra7 != null) {
                                                                                                                                                        boolean zM2630D0 = AbstractC1206h.m2630D0(stringExtra7);
                                                                                                                                                        ?? r02 = stringExtra7;
                                                                                                                                                        if (zM2630D0) {
                                                                                                                                                            r02 = th;
                                                                                                                                                        }
                                                                                                                                                        this.f2964i0 = r02;
                                                                                                                                                        String stringExtra8 = getIntent().getStringExtra("exo_imdb_id");
                                                                                                                                                        if (stringExtra8 != null) {
                                                                                                                                                            boolean zM2630D02 = AbstractC1206h.m2630D0(stringExtra8);
                                                                                                                                                            ?? r03 = stringExtra8;
                                                                                                                                                            if (zM2630D02) {
                                                                                                                                                                r03 = th;
                                                                                                                                                            }
                                                                                                                                                            this.f2965j0 = r03;
                                                                                                                                                            C0107b c0107b26 = this.f2937H;
                                                                                                                                                            if (c0107b26 == null) {
                                                                                                                                                                AbstractC2980h.m5139h("b");
                                                                                                                                                                throw null;
                                                                                                                                                            }
                                                                                                                                                            c0107b26.f531h.setVisibility(0);
                                                                                                                                                            m1718L();
                                                                                                                                                            String string2 = getSharedPreferences("exotv_subtitles", 0).getString("language", th);
                                                                                                                                                            if (string2 != null) {
                                                                                                                                                                Iterator it5 = list.iterator();
                                                                                                                                                                while (true) {
                                                                                                                                                                    if (it5.hasNext()) {
                                                                                                                                                                        next = it5.next();
                                                                                                                                                                        if (AbstractC2980h.m5132a(((C2676m0) next).f9722a, string2)) {
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                    } else {
                                                                                                                                                                        next = null;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                C2676m0 c2676m02 = (C2676m0) next;
                                                                                                                                                                String str3 = c2676m02 != null ? c2676m02.f9722a : null;
                                                                                                                                                                if (str3 != null) {
                                                                                                                                                                    m1721O(str3);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                m1726T(stringExtra, c1922q, 0L);
                                                                                                                                                return;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onDestroy() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C1278a0 c1278a0 = this.f2957b0;
        if (c1278a0 != null) {
            AbstractC1339x.m2841b(c1278a0);
        }
        m1714H();
        this.f2939J.removeCallbacksAndMessages(null);
        ExoPlayer exoPlayer = this.f2938I;
        if (exoPlayer != null) {
            exoPlayer.stop();
            exoPlayer.release();
        }
        this.f2938I = null;
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b.f539p.setPlayer(null);
        super.onDestroy();
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f2947R = false;
        ExoPlayer exoPlayer = this.f2938I;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f2947R = true;
        m1711E();
    }

    @Override // p062h.AbstractActivityC1083i, android.app.Activity
    public final void onStart() throws IllegalAccessException, NoSuchFieldException, PackageManager.NameNotFoundException, SecurityException, IllegalArgumentException {
        super.onStart();
        ExoPlayer exoPlayer = this.f2938I;
        if (exoPlayer != null) {
            exoPlayer.play();
            this.f2945P = false;
            C0107b c0107b = this.f2937H;
            if (c0107b == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            c0107b.f527d.setImageResource(R.drawable.ic_pause);
            this.f2944O.f2576c = System.currentTimeMillis();
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z7) {
        super.onWindowFocusChanged(z7);
        if (z7) {
            m1711E();
        }
    }

    /* renamed from: u */
    public final void m1730u() {
        Object next;
        ExoPlayer exoPlayer = this.f2938I;
        if (exoPlayer == null) {
            return;
        }
        C0245u1 c0245u1BuildUpon = exoPlayer.getTrackSelectionParameters().buildUpon();
        AbstractC2980h.m5135d("buildUpon(...)", c0245u1BuildUpon);
        Iterator it = this.f2971p0.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i = ((C2674l0) next).f9717a;
            Integer num = this.f2972q0;
            if (num != null && i == num.intValue()) {
                break;
            }
        }
        C2674l0 c2674l0 = (C2674l0) next;
        Integer numValueOf = c2674l0 != null ? Integer.valueOf(c2674l0.f9718b) : null;
        if (numValueOf == null) {
            c0245u1BuildUpon.clearVideoSizeConstraints();
        } else {
            c0245u1BuildUpon.setMaxVideoSize(Integer.MAX_VALUE, numValueOf.intValue());
            c0245u1BuildUpon.setMinVideoSize(0, numValueOf.intValue());
        }
        exoPlayer.setTrackSelectionParameters(c0245u1BuildUpon.build());
    }

    /* renamed from: v */
    public final void m1731v() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b.f539p.setResizeMode(this.f2943N ? 3 : 0);
        C0107b c0107b2 = this.f2937H;
        if (c0107b2 != null) {
            c0107b2.f529f.setImageResource(this.f2943N ? R.drawable.ic_fullscreen : R.drawable.ic_aspect_ratio);
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* renamed from: w */
    public final void m1732w(String str) {
        List list;
        if (!AbstractC2980h.m5132a(this.f2954Y, str) || (list = (List) this.f2953X.get(str)) == null || list.isEmpty()) {
            return;
        }
        if (AbstractC2980h.m5132a(this.f2955Z, str) && this.f2956a0 == 0 && !this.f2969n0.isEmpty()) {
            return;
        }
        m1712F(0, list, false);
    }

    /* renamed from: x */
    public final void m1733x() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        c0107b.f520D.setText(C2181z.FRAGMENT_ENCODE_SET);
        C0107b c0107b2 = this.f2937H;
        if (c0107b2 != null) {
            c0107b2.f520D.setVisibility(8);
        } else {
            AbstractC2980h.m5139h("b");
            throw null;
        }
    }

    /* renamed from: y */
    public final int m1734y(int i) {
        return (int) (i * getResources().getDisplayMetrics().density);
    }

    /* renamed from: z */
    public final void m1735z() {
        C0107b c0107b = this.f2937H;
        if (c0107b == null) {
            AbstractC2980h.m5139h("b");
            throw null;
        }
        if (c0107b.f541r.getVisibility() != 0) {
            return;
        }
        View childAt = this.f2973r0;
        if (childAt == null) {
            C0107b c0107b2 = this.f2937H;
            if (c0107b2 == null) {
                AbstractC2980h.m5139h("b");
                throw null;
            }
            childAt = c0107b2.f540q.getChildAt(0);
            if (childAt == null) {
                return;
            }
        }
        childAt.post(new RunnableC1848t(childAt, 2));
    }
}
