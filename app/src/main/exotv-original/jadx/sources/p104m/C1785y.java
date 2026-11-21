package p104m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.bumptech.glide.AbstractC0715d;
import p005a4.C0094o;
import p071i1.C1240s;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.y */
/* loaded from: classes.dex */
public class C1785y extends ImageView {

    /* renamed from: j */
    public final C1240s f6807j;

    /* renamed from: k */
    public final C0094o f6808k;

    /* renamed from: l */
    public boolean f6809l;

    public C1785y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6809l = false;
        AbstractC1707c2.m3388a(this, getContext());
        C1240s c1240s = new C1240s(this);
        this.f6807j = c1240s;
        c1240s.m2703m(attributeSet, i);
        C0094o c0094o = new C0094o(this);
        this.f6808k = c0094o;
        c0094o.m350f(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1240s c1240s = this.f6807j;
        if (c1240s != null) {
            c1240s.m2692b();
        }
        C0094o c0094o = this.f6808k;
        if (c0094o != null) {
            c0094o.m347b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1240s c1240s = this.f6807j;
        if (c1240s != null) {
            return c1240s.m2700j();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1240s c1240s = this.f6807j;
        if (c1240s != null) {
            return c1240s.m2701k();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1711d2 c1711d2;
        C0094o c0094o = this.f6808k;
        if (c0094o == null || (c1711d2 = (C1711d2) c0094o.f442l) == null) {
            return null;
        }
        return c1711d2.f6526a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1711d2 c1711d2;
        C0094o c0094o = this.f6808k;
        if (c0094o == null || (c1711d2 = (C1711d2) c0094o.f442l) == null) {
            return null;
        }
        return c1711d2.f6527b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f6808k.f441k).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1240s c1240s = this.f6807j;
        if (c1240s != null) {
            c1240s.m2705o();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1240s c1240s = this.f6807j;
        if (c1240s != null) {
            c1240s.m2706p(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0094o c0094o = this.f6808k;
        if (c0094o != null) {
            c0094o.m347b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0094o c0094o = this.f6808k;
        if (c0094o != null && drawable != null && !this.f6809l) {
            c0094o.f440j = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0094o != null) {
            c0094o.m347b();
            if (this.f6809l) {
                return;
            }
            ImageView imageView = (ImageView) c0094o.f441k;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c0094o.f440j);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f6809l = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C0094o c0094o = this.f6808k;
        if (c0094o != null) {
            ImageView imageView = (ImageView) c0094o.f441k;
            if (i != 0) {
                Drawable drawableM1542D = AbstractC0715d.m1542D(imageView.getContext(), i);
                if (drawableM1542D != null) {
                    AbstractC1714e1.m3392a(drawableM1542D);
                }
                imageView.setImageDrawable(drawableM1542D);
            } else {
                imageView.setImageDrawable(null);
            }
            c0094o.m347b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0094o c0094o = this.f6808k;
        if (c0094o != null) {
            c0094o.m347b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1240s c1240s = this.f6807j;
        if (c1240s != null) {
            c1240s.m2711u(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1240s c1240s = this.f6807j;
        if (c1240s != null) {
            c1240s.m2712v(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0094o c0094o = this.f6808k;
        if (c0094o != null) {
            if (((C1711d2) c0094o.f442l) == null) {
                c0094o.f442l = new C1711d2();
            }
            C1711d2 c1711d2 = (C1711d2) c0094o.f442l;
            c1711d2.f6526a = colorStateList;
            c1711d2.f6529d = true;
            c0094o.m347b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0094o c0094o = this.f6808k;
        if (c0094o != null) {
            if (((C1711d2) c0094o.f442l) == null) {
                c0094o.f442l = new C1711d2();
            }
            C1711d2 c1711d2 = (C1711d2) c0094o.f442l;
            c1711d2.f6527b = mode;
            c1711d2.f6528c = true;
            c0094o.m347b();
        }
    }
}
