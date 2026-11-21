package p105m0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import androidx.lifecycle.AbstractC0150o;
import com.exotv.net.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p104m.C1776v;
import p114n0.C1951c;
import p114n0.InterfaceC1962n;
import p140q0.C2249i;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.m0 */
/* loaded from: classes.dex */
public abstract class AbstractC1828m0 {

    /* renamed from: a */
    public static WeakHashMap f6911a;

    /* renamed from: b */
    public static Field f6912b;

    /* renamed from: c */
    public static boolean f6913c;

    /* renamed from: d */
    public static final int[] f6914d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e */
    public static final ViewTreeObserverOnGlobalLayoutListenerC1792a0 f6915e = new ViewTreeObserverOnGlobalLayoutListenerC1792a0();

    /* renamed from: a */
    public static C1843r0 m3596a(View view) {
        if (f6911a == null) {
            f6911a = new WeakHashMap();
        }
        C1843r0 c1843r0 = (C1843r0) f6911a.get(view);
        if (c1843r0 != null) {
            return c1843r0;
        }
        C1843r0 c1843r02 = new C1843r0(view);
        f6911a.put(view, c1843r02);
        return c1843r02;
    }

    /* renamed from: b */
    public static void m3597b(View view, C1844r1 c1844r1) {
        int i = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsM3626f = c1844r1.m3626f();
        if (windowInsetsM3626f != null) {
            WindowInsets windowInsetsM3573a = i >= 30 ? AbstractC1819j0.m3573a(view, windowInsetsM3626f) : AbstractC1798c0.m3514a(view, windowInsetsM3626f);
            if (windowInsetsM3573a.equals(windowInsetsM3626f)) {
                return;
            }
            C1844r1.m3621g(view, windowInsetsM3573a);
        }
    }

    /* renamed from: c */
    public static boolean m3598c(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C1825l0.f6904d;
        C1825l0 c1825l0 = (C1825l0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (c1825l0 == null) {
            c1825l0 = new C1825l0();
            c1825l0.f6905a = null;
            c1825l0.f6906b = null;
            c1825l0.f6907c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, c1825l0);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c1825l0.f6905a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C1825l0.f6904d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c1825l0.f6905a == null) {
                            c1825l0.f6905a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C1825l0.f6904d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c1825l0.f6905a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c1825l0.f6905a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewM3592a = c1825l0.m3592a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewM3592a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c1825l0.f6906b == null) {
                    c1825l0.f6906b = new SparseArray();
                }
                c1825l0.f6906b.put(keyCode, new WeakReference(viewM3592a));
            }
        }
        return viewM3592a != null;
    }

    /* renamed from: d */
    public static View.AccessibilityDelegate m3599d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1816i0.m3555a(view);
        }
        if (f6913c) {
            return null;
        }
        if (f6912b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f6912b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f6913c = true;
                return null;
            }
        }
        try {
            Object obj = f6912b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f6913c = true;
            return null;
        }
    }

    /* renamed from: e */
    public static CharSequence m3600e(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC1813h0.m3548a(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    /* renamed from: f */
    public static ArrayList m3601f(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: g */
    public static String[] m3602g(C1776v c1776v) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC1822k0.m3580a(c1776v) : (String[]) c1776v.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: h */
    public static void m3603h(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z7 = m3600e(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z7) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z7 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i);
                if (z7) {
                    accessibilityEventObtain.getText().add(m3600e(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            accessibilityEventObtain2.setContentChangeTypes(i);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.getText().add(m3600e(view));
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* renamed from: i */
    public static C1812h m3604i(C1776v c1776v, C1812h c1812h) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1812h + ", view=" + c1776v.getClass().getSimpleName() + "[" + c1776v.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1822k0.m3581b(c1776v, c1812h);
        }
        if (((C2249i) c1776v.getTag(R.id.tag_on_receive_content_listener)) == null) {
            return c1776v.m3467b(c1812h);
        }
        C1812h c1812hM4024a = C2249i.m4024a(c1776v, c1812h);
        if (c1812hM4024a == null) {
            return null;
        }
        return c1776v.m3467b(c1812hM4024a);
    }

    /* renamed from: j */
    public static void m3605j(View view, int i) {
        ArrayList arrayListM3601f = m3601f(view);
        for (int i4 = 0; i4 < arrayListM3601f.size(); i4++) {
            if (((C1951c) arrayListM3601f.get(i4)).m3809a() == i) {
                arrayListM3601f.remove(i4);
                return;
            }
        }
    }

    /* renamed from: k */
    public static void m3606k(View view, C1951c c1951c, InterfaceC1962n interfaceC1962n) {
        C1951c c1951c2 = new C1951c(null, c1951c.f7254b, null, interfaceC1962n, c1951c.f7255c);
        View.AccessibilityDelegate accessibilityDelegateM3599d = m3599d(view);
        C1794b c1794b = accessibilityDelegateM3599d == null ? null : accessibilityDelegateM3599d instanceof C1791a ? ((C1791a) accessibilityDelegateM3599d).f6843a : new C1794b(accessibilityDelegateM3599d);
        if (c1794b == null) {
            c1794b = new C1794b();
        }
        m3608m(view, c1794b);
        m3605j(view, c1951c2.m3809a());
        m3601f(view).add(c1951c2);
        m3603h(view, 0);
    }

    /* renamed from: l */
    public static void m3607l(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1816i0.m3556b(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* renamed from: m */
    public static void m3608m(View view, C1794b c1794b) {
        if (c1794b == null && (m3599d(view) instanceof C1791a)) {
            c1794b = new C1794b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c1794b == null ? null : c1794b.f6851b);
    }

    /* renamed from: n */
    public static void m3609n(View view, CharSequence charSequence) {
        new C1864z(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m3511f(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC1792a0 viewTreeObserverOnGlobalLayoutListenerC1792a0 = f6915e;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC1792a0.f6844j.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1792a0);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1792a0);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC1792a0.f6844j.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC1792a0);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1792a0);
            }
        }
    }

    /* renamed from: o */
    public static void m3610o(View view, AbstractC0150o abstractC0150o) {
        if (Build.VERSION.SDK_INT >= 30) {
            C1865z0.m3656h(view, abstractC0150o);
            return;
        }
        PathInterpolator pathInterpolator = C1858w0.f6952e;
        View.OnApplyWindowInsetsListener viewOnApplyWindowInsetsListenerC1855v0 = new ViewOnApplyWindowInsetsListenerC1855v0(view, abstractC0150o);
        view.setTag(R.id.tag_window_insets_animation_callback, viewOnApplyWindowInsetsListenerC1855v0);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(viewOnApplyWindowInsetsListenerC1855v0);
        }
    }
}
