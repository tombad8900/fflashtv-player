package p195w4;

import android.content.Context;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.MainActivity;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;
import org.json.JSONArray;
import p069h7.AbstractC1199a;
import p069h7.AbstractC1206h;
import p069h7.AbstractC1213o;
import p076i7.AbstractC1290e0;
import p076i7.AbstractC1339x;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p119n6.C2023c;
import p127o7.C2054e;
import p127o7.ExecutorC2053d;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p154r6.AbstractC2325h;
import p168t2.AbstractC2415i0;
import p197w6.AbstractC2704a;
import p212y6.InterfaceC2855p;
import p218z4.C2934b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w4.v */
/* loaded from: classes.dex */
public final class C2693v extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public final /* synthetic */ int f9783n = 0;

    /* renamed from: o */
    public int f9784o;

    /* renamed from: p */
    public final /* synthetic */ boolean f9785p;

    /* renamed from: q */
    public final /* synthetic */ Context f9786q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2693v(MainActivity mainActivity, boolean z7, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f9786q = mainActivity;
        this.f9785p = z7;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        InterfaceC1333u interfaceC1333u = (InterfaceC1333u) obj;
        InterfaceC2222c interfaceC2222c = (InterfaceC2222c) obj2;
        switch (this.f9783n) {
        }
        return ((C2693v) mo577g(interfaceC1333u, interfaceC2222c)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        switch (this.f9783n) {
            case 0:
                return new C2693v((MainActivity) this.f9786q, this.f9785p, interfaceC2222c);
            default:
                return new C2693v(this.f9785p, this.f9786q, interfaceC2222c);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        C2023c c2023cM5093b;
        File file;
        String strM4756u;
        int iM2627A0;
        int i = this.f9783n;
        boolean z7 = this.f9785p;
        Context context = this.f9786q;
        C2023c c2023cM5093b2 = null;
        switch (i) {
            case 0:
                EnumC2273a enumC2273a = EnumC2273a.f7953j;
                int i4 = this.f9784o;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                    return obj;
                }
                AbstractC0714c.m1516d0(obj);
                this.f9784o = 1;
                C2054e c2054e = AbstractC1290e0.f5316a;
                Object objM2857r = AbstractC1339x.m2857r(ExecutorC2053d.f7598l, new C2693v(z7, (MainActivity) context, (InterfaceC2222c) null), this);
                return objM2857r == enumC2273a ? enumC2273a : objM2857r;
            default:
                EnumC2273a enumC2273a2 = EnumC2273a.f7953j;
                int i8 = this.f9784o;
                if (i8 == 0) {
                    AbstractC0714c.m1516d0(obj);
                    if (!z7) {
                        try {
                            file = new File(context.getFilesDir(), "channels_cache");
                        } catch (Throwable unused) {
                        }
                        if (file.exists() && (iM2627A0 = AbstractC1206h.m2627A0((strM4756u = AbstractC2704a.m4756u(file)), '\n', 0, 6)) > 0) {
                            String strSubstring = strM4756u.substring(0, iM2627A0);
                            AbstractC2980h.m5135d("substring(...)", strSubstring);
                            Long lM2659l0 = AbstractC1213o.m2659l0(strSubstring);
                            long jCurrentTimeMillis = lM2659l0 == null ? Long.MAX_VALUE : System.currentTimeMillis() - lM2659l0.longValue();
                            if (jCurrentTimeMillis < 0 || jCurrentTimeMillis >= 43200000) {
                                c2023cM5093b = null;
                            } else {
                                String strSubstring2 = strM4756u.substring(iM2627A0 + 1);
                                AbstractC2980h.m5135d("substring(...)", strSubstring2);
                                c2023cM5093b = C2934b.m5093b(new JSONArray(new String(AbstractC2415i0.m4261I(AbstractC2415i0.m4262a(strSubstring2)), AbstractC1199a.f5077a)));
                            }
                            if (c2023cM5093b != null) {
                                return c2023cM5093b;
                            }
                        }
                    }
                    this.f9784o = 1;
                    obj = C2934b.m5092a(this);
                    if (obj == enumC2273a2) {
                        return enumC2273a2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0714c.m1516d0(obj);
                }
                String str = (String) obj;
                if (str == null) {
                    return null;
                }
                try {
                    c2023cM5093b2 = C2934b.m5093b(new JSONArray(new String(AbstractC2415i0.m4261I(AbstractC2415i0.m4262a(str)), AbstractC1199a.f5077a)));
                } catch (Throwable unused2) {
                }
                if (c2023cM5093b2 == null) {
                    return c2023cM5093b2;
                }
                try {
                    File file2 = new File(context.getFilesDir(), "channels_cache");
                    String str2 = System.currentTimeMillis() + "\n" + str;
                    Charset charset = AbstractC1199a.f5077a;
                    AbstractC2980h.m5136e("text", str2);
                    AbstractC2980h.m5136e("charset", charset);
                    FileOutputStream fileOutputStream = new FileOutputStream(file2);
                    try {
                        AbstractC2704a.m4758w(fileOutputStream, str2, charset);
                        fileOutputStream.close();
                        return c2023cM5093b2;
                    } finally {
                    }
                } catch (Throwable unused3) {
                    return c2023cM5093b2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2693v(boolean z7, Context context, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f9785p = z7;
        this.f9786q = context;
    }
}
