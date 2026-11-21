package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.support.v4.media.session.AbstractC0120b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import com.bumptech.glide.AbstractC0715d;
import com.exotv.net.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0754l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p002a1.C0021g0;
import p002a1.RunnableC0018f;
import p005a4.C0073c;
import p010b.C0527q;
import p054g.AbstractC1026a;
import p062h.AbstractC1086l;
import p087k.C1543h;
import p095l.C1630p;
import p095l.MenuC1627m;
import p104m.AbstractC1763q2;
import p104m.C1719f2;
import p104m.C1723g2;
import p104m.C1727h2;
import p104m.C1735j2;
import p104m.C1736k;
import p104m.C1743l2;
import p104m.C1780w0;
import p104m.C1782x;
import p104m.C1785y;
import p104m.C1790z1;
import p104m.InterfaceC1710d1;
import p104m.InterfaceC1731i2;
import p104m.RunnableC1715e2;
import p104m.ViewOnClickListenerC1739k2;
import p105m0.AbstractC1828m0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* renamed from: A */
    public int f736A;

    /* renamed from: B */
    public int f737B;

    /* renamed from: C */
    public C1790z1 f738C;

    /* renamed from: D */
    public int f739D;

    /* renamed from: E */
    public int f740E;

    /* renamed from: F */
    public final int f741F;

    /* renamed from: G */
    public CharSequence f742G;

    /* renamed from: H */
    public CharSequence f743H;

    /* renamed from: I */
    public ColorStateList f744I;

    /* renamed from: J */
    public ColorStateList f745J;

    /* renamed from: K */
    public boolean f746K;

    /* renamed from: L */
    public boolean f747L;

    /* renamed from: M */
    public final ArrayList f748M;

    /* renamed from: N */
    public final ArrayList f749N;

    /* renamed from: O */
    public final int[] f750O;

    /* renamed from: P */
    public final C0073c f751P;

    /* renamed from: Q */
    public ArrayList f752Q;

    /* renamed from: R */
    public final C1719f2 f753R;

    /* renamed from: S */
    public C1743l2 f754S;

    /* renamed from: T */
    public C1736k f755T;

    /* renamed from: U */
    public C1723g2 f756U;

    /* renamed from: V */
    public boolean f757V;

    /* renamed from: W */
    public C0527q f758W;

    /* renamed from: a0 */
    public OnBackInvokedDispatcher f759a0;

    /* renamed from: b0 */
    public boolean f760b0;

    /* renamed from: c0 */
    public final RunnableC0018f f761c0;

    /* renamed from: j */
    public ActionMenuView f762j;

    /* renamed from: k */
    public C1780w0 f763k;

    /* renamed from: l */
    public C1780w0 f764l;

    /* renamed from: m */
    public C1782x f765m;

    /* renamed from: n */
    public C1785y f766n;

    /* renamed from: o */
    public final Drawable f767o;

    /* renamed from: p */
    public final CharSequence f768p;

    /* renamed from: q */
    public C1782x f769q;

    /* renamed from: r */
    public View f770r;

    /* renamed from: s */
    public Context f771s;

    /* renamed from: t */
    public int f772t;

    /* renamed from: u */
    public int f773u;

    /* renamed from: v */
    public int f774v;

    /* renamed from: w */
    public final int f775w;

    /* renamed from: x */
    public final int f776x;

    /* renamed from: y */
    public int f777y;

    /* renamed from: z */
    public int f778z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new C1543h(getContext());
    }

    /* renamed from: h */
    public static C1727h2 m473h() {
        C1727h2 c1727h2 = new C1727h2(-2, -2);
        c1727h2.f6562b = 0;
        c1727h2.f6561a = 8388627;
        return c1727h2;
    }

    /* renamed from: i */
    public static C1727h2 m474i(ViewGroup.LayoutParams layoutParams) {
        boolean z7 = layoutParams instanceof C1727h2;
        if (z7) {
            C1727h2 c1727h2 = (C1727h2) layoutParams;
            C1727h2 c1727h22 = new C1727h2(c1727h2);
            c1727h22.f6562b = 0;
            c1727h22.f6562b = c1727h2.f6562b;
            return c1727h22;
        }
        if (z7) {
            C1727h2 c1727h23 = new C1727h2((C1727h2) layoutParams);
            c1727h23.f6562b = 0;
            return c1727h23;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            C1727h2 c1727h24 = new C1727h2(layoutParams);
            c1727h24.f6562b = 0;
            return c1727h24;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C1727h2 c1727h25 = new C1727h2(marginLayoutParams);
        c1727h25.f6562b = 0;
        ((ViewGroup.MarginLayoutParams) c1727h25).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) c1727h25).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) c1727h25).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) c1727h25).bottomMargin = marginLayoutParams.bottomMargin;
        return c1727h25;
    }

    /* renamed from: k */
    public static int m475k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginEnd() + marginLayoutParams.getMarginStart();
    }

    /* renamed from: l */
    public static int m476l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    /* renamed from: a */
    public final void m477a(int i, ArrayList arrayList) {
        boolean z7 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, getLayoutDirection());
        arrayList.clear();
        if (!z7) {
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                C1727h2 c1727h2 = (C1727h2) childAt.getLayoutParams();
                if (c1727h2.f6562b == 0 && m491s(childAt)) {
                    int i8 = c1727h2.f6561a;
                    int layoutDirection = getLayoutDirection();
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i8, layoutDirection) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = layoutDirection == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            C1727h2 c1727h22 = (C1727h2) childAt2.getLayoutParams();
            if (c1727h22.f6562b == 0 && m491s(childAt2)) {
                int i10 = c1727h22.f6561a;
                int layoutDirection2 = getLayoutDirection();
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i10, layoutDirection2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = layoutDirection2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void m478b(View view, boolean z7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        C1727h2 c1727h2M473h = layoutParams == null ? m473h() : !checkLayoutParams(layoutParams) ? m474i(layoutParams) : (C1727h2) layoutParams;
        c1727h2M473h.f6562b = 1;
        if (!z7 || this.f770r == null) {
            addView(view, c1727h2M473h);
        } else {
            view.setLayoutParams(c1727h2M473h);
            this.f749N.add(view);
        }
    }

    /* renamed from: c */
    public final void m479c() {
        if (this.f769q == null) {
            C1782x c1782x = new C1782x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f769q = c1782x;
            c1782x.setImageDrawable(this.f767o);
            this.f769q.setContentDescription(this.f768p);
            C1727h2 c1727h2M473h = m473h();
            c1727h2M473h.f6561a = (this.f775w & 112) | 8388611;
            c1727h2M473h.f6562b = 2;
            this.f769q.setLayoutParams(c1727h2M473h);
            this.f769q.setOnClickListener(new ViewOnClickListenerC0754l(3, this));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof C1727h2);
    }

    /* renamed from: d */
    public final void m480d() {
        if (this.f738C == null) {
            C1790z1 c1790z1 = new C1790z1();
            c1790z1.f6835a = 0;
            c1790z1.f6836b = 0;
            c1790z1.f6837c = Integer.MIN_VALUE;
            c1790z1.f6838d = Integer.MIN_VALUE;
            c1790z1.f6839e = 0;
            c1790z1.f6840f = 0;
            c1790z1.f6841g = false;
            c1790z1.f6842h = false;
            this.f738C = c1790z1;
        }
    }

    /* renamed from: e */
    public final void m481e() {
        m482f();
        ActionMenuView actionMenuView = this.f762j;
        if (actionMenuView.f719y == null) {
            MenuC1627m menuC1627m = (MenuC1627m) actionMenuView.getMenu();
            if (this.f756U == null) {
                this.f756U = new C1723g2(this);
            }
            this.f762j.setExpandedActionViewsExclusive(true);
            menuC1627m.m3307b(this.f756U, this.f771s);
            m492t();
        }
    }

    /* renamed from: f */
    public final void m482f() {
        if (this.f762j == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f762j = actionMenuView;
            actionMenuView.setPopupTheme(this.f772t);
            this.f762j.setOnMenuItemClickListener(this.f753R);
            ActionMenuView actionMenuView2 = this.f762j;
            C1719f2 c1719f2 = new C1719f2(this);
            actionMenuView2.getClass();
            actionMenuView2.f713D = c1719f2;
            C1727h2 c1727h2M473h = m473h();
            c1727h2M473h.f6561a = (this.f775w & 112) | 8388613;
            this.f762j.setLayoutParams(c1727h2M473h);
            m478b(this.f762j, false);
        }
    }

    /* renamed from: g */
    public final void m483g() {
        if (this.f765m == null) {
            this.f765m = new C1782x(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            C1727h2 c1727h2M473h = m473h();
            c1727h2M473h.f6561a = (this.f775w & 112) | 8388611;
            this.f765m.setLayoutParams(c1727h2M473h);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m473h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m474i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        C1782x c1782x = this.f769q;
        if (c1782x != null) {
            return c1782x.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        C1782x c1782x = this.f769q;
        if (c1782x != null) {
            return c1782x.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C1790z1 c1790z1 = this.f738C;
        if (c1790z1 != null) {
            return c1790z1.f6841g ? c1790z1.f6835a : c1790z1.f6836b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.f740E;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        C1790z1 c1790z1 = this.f738C;
        if (c1790z1 != null) {
            return c1790z1.f6835a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C1790z1 c1790z1 = this.f738C;
        if (c1790z1 != null) {
            return c1790z1.f6836b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C1790z1 c1790z1 = this.f738C;
        if (c1790z1 != null) {
            return c1790z1.f6841g ? c1790z1.f6836b : c1790z1.f6835a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.f739D;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        MenuC1627m menuC1627m;
        ActionMenuView actionMenuView = this.f762j;
        return (actionMenuView == null || (menuC1627m = actionMenuView.f719y) == null || !menuC1627m.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f740E, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f739D, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        C1785y c1785y = this.f766n;
        if (c1785y != null) {
            return c1785y.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        C1785y c1785y = this.f766n;
        if (c1785y != null) {
            return c1785y.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        m481e();
        return this.f762j.getMenu();
    }

    public View getNavButtonView() {
        return this.f765m;
    }

    public CharSequence getNavigationContentDescription() {
        C1782x c1782x = this.f765m;
        if (c1782x != null) {
            return c1782x.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        C1782x c1782x = this.f765m;
        if (c1782x != null) {
            return c1782x.getDrawable();
        }
        return null;
    }

    public C1736k getOuterActionMenuPresenter() {
        return this.f755T;
    }

    public Drawable getOverflowIcon() {
        m481e();
        return this.f762j.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f771s;
    }

    public int getPopupTheme() {
        return this.f772t;
    }

    public CharSequence getSubtitle() {
        return this.f743H;
    }

    public final TextView getSubtitleTextView() {
        return this.f764l;
    }

    public CharSequence getTitle() {
        return this.f742G;
    }

    public int getTitleMarginBottom() {
        return this.f737B;
    }

    public int getTitleMarginEnd() {
        return this.f778z;
    }

    public int getTitleMarginStart() {
        return this.f777y;
    }

    public int getTitleMarginTop() {
        return this.f736A;
    }

    public final TextView getTitleTextView() {
        return this.f763k;
    }

    public InterfaceC1710d1 getWrapper() {
        Drawable drawable;
        if (this.f754S == null) {
            C1743l2 c1743l2 = new C1743l2();
            c1743l2.f6639n = 0;
            c1743l2.f6626a = this;
            c1743l2.f6633h = getTitle();
            c1743l2.f6634i = getSubtitle();
            c1743l2.f6632g = c1743l2.f6633h != null;
            c1743l2.f6631f = getNavigationIcon();
            C0073c c0073cM263F = C0073c.m263F(R.attr.actionBarStyle, 0, getContext(), null, AbstractC1026a.f4308a);
            TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
            c1743l2.f6640o = c0073cM263F.m299x(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                c1743l2.f6632g = true;
                c1743l2.f6633h = text;
                if ((c1743l2.f6627b & 8) != 0) {
                    setTitle(text);
                    if (c1743l2.f6632g) {
                        AbstractC1828m0.m3609n(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                c1743l2.f6634i = text2;
                if ((c1743l2.f6627b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableM299x = c0073cM263F.m299x(20);
            if (drawableM299x != null) {
                c1743l2.f6630e = drawableM299x;
                c1743l2.m3422c();
            }
            Drawable drawableM299x2 = c0073cM263F.m299x(17);
            if (drawableM299x2 != null) {
                c1743l2.f6629d = drawableM299x2;
                c1743l2.m3422c();
            }
            if (c1743l2.f6631f == null && (drawable = c1743l2.f6640o) != null) {
                c1743l2.f6631f = drawable;
                if ((c1743l2.f6627b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            c1743l2.m3420a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = c1743l2.f6628c;
                if (view != null && (c1743l2.f6627b & 16) != 0) {
                    removeView(view);
                }
                c1743l2.f6628c = viewInflate;
                if (viewInflate != null && (c1743l2.f6627b & 16) != 0) {
                    addView(viewInflate);
                }
                c1743l2.m3420a(c1743l2.f6627b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                m480d();
                this.f738C.m3495a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f773u = resourceId2;
                C1780w0 c1780w0 = this.f763k;
                if (c1780w0 != null) {
                    c1780w0.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f774v = resourceId3;
                C1780w0 c1780w02 = this.f764l;
                if (c1780w02 != null) {
                    c1780w02.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            c0073cM263F.m275I();
            if (R.string.abc_action_bar_up_description != c1743l2.f6639n) {
                c1743l2.f6639n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = c1743l2.f6639n;
                    c1743l2.f6635j = i != 0 ? getContext().getString(i) : null;
                    c1743l2.m3421b();
                }
            }
            c1743l2.f6635j = getNavigationContentDescription();
            setNavigationOnClickListener(new ViewOnClickListenerC1739k2(c1743l2));
            this.f754S = c1743l2;
        }
        return this.f754S;
    }

    /* renamed from: j */
    public final int m484j(View view, int i) {
        C1727h2 c1727h2 = (C1727h2) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i8 = c1727h2.f6561a & 112;
        if (i8 != 16 && i8 != 48 && i8 != 80) {
            i8 = this.f741F & 112;
        }
        if (i8 == 48) {
            return getPaddingTop() - i4;
        }
        if (i8 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) c1727h2).bottomMargin) - i4;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) c1727h2).topMargin;
        if (iMax < i9) {
            iMax = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) c1727h2).bottomMargin;
            if (i10 < i11) {
                iMax = Math.max(0, iMax - (i11 - i10));
            }
        }
        return paddingTop + iMax;
    }

    /* renamed from: m */
    public final void m485m() {
        ArrayList arrayList = this.f752Q;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.f751P.f326m).iterator();
        while (it.hasNext()) {
            ((C0021g0) it.next()).f77a.m144j();
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f752Q = currentMenuItems2;
    }

    /* renamed from: n */
    public final boolean m486n(View view) {
        return view.getParent() == this || this.f749N.contains(view);
    }

    /* renamed from: o */
    public final int m487o(View view, int i, int i4, int[] iArr) {
        C1727h2 c1727h2 = (C1727h2) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) c1727h2).leftMargin - iArr[0];
        int iMax = Math.max(0, i8) + i;
        iArr[0] = Math.max(0, -i8);
        int iM484j = m484j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iM484j, iMax + measuredWidth, view.getMeasuredHeight() + iM484j);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) c1727h2).rightMargin + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m492t();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f761c0);
        m492t();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f747L = false;
        }
        if (!this.f747L) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f747L = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f747L = false;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0218  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        int iM487o;
        int iM488p;
        int iMax;
        boolean zM491s;
        boolean zM491s2;
        boolean z8;
        int measuredHeight;
        int i10;
        int paddingTop;
        int i11;
        int i12;
        int i13;
        int i14;
        int size;
        int iM487o2;
        int i15;
        int size2;
        int i16;
        int size3;
        int i17;
        int i18;
        int i19;
        int size4;
        boolean z9 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i20 = width - paddingRight;
        int[] iArr = this.f750O;
        iArr[1] = 0;
        iArr[0] = 0;
        WeakHashMap weakHashMap = AbstractC1828m0.f6911a;
        int minimumHeight = getMinimumHeight();
        int iMin = minimumHeight >= 0 ? Math.min(minimumHeight, i9 - i4) : 0;
        if (!m491s(this.f765m)) {
            iM487o = paddingLeft;
        } else {
            if (z9) {
                iM488p = m488p(this.f765m, i20, iMin, iArr);
                iM487o = paddingLeft;
                if (m491s(this.f769q)) {
                    if (z9) {
                        iM488p = m488p(this.f769q, iM488p, iMin, iArr);
                    } else {
                        iM487o = m487o(this.f769q, iM487o, iMin, iArr);
                    }
                }
                if (m491s(this.f762j)) {
                    if (z9) {
                        iM487o = m487o(this.f762j, iM487o, iMin, iArr);
                    } else {
                        iM488p = m488p(this.f762j, iM488p, iMin, iArr);
                    }
                }
                int currentContentInsetLeft = getCurrentContentInsetLeft();
                int currentContentInsetRight = getCurrentContentInsetRight();
                iArr[0] = Math.max(0, currentContentInsetLeft - iM487o);
                iArr[1] = Math.max(0, currentContentInsetRight - (i20 - iM488p));
                iMax = Math.max(iM487o, currentContentInsetLeft);
                int iMin2 = Math.min(iM488p, i20 - currentContentInsetRight);
                if (m491s(this.f770r)) {
                    if (z9) {
                        iMin2 = m488p(this.f770r, iMin2, iMin, iArr);
                    } else {
                        iMax = m487o(this.f770r, iMax, iMin, iArr);
                    }
                }
                if (m491s(this.f766n)) {
                    if (z9) {
                        iMin2 = m488p(this.f766n, iMin2, iMin, iArr);
                    } else {
                        iMax = m487o(this.f766n, iMax, iMin, iArr);
                    }
                }
                zM491s = m491s(this.f763k);
                zM491s2 = m491s(this.f764l);
                if (zM491s) {
                    z8 = z9;
                    measuredHeight = 0;
                } else {
                    C1727h2 c1727h2 = (C1727h2) this.f763k.getLayoutParams();
                    z8 = z9;
                    measuredHeight = this.f763k.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1727h2).topMargin + ((ViewGroup.MarginLayoutParams) c1727h2).bottomMargin;
                }
                if (!zM491s2) {
                    C1727h2 c1727h22 = (C1727h2) this.f764l.getLayoutParams();
                    measuredHeight = this.f764l.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c1727h22).topMargin + ((ViewGroup.MarginLayoutParams) c1727h22).bottomMargin + measuredHeight;
                }
                if (!zM491s || zM491s2) {
                    C1780w0 c1780w0 = !zM491s ? this.f763k : this.f764l;
                    C1780w0 c1780w02 = !zM491s2 ? this.f764l : this.f763k;
                    C1727h2 c1727h23 = (C1727h2) c1780w0.getLayoutParams();
                    C1727h2 c1727h24 = (C1727h2) c1780w02.getLayoutParams();
                    int i21 = measuredHeight;
                    boolean z10 = (zM491s && this.f763k.getMeasuredWidth() > 0) || (zM491s2 && this.f764l.getMeasuredWidth() > 0);
                    i10 = this.f741F & 112;
                    int i22 = iMax;
                    if (i10 == 48) {
                        paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) c1727h23).topMargin + this.f736A;
                    } else if (i10 != 80) {
                        int iMax2 = (((height - paddingTop2) - paddingBottom) - i21) / 2;
                        int i23 = ((ViewGroup.MarginLayoutParams) c1727h23).topMargin + this.f736A;
                        if (iMax2 < i23) {
                            iMax2 = i23;
                        } else {
                            int i24 = (((height - paddingBottom) - i21) - iMax2) - paddingTop2;
                            int i25 = ((ViewGroup.MarginLayoutParams) c1727h23).bottomMargin;
                            int i26 = this.f737B;
                            if (i24 < i25 + i26) {
                                iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) c1727h24).bottomMargin + i26) - i24));
                            }
                        }
                        paddingTop = paddingTop2 + iMax2;
                    } else {
                        paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) c1727h24).bottomMargin) - this.f737B) - i21;
                    }
                    if (z8) {
                        int i27 = (z10 ? this.f777y : 0) - iArr[1];
                        iMin2 -= Math.max(0, i27);
                        iArr[1] = Math.max(0, -i27);
                        if (zM491s) {
                            C1727h2 c1727h25 = (C1727h2) this.f763k.getLayoutParams();
                            int measuredWidth = iMin2 - this.f763k.getMeasuredWidth();
                            int measuredHeight2 = this.f763k.getMeasuredHeight() + paddingTop;
                            this.f763k.layout(measuredWidth, paddingTop, iMin2, measuredHeight2);
                            i13 = measuredWidth - this.f778z;
                            paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) c1727h25).bottomMargin;
                        } else {
                            i13 = iMin2;
                        }
                        if (zM491s2) {
                            int i28 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1727h2) this.f764l.getLayoutParams())).topMargin;
                            this.f764l.layout(iMin2 - this.f764l.getMeasuredWidth(), i28, iMin2, this.f764l.getMeasuredHeight() + i28);
                            i14 = iMin2 - this.f778z;
                        } else {
                            i14 = iMin2;
                        }
                        if (z10) {
                            iMin2 = Math.min(i13, i14);
                        }
                        iMax = i22;
                    } else {
                        int i29 = (z10 ? this.f777y : 0) - iArr[0];
                        iMax = Math.max(0, i29) + i22;
                        iArr[0] = Math.max(0, -i29);
                        if (zM491s) {
                            C1727h2 c1727h26 = (C1727h2) this.f763k.getLayoutParams();
                            int measuredWidth2 = this.f763k.getMeasuredWidth() + iMax;
                            int measuredHeight3 = this.f763k.getMeasuredHeight() + paddingTop;
                            this.f763k.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                            i11 = measuredWidth2 + this.f778z;
                            paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) c1727h26).bottomMargin;
                        } else {
                            i11 = iMax;
                        }
                        if (zM491s2) {
                            int i30 = paddingTop + ((ViewGroup.MarginLayoutParams) ((C1727h2) this.f764l.getLayoutParams())).topMargin;
                            int measuredWidth3 = this.f764l.getMeasuredWidth() + iMax;
                            this.f764l.layout(iMax, i30, measuredWidth3, this.f764l.getMeasuredHeight() + i30);
                            i12 = measuredWidth3 + this.f778z;
                        } else {
                            i12 = iMax;
                        }
                        if (z10) {
                            iMax = Math.max(i11, i12);
                        }
                    }
                }
                ArrayList arrayList = this.f748M;
                m477a(3, arrayList);
                size = arrayList.size();
                iM487o2 = iMax;
                for (i15 = 0; i15 < size; i15++) {
                    iM487o2 = m487o((View) arrayList.get(i15), iM487o2, iMin, iArr);
                }
                m477a(5, arrayList);
                size2 = arrayList.size();
                for (i16 = 0; i16 < size2; i16++) {
                    iMin2 = m488p((View) arrayList.get(i16), iMin2, iMin, iArr);
                }
                m477a(1, arrayList);
                int i31 = iArr[0];
                int i32 = iArr[1];
                size3 = arrayList.size();
                int i33 = i31;
                i17 = 0;
                int measuredWidth4 = 0;
                while (i17 < size3) {
                    View view = (View) arrayList.get(i17);
                    C1727h2 c1727h27 = (C1727h2) view.getLayoutParams();
                    int i34 = i32;
                    int i35 = ((ViewGroup.MarginLayoutParams) c1727h27).leftMargin - i33;
                    int i36 = ((ViewGroup.MarginLayoutParams) c1727h27).rightMargin - i34;
                    int iMax3 = Math.max(0, i35);
                    int iMax4 = Math.max(0, i36);
                    int iMax5 = Math.max(0, -i35);
                    int iMax6 = Math.max(0, -i36);
                    measuredWidth4 += view.getMeasuredWidth() + iMax3 + iMax4;
                    i17++;
                    i33 = iMax5;
                    i32 = iMax6;
                }
                i19 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth4 / 2);
                int i37 = measuredWidth4 + i19;
                if (i19 >= iM487o2) {
                    iM487o2 = i37 > iMin2 ? i19 - (i37 - iMin2) : i19;
                }
                size4 = arrayList.size();
                for (i18 = 0; i18 < size4; i18++) {
                    iM487o2 = m487o((View) arrayList.get(i18), iM487o2, iMin, iArr);
                }
                arrayList.clear();
            }
            iM487o = m487o(this.f765m, paddingLeft, iMin, iArr);
        }
        iM488p = i20;
        if (m491s(this.f769q)) {
        }
        if (m491s(this.f762j)) {
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iM487o);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i20 - iM488p));
        iMax = Math.max(iM487o, currentContentInsetLeft2);
        int iMin22 = Math.min(iM488p, i20 - currentContentInsetRight2);
        if (m491s(this.f770r)) {
        }
        if (m491s(this.f766n)) {
        }
        zM491s = m491s(this.f763k);
        zM491s2 = m491s(this.f764l);
        if (zM491s) {
        }
        if (!zM491s2) {
        }
        if (!zM491s) {
            if (!zM491s) {
            }
            if (!zM491s2) {
            }
            C1727h2 c1727h232 = (C1727h2) c1780w0.getLayoutParams();
            C1727h2 c1727h242 = (C1727h2) c1780w02.getLayoutParams();
            int i212 = measuredHeight;
            if (zM491s) {
                i10 = this.f741F & 112;
                int i222 = iMax;
                if (i10 == 48) {
                }
                if (z8) {
                }
            } else {
                i10 = this.f741F & 112;
                int i2222 = iMax;
                if (i10 == 48) {
                }
                if (z8) {
                }
            }
        }
        ArrayList arrayList2 = this.f748M;
        m477a(3, arrayList2);
        size = arrayList2.size();
        iM487o2 = iMax;
        while (i15 < size) {
        }
        m477a(5, arrayList2);
        size2 = arrayList2.size();
        while (i16 < size2) {
        }
        m477a(1, arrayList2);
        int i312 = iArr[0];
        int i322 = iArr[1];
        size3 = arrayList2.size();
        int i332 = i312;
        i17 = 0;
        int measuredWidth42 = 0;
        while (i17 < size3) {
        }
        i19 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth42 / 2);
        int i372 = measuredWidth42 + i19;
        if (i19 >= iM487o2) {
        }
        size4 = arrayList2.size();
        while (i18 < size4) {
        }
        arrayList2.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public final void onMeasure(int i, int i4) {
        char c8;
        Object[] objArr;
        int iM475k;
        int iMax;
        int iCombineMeasuredStates;
        int iM475k2;
        int i8;
        int iM476l;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean z7 = AbstractC1763q2.f6715a;
        int i9 = 0;
        if (getLayoutDirection() == 1) {
            objArr = true;
            c8 = 0;
        } else {
            c8 = 1;
            objArr = false;
        }
        if (m491s(this.f765m)) {
            m490r(this.f765m, i, 0, i4, this.f776x);
            iM475k = m475k(this.f765m) + this.f765m.getMeasuredWidth();
            iMax = Math.max(0, m476l(this.f765m) + this.f765m.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f765m.getMeasuredState());
        } else {
            iM475k = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (m491s(this.f769q)) {
            m490r(this.f769q, i, 0, i4, this.f776x);
            iM475k = m475k(this.f769q) + this.f769q.getMeasuredWidth();
            iMax = Math.max(iMax, m476l(this.f769q) + this.f769q.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f769q.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iM475k);
        int iMax4 = Math.max(0, currentContentInsetStart - iM475k);
        Object[] objArr2 = objArr;
        int[] iArr = this.f750O;
        iArr[objArr2 == true ? 1 : 0] = iMax4;
        if (m491s(this.f762j)) {
            m490r(this.f762j, i, iMax3, i4, this.f776x);
            iM475k2 = m475k(this.f762j) + this.f762j.getMeasuredWidth();
            iMax = Math.max(iMax, m476l(this.f762j) + this.f762j.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f762j.getMeasuredState());
        } else {
            iM475k2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iM475k2);
        iArr[c8] = Math.max(0, currentContentInsetEnd - iM475k2);
        if (m491s(this.f770r)) {
            iMax5 += m489q(this.f770r, i, iMax5, i4, 0, iArr);
            iMax = Math.max(iMax, m476l(this.f770r) + this.f770r.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f770r.getMeasuredState());
        }
        if (m491s(this.f766n)) {
            iMax5 += m489q(this.f766n, i, iMax5, i4, 0, iArr);
            iMax = Math.max(iMax, m476l(this.f766n) + this.f766n.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f766n.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((C1727h2) childAt.getLayoutParams()).f6562b == 0 && m491s(childAt)) {
                iMax5 += m489q(childAt, i, iMax5, i4, 0, iArr);
                int iMax6 = Math.max(iMax, m476l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i11 = iMax5;
        int i12 = this.f736A + this.f737B;
        int i13 = this.f777y + this.f778z;
        if (m491s(this.f763k)) {
            m489q(this.f763k, i, i11 + i13, i4, i12, iArr);
            i8 = i12;
            int iM475k3 = m475k(this.f763k) + this.f763k.getMeasuredWidth();
            iM476l = m476l(this.f763k) + this.f763k.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f763k.getMeasuredState());
            iMax2 = iM475k3;
        } else {
            i8 = i12;
            iM476l = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (m491s(this.f764l)) {
            iMax2 = Math.max(iMax2, m489q(this.f764l, i, i11 + i13, i4, iM476l + i8, iArr));
            iM476l += m476l(this.f764l) + this.f764l.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f764l.getMeasuredState());
        }
        if (m491s(this.f763k) || m491s(this.f764l)) {
            iM476l += i8;
        }
        int iMax7 = Math.max(iMax, iM476l);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i11 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i4, iCombineMeasuredStates2 << 16);
        if (!this.f757V) {
            i9 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i14 = 0; i14 < childCount2; i14++) {
            View childAt2 = getChildAt(i14);
            if (m491s(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i9 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i9);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof C1735j2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C1735j2 c1735j2 = (C1735j2) parcelable;
        super.onRestoreInstanceState(c1735j2.f8189j);
        ActionMenuView actionMenuView = this.f762j;
        MenuC1627m menuC1627m = actionMenuView != null ? actionMenuView.f719y : null;
        int i = c1735j2.f6582l;
        if (i != 0 && this.f756U != null && menuC1627m != null && (menuItemFindItem = menuC1627m.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (c1735j2.f6583m) {
            RunnableC0018f runnableC0018f = this.f761c0;
            removeCallbacks(runnableC0018f);
            post(runnableC0018f);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        m480d();
        C1790z1 c1790z1 = this.f738C;
        boolean z7 = i == 1;
        if (z7 == c1790z1.f6841g) {
            return;
        }
        c1790z1.f6841g = z7;
        if (!c1790z1.f6842h) {
            c1790z1.f6835a = c1790z1.f6839e;
            c1790z1.f6836b = c1790z1.f6840f;
            return;
        }
        if (z7) {
            int i4 = c1790z1.f6838d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = c1790z1.f6839e;
            }
            c1790z1.f6835a = i4;
            int i8 = c1790z1.f6837c;
            if (i8 == Integer.MIN_VALUE) {
                i8 = c1790z1.f6840f;
            }
            c1790z1.f6836b = i8;
            return;
        }
        int i9 = c1790z1.f6837c;
        if (i9 == Integer.MIN_VALUE) {
            i9 = c1790z1.f6839e;
        }
        c1790z1.f6835a = i9;
        int i10 = c1790z1.f6838d;
        if (i10 == Integer.MIN_VALUE) {
            i10 = c1790z1.f6840f;
        }
        c1790z1.f6836b = i10;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C1736k c1736k;
        C1630p c1630p;
        C1735j2 c1735j2 = new C1735j2(super.onSaveInstanceState());
        C1723g2 c1723g2 = this.f756U;
        if (c1723g2 != null && (c1630p = c1723g2.f6553k) != null) {
            c1735j2.f6582l = c1630p.f6242j;
        }
        ActionMenuView actionMenuView = this.f762j;
        c1735j2.f6583m = (actionMenuView == null || (c1736k = actionMenuView.f712C) == null || !c1736k.m3416h()) ? false : true;
        return c1735j2;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f746K = false;
        }
        if (!this.f746K) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f746K = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f746K = false;
        return true;
    }

    /* renamed from: p */
    public final int m488p(View view, int i, int i4, int[] iArr) {
        C1727h2 c1727h2 = (C1727h2) view.getLayoutParams();
        int i8 = ((ViewGroup.MarginLayoutParams) c1727h2).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i8);
        iArr[1] = Math.max(0, -i8);
        int iM484j = m484j(view, i4);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iM484j, iMax, view.getMeasuredHeight() + iM484j);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) c1727h2).leftMargin);
    }

    /* renamed from: q */
    public final int m489q(View view, int i, int i4, int i8, int i9, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = marginLayoutParams.leftMargin - iArr[0];
        int i11 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i11) + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        iArr[1] = Math.max(0, -i11);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i4, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i9, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    /* renamed from: r */
    public final void m490r(View view, int i, int i4, int i8, int i9) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i4, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i8, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i9 >= 0) {
            if (mode != 0) {
                i9 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i9);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    /* renamed from: s */
    public final boolean m491s(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public void setBackInvokedCallbackEnabled(boolean z7) {
        if (this.f760b0 != z7) {
            this.f760b0 = z7;
            m492t();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(AbstractC0715d.m1542D(getContext(), i));
    }

    public void setCollapsible(boolean z7) {
        this.f757V = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f740E) {
            this.f740E = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.f739D) {
            this.f739D = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(AbstractC0715d.m1542D(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(AbstractC0715d.m1542D(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m483g();
        this.f765m.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(InterfaceC1731i2 interfaceC1731i2) {
    }

    public void setOverflowIcon(Drawable drawable) {
        m481e();
        this.f762j.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f772t != i) {
            this.f772t = i;
            if (i == 0) {
                this.f771s = getContext();
            } else {
                this.f771s = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.f737B = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.f778z = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.f777y = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.f736A = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    /* renamed from: t */
    public final void m492t() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherM2291a = AbstractC1086l.m2291a(this);
            C1723g2 c1723g2 = this.f756U;
            boolean z7 = (c1723g2 == null || c1723g2.f6553k == null || onBackInvokedDispatcherM2291a == null || !isAttachedToWindow() || !this.f760b0) ? false : true;
            if (z7 && this.f759a0 == null) {
                if (this.f758W == null) {
                    this.f758W = new C0527q(2, new RunnableC1715e2(this, 0));
                }
                AbstractC1086l.m2301k(onBackInvokedDispatcherM2291a, this.f758W);
                this.f759a0 = onBackInvokedDispatcherM2291a;
                return;
            }
            if (z7 || (onBackInvokedDispatcher = this.f759a0) == null) {
                return;
            }
            AbstractC1086l.m2302l(onBackInvokedDispatcher, this.f758W);
            this.f759a0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.f741F = 8388627;
        this.f748M = new ArrayList();
        this.f749N = new ArrayList();
        this.f750O = new int[2];
        this.f751P = new C0073c(new RunnableC1715e2(this, 1));
        this.f752Q = new ArrayList();
        this.f753R = new C1719f2(this);
        this.f761c0 = new RunnableC0018f(10, this);
        Context context2 = getContext();
        int[] iArr = AbstractC1026a.f4330w;
        C0073c c0073cM263F = C0073c.m263F(R.attr.toolbarStyle, 0, context2, attributeSet, iArr);
        AbstractC1828m0.m3607l(this, context, iArr, attributeSet, (TypedArray) c0073cM263F.f325l, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) c0073cM263F.f325l;
        this.f773u = typedArray.getResourceId(28, 0);
        this.f774v = typedArray.getResourceId(19, 0);
        this.f741F = typedArray.getInteger(0, 8388627);
        this.f775w = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.f737B = dimensionPixelOffset;
        this.f736A = dimensionPixelOffset;
        this.f778z = dimensionPixelOffset;
        this.f777y = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.f777y = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.f778z = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.f736A = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.f737B = dimensionPixelOffset5;
        }
        this.f776x = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        m480d();
        C1790z1 c1790z1 = this.f738C;
        c1790z1.f6842h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            c1790z1.f6839e = dimensionPixelSize;
            c1790z1.f6835a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            c1790z1.f6840f = dimensionPixelSize2;
            c1790z1.f6836b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            c1790z1.m3495a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.f739D = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.f740E = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f767o = c0073cM263F.m299x(4);
        this.f768p = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f771s = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableM299x = c0073cM263F.m299x(16);
        if (drawableM299x != null) {
            setNavigationIcon(drawableM299x);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableM299x2 = c0073cM263F.m299x(11);
        if (drawableM299x2 != null) {
            setLogo(drawableM299x2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(c0073cM263F.m298w(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(c0073cM263F.m298w(20));
        }
        if (typedArray.hasValue(14)) {
            getMenuInflater().inflate(typedArray.getResourceId(14, 0), getMenu());
        }
        c0073cM263F.m275I();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1727h2 c1727h2 = new C1727h2(context, attributeSet);
        c1727h2.f6561a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1026a.f4309b);
        c1727h2.f6561a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        c1727h2.f6562b = 0;
        return c1727h2;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m479c();
        }
        C1782x c1782x = this.f769q;
        if (c1782x != null) {
            c1782x.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            m479c();
            this.f769q.setImageDrawable(drawable);
        } else {
            C1782x c1782x = this.f769q;
            if (c1782x != null) {
                c1782x.setImageDrawable(this.f767o);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f766n == null) {
                this.f766n = new C1785y(getContext(), null, 0);
            }
            if (!m486n(this.f766n)) {
                m478b(this.f766n, true);
            }
        } else {
            C1785y c1785y = this.f766n;
            if (c1785y != null && m486n(c1785y)) {
                removeView(this.f766n);
                this.f749N.remove(this.f766n);
            }
        }
        C1785y c1785y2 = this.f766n;
        if (c1785y2 != null) {
            c1785y2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f766n == null) {
            this.f766n = new C1785y(getContext(), null, 0);
        }
        C1785y c1785y = this.f766n;
        if (c1785y != null) {
            c1785y.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m483g();
        }
        C1782x c1782x = this.f765m;
        if (c1782x != null) {
            c1782x.setContentDescription(charSequence);
            AbstractC0120b.m400K(this.f765m, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m483g();
            if (!m486n(this.f765m)) {
                m478b(this.f765m, true);
            }
        } else {
            C1782x c1782x = this.f765m;
            if (c1782x != null && m486n(c1782x)) {
                removeView(this.f765m);
                this.f749N.remove(this.f765m);
            }
        }
        C1782x c1782x2 = this.f765m;
        if (c1782x2 != null) {
            c1782x2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1780w0 c1780w0 = this.f764l;
            if (c1780w0 != null && m486n(c1780w0)) {
                removeView(this.f764l);
                this.f749N.remove(this.f764l);
            }
        } else {
            if (this.f764l == null) {
                Context context = getContext();
                C1780w0 c1780w02 = new C1780w0(context, null);
                this.f764l = c1780w02;
                c1780w02.setSingleLine();
                this.f764l.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f774v;
                if (i != 0) {
                    this.f764l.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f745J;
                if (colorStateList != null) {
                    this.f764l.setTextColor(colorStateList);
                }
            }
            if (!m486n(this.f764l)) {
                m478b(this.f764l, true);
            }
        }
        C1780w0 c1780w03 = this.f764l;
        if (c1780w03 != null) {
            c1780w03.setText(charSequence);
        }
        this.f743H = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f745J = colorStateList;
        C1780w0 c1780w0 = this.f764l;
        if (c1780w0 != null) {
            c1780w0.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            C1780w0 c1780w0 = this.f763k;
            if (c1780w0 != null && m486n(c1780w0)) {
                removeView(this.f763k);
                this.f749N.remove(this.f763k);
            }
        } else {
            if (this.f763k == null) {
                Context context = getContext();
                C1780w0 c1780w02 = new C1780w0(context, null);
                this.f763k = c1780w02;
                c1780w02.setSingleLine();
                this.f763k.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f773u;
                if (i != 0) {
                    this.f763k.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.f744I;
                if (colorStateList != null) {
                    this.f763k.setTextColor(colorStateList);
                }
            }
            if (!m486n(this.f763k)) {
                m478b(this.f763k, true);
            }
        }
        C1780w0 c1780w03 = this.f763k;
        if (c1780w03 != null) {
            c1780w03.setText(charSequence);
        }
        this.f742G = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f744I = colorStateList;
        C1780w0 c1780w0 = this.f763k;
        if (c1780w0 != null) {
            c1780w0.setTextColor(colorStateList);
        }
    }
}
