package p032d3;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.z */
/* loaded from: classes.dex */
public abstract class AbstractC0841z {
    /* renamed from: a */
    public static void m2011a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: b */
    public static void m2012b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: c */
    public static void m2013c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
