package p017b6;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p002a1.AbstractC0008a1;
import p002a1.ViewOnAttachStateChangeListenerC0047t0;
import p005a4.C0073c;
import p104m.C1780w0;
import p162s5.AbstractC2374l;
import p162s5.InterfaceC2363a;
import p168t2.AbstractC2429w;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: b6.t */
/* loaded from: classes.dex */
public final class C0620t extends LinearLayout {

    /* renamed from: A */
    public boolean f2442A;

    /* renamed from: B */
    public EditText f2443B;

    /* renamed from: C */
    public final AccessibilityManager f2444C;

    /* renamed from: D */
    public AccessibilityManager.TouchExplorationStateChangeListener f2445D;

    /* renamed from: E */
    public final C0617q f2446E;

    /* renamed from: j */
    public final TextInputLayout f2447j;

    /* renamed from: k */
    public final FrameLayout f2448k;

    /* renamed from: l */
    public final CheckableImageButton f2449l;

    /* renamed from: m */
    public ColorStateList f2450m;

    /* renamed from: n */
    public PorterDuff.Mode f2451n;

    /* renamed from: o */
    public View.OnLongClickListener f2452o;

    /* renamed from: p */
    public final CheckableImageButton f2453p;

    /* renamed from: q */
    public final C0619s f2454q;

    /* renamed from: r */
    public int f2455r;

    /* renamed from: s */
    public final LinkedHashSet f2456s;

    /* renamed from: t */
    public ColorStateList f2457t;

    /* renamed from: u */
    public PorterDuff.Mode f2458u;

    /* renamed from: v */
    public int f2459v;

    /* renamed from: w */
    public ImageView.ScaleType f2460w;

    /* renamed from: x */
    public View.OnLongClickListener f2461x;

    /* renamed from: y */
    public CharSequence f2462y;

    /* renamed from: z */
    public final C1780w0 f2463z;

    public C0620t(TextInputLayout textInputLayout, C0073c c0073c) {
        super(textInputLayout.getContext());
        this.f2455r = 0;
        this.f2456s = new LinkedHashSet();
        this.f2446E = new C0617q(this);
        C0618r c0618r = new C0618r(this);
        this.f2444C = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f2447j = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f2448k = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonM1373a = m1373a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f2449l = checkableImageButtonM1373a;
        CheckableImageButton checkableImageButtonM1373a2 = m1373a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f2453p = checkableImageButtonM1373a2;
        this.f2454q = new C0619s(this, c0073c);
        C1780w0 c1780w0 = new C1780w0(getContext(), null);
        this.f2463z = c1780w0;
        TypedArray typedArray = (TypedArray) c0073c.f325l;
        if (typedArray.hasValue(38)) {
            this.f2450m = AbstractC2429w.m4300e(getContext(), c0073c, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f2451n = AbstractC2374l.m4216f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m1382j(c0073c.m299x(37));
        }
        checkableImageButtonM1373a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonM1373a.setImportantForAccessibility(2);
        checkableImageButtonM1373a.setClickable(false);
        checkableImageButtonM1373a.setPressable(false);
        checkableImageButtonM1373a.setCheckable(false);
        checkableImageButtonM1373a.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.f2457t = AbstractC2429w.m4300e(getContext(), c0073c, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f2458u = AbstractC2374l.m4216f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            m1380h(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27)) {
                m1379g(typedArray.getText(27));
            }
            checkableImageButtonM1373a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.f2457t = AbstractC2429w.m4300e(getContext(), c0073c, 55);
            }
            if (typedArray.hasValue(56)) {
                this.f2458u = AbstractC2374l.m4216f(typedArray.getInt(56, -1), null);
            }
            m1380h(typedArray.getBoolean(54, false) ? 1 : 0);
            m1379g(typedArray.getText(52));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f2459v) {
            this.f2459v = dimensionPixelSize;
            checkableImageButtonM1373a2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM1373a2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonM1373a.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonM1373a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeM1390b = AbstractC0622v.m1390b(typedArray.getInt(31, -1));
            this.f2460w = scaleTypeM1390b;
            checkableImageButtonM1373a2.setScaleType(scaleTypeM1390b);
            checkableImageButtonM1373a.setScaleType(scaleTypeM1390b);
        }
        c1780w0.setVisibility(8);
        c1780w0.setId(R.id.textinput_suffix_text);
        c1780w0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c1780w0.setAccessibilityLiveRegion(1);
        c1780w0.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            c1780w0.setTextColor(c0073c.m298w(74));
        }
        CharSequence text = typedArray.getText(72);
        this.f2462y = TextUtils.isEmpty(text) ? null : text;
        c1780w0.setText(text);
        m1387o();
        frameLayout.addView(checkableImageButtonM1373a2);
        addView(c1780w0);
        addView(frameLayout);
        addView(checkableImageButtonM1373a);
        final int i = 0;
        checkableImageButtonM1373a.setOnFocusableChangedListener(new InterfaceC2363a(this) { // from class: b6.p

            /* renamed from: k */
            public final /* synthetic */ C0620t f2435k;

            {
                this.f2435k = this;
            }

            @Override // p162s5.InterfaceC2363a
            /* renamed from: b */
            public final void mo996b() {
                switch (i) {
                    case 0:
                        C0620t c0620t = this.f2435k;
                        CheckableImageButton checkableImageButton = c0620t.f2449l;
                        AbstractC0622v.m1407s(checkableImageButton, c0620t.f2452o, checkableImageButton.getContentDescription());
                        break;
                    default:
                        C0620t c0620t2 = this.f2435k;
                        CheckableImageButton checkableImageButton2 = c0620t2.f2453p;
                        AbstractC0622v.m1407s(checkableImageButton2, c0620t2.f2461x, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        final int i4 = 1;
        checkableImageButtonM1373a2.setOnFocusableChangedListener(new InterfaceC2363a(this) { // from class: b6.p

            /* renamed from: k */
            public final /* synthetic */ C0620t f2435k;

            {
                this.f2435k = this;
            }

            @Override // p162s5.InterfaceC2363a
            /* renamed from: b */
            public final void mo996b() {
                switch (i4) {
                    case 0:
                        C0620t c0620t = this.f2435k;
                        CheckableImageButton checkableImageButton = c0620t.f2449l;
                        AbstractC0622v.m1407s(checkableImageButton, c0620t.f2452o, checkableImageButton.getContentDescription());
                        break;
                    default:
                        C0620t c0620t2 = this.f2435k;
                        CheckableImageButton checkableImageButton2 = c0620t2.f2453p;
                        AbstractC0622v.m1407s(checkableImageButton2, c0620t2.f2461x, checkableImageButton2.getContentDescription());
                        break;
                }
            }
        });
        textInputLayout.f3462o0.add(c0618r);
        if (textInputLayout.f3459n != null) {
            c0618r.m1372a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0047t0(1, this));
    }

    /* renamed from: a */
    public final CheckableImageButton m1373a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC2429w.m4307l(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public final AbstractC0621u m1374b() {
        AbstractC0621u c0601f;
        int i = this.f2455r;
        C0619s c0619s = this.f2454q;
        SparseArray sparseArray = (SparseArray) c0619s.f2440c;
        AbstractC0621u abstractC0621u = (AbstractC0621u) sparseArray.get(i);
        if (abstractC0621u != null) {
            return abstractC0621u;
        }
        C0620t c0620t = (C0620t) c0619s.f2441d;
        if (i == -1) {
            c0601f = new C0601f(c0620t, 0);
        } else if (i == 0) {
            c0601f = new C0601f(c0620t, 1);
        } else if (i == 1) {
            c0601f = new C0594b0(c0620t, c0619s.f2439b);
        } else if (i == 2) {
            c0601f = new C0599e(c0620t);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC0008a1.m12h(i, "Invalid end icon mode: "));
            }
            c0601f = new C0615o(c0620t);
        }
        sparseArray.append(i, c0601f);
        return c0601f;
    }

    /* renamed from: c */
    public final int m1375c() {
        int marginStart;
        if (m1376d() || m1377e()) {
            CheckableImageButton checkableImageButton = this.f2453p;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.f2463z.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* renamed from: d */
    public final boolean m1376d() {
        return this.f2448k.getVisibility() == 0 && this.f2453p.getVisibility() == 0;
    }

    /* renamed from: e */
    public final boolean m1377e() {
        return this.f2449l.getVisibility() == 0;
    }

    /* renamed from: f */
    public final void m1378f(boolean z7) {
        boolean z8;
        boolean zIsActivated;
        boolean z9;
        AbstractC0621u abstractC0621uM1374b = m1374b();
        boolean zMo1343j = abstractC0621uM1374b.mo1343j();
        CheckableImageButton checkableImageButton = this.f2453p;
        boolean z10 = true;
        if (!zMo1343j || (z9 = checkableImageButton.f3359m) == abstractC0621uM1374b.mo1344k()) {
            z8 = false;
        } else {
            checkableImageButton.setChecked(!z9);
            z8 = true;
        }
        if (!(abstractC0621uM1374b instanceof C0615o) || (zIsActivated = checkableImageButton.isActivated()) == ((C0615o) abstractC0621uM1374b).f2427l) {
            z10 = z8;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z7 || z10) {
            AbstractC0622v.m1398j(this.f2447j, checkableImageButton, this.f2457t);
        }
    }

    /* renamed from: g */
    public final void m1379g(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2453p;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
            AbstractC0622v.m1407s(checkableImageButton, this.f2461x, charSequence);
        }
    }

    /* renamed from: h */
    public final void m1380h(int i) {
        if (this.f2455r == i) {
            return;
        }
        AbstractC0621u abstractC0621uM1374b = m1374b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f2445D;
        AccessibilityManager accessibilityManager = this.f2444C;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.f2445D = null;
        abstractC0621uM1374b.mo1347r();
        this.f2455r = i;
        Iterator it = this.f2456s.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m1381i(i != 0);
        AbstractC0621u abstractC0621uM1374b2 = m1374b();
        int iMo1341d = this.f2454q.f2438a;
        if (iMo1341d == 0) {
            iMo1341d = abstractC0621uM1374b2.mo1341d();
        }
        Drawable drawableM1542D = iMo1341d != 0 ? AbstractC0715d.m1542D(getContext(), iMo1341d) : null;
        CheckableImageButton checkableImageButton = this.f2453p;
        checkableImageButton.setImageDrawable(drawableM1542D);
        TextInputLayout textInputLayout = this.f2447j;
        if (drawableM1542D != null) {
            AbstractC0622v.m1389a(textInputLayout, checkableImageButton, this.f2457t, this.f2458u);
            AbstractC0622v.m1398j(textInputLayout, checkableImageButton, this.f2457t);
        }
        checkableImageButton.setCheckable(abstractC0621uM1374b2.mo1343j());
        if (!abstractC0621uM1374b2.mo1367i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        abstractC0621uM1374b2.mo1346q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerMo1366h = abstractC0621uM1374b2.mo1366h();
        this.f2445D = touchExplorationStateChangeListenerMo1366h;
        if (touchExplorationStateChangeListenerMo1366h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.f2445D);
        }
        View.OnClickListener onClickListenerMo1342f = abstractC0621uM1374b2.mo1342f();
        View.OnLongClickListener onLongClickListener = this.f2461x;
        checkableImageButton.setOnClickListener(onClickListenerMo1342f);
        AbstractC0622v.m1401m(checkableImageButton, onLongClickListener);
        int iMo1340c = abstractC0621uM1374b2.mo1340c();
        m1379g(iMo1340c != 0 ? getResources().getText(iMo1340c) : null);
        EditText editText = this.f2443B;
        if (editText != null) {
            abstractC0621uM1374b2.mo1345l(editText);
            m1383k(abstractC0621uM1374b2);
        }
        AbstractC0622v.m1389a(textInputLayout, checkableImageButton, this.f2457t, this.f2458u);
        m1378f(true);
    }

    /* renamed from: i */
    public final void m1381i(boolean z7) {
        EditText editText;
        if (m1376d() != z7) {
            CheckableImageButton checkableImageButton = this.f2453p;
            if (!z7 && checkableImageButton.hasFocus() && (editText = this.f2443B) != null) {
                editText.requestFocus();
            }
            checkableImageButton.setVisibility(z7 ? 0 : 8);
            m1384l();
            m1386n();
            this.f2447j.m1909s();
        }
    }

    /* renamed from: j */
    public final void m1382j(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f2449l;
        checkableImageButton.setImageDrawable(drawable);
        m1385m();
        AbstractC0622v.m1389a(this.f2447j, checkableImageButton, this.f2450m, this.f2451n);
    }

    /* renamed from: k */
    public final void m1383k(AbstractC0621u abstractC0621u) {
        if (this.f2443B == null) {
            return;
        }
        if (abstractC0621u.mo1355e() != null) {
            this.f2443B.setOnFocusChangeListener(abstractC0621u.mo1355e());
        }
        if (abstractC0621u.mo1356g() != null) {
            this.f2453p.setOnFocusChangeListener(abstractC0621u.mo1356g());
        }
    }

    /* renamed from: l */
    public final void m1384l() {
        this.f2448k.setVisibility((this.f2453p.getVisibility() != 0 || m1377e()) ? 8 : 0);
        setVisibility((m1376d() || m1377e() || !((this.f2462y == null || this.f2442A) ? 8 : false)) ? 0 : 8);
    }

    /* renamed from: m */
    public final void m1385m() {
        CheckableImageButton checkableImageButton = this.f2449l;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f2447j;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f3471t.f2491q && textInputLayout.m1905o()) ? 0 : 8);
        m1384l();
        m1386n();
        if (this.f2455r != 0) {
            return;
        }
        textInputLayout.m1909s();
    }

    /* renamed from: n */
    public final void m1386n() {
        TextInputLayout textInputLayout = this.f2447j;
        if (textInputLayout.f3459n == null) {
            return;
        }
        this.f2463z.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.f3459n.getPaddingTop(), (m1376d() || m1377e()) ? 0 : textInputLayout.f3459n.getPaddingEnd(), textInputLayout.f3459n.getPaddingBottom());
    }

    /* renamed from: o */
    public final void m1387o() {
        C1780w0 c1780w0 = this.f2463z;
        int visibility = c1780w0.getVisibility();
        int i = (this.f2462y == null || this.f2442A) ? 8 : 0;
        if (visibility != i) {
            m1374b().mo1357o(i == 0);
        }
        m1384l();
        c1780w0.setVisibility(i);
        this.f2447j.m1909s();
    }
}
