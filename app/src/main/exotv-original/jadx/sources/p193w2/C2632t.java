package p193w2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.media3.exoplayer.ExoPlayer;
import com.exotv.net.R;
import java.util.ArrayList;
import java.util.Iterator;
import p017b6.ViewOnClickListenerC0591a;
import p092k5.ViewOnLayoutChangeListenerC1602a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: w2.t */
/* loaded from: classes.dex */
public final class C2632t {

    /* renamed from: A */
    public boolean f9568A;

    /* renamed from: B */
    public boolean f9569B;

    /* renamed from: a */
    public final C2627o f9571a;

    /* renamed from: b */
    public final View f9572b;

    /* renamed from: c */
    public final ViewGroup f9573c;

    /* renamed from: d */
    public final ViewGroup f9574d;

    /* renamed from: e */
    public final ViewGroup f9575e;

    /* renamed from: f */
    public final ViewGroup f9576f;

    /* renamed from: g */
    public final ViewGroup f9577g;

    /* renamed from: h */
    public final ViewGroup f9578h;

    /* renamed from: i */
    public final ViewGroup f9579i;

    /* renamed from: j */
    public final View f9580j;

    /* renamed from: k */
    public final View f9581k;

    /* renamed from: l */
    public final AnimatorSet f9582l;

    /* renamed from: m */
    public final AnimatorSet f9583m;

    /* renamed from: n */
    public final AnimatorSet f9584n;

    /* renamed from: o */
    public final AnimatorSet f9585o;

    /* renamed from: p */
    public final AnimatorSet f9586p;

    /* renamed from: q */
    public final ValueAnimator f9587q;

    /* renamed from: r */
    public final ValueAnimator f9588r;

    /* renamed from: s */
    public final RunnableC2628p f9589s;

    /* renamed from: t */
    public final RunnableC2628p f9590t;

    /* renamed from: x */
    public final ViewOnLayoutChangeListenerC1602a f9594x;

    /* renamed from: u */
    public final RunnableC2628p f9591u = new RunnableC2628p(this, 4);

    /* renamed from: v */
    public final RunnableC2628p f9592v = new RunnableC2628p(this, 5);

    /* renamed from: w */
    public final RunnableC2628p f9593w = new RunnableC2628p(this, 6);

    /* renamed from: C */
    public boolean f9570C = true;

    /* renamed from: z */
    public int f9596z = 0;

    /* renamed from: y */
    public final ArrayList f9595y = new ArrayList();

    public C2632t(C2627o c2627o) throws Resources.NotFoundException {
        this.f9571a = c2627o;
        final int i = 0;
        this.f9589s = new RunnableC2628p(this, i);
        final int i4 = 3;
        this.f9590t = new RunnableC2628p(this, i4);
        final int i8 = 2;
        this.f9594x = new ViewOnLayoutChangeListenerC1602a(i8, this);
        final int i9 = 1;
        this.f9572b = c2627o.findViewById(R.id.exo_controls_background);
        this.f9573c = (ViewGroup) c2627o.findViewById(R.id.exo_center_controls);
        this.f9575e = (ViewGroup) c2627o.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) c2627o.findViewById(R.id.exo_bottom_bar);
        this.f9574d = viewGroup;
        this.f9579i = (ViewGroup) c2627o.findViewById(R.id.exo_time);
        View viewFindViewById = c2627o.findViewById(R.id.exo_progress);
        this.f9580j = viewFindViewById;
        this.f9576f = (ViewGroup) c2627o.findViewById(R.id.exo_basic_controls);
        this.f9577g = (ViewGroup) c2627o.findViewById(R.id.exo_extra_controls);
        this.f9578h = (ViewGroup) c2627o.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = c2627o.findViewById(R.id.exo_overflow_show);
        this.f9581k = viewFindViewById2;
        View viewFindViewById3 = c2627o.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            int i10 = 9;
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC0591a(i10, this));
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC0591a(i10, this));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w2.q

            /* renamed from: b */
            public final /* synthetic */ C2632t f9562b;

            {
                this.f9562b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i4) {
                    case 0:
                        C2632t c2632t = this.f9562b;
                        c2632t.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c2632t.f9572b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c2632t.f9573c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c2632t.f9575e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        C2632t c2632t2 = this.f9562b;
                        c2632t2.getClass();
                        c2632t2.m4724a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C2632t c2632t3 = this.f9562b;
                        c2632t3.getClass();
                        c2632t3.m4724a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C2632t c2632t4 = this.f9562b;
                        c2632t4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c2632t4.f9572b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c2632t4.f9573c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c2632t4.f9575e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new C2630r(this, i));
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w2.q

            /* renamed from: b */
            public final /* synthetic */ C2632t f9562b;

            {
                this.f9562b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C2632t c2632t = this.f9562b;
                        c2632t.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c2632t.f9572b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c2632t.f9573c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c2632t.f9575e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        C2632t c2632t2 = this.f9562b;
                        c2632t2.getClass();
                        c2632t2.m4724a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C2632t c2632t3 = this.f9562b;
                        c2632t3.getClass();
                        c2632t3.m4724a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C2632t c2632t4 = this.f9562b;
                        c2632t4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c2632t4.f9572b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c2632t4.f9573c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c2632t4.f9575e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat2.addListener(new C2630r(this, i9));
        Resources resources = c2627o.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f9582l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new C2631s(this, c2627o, i));
        animatorSet.play(valueAnimatorOfFloat).with(m4722d(viewFindViewById, 0.0f, dimension)).with(m4722d(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f9583m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new C2631s(this, c2627o, i9));
        animatorSet2.play(m4722d(viewFindViewById, dimension, dimension2)).with(m4722d(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f9584n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new C2631s(this, c2627o, i8));
        animatorSet3.play(valueAnimatorOfFloat).with(m4722d(viewFindViewById, 0.0f, dimension2)).with(m4722d(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f9585o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new C2630r(this, i8));
        animatorSet4.play(valueAnimatorOfFloat2).with(m4722d(viewFindViewById, dimension, 0.0f)).with(m4722d(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f9586p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new C2630r(this, i4));
        animatorSet5.play(valueAnimatorOfFloat2).with(m4722d(viewFindViewById, dimension2, 0.0f)).with(m4722d(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f9587q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w2.q

            /* renamed from: b */
            public final /* synthetic */ C2632t f9562b;

            {
                this.f9562b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i9) {
                    case 0:
                        C2632t c2632t = this.f9562b;
                        c2632t.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c2632t.f9572b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c2632t.f9573c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c2632t.f9575e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        C2632t c2632t2 = this.f9562b;
                        c2632t2.getClass();
                        c2632t2.m4724a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C2632t c2632t3 = this.f9562b;
                        c2632t3.getClass();
                        c2632t3.m4724a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C2632t c2632t4 = this.f9562b;
                        c2632t4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c2632t4.f9572b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c2632t4.f9573c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c2632t4.f9575e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat3.addListener(new C2630r(this, 4));
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f9588r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: w2.q

            /* renamed from: b */
            public final /* synthetic */ C2632t f9562b;

            {
                this.f9562b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i8) {
                    case 0:
                        C2632t c2632t = this.f9562b;
                        c2632t.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c2632t.f9572b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c2632t.f9573c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c2632t.f9575e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                            break;
                        }
                        break;
                    case 1:
                        C2632t c2632t2 = this.f9562b;
                        c2632t2.getClass();
                        c2632t2.m4724a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    case 2:
                        C2632t c2632t3 = this.f9562b;
                        c2632t3.getClass();
                        c2632t3.m4724a(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C2632t c2632t4 = this.f9562b;
                        c2632t4.getClass();
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view2 = c2632t4.f9572b;
                        if (view2 != null) {
                            view2.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup4 = c2632t4.f9573c;
                        if (viewGroup4 != null) {
                            viewGroup4.setAlpha(fFloatValue2);
                        }
                        ViewGroup viewGroup5 = c2632t4.f9575e;
                        if (viewGroup5 != null) {
                            viewGroup5.setAlpha(fFloatValue2);
                            break;
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new C2630r(this, 5));
    }

    /* renamed from: c */
    public static int m4721c(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return width;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + width;
    }

    /* renamed from: d */
    public static ObjectAnimator m4722d(View view, float f8, float f9) {
        return ObjectAnimator.ofFloat(view, "translationY", f8, f9);
    }

    /* renamed from: j */
    public static boolean m4723j(View view) {
        int id = view.getId();
        return id == R.id.exo_bottom_bar || id == R.id.exo_prev || id == R.id.exo_next || id == R.id.exo_rew || id == R.id.exo_rew_with_amount || id == R.id.exo_ffwd || id == R.id.exo_ffwd_with_amount;
    }

    /* renamed from: a */
    public final void m4724a(float f8) {
        ViewGroup viewGroup = this.f9578h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f8) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f9579i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f8);
        }
        ViewGroup viewGroup3 = this.f9576f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f8);
        }
    }

    /* renamed from: b */
    public final boolean m4725b(View view) {
        return view != null && this.f9595y.contains(view);
    }

    /* renamed from: e */
    public final void m4726e(Runnable runnable, long j) {
        if (j >= 0) {
            this.f9571a.postDelayed(runnable, j);
        }
    }

    /* renamed from: f */
    public final void m4727f() {
        RunnableC2628p runnableC2628p = this.f9593w;
        C2627o c2627o = this.f9571a;
        c2627o.removeCallbacks(runnableC2628p);
        c2627o.removeCallbacks(this.f9590t);
        c2627o.removeCallbacks(this.f9592v);
        c2627o.removeCallbacks(this.f9591u);
    }

    /* renamed from: g */
    public final void m4728g() {
        if (this.f9596z == 3) {
            return;
        }
        m4727f();
        int showTimeoutMs = this.f9571a.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f9570C) {
                m4726e(this.f9593w, showTimeoutMs);
            } else if (this.f9596z == 1) {
                m4726e(this.f9591u, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
            } else {
                m4726e(this.f9592v, showTimeoutMs);
            }
        }
    }

    /* renamed from: h */
    public final void m4729h(View view, boolean z7) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f9595y;
        if (!z7) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f9568A && m4723j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* renamed from: i */
    public final void m4730i(int i) {
        int i4 = this.f9596z;
        this.f9596z = i;
        C2627o c2627o = this.f9571a;
        if (i == 2) {
            c2627o.setVisibility(8);
        } else if (i4 == 2) {
            c2627o.setVisibility(0);
        }
        if (i4 != i) {
            Iterator it = c2627o.f9531m.iterator();
            while (it.hasNext()) {
                InterfaceC2626n interfaceC2626n = (InterfaceC2626n) it.next();
                c2627o.getVisibility();
                ((ViewOnClickListenerC2634v) interfaceC2626n).f9600l.m1051l();
            }
        }
    }

    /* renamed from: k */
    public final void m4731k() {
        if (!this.f9570C) {
            m4730i(0);
            m4728g();
            return;
        }
        int i = this.f9596z;
        if (i == 1) {
            this.f9585o.start();
        } else if (i == 2) {
            this.f9586p.start();
        } else if (i == 3) {
            this.f9569B = true;
        } else if (i == 4) {
            return;
        }
        m4728g();
    }
}
