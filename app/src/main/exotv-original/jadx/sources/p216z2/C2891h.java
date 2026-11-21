package p216z2;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.media3.common.C0228p;
import java.util.ArrayList;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.h */
/* loaded from: classes.dex */
public final class C2891h extends AbstractC2876b0 {

    /* renamed from: s */
    public static TimeInterpolator f10693s;

    /* renamed from: g */
    public boolean f10694g;

    /* renamed from: h */
    public ArrayList f10695h;

    /* renamed from: i */
    public ArrayList f10696i;

    /* renamed from: j */
    public ArrayList f10697j;

    /* renamed from: k */
    public ArrayList f10698k;

    /* renamed from: l */
    public ArrayList f10699l;

    /* renamed from: m */
    public ArrayList f10700m;

    /* renamed from: n */
    public ArrayList f10701n;

    /* renamed from: o */
    public ArrayList f10702o;

    /* renamed from: p */
    public ArrayList f10703p;

    /* renamed from: q */
    public ArrayList f10704q;

    /* renamed from: r */
    public ArrayList f10705r;

    /* renamed from: h */
    public static void m5014h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((AbstractC2920v0) arrayList.get(size)).f10848a.animate().cancel();
        }
    }

    @Override // p216z2.AbstractC2876b0
    /* renamed from: a */
    public final boolean mo4972a(AbstractC2920v0 abstractC2920v0, AbstractC2920v0 abstractC2920v02, C0228p c0228p, C0228p c0228p2) {
        int i;
        int i4;
        int i8 = c0228p.f1276a;
        int i9 = c0228p.f1277b;
        if (abstractC2920v02.m5075o()) {
            int i10 = c0228p.f1276a;
            i4 = c0228p.f1277b;
            i = i10;
        } else {
            i = c0228p2.f1276a;
            i4 = c0228p2.f1277b;
        }
        if (abstractC2920v0 == abstractC2920v02) {
            return m5015g(abstractC2920v0, i8, i9, i, i4);
        }
        View view = abstractC2920v0.f10848a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        m5019l(abstractC2920v0);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = abstractC2920v02.f10848a;
        m5019l(abstractC2920v02);
        view2.setTranslationX(-((int) ((i - i8) - translationX)));
        view2.setTranslationY(-((int) ((i4 - i9) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f10698k;
        C2887f c2887f = new C2887f();
        c2887f.f10663a = abstractC2920v0;
        c2887f.f10664b = abstractC2920v02;
        c2887f.f10665c = i8;
        c2887f.f10666d = i9;
        c2887f.f10667e = i;
        c2887f.f10668f = i4;
        arrayList.add(c2887f);
        return true;
    }

    @Override // p216z2.AbstractC2876b0
    /* renamed from: d */
    public final void mo4974d(AbstractC2920v0 abstractC2920v0) {
        ArrayList arrayList = this.f10699l;
        ArrayList arrayList2 = this.f10700m;
        ArrayList arrayList3 = this.f10701n;
        View view = abstractC2920v0.f10848a;
        view.animate().cancel();
        ArrayList arrayList4 = this.f10697j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((C2889g) arrayList4.get(size)).f10684a == abstractC2920v0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                m4973c(abstractC2920v0);
                arrayList4.remove(size);
            }
        }
        m5017j(this.f10698k, abstractC2920v0);
        if (this.f10695h.remove(abstractC2920v0)) {
            view.setAlpha(1.0f);
            m4973c(abstractC2920v0);
        }
        if (this.f10696i.remove(abstractC2920v0)) {
            view.setAlpha(1.0f);
            m4973c(abstractC2920v0);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            m5017j(arrayList5, abstractC2920v0);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((C2889g) arrayList6.get(size4)).f10684a == abstractC2920v0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    m4973c(abstractC2920v0);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(abstractC2920v0)) {
                view.setAlpha(1.0f);
                m4973c(abstractC2920v0);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f10704q.remove(abstractC2920v0);
        this.f10702o.remove(abstractC2920v0);
        this.f10705r.remove(abstractC2920v0);
        this.f10703p.remove(abstractC2920v0);
        m5016i();
    }

    @Override // p216z2.AbstractC2876b0
    /* renamed from: e */
    public final void mo4975e() {
        ArrayList arrayList = this.f10701n;
        ArrayList arrayList2 = this.f10699l;
        ArrayList arrayList3 = this.f10700m;
        ArrayList arrayList4 = this.f10698k;
        ArrayList arrayList5 = this.f10696i;
        ArrayList arrayList6 = this.f10695h;
        ArrayList arrayList7 = this.f10697j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C2889g c2889g = (C2889g) arrayList7.get(size);
            View view = c2889g.f10684a.f10848a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            m4973c(c2889g.f10684a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            m4973c((AbstractC2920v0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) arrayList5.get(size3);
            abstractC2920v0.f10848a.setAlpha(1.0f);
            m4973c(abstractC2920v0);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            C2887f c2887f = (C2887f) arrayList4.get(size4);
            AbstractC2920v0 abstractC2920v02 = c2887f.f10663a;
            if (abstractC2920v02 != null) {
                m5018k(c2887f, abstractC2920v02);
            }
            AbstractC2920v0 abstractC2920v03 = c2887f.f10664b;
            if (abstractC2920v03 != null) {
                m5018k(c2887f, abstractC2920v03);
            }
        }
        arrayList4.clear();
        if (mo4976f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    C2889g c2889g2 = (C2889g) arrayList8.get(size6);
                    View view2 = c2889g2.f10684a.f10848a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    m4973c(c2889g2.f10684a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    AbstractC2920v0 abstractC2920v04 = (AbstractC2920v0) arrayList9.get(size8);
                    abstractC2920v04.f10848a.setAlpha(1.0f);
                    m4973c(abstractC2920v04);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    C2887f c2887f2 = (C2887f) arrayList10.get(size10);
                    AbstractC2920v0 abstractC2920v05 = c2887f2.f10663a;
                    if (abstractC2920v05 != null) {
                        m5018k(c2887f2, abstractC2920v05);
                    }
                    AbstractC2920v0 abstractC2920v06 = c2887f2.f10664b;
                    if (abstractC2920v06 != null) {
                        m5018k(c2887f2, abstractC2920v06);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            m5014h(this.f10704q);
            m5014h(this.f10703p);
            m5014h(this.f10702o);
            m5014h(this.f10705r);
            ArrayList arrayList11 = this.f10617b;
            if (arrayList11.size() > 0) {
                throw AbstractC0008a1.m10f(0, arrayList11);
            }
            arrayList11.clear();
        }
    }

    @Override // p216z2.AbstractC2876b0
    /* renamed from: f */
    public final boolean mo4976f() {
        return (this.f10696i.isEmpty() && this.f10698k.isEmpty() && this.f10697j.isEmpty() && this.f10695h.isEmpty() && this.f10703p.isEmpty() && this.f10704q.isEmpty() && this.f10702o.isEmpty() && this.f10705r.isEmpty() && this.f10700m.isEmpty() && this.f10699l.isEmpty() && this.f10701n.isEmpty()) ? false : true;
    }

    /* renamed from: g */
    public final boolean m5015g(AbstractC2920v0 abstractC2920v0, int i, int i4, int i8, int i9) {
        View view = abstractC2920v0.f10848a;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i4 + ((int) abstractC2920v0.f10848a.getTranslationY());
        m5019l(abstractC2920v0);
        int i10 = i8 - translationX;
        int i11 = i9 - translationY;
        if (i10 == 0 && i11 == 0) {
            m4973c(abstractC2920v0);
            return false;
        }
        if (i10 != 0) {
            view.setTranslationX(-i10);
        }
        if (i11 != 0) {
            view.setTranslationY(-i11);
        }
        ArrayList arrayList = this.f10697j;
        C2889g c2889g = new C2889g();
        c2889g.f10684a = abstractC2920v0;
        c2889g.f10685b = translationX;
        c2889g.f10686c = translationY;
        c2889g.f10687d = i8;
        c2889g.f10688e = i9;
        arrayList.add(c2889g);
        return true;
    }

    /* renamed from: i */
    public final void m5016i() {
        if (mo4976f()) {
            return;
        }
        ArrayList arrayList = this.f10617b;
        if (arrayList.size() > 0) {
            throw AbstractC0008a1.m10f(0, arrayList);
        }
        arrayList.clear();
    }

    /* renamed from: j */
    public final void m5017j(ArrayList arrayList, AbstractC2920v0 abstractC2920v0) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C2887f c2887f = (C2887f) arrayList.get(size);
            if (m5018k(c2887f, abstractC2920v0) && c2887f.f10663a == null && c2887f.f10664b == null) {
                arrayList.remove(c2887f);
            }
        }
    }

    /* renamed from: k */
    public final boolean m5018k(C2887f c2887f, AbstractC2920v0 abstractC2920v0) {
        if (c2887f.f10664b == abstractC2920v0) {
            c2887f.f10664b = null;
        } else {
            if (c2887f.f10663a != abstractC2920v0) {
                return false;
            }
            c2887f.f10663a = null;
        }
        View view = abstractC2920v0.f10848a;
        View view2 = abstractC2920v0.f10848a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        m4973c(abstractC2920v0);
        return true;
    }

    /* renamed from: l */
    public final void m5019l(AbstractC2920v0 abstractC2920v0) {
        if (f10693s == null) {
            f10693s = new ValueAnimator().getInterpolator();
        }
        abstractC2920v0.f10848a.animate().setInterpolator(f10693s);
        mo4974d(abstractC2920v0);
    }
}
