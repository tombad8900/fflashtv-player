package p052f6;

import com.bumptech.glide.AbstractC0714c;
import java.util.AbstractMap;
import java.util.Objects;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: f6.m1 */
/* loaded from: classes.dex */
public final class C0984m1 extends AbstractC0983m0 {

    /* renamed from: l */
    public final /* synthetic */ C0987n1 f4216l;

    public C0984m1(C0987n1 c0987n1) {
        this.f4216l = c0987n1;
    }

    @Override // p052f6.AbstractC0968h0
    /* renamed from: f */
    public final boolean mo2155f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C0987n1 c0987n1 = this.f4216l;
        AbstractC0714c.m1527m(i, c0987n1.f4225o);
        Object[] objArr = c0987n1.f4224n;
        int i4 = i * 2;
        Object obj = objArr[i4];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i4 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4216l.f4225o;
    }
}
