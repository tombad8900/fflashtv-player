package p104m;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.media3.common.AbstractC0195e;
import com.bumptech.glide.AbstractC0715d;
import java.lang.reflect.Method;
import p054g.AbstractC1026a;
import p095l.InterfaceC1616d0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.t1 */
/* loaded from: classes.dex */
public class C1772t1 implements InterfaceC1616d0 {

    /* renamed from: J */
    public static final Method f6750J;

    /* renamed from: K */
    public static final Method f6751K;

    /* renamed from: E */
    public final Handler f6756E;

    /* renamed from: G */
    public Rect f6758G;

    /* renamed from: H */
    public boolean f6759H;

    /* renamed from: I */
    public final C1697a0 f6760I;

    /* renamed from: j */
    public final Context f6761j;

    /* renamed from: k */
    public ListAdapter f6762k;

    /* renamed from: l */
    public C1730i1 f6763l;

    /* renamed from: o */
    public int f6766o;

    /* renamed from: p */
    public int f6767p;

    /* renamed from: r */
    public boolean f6769r;

    /* renamed from: s */
    public boolean f6770s;

    /* renamed from: t */
    public boolean f6771t;

    /* renamed from: w */
    public C1762q1 f6774w;

    /* renamed from: x */
    public View f6775x;

    /* renamed from: y */
    public AdapterView.OnItemClickListener f6776y;

    /* renamed from: z */
    public AdapterView.OnItemSelectedListener f6777z;

    /* renamed from: m */
    public final int f6764m = -2;

    /* renamed from: n */
    public int f6765n = -2;

    /* renamed from: q */
    public final int f6768q = 1002;

    /* renamed from: u */
    public int f6772u = 0;

    /* renamed from: v */
    public final int f6773v = Integer.MAX_VALUE;

    /* renamed from: A */
    public final RunnableC1758p1 f6752A = new RunnableC1758p1(this, 1);

    /* renamed from: B */
    public final ViewOnTouchListenerC1769s1 f6753B = new ViewOnTouchListenerC1769s1(this);

    /* renamed from: C */
    public final C1766r1 f6754C = new C1766r1(this);

    /* renamed from: D */
    public final RunnableC1758p1 f6755D = new RunnableC1758p1(this, 0);

    /* renamed from: F */
    public final Rect f6757F = new Rect();

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f6750J = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f6751K = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public C1772t1(Context context, AttributeSet attributeSet, int i, int i4) {
        int resourceId;
        this.f6761j = context;
        this.f6756E = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1026a.f4322o, i, i4);
        this.f6766o = typedArrayObtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f6767p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f6769r = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1697a0 c1697a0 = new C1697a0(context, attributeSet, i, i4);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1026a.f4326s, i, i4);
        if (typedArrayObtainStyledAttributes2.hasValue(2)) {
            c1697a0.setOverlapAnchor(typedArrayObtainStyledAttributes2.getBoolean(2, false));
        }
        c1697a0.setBackgroundDrawable((!typedArrayObtainStyledAttributes2.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes2.getDrawable(0) : AbstractC0715d.m1542D(context, resourceId));
        typedArrayObtainStyledAttributes2.recycle();
        this.f6760I = c1697a0;
        c1697a0.setInputMethodMode(1);
    }

    @Override // p095l.InterfaceC1616d0
    /* renamed from: a */
    public final boolean mo3274a() {
        return this.f6760I.isShowing();
    }

    /* renamed from: b */
    public final int m3458b() {
        return this.f6766o;
    }

    /* renamed from: c */
    public final void m3459c(int i) {
        this.f6766o = i;
    }

    @Override // p095l.InterfaceC1616d0
    public final void dismiss() {
        C1697a0 c1697a0 = this.f6760I;
        c1697a0.dismiss();
        c1697a0.setContentView(null);
        this.f6763l = null;
        this.f6756E.removeCallbacks(this.f6752A);
    }

    @Override // p095l.InterfaceC1616d0
    /* renamed from: f */
    public final void mo3275f() {
        int i;
        int paddingBottom;
        C1730i1 c1730i1;
        C1730i1 c1730i12 = this.f6763l;
        Context context = this.f6761j;
        C1697a0 c1697a0 = this.f6760I;
        if (c1730i12 == null) {
            C1730i1 c1730i1Mo3464q = mo3464q(context, !this.f6759H);
            this.f6763l = c1730i1Mo3464q;
            c1730i1Mo3464q.setAdapter(this.f6762k);
            this.f6763l.setOnItemClickListener(this.f6776y);
            this.f6763l.setFocusable(true);
            this.f6763l.setFocusableInTouchMode(true);
            this.f6763l.setOnItemSelectedListener(new C1754o1(this));
            this.f6763l.setOnScrollListener(this.f6754C);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f6777z;
            if (onItemSelectedListener != null) {
                this.f6763l.setOnItemSelectedListener(onItemSelectedListener);
            }
            c1697a0.setContentView(this.f6763l);
        }
        Drawable background = c1697a0.getBackground();
        Rect rect = this.f6757F;
        if (background != null) {
            background.getPadding(rect);
            int i4 = rect.top;
            i = rect.bottom + i4;
            if (!this.f6769r) {
                this.f6767p = -i4;
            }
        } else {
            rect.setEmpty();
            i = 0;
        }
        int maxAvailableHeight = c1697a0.getMaxAvailableHeight(this.f6775x, this.f6767p, c1697a0.getInputMethodMode() == 2);
        int i8 = this.f6764m;
        if (i8 == -1) {
            paddingBottom = maxAvailableHeight + i;
        } else {
            int i9 = this.f6765n;
            int iM3412a = this.f6763l.m3412a(i9 != -2 ? i9 != -1 ? View.MeasureSpec.makeMeasureSpec(i9, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE), maxAvailableHeight);
            paddingBottom = iM3412a + (iM3412a > 0 ? this.f6763l.getPaddingBottom() + this.f6763l.getPaddingTop() + i : 0);
        }
        boolean z7 = c1697a0.getInputMethodMode() == 2;
        c1697a0.setWindowLayoutType(this.f6768q);
        if (c1697a0.isShowing()) {
            if (this.f6775x.isAttachedToWindow()) {
                int width = this.f6765n;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = this.f6775x.getWidth();
                }
                if (i8 == -1) {
                    i8 = z7 ? paddingBottom : -1;
                    if (z7) {
                        c1697a0.setWidth(this.f6765n == -1 ? -1 : 0);
                        c1697a0.setHeight(0);
                    } else {
                        c1697a0.setWidth(this.f6765n == -1 ? -1 : 0);
                        c1697a0.setHeight(-1);
                    }
                } else if (i8 == -2) {
                    i8 = paddingBottom;
                }
                c1697a0.setOutsideTouchable(true);
                int i10 = width;
                View view = this.f6775x;
                int i11 = this.f6766o;
                int i12 = this.f6767p;
                int i13 = i10 < 0 ? -1 : i10;
                if (i8 < 0) {
                    i8 = -1;
                }
                c1697a0.update(view, i11, i12, i13, i8);
                return;
            }
            return;
        }
        int width2 = this.f6765n;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = this.f6775x.getWidth();
        }
        if (i8 == -1) {
            i8 = -1;
        } else if (i8 == -2) {
            i8 = paddingBottom;
        }
        c1697a0.setWidth(width2);
        c1697a0.setHeight(i8);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f6750J;
            if (method != null) {
                try {
                    method.invoke(c1697a0, Boolean.TRUE);
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                }
            }
        } else {
            AbstractC0195e.m616f(c1697a0);
        }
        c1697a0.setOutsideTouchable(true);
        c1697a0.setTouchInterceptor(this.f6753B);
        if (this.f6771t) {
            c1697a0.setOverlapAnchor(this.f6770s);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f6751K;
            if (method2 != null) {
                try {
                    method2.invoke(c1697a0, this.f6758G);
                } catch (Exception e) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e);
                }
            }
        } else {
            AbstractC0195e.m615e(c1697a0, this.f6758G);
        }
        c1697a0.showAsDropDown(this.f6775x, this.f6766o, this.f6767p, this.f6772u);
        this.f6763l.setSelection(-1);
        if ((!this.f6759H || this.f6763l.isInTouchMode()) && (c1730i1 = this.f6763l) != null) {
            c1730i1.setListSelectionHidden(true);
            c1730i1.requestLayout();
        }
        if (this.f6759H) {
            return;
        }
        this.f6756E.post(this.f6755D);
    }

    /* renamed from: g */
    public final Drawable m3460g() {
        return this.f6760I.getBackground();
    }

    @Override // p095l.InterfaceC1616d0
    /* renamed from: h */
    public final C1730i1 mo3276h() {
        return this.f6763l;
    }

    /* renamed from: j */
    public final void m3461j(Drawable drawable) {
        this.f6760I.setBackgroundDrawable(drawable);
    }

    /* renamed from: k */
    public final void m3462k(int i) {
        this.f6767p = i;
        this.f6769r = true;
    }

    /* renamed from: o */
    public final int m3463o() {
        if (this.f6769r) {
            return this.f6767p;
        }
        return 0;
    }

    /* renamed from: p */
    public void mo3411p(ListAdapter listAdapter) {
        C1762q1 c1762q1 = this.f6774w;
        if (c1762q1 == null) {
            this.f6774w = new C1762q1(this);
        } else {
            ListAdapter listAdapter2 = this.f6762k;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(c1762q1);
            }
        }
        this.f6762k = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f6774w);
        }
        C1730i1 c1730i1 = this.f6763l;
        if (c1730i1 != null) {
            c1730i1.setAdapter(this.f6762k);
        }
    }

    /* renamed from: q */
    public C1730i1 mo3464q(Context context, boolean z7) {
        return new C1730i1(context, z7);
    }

    /* renamed from: r */
    public final void m3465r(int i) {
        Drawable background = this.f6760I.getBackground();
        if (background == null) {
            this.f6765n = i;
            return;
        }
        Rect rect = this.f6757F;
        background.getPadding(rect);
        this.f6765n = rect.left + rect.right + i;
    }
}
