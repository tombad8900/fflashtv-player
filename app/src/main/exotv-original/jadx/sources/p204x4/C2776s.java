package p204x4;

import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.s */
/* loaded from: classes.dex */
public final class C2776s {

    /* renamed from: a */
    public final long f10294a;

    /* renamed from: b */
    public final long f10295b;

    /* renamed from: c */
    public final String f10296c;

    public C2776s(String str, long j, long j8) {
        AbstractC2980h.m5136e("text", str);
        this.f10294a = j;
        this.f10295b = j8;
        this.f10296c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2776s)) {
            return false;
        }
        C2776s c2776s = (C2776s) obj;
        return this.f10294a == c2776s.f10294a && this.f10295b == c2776s.f10295b && AbstractC2980h.m5132a(this.f10296c, c2776s.f10296c);
    }

    public final int hashCode() {
        return this.f10296c.hashCode() + ((Long.hashCode(this.f10295b) + (Long.hashCode(this.f10294a) * 31)) * 31);
    }

    public final String toString() {
        return "Cue(startMs=" + this.f10294a + ", endMs=" + this.f10295b + ", text=" + this.f10296c + ")";
    }
}
