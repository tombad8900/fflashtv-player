package p032d3;

import android.animation.TimeInterpolator;
import android.support.v4.media.session.AbstractC0120b;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import p002a1.C0022h;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.a */
/* loaded from: classes.dex */
public final class C0809a extends AbstractC0829n {

    /* renamed from: J */
    public ArrayList f3621J;

    /* renamed from: K */
    public boolean f3622K;

    /* renamed from: L */
    public int f3623L;

    /* renamed from: M */
    public boolean f3624M;

    /* renamed from: N */
    public int f3625N;

    @Override // p032d3.AbstractC0829n
    /* renamed from: A */
    public final void mo1949A(AbstractC0120b abstractC0120b) {
        this.f3625N |= 8;
        int size = this.f3621J.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0829n) this.f3621J.get(i)).mo1949A(abstractC0120b);
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: B */
    public final void mo1950B(TimeInterpolator timeInterpolator) {
        this.f3625N |= 1;
        ArrayList arrayList = this.f3621J;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC0829n) this.f3621J.get(i)).mo1950B(timeInterpolator);
            }
        }
        this.f3693m = timeInterpolator;
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: C */
    public final void mo1951C(C2819f c2819f) {
        super.mo1951C(c2819f);
        this.f3625N |= 4;
        if (this.f3621J != null) {
            for (int i = 0; i < this.f3621J.size(); i++) {
                ((AbstractC0829n) this.f3621J.get(i)).mo1951C(c2819f);
            }
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: D */
    public final void mo1952D() {
        this.f3625N |= 2;
        int size = this.f3621J.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0829n) this.f3621J.get(i)).mo1952D();
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: E */
    public final void mo1953E(long j) {
        this.f3691k = j;
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: G */
    public final String mo1954G(String str) {
        String strMo1954G = super.mo1954G(str);
        for (int i = 0; i < this.f3621J.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strMo1954G);
            sb.append("\n");
            sb.append(((AbstractC0829n) this.f3621J.get(i)).mo1954G(str + "  "));
            strMo1954G = sb.toString();
        }
        return strMo1954G;
    }

    /* renamed from: H */
    public final void m1955H(AbstractC0829n abstractC0829n) {
        this.f3621J.add(abstractC0829n);
        abstractC0829n.f3698r = this;
        long j = this.f3692l;
        if (j >= 0) {
            abstractC0829n.mo1965z(j);
        }
        if ((this.f3625N & 1) != 0) {
            abstractC0829n.mo1950B(this.f3693m);
        }
        if ((this.f3625N & 2) != 0) {
            abstractC0829n.mo1952D();
        }
        if ((this.f3625N & 4) != 0) {
            abstractC0829n.mo1951C(this.f3689E);
        }
        if ((this.f3625N & 8) != 0) {
            abstractC0829n.mo1949A(null);
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: c */
    public final void mo1956c(C0837v c0837v) {
        View view = c0837v.f3718b;
        if (m2000s(view)) {
            ArrayList arrayList = this.f3621J;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AbstractC0829n abstractC0829n = (AbstractC0829n) obj;
                if (abstractC0829n.m2000s(view)) {
                    abstractC0829n.mo1956c(c0837v);
                    c0837v.f3719c.add(abstractC0829n);
                }
            }
        }
    }

    @Override // p032d3.AbstractC0829n
    public final void cancel() {
        super.cancel();
        int size = this.f3621J.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0829n) this.f3621J.get(i)).cancel();
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: e */
    public final void mo1957e(C0837v c0837v) {
        int size = this.f3621J.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0829n) this.f3621J.get(i)).mo1957e(c0837v);
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: f */
    public final void mo1958f(C0837v c0837v) {
        View view = c0837v.f3718b;
        if (m2000s(view)) {
            ArrayList arrayList = this.f3621J;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                AbstractC0829n abstractC0829n = (AbstractC0829n) obj;
                if (abstractC0829n.m2000s(view)) {
                    abstractC0829n.mo1958f(c0837v);
                    c0837v.f3719c.add(abstractC0829n);
                }
            }
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final AbstractC0829n clone() {
        C0809a c0809a = (C0809a) super.clone();
        c0809a.f3621J = new ArrayList();
        int size = this.f3621J.size();
        for (int i = 0; i < size; i++) {
            AbstractC0829n abstractC0829nClone = ((AbstractC0829n) this.f3621J.get(i)).clone();
            c0809a.f3621J.add(abstractC0829nClone);
            abstractC0829nClone.f3698r = c0809a;
        }
        return c0809a;
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: k */
    public final void mo1960k(ViewGroup viewGroup, C0022h c0022h, C0022h c0022h2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.f3691k;
        int size = this.f3621J.size();
        for (int i = 0; i < size; i++) {
            AbstractC0829n abstractC0829n = (AbstractC0829n) this.f3621J.get(i);
            if (j > 0 && (this.f3622K || i == 0)) {
                long j8 = abstractC0829n.f3691k;
                if (j8 > 0) {
                    abstractC0829n.mo1953E(j8 + j);
                } else {
                    abstractC0829n.mo1953E(j);
                }
            }
            abstractC0829n.mo1960k(viewGroup, c0022h, c0022h2, arrayList, arrayList2);
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: v */
    public final void mo1961v(View view) {
        super.mo1961v(view);
        int size = this.f3621J.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0829n) this.f3621J.get(i)).mo1961v(view);
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: w */
    public final AbstractC0829n mo1962w(InterfaceC0827l interfaceC0827l) {
        super.mo1962w(interfaceC0827l);
        return this;
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: x */
    public final void mo1963x(View view) {
        super.mo1963x(view);
        int size = this.f3621J.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0829n) this.f3621J.get(i)).mo1963x(view);
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: y */
    public final void mo1964y() {
        if (this.f3621J.isEmpty()) {
            m1991F();
            m1996l();
            return;
        }
        C0834s c0834s = new C0834s();
        c0834s.f3715b = this;
        ArrayList arrayList = this.f3621J;
        int size = arrayList.size();
        int i = 0;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((AbstractC0829n) obj).m1992a(c0834s);
        }
        this.f3623L = this.f3621J.size();
        if (this.f3622K) {
            ArrayList arrayList2 = this.f3621J;
            int size2 = arrayList2.size();
            while (i < size2) {
                Object obj2 = arrayList2.get(i);
                i++;
                ((AbstractC0829n) obj2).mo1964y();
            }
            return;
        }
        for (int i8 = 1; i8 < this.f3621J.size(); i8++) {
            ((AbstractC0829n) this.f3621J.get(i8 - 1)).m1992a(new C0834s((AbstractC0829n) this.f3621J.get(i8)));
        }
        AbstractC0829n abstractC0829n = (AbstractC0829n) this.f3621J.get(0);
        if (abstractC0829n != null) {
            abstractC0829n.mo1964y();
        }
    }

    @Override // p032d3.AbstractC0829n
    /* renamed from: z */
    public final void mo1965z(long j) {
        ArrayList arrayList;
        this.f3692l = j;
        if (j < 0 || (arrayList = this.f3621J) == null) {
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0829n) this.f3621J.get(i)).mo1965z(j);
        }
    }
}
