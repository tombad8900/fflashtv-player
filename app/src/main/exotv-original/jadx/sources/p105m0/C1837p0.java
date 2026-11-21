package p105m0;

import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC0714c;
import p061g7.C1055b;
import p061g7.C1062i;
import p061g7.C1067n;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2324g;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;
import p220z6.AbstractC2987o;
import p220z6.C2988p;
import p220z6.InterfaceC2978f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.p0 */
/* loaded from: classes.dex */
public final class C1837p0 extends AbstractC2324g implements InterfaceC2855p, InterfaceC2978f {

    /* renamed from: k */
    public final int f6925k;

    /* renamed from: l */
    public int f6926l;

    /* renamed from: m */
    public /* synthetic */ Object f6927m;

    /* renamed from: n */
    public final /* synthetic */ View f6928n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1837p0(View view, InterfaceC2222c interfaceC2222c) {
        super(interfaceC2222c);
        this.f6928n = view;
        this.f6925k = 2;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C1837p0) mo577g((C1062i) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        C1837p0 c1837p0 = new C1837p0(this.f6928n, interfaceC2222c);
        c1837p0.f6927m = obj;
        return c1837p0;
    }

    @Override // p220z6.InterfaceC2978f
    public final int getArity() {
        return this.f6925k;
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        Object obj2;
        Object obj3 = EnumC2273a.f7953j;
        int i = this.f6926l;
        View view = this.f6928n;
        if (i == 0) {
            AbstractC0714c.m1516d0(obj);
            C1062i c1062i = (C1062i) this.f6927m;
            this.f6927m = c1062i;
            this.f6926l = 1;
            c1062i.f4488k = view;
            c1062i.f4487j = 3;
            c1062i.f4490m = this;
            return obj3;
        }
        Object obj4 = C1693j.f6497a;
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0714c.m1516d0(obj);
            return obj4;
        }
        C1062i c1062i2 = (C1062i) this.f6927m;
        AbstractC0714c.m1516d0(obj);
        if (view instanceof ViewGroup) {
            this.f6927m = null;
            this.f6926l = 2;
            c1062i2.getClass();
            C1067n c1067n = new C1067n(new C1055b(1, (ViewGroup) view));
            if (c1067n.f4494k.hasNext()) {
                c1062i2.f4489l = c1067n;
                c1062i2.f4487j = 2;
                c1062i2.f4490m = this;
                obj2 = obj3;
            } else {
                obj2 = obj4;
            }
            if (obj2 != obj3) {
                obj2 = obj4;
            }
            if (obj2 == obj3) {
                return obj3;
            }
        }
        return obj4;
    }

    @Override // p154r6.AbstractC2318a
    public final String toString() {
        if (this.f8129j != null) {
            return super.toString();
        }
        AbstractC2987o.f11118a.getClass();
        String strM5143a = C2988p.m5143a(this);
        AbstractC2980h.m5135d("renderLambdaToString(...)", strM5143a);
        return strM5143a;
    }
}
