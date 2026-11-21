package p071i1;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: i1.b */
/* loaded from: classes.dex */
public final class C1223b extends AbstractC1225d {

    /* renamed from: c */
    public final long f5109c;

    /* renamed from: d */
    public final ArrayList f5110d;

    /* renamed from: e */
    public final ArrayList f5111e;

    public C1223b(int i, long j) {
        super(i, 0);
        this.f5109c = j;
        this.f5110d = new ArrayList();
        this.f5111e = new ArrayList();
    }

    /* renamed from: g */
    public final C1223b m2672g(int i) {
        ArrayList arrayList = this.f5111e;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1223b c1223b = (C1223b) arrayList.get(i4);
            if (c1223b.f5114b == i) {
                return c1223b;
            }
        }
        return null;
    }

    /* renamed from: h */
    public final C1224c m2673h(int i) {
        ArrayList arrayList = this.f5110d;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1224c c1224c = (C1224c) arrayList.get(i4);
            if (c1224c.f5114b == i) {
                return c1224c;
            }
        }
        return null;
    }

    @Override // p071i1.AbstractC1225d
    public final String toString() {
        return AbstractC1225d.m2674a(this.f5114b) + " leaves: " + Arrays.toString(this.f5110d.toArray()) + " containers: " + Arrays.toString(this.f5111e.toArray());
    }
}
