package p096l0;

import p156s.C2329b;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l0.c */
/* loaded from: classes.dex */
public class C1643c implements InterfaceC1642b {

    /* renamed from: j */
    public final Object[] f6282j;

    /* renamed from: k */
    public int f6283k;

    public C1643c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f6282j = new Object[i];
    }

    /* renamed from: a */
    public void m3342a(C2329b c2329b) {
        int i = this.f6283k;
        Object[] objArr = this.f6282j;
        if (i < objArr.length) {
            objArr[i] = c2329b;
            this.f6283k = i + 1;
        }
    }

    @Override // p096l0.InterfaceC1642b
    public Object acquire() {
        int i = this.f6283k;
        if (i <= 0) {
            return null;
        }
        int i4 = i - 1;
        Object[] objArr = this.f6282j;
        Object obj = objArr[i4];
        AbstractC2980h.m5134c("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
        objArr[i4] = null;
        this.f6283k--;
        return obj;
    }

    @Override // p096l0.InterfaceC1642b
    /* renamed from: g */
    public boolean mo285g(Object obj) {
        Object[] objArr;
        boolean z7;
        AbstractC2980h.m5136e("instance", obj);
        int i = this.f6283k;
        int i4 = 0;
        while (true) {
            objArr = this.f6282j;
            if (i4 >= i) {
                z7 = false;
                break;
            }
            if (objArr[i4] == obj) {
                z7 = true;
                break;
            }
            i4++;
        }
        if (z7) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i8 = this.f6283k;
        if (i8 >= objArr.length) {
            return false;
        }
        objArr[i8] = obj;
        this.f6283k = i8 + 1;
        return true;
    }

    public C1643c() {
        this.f6282j = new Object[256];
    }
}
