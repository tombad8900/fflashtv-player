package p104m;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.media.session.AbstractC0120b;
import com.exotv.net.R;
import p095l.C1611b;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.j */
/* loaded from: classes.dex */
public final class C1732j extends C1785y implements InterfaceC1740l {

    /* renamed from: m */
    public final /* synthetic */ C1736k f6579m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1732j(C1736k c1736k, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f6579m = c1736k;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        AbstractC0120b.m400K(this, getContentDescription());
        setOnTouchListener(new C1611b(this, this));
    }

    @Override // p104m.InterfaceC1740l
    /* renamed from: a */
    public final boolean mo436a() {
        return false;
    }

    @Override // p104m.InterfaceC1740l
    /* renamed from: c */
    public final boolean mo438c() {
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f6579m.m3417l();
        return true;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i4, int i8, int i9) {
        boolean frame = super.setFrame(i, i4, i8, i9);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int iMax = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
        }
        return frame;
    }
}
