package p017b6;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.lifecycle.RunnableC0127c0;
import com.bumptech.glide.AbstractC0714c;
import com.exotv.net.R;
import com.google.android.material.textfield.TextInputLayout;
import p042e5.AbstractC0910a;
import p114n0.C1952d;
import p171t5.AbstractC2436a;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.o */
/* loaded from: classes.dex */
public final class C0615o extends AbstractC0621u {

    /* renamed from: e */
    public final int f2420e;

    /* renamed from: f */
    public final int f2421f;

    /* renamed from: g */
    public final TimeInterpolator f2422g;

    /* renamed from: h */
    public AutoCompleteTextView f2423h;

    /* renamed from: i */
    public final ViewOnClickListenerC0591a f2424i;

    /* renamed from: j */
    public final ViewOnFocusChangeListenerC0593b f2425j;

    /* renamed from: k */
    public final AccessibilityManagerTouchExplorationStateChangeListenerC0613m f2426k;

    /* renamed from: l */
    public boolean f2427l;

    /* renamed from: m */
    public boolean f2428m;

    /* renamed from: n */
    public boolean f2429n;

    /* renamed from: o */
    public long f2430o;

    /* renamed from: p */
    public AccessibilityManager f2431p;

    /* renamed from: q */
    public ValueAnimator f2432q;

    /* renamed from: r */
    public ValueAnimator f2433r;

    /* JADX WARN: Type inference failed for: r0v2, types: [b6.m] */
    public C0615o(C0620t c0620t) {
        super(c0620t);
        int i = 1;
        this.f2424i = new ViewOnClickListenerC0591a(i, this);
        this.f2425j = new ViewOnFocusChangeListenerC0593b(i, this);
        this.f2426k = new AccessibilityManager.TouchExplorationStateChangeListener() { // from class: b6.m
            @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
            public final void onTouchExplorationStateChanged(boolean z7) {
                C0615o c0615o = this.f2417a;
                AutoCompleteTextView autoCompleteTextView = c0615o.f2423h;
                if (autoCompleteTextView == null || AbstractC0714c.m1502O(autoCompleteTextView)) {
                    return;
                }
                c0615o.f2467d.setImportantForAccessibility(z7 ? 2 : 1);
            }
        };
        this.f2430o = Long.MAX_VALUE;
        this.f2421f = AbstractC2436a.m4342q(c0620t.getContext(), R.attr.motionDurationShort3, 67);
        this.f2420e = AbstractC2436a.m4342q(c0620t.getContext(), R.attr.motionDurationShort3, 50);
        this.f2422g = AbstractC2436a.m4343r(c0620t.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0910a.f3956a);
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: a */
    public final void mo1354a() {
        if (this.f2431p.isTouchExplorationEnabled() && AbstractC0714c.m1502O(this.f2423h) && !this.f2467d.hasFocus()) {
            this.f2423h.dismissDropDown();
        }
        this.f2423h.post(new RunnableC0127c0(9, this));
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: c */
    public final int mo1340c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: d */
    public final int mo1341d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1355e() {
        return this.f2425j;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: f */
    public final View.OnClickListener mo1342f() {
        return this.f2424i;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: h */
    public final AccessibilityManager.TouchExplorationStateChangeListener mo1366h() {
        return this.f2426k;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: i */
    public final boolean mo1367i(int i) {
        return i != 0;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: k */
    public final boolean mo1344k() {
        return this.f2429n;
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: l */
    public final void mo1345l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f2423h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: b6.k
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    C0615o c0615o = this.f2415j;
                    long j = jUptimeMillis - c0615o.f2430o;
                    if (j < 0 || j > 300) {
                        c0615o.f2428m = false;
                    }
                    c0615o.m1371t();
                    c0615o.f2428m = true;
                    c0615o.f2430o = SystemClock.uptimeMillis();
                }
                return false;
            }
        });
        this.f2423h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: b6.l
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0615o c0615o = this.f2416a;
                c0615o.f2428m = true;
                c0615o.f2430o = SystemClock.uptimeMillis();
                c0615o.m1370s(false);
            }
        });
        this.f2423h.setThreshold(0);
        TextInputLayout textInputLayout = this.f2464a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f2431p.isTouchExplorationEnabled()) {
            this.f2467d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: m */
    public final void mo1368m(C1952d c1952d) {
        if (!AbstractC0714c.m1502O(this.f2423h)) {
            c1952d.m3818i(Spinner.class.getName());
        }
        if (c1952d.m3816g()) {
            c1952d.m3820k(null);
        }
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: n */
    public final void mo1369n(AccessibilityEvent accessibilityEvent) {
        if (!this.f2431p.isEnabled() || AbstractC0714c.m1502O(this.f2423h)) {
            return;
        }
        boolean z7 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f2429n && !this.f2423h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z7) {
            m1371t();
            this.f2428m = true;
            this.f2430o = SystemClock.uptimeMillis();
        }
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: q */
    public final void mo1346q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f2422g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f2421f);
        int i = 0;
        valueAnimatorOfFloat.addUpdateListener(new C0609j(i, this));
        this.f2433r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f2420e);
        valueAnimatorOfFloat2.addUpdateListener(new C0609j(i, this));
        this.f2432q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new C0614n(i, this));
        this.f2431p = (AccessibilityManager) this.f2466c.getSystemService("accessibility");
    }

    @Override // p017b6.AbstractC0621u
    /* renamed from: r */
    public final void mo1347r() {
        AutoCompleteTextView autoCompleteTextView = this.f2423h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f2423h.setOnDismissListener(null);
        }
    }

    /* renamed from: s */
    public final void m1370s(boolean z7) {
        if (this.f2429n != z7) {
            this.f2429n = z7;
            this.f2433r.cancel();
            this.f2432q.start();
        }
    }

    /* renamed from: t */
    public final void m1371t() {
        if (this.f2423h == null) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis() - this.f2430o;
        if (jUptimeMillis < 0 || jUptimeMillis > 300) {
            this.f2428m = false;
        }
        if (this.f2428m) {
            this.f2428m = false;
            return;
        }
        m1370s(!this.f2429n);
        if (!this.f2429n) {
            this.f2423h.dismissDropDown();
        } else {
            this.f2423h.requestFocus();
            this.f2423h.showDropDown();
        }
    }
}
