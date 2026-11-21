package p219z5;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p168t2.AbstractC2415i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z5.a */
/* loaded from: classes.dex */
public final class C2971a extends AbstractC2415i0 {

    /* renamed from: a */
    public final /* synthetic */ int f11096a;

    /* renamed from: b */
    public final SideSheetBehavior f11097b;

    public /* synthetic */ C2971a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f11096a = i;
        this.f11097b = sideSheetBehavior;
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: E */
    public final boolean mo4272E(View view, float f8) {
        switch (this.f11096a) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f11097b;
                float fAbs = Math.abs((f8 * sideSheetBehavior.f3387k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f11097b;
                float fAbs2 = Math.abs((f8 * sideSheetBehavior2.f3387k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: H */
    public final void mo4273H(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i4) {
        switch (this.f11096a) {
            case 0:
                if (i <= this.f11097b.f3389m) {
                    marginLayoutParams.leftMargin = i4;
                    break;
                }
                break;
            default:
                int i8 = this.f11097b.f3389m;
                if (i <= i8) {
                    marginLayoutParams.rightMargin = i8 - i;
                    break;
                }
                break;
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: b */
    public final int mo4274b(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f11096a) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: c */
    public final float mo4275c(int i) {
        switch (this.f11096a) {
            case 0:
                float fMo4278k = mo4278k();
                return (i - fMo4278k) / (mo4276i() - fMo4278k);
            default:
                float f8 = this.f11097b.f3389m;
                return (f8 - i) / (f8 - mo4276i());
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: i */
    public final int mo4276i() {
        switch (this.f11096a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f11097b;
                return Math.max(0, sideSheetBehavior.f3390n + sideSheetBehavior.f3391o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f11097b;
                return Math.max(0, (sideSheetBehavior2.f3389m - sideSheetBehavior2.f3388l) - sideSheetBehavior2.f3391o);
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: k */
    public final int mo4278k() {
        switch (this.f11096a) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f11097b;
                return (-sideSheetBehavior.f3388l) - sideSheetBehavior.f3391o;
            default:
                return this.f11097b.f3389m;
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: l */
    public final int mo4279l() {
        switch (this.f11096a) {
            case 0:
                return this.f11097b.f3391o;
            default:
                return this.f11097b.f3389m;
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: m */
    public final int mo4280m() {
        switch (this.f11096a) {
            case 0:
                return -this.f11097b.f3388l;
            default:
                return mo4276i();
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: n */
    public final int mo4281n(View view) {
        switch (this.f11096a) {
            case 0:
                return view.getRight() + this.f11097b.f3391o;
            default:
                return view.getLeft() - this.f11097b.f3391o;
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: o */
    public final int mo4282o(CoordinatorLayout coordinatorLayout) {
        switch (this.f11096a) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: p */
    public final int mo4283p() {
        switch (this.f11096a) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: r */
    public final boolean mo4284r(float f8) {
        switch (this.f11096a) {
            case 0:
                if (f8 > 0.0f) {
                }
                break;
            default:
                if (f8 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: s */
    public final boolean mo4285s(View view) {
        switch (this.f11096a) {
            case 0:
                if (view.getRight() < (mo4276i() - mo4278k()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo4276i() + this.f11097b.f3389m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: t */
    public final boolean mo4286t(float f8, float f9) {
        switch (this.f11096a) {
            case 0:
                if (Math.abs(f8) <= Math.abs(f9) || Math.abs(f8) <= 500) {
                }
                break;
            default:
                if (Math.abs(f8) <= Math.abs(f9) || Math.abs(f8) <= 500) {
                }
                break;
        }
        return false;
    }
}
