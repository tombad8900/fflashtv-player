package p100l4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import java.util.ArrayList;
import p040e3.C0867e;
import p178u4.AbstractC2470e;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: l4.b */
/* loaded from: classes.dex */
public final class C1674b extends Drawable implements InterfaceC1677e, Animatable {

    /* renamed from: j */
    public final C0867e f6419j;

    /* renamed from: k */
    public boolean f6420k;

    /* renamed from: l */
    public boolean f6421l;

    /* renamed from: m */
    public boolean f6422m;

    /* renamed from: o */
    public int f6424o;

    /* renamed from: q */
    public boolean f6426q;

    /* renamed from: r */
    public Paint f6427r;

    /* renamed from: s */
    public Rect f6428s;

    /* renamed from: n */
    public boolean f6423n = true;

    /* renamed from: p */
    public final int f6425p = -1;

    public C1674b(C0867e c0867e) {
        this.f6419j = c0867e;
    }

    /* renamed from: a */
    public final void m3376a() {
        AbstractC2470e.m4444a("You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.", !this.f6422m);
        C1678f c1678f = (C1678f) this.f6419j.f3812b;
        if (c1678f.f6437a.f10196l.f10172c == 1) {
            invalidateSelf();
            return;
        }
        if (this.f6420k) {
            return;
        }
        this.f6420k = true;
        ArrayList arrayList = c1678f.f6439c;
        if (c1678f.f6446j) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (arrayList.contains(this)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean zIsEmpty = arrayList.isEmpty();
        arrayList.add(this);
        if (zIsEmpty && !c1678f.f6442f) {
            c1678f.f6442f = true;
            c1678f.f6446j = false;
            c1678f.m3377a();
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f6422m) {
            return;
        }
        if (this.f6426q) {
            int intrinsicWidth = getIntrinsicWidth();
            int intrinsicHeight = getIntrinsicHeight();
            Rect bounds = getBounds();
            if (this.f6428s == null) {
                this.f6428s = new Rect();
            }
            Gravity.apply(119, intrinsicWidth, intrinsicHeight, bounds, this.f6428s);
            this.f6426q = false;
        }
        C1678f c1678f = (C1678f) this.f6419j.f3812b;
        C1676d c1676d = c1678f.f6445i;
        Bitmap bitmap = c1676d != null ? c1676d.f6436p : c1678f.f6448l;
        if (this.f6428s == null) {
            this.f6428s = new Rect();
        }
        Rect rect = this.f6428s;
        if (this.f6427r == null) {
            this.f6427r = new Paint(2);
        }
        canvas.drawBitmap(bitmap, (Rect) null, rect, this.f6427r);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6419j;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return ((C1678f) this.f6419j.f3812b).f6452p;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return ((C1678f) this.f6419j.f3812b).f6451o;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.f6420k;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f6426q = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.f6427r == null) {
            this.f6427r = new Paint(2);
        }
        this.f6427r.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.f6427r == null) {
            this.f6427r = new Paint(2);
        }
        this.f6427r.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z7, boolean z8) {
        AbstractC2470e.m4444a("Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.", !this.f6422m);
        this.f6423n = z7;
        if (!z7) {
            this.f6420k = false;
            C1678f c1678f = (C1678f) this.f6419j.f3812b;
            ArrayList arrayList = c1678f.f6439c;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c1678f.f6442f = false;
            }
        } else if (this.f6421l) {
            m3376a();
        }
        return super.setVisible(z7, z8);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        this.f6421l = true;
        this.f6424o = 0;
        if (this.f6423n) {
            m3376a();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        this.f6421l = false;
        this.f6420k = false;
        C1678f c1678f = (C1678f) this.f6419j.f3812b;
        ArrayList arrayList = c1678f.f6439c;
        arrayList.remove(this);
        if (arrayList.isEmpty()) {
            c1678f.f6442f = false;
        }
    }
}
