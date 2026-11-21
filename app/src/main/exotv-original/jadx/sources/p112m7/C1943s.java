package p112m7;

import android.text.TextUtils;
import p063h1.C1132w;
import p183v0.C2522v;
import p183v0.InterfaceC2515o;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.s */
/* loaded from: classes.dex */
public final class C1943s implements InterfaceC2515o {

    /* renamed from: j */
    public final /* synthetic */ int f7232j;

    /* renamed from: k */
    public final String f7233k;

    public /* synthetic */ C1943s(String str, int i) {
        this.f7232j = i;
        this.f7233k = str;
    }

    /* renamed from: a */
    public static C1943s m3797a(C1132w c1132w) {
        String str;
        c1132w.m2514H(2);
        int iM2535u = c1132w.m2535u();
        int i = iM2535u >> 1;
        int iM2535u2 = ((c1132w.m2535u() >> 3) & 31) | ((iM2535u & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else {
            if (i != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iM2535u2 >= 10 ? "." : ".0");
        sb.append(iM2535u2);
        return new C1943s(sb.toString(), 1);
    }

    @Override // p183v0.InterfaceC2515o
    /* renamed from: e */
    public Object mo3798e() {
        return this;
    }

    @Override // p183v0.InterfaceC2515o
    /* renamed from: g */
    public boolean mo3799g(CharSequence charSequence, int i, int i4, C2522v c2522v) {
        if (!TextUtils.equals(charSequence.subSequence(i, i4), this.f7233k)) {
            return true;
        }
        c2522v.f9179c = (c2522v.f9179c & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.f7232j) {
            case 0:
                return "<" + this.f7233k + '>';
            default:
                return super.toString();
        }
    }
}
