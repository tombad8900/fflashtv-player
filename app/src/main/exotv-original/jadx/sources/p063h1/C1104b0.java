package p063h1;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h1.b0 */
/* loaded from: classes.dex */
public final class C1104b0 implements InterfaceC1120k {

    /* renamed from: b */
    public static final ArrayList f4714b = new ArrayList(50);

    /* renamed from: a */
    public final Handler f4715a;

    public C1104b0(Handler handler) {
        this.f4715a = handler;
    }

    /* renamed from: d */
    public static C1102a0 m2378d() {
        C1102a0 c1102a0;
        ArrayList arrayList = f4714b;
        synchronized (arrayList) {
            try {
                c1102a0 = arrayList.isEmpty() ? new C1102a0() : (C1102a0) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1102a0;
    }

    /* renamed from: a */
    public final C1102a0 m2379a(int i) {
        C1102a0 c1102a0M2378d = m2378d();
        c1102a0M2378d.f4712a = this.f4715a.obtainMessage(i);
        return c1102a0M2378d;
    }

    /* renamed from: b */
    public final C1102a0 m2380b(int i, int i4, int i8) {
        C1102a0 c1102a0M2378d = m2378d();
        c1102a0M2378d.f4712a = this.f4715a.obtainMessage(i, i4, i8);
        return c1102a0M2378d;
    }

    /* renamed from: c */
    public final C1102a0 m2381c(int i, Object obj) {
        C1102a0 c1102a0M2378d = m2378d();
        c1102a0M2378d.f4712a = this.f4715a.obtainMessage(i, obj);
        return c1102a0M2378d;
    }

    /* renamed from: e */
    public final boolean m2382e(Runnable runnable) {
        return this.f4715a.post(runnable);
    }

    /* renamed from: f */
    public final void m2383f(int i) {
        AbstractC1101a.m2353d(i != 0);
        this.f4715a.removeMessages(i);
    }

    /* renamed from: g */
    public final boolean m2384g(int i) {
        return this.f4715a.sendEmptyMessage(i);
    }
}
