package p199x;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import p174u.AbstractC2447i;
import p174u.C2442d;

/* compiled from: r8-map-id-8faea4a5be425bb722944ed96530d565bd9b44cd96e799337f2387ac99465617 */
/* renamed from: x.c */
/* loaded from: classes.dex */
public abstract class AbstractC2716c extends View {

    /* renamed from: j */
    public int[] f9879j;

    /* renamed from: k */
    public int f9880k;

    /* renamed from: l */
    public Context f9881l;

    /* renamed from: m */
    public AbstractC2447i f9882m;

    /* renamed from: n */
    public String f9883n;

    /* renamed from: o */
    public String f9884o;

    /* renamed from: p */
    public HashMap f9885p;

    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4776a(String str) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException {
        int identifier;
        HashMap map;
        Context context = this.f9881l;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            identifier = 0;
        } else {
            Object obj = (strTrim == null || (map = constraintLayout.f797v) == null || !map.containsKey(strTrim)) ? null : constraintLayout.f797v.get(strTrim);
            if (obj instanceof Integer) {
                identifier = ((Integer) obj).intValue();
            }
        }
        if (identifier == 0 && constraintLayout != null) {
            identifier = m4781f(constraintLayout, strTrim);
        }
        if (identifier == 0) {
            try {
                identifier = AbstractC2729p.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (identifier == 0) {
            identifier = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
        }
        if (identifier != 0) {
            this.f9885p.put(Integer.valueOf(identifier), strTrim);
            m4777b(identifier);
        } else {
            Log.w("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    /* renamed from: b */
    public final void m4777b(int i) {
        if (i == getId()) {
            return;
        }
        int i4 = this.f9880k + 1;
        int[] iArr = this.f9879j;
        if (i4 > iArr.length) {
            this.f9879j = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f9879j;
        int i8 = this.f9880k;
        iArr2[i8] = i;
        this.f9880k = i8 + 1;
    }

    /* renamed from: c */
    public final void m4778c(String str) {
        if (str == null || str.length() == 0 || this.f9881l == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof C2718e) && strTrim.equals(((C2718e) layoutParams).f9911Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    m4777b(childAt.getId());
                }
            }
        }
    }

    /* renamed from: d */
    public final void m4779d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f9880k; i++) {
            View view = (View) constraintLayout.f785j.get(this.f9879j[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (elevation > 0.0f) {
                    view.setTranslationZ(view.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: e */
    public void mo4780e(ConstraintLayout constraintLayout) {
    }

    /* renamed from: f */
    public final int m4781f(ConstraintLayout constraintLayout, String str) throws Resources.NotFoundException {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.f9881l.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* renamed from: g */
    public void mo4782g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC2730q.f10089b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.f9883n = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.f9884o = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f9879j, this.f9880k);
    }

    /* renamed from: h */
    public abstract void mo494h(C2442d c2442d, boolean z7);

    /* renamed from: i */
    public final void m4783i() {
        if (this.f9882m == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof C2718e) {
            ((C2718e) layoutParams).f9944p0 = this.f9882m;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f9883n;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f9884o;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i4) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f9883n = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f9880k = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m4776a(str.substring(i));
                return;
            } else {
                m4776a(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f9884o = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f9880k = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                m4778c(str.substring(i));
                return;
            } else {
                m4778c(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f9883n = null;
        this.f9880k = 0;
        for (int i : iArr) {
            m4777b(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f9883n == null) {
            m4777b(i);
        }
    }
}
