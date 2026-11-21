package p112m7;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p076i7.AbstractRunnableC1305j0;
import p076i7.C1308k0;
import p220z6.AbstractC2980h;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.u */
/* loaded from: classes.dex */
public class C1945u {

    /* renamed from: b */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7235b = AtomicIntegerFieldUpdater.newUpdater(C1945u.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;

    /* renamed from: a */
    public AbstractRunnableC1305j0[] f7236a;

    /* renamed from: a */
    public final void m3800a(AbstractRunnableC1305j0 abstractRunnableC1305j0) {
        abstractRunnableC1305j0.m2821d((C1308k0) this);
        AbstractRunnableC1305j0[] abstractRunnableC1305j0Arr = this.f7236a;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7235b;
        if (abstractRunnableC1305j0Arr == null) {
            abstractRunnableC1305j0Arr = new AbstractRunnableC1305j0[4];
            this.f7236a = abstractRunnableC1305j0Arr;
        } else if (atomicIntegerFieldUpdater.get(this) >= abstractRunnableC1305j0Arr.length) {
            Object[] objArrCopyOf = Arrays.copyOf(abstractRunnableC1305j0Arr, atomicIntegerFieldUpdater.get(this) * 2);
            AbstractC2980h.m5135d("copyOf(...)", objArrCopyOf);
            abstractRunnableC1305j0Arr = (AbstractRunnableC1305j0[]) objArrCopyOf;
            this.f7236a = abstractRunnableC1305j0Arr;
        }
        int i = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i + 1);
        abstractRunnableC1305j0Arr[i] = abstractRunnableC1305j0;
        abstractRunnableC1305j0.f5336k = i;
        m3802c(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractRunnableC1305j0 m3801b(int i) {
        Object[] objArr = this.f7236a;
        AbstractC2980h.m5133b(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7235b;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i < atomicIntegerFieldUpdater.get(this)) {
            m3803d(i, atomicIntegerFieldUpdater.get(this));
            int i4 = (i - 1) / 2;
            if (i > 0) {
                AbstractRunnableC1305j0 abstractRunnableC1305j0 = objArr[i];
                AbstractC2980h.m5133b(abstractRunnableC1305j0);
                Object obj = objArr[i4];
                AbstractC2980h.m5133b(obj);
                if (abstractRunnableC1305j0.compareTo(obj) < 0) {
                    m3803d(i, i4);
                    m3802c(i4);
                } else {
                    while (true) {
                        int i8 = i * 2;
                        int i9 = i8 + 1;
                        if (i9 >= atomicIntegerFieldUpdater.get(this)) {
                            break;
                        }
                        Object[] objArr2 = this.f7236a;
                        AbstractC2980h.m5133b(objArr2);
                        int i10 = i8 + 2;
                        if (i10 < atomicIntegerFieldUpdater.get(this)) {
                            Comparable comparable = objArr2[i10];
                            AbstractC2980h.m5133b(comparable);
                            Object obj2 = objArr2[i9];
                            AbstractC2980h.m5133b(obj2);
                            if (comparable.compareTo(obj2) >= 0) {
                                i10 = i9;
                            }
                            Comparable comparable2 = objArr2[i];
                            AbstractC2980h.m5133b(comparable2);
                            Comparable comparable3 = objArr2[i10];
                            AbstractC2980h.m5133b(comparable3);
                            if (comparable2.compareTo(comparable3) <= 0) {
                                break;
                            }
                            m3803d(i, i10);
                            i = i10;
                        }
                    }
                }
            }
        }
        AbstractRunnableC1305j0 abstractRunnableC1305j02 = objArr[atomicIntegerFieldUpdater.get(this)];
        AbstractC2980h.m5133b(abstractRunnableC1305j02);
        abstractRunnableC1305j02.m2821d(null);
        abstractRunnableC1305j02.f5336k = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return abstractRunnableC1305j02;
    }

    /* renamed from: c */
    public final void m3802c(int i) {
        while (i > 0) {
            AbstractRunnableC1305j0[] abstractRunnableC1305j0Arr = this.f7236a;
            AbstractC2980h.m5133b(abstractRunnableC1305j0Arr);
            int i4 = (i - 1) / 2;
            AbstractRunnableC1305j0 abstractRunnableC1305j0 = abstractRunnableC1305j0Arr[i4];
            AbstractC2980h.m5133b(abstractRunnableC1305j0);
            AbstractRunnableC1305j0 abstractRunnableC1305j02 = abstractRunnableC1305j0Arr[i];
            AbstractC2980h.m5133b(abstractRunnableC1305j02);
            if (abstractRunnableC1305j0.compareTo(abstractRunnableC1305j02) <= 0) {
                return;
            }
            m3803d(i, i4);
            i = i4;
        }
    }

    /* renamed from: d */
    public final void m3803d(int i, int i4) {
        AbstractRunnableC1305j0[] abstractRunnableC1305j0Arr = this.f7236a;
        AbstractC2980h.m5133b(abstractRunnableC1305j0Arr);
        AbstractRunnableC1305j0 abstractRunnableC1305j0 = abstractRunnableC1305j0Arr[i4];
        AbstractC2980h.m5133b(abstractRunnableC1305j0);
        AbstractRunnableC1305j0 abstractRunnableC1305j02 = abstractRunnableC1305j0Arr[i];
        AbstractC2980h.m5133b(abstractRunnableC1305j02);
        abstractRunnableC1305j0Arr[i] = abstractRunnableC1305j0;
        abstractRunnableC1305j0Arr[i4] = abstractRunnableC1305j02;
        abstractRunnableC1305j0.f5336k = i;
        abstractRunnableC1305j02.f5336k = i4;
    }
}
