package p195w4;

import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.PlayerActivity;
import com.exotv.net.R;
import java.util.List;
import java.util.concurrent.CancellationException;
import p016b5.C0588k;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p204x4.C2777t;
import p204x4.C2779v;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.o0 */
/* loaded from: classes.dex */
public final class C2680o0 extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public C2779v f9731n;

    /* renamed from: o */
    public int f9732o;

    /* renamed from: p */
    public final /* synthetic */ List f9733p;

    /* renamed from: q */
    public final /* synthetic */ int f9734q;

    /* renamed from: r */
    public final /* synthetic */ PlayerActivity f9735r;

    /* renamed from: s */
    public final /* synthetic */ boolean f9736s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2680o0(List list, int i, PlayerActivity playerActivity, boolean z7, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f9733p = list;
        this.f9734q = i;
        this.f9735r = playerActivity;
        this.f9736s = z7;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C2680o0) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C2680o0(this.f9733p, this.f9734q, this.f9735r, this.f9736s, interfaceC2222c);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        C2779v c2779v;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f9732o;
        PlayerActivity playerActivity = this.f9735r;
        try {
            if (i == 0) {
                AbstractC0714c.m1516d0(obj);
                C2777t c2777t = (C2777t) this.f9733p.get(this.f9734q);
                if (c2777t.f10306j.length() == 0) {
                    String string = playerActivity.getString(R.string.subs_no_download);
                    AbstractC2980h.m5135d("getString(...)", string);
                    throw new IllegalStateException(string.toString());
                }
                C2779v c2779v2 = C2779v.f10315a;
                this.f9731n = c2779v2;
                this.f9732o = 1;
                C2054e c2054e = AbstractC1290e0.f5316a;
                obj = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0588k(c2777t, (InterfaceC2222c) null), this);
                if (obj == enumC2273a) {
                    return enumC2273a;
                }
                c2779v = c2779v2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c2779v = this.f9731n;
                AbstractC0714c.m1516d0(obj);
            }
            c2779v.getClass();
            String strM4860f = C2779v.m4860f((String) obj);
            playerActivity.f2955Z = playerActivity.f2954Y;
            PlayerActivity.m1705r(playerActivity, strM4860f, this.f9736s);
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            String string2 = playerActivity.getString(R.string.subs_load_failed);
            AbstractC2980h.m5135d("getString(...)", string2);
            playerActivity.m1725S(string2);
            playerActivity.m1718L();
        }
        return C1693j.f6497a;
    }
}
