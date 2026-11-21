package p040e3;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.bumptech.glide.AbstractC0715d;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p017b6.C0614n;
import p029d0.AbstractC0786b;
import p029d0.AbstractC0795k;
import p130p.C2186e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: e3.f */
/* loaded from: classes.dex */
public final class C0868f extends AbstractC0869g implements Animatable {

    /* renamed from: l */
    public final Context f3814l;

    /* renamed from: m */
    public C0614n f3815m = null;

    /* renamed from: n */
    public ArrayList f3816n = null;

    /* renamed from: o */
    public final C0865c f3817o = new C0865c(this);

    /* renamed from: k */
    public final C0866d f3813k = new C0866d();

    public C0868f(Context context, int i) {
        this.f3814l = context;
    }

    @Override // p040e3.AbstractC0869g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C0866d c0866d = this.f3813k;
        c0866d.f3807a.draw(canvas);
        if (c0866d.f3808b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getAlpha() : this.f3813k.f3807a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f3813k.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getColorFilter() : this.f3813k.f3807a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f3818j == null) {
            return null;
        }
        return new C0867e(0, this.f3818j.getConstantState());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f3813k.f3807a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f3813k.f3807a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.getOpacity() : this.f3813k.f3807a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ca, code lost:
    
        if (r3.f3808b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00cc, code lost:
    
        r3.f3808b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d3, code lost:
    
        r3.f3808b.playTogether(r3.f3809c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00da, code lost:
    
        return;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, Resources.NotFoundException, IOException {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            C0866d c0866d = this.f3813k;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayM1936f = AbstractC0786b.m1936f(resources, theme, attributeSet, AbstractC0863a.f3803e);
                    int resourceId = typedArrayM1936f.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C0878p c0878p = new C0878p();
                        ThreadLocal threadLocal = AbstractC0795k.f3568a;
                        c0878p.f3818j = resources.getDrawable(resourceId, theme);
                        new C0877o(c0878p.f3818j.getConstantState());
                        c0878p.f3878o = false;
                        c0878p.setCallback(this.f3817o);
                        C0878p c0878p2 = c0866d.f3807a;
                        if (c0878p2 != null) {
                            c0878p2.setCallback(null);
                        }
                        c0866d.f3807a = c0878p;
                    }
                    typedArrayM1936f.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, AbstractC0863a.f3804f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f3814l;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator animatorLoadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        animatorLoadAnimator.setTarget(c0866d.f3807a.f3874k.f3861b.f3859o.get(string));
                        if (c0866d.f3809c == null) {
                            c0866d.f3809c = new ArrayList();
                            c0866d.f3810d = new C2186e(0);
                        }
                        c0866d.f3809c.add(animatorLoadAnimator);
                        c0866d.f3810d.put(animatorLoadAnimator, string);
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.isAutoMirrored() : this.f3813k.f3807a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f3818j;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f3813k.f3808b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.isStateful() : this.f3813k.f3807a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f3813k.f3807a.setBounds(rect);
        }
    }

    @Override // p040e3.AbstractC0869g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.setLevel(i) : this.f3813k.f3807a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f3818j;
        return drawable != null ? drawable.setState(iArr) : this.f3813k.f3807a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f3813k.f3807a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z7) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setAutoMirrored(z7);
        } else {
            this.f3813k.f3807a.setAutoMirrored(z7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3813k.f3807a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            AbstractC0715d.m1564k0(drawable, i);
        } else {
            this.f3813k.f3807a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.f3813k.f3807a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.f3813k.f3807a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            return drawable.setVisible(z7, z8);
        }
        this.f3813k.f3807a.setVisible(z7, z8);
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C0866d c0866d = this.f3813k;
        if (c0866d.f3808b.isStarted()) {
            return;
        }
        c0866d.f3808b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f3818j;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f3813k.f3808b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, Resources.NotFoundException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
