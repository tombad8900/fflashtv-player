package p100l4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.bumptech.glide.C0716e;
import com.bumptech.glide.C0721j;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.bumptech.glide.ComponentCallbacks2C0738m;
import java.util.ArrayList;
import p005a4.C0093n;
import p007a6.C0112d;
import p015b4.InterfaceC0567a;
import p058g4.C1048c;
import p144q4.C2269e;
import p170t4.C2435b;
import p178u4.AbstractC2470e;
import p178u4.AbstractC2478m;
import p203x3.C2754a;
import p203x3.C2757d;
import p210y3.InterfaceC2808l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l4.f */
/* loaded from: classes.dex */
public final class C1678f {

    /* renamed from: a */
    public final C2757d f6437a;

    /* renamed from: b */
    public final Handler f6438b;

    /* renamed from: c */
    public final ArrayList f6439c;

    /* renamed from: d */
    public final ComponentCallbacks2C0738m f6440d;

    /* renamed from: e */
    public final InterfaceC0567a f6441e;

    /* renamed from: f */
    public boolean f6442f;

    /* renamed from: g */
    public boolean f6443g;

    /* renamed from: h */
    public C0721j f6444h;

    /* renamed from: i */
    public C1676d f6445i;

    /* renamed from: j */
    public boolean f6446j;

    /* renamed from: k */
    public C1676d f6447k;

    /* renamed from: l */
    public Bitmap f6448l;

    /* renamed from: m */
    public C1676d f6449m;

    /* renamed from: n */
    public int f6450n;

    /* renamed from: o */
    public int f6451o;

    /* renamed from: p */
    public int f6452p;

    public C1678f(ComponentCallbacks2C0713b componentCallbacks2C0713b, C2757d c2757d, int i, int i4, Bitmap bitmap) {
        InterfaceC0567a interfaceC0567a = componentCallbacks2C0713b.f2774j;
        C0716e c0716e = componentCallbacks2C0713b.f2776l;
        Context baseContext = c0716e.getBaseContext();
        ComponentCallbacks2C0738m componentCallbacks2C0738mM3883c = ComponentCallbacks2C0713b.m1485b(baseContext).m3883c(baseContext);
        Context baseContext2 = c0716e.getBaseContext();
        ComponentCallbacks2C0738m componentCallbacks2C0738mM3883c2 = ComponentCallbacks2C0713b.m1485b(baseContext2).m3883c(baseContext2);
        componentCallbacks2C0738mM3883c2.getClass();
        C0721j c0721jM1623r = new C0721j(componentCallbacks2C0738mM3883c2.f2872j, componentCallbacks2C0738mM3883c2, Bitmap.class, componentCallbacks2C0738mM3883c2.f2873k).mo1620a(ComponentCallbacks2C0738m.f2871t).mo1620a(((C2269e) ((C2269e) ((C2269e) new C2269e().m4054d(C0093n.f436c)).m4065p()).m4062m()).m4057h(i, i4));
        this.f6439c = new ArrayList();
        this.f6440d = componentCallbacks2C0738mM3883c;
        Handler handler = new Handler(Looper.getMainLooper(), new C0112d(1, this));
        this.f6441e = interfaceC0567a;
        this.f6438b = handler;
        this.f6444h = c0721jM1623r;
        this.f6437a = c2757d;
        m3379c(C1048c.f4461b, bitmap);
    }

    /* renamed from: a */
    public final void m3377a() {
        int i;
        if (!this.f6442f || this.f6443g) {
            return;
        }
        C1676d c1676d = this.f6449m;
        if (c1676d != null) {
            this.f6449m = null;
            m3378b(c1676d);
            return;
        }
        this.f6443g = true;
        C2757d c2757d = this.f6437a;
        int i4 = c2757d.f10196l.f10172c;
        long jUptimeMillis = SystemClock.uptimeMillis() + ((i4 <= 0 || (i = c2757d.f10195k) < 0) ? 0 : (i < 0 || i >= i4) ? -1 : ((C2754a) r2.f10174e.get(i)).f10167i);
        int i8 = (c2757d.f10195k + 1) % c2757d.f10196l.f10172c;
        c2757d.f10195k = i8;
        this.f6447k = new C1676d(this.f6438b, i8, jUptimeMillis);
        C0721j c0721jM1628w = this.f6444h.mo1620a((C2269e) new C2269e().m4061l(new C2435b(Double.valueOf(Math.random())))).m1628w(c2757d);
        c0721jM1628w.m1627v(this.f6447k, c0721jM1628w);
    }

    /* renamed from: b */
    public final void m3378b(C1676d c1676d) {
        this.f6443g = false;
        boolean z7 = this.f6446j;
        Handler handler = this.f6438b;
        if (z7) {
            handler.obtainMessage(2, c1676d).sendToTarget();
            return;
        }
        if (!this.f6442f) {
            this.f6449m = c1676d;
            return;
        }
        if (c1676d.f6436p != null) {
            Bitmap bitmap = this.f6448l;
            if (bitmap != null) {
                this.f6441e.mo1309e(bitmap);
                this.f6448l = null;
            }
            C1676d c1676d2 = this.f6445i;
            this.f6445i = c1676d;
            ArrayList arrayList = this.f6439c;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                C1674b c1674b = (C1674b) ((InterfaceC1677e) arrayList.get(size));
                Object callback = c1674b.getCallback();
                while (callback instanceof Drawable) {
                    callback = ((Drawable) callback).getCallback();
                }
                if (callback == null) {
                    c1674b.stop();
                    c1674b.invalidateSelf();
                } else {
                    c1674b.invalidateSelf();
                    C1676d c1676d3 = ((C1678f) c1674b.f6419j.f3812b).f6445i;
                    if ((c1676d3 != null ? c1676d3.f6434n : -1) == r5.f6437a.f10196l.f10172c - 1) {
                        c1674b.f6424o++;
                    }
                    int i = c1674b.f6425p;
                    if (i != -1 && c1674b.f6424o >= i) {
                        c1674b.stop();
                    }
                }
            }
            if (c1676d2 != null) {
                handler.obtainMessage(2, c1676d2).sendToTarget();
            }
        }
        m3377a();
    }

    /* renamed from: c */
    public final void m3379c(InterfaceC2808l interfaceC2808l, Bitmap bitmap) {
        AbstractC2470e.m4446c("Argument must not be null", interfaceC2808l);
        AbstractC2470e.m4446c("Argument must not be null", bitmap);
        this.f6448l = bitmap;
        this.f6444h = this.f6444h.mo1620a(new C2269e().m4064o(interfaceC2808l, true));
        this.f6450n = AbstractC2478m.m4455c(bitmap);
        this.f6451o = bitmap.getWidth();
        this.f6452p = bitmap.getHeight();
    }
}
