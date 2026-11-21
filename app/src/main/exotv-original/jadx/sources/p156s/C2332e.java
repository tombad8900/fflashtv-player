package p156s;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Looper;
import android.support.v4.media.session.AbstractC0120b;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.Choreographer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.media3.common.AbstractC0244u0;
import androidx.media3.common.C0228p;
import androidx.media3.common.C0246v;
import androidx.media3.common.C0247v0;
import androidx.media3.common.C0249w;
import com.bumptech.glide.AbstractC0714c;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import org.xmlpull.v1.XmlPullParserException;
import p005a4.C0073c;
import p005a4.C0088j0;
import p023c4.C0644h;
import p037e0.C0851b;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1107d;
import p063h1.AbstractC1118i0;
import p063h1.C1108d0;
import p063h1.C1131v;
import p063h1.C1132w;
import p063h1.InterfaceC1111f;
import p072i2.C1250j;
import p090k2.C1584b;
import p090k2.C1598p;
import p090k2.InterfaceC1599q;
import p105m0.C1835o1;
import p105m0.C1844r1;
import p105m0.InterfaceC1833o;
import p115n1.AbstractC1965b;
import p115n1.InterfaceC1979i;
import p115n1.InterfaceC1980i0;
import p115n1.InterfaceC1989p;
import p123o2.C2042a;
import p130p.AbstractC2190i;
import p130p.C2189h;
import p130p.C2192k;
import p159s2.AbstractC2348h;
import p159s2.AbstractC2349i;
import p159s2.C2341a;
import p159s2.C2342b;
import p159s2.C2343c;
import p168t2.C2405d0;
import p168t2.C2407e0;
import p168t2.C2411g0;
import p168t2.InterfaceC2403c0;
import p183v0.C2522v;
import p183v0.C2523w;
import p183v0.C2525y;
import p183v0.InterfaceC2515o;
import p199x.C2715b;
import p199x.C2722i;
import p199x.C2727n;
import p200x0.C2733a;
import p200x0.C2741i;
import p216z2.AbstractC2920v0;
import p216z2.C2880c1;
import p216z2.C2882d0;
import p216z2.C2886e1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: s.e */
/* loaded from: classes.dex */
public final class C2332e implements InterfaceC1599q, InterfaceC1833o, InterfaceC1979i, InterfaceC2403c0, InterfaceC2515o {

    /* renamed from: j */
    public final /* synthetic */ int f8169j;

    /* renamed from: k */
    public Object f8170k;

    /* renamed from: l */
    public Object f8171l;

    public /* synthetic */ C2332e(int i, boolean z7) {
        this.f8169j = i;
    }

    /* renamed from: q */
    public static int m4145q(int i, int i4) {
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < i; i10++) {
            i8++;
            if (i8 == i4) {
                i9++;
                i8 = 0;
            } else if (i8 > i4) {
                i9++;
                i8 = 1;
            }
        }
        return i8 + 1 > i4 ? i9 + 1 : i9;
    }

    @Override // p168t2.InterfaceC2403c0
    /* renamed from: a */
    public void mo279a(C1132w c1132w) {
        C2407e0 c2407e0 = (C2407e0) this.f8171l;
        SparseArray sparseArray = c2407e0.f8531h;
        C1131v c1131v = (C1131v) this.f8170k;
        if (c1132w.m2535u() == 0 && (c1132w.m2535u() & 128) != 0) {
            c1132w.m2514H(6);
            int iM2515a = c1132w.m2515a() / 4;
            for (int i = 0; i < iM2515a; i++) {
                c1132w.m2519e((byte[]) c1131v.f4792b, 0, 4);
                c1131v.m2502s(0);
                int iM2494k = c1131v.m2494k(16);
                c1131v.m2505v(3);
                if (iM2494k == 0) {
                    c1131v.m2505v(13);
                } else {
                    int iM2494k2 = c1131v.m2494k(13);
                    if (sparseArray.get(iM2494k2) == null) {
                        sparseArray.put(iM2494k2, new C2405d0(new C1250j(c2407e0, iM2494k2)));
                        c2407e0.f8537n++;
                    }
                }
            }
            if (c2407e0.f8524a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    @Override // p168t2.InterfaceC2403c0
    /* renamed from: b */
    public void mo280b(C1108d0 c1108d0, InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:39:0x00e7
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:195)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:62)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:101)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:124)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:66)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:48)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @Override // p115n1.InterfaceC1979i
    /* renamed from: c */
    public p115n1.C1977h mo348c(p115n1.InterfaceC1988o r17, long r18) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p156s.C2332e.mo348c(n1.o, long):n1.h");
    }

    @Override // p183v0.InterfaceC2515o
    /* renamed from: e */
    public Object mo3798e() {
        return (C2525y) this.f8170k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:204:0x03a9, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0368 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ae  */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // p090k2.InterfaceC1599q
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo75f(byte[] bArr, int i, int i4, C1598p c1598p, InterfaceC1111f interfaceC1111f) {
        C2343c c2343cM4181d;
        String strTrim;
        ?? r1;
        String string;
        int i8;
        char c8;
        C2332e c2332e = this;
        C1132w c1132w = (C1132w) c2332e.f8170k;
        c1132w.m2511E(bArr, i + i4);
        c1132w.m2513G(i);
        ArrayList arrayList = new ArrayList();
        try {
            AbstractC2349i.m4188d(c1132w);
            while (!TextUtils.isEmpty(c1132w.m2522h(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z7 = false;
                int i9 = -1;
                int i10 = 0;
                char c9 = '\uffff';
                while (true) {
                    ?? r9 = 1;
                    if (c9 == '\uffff') {
                        i10 = c1132w.f4800b;
                        String strM2522h = c1132w.m2522h(StandardCharsets.UTF_8);
                        c9 = strM2522h == null ? (char) 0 : "STYLE".equals(strM2522h) ? (char) 2 : strM2522h.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        c1132w.m2513G(i10);
                        if (c9 == 0) {
                            AbstractC0120b.m404O(new C0073c(arrayList2), c1598p, interfaceC1111f);
                            return;
                        }
                        if (c9 == 1) {
                            while (!TextUtils.isEmpty(c1132w.m2522h(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str = null;
                            if (c9 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                c1132w.m2522h(StandardCharsets.UTF_8);
                                C2341a c2341a = (C2341a) c2332e.f8171l;
                                C1132w c1132w2 = c2341a.f8213a;
                                StringBuilder sb = c2341a.f8214b;
                                sb.setLength(0);
                                int i11 = c1132w.f4800b;
                                while (!TextUtils.isEmpty(c1132w.m2522h(StandardCharsets.UTF_8))) {
                                }
                                c1132w2.m2511E(c1132w.f4799a, c1132w.f4800b);
                                c1132w2.m2513G(i11);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    C2341a.m4175c(c1132w2);
                                    if (c1132w2.m2515a() >= 5 && "::cue".equals(c1132w2.m2533s(5, StandardCharsets.UTF_8))) {
                                        int i12 = c1132w2.f4800b;
                                        String strM4174b = C2341a.m4174b(c1132w2, sb);
                                        if (strM4174b != null) {
                                            if ("{".equals(strM4174b)) {
                                                c1132w2.m2513G(i12);
                                                strTrim = C2181z.FRAGMENT_ENCODE_SET;
                                            } else {
                                                if ("(".equals(strM4174b)) {
                                                    int i13 = c1132w2.f4800b;
                                                    int i14 = c1132w2.f4801c;
                                                    boolean z8 = z7 ? 1 : 0;
                                                    while (i13 < i14 && z8 == 0) {
                                                        int i15 = i13 + 1;
                                                        z8 = ((char) c1132w2.f4799a[i13]) == ')' ? r9 : z7 ? 1 : 0;
                                                        i13 = i15;
                                                    }
                                                    strTrim = c1132w2.m2533s((i13 - 1) - c1132w2.f4800b, StandardCharsets.UTF_8).trim();
                                                } else {
                                                    strTrim = str;
                                                }
                                                if (!")".equals(C2341a.m4174b(c1132w2, sb))) {
                                                    strTrim = str;
                                                }
                                            }
                                            if (strTrim != null && "{".equals(C2341a.m4174b(c1132w2, sb))) {
                                                C2342b c2342b = new C2342b();
                                                c2342b.f8215a = C2181z.FRAGMENT_ENCODE_SET;
                                                c2342b.f8216b = C2181z.FRAGMENT_ENCODE_SET;
                                                c2342b.f8217c = Collections.EMPTY_SET;
                                                c2342b.f8218d = C2181z.FRAGMENT_ENCODE_SET;
                                                c2342b.f8219e = str;
                                                c2342b.f8221g = z7;
                                                c2342b.f8223i = z7;
                                                c2342b.f8224j = i9;
                                                c2342b.f8225k = i9;
                                                c2342b.f8226l = i9;
                                                c2342b.f8227m = i9;
                                                c2342b.f8228n = i9;
                                                c2342b.f8230p = i9;
                                                c2342b.f8231q = z7;
                                                if (!C2181z.FRAGMENT_ENCODE_SET.equals(strTrim)) {
                                                    int iIndexOf = strTrim.indexOf(91);
                                                    if (iIndexOf != i9) {
                                                        ?? Matcher = C2341a.f8211c.matcher(strTrim.substring(iIndexOf));
                                                        if (Matcher.matches()) {
                                                            String strGroup = Matcher.group(r9);
                                                            strGroup.getClass();
                                                            c2342b.f8218d = strGroup;
                                                        }
                                                        strTrim = strTrim.substring(z7 ? 1 : 0, iIndexOf);
                                                    }
                                                    int i16 = AbstractC1118i0.f4750a;
                                                    String[] strArrSplit = strTrim.split("\\.", i9);
                                                    String str2 = strArrSplit[z7 ? 1 : 0];
                                                    int iIndexOf2 = str2.indexOf(35);
                                                    if (iIndexOf2 != i9) {
                                                        c2342b.f8216b = str2.substring(z7 ? 1 : 0, iIndexOf2);
                                                        c2342b.f8215a = str2.substring(iIndexOf2 + 1);
                                                    } else {
                                                        c2342b.f8216b = str2;
                                                    }
                                                    if (strArrSplit.length > r9) {
                                                        int length = strArrSplit.length;
                                                        AbstractC1101a.m2353d(length <= strArrSplit.length ? r9 : z7 ? 1 : 0);
                                                        c2342b.f8217c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(strArrSplit, (int) r9, length)));
                                                    }
                                                }
                                                boolean z9 = z7 ? 1 : 0;
                                                String strM4174b2 = null;
                                                boolean z10 = r9;
                                                while (z9 == 0) {
                                                    int i17 = c1132w2.f4800b;
                                                    strM4174b2 = C2341a.m4174b(c1132w2, sb);
                                                    boolean z11 = (strM4174b2 == null || "}".equals(strM4174b2)) ? z10 : z7;
                                                    if (z11 == 0) {
                                                        c1132w2.m2513G(i17);
                                                        C2341a.m4175c(c1132w2);
                                                        String strM4173a = C2341a.m4173a(c1132w2, sb);
                                                        if (!C2181z.FRAGMENT_ENCODE_SET.equals(strM4173a) && ":".equals(C2341a.m4174b(c1132w2, sb))) {
                                                            C2341a.m4175c(c1132w2);
                                                            StringBuilder sb2 = new StringBuilder();
                                                            boolean z12 = false;
                                                            while (true) {
                                                                if (z12) {
                                                                    string = sb2.toString();
                                                                } else {
                                                                    int i18 = c1132w2.f4800b;
                                                                    boolean z13 = z12;
                                                                    String strM4174b3 = C2341a.m4174b(c1132w2, sb);
                                                                    if (strM4174b3 == null) {
                                                                        string = null;
                                                                    } else if ("}".equals(strM4174b3) || ";".equals(strM4174b3)) {
                                                                        c1132w2.m2513G(i18);
                                                                        z12 = true;
                                                                    } else {
                                                                        sb2.append(strM4174b3);
                                                                        z12 = z13;
                                                                    }
                                                                }
                                                            }
                                                            if (string == null || C2181z.FRAGMENT_ENCODE_SET.equals(string)) {
                                                                r1 = 1;
                                                            } else {
                                                                int i19 = c1132w2.f4800b;
                                                                String strM4174b4 = C2341a.m4174b(c1132w2, sb);
                                                                if (";".equals(strM4174b4)) {
                                                                    if ("color".equals(strM4173a)) {
                                                                    }
                                                                    r1 = i8;
                                                                } else {
                                                                    if ("}".equals(strM4174b4)) {
                                                                        c1132w2.m2513G(i19);
                                                                        if ("color".equals(strM4173a)) {
                                                                            i8 = 1;
                                                                            if ("background-color".equals(strM4173a)) {
                                                                                c2342b.f8222h = AbstractC1107d.m2395a(string, true);
                                                                                c2342b.f8223i = true;
                                                                            } else if ("ruby-position".equals(strM4173a)) {
                                                                                if ("over".equals(string)) {
                                                                                    c2342b.f8230p = 1;
                                                                                } else if ("under".equals(string)) {
                                                                                    c2342b.f8230p = 2;
                                                                                    r1 = 1;
                                                                                }
                                                                            } else if ("text-combine-upright".equals(strM4173a)) {
                                                                                c2342b.f8231q = "all".equals(string) || string.startsWith("digits");
                                                                            } else if ("text-decoration".equals(strM4173a)) {
                                                                                if ("underline".equals(string)) {
                                                                                    i8 = 1;
                                                                                    c2342b.f8225k = 1;
                                                                                }
                                                                            } else if ("font-family".equals(strM4173a)) {
                                                                                c2342b.f8219e = AbstractC0714c.m1517e0(string);
                                                                            } else if (!"font-weight".equals(strM4173a)) {
                                                                                i8 = 1;
                                                                                if ("font-style".equals(strM4173a)) {
                                                                                    if ("italic".equals(string)) {
                                                                                        c2342b.f8227m = 1;
                                                                                    }
                                                                                } else if ("font-size".equals(strM4173a)) {
                                                                                    ?? Matcher2 = C2341a.f8212d.matcher(AbstractC0714c.m1517e0(string));
                                                                                    if (Matcher2.matches()) {
                                                                                        String strGroup2 = Matcher2.group(2);
                                                                                        strGroup2.getClass();
                                                                                        switch (strGroup2.hashCode()) {
                                                                                            case 37:
                                                                                                if (strGroup2.equals("%")) {
                                                                                                    c8 = 0;
                                                                                                }
                                                                                                switch (c8) {
                                                                                                    case 0:
                                                                                                        r1 = 1;
                                                                                                        c2342b.f8228n = 3;
                                                                                                        break;
                                                                                                    case 1:
                                                                                                        r1 = 1;
                                                                                                        c2342b.f8228n = 2;
                                                                                                        break;
                                                                                                    case 2:
                                                                                                        r1 = 1;
                                                                                                        c2342b.f8228n = 1;
                                                                                                        break;
                                                                                                    default:
                                                                                                        throw new IllegalStateException();
                                                                                                }
                                                                                                String strGroup3 = Matcher2.group(r1);
                                                                                                strGroup3.getClass();
                                                                                                c2342b.f8229o = Float.parseFloat(strGroup3);
                                                                                                break;
                                                                                            case 3240:
                                                                                                if (strGroup2.equals("em")) {
                                                                                                    c8 = 1;
                                                                                                }
                                                                                                switch (c8) {
                                                                                                }
                                                                                                String strGroup32 = Matcher2.group(r1);
                                                                                                strGroup32.getClass();
                                                                                                c2342b.f8229o = Float.parseFloat(strGroup32);
                                                                                                break;
                                                                                            case 3592:
                                                                                                if (strGroup2.equals("px")) {
                                                                                                    c8 = 2;
                                                                                                }
                                                                                                switch (c8) {
                                                                                                }
                                                                                                String strGroup322 = Matcher2.group(r1);
                                                                                                strGroup322.getClass();
                                                                                                c2342b.f8229o = Float.parseFloat(strGroup322);
                                                                                                break;
                                                                                        }
                                                                                        c8 = '\uffff';
                                                                                        switch (c8) {
                                                                                        }
                                                                                        String strGroup3222 = Matcher2.group(r1);
                                                                                        strGroup3222.getClass();
                                                                                        c2342b.f8229o = Float.parseFloat(strGroup3222);
                                                                                    } else {
                                                                                        AbstractC1101a.m2348F("WebvttCssParser", "Invalid font-size: '" + string + "'.");
                                                                                    }
                                                                                }
                                                                            } else if ("bold".equals(string)) {
                                                                                i8 = 1;
                                                                                c2342b.f8226l = 1;
                                                                            }
                                                                        } else {
                                                                            i8 = 1;
                                                                            c2342b.f8220f = AbstractC1107d.m2395a(string, true);
                                                                            c2342b.f8221g = true;
                                                                        }
                                                                        r1 = i8;
                                                                    }
                                                                    r1 = 1;
                                                                }
                                                            }
                                                        } else {
                                                            r1 = z10;
                                                        }
                                                    }
                                                    z10 = r1;
                                                    z9 = z11;
                                                    z7 = false;
                                                }
                                                boolean z14 = z10;
                                                if ("}".equals(strM4174b2)) {
                                                    arrayList3.add(c2342b);
                                                }
                                                r9 = z14;
                                                z7 = false;
                                                i9 = -1;
                                                str = null;
                                            }
                                        }
                                    }
                                }
                            } else if (c9 == 3) {
                                Pattern pattern = AbstractC2348h.f8255a;
                                Charset charset = StandardCharsets.UTF_8;
                                String strM2522h2 = c1132w.m2522h(charset);
                                if (strM2522h2 == null) {
                                    c2343cM4181d = null;
                                } else {
                                    Pattern pattern2 = AbstractC2348h.f8255a;
                                    Matcher matcher = pattern2.matcher(strM2522h2);
                                    if (matcher.matches()) {
                                        c2343cM4181d = AbstractC2348h.m4181d(null, matcher, c1132w, arrayList);
                                    } else {
                                        c2343cM4181d = null;
                                        String strM2522h3 = c1132w.m2522h(charset);
                                        if (strM2522h3 != null) {
                                            Matcher matcher2 = pattern2.matcher(strM2522h3);
                                            if (matcher2.matches()) {
                                                c2343cM4181d = AbstractC2348h.m4181d(strM2522h2.trim(), matcher2, c1132w, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (c2343cM4181d != null) {
                                    arrayList2.add(c2343cM4181d);
                                }
                            }
                            c2332e = this;
                        }
                    }
                }
            }
        } catch (C0247v0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // p183v0.InterfaceC2515o
    /* renamed from: g */
    public boolean mo3799g(CharSequence charSequence, int i, int i4, C2522v c2522v) {
        if ((c2522v.f9179c & 4) > 0) {
            return true;
        }
        if (((C2525y) this.f8170k) == null) {
            this.f8170k = new C2525y(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((C1584b) this.f8171l).getClass();
        ((C2525y) this.f8170k).setSpan(new C2523w(c2522v), i, i4, 33);
        return true;
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: h */
    public int mo77h() {
        return 1;
    }

    @Override // p115n1.InterfaceC1979i
    /* renamed from: i */
    public void mo352i() {
        C1132w c1132w = (C1132w) this.f8171l;
        byte[] bArr = AbstractC1118i0.f4755f;
        c1132w.getClass();
        c1132w.m2511E(bArr, bArr.length);
    }

    /* renamed from: j */
    public void m4146j(AbstractC2920v0 abstractC2920v0, C0228p c0228p) {
        C2192k c2192k = (C2192k) this.f8170k;
        C2886e1 c2886e1M4981a = (C2886e1) c2192k.get(abstractC2920v0);
        if (c2886e1M4981a == null) {
            c2886e1M4981a = C2886e1.m4981a();
            c2192k.put(abstractC2920v0, c2886e1M4981a);
        }
        c2886e1M4981a.f10662c = c0228p;
        c2886e1M4981a.f10660a |= 8;
    }

    /* renamed from: k */
    public void m4147k() {
        int[] iArr = (int[]) this.f8170k;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.f8171l = null;
    }

    /* renamed from: l */
    public void m4148l(long j, C1132w c1132w) {
        if (c1132w.m2515a() < 9) {
            return;
        }
        int iM2521g = c1132w.m2521g();
        int iM2521g2 = c1132w.m2521g();
        int iM2535u = c1132w.m2535u();
        if (iM2521g == 434 && iM2521g2 == 1195456820 && iM2535u == 3) {
            AbstractC1965b.m3830f(j, c1132w, (InterfaceC1980i0[]) this.f8171l);
        }
    }

    /* renamed from: m */
    public void m4149m(InterfaceC1989p interfaceC1989p, C2411g0 c2411g0) {
        InterfaceC1980i0[] interfaceC1980i0Arr = (InterfaceC1980i0[]) this.f8171l;
        for (int i = 0; i < interfaceC1980i0Arr.length; i++) {
            c2411g0.m4255a();
            c2411g0.m4256b();
            InterfaceC1980i0 interfaceC1980i0Track = interfaceC1989p.track(c2411g0.f8572d, 3);
            C0249w c0249w = (C0249w) ((List) this.f8170k).get(i);
            String str = c0249w.f1522n;
            AbstractC1101a.m2352c("Invalid closed caption MIME type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            C0246v c0246v = new C0246v();
            c2411g0.m4256b();
            c0246v.f1435a = c2411g0.f8573e;
            c0246v.f1447m = AbstractC0244u0.m687p(str);
            c0246v.f1439e = c0249w.f1513e;
            c0246v.f1438d = c0249w.f1512d;
            c0246v.f1430G = c0249w.f1503H;
            c0246v.f1450p = c0249w.f1525q;
            interfaceC1980i0Track.format(new C0249w(c0246v));
            interfaceC1980i0Arr[i] = interfaceC1980i0Track;
        }
    }

    /* renamed from: n */
    public void m4150n(int i) {
        int[] iArr = (int[]) this.f8170k;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.f8170k = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.f8170k = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.f8170k;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    /* renamed from: o */
    public View m4151o(int i, int i4, int i8, int i9) {
        View viewM5008u;
        C2042a c2042a = (C2042a) this.f8171l;
        C2882d0 c2882d0 = (C2882d0) this.f8170k;
        int iM4980d = c2882d0.m4980d();
        int iM4979c = c2882d0.m4979c();
        int i10 = i4 > i ? 1 : -1;
        View view = null;
        while (i != i4) {
            switch (c2882d0.f10638a) {
                case 0:
                    viewM5008u = c2882d0.f10639b.m5008u(i);
                    break;
                default:
                    viewM5008u = c2882d0.f10639b.m5008u(i);
                    break;
            }
            int iM4978b = c2882d0.m4978b(viewM5008u);
            int iM4977a = c2882d0.m4977a(viewM5008u);
            c2042a.f7528b = iM4980d;
            c2042a.f7529c = iM4979c;
            c2042a.f7530d = iM4978b;
            c2042a.f7531e = iM4977a;
            if (i8 != 0) {
                c2042a.f7527a = i8;
                if (c2042a.m3932a()) {
                    return viewM5008u;
                }
            }
            if (i9 != 0) {
                c2042a.f7527a = i9;
                if (c2042a.m3932a()) {
                    view = viewM5008u;
                }
            }
            i += i10;
        }
        return view;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0097  */
    @Override // p105m0.InterfaceC1833o
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1844r1 mo649p(View view, C1844r1 c1844r1) {
        boolean z7;
        boolean z8;
        C0088j0 c0088j0 = (C0088j0) this.f8170k;
        C0644h c0644h = (C0644h) this.f8171l;
        int i = c0644h.f2541a;
        int i4 = c0644h.f2542b;
        int i8 = c0644h.f2543c;
        C1835o1 c1835o1 = c1844r1.f6934a;
        C0851b c0851bMo3563f = c1835o1.mo3563f(519);
        C0851b c0851bMo3563f2 = c1835o1.mo3563f(32);
        BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0088j0.f388b;
        int i9 = c0851bMo3563f.f3770b;
        int i10 = c0851bMo3563f.f3771c;
        int i11 = c0851bMo3563f.f3769a;
        bottomSheetBehavior.f3151x = i9;
        boolean z9 = view.getLayoutDirection() == 1;
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        boolean z10 = bottomSheetBehavior.f3143p;
        if (z10) {
            int iM3622a = c1844r1.m3622a();
            bottomSheetBehavior.f3150w = iM3622a;
            paddingBottom = iM3622a + i8;
        }
        if (bottomSheetBehavior.f3144q) {
            paddingLeft = (z9 ? i4 : i) + i11;
        }
        int i12 = paddingLeft;
        if (bottomSheetBehavior.f3145r) {
            if (!z9) {
                i = i4;
            }
            paddingRight = i + i10;
        }
        int i13 = paddingRight;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (!bottomSheetBehavior.f3147t || marginLayoutParams.leftMargin == i11) {
            z7 = false;
        } else {
            marginLayoutParams.leftMargin = i11;
            z7 = true;
        }
        if (bottomSheetBehavior.f3148u && marginLayoutParams.rightMargin != i10) {
            marginLayoutParams.rightMargin = i10;
            z7 = true;
        }
        if (bottomSheetBehavior.f3149v) {
            int i14 = marginLayoutParams.topMargin;
            int i15 = c0851bMo3563f.f3770b;
            if (i14 != i15) {
                marginLayoutParams.topMargin = i15;
                z8 = true;
            } else {
                z8 = z7;
            }
        }
        if (z8) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(i12, view.getPaddingTop(), i13, paddingBottom);
        boolean z11 = c0088j0.f387a;
        if (z11) {
            bottomSheetBehavior.f3141n = c0851bMo3563f2.f3772d;
        }
        if (!z10 && !z11) {
            return c1844r1;
        }
        bottomSheetBehavior.m1789L();
        return c1844r1;
    }

    /* renamed from: r */
    public void m4152r() {
        ((SparseIntArray) this.f8170k).clear();
    }

    /* renamed from: s */
    public boolean m4153s(View view) {
        C2042a c2042a = (C2042a) this.f8171l;
        C2882d0 c2882d0 = (C2882d0) this.f8170k;
        int iM4980d = c2882d0.m4980d();
        int iM4979c = c2882d0.m4979c();
        int iM4978b = c2882d0.m4978b(view);
        int iM4977a = c2882d0.m4977a(view);
        c2042a.f7528b = iM4980d;
        c2042a.f7529c = iM4979c;
        c2042a.f7530d = iM4978b;
        c2042a.f7531e = iM4977a;
        c2042a.f7527a = 24579;
        return c2042a.m3932a();
    }

    /* renamed from: t */
    public void m4154t(int i, int i4) {
        int[] iArr = (int[]) this.f8170k;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i8 = i + i4;
        m4150n(i8);
        int[] iArr2 = (int[]) this.f8170k;
        System.arraycopy(iArr2, i, iArr2, i8, (iArr2.length - i) - i4);
        Arrays.fill((int[]) this.f8170k, i, i8, -1);
        ArrayList arrayList = (ArrayList) this.f8171l;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2880c1 c2880c1 = (C2880c1) ((ArrayList) this.f8171l).get(size);
            int i9 = c2880c1.f10628j;
            if (i9 >= i) {
                c2880c1.f10628j = i9 + i4;
            }
        }
    }

    public String toString() {
        switch (this.f8169j) {
            case 0:
                String str = "[ ";
                if (((C2335h) this.f8170k) != null) {
                    for (int i = 0; i < 9; i++) {
                        str = str + ((C2335h) this.f8170k).f8183q[i] + " ";
                    }
                }
                return str + "] " + ((C2335h) this.f8170k);
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m4155u(int i, int i4) {
        int[] iArr = (int[]) this.f8170k;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i8 = i + i4;
        m4150n(i8);
        int[] iArr2 = (int[]) this.f8170k;
        System.arraycopy(iArr2, i8, iArr2, i, (iArr2.length - i) - i4);
        int[] iArr3 = (int[]) this.f8170k;
        Arrays.fill(iArr3, iArr3.length - i4, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.f8171l;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2880c1 c2880c1 = (C2880c1) ((ArrayList) this.f8171l).get(size);
            int i9 = c2880c1.f10628j;
            if (i9 >= i) {
                if (i9 < i8) {
                    ((ArrayList) this.f8171l).remove(size);
                } else {
                    c2880c1.f10628j = i9 - i4;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x0209, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0110 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0109 A[Catch: IOException -> 0x0091, XmlPullParserException -> 0x0094, TryCatch #2 {IOException -> 0x0091, XmlPullParserException -> 0x0094, blocks: (B:20:0x0062, B:97:0x0209, B:28:0x0074, B:29:0x0082, B:31:0x0087, B:38:0x0097, B:46:0x00b1, B:41:0x00a0, B:44:0x00a9, B:47:0x00bf, B:51:0x00ce, B:53:0x00d6, B:54:0x00e0, B:63:0x0109, B:64:0x0110, B:65:0x0128, B:57:0x00e9, B:59:0x00f1, B:60:0x00ff, B:66:0x0129, B:68:0x0131, B:69:0x013f, B:72:0x0149, B:73:0x0154, B:74:0x016c, B:75:0x016d, B:78:0x0177, B:79:0x0182, B:80:0x019a, B:81:0x019b, B:83:0x01a3, B:84:0x01ac, B:87:0x01b6, B:88:0x01c0, B:89:0x01d8, B:90:0x01d9, B:93:0x01e3, B:94:0x01ed, B:95:0x0205, B:96:0x0206), top: B:105:0x0062 }] */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m4156v(Context context, XmlResourceParser xmlResourceParser) {
        int eventType;
        C2722i c2722iM4797d;
        C2727n c2727n = new C2727n();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                try {
                    eventType = xmlResourceParser.getEventType();
                    c2722iM4797d = null;
                } catch (IOException e) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e);
                } catch (XmlPullParserException e8) {
                    Log.e("ConstraintSet", "Error parsing XML resource", e8);
                }
                while (eventType != 1) {
                    if (eventType == 0) {
                        xmlResourceParser.getName();
                    } else if (eventType == 2) {
                        String name = xmlResourceParser.getName();
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    if (c2722iM4797d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2722iM4797d.f9983d.m4792a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    if (c2722iM4797d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2722iM4797d.f9982c.m4793a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c2722iM4797d = C2727n.m4797d(context, Xml.asAttributeSet(xmlResourceParser), true);
                                    break;
                                } else {
                                    break;
                                }
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    if (c2722iM4797d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2722iM4797d.f9981b.m4794a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    if (c2722iM4797d == null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    c2722iM4797d.f9984e.m4795a(context, Xml.asAttributeSet(xmlResourceParser));
                                    break;
                                } else {
                                    continue;
                                }
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2722iM4797d = C2727n.m4797d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c2722iM4797d.f9983d.f10013a = true;
                                    break;
                                } else {
                                    break;
                                }
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    if (c2722iM4797d != null) {
                                        throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                    }
                                    C2715b.m4774a(context, xmlResourceParser, c2722iM4797d.f9985f);
                                    break;
                                } else {
                                    continue;
                                }
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2722iM4797d = C2727n.m4797d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    c2722iM4797d.f9983d.f10028h0 = 1;
                                    break;
                                } else {
                                    break;
                                }
                            case 1791837707:
                                if (!name.equals("CustomAttribute")) {
                                    continue;
                                } else if (c2722iM4797d != null) {
                                }
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2722iM4797d = C2727n.m4797d(context, Xml.asAttributeSet(xmlResourceParser), false);
                                    break;
                                } else {
                                    break;
                                }
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    c2727n.f10087c.put(Integer.valueOf(c2722iM4797d.f9980a), c2722iM4797d);
                                    c2722iM4797d = null;
                                    break;
                                } else {
                                    break;
                                }
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    c2727n.f10087c.put(Integer.valueOf(c2722iM4797d.f9980a), c2722iM4797d);
                                    c2722iM4797d = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    c2727n.f10087c.put(Integer.valueOf(c2722iM4797d.f9980a), c2722iM4797d);
                                    c2722iM4797d = null;
                                    break;
                                } else {
                                    break;
                                }
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    ((SparseArray) this.f8171l).put(identifier, c2727n);
                                    return;
                                }
                                break;
                        }
                    }
                    eventType = xmlResourceParser.next();
                }
                ((SparseArray) this.f8171l).put(identifier, c2727n);
                return;
            }
        }
    }

    /* renamed from: w */
    public C0228p m4157w(AbstractC2920v0 abstractC2920v0, int i) {
        C2886e1 c2886e1;
        C0228p c0228p;
        C2192k c2192k = (C2192k) this.f8170k;
        int iM3990d = c2192k.m3990d(abstractC2920v0);
        if (iM3990d >= 0 && (c2886e1 = (C2886e1) c2192k.m3996j(iM3990d)) != null) {
            int i4 = c2886e1.f10660a;
            if ((i4 & i) != 0) {
                int i8 = i4 & (~i);
                c2886e1.f10660a = i8;
                if (i == 4) {
                    c0228p = c2886e1.f10661b;
                } else {
                    if (i != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    c0228p = c2886e1.f10662c;
                }
                if ((i8 & 12) == 0) {
                    c2192k.mo3994h(iM3990d);
                    c2886e1.f10660a = 0;
                    c2886e1.f10661b = null;
                    c2886e1.f10662c = null;
                    C2886e1.f10659d.mo285g(c2886e1);
                }
                return c0228p;
            }
        }
        return null;
    }

    /* renamed from: x */
    public void m4158x(AbstractC2920v0 abstractC2920v0) {
        C2886e1 c2886e1 = (C2886e1) ((C2192k) this.f8170k).get(abstractC2920v0);
        if (c2886e1 == null) {
            return;
        }
        c2886e1.f10660a &= -2;
    }

    /* renamed from: y */
    public void m4159y(AbstractC2920v0 abstractC2920v0) {
        C2189h c2189h = (C2189h) this.f8171l;
        int iM3969e = c2189h.m3969e() - 1;
        while (true) {
            if (iM3969e < 0) {
                break;
            }
            if (abstractC2920v0 == c2189h.m3970f(iM3969e)) {
                Object[] objArr = c2189h.f7643l;
                Object obj = objArr[iM3969e];
                Object obj2 = AbstractC2190i.f7645a;
                if (obj != obj2) {
                    objArr[iM3969e] = obj2;
                    c2189h.f7641j = true;
                }
            } else {
                iM3969e--;
            }
        }
        C2886e1 c2886e1 = (C2886e1) ((C2192k) this.f8170k).remove(abstractC2920v0);
        if (c2886e1 != null) {
            c2886e1.f10660a = 0;
            c2886e1.f10661b = null;
            c2886e1.f10662c = null;
            C2886e1.f10659d.mo285g(c2886e1);
        }
    }

    public /* synthetic */ C2332e(Object obj, int i, Object obj2) {
        this.f8169j = i;
        this.f8170k = obj;
        this.f8171l = obj2;
    }

    public C2332e(List list) {
        this.f8169j = 5;
        this.f8170k = list;
        this.f8171l = new InterfaceC1980i0[list.size()];
    }

    public C2332e(C2333f c2333f) {
        this.f8169j = 0;
        this.f8171l = c2333f;
    }

    public C2332e(int i) {
        this.f8169j = i;
        switch (i) {
            case 6:
                this.f8170k = Choreographer.getInstance();
                this.f8171l = Looper.myLooper();
                break;
            case 10:
                this.f8170k = new SparseIntArray();
                this.f8171l = new SparseIntArray();
                break;
            case 13:
                this.f8170k = new C2192k(0);
                this.f8171l = new C2189h();
                break;
            default:
                this.f8170k = new C1132w();
                this.f8171l = new C2341a();
                break;
        }
    }

    public C2332e(C1108d0 c1108d0) {
        this.f8169j = 3;
        this.f8170k = c1108d0;
        this.f8171l = new C1132w();
    }

    public C2332e(C2882d0 c2882d0) {
        this.f8169j = 12;
        this.f8170k = c2882d0;
        C2042a c2042a = new C2042a();
        c2042a.f7527a = 0;
        this.f8171l = c2042a;
    }

    public C2332e(EditText editText) {
        this.f8169j = 9;
        this.f8170k = editText;
        C2741i c2741i = new C2741i(editText);
        this.f8171l = c2741i;
        editText.addTextChangedListener(c2741i);
        if (C2733a.f10101b == null) {
            synchronized (C2733a.f10100a) {
                try {
                    if (C2733a.f10101b == null) {
                        C2733a c2733a = new C2733a();
                        try {
                            C2733a.f10102c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C2733a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        C2733a.f10101b = c2733a;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(C2733a.f10101b);
    }

    public C2332e(C2407e0 c2407e0) {
        this.f8169j = 4;
        this.f8171l = c2407e0;
        this.f8170k = new C1131v(new byte[4], 4);
    }
}
