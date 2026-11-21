package p195w4;

import android.util.Log;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.MainActivity;
import com.exotv.net.R;
import com.exotv.net.model.ChannelCategory;
import java.util.List;
import p016b5.C0586i;
import p024c5.C0682o;
import p024c5.C0702y;
import p069h7.AbstractC1206h;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p212y6.InterfaceC2855p;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.w */
/* loaded from: classes.dex */
public final class C2695w extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public int f9789n;

    /* renamed from: o */
    public final /* synthetic */ MainActivity f9790o;

    /* renamed from: p */
    public final /* synthetic */ boolean f9791p;

    /* renamed from: q */
    public final /* synthetic */ boolean f9792q;

    /* renamed from: r */
    public final /* synthetic */ boolean f9793r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2695w(MainActivity mainActivity, boolean z7, boolean z8, boolean z9, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f9790o = mainActivity;
        this.f9791p = z7;
        this.f9792q = z8;
        this.f9793r = z9;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C2695w) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        return new C2695w(this.f9790o, this.f9791p, this.f9792q, this.f9793r, interfaceC2222c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ca, code lost:
    
        if (r14 != r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:6:0x0018, B:46:0x00cd, B:48:0x00d1, B:51:0x00d8, B:54:0x00e0, B:56:0x00eb, B:58:0x0108, B:61:0x010e, B:63:0x0112, B:64:0x0117, B:65:0x011c, B:66:0x011d, B:67:0x0120, B:68:0x0121, B:69:0x0124, B:70:0x0125, B:24:0x0051, B:27:0x0068, B:29:0x006e, B:38:0x007f, B:40:0x009a, B:42:0x00a4, B:43:0x00b9, B:34:0x0078, B:22:0x0049, B:12:0x0028, B:20:0x0046, B:17:0x0031), top: B:74:0x0012, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        C0586i c0586i;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i = this.f9789n;
        C1693j c1693j = C1693j.f6497a;
        MainActivity mainActivity = this.f9790o;
        try {
            try {
            } catch (Throwable th) {
                Log.e("MainActivity", "config load failed", th);
                c0586i = null;
            }
            if (i == 0) {
                AbstractC0714c.m1516d0(obj);
                C2054e c2054e = AbstractC1290e0.f5316a;
                ExecutorC2053d executorC2053d = ExecutorC2053d.f7598l;
                C2691u c2691u = new C2691u(this.f9792q, null);
                this.f9789n = 1;
                obj = AbstractC1339x.m2857r(executorC2053d, c2691u, this);
                if (obj == enumC2273a) {
                    return enumC2273a;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    List list = (List) obj;
                    if (list == null || list.isEmpty()) {
                        mainActivity.m1690T(false, mainActivity.getString(R.string.no_categories), true, EnumC2683q.f9746j);
                    } else {
                        mainActivity.f2897U = list;
                        C0682o c0682o = mainActivity.f2895S;
                        if (c0682o == null) {
                            AbstractC2980h.m5139h("categoryAdapter");
                            throw null;
                        }
                        c0682o.f2677g = list;
                        c0682o.f10870a.m5087b();
                        C0682o c0682o2 = mainActivity.f2895S;
                        if (c0682o2 == null) {
                            AbstractC2980h.m5139h("categoryAdapter");
                            throw null;
                        }
                        c0682o2.m1459g(0);
                        mainActivity.f2898V = 0;
                        mainActivity.m1689S(((ChannelCategory) list.get(0)).getChannels());
                        EnumC2683q enumC2683q = EnumC2683q.f9746j;
                        mainActivity.m1690T(false, null, false, enumC2683q);
                        if (mainActivity.m1681I() && mainActivity.f2887K == enumC2683q) {
                            C0702y c0702y = mainActivity.f2886J;
                            if (c0702y == null) {
                                AbstractC2980h.m5139h("nav");
                                throw null;
                            }
                            c0702y.m1470a();
                        }
                    }
                    return c1693j;
                }
                AbstractC0714c.m1516d0(obj);
            }
            c0586i = (C0586i) obj;
            if (c0586i == null) {
                Log.w("MainActivity", "no config: showing the reload screen");
                mainActivity.m1690T(false, mainActivity.getString(R.string.load_failed_brief), true, EnumC2683q.f9746j);
            } else {
                String str = c0586i.f2326a;
                String str2 = c0586i.f2329d;
                if (str2 == null) {
                    str2 = c0586i.f2330e;
                    Log.i("MainActivity", "config version=" + str + " apkUrl=" + (str2 == null));
                    if (!this.f9791p || AbstractC2980h.m5132a(c0586i.f2326a, "1.1.7")) {
                        C2054e c2054e2 = AbstractC1290e0.f5316a;
                        ExecutorC2053d executorC2053d2 = ExecutorC2053d.f7598l;
                        C2693v c2693v = new C2693v(mainActivity, this.f9793r, (InterfaceC2222c) null);
                        this.f9789n = 2;
                        obj = AbstractC1339x.m2857r(executorC2053d2, c2693v, this);
                    } else {
                        Log.w("MainActivity", "version mismatch local=1.1.7 remote=" + c0586i.f2326a);
                        MainActivity.m1673s(mainActivity, c0586i);
                    }
                } else {
                    if (AbstractC1206h.m2630D0(str2)) {
                        str2 = null;
                    }
                    if (str2 == null) {
                    }
                    if (str2 == null) {
                    }
                    Log.i("MainActivity", "config version=" + str + " apkUrl=" + (str2 == null));
                    if (this.f9791p) {
                    }
                    C2054e c2054e22 = AbstractC1290e0.f5316a;
                    ExecutorC2053d executorC2053d22 = ExecutorC2053d.f7598l;
                    C2693v c2693v2 = new C2693v(mainActivity, this.f9793r, (InterfaceC2222c) null);
                    this.f9789n = 2;
                    obj = AbstractC1339x.m2857r(executorC2053d22, c2693v2, this);
                }
            }
            return c1693j;
        } finally {
            mainActivity.f2900X = false;
            mainActivity.m1687Q(false);
        }
    }
}
