package p112m7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p076i7.InterfaceC1288d1;
import p138p7.C2238j;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.r */
/* loaded from: classes.dex */
public abstract class AbstractC1942r extends AbstractC1926b implements InterfaceC1288d1 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7230d = AtomicIntegerFieldUpdater.newUpdater(AbstractC1942r.class, "cleanedAndPointers$volatile");

    /* renamed from: c */
    public final long f7231c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public AbstractC1942r(long j, C2238j c2238j, int i) {
        super(c2238j);
        this.f7231c = j;
        this.cleanedAndPointers$volatile = i << 16;
    }

    @Override // p112m7.AbstractC1926b
    /* renamed from: a */
    public final boolean mo3774a() {
        if (f7230d.get(this) != mo3794d()) {
            return false;
        }
        Object obj = AbstractC1926b.f7197a.get(this);
        return (obj == AbstractC1925a.f7190a ? null : (AbstractC1926b) obj) != null;
    }

    /* renamed from: c */
    public final boolean m3793c() {
        if (f7230d.addAndGet(this, -65536) != mo3794d()) {
            return false;
        }
        Object obj = AbstractC1926b.f7197a.get(this);
        return (obj == AbstractC1925a.f7190a ? null : (AbstractC1926b) obj) != null;
    }

    /* renamed from: d */
    public abstract int mo3794d();

    /* renamed from: e */
    public abstract void mo3795e(int i);

    /* renamed from: f */
    public final boolean m3796f() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f7230d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == mo3794d()) {
                Object obj = AbstractC1926b.f7197a.get(this);
                if ((obj == AbstractC1925a.f7190a ? null : (AbstractC1926b) obj) != null) {
                    return false;
                }
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}
