package p077j$.time.format;

/* renamed from: j$.time.format.m */
/* loaded from: classes2.dex */
public final class C1408m implements InterfaceC1400e {

    /* renamed from: a */
    public final String f5528a;

    public C1408m(String str) {
        this.f5528a = str;
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: w */
    public final boolean mo3009w(C1413r c1413r, StringBuilder sb) {
        sb.append(this.f5528a);
        return true;
    }

    @Override // p077j$.time.format.InterfaceC1400e
    /* renamed from: A */
    public final int mo3008A(C1411p c1411p, CharSequence charSequence, int i) {
        if (i > charSequence.length() || i < 0) {
            throw new IndexOutOfBoundsException();
        }
        String str = this.f5528a;
        return !c1411p.m3042g(charSequence, i, str, 0, str.length()) ? ~i : str.length() + i;
    }

    public final String toString() {
        return "'" + this.f5528a.replace("'", "''") + "'";
    }
}
