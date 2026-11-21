package p005a4;

import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import p015b4.C0570d;
import p015b4.C0571e;
import p015b4.C0572f;
import p015b4.InterfaceC0574h;
import p178u4.AbstractC2478m;
import p178u4.C2474i;
import p210y3.C2804h;
import p210y3.InterfaceC2801e;
import p210y3.InterfaceC2808l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a4.h0 */
/* loaded from: classes.dex */
public final class C0084h0 implements InterfaceC2801e {

    /* renamed from: j */
    public static final C2474i f357j = new C2474i(50);

    /* renamed from: b */
    public final C0572f f358b;

    /* renamed from: c */
    public final InterfaceC2801e f359c;

    /* renamed from: d */
    public final InterfaceC2801e f360d;

    /* renamed from: e */
    public final int f361e;

    /* renamed from: f */
    public final int f362f;

    /* renamed from: g */
    public final Class f363g;

    /* renamed from: h */
    public final C2804h f364h;

    /* renamed from: i */
    public final InterfaceC2808l f365i;

    public C0084h0(C0572f c0572f, InterfaceC2801e interfaceC2801e, InterfaceC2801e interfaceC2801e2, int i, int i4, InterfaceC2808l interfaceC2808l, Class cls, C2804h c2804h) {
        this.f358b = c0572f;
        this.f359c = interfaceC2801e;
        this.f360d = interfaceC2801e2;
        this.f361e = i;
        this.f362f = i4;
        this.f365i = interfaceC2808l;
        this.f363g = cls;
        this.f364h = c2804h;
    }

    @Override // p210y3.InterfaceC2801e
    /* renamed from: a */
    public final void mo309a(MessageDigest messageDigest) {
        Object objM1321e;
        C0572f c0572f = this.f358b;
        synchronized (c0572f) {
            C0571e c0571e = c0572f.f2284b;
            InterfaceC0574h interfaceC0574hM1316j = (InterfaceC0574h) ((ArrayDeque) c0571e.f933j).poll();
            if (interfaceC0574hM1316j == null) {
                interfaceC0574hM1316j = c0571e.m1316j();
            }
            C0570d c0570d = (C0570d) interfaceC0574hM1316j;
            c0570d.f2280b = 8;
            c0570d.f2281c = byte[].class;
            objM1321e = c0572f.m1321e(c0570d, byte[].class);
        }
        byte[] bArr = (byte[]) objM1321e;
        ByteBuffer.wrap(bArr).putInt(this.f361e).putInt(this.f362f).array();
        this.f360d.mo309a(messageDigest);
        this.f359c.mo309a(messageDigest);
        messageDigest.update(bArr);
        InterfaceC2808l interfaceC2808l = this.f365i;
        if (interfaceC2808l != null) {
            interfaceC2808l.mo309a(messageDigest);
        }
        this.f364h.mo309a(messageDigest);
        C2474i c2474i = f357j;
        Class cls = this.f363g;
        byte[] bytes = (byte[]) c2474i.m4448a(cls);
        if (bytes == null) {
            bytes = cls.getName().getBytes(InterfaceC2801e.f10418a);
            c2474i.m4449d(cls, bytes);
        }
        messageDigest.update(bytes);
        this.f358b.m1323g(bArr);
    }

    @Override // p210y3.InterfaceC2801e
    public final boolean equals(Object obj) {
        if (obj instanceof C0084h0) {
            C0084h0 c0084h0 = (C0084h0) obj;
            if (this.f362f == c0084h0.f362f && this.f361e == c0084h0.f361e && AbstractC2478m.m4454b(this.f365i, c0084h0.f365i) && this.f363g.equals(c0084h0.f363g) && this.f359c.equals(c0084h0.f359c) && this.f360d.equals(c0084h0.f360d) && this.f364h.equals(c0084h0.f364h)) {
                return true;
            }
        }
        return false;
    }

    @Override // p210y3.InterfaceC2801e
    public final int hashCode() {
        int iHashCode = ((((this.f360d.hashCode() + (this.f359c.hashCode() * 31)) * 31) + this.f361e) * 31) + this.f362f;
        InterfaceC2808l interfaceC2808l = this.f365i;
        if (interfaceC2808l != null) {
            iHashCode = (iHashCode * 31) + interfaceC2808l.hashCode();
        }
        return this.f364h.f10424b.hashCode() + ((this.f363g.hashCode() + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        return "ResourceCacheKey{sourceKey=" + this.f359c + ", signature=" + this.f360d + ", width=" + this.f361e + ", height=" + this.f362f + ", decodedResourceClass=" + this.f363g + ", transformation='" + this.f365i + "', options=" + this.f364h + '}';
    }
}
