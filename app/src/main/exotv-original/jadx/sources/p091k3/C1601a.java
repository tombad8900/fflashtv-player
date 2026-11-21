package p091k3;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.support.v4.media.session.AbstractC0120b;
import com.bumptech.glide.AbstractC0715d;
import java.util.ArrayList;
import p002a1.AbstractC0008a1;
import p101l5.C1681a;
import p160s3.EnumC2356g;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: k3.a */
/* loaded from: classes.dex */
public final class C1601a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: j */
    public final EnumC2356g f6089j;

    /* renamed from: k */
    public final int f6090k;

    /* renamed from: l */
    public final boolean f6091l;

    /* renamed from: m */
    public final ArrayList f6092m = new ArrayList();

    /* renamed from: n */
    public final int f6093n;

    /* renamed from: o */
    public final int f6094o;

    /* renamed from: p */
    public long f6095p;

    /* renamed from: q */
    public int f6096q;

    /* renamed from: r */
    public int f6097r;

    /* renamed from: s */
    public Drawable f6098s;

    /* renamed from: t */
    public final Drawable f6099t;

    public C1601a(Drawable drawable, Drawable drawable2, EnumC2356g enumC2356g, int i, boolean z7) {
        this.f6089j = enumC2356g;
        this.f6090k = i;
        this.f6091l = z7;
        this.f6093n = m3266a(drawable != null ? Integer.valueOf(drawable.getIntrinsicWidth()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicWidth()) : null);
        this.f6094o = m3266a(drawable != null ? Integer.valueOf(drawable.getIntrinsicHeight()) : null, drawable2 != null ? Integer.valueOf(drawable2.getIntrinsicHeight()) : null);
        this.f6096q = 255;
        this.f6098s = drawable != null ? drawable.mutate() : null;
        Drawable drawableMutate = drawable2 != null ? drawable2.mutate() : null;
        this.f6099t = drawableMutate;
        if (i <= 0) {
            throw new IllegalArgumentException("durationMillis must be > 0.");
        }
        Drawable drawable3 = this.f6098s;
        if (drawable3 != null) {
            drawable3.setCallback(this);
        }
        if (drawableMutate != null) {
            drawableMutate.setCallback(this);
        }
    }

    /* renamed from: a */
    public final int m3266a(Integer num, Integer num2) {
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        return Math.max(num != null ? num.intValue() : -1, num2 != null ? num2.intValue() : -1);
    }

    /* renamed from: b */
    public final void m3267b() {
        this.f6097r = 2;
        this.f6098s = null;
        ArrayList arrayList = this.f6092m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ColorStateList colorStateList = ((C1681a) arrayList.get(i)).f6459b.f6482x;
            if (colorStateList != null) {
                setTintList(colorStateList);
            }
        }
    }

    /* renamed from: c */
    public final void m3268c(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            drawable.setBounds(rect);
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dM418n = AbstractC0120b.m418n(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f6089j);
        double d8 = 2;
        int iM1558e0 = AbstractC0715d.m1558e0((iWidth - (intrinsicWidth * dM418n)) / d8);
        int iM1558e02 = AbstractC0715d.m1558e0((iHeight - (dM418n * intrinsicHeight)) / d8);
        drawable.setBounds(rect.left + iM1558e0, rect.top + iM1558e02, rect.right - iM1558e0, rect.bottom - iM1558e02);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave;
        Drawable drawable;
        int i = this.f6097r;
        if (i == 0) {
            Drawable drawable2 = this.f6098s;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f6096q);
                iSave = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f6099t;
        if (i == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f6096q);
                iSave = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double dUptimeMillis = (SystemClock.uptimeMillis() - this.f6095p) / this.f6090k;
        double d8 = dUptimeMillis >= 0.0d ? dUptimeMillis > 1.0d ? 1.0d : dUptimeMillis : 0.0d;
        int i4 = this.f6096q;
        int i8 = (int) (d8 * i4);
        if (this.f6091l) {
            i4 -= i8;
        }
        boolean z7 = dUptimeMillis >= 1.0d;
        if (!z7 && (drawable = this.f6098s) != null) {
            drawable.setAlpha(i4);
            iSave = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i8);
            iSave = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z7) {
            m3267b();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f6096q;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i = this.f6097r;
        if (i == 0) {
            Drawable drawable = this.f6098s;
            if (drawable != null) {
                return drawable.getColorFilter();
            }
            return null;
        }
        Drawable drawable2 = this.f6099t;
        if (i != 1) {
            if (i == 2 && drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        if (drawable2 != null && (colorFilter = drawable2.getColorFilter()) != null) {
            return colorFilter;
        }
        Drawable drawable3 = this.f6098s;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6094o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6093n;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f6098s;
        int i = this.f6097r;
        if (i == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f6099t;
        if (i == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f6097r == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6098s;
        if (drawable != null) {
            m3268c(drawable, rect);
        }
        Drawable drawable2 = this.f6099t;
        if (drawable2 != null) {
            m3268c(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f6098s;
        boolean level = drawable != null ? drawable.setLevel(i) : false;
        Drawable drawable2 = this.f6099t;
        return level || (drawable2 != null ? drawable2.setLevel(i) : false);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f6098s;
        boolean state = drawable != null ? drawable.setState(iArr) : false;
        Drawable drawable2 = this.f6099t;
        return state || (drawable2 != null ? drawable2.setState(iArr) : false);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i < 0 || i >= 256) {
            throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Invalid alpha: ").toString());
        }
        this.f6096q = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6098s;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f6099t;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f6098s;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.f6099t;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f6098s;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f6099t;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6098s;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f6099t;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6098s;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f6099t;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Object obj = this.f6098s;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f6099t;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f6097r != 0) {
            return;
        }
        this.f6097r = 1;
        this.f6095p = SystemClock.uptimeMillis();
        ArrayList arrayList = this.f6092m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1681a) arrayList.get(i)).m3380a(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Object obj = this.f6098s;
        Animatable animatable = obj instanceof Animatable ? (Animatable) obj : null;
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f6099t;
        Animatable animatable2 = obj2 instanceof Animatable ? (Animatable) obj2 : null;
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f6097r != 2) {
            m3267b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
