package p084j5;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.exotv.net.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeMap;
import org.xmlpull.v1.XmlPullParserException;
import p002a1.C0036o;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p095l.C1629o;
import p162s5.AbstractC2374l;
import p211y5.C2809a;
import p211y5.C2810a0;
import p211y5.C2812b0;
import p211y5.C2814c0;
import p211y5.C2816d0;
import p211y5.C2818e0;
import p211y5.C2828o;
import p211y5.InterfaceC2815d;
import p211y5.InterfaceC2826m;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: j5.h */
/* loaded from: classes.dex */
public abstract class AbstractC1509h extends LinearLayout {

    /* renamed from: u */
    public static final Object f5781u = null;

    /* renamed from: j */
    public int f5782j;

    /* renamed from: k */
    public final ArrayList f5783k;

    /* renamed from: l */
    public final C0036o f5784l;

    /* renamed from: m */
    public final C1507f f5785m;

    /* renamed from: n */
    public Integer[] f5786n;

    /* renamed from: o */
    public C2810a0 f5787o;

    /* renamed from: p */
    public C2814c0 f5788p;

    /* renamed from: q */
    public int f5789q;

    /* renamed from: r */
    public C2818e0 f5790r;

    /* renamed from: s */
    public boolean f5791s;

    /* renamed from: t */
    public final ArrayList f5792t;

    /* JADX WARN: Type inference failed for: r0v3, types: [j5.f] */
    public AbstractC1509h(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        C2810a0 c2810a0M4910b;
        XmlResourceParser xml;
        int next;
        int next2;
        super(AbstractC0848a.m2015b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f5782j = 0;
        this.f5783k = new ArrayList();
        final MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this;
        this.f5784l = new C0036o(28, materialButtonToggleGroup);
        this.f5785m = new Comparator() { // from class: j5.f
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int iCompareTo = Boolean.valueOf(materialButton.f3161E).compareTo(Boolean.valueOf(materialButton2.f3161E));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
                int iCompareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (iCompareTo2 != 0) {
                    return iCompareTo2;
                }
                MaterialButtonToggleGroup materialButtonToggleGroup2 = materialButtonToggleGroup;
                return Integer.compare(materialButtonToggleGroup2.indexOfChild(materialButton), materialButtonToggleGroup2.indexOfChild(materialButton2));
            }
        };
        this.f5791s = true;
        new HashMap();
        new HashMap();
        new ArrayList();
        new ArrayList();
        this.f5792t = new ArrayList();
        Context context2 = getContext();
        TypedArray typedArrayM4215e = AbstractC2374l.m4215e(context2, attributeSet, AbstractC0847a.f3750l, R.attr.materialButtonToggleGroupStyle, R.style.Widget_Material3_MaterialButtonGroup, new int[0]);
        if (typedArrayM4215e.hasValue(2)) {
            int resourceId = typedArrayM4215e.getResourceId(2, 0);
            C2818e0 c2818e0 = null;
            if (resourceId != 0 && context2.getResources().getResourceTypeName(resourceId).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId);
                    try {
                        C2818e0 c2818e02 = new C2818e0();
                        c2818e02.f10455c = new int[10][];
                        c2818e02.f10456d = new C1629o[10];
                        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                        do {
                            next2 = xml.next();
                            if (next2 == 2) {
                                break;
                            }
                        } while (next2 != 1);
                        if (next2 != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            c2818e02.m4926a(context2, xml, attributeSetAsAttributeSet, context2.getTheme());
                        }
                        xml.close();
                        c2818e0 = c2818e02;
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
                }
            }
            this.f5790r = c2818e0;
        }
        if (typedArrayM4215e.hasValue(6)) {
            C2814c0 c2814c0M4918g = C2814c0.m4918g(context2, typedArrayM4215e, 6);
            this.f5788p = c2814c0M4918g;
            if (c2814c0M4918g == null) {
                int resourceId2 = typedArrayM4215e.getResourceId(6, 0);
                int resourceId3 = typedArrayM4215e.getResourceId(7, 0);
                C2809a c2809a = new C2809a(0);
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, resourceId2);
                if (resourceId3 != 0) {
                    contextThemeWrapper.getTheme().applyStyle(resourceId3, true);
                }
                this.f5788p = new C2812b0(C2828o.m4953g(contextThemeWrapper.obtainStyledAttributes(AbstractC0847a.f3732A), c2809a).m4951a()).m4915b();
            }
        }
        if (typedArrayM4215e.hasValue(3)) {
            C2809a c2809a2 = new C2809a(0.0f);
            int resourceId4 = typedArrayM4215e.getResourceId(3, 0);
            if (resourceId4 != 0 && context2.getResources().getResourceTypeName(resourceId4).equals("xml")) {
                try {
                    xml = context2.getResources().getXml(resourceId4);
                    try {
                        c2810a0M4910b = new C2810a0();
                        AttributeSet attributeSetAsAttributeSet2 = Xml.asAttributeSet(xml);
                        do {
                            next = xml.next();
                            if (next == 2) {
                                break;
                            }
                        } while (next != 1);
                        if (next != 2) {
                            throw new XmlPullParserException("No start tag found");
                        }
                        if (xml.getName().equals("selector")) {
                            c2810a0M4910b.m4913d(context2, xml, attributeSetAsAttributeSet2, context2.getTheme());
                        }
                        xml.close();
                    } finally {
                    }
                } catch (Resources.NotFoundException | IOException | XmlPullParserException unused2) {
                    c2810a0M4910b = C2810a0.m4910b(c2809a2);
                }
            } else {
                c2810a0M4910b = C2810a0.m4910b(C2828o.m4954h(typedArrayM4215e, 3, c2809a2));
            }
            this.f5787o = c2810a0M4910b;
        }
        this.f5789q = typedArrayM4215e.getDimensionPixelSize(1, 0);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayM4215e.getBoolean(0, true));
        setOverflowMode(typedArrayM4215e.getInt(5, 0));
        getResources().getDimensionPixelOffset(R.dimen.m3_btn_group_overflow_item_icon_horizontal_padding);
        typedArrayM4215e.recycle();
    }

    /* renamed from: d */
    public static LinearLayout.LayoutParams m3182d(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new C1508g(layoutParams.width, layoutParams.height);
    }

    /* renamed from: f */
    public static C1508g m3183f(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C1508g((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C1508g((ViewGroup.MarginLayoutParams) layoutParams) : new C1508g(layoutParams);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m3190i(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m3190i(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(View.generateViewId());
        }
    }

    /* renamed from: a */
    public final void m3184a() {
        int iMin;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            View childAt2 = getChildAt(i - 1);
            if ((childAt instanceof MaterialButton) && (childAt2 instanceof MaterialButton)) {
                MaterialButton materialButton = (MaterialButton) childAt;
                MaterialButton materialButton2 = (MaterialButton) childAt2;
                if (this.f5789q <= 0) {
                    iMin = Math.min(materialButton.getStrokeWidth(), materialButton2.getStrokeWidth());
                    materialButton.setShouldDrawSurfaceColorStroke(true);
                    materialButton2.setShouldDrawSurfaceColorStroke(true);
                } else {
                    materialButton.setShouldDrawSurfaceColorStroke(false);
                    materialButton2.setShouldDrawSurfaceColorStroke(false);
                    iMin = 0;
                }
            } else {
                iMin = 0;
            }
            LinearLayout.LayoutParams layoutParamsM3182d = m3182d(childAt);
            if (getOrientation() == 0) {
                layoutParamsM3182d.setMarginEnd(0);
                layoutParamsM3182d.setMarginStart(this.f5789q - iMin);
                layoutParamsM3182d.topMargin = 0;
            } else {
                layoutParamsM3182d.bottomMargin = 0;
                layoutParamsM3182d.topMargin = this.f5789q - iMin;
                layoutParamsM3182d.setMarginStart(0);
            }
            childAt.setLayoutParams(layoutParamsM3182d);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParamsM3182d2 = m3182d((MaterialButton) getChildAt(firstVisibleChildIndex));
        if (getOrientation() == 1) {
            layoutParamsM3182d2.topMargin = 0;
            layoutParamsM3182d2.bottomMargin = 0;
        } else {
            layoutParamsM3182d2.setMarginEnd(0);
            layoutParamsM3182d2.setMarginStart(0);
            layoutParamsM3182d2.leftMargin = 0;
            layoutParamsM3182d2.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonGroup", "Child views must be of type MaterialButton.");
            return;
        }
        m3191j();
        this.f5791s = true;
        int iIndexOfChild = indexOfChild(null);
        if (iIndexOfChild < 0 || i != -1) {
            super.addView(view, i, layoutParams);
        } else {
            super.addView(view, iIndexOfChild, layoutParams);
        }
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        materialButton.setOnPressedChangeListenerInternal(this.f5784l);
        this.f5783k.add(materialButton.getShapeAppearance());
        materialButton.setEnabled(isEnabled());
    }

    /* renamed from: b */
    public final void m3185b() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        if (firstVisibleChildIndex == -1 || this.f5790r == null) {
            return;
        }
        if (this.f5782j != 2) {
            m3186c(firstVisibleChildIndex, lastVisibleChildIndex);
            return;
        }
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5792t;
            if (i >= arrayList.size()) {
                return;
            }
            m3186c(((Integer) arrayList.get(i)).intValue(), (i == arrayList.size() + (-1) ? getChildCount() : ((Integer) arrayList.get(i + 1)).intValue()) - 1);
            i++;
        }
    }

    /* renamed from: c */
    public final void m3186c(int i, int i4) {
        float fMax;
        if (i == i4) {
            ((MaterialButton) getChildAt(i)).setWidthChangeDirection(EnumC1506e.f5775j);
            return;
        }
        int iMin = Integer.MAX_VALUE;
        int i8 = i;
        while (i8 <= i4) {
            if (m3190i(i8)) {
                ((MaterialButton) getChildAt(i8)).setWidthChangeDirection(i8 == i ? EnumC1506e.f5777l : i8 == i4 ? EnumC1506e.f5776k : EnumC1506e.f5778m);
                if (m3190i(i8) && this.f5790r != null) {
                    MaterialButton materialButton = (MaterialButton) getChildAt(i8);
                    C2818e0 c2818e0 = this.f5790r;
                    int width = materialButton.getWidth();
                    int i9 = -width;
                    for (int i10 = 0; i10 < c2818e0.f10453a; i10++) {
                        C2816d0 c2816d0 = (C2816d0) c2818e0.f10456d[i10].f6229j;
                        int i11 = c2816d0.f10451a;
                        float f8 = c2816d0.f10452b;
                        if (i11 == 2) {
                            fMax = Math.max(i9, f8);
                        } else if (i11 == 1) {
                            fMax = Math.max(i9, width * f8);
                        }
                        i9 = (int) fMax;
                    }
                    int iMax = Math.max(0, i9);
                    MaterialButton materialButtonM3189h = m3189h(i8);
                    int allowedWidthDecrease = materialButtonM3189h == null ? 0 : materialButtonM3189h.getAllowedWidthDecrease();
                    MaterialButton materialButtonM3188g = m3188g(i8);
                    iMin = Math.min(iMax, allowedWidthDecrease + (materialButtonM3188g != null ? materialButtonM3188g.getAllowedWidthDecrease() : 0));
                }
                if (i8 != i && i8 != i4) {
                    iMin /= 2;
                }
                iMin = Math.min(iMin, iMin);
            }
            i8++;
        }
        while (i <= i4) {
            if (m3190i(i)) {
                MaterialButton materialButton2 = (MaterialButton) getChildAt(i);
                materialButton2.setSizeChange(this.f5790r);
                materialButton2.setWidthChangeMax(iMin * 2);
            }
            i++;
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1508g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f5785m);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f5786n = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C1508g generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1508g c1508g = new C1508g(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0847a.f3751m);
        typedArrayObtainStyledAttributes.getDrawable(0);
        typedArrayObtainStyledAttributes.getText(1);
        typedArrayObtainStyledAttributes.recycle();
        return c1508g;
    }

    /* renamed from: g */
    public final MaterialButton m3188g(int i) {
        int childCount = getChildCount();
        int i4 = i + 1;
        while (true) {
            if (i4 >= childCount) {
                i4 = -1;
                break;
            }
            if (m3190i(i4)) {
                break;
            }
            i4++;
        }
        ArrayList arrayList = this.f5792t;
        if (!arrayList.isEmpty()) {
            int i8 = 0;
            while (i8 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                int iIntValue2 = i8 == arrayList.size() + (-1) ? childCount - 1 : ((Integer) arrayList.get(i8 + 1)).intValue() - 1;
                if (i >= iIntValue && i <= iIntValue2 && (i4 < iIntValue || i4 > iIntValue2)) {
                    return null;
                }
                i8++;
            }
        }
        if (i4 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i4);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1508g(-2, -2);
    }

    public C2818e0 getButtonSizeChange() {
        return this.f5790r;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i4) {
        Integer[] numArr = this.f5786n;
        if (numArr != null && i4 < numArr.length) {
            return numArr[i4].intValue();
        }
        Log.w("MButtonGroup", "Child order wasn't updated");
        return i4;
    }

    public InterfaceC2815d getInnerCornerSize() {
        return this.f5787o.f10429b;
    }

    public C2810a0 getInnerCornerSizeStateList() {
        return this.f5787o;
    }

    public Drawable getOverflowButtonIcon() {
        throw null;
    }

    public int getOverflowMode() {
        return this.f5782j;
    }

    public C2828o getShapeAppearance() {
        C2814c0 c2814c0 = this.f5788p;
        if (c2814c0 == null) {
            return null;
        }
        return c2814c0.m4924h();
    }

    public int getSpacing() {
        return this.f5789q;
    }

    public C2814c0 getStateListShapeAppearance() {
        return this.f5788p;
    }

    /* renamed from: h */
    public final MaterialButton m3189h(int i) {
        int childCount = getChildCount();
        int i4 = i - 1;
        while (true) {
            if (i4 < 0) {
                i4 = -1;
                break;
            }
            if (m3190i(i4)) {
                break;
            }
            i4--;
        }
        ArrayList arrayList = this.f5792t;
        if (!arrayList.isEmpty()) {
            int i8 = 0;
            while (i8 < arrayList.size()) {
                int iIntValue = ((Integer) arrayList.get(i8)).intValue();
                int iIntValue2 = i8 == arrayList.size() + (-1) ? childCount : ((Integer) arrayList.get(i8 + 1)).intValue();
                if (i >= iIntValue && i < iIntValue2 && (i4 < iIntValue || i4 >= iIntValue2)) {
                    return null;
                }
                i8++;
            }
        }
        if (i4 == -1) {
            return null;
        }
        return (MaterialButton) getChildAt(i4);
    }

    /* renamed from: i */
    public final boolean m3190i(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: j */
    public final void m3191j() {
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            LinearLayout.LayoutParams layoutParams = materialButton.f3169M;
            if (layoutParams != null) {
                materialButton.setLayoutParams(layoutParams);
                materialButton.f3169M = null;
                materialButton.f3166J = -2.1474836E9f;
            }
        }
    }

    /* renamed from: k */
    public final void m3192k() {
        int i;
        if (!(this.f5787o == null && this.f5788p == null) && this.f5791s) {
            this.f5791s = false;
            int childCount = getChildCount();
            int firstVisibleChildIndex = getFirstVisibleChildIndex();
            int lastVisibleChildIndex = getLastVisibleChildIndex();
            int i4 = 0;
            while (i4 < childCount) {
                MaterialButton materialButton = (MaterialButton) getChildAt(i4);
                if (materialButton.getVisibility() != 8) {
                    boolean z7 = i4 == firstVisibleChildIndex;
                    boolean z8 = i4 == lastVisibleChildIndex;
                    Object obj = this.f5788p;
                    ArrayList arrayList = this.f5783k;
                    if (obj == null || (!z7 && !z8)) {
                        obj = (InterfaceC2826m) arrayList.get(i4);
                    }
                    C2812b0 c2812b0 = !(obj instanceof C2814c0) ? new C2812b0((C2828o) arrayList.get(i4)) : ((C2814c0) obj).m4925i();
                    boolean z9 = getOrientation() == 0;
                    boolean z10 = getLayoutDirection() == 1;
                    if (z9) {
                        i = z7 ? 5 : 0;
                        if (z8) {
                            i |= 10;
                        }
                        if (z10) {
                            i = ((i & 5) << 1) | ((i & 10) >> 1);
                        }
                    } else {
                        i = z7 ? 3 : 0;
                        if (z8) {
                            i |= 12;
                        }
                    }
                    int i8 = ~i;
                    C2810a0 c2810a0 = this.f5787o;
                    if ((i8 | 1) == i8) {
                        c2812b0.f10438e = c2810a0;
                    }
                    if ((i8 | 2) == i8) {
                        c2812b0.f10439f = c2810a0;
                    }
                    if ((i8 | 4) == i8) {
                        c2812b0.f10440g = c2810a0;
                    }
                    if ((i8 | 8) == i8) {
                        c2812b0.f10441h = c2810a0;
                    }
                    C2814c0 c2814c0M4915b = c2812b0.m4915b();
                    boolean zMo4923e = c2814c0M4915b.mo4923e();
                    C2828o c2828oM4924h = c2814c0M4915b;
                    if (!zMo4923e) {
                        c2828oM4924h = c2814c0M4915b.m4924h();
                    }
                    materialButton.setShapeAppearance(c2828oM4924h);
                }
                i4++;
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i, int i4, int i8, int i9) {
        super.onLayout(z7, i, i4, i8, i9);
        if (z7) {
            m3191j();
            m3185b();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        int paddingBottom;
        m3184a();
        if (this.f5782j != 2) {
            paddingBottom = 0;
        } else {
            if (getOrientation() == 1) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible to the vertical orientation.");
            }
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("The wrap overflow mode is not compatible with wrap_content layout width.");
            }
            ArrayList arrayList = this.f5792t;
            arrayList.clear();
            int size = View.MeasureSpec.getSize(i);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i8 = 0;
            int iMax = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                if (m3190i(i10)) {
                    View view = (MaterialButton) getChildAt(i10);
                    measureChild(view, i, i4);
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredWidth > 0) {
                        LinearLayout.LayoutParams layoutParamsM3182d = m3182d(view);
                        if (i8 + measuredWidth + (arrayList2.isEmpty() ? 0 : this.f5789q) > size || arrayList2.isEmpty()) {
                            if (!arrayList2.isEmpty()) {
                                arrayList3.add(Integer.valueOf(i8));
                            }
                            i9 += iMax + (arrayList.isEmpty() ? 0 : this.f5789q);
                            arrayList.add(Integer.valueOf(i10));
                            layoutParamsM3182d.setMarginStart(-i8);
                            arrayList2.clear();
                            i8 = 0;
                            iMax = 0;
                        }
                        i8 += measuredWidth + (i8 == 0 ? 0 : this.f5789q);
                        iMax = Math.max(iMax, measuredHeight);
                        arrayList2.add(Integer.valueOf(i10));
                        layoutParamsM3182d.topMargin += i9;
                        view.setLayoutParams(layoutParamsM3182d);
                    }
                }
            }
            arrayList3.add(Integer.valueOf(i8));
            int iIntValue = ((Integer) Collections.max(arrayList3)).intValue();
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                int iIntValue2 = ((Integer) arrayList.get(i12)).intValue();
                int iIntValue3 = ((Integer) arrayList3.get(i12)).intValue();
                MaterialButton materialButton = (MaterialButton) getChildAt(iIntValue2);
                LinearLayout.LayoutParams layoutParamsM3182d2 = m3182d(materialButton);
                int i13 = layoutParamsM3182d2.gravity & 8388615;
                int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection());
                int i14 = iIntValue - iIntValue3;
                if (i13 != 8388611) {
                    if (absoluteGravity == 1) {
                        i14 /= 2;
                    }
                    layoutParamsM3182d2.setMarginStart((layoutParamsM3182d2.getMarginStart() + i14) - i11);
                    materialButton.setLayoutParams(layoutParamsM3182d2);
                    i11 = i14;
                }
            }
            paddingBottom = getPaddingBottom() + getPaddingTop() + i9 + iMax;
        }
        m3192k();
        super.onMeasure(i, i4);
        if (this.f5782j != 2 || paddingBottom == getMeasuredHeight()) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), paddingBottom);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f5783k.remove(iIndexOfChild);
        }
        this.f5791s = true;
        m3192k();
        m3191j();
        m3184a();
    }

    public void setButtonSizeChange(C2818e0 c2818e0) {
        if (this.f5790r != c2818e0) {
            this.f5790r = c2818e0;
            m3185b();
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z7) {
        super.setEnabled(z7);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z7);
        }
    }

    public void setInnerCornerSize(InterfaceC2815d interfaceC2815d) {
        this.f5787o = C2810a0.m4910b(interfaceC2815d);
        this.f5791s = true;
        m3192k();
        invalidate();
    }

    public void setInnerCornerSizeStateList(C2810a0 c2810a0) {
        this.f5787o = c2810a0;
        this.f5791s = true;
        m3192k();
        invalidate();
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (getOrientation() != i) {
            this.f5791s = true;
        }
        super.setOrientation(i);
    }

    public void setOverflowButtonIcon(Drawable drawable) {
        throw null;
    }

    public void setOverflowButtonIconResource(int i) {
        throw null;
    }

    public void setOverflowMode(int i) {
        if (this.f5782j != i) {
            this.f5782j = i;
            requestLayout();
            invalidate();
        }
    }

    public void setShapeAppearance(C2828o c2828o) {
        this.f5788p = new C2812b0(c2828o).m4915b();
        this.f5791s = true;
        m3192k();
        invalidate();
    }

    public void setSpacing(int i) {
        this.f5789q = i;
        invalidate();
        requestLayout();
    }

    public void setStateListShapeAppearance(C2814c0 c2814c0) {
        this.f5788p = c2814c0;
        this.f5791s = true;
        m3192k();
        invalidate();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return new C1508g(-2, -2);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m3183f(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m3183f(layoutParams);
    }
}
