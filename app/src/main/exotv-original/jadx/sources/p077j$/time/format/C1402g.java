package p077j$.time.format;

import androidx.media3.exoplayer.Renderer;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import okhttp3.C2181z;
import p077j$.time.AbstractC1462z;
import p077j$.time.C1351a0;
import p077j$.time.C1354c;
import p077j$.time.C1421g;
import p077j$.time.C1424j;
import p077j$.time.C1426l;
import p077j$.time.LocalDate;
import p077j$.time.temporal.EnumC1435a;
import p077j$.time.temporal.InterfaceC1448n;
import p077j$.time.zone.C1471i;

/* renamed from: j$.time.format.g */
/* loaded from: classes2.dex */
public final class C1402g implements InterfaceC1400e {

    /* renamed from: b */
    public static volatile Map.Entry f5507b;

    /* renamed from: c */
    public static volatile Map.Entry f5508c;

    /* renamed from: a */
    public final /* synthetic */ int f5509a;

    public /* synthetic */ C1402g(int i) {
        this.f5509a = i;
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: w */
    public final boolean mo3009w(C1413r c1413r, StringBuilder sb) {
        switch (this.f5509a) {
            case 0:
                Long lM3043a = c1413r.m3043a(EnumC1435a.INSTANT_SECONDS);
                InterfaceC1448n interfaceC1448n = c1413r.f5547a;
                EnumC1435a enumC1435a = EnumC1435a.NANO_OF_SECOND;
                Long lValueOf = interfaceC1448n.mo2881i(enumC1435a) ? Long.valueOf(interfaceC1448n.mo2882j(enumC1435a)) : null;
                int i = 0;
                if (lM3043a == null) {
                    return false;
                }
                long jLongValue = lM3043a.longValue();
                int iM3105a = enumC1435a.f5602b.m3105a(lValueOf != null ? lValueOf.longValue() : 0L, enumC1435a);
                if (jLongValue >= -62167219200L) {
                    long j = jLongValue - 253402300800L;
                    long jFloorDiv = Math.floorDiv(j, 315569520000L) + 1;
                    C1424j c1424jM3056P = C1424j.m3056P(Math.floorMod(j, 315569520000L) - 62167219200L, 0, C1351a0.f5416f);
                    if (jFloorDiv > 0) {
                        sb.append('+');
                        sb.append(jFloorDiv);
                    }
                    sb.append(c1424jM3056P);
                    if (c1424jM3056P.f5571b.f5580c == 0) {
                        sb.append(":00");
                    }
                } else {
                    long j8 = jLongValue + 62167219200L;
                    long j9 = j8 / 315569520000L;
                    long j10 = j8 % 315569520000L;
                    C1424j c1424jM3056P2 = C1424j.m3056P(j10 - 62167219200L, 0, C1351a0.f5416f);
                    int length = sb.length();
                    sb.append(c1424jM3056P2);
                    if (c1424jM3056P2.f5571b.f5580c == 0) {
                        sb.append(":00");
                    }
                    if (j9 < 0) {
                        if (c1424jM3056P2.f5570a.f5410a == -10000) {
                            sb.replace(length, length + 2, Long.toString(j9 - 1));
                        } else if (j10 == 0) {
                            sb.insert(length, j9);
                        } else {
                            sb.insert(length + 1, Math.abs(j9));
                        }
                    }
                }
                if (iM3105a > 0) {
                    sb.append('.');
                    int i4 = 100000000;
                    while (true) {
                        if (iM3105a > 0 || i % 3 != 0 || i < -2) {
                            int i8 = iM3105a / i4;
                            sb.append((char) (i8 + 48));
                            iM3105a -= i8 * i4;
                            i4 /= 10;
                            i++;
                        }
                    }
                }
                sb.append('Z');
                return true;
            default:
                C1421g c1421g = C1410o.f5533f;
                InterfaceC1448n interfaceC1448n2 = c1413r.f5547a;
                Object objMo2875b = interfaceC1448n2.mo2875b(c1421g);
                if (objMo2875b == null && c1413r.f5549c == 0) {
                    throw new C1354c("Unable to extract " + c1421g + " from temporal " + interfaceC1448n2);
                }
                AbstractC1462z abstractC1462z = (AbstractC1462z) objMo2875b;
                if (abstractC1462z == null) {
                    return false;
                }
                sb.append(abstractC1462z.mo2920q());
                return true;
        }
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: A */
    public final int mo3008A(C1411p c1411p, CharSequence charSequence, int i) {
        int i4;
        int i8 = 1;
        switch (this.f5509a) {
            case 0:
                C1410o c1410o = new C1410o();
                c1410o.m3024a(DateTimeFormatter.ISO_LOCAL_DATE);
                c1410o.m3026c('T');
                EnumC1435a enumC1435a = EnumC1435a.HOUR_OF_DAY;
                c1410o.m3030g(enumC1435a, 2);
                c1410o.m3026c(':');
                EnumC1435a enumC1435a2 = EnumC1435a.MINUTE_OF_HOUR;
                c1410o.m3030g(enumC1435a2, 2);
                c1410o.m3026c(':');
                EnumC1435a enumC1435a3 = EnumC1435a.SECOND_OF_MINUTE;
                c1410o.m3030g(enumC1435a3, 2);
                EnumC1435a enumC1435a4 = EnumC1435a.NANO_OF_SECOND;
                c1410o.m3025b(new C1401f(enumC1435a4));
                c1410o.m3026c('Z');
                C1399d c1399d = c1410o.m3035l(Locale.getDefault(), EnumC1418w.SMART, null).f5495a;
                if (c1399d.f5505b) {
                    c1399d = new C1399d(c1399d.f5504a, false);
                }
                C1411p c1411p2 = new C1411p(c1411p.f5539a);
                c1411p2.f5540b = c1411p.f5540b;
                c1411p2.f5541c = c1411p.f5541c;
                int iMo3008A = c1399d.mo3008A(c1411p2, charSequence, i);
                if (iMo3008A < 0) {
                    return iMo3008A;
                }
                long jLongValue = c1411p2.m3039d(EnumC1435a.YEAR).longValue();
                int iIntValue = c1411p2.m3039d(EnumC1435a.MONTH_OF_YEAR).intValue();
                int iIntValue2 = c1411p2.m3039d(EnumC1435a.DAY_OF_MONTH).intValue();
                int iIntValue3 = c1411p2.m3039d(enumC1435a).intValue();
                int iIntValue4 = c1411p2.m3039d(enumC1435a2).intValue();
                Long lM3039d = c1411p2.m3039d(enumC1435a3);
                Long lM3039d2 = c1411p2.m3039d(enumC1435a4);
                int iIntValue5 = lM3039d != null ? lM3039d.intValue() : 0;
                int iIntValue6 = lM3039d2 != null ? lM3039d2.intValue() : 0;
                if (iIntValue3 == 24 && iIntValue4 == 0 && iIntValue5 == 0 && iIntValue6 == 0) {
                    iIntValue3 = 0;
                } else if (iIntValue3 == 23 && iIntValue4 == 59 && iIntValue5 == 60) {
                    c1411p.m3038c().f5556d = true;
                    i8 = 0;
                    iIntValue5 = 59;
                } else {
                    i8 = 0;
                }
                int i9 = ((int) jLongValue) % 10000;
                try {
                    C1424j c1424j = C1424j.f5568c;
                    LocalDate localDateM2886b0 = LocalDate.m2886b0(i9, iIntValue, iIntValue2);
                    C1426l c1426lM3066P = C1426l.m3066P(iIntValue3, iIntValue4, iIntValue5, 0);
                    return c1411p.m3041f(enumC1435a4, iIntValue6, i, c1411p.m3041f(EnumC1435a.INSTANT_SECONDS, new C1424j(localDateM2886b0, c1426lM3066P).m3062a0(localDateM2886b0.m2903f0(i8), c1426lM3066P).m2956v(C1351a0.f5416f) + Math.multiplyExact(jLongValue / Renderer.DEFAULT_DURATION_TO_PROGRESS_US, 315569520000L), i, iMo3008A));
                } catch (RuntimeException unused) {
                    return ~i;
                }
            default:
                int length = charSequence.length();
                if (i > length) {
                    throw new IndexOutOfBoundsException();
                }
                if (i != length) {
                    char cCharAt = charSequence.charAt(i);
                    if (cCharAt == '+' || cCharAt == '-') {
                        return m3013a(c1411p, charSequence, i, i, C1404i.f5517e);
                    }
                    int i10 = i + 2;
                    if (length >= i10) {
                        char cCharAt2 = charSequence.charAt(i + 1);
                        if (c1411p.m3037a(cCharAt, 'U') && c1411p.m3037a(cCharAt2, 'T')) {
                            int i11 = i + 3;
                            return (length < i11 || !c1411p.m3037a(charSequence.charAt(i10), 'C')) ? m3013a(c1411p, charSequence, i, i10, C1404i.f5518f) : m3013a(c1411p, charSequence, i, i11, C1404i.f5518f);
                        }
                        if (c1411p.m3037a(cCharAt, 'G') && length >= (i4 = i + 3) && c1411p.m3037a(cCharAt2, 'M') && c1411p.m3037a(charSequence.charAt(i10), 'T')) {
                            int i12 = i + 4;
                            if (length < i12 || !c1411p.m3037a(charSequence.charAt(i4), '0')) {
                                return m3013a(c1411p, charSequence, i, i4, C1404i.f5518f);
                            }
                            c1411p.m3040e(AbstractC1462z.m3121A("GMT0", true));
                            return i12;
                        }
                    }
                    Set<String> set = C1471i.f5676d;
                    int size = set.size();
                    Map.Entry simpleImmutableEntry = c1411p.f5540b ? f5507b : f5508c;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        synchronized (this) {
                            try {
                                simpleImmutableEntry = c1411p.f5540b ? f5507b : f5508c;
                                if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                                    Integer numValueOf = Integer.valueOf(size);
                                    C1406k c1406k = c1411p.f5540b ? new C1406k(C2181z.FRAGMENT_ENCODE_SET, null, null) : new C1405j(C2181z.FRAGMENT_ENCODE_SET, null, null);
                                    for (String str : set) {
                                        c1406k.m3022a(str, str);
                                    }
                                    simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(numValueOf, c1406k);
                                    if (c1411p.f5540b) {
                                        f5507b = simpleImmutableEntry;
                                    } else {
                                        f5508c = simpleImmutableEntry;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    C1406k c1406k2 = (C1406k) simpleImmutableEntry.getValue();
                    ParsePosition parsePosition = new ParsePosition(i);
                    String strM3023c = c1406k2.m3023c(charSequence, parsePosition);
                    if (strM3023c != null) {
                        c1411p.m3040e(AbstractC1462z.m3121A(strM3023c, true));
                        return parsePosition.getIndex();
                    }
                    if (c1411p.m3037a(cCharAt, 'Z')) {
                        c1411p.m3040e(C1351a0.f5416f);
                        return i + 1;
                    }
                }
                return ~i;
        }
    }

    /* renamed from: a */
    public static int m3013a(C1411p c1411p, CharSequence charSequence, int i, int i4, C1404i c1404i) {
        String upperCase = charSequence.subSequence(i, i4).toString().toUpperCase();
        if (i4 >= charSequence.length()) {
            c1411p.m3040e(AbstractC1462z.m3121A(upperCase, true));
            return i4;
        }
        if (charSequence.charAt(i4) != '0' && !c1411p.m3037a(charSequence.charAt(i4), 'Z')) {
            C1411p c1411p2 = new C1411p(c1411p.f5539a);
            c1411p2.f5540b = c1411p.f5540b;
            c1411p2.f5541c = c1411p.f5541c;
            int iMo3008A = c1404i.mo3008A(c1411p2, charSequence, i4);
            try {
                if (iMo3008A < 0) {
                    if (c1404i == C1404i.f5517e) {
                        return ~i;
                    }
                    c1411p.m3040e(AbstractC1462z.m3121A(upperCase, true));
                    return i4;
                }
                c1411p.m3040e(AbstractC1462z.m3122F(upperCase, C1351a0.m2915Y((int) c1411p2.m3039d(EnumC1435a.OFFSET_SECONDS).longValue())));
                return iMo3008A;
            } catch (C1354c unused) {
                return ~i;
            }
        }
        c1411p.m3040e(AbstractC1462z.m3121A(upperCase, true));
        return i4;
    }

    public final String toString() {
        switch (this.f5509a) {
            case 0:
                return "Instant()";
            default:
                return "ZoneRegionId()";
        }
    }
}
