package p204x4;

import com.bumptech.glide.AbstractC0714c;
import java.io.Serializable;
import p102l6.C1693j;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2856q;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x4.f */
/* loaded from: classes.dex */
public final class C2763f extends AbstractC2325h implements InterfaceC2856q {

    /* renamed from: n */
    public final /* synthetic */ int f10219n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2763f(int i, InterfaceC2222c interfaceC2222c, int i4) {
        super(i, interfaceC2222c);
        this.f10219n = i4;
    }

    @Override // p212y6.InterfaceC2856q
    /* renamed from: b */
    public final Object mo2793b(Serializable serializable, Object obj, Object obj2) throws Throwable {
        int i = this.f10219n;
        ((Number) serializable).intValue();
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (i) {
            case 0:
                C2763f c2763f = new C2763f(3, interfaceC2222c, 0);
                C1693j c1693j = C1693j.f6497a;
                c2763f.mo578h(c1693j);
                return c1693j;
            default:
                C2763f c2763f2 = new C2763f(3, interfaceC2222c, 1);
                C1693j c1693j2 = C1693j.f6497a;
                c2763f2.mo578h(c1693j2);
                return c1693j2;
        }
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        int i = this.f10219n;
        C1693j c1693j = C1693j.f6497a;
        switch (i) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                AbstractC0714c.m1516d0(obj);
                break;
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                AbstractC0714c.m1516d0(obj);
                break;
        }
        return c1693j;
    }
}
