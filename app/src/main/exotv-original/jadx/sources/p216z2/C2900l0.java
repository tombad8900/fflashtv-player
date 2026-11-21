package p216z2;

import android.os.Trace;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import androidx.media3.common.C0228p;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.AbstractC0714c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p002a1.AbstractC0008a1;
import p063h1.C1131v;
import p070i0.AbstractC1221f;
import p072i2.C1250j;
import p105m0.AbstractC1828m0;
import p105m0.C1791a;
import p105m0.C1794b;
import p184v1.C2528c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.l0 */
/* loaded from: classes.dex */
public final class C2900l0 {

    /* renamed from: a */
    public final ArrayList f10756a;

    /* renamed from: b */
    public ArrayList f10757b;

    /* renamed from: c */
    public final ArrayList f10758c;

    /* renamed from: d */
    public final List f10759d;

    /* renamed from: e */
    public int f10760e;

    /* renamed from: f */
    public int f10761f;

    /* renamed from: g */
    public C2898k0 f10762g;

    /* renamed from: h */
    public final /* synthetic */ RecyclerView f10763h;

    public C2900l0(RecyclerView recyclerView) {
        this.f10763h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.f10756a = arrayList;
        this.f10757b = null;
        this.f10758c = new ArrayList();
        this.f10759d = Collections.unmodifiableList(arrayList);
        this.f10760e = 2;
        this.f10761f = 2;
    }

    /* renamed from: a */
    public final void m5029a(AbstractC2920v0 abstractC2920v0, boolean z7) {
        RecyclerView.m1151l(abstractC2920v0);
        View view = abstractC2920v0.f10848a;
        RecyclerView recyclerView = this.f10763h;
        C2924x0 c2924x0 = recyclerView.f2081w0;
        if (c2924x0 != null) {
            C2922w0 c2922w0 = c2924x0.f10874e;
            AbstractC1828m0.m3608m(view, c2922w0 != null ? (C1794b) c2922w0.f10869e.remove(view) : null);
        }
        if (z7) {
            ArrayList arrayList = recyclerView.f2082x;
            if (arrayList.size() > 0) {
                throw AbstractC0008a1.m10f(0, arrayList);
            }
            if (recyclerView.f2067p0 != null) {
                recyclerView.f2066p.m4159y(abstractC2920v0);
            }
            if (RecyclerView.f2005J0) {
                Log.d("RecyclerView", "dispatchViewRecycled: " + abstractC2920v0);
            }
        }
        abstractC2920v0.f10866s = null;
        abstractC2920v0.f10865r = null;
        C2898k0 c2898k0M5031c = m5031c();
        c2898k0M5031c.getClass();
        int i = abstractC2920v0.f10853f;
        ArrayList arrayList2 = c2898k0M5031c.m5025a(i).f10738a;
        if (((C2896j0) c2898k0M5031c.f10747a.get(i)).f10739b <= arrayList2.size()) {
            AbstractC0714c.m1523i(view);
        } else {
            if (RecyclerView.f2004I0 && arrayList2.contains(abstractC2920v0)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            abstractC2920v0.m5073m();
            arrayList2.add(abstractC2920v0);
        }
    }

    /* renamed from: b */
    public final int m5030b(int i) {
        RecyclerView recyclerView = this.f10763h;
        if (i >= 0 && i < recyclerView.f2067p0.m5052b()) {
            return !recyclerView.f2067p0.f10825g ? i : recyclerView.f2062n.m2698h(i, 0);
        }
        throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + recyclerView.f2067p0.m5052b() + recyclerView.m1154B());
    }

    /* renamed from: c */
    public final C2898k0 m5031c() {
        if (this.f10762g == null) {
            C2898k0 c2898k0 = new C2898k0();
            c2898k0.f10747a = new SparseArray();
            c2898k0.f10748b = 0;
            c2898k0.f10749c = Collections.newSetFromMap(new IdentityHashMap());
            this.f10762g = c2898k0;
            m5033e();
        }
        return this.f10762g;
    }

    /* renamed from: d */
    public final View m5032d(int i) {
        return m5040l(i, Long.MAX_VALUE).f10848a;
    }

    /* renamed from: e */
    public final void m5033e() {
        RecyclerView recyclerView;
        AbstractC2923x abstractC2923x;
        C2898k0 c2898k0 = this.f10762g;
        if (c2898k0 == null || (abstractC2923x = (recyclerView = this.f10763h).f2078v) == null || !recyclerView.f2016B) {
            return;
        }
        c2898k0.f10749c.add(abstractC2923x);
    }

    /* renamed from: f */
    public final void m5034f(AbstractC2923x abstractC2923x, boolean z7) {
        C2898k0 c2898k0 = this.f10762g;
        if (c2898k0 != null) {
            SparseArray sparseArray = c2898k0.f10747a;
            Set set = c2898k0.f10749c;
            set.remove(abstractC2923x);
            if (set.size() != 0 || z7) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((C2896j0) sparseArray.get(sparseArray.keyAt(i))).f10738a;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    AbstractC0714c.m1523i(((AbstractC2920v0) arrayList.get(i4)).f10848a);
                }
            }
        }
    }

    /* renamed from: g */
    public final void m5035g() {
        ArrayList arrayList = this.f10758c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            m5036h(size);
        }
        arrayList.clear();
        if (RecyclerView.f2010O0) {
            C1131v c1131v = this.f10763h.f2065o0;
            int[] iArr = (int[]) c1131v.f4792b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            c1131v.f4795e = 0;
        }
    }

    /* renamed from: h */
    public final void m5036h(int i) {
        if (RecyclerView.f2005J0) {
            Log.d("RecyclerView", "Recycling cached view at index " + i);
        }
        ArrayList arrayList = this.f10758c;
        AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) arrayList.get(i);
        if (RecyclerView.f2005J0) {
            Log.d("RecyclerView", "CachedViewHolder to be recycled: " + abstractC2920v0);
        }
        m5029a(abstractC2920v0, true);
        arrayList.remove(i);
    }

    /* renamed from: i */
    public final void m5037i(View view) {
        AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
        boolean zM5070j = abstractC2920v0M1144M.m5070j();
        RecyclerView recyclerView = this.f10763h;
        if (zM5070j) {
            recyclerView.removeDetachedView(view, false);
        }
        if (abstractC2920v0M1144M.m5069i()) {
            abstractC2920v0M1144M.f10861n.m5041m(abstractC2920v0M1144M);
        } else if (abstractC2920v0M1144M.m5076p()) {
            abstractC2920v0M1144M.f10857j &= -33;
        }
        m5038j(abstractC2920v0M1144M);
        if (recyclerView.f2042U == null || abstractC2920v0M1144M.m5067g()) {
            return;
        }
        recyclerView.f2042U.mo4974d(abstractC2920v0M1144M);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b6, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5038j(AbstractC2920v0 abstractC2920v0) {
        boolean z7;
        boolean z8;
        int i;
        RecyclerView recyclerView = this.f10763h;
        C1131v c1131v = recyclerView.f2065o0;
        boolean zM5069i = abstractC2920v0.m5069i();
        View view = abstractC2920v0.f10848a;
        boolean z9 = true;
        if (zM5069i || view.getParent() != null) {
            StringBuilder sb = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
            sb.append(abstractC2920v0.m5069i());
            sb.append(" isAttached:");
            sb.append(view.getParent() != null);
            sb.append(recyclerView.m1154B());
            throw new IllegalArgumentException(sb.toString());
        }
        if (abstractC2920v0.m5070j()) {
            StringBuilder sb2 = new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
            sb2.append(abstractC2920v0);
            throw new IllegalArgumentException(AbstractC0008a1.m13i(recyclerView, sb2));
        }
        if (abstractC2920v0.m5075o()) {
            throw new IllegalArgumentException(AbstractC0008a1.m13i(recyclerView, new StringBuilder("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
        }
        if ((abstractC2920v0.f10857j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
            z7 = view.hasTransientState();
        }
        boolean z10 = RecyclerView.f2004I0;
        ArrayList arrayList = this.f10758c;
        if (z10 && arrayList.contains(abstractC2920v0)) {
            StringBuilder sb3 = new StringBuilder("cached view received recycle internal? ");
            sb3.append(abstractC2920v0);
            throw new IllegalArgumentException(AbstractC0008a1.m13i(recyclerView, sb3));
        }
        if (abstractC2920v0.m5067g()) {
            if (this.f10761f <= 0 || (abstractC2920v0.f10857j & 526) != 0) {
                z8 = false;
            } else {
                int size = arrayList.size();
                if (size >= this.f10761f && size > 0) {
                    m5036h(0);
                    size--;
                }
                if (RecyclerView.f2010O0 && size > 0) {
                    int i4 = abstractC2920v0.f10850c;
                    if (((int[]) c1131v.f4792b) != null) {
                        int i8 = c1131v.f4795e * 2;
                        for (int i9 = 0; i9 < i8; i9 += 2) {
                            if (((int[]) c1131v.f4792b)[i9] == i4) {
                                break;
                            }
                        }
                        i = size - 1;
                        loop1: while (i >= 0) {
                            int i10 = ((AbstractC2920v0) arrayList.get(i)).f10850c;
                            if (((int[]) c1131v.f4792b) == null) {
                                break;
                            }
                            int i11 = c1131v.f4795e * 2;
                            for (int i12 = 0; i12 < i11; i12 += 2) {
                                if (((int[]) c1131v.f4792b)[i12] == i10) {
                                    break;
                                }
                            }
                            break loop1;
                        }
                        size = i + 1;
                    } else {
                        i = size - 1;
                        loop1: while (i >= 0) {
                        }
                        size = i + 1;
                    }
                }
                arrayList.add(size, abstractC2920v0);
                z8 = true;
            }
            if (z8) {
                z9 = false;
            } else {
                m5029a(abstractC2920v0, true);
            }
            z = z8;
        } else {
            if (RecyclerView.f2005J0) {
                Log.d("RecyclerView", "trying to recycle a non-recycleable holder. Hopefully, it will re-visit here. We are still removing it from animation lists" + recyclerView.m1154B());
            }
            z9 = false;
        }
        recyclerView.f2066p.m4159y(abstractC2920v0);
        if (z || z9 || !z7) {
            return;
        }
        AbstractC0714c.m1523i(view);
        abstractC2920v0.f10866s = null;
        abstractC2920v0.f10865r = null;
    }

    /* renamed from: k */
    public final void m5039k(View view) {
        AbstractC2876b0 abstractC2876b0;
        AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
        int i = abstractC2920v0M1144M.f10857j & 12;
        RecyclerView recyclerView = this.f10763h;
        if (i == 0 && abstractC2920v0M1144M.m5071k() && (abstractC2876b0 = recyclerView.f2042U) != null) {
            C2891h c2891h = (C2891h) abstractC2876b0;
            if (abstractC2920v0M1144M.m5063c().isEmpty() && c2891h.f10694g && !abstractC2920v0M1144M.m5066f()) {
                if (this.f10757b == null) {
                    this.f10757b = new ArrayList();
                }
                abstractC2920v0M1144M.f10861n = this;
                abstractC2920v0M1144M.f10862o = true;
                this.f10757b.add(abstractC2920v0M1144M);
                return;
            }
        }
        if (abstractC2920v0M1144M.m5066f() && !abstractC2920v0M1144M.m5068h() && !recyclerView.f2078v.f10871b) {
            throw new IllegalArgumentException(AbstractC0008a1.m13i(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        abstractC2920v0M1144M.f10861n = this;
        abstractC2920v0M1144M.f10862o = false;
        this.f10756a.add(abstractC2920v0M1144M);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0625  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x063b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x063e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2920v0 m5040l(int i, long j) {
        boolean z7;
        AbstractC2920v0 abstractC2920v0Mo1457e;
        boolean z8;
        long j8;
        long j9;
        boolean z9;
        boolean z10;
        boolean z11;
        ViewGroup.LayoutParams layoutParams;
        C2890g0 c2890g0;
        RecyclerView recyclerViewM1142G;
        AbstractC2920v0 abstractC2920v0;
        int i4;
        View view;
        boolean z12;
        int size;
        int iM2698h;
        RecyclerView recyclerView = this.f10763h;
        C2912r0 c2912r0 = recyclerView.f2067p0;
        if (i < 0 || i >= c2912r0.m5052b()) {
            StringBuilder sbM19o = AbstractC0008a1.m19o(i, i, "Invalid item position ", "(", "). Item count:");
            sbM19o.append(c2912r0.m5052b());
            sbM19o.append(recyclerView.m1154B());
            throw new IndexOutOfBoundsException(sbM19o.toString());
        }
        if (c2912r0.f10825g) {
            ArrayList arrayList = this.f10757b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                abstractC2920v0Mo1457e = null;
                z7 = abstractC2920v0Mo1457e == null;
            } else {
                int i8 = 0;
                while (true) {
                    if (i8 < size) {
                        abstractC2920v0Mo1457e = (AbstractC2920v0) this.f10757b.get(i8);
                        if (!abstractC2920v0Mo1457e.m5076p() && abstractC2920v0Mo1457e.m5062b() == i) {
                            abstractC2920v0Mo1457e.m5061a(32);
                            break;
                        }
                        i8++;
                    } else if (recyclerView.f2078v.f10871b && (iM2698h = recyclerView.f2062n.m2698h(i, 0)) > 0 && iM2698h < recyclerView.f2078v.mo1455a()) {
                        long jMo1467b = recyclerView.f2078v.mo1467b(iM2698h);
                        for (int i9 = 0; i9 < size; i9++) {
                            AbstractC2920v0 abstractC2920v02 = (AbstractC2920v0) this.f10757b.get(i9);
                            if (!abstractC2920v02.m5076p() && abstractC2920v02.f10852e == jMo1467b) {
                                abstractC2920v02.m5061a(32);
                                abstractC2920v0Mo1457e = abstractC2920v02;
                                break;
                            }
                        }
                    }
                }
                abstractC2920v0Mo1457e = null;
                if (abstractC2920v0Mo1457e == null) {
                }
            }
        } else {
            z7 = false;
            abstractC2920v0Mo1457e = null;
        }
        ArrayList arrayList2 = this.f10756a;
        ArrayList arrayList3 = this.f10758c;
        if (abstractC2920v0Mo1457e == null) {
            int size2 = arrayList2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                AbstractC2920v0 abstractC2920v03 = (AbstractC2920v0) arrayList2.get(i10);
                if (!abstractC2920v03.m5076p() && abstractC2920v03.m5062b() == i && !abstractC2920v03.m5066f() && (c2912r0.f10825g || !abstractC2920v03.m5068h())) {
                    abstractC2920v03.m5061a(32);
                    abstractC2920v0Mo1457e = abstractC2920v03;
                    z8 = true;
                    break;
                }
            }
            ArrayList arrayList4 = (ArrayList) recyclerView.f2064o.f5232n;
            int size3 = arrayList4.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size3) {
                    z8 = true;
                    view = null;
                    break;
                }
                view = (View) arrayList4.get(i11);
                AbstractC2920v0 abstractC2920v0M1144M = RecyclerView.m1144M(view);
                z8 = true;
                if (abstractC2920v0M1144M.m5062b() == i && !abstractC2920v0M1144M.m5066f() && !abstractC2920v0M1144M.m5068h()) {
                    break;
                }
                i11++;
            }
            if (view == null) {
                int size4 = arrayList3.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size4) {
                        abstractC2920v0Mo1457e = null;
                        break;
                    }
                    AbstractC2920v0 abstractC2920v04 = (AbstractC2920v0) arrayList3.get(i12);
                    if (abstractC2920v04.m5066f() || abstractC2920v04.m5062b() != i || abstractC2920v04.m5064d()) {
                        i12++;
                    } else {
                        arrayList3.remove(i12);
                        if (RecyclerView.f2005J0) {
                            Log.d("RecyclerView", "getScrapOrHiddenOrCachedHolderForPosition(" + i + ") found match in cache: " + abstractC2920v04);
                        }
                        abstractC2920v0Mo1457e = abstractC2920v04;
                    }
                }
            } else {
                AbstractC2920v0 abstractC2920v0M1144M2 = RecyclerView.m1144M(view);
                C1250j c1250j = recyclerView.f2064o;
                C2528c c2528c = (C2528c) c1250j.f5231m;
                int iIndexOfChild = ((C2921w) c1250j.f5230l).f10867a.indexOfChild(view);
                if (iIndexOfChild < 0) {
                    throw new IllegalArgumentException("view is not a child, cannot hide " + view);
                }
                if (!c2528c.m4546m(iIndexOfChild)) {
                    throw new RuntimeException("trying to unhide a view that was not hidden" + view);
                }
                c2528c.m4543j(iIndexOfChild);
                c1250j.m2733l(view);
                C1250j c1250j2 = recyclerView.f2064o;
                C2528c c2528c2 = (C2528c) c1250j2.f5231m;
                int iIndexOfChild2 = ((C2921w) c1250j2.f5230l).f10867a.indexOfChild(view);
                int iM4544k = (iIndexOfChild2 == -1 || c2528c2.m4546m(iIndexOfChild2)) ? -1 : iIndexOfChild2 - c2528c2.m4544k(iIndexOfChild2);
                if (iM4544k == -1) {
                    StringBuilder sb = new StringBuilder("layout index should not be -1 after unhiding a view:");
                    sb.append(abstractC2920v0M1144M2);
                    throw new IllegalStateException(AbstractC0008a1.m13i(recyclerView, sb));
                }
                recyclerView.f2064o.m2726e(iM4544k);
                m5039k(view);
                abstractC2920v0M1144M2.m5061a(8224);
                abstractC2920v0Mo1457e = abstractC2920v0M1144M2;
            }
            if (abstractC2920v0Mo1457e != null) {
                if (!abstractC2920v0Mo1457e.m5068h()) {
                    int i13 = abstractC2920v0Mo1457e.f10850c;
                    if (i13 < 0 || i13 >= recyclerView.f2078v.mo1455a()) {
                        StringBuilder sb2 = new StringBuilder("Inconsistency detected. Invalid view holder adapter position");
                        sb2.append(abstractC2920v0Mo1457e);
                        throw new IndexOutOfBoundsException(AbstractC0008a1.m13i(recyclerView, sb2));
                    }
                    if (!c2912r0.f10825g) {
                        recyclerView.f2078v.getClass();
                        if (abstractC2920v0Mo1457e.f10853f != 0) {
                            z12 = false;
                        } else {
                            AbstractC2923x abstractC2923x = recyclerView.f2078v;
                            if (!abstractC2923x.f10871b || abstractC2920v0Mo1457e.f10852e == abstractC2923x.mo1467b(abstractC2920v0Mo1457e.f10850c)) {
                                z12 = z8;
                            }
                        }
                    }
                } else {
                    if (RecyclerView.f2004I0 && !c2912r0.f10825g) {
                        throw new IllegalStateException(AbstractC0008a1.m13i(recyclerView, new StringBuilder("should not receive a removed view unless it is pre layout")));
                    }
                    z12 = c2912r0.f10825g;
                }
                if (z12) {
                    z7 = z8;
                } else {
                    abstractC2920v0Mo1457e.m5061a(4);
                    if (abstractC2920v0Mo1457e.m5069i()) {
                        recyclerView.removeDetachedView(abstractC2920v0Mo1457e.f10848a, false);
                        abstractC2920v0Mo1457e.f10861n.m5041m(abstractC2920v0Mo1457e);
                    } else if (abstractC2920v0Mo1457e.m5076p()) {
                        abstractC2920v0Mo1457e.f10857j &= -33;
                    }
                    m5038j(abstractC2920v0Mo1457e);
                    abstractC2920v0Mo1457e = null;
                }
            }
        } else {
            z8 = true;
        }
        if (abstractC2920v0Mo1457e == null) {
            int iM2698h2 = recyclerView.f2062n.m2698h(i, 0);
            if (iM2698h2 >= 0) {
                j8 = 3;
                if (iM2698h2 < recyclerView.f2078v.mo1455a()) {
                    recyclerView.f2078v.getClass();
                    AbstractC2923x abstractC2923x2 = recyclerView.f2078v;
                    if (abstractC2923x2.f10871b) {
                        long jMo1467b2 = abstractC2923x2.mo1467b(iM2698h2);
                        int size5 = arrayList2.size() - 1;
                        while (true) {
                            if (size5 >= 0) {
                                j9 = 4;
                                AbstractC2920v0 abstractC2920v05 = (AbstractC2920v0) arrayList2.get(size5);
                                i4 = iM2698h2;
                                long j10 = abstractC2920v05.f10852e;
                                View view2 = abstractC2920v05.f10848a;
                                if (j10 == jMo1467b2 && !abstractC2920v05.m5076p()) {
                                    if (abstractC2920v05.f10853f == 0) {
                                        abstractC2920v05.m5061a(32);
                                        if (abstractC2920v05.m5068h() && !c2912r0.f10825g) {
                                            abstractC2920v05.f10857j = (abstractC2920v05.f10857j & (-15)) | 2;
                                        }
                                        abstractC2920v0Mo1457e = abstractC2920v05;
                                    } else {
                                        arrayList2.remove(size5);
                                        recyclerView.removeDetachedView(view2, false);
                                        AbstractC2920v0 abstractC2920v0M1144M3 = RecyclerView.m1144M(view2);
                                        abstractC2920v0M1144M3.f10861n = null;
                                        abstractC2920v0M1144M3.f10862o = false;
                                        abstractC2920v0M1144M3.f10857j &= -33;
                                        m5038j(abstractC2920v0M1144M3);
                                    }
                                }
                                size5--;
                                iM2698h2 = i4;
                            } else {
                                i4 = iM2698h2;
                                j9 = 4;
                                int size6 = arrayList3.size() - 1;
                                while (true) {
                                    if (size6 < 0) {
                                        break;
                                    }
                                    AbstractC2920v0 abstractC2920v06 = (AbstractC2920v0) arrayList3.get(size6);
                                    if (abstractC2920v06.f10852e != jMo1467b2 || abstractC2920v06.m5064d()) {
                                        size6--;
                                    } else if (abstractC2920v06.f10853f == 0) {
                                        arrayList3.remove(size6);
                                        abstractC2920v0Mo1457e = abstractC2920v06;
                                    } else {
                                        m5036h(size6);
                                    }
                                }
                                abstractC2920v0Mo1457e = null;
                            }
                        }
                        if (abstractC2920v0Mo1457e != null) {
                            abstractC2920v0Mo1457e.f10850c = i4;
                            z7 = z8;
                        }
                    } else {
                        j9 = 4;
                    }
                    if (abstractC2920v0Mo1457e == null) {
                        if (RecyclerView.f2005J0) {
                            Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline(" + i + ") fetching from shared pool");
                        }
                        C2896j0 c2896j0 = (C2896j0) m5031c().f10747a.get(0);
                        if (c2896j0 != null) {
                            ArrayList arrayList5 = c2896j0.f10738a;
                            if (arrayList5.isEmpty()) {
                                abstractC2920v0 = null;
                                if (abstractC2920v0 != null) {
                                }
                                abstractC2920v0Mo1457e = abstractC2920v0;
                            } else {
                                for (int size7 = arrayList5.size() - 1; size7 >= 0; size7--) {
                                    if (!((AbstractC2920v0) arrayList5.get(size7)).m5064d()) {
                                        abstractC2920v0 = (AbstractC2920v0) arrayList5.remove(size7);
                                        break;
                                    }
                                }
                                abstractC2920v0 = null;
                                if (abstractC2920v0 != null) {
                                    abstractC2920v0.m5073m();
                                    boolean z13 = RecyclerView.f2004I0;
                                }
                                abstractC2920v0Mo1457e = abstractC2920v0;
                            }
                        }
                    }
                    if (abstractC2920v0Mo1457e == null) {
                        long nanoTime = recyclerView.getNanoTime();
                        if (j != Long.MAX_VALUE) {
                            long j11 = this.f10762g.m5025a(0).f10740c;
                            if (!((j11 == 0 || j11 + nanoTime < j) ? z8 : false)) {
                                return null;
                            }
                        }
                        AbstractC2923x abstractC2923x3 = recyclerView.f2078v;
                        abstractC2923x3.getClass();
                        try {
                            int i14 = AbstractC1221f.f5104a;
                            Trace.beginSection("RV CreateView");
                            abstractC2920v0Mo1457e = abstractC2923x3.mo1457e(recyclerView);
                            View view3 = abstractC2920v0Mo1457e.f10848a;
                            if (view3.getParent() != null) {
                                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            abstractC2920v0Mo1457e.f10853f = 0;
                            Trace.endSection();
                            if (RecyclerView.f2010O0 && (recyclerViewM1142G = RecyclerView.m1142G(view3)) != null) {
                                abstractC2920v0Mo1457e.f10849b = new WeakReference(recyclerViewM1142G);
                            }
                            long nanoTime2 = recyclerView.getNanoTime() - nanoTime;
                            C2896j0 c2896j0M5025a = this.f10762g.m5025a(0);
                            long j12 = c2896j0M5025a.f10740c;
                            if (j12 != 0) {
                                nanoTime2 = (nanoTime2 / j9) + ((j12 / j9) * 3);
                            }
                            c2896j0M5025a.f10740c = nanoTime2;
                            if (RecyclerView.f2005J0) {
                                Log.d("RecyclerView", "tryGetViewHolderForPositionByDeadline created new ViewHolder");
                            }
                        } finally {
                            int i15 = AbstractC1221f.f5104a;
                            Trace.endSection();
                        }
                    }
                }
            }
            StringBuilder sbM19o2 = AbstractC0008a1.m19o(i, iM2698h2, "Inconsistency detected. Invalid item position ", "(offset:", ").state:");
            sbM19o2.append(c2912r0.m5052b());
            sbM19o2.append(recyclerView.m1154B());
            throw new IndexOutOfBoundsException(sbM19o2.toString());
        }
        j8 = 3;
        j9 = 4;
        View view4 = abstractC2920v0Mo1457e.f10848a;
        if (z7 && !c2912r0.f10825g) {
            int i16 = abstractC2920v0Mo1457e.f10857j;
            if ((i16 & DecoderReuseEvaluation.DISCARD_REASON_AUDIO_SAMPLE_RATE_CHANGED) != 0 ? z8 : false) {
                abstractC2920v0Mo1457e.f10857j = i16 & (-8193);
                if (c2912r0.f10828j) {
                    AbstractC2876b0.m4971b(abstractC2920v0Mo1457e);
                    AbstractC2876b0 abstractC2876b0 = recyclerView.f2042U;
                    abstractC2920v0Mo1457e.m5063c();
                    abstractC2876b0.getClass();
                    C0228p c0228p = new C0228p();
                    c0228p.m657b(abstractC2920v0Mo1457e);
                    recyclerView.m1175Z(abstractC2920v0Mo1457e, c0228p);
                }
            }
        }
        if (!c2912r0.f10825g || !abstractC2920v0Mo1457e.m5065e()) {
            if (abstractC2920v0Mo1457e.m5065e()) {
                if (((abstractC2920v0Mo1457e.f10857j & 2) != 0 ? z8 : false) || abstractC2920v0Mo1457e.m5066f()) {
                }
                layoutParams = view4.getLayoutParams();
                if (layoutParams == null) {
                    c2890g0 = (C2890g0) recyclerView.generateDefaultLayoutParams();
                    view4.setLayoutParams(c2890g0);
                } else if (recyclerView.checkLayoutParams(layoutParams)) {
                    c2890g0 = (C2890g0) layoutParams;
                } else {
                    c2890g0 = (C2890g0) recyclerView.generateLayoutParams(layoutParams);
                    view4.setLayoutParams(c2890g0);
                }
                c2890g0.f10689a = abstractC2920v0Mo1457e;
                if (!z7 || !z11) {
                    z10 = false;
                }
                c2890g0.f10692d = z10;
                return abstractC2920v0Mo1457e;
            }
            if (RecyclerView.f2004I0 && abstractC2920v0Mo1457e.m5068h()) {
                StringBuilder sb3 = new StringBuilder("Removed holder should be bound and it should come here only in pre-layout. Holder: ");
                sb3.append(abstractC2920v0Mo1457e);
                throw new IllegalStateException(AbstractC0008a1.m13i(recyclerView, sb3));
            }
            int iM2698h3 = recyclerView.f2062n.m2698h(i, 0);
            abstractC2920v0Mo1457e.f10866s = null;
            abstractC2920v0Mo1457e.f10865r = recyclerView;
            int i17 = abstractC2920v0Mo1457e.f10853f;
            long nanoTime3 = recyclerView.getNanoTime();
            if (j != Long.MAX_VALUE) {
                long j13 = this.f10762g.m5025a(i17).f10741d;
                if (j13 == 0 || j13 + nanoTime3 < j) {
                    if (abstractC2920v0Mo1457e.m5070j()) {
                        recyclerView.attachViewToParent(view4, recyclerView.getChildCount(), view4.getLayoutParams());
                        z9 = z8;
                    } else {
                        z9 = false;
                    }
                    AbstractC2923x abstractC2923x4 = recyclerView.f2078v;
                    abstractC2923x4.getClass();
                    boolean z14 = abstractC2920v0Mo1457e.f10866s == null ? z8 : false;
                    if (z14) {
                        abstractC2920v0Mo1457e.f10850c = iM2698h3;
                        if (abstractC2923x4.f10871b) {
                            abstractC2920v0Mo1457e.f10852e = abstractC2923x4.mo1467b(iM2698h3);
                        }
                        abstractC2920v0Mo1457e.f10857j = (abstractC2920v0Mo1457e.f10857j & (-520)) | 1;
                        int i18 = AbstractC1221f.f5104a;
                        Trace.beginSection("RV OnBindView");
                    }
                    abstractC2920v0Mo1457e.f10866s = abstractC2923x4;
                    if (RecyclerView.f2004I0) {
                        if (view4.getParent() == null) {
                            WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                            if (view4.isAttachedToWindow() != abstractC2920v0Mo1457e.m5070j()) {
                                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + abstractC2920v0Mo1457e.m5070j() + ", attached to window: " + view4.isAttachedToWindow() + ", holder: " + abstractC2920v0Mo1457e);
                            }
                        }
                        if (view4.getParent() == null) {
                            WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
                            if (view4.isAttachedToWindow()) {
                                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + abstractC2920v0Mo1457e);
                            }
                        }
                    }
                    abstractC2920v0Mo1457e.m5063c();
                    abstractC2923x4.mo1456d(abstractC2920v0Mo1457e, iM2698h3);
                    if (z14) {
                        ArrayList arrayList6 = abstractC2920v0Mo1457e.f10858k;
                        if (arrayList6 != null) {
                            arrayList6.clear();
                        }
                        abstractC2920v0Mo1457e.f10857j &= -1025;
                        ViewGroup.LayoutParams layoutParams2 = view4.getLayoutParams();
                        if (layoutParams2 instanceof C2890g0) {
                            ((C2890g0) layoutParams2).f10691c = z8;
                        }
                    }
                    if (z9) {
                        recyclerView.detachViewFromParent(view4);
                    }
                    long nanoTime4 = recyclerView.getNanoTime() - nanoTime3;
                    C2896j0 c2896j0M5025a2 = this.f10762g.m5025a(abstractC2920v0Mo1457e.f10853f);
                    long j14 = c2896j0M5025a2.f10741d;
                    if (j14 != 0) {
                        nanoTime4 = (nanoTime4 / j9) + ((j14 / j9) * j8);
                    }
                    c2896j0M5025a2.f10741d = nanoTime4;
                    AccessibilityManager accessibilityManager = recyclerView.f2032K;
                    if (accessibilityManager != null && accessibilityManager.isEnabled()) {
                        WeakHashMap weakHashMap3 = AbstractC1828m0.f6911a;
                        z10 = true;
                        if (view4.getImportantForAccessibility() == 0) {
                            view4.setImportantForAccessibility(1);
                        }
                        C2924x0 c2924x0 = recyclerView.f2081w0;
                        if (c2924x0 != null) {
                            C2922w0 c2922w0 = c2924x0.f10874e;
                            if (c2922w0 != null) {
                                View.AccessibilityDelegate accessibilityDelegateM3599d = AbstractC1828m0.m3599d(view4);
                                C1794b c1794b = accessibilityDelegateM3599d == null ? null : accessibilityDelegateM3599d instanceof C1791a ? ((C1791a) accessibilityDelegateM3599d).f6843a : new C1794b(accessibilityDelegateM3599d);
                                if (c1794b != null && c1794b != c2922w0) {
                                    c2922w0.f10869e.put(view4, c1794b);
                                }
                            }
                            AbstractC1828m0.m3608m(view4, c2922w0);
                        }
                    } else {
                        z10 = true;
                    }
                    if (c2912r0.f10825g) {
                        abstractC2920v0Mo1457e.f10854g = i;
                    }
                    z11 = z10;
                } else {
                    z11 = false;
                    z10 = z8;
                }
            }
            layoutParams = view4.getLayoutParams();
            if (layoutParams == null) {
            }
            c2890g0.f10689a = abstractC2920v0Mo1457e;
            if (!z7) {
                z10 = false;
            }
            c2890g0.f10692d = z10;
            return abstractC2920v0Mo1457e;
        }
        abstractC2920v0Mo1457e.f10854g = i;
        z10 = z8;
        z11 = false;
        layoutParams = view4.getLayoutParams();
        if (layoutParams == null) {
        }
        c2890g0.f10689a = abstractC2920v0Mo1457e;
        if (!z7) {
        }
        c2890g0.f10692d = z10;
        return abstractC2920v0Mo1457e;
    }

    /* renamed from: m */
    public final void m5041m(AbstractC2920v0 abstractC2920v0) {
        if (abstractC2920v0.f10862o) {
            this.f10757b.remove(abstractC2920v0);
        } else {
            this.f10756a.remove(abstractC2920v0);
        }
        abstractC2920v0.f10861n = null;
        abstractC2920v0.f10862o = false;
        abstractC2920v0.f10857j &= -33;
    }

    /* renamed from: n */
    public final void m5042n() {
        AbstractC2888f0 abstractC2888f0 = this.f10763h.f2080w;
        this.f10761f = this.f10760e + (abstractC2888f0 != null ? abstractC2888f0.f10678j : 0);
        ArrayList arrayList = this.f10758c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f10761f; size--) {
            m5036h(size);
        }
    }
}
