package p216z2;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p002a1.RunnableC0018f;
import p017b6.C0602f0;
import p024c5.C0662f0;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: z2.j */
/* loaded from: classes.dex */
public final class C2895j extends AbstractC2879c0 {

    /* renamed from: C */
    public static final int[] f10708C = {R.attr.state_pressed};

    /* renamed from: D */
    public static final int[] f10709D = new int[0];

    /* renamed from: A */
    public int f10710A;

    /* renamed from: B */
    public final RunnableC0018f f10711B;

    /* renamed from: a */
    public final int f10712a;

    /* renamed from: b */
    public final int f10713b;

    /* renamed from: c */
    public final StateListDrawable f10714c;

    /* renamed from: d */
    public final Drawable f10715d;

    /* renamed from: e */
    public final int f10716e;

    /* renamed from: f */
    public final int f10717f;

    /* renamed from: g */
    public final StateListDrawable f10718g;

    /* renamed from: h */
    public final Drawable f10719h;

    /* renamed from: i */
    public final int f10720i;

    /* renamed from: j */
    public final int f10721j;

    /* renamed from: k */
    public int f10722k;

    /* renamed from: l */
    public int f10723l;

    /* renamed from: m */
    public float f10724m;

    /* renamed from: n */
    public int f10725n;

    /* renamed from: o */
    public int f10726o;

    /* renamed from: p */
    public float f10727p;

    /* renamed from: s */
    public final RecyclerView f10730s;

    /* renamed from: z */
    public final ValueAnimator f10737z;

    /* renamed from: q */
    public int f10728q = 0;

    /* renamed from: r */
    public int f10729r = 0;

    /* renamed from: t */
    public boolean f10731t = false;

    /* renamed from: u */
    public boolean f10732u = false;

    /* renamed from: v */
    public int f10733v = 0;

    /* renamed from: w */
    public int f10734w = 0;

    /* renamed from: x */
    public final int[] f10735x = new int[2];

    /* renamed from: y */
    public final int[] f10736y = new int[2];

    public C2895j(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i4, int i8) {
        int i9 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f10737z = valueAnimatorOfFloat;
        this.f10710A = 0;
        RunnableC0018f runnableC0018f = new RunnableC0018f(13, this);
        this.f10711B = runnableC0018f;
        C0662f0 c0662f0 = new C0662f0(i9, this);
        this.f10714c = stateListDrawable;
        this.f10715d = drawable;
        this.f10718g = stateListDrawable2;
        this.f10719h = drawable2;
        this.f10716e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f10717f = Math.max(i, drawable.getIntrinsicWidth());
        this.f10720i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f10721j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f10712a = i4;
        this.f10713b = i8;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        valueAnimatorOfFloat.addListener(new C2893i(this));
        valueAnimatorOfFloat.addUpdateListener(new C0602f0(i9, this));
        RecyclerView recyclerView2 = this.f10730s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f2084y;
            AbstractC2888f0 abstractC2888f0 = recyclerView2.f2080w;
            if (abstractC2888f0 != null) {
                abstractC2888f0.mo1125c("Cannot remove item decoration during a scroll  or layout");
            }
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1167R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f10730s;
            recyclerView3.f2086z.remove(this);
            if (recyclerView3.f2014A == this) {
                recyclerView3.f2014A = null;
            }
            ArrayList arrayList2 = this.f10730s.f2071r0;
            if (arrayList2 != null) {
                arrayList2.remove(c0662f0);
            }
            this.f10730s.removeCallbacks(runnableC0018f);
        }
        this.f10730s = recyclerView;
        recyclerView.m1185i(this);
        this.f10730s.f2086z.add(this);
        this.f10730s.m1187j(c0662f0);
    }

    /* renamed from: f */
    public static int m5020f(float f8, float f9, int[] iArr, int i, int i4, int i8) {
        int i9 = iArr[1] - iArr[0];
        if (i9 != 0) {
            int i10 = i - i8;
            int i11 = (int) (((f9 - f8) / i9) * i10);
            int i12 = i4 + i11;
            if (i12 < i10 && i12 >= 0) {
                return i11;
            }
        }
        return 0;
    }

    @Override // p216z2.AbstractC2879c0
    /* renamed from: c */
    public final void mo3269c(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f10728q;
        RecyclerView recyclerView2 = this.f10730s;
        if (i != recyclerView2.getWidth() || this.f10729r != recyclerView2.getHeight()) {
            this.f10728q = recyclerView2.getWidth();
            this.f10729r = recyclerView2.getHeight();
            m5023g(0);
            return;
        }
        if (this.f10710A != 0) {
            if (this.f10731t) {
                int i4 = this.f10728q;
                int i8 = this.f10716e;
                int i9 = i4 - i8;
                int i10 = this.f10723l;
                int i11 = this.f10722k;
                int i12 = i10 - (i11 / 2);
                StateListDrawable stateListDrawable = this.f10714c;
                stateListDrawable.setBounds(0, 0, i8, i11);
                int i13 = this.f10717f;
                int i14 = this.f10729r;
                Drawable drawable = this.f10715d;
                drawable.setBounds(0, 0, i13, i14);
                WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i8, i12);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(-1.0f, 1.0f);
                    canvas.translate(-i8, -i12);
                } else {
                    canvas.translate(i9, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i12);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i9, -i12);
                }
            }
            if (this.f10732u) {
                int i15 = this.f10729r;
                int i16 = this.f10720i;
                int i17 = i15 - i16;
                int i18 = this.f10726o;
                int i19 = this.f10725n;
                int i20 = i18 - (i19 / 2);
                StateListDrawable stateListDrawable2 = this.f10718g;
                stateListDrawable2.setBounds(0, 0, i19, i16);
                int i21 = this.f10728q;
                int i22 = this.f10721j;
                Drawable drawable2 = this.f10719h;
                drawable2.setBounds(0, 0, i21, i22);
                canvas.translate(0.0f, i17);
                drawable2.draw(canvas);
                canvas.translate(i20, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i20, -i17);
            }
        }
    }

    /* renamed from: d */
    public final boolean m5021d(float f8, float f9) {
        if (f9 < this.f10729r - this.f10720i) {
            return false;
        }
        int i = this.f10726o;
        int i4 = this.f10725n;
        return f8 >= ((float) (i - (i4 / 2))) && f8 <= ((float) ((i4 / 2) + i));
    }

    /* renamed from: e */
    public final boolean m5022e(float f8, float f9) {
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        int layoutDirection = this.f10730s.getLayoutDirection();
        int i = this.f10716e;
        if (layoutDirection == 1) {
            if (f8 > i) {
                return false;
            }
        } else if (f8 < this.f10728q - i) {
            return false;
        }
        int i4 = this.f10723l;
        int i8 = this.f10722k / 2;
        return f9 >= ((float) (i4 - i8)) && f9 <= ((float) (i8 + i4));
    }

    /* renamed from: g */
    public final void m5023g(int i) {
        RunnableC0018f runnableC0018f = this.f10711B;
        StateListDrawable stateListDrawable = this.f10714c;
        if (i == 2 && this.f10733v != 2) {
            stateListDrawable.setState(f10708C);
            this.f10730s.removeCallbacks(runnableC0018f);
        }
        if (i == 0) {
            this.f10730s.invalidate();
        } else {
            m5024h();
        }
        if (this.f10733v == 2 && i != 2) {
            stateListDrawable.setState(f10709D);
            this.f10730s.removeCallbacks(runnableC0018f);
            this.f10730s.postDelayed(runnableC0018f, 1200);
        } else if (i == 1) {
            this.f10730s.removeCallbacks(runnableC0018f);
            this.f10730s.postDelayed(runnableC0018f, 1500);
        }
        this.f10733v = i;
    }

    /* renamed from: h */
    public final void m5024h() {
        int i = this.f10710A;
        ValueAnimator valueAnimator = this.f10737z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f10710A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
