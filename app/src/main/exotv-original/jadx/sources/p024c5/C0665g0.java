package p024c5;

import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC0714c;
import p216z2.AbstractC2888f0;
import p216z2.AbstractC2920v0;
import p216z2.AbstractC2923x;
import p216z2.C2909q;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: c5.g0 */
/* loaded from: classes.dex */
public final class C0665g0 extends RecyclerView {

    /* renamed from: S0 */
    public final boolean f2603S0;

    /* renamed from: T0 */
    public int f2604T0;

    /* renamed from: U0 */
    public int f2605U0;

    /* renamed from: V0 */
    public Integer f2606V0;

    /* renamed from: W0 */
    public int f2607W0;

    public C0665g0(int i, Context context, boolean z7) {
        super(context, null);
        this.f2603S0 = z7;
        this.f2604T0 = -1;
        this.f2607W0 = z7 ? i : -1;
        if (z7) {
            setFocusable(true);
            setFocusableInTouchMode(true);
            setDescendantFocusability(262144);
        }
        m1187j(new C0662f0(0, this));
        setHasFixedSize(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        AbstractC2980h.m5136e("event", keyEvent);
        if (keyEvent.getAction() == 0) {
            View viewFindFocus = findFocus();
            if (viewFindFocus == null) {
                viewFindFocus = this;
            }
            if (m1434m0(viewFindFocus, keyEvent.getKeyCode())) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x007c, code lost:
    
        if (r9 != null) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0054 A[PHI: r9
      0x0054: PHI (r9v27 java.lang.Integer) = (r9v5 java.lang.Integer), (r9v10 java.lang.Integer) binds: [B:36:0x0052, B:48:0x007c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* renamed from: m0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m1434m0(View view, int i) {
        Integer numValueOf;
        int iIntValue;
        int i4;
        RecyclerView recyclerView;
        AbstractC2923x adapter;
        int iM1160I;
        final int i8 = 0;
        if (i == 21 || i == 22) {
            AbstractC2923x adapter2 = getAdapter();
            int iMo1455a = adapter2 != null ? adapter2.mo1455a() : 0;
            if (iMo1455a != 0) {
                View viewM1156D = m1156D(view);
                AbstractC2920v0 abstractC2920v0M1162L = viewM1156D == null ? null : m1162L(viewM1156D);
                if (abstractC2920v0M1162L == null) {
                    numValueOf = null;
                    if (numValueOf == null) {
                        iIntValue = numValueOf.intValue();
                        final int i9 = 1;
                        if (i != 21) {
                            i4 = iIntValue - 1;
                            if (i4 < 0) {
                                i4 = 0;
                            }
                        } else if (i != 22) {
                            i4 = iIntValue;
                        } else {
                            i4 = iIntValue + 1;
                            int i10 = iMo1455a - 1;
                            if (i4 > i10) {
                                i4 = i10;
                            }
                        }
                        if (i4 == iIntValue) {
                            AbstractC2888f0 layoutManager = getLayoutManager();
                            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                            if (linearLayoutManager != null) {
                                this.f2606V0 = Integer.valueOf(i4);
                                this.f2607W0 = i4;
                                View viewMo1139q = linearLayoutManager.mo1139q(iIntValue);
                                if (viewMo1139q == null) {
                                    C0689r0 c0689r0 = C0689r0.f2694a;
                                    viewMo1139q = C0689r0.m1461a(this);
                                }
                                View viewMo1139q2 = linearLayoutManager.mo1139q(i4);
                                boolean z7 = this.f2603S0;
                                if (z7 && (viewMo1139q == null || viewMo1139q2 == null)) {
                                    linearLayoutManager.f2001x = i4;
                                    linearLayoutManager.f2002y = 0;
                                    C2909q c2909q = linearLayoutManager.f2003z;
                                    if (c2909q != null) {
                                        c2909q.f10800j = -1;
                                    }
                                    linearLayoutManager.m5004n0();
                                    post(new Runnable(this) { // from class: c5.e0

                                        /* renamed from: k */
                                        public final /* synthetic */ C0665g0 f2591k;

                                        {
                                            this.f2591k = this;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            switch (i9) {
                                                case 0:
                                                    this.f2591k.m1435n0();
                                                    break;
                                                default:
                                                    this.f2591k.m1435n0();
                                                    break;
                                            }
                                        }
                                    });
                                } else if (viewMo1139q != null && viewMo1139q2 != null) {
                                    int right = ((viewMo1139q2.getRight() + viewMo1139q2.getLeft()) - (viewMo1139q.getRight() + viewMo1139q.getLeft())) / 2;
                                    if (right != 0) {
                                        scrollBy(right, 0);
                                    }
                                    if (z7) {
                                        m1435n0();
                                    }
                                } else if (!this.f2026G) {
                                    AbstractC2888f0 abstractC2888f0 = this.f2080w;
                                    if (abstractC2888f0 == null) {
                                        Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                                    } else {
                                        abstractC2888f0.mo1141z0(this, i4);
                                    }
                                }
                            }
                            post(new Runnable(this) { // from class: c5.e0

                                /* renamed from: k */
                                public final /* synthetic */ C0665g0 f2591k;

                                {
                                    this.f2591k = this;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i8) {
                                        case 0:
                                            this.f2591k.m1435n0();
                                            break;
                                        default:
                                            this.f2591k.m1435n0();
                                            break;
                                    }
                                }
                            });
                            return true;
                        }
                        if (i == 22 || iIntValue > 0) {
                            return true;
                        }
                    } else {
                        int i11 = this.f2607W0;
                        Integer numValueOf2 = Integer.valueOf(i11);
                        if (i11 == -1) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            iIntValue = numValueOf2.intValue();
                            final int i92 = 1;
                            if (i != 21) {
                            }
                            if (i4 == iIntValue) {
                            }
                        } else {
                            C0689r0 c0689r02 = C0689r0.f2694a;
                            View viewM1461a = C0689r0.m1461a(this);
                            numValueOf = viewM1461a != null ? Integer.valueOf(RecyclerView.m1143K(viewM1461a)) : null;
                        }
                    }
                } else {
                    if (abstractC2920v0M1162L.f10866s == null || (recyclerView = abstractC2920v0M1162L.f10865r) == null || (adapter = recyclerView.getAdapter()) == null || (iM1160I = abstractC2920v0M1162L.f10865r.m1160I(abstractC2920v0M1162L)) == -1 || abstractC2920v0M1162L.f10866s != adapter) {
                        iM1160I = -1;
                    }
                    numValueOf = Integer.valueOf(iM1160I);
                    if (iM1160I == -1) {
                    }
                    if (numValueOf == null) {
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: n0 */
    public final void m1435n0() {
        int iIntValue;
        View viewM1461a;
        if (this.f2606V0 == null || getScrollState() == 0) {
            AbstractC2923x adapter = getAdapter();
            int iMo1455a = adapter != null ? adapter.mo1455a() : 0;
            if (iMo1455a == 0) {
                return;
            }
            Integer num = this.f2606V0;
            boolean z7 = this.f2603S0;
            if (num != null) {
                iIntValue = AbstractC0714c.m1534t(num.intValue(), 0, iMo1455a - 1);
            } else {
                int i = this.f2607W0;
                Integer numValueOf = Integer.valueOf(i);
                if (!z7 || i < 0 || i >= iMo1455a) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    C0689r0 c0689r0 = C0689r0.f2694a;
                    View viewM1461a2 = C0689r0.m1461a(this);
                    Integer numValueOf2 = viewM1461a2 != null ? Integer.valueOf(RecyclerView.m1143K(viewM1461a2)) : null;
                    if (numValueOf2 == null) {
                        return;
                    } else {
                        iIntValue = numValueOf2.intValue();
                    }
                }
            }
            AbstractC2888f0 layoutManager = getLayoutManager();
            LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
            if (linearLayoutManager == null || (viewM1461a = linearLayoutManager.mo1139q(iIntValue)) == null) {
                C0689r0 c0689r02 = C0689r0.f2694a;
                viewM1461a = C0689r0.m1461a(this);
                if (viewM1461a == null) {
                    return;
                }
            }
            if (getScrollState() != 0) {
                return;
            }
            this.f2606V0 = null;
            if (z7 && hasFocus()) {
                this.f2607W0 = iIntValue;
            }
            if (z7 && iIntValue == this.f2604T0 && viewM1461a.isFocused()) {
                return;
            }
            this.f2604T0 = iIntValue;
            if (z7) {
                boolean zHasFocus = hasFocus();
                int childCount = getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    boolean z8 = RecyclerView.m1143K(childAt) == iIntValue;
                    childAt.setFocusable(z8);
                    childAt.setFocusableInTouchMode(z8);
                    if (zHasFocus && z8 && !childAt.isFocused()) {
                        childAt.requestFocus();
                    }
                }
            }
            C0689r0 c0689r03 = C0689r0.f2694a;
            C0689r0.m1463c(this);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i, Rect rect) {
        super.onFocusChanged(z7, i, rect);
        if (this.f2603S0 && z7) {
            C0689r0 c0689r0 = C0689r0.f2694a;
            View viewM1461a = C0689r0.m1461a(this);
            this.f2607W0 = viewM1461a != null ? RecyclerView.m1143K(viewM1461a) : -1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        int width = (this.f2605U0 <= 0 || getWidth() <= 0) ? 0 : (getWidth() - this.f2605U0) / 2;
        if (getPaddingLeft() != width) {
            setPadding(width, 0, width, 0);
        }
    }
}
