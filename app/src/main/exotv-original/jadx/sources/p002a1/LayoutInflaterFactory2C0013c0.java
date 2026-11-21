package p002a1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import p012b1.AbstractC0548c;
import p012b1.C0546a;
import p012b1.C0547b;
import p062h.AbstractActivityC1083i;
import p214z0.AbstractC2869a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: a1.c0 */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C0013c0 implements LayoutInflater.Factory2 {

    /* renamed from: j */
    public final C0035n0 f52j;

    public LayoutInflaterFactory2C0013c0(C0035n0 c0035n0) {
        this.f52j = c0035n0;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        C0049u0 c0049u0M140f;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        C0035n0 c0035n0 = this.f52j;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, c0035n0);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2869a.f10590a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = AbstractComponentCallbacksC0050v.class.isAssignableFrom(C0023h0.m85b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC0050v abstractComponentCallbacksC0050vM111A = resourceId != -1 ? c0035n0.m111A(resourceId) : null;
                    if (abstractComponentCallbacksC0050vM111A == null && string != null) {
                        abstractComponentCallbacksC0050vM111A = c0035n0.m112B(string);
                    }
                    if (abstractComponentCallbacksC0050vM111A == null && id != -1) {
                        abstractComponentCallbacksC0050vM111A = c0035n0.m111A(id);
                    }
                    if (abstractComponentCallbacksC0050vM111A == null) {
                        C0023h0 c0023h0M114D = c0035n0.m114D();
                        context.getClassLoader();
                        abstractComponentCallbacksC0050vM111A = c0023h0M114D.m87a(attributeValue);
                        abstractComponentCallbacksC0050vM111A.f248v = true;
                        abstractComponentCallbacksC0050vM111A.f213E = resourceId != 0 ? resourceId : id;
                        abstractComponentCallbacksC0050vM111A.f214F = id;
                        abstractComponentCallbacksC0050vM111A.f215G = string;
                        abstractComponentCallbacksC0050vM111A.f249w = true;
                        abstractComponentCallbacksC0050vM111A.f209A = c0035n0;
                        C0058z c0058z = c0035n0.f134t;
                        abstractComponentCallbacksC0050vM111A.f210B = c0058z;
                        AbstractActivityC1083i abstractActivityC1083i = c0058z.f278q;
                        abstractComponentCallbacksC0050vM111A.f220L = true;
                        if ((c0058z != null ? c0058z.f277p : null) != null) {
                            abstractComponentCallbacksC0050vM111A.f220L = true;
                        }
                        c0049u0M140f = c0035n0.m132a(abstractComponentCallbacksC0050vM111A);
                        if (C0035n0.m106G(2)) {
                            Log.v("FragmentManager", "Fragment " + abstractComponentCallbacksC0050vM111A + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (abstractComponentCallbacksC0050vM111A.f249w) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        abstractComponentCallbacksC0050vM111A.f249w = true;
                        abstractComponentCallbacksC0050vM111A.f209A = c0035n0;
                        C0058z c0058z2 = c0035n0.f134t;
                        abstractComponentCallbacksC0050vM111A.f210B = c0058z2;
                        AbstractActivityC1083i abstractActivityC1083i2 = c0058z2.f278q;
                        abstractComponentCallbacksC0050vM111A.f220L = true;
                        if ((c0058z2 != null ? c0058z2.f277p : null) != null) {
                            abstractComponentCallbacksC0050vM111A.f220L = true;
                        }
                        c0049u0M140f = c0035n0.m140f(abstractComponentCallbacksC0050vM111A);
                        if (C0035n0.m106G(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + abstractComponentCallbacksC0050vM111A + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    C0547b c0547b = AbstractC0548c.f2224a;
                    AbstractC0548c.m1278b(new C0546a(abstractComponentCallbacksC0050vM111A, "Attempting to use <fragment> tag to add fragment " + abstractComponentCallbacksC0050vM111A + " to container " + viewGroup));
                    AbstractC0548c.m1277a(abstractComponentCallbacksC0050vM111A).getClass();
                    abstractComponentCallbacksC0050vM111A.f221M = viewGroup;
                    c0049u0M140f.m210k();
                    c0049u0M140f.m209j();
                    View view2 = abstractComponentCallbacksC0050vM111A.f222N;
                    if (view2 == null) {
                        throw new IllegalStateException(AbstractC0008a1.m17m("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (abstractComponentCallbacksC0050vM111A.f222N.getTag() == null) {
                        abstractComponentCallbacksC0050vM111A.f222N.setTag(string);
                    }
                    abstractComponentCallbacksC0050vM111A.f222N.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0010b0(this, c0049u0M140f));
                    return abstractComponentCallbacksC0050vM111A.f222N;
                }
            }
        }
        return null;
    }
}
