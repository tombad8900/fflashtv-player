package p071i1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.WeakHashMap;
import p005a4.C0073c;
import p054g.AbstractC1026a;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;
import p063h1.C1132w;
import p095l.C1629o;
import p096l0.C1643c;
import p104m.AbstractC1714e1;
import p104m.C1711d2;
import p104m.C1770t;
import p105m0.AbstractC1804e0;
import p105m0.AbstractC1828m0;
import p216z2.C2872a;
import p216z2.C2921w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i1.s */
/* loaded from: classes.dex */
public final class C1240s {

    /* renamed from: a */
    public int f5176a;

    /* renamed from: b */
    public final Object f5177b;

    /* renamed from: c */
    public final Object f5178c;

    /* renamed from: d */
    public Object f5179d;

    /* renamed from: e */
    public Object f5180e;

    /* renamed from: f */
    public Object f5181f;

    public C1240s(View view) {
        this.f5176a = -1;
        this.f5177b = view;
        this.f5178c = C1770t.m3453a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if (r9 < r2.f5175k) goto L32;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2691a(long j, C1132w c1132w) {
        ArrayDeque arrayDeque = (ArrayDeque) this.f5179d;
        PriorityQueue priorityQueue = (PriorityQueue) this.f5180e;
        int i = this.f5176a;
        if (i != 0) {
            if (i != -1 && priorityQueue.size() >= this.f5176a) {
                C1238q c1238q = (C1238q) priorityQueue.peek();
                int i4 = AbstractC1118i0.f4750a;
            }
            ArrayDeque arrayDeque2 = (ArrayDeque) this.f5178c;
            C1132w c1132w2 = arrayDeque2.isEmpty() ? new C1132w() : (C1132w) arrayDeque2.pop();
            c1132w2.m2510D(c1132w.m2515a());
            System.arraycopy(c1132w.f4799a, c1132w.f4800b, c1132w2.f4799a, 0, c1132w2.m2515a());
            C1238q c1238q2 = (C1238q) this.f5181f;
            if (c1238q2 != null && j == c1238q2.f5175k) {
                c1238q2.f5174j.add(c1132w2);
                return;
            }
            C1238q c1238q3 = arrayDeque.isEmpty() ? new C1238q() : (C1238q) arrayDeque.pop();
            ArrayList arrayList = c1238q3.f5174j;
            AbstractC1101a.m2353d(j != -9223372036854775807L);
            AbstractC1101a.m2359j(arrayList.isEmpty());
            c1238q3.f5175k = j;
            arrayList.add(c1132w2);
            priorityQueue.add(c1238q3);
            this.f5181f = c1238q3;
            int i8 = this.f5176a;
            if (i8 != -1) {
                m2699i(i8);
                return;
            }
            return;
        }
        ((InterfaceC1239r) this.f5177b).mo995a(j, c1132w);
    }

    /* renamed from: b */
    public void m2692b() {
        View view = (View) this.f5177b;
        Drawable background = view.getBackground();
        if (background != null) {
            if (((C1711d2) this.f5179d) != null) {
                if (((C1711d2) this.f5181f) == null) {
                    this.f5181f = new C1711d2();
                }
                C1711d2 c1711d2 = (C1711d2) this.f5181f;
                c1711d2.f6526a = null;
                c1711d2.f6529d = false;
                c1711d2.f6527b = null;
                c1711d2.f6528c = false;
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                ColorStateList colorStateListM3531c = AbstractC1804e0.m3531c(view);
                if (colorStateListM3531c != null) {
                    c1711d2.f6529d = true;
                    c1711d2.f6526a = colorStateListM3531c;
                }
                PorterDuff.Mode modeM3532d = AbstractC1804e0.m3532d(view);
                if (modeM3532d != null) {
                    c1711d2.f6528c = true;
                    c1711d2.f6527b = modeM3532d;
                }
                if (c1711d2.f6529d || c1711d2.f6528c) {
                    C1770t.m3456e(background, c1711d2, view.getDrawableState());
                    return;
                }
            }
            C1711d2 c1711d22 = (C1711d2) this.f5180e;
            if (c1711d22 != null) {
                C1770t.m3456e(background, c1711d22, view.getDrawableState());
                return;
            }
            C1711d2 c1711d23 = (C1711d2) this.f5179d;
            if (c1711d23 != null) {
                C1770t.m3456e(background, c1711d23, view.getDrawableState());
            }
        }
    }

    /* renamed from: c */
    public boolean m2693c(int i) {
        ArrayList arrayList = (ArrayList) this.f5179d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C2872a c2872a = (C2872a) arrayList.get(i4);
            int i8 = c2872a.f10602a;
            if (i8 != 8) {
                if (i8 == 1) {
                    int i9 = c2872a.f10603b;
                    int i10 = c2872a.f10605d + i9;
                    while (i9 < i10) {
                        if (m2698h(i9, i4 + 1) == i) {
                            return true;
                        }
                        i9++;
                    }
                } else {
                    continue;
                }
            } else {
                if (m2698h(c2872a.f10605d, i4 + 1) == i) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: d */
    public void m2694d() {
        ArrayList arrayList = (ArrayList) this.f5179d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C2921w) this.f5180e).m5077a((C2872a) arrayList.get(i));
        }
        m2709s(arrayList);
        this.f5176a = 0;
    }

    /* renamed from: e */
    public void m2695e() {
        C2921w c2921w = (C2921w) this.f5180e;
        m2694d();
        ArrayList arrayList = (ArrayList) this.f5178c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2872a c2872a = (C2872a) arrayList.get(i);
            int i4 = c2872a.f10602a;
            if (i4 == 1) {
                c2921w.m5077a(c2872a);
                c2921w.m5080d(c2872a.f10603b, c2872a.f10605d);
            } else if (i4 == 2) {
                c2921w.m5077a(c2872a);
                int i8 = c2872a.f10603b;
                int i9 = c2872a.f10605d;
                RecyclerView recyclerView = c2921w.f10867a;
                recyclerView.m1168S(i8, i9, true);
                recyclerView.f2073s0 = true;
                recyclerView.f2067p0.f10821c += i9;
            } else if (i4 == 4) {
                c2921w.m5077a(c2872a);
                c2921w.m5079c(c2872a.f10603b, c2872a.f10605d, c2872a.f10604c);
            } else if (i4 == 8) {
                c2921w.m5077a(c2872a);
                c2921w.m5081e(c2872a.f10603b, c2872a.f10605d);
            }
        }
        m2709s(arrayList);
        this.f5176a = 0;
    }

    /* renamed from: f */
    public void m2696f(C2872a c2872a) {
        int i;
        C1643c c1643c = (C1643c) this.f5177b;
        int i4 = c2872a.f10602a;
        if (i4 == 1 || i4 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM2713w = m2713w(c2872a.f10603b, i4);
        int i8 = c2872a.f10603b;
        int i9 = c2872a.f10602a;
        if (i9 == 2) {
            i = 0;
        } else {
            if (i9 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c2872a);
            }
            i = 1;
        }
        int i10 = 1;
        for (int i11 = 1; i11 < c2872a.f10605d; i11++) {
            int iM2713w2 = m2713w((i * i11) + c2872a.f10603b, c2872a.f10602a);
            int i12 = c2872a.f10602a;
            if (i12 == 2 ? iM2713w2 != iM2713w : !(i12 == 4 && iM2713w2 == iM2713w + 1)) {
                C2872a c2872aM2704n = m2704n(c2872a.f10604c, i12, iM2713w, i10);
                m2697g(c2872aM2704n, i8);
                c2872aM2704n.f10604c = null;
                c1643c.mo285g(c2872aM2704n);
                if (c2872a.f10602a == 4) {
                    i8 += i10;
                }
                i10 = 1;
                iM2713w = iM2713w2;
            } else {
                i10++;
            }
        }
        Object obj = c2872a.f10604c;
        c2872a.f10604c = null;
        c1643c.mo285g(c2872a);
        if (i10 > 0) {
            C2872a c2872aM2704n2 = m2704n(obj, c2872a.f10602a, iM2713w, i10);
            m2697g(c2872aM2704n2, i8);
            c2872aM2704n2.f10604c = null;
            c1643c.mo285g(c2872aM2704n2);
        }
    }

    /* renamed from: g */
    public void m2697g(C2872a c2872a, int i) {
        C2921w c2921w = (C2921w) this.f5180e;
        c2921w.m5077a(c2872a);
        int i4 = c2872a.f10602a;
        if (i4 != 2) {
            if (i4 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c2921w.m5079c(i, c2872a.f10605d, c2872a.f10604c);
        } else {
            int i8 = c2872a.f10605d;
            RecyclerView recyclerView = c2921w.f10867a;
            recyclerView.m1168S(i, i8, true);
            recyclerView.f2073s0 = true;
            recyclerView.f2067p0.f10821c += i8;
        }
    }

    /* renamed from: h */
    public int m2698h(int i, int i4) {
        ArrayList arrayList = (ArrayList) this.f5179d;
        int size = arrayList.size();
        while (i4 < size) {
            C2872a c2872a = (C2872a) arrayList.get(i4);
            int i8 = c2872a.f10602a;
            if (i8 == 8) {
                int i9 = c2872a.f10603b;
                if (i9 == i) {
                    i = c2872a.f10605d;
                } else {
                    if (i9 < i) {
                        i--;
                    }
                    if (c2872a.f10605d <= i) {
                        i++;
                    }
                }
            } else {
                int i10 = c2872a.f10603b;
                if (i10 > i) {
                    continue;
                } else if (i8 == 2) {
                    int i11 = c2872a.f10605d;
                    if (i < i10 + i11) {
                        return -1;
                    }
                    i -= i11;
                } else if (i8 == 1) {
                    i += c2872a.f10605d;
                }
            }
            i4++;
        }
        return i;
    }

    /* renamed from: i */
    public void m2699i(int i) {
        ArrayList arrayList;
        PriorityQueue priorityQueue = (PriorityQueue) this.f5180e;
        while (priorityQueue.size() > i) {
            C1238q c1238q = (C1238q) priorityQueue.poll();
            int i4 = AbstractC1118i0.f4750a;
            int i8 = 0;
            while (true) {
                arrayList = c1238q.f5174j;
                if (i8 >= arrayList.size()) {
                    break;
                }
                ((InterfaceC1239r) this.f5177b).mo995a(c1238q.f5175k, (C1132w) arrayList.get(i8));
                ((ArrayDeque) this.f5178c).push((C1132w) arrayList.get(i8));
                i8++;
            }
            arrayList.clear();
            C1238q c1238q2 = (C1238q) this.f5181f;
            if (c1238q2 != null && c1238q2.f5175k == c1238q.f5175k) {
                this.f5181f = null;
            }
            ((ArrayDeque) this.f5179d).push(c1238q);
        }
    }

    /* renamed from: j */
    public ColorStateList m2700j() {
        C1711d2 c1711d2 = (C1711d2) this.f5180e;
        if (c1711d2 != null) {
            return c1711d2.f6526a;
        }
        return null;
    }

    /* renamed from: k */
    public PorterDuff.Mode m2701k() {
        C1711d2 c1711d2 = (C1711d2) this.f5180e;
        if (c1711d2 != null) {
            return c1711d2.f6527b;
        }
        return null;
    }

    /* renamed from: l */
    public boolean m2702l() {
        return ((ArrayList) this.f5178c).size() > 0;
    }

    /* renamed from: m */
    public void m2703m(AttributeSet attributeSet, int i) {
        ColorStateList colorStateListM3482f;
        View view = (View) this.f5177b;
        Context context = view.getContext();
        int[] iArr = AbstractC1026a.f4332y;
        C0073c c0073cM263F = C0073c.m263F(i, 0, context, attributeSet, iArr);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        View view2 = (View) this.f5177b;
        AbstractC1828m0.m3607l(view2, view2.getContext(), iArr, attributeSet, (TypedArray) c0073cM263F.f325l, i);
        try {
            if (typedArray.hasValue(0)) {
                this.f5176a = typedArray.getResourceId(0, -1);
                C1770t c1770t = (C1770t) this.f5178c;
                Context context2 = view.getContext();
                int i4 = this.f5176a;
                synchronized (c1770t) {
                    colorStateListM3482f = c1770t.f6749a.m3482f(context2, i4);
                }
                if (colorStateListM3482f != null) {
                    m2710t(colorStateListM3482f);
                }
            }
            if (typedArray.hasValue(1)) {
                AbstractC1804e0.m3535g(view, c0073cM263F.m298w(1));
            }
            if (typedArray.hasValue(2)) {
                AbstractC1804e0.m3536h(view, AbstractC1714e1.m3393b(typedArray.getInt(2, -1), null));
            }
            c0073cM263F.m275I();
        } catch (Throwable th) {
            c0073cM263F.m275I();
            throw th;
        }
    }

    /* renamed from: n */
    public C2872a m2704n(Object obj, int i, int i4, int i8) {
        C2872a c2872a = (C2872a) ((C1643c) this.f5177b).acquire();
        if (c2872a != null) {
            c2872a.f10602a = i;
            c2872a.f10603b = i4;
            c2872a.f10605d = i8;
            c2872a.f10604c = obj;
            return c2872a;
        }
        C2872a c2872a2 = new C2872a();
        c2872a2.f10602a = i;
        c2872a2.f10603b = i4;
        c2872a2.f10605d = i8;
        c2872a2.f10604c = obj;
        return c2872a2;
    }

    /* renamed from: o */
    public void m2705o() {
        this.f5176a = -1;
        m2710t(null);
        m2692b();
    }

    /* renamed from: p */
    public void m2706p(int i) {
        ColorStateList colorStateListM3482f;
        this.f5176a = i;
        C1770t c1770t = (C1770t) this.f5178c;
        if (c1770t != null) {
            Context context = ((View) this.f5177b).getContext();
            synchronized (c1770t) {
                colorStateListM3482f = c1770t.f6749a.m3482f(context, i);
            }
        } else {
            colorStateListM3482f = null;
        }
        m2710t(colorStateListM3482f);
        m2692b();
    }

    /* renamed from: q */
    public void m2707q(C2872a c2872a) {
        C2921w c2921w = (C2921w) this.f5180e;
        ((ArrayList) this.f5179d).add(c2872a);
        int i = c2872a.f10602a;
        if (i == 1) {
            c2921w.m5080d(c2872a.f10603b, c2872a.f10605d);
            return;
        }
        if (i == 2) {
            int i4 = c2872a.f10603b;
            int i8 = c2872a.f10605d;
            RecyclerView recyclerView = c2921w.f10867a;
            recyclerView.m1168S(i4, i8, false);
            recyclerView.f2073s0 = true;
            return;
        }
        if (i == 4) {
            c2921w.m5079c(c2872a.f10603b, c2872a.f10605d, c2872a.f10604c);
        } else if (i == 8) {
            c2921w.m5081e(c2872a.f10603b, c2872a.f10605d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c2872a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:187:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x012b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00e3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0015 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0111  */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m2708r() {
        boolean z7;
        char c8;
        C2872a c2872aM2704n;
        int i;
        int i4;
        C2872a c2872aM2704n2;
        boolean z8;
        boolean z9;
        int i8;
        int i9;
        int i10;
        Object obj;
        C2872a c2872a;
        C1643c c1643c = (C1643c) this.f5177b;
        C2921w c2921w = (C2921w) this.f5180e;
        C1629o c1629o = (C1629o) this.f5181f;
        ArrayList arrayList = (ArrayList) this.f5178c;
        c1629o.getClass();
        while (true) {
            int size = arrayList.size() - 1;
            boolean z10 = false;
            while (true) {
                if (size < 0) {
                    size = -1;
                    break;
                }
                if (((C2872a) arrayList.get(size)).f10602a == 8) {
                    if (z10) {
                        break;
                    }
                } else {
                    z10 = true;
                }
                size--;
            }
            if (size == -1) {
                break;
            }
            int i11 = size + 1;
            C1240s c1240s = (C1240s) c1629o.f6229j;
            C1643c c1643c2 = (C1643c) c1240s.f5177b;
            C2872a c2872a2 = (C2872a) arrayList.get(size);
            C2872a c2872a3 = (C2872a) arrayList.get(i11);
            int i12 = c2872a3.f10602a;
            if (i12 == 1) {
                int i13 = c2872a2.f10605d;
                int i14 = c2872a3.f10603b;
                int i15 = i13 < i14 ? -1 : 0;
                int i16 = c2872a2.f10603b;
                if (i16 < i14) {
                    i15++;
                }
                if (i14 <= i16) {
                    c2872a2.f10603b = i16 + c2872a3.f10605d;
                }
                int i17 = c2872a3.f10603b;
                if (i17 <= i13) {
                    c2872a2.f10605d = i13 + c2872a3.f10605d;
                }
                c2872a3.f10603b = i17 + i15;
                arrayList.set(size, c2872a3);
                arrayList.set(i11, c2872a2);
            } else if (i12 == 2) {
                int i18 = c2872a2.f10603b;
                int i19 = c2872a2.f10605d;
                if (i18 < i19) {
                    if (c2872a3.f10603b == i18 && c2872a3.f10605d == i19 - i18) {
                        z9 = true;
                        z8 = false;
                        i8 = c2872a3.f10603b;
                        if (i19 >= i8) {
                        }
                        i9 = c2872a2.f10603b;
                        i10 = c2872a3.f10603b;
                        if (i9 > i10) {
                        }
                        obj = null;
                        c2872a = null;
                        if (z9) {
                        }
                    } else {
                        z8 = false;
                        z9 = false;
                        i8 = c2872a3.f10603b;
                        if (i19 >= i8) {
                            c2872a3.f10603b = i8 - 1;
                        } else {
                            int i20 = c2872a3.f10605d;
                            if (i19 < i8 + i20) {
                                c2872a3.f10605d = i20 - 1;
                                c2872a2.f10602a = 2;
                                c2872a2.f10605d = 1;
                                if (c2872a3.f10605d == 0) {
                                    arrayList.remove(i11);
                                    c2872a3.f10604c = null;
                                    c1643c2.mo285g(c2872a3);
                                }
                            }
                        }
                        i9 = c2872a2.f10603b;
                        i10 = c2872a3.f10603b;
                        if (i9 > i10) {
                            c2872a3.f10603b = i10 + 1;
                        } else {
                            int i21 = i10 + c2872a3.f10605d;
                            if (i9 < i21) {
                                obj = null;
                                C2872a c2872aM2704n3 = c1240s.m2704n(null, 2, i9 + 1, i21 - i9);
                                c2872a3.f10605d = c2872a2.f10603b - c2872a3.f10603b;
                                c2872a = c2872aM2704n3;
                            }
                            if (z9) {
                                arrayList.set(size, c2872a3);
                                arrayList.remove(i11);
                                c2872a2.f10604c = obj;
                                c1643c2.mo285g(c2872a2);
                            } else {
                                if (z8) {
                                    if (c2872a != null) {
                                        int i22 = c2872a2.f10603b;
                                        if (i22 > c2872a.f10603b) {
                                            c2872a2.f10603b = i22 - c2872a.f10605d;
                                        }
                                        int i23 = c2872a2.f10605d;
                                        if (i23 > c2872a.f10603b) {
                                            c2872a2.f10605d = i23 - c2872a.f10605d;
                                        }
                                    }
                                    int i24 = c2872a2.f10603b;
                                    if (i24 > c2872a3.f10603b) {
                                        c2872a2.f10603b = i24 - c2872a3.f10605d;
                                    }
                                    int i25 = c2872a2.f10605d;
                                    if (i25 > c2872a3.f10603b) {
                                        c2872a2.f10605d = i25 - c2872a3.f10605d;
                                    }
                                } else {
                                    if (c2872a != null) {
                                        int i26 = c2872a2.f10603b;
                                        if (i26 >= c2872a.f10603b) {
                                            c2872a2.f10603b = i26 - c2872a.f10605d;
                                        }
                                        int i27 = c2872a2.f10605d;
                                        if (i27 >= c2872a.f10603b) {
                                            c2872a2.f10605d = i27 - c2872a.f10605d;
                                        }
                                    }
                                    int i28 = c2872a2.f10603b;
                                    if (i28 >= c2872a3.f10603b) {
                                        c2872a2.f10603b = i28 - c2872a3.f10605d;
                                    }
                                    int i29 = c2872a2.f10605d;
                                    if (i29 >= c2872a3.f10603b) {
                                        c2872a2.f10605d = i29 - c2872a3.f10605d;
                                    }
                                }
                                arrayList.set(size, c2872a3);
                                if (c2872a2.f10603b != c2872a2.f10605d) {
                                    arrayList.set(i11, c2872a2);
                                } else {
                                    arrayList.remove(i11);
                                }
                                if (c2872a != null) {
                                    arrayList.add(size, c2872a);
                                }
                            }
                        }
                        obj = null;
                        c2872a = null;
                        if (z9) {
                        }
                    }
                } else if (c2872a3.f10603b == i19 + 1 && c2872a3.f10605d == i18 - i19) {
                    z8 = true;
                    z9 = true;
                    i8 = c2872a3.f10603b;
                    if (i19 >= i8) {
                    }
                    i9 = c2872a2.f10603b;
                    i10 = c2872a3.f10603b;
                    if (i9 > i10) {
                    }
                    obj = null;
                    c2872a = null;
                    if (z9) {
                    }
                } else {
                    z8 = true;
                    z9 = false;
                    i8 = c2872a3.f10603b;
                    if (i19 >= i8) {
                    }
                    i9 = c2872a2.f10603b;
                    i10 = c2872a3.f10603b;
                    if (i9 > i10) {
                    }
                    obj = null;
                    c2872a = null;
                    if (z9) {
                    }
                }
            } else if (i12 == 4) {
                int i30 = c2872a2.f10605d;
                int i31 = c2872a3.f10603b;
                if (i30 < i31) {
                    c2872a3.f10603b = i31 - 1;
                } else {
                    int i32 = c2872a3.f10605d;
                    if (i30 < i31 + i32) {
                        c2872a3.f10605d = i32 - 1;
                        c2872aM2704n = c1240s.m2704n(c2872a3.f10604c, 4, c2872a2.f10603b, 1);
                    }
                    i = c2872a2.f10603b;
                    i4 = c2872a3.f10603b;
                    if (i > i4) {
                        c2872a3.f10603b = i4 + 1;
                    } else {
                        int i33 = i4 + c2872a3.f10605d;
                        if (i < i33) {
                            int i34 = i33 - i;
                            c2872aM2704n2 = c1240s.m2704n(c2872a3.f10604c, 4, i + 1, i34);
                            c2872a3.f10605d -= i34;
                        }
                        arrayList.set(i11, c2872a2);
                        if (c2872a3.f10605d > 0) {
                            arrayList.set(size, c2872a3);
                        } else {
                            arrayList.remove(size);
                            c2872a3.f10604c = null;
                            c1643c2.mo285g(c2872a3);
                        }
                        if (c2872aM2704n != null) {
                            arrayList.add(size, c2872aM2704n);
                        }
                        if (c2872aM2704n2 != null) {
                            arrayList.add(size, c2872aM2704n2);
                        }
                    }
                    c2872aM2704n2 = null;
                    arrayList.set(i11, c2872a2);
                    if (c2872a3.f10605d > 0) {
                    }
                    if (c2872aM2704n != null) {
                    }
                    if (c2872aM2704n2 != null) {
                    }
                }
                c2872aM2704n = null;
                i = c2872a2.f10603b;
                i4 = c2872a3.f10603b;
                if (i > i4) {
                }
                c2872aM2704n2 = null;
                arrayList.set(i11, c2872a2);
                if (c2872a3.f10605d > 0) {
                }
                if (c2872aM2704n != null) {
                }
                if (c2872aM2704n2 != null) {
                }
            }
        }
        int size2 = arrayList.size();
        for (int i35 = 0; i35 < size2; i35++) {
            C2872a c2872aM2704n4 = (C2872a) arrayList.get(i35);
            int i36 = c2872aM2704n4.f10602a;
            if (i36 == 1) {
                m2707q(c2872aM2704n4);
            } else if (i36 == 2) {
                int i37 = c2872aM2704n4.f10603b;
                int i38 = c2872aM2704n4.f10605d + i37;
                int i39 = i37;
                int i40 = 0;
                char c9 = '\uffff';
                while (i39 < i38) {
                    if (c2921w.m5078b(i39) != null || m2693c(i39)) {
                        if (c9 == 0) {
                            m2696f(m2704n(null, 2, i37, i40));
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        c8 = 1;
                    } else {
                        if (c9 == 1) {
                            m2707q(m2704n(null, 2, i37, i40));
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        c8 = 0;
                    }
                    if (z7) {
                        i39 -= i40;
                        i38 -= i40;
                        i40 = 1;
                    } else {
                        i40++;
                    }
                    i39++;
                    c9 = c8;
                }
                if (i40 != c2872aM2704n4.f10605d) {
                    c2872aM2704n4.f10604c = null;
                    c1643c.mo285g(c2872aM2704n4);
                    c2872aM2704n4 = m2704n(null, 2, i37, i40);
                }
                if (c9 == 0) {
                    m2696f(c2872aM2704n4);
                } else {
                    m2707q(c2872aM2704n4);
                }
            } else if (i36 == 4) {
                int i41 = c2872aM2704n4.f10603b;
                int i42 = c2872aM2704n4.f10605d + i41;
                int i43 = i41;
                int i44 = 0;
                char c10 = '\uffff';
                while (i41 < i42) {
                    if (c2921w.m5078b(i41) != null || m2693c(i41)) {
                        if (c10 == 0) {
                            m2696f(m2704n(c2872aM2704n4.f10604c, 4, i43, i44));
                            i43 = i41;
                            i44 = 0;
                        }
                        c10 = 1;
                    } else {
                        if (c10 == 1) {
                            m2707q(m2704n(c2872aM2704n4.f10604c, 4, i43, i44));
                            i43 = i41;
                            i44 = 0;
                        }
                        c10 = 0;
                    }
                    i44++;
                    i41++;
                }
                if (i44 != c2872aM2704n4.f10605d) {
                    Object obj2 = c2872aM2704n4.f10604c;
                    c2872aM2704n4.f10604c = null;
                    c1643c.mo285g(c2872aM2704n4);
                    c2872aM2704n4 = m2704n(obj2, 4, i43, i44);
                }
                if (c10 == 0) {
                    m2696f(c2872aM2704n4);
                } else {
                    m2707q(c2872aM2704n4);
                }
            } else if (i36 == 8) {
                m2707q(c2872aM2704n4);
            }
        }
        arrayList.clear();
    }

    /* renamed from: s */
    public void m2709s(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2872a c2872a = (C2872a) arrayList.get(i);
            c2872a.f10604c = null;
            ((C1643c) this.f5177b).mo285g(c2872a);
        }
        arrayList.clear();
    }

    /* renamed from: t */
    public void m2710t(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (((C1711d2) this.f5179d) == null) {
                this.f5179d = new C1711d2();
            }
            C1711d2 c1711d2 = (C1711d2) this.f5179d;
            c1711d2.f6526a = colorStateList;
            c1711d2.f6529d = true;
        } else {
            this.f5179d = null;
        }
        m2692b();
    }

    /* renamed from: u */
    public void m2711u(ColorStateList colorStateList) {
        if (((C1711d2) this.f5180e) == null) {
            this.f5180e = new C1711d2();
        }
        C1711d2 c1711d2 = (C1711d2) this.f5180e;
        c1711d2.f6526a = colorStateList;
        c1711d2.f6529d = true;
        m2692b();
    }

    /* renamed from: v */
    public void m2712v(PorterDuff.Mode mode) {
        if (((C1711d2) this.f5180e) == null) {
            this.f5180e = new C1711d2();
        }
        C1711d2 c1711d2 = (C1711d2) this.f5180e;
        c1711d2.f6527b = mode;
        c1711d2.f6528c = true;
        m2692b();
    }

    /* renamed from: w */
    public int m2713w(int i, int i4) {
        int i8;
        int i9;
        C1643c c1643c = (C1643c) this.f5177b;
        ArrayList arrayList = (ArrayList) this.f5179d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2872a c2872a = (C2872a) arrayList.get(size);
            int i10 = c2872a.f10602a;
            if (i10 == 8) {
                int i11 = c2872a.f10603b;
                int i12 = c2872a.f10605d;
                if (i11 < i12) {
                    i9 = i11;
                    i8 = i12;
                } else {
                    i8 = i11;
                    i9 = i12;
                }
                if (i < i9 || i > i8) {
                    if (i < i11) {
                        if (i4 == 1) {
                            c2872a.f10603b = i11 + 1;
                            c2872a.f10605d = i12 + 1;
                        } else if (i4 == 2) {
                            c2872a.f10603b = i11 - 1;
                            c2872a.f10605d = i12 - 1;
                        }
                    }
                } else if (i9 == i11) {
                    if (i4 == 1) {
                        c2872a.f10605d = i12 + 1;
                    } else if (i4 == 2) {
                        c2872a.f10605d = i12 - 1;
                    }
                    i++;
                } else {
                    if (i4 == 1) {
                        c2872a.f10603b = i11 + 1;
                    } else if (i4 == 2) {
                        c2872a.f10603b = i11 - 1;
                    }
                    i--;
                }
            } else {
                int i13 = c2872a.f10603b;
                if (i13 <= i) {
                    if (i10 == 1) {
                        i -= c2872a.f10605d;
                    } else if (i10 == 2) {
                        i += c2872a.f10605d;
                    }
                } else if (i4 == 1) {
                    c2872a.f10603b = i13 + 1;
                } else if (i4 == 2) {
                    c2872a.f10603b = i13 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C2872a c2872a2 = (C2872a) arrayList.get(size2);
            if (c2872a2.f10602a == 8) {
                int i14 = c2872a2.f10605d;
                if (i14 == c2872a2.f10603b || i14 < 0) {
                    arrayList.remove(size2);
                    c2872a2.f10604c = null;
                    c1643c.mo285g(c2872a2);
                }
            } else if (c2872a2.f10605d <= 0) {
                arrayList.remove(size2);
                c2872a2.f10604c = null;
                c1643c.mo285g(c2872a2);
            }
        }
        return i;
    }

    public C1240s(InterfaceC1239r interfaceC1239r) {
        this.f5177b = interfaceC1239r;
        this.f5178c = new ArrayDeque();
        this.f5179d = new ArrayDeque();
        this.f5180e = new PriorityQueue();
        this.f5176a = -1;
    }

    public C1240s(C2921w c2921w) {
        this.f5177b = new C1643c(30);
        this.f5178c = new ArrayList();
        this.f5179d = new ArrayList();
        this.f5176a = 0;
        this.f5180e = c2921w;
        this.f5181f = new C1629o(this);
    }
}
