package p043e6;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e6.b */
/* loaded from: classes.dex */
public final class C0914b extends AbstractC0913a {

    /* renamed from: j */
    public final char f3967j;

    public C0914b(char c8) {
        this.f3967j = c8;
    }

    @Override // p043e6.AbstractC0913a
    /* renamed from: a */
    public final boolean mo2083a(char c8) {
        return c8 == this.f3967j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.is('");
        char[] cArr = new char[6];
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        char c8 = this.f3967j;
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c8 & 15);
            c8 = (char) (c8 >> 4);
        }
        sb.append(String.copyValueOf(cArr));
        sb.append("')");
        return sb.toString();
    }
}
