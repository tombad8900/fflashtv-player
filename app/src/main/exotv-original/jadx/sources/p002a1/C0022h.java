package p002a1;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.util.Log;
import android.util.SparseArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.bumptech.glide.AbstractC0714c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.zip.Inflater;
import p052f6.AbstractC0983m0;
import p052f6.C0977k0;
import p052f6.C0981l1;
import p055g0.InterfaceMenuItemC1027a;
import p056g1.C1029b;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p063h1.InterfaceC1111f;
import p070i0.InterfaceC1216a;
import p071i1.C1230i;
import p087k.AbstractC1536a;
import p087k.C1540e;
import p090k2.C1585c;
import p090k2.C1598p;
import p090k2.InterfaceC1599q;
import p095l.MenuC1614c0;
import p095l.MenuC1627m;
import p095l.MenuItemC1635u;
import p096l0.C1643c;
import p116n2.C2000a;
import p130p.C2186e;
import p130p.C2189h;
import p130p.C2192k;
import p183v0.C2519s;
import p183v0.C2522v;
import p191w0.C2597a;
import p191w0.C2598b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.h */
/* loaded from: classes.dex */
public final class C0022h implements InterfaceC1216a, InterfaceC1599q {

    /* renamed from: j */
    public final Object f78j;

    /* renamed from: k */
    public final Object f79k;

    /* renamed from: l */
    public final Object f80l;

    /* renamed from: m */
    public Object f81m;

    public C0022h(int i) {
        switch (i) {
            case 2:
                this.f78j = new C2186e(0);
                this.f79k = new SparseArray();
                this.f80l = new C2189h();
                this.f81m = new C2186e(0);
                break;
            case 5:
                this.f78j = new C1132w();
                this.f79k = new C1132w();
                this.f80l = new C2000a();
                break;
            case 7:
                this.f78j = new C1643c(10);
                this.f79k = new C2192k(0);
                this.f80l = new ArrayList();
                this.f81m = new HashSet();
                break;
            default:
                this.f78j = new ArrayList();
                this.f79k = new HashMap();
                this.f80l = new HashMap();
                break;
        }
    }

    /* renamed from: a */
    public void m71a(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        if (((ArrayList) this.f78j).contains(abstractComponentCallbacksC0050v)) {
            throw new IllegalStateException("Fragment already added: " + abstractComponentCallbacksC0050v);
        }
        synchronized (((ArrayList) this.f78j)) {
            ((ArrayList) this.f78j).add(abstractComponentCallbacksC0050v);
        }
        abstractComponentCallbacksC0050v.f246t = true;
    }

    /* renamed from: b */
    public void m72b(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C2192k) this.f79k).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                m72b(arrayList2.get(i), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    /* renamed from: c */
    public AbstractComponentCallbacksC0050v m73c(String str) {
        C0049u0 c0049u0 = (C0049u0) ((HashMap) this.f79k).get(str);
        if (c0049u0 != null) {
            return c0049u0.f205c;
        }
        return null;
    }

    /* renamed from: e */
    public AbstractComponentCallbacksC0050v m74e(String str) {
        for (C0049u0 c0049u0 : ((HashMap) this.f79k).values()) {
            if (c0049u0 != null) {
                AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM74e = c0049u0.f205c;
                if (!str.equals(abstractComponentCallbacksC0050vM74e.f240n)) {
                    abstractComponentCallbacksC0050vM74e = abstractComponentCallbacksC0050vM74e.f211C.f117c.m74e(str);
                }
                if (abstractComponentCallbacksC0050vM74e != null) {
                    return abstractComponentCallbacksC0050vM74e;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008e  */
    @Override // p090k2.InterfaceC1599q
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo75f(byte[] bArr, int i, int i4, C1598p c1598p, InterfaceC1111f interfaceC1111f) {
        char c8;
        ArrayList arrayList;
        C1132w c1132w;
        C1029b c1029b;
        int i8;
        int iM2535u;
        C1132w c1132w2;
        int i9;
        int i10;
        int iM2538x;
        C2000a c2000a = (C2000a) this.f80l;
        C1132w c1132w3 = (C1132w) this.f78j;
        c1132w3.m2511E(bArr, i + i4);
        c1132w3.m2513G(i);
        C1132w c1132w4 = (C1132w) this.f79k;
        char c9 = '\u00ff';
        if (c1132w3.m2515a() > 0 && (c1132w3.f4799a[c1132w3.f4800b] & 255) == 120) {
            if (((Inflater) this.f81m) == null) {
                this.f81m = new Inflater();
            }
            if (AbstractC1118i0.m2421L(c1132w3, c1132w4, (Inflater) this.f81m)) {
                c1132w3.m2511E(c1132w4.f4799a, c1132w4.f4801c);
            }
        }
        int i11 = 0;
        c2000a.f7419d = 0;
        int[] iArr = c2000a.f7417b;
        C1132w c1132w5 = c2000a.f7416a;
        c2000a.f7420e = 0;
        c2000a.f7421f = 0;
        c2000a.f7422g = 0;
        c2000a.f7423h = 0;
        c2000a.f7424i = 0;
        c1132w5.m2510D(0);
        c2000a.f7418c = false;
        ArrayList arrayList2 = new ArrayList();
        while (c1132w3.m2515a() >= 3) {
            int i12 = c1132w3.f4801c;
            int iM2535u2 = c1132w3.m2535u();
            int iM2507A = c1132w3.m2507A();
            int i13 = c1132w3.f4800b + iM2507A;
            if (i13 > i12) {
                c1132w3.m2513G(i12);
                i8 = i11;
                c8 = c9;
                c1132w = c1132w5;
                arrayList = arrayList2;
                c1029b = null;
            } else {
                char c10 = '\u0080';
                if (iM2535u2 != 128) {
                    switch (iM2535u2) {
                        case 20:
                            if (iM2507A % 5 == 2) {
                                c1132w3.m2514H(2);
                                Arrays.fill(iArr, i11);
                                int i14 = iM2507A / 5;
                                int i15 = i11;
                                while (i15 < i14) {
                                    int iM2535u3 = c1132w3.m2535u();
                                    char c11 = c10;
                                    double dM2535u = c1132w3.m2535u();
                                    double dM2535u2 = c1132w3.m2535u() - 128;
                                    double dM2535u3 = c1132w3.m2535u() - 128;
                                    iArr[iM2535u3] = (AbstractC1118i0.m2451j((int) ((1.402d * dM2535u2) + dM2535u), 0, 255) << 16) | (c1132w3.m2535u() << 24) | (AbstractC1118i0.m2451j((int) ((dM2535u - (0.34414d * dM2535u3)) - (dM2535u2 * 0.71414d)), 0, 255) << 8) | AbstractC1118i0.m2451j((int) ((dM2535u3 * 1.772d) + dM2535u), 0, 255);
                                    i15++;
                                    arrayList2 = arrayList2;
                                    c10 = c11;
                                    c9 = '\u00ff';
                                    c1132w5 = c1132w5;
                                    c2000a = c2000a;
                                }
                                c8 = c9;
                                c1132w2 = c1132w5;
                                arrayList = arrayList2;
                                c2000a.f7418c = true;
                                break;
                            } else {
                                c8 = c9;
                                c1132w2 = c1132w5;
                                arrayList = arrayList2;
                                break;
                            }
                        case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                            if (iM2507A >= 4) {
                                c1132w3.m2514H(3);
                                int i16 = iM2507A - 4;
                                if (((128 & c1132w3.m2535u()) != 0 ? 1 : i11) == 0) {
                                    i9 = c1132w5.f4800b;
                                    i10 = c1132w5.f4801c;
                                    if (i9 < i10 && i16 > 0) {
                                        int iMin = Math.min(i16, i10 - i9);
                                        c1132w3.m2519e(c1132w5.f4799a, i9, iMin);
                                        c1132w5.m2513G(i9 + iMin);
                                    }
                                } else if (i16 >= 7 && (iM2538x = c1132w3.m2538x()) >= 4) {
                                    c2000a.f7423h = c1132w3.m2507A();
                                    c2000a.f7424i = c1132w3.m2507A();
                                    c1132w5.m2510D(iM2538x - 4);
                                    i16 = iM2507A - 11;
                                    i9 = c1132w5.f4800b;
                                    i10 = c1132w5.f4801c;
                                    if (i9 < i10) {
                                        int iMin2 = Math.min(i16, i10 - i9);
                                        c1132w3.m2519e(c1132w5.f4799a, i9, iMin2);
                                        c1132w5.m2513G(i9 + iMin2);
                                    }
                                }
                            }
                            c8 = c9;
                            c1132w2 = c1132w5;
                            arrayList = arrayList2;
                            break;
                        case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                            if (iM2507A >= 19) {
                                c2000a.f7419d = c1132w3.m2507A();
                                c2000a.f7420e = c1132w3.m2507A();
                                c1132w3.m2514H(11);
                                c2000a.f7421f = c1132w3.m2507A();
                                c2000a.f7422g = c1132w3.m2507A();
                            }
                            c8 = c9;
                            c1132w2 = c1132w5;
                            arrayList = arrayList2;
                            break;
                    }
                    c1132w = c1132w2;
                    i8 = 0;
                    c1029b = null;
                } else {
                    c8 = c9;
                    C1132w c1132w6 = c1132w5;
                    arrayList = arrayList2;
                    if (c2000a.f7419d == 0 || c2000a.f7420e == 0 || c2000a.f7423h == 0 || c2000a.f7424i == 0) {
                        c1132w = c1132w6;
                    } else {
                        c1132w = c1132w6;
                        int i17 = c1132w.f4801c;
                        if (i17 != 0 && c1132w.f4800b == i17 && c2000a.f7418c) {
                            c1132w.m2513G(0);
                            int i18 = c2000a.f7423h * c2000a.f7424i;
                            int[] iArr2 = new int[i18];
                            int i19 = 0;
                            while (i19 < i18) {
                                int iM2535u4 = c1132w.m2535u();
                                if (iM2535u4 != 0) {
                                    iM2535u = i19 + 1;
                                    iArr2[i19] = iArr[iM2535u4];
                                } else {
                                    int iM2535u5 = c1132w.m2535u();
                                    if (iM2535u5 != 0) {
                                        iM2535u = ((iM2535u5 & 64) == 0 ? iM2535u5 & 63 : ((iM2535u5 & 63) << 8) | c1132w.m2535u()) + i19;
                                        Arrays.fill(iArr2, i19, iM2535u, (iM2535u5 & 128) == 0 ? iArr[0] : iArr[c1132w.m2535u()]);
                                    }
                                }
                                i19 = iM2535u;
                            }
                            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, c2000a.f7423h, c2000a.f7424i, Bitmap.Config.ARGB_8888);
                            float f8 = c2000a.f7421f;
                            float f9 = c2000a.f7419d;
                            float f10 = f8 / f9;
                            float f11 = c2000a.f7422g;
                            float f12 = c2000a.f7420e;
                            c1029b = new C1029b(null, null, null, bitmapCreateBitmap, f11 / f12, 0, 0, f10, 0, Integer.MIN_VALUE, -3.4028235E38f, c2000a.f7423h / f9, c2000a.f7424i / f12, false, -16777216, Integer.MIN_VALUE, 0.0f);
                        }
                        i8 = 0;
                        c2000a.f7419d = 0;
                        c2000a.f7420e = 0;
                        c2000a.f7421f = 0;
                        c2000a.f7422g = 0;
                        c2000a.f7423h = 0;
                        c2000a.f7424i = 0;
                        c1132w.m2510D(0);
                        c2000a.f7418c = false;
                    }
                    c1029b = null;
                    i8 = 0;
                    c2000a.f7419d = 0;
                    c2000a.f7420e = 0;
                    c2000a.f7421f = 0;
                    c2000a.f7422g = 0;
                    c2000a.f7423h = 0;
                    c2000a.f7424i = 0;
                    c1132w.m2510D(0);
                    c2000a.f7418c = false;
                }
                c1132w3.m2513G(i13);
            }
            arrayList2 = arrayList;
            if (c1029b != null) {
                arrayList2.add(c1029b);
            }
            c1132w5 = c1132w;
            i11 = i8;
            c9 = c8;
        }
        interfaceC1111f.accept(new C1585c(arrayList2, -9223372036854775807L, -9223372036854775807L));
    }

    /* renamed from: g */
    public C1540e m76g(AbstractC1536a abstractC1536a) {
        ArrayList arrayList = (ArrayList) this.f80l;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1540e c1540e = (C1540e) arrayList.get(i);
            if (c1540e != null && c1540e.f5872b == abstractC1536a) {
                return c1540e;
            }
        }
        C1540e c1540e2 = new C1540e((Context) this.f79k, abstractC1536a);
        arrayList.add(c1540e2);
        return c1540e2;
    }

    @Override // p090k2.InterfaceC1599q
    /* renamed from: h */
    public int mo77h() {
        return 2;
    }

    /* renamed from: i */
    public ArrayList m78i() {
        ArrayList arrayList = new ArrayList();
        for (C0049u0 c0049u0 : ((HashMap) this.f79k).values()) {
            if (c0049u0 != null) {
                arrayList.add(c0049u0);
            }
        }
        return arrayList;
    }

    /* renamed from: j */
    public ArrayList m79j() {
        ArrayList arrayList = new ArrayList();
        for (C0049u0 c0049u0 : ((HashMap) this.f79k).values()) {
            if (c0049u0 != null) {
                arrayList.add(c0049u0.f205c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    /* renamed from: k */
    public List m80k() {
        ArrayList arrayList;
        if (((ArrayList) this.f78j).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f78j)) {
            arrayList = new ArrayList((ArrayList) this.f78j);
        }
        return arrayList;
    }

    /* renamed from: l */
    public void m81l(C0049u0 c0049u0) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u0.f205c;
        String str = abstractComponentCallbacksC0050v.f240n;
        HashMap map = (HashMap) this.f79k;
        if (map.get(str) != null) {
            return;
        }
        map.put(abstractComponentCallbacksC0050v.f240n, c0049u0);
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + abstractComponentCallbacksC0050v);
        }
    }

    /* renamed from: m */
    public void m82m(C0049u0 c0049u0) {
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u0.f205c;
        if (abstractComponentCallbacksC0050v.f218J) {
            ((C0041q0) this.f81m).m194e(abstractComponentCallbacksC0050v);
        }
        if (((C0049u0) ((HashMap) this.f79k).put(abstractComponentCallbacksC0050v.f240n, null)) != null && C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + abstractComponentCallbacksC0050v);
        }
    }

    /* renamed from: n */
    public boolean m83n(AbstractC1536a abstractC1536a, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f78j).onActionItemClicked(m76g(abstractC1536a), new MenuItemC1635u((Context) this.f79k, (InterfaceMenuItemC1027a) menuItem));
    }

    /* renamed from: o */
    public boolean m84o(AbstractC1536a abstractC1536a, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f78j;
        C1540e c1540eM76g = m76g(abstractC1536a);
        C2192k c2192k = (C2192k) this.f81m;
        Menu menuC1614c0 = (Menu) c2192k.get(menu);
        if (menuC1614c0 == null) {
            menuC1614c0 = new MenuC1614c0((Context) this.f79k, (MenuC1627m) menu);
            c2192k.put(menu, menuC1614c0);
        }
        return callback.onCreateActionMode(c1540eM76g, menuC1614c0);
    }

    @Override // p070i0.InterfaceC1216a
    public void onCancel() {
        View view = (View) this.f78j;
        view.clearAnimation();
        ((ViewGroup) this.f79k).endViewTransition(view);
        ((C0024i) this.f80l).m91d();
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Animation from operation " + ((C0059z0) this.f81m) + " has been cancelled.");
        }
    }

    public C0022h(Typeface typeface, C2598b c2598b) {
        int i;
        int i4;
        int i8;
        int i9;
        this.f81m = typeface;
        this.f78j = c2598b;
        this.f80l = new C2519s(1024);
        int iM3506a = c2598b.m3506a(6);
        if (iM3506a != 0) {
            int i10 = iM3506a + c2598b.f6852j;
            i = ((ByteBuffer) c2598b.f6855m).getInt(((ByteBuffer) c2598b.f6855m).getInt(i10) + i10);
        } else {
            i = 0;
        }
        this.f79k = new char[i * 2];
        int iM3506a2 = c2598b.m3506a(6);
        if (iM3506a2 != 0) {
            int i11 = iM3506a2 + c2598b.f6852j;
            i4 = ((ByteBuffer) c2598b.f6855m).getInt(((ByteBuffer) c2598b.f6855m).getInt(i11) + i11);
        } else {
            i4 = 0;
        }
        for (int i12 = 0; i12 < i4; i12++) {
            C2522v c2522v = new C2522v(this, i12);
            C2597a c2597aM4540b = c2522v.m4540b();
            int iM3506a3 = c2597aM4540b.m3506a(4);
            Character.toChars(iM3506a3 != 0 ? ((ByteBuffer) c2597aM4540b.f6855m).getInt(iM3506a3 + c2597aM4540b.f6852j) : 0, (char[]) this.f79k, i12 * 2);
            C2597a c2597aM4540b2 = c2522v.m4540b();
            int iM3506a4 = c2597aM4540b2.m3506a(16);
            if (iM3506a4 != 0) {
                int i13 = iM3506a4 + c2597aM4540b2.f6852j;
                i8 = ((ByteBuffer) c2597aM4540b2.f6855m).getInt(((ByteBuffer) c2597aM4540b2.f6855m).getInt(i13) + i13);
            } else {
                i8 = 0;
            }
            AbstractC0714c.m1524j("invalid metadata codepoint length", i8 > 0);
            C2519s c2519s = (C2519s) this.f80l;
            C2597a c2597aM4540b3 = c2522v.m4540b();
            int iM3506a5 = c2597aM4540b3.m3506a(16);
            if (iM3506a5 != 0) {
                int i14 = iM3506a5 + c2597aM4540b3.f6852j;
                i9 = ((ByteBuffer) c2597aM4540b3.f6855m).getInt(((ByteBuffer) c2597aM4540b3.f6855m).getInt(i14) + i14);
            } else {
                i9 = 0;
            }
            c2519s.m4533a(c2522v, 0, i9 - 1);
        }
    }

    public C0022h(Context context, ActionMode.Callback callback) {
        this.f79k = context;
        this.f78j = callback;
        this.f80l = new ArrayList();
        this.f81m = new C2192k(0);
    }

    public C0022h(C0024i c0024i, C0059z0 c0059z0, View view, ViewGroup viewGroup) {
        this.f78j = view;
        this.f79k = viewGroup;
        this.f80l = c0024i;
        this.f81m = c0059z0;
    }

    public C0022h(C0981l1 c0981l1, C1230i c1230i, C1230i c1230i2, C1230i c1230i3) {
        Object objM2165j;
        if (c0981l1 != null) {
            objM2165j = AbstractC0983m0.m2165j(c0981l1);
        } else {
            C0977k0 c0977k0 = AbstractC0983m0.f4215k;
            objM2165j = C0981l1.f4211n;
        }
        this.f78j = objM2165j;
        this.f79k = c1230i;
        this.f80l = c1230i2;
        this.f81m = c1230i3;
    }
}
