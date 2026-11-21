package p016b5;

import com.bumptech.glide.AbstractC0714c;
import java.util.concurrent.atomic.AtomicReference;
import okhttp3.AbstractC2160j0;
import okhttp3.C2076g0;
import okhttp3.C2080i0;
import okhttp3.C2181z;
import org.json.JSONObject;
import p002a1.AbstractC0008a1;
import p069h7.AbstractC1199a;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p147q7.AbstractC2278c;
import p154r6.AbstractC2325h;
import p168t2.AbstractC2415i0;
import p212y6.InterfaceC2855p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b5.g */
/* loaded from: classes.dex */
public final class C0584g extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public int f2324n;

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C0584g) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C0584g(2, interfaceC2222c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    public final Object mo578h(Object obj) throws Throwable {
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f2324n;
        Object[] objArr = 0;
        if (i == 0) {
            AbstractC0714c.m1516d0(obj);
            AtomicReference atomicReference = C0589l.f2355a;
            this.f2324n = 1;
            obj = (String) C0589l.f2355a.get();
            if (obj == null) {
                C2054e c2054e = AbstractC1290e0.f5316a;
                obj = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C0588k(2, (InterfaceC2222c) (objArr == true ? 1 : 0)), this);
            }
            if (obj == enumC2273a) {
                return enumC2273a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC0714c.m1516d0(obj);
        }
        C2080i0 c2080i0Execute = AbstractC0590m.f2359a.newCall(new C2076g0.a().url(AbstractC0008a1.m16l((String) obj, "/exel/appConfig.php")).header("User-Agent", AbstractC2278c.userAgent).build()).execute();
        try {
            AbstractC2160j0 abstractC2160j0Body = c2080i0Execute.body();
            String strString = abstractC2160j0Body != null ? abstractC2160j0Body.string() : null;
            if (strString == null) {
                strString = C2181z.FRAGMENT_ENCODE_SET;
            }
            C0586i c0586iM1334a = C0585h.m1334a(new JSONObject(new String(AbstractC2415i0.m4261I(AbstractC2415i0.m4262a(strString)), AbstractC1199a.f5077a)));
            C0585h.f2325a = c0586iM1334a;
            c2080i0Execute.close();
            return c0586iM1334a;
        } finally {
        }
    }
}
