package p010b;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.RunnableC0127c0;
import java.util.concurrent.Executor;
import p062h.AbstractActivityC1083i;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.i */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnDrawListenerC0519i implements ViewTreeObserver.OnDrawListener, Runnable, Executor {

    /* renamed from: j */
    public final long f2124j = SystemClock.uptimeMillis() + 10000;

    /* renamed from: k */
    public Runnable f2125k;

    /* renamed from: l */
    public boolean f2126l;

    /* renamed from: m */
    public final /* synthetic */ AbstractActivityC1083i f2127m;

    public ViewTreeObserverOnDrawListenerC0519i(AbstractActivityC1083i abstractActivityC1083i) {
        this.f2127m = abstractActivityC1083i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        AbstractC2980h.m5136e("runnable", runnable);
        this.f2125k = runnable;
        View decorView = this.f2127m.getWindow().getDecorView();
        AbstractC2980h.m5135d("window.decorView", decorView);
        if (!this.f2126l) {
            decorView.postOnAnimation(new RunnableC0127c0(5, this));
        } else if (AbstractC2980h.m5132a(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z7;
        Runnable runnable = this.f2125k;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.f2124j) {
                this.f2126l = false;
                this.f2127m.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.f2125k = null;
        C0524n c0524n = (C0524n) this.f2127m.f2143p.getValue();
        synchronized (c0524n.f2158b) {
            z7 = c0524n.f2159c;
        }
        if (z7) {
            this.f2126l = false;
            this.f2127m.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f2127m.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
