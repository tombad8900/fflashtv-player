package p104m;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.exotv.net.R;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import p002a1.RunnableC0018f;
import p062h.AbstractC1086l;
import p140q0.ViewOnTouchListenerC2244d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: m.i1 */
/* loaded from: classes.dex */
public class C1730i1 extends ListView {

    /* renamed from: j */
    public final Rect f6567j;

    /* renamed from: k */
    public int f6568k;

    /* renamed from: l */
    public int f6569l;

    /* renamed from: m */
    public int f6570m;

    /* renamed from: n */
    public int f6571n;

    /* renamed from: o */
    public int f6572o;

    /* renamed from: p */
    public C1722g1 f6573p;

    /* renamed from: q */
    public boolean f6574q;

    /* renamed from: r */
    public final boolean f6575r;

    /* renamed from: s */
    public boolean f6576s;

    /* renamed from: t */
    public ViewOnTouchListenerC2244d f6577t;

    /* renamed from: u */
    public RunnableC0018f f6578u;

    public C1730i1(Context context, boolean z7) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f6567j = new Rect();
        this.f6568k = 0;
        this.f6569l = 0;
        this.f6570m = 0;
        this.f6571n = 0;
        this.f6575r = z7;
        setCacheColorHint(0);
    }

    /* renamed from: a */
    public final int m3412a(int i, int i4) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i8 = 0;
        View view = null;
        for (int i9 = 0; i9 < count; i9++) {
            int itemViewType = adapter.getItemViewType(i9);
            if (itemViewType != i8) {
                view = null;
                i8 = itemViewType;
            }
            view = adapter.getView(i9, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i10 = layoutParams.height;
            view.measure(i, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i9 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i4) {
                return i4;
            }
        }
        return measuredHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m3413b(MotionEvent motionEvent, int i) throws IllegalAccessException, IllegalArgumentException {
        boolean z7;
        boolean zM2295e;
        View childAt;
        View childAt2;
        int actionMasked = motionEvent.getActionMasked();
        boolean z8 = true;
        if (actionMasked == 1) {
            z7 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z7 = true;
                    z8 = false;
                } else {
                    z7 = false;
                    z8 = false;
                }
                if (z7 || z8) {
                    this.f6576s = false;
                    setPressed(false);
                    drawableStateChanged();
                    childAt2 = getChildAt(this.f6572o - getFirstVisiblePosition());
                    if (childAt2 != null) {
                        childAt2.setPressed(false);
                    }
                }
                if (z7) {
                    ViewOnTouchListenerC2244d viewOnTouchListenerC2244d = this.f6577t;
                    if (viewOnTouchListenerC2244d != null) {
                        if (viewOnTouchListenerC2244d.f7796y) {
                            viewOnTouchListenerC2244d.m4021d();
                        }
                        viewOnTouchListenerC2244d.f7796y = false;
                    }
                } else {
                    if (this.f6577t == null) {
                        this.f6577t = new ViewOnTouchListenerC2244d(this);
                    }
                    ViewOnTouchListenerC2244d viewOnTouchListenerC2244d2 = this.f6577t;
                    boolean z9 = viewOnTouchListenerC2244d2.f7796y;
                    viewOnTouchListenerC2244d2.f7796y = true;
                    viewOnTouchListenerC2244d2.onTouch(this, motionEvent);
                }
                return z7;
            }
            z7 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        if (iFindPointerIndex >= 0) {
            int x6 = (int) motionEvent.getX(iFindPointerIndex);
            int y4 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x6, y4);
            if (iPointToPosition != -1) {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f8 = x6;
                float f9 = y4;
                this.f6576s = true;
                drawableHotspotChanged(f8, f9);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i4 = this.f6572o;
                if (i4 != -1 && (childAt = getChildAt(i4 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f6572o = iPointToPosition;
                childAt3.drawableHotspotChanged(f8 - childAt3.getLeft(), f9 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z10 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z10) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f6567j;
                rect.set(left, top, right, bottom);
                rect.left -= this.f6568k;
                rect.top -= this.f6569l;
                rect.right += this.f6570m;
                rect.bottom += this.f6571n;
                if (Build.VERSION.SDK_INT >= 33) {
                    zM2295e = AbstractC1086l.m2295e(this);
                } else {
                    Field field = AbstractC1726h1.f6560a;
                    if (field != null) {
                        try {
                            zM2295e = field.getBoolean(this);
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    } else {
                        zM2295e = false;
                    }
                }
                if (childAt3.isEnabled() != zM2295e) {
                    boolean z11 = !zM2295e;
                    if (Build.VERSION.SDK_INT >= 33) {
                        AbstractC1086l.m2300j(this, z11);
                    } else {
                        Field field2 = AbstractC1726h1.f6560a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z11));
                            } catch (IllegalAccessException e8) {
                                e8.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z10) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    selector.setVisible(getVisibility() == 0, false);
                    selector.setHotspot(fExactCenterX, fExactCenterY);
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    selector2.setHotspot(f8, f9);
                }
                C1722g1 c1722g1 = this.f6573p;
                if (c1722g1 != null) {
                    c1722g1.f6551k = false;
                }
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z8 = false;
                z7 = true;
            }
        }
        if (z7) {
            this.f6576s = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f6572o - getFirstVisiblePosition());
            if (childAt2 != null) {
            }
        }
        if (z7) {
        }
        return z7;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f6567j;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        if (this.f6578u != null) {
            return;
        }
        super.drawableStateChanged();
        C1722g1 c1722g1 = this.f6573p;
        if (c1722g1 != null) {
            c1722g1.f6551k = true;
        }
        Drawable selector = getSelector();
        if (selector != null && this.f6576s && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean hasFocus() {
        return this.f6575r || super.hasFocus();
    }

    @Override // android.view.View
    public final boolean hasWindowFocus() {
        return this.f6575r || super.hasWindowFocus();
    }

    @Override // android.view.View
    public final boolean isFocused() {
        return this.f6575r || super.isFocused();
    }

    @Override // android.view.View
    public final boolean isInTouchMode() {
        return (this.f6575r && this.f6574q) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.f6578u = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        if (i < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f6578u == null) {
            RunnableC0018f runnableC0018f = new RunnableC0018f(8, this);
            this.f6578u = runnableC0018f;
            post(runnableC0018f);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i < 30 || !AbstractC1718f1.f6544d) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    try {
                        AbstractC1718f1.f6541a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                        AbstractC1718f1.f6542b.invoke(this, Integer.valueOf(iPointToPosition));
                        AbstractC1718f1.f6543c.invoke(this, Integer.valueOf(iPointToPosition));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e8) {
                        e8.printStackTrace();
                    }
                }
            }
            Drawable selector = getSelector();
            if (selector != null && this.f6576s && isPressed()) {
                selector.setState(getDrawableState());
            }
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f6572o = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        RunnableC0018f runnableC0018f = this.f6578u;
        if (runnableC0018f != null) {
            C1730i1 c1730i1 = (C1730i1) runnableC0018f.f67k;
            c1730i1.f6578u = null;
            c1730i1.removeCallbacks(runnableC0018f);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z7) {
        this.f6574q = z7;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        C1722g1 c1722g1;
        if (drawable != null) {
            c1722g1 = new C1722g1();
            Drawable drawable2 = c1722g1.f6550j;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            c1722g1.f6550j = drawable;
            if (drawable != null) {
                drawable.setCallback(c1722g1);
            }
            c1722g1.f6551k = true;
        } else {
            c1722g1 = null;
        }
        this.f6573p = c1722g1;
        super.setSelector(c1722g1);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f6568k = rect.left;
        this.f6569l = rect.top;
        this.f6570m = rect.right;
        this.f6571n = rect.bottom;
    }
}
