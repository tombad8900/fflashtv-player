package p062h;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;
import com.bumptech.glide.AbstractC0715d;
import p087k.C1538c;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: h.v */
/* loaded from: classes.dex */
public final class C1096v extends ContentFrameLayout {

    /* renamed from: r */
    public final /* synthetic */ LayoutInflaterFactory2C1098x f4637r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096v(LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x, C1538c c1538c) {
        super(c1538c, null);
        this.f4637r = layoutInflaterFactory2C1098x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f4637r.m2336t(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x6 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            if (x6 < -5 || y4 < -5 || x6 > getWidth() + 5 || y4 > getHeight() + 5) {
                LayoutInflaterFactory2C1098x layoutInflaterFactory2C1098x = this.f4637r;
                layoutInflaterFactory2C1098x.m2335r(layoutInflaterFactory2C1098x.m2341y(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(AbstractC0715d.m1542D(getContext(), i));
    }
}
