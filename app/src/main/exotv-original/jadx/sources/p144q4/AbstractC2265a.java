package p144q4;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.source.ProgressiveMediaSource;
import com.bumptech.glide.EnumC0717f;
import p005a4.C0093n;
import p066h4.AbstractC1170d;
import p066h4.C1179m;
import p066h4.C1184r;
import p100l4.C1674b;
import p100l4.C1675c;
import p170t4.C2434a;
import p170t4.C2435b;
import p178u4.AbstractC2470e;
import p178u4.AbstractC2478m;
import p178u4.C2467b;
import p210y3.C2803g;
import p210y3.C2804h;
import p210y3.InterfaceC2801e;
import p210y3.InterfaceC2808l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q4.a */
/* loaded from: classes.dex */
public abstract class AbstractC2265a implements Cloneable {

    /* renamed from: j */
    public int f7891j;

    /* renamed from: q */
    public boolean f7898q;

    /* renamed from: u */
    public boolean f7902u;

    /* renamed from: v */
    public boolean f7903v;

    /* renamed from: x */
    public boolean f7905x;

    /* renamed from: k */
    public C0093n f7892k = C0093n.f438e;

    /* renamed from: l */
    public EnumC0717f f7893l = EnumC0717f.f2813l;

    /* renamed from: m */
    public boolean f7894m = true;

    /* renamed from: n */
    public int f7895n = -1;

    /* renamed from: o */
    public int f7896o = -1;

    /* renamed from: p */
    public InterfaceC2801e f7897p = C2434a.f8787b;

    /* renamed from: r */
    public C2804h f7899r = new C2804h();

    /* renamed from: s */
    public C2467b f7900s = new C2467b(0);

    /* renamed from: t */
    public Class f7901t = Object.class;

    /* renamed from: w */
    public boolean f7904w = true;

    /* renamed from: f */
    public static boolean m4052f(int i, int i4) {
        return (i & i4) != 0;
    }

    /* renamed from: a */
    public AbstractC2265a mo1620a(AbstractC2265a abstractC2265a) {
        if (this.f7903v) {
            return clone().mo1620a(abstractC2265a);
        }
        int i = abstractC2265a.f7891j;
        if (m4052f(abstractC2265a.f7891j, ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES)) {
            this.f7905x = abstractC2265a.f7905x;
        }
        if (m4052f(abstractC2265a.f7891j, 4)) {
            this.f7892k = abstractC2265a.f7892k;
        }
        if (m4052f(abstractC2265a.f7891j, 8)) {
            this.f7893l = abstractC2265a.f7893l;
        }
        if (m4052f(abstractC2265a.f7891j, 16)) {
            this.f7891j &= -33;
        }
        if (m4052f(abstractC2265a.f7891j, 32)) {
            this.f7891j &= -17;
        }
        if (m4052f(abstractC2265a.f7891j, 64)) {
            this.f7891j &= -129;
        }
        if (m4052f(abstractC2265a.f7891j, 128)) {
            this.f7891j &= -65;
        }
        if (m4052f(abstractC2265a.f7891j, 256)) {
            this.f7894m = abstractC2265a.f7894m;
        }
        if (m4052f(abstractC2265a.f7891j, 512)) {
            this.f7896o = abstractC2265a.f7896o;
            this.f7895n = abstractC2265a.f7895n;
        }
        if (m4052f(abstractC2265a.f7891j, 1024)) {
            this.f7897p = abstractC2265a.f7897p;
        }
        if (m4052f(abstractC2265a.f7891j, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED)) {
            this.f7901t = abstractC2265a.f7901t;
        }
        if (m4052f(abstractC2265a.f7891j, DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED)) {
            this.f7891j &= -16385;
        }
        if (m4052f(abstractC2265a.f7891j, 16384)) {
            this.f7891j &= -8193;
        }
        if (m4052f(abstractC2265a.f7891j, 131072)) {
            this.f7898q = abstractC2265a.f7898q;
        }
        if (m4052f(abstractC2265a.f7891j, 2048)) {
            this.f7900s.putAll(abstractC2265a.f7900s);
            this.f7904w = abstractC2265a.f7904w;
        }
        this.f7891j |= abstractC2265a.f7891j;
        this.f7899r.f10424b.mo3993g(abstractC2265a.f7899r.f10424b);
        m4059j();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC2265a clone() {
        try {
            AbstractC2265a abstractC2265a = (AbstractC2265a) super.clone();
            C2804h c2804h = new C2804h();
            abstractC2265a.f7899r = c2804h;
            c2804h.f10424b.mo3993g(this.f7899r.f10424b);
            C2467b c2467b = new C2467b(0);
            abstractC2265a.f7900s = c2467b;
            c2467b.putAll(this.f7900s);
            abstractC2265a.f7902u = false;
            abstractC2265a.f7903v = false;
            return abstractC2265a;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public final AbstractC2265a m4053c(Class cls) {
        if (this.f7903v) {
            return clone().m4053c(cls);
        }
        this.f7901t = cls;
        this.f7891j |= DecoderReuseEvaluation.DISCARD_REASON_AUDIO_CHANNEL_COUNT_CHANGED;
        m4059j();
        return this;
    }

    /* renamed from: d */
    public final AbstractC2265a m4054d(C0093n c0093n) {
        if (this.f7903v) {
            return clone().m4054d(c0093n);
        }
        this.f7892k = c0093n;
        this.f7891j |= 4;
        m4059j();
        return this;
    }

    /* renamed from: e */
    public final boolean m4055e(AbstractC2265a abstractC2265a) {
        abstractC2265a.getClass();
        if (Float.compare(1.0f, 1.0f) != 0) {
            return false;
        }
        char[] cArr = AbstractC2478m.f9069a;
        return this.f7894m == abstractC2265a.f7894m && this.f7895n == abstractC2265a.f7895n && this.f7896o == abstractC2265a.f7896o && this.f7898q == abstractC2265a.f7898q && this.f7892k.equals(abstractC2265a.f7892k) && this.f7893l == abstractC2265a.f7893l && this.f7899r.equals(abstractC2265a.f7899r) && this.f7900s.equals(abstractC2265a.f7900s) && this.f7901t.equals(abstractC2265a.f7901t) && this.f7897p.equals(abstractC2265a.f7897p);
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC2265a) {
            return m4055e((AbstractC2265a) obj);
        }
        return false;
    }

    /* renamed from: g */
    public final AbstractC2265a m4056g(C1179m c1179m, AbstractC1170d abstractC1170d) {
        if (this.f7903v) {
            return clone().m4056g(c1179m, abstractC1170d);
        }
        m4060k(C1179m.f5034g, c1179m);
        return m4064o(abstractC1170d, false);
    }

    /* renamed from: h */
    public final AbstractC2265a m4057h(int i, int i4) {
        if (this.f7903v) {
            return clone().m4057h(i, i4);
        }
        this.f7896o = i;
        this.f7895n = i4;
        this.f7891j |= 512;
        m4059j();
        return this;
    }

    public int hashCode() {
        char[] cArr = AbstractC2478m.f9069a;
        return AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4460h(AbstractC2478m.m4459g(0, AbstractC2478m.m4459g(0, AbstractC2478m.m4459g(1, AbstractC2478m.m4459g(this.f7898q ? 1 : 0, AbstractC2478m.m4459g(this.f7896o, AbstractC2478m.m4459g(this.f7895n, AbstractC2478m.m4459g(this.f7894m ? 1 : 0, AbstractC2478m.m4460h(AbstractC2478m.m4459g(0, AbstractC2478m.m4460h(AbstractC2478m.m4459g(0, AbstractC2478m.m4460h(AbstractC2478m.m4459g(0, AbstractC2478m.m4459g(Float.floatToIntBits(1.0f), 17)), null)), null)), null)))))))), this.f7892k), this.f7893l), this.f7899r), this.f7900s), this.f7901t), this.f7897p), null);
    }

    /* renamed from: i */
    public final AbstractC2265a m4058i() {
        if (this.f7903v) {
            return clone().m4058i();
        }
        this.f7893l = EnumC0717f.f2814m;
        this.f7891j |= 8;
        m4059j();
        return this;
    }

    /* renamed from: j */
    public final void m4059j() {
        if (this.f7902u) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    /* renamed from: k */
    public final AbstractC2265a m4060k(C2803g c2803g, C1179m c1179m) {
        if (this.f7903v) {
            return clone().m4060k(c2803g, c1179m);
        }
        AbstractC2470e.m4445b(c2803g);
        this.f7899r.f10424b.put(c2803g, c1179m);
        m4059j();
        return this;
    }

    /* renamed from: l */
    public final AbstractC2265a m4061l(C2435b c2435b) {
        if (this.f7903v) {
            return clone().m4061l(c2435b);
        }
        this.f7897p = c2435b;
        this.f7891j |= 1024;
        m4059j();
        return this;
    }

    /* renamed from: m */
    public final AbstractC2265a m4062m() {
        if (this.f7903v) {
            return clone().m4062m();
        }
        this.f7894m = false;
        this.f7891j |= 256;
        m4059j();
        return this;
    }

    /* renamed from: n */
    public final AbstractC2265a m4063n(Class cls, InterfaceC2808l interfaceC2808l, boolean z7) {
        if (this.f7903v) {
            return clone().m4063n(cls, interfaceC2808l, z7);
        }
        AbstractC2470e.m4445b(interfaceC2808l);
        this.f7900s.put(cls, interfaceC2808l);
        int i = this.f7891j;
        this.f7891j = 67584 | i;
        this.f7904w = false;
        if (z7) {
            this.f7891j = i | 198656;
            this.f7898q = true;
        }
        m4059j();
        return this;
    }

    /* renamed from: o */
    public final AbstractC2265a m4064o(InterfaceC2808l interfaceC2808l, boolean z7) {
        if (this.f7903v) {
            return clone().m4064o(interfaceC2808l, z7);
        }
        C1184r c1184r = new C1184r(interfaceC2808l, z7);
        m4063n(Bitmap.class, interfaceC2808l, z7);
        m4063n(Drawable.class, c1184r, z7);
        m4063n(BitmapDrawable.class, c1184r, z7);
        m4063n(C1674b.class, new C1675c(interfaceC2808l), z7);
        m4059j();
        return this;
    }

    /* renamed from: p */
    public final AbstractC2265a m4065p() {
        if (this.f7903v) {
            return clone().m4065p();
        }
        this.f7905x = true;
        this.f7891j |= ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES;
        m4059j();
        return this;
    }
}
