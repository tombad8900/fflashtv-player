package p073i3;

import com.bumptech.glide.AbstractC0714c;
import java.io.Closeable;
import p185v3.AbstractC2536f;
import p189v7.AbstractC2557b;
import p189v7.AbstractC2585p;
import p189v7.C2558b0;
import p189v7.C2564e0;
import p189v7.InterfaceC2577l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i3.n */
/* loaded from: classes.dex */
public final class C1265n extends AbstractC1266o {

    /* renamed from: j */
    public final C2558b0 f5268j;

    /* renamed from: k */
    public final AbstractC2585p f5269k;

    /* renamed from: l */
    public final String f5270l;

    /* renamed from: m */
    public final Closeable f5271m;

    /* renamed from: n */
    public boolean f5272n;

    /* renamed from: o */
    public C2564e0 f5273o;

    public C1265n(C2558b0 c2558b0, AbstractC2585p abstractC2585p, String str, Closeable closeable) {
        this.f5268j = c2558b0;
        this.f5269k = abstractC2585p;
        this.f5270l = str;
        this.f5271m = closeable;
    }

    @Override // p073i3.AbstractC1266o
    /* renamed from: b */
    public final AbstractC0714c mo2736b() {
        return null;
    }

    @Override // p073i3.AbstractC1266o
    /* renamed from: c */
    public final synchronized InterfaceC2577l mo2737c() {
        if (this.f5272n) {
            throw new IllegalStateException("closed");
        }
        C2564e0 c2564e0 = this.f5273o;
        if (c2564e0 != null) {
            return c2564e0;
        }
        C2564e0 c2564e0M4578c = AbstractC2557b.m4578c(this.f5269k.mo3163l(this.f5268j));
        this.f5273o = c2564e0M4578c;
        return c2564e0M4578c;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f5272n = true;
            C2564e0 c2564e0 = this.f5273o;
            if (c2564e0 != null) {
                AbstractC2536f.m4554a(c2564e0);
            }
            Closeable closeable = this.f5271m;
            if (closeable != null) {
                AbstractC2536f.m4554a(closeable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
