package p108m3;

import android.content.Context;
import com.bumptech.glide.AbstractC0714c;
import java.util.List;
import p065h3.C1159d;
import p146q6.EnumC2273a;
import p151r3.AbstractC2300l;
import p151r3.C2299k;
import p151r3.C2301m;
import p154r6.AbstractC2320c;
import p160s3.C2357h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m3.j */
/* loaded from: classes.dex */
public final class C1895j {

    /* renamed from: a */
    public final C2299k f7097a;

    /* renamed from: b */
    public final List f7098b;

    /* renamed from: c */
    public final int f7099c;

    /* renamed from: d */
    public final C2299k f7100d;

    /* renamed from: e */
    public final C2357h f7101e;

    /* renamed from: f */
    public final C1159d f7102f;

    /* renamed from: g */
    public final boolean f7103g;

    public C1895j(C2299k c2299k, List list, int i, C2299k c2299k2, C2357h c2357h, C1159d c1159d, boolean z7) {
        this.f7097a = c2299k;
        this.f7098b = list;
        this.f7099c = i;
        this.f7100d = c2299k2;
        this.f7101e = c2357h;
        this.f7102f = c1159d;
        this.f7103g = z7;
    }

    /* renamed from: a */
    public final void m3670a(C2299k c2299k, C1893h c1893h) {
        Context context = c2299k.f8027a;
        C2299k c2299k2 = this.f7097a;
        if (context != c2299k2.f8027a) {
            throw new IllegalStateException(("Interceptor '" + c1893h + "' cannot modify the request's context.").toString());
        }
        if (c2299k.f8028b == C2301m.f8053b) {
            throw new IllegalStateException(("Interceptor '" + c1893h + "' cannot set the request's data to null.").toString());
        }
        if (c2299k.f8029c != c2299k2.f8029c) {
            throw new IllegalStateException(("Interceptor '" + c1893h + "' cannot modify the request's target.").toString());
        }
        if (c2299k.f8048v != c2299k2.f8048v) {
            throw new IllegalStateException(("Interceptor '" + c1893h + "' cannot modify the request's lifecycle.").toString());
        }
        if (c2299k.f8049w == c2299k2.f8049w) {
            return;
        }
        throw new IllegalStateException(("Interceptor '" + c1893h + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3671b(C2299k c2299k, AbstractC2320c abstractC2320c) throws Throwable {
        C1894i c1894i;
        C1893h c1893h;
        C1895j c1895j;
        if (abstractC2320c instanceof C1894i) {
            c1894i = (C1894i) abstractC2320c;
            int i = c1894i.f7096q;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1894i.f7096q = i - Integer.MIN_VALUE;
            } else {
                c1894i = new C1894i(this, abstractC2320c);
            }
        }
        Object obj = c1894i.f7094o;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = c1894i.f7096q;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(obj);
            List list = this.f7098b;
            int i8 = this.f7099c;
            if (i8 > 0) {
                m3670a(c2299k, (C1893h) list.get(i8 - 1));
            }
            C1893h c1893h2 = (C1893h) list.get(i8);
            C1895j c1895j2 = new C1895j(this.f7097a, this.f7098b, i8 + 1, c2299k, this.f7101e, this.f7102f, this.f7103g);
            c1894i.f7092m = this;
            c1894i.f7093n = c1893h2;
            c1894i.f7096q = 1;
            Object objM3669d = c1893h2.m3669d(c1895j2, c1894i);
            if (objM3669d == enumC2273a) {
                return enumC2273a;
            }
            obj = objM3669d;
            c1893h = c1893h2;
            c1895j = this;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1893h = c1894i.f7093n;
            c1895j = c1894i.f7092m;
            AbstractC0714c.m1516d0(obj);
        }
        AbstractC2300l abstractC2300l = (AbstractC2300l) obj;
        c1895j.m3670a(abstractC2300l.mo4095b(), c1893h);
        return abstractC2300l;
    }
}
