package p077j$.time.format;

import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import java.math.BigInteger;
import okhttp3.internal.connection.C2096f;
import p077j$.time.C1354c;
import p077j$.time.temporal.InterfaceC1452r;

/* renamed from: j$.time.format.h */
/* loaded from: classes2.dex */
public class C1403h implements InterfaceC1400e {

    /* renamed from: f */
    public static final long[] f5510f = {0, 10, 100, 1000, Renderer.DEFAULT_DURATION_TO_PROGRESS_US, SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US, 1000000, 10000000, 100000000, 1000000000, C2096f.IDLE_CONNECTION_HEALTHY_NS};

    /* renamed from: a */
    public final InterfaceC1452r f5511a;

    /* renamed from: b */
    public final int f5512b;

    /* renamed from: c */
    public final int f5513c;

    /* renamed from: d */
    public final EnumC1419x f5514d;

    /* renamed from: e */
    public final int f5515e;

    public C1403h(InterfaceC1452r interfaceC1452r, int i, int i4, EnumC1419x enumC1419x) {
        this.f5511a = interfaceC1452r;
        this.f5512b = i;
        this.f5513c = i4;
        this.f5514d = enumC1419x;
        this.f5515e = 0;
    }

    public C1403h(InterfaceC1452r interfaceC1452r, int i, int i4, EnumC1419x enumC1419x, int i8) {
        this.f5511a = interfaceC1452r;
        this.f5512b = i;
        this.f5513c = i4;
        this.f5514d = enumC1419x;
        this.f5515e = i8;
    }

    /* renamed from: b */
    public C1403h mo3011b() {
        if (this.f5515e == -1) {
            return this;
        }
        return new C1403h(this.f5511a, this.f5512b, this.f5513c, this.f5514d, -1);
    }

    /* renamed from: c */
    public C1403h mo3012c(int i) {
        return new C1403h(this.f5511a, this.f5512b, this.f5513c, this.f5514d, this.f5515e + i);
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: w */
    public boolean mo3009w(C1413r c1413r, StringBuilder sb) {
        InterfaceC1452r interfaceC1452r = this.f5511a;
        Long lM3043a = c1413r.m3043a(interfaceC1452r);
        if (lM3043a == null) {
            return false;
        }
        long jLongValue = lM3043a.longValue();
        C1416u c1416u = c1413r.f5548b.f5497c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.f5513c;
        if (length > i) {
            throw new C1354c("Field " + interfaceC1452r + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        c1416u.getClass();
        int i4 = this.f5512b;
        EnumC1419x enumC1419x = this.f5514d;
        if (jLongValue >= 0) {
            int i8 = AbstractC1397b.f5502a[enumC1419x.ordinal()];
            if (i8 != 1) {
                if (i8 == 2) {
                    sb.append('+');
                }
            } else if (i4 < 19 && jLongValue >= f5510f[i4]) {
                sb.append('+');
            }
        } else {
            int i9 = AbstractC1397b.f5502a[enumC1419x.ordinal()];
            if (i9 == 1 || i9 == 2 || i9 == 3) {
                sb.append('-');
            } else if (i9 == 4) {
                throw new C1354c("Field " + interfaceC1452r + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i10 = 0; i10 < i4 - string.length(); i10++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    /* renamed from: a */
    public boolean mo3010a(C1411p c1411p) {
        int i = this.f5515e;
        if (i != -1) {
            return i > 0 && this.f5512b == this.f5513c && this.f5514d == EnumC1419x.NOT_NEGATIVE;
        }
        return true;
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: A */
    public int mo3008A(C1411p c1411p, CharSequence charSequence, int i) {
        boolean z7;
        boolean z8;
        BigInteger bigIntegerAdd;
        boolean z9;
        boolean z10;
        int i4;
        long j;
        long j8;
        int i8;
        int i9;
        DateTimeFormatter dateTimeFormatter;
        boolean z11;
        int i10 = i;
        int length = charSequence.length();
        if (i10 == length) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i);
        DateTimeFormatter dateTimeFormatter2 = c1411p.f5539a;
        dateTimeFormatter2.f5497c.getClass();
        int i11 = this.f5513c;
        EnumC1419x enumC1419x = this.f5514d;
        int i12 = this.f5512b;
        int i13 = 0;
        boolean z12 = true;
        if (cCharAt == '+') {
            boolean z13 = c1411p.f5541c;
            boolean z14 = i12 == i11;
            int iOrdinal = enumC1419x.ordinal();
            if (iOrdinal == 0 ? z13 : !(iOrdinal == 1 || iOrdinal == 4 || (!z13 && !z14))) {
                return ~i10;
            }
            i10++;
            z7 = false;
            z8 = true;
        } else {
            dateTimeFormatter2.f5497c.getClass();
            if (cCharAt == '-') {
                boolean z15 = c1411p.f5541c;
                boolean z16 = i12 == i11;
                int iOrdinal2 = enumC1419x.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z15 || z16)) {
                    return ~i10;
                }
                i10++;
                z8 = false;
                z7 = true;
            } else {
                if (enumC1419x == EnumC1419x.ALWAYS && c1411p.f5541c) {
                    return ~i10;
                }
                z7 = false;
                z8 = false;
            }
        }
        int i14 = (c1411p.f5541c || mo3010a(c1411p)) ? i12 : 1;
        int i15 = i10 + i14;
        if (i15 > length) {
            return ~i10;
        }
        if (!c1411p.f5541c && !mo3010a(c1411p)) {
            i11 = 9;
        }
        int i16 = this.f5515e;
        int iMax = Math.max(i16, 0) + i11;
        while (true) {
            bigIntegerAdd = null;
            if (i13 >= 2) {
                z9 = z7;
                z10 = z8;
                i4 = i10;
                j = 0;
                break;
            }
            int iMin = Math.min(i10 + iMax, length);
            boolean z17 = z12;
            j8 = 0;
            i8 = i10;
            while (true) {
                if (i8 >= iMin) {
                    i9 = length;
                    z9 = z7;
                    break;
                }
                int i17 = i8 + 1;
                char cCharAt2 = charSequence.charAt(i8);
                i9 = length;
                dateTimeFormatter2.f5497c.getClass();
                int i18 = cCharAt2 - '0';
                z9 = z7;
                if (i18 < 0 || i18 > 9) {
                    i18 = -1;
                }
                if (i18 >= 0) {
                    if (i17 - i10 > 18) {
                        if (bigIntegerAdd == null) {
                            bigIntegerAdd = BigInteger.valueOf(j8);
                        }
                        dateTimeFormatter = dateTimeFormatter2;
                        z11 = z8;
                        bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i18));
                    } else {
                        dateTimeFormatter = dateTimeFormatter2;
                        z11 = z8;
                        j8 = (j8 * 10) + i18;
                    }
                    i8 = i17;
                    z7 = z9;
                    length = i9;
                    dateTimeFormatter2 = dateTimeFormatter;
                    z8 = z11;
                } else if (i8 < i15) {
                    return ~i10;
                }
            }
            DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2;
            z10 = z8;
            if (i16 <= 0 || i13 != 0) {
                break;
            }
            int iMax2 = Math.max(i14, (i8 - i10) - i16);
            i13++;
            z12 = z17;
            z7 = z9;
            dateTimeFormatter2 = dateTimeFormatter3;
            z8 = z10;
            iMax = iMax2;
            length = i9;
        }
        i4 = i8;
        j = j8;
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z9) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && c1411p.f5541c) {
                    return ~(i10 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j == 0 && c1411p.f5541c) {
                    return ~(i10 - 1);
                }
                j = -j;
            }
        } else if (enumC1419x == EnumC1419x.EXCEEDS_PAD && c1411p.f5541c) {
            int i19 = i4 - i10;
            if (z10) {
                if (i19 <= i12) {
                    return ~(i10 - 1);
                }
            } else if (i19 > i12) {
                return ~i10;
            }
        }
        if (bigIntegerDivide == null) {
            return c1411p.m3041f(this.f5511a, j, i10, i4);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i4--;
        }
        return c1411p.m3041f(this.f5511a, bigIntegerDivide.longValue(), i10, i4);
    }

    public String toString() {
        int i = this.f5513c;
        InterfaceC1452r interfaceC1452r = this.f5511a;
        EnumC1419x enumC1419x = this.f5514d;
        int i4 = this.f5512b;
        if (i4 == 1 && i == 19 && enumC1419x == EnumC1419x.NORMAL) {
            return "Value(" + interfaceC1452r + ")";
        }
        if (i4 == i && enumC1419x == EnumC1419x.NOT_NEGATIVE) {
            return "Value(" + interfaceC1452r + "," + i4 + ")";
        }
        return "Value(" + interfaceC1452r + "," + i4 + "," + i + "," + enumC1419x + ")";
    }
}
