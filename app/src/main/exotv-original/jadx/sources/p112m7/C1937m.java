package p112m7;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.m */
/* loaded from: classes.dex */
public final class C1937m {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7220e = AtomicReferenceFieldUpdater.newUpdater(C1937m.class, Object.class, "_next$volatile");

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f7221f = AtomicLongFieldUpdater.newUpdater(C1937m.class, "_state$volatile");

    /* renamed from: g */
    public static final C1943s f7222g = new C1943s("REMOVE_FROZEN", 0);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;

    /* renamed from: a */
    public final int f7223a;

    /* renamed from: b */
    public final boolean f7224b;

    /* renamed from: c */
    public final int f7225c;

    /* renamed from: d */
    public final /* synthetic */ AtomicReferenceArray f7226d;

    public C1937m(int i, boolean z7) {
        this.f7223a = i;
        this.f7224b = z7;
        int i4 = i - 1;
        this.f7225c = i4;
        this.f7226d = new AtomicReferenceArray(i);
        if (i4 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i4) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* renamed from: a */
    public final int m3786a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7221f;
            long j = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i4 = (int) ((1152921503533105152L & j) >> 30);
            int i8 = this.f7225c;
            if (((i4 + 2) & i8) == (i & i8)) {
                return 1;
            }
            boolean z7 = this.f7224b;
            AtomicReferenceArray atomicReferenceArray = this.f7226d;
            if (z7 || atomicReferenceArray.get(i4 & i8) == null) {
                if (f7221f.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((i4 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i4 & i8, obj);
                    C1937m c1937mM3788c = this;
                    while ((atomicLongFieldUpdater.get(c1937mM3788c) & 1152921504606846976L) != 0) {
                        c1937mM3788c = c1937mM3788c.m3788c();
                        AtomicReferenceArray atomicReferenceArray2 = c1937mM3788c.f7226d;
                        int i9 = c1937mM3788c.f7225c & i4;
                        Object obj2 = atomicReferenceArray2.get(i9);
                        if ((obj2 instanceof C1936l) && ((C1936l) obj2).f7219a == i4) {
                            atomicReferenceArray2.set(i9, obj);
                        } else {
                            c1937mM3788c = null;
                        }
                        if (c1937mM3788c == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i10 = this.f7223a;
                if (i10 < 1024 || ((i4 - i) & 1073741823) > (i10 >> 1)) {
                    return 1;
                }
            }
        }
    }

    /* renamed from: b */
    public final boolean m3787b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        do {
            atomicLongFieldUpdater = f7221f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, 2305843009213693952L | j));
        return true;
    }

    /* renamed from: c */
    public final C1937m m3788c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j;
        C1937m c1937m;
        while (true) {
            atomicLongFieldUpdater = f7221f;
            j = atomicLongFieldUpdater.get(this);
            if ((j & 1152921504606846976L) != 0) {
                c1937m = this;
                break;
            }
            long j8 = 1152921504606846976L | j;
            c1937m = this;
            if (atomicLongFieldUpdater.compareAndSet(c1937m, j, j8)) {
                j = j8;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7220e;
            C1937m c1937m2 = (C1937m) atomicReferenceFieldUpdater.get(this);
            if (c1937m2 != null) {
                return c1937m2;
            }
            C1937m c1937m3 = new C1937m(c1937m.f7223a * 2, c1937m.f7224b);
            int i = (int) (1073741823 & j);
            int i4 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i8 = c1937m.f7225c;
                int i9 = i & i8;
                if (i9 == (i8 & i4)) {
                    break;
                }
                Object c1936l = c1937m.f7226d.get(i9);
                if (c1936l == null) {
                    c1936l = new C1936l(i);
                }
                c1937m3.f7226d.set(c1937m3.f7225c & i, c1936l);
                i++;
            }
            atomicLongFieldUpdater.set(c1937m3, (-1152921504606846977L) & j);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c1937m3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        return null;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3789d() {
        C1937m c1937mM3788c = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f7221f;
            long j = atomicLongFieldUpdater.get(c1937mM3788c);
            if ((j & 1152921504606846976L) != 0) {
                return f7222g;
            }
            int i = (int) (j & 1073741823);
            int i4 = c1937mM3788c.f7225c;
            int i8 = i & i4;
            if ((((int) ((1152921503533105152L & j) >> 30)) & i4) == i8) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = c1937mM3788c.f7226d;
            Object obj = atomicReferenceArray.get(i8);
            boolean z7 = c1937mM3788c.f7224b;
            if (obj == null) {
                if (z7) {
                    break;
                }
            } else {
                if (obj instanceof C1936l) {
                    break;
                }
                long j8 = (i + 1) & 1073741823;
                if (f7221f.compareAndSet(c1937mM3788c, j, (j & (-1073741824)) | j8)) {
                    atomicReferenceArray.set(i8, null);
                    return obj;
                }
                c1937mM3788c = this;
                if (z7) {
                    while (true) {
                        long j9 = atomicLongFieldUpdater.get(c1937mM3788c);
                        int i9 = (int) (j9 & 1073741823);
                        if ((j9 & 1152921504606846976L) != 0) {
                            c1937mM3788c = c1937mM3788c.m3788c();
                        } else {
                            C1937m c1937m = c1937mM3788c;
                            if (f7221f.compareAndSet(c1937m, j9, (j9 & (-1073741824)) | j8)) {
                                c1937m.f7226d.set(i9 & c1937m.f7225c, null);
                                c1937mM3788c = null;
                            } else {
                                c1937mM3788c = c1937m;
                            }
                        }
                        if (c1937mM3788c == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
