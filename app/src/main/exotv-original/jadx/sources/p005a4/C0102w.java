package p005a4;

import java.security.MessageDigest;
import java.util.Map;
import p178u4.AbstractC2470e;
import p210y3.C2804h;
import p210y3.InterfaceC2801e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.w */
/* loaded from: classes.dex */
public final class C0102w implements InterfaceC2801e {

    /* renamed from: b */
    public final Object f482b;

    /* renamed from: c */
    public final int f483c;

    /* renamed from: d */
    public final int f484d;

    /* renamed from: e */
    public final Class f485e;

    /* renamed from: f */
    public final Class f486f;

    /* renamed from: g */
    public final InterfaceC2801e f487g;

    /* renamed from: h */
    public final Map f488h;

    /* renamed from: i */
    public final C2804h f489i;

    /* renamed from: j */
    public int f490j;

    public C0102w(Object obj, InterfaceC2801e interfaceC2801e, int i, int i4, Map map, Class cls, Class cls2, C2804h c2804h) {
        AbstractC2470e.m4446c("Argument must not be null", obj);
        this.f482b = obj;
        this.f487g = interfaceC2801e;
        this.f483c = i;
        this.f484d = i4;
        AbstractC2470e.m4446c("Argument must not be null", map);
        this.f488h = map;
        AbstractC2470e.m4446c("Resource class must not be null", cls);
        this.f485e = cls;
        AbstractC2470e.m4446c("Transcode class must not be null", cls2);
        this.f486f = cls2;
        AbstractC2470e.m4446c("Argument must not be null", c2804h);
        this.f489i = c2804h;
    }

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        if (obj instanceof C0102w) {
            C0102w c0102w = (C0102w) obj;
            if (this.f482b.equals(c0102w.f482b) && this.f487g.equals(c0102w.f487g) && this.f484d == c0102w.f484d && this.f483c == c0102w.f483c && this.f488h.equals(c0102w.f488h) && this.f485e.equals(c0102w.f485e) && this.f486f.equals(c0102w.f486f) && this.f489i.equals(c0102w.f489i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        if (this.f490j == 0) {
            int iHashCode = this.f482b.hashCode();
            this.f490j = iHashCode;
            int iHashCode2 = ((((this.f487g.hashCode() + (iHashCode * 31)) * 31) + this.f483c) * 31) + this.f484d;
            this.f490j = iHashCode2;
            int iHashCode3 = this.f488h.hashCode() + (iHashCode2 * 31);
            this.f490j = iHashCode3;
            int iHashCode4 = this.f485e.hashCode() + (iHashCode3 * 31);
            this.f490j = iHashCode4;
            int iHashCode5 = this.f486f.hashCode() + (iHashCode4 * 31);
            this.f490j = iHashCode5;
            this.f490j = this.f489i.f10424b.hashCode() + (iHashCode5 * 31);
        }
        return this.f490j;
    }

    public final String toString() {
        return "EngineKey{model=" + this.f482b + ", width=" + this.f483c + ", height=" + this.f484d + ", resourceClass=" + this.f485e + ", transcodeClass=" + this.f486f + ", signature=" + this.f487g + ", hashCode=" + this.f490j + ", transformations=" + this.f488h + ", options=" + this.f489i + '}';
    }
}
