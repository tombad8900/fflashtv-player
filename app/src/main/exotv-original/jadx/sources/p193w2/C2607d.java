package p193w2;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.lifecycle.RunnableC0127c0;
import androidx.media3.common.AbstractC0230p1;
import androidx.media3.common.InterfaceC0193d1;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import com.exotv.net.R;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import p017b6.C0609j;
import p063h1.AbstractC1101a;
import p063h1.AbstractC1118i0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.d */
/* loaded from: classes.dex */
public final class C2607d extends View implements InterfaceC2614g0 {

    /* renamed from: A */
    public final int f9374A;

    /* renamed from: B */
    public final int f9375B;

    /* renamed from: C */
    public final int f9376C;

    /* renamed from: D */
    public final StringBuilder f9377D;

    /* renamed from: E */
    public final Formatter f9378E;

    /* renamed from: F */
    public final RunnableC0127c0 f9379F;

    /* renamed from: G */
    public final CopyOnWriteArraySet f9380G;

    /* renamed from: H */
    public final Point f9381H;

    /* renamed from: I */
    public final float f9382I;

    /* renamed from: J */
    public int f9383J;

    /* renamed from: K */
    public long f9384K;

    /* renamed from: L */
    public int f9385L;

    /* renamed from: M */
    public Rect f9386M;

    /* renamed from: N */
    public final ValueAnimator f9387N;

    /* renamed from: O */
    public float f9388O;

    /* renamed from: P */
    public boolean f9389P;

    /* renamed from: Q */
    public boolean f9390Q;

    /* renamed from: R */
    public long f9391R;

    /* renamed from: S */
    public long f9392S;

    /* renamed from: T */
    public long f9393T;

    /* renamed from: U */
    public long f9394U;

    /* renamed from: V */
    public int f9395V;

    /* renamed from: W */
    public long[] f9396W;

    /* renamed from: a0 */
    public boolean[] f9397a0;

    /* renamed from: j */
    public final Rect f9398j;

    /* renamed from: k */
    public final Rect f9399k;

    /* renamed from: l */
    public final Rect f9400l;

    /* renamed from: m */
    public final Rect f9401m;

    /* renamed from: n */
    public final Paint f9402n;

    /* renamed from: o */
    public final Paint f9403o;

    /* renamed from: p */
    public final Paint f9404p;

    /* renamed from: q */
    public final Paint f9405q;

    /* renamed from: r */
    public final Paint f9406r;

    /* renamed from: s */
    public final Paint f9407s;

    /* renamed from: t */
    public final Drawable f9408t;

    /* renamed from: u */
    public final int f9409u;

    /* renamed from: v */
    public final int f9410v;

    /* renamed from: w */
    public final int f9411w;

    /* renamed from: x */
    public final int f9412x;

    /* renamed from: y */
    public final int f9413y;

    /* renamed from: z */
    public final int f9414z;

    public C2607d(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        this.f9398j = new Rect();
        this.f9399k = new Rect();
        this.f9400l = new Rect();
        this.f9401m = new Rect();
        Paint paint = new Paint();
        this.f9402n = paint;
        Paint paint2 = new Paint();
        this.f9403o = paint2;
        Paint paint3 = new Paint();
        this.f9404p = paint3;
        Paint paint4 = new Paint();
        this.f9405q = paint4;
        Paint paint5 = new Paint();
        this.f9406r = paint5;
        Paint paint6 = new Paint();
        this.f9407s = paint6;
        paint6.setAntiAlias(true);
        this.f9380G = new CopyOnWriteArraySet();
        this.f9381H = new Point();
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f9382I = f8;
        this.f9376C = m4686a(-50, f8);
        int iM4686a = m4686a(4, f8);
        int iM4686a2 = m4686a(26, f8);
        int iM4686a3 = m4686a(4, f8);
        int iM4686a4 = m4686a(12, f8);
        int iM4686a5 = m4686a(0, f8);
        int iM4686a6 = m4686a(16, f8);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AbstractC2602a0.f9351b, 0, R.style.ExoStyledControls_TimeBar);
            try {
                Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(10);
                this.f9408t = drawable;
                if (drawable != null) {
                    int i = AbstractC1118i0.f4750a;
                    if (i >= 23) {
                        int layoutDirection = getLayoutDirection();
                        if (i < 23 || drawable.setLayoutDirection(layoutDirection)) {
                        }
                    }
                    iM4686a2 = Math.max(drawable.getMinimumHeight(), iM4686a2);
                }
                this.f9409u = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, iM4686a);
                this.f9410v = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, iM4686a2);
                this.f9411w = typedArrayObtainStyledAttributes.getInt(2, 0);
                this.f9412x = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, iM4686a3);
                this.f9413y = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, iM4686a4);
                this.f9414z = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, iM4686a5);
                this.f9374A = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, iM4686a6);
                int i4 = typedArrayObtainStyledAttributes.getInt(6, -1);
                int i8 = typedArrayObtainStyledAttributes.getInt(7, -1);
                int i9 = typedArrayObtainStyledAttributes.getInt(4, -855638017);
                int i10 = typedArrayObtainStyledAttributes.getInt(13, 872415231);
                int i11 = typedArrayObtainStyledAttributes.getInt(0, -1291845888);
                int i12 = typedArrayObtainStyledAttributes.getInt(5, 872414976);
                paint.setColor(i4);
                paint6.setColor(i8);
                paint2.setColor(i9);
                paint3.setColor(i10);
                paint4.setColor(i11);
                paint5.setColor(i12);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            this.f9409u = iM4686a;
            this.f9410v = iM4686a2;
            this.f9411w = 0;
            this.f9412x = iM4686a3;
            this.f9413y = iM4686a4;
            this.f9414z = iM4686a5;
            this.f9374A = iM4686a6;
            paint.setColor(-1);
            paint6.setColor(-1);
            paint2.setColor(-855638017);
            paint3.setColor(872415231);
            paint4.setColor(-1291845888);
            paint5.setColor(872414976);
            this.f9408t = null;
        }
        StringBuilder sb = new StringBuilder();
        this.f9377D = sb;
        this.f9378E = new Formatter(sb, Locale.getDefault());
        this.f9379F = new RunnableC0127c0(19, this);
        Drawable drawable2 = this.f9408t;
        if (drawable2 != null) {
            this.f9375B = (drawable2.getMinimumWidth() + 1) / 2;
        } else {
            this.f9375B = (Math.max(this.f9414z, Math.max(this.f9413y, this.f9374A)) + 1) / 2;
        }
        this.f9388O = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f9387N = valueAnimator;
        valueAnimator.addUpdateListener(new C0609j(1, this));
        this.f9392S = -9223372036854775807L;
        this.f9384K = -9223372036854775807L;
        this.f9383J = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    /* renamed from: a */
    public static int m4686a(int i, float f8) {
        return (int) ((i * f8) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.f9384K;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j8 = this.f9392S;
        if (j8 == -9223372036854775807L) {
            return 0L;
        }
        return j8 / this.f9383J;
    }

    private String getProgressText() {
        return AbstractC1118i0.m2416G(this.f9377D, this.f9378E, this.f9393T);
    }

    private long getScrubberPosition() {
        if (this.f9399k.width() <= 0 || this.f9392S == -9223372036854775807L) {
            return 0L;
        }
        return (this.f9401m.width() * this.f9392S) / r0.width();
    }

    /* renamed from: b */
    public final boolean m4687b(long j) {
        long j8 = this.f9392S;
        if (j8 <= 0) {
            return false;
        }
        long j9 = this.f9390Q ? this.f9391R : this.f9393T;
        long jM2452k = AbstractC1118i0.m2452k(j9 + j, 0L, j8);
        if (jM2452k == j9) {
            return false;
        }
        if (this.f9390Q) {
            m4691f(jM2452k);
        } else {
            m4688c(jM2452k);
        }
        m4690e();
        return true;
    }

    /* renamed from: c */
    public final void m4688c(long j) {
        this.f9391R = j;
        this.f9390Q = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.f9380G.iterator();
        while (it.hasNext()) {
            C2627o c2627o = ((ViewOnClickListenerC2611f) it.next()).f9456j;
            c2627o.f9556y0 = true;
            TextView textView = c2627o.f9505M;
            if (textView != null) {
                textView.setText(AbstractC1118i0.m2416G(c2627o.f9507O, c2627o.f9508P, j));
            }
            c2627o.f9525j.m4727f();
        }
    }

    /* renamed from: d */
    public final void m4689d(boolean z7) {
        InterfaceC0193d1 interfaceC0193d1;
        removeCallbacks(this.f9379F);
        this.f9390Q = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.f9380G.iterator();
        while (it.hasNext()) {
            ViewOnClickListenerC2611f viewOnClickListenerC2611f = (ViewOnClickListenerC2611f) it.next();
            long j = this.f9391R;
            C2627o c2627o = viewOnClickListenerC2611f.f9456j;
            c2627o.f9556y0 = false;
            if (!z7 && (interfaceC0193d1 = c2627o.f9544s0) != null) {
                if (c2627o.f9554x0) {
                    if (interfaceC0193d1.isCommandAvailable(17) && interfaceC0193d1.isCommandAvailable(10)) {
                        AbstractC0230p1 currentTimeline = interfaceC0193d1.getCurrentTimeline();
                        int windowCount = currentTimeline.getWindowCount();
                        int i = 0;
                        while (true) {
                            long jM2447f0 = AbstractC1118i0.m2447f0(currentTimeline.getWindow(i, c2627o.f9510R).f1272m);
                            if (j < jM2447f0) {
                                break;
                            }
                            if (i == windowCount - 1) {
                                j = jM2447f0;
                                break;
                            } else {
                                j -= jM2447f0;
                                i++;
                            }
                        }
                        interfaceC0193d1.seekTo(i, j);
                    }
                } else if (interfaceC0193d1.isCommandAvailable(5)) {
                    interfaceC0193d1.seekTo(j);
                }
                c2627o.m4715o();
            }
            c2627o.f9525j.m4728g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f9408t;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m4690e() {
        Rect rect = this.f9400l;
        Rect rect2 = this.f9399k;
        rect.set(rect2);
        Rect rect3 = this.f9401m;
        rect3.set(rect2);
        long j = this.f9390Q ? this.f9391R : this.f9393T;
        if (this.f9392S > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.f9394U) / this.f9392S)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.f9392S)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.f9398j);
    }

    /* renamed from: f */
    public final void m4691f(long j) {
        if (this.f9391R == j) {
            return;
        }
        this.f9391R = j;
        Iterator it = this.f9380G.iterator();
        while (it.hasNext()) {
            C2627o c2627o = ((ViewOnClickListenerC2611f) it.next()).f9456j;
            TextView textView = c2627o.f9505M;
            if (textView != null) {
                textView.setText(AbstractC1118i0.m2416G(c2627o.f9507O, c2627o.f9508P, j));
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int iWidth = (int) (this.f9399k.width() / this.f9382I);
        if (iWidth == 0) {
            return Long.MAX_VALUE;
        }
        long j = this.f9392S;
        if (j == 0 || j == -9223372036854775807L) {
            return Long.MAX_VALUE;
        }
        return j / iWidth;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f9408t;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        canvas.save();
        Rect rect = this.f9399k;
        int iHeight = rect.height();
        int iCenterY = rect.centerY() - (iHeight / 2);
        int i = iCenterY + iHeight;
        long j = this.f9392S;
        Paint paint = this.f9404p;
        Rect rect2 = this.f9401m;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, iCenterY, rect.right, i, paint);
        } else {
            Rect rect3 = this.f9400l;
            int i4 = rect3.left;
            int i8 = rect3.right;
            int iMax = Math.max(Math.max(rect.left, i8), rect2.right);
            int i9 = rect.right;
            if (iMax < i9) {
                canvas.drawRect(iMax, iCenterY, i9, i, paint);
            }
            int iMax2 = Math.max(i4, rect2.right);
            if (i8 > iMax2) {
                canvas.drawRect(iMax2, iCenterY, i8, i, this.f9403o);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, iCenterY, rect2.right, i, this.f9402n);
            }
            if (this.f9395V != 0) {
                long[] jArr = this.f9396W;
                jArr.getClass();
                boolean[] zArr = this.f9397a0;
                zArr.getClass();
                int i10 = this.f9412x;
                int i11 = i10 / 2;
                int i12 = 0;
                int i13 = 0;
                while (i13 < this.f9395V) {
                    int i14 = i13;
                    canvas.drawRect(Math.min(rect.width() - i10, Math.max(i12, ((int) ((rect.width() * AbstractC1118i0.m2452k(jArr[i13], 0L, this.f9392S)) / this.f9392S)) - i11)) + rect.left, iCenterY, r3 + i10, i, zArr[i13] ? this.f9406r : this.f9405q);
                    i13 = i14 + 1;
                    i12 = i12;
                }
            }
            canvas2 = canvas;
        }
        if (this.f9392S > 0) {
            int iM2451j = AbstractC1118i0.m2451j(rect2.right, rect2.left, rect.right);
            int iCenterY2 = rect2.centerY();
            Drawable drawable = this.f9408t;
            if (drawable == null) {
                canvas2.drawCircle(iM2451j, iCenterY2, (int) ((((this.f9390Q || isFocused()) ? this.f9374A : isEnabled() ? this.f9413y : this.f9414z) * this.f9388O) / 2.0f), this.f9407s);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.f9388O)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.f9388O)) / 2;
                drawable.setBounds(iM2451j - intrinsicWidth, iCenterY2 - intrinsicHeight, iM2451j + intrinsicWidth, iCenterY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i, Rect rect) {
        super.onFocusChanged(z7, i, rect);
        if (!this.f9390Q || z7) {
            return;
        }
        m4689d(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.f9392S <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case AnalyticsListener.EVENT_AUDIO_SESSION_ID /* 21 */:
                        positionIncrement = -positionIncrement;
                        if (m4687b(positionIncrement)) {
                            RunnableC0127c0 runnableC0127c0 = this.f9379F;
                            removeCallbacks(runnableC0127c0);
                            postDelayed(runnableC0127c0, 1000L);
                            break;
                        }
                        break;
                    case AnalyticsListener.EVENT_VOLUME_CHANGED /* 22 */:
                        if (m4687b(positionIncrement)) {
                        }
                        break;
                    case AnalyticsListener.EVENT_SKIP_SILENCE_ENABLED_CHANGED /* 23 */:
                        if (this.f9390Q) {
                            m4689d(false);
                            break;
                        }
                        break;
                }
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int paddingBottom;
        int paddingBottom2;
        Rect rect;
        int i10 = i8 - i;
        int i11 = i9 - i4;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i10 - getPaddingRight();
        int i12 = this.f9389P ? 0 : this.f9375B;
        int i13 = this.f9411w;
        int i14 = this.f9409u;
        int i15 = this.f9410v;
        if (i13 == 1) {
            paddingBottom = (i11 - getPaddingBottom()) - i15;
            paddingBottom2 = ((i11 - getPaddingBottom()) - i14) - Math.max(i12 - (i14 / 2), 0);
        } else {
            paddingBottom = (i11 - i15) / 2;
            paddingBottom2 = (i11 - i14) / 2;
        }
        Rect rect2 = this.f9398j;
        rect2.set(paddingLeft, paddingBottom, paddingRight, i15 + paddingBottom);
        this.f9399k.set(rect2.left + i12, paddingBottom2, rect2.right - i12, i14 + paddingBottom2);
        if (AbstractC1118i0.f4750a >= 29 && ((rect = this.f9386M) == null || rect.width() != i10 || this.f9386M.height() != i11)) {
            Rect rect3 = new Rect(0, 0, i10, i11);
            this.f9386M = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        m4690e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int i8 = this.f9410v;
        if (mode == 0) {
            size = i8;
        } else if (mode != 1073741824) {
            size = Math.min(i8, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.f9408t;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.f9408t;
        if (drawable == null || AbstractC1118i0.f4750a < 23 || !drawable.setLayoutDirection(i)) {
            return;
        }
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006e  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled() && this.f9392S > 0) {
            int x6 = (int) motionEvent.getX();
            int y4 = (int) motionEvent.getY();
            Point point = this.f9381H;
            point.set(x6, y4);
            int i = point.x;
            int i4 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.f9399k;
            Rect rect2 = this.f9401m;
            if (action == 0) {
                int i8 = i;
                if (this.f9398j.contains(i8, i4)) {
                    rect2.right = AbstractC1118i0.m2451j(i8, rect.left, rect.right);
                    m4688c(getScrubberPosition());
                    m4690e();
                    invalidate();
                    return true;
                }
            } else if (action == 1) {
                if (this.f9390Q) {
                    m4689d(motionEvent.getAction() == 3);
                    return true;
                }
            } else if (action != 2) {
                if (action == 3) {
                }
            } else if (this.f9390Q) {
                if (i4 < this.f9376C) {
                    int i9 = this.f9385L;
                    rect2.right = AbstractC1118i0.m2451j(((i - i9) / 3) + i9, rect.left, rect.right);
                } else {
                    this.f9385L = i;
                    rect2.right = AbstractC1118i0.m2451j(i, rect.left, rect.right);
                }
                m4691f(getScrubberPosition());
                m4690e();
                invalidate();
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.f9392S <= 0) {
            return false;
        }
        if (i == 8192) {
            if (m4687b(-getPositionIncrement())) {
                m4689d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (m4687b(getPositionIncrement())) {
                m4689d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.f9405q.setColor(i);
        invalidate(this.f9398j);
    }

    public void setBufferedColor(int i) {
        this.f9403o.setColor(i);
        invalidate(this.f9398j);
    }

    public void setBufferedPosition(long j) {
        if (this.f9394U == j) {
            return;
        }
        this.f9394U = j;
        m4690e();
    }

    public void setDuration(long j) {
        if (this.f9392S == j) {
            return;
        }
        this.f9392S = j;
        if (this.f9390Q && j == -9223372036854775807L) {
            m4689d(true);
        }
        m4690e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        if (!this.f9390Q || z7) {
            return;
        }
        m4689d(true);
    }

    public void setKeyCountIncrement(int i) {
        AbstractC1101a.m2353d(i > 0);
        this.f9383J = i;
        this.f9384K = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        AbstractC1101a.m2353d(j > 0);
        this.f9383J = -1;
        this.f9384K = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.f9406r.setColor(i);
        invalidate(this.f9398j);
    }

    public void setPlayedColor(int i) {
        this.f9402n.setColor(i);
        invalidate(this.f9398j);
    }

    public void setPosition(long j) {
        if (this.f9393T == j) {
            return;
        }
        this.f9393T = j;
        setContentDescription(getProgressText());
        m4690e();
    }

    public void setScrubberColor(int i) {
        this.f9407s.setColor(i);
        invalidate(this.f9398j);
    }

    public void setUnplayedColor(int i) {
        this.f9404p.setColor(i);
        invalidate(this.f9398j);
    }
}
