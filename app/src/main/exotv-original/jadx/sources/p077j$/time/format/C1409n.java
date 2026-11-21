package p077j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p077j$.time.chrono.C1384s;
import p077j$.time.chrono.InterfaceC1377l;
import p077j$.time.chrono.InterfaceC1378m;
import p077j$.time.temporal.AbstractC1453s;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.format.n */
/* loaded from: classes2.dex */
public final class C1409n implements InterfaceC1400e {

    /* renamed from: a */
    public final InterfaceC1452r f5529a;

    /* renamed from: b */
    public final EnumC1420y f5530b;

    /* renamed from: c */
    public final C1396a f5531c;

    /* renamed from: d */
    public volatile C1403h f5532d;

    public C1409n(InterfaceC1452r interfaceC1452r, EnumC1420y enumC1420y, C1396a c1396a) {
        this.f5529a = interfaceC1452r;
        this.f5530b = enumC1420y;
        this.f5531c = c1396a;
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: w */
    public final boolean mo3009w(C1413r c1413r, StringBuilder sb) {
        String strM3044a;
        Long lM3043a = c1413r.m3043a(this.f5529a);
        DateTimeFormatter dateTimeFormatter = c1413r.f5548b;
        if (lM3043a == null) {
            return false;
        }
        InterfaceC1377l interfaceC1377l = (InterfaceC1377l) c1413r.f5547a.mo2875b(AbstractC1453s.f5621b);
        if (interfaceC1377l == null || interfaceC1377l == C1384s.f5471c) {
            C1396a c1396a = this.f5531c;
            long jLongValue = lM3043a.longValue();
            EnumC1420y enumC1420y = this.f5530b;
            Locale locale = dateTimeFormatter.f5496b;
            strM3044a = c1396a.f5501a.m3044a(jLongValue, enumC1420y);
        } else {
            C1396a c1396a2 = this.f5531c;
            long jLongValue2 = lM3043a.longValue();
            EnumC1420y enumC1420y2 = this.f5530b;
            Locale locale2 = dateTimeFormatter.f5496b;
            strM3044a = c1396a2.f5501a.m3044a(jLongValue2, enumC1420y2);
        }
        if (strM3044a != null) {
            sb.append(strM3044a);
            return true;
        }
        if (this.f5532d == null) {
            this.f5532d = new C1403h(this.f5529a, 1, 19, EnumC1419x.NORMAL);
        }
        return this.f5532d.mo3009w(c1413r, sb);
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: A */
    public final int mo3008A(C1411p c1411p, CharSequence charSequence, int i) {
        C1396a c1396a = this.f5531c;
        InterfaceC1452r interfaceC1452r = this.f5529a;
        int length = charSequence.length();
        if (i >= 0 && i <= length) {
            boolean z7 = c1411p.f5541c;
            DateTimeFormatter dateTimeFormatter = c1411p.f5539a;
            Iterator it = null;
            EnumC1420y enumC1420y = z7 ? this.f5530b : null;
            InterfaceC1377l interfaceC1377l = c1411p.m3038c().f5555c;
            if (interfaceC1377l == null && (interfaceC1377l = c1411p.f5539a.f5499e) == null) {
                interfaceC1377l = C1384s.f5471c;
            }
            if (interfaceC1377l == null || interfaceC1377l == C1384s.f5471c) {
                Locale locale = dateTimeFormatter.f5496b;
                List list = (List) ((HashMap) c1396a.f5501a.f5551b).get(enumC1420y);
                it = list != null ? list.iterator() : null;
            } else {
                Locale locale2 = dateTimeFormatter.f5496b;
                List list2 = (List) ((HashMap) c1396a.f5501a.f5551b).get(enumC1420y);
                if (list2 != null) {
                    it = list2.iterator();
                }
            }
            Iterator it2 = it;
            if (it2 != null) {
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    if (c1411p.m3042g(str, 0, charSequence, i, str.length())) {
                        return c1411p.m3041f(this.f5529a, ((Long) entry.getValue()).longValue(), i, str.length() + i);
                    }
                }
                if (interfaceC1452r == EnumC1435a.ERA && !c1411p.f5541c) {
                    Iterator it3 = interfaceC1377l.mo2943z().iterator();
                    while (it3.hasNext()) {
                        String string = ((InterfaceC1378m) it3.next()).toString();
                        if (c1411p.m3042g(string, 0, charSequence, i, string.length())) {
                            return c1411p.m3041f(this.f5529a, r7.getValue(), i, string.length() + i);
                        }
                    }
                }
                if (c1411p.f5541c) {
                    return ~i;
                }
            }
            if (this.f5532d == null) {
                this.f5532d = new C1403h(this.f5529a, 1, 19, EnumC1419x.NORMAL);
            }
            return this.f5532d.mo3008A(c1411p, charSequence, i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        EnumC1420y enumC1420y = EnumC1420y.FULL;
        InterfaceC1452r interfaceC1452r = this.f5529a;
        EnumC1420y enumC1420y2 = this.f5530b;
        if (enumC1420y2 == enumC1420y) {
            return "Text(" + interfaceC1452r + ")";
        }
        return "Text(" + interfaceC1452r + "," + enumC1420y2 + ")";
    }
}
