package p088k0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k0.a */
/* loaded from: classes.dex */
public final class C1546a {

    /* renamed from: e */
    public static final byte[] f5923e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f5924a;

    /* renamed from: b */
    public final int f5925b;

    /* renamed from: c */
    public int f5926c;

    /* renamed from: d */
    public char f5927d;

    static {
        for (int i = 0; i < 1792; i++) {
            f5923e[i] = Character.getDirectionality(i);
        }
    }

    public C1546a(CharSequence charSequence) {
        this.f5924a = charSequence;
        this.f5925b = charSequence.length();
    }

    /* renamed from: a */
    public final byte m3224a() {
        int i = this.f5926c - 1;
        CharSequence charSequence = this.f5924a;
        char cCharAt = charSequence.charAt(i);
        this.f5927d = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f5926c);
            this.f5926c -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f5926c--;
        char c8 = this.f5927d;
        return c8 < '\u0700' ? f5923e[c8] : Character.getDirectionality(c8);
    }
}
