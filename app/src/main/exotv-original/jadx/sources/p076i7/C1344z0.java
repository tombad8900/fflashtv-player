package p076i7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i7.z0 */
/* loaded from: classes.dex */
public final class C1344z0 implements InterfaceC1323p0 {

    /* renamed from: k */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5393k = AtomicIntegerFieldUpdater.newUpdater(C1344z0.class, "_isCompleting$volatile");

    /* renamed from: l */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5394l = AtomicReferenceFieldUpdater.newUpdater(C1344z0.class, Object.class, "_rootCause$volatile");

    /* renamed from: m */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5395m = AtomicReferenceFieldUpdater.newUpdater(C1344z0.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* renamed from: j */
    public final C1282b1 f5396j;

    public C1344z0(C1282b1 c1282b1, Throwable th) {
        this.f5396j = c1282b1;
        this._rootCause$volatile = th;
    }

    /* renamed from: a */
    public final void m2860a(Throwable th) {
        Throwable thM2861c = m2861c();
        if (thM2861c == null) {
            f5394l.set(this, th);
            return;
        }
        if (th == thM2861c) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5395m;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // p076i7.InterfaceC1323p0
    /* renamed from: b */
    public final C1282b1 mo2779b() {
        return this.f5396j;
    }

    /* renamed from: c */
    public final Throwable m2861c() {
        return (Throwable) f5394l.get(this);
    }

    /* renamed from: d */
    public final boolean m2862d() {
        return m2861c() != null;
    }

    /* renamed from: e */
    public final ArrayList m2863e(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5395m;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM2861c = m2861c();
        if (thM2861c != null) {
            arrayList.add(0, thM2861c);
        }
        if (th != null && !th.equals(thM2861c)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC1339x.f5382h);
        return arrayList;
    }

    @Override // p076i7.InterfaceC1323p0
    public final boolean isActive() {
        return m2861c() == null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m2862d());
        sb.append(", completing=");
        sb.append(f5393k.get(this) != 0);
        sb.append(", rootCause=");
        sb.append(m2861c());
        sb.append(", exceptions=");
        sb.append(f5395m.get(this));
        sb.append(", list=");
        sb.append(this.f5396j);
        sb.append(']');
        return sb.toString();
    }
}
