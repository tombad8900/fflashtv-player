package p032d3;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: d3.d0 */
/* loaded from: classes.dex */
public final class C0816d0 extends C0814c0 {
    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: G */
    public final float mo1578G(View view) {
        return view.getTransitionAlpha();
    }

    @Override // com.bumptech.glide.AbstractC0715d
    /* renamed from: l0 */
    public final void mo1598l0(View view, float f8) {
        view.setTransitionAlpha(f8);
    }

    @Override // p032d3.C0814c0, com.bumptech.glide.AbstractC0715d
    /* renamed from: m0 */
    public final void mo1599m0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p032d3.C0814c0
    /* renamed from: s0 */
    public final void mo1968s0(View view, int i, int i4, int i8, int i9) {
        view.setLeftTopRightBottom(i, i4, i8, i9);
    }

    @Override // p032d3.C0814c0
    /* renamed from: t0 */
    public final void mo1969t0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p032d3.C0814c0
    /* renamed from: u0 */
    public final void mo1970u0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
