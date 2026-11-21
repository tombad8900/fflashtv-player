package p077j$.time.format;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import p077j$.time.AbstractC1462z;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.format.p */
/* loaded from: classes2.dex */
public final class C1411p {

    /* renamed from: a */
    public final DateTimeFormatter f5539a;

    /* renamed from: b */
    public boolean f5540b = true;

    /* renamed from: c */
    public boolean f5541c = true;

    /* renamed from: d */
    public final ArrayList f5542d;

    public C1411p(DateTimeFormatter dateTimeFormatter) {
        ArrayList arrayList = new ArrayList();
        this.f5542d = arrayList;
        this.f5539a = dateTimeFormatter;
        arrayList.add(new C1417v());
    }

    /* renamed from: a */
    public final boolean m3037a(char c8, char c9) {
        if (this.f5540b) {
            return c8 == c9;
        }
        return m3036b(c8, c9);
    }

    /* renamed from: g */
    public final boolean m3042g(CharSequence charSequence, int i, CharSequence charSequence2, int i4, int i8) {
        if (i + i8 <= charSequence.length() && i4 + i8 <= charSequence2.length()) {
            if (this.f5540b) {
                for (int i9 = 0; i9 < i8; i9++) {
                    if (charSequence.charAt(i + i9) == charSequence2.charAt(i4 + i9)) {
                    }
                }
                return true;
            }
            for (int i10 = 0; i10 < i8; i10++) {
                char cCharAt = charSequence.charAt(i + i10);
                char cCharAt2 = charSequence2.charAt(i4 + i10);
                if (cCharAt == cCharAt2 || Character.toUpperCase(cCharAt) == Character.toUpperCase(cCharAt2) || Character.toLowerCase(cCharAt) == Character.toLowerCase(cCharAt2)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3036b(char c8, char c9) {
        return c8 == c9 || Character.toUpperCase(c8) == Character.toUpperCase(c9) || Character.toLowerCase(c8) == Character.toLowerCase(c9);
    }

    /* renamed from: c */
    public final C1417v m3038c() {
        return (C1417v) this.f5542d.get(r0.size() - 1);
    }

    /* renamed from: d */
    public final Long m3039d(EnumC1435a enumC1435a) {
        return (Long) ((HashMap) m3038c().f5553a).get(enumC1435a);
    }

    /* renamed from: f */
    public final int m3041f(InterfaceC1452r interfaceC1452r, long j, int i, int i4) {
        Objects.requireNonNull(interfaceC1452r, "field");
        Long l8 = (Long) ((HashMap) m3038c().f5553a).put(interfaceC1452r, Long.valueOf(j));
        return (l8 == null || l8.longValue() == j) ? i4 : ~i;
    }

    /* renamed from: e */
    public final void m3040e(AbstractC1462z abstractC1462z) {
        Objects.requireNonNull(abstractC1462z, "zone");
        m3038c().f5554b = abstractC1462z;
    }

    public final String toString() {
        return m3038c().toString();
    }
}
