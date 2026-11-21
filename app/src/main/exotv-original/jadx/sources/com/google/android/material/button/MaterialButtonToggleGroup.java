package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.exotv.net.R;
import com.google.android.material.datepicker.C0752j;
import com.google.android.material.timepicker.C0778i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p034d5.AbstractC0847a;
import p035d6.AbstractC0848a;
import p084j5.AbstractC1509h;
import p105m0.AbstractC1828m0;
import p162s5.AbstractC2374l;
import p211y5.C2809a;
import p211y5.C2810a0;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends AbstractC1509h {

    /* renamed from: B */
    public static final /* synthetic */ int f3193B = 0;

    /* renamed from: A */
    public HashSet f3194A;

    /* renamed from: v */
    public final LinkedHashSet f3195v;

    /* renamed from: w */
    public boolean f3196w;

    /* renamed from: x */
    public boolean f3197x;

    /* renamed from: y */
    public boolean f3198y;

    /* renamed from: z */
    public final int f3199z;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0848a.m2015b(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet);
        this.f3195v = new LinkedHashSet();
        this.f3196w = false;
        this.f3194A = new HashSet();
        TypedArray typedArrayM4215e = AbstractC2374l.m4215e(getContext(), attributeSet, AbstractC0847a.f3752n, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(typedArrayM4215e.getBoolean(7, false));
        this.f3199z = typedArrayM4215e.getResourceId(2, -1);
        this.f3198y = typedArrayM4215e.getBoolean(4, false);
        if (this.f5787o == null) {
            this.f5787o = C2810a0.m4910b(new C2809a(0.0f));
        }
        setEnabled(typedArrayM4215e.getBoolean(0, true));
        typedArrayM4215e.recycle();
        setImportantForAccessibility(1);
    }

    private String getChildrenA11yClassName() {
        return (this.f3197x ? RadioButton.class : ToggleButton.class).getName();
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            if ((getChildAt(i4) instanceof MaterialButton) && getChildAt(i4).getVisibility() != 8) {
                i++;
            }
        }
        return i;
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setA11yClassName(getChildrenA11yClassName());
    }

    @Override // p084j5.AbstractC1509h, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setupButtonChild(materialButton);
        m1825l(materialButton.getId(), materialButton.f3161E);
        AbstractC1828m0.m3608m(materialButton, new C0752j(1, this));
    }

    public int getCheckedButtonId() {
        if (!this.f3197x || this.f3194A.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3194A.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f3194A.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public final void m1825l(int i, boolean z7) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f3194A);
        if (z7 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f3197x && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z7 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f3198y || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m1826m(hashSet);
    }

    /* renamed from: m */
    public final void m1826m(Set set) {
        HashSet hashSet = this.f3194A;
        this.f3194A = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f3196w = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f3196w = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f3195v.iterator();
                while (it.hasNext()) {
                    ((C0778i) it.next()).m1928a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f3199z;
        if (i != -1) {
            m1826m(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f3197x ? 1 : 2));
    }

    public void setSelectionRequired(boolean z7) {
        this.f3198y = z7;
    }

    public void setSingleSelection(boolean z7) {
        if (this.f3197x != z7) {
            this.f3197x = z7;
            m1826m(new HashSet());
        }
        String childrenA11yClassName = getChildrenA11yClassName();
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName(childrenA11yClassName);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
