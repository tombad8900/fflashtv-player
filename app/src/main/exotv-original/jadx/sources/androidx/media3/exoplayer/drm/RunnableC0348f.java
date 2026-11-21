package androidx.media3.exoplayer.drm;

import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.recyclerview.widget.RecyclerView;
import com.exotv.net.MainActivity;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import p063h1.C1124o;
import p063h1.InterfaceC1122m;
import p202x2.C2745a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: androidx.media3.exoplayer.drm.f */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0348f implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f1728j;

    /* renamed from: k */
    public final /* synthetic */ int f1729k;

    /* renamed from: l */
    public final /* synthetic */ Object f1730l;

    /* renamed from: m */
    public final /* synthetic */ Object f1731m;

    public /* synthetic */ RunnableC0348f(int i, RecyclerView recyclerView, MainActivity mainActivity) {
        this.f1728j = 2;
        this.f1729k = i;
        this.f1730l = recyclerView;
        this.f1731m = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1728j) {
            case 0:
                ((DrmSessionEventListener.EventDispatcher) this.f1730l).lambda$drmSessionAcquired$0((DrmSessionEventListener) this.f1731m, this.f1729k);
                break;
            case 1:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.f1730l;
                InterfaceC1122m interfaceC1122m = (InterfaceC1122m) this.f1731m;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    C1124o c1124o = (C1124o) it.next();
                    if (!c1124o.f4770d) {
                        int i = this.f1729k;
                        if (i != -1) {
                            c1124o.f4768b.m323a(i);
                        }
                        c1124o.f4769c = true;
                        interfaceC1122m.invoke(c1124o.f4767a);
                    }
                }
                break;
            case 2:
                MainActivity.m1675y(this.f1729k, 3, (RecyclerView) this.f1730l, (MainActivity) this.f1731m);
                break;
            default:
                C2745a c2745a = (C2745a) this.f1730l;
                c2745a.f10123b.mo3323j(this.f1729k, this.f1731m);
                break;
        }
    }

    public /* synthetic */ RunnableC0348f(DrmSessionEventListener.EventDispatcher eventDispatcher, DrmSessionEventListener drmSessionEventListener, int i) {
        this.f1728j = 0;
        this.f1730l = eventDispatcher;
        this.f1731m = drmSessionEventListener;
        this.f1729k = i;
    }

    public /* synthetic */ RunnableC0348f(Object obj, int i, Object obj2, int i4) {
        this.f1728j = i4;
        this.f1730l = obj;
        this.f1729k = i;
        this.f1731m = obj2;
    }
}
