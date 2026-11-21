package p140q0;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import java.util.WeakHashMap;
import p002a1.RunnableC0018f;
import p104m.C1730i1;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: q0.d */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC2244d implements View.OnTouchListener {

    /* renamed from: A */
    public static final int f7780A = ViewConfiguration.getTapTimeout();

    /* renamed from: j */
    public final C2241a f7781j;

    /* renamed from: k */
    public final AccelerateInterpolator f7782k;

    /* renamed from: l */
    public final C1730i1 f7783l;

    /* renamed from: m */
    public RunnableC0018f f7784m;

    /* renamed from: n */
    public final float[] f7785n;

    /* renamed from: o */
    public final float[] f7786o;

    /* renamed from: p */
    public final int f7787p;

    /* renamed from: q */
    public final int f7788q;

    /* renamed from: r */
    public final float[] f7789r;

    /* renamed from: s */
    public final float[] f7790s;

    /* renamed from: t */
    public final float[] f7791t;

    /* renamed from: u */
    public boolean f7792u;

    /* renamed from: v */
    public boolean f7793v;

    /* renamed from: w */
    public boolean f7794w;

    /* renamed from: x */
    public boolean f7795x;

    /* renamed from: y */
    public boolean f7796y;

    /* renamed from: z */
    public final C1730i1 f7797z;

    public ViewOnTouchListenerC2244d(C1730i1 c1730i1) {
        C2241a c2241a = new C2241a();
        c2241a.f7775e = Long.MIN_VALUE;
        c2241a.f7777g = -1L;
        c2241a.f7776f = 0L;
        this.f7781j = c2241a;
        this.f7782k = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f7785n = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f7786o = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f7789r = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f7790s = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f7791t = fArr5;
        this.f7783l = c1730i1;
        float f8 = Resources.getSystem().getDisplayMetrics().density;
        float f9 = ((int) ((1575.0f * f8) + 0.5f)) / 1000.0f;
        fArr5[0] = f9;
        fArr5[1] = f9;
        float f10 = ((int) ((f8 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f10;
        fArr4[1] = f10;
        this.f7787p = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f7788q = f7780A;
        c2241a.f7771a = 500;
        c2241a.f7772b = 500;
        this.f7797z = c1730i1;
    }

    /* renamed from: b */
    public static float m4018b(float f8, float f9, float f10) {
        return f8 > f10 ? f10 : f8 < f9 ? f9 : f8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m4019a(float f8, float f9, float f10, int i) {
        float fM4018b;
        float interpolation;
        float fM4018b2 = m4018b(this.f7785n[i] * f9, 0.0f, this.f7786o[i]);
        float fM4020c = m4020c(f9 - f8, fM4018b2) - m4020c(f8, fM4018b2);
        AccelerateInterpolator accelerateInterpolator = this.f7782k;
        if (fM4020c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-fM4020c);
        } else {
            if (fM4020c <= 0.0f) {
                fM4018b = 0.0f;
                if (fM4018b != 0.0f) {
                    return 0.0f;
                }
                float f11 = this.f7789r[i];
                float f12 = this.f7790s[i];
                float f13 = this.f7791t[i];
                float f14 = f11 * f10;
                return fM4018b > 0.0f ? m4018b(fM4018b * f14, f12, f13) : -m4018b((-fM4018b) * f14, f12, f13);
            }
            interpolation = accelerateInterpolator.getInterpolation(fM4020c);
        }
        fM4018b = m4018b(interpolation, -1.0f, 1.0f);
        if (fM4018b != 0.0f) {
        }
    }

    /* renamed from: c */
    public final float m4020c(float f8, float f9) {
        if (f9 != 0.0f) {
            int i = this.f7787p;
            if (i == 0 || i == 1) {
                if (f8 < f9) {
                    if (f8 >= 0.0f) {
                        return 1.0f - (f8 / f9);
                    }
                    if (this.f7795x && i == 1) {
                        return 1.0f;
                    }
                }
            } else if (i == 2 && f8 < 0.0f) {
                return f8 / (-f9);
            }
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m4021d() {
        int i = 0;
        if (this.f7793v) {
            this.f7795x = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        C2241a c2241a = this.f7781j;
        int i4 = (int) (jCurrentAnimationTimeMillis - c2241a.f7775e);
        int i8 = c2241a.f7772b;
        if (i4 > i8) {
            i = i8;
        } else if (i4 >= 0) {
            i = i4;
        }
        c2241a.f7779i = i;
        c2241a.f7778h = c2241a.m4013a(jCurrentAnimationTimeMillis);
        c2241a.f7777g = jCurrentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m4022e() {
        C1730i1 c1730i1;
        int count;
        C2241a c2241a = this.f7781j;
        float f8 = c2241a.f7774d;
        int iAbs = (int) (f8 / Math.abs(f8));
        Math.abs(c2241a.f7773c);
        if (iAbs != 0 && (count = (c1730i1 = this.f7797z).getCount()) != 0) {
            int childCount = c1730i1.getChildCount();
            int firstVisiblePosition = c1730i1.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && c1730i1.getChildAt(0).getTop() >= 0)) : !(i >= count && c1730i1.getChildAt(childCount - 1).getBottom() <= c1730i1.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        if (this.f7796y) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked != 2) {
                    }
                }
                m4021d();
                return false;
            }
            this.f7794w = true;
            this.f7792u = false;
            float x6 = motionEvent.getX();
            float width = view.getWidth();
            C1730i1 c1730i1 = this.f7783l;
            float fM4019a = m4019a(x6, width, c1730i1.getWidth(), 0);
            float fM4019a2 = m4019a(motionEvent.getY(), view.getHeight(), c1730i1.getHeight(), 1);
            C2241a c2241a = this.f7781j;
            c2241a.f7773c = fM4019a;
            c2241a.f7774d = fM4019a2;
            if (!this.f7795x && m4022e()) {
                if (this.f7784m == null) {
                    this.f7784m = new RunnableC0018f(11, this);
                }
                this.f7795x = true;
                this.f7793v = true;
                if (this.f7792u || (i = this.f7788q) <= 0) {
                    this.f7784m.run();
                } else {
                    RunnableC0018f runnableC0018f = this.f7784m;
                    long j = i;
                    WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
                    c1730i1.postOnAnimationDelayed(runnableC0018f, j);
                }
                this.f7792u = true;
            }
        }
        return false;
    }
}
