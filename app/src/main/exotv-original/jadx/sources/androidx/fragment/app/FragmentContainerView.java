package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.exotv.net.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.WeakHashMap;
import okhttp3.C2181z;
import p002a1.AbstractC0008a1;
import p002a1.AbstractComponentCallbacksC0050v;
import p002a1.C0006a;
import p002a1.C0023h0;
import p002a1.C0035n0;
import p002a1.C0049u0;
import p002a1.C0051v0;
import p002a1.C0058z;
import p012b1.AbstractC0548c;
import p062h.AbstractActivityC1083i;
import p105m0.AbstractC1798c0;
import p105m0.AbstractC1828m0;
import p105m0.C1844r1;
import p214z0.AbstractC2869a;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: j */
    public final ArrayList f882j;

    /* renamed from: k */
    public final ArrayList f883k;

    /* renamed from: l */
    public View.OnApplyWindowInsetsListener f884l;

    /* renamed from: m */
    public boolean f885m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        AbstractC2980h.m5136e("context", context);
        this.f882j = new ArrayList();
        this.f883k = new ArrayList();
        this.f885m = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2869a.f10591b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* renamed from: a */
    public final void m546a(View view) {
        if (this.f883k.contains(view)) {
            this.f882j.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        AbstractC2980h.m5136e("child", view);
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof AbstractComponentCallbacksC0050v ? (AbstractComponentCallbacksC0050v) tag : null) != null) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C1844r1 c1844r1M3621g;
        AbstractC2980h.m5136e("insets", windowInsets);
        C1844r1 c1844r1M3621g2 = C1844r1.m3621g(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f884l;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            AbstractC2980h.m5135d("onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)", windowInsetsOnApplyWindowInsets);
            c1844r1M3621g = C1844r1.m3621g(null, windowInsetsOnApplyWindowInsets);
        } else {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            WindowInsets windowInsetsM3626f = c1844r1M3621g2.m3626f();
            if (windowInsetsM3626f != null) {
                WindowInsets windowInsetsM3515b = AbstractC1798c0.m3515b(this, windowInsetsM3626f);
                if (!windowInsetsM3515b.equals(windowInsetsM3626f)) {
                    c1844r1M3621g2 = C1844r1.m3621g(this, windowInsetsM3515b);
                }
            }
            c1844r1M3621g = c1844r1M3621g2;
        }
        if (!c1844r1M3621g.f6934a.mo3578n()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                AbstractC1828m0.m3597b(getChildAt(i), c1844r1M3621g);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        AbstractC2980h.m5136e("canvas", canvas);
        if (this.f885m) {
            ArrayList arrayList = this.f882j;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AbstractC2980h.m5136e("canvas", canvas);
        AbstractC2980h.m5136e("child", view);
        if (this.f885m) {
            ArrayList arrayList = this.f882j;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        AbstractC2980h.m5136e("view", view);
        this.f883k.remove(view);
        if (this.f882j.remove(view)) {
            this.f885m = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0050v> F getFragment() {
        AbstractActivityC1083i abstractActivityC1083i;
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v;
        C0035n0 c0035n0M226g;
        View view = this;
        while (true) {
            abstractActivityC1083i = null;
            if (view == null) {
                abstractComponentCallbacksC0050v = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            abstractComponentCallbacksC0050v = tag instanceof AbstractComponentCallbacksC0050v ? (AbstractComponentCallbacksC0050v) tag : null;
            if (abstractComponentCallbacksC0050v != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (abstractComponentCallbacksC0050v == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof AbstractActivityC1083i) {
                    abstractActivityC1083i = (AbstractActivityC1083i) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (abstractActivityC1083i == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            c0035n0M226g = ((C0058z) abstractActivityC1083i.f4599B.f143k).f280s;
        } else {
            if (!abstractComponentCallbacksC0050v.m233n()) {
                throw new IllegalStateException("The Fragment " + abstractComponentCallbacksC0050v + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            c0035n0M226g = abstractComponentCallbacksC0050v.m226g();
        }
        return (F) c0035n0M226g.m111A(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        AbstractC2980h.m5136e("insets", windowInsets);
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                AbstractC2980h.m5135d("view", childAt);
                m546a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        AbstractC2980h.m5136e("view", view);
        m546a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        View childAt = getChildAt(i);
        AbstractC2980h.m5135d("view", childAt);
        m546a(childAt);
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        AbstractC2980h.m5136e("view", view);
        m546a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i4) {
        int i8 = i + i4;
        for (int i9 = i; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            AbstractC2980h.m5135d("view", childAt);
            m546a(childAt);
        }
        super.removeViews(i, i4);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i4) {
        int i8 = i + i4;
        for (int i9 = i; i9 < i8; i9++) {
            View childAt = getChildAt(i9);
            AbstractC2980h.m5135d("view", childAt);
            m546a(childAt);
        }
        super.removeViewsInLayout(i, i4);
    }

    public final void setDrawDisappearingViewsLast(boolean z7) {
        this.f885m = z7;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        AbstractC2980h.m5136e("listener", onApplyWindowInsetsListener);
        this.f884l = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        AbstractC2980h.m5136e("view", view);
        if (view.getParent() == this) {
            this.f883k.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, C0035n0 c0035n0) {
        View view;
        super(context, attributeSet);
        AbstractC2980h.m5136e("context", context);
        AbstractC2980h.m5136e("attrs", attributeSet);
        this.f882j = new ArrayList();
        this.f883k = new ArrayList();
        this.f885m = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2869a.f10591b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM111A = c0035n0.m111A(id);
        if (classAttribute != null && abstractComponentCallbacksC0050vM111A == null) {
            if (id == -1) {
                throw new IllegalStateException(AbstractC0008a1.m17m("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : C2181z.FRAGMENT_ENCODE_SET));
            }
            C0023h0 c0023h0M114D = c0035n0.m114D();
            context.getClassLoader();
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM87a = c0023h0M114D.m87a(classAttribute);
            AbstractC2980h.m5135d("fm.fragmentFactory.insta\u2026ontext.classLoader, name)", abstractComponentCallbacksC0050vM87a);
            abstractComponentCallbacksC0050vM87a.f220L = true;
            C0058z c0058z = abstractComponentCallbacksC0050vM87a.f210B;
            if ((c0058z == null ? null : c0058z.f277p) != null) {
                abstractComponentCallbacksC0050vM87a.f220L = true;
            }
            C0006a c0006a = new C0006a(c0035n0);
            c0006a.f25o = true;
            abstractComponentCallbacksC0050vM87a.f221M = this;
            int id2 = getId();
            String str = abstractComponentCallbacksC0050vM87a.f228T;
            if (str != null) {
                AbstractC0548c.m1279c(abstractComponentCallbacksC0050vM87a, str);
            }
            Class<?> cls = abstractComponentCallbacksC0050vM87a.getClass();
            int modifiers = cls.getModifiers();
            if (!cls.isAnonymousClass() && Modifier.isPublic(modifiers) && (!cls.isMemberClass() || Modifier.isStatic(modifiers))) {
                if (string != null) {
                    String str2 = abstractComponentCallbacksC0050vM87a.f215G;
                    if (str2 != null && !string.equals(str2)) {
                        throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0050vM87a + ": was " + abstractComponentCallbacksC0050vM87a.f215G + " now " + string);
                    }
                    abstractComponentCallbacksC0050vM87a.f215G = string;
                }
                if (id2 != 0) {
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0050vM87a + " with tag " + string + " to container view with no id");
                    }
                    int i4 = abstractComponentCallbacksC0050vM87a.f213E;
                    if (i4 != 0 && i4 != id2) {
                        throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0050vM87a + ": was " + abstractComponentCallbacksC0050vM87a.f213E + " now " + id2);
                    }
                    abstractComponentCallbacksC0050vM87a.f213E = id2;
                    abstractComponentCallbacksC0050vM87a.f214F = id2;
                }
                c0006a.m2b(new C0051v0(1, abstractComponentCallbacksC0050vM87a));
                C0035n0 c0035n02 = c0006a.f26p;
                abstractComponentCallbacksC0050vM87a.f209A = c0035n02;
                if (!c0006a.f17g) {
                    if (c0035n02.f134t != null && !c0035n02.f108G) {
                        c0035n02.m158x(true);
                        c0006a.mo1a(c0035n02.f110I, c0035n02.f111J);
                        c0035n02.f116b = true;
                        try {
                            c0035n02.m124R(c0035n02.f110I, c0035n02.f111J);
                            c0035n02.m138d();
                            c0035n02.m137c0();
                            c0035n02.m155u();
                            ((HashMap) c0035n02.f117c.f79k).values().removeAll(Collections.singleton(null));
                        } catch (Throwable th) {
                            c0035n02.m138d();
                            throw th;
                        }
                    }
                } else {
                    throw new IllegalStateException("This transaction is already being added to the back stack");
                }
            } else {
                throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
            }
        }
        ArrayList arrayListM78i = c0035n0.f117c.m78i();
        int size = arrayListM78i.size();
        while (i < size) {
            Object obj = arrayListM78i.get(i);
            i++;
            C0049u0 c0049u0 = (C0049u0) obj;
            AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050v = c0049u0.f205c;
            if (abstractComponentCallbacksC0050v.f214F == getId() && (view = abstractComponentCallbacksC0050v.f222N) != null && view.getParent() == null) {
                abstractComponentCallbacksC0050v.f221M = this;
                c0049u0.m201b();
            }
        }
    }
}
