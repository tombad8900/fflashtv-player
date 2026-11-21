package p074i5;

import android.os.SystemClock;
import android.support.v4.media.session.AbstractC0120b;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.AbstractC0715d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p213z.AbstractC2863a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i5.b */
/* loaded from: classes.dex */
public final class C1270b extends AbstractC0715d {

    /* renamed from: n */
    public final /* synthetic */ int f5282n;

    /* renamed from: o */
    public final /* synthetic */ AbstractC2863a f5283o;

    public /* synthetic */ C1270b(AbstractC2863a abstractC2863a, int i) {
        this.f5282n = i;
        this.f5283o = abstractC2863a;
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: I */
    public int mo1580I(View view) {
        switch (this.f5282n) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5283o;
                return sideSheetBehavior.f3388l + sideSheetBehavior.f3391o;
            default:
                return super.mo1580I(view);
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: K */
    public int mo1582K() {
        switch (this.f5282n) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5283o;
                return bottomSheetBehavior.f3099J ? bottomSheetBehavior.f3113X : bottomSheetBehavior.f3097H;
            default:
                return super.mo1582K();
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: X */
    public final void mo1585X(int i) {
        switch (this.f5282n) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5283o;
                    if (bottomSheetBehavior.f3101L) {
                        bottomSheetBehavior.m1783F(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5283o;
                    if (sideSheetBehavior.f3383g) {
                        sideSheetBehavior.m1886r(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: Y */
    public final void mo1586Y(View view, int i, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f5282n) {
            case 0:
                ((BottomSheetBehavior) this.f5283o).m1797v(i4);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5283o;
                WeakReference weakReference = sideSheetBehavior.f3393q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f3377a.mo4273H(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f3397u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f3377a.mo4275c(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1587Z(View view, float f8, float f9) {
        int i;
        switch (this.f5282n) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5283o;
                int i4 = 6;
                if (f9 < 0.0f) {
                    if (bottomSheetBehavior.f3118b) {
                        i4 = 3;
                    } else {
                        int top = view.getTop();
                        SystemClock.uptimeMillis();
                        bottomSheetBehavior.getClass();
                        if (top <= bottomSheetBehavior.f3095F) {
                        }
                    }
                } else if (bottomSheetBehavior.f3099J && bottomSheetBehavior.m1784G(view, f9)) {
                    if (Math.abs(f8) >= Math.abs(f9) || f9 <= bottomSheetBehavior.f3122d) {
                        if (view.getTop() > (bottomSheetBehavior.m1798y() + bottomSheetBehavior.f3113X) / 2) {
                            i4 = 5;
                        } else if (bottomSheetBehavior.f3118b || Math.abs(view.getTop() - bottomSheetBehavior.m1798y()) < Math.abs(view.getTop() - bottomSheetBehavior.f3095F)) {
                        }
                    }
                } else if (f9 == 0.0f || Math.abs(f8) > Math.abs(f9)) {
                    int top2 = view.getTop();
                    if (!bottomSheetBehavior.f3118b) {
                        int i8 = bottomSheetBehavior.f3095F;
                        if (top2 < i8) {
                            if (top2 >= Math.abs(top2 - bottomSheetBehavior.f3097H)) {
                                bottomSheetBehavior.getClass();
                            }
                        } else if (Math.abs(top2 - i8) < Math.abs(top2 - bottomSheetBehavior.f3097H)) {
                            bottomSheetBehavior.getClass();
                        }
                    } else if (Math.abs(top2 - bottomSheetBehavior.f3094E) >= Math.abs(top2 - bottomSheetBehavior.f3097H)) {
                        i4 = 4;
                    }
                } else if (!bottomSheetBehavior.f3118b) {
                    int top3 = view.getTop();
                    if (Math.abs(top3 - bottomSheetBehavior.f3095F) < Math.abs(top3 - bottomSheetBehavior.f3097H)) {
                        bottomSheetBehavior.getClass();
                    }
                }
                bottomSheetBehavior.getClass();
                bottomSheetBehavior.m1785H(view, i4, true);
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5283o;
                if (!sideSheetBehavior.f3377a.mo4284r(f8)) {
                    if (sideSheetBehavior.f3377a.mo4272E(view, f8)) {
                        i = (sideSheetBehavior.f3377a.mo4286t(f8, f9) || sideSheetBehavior.f3377a.mo4285s(view)) ? 5 : 3;
                    } else {
                        if (f8 == 0.0f || Math.abs(f8) <= Math.abs(f9)) {
                            int left = view.getLeft();
                            if (Math.abs(left - sideSheetBehavior.f3377a.mo4276i()) < Math.abs(left - sideSheetBehavior.f3377a.mo4278k())) {
                            }
                        }
                    }
                }
                sideSheetBehavior.m1888t(view, i, true);
                break;
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: n */
    public final int mo1600n(View view, int i) {
        switch (this.f5282n) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5283o;
                return AbstractC0120b.m415k(i, sideSheetBehavior.f3377a.mo4280m(), sideSheetBehavior.f3377a.mo4279l());
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: o */
    public final int mo1602o(View view, int i) {
        switch (this.f5282n) {
            case 0:
                return AbstractC0120b.m415k(i, ((BottomSheetBehavior) this.f5283o).m1798y(), mo1582K());
            default:
                return view.getTop();
        }
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: q0 */
    public final boolean mo1603q0(View view, int i) {
        WeakReference weakReference;
        switch (this.f5282n) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f5283o;
                int i4 = bottomSheetBehavior.f3105P;
                if (i4 != 1 && !bottomSheetBehavior.f3127f0) {
                    if (i4 == 3 && bottomSheetBehavior.f3121c0 == i) {
                        View view2 = null;
                        if (bottomSheetBehavior.f3124e) {
                            WeakReference weakReference2 = bottomSheetBehavior.f3125e0;
                            if (weakReference2 != null) {
                                view2 = (View) weakReference2.get();
                            }
                        } else {
                            ArrayList arrayList = bottomSheetBehavior.f3115Z;
                            if (!arrayList.isEmpty()) {
                                view2 = (View) ((WeakReference) arrayList.get(0)).get();
                            }
                        }
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    SystemClock.uptimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f3114Y;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f5283o;
                if (sideSheetBehavior.f3384h != 1 && (weakReference = sideSheetBehavior.f3392p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }
}
