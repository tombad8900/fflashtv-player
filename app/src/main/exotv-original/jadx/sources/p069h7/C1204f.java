package p069h7;

import com.bumptech.glide.AbstractC0715d;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.C2181z;
import p002a1.C0016e;
import p211y5.C2819f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h7.f */
/* loaded from: classes.dex */
public final class C1204f implements Serializable {

    /* renamed from: j */
    public final Pattern f5091j;

    public C1204f(Pattern pattern) {
        this.f5091j = pattern;
    }

    /* renamed from: b */
    public static C0016e m2622b(C1204f c1204f, String str) {
        c1204f.getClass();
        AbstractC2980h.m5136e("input", str);
        Matcher matcher = c1204f.f5091j.matcher(str);
        AbstractC2980h.m5135d("matcher(...)", matcher);
        if (matcher.find(0)) {
            return new C0016e(matcher, str);
        }
        return null;
    }

    /* renamed from: a */
    public final boolean m2623a(String str) {
        return this.f5091j.matcher(str).find();
    }

    /* renamed from: c */
    public final boolean m2624c(String str) {
        AbstractC2980h.m5136e("input", str);
        return this.f5091j.matcher(str).matches();
    }

    /* renamed from: d */
    public final String m2625d(String str) {
        AbstractC2980h.m5136e("input", str);
        String strReplaceAll = this.f5091j.matcher(str).replaceAll(C2181z.FRAGMENT_ENCODE_SET);
        AbstractC2980h.m5135d("replaceAll(...)", strReplaceAll);
        return strReplaceAll;
    }

    /* renamed from: e */
    public final List m2626e(String str) {
        AbstractC2980h.m5136e("input", str);
        Matcher matcher = this.f5091j.matcher(str);
        if (!matcher.find()) {
            return AbstractC0715d.m1551T(str.toString());
        }
        ArrayList arrayList = new ArrayList(10);
        int iEnd = 0;
        do {
            arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
            iEnd = matcher.end();
        } while (matcher.find());
        arrayList.add(str.subSequence(iEnd, str.length()).toString());
        return arrayList;
    }

    public final String toString() {
        String string = this.f5091j.toString();
        AbstractC2980h.m5135d("toString(...)", string);
        return string;
    }

    public C1204f(String str) {
        Pattern patternCompile = Pattern.compile(str);
        AbstractC2980h.m5135d("compile(...)", patternCompile);
        this.f5091j = patternCompile;
    }

    public C1204f(String str, int i) {
        EnumC1205g enumC1205g = EnumC1205g.f5092k;
        Pattern patternCompile = Pattern.compile(str, C2819f.m4927o(2));
        AbstractC2980h.m5135d("compile(...)", patternCompile);
        this.f5091j = patternCompile;
    }
}
