package p105m0;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.exotv.net.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p095l.C1629o;
import p114n0.C1951c;
import p114n0.C1952d;
import p114n0.InterfaceC1962n;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.b */
/* loaded from: classes.dex */
public class C1794b {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f6849c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f6850a;

    /* renamed from: b */
    public final C1791a f6851b;

    public C1794b() {
        this(f6849c);
    }

    /* renamed from: a */
    public boolean mo3501a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f6850a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C1629o mo3502b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f6850a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C1629o(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo1360c(View view, AccessibilityEvent accessibilityEvent) {
        this.f6850a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo1361d(View view, C1952d c1952d) {
        this.f6850a.onInitializeAccessibilityNodeInfo(view, c1952d.f7258a);
    }

    /* renamed from: e */
    public void mo1363e(View view, AccessibilityEvent accessibilityEvent) {
        this.f6850a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo3503f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f6850a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo1362g(View view, int i, Bundle bundle) {
        boolean zPerformAccessibilityAction;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z7 = false;
        int i4 = 0;
        while (true) {
            if (i4 >= list.size()) {
                break;
            }
            C1951c c1951c = (C1951c) list.get(i4);
            if (c1951c.m3809a() == i) {
                Class cls = c1951c.f7255c;
                InterfaceC1962n interfaceC1962n = c1951c.f7256d;
                if (interfaceC1962n != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e);
                        }
                    }
                    zPerformAccessibilityAction = interfaceC1962n.mo162a(view);
                }
            } else {
                i4++;
            }
        }
        zPerformAccessibilityAction = false;
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f6850a.performAccessibilityAction(view, i, bundle);
        }
        if (zPerformAccessibilityAction || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return zPerformAccessibilityAction;
        }
        int i8 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i8)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i9 = 0;
            while (true) {
                if (clickableSpanArr == null || i9 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i9])) {
                    clickableSpan.onClick(view);
                    z7 = true;
                    break;
                }
                i9++;
            }
        }
        return z7;
    }

    /* renamed from: h */
    public void mo3504h(View view, int i) {
        this.f6850a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: i */
    public void mo3505i(View view, AccessibilityEvent accessibilityEvent) {
        this.f6850a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1794b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f6850a = accessibilityDelegate;
        this.f6851b = new C1791a(this);
    }
}
