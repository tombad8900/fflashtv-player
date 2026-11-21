package p152r4;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p144q4.C2270f;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: r4.b */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC2311b implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: j */
    public final /* synthetic */ int f8095j = 2;

    /* renamed from: k */
    public final Object f8096k;

    public ViewTreeObserverOnPreDrawListenerC2311b(C2312c c2312c) {
        this.f8096k = new WeakReference(c2312c);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() throws Throwable {
        switch (this.f8095j) {
            case 0:
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C2312c c2312c = (C2312c) ((WeakReference) this.f8096k).get();
                if (c2312c != null) {
                    ArrayList arrayList = c2312c.f8099b;
                    View view = c2312c.f8098a;
                    if (!arrayList.isEmpty()) {
                        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        int i = 0;
                        int iM4100a = c2312c.m4100a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        int iM4100a2 = c2312c.m4100a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                        if (iM4100a > 0 || iM4100a == Integer.MIN_VALUE) {
                            if (iM4100a2 > 0 || iM4100a2 == Integer.MIN_VALUE) {
                                ArrayList arrayList2 = new ArrayList(arrayList);
                                int size = arrayList2.size();
                                while (i < size) {
                                    Object obj = arrayList2.get(i);
                                    i++;
                                    ((C2270f) ((InterfaceC2313d) obj)).m4082l(iM4100a, iM4100a2);
                                }
                                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                                if (viewTreeObserver.isAlive()) {
                                    viewTreeObserver.removeOnPreDrawListener(c2312c.f8100c);
                                }
                                c2312c.f8100c = null;
                                arrayList.clear();
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                C2315f c2315f = (C2315f) ((WeakReference) this.f8096k).get();
                if (c2315f != null) {
                    ArrayList arrayList3 = c2315f.f8103b;
                    View view2 = c2315f.f8102a;
                    if (!arrayList3.isEmpty()) {
                        int paddingRight2 = view2.getPaddingRight() + view2.getPaddingLeft();
                        ViewGroup.LayoutParams layoutParams3 = view2.getLayoutParams();
                        int i4 = 0;
                        int iM4101a = c2315f.m4101a(view2.getWidth(), layoutParams3 != null ? layoutParams3.width : 0, paddingRight2);
                        int paddingBottom2 = view2.getPaddingBottom() + view2.getPaddingTop();
                        ViewGroup.LayoutParams layoutParams4 = view2.getLayoutParams();
                        int iM4101a2 = c2315f.m4101a(view2.getHeight(), layoutParams4 != null ? layoutParams4.height : 0, paddingBottom2);
                        if (iM4101a > 0 || iM4101a == Integer.MIN_VALUE) {
                            if (iM4101a2 > 0 || iM4101a2 == Integer.MIN_VALUE) {
                                ArrayList arrayList4 = new ArrayList(arrayList3);
                                int size2 = arrayList4.size();
                                while (i4 < size2) {
                                    Object obj2 = arrayList4.get(i4);
                                    i4++;
                                    ((C2270f) ((InterfaceC2313d) obj2)).m4082l(iM4101a, iM4101a2);
                                }
                                ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
                                if (viewTreeObserver2.isAlive()) {
                                    viewTreeObserver2.removeOnPreDrawListener(c2315f.f8104c);
                                }
                                c2315f.f8104c = null;
                                arrayList3.clear();
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                ((CoordinatorLayout) this.f8096k).m513p(0);
                break;
        }
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC2311b(C2315f c2315f) {
        this.f8096k = new WeakReference(c2315f);
    }

    public ViewTreeObserverOnPreDrawListenerC2311b(CoordinatorLayout coordinatorLayout) {
        this.f8096k = coordinatorLayout;
    }
}
