package p216z2;

import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.v */
/* loaded from: classes.dex */
public final class RunnableC2919v implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f10845j;

    /* renamed from: k */
    public final /* synthetic */ RecyclerView f10846k;

    public /* synthetic */ RunnableC2919v(RecyclerView recyclerView, int i) {
        this.f10845j = i;
        this.f10846k = recyclerView;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011c  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z7;
        int i = this.f10845j;
        RecyclerView recyclerView = this.f10846k;
        switch (i) {
            case 0:
                if (recyclerView.f2020D && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.f2016B) {
                        recyclerView.requestLayout();
                        break;
                    } else if (!recyclerView.f2026G) {
                        recyclerView.m1194p();
                        break;
                    } else {
                        recyclerView.f2024F = true;
                        break;
                    }
                }
                break;
            default:
                AbstractC2876b0 abstractC2876b0 = recyclerView.f2042U;
                if (abstractC2876b0 != null) {
                    C2891h c2891h = (C2891h) abstractC2876b0;
                    long j = c2891h.f10619d;
                    ArrayList arrayList = c2891h.f10695h;
                    boolean zIsEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c2891h.f10697j;
                    boolean zIsEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c2891h.f10698k;
                    boolean zIsEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c2891h.f10696i;
                    boolean zIsEmpty4 = arrayList4.isEmpty();
                    if (!zIsEmpty || !zIsEmpty2 || !zIsEmpty4 || !zIsEmpty3) {
                        int size = arrayList.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj = arrayList.get(i4);
                            int i8 = i4 + 1;
                            AbstractC2920v0 abstractC2920v0 = (AbstractC2920v0) obj;
                            View view = abstractC2920v0.f10848a;
                            ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                            c2891h.f10704q.add(abstractC2920v0);
                            viewPropertyAnimatorAnimate.setDuration(j).alpha(0.0f).setListener(new C2878c(c2891h, abstractC2920v0, viewPropertyAnimatorAnimate, view)).start();
                            i4 = i8;
                            arrayList = arrayList;
                            zIsEmpty = zIsEmpty;
                        }
                        boolean z8 = zIsEmpty;
                        arrayList.clear();
                        if (!zIsEmpty2) {
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.addAll(arrayList2);
                            c2891h.f10700m.add(arrayList5);
                            arrayList2.clear();
                            RunnableC2875b runnableC2875b = new RunnableC2875b(c2891h, arrayList5, 0);
                            if (z8) {
                                runnableC2875b.run();
                            } else {
                                View view2 = ((C2889g) arrayList5.get(0)).f10684a.f10848a;
                                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                                view2.postOnAnimationDelayed(runnableC2875b, j);
                            }
                        }
                        if (!zIsEmpty3) {
                            ArrayList arrayList6 = new ArrayList();
                            arrayList6.addAll(arrayList3);
                            c2891h.f10701n.add(arrayList6);
                            arrayList3.clear();
                            RunnableC2875b runnableC2875b2 = new RunnableC2875b(c2891h, arrayList6, 1);
                            if (z8) {
                                runnableC2875b2.run();
                            } else {
                                View view3 = ((C2887f) arrayList6.get(0)).f10663a.f10848a;
                                WeakHashMap weakHashMap2 = AbstractC1828m0.f6911a;
                                view3.postOnAnimationDelayed(runnableC2875b2, j);
                            }
                        }
                        if (zIsEmpty4) {
                            z7 = false;
                        } else {
                            ArrayList arrayList7 = new ArrayList();
                            arrayList7.addAll(arrayList4);
                            c2891h.f10699l.add(arrayList7);
                            arrayList4.clear();
                            RunnableC2875b runnableC2875b3 = new RunnableC2875b(c2891h, arrayList7, 2);
                            if (z8 && zIsEmpty2 && zIsEmpty3) {
                                runnableC2875b3.run();
                                z7 = false;
                            } else {
                                if (z8) {
                                    j = 0;
                                }
                                long jMax = Math.max(!zIsEmpty2 ? c2891h.f10620e : 0L, zIsEmpty3 ? 0L : c2891h.f10621f) + j;
                                z7 = false;
                                View view4 = ((AbstractC2920v0) arrayList7.get(0)).f10848a;
                                WeakHashMap weakHashMap3 = AbstractC1828m0.f6911a;
                                view4.postOnAnimationDelayed(runnableC2875b3, jMax);
                            }
                        }
                    }
                }
                recyclerView.f2079v0 = z7;
                break;
        }
    }
}
