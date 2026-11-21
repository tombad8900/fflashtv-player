package p131p0;

import java.util.ArrayList;
import p002a1.AbstractC0008a1;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: p0.a */
/* loaded from: classes.dex */
public final class C2194a {

    /* renamed from: a */
    public final ArrayList f7660a;

    /* renamed from: b */
    public final C2197d f7661b;

    /* renamed from: c */
    public int f7662c;

    /* renamed from: d */
    public boolean f7663d;

    public C2194a(C2197d c2197d, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        this.f7660a = arrayList2;
        if (arrayList.size() > 0) {
            throw AbstractC0008a1.m10f(0, arrayList);
        }
        if (arrayList.size() > 0) {
            throw AbstractC0008a1.m10f(0, arrayList);
        }
        ArrayList arrayList3 = c2197d.f7669b;
        if (!arrayList3.contains(this)) {
            arrayList3.add(this);
            int size = arrayList2.size() - 1;
            if (size >= 0) {
                throw AbstractC0008a1.m10f(size, arrayList2);
            }
            int size2 = arrayList2.size() - 1;
            if (size2 >= 0) {
                throw AbstractC0008a1.m10f(size2, arrayList2);
            }
        }
        this.f7661b = c2197d;
    }
}
