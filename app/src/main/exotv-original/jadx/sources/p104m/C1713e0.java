package p104m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.exotv.net.R;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.e0 */
/* loaded from: classes.dex */
public final class C1713e0 extends SeekBar {

    /* renamed from: j */
    public final C1717f0 f6530j;

    public C1713e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1707c2.m3388a(this, getContext());
        C1717f0 c1717f0 = new C1717f0(this);
        this.f6530j = c1717f0;
        c1717f0.mo3384b(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1717f0 c1717f0 = this.f6530j;
        C1713e0 c1713e0 = c1717f0.f6535e;
        Drawable drawable = c1717f0.f6536f;
        if (drawable != null && drawable.isStateful() && drawable.setState(c1713e0.getDrawableState())) {
            c1713e0.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f6530j.f6536f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f6530j.m3395g(canvas);
    }
}
