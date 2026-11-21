package p166t0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bumptech.glide.AbstractC0714c;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p090k2.C1584b;
import p095l.C1629o;
import p105m0.AbstractC1828m0;
import p105m0.C1794b;
import p110m5.C1903d;
import p110m5.C1905f;
import p114n0.C1952d;
import p130p.C2193l;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: t0.b */
/* loaded from: classes.dex */
public abstract class AbstractC2388b extends C1794b {

    /* renamed from: n */
    public static final Rect f8377n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: o */
    public static final C1584b f8378o = new C1584b(19);

    /* renamed from: p */
    public static final C1584b f8379p = new C1584b(20);

    /* renamed from: h */
    public final AccessibilityManager f8384h;

    /* renamed from: i */
    public final Chip f8385i;

    /* renamed from: j */
    public C2387a f8386j;

    /* renamed from: d */
    public final Rect f8380d = new Rect();

    /* renamed from: e */
    public final Rect f8381e = new Rect();

    /* renamed from: f */
    public final Rect f8382f = new Rect();

    /* renamed from: g */
    public final int[] f8383g = new int[2];

    /* renamed from: k */
    public int f8387k = Integer.MIN_VALUE;

    /* renamed from: l */
    public int f8388l = Integer.MIN_VALUE;

    /* renamed from: m */
    public int f8389m = Integer.MIN_VALUE;

    public AbstractC2388b(Chip chip) {
        this.f8385i = chip;
        this.f8384h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // p105m0.C1794b
    /* renamed from: b */
    public final C1629o mo3502b(View view) {
        if (this.f8386j == null) {
            this.f8386j = new C2387a(this);
        }
        return this.f8386j;
    }

    @Override // p105m0.C1794b
    /* renamed from: d */
    public final void mo1361d(View view, C1952d c1952d) {
        AccessibilityNodeInfo accessibilityNodeInfo = c1952d.f7258a;
        this.f6850a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = ((C1903d) this).f7114q;
        C1905f c1905f = chip.f3211n;
        accessibilityNodeInfo.setCheckable(c1905f != null && c1905f.f7159i0);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c1952d.m3818i(chip.getAccessibilityClassName());
        c1952d.m3824o(chip.getText());
    }

    /* renamed from: j */
    public final boolean m4217j(int i) {
        if (this.f8388l != i) {
            return false;
        }
        this.f8388l = Integer.MIN_VALUE;
        mo3679p(i, false);
        m4222r(i, 8);
        return true;
    }

    /* renamed from: k */
    public final C1952d m4218k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C1952d c1952d = new C1952d(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c1952d.m3818i("android.view.View");
        Rect rect = f8377n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.f8385i;
        accessibilityNodeInfoObtain.setParent(chip);
        mo3678o(i, c1952d);
        if (c1952d.m3815f() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.f8381e;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.f8380d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c1952d.f7259b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.f8387k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c1952d.m3811a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c1952d.m3811a(64);
        }
        boolean z7 = this.f8388l == i;
        if (z7) {
            c1952d.m3811a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c1952d.m3811a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z7);
        int[] iArr = this.f8383g;
        chip.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            accessibilityNodeInfoObtain.setBoundsInParent(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            chip.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            accessibilityNodeInfoObtain.setBoundsInScreen(rect4);
            accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        }
        Rect rect5 = this.f8382f;
        if (chip.getLocalVisibleRect(rect5)) {
            rect5.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect5)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view = (View) parent;
                            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                                break;
                            }
                            parent = view.getParent();
                        } else if (parent != null) {
                            c1952d.f7258a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return c1952d;
    }

    /* renamed from: l */
    public abstract void mo3677l(ArrayList arrayList);

    /* JADX WARN: Removed duplicated region for block: B:40:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a6  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m4219m(int i, Rect rect) {
        int i4;
        int i8;
        Object obj;
        C1952d c1952d;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList = new ArrayList();
        mo3677l(arrayList);
        C2193l c2193l = new C2193l();
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            c2193l.m3999c(((Integer) arrayList.get(i14)).intValue(), m4218k(((Integer) arrayList.get(i14)).intValue()));
        }
        int i15 = this.f8388l;
        C1952d c1952d2 = i15 == Integer.MIN_VALUE ? null : (C1952d) c2193l.m3998b(i15);
        C1584b c1584b = f8378o;
        C1584b c1584b2 = f8379p;
        Chip chip = this.f8385i;
        if (i == 1 || i == 2) {
            i4 = -1;
            i8 = 0;
            boolean z7 = chip.getLayoutDirection() == 1;
            c1584b2.getClass();
            int i16 = c2193l.f7659l;
            ArrayList arrayList2 = new ArrayList(i16);
            for (int i17 = 0; i17 < i16; i17++) {
                arrayList2.add((C1952d) c2193l.f7658k[i17]);
            }
            Collections.sort(arrayList2, new C2389c(z7, c1584b));
            if (i == 1) {
                int size = arrayList2.size();
                if (c1952d2 != null) {
                    size = arrayList2.indexOf(c1952d2);
                }
                int i18 = size - 1;
                if (i18 >= 0) {
                    obj = arrayList2.get(i18);
                }
                c1952d = (C1952d) obj;
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c1952d2 == null ? -1 : arrayList2.lastIndexOf(c1952d2)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                c1952d = (C1952d) obj;
            }
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i19 = this.f8388l;
            if (i19 != Integer.MIN_VALUE) {
                m4220n(i19).f7258a.getBoundsInScreen(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = chip.getWidth();
                int height = chip.getHeight();
                if (i == 17) {
                    i11 = -1;
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    i11 = -1;
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    i11 = -1;
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i11 = -1;
                    rect2.set(0, -1, width, -1);
                }
                Rect rect3 = new Rect(rect2);
                if (i != 17) {
                    i8 = 0;
                    rect3.offset(rect2.width() + 1, 0);
                } else if (i == 33) {
                    i8 = 0;
                    rect3.offset(0, rect2.height() + 1);
                } else if (i == 66) {
                    i8 = 0;
                    rect3.offset(-(rect2.width() + 1), 0);
                } else {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i8 = 0;
                    rect3.offset(0, -(rect2.height() + 1));
                }
                c1584b2.getClass();
                i12 = c2193l.f7659l;
                Rect rect4 = new Rect();
                c1952d = null;
                for (i13 = i8; i13 < i12; i13++) {
                    C1952d c1952d3 = (C1952d) c2193l.f7658k[i13];
                    if (c1952d3 != c1952d2) {
                        c1584b.getClass();
                        c1952d3.f7258a.getBoundsInScreen(rect4);
                        if (AbstractC0714c.m1500M(i, rect2, rect4)) {
                            if (AbstractC0714c.m1500M(i, rect2, rect3) && !AbstractC0714c.m1520g(i, rect2, rect4, rect3)) {
                                if (!AbstractC0714c.m1520g(i, rect2, rect3, rect4)) {
                                    int iM1505R = AbstractC0714c.m1505R(i, rect2, rect4);
                                    int iM1506S = AbstractC0714c.m1506S(i, rect2, rect4);
                                    int i20 = (iM1506S * iM1506S) + (iM1505R * 13 * iM1505R);
                                    int iM1505R2 = AbstractC0714c.m1505R(i, rect2, rect3);
                                    int iM1506S2 = AbstractC0714c.m1506S(i, rect2, rect3);
                                    if (i20 < (iM1506S2 * iM1506S2) + (iM1505R2 * 13 * iM1505R2)) {
                                        rect3.set(rect4);
                                        c1952d = c1952d3;
                                    }
                                }
                            }
                        }
                    }
                }
                i4 = i11;
            }
            i11 = -1;
            Rect rect32 = new Rect(rect2);
            if (i != 17) {
            }
            c1584b2.getClass();
            i12 = c2193l.f7659l;
            Rect rect42 = new Rect();
            c1952d = null;
            while (i13 < i12) {
            }
            i4 = i11;
        }
        C1952d c1952d4 = c1952d;
        if (c1952d4 == null) {
            i10 = Integer.MIN_VALUE;
        } else {
            int i21 = c2193l.f7659l;
            int i22 = i8;
            while (true) {
                if (i22 >= i21) {
                    i9 = i4;
                    break;
                }
                if (c2193l.f7658k[i22] == c1952d4) {
                    i9 = i22;
                    break;
                }
                i22++;
            }
            i10 = c2193l.f7657j[i9];
        }
        return m4221q(i10);
    }

    /* renamed from: n */
    public final C1952d m4220n(int i) {
        if (i != -1) {
            return m4218k(i);
        }
        Chip chip = this.f8385i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C1952d c1952d = new C1952d(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo3677l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c1952d.f7258a.addChild(chip, ((Integer) arrayList.get(i4)).intValue());
        }
        return c1952d;
    }

    /* renamed from: o */
    public abstract void mo3678o(int i, C1952d c1952d);

    /* renamed from: p */
    public abstract void mo3679p(int i, boolean z7);

    /* renamed from: q */
    public final boolean m4221q(int i) {
        int i4;
        Chip chip = this.f8385i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i4 = this.f8388l) == i) {
            return false;
        }
        if (i4 != Integer.MIN_VALUE) {
            m4217j(i4);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f8388l = i;
        mo3679p(i, true);
        m4222r(i, 8);
        return true;
    }

    /* renamed from: r */
    public final void m4222r(int i, int i4) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.f8384h.isEnabled() || (parent = (view = this.f8385i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i4);
            C1952d c1952dM4220n = m4220n(i);
            accessibilityEventObtain.getText().add(c1952dM4220n.m3815f());
            AccessibilityNodeInfo accessibilityNodeInfo = c1952dM4220n.f7258a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i4);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
