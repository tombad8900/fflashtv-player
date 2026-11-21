package p105m0;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.l */
/* loaded from: classes.dex */
public final class C1824l {

    /* renamed from: a */
    public ViewParent f6899a;

    /* renamed from: b */
    public ViewParent f6900b;

    /* renamed from: c */
    public final ViewGroup f6901c;

    /* renamed from: d */
    public boolean f6902d;

    /* renamed from: e */
    public int[] f6903e;

    public C1824l(ViewGroup viewGroup) {
        this.f6901c = viewGroup;
    }

    /* renamed from: a */
    public final boolean m3584a(float f8, float f9, boolean z7) {
        ViewParent viewParentM3588e;
        if (this.f6902d && (viewParentM3588e = m3588e(0)) != null) {
            try {
                return viewParentM3588e.onNestedFling(this.f6901c, f8, f9, z7);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM3588e + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* renamed from: b */
    public final boolean m3585b(float f8, float f9) {
        ViewParent viewParentM3588e;
        if (this.f6902d && (viewParentM3588e = m3588e(0)) != null) {
            try {
                return viewParentM3588e.onNestedPreFling(this.f6901c, f8, f9);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM3588e + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m3586c(int i, int i4, int i8, int[] iArr, int[] iArr2) {
        ViewParent viewParentM3588e;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f6902d || (viewParentM3588e = m3588e(i8)) == null) {
            return false;
        }
        if (i == 0 && i4 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f6901c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i9 = iArr2[0];
            i10 = iArr2[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr == null) {
            if (this.f6903e == null) {
                this.f6903e = new int[2];
            }
            iArr3 = this.f6903e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM3588e instanceof InterfaceC1827m) {
            ((InterfaceC1827m) viewParentM3588e).mo460f(viewGroup, i, i4, iArr3, i8);
        } else if (i8 == 0) {
            try {
                viewParentM3588e.onNestedPreScroll(viewGroup, i, i4, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM3588e + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i9;
            iArr2[1] = iArr2[1] - i10;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* renamed from: d */
    public final boolean m3587d(int i, int i4, int i8, int i9, int[] iArr, int i10, int[] iArr2) {
        ViewParent viewParentM3588e;
        int i11;
        int i12;
        int[] iArr3;
        if (this.f6902d && (viewParentM3588e = m3588e(i10)) != null) {
            if (i != 0 || i4 != 0 || i8 != 0 || i9 != 0) {
                ViewGroup viewGroup = this.f6901c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i11 = iArr[0];
                    i12 = iArr[1];
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                if (iArr2 == null) {
                    if (this.f6903e == null) {
                        this.f6903e = new int[2];
                    }
                    int[] iArr4 = this.f6903e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM3588e instanceof InterfaceC1830n) {
                    ((InterfaceC1830n) viewParentM3588e).mo455a(viewGroup, i, i4, i8, i9, i10, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i8;
                    iArr3[1] = iArr3[1] + i9;
                    if (viewParentM3588e instanceof InterfaceC1827m) {
                        ((InterfaceC1827m) viewParentM3588e).mo456b(viewGroup, i, i4, i8, i9, i10);
                    } else if (i10 == 0) {
                        try {
                            viewParentM3588e.onNestedScroll(viewGroup, i, i4, i8, i9);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM3588e + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i11;
                    iArr[1] = iArr[1] - i12;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* renamed from: e */
    public final ViewParent m3588e(int i) {
        if (i == 0) {
            return this.f6899a;
        }
        if (i != 1) {
            return null;
        }
        return this.f6900b;
    }

    /* renamed from: f */
    public final boolean m3589f(int i) {
        return m3588e(i) != null;
    }

    /* renamed from: g */
    public final boolean m3590g(int i, int i4) {
        boolean zOnStartNestedScroll;
        if (!m3589f(i4)) {
            if (this.f6902d) {
                View view = this.f6901c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z7 = parent instanceof InterfaceC1827m;
                    if (z7) {
                        zOnStartNestedScroll = ((InterfaceC1827m) parent).mo457c(view2, view, i, i4);
                    } else if (i4 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i4 == 0) {
                            this.f6899a = parent;
                        } else if (i4 == 1) {
                            this.f6900b = parent;
                        }
                        if (z7) {
                            ((InterfaceC1827m) parent).mo458d(view2, view, i, i4);
                        } else if (i4 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e8) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e8);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public final void m3591h(int i) {
        ViewParent viewParentM3588e = m3588e(i);
        if (viewParentM3588e != null) {
            boolean z7 = viewParentM3588e instanceof InterfaceC1827m;
            ViewGroup viewGroup = this.f6901c;
            if (z7) {
                ((InterfaceC1827m) viewParentM3588e).mo459e(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentM3588e.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM3588e + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f6899a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f6900b = null;
            }
        }
    }
}
