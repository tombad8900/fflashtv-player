package p002a1;

import android.animation.Animator;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsetsAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.AbstractC0150o;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.bumptech.glide.ComponentCallbacks2C0713b;
import com.bumptech.glide.ComponentCallbacks2C0738m;
import com.bumptech.glide.load.data.InterfaceC0727d;
import com.bumptech.glide.load.data.InterfaceC0728e;
import com.exotv.net.MainActivity;
import com.exotv.net.R;
import com.google.android.material.datepicker.RunnableC0748f;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import p002a1.C0016e;
import p005a4.C0073c;
import p005a4.C0079f;
import p005a4.C0087j;
import p005a4.C0090k0;
import p005a4.C0093n;
import p005a4.InterfaceC0080f0;
import p005a4.RunnableC0091l;
import p010b.C0520j;
import p015b4.C0569c;
import p015b4.InterfaceC0567a;
import p015b4.InterfaceC0574h;
import p017b6.AbstractC0622v;
import p023c4.C0638b;
import p023c4.C0639c;
import p023c4.C0645i;
import p024c5.AbstractC0704z;
import p024c5.C0654c1;
import p024c5.C0672j;
import p028d.C0783a;
import p037e0.C0851b;
import p041e4.C0900q;
import p062h.AbstractActivityC1083i;
import p062h.AbstractC1086l;
import p062h.C1092r;
import p062h.LayoutInflaterFactory2C1098x;
import p066h4.C1166b;
import p066h4.C1168c;
import p066h4.C1189w;
import p066h4.InterfaceC1180n;
import p069h7.C1203e;
import p070i0.InterfaceC1216a;
import p072i2.C1245e;
import p079j0.C1479g;
import p079j0.ExecutorC1484l;
import p085j6.RunnableC1527q;
import p087k.AbstractC1536a;
import p087k.C1540e;
import p089k1.C1569m;
import p089k1.InterfaceC1563g;
import p089k1.InterfaceC1564h;
import p090k2.C1584b;
import p095l.MenuC1614c0;
import p095l.MenuC1627m;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1828m0;
import p105m0.C1843r0;
import p105m0.C1865z0;
import p114n0.C1950b;
import p115n1.InterfaceC1987n;
import p118n4.C2011h;
import p118n4.C2013j;
import p130p.C2186e;
import p130p.C2192k;
import p134p3.C2207a;
import p134p3.C2208b;
import p134p3.C2210d;
import p134p3.C2211e;
import p134p3.InterfaceC2213g;
import p135p4.C2216c;
import p139q.C2240b;
import p178u4.AbstractC2470e;
import p178u4.AbstractC2478m;
import p178u4.C2469d;
import p178u4.C2474i;
import p186v4.AbstractC2547c;
import p210y3.C2804h;
import p210y3.InterfaceC2801e;
import p210y3.InterfaceC2807k;
import p211y5.C2819f;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.e */
/* loaded from: classes.dex */
public class C0016e implements InterfaceC1216a, InterfaceC0727d, InterfaceC2807k, InterfaceC1180n, InterfaceC1563g, InterfaceC2213g {

    /* renamed from: m */
    public static boolean f60m;

    /* renamed from: j */
    public final /* synthetic */ int f61j;

    /* renamed from: k */
    public Object f62k;

    /* renamed from: l */
    public Object f63l;

    public /* synthetic */ C0016e(int i, boolean z7) {
        this.f61j = i;
    }

    /* renamed from: A */
    public List m31A() {
        if (((C1203e) this.f63l) == null) {
            this.f63l = new C1203e(this);
        }
        C1203e c1203e = (C1203e) this.f63l;
        AbstractC2980h.m5133b(c1203e);
        return c1203e;
    }

    /* renamed from: B */
    public synchronized List m32B(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f62k).contains(str)) {
                ((ArrayList) this.f62k).add(str);
            }
            arrayList = (List) ((HashMap) this.f63l).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f63l).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* renamed from: C */
    public ComponentCallbacks2C0738m m33C(Context context, ComponentCallbacks2C0713b componentCallbacks2C0713b, AbstractC0150o abstractC0150o, C0035n0 c0035n0, boolean z7) {
        AbstractC2478m.m4453a();
        AbstractC2478m.m4453a();
        HashMap map = (HashMap) this.f62k;
        ComponentCallbacks2C0738m componentCallbacks2C0738m = (ComponentCallbacks2C0738m) map.get(abstractC0150o);
        if (componentCallbacks2C0738m != null) {
            return componentCallbacks2C0738m;
        }
        C2011h c2011h = new C2011h(abstractC0150o);
        C1584b c1584b = (C1584b) this.f63l;
        C1584b c1584b2 = new C1584b(this, c0035n0);
        c1584b.getClass();
        ComponentCallbacks2C0738m componentCallbacks2C0738m2 = new ComponentCallbacks2C0738m(componentCallbacks2C0713b, c2011h, c1584b2, context);
        map.put(abstractC0150o, componentCallbacks2C0738m2);
        c2011h.mo3256a(new C2013j(this, abstractC0150o));
        if (z7) {
            componentCallbacks2C0738m2.mo1639k();
        }
        return componentCallbacks2C0738m2;
    }

    /* renamed from: D */
    public synchronized ArrayList m34D(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList) this.f62k;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            List<C2216c> list = (List) ((HashMap) this.f63l).get((String) obj);
            if (list != null) {
                for (C2216c c2216c : list) {
                    if ((c2216c.f7738a.isAssignableFrom(cls) && cls2.isAssignableFrom(c2216c.f7739b)) && !arrayList.contains(c2216c.f7739b)) {
                        arrayList.add(c2216c.f7739b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: E */
    public String m35E(InterfaceC2801e interfaceC2801e) {
        String str;
        synchronized (((C2474i) this.f62k)) {
            str = (String) ((C2474i) this.f62k).m4448a(interfaceC2801e);
        }
        if (str == null) {
            C0645i c0645i = (C0645i) ((C0073c) this.f63l).acquire();
            try {
                interfaceC2801e.mo309a(c0645i.f2544j);
                byte[] bArrDigest = c0645i.f2544j.digest();
                char[] cArr = AbstractC2478m.f9070b;
                synchronized (cArr) {
                    for (int i = 0; i < bArrDigest.length; i++) {
                        byte b7 = bArrDigest[i];
                        int i4 = i * 2;
                        char[] cArr2 = AbstractC2478m.f9069a;
                        cArr[i4] = cArr2[(b7 & 255) >>> 4];
                        cArr[i4 + 1] = cArr2[b7 & 15];
                    }
                    str = new String(cArr);
                }
            } finally {
                ((C0073c) this.f63l).mo285g(c0645i);
            }
        }
        synchronized (((C2474i) this.f62k)) {
            ((C2474i) this.f62k).m4449d(interfaceC2801e, str);
        }
        return str;
    }

    /* renamed from: F */
    public synchronized Map m36F() {
        try {
            if (((Map) this.f63l) == null) {
                this.f63l = Collections.unmodifiableMap(new HashMap((HashMap) this.f62k));
            }
        } catch (Throwable th) {
            throw th;
        }
        return (Map) this.f63l;
    }

    /* renamed from: G */
    public void m37G(AbstractC1536a abstractC1536a) {
        C0022h c0022h = (C0022h) this.f62k;
        ((ActionMode.Callback) c0022h.f78j).onDestroyActionMode(c0022h.m76g(abstractC1536a));
        LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = (LayoutInflaterFactory2C1098x) this.f63l;
        if (layoutInflaterFactory2C1098x.f4662F != null) {
            layoutInflaterFactory2C1098x.f4700u.getDecorView().removeCallbacks(layoutInflaterFactory2C1098x.f4663G);
        }
        if (layoutInflaterFactory2C1098x.f4661E != null) {
            C1843r0 c1843r0 = layoutInflaterFactory2C1098x.f4664H;
            if (c1843r0 != null) {
                c1843r0.m3616b();
            }
            C1843r0 c1843r0M3596a = AbstractC1828m0.m3596a(layoutInflaterFactory2C1098x.f4661E);
            c1843r0M3596a.m3615a(0.0f);
            layoutInflaterFactory2C1098x.f4664H = c1843r0M3596a;
            c1843r0M3596a.m3618d(new C1092r(2, this));
        }
        layoutInflaterFactory2C1098x.f4660D = null;
        ViewGroup viewGroup = layoutInflaterFactory2C1098x.f4666J;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1798c0.m3516c(viewGroup);
        layoutInflaterFactory2C1098x.m2330H();
    }

    /* renamed from: H */
    public boolean m38H(AbstractC1536a abstractC1536a, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C1098x) this.f63l).f4666J;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        AbstractC1798c0.m3516c(viewGroup);
        C0022h c0022h = (C0022h) this.f62k;
        ActionMode.Callback callback = (ActionMode.Callback) c0022h.f78j;
        C1540e c1540eM76g = c0022h.m76g(abstractC1536a);
        C2192k c2192k = (C2192k) c0022h.f81m;
        Menu menuC1614c0 = (Menu) c2192k.get(menu);
        if (menuC1614c0 == null) {
            menuC1614c0 = new MenuC1614c0((Context) c0022h.f79k, (MenuC1627m) menu);
            c2192k.put(menu, menuC1614c0);
        }
        return callback.onPrepareActionMode(c1540eM76g, menuC1614c0);
    }

    /* renamed from: I */
    public void m39I(C1479g c1479g) {
        ExecutorC1484l executorC1484l = (ExecutorC1484l) this.f63l;
        C0036o c0036o = (C0036o) this.f62k;
        int i = c1479g.f5702b;
        if (i != 0) {
            executorC1484l.execute(new RunnableC0748f(i, 1, c0036o));
        } else {
            executorC1484l.execute(new RunnableC1527q(c0036o, 7, c1479g.f5701a));
        }
    }

    /* renamed from: J */
    public void m40J(InterfaceC0574h interfaceC0574h, Object obj) {
        HashMap map = (HashMap) this.f63l;
        C0569c c0569c = (C0569c) map.get(interfaceC0574h);
        if (c0569c == null) {
            c0569c = new C0569c(interfaceC0574h);
            c0569c.f2278d = c0569c;
            C0569c c0569c2 = (C0569c) this.f62k;
            c0569c.f2278d = c0569c2.f2278d;
            c0569c.f2277c = c0569c2;
            c0569c2.f2278d = c0569c;
            c0569c.f2278d.f2277c = c0569c;
            map.put(interfaceC0574h, c0569c);
        } else {
            interfaceC0574h.mo1315a();
        }
        if (c0569c.f2276b == null) {
            c0569c.f2276b = new ArrayList();
        }
        c0569c.f2276b.add(obj);
    }

    /* renamed from: K */
    public void m41K(String str) {
        C0638b c0638b;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.f62k).get(str);
                AbstractC2470e.m4446c("Argument must not be null", obj);
                c0638b = (C0638b) obj;
                int i = c0638b.f2526b;
                if (i < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c0638b.f2526b);
                }
                int i4 = i - 1;
                c0638b.f2526b = i4;
                if (i4 == 0) {
                    C0638b c0638b2 = (C0638b) ((HashMap) this.f62k).remove(str);
                    if (!c0638b2.equals(c0638b)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0638b + ", but actually removed: " + c0638b2 + ", safeKey: " + str);
                    }
                    C0639c c0639c = (C0639c) this.f63l;
                    synchronized (c0639c.f2527a) {
                        try {
                            if (c0639c.f2527a.size() < 10) {
                                c0639c.f2527a.offer(c0638b2);
                            }
                        } finally {
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c0638b.f2525a.unlock();
    }

    /* renamed from: L */
    public Object m42L() {
        C0569c c0569c = (C0569c) this.f62k;
        C0569c c0569c2 = c0569c.f2278d;
        while (true) {
            boolean zEquals = c0569c2.equals(c0569c);
            Object obj = c0569c2.f2275a;
            if (zEquals) {
                return null;
            }
            ArrayList arrayList = c0569c2.f2276b;
            int size = arrayList != null ? arrayList.size() : 0;
            Object objRemove = size > 0 ? c0569c2.f2276b.remove(size - 1) : null;
            if (objRemove != null) {
                return objRemove;
            }
            C0569c c0569c3 = c0569c2.f2278d;
            c0569c3.f2277c = c0569c2.f2277c;
            c0569c2.f2277c.f2278d = c0569c3;
            ((HashMap) this.f63l).remove(obj);
            ((InterfaceC0574h) obj).mo1315a();
            c0569c2 = c0569c2.f2278d;
        }
    }

    /* renamed from: M */
    public void m43M() {
        Object parcelable;
        Integer num;
        C0520j c0520j = (C0520j) this.f62k;
        String str = (String) this.f63l;
        Bundle bundle = c0520j.f2134g;
        LinkedHashMap linkedHashMap = c0520j.f2133f;
        AbstractC2980h.m5136e("key", str);
        if (!c0520j.f2131d.contains(str) && (num = (Integer) c0520j.f2129b.remove(str)) != null) {
            c0520j.f2128a.remove(num);
        }
        c0520j.f2132e.remove(str);
        if (linkedHashMap.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + linkedHashMap.get(str));
            linkedHashMap.remove(str);
        }
        if (bundle.containsKey(str)) {
            if (Build.VERSION.SDK_INT >= 34) {
                parcelable = AbstractC1086l.m2293c(str, bundle);
            } else {
                parcelable = bundle.getParcelable(str);
                if (!C0783a.class.isInstance(parcelable)) {
                    parcelable = null;
                }
            }
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0783a) parcelable));
            bundle.remove(str);
        }
        if (c0520j.f2130c.get(str) != null) {
            throw new ClassCastException();
        }
    }

    @Override // p134p3.InterfaceC2213g
    /* renamed from: a */
    public void mo44a(int i) {
        int i4;
        if (i >= 40) {
            ((C2211e) this.f63l).m3986n(-1);
            return;
        }
        if (10 > i || i >= 20) {
            return;
        }
        C2211e c2211e = (C2211e) this.f63l;
        synchronized (((C1584b) c2211e.f7653g)) {
            i4 = c2211e.f7649c;
        }
        c2211e.m3986n(i4 / 2);
    }

    /* renamed from: b */
    public void m45b(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m45b(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p066h4.InterfaceC1180n
    /* renamed from: c */
    public void mo46c(Bitmap bitmap, InterfaceC0567a interfaceC0567a) throws IOException {
        IOException iOException = ((C2469d) this.f63l).f9054k;
        if (iOException != null) {
            if (bitmap == null) {
                throw iOException;
            }
            interfaceC0567a.mo1309e(bitmap);
            throw iOException;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0727d
    /* renamed from: d */
    public void mo47d(Exception exc) {
        C0090k0 c0090k0 = (C0090k0) this.f63l;
        C0900q c0900q = (C0900q) this.f62k;
        C0900q c0900q2 = c0090k0.f397o;
        if (c0900q2 == null || c0900q2 != c0900q) {
            return;
        }
        C0090k0 c0090k02 = (C0090k0) this.f63l;
        C0900q c0900q3 = (C0900q) this.f62k;
        RunnableC0091l runnableC0091l = c0090k02.f393k;
        C0079f c0079f = c0090k02.f398p;
        InterfaceC0728e interfaceC0728e = c0900q3.f3932c;
        runnableC0091l.mo311c(c0079f, exc, interfaceC0728e, interfaceC0728e.mo1647c());
    }

    @Override // p134p3.InterfaceC2213g
    /* renamed from: e */
    public C2208b mo48e(C2207a c2207a) {
        C2210d c2210d = (C2210d) ((C2211e) this.f63l).m3979g(c2207a);
        if (c2210d != null) {
            return new C2208b(c2210d.f7725a, c2210d.f7726b);
        }
        return null;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC0727d
    /* renamed from: f */
    public void mo49f(Object obj) {
        C0090k0 c0090k0 = (C0090k0) this.f63l;
        C0900q c0900q = (C0900q) this.f62k;
        C0900q c0900q2 = c0090k0.f397o;
        if (c0900q2 == null || c0900q2 != c0900q) {
            return;
        }
        C0090k0 c0090k02 = (C0090k0) this.f63l;
        C0900q c0900q3 = (C0900q) this.f62k;
        C0093n c0093n = c0090k02.f392j.f381p;
        if (obj != null && c0093n.m344a(c0900q3.f3932c.mo1647c())) {
            c0090k02.f396n = obj;
            c0090k02.f393k.m338l(2);
        } else {
            RunnableC0091l runnableC0091l = c0090k02.f393k;
            InterfaceC2801e interfaceC2801e = c0900q3.f3930a;
            InterfaceC0728e interfaceC0728e = c0900q3.f3932c;
            runnableC0091l.mo310b(interfaceC2801e, obj, interfaceC0728e, interfaceC0728e.mo1647c(), c0090k02.f398p);
        }
    }

    @Override // p134p3.InterfaceC2213g
    /* renamed from: g */
    public void mo50g(C2207a c2207a, Bitmap bitmap, Map map) {
        int i;
        Object objRemove;
        int iM1392d = AbstractC0622v.m1392d(bitmap);
        C2211e c2211e = (C2211e) this.f63l;
        synchronized (((C1584b) c2211e.f7653g)) {
            i = c2211e.f7648b;
        }
        if (iM1392d <= i) {
            ((C2211e) this.f63l).m3983k(c2207a, new C2210d(bitmap, map, iM1392d));
            return;
        }
        C2211e c2211e2 = (C2211e) this.f63l;
        c2211e2.getClass();
        synchronized (((C1584b) c2211e2.f7653g)) {
            C2240b c2240b = (C2240b) c2211e2.f7652f;
            c2240b.getClass();
            objRemove = c2240b.f7770a.remove(c2207a);
            if (objRemove != null) {
                c2211e2.f7649c -= c2211e2.m3984l(c2207a, objRemove);
            }
        }
        if (objRemove != null) {
            c2211e2.mo3975c(c2207a, objRemove, null);
        }
        ((C0087j) this.f62k).m322h(c2207a, bitmap, map, iM1392d);
    }

    /* renamed from: h */
    public void m51h(boolean z7) {
        C0035n0 c0035n0 = (C0035n0) this.f63l;
        AbstractActivityC1083i abstractActivityC1083i = c0035n0.f134t.f278q;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0035n0.f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m51h(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p066h4.InterfaceC1180n
    /* renamed from: i */
    public void mo52i() {
        C1189w c1189w = (C1189w) this.f62k;
        synchronized (c1189w) {
            c1189w.f5062l = c1189w.f5060j.length;
        }
    }

    @Override // p210y3.InterfaceC2807k
    /* renamed from: j */
    public int mo53j(C2804h c2804h) {
        return 2;
    }

    @Override // p210y3.InterfaceC2798b
    /* renamed from: k */
    public boolean mo54k(Object obj, File file, C2804h c2804h) {
        return ((C1166b) this.f63l).mo54k(new C1168c(((BitmapDrawable) ((InterfaceC0080f0) obj).get()).getBitmap(), (InterfaceC0567a) this.f62k), file, c2804h);
    }

    @Override // p089k1.InterfaceC1563g
    /* renamed from: l */
    public InterfaceC1564h mo55l() {
        return new C1569m((Context) this.f62k, ((C1245e) this.f63l).mo55l());
    }

    /* renamed from: m */
    public void m56m(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m56m(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: n */
    public void m57n(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m57n(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: o */
    public void m58o(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m58o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    @Override // p070i0.InterfaceC1216a
    public void onCancel() {
        ((Animator) this.f62k).end();
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Animator from operation " + ((C0059z0) this.f63l) + " has been canceled.");
        }
    }

    /* renamed from: p */
    public void m59p(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m59p(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: q */
    public void m60q(boolean z7) {
        C0035n0 c0035n0 = (C0035n0) this.f63l;
        AbstractActivityC1083i abstractActivityC1083i = c0035n0.f134t.f278q;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0035n0.f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m60q(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: r */
    public void m61r(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m61r(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: s */
    public void m62s(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m62s(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: t */
    public void m63t(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m63t(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    public String toString() {
        switch (this.f61j) {
            case 6:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C0569c c0569c = (C0569c) this.f62k;
                C0569c c0569c2 = c0569c.f2277c;
                boolean z7 = false;
                while (!c0569c2.equals(c0569c)) {
                    sb.append('{');
                    sb.append(c0569c2.f2275a);
                    sb.append(':');
                    ArrayList arrayList = c0569c2.f2276b;
                    sb.append(arrayList != null ? arrayList.size() : 0);
                    sb.append("}, ");
                    c0569c2 = c0569c2.f2277c;
                    z7 = true;
                }
                if (z7) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                return "Bounds{lower=" + ((C0851b) this.f62k) + " upper=" + ((C0851b) this.f63l) + "}";
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m64u(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m64u(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: v */
    public void m65v(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m65v(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: w */
    public void m66w(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m66w(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: x */
    public void m67x(boolean z7) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0035n0) this.f63l).f136v;
        if (abstractComponentCallbacksC0050v != null) {
            abstractComponentCallbacksC0050v.m229j().f126l.m67x(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f62k).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    /* renamed from: y */
    public Object m68y(InterfaceC0574h interfaceC0574h) {
        HashMap map = (HashMap) this.f63l;
        C0569c c0569c = (C0569c) map.get(interfaceC0574h);
        if (c0569c == null) {
            c0569c = new C0569c(interfaceC0574h);
            map.put(interfaceC0574h, c0569c);
        } else {
            interfaceC0574h.mo1315a();
        }
        C0569c c0569c2 = c0569c.f2278d;
        c0569c2.f2277c = c0569c.f2277c;
        c0569c.f2277c.f2278d = c0569c2;
        C0569c c0569c3 = (C0569c) this.f62k;
        c0569c.f2278d = c0569c3;
        C0569c c0569c4 = c0569c3.f2277c;
        c0569c.f2277c = c0569c4;
        c0569c4.f2278d = c0569c;
        c0569c.f2278d.f2277c = c0569c;
        ArrayList arrayList = c0569c.f2276b;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return c0569c.f2276b.remove(size - 1);
        }
        return null;
    }

    /* renamed from: z */
    public InterfaceC1987n m69z(Object... objArr) {
        Constructor constructorM3808a;
        synchronized (((AtomicBoolean) this.f63l)) {
            if (!((AtomicBoolean) this.f63l).get()) {
                try {
                    constructorM3808a = ((C1950b) this.f62k).m3808a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f63l).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            constructorM3808a = null;
        }
        if (constructorM3808a == null) {
            return null;
        }
        try {
            return (InterfaceC1987n) constructorM3808a.newInstance(objArr);
        } catch (Exception e8) {
            throw new IllegalStateException("Unexpected error creating extractor", e8);
        }
    }

    public /* synthetic */ C0016e(Object obj, int i, Object obj2) {
        this.f61j = i;
        this.f62k = obj;
        this.f63l = obj2;
    }

    public /* synthetic */ C0016e(Object obj, Object obj2, int i, boolean z7) {
        this.f61j = i;
        this.f63l = obj;
        this.f62k = obj2;
    }

    public C0016e(int i) {
        this.f61j = i;
        switch (i) {
            case 7:
                this.f62k = new HashMap();
                this.f63l = new C0639c(0);
                break;
            case 8:
                this.f62k = new C2474i(1000L);
                this.f63l = AbstractC2547c.m4561a(10, new C2819f(13));
                break;
            case 20:
                this.f62k = new HashMap();
                break;
            case AnalyticsListener.EVENT_METADATA /* 28 */:
                this.f62k = new AtomicReference();
                this.f63l = new C2186e(0);
                break;
            case AnalyticsListener.EVENT_DEVICE_INFO_CHANGED /* 29 */:
                this.f62k = new ArrayList();
                this.f63l = new HashMap();
                break;
            default:
                this.f62k = new C0569c(null);
                this.f63l = new HashMap();
                break;
        }
    }

    public C0016e(C1584b c1584b) {
        this.f61j = 26;
        this.f62k = new HashMap();
        this.f63l = c1584b;
    }

    public C0016e(MainActivity mainActivity) {
        this.f61j = 9;
        this.f62k = mainActivity;
        C0654c1 c0654c1 = new C0654c1(0, this);
        LinearLayout linearLayout = new LinearLayout(mainActivity);
        final int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(AbstractC0704z.f2752b);
        linearLayout.setPadding(((Number) c0654c1.invoke(10)).intValue(), ((Number) c0654c1.invoke(6)).intValue(), ((Number) c0654c1.invoke(10)).intValue(), ((Number) c0654c1.invoke(4)).intValue());
        LinearLayout linearLayout2 = new LinearLayout(mainActivity);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(((Number) c0654c1.invoke(12)).intValue(), ((Number) c0654c1.invoke(9)).intValue(), ((Number) c0654c1.invoke(8)).intValue(), ((Number) c0654c1.invoke(9)).intValue());
        int i4 = AbstractC0704z.f2758h;
        int i8 = AbstractC0704z.f2759i;
        linearLayout2.setBackground(C0672j.m1449i(i4, 14, 1, i8));
        linearLayout2.setClickable(true);
        linearLayout2.setFocusable(false);
        final int i9 = 0;
        linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: c5.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        MainActivity mainActivity2 = (MainActivity) this.f62k;
                        try {
                            try {
                                mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tg://resolve?domain=exoTVchannel")));
                                break;
                            } catch (ActivityNotFoundException unused) {
                                Toast.makeText(mainActivity2, R.string.telegram_promo_no_app, 0).show();
                                return;
                            }
                        } catch (ActivityNotFoundException unused2) {
                            mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/exoTVchannel")));
                            return;
                        }
                    default:
                        C0016e.f60m = true;
                        ((LinearLayout) this.f63l).setVisibility(8);
                        break;
                }
            }
        });
        ImageView imageView = new ImageView(mainActivity);
        imageView.setImageResource(R.drawable.ic_telegram);
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setBackground(C0672j.m1449i(-1, 999, 0, 0));
        imageView.setContentDescription(mainActivity.getString(R.string.telegram_promo_mark));
        linearLayout2.addView(imageView, new LinearLayout.LayoutParams(((Number) c0654c1.invoke(30)).intValue(), ((Number) c0654c1.invoke(30)).intValue()));
        LinearLayout linearLayout3 = new LinearLayout(mainActivity);
        linearLayout3.setOrientation(1);
        linearLayout3.setPadding(((Number) c0654c1.invoke(12)).intValue(), 0, ((Number) c0654c1.invoke(8)).intValue(), 0);
        TextView textView = new TextView(mainActivity);
        textView.setText(R.string.telegram_promo_title);
        textView.setTextColor(-1);
        textView.setTextSize(14.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setIncludeFontPadding(false);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(mainActivity);
        textView2.setText(R.string.telegram_promo_handle);
        int i10 = AbstractC0704z.f2753c;
        textView2.setTextColor(i10);
        textView2.setTextSize(12.0f);
        textView2.setMaxLines(1);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = ((Number) c0654c1.invoke(2)).intValue();
        linearLayout3.addView(textView2, layoutParams);
        linearLayout2.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        ImageView imageView2 = new ImageView(mainActivity);
        imageView2.setImageResource(R.drawable.ic_close);
        imageView2.setScaleType(scaleType);
        imageView2.setBackground(C0672j.m1449i(i8, 999, 0, 0));
        imageView2.setPadding(((Number) c0654c1.invoke(7)).intValue(), ((Number) c0654c1.invoke(7)).intValue(), ((Number) c0654c1.invoke(7)).intValue(), ((Number) c0654c1.invoke(7)).intValue());
        imageView2.setColorFilter(i10);
        imageView2.setContentDescription(mainActivity.getString(R.string.telegram_promo_close));
        imageView2.setClickable(true);
        imageView2.setOnClickListener(new View.OnClickListener() { // from class: c5.d1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        MainActivity mainActivity2 = (MainActivity) this.f62k;
                        try {
                            try {
                                mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("tg://resolve?domain=exoTVchannel")));
                                break;
                            } catch (ActivityNotFoundException unused) {
                                Toast.makeText(mainActivity2, R.string.telegram_promo_no_app, 0).show();
                                return;
                            }
                        } catch (ActivityNotFoundException unused2) {
                            mainActivity2.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://t.me/exoTVchannel")));
                            return;
                        }
                    default:
                        C0016e.f60m = true;
                        ((LinearLayout) this.f63l).setVisibility(8);
                        break;
                }
            }
        });
        linearLayout2.addView(imageView2, new LinearLayout.LayoutParams(((Number) c0654c1.invoke(32)).intValue(), ((Number) c0654c1.invoke(32)).intValue()));
        linearLayout.addView(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
        this.f63l = linearLayout;
    }

    public C0016e(C0035n0 c0035n0) {
        this.f61j = 2;
        this.f62k = new CopyOnWriteArrayList();
        this.f63l = c0035n0;
    }

    public C0016e(int i, C0087j c0087j) {
        this.f61j = 27;
        this.f62k = c0087j;
        this.f63l = new C2211e(i, this);
    }

    public C0016e(Context context) {
        this.f61j = 19;
        C1245e c1245e = new C1245e(1);
        this.f62k = context.getApplicationContext();
        this.f63l = c1245e;
    }

    public C0016e(MediaCodec.CryptoInfo cryptoInfo) {
        this.f61j = 23;
        this.f62k = cryptoInfo;
        this.f63l = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public C0016e(Animation animation) {
        this.f61j = 1;
        this.f63l = animation;
        this.f62k = null;
    }

    public C0016e(Animator animator) {
        this.f61j = 1;
        this.f63l = null;
        this.f62k = animator;
    }

    public C0016e(ArrayList arrayList, ArrayList arrayList2) {
        this.f61j = 11;
        int size = arrayList.size();
        this.f62k = new int[size];
        this.f63l = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.f62k)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.f63l)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public C0016e(int i, int i4) {
        this.f61j = 11;
        this.f62k = new int[]{i, i4};
        this.f63l = new float[]{0.0f, 1.0f};
    }

    public C0016e(WindowInsetsAnimation.Bounds bounds) {
        this.f61j = 22;
        this.f62k = C1865z0.m3655g(bounds);
        this.f63l = C1865z0.m3654f(bounds);
    }

    public C0016e(int i, int i4, int i8) {
        this.f61j = 11;
        this.f62k = new int[]{i, i4, i8};
        this.f63l = new float[]{0.0f, 0.5f, 1.0f};
    }

    public C0016e(Matcher matcher, CharSequence charSequence) {
        this.f61j = 16;
        AbstractC2980h.m5136e("input", charSequence);
        this.f62k = matcher;
    }

    public C0016e(C1950b c1950b) {
        this.f61j = 24;
        this.f62k = c1950b;
        this.f63l = new AtomicBoolean(false);
    }
}
