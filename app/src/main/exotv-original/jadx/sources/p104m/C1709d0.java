package p104m;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.exotv.net.R;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.d0 */
/* loaded from: classes.dex */
public final class C1709d0 extends RatingBar {

    /* renamed from: j */
    public final C1701b0 f6525j;

    public C1709d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1707c2.m3388a(this, getContext());
        C1701b0 c1701b0 = new C1701b0(this);
        this.f6525j = c1701b0;
        c1701b0.mo3384b(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i4) {
        super.onMeasure(i, i4);
        Bitmap bitmap = (Bitmap) this.f6525j.f6511c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
