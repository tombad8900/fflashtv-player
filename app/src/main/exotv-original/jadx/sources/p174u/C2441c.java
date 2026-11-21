package p174u;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import p002a1.AbstractC0008a1;
import p156s.AbstractC2334g;
import p156s.C2335h;
import p182v.AbstractC2493h;
import p182v.C2499n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: u.c */
/* loaded from: classes.dex */
public final class C2441c {

    /* renamed from: b */
    public int f8812b;

    /* renamed from: c */
    public boolean f8813c;

    /* renamed from: d */
    public final C2442d f8814d;

    /* renamed from: e */
    public final int f8815e;

    /* renamed from: f */
    public C2441c f8816f;

    /* renamed from: i */
    public C2335h f8819i;

    /* renamed from: a */
    public HashSet f8811a = null;

    /* renamed from: g */
    public int f8817g = 0;

    /* renamed from: h */
    public int f8818h = Integer.MIN_VALUE;

    public C2441c(C2442d c2442d, int i) {
        this.f8814d = c2442d;
        this.f8815e = i;
    }

    /* renamed from: a */
    public final void m4355a(C2441c c2441c, int i) {
        m4356b(c2441c, i, Integer.MIN_VALUE, false);
    }

    /* renamed from: b */
    public final boolean m4356b(C2441c c2441c, int i, int i4, boolean z7) {
        if (c2441c == null) {
            m4364j();
            return true;
        }
        if (!z7 && !m4363i(c2441c)) {
            return false;
        }
        this.f8816f = c2441c;
        if (c2441c.f8811a == null) {
            c2441c.f8811a = new HashSet();
        }
        HashSet hashSet = this.f8816f.f8811a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f8817g = i;
        this.f8818h = i4;
        return true;
    }

    /* renamed from: c */
    public final void m4357c(int i, ArrayList arrayList, C2499n c2499n) {
        HashSet hashSet = this.f8811a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                AbstractC2493h.m4481b(((C2441c) it.next()).f8814d, i, arrayList, c2499n);
            }
        }
    }

    /* renamed from: d */
    public final int m4358d() {
        if (this.f8813c) {
            return this.f8812b;
        }
        return 0;
    }

    /* renamed from: e */
    public final int m4359e() {
        C2441c c2441c;
        if (this.f8814d.f8859g0 == 8) {
            return 0;
        }
        int i = this.f8818h;
        return (i == Integer.MIN_VALUE || (c2441c = this.f8816f) == null || c2441c.f8814d.f8859g0 != 8) ? this.f8817g : i;
    }

    /* renamed from: f */
    public final C2441c m4360f() {
        int i = this.f8815e;
        int iM4162a = AbstractC2334g.m4162a(i);
        C2442d c2442d = this.f8814d;
        switch (iM4162a) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return c2442d.f8830K;
            case 2:
                return c2442d.f8831L;
            case 3:
                return c2442d.f8828I;
            case 4:
                return c2442d.f8829J;
            default:
                throw new AssertionError(AbstractC0008a1.m26v(i));
        }
    }

    /* renamed from: g */
    public final boolean m4361g() {
        HashSet hashSet = this.f8811a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((C2441c) it.next()).m4360f().m4362h()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m4362h() {
        return this.f8816f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0063 A[RETURN] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4363i(C2441c c2441c) {
        if (c2441c != null) {
            C2442d c2442d = c2441c.f8814d;
            int i = c2441c.f8815e;
            int i4 = this.f8815e;
            if (i != i4) {
                switch (AbstractC2334g.m4162a(i4)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z7 = i == 2 || i == 4;
                        if (!(c2442d instanceof C2446h)) {
                            return z7;
                        }
                        if (z7 || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z8 = i == 3 || i == 5;
                        if (!(c2442d instanceof C2446h)) {
                            return z8;
                        }
                        if (z8 || i == 9) {
                        }
                        break;
                    case 5:
                        if (i == 2 || i == 4) {
                        }
                        break;
                    case 6:
                        if (i == 6 || i == 8 || i == 9) {
                        }
                        break;
                    default:
                        throw new AssertionError(AbstractC0008a1.m26v(i4));
                }
            } else if (i4 != 6 || (c2442d.f8824E && this.f8814d.f8824E)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public final void m4364j() {
        HashSet hashSet;
        C2441c c2441c = this.f8816f;
        if (c2441c != null && (hashSet = c2441c.f8811a) != null) {
            hashSet.remove(this);
            if (this.f8816f.f8811a.size() == 0) {
                this.f8816f.f8811a = null;
            }
        }
        this.f8811a = null;
        this.f8816f = null;
        this.f8817g = 0;
        this.f8818h = Integer.MIN_VALUE;
        this.f8813c = false;
        this.f8812b = 0;
    }

    /* renamed from: k */
    public final void m4365k() {
        C2335h c2335h = this.f8819i;
        if (c2335h == null) {
            this.f8819i = new C2335h(1);
        } else {
            c2335h.m4165c();
        }
    }

    /* renamed from: l */
    public final void m4366l(int i) {
        this.f8812b = i;
        this.f8813c = true;
    }

    public final String toString() {
        return this.f8814d.f8861h0 + ":" + AbstractC0008a1.m26v(this.f8815e);
    }
}
