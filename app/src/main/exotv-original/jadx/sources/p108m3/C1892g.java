package p108m3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.AbstractC0714c;
import java.util.List;
import p065h3.C1159d;
import p076i7.C1279a1;
import p076i7.C1329s;
import p076i7.InterfaceC1330s0;
import p076i7.InterfaceC1333u;
import p102l6.C1693j;
import p111m6.AbstractC1912g;
import p137p6.InterfaceC2222c;
import p146q6.EnumC2273a;
import p151r3.C2299k;
import p151r3.C2303o;
import p154r6.AbstractC2325h;
import p160s3.C2357h;
import p168t2.AbstractC2415i0;
import p185v3.AbstractC2536f;
import p212y6.InterfaceC2855p;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m3.g */
/* loaded from: classes.dex */
public final class C1892g extends AbstractC2325h implements InterfaceC2855p {

    /* renamed from: n */
    public List f7076n;

    /* renamed from: o */
    public C2303o f7077o;

    /* renamed from: p */
    public int f7078p;

    /* renamed from: q */
    public int f7079q;

    /* renamed from: r */
    public int f7080r;

    /* renamed from: s */
    public /* synthetic */ Object f7081s;

    /* renamed from: t */
    public final /* synthetic */ C1893h f7082t;

    /* renamed from: u */
    public final /* synthetic */ C1886a f7083u;

    /* renamed from: v */
    public final /* synthetic */ C2303o f7084v;

    /* renamed from: w */
    public final /* synthetic */ List f7085w;

    /* renamed from: x */
    public final /* synthetic */ C1159d f7086x;

    /* renamed from: y */
    public final /* synthetic */ C2299k f7087y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1892g(C1893h c1893h, C1886a c1886a, C2303o c2303o, List list, C1159d c1159d, C2299k c2299k, InterfaceC2222c interfaceC2222c) {
        super(2, interfaceC2222c);
        this.f7082t = c1893h;
        this.f7083u = c1886a;
        this.f7084v = c2303o;
        this.f7085w = list;
        this.f7086x = c1159d;
        this.f7087y = c2299k;
    }

    @Override // p212y6.InterfaceC2855p
    /* renamed from: c */
    public final Object mo576c(Object obj, Object obj2) {
        return ((C1892g) mo577g((InterfaceC1333u) obj, (InterfaceC2222c) obj2)).mo578h(C1693j.f6497a);
    }

    @Override // p154r6.AbstractC2318a
    /* renamed from: g */
    public final InterfaceC2222c mo577g(Object obj, InterfaceC2222c interfaceC2222c) {
        C1892g c1892g = new C1892g(this.f7082t, this.f7083u, this.f7084v, this.f7085w, this.f7086x, this.f7087y, interfaceC2222c);
        c1892g.f7081s = obj;
        return c1892g;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    @Override // p154r6.AbstractC2318a
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo578h(Object obj) throws Throwable {
        InterfaceC1333u interfaceC1333u;
        C2303o c2303o;
        Bitmap bitmapM4266g;
        List list;
        int size;
        int i;
        EnumC2273a enumC2273a = EnumC2273a.f7953j;
        int i4 = this.f7080r;
        C1159d c1159d = this.f7086x;
        C1886a c1886a = this.f7083u;
        if (i4 == 0) {
            AbstractC0714c.m1516d0(obj);
            interfaceC1333u = (InterfaceC1333u) this.f7081s;
            Drawable drawable = c1886a.f7026a;
            boolean z7 = drawable instanceof BitmapDrawable;
            c2303o = this.f7084v;
            if (z7) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (AbstractC1912g.m3725i0(AbstractC2536f.f9216a, config)) {
                    bitmapM4266g = bitmap;
                }
                c1159d.getClass();
                list = this.f7085w;
                size = list.size();
                i = 0;
            } else {
                bitmapM4266g = AbstractC2415i0.m4266g(drawable, c2303o.f8056b, c2303o.f8058d, c2303o.f8059e, c2303o.f8060f);
                c1159d.getClass();
                list = this.f7085w;
                size = list.size();
                i = 0;
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            size = this.f7079q;
            int i8 = this.f7078p;
            c2303o = this.f7077o;
            list = this.f7076n;
            interfaceC1333u = (InterfaceC1333u) this.f7081s;
            AbstractC0714c.m1516d0(obj);
            bitmapM4266g = (Bitmap) obj;
            InterfaceC1330s0 interfaceC1330s0 = (InterfaceC1330s0) interfaceC1333u.mo579h().mo2760b(C1329s.f5369k);
            if (interfaceC1330s0 != null && !interfaceC1330s0.isActive()) {
                throw ((C1279a1) interfaceC1330s0).m2772v();
            }
            i = i8 + 1;
        }
        if (i >= size) {
            c1159d.getClass();
            return new C1886a(new BitmapDrawable(this.f7087y.f8027a.getResources(), bitmapM4266g), c1886a.f7027b, c1886a.f7028c, c1886a.f7029d);
        }
        if (list.get(i) != null) {
            throw new ClassCastException();
        }
        C2357h c2357h = c2303o.f8058d;
        this.f7081s = interfaceC1333u;
        this.f7076n = list;
        this.f7077o = c2303o;
        this.f7078p = i;
        this.f7079q = size;
        this.f7080r = 1;
        throw null;
    }
}
