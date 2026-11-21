package p183v0;

import android.graphics.Rect;
import android.view.View;
import p216z2.AbstractC2888f0;
import p216z2.C2913s;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.f */
/* loaded from: classes.dex */
public abstract class AbstractC2506f {

    /* renamed from: a */
    public int f9138a;

    /* renamed from: b */
    public final Object f9139b;

    /* renamed from: c */
    public final Object f9140c;

    public AbstractC2506f(AbstractC2888f0 abstractC2888f0) {
        this.f9138a = Integer.MIN_VALUE;
        this.f9140c = new Rect();
        this.f9139b = abstractC2888f0;
    }

    /* renamed from: a */
    public static AbstractC2506f m4506a(AbstractC2888f0 abstractC2888f0, int i) {
        if (i == 0) {
            return new C2913s(abstractC2888f0, 0);
        }
        if (i == 1) {
            return new C2913s(abstractC2888f0, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo4507b(View view);

    /* renamed from: c */
    public abstract int mo4508c(View view);

    /* renamed from: d */
    public abstract int mo4509d(View view);

    /* renamed from: e */
    public abstract int mo4510e(View view);

    /* renamed from: f */
    public abstract int mo4511f();

    /* renamed from: g */
    public abstract int mo4512g();

    /* renamed from: h */
    public abstract int mo4513h();

    /* renamed from: i */
    public abstract int mo4514i();

    /* renamed from: j */
    public abstract int mo4515j();

    /* renamed from: k */
    public abstract int mo4516k();

    /* renamed from: l */
    public abstract int mo4517l();

    /* renamed from: m */
    public abstract int mo4518m(View view);

    /* renamed from: n */
    public abstract int mo4519n(View view);

    /* renamed from: o */
    public abstract void mo4520o(int i);

    public AbstractC2506f(InterfaceC2509i interfaceC2509i) {
        this.f9138a = 0;
        this.f9140c = new C2503c();
        this.f9139b = interfaceC2509i;
    }
}
