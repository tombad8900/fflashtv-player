package p104m;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionBarContainer;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.b */
/* loaded from: classes.dex */
public final class C1700b extends Drawable {

    /* renamed from: a */
    public final ActionBarContainer f6507a;

    public C1700b(ActionBarContainer actionBarContainer) {
        this.f6507a = actionBarContainer;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ActionBarContainer actionBarContainer = this.f6507a;
        if (actionBarContainer.f646p) {
            Drawable drawable = actionBarContainer.f645o;
            if (drawable != null) {
                drawable.draw(canvas);
                return;
            }
            return;
        }
        Drawable drawable2 = actionBarContainer.f643m;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Drawable drawable3 = actionBarContainer.f644n;
        if (drawable3 == null || !actionBarContainer.f647q) {
            return;
        }
        drawable3.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        ActionBarContainer actionBarContainer = this.f6507a;
        if (actionBarContainer.f646p) {
            if (actionBarContainer.f645o != null) {
                actionBarContainer.f643m.getOutline(outline);
            }
        } else {
            Drawable drawable = actionBarContainer.f643m;
            if (drawable != null) {
                drawable.getOutline(outline);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
