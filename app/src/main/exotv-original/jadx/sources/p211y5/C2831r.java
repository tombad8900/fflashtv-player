package p211y5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import p205x5.C2782a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: y5.r */
/* loaded from: classes.dex */
public final class C2831r extends AbstractC2837x {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f10546c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f10547d;

    public C2831r(ArrayList arrayList, Matrix matrix) {
        this.f10546c = arrayList;
        this.f10547d = matrix;
    }

    @Override // p211y5.AbstractC2837x
    /* renamed from: a */
    public final void mo4960a(Matrix matrix, C2782a c2782a, int i, Canvas canvas) {
        ArrayList arrayList = this.f10546c;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ((AbstractC2837x) obj).mo4960a(this.f10547d, c2782a, i, canvas);
        }
    }
}
