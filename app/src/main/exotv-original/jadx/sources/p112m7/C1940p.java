package p112m7;

import java.util.concurrent.atomic.AtomicReferenceArray;
import p127o7.C2050a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m7.p */
/* loaded from: classes.dex */
public final class C1940p {
    private volatile AtomicReferenceArray<Object> array;

    public C1940p(int i) {
        this.array = new AtomicReferenceArray<>(i);
    }

    /* renamed from: a */
    public final int m3790a() {
        return this.array.length();
    }

    /* renamed from: b */
    public final Object m3791b(int i) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        if (i < atomicReferenceArray.length()) {
            return atomicReferenceArray.get(i);
        }
        return null;
    }

    /* renamed from: c */
    public final void m3792c(int i, C2050a c2050a) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.array;
        int length = atomicReferenceArray.length();
        if (i < length) {
            atomicReferenceArray.set(i, c2050a);
            return;
        }
        int i4 = i + 1;
        int i8 = length * 2;
        if (i4 < i8) {
            i4 = i8;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(i4);
        for (int i9 = 0; i9 < length; i9++) {
            atomicReferenceArray2.set(i9, atomicReferenceArray.get(i9));
        }
        atomicReferenceArray2.set(i, c2050a);
        this.array = atomicReferenceArray2;
    }
}
