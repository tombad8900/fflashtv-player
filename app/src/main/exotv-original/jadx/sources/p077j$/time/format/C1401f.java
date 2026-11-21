package p077j$.time.format;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Objects;
import okhttp3.C2181z;
import p077j$.time.AbstractC1392d;
import p077j$.time.temporal.C1456v;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.format.f */
/* loaded from: classes2.dex */
public final class C1401f extends C1403h {

    /* renamed from: g */
    public final boolean f5506g;

    @Override // p077j$.time.format.C1403h, p077j$.time.format.InterfaceC1400e
    /* renamed from: A */
    public final int mo3008A(C1411p c1411p, CharSequence charSequence, int i) {
        boolean z7 = c1411p.f5541c;
        DateTimeFormatter dateTimeFormatter = c1411p.f5539a;
        int i4 = (z7 || mo3010a(c1411p)) ? this.f5512b : 0;
        int i8 = (c1411p.f5541c || mo3010a(c1411p)) ? this.f5513c : 9;
        int length = charSequence.length();
        if (i != length) {
            if (this.f5506g) {
                char cCharAt = charSequence.charAt(i);
                dateTimeFormatter.f5497c.getClass();
                if (cCharAt == '.') {
                    i++;
                } else if (i4 > 0) {
                    return ~i;
                }
            }
            int i9 = i;
            int i10 = i4 + i9;
            if (i10 > length) {
                return ~i9;
            }
            int iMin = Math.min(i8 + i9, length);
            int i11 = 0;
            int i12 = i9;
            while (true) {
                if (i12 >= iMin) {
                    break;
                }
                int i13 = i12 + 1;
                char cCharAt2 = charSequence.charAt(i12);
                dateTimeFormatter.f5497c.getClass();
                int i14 = cCharAt2 - '0';
                if (i14 < 0 || i14 > 9) {
                    i14 = -1;
                }
                if (i14 >= 0) {
                    i11 = (i11 * 10) + i14;
                    i12 = i13;
                } else if (i13 < i10) {
                    return ~i9;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i11).movePointLeft(i12 - i9);
            C1456v c1456vMo3091I = this.f5511a.mo3091I();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c1456vMo3091I.f5627a);
            return c1411p.m3041f(this.f5511a, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(c1456vMo3091I.f5630d).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i9, i12);
        }
        if (i4 > 0) {
            return ~i;
        }
        return i;
    }

    @Override // p077j$.time.format.C1403h
    /* renamed from: a */
    public final boolean mo3010a(C1411p c1411p) {
        return c1411p.f5541c && this.f5512b == this.f5513c && !this.f5506g;
    }

    public C1401f(InterfaceC1452r interfaceC1452r) {
        this(interfaceC1452r, 0, 9, true, 0);
        Objects.requireNonNull(interfaceC1452r, "field");
        C1456v c1456vMo3091I = interfaceC1452r.mo3091I();
        if (c1456vMo3091I.f5627a != c1456vMo3091I.f5628b || c1456vMo3091I.f5629c != c1456vMo3091I.f5630d) {
            throw new IllegalArgumentException(AbstractC1392d.m3001a("Field must have a fixed set of values: ", interfaceC1452r));
        }
    }

    public C1401f(InterfaceC1452r interfaceC1452r, int i, int i4, boolean z7, int i8) {
        super(interfaceC1452r, i, i4, EnumC1419x.NOT_NEGATIVE, i8);
        this.f5506g = z7;
    }

    @Override // p077j$.time.format.C1403h
    /* renamed from: b */
    public final C1403h mo3011b() {
        if (this.f5515e == -1) {
            return this;
        }
        return new C1401f(this.f5511a, this.f5512b, this.f5513c, this.f5506g, -1);
    }

    @Override // p077j$.time.format.C1403h
    /* renamed from: c */
    public final C1403h mo3012c(int i) {
        return new C1401f(this.f5511a, this.f5512b, this.f5513c, this.f5506g, this.f5515e + i);
    }

    @Override // p077j$.time.format.C1403h, p077j$.time.format.InterfaceC1400e
    /* renamed from: w */
    public final boolean mo3009w(C1413r c1413r, StringBuilder sb) {
        InterfaceC1452r interfaceC1452r = this.f5511a;
        Long lM3043a = c1413r.m3043a(interfaceC1452r);
        if (lM3043a == null) {
            return false;
        }
        C1416u c1416u = c1413r.f5548b.f5497c;
        long jLongValue = lM3043a.longValue();
        C1456v c1456vMo3091I = interfaceC1452r.mo3091I();
        c1456vMo3091I.m3106b(jLongValue, interfaceC1452r);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(c1456vMo3091I.f5627a);
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(c1456vMo3091I.f5630d).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z7 = this.f5506g;
        int i = this.f5512b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.f5513c), roundingMode).toPlainString().substring(2);
            c1416u.getClass();
            if (z7) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i > 0) {
            if (z7) {
                c1416u.getClass();
                sb.append('.');
            }
            for (int i4 = 0; i4 < i; i4++) {
                c1416u.getClass();
                sb.append('0');
            }
        }
        return true;
    }

    @Override // p077j$.time.format.C1403h
    public final String toString() {
        return "Fraction(" + this.f5511a + "," + this.f5512b + "," + this.f5513c + (this.f5506g ? ",DecimalPoint" : C2181z.FRAGMENT_ENCODE_SET) + ")";
    }
}
