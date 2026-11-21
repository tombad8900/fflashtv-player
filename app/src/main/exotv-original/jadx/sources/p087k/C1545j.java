package p087k;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import p105m0.C1843r0;
import p105m0.InterfaceC1846s0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k.j */
/* loaded from: classes.dex */
public final class C1545j {

    /* renamed from: c */
    public Interpolator f5919c;

    /* renamed from: d */
    public InterfaceC1846s0 f5920d;

    /* renamed from: e */
    public boolean f5921e;

    /* renamed from: b */
    public long f5918b = -1;

    /* renamed from: f */
    public final C1544i f5922f = new C1544i(this);

    /* renamed from: a */
    public final ArrayList f5917a = new ArrayList();

    /* renamed from: a */
    public final void m3222a() {
        if (this.f5921e) {
            ArrayList arrayList = this.f5917a;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((C1843r0) obj).m3616b();
            }
            this.f5921e = false;
        }
    }

    /* renamed from: b */
    public final void m3223b() {
        View view;
        if (this.f5921e) {
            return;
        }
        ArrayList arrayList = this.f5917a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            C1843r0 c1843r0 = (C1843r0) obj;
            long j = this.f5918b;
            if (j >= 0) {
                c1843r0.m3617c(j);
            }
            Interpolator interpolator = this.f5919c;
            if (interpolator != null && (view = (View) c1843r0.f6932a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f5920d != null) {
                c1843r0.m3618d(this.f5922f);
            }
            View view2 = (View) c1843r0.f6932a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f5921e = true;
    }
}
