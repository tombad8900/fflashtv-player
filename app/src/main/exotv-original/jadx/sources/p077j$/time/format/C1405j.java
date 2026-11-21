package p077j$.time.format;

/* renamed from: j$.time.format.j */
/* loaded from: classes2.dex */
public final class C1405j extends C1406k {
    @Override // p077j$.time.format.C1406k
    /* renamed from: d */
    public final C1406k mo3020d(String str, String str2, C1406k c1406k) {
        return new C1405j(str, str2, c1406k);
    }

    @Override // p077j$.time.format.C1406k
    /* renamed from: b */
    public final boolean mo3019b(char c8, char c9) {
        return C1411p.m3036b(c8, c9);
    }

    @Override // p077j$.time.format.C1406k
    /* renamed from: e */
    public final boolean mo3021e(CharSequence charSequence, int i, int i4) {
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
            if (!C1411p.m3036b(this.f5522a.charAt(i8), charSequence.charAt(i))) {
                return false;
            }
            i = i11;
            length = i9;
            i8 = i10;
        }
    }
}
