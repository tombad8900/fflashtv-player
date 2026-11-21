package p032d3;

import android.widget.FrameLayout;
import com.exotv.net.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.r */
/* loaded from: classes.dex */
public abstract class AbstractC0833r {

    /* renamed from: a */
    public static final C0809a f3711a;

    /* renamed from: b */
    public static final ThreadLocal f3712b;

    /* renamed from: c */
    public static final ArrayList f3713c;

    static {
        C0809a c0809a = new C0809a();
        c0809a.f3621J = new ArrayList();
        c0809a.f3624M = false;
        c0809a.f3625N = 0;
        c0809a.f3622K = false;
        c0809a.m1955H(new C0823h(2));
        c0809a.m1955H(new C0819f());
        c0809a.m1955H(new C0823h(1));
        f3711a = c0809a;
        f3712b = new ThreadLocal();
        f3713c = new ArrayList();
    }

    /* renamed from: a */
    public static void m2002a(FrameLayout frameLayout, AbstractC0829n abstractC0829n) {
        ArrayList arrayList = f3713c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC0829n == null) {
            abstractC0829n = f3711a;
        }
        AbstractC0829n abstractC0829nClone = abstractC0829n.clone();
        ArrayList arrayList2 = (ArrayList) m2003b().get(frameLayout);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((AbstractC0829n) obj).mo1961v(frameLayout);
            }
        }
        abstractC0829nClone.m1994g(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0832q viewTreeObserverOnPreDrawListenerC0832q = new ViewTreeObserverOnPreDrawListenerC0832q();
        viewTreeObserverOnPreDrawListenerC0832q.f3709j = abstractC0829nClone;
        viewTreeObserverOnPreDrawListenerC0832q.f3710k = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0832q);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0832q);
    }

    /* renamed from: b */
    public static C2186e m2003b() {
        C2186e c2186e;
        ThreadLocal threadLocal = f3712b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c2186e = (C2186e) weakReference.get()) != null) {
            return c2186e;
        }
        C2186e c2186e2 = new C2186e(0);
        threadLocal.set(new WeakReference(c2186e2));
        return c2186e2;
    }
}
