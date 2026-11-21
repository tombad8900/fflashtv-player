package p077j$.time.format;

import java.text.ParsePosition;

/* renamed from: j$.time.format.k */
/* loaded from: classes2.dex */
public class C1406k {

    /* renamed from: a */
    public String f5522a;

    /* renamed from: b */
    public String f5523b;

    /* renamed from: c */
    public final char f5524c;

    /* renamed from: d */
    public C1406k f5525d;

    /* renamed from: e */
    public C1406k f5526e;

    /* renamed from: b */
    public boolean mo3019b(char c8, char c9) {
        return c8 == c9;
    }

    public C1406k(String str, String str2, C1406k c1406k) {
        this.f5522a = str;
        this.f5523b = str2;
        this.f5525d = c1406k;
        if (str.isEmpty()) {
            this.f5524c = '\uffff';
        } else {
            this.f5524c = this.f5522a.charAt(0);
        }
    }

    /* renamed from: c */
    public final String m3023c(CharSequence charSequence, ParsePosition parsePosition) {
        int index = parsePosition.getIndex();
        int length = charSequence.length();
        if (!mo3021e(charSequence, index, length)) {
            return null;
        }
        int length2 = this.f5522a.length() + index;
        C1406k c1406k = this.f5525d;
        if (c1406k != null && length2 != length) {
            while (true) {
                if (mo3019b(c1406k.f5524c, charSequence.charAt(length2))) {
                    parsePosition.setIndex(length2);
                    String strM3023c = c1406k.m3023c(charSequence, parsePosition);
                    if (strM3023c != null) {
                        return strM3023c;
                    }
                } else {
                    c1406k = c1406k.f5526e;
                    if (c1406k == null) {
                        break;
                    }
                }
            }
        }
        parsePosition.setIndex(length2);
        return this.f5523b;
    }

    /* renamed from: d */
    public C1406k mo3020d(String str, String str2, C1406k c1406k) {
        return new C1406k(str, str2, c1406k);
    }

    /* renamed from: e */
    public boolean mo3021e(CharSequence charSequence, int i, int i4) {
        if (charSequence instanceof String) {
            return ((String) charSequence).startsWith(this.f5522a, i);
        }
        int length = this.f5522a.length();
        if (length > i4 - i) {
            return false;
        }
        int i8 = 0;
        while (true) {
            int i9 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i10 = i8 + 1;
            int i11 = i + 1;
            if (!mo3019b(this.f5522a.charAt(i8), charSequence.charAt(i))) {
                return false;
            }
            i = i11;
            length = i9;
            i8 = i10;
        }
    }

    /* renamed from: a */
    public final boolean m3022a(String str, String str2) {
        int i = 0;
        while (i < str.length() && i < this.f5522a.length() && mo3019b(str.charAt(i), this.f5522a.charAt(i))) {
            i++;
        }
        if (i == this.f5522a.length()) {
            if (i < str.length()) {
                String strSubstring = str.substring(i);
                for (C1406k c1406k = this.f5525d; c1406k != null; c1406k = c1406k.f5526e) {
                    if (mo3019b(c1406k.f5524c, strSubstring.charAt(0))) {
                        return c1406k.m3022a(strSubstring, str2);
                    }
                }
                C1406k c1406kMo3020d = mo3020d(strSubstring, str2, null);
                c1406kMo3020d.f5526e = this.f5525d;
                this.f5525d = c1406kMo3020d;
                return true;
            }
            this.f5523b = str2;
            return true;
        }
        C1406k c1406kMo3020d2 = mo3020d(this.f5522a.substring(i), this.f5523b, this.f5525d);
        this.f5522a = str.substring(0, i);
        this.f5525d = c1406kMo3020d2;
        if (i < str.length()) {
            this.f5525d.f5526e = mo3020d(str.substring(i), str2, null);
            this.f5523b = null;
            return true;
        }
        this.f5523b = str2;
        return true;
    }
}
