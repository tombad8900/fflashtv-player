package p105m0;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import p119n6.C2026f;
import p189v7.C2556a0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m0.b0 */
/* loaded from: classes.dex */
public abstract class AbstractC1795b0 {

    /* renamed from: j */
    public int f6852j;

    /* renamed from: k */
    public int f6853k;

    /* renamed from: l */
    public int f6854l;

    /* renamed from: m */
    public Object f6855m;

    public AbstractC1795b0() {
        if (C2556a0.f9269k == null) {
            C2556a0.f9269k = new C2556a0(1);
        }
    }

    /* renamed from: a */
    public int m3506a(int i) {
        if (i < this.f6854l) {
            return ((ByteBuffer) this.f6855m).getShort(this.f6853k + i);
        }
        return 0;
    }

    /* renamed from: b */
    public void m3507b() {
        if (((C2026f) this.f6855m).f7479q != this.f6854l) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: c */
    public abstract Object mo3508c(View view);

    /* renamed from: d */
    public abstract void mo3509d(View view, Object obj);

    /* renamed from: e */
    public void m3510e() {
        while (true) {
            int i = this.f6852j;
            C2026f c2026f = (C2026f) this.f6855m;
            if (i >= c2026f.f7477o || c2026f.f7474l[i] >= 0) {
                return;
            } else {
                this.f6852j = i + 1;
            }
        }
    }

    /* renamed from: f */
    public void m3511f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f6853k) {
            mo3509d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f6853k) {
            tag = mo3508c(view);
        } else {
            tag = view.getTag(this.f6852j);
            if (!((Class) this.f6855m).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo3512g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateM3599d = AbstractC1828m0.m3599d(view);
            C1794b c1794b = accessibilityDelegateM3599d == null ? null : accessibilityDelegateM3599d instanceof C1791a ? ((C1791a) accessibilityDelegateM3599d).f6843a : new C1794b(accessibilityDelegateM3599d);
            if (c1794b == null) {
                c1794b = new C1794b();
            }
            AbstractC1828m0.m3608m(view, c1794b);
            view.setTag(this.f6852j, obj);
            AbstractC1828m0.m3603h(view, this.f6854l);
        }
    }

    /* renamed from: g */
    public abstract boolean mo3512g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f6852j < ((C2026f) this.f6855m).f7477o;
    }

    public void remove() {
        C2026f c2026f = (C2026f) this.f6855m;
        m3507b();
        if (this.f6853k == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        c2026f.m3911b();
        c2026f.m3920k(this.f6853k);
        this.f6853k = -1;
        this.f6854l = c2026f.f7479q;
    }
}
