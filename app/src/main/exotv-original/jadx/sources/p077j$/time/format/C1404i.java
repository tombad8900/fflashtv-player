package p077j$.time.format;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import okhttp3.C2181z;
import p077j$.time.C1354c;
import p077j$.time.temporal.EnumC1435a;

/* renamed from: j$.time.format.i */
/* loaded from: classes2.dex */
public final class C1404i implements InterfaceC1400e {

    /* renamed from: d */
    public static final String[] f5516d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* renamed from: e */
    public static final C1404i f5517e = new C1404i("+HH:MM:ss", "Z");

    /* renamed from: f */
    public static final C1404i f5518f = new C1404i("+HH:MM:ss", "0");

    /* renamed from: a */
    public final String f5519a;

    /* renamed from: b */
    public final int f5520b;

    /* renamed from: c */
    public final int f5521c;

    public C1404i(String str, String str2) {
        for (int i = 0; i < 22; i++) {
            if (f5516d[i].equals(str)) {
                this.f5520b = i;
                this.f5521c = i % 11;
                this.f5519a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: w */
    public final boolean mo3009w(C1413r c1413r, StringBuilder sb) {
        Long lM3043a = c1413r.m3043a(EnumC1435a.OFFSET_SECONDS);
        boolean z7 = false;
        if (lM3043a == null) {
            return false;
        }
        int intExact = Math.toIntExact(lM3043a.longValue());
        String str = this.f5519a;
        if (intExact == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb.length();
        sb.append(intExact < 0 ? "-" : "+");
        if (this.f5520b < 11 || iAbs >= 10) {
            m3014a(false, iAbs, sb);
        } else {
            sb.append((char) (iAbs + 48));
        }
        int i = this.f5521c;
        if ((i >= 3 && i <= 8) || ((i >= 9 && iAbs3 > 0) || (i >= 1 && iAbs2 > 0))) {
            m3014a(i > 0 && i % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i == 7 || i == 8 || (i >= 5 && iAbs3 > 0)) {
                if (i > 0 && i % 2 == 0) {
                    z7 = true;
                }
                m3014a(z7, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    /* renamed from: a */
    public static void m3014a(boolean z7, int i, StringBuilder sb) {
        sb.append(z7 ? ":" : C2181z.FRAGMENT_ENCODE_SET);
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: A */
    public final int mo3008A(C1411p c1411p, CharSequence charSequence, int i) {
        CharSequence charSequence2;
        int i4;
        int i8;
        int i9;
        int i10;
        int length = charSequence.length();
        int length2 = this.f5519a.length();
        if (length2 == 0) {
            if (i == length) {
                return c1411p.m3041f(EnumC1435a.OFFSET_SECONDS, 0L, i, i);
            }
            charSequence2 = charSequence;
        } else {
            if (i == length) {
                return ~i;
            }
            charSequence2 = charSequence;
            if (c1411p.m3042g(charSequence2, i, this.f5519a, 0, length2)) {
                return c1411p.m3041f(EnumC1435a.OFFSET_SECONDS, 0L, i, i + length2);
            }
        }
        char cCharAt = charSequence.charAt(i);
        if (cCharAt == '+' || cCharAt == '-') {
            int i11 = cCharAt == '-' ? -1 : 1;
            int i12 = this.f5521c;
            boolean z7 = i12 > 0 && i12 % 2 == 0;
            int i13 = this.f5520b;
            boolean z8 = i13 < 11;
            int[] iArr = new int[4];
            iArr[0] = i + 1;
            if (!c1411p.f5541c) {
                if (z8) {
                    if (z7 || (i13 == 0 && length > (i10 = i + 3) && charSequence2.charAt(i10) == ':')) {
                        i13 = 10;
                        z7 = true;
                    } else {
                        i13 = 9;
                    }
                } else if (z7 || (i13 == 11 && length > (i9 = i + 3) && (charSequence2.charAt(i + 2) == ':' || charSequence2.charAt(i9) == ':'))) {
                    i13 = 21;
                    z7 = true;
                } else {
                    i13 = 20;
                }
            }
            switch (i13) {
                case 0:
                case 11:
                    m3016c(charSequence2, z8, iArr);
                    break;
                case 1:
                case 2:
                case 13:
                    m3016c(charSequence2, z8, iArr);
                    m3017d(charSequence2, z7, false, iArr);
                    break;
                case 3:
                case 4:
                case 15:
                    m3016c(charSequence2, z8, iArr);
                    m3017d(charSequence2, z7, true, iArr);
                    break;
                case 5:
                case 6:
                case AnalyticsListener.EVENT_SEEK_FORWARD_INCREMENT_CHANGED /* 17 */:
                    m3016c(charSequence2, z8, iArr);
                    m3017d(charSequence2, z7, true, iArr);
                    m3015b(charSequence2, z7, 3, iArr);
                    break;
                case 7:
                case 8:
                case AnalyticsListener.EVENT_TRACK_SELECTION_PARAMETERS_CHANGED /* 19 */:
                    m3016c(charSequence2, z8, iArr);
                    m3017d(charSequence2, z7, true, iArr);
                    if (!m3015b(charSequence2, z7, 3, iArr)) {
                        iArr[0] = ~iArr[0];
                        break;
                    }
                    break;
                case 9:
                case 10:
                case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                    m3016c(charSequence2, z8, iArr);
                    if (m3015b(charSequence2, z7, 2, iArr)) {
                        m3015b(charSequence2, z7, 3, iArr);
                        break;
                    }
                    break;
                case 12:
                    m3018e(charSequence2, 1, 4, iArr);
                    break;
                case 14:
                    m3018e(charSequence2, 3, 4, iArr);
                    break;
                case 16:
                    m3018e(charSequence2, 3, 6, iArr);
                    break;
                case AnalyticsListener.EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED /* 18 */:
                    m3018e(charSequence2, 5, 6, iArr);
                    break;
                case 20:
                    m3018e(charSequence2, 1, 6, iArr);
                    break;
            }
            int i14 = iArr[0];
            if (i14 > 0) {
                int i15 = iArr[1];
                if (i15 > 23 || (i4 = iArr[2]) > 59 || (i8 = iArr[3]) > 59) {
                    throw new C1354c("Value out of range: Hour[0-23], Minute[0-59], Second[0-59]");
                }
                return c1411p.m3041f(EnumC1435a.OFFSET_SECONDS, ((i4 * 60) + (i15 * 3600) + i8) * i11, i, i14);
            }
        }
        return length2 == 0 ? c1411p.m3041f(EnumC1435a.OFFSET_SECONDS, 0L, i, i) : ~i;
    }

    /* renamed from: c */
    public static void m3016c(CharSequence charSequence, boolean z7, int[] iArr) {
        if (z7) {
            if (m3015b(charSequence, false, 1, iArr)) {
                return;
            }
            iArr[0] = ~iArr[0];
            return;
        }
        m3018e(charSequence, 1, 2, iArr);
    }

    /* renamed from: d */
    public static void m3017d(CharSequence charSequence, boolean z7, boolean z8, int[] iArr) {
        if (m3015b(charSequence, z7, 2, iArr) || !z8) {
            return;
        }
        iArr[0] = ~iArr[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0026  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m3015b(CharSequence charSequence, boolean z7, int i, int[] iArr) {
        int i4;
        int i8 = iArr[0];
        if (i8 < 0) {
            return true;
        }
        if (z7 && i != 1) {
            int i9 = i8 + 1;
            if (i9 <= charSequence.length() && charSequence.charAt(i8) == ':') {
                i8 = i9;
                i4 = i8 + 2;
                if (i4 <= charSequence.length()) {
                }
            }
        } else {
            i4 = i8 + 2;
            if (i4 <= charSequence.length()) {
                int i10 = i8 + 1;
                char cCharAt = charSequence.charAt(i8);
                char cCharAt2 = charSequence.charAt(i10);
                if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
                    int i11 = (cCharAt2 - '0') + ((cCharAt - '0') * 10);
                    if (i11 >= 0 && i11 <= 59) {
                        iArr[i] = i11;
                        iArr[0] = i4;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    public static void m3018e(CharSequence charSequence, int i, int i4, int[] iArr) {
        int i8;
        char cCharAt;
        int i9 = iArr[0];
        char[] cArr = new char[i4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < i4 && (i8 = i9 + 1) <= charSequence.length() && (cCharAt = charSequence.charAt(i9)) >= '0' && cCharAt <= '9') {
            cArr[i10] = cCharAt;
            i11++;
            i10++;
            i9 = i8;
        }
        if (i11 < i) {
            iArr[0] = ~iArr[0];
            return;
        }
        switch (i11) {
            case 1:
                iArr[1] = cArr[0] - '0';
                break;
            case 2:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                break;
            case 3:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                break;
            case 4:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                break;
            case 5:
                iArr[1] = cArr[0] - '0';
                iArr[2] = (cArr[2] - '0') + ((cArr[1] - '0') * 10);
                iArr[3] = (cArr[4] - '0') + ((cArr[3] - '0') * 10);
                break;
            case 6:
                iArr[1] = (cArr[1] - '0') + ((cArr[0] - '0') * 10);
                iArr[2] = (cArr[3] - '0') + ((cArr[2] - '0') * 10);
                iArr[3] = (cArr[5] - '0') + ((cArr[4] - '0') * 10);
                break;
        }
        iArr[0] = i9;
    }

    public final String toString() {
        String strReplace = this.f5519a.replace("'", "''");
        return "Offset(" + f5516d[this.f5520b] + ",'" + strReplace + "')";
    }
}
