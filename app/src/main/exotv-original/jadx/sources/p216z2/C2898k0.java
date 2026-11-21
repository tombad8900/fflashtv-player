package p216z2;

import android.util.SparseArray;
import java.util.Set;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.k0 */
/* loaded from: classes.dex */
public final class C2898k0 {

    /* renamed from: a */
    public SparseArray f10747a;

    /* renamed from: b */
    public int f10748b;

    /* renamed from: c */
    public Set f10749c;

    /* renamed from: a */
    public final C2896j0 m5025a(int i) {
        SparseArray sparseArray = this.f10747a;
        C2896j0 c2896j0 = (C2896j0) sparseArray.get(i);
        if (c2896j0 != null) {
            return c2896j0;
        }
        C2896j0 c2896j02 = new C2896j0();
        sparseArray.put(i, c2896j02);
        return c2896j02;
    }
}
