package p077j$.time.format;

/* renamed from: j$.time.format.c */
/* loaded from: classes2.dex */
public final class C1398c implements InterfaceC1400e {

    /* renamed from: a */
    public final char f5503a;

    public C1398c(char c8) {
        this.f5503a = c8;
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: w */
    public final boolean mo3009w(C1413r c1413r, StringBuilder sb) {
        sb.append(this.f5503a);
        return true;
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: A */
    public final int mo3008A(C1411p c1411p, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char cCharAt = charSequence.charAt(i);
        char c8 = this.f5503a;
        return (cCharAt == c8 || (!c1411p.f5540b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c8) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c8)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c8 = this.f5503a;
        if (c8 == '\'') {
            return "''";
        }
        return "'" + c8 + "'";
    }
}
