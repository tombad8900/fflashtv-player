package p105m0;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.lifecycle.AbstractC0150o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p002a1.C0016e;
import p037e0.C0851b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.y0 */
/* loaded from: classes.dex */
public final class C1863y0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a */
    public final AbstractC0150o f6962a;

    /* renamed from: b */
    public List f6963b;

    /* renamed from: c */
    public ArrayList f6964c;

    /* renamed from: d */
    public final HashMap f6965d;

    public C1863y0(AbstractC0150o abstractC0150o) {
        super(0);
        this.f6965d = new HashMap();
        this.f6962a = abstractC0150o;
    }

    /* renamed from: a */
    public final C1796b1 m3653a(WindowInsetsAnimation windowInsetsAnimation) {
        C1796b1 c1796b1 = (C1796b1) this.f6965d.get(windowInsetsAnimation);
        if (c1796b1 == null) {
            c1796b1 = new C1796b1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c1796b1.f6856a = new C1865z0(windowInsetsAnimation);
            }
            this.f6965d.put(windowInsetsAnimation, c1796b1);
        }
        return c1796b1;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f6962a.mo571d(m3653a(windowInsetsAnimation));
        this.f6965d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f6962a.mo572e(m3653a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f6964c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f6964c = arrayList2;
            this.f6963b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            C1796b1 c1796b1M3653a = m3653a(windowInsetsAnimation);
            c1796b1M3653a.f6856a.mo3500e(windowInsetsAnimation.getFraction());
            this.f6964c.add(c1796b1M3653a);
        }
        return this.f6962a.mo573f(C1844r1.m3621g(null, windowInsets), this.f6963b).m3626f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0016e c0016eMo574h = this.f6962a.mo574h(m3653a(windowInsetsAnimation), new C0016e(bounds));
        c0016eMo574h.getClass();
        AbstractC1861x0.m3652c();
        return AbstractC1861x0.m3650a(((C0851b) c0016eMo574h.f62k).m2024e(), ((C0851b) c0016eMo574h.f63l).m2024e());
    }
}
