package p183v0;

import android.os.Build;
import com.google.android.material.datepicker.RunnableC0748f;
import java.util.ArrayList;
import p002a1.C0022h;
import p005a4.C0073c;
import p168t2.AbstractC2415i0;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: v0.d */
/* loaded from: classes.dex */
public final class C2504d extends AbstractC2415i0 {

    /* renamed from: a */
    public final /* synthetic */ C2505e f9134a;

    public C2504d(C2505e c2505e) {
        this.f9134a = c2505e;
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: u */
    public final void mo4287u(Throwable th) {
        this.f9134a.f9135a.m4525d(th);
    }

    @Override // p168t2.AbstractC2415i0
    /* renamed from: x */
    public final void mo4288x(C0022h c0022h) {
        C2505e c2505e = this.f9134a;
        c2505e.f9137c = c0022h;
        C0022h c0022h2 = c2505e.f9137c;
        C2510j c2510j = c2505e.f9135a;
        c2505e.f9136b = new C0073c(c0022h2, c2510j.f9149g, c2510j.f9151i, Build.VERSION.SDK_INT >= 34 ? AbstractC2514n.m4528a() : AbstractC2436a.m4332g());
        C2510j c2510j2 = c2505e.f9135a;
        c2510j2.getClass();
        ArrayList arrayList = new ArrayList();
        c2510j2.f9143a.writeLock().lock();
        try {
            c2510j2.f9145c = 1;
            arrayList.addAll(c2510j2.f9144b);
            c2510j2.f9144b.clear();
            c2510j2.f9143a.writeLock().unlock();
            c2510j2.f9146d.post(new RunnableC0748f(arrayList, c2510j2.f9145c, (Throwable) null));
        } catch (Throwable th) {
            c2510j2.f9143a.writeLock().unlock();
            throw th;
        }
    }
}
