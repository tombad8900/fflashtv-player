package p002a1;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;
import okhttp3.C2181z;
import p070i0.C1217b;
import p085j6.RunnableC1527q;
import p105m0.AbstractC1828m0;
import p156s.AbstractC2334g;
import p211y5.C2819f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.l */
/* loaded from: classes.dex */
public final class C0030l {

    /* renamed from: a */
    public final ViewGroup f93a;

    /* renamed from: b */
    public final ArrayList f94b = new ArrayList();

    /* renamed from: c */
    public final ArrayList f95c = new ArrayList();

    /* renamed from: d */
    public boolean f96d = false;

    /* renamed from: e */
    public boolean f97e = false;

    public C0030l(ViewGroup viewGroup) {
        this.f93a = viewGroup;
    }

    /* renamed from: f */
    public static C0030l m99f(ViewGroup viewGroup, C2819f c2819f) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0030l) {
            return (C0030l) tag;
        }
        c2819f.getClass();
        C0030l c0030l = new C0030l(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0030l);
        return c0030l;
    }

    /* renamed from: a */
    public final void m100a(int i, int i4, C0049u0 c0049u0) {
        synchronized (this.f94b) {
            try {
                C1217b c1217b = new C1217b();
                C0059z0 c0059z0M103d = m103d(c0049u0.f205c);
                if (c0059z0M103d != null) {
                    c0059z0M103d.m245c(i, i4);
                    return;
                }
                C0059z0 c0059z0 = new C0059z0(i, i4, c0049u0, c1217b);
                this.f94b.add(c0059z0);
                c0059z0.f285d.add(new RunnableC0057y0(this, c0059z0, 0));
                c0059z0.f285d.add(new RunnableC0057y0(this, c0059z0, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m101b(ArrayList arrayList, boolean z7) throws Resources.NotFoundException {
        boolean z8;
        ViewGroup viewGroup;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        C0059z0 c0059z0 = null;
        C0059z0 c0059z02 = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            C0059z0 c0059z03 = (C0059z0) obj;
            int iM7c = AbstractC0008a1.m7c(c0059z03.f284c.f222N);
            int iM4162a = AbstractC2334g.m4162a(c0059z03.f282a);
            if (iM4162a != 0) {
                if (iM4162a != 1) {
                    if (iM4162a == 2 || iM4162a == 3) {
                    }
                } else if (iM7c != 2) {
                    c0059z02 = c0059z03;
                }
            }
            if (iM7c == 2 && c0059z0 == null) {
                c0059z0 = c0059z03;
            }
        }
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Executing operations from " + c0059z0 + " to " + c0059z02);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList(arrayList2);
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = ((C0059z0) arrayList2.get(arrayList2.size() - 1)).f284c;
        int size2 = arrayList2.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList2.get(i4);
            i4++;
            C0046t c0046t = ((C0059z0) obj2).f284c.f225Q;
            C0046t c0046t2 = abstractComponentCallbacksC0050v.f225Q;
            c0046t.f191b = c0046t2.f191b;
            c0046t.f192c = c0046t2.f192c;
            c0046t.f193d = c0046t2.f193d;
            c0046t.f194e = c0046t2.f194e;
        }
        int size3 = arrayList2.size();
        int i8 = 0;
        while (i8 < size3) {
            Object obj3 = arrayList2.get(i8);
            i8++;
            C0059z0 c0059z04 = (C0059z0) obj3;
            C1217b c1217b = new C1217b();
            c0059z04.m246d();
            HashSet hashSet = c0059z04.f286e;
            hashSet.add(c1217b);
            C0024i c0024i = new C0024i(c0059z04, c1217b);
            c0024i.f85m = false;
            c0024i.f84l = z7;
            arrayList3.add(c0024i);
            C1217b c1217b2 = new C1217b();
            c0059z04.m246d();
            hashSet.add(c1217b2);
            boolean z9 = !z7 ? c0059z04 != c0059z02 : c0059z04 != c0059z0;
            C0028k c0028k = new C0028k(c0059z04, c1217b2);
            int i9 = c0059z04.f282a;
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v2 = c0059z04.f284c;
            if (i9 == 2) {
                if (z7) {
                    C0046t c0046t3 = abstractComponentCallbacksC0050v2.f225Q;
                } else {
                    abstractComponentCallbacksC0050v2.getClass();
                }
                if (z7) {
                    C0046t c0046t4 = abstractComponentCallbacksC0050v2.f225Q;
                } else {
                    C0046t c0046t5 = abstractComponentCallbacksC0050v2.f225Q;
                }
            } else if (z7) {
                C0046t c0046t6 = abstractComponentCallbacksC0050v2.f225Q;
            } else {
                abstractComponentCallbacksC0050v2.getClass();
            }
            if (z9) {
                if (z7) {
                    C0046t c0046t7 = abstractComponentCallbacksC0050v2.f225Q;
                } else {
                    abstractComponentCallbacksC0050v2.getClass();
                }
            }
            arrayList4.add(c0028k);
            c0059z04.f285d.add(new RunnableC1527q(this, arrayList5, c0059z04));
            arrayList2 = arrayList;
        }
        HashMap map = new HashMap();
        int size4 = arrayList4.size();
        int i10 = 0;
        while (i10 < size4) {
            Object obj4 = arrayList4.get(i10);
            i10++;
            C0059z0 c0059z05 = (C0059z0) ((C0028k) obj4).f88j;
            if (AbstractC0008a1.m7c(c0059z05.f284c.f222N) != c0059z05.f282a) {
            }
        }
        int size5 = arrayList4.size();
        int i11 = 0;
        while (i11 < size5) {
            Object obj5 = arrayList4.get(i11);
            i11++;
            C0028k c0028k2 = (C0028k) obj5;
            map.put((C0059z0) c0028k2.f88j, Boolean.FALSE);
            c0028k2.m91d();
        }
        boolean zContainsValue = map.containsValue(Boolean.TRUE);
        ViewGroup viewGroup2 = this.f93a;
        Context context = viewGroup2.getContext();
        ArrayList arrayList6 = new ArrayList();
        int size6 = arrayList3.size();
        boolean z10 = false;
        int i12 = 0;
        while (i12 < size6) {
            Object obj6 = arrayList3.get(i12);
            i12++;
            C0024i c0024i2 = (C0024i) obj6;
            boolean z11 = zContainsValue;
            C0059z0 c0059z06 = (C0059z0) c0024i2.f88j;
            ArrayList arrayList7 = arrayList3;
            int iM7c2 = AbstractC0008a1.m7c(c0059z06.f284c.f222N);
            int i13 = c0059z06.f282a;
            int i14 = size6;
            if (iM7c2 == i13 || !(iM7c2 == 2 || i13 == 2)) {
                z8 = z10;
                viewGroup = viewGroup2;
                c0024i2.m91d();
                zContainsValue = z11;
                size6 = i14;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                z10 = z8;
            } else {
                C0016e c0016eM88k = c0024i2.m88k(context);
                if (c0016eM88k == null) {
                    c0024i2.m91d();
                } else {
                    Animator animator = (Animator) c0016eM88k.f62k;
                    if (animator == null) {
                        arrayList6.add(c0024i2);
                    } else {
                        C0059z0 c0059z07 = (C0059z0) c0024i2.f88j;
                        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v3 = c0059z07.f284c;
                        z8 = z10;
                        if (Boolean.TRUE.equals(map.get(c0059z07))) {
                            if (C0035n0.m106G(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0050v3 + " as this Fragment was involved in a Transition.");
                            }
                            c0024i2.m91d();
                            viewGroup = viewGroup2;
                            zContainsValue = z11;
                            size6 = i14;
                            viewGroup2 = viewGroup;
                            arrayList3 = arrayList7;
                            z10 = z8;
                        } else {
                            boolean z12 = c0059z07.f282a == 3;
                            if (z12) {
                                arrayList5.remove(c0059z07);
                            }
                            View view = abstractComponentCallbacksC0050v3.f222N;
                            viewGroup2.startViewTransition(view);
                            ViewGroup viewGroup3 = viewGroup2;
                            animator.addListener(new C0014d(viewGroup3, view, z12, c0059z07, c0024i2));
                            animator.setTarget(view);
                            animator.start();
                            if (C0035n0.m106G(2)) {
                                Log.v("FragmentManager", "Animator from operation " + c0059z07 + " has started.");
                            }
                            ((C1217b) c0024i2.f89k).m2668a(new C0016e(animator, 0, c0059z07));
                            zContainsValue = z11;
                            size6 = i14;
                            viewGroup2 = viewGroup3;
                            arrayList3 = arrayList7;
                            z10 = true;
                        }
                    }
                }
                z8 = z10;
                viewGroup = viewGroup2;
                zContainsValue = z11;
                size6 = i14;
                viewGroup2 = viewGroup;
                arrayList3 = arrayList7;
                z10 = z8;
            }
        }
        boolean z13 = zContainsValue;
        boolean z14 = z10;
        ViewGroup viewGroup4 = viewGroup2;
        int size7 = arrayList6.size();
        int i15 = 0;
        while (i15 < size7) {
            Object obj7 = arrayList6.get(i15);
            i15++;
            C0024i c0024i3 = (C0024i) obj7;
            C0059z0 c0059z08 = (C0059z0) c0024i3.f88j;
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v4 = c0059z08.f284c;
            if (z13) {
                if (C0035n0.m106G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0050v4 + " as Animations cannot run alongside Transitions.");
                }
                c0024i3.m91d();
            } else if (z14) {
                if (C0035n0.m106G(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0050v4 + " as Animations cannot run alongside Animators.");
                }
                c0024i3.m91d();
            } else {
                View view2 = abstractComponentCallbacksC0050v4.f222N;
                C0016e c0016eM88k2 = c0024i3.m88k(context);
                c0016eM88k2.getClass();
                Animation animation = (Animation) c0016eM88k2.f63l;
                animation.getClass();
                int i16 = size7;
                if (c0059z08.f282a != 1) {
                    view2.startAnimation(animation);
                    c0024i3.m91d();
                } else {
                    viewGroup4.startViewTransition(view2);
                    RunnableC0007a0 runnableC0007a0 = new RunnableC0007a0(animation, viewGroup4, view2);
                    runnableC0007a0.setAnimationListener(new AnimationAnimationListenerC0020g(c0024i3, c0059z08, view2, viewGroup4));
                    view2.startAnimation(runnableC0007a0);
                    if (C0035n0.m106G(2)) {
                        Log.v("FragmentManager", "Animation from operation " + c0059z08 + " has started.");
                    }
                }
                ((C1217b) c0024i3.f89k).m2668a(new C0022h(c0024i3, c0059z08, view2, viewGroup4));
                size7 = i16;
            }
        }
        int size8 = arrayList5.size();
        int i17 = 0;
        while (i17 < size8) {
            Object obj8 = arrayList5.get(i17);
            i17++;
            C0059z0 c0059z09 = (C0059z0) obj8;
            AbstractC0008a1.m5a(c0059z09.f284c.f222N, c0059z09.f282a);
        }
        arrayList5.clear();
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c0059z0 + " to " + c0059z02);
        }
    }

    /* renamed from: c */
    public final void m102c() {
        if (this.f97e) {
            return;
        }
        ViewGroup viewGroup = this.f93a;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        if (!viewGroup.isAttachedToWindow()) {
            m104e();
            this.f96d = false;
            return;
        }
        synchronized (this.f94b) {
            try {
                if (!this.f94b.isEmpty()) {
                    ArrayList arrayList = new ArrayList(this.f95c);
                    this.f95c.clear();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        C0059z0 c0059z0 = (C0059z0) obj;
                        if (C0035n0.m106G(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c0059z0);
                        }
                        c0059z0.m243a();
                        if (!c0059z0.f288g) {
                            this.f95c.add(c0059z0);
                        }
                    }
                    m105g();
                    ArrayList arrayList2 = new ArrayList(this.f94b);
                    this.f94b.clear();
                    this.f95c.addAll(arrayList2);
                    if (C0035n0.m106G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj2 = arrayList2.get(i4);
                        i4++;
                        ((C0059z0) obj2).m246d();
                    }
                    m101b(arrayList2, this.f96d);
                    this.f96d = false;
                    if (C0035n0.m106G(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: d */
    public final C0059z0 m103d(AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v) {
        ArrayList arrayList = this.f94b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0059z0 c0059z0 = (C0059z0) obj;
            if (c0059z0.f284c.equals(abstractComponentCallbacksC0050v) && !c0059z0.f287f) {
                return c0059z0;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void m104e() {
        String str;
        String str2;
        if (C0035n0.m106G(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f93a;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f94b) {
            try {
                m105g();
                ArrayList arrayList = this.f94b;
                int size = arrayList.size();
                int i = 0;
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    ((C0059z0) obj).m246d();
                }
                ArrayList arrayList2 = new ArrayList(this.f95c);
                int size2 = arrayList2.size();
                int i8 = 0;
                while (i8 < size2) {
                    Object obj2 = arrayList2.get(i8);
                    i8++;
                    C0059z0 c0059z0 = (C0059z0) obj2;
                    if (C0035n0.m106G(2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str2 = C2181z.FRAGMENT_ENCODE_SET;
                        } else {
                            str2 = "Container " + this.f93a + " is not attached to window. ";
                        }
                        sb.append(str2);
                        sb.append("Cancelling running operation ");
                        sb.append(c0059z0);
                        Log.v("FragmentManager", sb.toString());
                    }
                    c0059z0.m243a();
                }
                ArrayList arrayList3 = new ArrayList(this.f94b);
                int size3 = arrayList3.size();
                while (i < size3) {
                    Object obj3 = arrayList3.get(i);
                    i++;
                    C0059z0 c0059z02 = (C0059z0) obj3;
                    if (C0035n0.m106G(2)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("SpecialEffectsController: ");
                        if (zIsAttachedToWindow) {
                            str = C2181z.FRAGMENT_ENCODE_SET;
                        } else {
                            str = "Container " + this.f93a + " is not attached to window. ";
                        }
                        sb2.append(str);
                        sb2.append("Cancelling pending operation ");
                        sb2.append(c0059z02);
                        Log.v("FragmentManager", sb2.toString());
                    }
                    c0059z02.m243a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: g */
    public final void m105g() {
        ArrayList arrayList = this.f94b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C0059z0 c0059z0 = (C0059z0) obj;
            if (c0059z0.f283b == 2) {
                c0059z0.m245c(AbstractC0008a1.m6b(c0059z0.f284c.m218E().getVisibility()), 1);
            }
        }
    }
}
