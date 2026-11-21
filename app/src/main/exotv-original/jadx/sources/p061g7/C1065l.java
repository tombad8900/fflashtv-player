package p061g7;

import java.util.regex.Pattern;
import p026c7.AbstractC0711e;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1327r;
import p111m6.AbstractC1913h;
import p137p6.InterfaceC2225f;
import p204x4.C2779v;
import p212y6.InterfaceC2851l;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: g7.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C1065l implements InterfaceC2851l {

    /* renamed from: j */
    public final /* synthetic */ int f4491j;

    public /* synthetic */ C1065l(int i) {
        this.f4491j = i;
    }

    @Override // p212y6.InterfaceC2851l
    public final Object invoke(Object obj) {
        switch (this.f4491j) {
            case 0:
                AbstractC2980h.m5136e("it", obj);
                return Integer.valueOf(AbstractC0711e.f2770k.mo1477a(2147418112) + 65536);
            case 1:
                return Boolean.valueOf(obj == null);
            case 2:
                InterfaceC2225f interfaceC2225f = (InterfaceC2225f) obj;
                if (interfaceC2225f instanceof AbstractC1327r) {
                    return (AbstractC1327r) interfaceC2225f;
                }
                return null;
            case 3:
                String str = (String) obj;
                AbstractC2980h.m5136e("it", str);
                return AbstractC1206h.m2645S0(C2779v.f10318d.m2625d(str)).toString();
            case 4:
                String str2 = (String) obj;
                AbstractC2980h.m5136e("it", str2);
                return C2779v.f10322h.m2625d(str2);
            case 5:
                String str3 = (String) obj;
                AbstractC2980h.m5136e("it", str3);
                Pattern patternCompile = Pattern.compile("<br */>");
                AbstractC2980h.m5135d("compile(...)", patternCompile);
                String strReplaceAll = patternCompile.matcher(str3).replaceAll("\n");
                AbstractC2980h.m5135d("replaceAll(...)", strReplaceAll);
                return AbstractC1913h.m3740E0(AbstractC1206h.m2638L0(strReplaceAll, new char[]{'\n'}), "\n", null, null, new C1065l(6), 30);
            default:
                String str4 = (String) obj;
                AbstractC2980h.m5136e("it", str4);
                return C2779v.f10326l.m2625d(str4);
        }
    }
}
