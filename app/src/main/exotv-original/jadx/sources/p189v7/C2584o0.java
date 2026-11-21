package p189v7;

import com.bumptech.glide.AbstractC0715d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import p111m6.AbstractC1913h;
import p182v.C2490e;
import p198w7.AbstractC2706b;
import p198w7.AbstractC2707c;
import p198w7.C2709e;
import p198w7.C2711g;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v7.o0 */
/* loaded from: classes.dex */
public final class C2584o0 extends AbstractC2585p {

    /* renamed from: e */
    public static final C2558b0 f9326e;

    /* renamed from: b */
    public final C2558b0 f9327b;

    /* renamed from: c */
    public final AbstractC2585p f9328c;

    /* renamed from: d */
    public final LinkedHashMap f9329d;

    static {
        String str = C2558b0.f9272k;
        f9326e = C2556a0.m4571c("/");
    }

    public C2584o0(C2558b0 c2558b0, AbstractC2585p abstractC2585p, LinkedHashMap linkedHashMap) {
        this.f9327b = c2558b0;
        this.f9328c = abstractC2585p;
        this.f9329d = linkedHashMap;
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: a */
    public final InterfaceC2572i0 mo3155a(C2558b0 c2558b0) throws IOException {
        AbstractC2980h.m5136e("file", c2558b0);
        throw new IOException("zip file systems are read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: b */
    public final void mo3156b(C2558b0 c2558b0, C2558b0 c2558b02) throws IOException {
        AbstractC2980h.m5136e("source", c2558b0);
        AbstractC2980h.m5136e("target", c2558b02);
        throw new IOException("zip file systems are read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: c */
    public final void mo3157c(C2558b0 c2558b0) throws IOException {
        throw new IOException("zip file systems are read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: d */
    public final void mo3158d(C2558b0 c2558b0) throws IOException {
        AbstractC2980h.m5136e("path", c2558b0);
        throw new IOException("zip file systems are read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: g */
    public final List mo3159g(C2558b0 c2558b0) throws IOException {
        C2558b0 c2558b02 = f9326e;
        c2558b02.getClass();
        C2711g c2711g = (C2711g) this.f9329d.get(AbstractC2707c.m4769b(c2558b02, c2558b0, true));
        if (c2711g != null) {
            return AbstractC1913h.m3747L0(c2711g.f9854q);
        }
        throw new IOException("not a directory: " + c2558b0);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0125  */
    @Override // p189v7.AbstractC2585p
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2490e mo3160i(C2558b0 c2558b0) throws Throwable {
        Long lValueOf;
        long j;
        Long l8;
        Long lValueOf2;
        Long l9;
        Long l10;
        Long lValueOf3;
        Throwable th;
        Throwable th2;
        C2711g c2711gM4766f;
        AbstractC2980h.m5136e("path", c2558b0);
        C2558b0 c2558b02 = f9326e;
        c2558b02.getClass();
        C2711g c2711g = (C2711g) this.f9329d.get(AbstractC2707c.m4769b(c2558b02, c2558b0, true));
        if (c2711g == null) {
            return null;
        }
        long j8 = c2711g.f9845h;
        if (j8 != -1) {
            C2591v c2591vMo3161j = this.f9328c.mo3161j(this.f9327b);
            try {
                C2564e0 c2564e0M4578c = AbstractC2557b.m4578c(c2591vMo3161j.m4683b(j8));
                try {
                    c2711gM4766f = AbstractC2706b.m4766f(c2564e0M4578c, c2711g);
                    AbstractC2980h.m5133b(c2711gM4766f);
                    try {
                        c2564e0M4578c.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } catch (Throwable th4) {
                    try {
                        c2564e0M4578c.close();
                    } catch (Throwable th5) {
                        AbstractC0715d.m1557e(th4, th5);
                    }
                    th2 = th4;
                    c2711gM4766f = null;
                }
            } catch (Throwable th6) {
                th = th6;
                if (c2591vMo3161j != null) {
                    try {
                        c2591vMo3161j.close();
                    } catch (Throwable th7) {
                        AbstractC0715d.m1557e(th, th7);
                    }
                }
                c2711g = null;
            }
            if (th2 != null) {
                throw th2;
            }
            try {
                c2591vMo3161j.close();
                th = null;
            } catch (Throwable th8) {
                th = th8;
            }
            th = th;
            c2711g = c2711gM4766f;
            if (th != null) {
                throw th;
            }
        }
        boolean z7 = c2711g.f9839b;
        boolean z8 = !z7;
        Long lValueOf4 = z7 ? null : Long.valueOf(c2711g.f9843f);
        Long l11 = c2711g.f9850m;
        if (l11 != null) {
            lValueOf = Long.valueOf((l11.longValue() / 10000) - 11644473600000L);
        } else {
            lValueOf = c2711g.f9853p != null ? Long.valueOf(r2.intValue() * 1000) : null;
        }
        Long l12 = c2711g.f9848k;
        if (l12 != null) {
            j = 11644473600000L;
            lValueOf2 = Long.valueOf((l12.longValue() / 10000) - 11644473600000L);
        } else {
            j = 11644473600000L;
            if (c2711g.f9851n == null) {
                int i = c2711g.f9847j;
                if (i != -1) {
                    int i4 = c2711g.f9846i;
                    if (i != -1) {
                        int i8 = (i >> 11) & 31;
                        int i9 = (i >> 5) & 63;
                        int i10 = (i & 31) << 1;
                        GregorianCalendar gregorianCalendar = new GregorianCalendar();
                        gregorianCalendar.set(14, 0);
                        gregorianCalendar.set(((i4 >> 9) & 127) + 1980, ((i4 >> 5) & 15) - 1, i4 & 31, i8, i9, i10);
                        lValueOf2 = Long.valueOf(gregorianCalendar.getTime().getTime());
                    }
                }
                l8 = null;
                l9 = c2711g.f9849l;
                if (l9 == null) {
                    lValueOf3 = Long.valueOf((l9.longValue() / 10000) - j);
                } else {
                    if (c2711g.f9852o == null) {
                        l10 = null;
                        return new C2490e(z8, z7, null, lValueOf4, lValueOf, l8, l10);
                    }
                    lValueOf3 = Long.valueOf(r0.intValue() * 1000);
                }
                l10 = lValueOf3;
                return new C2490e(z8, z7, null, lValueOf4, lValueOf, l8, l10);
            }
            lValueOf2 = Long.valueOf(r3.intValue() * 1000);
        }
        l8 = lValueOf2;
        l9 = c2711g.f9849l;
        if (l9 == null) {
        }
        l10 = lValueOf3;
        return new C2490e(z8, z7, null, lValueOf4, lValueOf, l8, l10);
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: j */
    public final C2591v mo3161j(C2558b0 c2558b0) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: k */
    public final InterfaceC2572i0 mo3162k(C2558b0 c2558b0) throws IOException {
        AbstractC2980h.m5136e("file", c2558b0);
        throw new IOException("zip file systems are read-only");
    }

    @Override // p189v7.AbstractC2585p
    /* renamed from: l */
    public final InterfaceC2576k0 mo3163l(C2558b0 c2558b0) throws Throwable {
        Throwable th;
        C2564e0 c2564e0M4578c;
        AbstractC2980h.m5136e("file", c2558b0);
        C2558b0 c2558b02 = f9326e;
        c2558b02.getClass();
        C2711g c2711g = (C2711g) this.f9329d.get(AbstractC2707c.m4769b(c2558b02, c2558b0, true));
        if (c2711g == null) {
            throw new FileNotFoundException("no such file: " + c2558b0);
        }
        long j = c2711g.f9843f;
        C2591v c2591vMo3161j = this.f9328c.mo3161j(this.f9327b);
        try {
            c2564e0M4578c = AbstractC2557b.m4578c(c2591vMo3161j.m4683b(c2711g.f9845h));
            try {
                c2591vMo3161j.close();
                th = null;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            if (c2591vMo3161j != null) {
                try {
                    c2591vMo3161j.close();
                } catch (Throwable th4) {
                    AbstractC0715d.m1557e(th3, th4);
                }
            }
            th = th3;
            c2564e0M4578c = null;
        }
        if (th != null) {
            throw th;
        }
        AbstractC2980h.m5136e("<this>", c2564e0M4578c);
        AbstractC2706b.m4766f(c2564e0M4578c, null);
        if (c2711g.f9844g == 0) {
            return new C2709e(c2564e0M4578c, j, true);
        }
        return new C2709e(new C2590u(AbstractC2557b.m4578c(new C2709e(c2564e0M4578c, c2711g.f9842e, true)), new Inflater(true)), j, false);
    }
}
