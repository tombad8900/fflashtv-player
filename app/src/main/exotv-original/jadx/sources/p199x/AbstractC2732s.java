package p199x;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p174u.C2445g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.s */
/* loaded from: classes.dex */
public abstract class AbstractC2732s extends AbstractC2716c {

    /* renamed from: q */
    public boolean f10098q;

    /* renamed from: r */
    public boolean f10099r;

    @Override // p199x.AbstractC2716c
    /* renamed from: e */
    public final void mo4780e(ConstraintLayout constraintLayout) {
        m4779d(constraintLayout);
    }

    @Override // p199x.AbstractC2716c
    /* renamed from: g */
    public void mo4782g(AttributeSet attributeSet) {
        super.mo4782g(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2730q.f10089b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f10098q = true;
                } else if (index == 22) {
                    this.f10099r = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public abstract void mo495j(C2445g c2445g, int i, int i4);

    @Override // p199x.AbstractC2716c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10098q || this.f10099r) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f9880k; i++) {
                    View view = (View) constraintLayout.f785j.get(this.f9879j[i]);
                    if (view != null) {
                        if (this.f10098q) {
                            view.setVisibility(visibility);
                        }
                        if (this.f10099r && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f8) {
        super.setElevation(f8);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m4779d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m4779d((ConstraintLayout) parent);
    }
}
