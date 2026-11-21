package p010b;

import p062h.AbstractActivityC1083i;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0514d implements Runnable {

    /* renamed from: j */
    public final /* synthetic */ int f2116j;

    /* renamed from: k */
    public final /* synthetic */ AbstractActivityC1083i f2117k;

    public /* synthetic */ RunnableC0514d(AbstractActivityC1083i abstractActivityC1083i, int i) {
        this.f2116j = i;
        this.f2117k = abstractActivityC1083i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2116j) {
            case 0:
                this.f2117k.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e) {
                    if (!AbstractC2980h.m5132a(e.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e;
                    }
                    return;
                } catch (NullPointerException e8) {
                    if (!AbstractC2980h.m5132a(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e8;
                    }
                    return;
                }
        }
    }
}
